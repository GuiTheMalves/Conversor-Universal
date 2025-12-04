//Para converter números
package conversor_universal;
import javax.swing.JOptionPane;
public class conversor_numerico {
    public void fazer_distancia(){
        String[] opcoes = {"1.mm -> cm","2.cm -> mm","3.cm -> dm","4.dm -> cm","dm -> m","m -> dm",
    "m -> dam","dam -> m","dam -> hm","hm -> dam","hm -> km","km -> hm","km -> m","m -> km",
    "mm -> m","m -> mm","mm -> dm","dm -> mm","mm -> dam","dam -> mm","mm -> hm","hm -> mm",
    "mm -> km","km -> mm","mm -> mm","cm -> cm","dm -> dm","m -> m","dam -> dam","hm -> hm","km -> km","Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Distâncias",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        
        if (escolha == JOptionPane.CLOSED_OPTION) return;
        String input = JOptionPane.showInputDialog("Digite a distância:");
        if (input == null) return;
        float distancia;
        try {
            distancia = Float.parseFloat(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida.");
            return;
        }

        if(escolha == 0){
            double resultado = distancia / 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f cm\n", resultado));
        }
        else if(escolha == 1){
            double resultado = distancia * 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f mm\n", resultado));
        }
        else  if(escolha == 2){
            double resultado = distancia / 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f dm\n", resultado));
        }
        else if( escolha == 3){
            double resultado = distancia * 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f cm\n", resultado));
        }
        else if(escolha == 4){
            double resultado = distancia / 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
        }
        else if(escolha == 5){
            double resultado = distancia * 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f dm\n", resultado));
        }
        else if(escolha == 6){
            double resultado = distancia / 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f dam\n", resultado));
        }
        else if(escolha == 7){
            double resultado = distancia * 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
        }
        else if(escolha == 8){
            double resultado = distancia / 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f hm\n", resultado));
        }
        else if(escolha == 9){
            double resultado = distancia * 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f dam\n", resultado));
        }
        else if(escolha == 10){
            double resultado = distancia / 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f km\n", resultado));
        }
        else if(escolha == 11){
            double resultado = distancia * 10;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f hm\n", resultado));
        }
        else if(escolha == 12){
            double resultado = distancia * 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
        }
        else if(escolha == 13){
            double resultado = distancia / 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f km\n", resultado));
        }
        else if(escolha == 14){
            double resultado = distancia / 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
        }
        else if(escolha == 15){
            double resultado = distancia * 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f mm\n", resultado));
        }
        else if(escolha == 16){
            double resultado = distancia / 100;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f dm\n", resultado));
        }
        else if(escolha == 17){
            double resultado = distancia * 100;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f mm\n", resultado));
        }
        else if(escolha == 18){
            double resultado = distancia / 10000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f dam\n", resultado));
        }
        else if(escolha == 19){
            double resultado = distancia * 10000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f mm\n", resultado));
        }
        else if(escolha == 20){
            double resultado = distancia / 1000000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f hm\n", resultado));
        }
        else if(escolha == 21){
            double resultado = distancia * 1000000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f mm\n", resultado));
        }
        else if(escolha == 22){
            double resultado = distancia / 1000000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f km\n", resultado));
        }
        else if(escolha == 23){
            double resultado = distancia * 1000000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f mm\n", resultado));
        }
        else if(escolha >= 25 && escolha <= 31){
            JOptionPane.showMessageDialog(null, "O número já está na mesma unidade.\n");
        }
        else{
            JOptionPane.showMessageDialog(null, "Conversão inválida.\n");
        }
    }

    ///////////

    public void fazer_temperatura(){
        String[] opcoes = {"Celsius -> Fahrenheit", "Fahrenheit -> Celsius", "Celsius -> Kelvin",
        "Kelvin -> Celsius", "Fahrenheit -> Kelvin", "Kelvin -> Fahrenheit",
        "Celsius -> Celsius", "Fahrenheit -> Fahrenheit", "Kelvin -> Kelvin"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Temperaturas",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        if (escolha == JOptionPane.CLOSED_OPTION) return;

        String temperaturaInput = JOptionPane.showInputDialog(null, "Digite a temperatura:");
        float temperatura = Float.parseFloat(temperaturaInput);

        if(escolha == 0){
            double resultado = (temperatura * 1.8) + 32;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f °F\n", resultado));
        }
        else if(escolha == 1){
            double resultado = (temperatura - 32) / 1.8;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f °C\n", resultado));
        }
        else if(escolha == 2){
            double resultado = temperatura + 273.15;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f K\n", resultado));
        }
        else if(escolha == 3){
            double resultado = temperatura - 273.15;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f °C\n", resultado));
        }
        else if(escolha == 4){
            double resultado = (temperatura - 32) * 5/9 + 273.15;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f K\n", resultado));
        }
        else if(escolha == 5){
            double resultado = (temperatura - 273.15) * 1.8 + 32;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f °F\n", resultado));
        }
        else if(escolha >= 6 && escolha <= 8){
            JOptionPane.showMessageDialog(null, "O número já está na mesma unidade.\n");
        }
        else{
            JOptionPane.showMessageDialog(null, "Conversão inválida.\n");
        }
    }

    /////////////

    public void fazer_massa(){
        String[] opcoes = {"g -> kg", "kg -> g", "g -> mg", "mg -> g", "kg -> mg", "mg -> kg", "mg -> mg", "g -> g", "kg -> kg","Voltar"};
        
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Distâncias",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);

        if (escolha == JOptionPane.CLOSED_OPTION || escolha == 9) return;
        String massaInput = JOptionPane.showInputDialog(null, "Digite a massa:");
        float massa = Float.parseFloat(massaInput);

        switch (escolha) {
            case 0 ->                 {
                    double resultado = massa / 1000;
                    JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f kg\n", resultado));
                }
            case 1 ->                 {
                    double resultado = massa * 1000;
                    JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f g\n", resultado));
                }
            case 2 ->                 {
                    double resultado = massa * 1000;
                    JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f mg\n", resultado));
                }
            case 3 ->                 {
                    double resultado = massa / 1000;
                    JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f g\n", resultado));
                }
            case 4 ->                 {
                    double resultado = massa * 1000000;
                    JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f mg\n", resultado));
                }
            case 5 ->                 {
                    double resultado = massa / 1000000;
                    JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f kg\n", resultado));
                }
            case 6 -> JOptionPane.showMessageDialog(null, "O resultado já está em miligramas.\n");
            case 7 -> JOptionPane.showMessageDialog(null, "O resultado já está em gramas.\n");
            case 8 -> JOptionPane.showMessageDialog(null, "O resultado já está em quilogramas.\n");
            default -> {
                JOptionPane.showMessageDialog(null, "Conversão inválida.\n");
            }
        }
    }

    ////////////

    public void fazer_volume(){
        String[] opcoes = {"Litro -> Mililitro", "Mililitro -> Litro", "Litro -> Centímetro cúbico","Centímetro cúbico -> Litro",
    "Mililitro -> Centímetro cúbico", "Centímetro cúbico -> Mililitro", "Litro -> Decímetro cúbico", "Decímetro cúbico -> Litro",
"Mililitro -> Decímetro cúbico", "Decímetro cúbico -> Mililitro", "Litro -> Hectômetro cúbico", "Hectômetro cúbico -> Litro",
"Mililitro -> Hectômetro cúbico", "Hectômetro cúbico -> Mililitro", "Litro -> Metro cúbico", "Metro cúbico -> Litro",
"Mililitro -> Metro cúbico", "Metro cúbico -> Mililitro", "Centímetro cúbico -> Mililitro","Mililitro -> Centímetro cúbico",
"Centímetro cúbico -> Centímetro cúbico", "Decímetro cúbico -> Decímetro cúbico","Litro -> Litro","Hectômetro cúbico -> Hectômetro cúbico",
"Metro cúbico -> Metro cúbico","Mililitro -> Mililitro","Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Volumes",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);

        if (escolha == JOptionPane.CLOSED_OPTION || escolha == 27) return;
        String volumeInput = JOptionPane.showInputDialog(null, "Digite o volume:");
        float volume = Float.parseFloat(volumeInput);

        if (volumeInput == null) return;
        if(escolha == 0){
            double resultado = volume * 1000;
            System.out.printf("Resultado: %.1f ml\n", resultado);
        }
        else if(escolha == 1){
            double resultado = volume / 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f l\n", resultado));
        }
        else if(escolha == 2){
            double resultado = volume * 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f cm³\n", resultado));
        }
        else if(escolha == 3){
            double resultado = volume / 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f l\n", resultado));
        }
        else if(escolha == 4){
            double resultado = volume * 1;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f cm³\n", resultado));
        }
        else if(escolha == 5){
            double resultado = volume * 1;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f ml\n", resultado));
        }
        else if(escolha == 6){
            double resultado = volume * 1;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f dm³\n", resultado));
        }
        else if(escolha == 7){
            double resultado = volume * 1;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f l\n", resultado));
        }
        else if(escolha == 8){
            double resultado = volume / 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f dm³\n", resultado));
        }
        else if(escolha == 9){
            double resultado = volume * 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f ml\n", resultado));
        }
        else if(escolha == 10){
            double resultado = volume / 1000000000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f hm³\n", resultado));
        }
        else if(escolha == 11){
            double resultado = volume * 1000000000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f l\n", resultado));
        }
        else if(escolha == 12){
            double resultado = volume * 1e15;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f hm³\n", resultado));
        }
        else if(escolha == 13){
            double resultado = volume / 1e15;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f ml\n", resultado));
        }
        else if(escolha == 14){
            double resultado = volume / 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m³\n", resultado));
        }
        else if(escolha == 15){
            double resultado = volume * 1000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f l\n", resultado));
        }
        else if(escolha == 16){
            double resultado = volume / 1000000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m³\n", resultado));
        }
        else if(escolha == 17){
            double resultado = volume * 1000000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f ml\n", resultado));
        }
        else if(escolha == 18){
            double resultado = volume * 1;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f cm³\n", resultado));
        }
        else if(escolha == 19){
            double resultado = volume * 1;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f ml\n", resultado));
        }
        else if(escolha >= 21 && escolha <= 26){
            JOptionPane.showMessageDialog(null, "O número já está na mesma unidade.\n");
        }
        else{
            JOptionPane.showMessageDialog(null, "Conversão inválida.\n");
        }
    }

    ////////////

    public void fazer_moeda(){
        String[] opcoes = {"Real -> Dólar","Dólar -> Real","Real -> Euro","Euro para Dólar",
    "Euro -> Real","Real -> Libra","Libra -> Real","Dólar -> Euro","Euro -> Libra","Libra -> Euro"
    ,"Libra -> Dólar","Dólar -> Libra","Real -> Real","Dólar -> Dólar","Euro -> Euro","Libra -> Libra","Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Distâncias",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);

        if (escolha == JOptionPane.CLOSED_OPTION || escolha == 16) return;
        String moedaInput = JOptionPane.showInputDialog("Digite a moeda:");
        if (moedaInput == null) return;
        float moeda = Float.parseFloat(moedaInput);
    switch(escolha){
        case 0 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f $\n", moeda / 5.25));
        case 1 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f R$\n", moeda * 5.25));
        case 2 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f €\n", moeda / 6.00));
        case 3 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f $\n", moeda * 1.20));
        case 4 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f R$\n", moeda * 6.00));
        case 5 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f £\n", moeda / 7.00));
        case 6 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f R$\n", moeda * 7.00));
        case 7 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f €\n", moeda / 1.20));
        case 8 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f £\n", moeda / 1.50));
        case 9 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f €\n", moeda * 1.50));
        case 10 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f $\n", moeda * 1.30));
        case 11 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f £\n", moeda / 1.30));
        case 12 -> JOptionPane.showMessageDialog(null,"O número já está em reais.\n");
        case 13 -> JOptionPane.showMessageDialog(null,"O número já está em dólares.\n");
        case 14 -> JOptionPane.showMessageDialog(null,"O número já está em euros.\n");
        case 15 -> JOptionPane.showMessageDialog(null,"O número já está em libras.\n");
        }
    }

    ////////////

    public void fazer_velocidade(){
        String[] opcoes = {"km/h -> m/s", "m/s -> km/h", "mph -> km/h", "km/h -> mph","mph -> m/s", "m/s -> mph","km/h -> km/h","m/s -> m/s","mph -> mph","Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Velocidades",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        if(escolha == 9) return;
        String velocidadeInput = JOptionPane.showInputDialog("Digite a velocidade:");
        if (velocidadeInput == null) return;
        float velocidade = Float.parseFloat(velocidadeInput);
        switch (escolha) {
        case 0 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f m/s\n", velocidade / 3.6));
        case 1 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f km/h\n", velocidade * 3.6));
        case 2 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f km/h\n", velocidade * 1.60934));
        case 3 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f mph\n", velocidade / 1.60934));
        case 4 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f m/s\n", velocidade * 0.44704));
        case 5 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f mph\n", velocidade / 0.44704));
        case 6 -> JOptionPane.showMessageDialog(null,"O número já está em km/h.\n");
        case 7 -> JOptionPane.showMessageDialog(null,"O número já está em m/s.\n");
        case 8 -> JOptionPane.showMessageDialog(null,"O número já está em mph.\n");
        default -> {
            JOptionPane.showMessageDialog(null,"Conversão inválida.\n");

            }
    }
    }

    ////////////

    public void fazer_pressao(){
        String[] opcoes = {"atm -> mmHg", "mmHg -> atm", "atm -> Pa", "Pa -> atm", "mmHg -> Pa", "Pa -> mmHg","atm -> bar", "bar -> atm", "mmHg -> bar", "bar -> mmHg", "Pa -> bar", "bar -> Pa", "atm -> atm", "mmHg -> mmHg", "Pa -> Pa", "bar -> bar","Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Pressão",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        if(escolha == 16) return;
        String pressaoInput = JOptionPane.showInputDialog("Digite a pressão:");
        if (pressaoInput == null) return;
        float pressao = Float.parseFloat(pressaoInput);
        switch (escolha) {
        case 0 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f mmHg\n", pressao * 760));
        case 1 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f atm\n", pressao / 760));
        case 2 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f Pa\n", pressao * 101325));
        case 3 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f atm\n", pressao / 101325));
        case 4 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f Pa\n", pressao * 133.322));
        case 5 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f mmHg\n", pressao / 133.322));
        case 6 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f bar\n", pressao * 1.01325));
        case 7 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f atm\n", pressao / 1.01325));
        case 8 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f bar\n", pressao / 760 * 1.01325));
        case 9 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f mmHg\n", pressao * 760 / 1.01325));
        case 10 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f mmHg\n", pressao * 760 / 1.01325));
        case 11 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f bar\n", pressao / 100000));
        case 12 -> JOptionPane.showMessageDialog(null,String.format("Resultado: %.2f Pa\n", pressao * 100000));
        case 13 -> JOptionPane.showMessageDialog(null,"O número já está em atm.\n");
        case 14 -> JOptionPane.showMessageDialog(null,"O número já está em mmHg.\n");
        case 15 -> JOptionPane.showMessageDialog(null,"O número já está em Pa.\n");
        case 16 -> JOptionPane.showMessageDialog(null,"O número já está em bar.\n");
        default -> {
            JOptionPane.showMessageDialog(null,"Conversão inválida.\n");
            return;
        }
    }
}

    ////////////

    public void fazer_frequencia() {
    String[] opcoes = {
        "De Hz para kHz", "De kHz para Hz", "De Hz para MHz", "De MHz para Hz",
        "De kHz para MHz", "De MHz para kHz", "De Hz para GHz", "De GHz para Hz",
        "De MHz para GHz", "De GHz para MHz", "De kHz para GHz", "De GHz para kHz",
        "De Hz para Hz", "De kHz para kHz", "De MHz para MHz", "De GHz para GHz",
        "Voltar"
    };
    int escolha = JOptionPane.showOptionDialog(
        null,
        "Escolha a conversão desejada:",
        "Conversão de Frequências",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[0]);
    if(escolha == 17) return;
    String frequenciaInput = JOptionPane.showInputDialog("Digite a frequência:");
    if (frequenciaInput == null) return;
    float frequencia = Float.parseFloat(frequenciaInput);
    double resultado;
        switch (escolha) {
    case 0 -> {
        resultado = frequencia / 1000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f kHz\n", resultado));
            }
    case 1 -> {
        resultado = frequencia * 1000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f Hz\n", resultado));
            }
    case 2 -> {
        resultado = frequencia / 1000000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.6f MHz\n", resultado));
            }
    case 3 -> {
        resultado = frequencia * 1000000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f Hz\n", resultado));
            }
    case 4 -> {
        resultado = frequencia / 1000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f MHz\n", resultado));
            }
    case 5 -> {
        resultado = frequencia * 1000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f kHz\n", resultado));
            }
    case 6 -> {
        resultado = frequencia / 1000000000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.9f GHz\n", resultado));
            }
    case 7 -> {
        resultado = frequencia * 1000000000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f Hz\n", resultado));
            }
    case 8 -> {
        resultado = frequencia / 1000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f GHz\n", resultado));
            }
    case 9 -> {
        resultado = frequencia * 1000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f MHz\n", resultado));
            }
    case 10 -> {
        resultado = frequencia / 1000000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.6f GHz\n", resultado));
            }
    case 11 -> {
        resultado = frequencia * 1000000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f kHz\n", resultado));
            }
    case 12 -> {
        resultado = frequencia * 1000000;
        JOptionPane.showMessageDialog(null,String.format("Resultado: %.3f kHz\n", resultado));
    }
    case 13 -> JOptionPane.showMessageDialog(null,"O número já está em Hz.\n");
    case 14 -> JOptionPane.showMessageDialog(null,"O número já está em kHz.\n");
    case 15 -> JOptionPane.showMessageDialog(null,"O número já está em MHz.\n");
    case 16 -> JOptionPane.showMessageDialog(null,"O número já está em GHz.\n");
    default -> {
        JOptionPane.showMessageDialog(null,"Conversão inválida.\n");
        return;
    }
}
}

    ////////////

    public void fazer_tempo(){
        String[] opcoes = {
        "Segundos -> Minutos", "Minutos -> Segundos", "Minutos -> Horas",
        "Horas -> Minutos", "Horas -> Dias", "Dias -> Horas",
        "Dias -> Semanas", "Semanas -> Dias", "Semanas -> Meses",
        "Meses -> Semanas", "Meses -> Anos", "Anos -> Meses",
        "Anos -> Dias", "Dias -> Anos", "Segundos -> Segundos",
        "Minutos -> Minutos", "Horas -> Horas", "Dias -> Dias",
        "Semanas -> Semanas", "Meses -> Meses", "Anos -> Anos",
        "Segundos -> Horas", "Segundos -> Dias", "Segundos -> Semanas",
        "Segundos -> Meses", "Segundos -> Anos", "Dias -> Segundos",
        "Semanas -> Segundos", "Meses -> Segundos", "Anos -> Segundos",
        "Horas -> Segundos", "Minutos -> Dias", "Minutos -> Semanas",
        "Minutos -> Meses", "Minutos -> Anos", "Semanas -> Minutos",
        "Meses -> Minutos", "Anos -> Minutos", "Horas -> Semanas",
        "Horas -> Meses", "Horas -> Anos", "Semanas -> Horas",
        "Meses -> Horas", "Anos -> Horas", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Tempo",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        if(escolha == 43) return;
        String tempoInput = JOptionPane.showInputDialog("Digite o tempo:");
        if(tempoInput == null) {
            System.out.println("Voltando...\n");
            return;
        }
        float tempo = Float.parseFloat(tempoInput);
        double resultado;
        if(escolha < 0 || escolha > 50){
            JOptionPane.showMessageDialog(null, "Conversão inválida.\n");
            return;
        }
        switch(escolha) {
        case 0 -> {
            resultado = tempo / 60;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f min\n", resultado));
            }
        case 1 -> {
            resultado = tempo * 60;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f s\n", resultado));
            }
        case 2 -> {
            resultado = tempo / 60;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f h\n", resultado));
            }
        case 3 -> {
            resultado = tempo * 60;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f min\n", resultado));
            }
        case 4 -> {
            resultado = tempo / 24;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f d\n", resultado));
            }
        case 5 -> {
            resultado = tempo * 24;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f h\n", resultado));
            }
        case 6 -> {
            resultado = tempo / 7;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f w\n", resultado));
            }
        case 7 -> {
            resultado = tempo * 7;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f d\n", resultado));
            }
        case 8 -> {
            resultado = tempo / 30;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
            }
        case 9 -> {
            resultado = tempo * 4;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f w\n", resultado));
            }
        case 10 -> {
            resultado = tempo / 12;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f a\n", resultado));
            }
        case 11 -> {
            resultado = tempo * 12;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
            }
        case 12 -> {
            resultado = tempo / 365;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f a\n", resultado));
            }
        case 13 -> {
            resultado = tempo * 365;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f d\n", resultado));
            }
        case 14 -> JOptionPane.showMessageDialog(null, "O número já está em segundos.\n");
        case 15 -> JOptionPane.showMessageDialog(null, "O número já está em minutos.\n");
        case 16 -> JOptionPane.showMessageDialog(null, "O número já está em horas.\n");
        case 17 -> JOptionPane.showMessageDialog(null, "O número já está em dias.\n");
        case 18 -> JOptionPane.showMessageDialog(null, "O número já está em semanas.\n");
        case 19 -> JOptionPane.showMessageDialog(null, "O número já está em meses.\n");
        case 20 -> JOptionPane.showMessageDialog(null, "O número já está em anos.\n");
        case 21 -> {
            resultado = tempo / 3600;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f h\n", resultado));
            }
        case 22 -> {
            resultado = tempo / 86400;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f d\n", resultado));
            }
        case 23 -> {
            resultado = tempo / 604800;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f w\n", resultado));
            }
        case 24 -> {
            resultado = tempo / 2628000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
            }
        case 25 -> {
            resultado = tempo / 31536000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f a\n", resultado));
            }
        case 26 -> {
            resultado = tempo * 86400;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f s\n", resultado));
            }
        case 27 -> {
            resultado = tempo * 604800;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f s\n", resultado));
            }
        case 28 -> {
            resultado = tempo * 2628000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f s\n", resultado));
            }
        case 29 -> {
            resultado = tempo * 31536000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f s\n", resultado));
            }
        case 30 -> {
            resultado = tempo * 3600;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f s\n", resultado));
            }
        case 31 -> {
            resultado = tempo / 1440;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f d\n", resultado));
            }
        case 32 -> {
            resultado = tempo / 10080;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f w\n", resultado));
            }
        case 33 -> {
            resultado = tempo / 432000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
            }
        case 34 -> {
            resultado = tempo / 5184000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f a\n", resultado));
            }
        case 35 -> {
            resultado = tempo * 10080;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f min\n", resultado));
            }
        case 36 -> {
            resultado = tempo * 432000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f min\n", resultado));
            }
        case 37 -> {
            resultado = tempo * 5184000;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f min\n", resultado));
            }
        case 38 -> {
            resultado = tempo / 168;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f w\n", resultado));
            }
        case 39 -> {
            resultado = tempo / 720;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
            }
        case 40 -> {
            resultado = tempo / 8760;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f a\n", resultado));
            }
        case 41 -> {
            resultado = tempo * 168;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f h\n", resultado));
            }
        case 42 -> {
            resultado = tempo * 720;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f h\n", resultado));
            }
        case 43 -> {
            resultado = tempo * 8760;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f h\n", resultado));
            }
        case 44 -> {
            resultado = tempo / 30;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f m\n", resultado));
            }
        case 45 -> {
            resultado = tempo / 365;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f a\n", resultado));
            }
        case 46 -> {
            resultado = tempo * 30;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f d\n", resultado));
            }
        case 47 -> {
            resultado = tempo * 365;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f d\n", resultado));
            }
        case 48 -> {
            resultado = tempo / 52;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f a\n", resultado));
            }
        case 49 -> {
            resultado = tempo * 52;
            JOptionPane.showMessageDialog(null, String.format("Resultado: %.1f w\n", resultado));
            }
        }
}

public void fazer_binario(){
        String[] opcoes = {"Número -> Binário", "Binário -> Número", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Binários",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        if(escolha == 2) return;
        
        switch(escolha){
            case 1 -> {
                String numeroInput = JOptionPane.showInputDialog(null, "Diga o número: ");
                int numero = Integer.parseInt(numeroInput);
                String resultado = Integer.toBinaryString(numero);
                JOptionPane.showMessageDialog(null, "Binário: \n" + resultado);
            }
            case 2 -> {
                String binarioInput = JOptionPane.showInputDialog(null, "Diga o binário: ");
                int resultado1 = Integer.parseInt(binarioInput, 2);
                JOptionPane.showMessageDialog(null, "Decimal: \n" + resultado1);
            }
            default -> JOptionPane.showMessageDialog(null, "Opção inválida\n");
        }
    }


    public void fazer_octal(){
        String[] opcoes = {"Número -> Octal", "Octal -> Número", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Octais",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        if(escolha == 2) return;
        switch(escolha){
            case 0 -> {
                String entrada = JOptionPane.showInputDialog(null, "Diga o número: ");
                int octal = Integer.parseInt(entrada);
                String resultado = Integer.toOctalString(octal);
                JOptionPane.showMessageDialog(null, "Octal: \n" + resultado);
            }
            case 1 -> {
                String octalInput = JOptionPane.showInputDialog(null, "Diga o octal: ");
                int resultado1 = Integer.parseInt(octalInput, 8);
                JOptionPane.showMessageDialog(null, "Decimal: \n" + resultado1);
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Opção inválida\n");
            }
        }
    }


    public void fazer_hexadecimal(){
        String[] opcoes = {"Número -> Hexadecimal", "Hexadecimal -> Número", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a conversão desejada:",
            "Conversão de Hexadecimais",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);
        if(escolha == 2) return;
        switch(escolha){
            case 0 -> {
                String entrada = JOptionPane.showInputDialog(null, "Diga o número: ");
                int hexadecimal = Integer.parseInt(entrada);
                String resultado = Integer.toHexString(hexadecimal);
                JOptionPane.showMessageDialog(null, "Hexadecimal: \n" + resultado);
            }
            case 1 -> {
                String hexadecimalInput = JOptionPane.showInputDialog(null, "Diga o hexadecimal: ");
                int resultado1 = Integer.parseInt(hexadecimalInput, 16);
                JOptionPane.showMessageDialog(null, "Decimal: \n" + resultado1);
            }
            default -> JOptionPane.showMessageDialog(null, "Opção inválida\n");
        }
    }
}
