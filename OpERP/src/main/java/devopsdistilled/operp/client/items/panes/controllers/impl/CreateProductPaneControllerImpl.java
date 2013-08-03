package devopsdistilled.operp.client.items.panes.controllers.impl;

import javax.inject.Inject;

import devopsdistilled.operp.client.items.exceptions.EntityNameExistsException;
import devopsdistilled.operp.client.items.exceptions.NullFieldException;
import devopsdistilled.operp.client.items.models.CategoryModel;
import devopsdistilled.operp.client.items.models.ProductModel;
import devopsdistilled.operp.client.items.panes.CreateProductPane;
import devopsdistilled.operp.client.items.panes.controllers.CreateProductPaneController;
import devopsdistilled.operp.client.items.panes.models.CreateProductPaneModel;
import devopsdistilled.operp.server.data.entity.items.Product;

public class CreateProductPaneControllerImpl implements
		CreateProductPaneController {

	@Inject
	private CreateProductPane view;

	@Inject
	private CreateProductPaneModel model;

	@Inject
	private CategoryModel categoryModel;

	@Inject
	private ProductModel productModel;

	@Override
	public void init() {
		view.init();
		model.registerObserver(view);
		categoryModel.registerObserver(view);
	}

	@Override
	public void validate(Product product) throws NullFieldException,
			EntityNameExistsException {

	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
