/* **********************************
CSC150
Assignment_3
Owen Manley
************************************/
	public class ExecutionTime {
	public static void main(String[] args)
	{
	
		int statementExecution = 10000;
		double instructionsPerStatement = 20.0;
		double hurtz = 2000000000.0;
		double instructionsPerCycle = 1.0;
		System.out.println(" Statement execution = " + statementExecution);
		System.out.println(" Instruction per statement = " + instructionsPerStatement);
		System.out.println(" Hurtz in megahurtz = " + hurtz/1000000);
		System.out.println(" Instructions per cycle = " + instructionsPerCycle);
		System.out.println(" Execution time = " + statementExecution * instructionsPerStatement/(hurtz * instructionsPerCycle));
		






}
}