// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.hitsdb20200615.models.*;
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
        this.product = "hitsdb";
        this.version = "2020-06-15";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckLdpsColumnarIndexStatus  CheckLdpsColumnarIndexStatusRequest
     * @return CheckLdpsColumnarIndexStatusResponse
     */
    @Override
    public CompletableFuture<CheckLdpsColumnarIndexStatusResponse> checkLdpsColumnarIndexStatus(CheckLdpsColumnarIndexStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckLdpsColumnarIndexStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckLdpsColumnarIndexStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckLdpsColumnarIndexStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAutoScalingConfig  CreateAutoScalingConfigRequest
     * @return CreateAutoScalingConfigResponse
     */
    @Override
    public CompletableFuture<CreateAutoScalingConfigResponse> createAutoScalingConfig(CreateAutoScalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoScalingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoScalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoScalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAutoScalingRule  CreateAutoScalingRuleRequest
     * @return CreateAutoScalingRuleResponse
     */
    @Override
    public CompletableFuture<CreateAutoScalingRuleResponse> createAutoScalingRule(CreateAutoScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoScalingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLdpsComputeGroup  CreateLdpsComputeGroupRequest
     * @return CreateLdpsComputeGroupResponse
     */
    @Override
    public CompletableFuture<CreateLdpsComputeGroupResponse> createLdpsComputeGroup(CreateLdpsComputeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLdpsComputeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLdpsComputeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLdpsComputeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must select at least one engine when you create a Lindorm instance. For more information about how to select the storage type and engine type when you create a Lindorm instance, see <a href="https://help.aliyun.com/document_detail/181971.html">Select engine types</a> and <a href="https://help.aliyun.com/document_detail/174643.html">Select storage types</a>.</p>
     * 
     * @param request the request parameters of CreateLindormInstance  CreateLindormInstanceRequest
     * @return CreateLindormInstanceResponse
     */
    @Override
    public CompletableFuture<CreateLindormInstanceResponse> createLindormInstance(CreateLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLindormV2Instance  CreateLindormV2InstanceRequest
     * @return CreateLindormV2InstanceResponse
     */
    @Override
    public CompletableFuture<CreateLindormV2InstanceResponse> createLindormV2Instance(CreateLindormV2InstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLindormV2Instance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLindormV2InstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLindormV2InstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAutoScalingConfig  DeleteAutoScalingConfigRequest
     * @return DeleteAutoScalingConfigResponse
     */
    @Override
    public CompletableFuture<DeleteAutoScalingConfigResponse> deleteAutoScalingConfig(DeleteAutoScalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoScalingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAutoScalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAutoScalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAutoScalingRule  DeleteAutoScalingRuleRequest
     * @return DeleteAutoScalingRuleResponse
     */
    @Override
    public CompletableFuture<DeleteAutoScalingRuleResponse> deleteAutoScalingRule(DeleteAutoScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoScalingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAutoScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAutoScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomResource  DeleteCustomResourceRequest
     * @return DeleteCustomResourceResponse
     */
    @Override
    public CompletableFuture<DeleteCustomResourceResponse> deleteCustomResource(DeleteCustomResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLdpsComputeGroup  DeleteLdpsComputeGroupRequest
     * @return DeleteLdpsComputeGroupResponse
     */
    @Override
    public CompletableFuture<DeleteLdpsComputeGroupResponse> deleteLdpsComputeGroup(DeleteLdpsComputeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLdpsComputeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLdpsComputeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLdpsComputeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployLdpsSemiManagedComponent  DeployLdpsSemiManagedComponentRequest
     * @return DeployLdpsSemiManagedComponentResponse
     */
    @Override
    public CompletableFuture<DeployLdpsSemiManagedComponentResponse> deployLdpsSemiManagedComponent(DeployLdpsSemiManagedComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeployLdpsSemiManagedComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployLdpsSemiManagedComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployLdpsSemiManagedComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAutoScalingConfig  GetAutoScalingConfigRequest
     * @return GetAutoScalingConfigResponse
     */
    @Override
    public CompletableFuture<GetAutoScalingConfigResponse> getAutoScalingConfig(GetAutoScalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoScalingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoScalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoScalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAutoScalingRule  GetAutoScalingRuleRequest
     * @return GetAutoScalingRuleResponse
     */
    @Override
    public CompletableFuture<GetAutoScalingRuleResponse> getAutoScalingRule(GetAutoScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoScalingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClientSourceIp  GetClientSourceIpRequest
     * @return GetClientSourceIpResponse
     */
    @Override
    public CompletableFuture<GetClientSourceIpResponse> getClientSourceIp(GetClientSourceIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClientSourceIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClientSourceIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClientSourceIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEngineDefaultAuth  GetEngineDefaultAuthRequest
     * @return GetEngineDefaultAuthResponse
     */
    @Override
    public CompletableFuture<GetEngineDefaultAuthResponse> getEngineDefaultAuth(GetEngineDefaultAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEngineDefaultAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEngineDefaultAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEngineDefaultAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceIpWhiteList  GetInstanceIpWhiteListRequest
     * @return GetInstanceIpWhiteListResponse
     */
    @Override
    public CompletableFuture<GetInstanceIpWhiteListResponse> getInstanceIpWhiteList(GetInstanceIpWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceIpWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceIpWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceIpWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceSecurityGroups  GetInstanceSecurityGroupsRequest
     * @return GetInstanceSecurityGroupsResponse
     */
    @Override
    public CompletableFuture<GetInstanceSecurityGroupsResponse> getInstanceSecurityGroups(GetInstanceSecurityGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceSecurityGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceSecurityGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceSecurityGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLdpsComputeGroup  GetLdpsComputeGroupRequest
     * @return GetLdpsComputeGroupResponse
     */
    @Override
    public CompletableFuture<GetLdpsComputeGroupResponse> getLdpsComputeGroup(GetLdpsComputeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLdpsComputeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLdpsComputeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLdpsComputeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLdpsNamespacedQuota  GetLdpsNamespacedQuotaRequest
     * @return GetLdpsNamespacedQuotaResponse
     */
    @Override
    public CompletableFuture<GetLdpsNamespacedQuotaResponse> getLdpsNamespacedQuota(GetLdpsNamespacedQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLdpsNamespacedQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLdpsNamespacedQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLdpsNamespacedQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLdpsResourceCost  GetLdpsResourceCostRequest
     * @return GetLdpsResourceCostResponse
     */
    @Override
    public CompletableFuture<GetLdpsResourceCostResponse> getLdpsResourceCost(GetLdpsResourceCostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLdpsResourceCost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLdpsResourceCostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLdpsResourceCostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLindormFsUsedDetail  GetLindormFsUsedDetailRequest
     * @return GetLindormFsUsedDetailResponse
     */
    @Override
    public CompletableFuture<GetLindormFsUsedDetailResponse> getLindormFsUsedDetail(GetLindormFsUsedDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormFsUsedDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormFsUsedDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormFsUsedDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLindormInstance  GetLindormInstanceRequest
     * @return GetLindormInstanceResponse
     */
    @Override
    public CompletableFuture<GetLindormInstanceResponse> getLindormInstance(GetLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLindormInstanceEngineList  GetLindormInstanceEngineListRequest
     * @return GetLindormInstanceEngineListResponse
     */
    @Override
    public CompletableFuture<GetLindormInstanceEngineListResponse> getLindormInstanceEngineList(GetLindormInstanceEngineListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormInstanceEngineList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormInstanceEngineListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormInstanceEngineListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLindormInstanceList  GetLindormInstanceListRequest
     * @return GetLindormInstanceListResponse
     */
    @Override
    public CompletableFuture<GetLindormInstanceListResponse> getLindormInstanceList(GetLindormInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormInstanceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLindormV2Instance  GetLindormV2InstanceRequest
     * @return GetLindormV2InstanceResponse
     */
    @Override
    public CompletableFuture<GetLindormV2InstanceResponse> getLindormV2Instance(GetLindormV2InstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormV2Instance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormV2InstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormV2InstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLindormV2InstanceEngineList  GetLindormV2InstanceEngineListRequest
     * @return GetLindormV2InstanceEngineListResponse
     */
    @Override
    public CompletableFuture<GetLindormV2InstanceEngineListResponse> getLindormV2InstanceEngineList(GetLindormV2InstanceEngineListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormV2InstanceEngineList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormV2InstanceEngineListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormV2InstanceEngineListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLindormV2StorageUsage  GetLindormV2StorageUsageRequest
     * @return GetLindormV2StorageUsageResponse
     */
    @Override
    public CompletableFuture<GetLindormV2StorageUsageResponse> getLindormV2StorageUsage(GetLindormV2StorageUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLindormV2StorageUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLindormV2StorageUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLindormV2StorageUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAutoScalingConfigs  ListAutoScalingConfigsRequest
     * @return ListAutoScalingConfigsResponse
     */
    @Override
    public CompletableFuture<ListAutoScalingConfigsResponse> listAutoScalingConfigs(ListAutoScalingConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoScalingConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoScalingConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoScalingConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAutoScalingRecords  ListAutoScalingRecordsRequest
     * @return ListAutoScalingRecordsResponse
     */
    @Override
    public CompletableFuture<ListAutoScalingRecordsResponse> listAutoScalingRecords(ListAutoScalingRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoScalingRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoScalingRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoScalingRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAutoScalingRules  ListAutoScalingRulesRequest
     * @return ListAutoScalingRulesResponse
     */
    @Override
    public CompletableFuture<ListAutoScalingRulesResponse> listAutoScalingRules(ListAutoScalingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoScalingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoScalingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoScalingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLdpsComputeGroups  ListLdpsComputeGroupsRequest
     * @return ListLdpsComputeGroupsResponse
     */
    @Override
    public CompletableFuture<ListLdpsComputeGroupsResponse> listLdpsComputeGroups(ListLdpsComputeGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLdpsComputeGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLdpsComputeGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLdpsComputeGroupsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModifyAutoScalingConfig  ModifyAutoScalingConfigRequest
     * @return ModifyAutoScalingConfigResponse
     */
    @Override
    public CompletableFuture<ModifyAutoScalingConfigResponse> modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoScalingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoScalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoScalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAutoScalingRule  ModifyAutoScalingRuleRequest
     * @return ModifyAutoScalingRuleResponse
     */
    @Override
    public CompletableFuture<ModifyAutoScalingRuleResponse> modifyAutoScalingRule(ModifyAutoScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoScalingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the billing method of an instance to subscription or pay-as-you-go.
     * Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/en/pricing-calculator?spm=a2c63.p38356.0.0.2b024c2adcHeXL&_p_lc=1#/commodity/hitsdb_lindormpre_public_intl">pricing</a> of Lindorm. Published on only international site (alibabacloud.com).</p>
     * 
     * @param request the request parameters of ModifyInstancePayType  ModifyInstancePayTypeRequest
     * @return ModifyInstancePayTypeResponse
     */
    @Override
    public CompletableFuture<ModifyInstancePayTypeResponse> modifyInstancePayType(ModifyInstancePayTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstancePayType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstancePayTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstancePayTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLindormV2Instance  ModifyLindormV2InstanceRequest
     * @return ModifyLindormV2InstanceResponse
     */
    @Override
    public CompletableFuture<ModifyLindormV2InstanceResponse> modifyLindormV2Instance(ModifyLindormV2InstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLindormV2Instance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLindormV2InstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLindormV2InstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLindormV2WhiteIpList  ModifyLindormV2WhiteIpListRequest
     * @return ModifyLindormV2WhiteIpListResponse
     */
    @Override
    public CompletableFuture<ModifyLindormV2WhiteIpListResponse> modifyLindormV2WhiteIpList(ModifyLindormV2WhiteIpListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLindormV2WhiteIpList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLindormV2WhiteIpListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLindormV2WhiteIpListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenComputeEngine  OpenComputeEngineRequest
     * @return OpenComputeEngineResponse
     */
    @Override
    public CompletableFuture<OpenComputeEngineResponse> openComputeEngine(OpenComputeEngineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenComputeEngine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenComputeEngineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenComputeEngineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenComputePreCheck  OpenComputePreCheckRequest
     * @return OpenComputePreCheckResponse
     */
    @Override
    public CompletableFuture<OpenComputePreCheckResponse> openComputePreCheck(OpenComputePreCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenComputePreCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenComputePreCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenComputePreCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseLindormInstance  ReleaseLindormInstanceRequest
     * @return ReleaseLindormInstanceResponse
     */
    @Override
    public CompletableFuture<ReleaseLindormInstanceResponse> releaseLindormInstance(ReleaseLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseLindormV2Instance  ReleaseLindormV2InstanceRequest
     * @return ReleaseLindormV2InstanceResponse
     */
    @Override
    public CompletableFuture<ReleaseLindormV2InstanceResponse> releaseLindormV2Instance(ReleaseLindormV2InstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseLindormV2Instance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseLindormV2InstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseLindormV2InstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to renew a subscription Lindorm instance for 1 to 9 months or 1 to 3 years.
     * Before you call this operation, make sure that you fully understand the billing methods and pricing of Lindorm.</p>
     * 
     * @param request the request parameters of RenewLindormInstance  RenewLindormInstanceRequest
     * @return RenewLindormInstanceResponse
     */
    @Override
    public CompletableFuture<RenewLindormInstanceResponse> renewLindormInstance(RenewLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartLdpsComputeGroup  RestartLdpsComputeGroupRequest
     * @return RestartLdpsComputeGroupResponse
     */
    @Override
    public CompletableFuture<RestartLdpsComputeGroupResponse> restartLdpsComputeGroup(RestartLdpsComputeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartLdpsComputeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartLdpsComputeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartLdpsComputeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultOlapComputeGroup  SetDefaultOlapComputeGroupRequest
     * @return SetDefaultOlapComputeGroupResponse
     */
    @Override
    public CompletableFuture<SetDefaultOlapComputeGroupResponse> setDefaultOlapComputeGroup(SetDefaultOlapComputeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultOlapComputeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultOlapComputeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultOlapComputeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>The LindormTable version of your instance is 2.6.0 or later.</li>
     * <li>The LindormTable of your instance supports LindormSQL V3. The value of the EnableLsqlVersionV3 parameter in the response of the GetLindormInstance operation is true for Lindorm instances purchased after Oct 24, 2023, which indicates that LindormSQL is supported by these instances by default. If you want to enable LindormSQL for instances purchased before Oct 24, 2023, contact the on-duty technical support.
     * You can enable the MySQL compatibility feature for a Lindorm instance only when the instance meets the preceding requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchLSQLV3MySQLService  SwitchLSQLV3MySQLServiceRequest
     * @return SwitchLSQLV3MySQLServiceResponse
     */
    @Override
    public CompletableFuture<SwitchLSQLV3MySQLServiceResponse> switchLSQLV3MySQLService(SwitchLSQLV3MySQLServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchLSQLV3MySQLService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchLSQLV3MySQLServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchLSQLV3MySQLServiceResponse> future = new CompletableFuture<>();
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
     * <b>description</b> :
     * <p>If a tag is not added to any Lindorm instance, it is deleted.</p>
     * 
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
     * @param request the request parameters of UpdateInstanceIpWhiteList  UpdateInstanceIpWhiteListRequest
     * @return UpdateInstanceIpWhiteListResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceIpWhiteListResponse> updateInstanceIpWhiteList(UpdateInstanceIpWhiteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateInstanceIpWhiteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceIpWhiteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceIpWhiteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceSecurityGroups  UpdateInstanceSecurityGroupsRequest
     * @return UpdateInstanceSecurityGroupsResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceSecurityGroupsResponse> updateInstanceSecurityGroups(UpdateInstanceSecurityGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateInstanceSecurityGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceSecurityGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceSecurityGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLdpsComputeGroup  UpdateLdpsComputeGroupRequest
     * @return UpdateLdpsComputeGroupResponse
     */
    @Override
    public CompletableFuture<UpdateLdpsComputeGroupResponse> updateLdpsComputeGroup(UpdateLdpsComputeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLdpsComputeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLdpsComputeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLdpsComputeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLindormV2InstanceParameter  UpdateLindormV2InstanceParameterRequest
     * @return UpdateLindormV2InstanceParameterResponse
     */
    @Override
    public CompletableFuture<UpdateLindormV2InstanceParameterResponse> updateLindormV2InstanceParameter(UpdateLindormV2InstanceParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLindormV2InstanceParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLindormV2InstanceParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLindormV2InstanceParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about how to select the storage type and engine type when you create a Lindorm instance, see <a href="https://help.aliyun.com/document_detail/181971.html">Select engine typpes</a> and <a href="https://help.aliyun.com/document_detail/174643.html">Select storage types</a>.</p>
     * 
     * @param request the request parameters of UpgradeLindormInstance  UpgradeLindormInstanceRequest
     * @return UpgradeLindormInstanceResponse
     */
    @Override
    public CompletableFuture<UpgradeLindormInstanceResponse> upgradeLindormInstance(UpgradeLindormInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeLindormInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeLindormInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeLindormInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeLindormV2StreamEngine  UpgradeLindormV2StreamEngineRequest
     * @return UpgradeLindormV2StreamEngineResponse
     */
    @Override
    public CompletableFuture<UpgradeLindormV2StreamEngineResponse> upgradeLindormV2StreamEngine(UpgradeLindormV2StreamEngineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeLindormV2StreamEngine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeLindormV2StreamEngineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeLindormV2StreamEngineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
