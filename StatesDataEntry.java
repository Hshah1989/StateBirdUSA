
/* StatesDataEntry.java
 * Author: Hiren Shah
 * Date: 10/4/2020
 * Purpose: Write a Java program the displays the State bird and flower.
 */
public class StatesDataEntry {
	//variables and string builder (to maintain history)
	private String name;
	private String bird;
	private String flower;
	private StringBuilder history = new StringBuilder("");
	//2d array stateInfo to store state name, bird and flower
	private String[][] stateInfo = new String[][] {
		{"Alabama", "Yellowhammer", "Camellia"},
		{"Alaska", "Willow Ptarmigan", "Forget-me-not"},
		{"Arizona", "Cactus Wren", "Saguaro Cactus Blossom"},
		{"Arkansas", "Mockingbird", "Apple Blossom"},
		{"California", "California Valley Quail", "Golden Poppy"},
		{"Colorado", "Lark Bunting", "Rocky Mountain Columbine"},
		{"Connecticut", "American Robin", "Mountain Laurel"},
		{"Delaware", "Blue Hen Chicken", "Peach Blossom"},
		{"Florida", "Mockingbird", "Orange Blossom"},
		{"Georgia", "Brown Thrasher", "Cherokee Rose"},
		{"Hawaii", "Nene (Hawaiian Goose)", "Yellow Hibiscus"},
		{"Idaho", "Mountain Blubird", "Syringa"},
		{"Illinois", "Cardinal", "Native Violet"},
		{"Indiana", "Cardinal", "Peony"},
		{"Iowa", "Eastern Goldfinch", "Wild Rose"},
		{"Kansas", "Western Meadowlark", "Native Sunflower"},
		{"Kentucky", "Goldenrod", "Cardinal"},
		{"Louisiana", "Eastern Brown Pelican"},
		{"Maine", "White Pinecone/Tassel", "Chickadee"},
		{"Maryland", "Black-eyed Susan", "Baltimore Oriole"},
		{"Massachusetts", "Mayflower", "Chickadee"},
		{"Michigan", "Apple Blossom", "American Robin"},
		{"Minnesota", "Lady's Slipper", "Common Loon"},
		{"Mississippi", "Magnolia", "Mockingbird"},
		{"Missouri", "Hawthorn", "Dogwood", "Bluebird"},
		{"Montana", "Bitterroot", "Western Meadowlark"},
		{"Nebraska", "Goldenrod", "Western Meadowlark"},
		{"Nevada", "Sagebrush", "Mountain Bluebird"},
		{"New Hampshire", "Lilac", "Purple Finch"},
		{"New Jersey", "Violet", "Eastern Goldfinch"},
		{"New Mexico", "Yucca", "Greater Roadrunner"},
		{"New York", "Rose", "Eastern Bluebird"},
		{"North Carolina", "Dogwood", "Cardinal"},
		{"North Dakota", "Wild Prairie Rose", "Western Meadowlark"},
		{"Ohio", "Scarlet Carnation", "Cardinal"},
		{"Oklahoma", "Mistletoe", "Redbud", "Scissor-tailed Flycatcher"},
		{"Orgeon", "Oregon Grap", "Western Meadowlark"},
		{"Pennsylvania", "Mountain Laurel", "Ruffed Grouse"},
		{"Rhode Island", "Violet", "Rhode Island Red"},
		{"South Carolina", "Yellow Jessamine", "Carolina Wren"},
		{"South Dakota", "Pasqueflower", "Ring-necked Pheasant"},
		{"Tennessee", "Iris", "Mockingbird"},
		{"Texas", "Bluebonnet", "Mockingbird"},
		{"Utah", "Sego Lily", "California Gull"},
		{"Vermont", "Red Clover", "Hermit Thrush"},
		{"Virginia", "Flowering Dogwood", "Cardinal"},
		{"Washington", "Western Rhododendron", "Willow Goldfinch"},
		{"West Virginia", "Big Rhododendron", "Cardinal"},
		{"Wisconsin", "Wood Violet", "American Robin"},
		{"Wyoming", "Indian Paintbrush", "Western Meadowlark"}
		};

	// setter method in which inside we derive flower and bird name, it maintains
	// the history of the states info.
	public void setName(String name) {
		this.name = name;
		for (int i = 0; i < stateInfo.length; i++) {
			if (name.trim().equalsIgnoreCase(stateInfo[i][0])) {
				this.flower = stateInfo[i][1];
				this.bird = stateInfo[i][2];

				// add to the history of state name, flower and bird
				history.append(this.name + ", " + this.flower + ", " + this.bird + "\n");
				break;
			}
		}
	}

	// returning the bird of the selected state
	public String getBird() {
		return bird;
	}

	// returning the flower of the selected state
	public String getFlower() {
		return flower;
	}

	// returning the history of all the states searched on this object
	public StringBuilder getHistory() {
		return history;
	}

}
