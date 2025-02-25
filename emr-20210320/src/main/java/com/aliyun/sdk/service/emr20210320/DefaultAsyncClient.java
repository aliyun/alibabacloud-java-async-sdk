// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.emr20210320.models.*;
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
        this.product = "Emr";
        this.version = "2021-03-20";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-beijing", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "emr.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "emr.aliyuncs.com"),
            new TeaPair("us-west-1", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "emr.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "emr.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "emr.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "emr.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "emr.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "emr.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-edge-1", "emr.aliyuncs.com"),
            new TeaPair("cn-fujian", "emr.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "emr.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "emr.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "emr.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-wuhan", "emr.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "emr.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "emr.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "emr.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "emr.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "emr.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "emr.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "emr.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateApiTemplate  CreateApiTemplateRequest
     * @return CreateApiTemplateResponse
     */
    @Override
    public CompletableFuture<CreateApiTemplateResponse> createApiTemplate(CreateApiTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApiTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApiTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApiTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    @Override
    public CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>创建节点组。</p>
     * 
     * @param request the request parameters of CreateNodeGroup  CreateNodeGroupRequest
     * @return CreateNodeGroupResponse
     */
    @Override
    public CompletableFuture<CreateNodeGroupResponse> createNodeGroup(CreateNodeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNodeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNodeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNodeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateScript  CreateScriptRequest
     * @return CreateScriptResponse
     */
    @Override
    public CompletableFuture<CreateScriptResponse> createScript(CreateScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUsers  CreateUsersRequest
     * @return CreateUsersResponse
     */
    @Override
    public CompletableFuture<CreateUsersResponse> createUsers(CreateUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DecreaseNodes  DecreaseNodesRequest
     * @return DecreaseNodesResponse
     */
    @Override
    public CompletableFuture<DecreaseNodesResponse> decreaseNodes(DecreaseNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DecreaseNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DecreaseNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DecreaseNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>创建集群模板</p>
     * 
     * @param request the request parameters of DeleteApiTemplate  DeleteApiTemplateRequest
     * @return DeleteApiTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteApiTemplateResponse> deleteApiTemplate(DeleteApiTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApiTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    @Override
    public CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteScript  DeleteScriptRequest
     * @return DeleteScriptResponse
     */
    @Override
    public CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUsers  DeleteUsersRequest
     * @return DeleteUsersResponse
     */
    @Override
    public CompletableFuture<DeleteUsersResponse> deleteUsers(DeleteUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApiTemplate  GetApiTemplateRequest
     * @return GetApiTemplateResponse
     */
    @Override
    public CompletableFuture<GetApiTemplateResponse> getApiTemplate(GetApiTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApiTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApiTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApiTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询应用详情。</p>
     * 
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    @Override
    public CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAutoScalingActivity  GetAutoScalingActivityRequest
     * @return GetAutoScalingActivityResponse
     */
    @Override
    public CompletableFuture<GetAutoScalingActivityResponse> getAutoScalingActivity(GetAutoScalingActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoScalingActivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoScalingActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoScalingActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAutoScalingPolicy  GetAutoScalingPolicyRequest
     * @return GetAutoScalingPolicyResponse
     */
    @Override
    public CompletableFuture<GetAutoScalingPolicyResponse> getAutoScalingPolicy(GetAutoScalingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoScalingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoScalingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoScalingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    @Override
    public CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterCloneMeta  GetClusterCloneMetaRequest
     * @return GetClusterCloneMetaResponse
     */
    @Override
    public CompletableFuture<GetClusterCloneMetaResponse> getClusterCloneMeta(GetClusterCloneMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClusterCloneMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterCloneMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterCloneMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get one doctor analysis app</p>
     * 
     * @param request the request parameters of GetDoctorApplication  GetDoctorApplicationRequest
     * @return GetDoctorApplicationResponse
     */
    @Override
    public CompletableFuture<GetDoctorApplicationResponse> getDoctorApplication(GetDoctorApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get one specific luster engine queue by &lt;type, name&gt;</p>
     * 
     * @param request the request parameters of GetDoctorComputeSummary  GetDoctorComputeSummaryRequest
     * @return GetDoctorComputeSummaryResponse
     */
    @Override
    public CompletableFuture<GetDoctorComputeSummaryResponse> getDoctorComputeSummary(GetDoctorComputeSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorComputeSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorComputeSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorComputeSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseCluster</p>
     * 
     * @param request the request parameters of GetDoctorHBaseCluster  GetDoctorHBaseClusterRequest
     * @return GetDoctorHBaseClusterResponse
     */
    @Override
    public CompletableFuture<GetDoctorHBaseClusterResponse> getDoctorHBaseCluster(GetDoctorHBaseClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHBaseCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHBaseClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHBaseClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>List Doctor HBase Regions</p>
     * 
     * @param request the request parameters of GetDoctorHBaseRegion  GetDoctorHBaseRegionRequest
     * @return GetDoctorHBaseRegionResponse
     */
    @Override
    public CompletableFuture<GetDoctorHBaseRegionResponse> getDoctorHBaseRegion(GetDoctorHBaseRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHBaseRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHBaseRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHBaseRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseRegionServer</p>
     * 
     * @param request the request parameters of GetDoctorHBaseRegionServer  GetDoctorHBaseRegionServerRequest
     * @return GetDoctorHBaseRegionServerResponse
     */
    @Override
    public CompletableFuture<GetDoctorHBaseRegionServerResponse> getDoctorHBaseRegionServer(GetDoctorHBaseRegionServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHBaseRegionServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHBaseRegionServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHBaseRegionServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HBaseTable</p>
     * 
     * @param request the request parameters of GetDoctorHBaseTable  GetDoctorHBaseTableRequest
     * @return GetDoctorHBaseTableResponse
     */
    @Override
    public CompletableFuture<GetDoctorHBaseTableResponse> getDoctorHBaseTable(GetDoctorHBaseTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHBaseTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHBaseTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHBaseTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseTableRegions</p>
     * 
     * @param request the request parameters of GetDoctorHDFSCluster  GetDoctorHDFSClusterRequest
     * @return GetDoctorHDFSClusterResponse
     */
    @Override
    public CompletableFuture<GetDoctorHDFSClusterResponse> getDoctorHDFSCluster(GetDoctorHDFSClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHDFSCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHDFSClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHDFSClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HDFSNode</p>
     * 
     * @param request the request parameters of GetDoctorHDFSDirectory  GetDoctorHDFSDirectoryRequest
     * @return GetDoctorHDFSDirectoryResponse
     */
    @Override
    public CompletableFuture<GetDoctorHDFSDirectoryResponse> getDoctorHDFSDirectory(GetDoctorHDFSDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHDFSDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHDFSDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHDFSDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get Doctor HDFS UGI</p>
     * 
     * @param request the request parameters of GetDoctorHDFSUGI  GetDoctorHDFSUGIRequest
     * @return GetDoctorHDFSUGIResponse
     */
    @Override
    public CompletableFuture<GetDoctorHDFSUGIResponse> getDoctorHDFSUGI(GetDoctorHDFSUGIRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHDFSUGI").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHDFSUGIResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHDFSUGIResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Cluster</p>
     * 
     * @param request the request parameters of GetDoctorHiveCluster  GetDoctorHiveClusterRequest
     * @return GetDoctorHiveClusterResponse
     */
    @Override
    public CompletableFuture<GetDoctorHiveClusterResponse> getDoctorHiveCluster(GetDoctorHiveClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHiveCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHiveClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHiveClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get Doctor Hive Database</p>
     * 
     * @param request the request parameters of GetDoctorHiveDatabase  GetDoctorHiveDatabaseRequest
     * @return GetDoctorHiveDatabaseResponse
     */
    @Override
    public CompletableFuture<GetDoctorHiveDatabaseResponse> getDoctorHiveDatabase(GetDoctorHiveDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHiveDatabase").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHiveDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHiveDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get Doctor Hive Table</p>
     * 
     * @param request the request parameters of GetDoctorHiveTable  GetDoctorHiveTableRequest
     * @return GetDoctorHiveTableResponse
     */
    @Override
    public CompletableFuture<GetDoctorHiveTableResponse> getDoctorHiveTable(GetDoctorHiveTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorHiveTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorHiveTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorHiveTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Get realtime job by yarn</p>
     * 
     * @param request the request parameters of GetDoctorJob  GetDoctorJobRequest
     * @return GetDoctorJobResponse
     */
    @Override
    public CompletableFuture<GetDoctorJobResponse> getDoctorJob(GetDoctorJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>get specify component\&quot;s report analysis by EMR Doctor</p>
     * 
     * @param request the request parameters of GetDoctorReportComponentSummary  GetDoctorReportComponentSummaryRequest
     * @return GetDoctorReportComponentSummaryResponse
     */
    @Override
    public CompletableFuture<GetDoctorReportComponentSummaryResponse> getDoctorReportComponentSummary(GetDoctorReportComponentSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDoctorReportComponentSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorReportComponentSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorReportComponentSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>获取节点组详情。</p>
     * 
     * @param request the request parameters of GetNodeGroup  GetNodeGroupRequest
     * @return GetNodeGroupResponse
     */
    @Override
    public CompletableFuture<GetNodeGroupResponse> getNodeGroup(GetNodeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOperation  GetOperationRequest
     * @return GetOperationResponse
     */
    @Override
    public CompletableFuture<GetOperationResponse> getOperation(GetOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IncreaseNodes  IncreaseNodesRequest
     * @return IncreaseNodesResponse
     */
    @Override
    public CompletableFuture<IncreaseNodesResponse> increaseNodes(IncreaseNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IncreaseNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IncreaseNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IncreaseNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of JoinResourceGroup  JoinResourceGroupRequest
     * @return JoinResourceGroupResponse
     */
    @Override
    public CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApiTemplates  ListApiTemplatesRequest
     * @return ListApiTemplatesResponse
     */
    @Override
    public CompletableFuture<ListApiTemplatesResponse> listApiTemplates(ListApiTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApiTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApiTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApiTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询应用配置。</p>
     * 
     * @param request the request parameters of ListApplicationConfigs  ListApplicationConfigsRequest
     * @return ListApplicationConfigsResponse
     */
    @Override
    public CompletableFuture<ListApplicationConfigsResponse> listApplicationConfigs(ListApplicationConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    @Override
    public CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAutoScalingActivities  ListAutoScalingActivitiesRequest
     * @return ListAutoScalingActivitiesResponse
     */
    @Override
    public CompletableFuture<ListAutoScalingActivitiesResponse> listAutoScalingActivities(ListAutoScalingActivitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoScalingActivities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoScalingActivitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoScalingActivitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    @Override
    public CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询组件实例列表。</p>
     * 
     * @param request the request parameters of ListComponentInstances  ListComponentInstancesRequest
     * @return ListComponentInstancesResponse
     */
    @Override
    public CompletableFuture<ListComponentInstancesResponse> listComponentInstances(ListComponentInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListComponentInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComponentInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComponentInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    @Override
    public CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListComponents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComponentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComponentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list all doctor analysis apps</p>
     * 
     * @param request the request parameters of ListDoctorApplications  ListDoctorApplicationsRequest
     * @return ListDoctorApplicationsResponse
     */
    @Override
    public CompletableFuture<ListDoctorApplicationsResponse> listDoctorApplications(ListDoctorApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorApplications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor analysis result of cluster engine queue view</p>
     * 
     * @param request the request parameters of ListDoctorComputeSummary  ListDoctorComputeSummaryRequest
     * @return ListDoctorComputeSummaryResponse
     */
    @Override
    public CompletableFuture<ListDoctorComputeSummaryResponse> listDoctorComputeSummary(ListDoctorComputeSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorComputeSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorComputeSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorComputeSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseRegionServers</p>
     * 
     * @param request the request parameters of ListDoctorHBaseRegionServers  ListDoctorHBaseRegionServersRequest
     * @return ListDoctorHBaseRegionServersResponse
     */
    @Override
    public CompletableFuture<ListDoctorHBaseRegionServersResponse> listDoctorHBaseRegionServers(ListDoctorHBaseRegionServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorHBaseRegionServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorHBaseRegionServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorHBaseRegionServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HBaseTables</p>
     * 
     * @param request the request parameters of ListDoctorHBaseTables  ListDoctorHBaseTablesRequest
     * @return ListDoctorHBaseTablesResponse
     */
    @Override
    public CompletableFuture<ListDoctorHBaseTablesResponse> listDoctorHBaseTables(ListDoctorHBaseTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorHBaseTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorHBaseTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorHBaseTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HDFSNodes</p>
     * 
     * @param request the request parameters of ListDoctorHDFSDirectories  ListDoctorHDFSDirectoriesRequest
     * @return ListDoctorHDFSDirectoriesResponse
     */
    @Override
    public CompletableFuture<ListDoctorHDFSDirectoriesResponse> listDoctorHDFSDirectories(ListDoctorHDFSDirectoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorHDFSDirectories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorHDFSDirectoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorHDFSDirectoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor HDFS UGIs</p>
     * 
     * @param request the request parameters of ListDoctorHDFSUGI  ListDoctorHDFSUGIRequest
     * @return ListDoctorHDFSUGIResponse
     */
    @Override
    public CompletableFuture<ListDoctorHDFSUGIResponse> listDoctorHDFSUGI(ListDoctorHDFSUGIRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorHDFSUGI").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorHDFSUGIResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorHDFSUGIResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Databases</p>
     * 
     * @param request the request parameters of ListDoctorHiveDatabases  ListDoctorHiveDatabasesRequest
     * @return ListDoctorHiveDatabasesResponse
     */
    @Override
    public CompletableFuture<ListDoctorHiveDatabasesResponse> listDoctorHiveDatabases(ListDoctorHiveDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorHiveDatabases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorHiveDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorHiveDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list Doctor Hive Tables</p>
     * 
     * @param request the request parameters of ListDoctorHiveTables  ListDoctorHiveTablesRequest
     * @return ListDoctorHiveTablesResponse
     */
    @Override
    public CompletableFuture<ListDoctorHiveTablesResponse> listDoctorHiveTables(ListDoctorHiveTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorHiveTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorHiveTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorHiveTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list realtime jobs by yarn</p>
     * 
     * @param request the request parameters of ListDoctorJobs  ListDoctorJobsRequest
     * @return ListDoctorJobsResponse
     */
    @Override
    public CompletableFuture<ListDoctorJobsResponse> listDoctorJobs(ListDoctorJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list stats groupBy jobs by yarn</p>
     * 
     * @param request the request parameters of ListDoctorJobsStats  ListDoctorJobsStatsRequest
     * @return ListDoctorJobsStatsResponse
     */
    @Override
    public CompletableFuture<ListDoctorJobsStatsResponse> listDoctorJobsStats(ListDoctorJobsStatsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorJobsStats").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorJobsStatsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorJobsStatsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>list all reports analysis by emr doctor</p>
     * 
     * @param request the request parameters of ListDoctorReports  ListDoctorReportsRequest
     * @return ListDoctorReportsResponse
     */
    @Override
    public CompletableFuture<ListDoctorReportsResponse> listDoctorReports(ListDoctorReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDoctorReports").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDoctorReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDoctorReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceTypes  ListInstanceTypesRequest
     * @return ListInstanceTypesResponse
     */
    @Override
    public CompletableFuture<ListInstanceTypesResponse> listInstanceTypes(ListInstanceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodeGroups  ListNodeGroupsRequest
     * @return ListNodeGroupsResponse
     */
    @Override
    public CompletableFuture<ListNodeGroupsResponse> listNodeGroups(ListNodeGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodeGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodeGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodeGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    @Override
    public CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询主版本。</p>
     * 
     * @param request the request parameters of ListReleaseVersions  ListReleaseVersionsRequest
     * @return ListReleaseVersionsResponse
     */
    @Override
    public CompletableFuture<ListReleaseVersionsResponse> listReleaseVersions(ListReleaseVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListReleaseVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListReleaseVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListReleaseVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListScripts  ListScriptsRequest
     * @return ListScriptsResponse
     */
    @Override
    public CompletableFuture<ListScriptsResponse> listScripts(ListScriptsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListScripts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScriptsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScriptsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    @Override
    public CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure auto scaling policies.</p>
     * 
     * @param request the request parameters of PutAutoScalingPolicy  PutAutoScalingPolicyRequest
     * @return PutAutoScalingPolicyResponse
     */
    @Override
    public CompletableFuture<PutAutoScalingPolicyResponse> putAutoScalingPolicy(PutAutoScalingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutAutoScalingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutAutoScalingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutAutoScalingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveAutoScalingPolicy  RemoveAutoScalingPolicyRequest
     * @return RemoveAutoScalingPolicyResponse
     */
    @Override
    public CompletableFuture<RemoveAutoScalingPolicyResponse> removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveAutoScalingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveAutoScalingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveAutoScalingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunApiTemplate  RunApiTemplateRequest
     * @return RunApiTemplateResponse
     */
    @Override
    public CompletableFuture<RunApiTemplateResponse> runApiTemplate(RunApiTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunApiTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunApiTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunApiTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunApplicationAction  RunApplicationActionRequest
     * @return RunApplicationActionResponse
     */
    @Override
    public CompletableFuture<RunApplicationActionResponse> runApplicationAction(RunApplicationActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunApplicationAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunApplicationActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunApplicationActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>RunCluster is an upgraded version of CreateCluster. RunCluster uses HTTPS POST requests and supports more parameters. Complex parameters, such as parameters of the object and array types, are in the JSON format and are more friendly for users who use CLI.</p>
     * 
     * @param request the request parameters of RunCluster  RunClusterRequest
     * @return RunClusterResponse
     */
    @Override
    public CompletableFuture<RunClusterResponse> runCluster(RunClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>修改集群模板</p>
     * 
     * @param request the request parameters of UpdateApiTemplate  UpdateApiTemplateRequest
     * @return UpdateApiTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateApiTemplateResponse> updateApiTemplate(UpdateApiTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApiTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApiTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApiTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApplicationConfigs  UpdateApplicationConfigsRequest
     * @return UpdateApplicationConfigsResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationConfigsResponse> updateApplicationConfigs(UpdateApplicationConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApplicationConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateClusterAttribute  UpdateClusterAttributeRequest
     * @return UpdateClusterAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateClusterAttributeResponse> updateClusterAttribute(UpdateClusterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClusterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClusterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateScript  UpdateScriptRequest
     * @return UpdateScriptResponse
     */
    @Override
    public CompletableFuture<UpdateScriptResponse> updateScript(UpdateScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUserAttribute  UpdateUserAttributeRequest
     * @return UpdateUserAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateUserAttributeResponse> updateUserAttribute(UpdateUserAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUserAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
