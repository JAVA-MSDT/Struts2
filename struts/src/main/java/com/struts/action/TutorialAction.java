package com.struts.action;

import com.opensymphony.xwork2.Action;
import com.struts.model.service.TutorialFinderService;

public class TutorialAction implements Action {

	private TutorialFinderService tutorialFinderService = new TutorialFinderService();

	private String bestTutorialSite;
	private String language;

	@Override
	public String execute() {
		System.out.println("Language: " + language);
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite(language));

		return Action.SUCCESS;
	}

	public TutorialFinderService getTutorialFinderService() {
		return tutorialFinderService;
	}

	public void setTutorialFinderService(final TutorialFinderService tutorialFinderService) {
		this.tutorialFinderService = tutorialFinderService;
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(final String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(final String language) {
		this.language = language;
	}

}
