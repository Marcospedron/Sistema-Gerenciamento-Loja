import com.sualoja.model.Produto;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
 Scanner ler = new Scanner(System.in);
int x;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
 do {
     System.out.println("========================================");
     System.out.println("       Sistema de Gerenciamento");
     System.out.println("========================================");

     System.out.println("1 - Gerenciar produtos");
     System.out.println("2 - Gerenciar clientes");
     System.out.println("3 - Realizar vendas ");
     System.out.println("4 - Consultar vendas");
     System.out.println("5 - Relatorios");
     System.out.println("6 - Salvar e carregar dados");
     System.out.println("0 - Encerrar o sistema");


     System.out.println("Escolha uma opcao: ");

     x = ler.nextInt();

     switch(x){
         case 1:
             int j;
             do {
                 System.out.println("Gerenciar produtos");
                 System.out.println("1 - Cadastrar produtos");
                 System.out.println("2 - Listar e Buscar produtos");
                 System.out.println("3 - Editar produtos");
                 System.out.println("4 - Adicionar produtos");
                 System.out.println("5 - Remover produtos");
                 System.out.println("0 - Sair");

                 System.out.println("Escolha uma opcao: ");

                 j = ler.nextInt();
                 ler.nextLine();

                 switch(j) {
                     case 1:
                         String n;
                         double p;
                         int q;
                         System.out.println("Cadastrar produtos");
                         System.out.println("Nome:");
                         n = ler.nextLine();
                         System.out.println("Preco");
                         do {
                             p = ler.nextDouble();
                             if(p<0) {
                                 System.out.println("Insira um valor valido");
                             }
                         }while(p<0);
                         System.out.println("Quantidade");
                         do {
                             q = ler.nextInt();
                             if(q<0) {
                                 System.out.println("Insira um valor valido");
                             }
                         }while(q<0);
                         Produto produto = new Produto(n, p, q);
                         produtos.add(produto);
                         break;
                     case 2:
                         System.out.println("Listar e Buscar produtos");
                         for(Produto prods: produtos) {
                             System.out.printf("Codigo: %d // Nome: %s // Preco: %.2f // Quantidade: %d%n",prods.getCodigo(), prods.getNome(), prods.getPreco(), prods.getQuantidade());
                         }
                         System.out.println("Buscar produto por nome ou codigo");
                         String busca = ler.nextLine();
                         if(busca.matches("\\d+")) {
                             int c = Integer.parseInt(busca);
                             for(Produto prods : produtos) {
                                if(prods.getCodigo() == c) {
                                    System.out.println(prods);
                                }
                             }
                         } else {
                             for (Produto prods : produtos) {
                                 if(prods.getNome().toLowerCase().replaceAll("\\s+", "").equals(busca.toLowerCase().replaceAll("\\s+", ""))) {
                                     System.out.println(prods);
                                 }
                             }

                         }
                         break;
                     case 3:
                         break;
                     case 4:
                         break;
                     case 5:
                         break;
                     case 6:
                         break;
                     default:
                         break;


                 }

             }while(j != 0);


         break;
         case 2:
         break;
         case 3:
         break;
         case 4:
         break;
         case 5:
         break;
         case 6:
         break;
         default:
         break;


     }



 } while (x != 0);



}
