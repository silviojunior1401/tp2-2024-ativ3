/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ3;

/**
 *
 * @author Silvio Junior
 */
public class OO_Exercicio01_02_03_04 {
    /**
     * 1 - A palavra-chave static é usada para indicar que uma variável ou 
     * método pertence à classe, e não a uma instância específica da classe. 
     * Por outro lado, as variáveis de instância (ou não estáticas) são 
     * aquelas que pertencem a uma instância específica de uma classe.
     * Existe apenas uma cópia de uma variável static, compartilhada por 
     * todas as instâncias da classe, enquanto cada instância da classe tem 
     * sua própria cópia de uma variável de instância.
     * 
     * 2 - Abstração: A abstração é um processo que envolve a definição de 
     * entidades do mundo real em termos de suas características e ações.
     * Ela ajuda a simplificar a complexidade ao esconder detalhes irrelevantes
     * e mostrar apenas as informações necessárias.
     * Encapsulamento: O encapsulamento é uma técnica usada para esconder os 
     * detalhes internos de uma classe e proteger os dados. Ele permite que 
     * você restrinja o acesso a alguns componentes de um objeto, tornando 
     * partes do sistema mais independentes possível3. Isso é feito tornando 
     * os atributos da classe privados e fornecendo métodos públicos 
     * (getters e setters) para acessar e modificar esses atributos.
     * Instância: Uma instância é uma realização específica de qualquer objeto, 
     * sendo criada a partir de uma classe. Por exemplo, se você tem uma classe 
     * chamada Carro, cada carro específico que você cria com base nessa classe
     * é uma instância da classe Carro.
     * 
     * Alguns tipos de dados primitivos: int, double, boolean, char.
     * 
     * 3 - a) Variáveis color e NAME
     * b) public Blue(int hue) { ... }
     * c) e d) - Implementado no arquivo Blue.java 
     * 
     * 4 - a) Before: 0 After: 1Flap Flap:0
     * Quando a instância de Nightingale é criada, o construtor incrementa 
     * referenceCount em 1. Por isso, “Before: 0 After: 1” é impresso. 
     * Em seguida, o método fly é chamado na instância florence. Como a variável 
     * de instância "a" não foi inicializada, ela tem o valor padrão, que é 0. 
     * Por isso, “Flap Flap:0” é impresso.
     * b) Será criada uma instância da variável referenceCount e 15 instâncias 
     * da variável a.
     * A variável referenceCount é uma variável static, o que significa que 
     * ela é compartilhada por todas as instâncias. Por outro lado, a é uma 
     * variável de instância, o que significa que cada instância de Bird ou 
     * Nightingale terá sua própria cópia de a.
     */
}
