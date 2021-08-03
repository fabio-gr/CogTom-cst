package memory.working;

import java.util.ArrayList;

/*
* Class to encapsulate the Shared Attention data on Working Memory.
*/
public class ToMSharedAttention {
      
   private ArrayList<String> agents;
   private String object;

   public ToMSharedAttention(ArrayList<String> aAgents, String aObject) {
      agents = aAgents;
      object = aObject;
   }

   /*
   Setters and Getters
   */
   public void setAgents(ArrayList<String> aAgents) {
         agents = aAgents;
   }

   public ArrayList<String> agents() {
      return agents;
   }

   public void setObject(String aObject) {
         object = aObject;
   }

   public String object() {
      return object;
   } 
}
