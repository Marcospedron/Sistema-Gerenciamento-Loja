import com.sualoja.model.ItemVenda;
import com.sualoja.model.Produto;
import com.sualoja.model.Cliente;
import com.sualoja.model.Venda;
import com.sualoja.service.GerenciadorClientes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
 Scanner ler = new Scanner(System.in);
int x;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    GerenciadorClientes gerenciadorClientes = new GerenciadorClientes();
    Venda venda = null;
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
     ler.nextLine();
     switch(x){
         case 1:
             int j;
             do {
                 System.out.println("Gerenciar produtos");
                 System.out.println("1 - Cadastrar produtos");
                 System.out.println("2 - Listar e Buscar produtos");
                 System.out.println("3 - Editar produtos");
                 System.out.println("4 - Adicionar unidades ao estoque");
                 System.out.println("5 - Remover unidades do estoque");
                 System.out.println("6 - Excluir produto");
                 System.out.println("0 - Sair");

                 System.out.println("Escolha uma opcao: ");

                 j = ler.nextInt();
                 ler.nextLine();

                 switch (j) {
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
                             if (p < 0) {
                                 System.out.println("Insira um valor valido");
                             }
                         } while (p < 0);
                         System.out.println("Quantidade");
                         do {
                             q = ler.nextInt();
                             if (q < 0) {
                                 System.out.println("Insira um valor valido");
                             }
                         } while (q < 0);

                         boolean existe = false;
                         for (Produto prods : produtos) {
                             if (prods.getNome().toLowerCase().replaceAll("\\s+", "").equals(n.toLowerCase().replaceAll("\\s+", ""))) {
                                 System.out.println("Ja existe um produto com esse nome");
                                 existe = true;
                                break;
                             }

                         }
                         if(!existe) {
                             Produto produto = new Produto(n, p, q);
                             produtos.add(produto);
                             System.out.println("Produto criado com sucesso");

                         }
                         break;

                     case 2:
                         System.out.println("Listar e Buscar produtos");
                         for(Produto prods: produtos) {
                             System.out.printf("Codigo: %d // Nome: %s // Preco: %.2f // Quantidade: %d%n",prods.getCodigo(), prods.getNome(), prods.getPreco(), prods.getQuantidade());
                         }
                         System.out.println("Buscar produto por nome ou codigo");
                         String busca = ler.nextLine();
                         boolean achou = false;
                         if(busca.matches("\\d+")) {
                             int c = Integer.parseInt(busca);
                             for(Produto prods : produtos) {
                                if(prods.getCodigo() == c) {
                                    System.out.println(prods);
                                    achou = true;
                                }
                             }
                         } else {
                             for (Produto prods : produtos) {
                                 if(prods.getNome().toLowerCase().replaceAll("\\s+", "").equals(busca.toLowerCase().replaceAll("\\s+", ""))) {
                                     System.out.println(prods);
                                     achou = true;
                                 }
                             }

                         }

                         if(!achou) {
                             System.out.println("Produto nao encontrado");
                         }
                         break;
                     case 3:
                         System.out.println(" Editar produtos");
                         System.out.println(" Insira o nome ou codigo do produto a ser editado: ");
                         String buscaEditar = ler.nextLine();
                         boolean achouEdit = false;
                         if(buscaEditar.matches("\\d+")) {
                             int cEditor = Integer.parseInt(buscaEditar);
                             for(Produto prods : produtos) {
                                 if(prods.getCodigo() == cEditor) {
                                     System.out.println(prods);
                                     System.out.println(" Insira os novos valores para o produto");
                                     String n1;
                                     double p1;
                                     int q1;
                                     System.out.println("Nome: ");
                                     n1 = ler.nextLine();
                                     System.out.println("Preco: ");
                                     p1 = ler.nextDouble();
                                     System.out.println("Quantidade: ");
                                     q1 = ler.nextInt();


                                     boolean existeEdit = false;
                                     for (Produto prodts : produtos) {
                                         if (prodts.getNome().toLowerCase().replaceAll("\\s+", "").equals(n1.toLowerCase().replaceAll("\\s+", ""))) {
                                             System.out.println("Ja existe um produto com esse nome");
                                             existeEdit = true;
                                             achouEdit = true;
                                             break;
                                         }

                                     }
                                     if(!existeEdit) {
                                         prods.setNome(n1);
                                         prods.setPreco(p1);
                                         prods.setQuantidade(q1);
                                         System.out.println("Produto editado com sucesso");
                                         achouEdit = true;
                                     }
                                 }
                             }
                         } else {
                             for (Produto prods : produtos) {
                                 if (prods.getNome().toLowerCase().replaceAll("\\s+", "").equals(buscaEditar.toLowerCase().replaceAll("\\s+", ""))) {
                                     System.out.println(prods);
                                     System.out.println(" Insira os novos valores para o produto");
                                     String n1;
                                     double p1;
                                     int q1;
                                     System.out.println("Nome: ");
                                     n1 = ler.nextLine();
                                     System.out.println("Preco: ");
                                     p1 = ler.nextDouble();
                                     System.out.println("Quantidade: ");
                                     q1 = ler.nextInt();
                                     prods.setNome(n1);
                                     prods.setPreco(p1);
                                     prods.setQuantidade(q1);
                                     System.out.println("Produto editado com sucesso");
                                     achouEdit = true;
                                 }
                             }
                         }

                         if(!achouEdit) {
                             System.out.println("Produto nao encontrado");
                         }
                         break;
                     case 4:
                         System.out.println(" Adicionar unidades ao estoque");
                         System.out.println(" Insira o nome ou codigo do produto para adicionar unidades ao estoque: ");

                         String buscaAdd = ler.nextLine();
                         boolean achouAddUn = false;

                         if(buscaAdd.matches("\\d+")) {
                             int cEditor = Integer.parseInt(buscaAdd);
                             for(Produto prods : produtos) {
                                 if(prods.getCodigo() == cEditor) {
                                     System.out.println(prods);
                                     System.out.println(" Insira quantas unidades quer adicionar");

                                     int q1;
                                     System.out.println("Quantidade: ");
                                     do {

                                         q1 = ler.nextInt();

                                         if(q1 <= 0) {
                                             System.out.println("Insira um valor valido");
                                         }
                                     } while(q1 <= 0);
                                     prods.adicionarUnidadesEstoque(q1);
                                     achouAddUn = true;
                                 }
                             }
                         } else {
                             for (Produto prods : produtos) {
                                 if (prods.getNome().toLowerCase().replaceAll("\\s+", "").equals(buscaAdd.toLowerCase().replaceAll("\\s+", ""))) {
                                     System.out.println(prods);
                                     System.out.println(" Insira quantas unidades quer adicionar");

                                     int q1;
                                     System.out.println("Quantidade: ");
                                     do {


                                         q1 = ler.nextInt();
                                         if(q1 <= 0) {
                                             System.out.println("Insira um valor valido");
                                         }
                                     } while(q1 <= 0);
                                     prods.adicionarUnidadesEstoque(q1);
                                     achouAddUn = true;

                                 }
                             }
                         }
                         if(!achouAddUn) {
                             System.out.println("Produto nao econtrado");
                         }
                         break;
                     case 5:
                         System.out.println(" Remover unidades do estoque");
                         System.out.println(" Insira o nome ou codigo do produto para adicionar unidades ao estoque: ");

                         String buscaRemove = ler.nextLine();
                         boolean achouAddRem = false;


                         if(buscaRemove.matches("\\d+")) {
                             int cEditor = Integer.parseInt(buscaRemove);
                             for(Produto prods : produtos) {
                                 if(prods.getCodigo() == cEditor) {
                                     System.out.println(prods);
                                     System.out.println(" Insira quantas unidades quer remover");

                                     int q1;
                                     System.out.println("Quantidade: ");
                                     do {

                                         q1 = ler.nextInt();

                                         if(q1 <= 0) {
                                             System.out.println("Insira um valor valido");
                                         }
                                     } while(q1 <= 0);
                                    if( prods.removerUnidadesEstoque(q1)) {
                                        System.out.println("Unidades removidas com sucesso");
                                        achouAddRem = true;
                                    } else {
                                        System.out.println("Nao foi possivel remover as unidades");

                                    }
                                 }
                             }
                         } else {
                             for (Produto prods : produtos) {
                                 if (prods.getNome().toLowerCase().replaceAll("\\s+", "").equals(buscaRemove.toLowerCase().replaceAll("\\s+", ""))) {
                                     System.out.println(prods);
                                     System.out.println(" Insira quantas unidades quer remover");

                                     int q1;
                                     System.out.println("Quantidade: ");
                                     do {

                                         q1 = ler.nextInt();

                                         if (q1 <= 0) {
                                             System.out.println("Insira um valor valido");
                                         }
                                     } while (q1 <= 0);
                                     if (prods.removerUnidadesEstoque(q1)) {
                                         System.out.println("Unidades removidas com sucesso");
                                         achouAddRem = true;
                                     } else {
                                         System.out.println("Nao foi possivel remover as unidades");
                                     }
                                 }
                             }
                         }
                         if(!achouAddRem) {
                             System.out.println("Produto nao encontrado");
                         }
                         break;
                     case 6:
                         System.out.println("Excluir produto");
                         System.out.println("Insira o codigo do produto a ser excluido");

                         String buscaExcluir = ler.nextLine();
                         boolean achouExc = false;

                         if(buscaExcluir.matches("\\d+")) {
                             int cEditor = Integer.parseInt(buscaExcluir);
                             if(produtos.removeIf(prods -> prods.getCodigo() == cEditor)) {
                                 System.out.println("Produto Excluido com sucesso");
                                 achouExc = true;
                             }

                         }
                        if(!achouExc) {
                            System.out.println("Produto nao encontrado");
                        }

                         break;
                     default:
                         break;


                 }

             }while(j != 0);


         break;
         case 2:
             int k;
             do {

                 System.out.println("Gerenciar clientes");
                 System.out.println("1 - Cadastrar clientes");
                 System.out.println("2 - Listar clientes");
                 System.out.println("3 - Buscar clientes");
                 System.out.println("4 - Editar clientes");
                 System.out.println("5 - Remover clientes");
                 System.out.println("0 - Sair");

                 System.out.println("Escolha uma opcao: ");
                 k = ler.nextInt();
                 ler.nextLine();

                 switch (k) {
                     case 1:

                         System.out.println("Cadastrar clientes");
                         System.out.println("Nome:");
                         String n1 = ler.nextLine();
                         System.out.println("Contato(Numero de Telefone) ");
                         String c1;
                         do {
                             c1 = ler.nextLine();

                             if(!c1.matches("^\\(?[1-9]{2}\\)? ?(?:9\\d{4}|[2-5]\\d{3})-?\\d{4}$")) {
                                 System.out.println("Telefone no formato errado");
                             }
                         } while (!c1.matches("^\\(?[1-9]{2}\\)? ?(?:9\\d{4}|[2-5]\\d{3})-?\\d{4}$"));

                         Cliente cliente = new Cliente(n1, c1);
                         gerenciadorClientes.addList(cliente);
                         System.out.println("Cliente cadastrado com sucesso");
                         break;
                     case 2:
                         System.out.println("Listar clientes");
                         gerenciadorClientes.listarClientes();
                         break;
                     case 3:
                         System.out.println("Buscar clientes");
                         System.out.println("Insira o nome ou codigo do cliente desejado: ");

                         String n2 = ler.nextLine();
                         if(gerenciadorClientes.buscarCliente(n2)) {

                         } else {
                             System.out.println("Cliente nao encontrado");
                         }
                         break;
                     case 4:
                         System.out.println(" Editar clientes");
                         System.out.println("Insira o codigo do cliente que voce quer editar: ");
                         String codEdit = ler.nextLine();
                         int codigo = Integer.parseInt(codEdit);
                         Cliente cll = gerenciadorClientes.buscarClientePorCodigo(codigo);

                         if (cll != null) {
                             System.out.println("Insira os novos dados");

                             System.out.println("Nome:");
                             String n3 = ler.nextLine();

                             System.out.println("Contato:");
                             String c2 = ler.nextLine();

                             cll.setNome(n3);
                             cll.setContato(c2);

                             System.out.println("Cliente editado com sucesso!");
                         } else {
                             System.out.println("Cliente não encontrado!");
                         }



                         break;
                     case 5:
                         System.out.println(" Remover clientes");

                         System.out.println("Digite o código do cliente que quer excluir:");
                         String codRemover = ler.nextLine();

                         if (codRemover.matches("\\d+")) {
                             int codRem = Integer.parseInt(codRemover);

                             if (gerenciadorClientes.removerCliente(codRem)) {
                                 System.out.println("Cliente removido com sucesso!");
                             } else {
                                 System.out.println("Cliente não encontrado!");
                             }
                         } else {
                             System.out.println("Código inválido!");
                         }




                         break;





                 }
             }while (k != 0);
         break;
         case 3:
             System.out.println("Realizar vendas ");
             gerenciadorClientes.listarClientes();
             System.out.println("Insira o codigo do cliente:  ");
             String buscaV = ler.nextLine();
             int bv = Integer.parseInt(buscaV);
            gerenciadorClientes.buscarCliente(buscaV);
              venda = new Venda(gerenciadorClientes.buscarClientePorCodigo(bv));


             for(Produto prods: produtos) {
                 System.out.printf("Codigo: %d // Nome: %s // Preco: %.2f // Quantidade: %d%n",prods.getCodigo(), prods.getNome(), prods.getPreco(), prods.getQuantidade());
             }
             int nn;

             do {
                 System.out.println("Insira o codigo do produto a ser adicionado a venda ");
                 int codVenda = ler.nextInt();
                 System.out.println("Insira a quantidade  do produto a ser adicionado a venda ");
                 int qtdV = ler.nextInt();
                 for(Produto prods : produtos) {
                     if(prods.getCodigo() == codVenda) {
                         ItemVenda itemvenda = new ItemVenda(qtdV, prods);
                         venda.addListIV(itemvenda);
                     }
                 }

                 System.out.printf("Deseja adicionar mais produtosa?%n  " +
                         "1 - SIM %n" +
                         "0 - NAO%n");

                 nn = ler.nextInt();
             }while(nn != 0);

             venda.mostrarVendas();

             break;
         case 4:
             System.out.println("Consultar vendas");
             if(venda != null)
             {
                 venda.mostrarVendas();

                 System.out.println("Quer procurar uma venda especifica? 1- SIM ; 0 - NAO");

                 int nv = ler.nextInt();

                 if(nv == 1) {
                     System.out.println("Insira o codigo da  venda");

                     int l = ler.nextInt();
                     venda.procurarVenda(l);

                 } else {
                     break;
                 }


             } else{
                 System.out.println("Nenhuma venda realizada");
             }


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
