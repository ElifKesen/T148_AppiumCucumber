Feature:Kullanici obilet sayfasindaki görevleri yapar
  @obilet
  Scenario:Kullanici obilet sayfasini acar ve bilet arar
    Given Kullanici "obiletURL" sayfasina gider
    When Dil olarak Turkce secer
    When Para birimi olarak TL secer
    When Bul secenegine tiklar
    Then Gelen bilet fiyatinin TL oldugunu dogrular
