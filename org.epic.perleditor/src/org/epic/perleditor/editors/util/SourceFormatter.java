package org.epic.perleditor.editors.util;


public class SourceFormatter {
	public String doConversion(String text) {
			String lineIn;
			int indent = 0;
			BufferedReader br = new BufferedReader(new StringReader(text));
			while ((lineIn = br.readLine()) != null) {
				//Handle POD comments
				lineIn = lineIn.trim();



				result += prefix + lineIn + "\n";
				// Handle HERE script
			}
		} catch (Exception ex) {
		return result;

	private int compareOccurrences(
		RE re;
		String[] doNotInspectBetween = { "\"", "'", "/", "~", "|" };
		try {
            // Delete comments
			// Remove backslash characters
			for (int i = 0; i < doNotInspectBetween.length; i++) {
			re = new RE(string1);
			re = new RE(string2);
			return matches1.length - matches2.length;
	}
	private String handleHereScript(String line, BufferedReader br) {
		String hereBlock = "";
		try {
			if (matches.length == 0) {
			int found = 0;
			while (found < matches.length
				if (content.equals(matches[found].toString(1))) {
			}
		} catch (Exception e) {
		return hereBlock;
	}
	private String handlePodComments(String line, BufferedReader br) {
		try {
			if (matches.length == 0) {
			podBlock = line + "\n";
			String content = "";
			while ((content = br.readLine()) != null) {
				if (content.equals("=cut")) {
			}
		} catch (Exception e) {
		return podBlock;
}