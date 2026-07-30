// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cloudcontrol20220830.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "cloudcontrol";
        this.version = "2022-08-30";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("us-west-1", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-central-1", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-nanjing", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-heyuan", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-fuzhou", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cloudcontrol.aliyuncs.com"),
            new TeaPair("cn-beijing", "cloudcontrol.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "cloudcontrol.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "cloudcontrol.ap-southeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Only tasks that are in the Pending or Running state can be canceled.
     * You can call the CancelTask operation to cancel a Cloud Control API task, but the tasks that have been started in the downstream Alibaba Cloud services cannot be canceled.</p>
     * 
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    @Override
    public CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelTask").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/tasks/{taskId}/operation/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can go to <a href="https://next.api.aliyun.com/cloudcontrol">OpenAPI Explorer</a> to view the documentation and try out Cloud Control API.</p>
     * 
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    @Override
    public CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResource").setMethod(HttpMethod.POST).setPathRegex("{requestPath}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can go to <a href="https://next.api.aliyun.com/cloudcontrol">OpenAPI Explorer</a> to view the documentation and try out Cloud Control API.</p>
     * 
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    @Override
    public CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResource").setMethod(HttpMethod.DELETE).setPathRegex("{requestPath}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApiPrice  GetApiPriceRequest
     * @return GetApiPriceResponse
     */
    @Override
    public CompletableFuture<GetApiPriceResponse> getApiPrice(GetApiPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetApiPrice").setMethod(HttpMethod.POST).setPathRegex("/api/v1/price/quote").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApiPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApiPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPrice  GetPriceRequest
     * @return GetPriceResponse
     */
    @Override
    public CompletableFuture<GetPriceResponse> getPrice(GetPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPrice").setMethod(HttpMethod.GET).setPathRegex("{requestPath}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceType  GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    @Override
    public CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceType").setMethod(HttpMethod.GET).setPathRegex("{requestPath}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can go to <a href="https://next.api.aliyun.com/cloudcontrol">OpenAPI Explorer</a> to view the documentation and try out CloudControl API.
     * You can call this operation to query resources List and Get based on different request paths.</p>
     * 
     * @param request the request parameters of GetResources  GetResourcesRequest
     * @return GetResourcesResponse
     */
    @Override
    public CompletableFuture<GetResourcesResponse> getResources(GetResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResources").setMethod(HttpMethod.GET).setPathRegex("{requestPath}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/tasks/{taskId}.</p>
     * 
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    @Override
    public CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    @Override
    public CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataSources").setMethod(HttpMethod.GET).setPathRegex("{requestPath}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/providers/{provider}/products.</p>
     * 
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    @Override
    public CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProducts").setMethod(HttpMethod.GET).setPathRegex("/api/v1/providers/{provider}/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>GET /api/v1/providers/{provider}/products/{product}/resourceTypes.</p>
     * 
     * @param request the request parameters of ListResourceTypes  ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    @Override
    public CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceTypes").setMethod(HttpMethod.GET).setPathRegex("/api/v1/providers/{provider}/products/{product}/resourceTypes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSupportedPricingApis  ListSupportedPricingApisRequest
     * @return ListSupportedPricingApisResponse
     */
    @Override
    public CompletableFuture<ListSupportedPricingApisResponse> listSupportedPricingApis(ListSupportedPricingApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSupportedPricingApis").setMethod(HttpMethod.GET).setPathRegex("/api/v1/price/supported-apis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSupportedPricingApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSupportedPricingApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can go to <a href="https://next.api.aliyun.com/cloudcontrol">OpenAPI Explorer</a> to view the documentation and try out Cloud Control API.
     * If resources fail to be updated at any time, the Cloud Control API does not roll the resource back to the original status.
     * The resource APIs cannot be rolled back. If the API operation is partially failed to be called, you can call the GetResource operation to view the latest status of the resource. If necessary, you can call the UpdateResource or DeleteResource operation to manually compensate for the failure.</p>
     * 
     * @param request the request parameters of UpdateResource  UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    @Override
    public CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResource").setMethod(HttpMethod.PUT).setPathRegex("{requestPath}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
