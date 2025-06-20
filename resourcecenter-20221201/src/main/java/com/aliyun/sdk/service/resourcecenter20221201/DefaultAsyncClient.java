// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.resourcecenter20221201.models.*;
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
        this.product = "ResourceCenter";
        this.version = "2022-12-01";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AssociateDefaultFilter  AssociateDefaultFilterRequest
     * @return AssociateDefaultFilterResponse
     */
    @Override
    public CompletableFuture<AssociateDefaultFilterResponse> associateDefaultFilter(AssociateDefaultFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateDefaultFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateDefaultFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateDefaultFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDeliveryChannel  CreateDeliveryChannelRequest
     * @return CreateDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<CreateDeliveryChannelResponse> createDeliveryChannel(CreateDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFilter  CreateFilterRequest
     * @return CreateFilterResponse
     */
    @Override
    public CompletableFuture<CreateFilterResponse> createFilter(CreateFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMultiAccountDeliveryChannel  CreateMultiAccountDeliveryChannelRequest
     * @return CreateMultiAccountDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<CreateMultiAccountDeliveryChannelResponse> createMultiAccountDeliveryChannel(CreateMultiAccountDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMultiAccountDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMultiAccountDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMultiAccountDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSavedQuery  CreateSavedQueryRequest
     * @return CreateSavedQueryResponse
     */
    @Override
    public CompletableFuture<CreateSavedQueryResponse> createSavedQuery(CreateSavedQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSavedQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSavedQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSavedQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeliveryChannel  DeleteDeliveryChannelRequest
     * @return DeleteDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<DeleteDeliveryChannelResponse> deleteDeliveryChannel(DeleteDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFilter  DeleteFilterRequest
     * @return DeleteFilterResponse
     */
    @Override
    public CompletableFuture<DeleteFilterResponse> deleteFilter(DeleteFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMultiAccountDeliveryChannel  DeleteMultiAccountDeliveryChannelRequest
     * @return DeleteMultiAccountDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<DeleteMultiAccountDeliveryChannelResponse> deleteMultiAccountDeliveryChannel(DeleteMultiAccountDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMultiAccountDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMultiAccountDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMultiAccountDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSavedQuery  DeleteSavedQueryRequest
     * @return DeleteSavedQueryResponse
     */
    @Override
    public CompletableFuture<DeleteSavedQueryResponse> deleteSavedQuery(DeleteSavedQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSavedQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSavedQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSavedQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableMultiAccountResourceCenter  DisableMultiAccountResourceCenterRequest
     * @return DisableMultiAccountResourceCenterResponse
     */
    @Override
    public CompletableFuture<DisableMultiAccountResourceCenterResponse> disableMultiAccountResourceCenter(DisableMultiAccountResourceCenterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableMultiAccountResourceCenter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableMultiAccountResourceCenterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableMultiAccountResourceCenterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableResourceCenter  DisableResourceCenterRequest
     * @return DisableResourceCenterResponse
     */
    @Override
    public CompletableFuture<DisableResourceCenterResponse> disableResourceCenter(DisableResourceCenterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableResourceCenter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableResourceCenterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableResourceCenterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisassociateDefaultFilter  DisassociateDefaultFilterRequest
     * @return DisassociateDefaultFilterResponse
     */
    @Override
    public CompletableFuture<DisassociateDefaultFilterResponse> disassociateDefaultFilter(DisassociateDefaultFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateDefaultFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateDefaultFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateDefaultFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you have created a resource directory for your enterprise, you can enable the cross-account resource search feature by using the management account of the resource directory or a delegated administrator account of Resource Center to view the resources of members in the resource directory. For more information about a resource directory, see <a href="https://help.aliyun.com/document_detail/200506.html">Resource Directory overview</a>.</p>
     * 
     * @param request the request parameters of EnableMultiAccountResourceCenter  EnableMultiAccountResourceCenterRequest
     * @return EnableMultiAccountResourceCenterResponse
     */
    @Override
    public CompletableFuture<EnableMultiAccountResourceCenterResponse> enableMultiAccountResourceCenter(EnableMultiAccountResourceCenterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableMultiAccountResourceCenter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableMultiAccountResourceCenterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableMultiAccountResourceCenterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableResourceCenter  EnableResourceCenterRequest
     * @return EnableResourceCenterResponse
     */
    @Override
    public CompletableFuture<EnableResourceCenterResponse> enableResourceCenter(EnableResourceCenterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableResourceCenter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableResourceCenterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableResourceCenterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteMultiAccountSQLQuery  ExecuteMultiAccountSQLQueryRequest
     * @return ExecuteMultiAccountSQLQueryResponse
     */
    @Override
    public CompletableFuture<ExecuteMultiAccountSQLQueryResponse> executeMultiAccountSQLQuery(ExecuteMultiAccountSQLQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteMultiAccountSQLQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteMultiAccountSQLQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteMultiAccountSQLQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteSQLQuery  ExecuteSQLQueryRequest
     * @return ExecuteSQLQueryResponse
     */
    @Override
    public CompletableFuture<ExecuteSQLQueryResponse> executeSQLQuery(ExecuteSQLQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteSQLQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteSQLQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteSQLQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeliveryChannel  GetDeliveryChannelRequest
     * @return GetDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<GetDeliveryChannelResponse> getDeliveryChannel(GetDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeliveryChannelStatistics  GetDeliveryChannelStatisticsRequest
     * @return GetDeliveryChannelStatisticsResponse
     */
    @Override
    public CompletableFuture<GetDeliveryChannelStatisticsResponse> getDeliveryChannelStatistics(GetDeliveryChannelStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeliveryChannelStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeliveryChannelStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeliveryChannelStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetExampleQuery  GetExampleQueryRequest
     * @return GetExampleQueryResponse
     */
    @Override
    public CompletableFuture<GetExampleQueryResponse> getExampleQuery(GetExampleQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetExampleQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExampleQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExampleQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiAccountDeliveryChannel  GetMultiAccountDeliveryChannelRequest
     * @return GetMultiAccountDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<GetMultiAccountDeliveryChannelResponse> getMultiAccountDeliveryChannel(GetMultiAccountDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMultiAccountDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiAccountDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiAccountDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiAccountDeliveryChannelStatistics  GetMultiAccountDeliveryChannelStatisticsRequest
     * @return GetMultiAccountDeliveryChannelStatisticsResponse
     */
    @Override
    public CompletableFuture<GetMultiAccountDeliveryChannelStatisticsResponse> getMultiAccountDeliveryChannelStatistics(GetMultiAccountDeliveryChannelStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMultiAccountDeliveryChannelStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiAccountDeliveryChannelStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiAccountDeliveryChannelStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiAccountResourceCenterServiceStatus  GetMultiAccountResourceCenterServiceStatusRequest
     * @return GetMultiAccountResourceCenterServiceStatusResponse
     */
    @Override
    public CompletableFuture<GetMultiAccountResourceCenterServiceStatusResponse> getMultiAccountResourceCenterServiceStatus(GetMultiAccountResourceCenterServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMultiAccountResourceCenterServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiAccountResourceCenterServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiAccountResourceCenterServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiAccountResourceConfiguration  GetMultiAccountResourceConfigurationRequest
     * @return GetMultiAccountResourceConfigurationResponse
     */
    @Override
    public CompletableFuture<GetMultiAccountResourceConfigurationResponse> getMultiAccountResourceConfiguration(GetMultiAccountResourceConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMultiAccountResourceConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiAccountResourceConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiAccountResourceConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceCenterServiceStatus  GetResourceCenterServiceStatusRequest
     * @return GetResourceCenterServiceStatusResponse
     */
    @Override
    public CompletableFuture<GetResourceCenterServiceStatusResponse> getResourceCenterServiceStatus(GetResourceCenterServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceCenterServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceCenterServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceCenterServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceConfiguration  GetResourceConfigurationRequest
     * @return GetResourceConfigurationResponse
     */
    @Override
    public CompletableFuture<GetResourceConfigurationResponse> getResourceConfiguration(GetResourceConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceCounts  GetResourceCountsRequest
     * @return GetResourceCountsResponse
     */
    @Override
    public CompletableFuture<GetResourceCountsResponse> getResourceCounts(GetResourceCountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceCounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceCountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceCountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSavedQuery  GetSavedQueryRequest
     * @return GetSavedQueryResponse
     */
    @Override
    public CompletableFuture<GetSavedQueryResponse> getSavedQuery(GetSavedQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSavedQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSavedQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSavedQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeliveryChannels  ListDeliveryChannelsRequest
     * @return ListDeliveryChannelsResponse
     */
    @Override
    public CompletableFuture<ListDeliveryChannelsResponse> listDeliveryChannels(ListDeliveryChannelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeliveryChannels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeliveryChannelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeliveryChannelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExampleQueries  ListExampleQueriesRequest
     * @return ListExampleQueriesResponse
     */
    @Override
    public CompletableFuture<ListExampleQueriesResponse> listExampleQueries(ListExampleQueriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListExampleQueries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExampleQueriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExampleQueriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFilters  ListFiltersRequest
     * @return ListFiltersResponse
     */
    @Override
    public CompletableFuture<ListFiltersResponse> listFilters(ListFiltersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFilters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFiltersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFiltersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultiAccountDeliveryChannels  ListMultiAccountDeliveryChannelsRequest
     * @return ListMultiAccountDeliveryChannelsResponse
     */
    @Override
    public CompletableFuture<ListMultiAccountDeliveryChannelsResponse> listMultiAccountDeliveryChannels(ListMultiAccountDeliveryChannelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultiAccountDeliveryChannels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultiAccountDeliveryChannelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultiAccountDeliveryChannelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultiAccountResourceGroups  ListMultiAccountResourceGroupsRequest
     * @return ListMultiAccountResourceGroupsResponse
     */
    @Override
    public CompletableFuture<ListMultiAccountResourceGroupsResponse> listMultiAccountResourceGroups(ListMultiAccountResourceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultiAccountResourceGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultiAccountResourceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultiAccountResourceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you use a RAM user or a RAM role to call the operation, you must make sure that the RAM user or RAM role is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/600556.html">Grant a RAM user the permissions to use Resource Center</a>.</p>
     * <ul>
     * <li>By default, the operation returns up to 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMultiAccountResourceRelationships  ListMultiAccountResourceRelationshipsRequest
     * @return ListMultiAccountResourceRelationshipsResponse
     */
    @Override
    public CompletableFuture<ListMultiAccountResourceRelationshipsResponse> listMultiAccountResourceRelationships(ListMultiAccountResourceRelationshipsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultiAccountResourceRelationships").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultiAccountResourceRelationshipsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultiAccountResourceRelationshipsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultiAccountTagKeys  ListMultiAccountTagKeysRequest
     * @return ListMultiAccountTagKeysResponse
     */
    @Override
    public CompletableFuture<ListMultiAccountTagKeysResponse> listMultiAccountTagKeys(ListMultiAccountTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultiAccountTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultiAccountTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultiAccountTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultiAccountTagValues  ListMultiAccountTagValuesRequest
     * @return ListMultiAccountTagValuesResponse
     */
    @Override
    public CompletableFuture<ListMultiAccountTagValuesResponse> listMultiAccountTagValues(ListMultiAccountTagValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultiAccountTagValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultiAccountTagValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultiAccountTagValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query only the resource relationships on which the current account has access permissions.</p>
     * <ul>
     * <li>By default, this operation returns up to 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the query scope. For information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only entries that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Entries that meet any value of the filter condition are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListResourceRelationships  ListResourceRelationshipsRequest
     * @return ListResourceRelationshipsResponse
     */
    @Override
    public CompletableFuture<ListResourceRelationshipsResponse> listResourceRelationships(ListResourceRelationshipsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceRelationships").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceRelationshipsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceRelationshipsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceTypes  ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    @Override
    public CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSavedQueries  ListSavedQueriesRequest
     * @return ListSavedQueriesResponse
     */
    @Override
    public CompletableFuture<ListSavedQueriesResponse> listSavedQueries(ListSavedQueriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSavedQueries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSavedQueriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSavedQueriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    @Override
    public CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    @Override
    public CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can use this operation to search for only resources whose types are supported by Resource Center in services that work with Resource Center. For more information about the services and the resource types that are supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Services that work with Resource Center</a>.</p>
     * <ul>
     * <li>Before you use a RAM user or a RAM role to call the operation, you must make sure that the RAM user or RAM role is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/600556.html">Grant a RAM user the permissions to use Resource Center</a>.</li>
     * <li>By default, the operation returns a maximum of 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search scope. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * <li>You can visit <a href="https://api.alibabacloud.com/api-tools/demo/ResourceCenter">Sample Code Center</a> to view more sample queries.</li>
     * </ul>
     * 
     * @param request the request parameters of SearchMultiAccountResources  SearchMultiAccountResourcesRequest
     * @return SearchMultiAccountResourcesResponse
     */
    @Override
    public CompletableFuture<SearchMultiAccountResourcesResponse> searchMultiAccountResources(SearchMultiAccountResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMultiAccountResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMultiAccountResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMultiAccountResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can use this operation to search for only resources whose types are supported by Resource Center in services that work with Resource Center. For more information about the services and the resource types that are supported by Resource Center, see <a href="https://help.aliyun.com/document_detail/477798.html">Services that work with Resource Center</a>.</p>
     * <ul>
     * <li>By default, the operation returns a maximum of 20 entries. You can configure the <code>MaxResults</code> parameter to specify the maximum number of entries to return.</li>
     * <li>If the response does not contain the <code>NextToken</code> parameter, all entries are returned. Otherwise, more entries exist. If you want to obtain the entries, you can call the operation again to initiate another query request. In the request, set the <code>NextToken</code> parameter to the value of <code>NextToken</code> in the last response of the operation. If you do not configure the <code>NextToken</code> parameter, entries on the first page are returned by default.</li>
     * <li>You can specify one or more filter conditions to narrow the search scope. For more information about supported filter parameters and matching methods, see the Supported filter parameters section. Multiple filter conditions have logical <code>AND</code> relations. Only resources that meet all filter conditions are returned. The values of a filter condition have logical <code>OR</code> relations. Resources that meet any value of the filter condition are returned.</li>
     * <li>You can visit <a href="https://api.aliyun.com/api-tools/demo/ResourceCenter">Sample Code Center</a> to view more sample queries.</li>
     * </ul>
     * 
     * @param request the request parameters of SearchResources  SearchResourcesRequest
     * @return SearchResourcesResponse
     */
    @Override
    public CompletableFuture<SearchResourcesResponse> searchResources(SearchResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDeliveryChannel  UpdateDeliveryChannelRequest
     * @return UpdateDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<UpdateDeliveryChannelResponse> updateDeliveryChannel(UpdateDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFilter  UpdateFilterRequest
     * @return UpdateFilterResponse
     */
    @Override
    public CompletableFuture<UpdateFilterResponse> updateFilter(UpdateFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMultiAccountDeliveryChannel  UpdateMultiAccountDeliveryChannelRequest
     * @return UpdateMultiAccountDeliveryChannelResponse
     */
    @Override
    public CompletableFuture<UpdateMultiAccountDeliveryChannelResponse> updateMultiAccountDeliveryChannel(UpdateMultiAccountDeliveryChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMultiAccountDeliveryChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMultiAccountDeliveryChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMultiAccountDeliveryChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSavedQuery  UpdateSavedQueryRequest
     * @return UpdateSavedQueryResponse
     */
    @Override
    public CompletableFuture<UpdateSavedQueryResponse> updateSavedQuery(UpdateSavedQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSavedQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSavedQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSavedQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
