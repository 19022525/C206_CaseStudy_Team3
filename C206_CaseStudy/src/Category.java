
public class Category {
	private String categoryId;
	private String category;
	public Category(String categoryId, String category) {
		this.categoryId = categoryId;
		this.category = category;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String toString() {
		String output = String.format("%-10s %-30s", categoryId,category);
		
		return output;
	}
	
}
