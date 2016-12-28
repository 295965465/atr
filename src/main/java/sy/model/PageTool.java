package sy.model;

import java.io.Serializable;

public class PageTool implements Serializable {
	private static final long serialVersionUID = 2360278913378031622L;
	 //默认当前页面为第一页
	 private int pageNow;
	 //默认每页显示10条数据
     private int pageSize;
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
     private int row;
     private int endPos;
     private String news;
     /**
      * 得到总条数和当前页数
      * @param totalCount
      * @param pageNow
     * @param news 
      */
     public PageTool(int row, int pageNow, String news) {
    	this.row=row;
    	 this.pageNow = pageNow;
    	 this.news=news;
	}
     
     public PageTool(int row, int pageNow) {
     	this.row=row;
     	 this.pageNow = pageNow;
     
 	}
     
	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getStartPos() {
		return (pageNow - 1) * row;
	}
	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}
	
	
	public int getEndPos() {
		return pageNow*row;
	}
	public void setEndPos(int endPos) {
		this.endPos = endPos;
	}
	@Override
	public String toString() {
		return "PageTool [pageNow=" + pageNow + ", startPos=" + startPos
				+ ", row=" + row + ", endPos=" + endPos + "]";
	}
	
     
}