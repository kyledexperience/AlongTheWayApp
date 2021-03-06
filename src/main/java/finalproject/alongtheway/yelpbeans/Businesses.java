package finalproject.alongtheway.yelpbeans;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Businesses implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	@JsonProperty("image_url")
	private String imageUrl;
	@JsonProperty("is_closed")
	private Boolean isClosed;
	@JsonProperty("review_count")
	private Integer reviewCount;
	private String url;
	private List<Categories> categories;
	private Double rating;
	private Coordinates coordinates;
	private String price;
	private Location location;
	@JsonProperty("display_phone")
	private String displayPhone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Categories> getCategories() {
		return categories;
	}

	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getDisplayPhone() {
		return displayPhone;
	}

	public void setDisplayPhone(String displayPhone) {
		this.displayPhone = displayPhone;
	}

	public Integer getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}
	@Override
	public String toString() {
		return "Businesses [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", isClosed=" + isClosed
				+ ", url=" + url + ", categories=" + categories + ", rating=" + rating + ", coordinates=" + coordinates
				+ ", price=" + price + ", location=" + location + ", displayPhone=" + displayPhone + "]";
	}

}
