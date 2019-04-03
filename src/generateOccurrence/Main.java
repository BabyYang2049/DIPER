package generateOccurrence;


import java.util.List;

import domain.Occurrence;
import domain.Seed;


public class Main {
	
	public static void main(String[] args){
		Preprocessor preprocessor = new Preprocessor();
		//String pathSeed = "D:/PPPPPPPractice/small_pair.txt"; 
		//String pathSentence = "D:/PPPPPPPractice/sentences.txt";  //gbk
		String pathSentence = "D:/PPPPPPPractice/bbb.txt";  //gbk
		String pathSeed = "D:/PPPPPPPractice/aaa.txt"; //gbk
		//String pathSeed = "D:/PPPPPPPractice/big_pair.txt";//utf-8
		//String pathSentence = "D:/PPPPPPPractice/ckxx_jieba_seg.txt";//utf-8
		System.out.println("lll");
		List<Seed> seeds = preprocessor.spiltedSeeds(pathSeed);
		List<Occurrence> occurrence = preprocessor.spiltedSentences(pathSentence,seeds);
		preprocessor.findOccurrence(occurrence,seeds);
		
	}
}
