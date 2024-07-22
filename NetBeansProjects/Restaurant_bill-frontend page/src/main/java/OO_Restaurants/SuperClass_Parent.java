/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO_Restaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author ZShkh
 */
public class SuperClass_Parent 
{
    public double Filet_o_Fish;
    public double ChickenBurger;
    public double ChickenLegend;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    
    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
        Meals = Filet_o_Fish + ChickenBurger + ChickenLegend + ChickenBurgerM + BaconCheeseBurger;
        Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    private JFrame frame;
    
    public void iExitSystem()
    {
        frame = new JFrame("EXit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Restaurant Managment System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }
    //==================================price================================
    
     public double pFilet_o_Fish=300;
    public double pChickenBurger=250;
    public double pChickenLegend=350;
    public double pChickenBurgerM=299;
    public double pBaconCheeseBurger=300;
    
    public double pMilkShake=210;
    public double pVanillaCone=220;
    public double pClasVanilla=250;
    public double pVanMilkShake=96;
    public double pChocMilkShake=69;
    //==========================================================================

  public double mcTax=0.90;
  
  public Double  cFindTax(double cAmount){
      double FindTax = cAmount- (cAmount *mcTax);
  return FindTax;
  }
//==============================================================================
}
