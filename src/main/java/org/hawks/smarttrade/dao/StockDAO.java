package org.hawks.smarttrade.dao;

import java.util.List;

import org.hawks.smarttrade.model.StockDB;

public interface StockDAO {

	public boolean insertStock(StockDB stock);
	
	public boolean updateStock(StockDB stock);
	
	public StockDB findStockById(StockDB stock);
	
	public List<StockDB> findStockByState(StockDB stock);
	
	public List<StockDB> getAllStocks();
	
	public boolean deleteStockById(StockDB stock);
	
	public boolean deleteStockByState(StockDB stock);
}
