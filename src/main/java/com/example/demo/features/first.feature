Feature: open browser and fetch person
	Scenario: open and fetch
		Given open browser on "http://localhost:3333/api/persons"
		Then get json response