Feature:Kullanici ilgili browsera gider
  @browser
  Scenario: Kullanici verilen browser linkini acar
   # Given Kullanici hepsiburada adresine gider
    Given Kullanici "url" sayfasina gider
    Then Ilgili kutucugun oldugunu dogrular
