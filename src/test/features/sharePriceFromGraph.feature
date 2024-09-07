#https://www.google.com/search?q=titan+stock&oq=titan+stock&gs_lcrp=EgZjaHJvbWUqCggAEAAYsQMYgAQyCggAEAAYsQMYgAQyDQgBEAAYgwEYsQMYgAQyBwgCEAAYgAQyBwgDEAAYgAQyBwgEEAAYgAQyBwgFEAAYgAQyBwgGEAAYgAQyBwgHEAAYgAQyBwgIEAAYgAQyBwgJEAAYgATSAQgzMDE0ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8

Feature: As a test user
  I should be able to open stock share price graph from Google and capture the price

  @CaptureSharePriceFromGraph
  Scenario: Capture Share Price from Graph
    Given I should open url2
    When I should capture share price from graph
    #//*[@class='uch-psvg']