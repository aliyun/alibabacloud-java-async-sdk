// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.bdrc20230808.models.*;
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
        this.product = "BDRC";
        this.version = "2023-08-08";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CheckRules  CheckRulesRequest
     * @return CheckRulesResponse
     */
    @Override
    public CompletableFuture<CheckRulesResponse> checkRules(CheckRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckRules").setMethod(HttpMethod.POST).setPathRegex("/api/v1/rules/check").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseBdrcService  CloseBdrcServiceRequest
     * @return CloseBdrcServiceResponse
     */
    @Override
    public CompletableFuture<CloseBdrcServiceResponse> closeBdrcService(CloseBdrcServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseBdrcService").setMethod(HttpMethod.POST).setPathRegex("/api/v1/service/close").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseBdrcServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseBdrcServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCheckDetails  DescribeCheckDetailsRequest
     * @return DescribeCheckDetailsResponse
     */
    @Override
    public CompletableFuture<DescribeCheckDetailsResponse> describeCheckDetails(DescribeCheckDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeCheckDetails").setMethod(HttpMethod.GET).setPathRegex("/api/v1/check-details").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCheckDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCheckDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProducts  DescribeProductsRequest
     * @return DescribeProductsResponse
     */
    @Override
    public CompletableFuture<DescribeProductsResponse> describeProducts(DescribeProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeProducts").setMethod(HttpMethod.GET).setPathRegex("/api/v1/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeResources  DescribeResourcesRequest
     * @return DescribeResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeResourcesResponse> describeResources(DescribeResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRules  DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    @Override
    public CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeRules").setMethod(HttpMethod.GET).setPathRegex("/api/v1/rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTask  DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    @Override
    public CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tasks/{TaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    @Override
    public CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTasks").setMethod(HttpMethod.GET).setPathRegex("/api/v1/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTopRiskyResources  DescribeTopRiskyResourcesRequest
     * @return DescribeTopRiskyResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeTopRiskyResourcesResponse> describeTopRiskyResources(DescribeTopRiskyResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTopRiskyResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/resources/top-risky").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTopRiskyResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTopRiskyResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableCheckProduct  DisableCheckProductRequest
     * @return DisableCheckProductResponse
     */
    @Override
    public CompletableFuture<DisableCheckProductResponse> disableCheckProduct(DisableCheckProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableCheckProduct").setMethod(HttpMethod.POST).setPathRegex("/api/v1/products/disable-check").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableCheckProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableCheckProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableCheckResource  DisableCheckResourceRequest
     * @return DisableCheckResourceResponse
     */
    @Override
    public CompletableFuture<DisableCheckResourceResponse> disableCheckResource(DisableCheckResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableCheckResource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resources/disable-check").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableCheckResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableCheckResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableCheckProduct  EnableCheckProductRequest
     * @return EnableCheckProductResponse
     */
    @Override
    public CompletableFuture<EnableCheckProductResponse> enableCheckProduct(EnableCheckProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableCheckProduct").setMethod(HttpMethod.POST).setPathRegex("/api/v1/products/enable-check").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableCheckProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableCheckProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableCheckResource  EnableCheckResourceRequest
     * @return EnableCheckResourceResponse
     */
    @Override
    public CompletableFuture<EnableCheckResourceResponse> enableCheckResource(EnableCheckResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableCheckResource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resources/enable-check").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableCheckResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableCheckResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBdrcService  GetBdrcServiceRequest
     * @return GetBdrcServiceResponse
     */
    @Override
    public CompletableFuture<GetBdrcServiceResponse> getBdrcService(GetBdrcServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetBdrcService").setMethod(HttpMethod.GET).setPathRegex("/api/v1/service").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBdrcServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBdrcServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenBdrcService  OpenBdrcServiceRequest
     * @return OpenBdrcServiceResponse
     */
    @Override
    public CompletableFuture<OpenBdrcServiceResponse> openBdrcService(OpenBdrcServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenBdrcService").setMethod(HttpMethod.POST).setPathRegex("/api/v1/service/open").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenBdrcServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenBdrcServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResources  UpdateResourcesRequest
     * @return UpdateResourcesResponse
     */
    @Override
    public CompletableFuture<UpdateResourcesResponse> updateResources(UpdateResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResources").setMethod(HttpMethod.POST).setPathRegex("/api/v1/resources/update").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
