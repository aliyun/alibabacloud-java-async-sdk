// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adp20210720.models.*;
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

    CompletableFuture<AddEnvironmentNodesResponse> addEnvironmentNodes(AddEnvironmentNodesRequest request);

    CompletableFuture<AddEnvironmentProductVersionsResponse> addEnvironmentProductVersions(AddEnvironmentProductVersionsRequest request);

    CompletableFuture<AddProductComponentVersionResponse> addProductComponentVersion(AddProductComponentVersionRequest request);

    CompletableFuture<AddProductVersionConfigResponse> addProductVersionConfig(AddProductVersionConfigRequest request);

    CompletableFuture<AddResourceSnapshotResponse> addResourceSnapshot(AddResourceSnapshotRequest request);

    CompletableFuture<BatchAddEnvironmentNodesResponse> batchAddEnvironmentNodes(BatchAddEnvironmentNodesRequest request);

    CompletableFuture<BatchAddProductVersionConfigResponse> batchAddProductVersionConfig(BatchAddProductVersionConfigRequest request);

    CompletableFuture<CreateDeliverableResponse> createDeliverable(CreateDeliverableRequest request);

    CompletableFuture<CreateDeliveryInstanceResponse> createDeliveryInstance(CreateDeliveryInstanceRequest request);

    CompletableFuture<CreateDeliveryPackageResponse> createDeliveryPackage(CreateDeliveryPackageRequest request);

    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    CompletableFuture<CreateEnvironmentLicenseResponse> createEnvironmentLicense(CreateEnvironmentLicenseRequest request);

    CompletableFuture<CreateFoundationReferenceResponse> createFoundationReference(CreateFoundationReferenceRequest request);

    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    CompletableFuture<CreateProductDeploymentResponse> createProductDeployment(CreateProductDeploymentRequest request);

    CompletableFuture<CreateProductVersionResponse> createProductVersion(CreateProductVersionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateProductVersionPackageResponse> createProductVersionPackage(CreateProductVersionPackageRequest request);

    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    CompletableFuture<DeleteEnvironmentLicenseResponse> deleteEnvironmentLicense(DeleteEnvironmentLicenseRequest request);

    CompletableFuture<DeleteEnvironmentNodeResponse> deleteEnvironmentNode(DeleteEnvironmentNodeRequest request);

    CompletableFuture<DeleteEnvironmentProductVersionResponse> deleteEnvironmentProductVersion(DeleteEnvironmentProductVersionRequest request);

    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    CompletableFuture<DeleteProductComponentVersionResponse> deleteProductComponentVersion(DeleteProductComponentVersionRequest request);

    CompletableFuture<DeleteProductInstanceConfigResponse> deleteProductInstanceConfig(DeleteProductInstanceConfigRequest request);

    CompletableFuture<DeleteProductVersionResponse> deleteProductVersion(DeleteProductVersionRequest request);

    CompletableFuture<DeleteProductVersionConfigResponse> deleteProductVersionConfig(DeleteProductVersionConfigRequest request);

    CompletableFuture<GenerateProductInstanceDeploymentConfigResponse> generateProductInstanceDeploymentConfig(GenerateProductInstanceDeploymentConfigRequest request);

    CompletableFuture<GetComponentResponse> getComponent(GetComponentRequest request);

    CompletableFuture<GetComponentVersionResponse> getComponentVersion(GetComponentVersionRequest request);

    CompletableFuture<GetDeliverableResponse> getDeliverable(GetDeliverableRequest request);

    CompletableFuture<GetDeliveryPackageResponse> getDeliveryPackage(GetDeliveryPackageRequest request);

    CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request);

    CompletableFuture<GetEnvironmentDeliveryInstanceResponse> getEnvironmentDeliveryInstance(GetEnvironmentDeliveryInstanceRequest request);

    CompletableFuture<GetEnvironmentLicenseResponse> getEnvironmentLicense(GetEnvironmentLicenseRequest request);

    CompletableFuture<GetEnvironmentNodeResponse> getEnvironmentNode(GetEnvironmentNodeRequest request);

    CompletableFuture<GetFoundationComponentReferenceResponse> getFoundationComponentReference(GetFoundationComponentReferenceRequest request);

    CompletableFuture<GetFoundationReferenceResponse> getFoundationReference(GetFoundationReferenceRequest request);

    CompletableFuture<GetFoundationVersionResponse> getFoundationVersion(GetFoundationVersionRequest request);

    CompletableFuture<GetProductResponse> getProduct(GetProductRequest request);

    CompletableFuture<GetProductComponentVersionResponse> getProductComponentVersion(GetProductComponentVersionRequest request);

    CompletableFuture<GetProductDeploymentResponse> getProductDeployment(GetProductDeploymentRequest request);

    CompletableFuture<GetProductVersionResponse> getProductVersion(GetProductVersionRequest request);

    CompletableFuture<GetProductVersionDifferencesResponse> getProductVersionDifferences(GetProductVersionDifferencesRequest request);

    CompletableFuture<GetProductVersionPackageResponse> getProductVersionPackage(GetProductVersionPackageRequest request);

    CompletableFuture<GetResourceSnapshotResponse> getResourceSnapshot(GetResourceSnapshotRequest request);

    CompletableFuture<GetWorkflowStatusResponse> getWorkflowStatus(GetWorkflowStatusRequest request);

    CompletableFuture<InitEnvironmentResourceResponse> initEnvironmentResource(InitEnvironmentResourceRequest request);

    CompletableFuture<ListComponentVersionsResponse> listComponentVersions(ListComponentVersionsRequest request);

    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    CompletableFuture<ListDeliveryInstanceChangeRecordsResponse> listDeliveryInstanceChangeRecords(ListDeliveryInstanceChangeRecordsRequest request);

    CompletableFuture<ListDeliveryPackageResponse> listDeliveryPackage(ListDeliveryPackageRequest request);

    CompletableFuture<ListEnvironmentLicensesResponse> listEnvironmentLicenses(ListEnvironmentLicensesRequest request);

    CompletableFuture<ListEnvironmentNodesResponse> listEnvironmentNodes(ListEnvironmentNodesRequest request);

    CompletableFuture<ListEnvironmentTunnelsResponse> listEnvironmentTunnels(ListEnvironmentTunnelsRequest request);

    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    CompletableFuture<ListFoundationComponentVersionsResponse> listFoundationComponentVersions(ListFoundationComponentVersionsRequest request);

    CompletableFuture<ListFoundationReferenceComponentsResponse> listFoundationReferenceComponents(ListFoundationReferenceComponentsRequest request);

    CompletableFuture<ListFoundationVersionsResponse> listFoundationVersions(ListFoundationVersionsRequest request);

    CompletableFuture<ListProductComponentVersionsResponse> listProductComponentVersions(ListProductComponentVersionsRequest request);

    CompletableFuture<ListProductDeploymentsResponse> listProductDeployments(ListProductDeploymentsRequest request);

    CompletableFuture<ListProductEnvironmentsResponse> listProductEnvironments(ListProductEnvironmentsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListProductFoundationReferencesResponse> listProductFoundationReferences(ListProductFoundationReferencesRequest request);

    CompletableFuture<ListProductInstanceConfigsResponse> listProductInstanceConfigs(ListProductInstanceConfigsRequest request);

    CompletableFuture<ListProductInstancesResponse> listProductInstances(ListProductInstancesRequest request);

    CompletableFuture<ListProductVersionConfigsResponse> listProductVersionConfigs(ListProductVersionConfigsRequest request);

    CompletableFuture<ListProductVersionsResponse> listProductVersions(ListProductVersionsRequest request);

    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    CompletableFuture<ListWorkflowTaskLogsResponse> listWorkflowTaskLogs(ListWorkflowTaskLogsRequest request);

    CompletableFuture<PutEnvironmentTunnelResponse> putEnvironmentTunnel(PutEnvironmentTunnelRequest request);

    CompletableFuture<PutProductInstanceConfigResponse> putProductInstanceConfig(PutProductInstanceConfigRequest request);

    CompletableFuture<SetEnvironmentFoundationReferenceResponse> setEnvironmentFoundationReference(SetEnvironmentFoundationReferenceRequest request);

    CompletableFuture<UpdateDeliverableResponse> updateDeliverable(UpdateDeliverableRequest request);

    CompletableFuture<UpdateDeliveryInstanceResponse> updateDeliveryInstance(UpdateDeliveryInstanceRequest request);

    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    CompletableFuture<UpdateEnvironmentNodeResponse> updateEnvironmentNode(UpdateEnvironmentNodeRequest request);

    CompletableFuture<UpdateEnvironmentProductVersionResponse> updateEnvironmentProductVersion(UpdateEnvironmentProductVersionRequest request);

    CompletableFuture<UpdateFoundationComponentReferenceResponse> updateFoundationComponentReference(UpdateFoundationComponentReferenceRequest request);

    CompletableFuture<UpdateFoundationReferenceResponse> updateFoundationReference(UpdateFoundationReferenceRequest request);

    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    CompletableFuture<UpdateProductComponentVersionResponse> updateProductComponentVersion(UpdateProductComponentVersionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateProductFoundationVersionResponse> updateProductFoundationVersion(UpdateProductFoundationVersionRequest request);

    CompletableFuture<UpdateProductVersionResponse> updateProductVersion(UpdateProductVersionRequest request);

    CompletableFuture<UpdateProductVersionConfigResponse> updateProductVersionConfig(UpdateProductVersionConfigRequest request);

    CompletableFuture<ValidateEnvironmentTunnelResponse> validateEnvironmentTunnel(ValidateEnvironmentTunnelRequest request);

}
