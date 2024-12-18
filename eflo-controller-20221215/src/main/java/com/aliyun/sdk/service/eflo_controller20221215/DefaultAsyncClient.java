// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.eflo_controller20221215.models.*;
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
        this.product = "eflo-controller";
        this.version = "2022-12-15";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ApproveOperation  ApproveOperationRequest
     * @return ApproveOperationResponse
     */
    @Override
    public CompletableFuture<ApproveOperationResponse> approveOperation(ApproveOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApproveOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApproveOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApproveOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
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
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    @Override
    public CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClusterResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCluster  DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    @Override
    public CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInvocations  DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    @Override
    public CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvocations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInvocationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInvocationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNode  DescribeNodeRequest
     * @return DescribeNodeResponse
     */
    @Override
    public CompletableFuture<DescribeNodeResponse> describeNode(DescribeNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNodeResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSendFileResults  DescribeSendFileResultsRequest
     * @return DescribeSendFileResultsResponse
     */
    @Override
    public CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSendFileResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSendFileResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSendFileResultsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    @Override
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExtendCluster  ExtendClusterRequest
     * @return ExtendClusterResponse
     */
    @Override
    public CompletableFuture<ExtendClusterResponse> extendCluster(ExtendClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExtendCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExtendClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExtendClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterNodes  ListClusterNodesRequest
     * @return ListClusterNodesResponse
     */
    @Override
    public CompletableFuture<ListClusterNodesResponse> listClusterNodes(ListClusterNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClusterNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterNodesResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFreeNodes  ListFreeNodesRequest
     * @return ListFreeNodesResponse
     */
    @Override
    public CompletableFuture<ListFreeNodesResponse> listFreeNodes(ListFreeNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFreeNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFreeNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFreeNodesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of RebootNodes  RebootNodesRequest
     * @return RebootNodesResponse
     */
    @Override
    public CompletableFuture<RebootNodesResponse> rebootNodes(RebootNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReimageNodes  ReimageNodesRequest
     * @return ReimageNodesResponse
     */
    @Override
    public CompletableFuture<ReimageNodesResponse> reimageNodes(ReimageNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReimageNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReimageNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReimageNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    @Override
    public CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendFile  SendFileRequest
     * @return SendFileResponse
     */
    @Override
    public CompletableFuture<SendFileResponse> sendFile(SendFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ShrinkCluster  ShrinkClusterRequest
     * @return ShrinkClusterResponse
     */
    @Override
    public CompletableFuture<ShrinkClusterResponse> shrinkCluster(ShrinkClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ShrinkCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ShrinkClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ShrinkClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopInvocation  StopInvocationRequest
     * @return StopInvocationResponse
     */
    @Override
    public CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInvocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInvocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInvocationResponse> future = new CompletableFuture<>();
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

}
