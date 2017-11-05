package org.hawks.smarttrade.dao.impl;

import java.util.List;

import org.hawks.smarttrade.dao.StockDAO;
import org.hawks.smarttrade.model.StockDB;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StockDB findStockById(StockDB stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockDB> findStockByState(StockDB stock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockDB> getAllStocks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStockById(StockDB stock) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStockByState(StockDB stock) {
		// TODO Auto-generated method stub
		return false;
	}

}
