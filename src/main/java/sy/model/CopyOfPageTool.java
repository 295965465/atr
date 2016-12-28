package sy.model;

import java.io.Serializable;

public class CopyOfPageTool implements Serializable {
	private static final long serialVersionUID = 2360278913378031622L;
	 //默认当前页面为第一页
	 private int pageNow=1;
	 //默认每页显示10条数据
     private int pageSize=10;
     //记录总条数
     private int totalCount;
     //总页数
     private int totalPageCount;
     // 开始位置，从0开始
     @SuppressWarnings("unused")
     private int startPos;
     // 是否有首页
     @SuppressWarnings("unused")
     private boolean hasFirst;
     // 是否有前一页
     @SuppressWarnings("unused")
     private boolean hasPre;
     // 是否有下一页
     @SuppressWarnings("unused")
     private boolean hasNext;
     // 是否有最后一页
     @SuppressWarnings("unused")
     private boolean hasLast;
     /**
      * 得到总条数和当前页数
      * @param totalCount
      * @param pageNow
      */
     public CopyOfPageTool(int totalCount, int pageNow) {
    	 this.totalCount = totalCount;
    	 this.pageNow = pageNow;
	}
	public int getTotalPageCount() {
		totalPageCount = getTotalCount() / getPageSize();
		return (totalCount % pageSize == 0) ? totalPageCount
				: totalPageCount + 1;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	/**
	 * 取得选择记录的初始位置
	 * @return
	 */
	public int getStartPos() {
		return (pageNow - 1) * pageSize;
	}
	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}
	public boolean isHasFirst() {
		return (pageNow == 1) ? false : true;
	}
	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}
	public boolean isHasPre() {
		return isHasFirst() ? true : false;
	}
	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}
	public boolean isHasNext() {
		return isHasLast() ? true : false;
	}
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	public boolean isHasLast() {
		return (pageNow == getTotalCount()) ? false : true;
	}
	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
     
}