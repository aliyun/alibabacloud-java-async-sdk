// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.servicecatalog20210901.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<ApproveProvisionedProductPlanResponse> approveProvisionedProductPlan(ApproveProvisionedProductPlanRequest request);

    CompletableFuture<AssociatePrincipalWithPortfolioResponse> associatePrincipalWithPortfolio(AssociatePrincipalWithPortfolioRequest request);

    CompletableFuture<AssociateProductWithPortfolioResponse> associateProductWithPortfolio(AssociateProductWithPortfolioRequest request);

    CompletableFuture<AssociateTagOptionWithResourceResponse> associateTagOptionWithResource(AssociateTagOptionWithResourceRequest request);

    CompletableFuture<CancelProvisionedProductPlanResponse> cancelProvisionedProductPlan(CancelProvisionedProductPlanRequest request);

    CompletableFuture<CopyProductResponse> copyProduct(CopyProductRequest request);

    CompletableFuture<CreateConstraintResponse> createConstraint(CreateConstraintRequest request);

    CompletableFuture<CreatePortfolioResponse> createPortfolio(CreatePortfolioRequest request);

    /**
      * Before you call the CreateProduct operation, you must call the [CreateTemplate](~~CreateTemplate~~) operation to create a template.
      *
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
      * Before you call the CreateProductVersion operation, you must call the [CreateTemplate](~~CreateTemplate~~) operation to create a template.
      *
     */
    CompletableFuture<CreateProductVersionResponse> createProductVersion(CreateProductVersionRequest request);

    CompletableFuture<CreateProvisionedProductPlanResponse> createProvisionedProductPlan(CreateProvisionedProductPlanRequest request);

    CompletableFuture<CreateTagOptionResponse> createTagOption(CreateTagOptionRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<DeleteConstraintResponse> deleteConstraint(DeleteConstraintRequest request);

    CompletableFuture<DeletePortfolioResponse> deletePortfolio(DeletePortfolioRequest request);

    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    CompletableFuture<DeleteProductVersionResponse> deleteProductVersion(DeleteProductVersionRequest request);

    CompletableFuture<DeleteProvisionedProductPlanResponse> deleteProvisionedProductPlan(DeleteProvisionedProductPlanRequest request);

    CompletableFuture<DeleteTagOptionResponse> deleteTagOption(DeleteTagOptionRequest request);

    CompletableFuture<DisAssociateTagOptionFromResourceResponse> disAssociateTagOptionFromResource(DisAssociateTagOptionFromResourceRequest request);

    CompletableFuture<DisassociatePrincipalFromPortfolioResponse> disassociatePrincipalFromPortfolio(DisassociatePrincipalFromPortfolioRequest request);

    CompletableFuture<DisassociateProductFromPortfolioResponse> disassociateProductFromPortfolio(DisassociateProductFromPortfolioRequest request);

    CompletableFuture<ExecuteProvisionedProductPlanResponse> executeProvisionedProductPlan(ExecuteProvisionedProductPlanRequest request);

    CompletableFuture<GetConstraintResponse> getConstraint(GetConstraintRequest request);

    CompletableFuture<GetPortfolioResponse> getPortfolio(GetPortfolioRequest request);

    CompletableFuture<GetProductAsAdminResponse> getProductAsAdmin(GetProductAsAdminRequest request);

    /**
      * Make sure that you are granted the permissions to manage relevant products as a user by an administrator. For more information, see [Manage access permissions](~~405233~~).
      *
     */
    CompletableFuture<GetProductAsEndUserResponse> getProductAsEndUser(GetProductAsEndUserRequest request);

    CompletableFuture<GetProductVersionResponse> getProductVersion(GetProductVersionRequest request);

    CompletableFuture<GetProvisionedProductResponse> getProvisionedProduct(GetProvisionedProductRequest request);

    CompletableFuture<GetProvisionedProductPlanResponse> getProvisionedProductPlan(GetProvisionedProductPlanRequest request);

    CompletableFuture<GetTagOptionResponse> getTagOption(GetTagOptionRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<LaunchProductResponse> launchProduct(LaunchProductRequest request);

    CompletableFuture<ListLaunchOptionsResponse> listLaunchOptions(ListLaunchOptionsRequest request);

    CompletableFuture<ListPortfoliosResponse> listPortfolios(ListPortfoliosRequest request);

    CompletableFuture<ListPrincipalsResponse> listPrincipals(ListPrincipalsRequest request);

    CompletableFuture<ListProductVersionsResponse> listProductVersions(ListProductVersionsRequest request);

    CompletableFuture<ListProductsAsAdminResponse> listProductsAsAdmin(ListProductsAsAdminRequest request);

    /**
      * Make sure that you are granted the permissions to manage relevant products as a user by an administrator. For more information, see [Manage access permissions](~~405233~~).
      *
     */
    CompletableFuture<ListProductsAsEndUserResponse> listProductsAsEndUser(ListProductsAsEndUserRequest request);

    CompletableFuture<ListProvisionedProductPlanApproversResponse> listProvisionedProductPlanApprovers(ListProvisionedProductPlanApproversRequest request);

    CompletableFuture<ListProvisionedProductPlansResponse> listProvisionedProductPlans(ListProvisionedProductPlansRequest request);

    CompletableFuture<ListProvisionedProductsResponse> listProvisionedProducts(ListProvisionedProductsRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListResourcesForTagOptionResponse> listResourcesForTagOption(ListResourcesForTagOptionRequest request);

    CompletableFuture<ListTagOptionsResponse> listTagOptions(ListTagOptionsRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
      * After a product instance is terminated, the product instance is deleted from the product instance list. End users cannot manage the product instance throughout its lifecycle. Proceed with caution.
      *
     */
    CompletableFuture<TerminateProvisionedProductResponse> terminateProvisionedProduct(TerminateProvisionedProductRequest request);

    CompletableFuture<UpdateConstraintResponse> updateConstraint(UpdateConstraintRequest request);

    CompletableFuture<UpdatePortfolioResponse> updatePortfolio(UpdatePortfolioRequest request);

    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    CompletableFuture<UpdateProductVersionResponse> updateProductVersion(UpdateProductVersionRequest request);

    CompletableFuture<UpdateProvisionedProductResponse> updateProvisionedProduct(UpdateProvisionedProductRequest request);

    CompletableFuture<UpdateProvisionedProductPlanResponse> updateProvisionedProductPlan(UpdateProvisionedProductPlanRequest request);

    CompletableFuture<UpdateTagOptionResponse> updateTagOption(UpdateTagOptionRequest request);

}
