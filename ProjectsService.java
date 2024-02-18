package projects.service;

import projects.dao.ProjectsDao;
import projects.entity.Project;
import projects.exception.dbException;


public class ProjectsService {
	
	private ProjectsDao projectsDao = new ProjectsDao();
	
	public Project addProject(Project project) {
		return projectsDao.insertProject(project);
			
	}

}
