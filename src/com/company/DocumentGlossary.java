package com.company;

import java.util.ArrayList;



public class DocumentGlossary extends ArrayList<GlossaryEntry> {

	public DocumentGlossary()
	{
		super();
	}

	public DocumentGlossary(int len)
	{
		super(len);
	}

	private int foundOrInserted(String word)
	{
		int last = size();
		for(int i = 0; i<last; i++)
		{
			// word is already in arraylist
			String w = get(i).getWord();
			if(w.equalsIgnoreCase(word))
			{
				return i;
			}
			// found the spot to put it
			// >0 means that w is after the word we are looking for alphabetically
			else if (w.compareToIgnoreCase(word)>0)
			{
				GlossaryEntry ie = new GlossaryEntry(word);
				add(i, ie);
				return i;
			}

		}
		//add it to the end
		GlossaryEntry ie = new GlossaryEntry(word);
		add(last, ie);
		return last;
	}

	public void addWord(String word, int num)
	{
		// find the word if it is already in the list or add it
		int index = foundOrInserted(word);
		get(index).add(num);

	}

	public void addAllWords(String str, int num)
	{
		if(!str.equals("")) {
			String [] arrOfStrings = str.split("\\W+");

			for(String s: arrOfStrings)
			{
				//if(!s.isEmpty())
				//{
				addWord(s, num);
				//}
			}}
//		for(String word: str.split("\\X-")) {
//			if(!word.equals("")) addWord(word, num);
//		}
	}

}
