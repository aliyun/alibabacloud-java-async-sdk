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

    /**
     * @param request the request parameters of ApproveProvisionedProductPlan  ApproveProvisionedProductPlanRequest
     * @return ApproveProvisionedProductPlanResponse
     */
    CompletableFuture<ApproveProvisionedProductPlanResponse> approveProvisionedProductPlan(ApproveProvisionedProductPlanRequest request);

    /**
     * @param request the request parameters of AssociatePrincipalWithPortfolio  AssociatePrincipalWithPortfolioRequest
     * @return AssociatePrincipalWithPortfolioResponse
     */
    CompletableFuture<AssociatePrincipalWithPortfolioResponse> associatePrincipalWithPortfolio(AssociatePrincipalWithPortfolioRequest request);

    /**
     * @param request the request parameters of AssociateProductWithPortfolio  AssociateProductWithPortfolioRequest
     * @return AssociateProductWithPortfolioResponse
     */
    CompletableFuture<AssociateProductWithPortfolioResponse> associateProductWithPortfolio(AssociateProductWithPortfolioRequest request);

    /**
     * @param request the request parameters of AssociateTagOptionWithResource  AssociateTagOptionWithResourceRequest
     * @return AssociateTagOptionWithResourceResponse
     */
    CompletableFuture<AssociateTagOptionWithResourceResponse> associateTagOptionWithResource(AssociateTagOptionWithResourceRequest request);

    /**
     * @param request the request parameters of CancelProvisionedProductPlan  CancelProvisionedProductPlanRequest
     * @return CancelProvisionedProductPlanResponse
     */
    CompletableFuture<CancelProvisionedProductPlanResponse> cancelProvisionedProductPlan(CancelProvisionedProductPlanRequest request);

    /**
     * @param request the request parameters of CopyProduct  CopyProductRequest
     * @return CopyProductResponse
     */
    CompletableFuture<CopyProductResponse> copyProduct(CopyProductRequest request);

    /**
     * @param request the request parameters of CreateConstraint  CreateConstraintRequest
     * @return CreateConstraintResponse
     */
    CompletableFuture<CreateConstraintResponse> createConstraint(CreateConstraintRequest request);

    /**
     * @param request the request parameters of CreatePortfolio  CreatePortfolioRequest
     * @return CreatePortfolioResponse
     */
    CompletableFuture<CreatePortfolioResponse> createPortfolio(CreatePortfolioRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the CreateProduct operation, you must call the <a href="~~CreateTemplate~~">CreateTemplate</a> operation to create a template.</p>
     * 
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the CreateProductVersion operation, you must call the <a href="~~CreateTemplate~~">CreateTemplate</a> operation to create a template.</p>
     * 
     * @param request the request parameters of CreateProductVersion  CreateProductVersionRequest
     * @return CreateProductVersionResponse
     */
    CompletableFuture<CreateProductVersionResponse> createProductVersion(CreateProductVersionRequest request);

    /**
     * @param request the request parameters of CreateProvisionedProductPlan  CreateProvisionedProductPlanRequest
     * @return CreateProvisionedProductPlanResponse
     */
    CompletableFuture<CreateProvisionedProductPlanResponse> createProvisionedProductPlan(CreateProvisionedProductPlanRequest request);

    /**
     * @param request the request parameters of CreateTagOption  CreateTagOptionRequest
     * @return CreateTagOptionResponse
     */
    CompletableFuture<CreateTagOptionResponse> createTagOption(CreateTagOptionRequest request);

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of DeleteConstraint  DeleteConstraintRequest
     * @return DeleteConstraintResponse
     */
    CompletableFuture<DeleteConstraintResponse> deleteConstraint(DeleteConstraintRequest request);

    /**
     * @param request the request parameters of DeletePortfolio  DeletePortfolioRequest
     * @return DeletePortfolioResponse
     */
    CompletableFuture<DeletePortfolioResponse> deletePortfolio(DeletePortfolioRequest request);

    /**
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    /**
     * @param request the request parameters of DeleteProductVersion  DeleteProductVersionRequest
     * @return DeleteProductVersionResponse
     */
    CompletableFuture<DeleteProductVersionResponse> deleteProductVersion(DeleteProductVersionRequest request);

    /**
     * @param request the request parameters of DeleteProvisionedProductPlan  DeleteProvisionedProductPlanRequest
     * @return DeleteProvisionedProductPlanResponse
     */
    CompletableFuture<DeleteProvisionedProductPlanResponse> deleteProvisionedProductPlan(DeleteProvisionedProductPlanRequest request);

    /**
     * @param request the request parameters of DeleteTagOption  DeleteTagOptionRequest
     * @return DeleteTagOptionResponse
     */
    CompletableFuture<DeleteTagOptionResponse> deleteTagOption(DeleteTagOptionRequest request);

    /**
     * @param request the request parameters of DisAssociateTagOptionFromResource  DisAssociateTagOptionFromResourceRequest
     * @return DisAssociateTagOptionFromResourceResponse
     */
    CompletableFuture<DisAssociateTagOptionFromResourceResponse> disAssociateTagOptionFromResource(DisAssociateTagOptionFromResourceRequest request);

    /**
     * @param request the request parameters of DisassociatePrincipalFromPortfolio  DisassociatePrincipalFromPortfolioRequest
     * @return DisassociatePrincipalFromPortfolioResponse
     */
    CompletableFuture<DisassociatePrincipalFromPortfolioResponse> disassociatePrincipalFromPortfolio(DisassociatePrincipalFromPortfolioRequest request);

    /**
     * @param request the request parameters of DisassociateProductFromPortfolio  DisassociateProductFromPortfolioRequest
     * @return DisassociateProductFromPortfolioResponse
     */
    CompletableFuture<DisassociateProductFromPortfolioResponse> disassociateProductFromPortfolio(DisassociateProductFromPortfolioRequest request);

    /**
     * @param request the request parameters of ExecuteProvisionedProductPlan  ExecuteProvisionedProductPlanRequest
     * @return ExecuteProvisionedProductPlanResponse
     */
    CompletableFuture<ExecuteProvisionedProductPlanResponse> executeProvisionedProductPlan(ExecuteProvisionedProductPlanRequest request);

    /**
     * @param request the request parameters of GetConstraint  GetConstraintRequest
     * @return GetConstraintResponse
     */
    CompletableFuture<GetConstraintResponse> getConstraint(GetConstraintRequest request);

    /**
     * @param request the request parameters of GetPortfolio  GetPortfolioRequest
     * @return GetPortfolioResponse
     */
    CompletableFuture<GetPortfolioResponse> getPortfolio(GetPortfolioRequest request);

    /**
     * @param request the request parameters of GetProductAsAdmin  GetProductAsAdminRequest
     * @return GetProductAsAdminResponse
     */
    CompletableFuture<GetProductAsAdminResponse> getProductAsAdmin(GetProductAsAdminRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you are granted the permissions to manage relevant products as a user by an administrator. For more information, see <a href="https://help.aliyun.com/document_detail/405233.html">Manage access permissions</a>.</p>
     * 
     * @param request the request parameters of GetProductAsEndUser  GetProductAsEndUserRequest
     * @return GetProductAsEndUserResponse
     */
    CompletableFuture<GetProductAsEndUserResponse> getProductAsEndUser(GetProductAsEndUserRequest request);

    /**
     * @param request the request parameters of GetProductVersion  GetProductVersionRequest
     * @return GetProductVersionResponse
     */
    CompletableFuture<GetProductVersionResponse> getProductVersion(GetProductVersionRequest request);

    /**
     * @param request the request parameters of GetProvisionedProduct  GetProvisionedProductRequest
     * @return GetProvisionedProductResponse
     */
    CompletableFuture<GetProvisionedProductResponse> getProvisionedProduct(GetProvisionedProductRequest request);

    /**
     * @param request the request parameters of GetProvisionedProductPlan  GetProvisionedProductPlanRequest
     * @return GetProvisionedProductPlanResponse
     */
    CompletableFuture<GetProvisionedProductPlanResponse> getProvisionedProductPlan(GetProvisionedProductPlanRequest request);

    /**
     * @param request the request parameters of GetTagOption  GetTagOptionRequest
     * @return GetTagOptionResponse
     */
    CompletableFuture<GetTagOptionResponse> getTagOption(GetTagOptionRequest request);

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of LaunchProduct  LaunchProductRequest
     * @return LaunchProductResponse
     */
    CompletableFuture<LaunchProductResponse> launchProduct(LaunchProductRequest request);

    /**
     * @param request the request parameters of ListLaunchOptions  ListLaunchOptionsRequest
     * @return ListLaunchOptionsResponse
     */
    CompletableFuture<ListLaunchOptionsResponse> listLaunchOptions(ListLaunchOptionsRequest request);

    /**
     * @param request the request parameters of ListPortfolios  ListPortfoliosRequest
     * @return ListPortfoliosResponse
     */
    CompletableFuture<ListPortfoliosResponse> listPortfolios(ListPortfoliosRequest request);

    /**
     * @param request the request parameters of ListPrincipals  ListPrincipalsRequest
     * @return ListPrincipalsResponse
     */
    CompletableFuture<ListPrincipalsResponse> listPrincipals(ListPrincipalsRequest request);

    /**
     * @param request the request parameters of ListProductVersions  ListProductVersionsRequest
     * @return ListProductVersionsResponse
     */
    CompletableFuture<ListProductVersionsResponse> listProductVersions(ListProductVersionsRequest request);

    /**
     * @param request the request parameters of ListProductsAsAdmin  ListProductsAsAdminRequest
     * @return ListProductsAsAdminResponse
     */
    CompletableFuture<ListProductsAsAdminResponse> listProductsAsAdmin(ListProductsAsAdminRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you are granted the permissions to manage relevant products as a user by an administrator. For more information, see <a href="https://help.aliyun.com/document_detail/405233.html">Manage access permissions</a>.</p>
     * 
     * @param request the request parameters of ListProductsAsEndUser  ListProductsAsEndUserRequest
     * @return ListProductsAsEndUserResponse
     */
    CompletableFuture<ListProductsAsEndUserResponse> listProductsAsEndUser(ListProductsAsEndUserRequest request);

    /**
     * @param request the request parameters of ListProvisionedProductPlanApprovers  ListProvisionedProductPlanApproversRequest
     * @return ListProvisionedProductPlanApproversResponse
     */
    CompletableFuture<ListProvisionedProductPlanApproversResponse> listProvisionedProductPlanApprovers(ListProvisionedProductPlanApproversRequest request);

    /**
     * @param request the request parameters of ListProvisionedProductPlans  ListProvisionedProductPlansRequest
     * @return ListProvisionedProductPlansResponse
     */
    CompletableFuture<ListProvisionedProductPlansResponse> listProvisionedProductPlans(ListProvisionedProductPlansRequest request);

    /**
     * @param request the request parameters of ListProvisionedProducts  ListProvisionedProductsRequest
     * @return ListProvisionedProductsResponse
     */
    CompletableFuture<ListProvisionedProductsResponse> listProvisionedProducts(ListProvisionedProductsRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListResourcesForTagOption  ListResourcesForTagOptionRequest
     * @return ListResourcesForTagOptionResponse
     */
    CompletableFuture<ListResourcesForTagOptionResponse> listResourcesForTagOption(ListResourcesForTagOptionRequest request);

    /**
     * @param request the request parameters of ListTagOptions  ListTagOptionsRequest
     * @return ListTagOptionsResponse
     */
    CompletableFuture<ListTagOptionsResponse> listTagOptions(ListTagOptionsRequest request);

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * <b>description</b> :
     * <p>After a product instance is terminated, the product instance is deleted from the product instance list. End users cannot manage the product instance throughout its lifecycle. Proceed with caution.</p>
     * 
     * @param request the request parameters of TerminateProvisionedProduct  TerminateProvisionedProductRequest
     * @return TerminateProvisionedProductResponse
     */
    CompletableFuture<TerminateProvisionedProductResponse> terminateProvisionedProduct(TerminateProvisionedProductRequest request);

    /**
     * @param request the request parameters of UpdateConstraint  UpdateConstraintRequest
     * @return UpdateConstraintResponse
     */
    CompletableFuture<UpdateConstraintResponse> updateConstraint(UpdateConstraintRequest request);

    /**
     * @param request the request parameters of UpdatePortfolio  UpdatePortfolioRequest
     * @return UpdatePortfolioResponse
     */
    CompletableFuture<UpdatePortfolioResponse> updatePortfolio(UpdatePortfolioRequest request);

    /**
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    /**
     * @param request the request parameters of UpdateProductVersion  UpdateProductVersionRequest
     * @return UpdateProductVersionResponse
     */
    CompletableFuture<UpdateProductVersionResponse> updateProductVersion(UpdateProductVersionRequest request);

    /**
     * @param request the request parameters of UpdateProvisionedProduct  UpdateProvisionedProductRequest
     * @return UpdateProvisionedProductResponse
     */
    CompletableFuture<UpdateProvisionedProductResponse> updateProvisionedProduct(UpdateProvisionedProductRequest request);

    /**
     * @param request the request parameters of UpdateProvisionedProductPlan  UpdateProvisionedProductPlanRequest
     * @return UpdateProvisionedProductPlanResponse
     */
    CompletableFuture<UpdateProvisionedProductPlanResponse> updateProvisionedProductPlan(UpdateProvisionedProductPlanRequest request);

    /**
     * @param request the request parameters of UpdateTagOption  UpdateTagOptionRequest
     * @return UpdateTagOptionResponse
     */
    CompletableFuture<UpdateTagOptionResponse> updateTagOption(UpdateTagOptionRequest request);

}
