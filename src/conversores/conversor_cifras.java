package conversor_universal;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
public class conversor_cifras {
    public void morse(){
        String[] opcoes = {"Texto → Morse", "Morse → Texto", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
        null,
        "Escolha a conversão desejada:",
        "Conversão de Código Morse",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[0]
        );
        
        if(escolha == 2 || escolha == JOptionPane.CLOSED_OPTION){
            return;
        }
        String cifra_morse = JOptionPane.showInputDialog("Digite o texto:");
        if (cifra_morse == null) return;

        HashMap<Character, String> textoParaMorse = new HashMap<>();
        HashMap<String, Character> morseParaTexto = new HashMap<>();
        textoParaMorse.put('A', ".-");
        textoParaMorse.put('B', "-...");
        textoParaMorse.put('C', "-.-.");
        textoParaMorse.put('D', "-..");
        textoParaMorse.put('E', ".");
        textoParaMorse.put('F', "..-.");
        textoParaMorse.put('G', "--.");
        textoParaMorse.put('H', "....");
        textoParaMorse.put('I', "..");
        textoParaMorse.put('J', ".---");
        textoParaMorse.put('K', "-.-");
        textoParaMorse.put('L', ".-..");
        textoParaMorse.put('M', "--");
        textoParaMorse.put('N', "-.");
        textoParaMorse.put('O', "---");
        textoParaMorse.put('P', ".--.");
        textoParaMorse.put('Q', "--.-");
        textoParaMorse.put('R', ".-.");
        textoParaMorse.put('S', "...");
        textoParaMorse.put('T', "-");
        textoParaMorse.put('U', "..-");
        textoParaMorse.put('V', "...-");
        textoParaMorse.put('W', ".--");
        textoParaMorse.put('X', "-..-");
        textoParaMorse.put('Y', "-.--");
        textoParaMorse.put('Z', "--..");
        textoParaMorse.put('0', "-----");
        textoParaMorse.put('1', ".----");
        textoParaMorse.put('2', "..---");
        textoParaMorse.put('3', "...--");
        textoParaMorse.put('4', "....-");
        textoParaMorse.put('5', ".....");
        textoParaMorse.put('6', "-....");
        textoParaMorse.put('7', "--...");
        textoParaMorse.put('8', "---..");
        textoParaMorse.put('9', "----.");
        textoParaMorse.put(' ', "/");
        textoParaMorse.put('.', ".-.-.-");
        textoParaMorse.put(',', "--..--");
        textoParaMorse.put('?', "..--..");
        textoParaMorse.put('!', "-.-.--");
        textoParaMorse.put(':', "---...");
        for (Map.Entry<Character, String> entry : textoParaMorse.entrySet()) {
        morseParaTexto.put(entry.getValue(), entry.getKey());
    }

        switch(escolha) {
            case 0 -> {
                String entrada = Normalizer.normalize(cifra_morse, Normalizer.Form.NFD)
                                       .replaceAll("\\p{M}", "") // remove marcas diacríticas
                                       .toUpperCase();
                StringBuilder morse = new StringBuilder();
                for(char c : entrada.toCharArray()) {
                    if (textoParaMorse.containsKey(c)) {
                        morse.append(textoParaMorse.get(c)).append(" ");
                    } else if (c == ' ') {
                        morse.append("/ ");
                    } else {
                        morse.append("? ");
                    }
                }
                JOptionPane.showMessageDialog(null, "Morse:\n" + morse.toString());
            }
            case 1 -> {
                String[] morsePalavras = cifra_morse.split(" ");
                StringBuilder textoTraduzido = new StringBuilder();
                
                
                for(String codigo : morsePalavras) {
                    if (morseParaTexto.containsKey(codigo)) {
                        textoTraduzido.append(morseParaTexto.get(codigo));
                    } else if (codigo.equals("/")) {
                        textoTraduzido.append(" ");
                    } else {
                        textoTraduzido.append("?");
                    }
                }
                JOptionPane.showMessageDialog(null, "Texto:\n" + textoTraduzido.toString());
            }
        }
    }


