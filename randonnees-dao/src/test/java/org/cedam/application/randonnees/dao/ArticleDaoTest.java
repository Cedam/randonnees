package org.cedam.application.randonnees.dao;

import java.util.List;

import org.cedam.application.randonnees.dao.config.AppConfig;
import org.cedam.application.randonnees.entity.Article;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@SpringBootTest
@Ignore
public class ArticleDaoTest {

	@Autowired
	private ArticleDao object;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Transactional
	public void testListArticles() {
		List<Article> listArticles = object.listArticles();
		Assert.assertNotNull(listArticles);
	}

	@Test
	@Transactional
	public void testAdd() {
		int numberBefore = object.listArticles().size();
		Article articleA = new Article();
		articleA.setName("testA");

		object.insert(articleA);

		Assert.assertTrue(++numberBefore == object.listArticles().size());
	}

	@Test
	@Transactional
	public void testGetById() {
		List<Article> listeArticles = object.listArticles();
		Article article = object.getById(listeArticles.get(0).getId());
		Assert.assertNotNull(article);
		Assert.assertEquals(listeArticles.get(0).getId(), article.getId());

		Article article2 = object.getById(listeArticles.get(0).getId() + 1);
		Assert.assertNotNull(article2);
		Assert.assertNotEquals(listeArticles.get(0).getId(), article2.getId());
	}

}
