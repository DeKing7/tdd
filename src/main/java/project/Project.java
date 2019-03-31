package project;

public class Project {

    ProjectService service;

   public Project(ProjectService) {
       this.service = service;
   }

    double czas = 9.3677;
    int okrazenia = 8;
    int wynik = 1;
    int wynik2 = 0;
    int zawody = 70;
    int wygrane = 20;
    int punkty = 30;
    int time = 15;

    public double jednookrazenie (double czas, int okrazenia){
           return service.howmanytimedriveKubica(czas, okrazenia);
              }
              public int wynik (int wynik, int wynik2){
        return service.howmanygoalsscoreRealinhalf(wynik, wynik2);
              }
    public int iloscwyganych (int zawody, int wygrane){
    return service.howmanyvictoryhaveFederer(zawody, wygrane);
    }
    public int punktynaminuty (int punkty, int time){
        return service.howmanytimegetinquarter(punkty, time);
    }
}
