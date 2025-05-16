// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ehpc20240730.models.*;
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
        this.product = "EHPC";
        this.version = "2024-07-30";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>The ECS instances must meet the following requirements:</p>
     * <ul>
     * <li>The ECS instances do not belong to any E-HPC cluster.</li>
     * <li>The ECS instances reside in the same virtual private cloud (VPC) as the cluster.</li>
     * <li>The ECS instances are in the Stopped state.
     * Take of the following limits:</li>
     * <li>You can specify multiple instance IDs to add them at a time. However, the instances must be of the same type.</li>
     * <li>When an instance is added to the cluster, <a href="https://help.aliyun.com/zh/ecs/user-guide/re-initialize-a-system-disk">the system disk is reset</a> by using the image specified by the input parameters.</li>
     * <li>If the instance has data disks, they are not automatically created and mounted after the instance is added.</li>
     * <li>The hostname of the instance remains the same. Therefore, you must ensure that the hostname of the instance to be added is different from the hostname of an existing node in the cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachNodes  AttachNodesRequest
     * @return AttachNodesResponse
     */
    @Override
    public CompletableFuture<AttachNodesResponse> attachNodes(AttachNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The file system that you want to attach must be created in advance in the same virtual private cloud (VPC) as the destination cluster. For more information, see <a href="https://help.aliyun.com/document_detail/27530.html">Create a file system</a> and <a href="https://help.aliyun.com/document_detail/27531.html">Manage mount targets</a>.</li>
     * <li>E-HPC clusters support Apsara File Storage NAS file systems.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachSharedStorages  AttachSharedStoragesRequest
     * @return AttachSharedStoragesResponse
     */
    @Override
    public CompletableFuture<AttachSharedStoragesResponse> attachSharedStorages(AttachSharedStoragesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachSharedStorages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachSharedStoragesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachSharedStoragesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you call this operation, make sure that you are familiar with the billing and pricing of E-HPC. For more information, see <a href="https://help.aliyun.com/document_detail/2842985.html">Overview</a>.</p>
     * 
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
     * <p>Before you call this operation, make sure that you understand the billing and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of E-HPC.</p>
     * 
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    @Override
    public CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * 
     * @param request the request parameters of CreateNodes  CreateNodesRequest
     * @return CreateNodesResponse
     */
    @Override
    public CompletableFuture<CreateNodesResponse> createNodes(CreateNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQueue  CreateQueueRequest
     * @return CreateQueueResponse
     */
    @Override
    public CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQueueResponse> future = new CompletableFuture<>();
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
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Make sure that data of the cluster to be deleted is backed up before you call this operation.</p>
     * <blockquote>
     * <p>After a cluster is released, you cannot restore the data stored in the cluster. Exercise caution when you release a cluster.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * @param request the request parameters of DeleteNodes  DeleteNodesRequest
     * @return DeleteNodesResponse
     */
    @Override
    public CompletableFuture<DeleteNodesResponse> deleteNodes(DeleteNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a queue, you must delete all compute nodes in the queue.</p>
     * 
     * @param request the request parameters of DeleteQueues  DeleteQueuesRequest
     * @return DeleteQueuesResponse
     */
    @Override
    public CompletableFuture<DeleteQueuesResponse> deleteQueues(DeleteQueuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQueues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQueuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQueuesResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUsers").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAddonTemplate  DescribeAddonTemplateRequest
     * @return DescribeAddonTemplateResponse
     */
    @Override
    public CompletableFuture<DescribeAddonTemplateResponse> describeAddonTemplate(DescribeAddonTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAddonTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAddonTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAddonTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetachSharedStorages  DetachSharedStoragesRequest
     * @return DetachSharedStoragesResponse
     */
    @Override
    public CompletableFuture<DetachSharedStoragesResponse> detachSharedStorages(DetachSharedStoragesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachSharedStorages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachSharedStoragesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachSharedStoragesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAddon  GetAddonRequest
     * @return GetAddonResponse
     */
    @Override
    public CompletableFuture<GetAddonResponse> getAddon(GetAddonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAddon").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAddonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAddonResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetCommonLogDetail  GetCommonLogDetailRequest
     * @return GetCommonLogDetailResponse
     */
    @Override
    public CompletableFuture<GetCommonLogDetailResponse> getCommonLogDetail(GetCommonLogDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCommonLogDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCommonLogDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCommonLogDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    @Override
    public CompletableFuture<GetJobResponse> getJob(GetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Currently, only Slurm and PBS Pro schedulers for Standard Edition clusters are supported.</p>
     * 
     * @param request the request parameters of GetJobLog  GetJobLogRequest
     * @return GetJobLogResponse
     */
    @Override
    public CompletableFuture<GetJobLogResponse> getJobLog(GetJobLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQueue  GetQueueRequest
     * @return GetQueueResponse
     */
    @Override
    public CompletableFuture<GetQueueResponse> getQueue(GetQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cluster must be in the <code>Running</code> state.</li>
     * <li>Clusters fall into two types:<ul>
     * <li>Regular clusters on Alibaba Cloud Public Cloud</li>
     * <li>Managed clusters on Alibaba Cloud Public Cloud</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of InstallAddon  InstallAddonRequest
     * @return InstallAddonResponse
     */
    @Override
    public CompletableFuture<InstallAddonResponse> installAddon(InstallAddonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallAddon").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallAddonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallAddonResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>When calling this interface, please note the following:</p>
     * <ul>
     * <li>The cluster status must be <code>Running</code>. </li>
     * <li>If the cluster series is <code>Serverless</code>, ensure that there is at least one login node or compute node in the cluster; otherwise, software cannot be added to the target cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of InstallSoftwares  InstallSoftwaresRequest
     * @return InstallSoftwaresResponse
     */
    @Override
    public CompletableFuture<InstallSoftwaresResponse> installSoftwares(InstallSoftwaresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallSoftwares").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallSoftwaresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallSoftwaresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAddonTemplates  ListAddonTemplatesRequest
     * @return ListAddonTemplatesResponse
     */
    @Override
    public CompletableFuture<ListAddonTemplatesResponse> listAddonTemplates(ListAddonTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAddonTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAddonTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAddonTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    @Override
    public CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAddons").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAddonsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAddonsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvailableFileSystems  ListAvailableFileSystemsRequest
     * @return ListAvailableFileSystemsResponse
     */
    @Override
    public CompletableFuture<ListAvailableFileSystemsResponse> listAvailableFileSystems(ListAvailableFileSystemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvailableFileSystems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableFileSystemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableFileSystemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvailableImages  ListAvailableImagesRequest
     * @return ListAvailableImagesResponse
     */
    @Override
    public CompletableFuture<ListAvailableImagesResponse> listAvailableImages(ListAvailableImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvailableImages").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableImagesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListCommonLogs  ListCommonLogsRequest
     * @return ListCommonLogsResponse
     */
    @Override
    public CompletableFuture<ListCommonLogsResponse> listCommonLogs(ListCommonLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCommonLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCommonLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCommonLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstalledSoftwares  ListInstalledSoftwaresRequest
     * @return ListInstalledSoftwaresResponse
     */
    @Override
    public CompletableFuture<ListInstalledSoftwaresResponse> listInstalledSoftwares(ListInstalledSoftwaresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstalledSoftwares").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstalledSoftwaresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstalledSoftwaresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    @Override
    public CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListQueues  ListQueuesRequest
     * @return ListQueuesResponse
     */
    @Override
    public CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListQueues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListQueuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListQueuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSharedStorages  ListSharedStoragesRequest
     * @return ListSharedStoragesResponse
     */
    @Override
    public CompletableFuture<ListSharedStoragesResponse> listSharedStorages(ListSharedStoragesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSharedStorages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSharedStoragesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSharedStoragesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSoftwares  ListSoftwaresRequest
     * @return ListSoftwaresResponse
     */
    @Override
    public CompletableFuture<ListSoftwaresResponse> listSoftwares(ListSoftwaresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSoftwares").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSoftwaresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSoftwaresResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsers").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopJobs  StopJobsRequest
     * @return StopJobsResponse
     */
    @Override
    public CompletableFuture<StopJobsResponse> stopJobs(StopJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cluster must be in the <code>Running</code> state.</li>
     * <li>Clusters fall into the following types:<ul>
     * <li>Regular clusters on Alibaba Cloud Public Cloud</li>
     * <li>Managed clusters on Alibaba Cloud Public Cloud</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UnInstallAddon  UnInstallAddonRequest
     * @return UnInstallAddonResponse
     */
    @Override
    public CompletableFuture<UnInstallAddonResponse> unInstallAddon(UnInstallAddonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnInstallAddon").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnInstallAddonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnInstallAddonResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>When calling this interface, please note:
     * The cluster status must be <code>Running</code>.</p>
     * 
     * @param request the request parameters of UninstallSoftwares  UninstallSoftwaresRequest
     * @return UninstallSoftwaresResponse
     */
    @Override
    public CompletableFuture<UninstallSoftwaresResponse> uninstallSoftwares(UninstallSoftwaresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UninstallSoftwares").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallSoftwaresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallSoftwaresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCluster  UpdateClusterRequest
     * @return UpdateClusterResponse
     */
    @Override
    public CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * @param request the request parameters of UpdateNodes  UpdateNodesRequest
     * @return UpdateNodesResponse
     */
    @Override
    public CompletableFuture<UpdateNodesResponse> updateNodes(UpdateNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQueue  UpdateQueueRequest
     * @return UpdateQueueResponse
     */
    @Override
    public CompletableFuture<UpdateQueueResponse> updateQueue(UpdateQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    @Override
    public CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