    public void cesar(){
        String[] opcoes = {"Texto → César", "César → Texto", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
            null,
        "Escolha a conversão desejada:",
        "Conversão de Cifra de César",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes, 
        opcoes[0]
        );
        if(escolha == 2 || escolha == JOptionPane.CLOSED_OPTION){
            return;
        }

        String cifra_cesar = JOptionPane.showInputDialog("Digite o texto:");
        if (cifra_cesar == null) return;
        int deslocamento;

        while (true) {
        String deslocStr = JOptionPane.showInputDialog("Digite o deslocamento (número de posições):");
        if (deslocStr == null) return;
        try {
            deslocamento = Integer.parseInt(deslocStr);
            deslocamento = ((deslocamento % 26) + 26) % 26;
            break;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número inteiro válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

        HashMap<Character, Character> textoParaCesar = new HashMap<>();
        HashMap<Character, Character> cesarParaTexto = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            char cifra = (char) ((c - 'A' + deslocamento) % 26 + 'A');
            textoParaCesar.put(c, cifra);
            cesarParaTexto.put(cifra, c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            char cifra = (char) ((c - 'a' + deslocamento) % 26 + 'a');
            textoParaCesar.put(c, cifra);
            cesarParaTexto.put(cifra, c);
        }

        switch(escolha) {
            case 0 -> {
                StringBuilder cifraCesar = new StringBuilder();
                for(char c : cifra_cesar.toCharArray()) {
                    if (textoParaCesar.containsKey(c)) {
                        cifraCesar.append(textoParaCesar.get(c));
                    } else {
                        cifraCesar.append(c);
                    }
                }
                JOptionPane.showMessageDialog(null,"Cifra de César: \n" + cifraCesar.toString().trim());
            }
            case 1 -> {
                String cifraInput = JOptionPane.showInputDialog("Digite a cifra de César a ser convertida:");
                StringBuilder textoTraduzido = new StringBuilder();
                for(char c : cifraInput.toCharArray()) {
                    if (cesarParaTexto.containsKey(c)) {
                        textoTraduzido.append(cesarParaTexto.get(c));
                    } else {
                        textoTraduzido.append(c);
                    }
                }
                JOptionPane.showMessageDialog(null,"Texto: \n" + textoTraduzido.toString().trim());
            }
            default ->
            JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }



    public void atbash(){
        String[] opcoes = {"Texto → Atbash", "Atbash → Texto", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
        null,
        "Escolha a conversão desejada:",
        "Conversão de Atbash",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[0]
        );
        
        if(escolha == 2 || escolha == JOptionPane.CLOSED_OPTION){
            return;
        }
        String cifra_atbash = JOptionPane.showInputDialog(null,
            escolha == 0 ?
                   "Digite o texto para cifrar em Atbash:" :
                   "Digite o texto já em Atbash:"
    );
    if (cifra_atbash == null) return;
        

        HashMap<Character, Character> atbash = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            char letraInvertida = (char) ('Z' - (c - 'A'));
            atbash.put(c, letraInvertida);
        }

        for (char c = 'a'; c <= 'z'; c++) {
        char letraInvertida = (char) ('z' - (c - 'a'));
        atbash.put(c, letraInvertida);
        }

        StringBuilder resultado = new StringBuilder();
        for (char c : cifra_atbash.toCharArray()) {
        resultado.append(atbash.getOrDefault(c, c));
    }
    JOptionPane.showMessageDialog(
            null,
            (escolha == 0 ? "Texto cifrado em Atbash:\n" : "Texto decifrado:\n")
                    + resultado,
            "Resultado",
            JOptionPane.INFORMATION_MESSAGE
    );
/*
        switch(escolha){

            case 0 -> {
                for (char c : cifra_atbash.toCharArray()) {
                    if (atbash.containsKey(c)) {
                        resultado.append(atbash.get(c));
                    } else {
                        resultado.append(c);
                    }
                }
                System.out.println("Texto convertido: \n" + resultado.toString());
            }

        case 1 -> {
            for (char c : cifra_atbash.toCharArray()) {
                if (atbash.containsKey(c)) {
                    resultado.append(atbash.get(c));
                } else {
                    resultado.append(c);
                }
            }
            System.out.println("Texto convertido: \n" + resultado.toString());
            }
        default -> System.out.println("Opção inválida\n");
        }*/

    }



    public void ascii(){
        String[] opcoes = {"Texto -> ASCII", "ASCII -> Texto", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
        null,
        "Escolha a conversão desejada:",
        "Conversão de ASCII",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[0]
        );
        if(escolha == 2 || escolha == JOptionPane.CLOSED_OPTION){
            return;
        }
        switch(escolha){
            case 0 -> {
                String cifra_ascii = JOptionPane.showInputDialog("Digite o texto:");
                if (cifra_ascii == null) return;
                StringBuilder ascii = new StringBuilder();
                for (int i = 0; i < cifra_ascii.length(); i++) {
                    int codigo = (int) cifra_ascii.charAt(i);
                    ascii.append(codigo).append(" ");
                }
                JOptionPane.showMessageDialog(null, "Texto convertido para ASCII:\n" + ascii.toString().trim());
            }
            case 1 -> {
                String linhaAscii = JOptionPane.showInputDialog("Digite os códigos ASCII separados por espaço:");
                if (linhaAscii == null) return;
                String[] codigos = linhaAscii.trim().split(" ");
                StringBuilder textoConvertido = new StringBuilder();
                
                for (String codigo : codigos) {
                    try {
                        int valor = Integer.parseInt(codigo);
                        textoConvertido.append((char) valor); // converte ASCII para caractere
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Código inválido: " + codigo, "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                
                JOptionPane.showMessageDialog(null, "ASCII convertido para texto:\n" + textoConvertido.toString());
            }
            default -> 
            JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }

    public void nato(){
        String[] opcoes = {"Texto -> NATO", "NATO -> Texto", "Voltar"};
        int escolha = JOptionPane.showOptionDialog(
        null,
        "Escolha a conversão desejada:",
        "Conversão de NATO",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[0]
        );
        if(escolha == 2 || escolha == JOptionPane.CLOSED_OPTION){
            return;
        }
        String cifra_nato = JOptionPane.showInputDialog("Digite o texto:");
    if (cifra_nato == null) return;
        HashMap<Character, String> textoparanato = new HashMap<>();
        HashMap<String, Character> natoparatexto = new HashMap<>();
        textoparanato.put('a', "Alpha");
        textoparanato.put('b', "Beta");
        textoparanato.put('c', "Charlie");
        textoparanato.put('d', "Delta");
        textoparanato.put('e', "Echo");
        textoparanato.put('f', "Foxtrot");
        textoparanato.put('g', "Golf");
        textoparanato.put('h', "Hotel");
        textoparanato.put('i', "India");
        textoparanato.put('j', "Juliett");
        textoparanato.put('k', "Kilo");
        textoparanato.put('l', "Lima");
        textoparanato.put('m', "Mike");
        textoparanato.put('n', "November");
        textoparanato.put('o', "Oscar");
        textoparanato.put('p', "Papa");
        textoparanato.put('q', "Quebec");
        textoparanato.put('r', "Romeo");
        textoparanato.put('s', "Sierra");
        textoparanato.put('t', "Tango");
        textoparanato.put('u', "Uniform");
        textoparanato.put('v', "Victor");
        textoparanato.put('w', "Wiskey");
        textoparanato.put('x', "X-ray");
        textoparanato.put('y', "Yankee");
        textoparanato.put('z', "Zulu");
        
        switch(escolha){
            case 0 -> {
                StringBuilder resultado = new StringBuilder();
                for (char c : cifra_nato.toLowerCase().toCharArray()) {
                    if (textoparanato.containsKey(c)) {
                        resultado.append(textoparanato.get(c)).append(" ");
                    } else if (c == ' ') {
                        resultado.append("  ");
                    } else {
                        resultado.append("? ");
                    }
                }
                JOptionPane.showMessageDialog(null,"Texto em NATO: \n" + resultado.toString().trim());
            }
            case 1 -> {
                for (Map.Entry<Character, String> entry : textoparanato.entrySet()) {
                    natoparatexto.put(entry.getValue().toLowerCase(), entry.getKey());
                }
                
                StringBuilder resultado2 = new StringBuilder();
                String[] palavras = cifra_nato.toLowerCase().split(" ");
                for (String palavra : palavras) {
                    if (natoparatexto.containsKey(palavra)) {
                        resultado2.append(natoparatexto.get(palavra));
                    } else if (palavra.equals("")) {
                        resultado2.append(" ");
                    } else {
                        resultado2.append("?");
                    }
                }
                JOptionPane.showMessageDialog(null,"Texto traduzido: \n" + resultado2.toString().trim());
            }
            default -> JOptionPane.showMessageDialog(null,"Opção inválida\n");
        }
    }
}

