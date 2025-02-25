// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dbfs20200418.models.*;
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
        this.product = "DBFS";
        this.version = "2020-04-18";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "dbfs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dbfs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-fujian", "dbfs.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dbfs.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dbfs.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dbfs.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dbfs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dbfs.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "dbfs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dbfs.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dbfs.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dbfs.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dbfs.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddTagsBatch  AddTagsBatchRequest
     * @return AddTagsBatchResponse
     */
    @Override
    public CompletableFuture<AddTagsBatchResponse> addTagsBatch(AddTagsBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTagsBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTagsBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTagsBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachDbfs  AttachDbfsRequest
     * @return AttachDbfsResponse
     */
    @Override
    public CompletableFuture<AttachDbfsResponse> attachDbfs(AttachDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelAutoSnapshotPolicy  CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDbfs  CreateDbfsRequest
     * @return CreateDbfsResponse
     */
    @Override
    public CompletableFuture<CreateDbfsResponse> createDbfs(CreateDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    @Override
    public CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    @Override
    public CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAutoSnapshotPolicy  DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDbfs  DeleteDbfsRequest
     * @return DeleteDbfsResponse
     */
    @Override
    public CompletableFuture<DeleteDbfsResponse> deleteDbfs(DeleteDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    @Override
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTagsBatch  DeleteTagsBatchRequest
     * @return DeleteTagsBatchResponse
     */
    @Override
    public CompletableFuture<DeleteTagsBatchResponse> deleteTagsBatch(DeleteTagsBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTagsBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTagsBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTagsBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDbfsSpecifications  DescribeDbfsSpecificationsRequest
     * @return DescribeDbfsSpecificationsResponse
     */
    @Override
    public CompletableFuture<DescribeDbfsSpecificationsResponse> describeDbfsSpecifications(DescribeDbfsSpecificationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDbfsSpecifications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDbfsSpecificationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDbfsSpecificationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceTypes  DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetachDbfs  DetachDbfsRequest
     * @return DetachDbfsResponse
     */
    @Override
    public CompletableFuture<DetachDbfsResponse> detachDbfs(DetachDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAutoSnapshotPolicy  GetAutoSnapshotPolicyRequest
     * @return GetAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<GetAutoSnapshotPolicyResponse> getAutoSnapshotPolicy(GetAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDbfs  GetDbfsRequest
     * @return GetDbfsResponse
     */
    @Override
    public CompletableFuture<GetDbfsResponse> getDbfs(GetDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceLinkedRole  GetServiceLinkedRoleRequest
     * @return GetServiceLinkedRoleResponse
     */
    @Override
    public CompletableFuture<GetServiceLinkedRoleResponse> getServiceLinkedRole(GetServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSnapshotLink  GetSnapshotLinkRequest
     * @return GetSnapshotLinkResponse
     */
    @Override
    public CompletableFuture<GetSnapshotLinkResponse> getSnapshotLink(GetSnapshotLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSnapshotLink").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSnapshotLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSnapshotLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAutoSnapshotPolicies  ListAutoSnapshotPoliciesRequest
     * @return ListAutoSnapshotPoliciesResponse
     */
    @Override
    public CompletableFuture<ListAutoSnapshotPoliciesResponse> listAutoSnapshotPolicies(ListAutoSnapshotPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoSnapshotPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoSnapshotPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoSnapshotPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAutoSnapshotPolicyAppliedDbfs  ListAutoSnapshotPolicyAppliedDbfsRequest
     * @return ListAutoSnapshotPolicyAppliedDbfsResponse
     */
    @Override
    public CompletableFuture<ListAutoSnapshotPolicyAppliedDbfsResponse> listAutoSnapshotPolicyAppliedDbfs(ListAutoSnapshotPolicyAppliedDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoSnapshotPolicyAppliedDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoSnapshotPolicyAppliedDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoSnapshotPolicyAppliedDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAutoSnapshotPolicyUnappliedDbfs  ListAutoSnapshotPolicyUnappliedDbfsRequest
     * @return ListAutoSnapshotPolicyUnappliedDbfsResponse
     */
    @Override
    public CompletableFuture<ListAutoSnapshotPolicyUnappliedDbfsResponse> listAutoSnapshotPolicyUnappliedDbfs(ListAutoSnapshotPolicyUnappliedDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAutoSnapshotPolicyUnappliedDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAutoSnapshotPolicyUnappliedDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAutoSnapshotPolicyUnappliedDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDbfs  ListDbfsRequest
     * @return ListDbfsResponse
     */
    @Override
    public CompletableFuture<ListDbfsResponse> listDbfs(ListDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDbfsAttachableEcsInstances  ListDbfsAttachableEcsInstancesRequest
     * @return ListDbfsAttachableEcsInstancesResponse
     */
    @Override
    public CompletableFuture<ListDbfsAttachableEcsInstancesResponse> listDbfsAttachableEcsInstances(ListDbfsAttachableEcsInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDbfsAttachableEcsInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDbfsAttachableEcsInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDbfsAttachableEcsInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDbfsAttachedEcsInstances  ListDbfsAttachedEcsInstancesRequest
     * @return ListDbfsAttachedEcsInstancesResponse
     */
    @Override
    public CompletableFuture<ListDbfsAttachedEcsInstancesResponse> listDbfsAttachedEcsInstances(ListDbfsAttachedEcsInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDbfsAttachedEcsInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDbfsAttachedEcsInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDbfsAttachedEcsInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSnapshot  ListSnapshotRequest
     * @return ListSnapshotResponse
     */
    @Override
    public CompletableFuture<ListSnapshotResponse> listSnapshot(ListSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSnapshotLinks  ListSnapshotLinksRequest
     * @return ListSnapshotLinksResponse
     */
    @Override
    public CompletableFuture<ListSnapshotLinksResponse> listSnapshotLinks(ListSnapshotLinksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSnapshotLinks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSnapshotLinksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSnapshotLinksResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModifyAutoSnapshotPolicy  ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySnapshotAttribute  ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     */
    @Override
    public CompletableFuture<ModifySnapshotAttributeResponse> modifySnapshotAttribute(ModifySnapshotAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnapshotAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySnapshotAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySnapshotAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenameDbfs  RenameDbfsRequest
     * @return RenameDbfsResponse
     */
    @Override
    public CompletableFuture<RenameDbfsResponse> renameDbfs(RenameDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenameDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResizeDbfs  ResizeDbfsRequest
     * @return ResizeDbfsResponse
     */
    @Override
    public CompletableFuture<ResizeDbfsResponse> resizeDbfs(ResizeDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResizeDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResizeDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResizeDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagDbfs  TagDbfsRequest
     * @return TagDbfsResponse
     */
    @Override
    public CompletableFuture<TagDbfsResponse> tagDbfs(TagDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDbfs  UpdateDbfsRequest
     * @return UpdateDbfsResponse
     */
    @Override
    public CompletableFuture<UpdateDbfsResponse> updateDbfs(UpdateDbfsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDbfs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDbfsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDbfsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
