package org.hawks.smarttrade.dao.impl;

import java.util.List;

import org.hawks.smarttrade.dao.StockDAO;
import org.hawks.smarttrade.model.StockDB;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class StockDAOImpl extends JdbcDaoSupport  implements StockDAO{

	@Override
	public boolean insertStock(StockDB stock) {
		String sql = "INSERT INTO stock"
				+ "(symbol,series,openprice,highprice,lowprice,ltp,previousprice,netprice,tradedquantity,turnoverinlakhs,"
				+ "lastcropannouncementdate,lastcropannouncement,stockstate)VALUES"
				+ "(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		Object[] data = new Object[] {
				stock.getSymbol(),
				stock.getSeries(),
				stock.getOpenprice(),
				stock.getHighprice(),
				stock.getLowprice(),
				stock.getLtp(),
				stock.getPreviousprice(),
				stock.getNetprice(),
				stock.getTradedquantity(),
				stock.getTurnoverinlakhs(),
				stock.getLastcropannouncementdate(),
				stock.getLastcropannouncement(),
				stock.getStockstate()
		};
		
		getJdbcTemplate().update(sql, data);
		return true;
	}

	@Override
	public boolean updateStock(StockDB stock) {
		String sql = "UPDATE stock WHERE "
				+ "symbol=?,series=?,openprice=?,"
				+ "highprice=?,lowprice=?,ltp=?,"
				+ "previousprice=?,netprice=?,"
				+ "tradedquantity=?,lastcropannouncementdate=?,"
				+ "lastcropannouncement=?,stockstate=? WHERE stockid=?";
		Object[] data = new Object[] {
				stock.getSymbol(),
				stock.getSeries(),
				stock.getOpenprice(),
				stock.getHighprice(),
				stock.getLowprice(),
				stock.getLtp(),
				stock.getPreviousprice(),
				stock.getNetprice(),
				stock.getTradedquantity(),
				stock.getTurnoverinlakhs(),
				stock.getLastcropannouncementdate(),
				stock.getLastcropannouncement(),
				stock.getStockstate(),
				stock.getStockid()
		};
		
		getJdbcTemplate().update(sql, data);
		return true;
	}

	@Override
	public StockDB findStockById(StockDB stock) {
		String sql = "SELECT * FROM stock WHERE stockid=?";
		
		List<StockDB> stocks = getJdbcTemplate().query(sql, new Object[] {stock.getStockid()}, new BeanPropertyRowMapper(StockDB.class));
		return stocks.get(0);
	}

	@Override
	public List<StockDB> findStockByState(StockDB stock) {
		String sql = "SELECT * FROM stock WHERE stockstate=?";
		
		List<StockDB> stocks = getJdbcTemplate().query(sql, new Object[] {stock.getStockstate()}, new BeanPropertyRowMapper(StockDB.class));
		return stocks;
	}

	@Override
	public List<StockDB> getAllStocks() {
		String sql = "SELECT * FROM stock";
		
		List<StockDB> stocks = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(StockDB.class));
		return stocks;
	}

	@Override
	public boolean deleteStockById(StockDB stock) {
		String sql  = "DELETE FROM stock WHERE stockid=?";
		getJdbcTemplate().update(sql, new Object[] {stock.getStockid()});
		return true;
	}

	@Override
	public boolean deleteStockByState(StockDB stock) {
		String sql = "DELETE FROM stock WHERE stockstate=?";
		getJdbcTemplate().update(sql, new Object[] {stock.getStockstate()});
		return true;
	}

}
