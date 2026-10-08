// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.fc20230330.models.*;
import com.aliyun.sdk.gateway.pop.Configuration;
import com.aliyun.sdk.gateway.pop.auth.SignatureVersion;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder().serviceConfiguration(Configuration.create().setSignatureVersion(SignatureVersion.V3));
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * <b>description</b> :
     * <p>To change the resource group of a Function Compute resource, you must have the ChangeResourceGroup permission for both the current and target resource groups.</p>
     * 
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateAlias  CreateAliasRequest
     * @return CreateAliasResponse
     */
    CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request);

    /**
     * <b>description</b> :
     * <p>You can attach a custom domain name to an application or function in Function Compute to access it through a fixed domain name in a production environment, or to resolve the forced download behavior when you access an HTTP trigger.</p>
     * 
     * @param request the request parameters of CreateCustomDomain  CreateCustomDomainRequest
     * @return CreateCustomDomainResponse
     */
    CompletableFuture<CreateCustomDomainResponse> createCustomDomain(CreateCustomDomainRequest request);

    /**
     * <b>description</b> :
     * <p>When you create a function by using an OSS code package, if the error &quot;unable to access object xxx in bucket xxx&quot; is reported, grant the current user access permissions on the OSS bucket. For example, you can use the system access policy AliyunOSSReadOnlyAccess or a custom policy with finer granularity such as authorization for oss:GetObject. For details about the policy content, see <a href="https://help.aliyun.com/document_detail/199058.html">Grant a Resource Access Management (RAM) user permissions to read all resources in a bucket</a>.</p>
     * 
     * @param request the request parameters of CreateFunction  CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    /**
     * @param request the request parameters of CreateLayerVersion  CreateLayerVersionRequest
     * @return CreateLayerVersionResponse
     */
    CompletableFuture<CreateLayerVersionResponse> createLayerVersion(CreateLayerVersionRequest request);

    /**
     * @param request the request parameters of CreateSession  CreateSessionRequest
     * @return CreateSessionResponse
     */
    CompletableFuture<CreateSessionResponse> createSession(CreateSessionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation creates a user snapshot from a specified micro-sandbox session.</li>
     * <li>The optional parameter <code>qualifier</code> identifies the valid alias or specific function version used when creating the source session. If omitted, it defaults to <code>LATEST</code>.</li>
     * <li>The <code>sessionId</code> parameter is required to specify the client session ID from which to create the snapshot.</li>
     * <li>The <code>description</code> parameter is optional. If provided, it cannot contain control characters and is limited to 256 UTF-8 bytes.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * @param request the request parameters of CreateTrigger  CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    /**
     * @param request the request parameters of CreateVpcBinding  CreateVpcBindingRequest
     * @return CreateVpcBindingResponse
     */
    CompletableFuture<CreateVpcBindingResponse> createVpcBinding(CreateVpcBindingRequest request);

    /**
     * @param request the request parameters of DeleteAlias  DeleteAliasRequest
     * @return DeleteAliasResponse
     */
    CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request);

    /**
     * @param request the request parameters of DeleteAsyncInvokeConfig  DeleteAsyncInvokeConfigRequest
     * @return DeleteAsyncInvokeConfigResponse
     */
    CompletableFuture<DeleteAsyncInvokeConfigResponse> deleteAsyncInvokeConfig(DeleteAsyncInvokeConfigRequest request);

    /**
     * @param request the request parameters of DeleteConcurrencyConfig  DeleteConcurrencyConfigRequest
     * @return DeleteConcurrencyConfigResponse
     */
    CompletableFuture<DeleteConcurrencyConfigResponse> deleteConcurrencyConfig(DeleteConcurrencyConfigRequest request);

    /**
     * @param request the request parameters of DeleteCustomDomain  DeleteCustomDomainRequest
     * @return DeleteCustomDomainResponse
     */
    CompletableFuture<DeleteCustomDomainResponse> deleteCustomDomain(DeleteCustomDomainRequest request);

    /**
     * @param request the request parameters of DeleteFunction  DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    /**
     * @param request the request parameters of DeleteFunctionVersion  DeleteFunctionVersionRequest
     * @return DeleteFunctionVersionResponse
     */
    CompletableFuture<DeleteFunctionVersionResponse> deleteFunctionVersion(DeleteFunctionVersionRequest request);

    /**
     * @param request the request parameters of DeleteLayerVersion  DeleteLayerVersionRequest
     * @return DeleteLayerVersionResponse
     */
    CompletableFuture<DeleteLayerVersionResponse> deleteLayerVersion(DeleteLayerVersionRequest request);

    /**
     * @param request the request parameters of DeleteProvisionConfig  DeleteProvisionConfigRequest
     * @return DeleteProvisionConfigResponse
     */
    CompletableFuture<DeleteProvisionConfigResponse> deleteProvisionConfig(DeleteProvisionConfigRequest request);

    /**
     * @param request the request parameters of DeleteScalingConfig  DeleteScalingConfigRequest
     * @return DeleteScalingConfigResponse
     */
    CompletableFuture<DeleteScalingConfigResponse> deleteScalingConfig(DeleteScalingConfigRequest request);

    /**
     * @param request the request parameters of DeleteSession  DeleteSessionRequest
     * @return DeleteSessionResponse
     */
    CompletableFuture<DeleteSessionResponse> deleteSession(DeleteSessionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation deletes a user MicroSandbox snapshot under the specified function.</li>
     * <li>After successful deletion, the snapshot enters an asynchronous deletion process. The operation returns 202 Accepted to indicate that the deletion request has been accepted, without waiting for the cleanup of underlying physical resources such as templates and artifacts to complete.</li>
     * <li>Repeated deletion of a snapshot that is already being deleted still returns 202 Accepted.</li>
     * <li>If the specified snapshot does not exist under the current function scope, 204 No Content is returned to support idempotent deletion.</li>
     * <li>If the snapshot is still being used by a resumed session, or there are consumer relations that have not been confirmed as clearable, 409 SnapshotInUse is returned and the snapshot is not deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteTrigger  DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    /**
     * @param request the request parameters of DeleteVpcBinding  DeleteVpcBindingRequest
     * @return DeleteVpcBindingResponse
     */
    CompletableFuture<DeleteVpcBindingResponse> deleteVpcBinding(DeleteVpcBindingRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Use caution when calling this API for functions in a production environment because disabling function invocations can disrupt your services.</p>
     * 
     * @param request the request parameters of DisableFunctionInvocation  DisableFunctionInvocationRequest
     * @return DisableFunctionInvocationResponse
     */
    CompletableFuture<DisableFunctionInvocationResponse> disableFunctionInvocation(DisableFunctionInvocationRequest request);

    /**
     * @param request the request parameters of EnableFunctionInvocation  EnableFunctionInvocationRequest
     * @return EnableFunctionInvocationResponse
     */
    CompletableFuture<EnableFunctionInvocationResponse> enableFunctionInvocation(EnableFunctionInvocationRequest request);

    /**
     * @param request the request parameters of GetAlias  GetAliasRequest
     * @return GetAliasResponse
     */
    CompletableFuture<GetAliasResponse> getAlias(GetAliasRequest request);

    /**
     * @param request the request parameters of GetAsyncInvokeConfig  GetAsyncInvokeConfigRequest
     * @return GetAsyncInvokeConfigResponse
     */
    CompletableFuture<GetAsyncInvokeConfigResponse> getAsyncInvokeConfig(GetAsyncInvokeConfigRequest request);

    /**
     * @param request the request parameters of GetAsyncTask  GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request);

    /**
     * @param request the request parameters of GetConcurrencyConfig  GetConcurrencyConfigRequest
     * @return GetConcurrencyConfigResponse
     */
    CompletableFuture<GetConcurrencyConfigResponse> getConcurrencyConfig(GetConcurrencyConfigRequest request);

    /**
     * @param request the request parameters of GetCustomDomain  GetCustomDomainRequest
     * @return GetCustomDomainResponse
     */
    CompletableFuture<GetCustomDomainResponse> getCustomDomain(GetCustomDomainRequest request);

    /**
     * @param request the request parameters of GetFunction  GetFunctionRequest
     * @return GetFunctionResponse
     */
    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    /**
     * @param request the request parameters of GetFunctionCode  GetFunctionCodeRequest
     * @return GetFunctionCodeResponse
     */
    CompletableFuture<GetFunctionCodeResponse> getFunctionCode(GetFunctionCodeRequest request);

    /**
     * @param request the request parameters of GetLayerVersion  GetLayerVersionRequest
     * @return GetLayerVersionResponse
     */
    CompletableFuture<GetLayerVersionResponse> getLayerVersion(GetLayerVersionRequest request);

    /**
     * @param request the request parameters of GetLayerVersionByArn  GetLayerVersionByArnRequest
     * @return GetLayerVersionByArnResponse
     */
    CompletableFuture<GetLayerVersionByArnResponse> getLayerVersionByArn(GetLayerVersionByArnRequest request);

    /**
     * @param request the request parameters of GetProvisionConfig  GetProvisionConfigRequest
     * @return GetProvisionConfigResponse
     */
    CompletableFuture<GetProvisionConfigResponse> getProvisionConfig(GetProvisionConfigRequest request);

    /**
     * @param request the request parameters of GetScalingConfig  GetScalingConfigRequest
     * @return GetScalingConfigResponse
     */
    CompletableFuture<GetScalingConfigResponse> getScalingConfig(GetScalingConfigRequest request);

    /**
     * @param request the request parameters of GetSession  GetSessionRequest
     * @return GetSessionResponse
     */
    CompletableFuture<GetSessionResponse> getSession(GetSessionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation retrieves the MicroSandbox snapshot information of a specified function for the user.</li>
     * <li>Snapshot details are returned only when the snapshot belongs to the current function, has a status of Available, and has not expired.</li>
     * <li>If the snapshot does not exist, has expired, is being created, is being deleted, is an internal snapshot, or does not belong to the current function, it is treated as invisible and a 404 SnapshotNotFound error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSnapshot  GetSnapshotRequest
     * @return GetSnapshotResponse
     */
    CompletableFuture<GetSnapshotResponse> getSnapshot(GetSnapshotRequest request);

    /**
     * @param request the request parameters of GetTrigger  GetTriggerRequest
     * @return GetTriggerResponse
     */
    CompletableFuture<GetTriggerResponse> getTrigger(GetTriggerRequest request);

    /**
     * @param request the request parameters of InvokeFunction  InvokeFunctionRequest
     * @return InvokeFunctionResponse
     */
    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunctionWithRequestBody(InvokeFunctionRequest request, RequestBody requestBody);

<ReturnT> CompletableFuture<ReturnT> invokeFunctionWithAsyncResponseHandler(InvokeFunctionRequest request, AsyncResponseHandler<InvokeFunctionResponse, ReturnT> responseHandler);

    /**
     * @param request the request parameters of ListAliases  ListAliasesRequest
     * @return ListAliasesResponse
     */
    CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request);

    /**
     * @param request the request parameters of ListAsyncInvokeConfigs  ListAsyncInvokeConfigsRequest
     * @return ListAsyncInvokeConfigsResponse
     */
    CompletableFuture<ListAsyncInvokeConfigsResponse> listAsyncInvokeConfigs(ListAsyncInvokeConfigsRequest request);

    /**
     * @param request the request parameters of ListAsyncTasks  ListAsyncTasksRequest
     * @return ListAsyncTasksResponse
     */
    CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request);

    /**
     * @param request the request parameters of ListConcurrencyConfigs  ListConcurrencyConfigsRequest
     * @return ListConcurrencyConfigsResponse
     */
    CompletableFuture<ListConcurrencyConfigsResponse> listConcurrencyConfigs(ListConcurrencyConfigsRequest request);

    /**
     * @param request the request parameters of ListCustomDomains  ListCustomDomainsRequest
     * @return ListCustomDomainsResponse
     */
    CompletableFuture<ListCustomDomainsResponse> listCustomDomains(ListCustomDomainsRequest request);

    /**
     * @param request the request parameters of ListFunctionVersions  ListFunctionVersionsRequest
     * @return ListFunctionVersionsResponse
     */
    CompletableFuture<ListFunctionVersionsResponse> listFunctionVersions(ListFunctionVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>ListFunctions returns only a subset of function attribute fields. To retrieve more attribute fields for a specific function, including state, stateReasonCode, stateReason, lastUpdateStatus, lastUpdateStatusReasonCode, and lastUpdateStatusReason, use <a href="https://help.aliyun.com/document_detail/2618610.html">GetFunction</a>.</p>
     * 
     * @param request the request parameters of ListFunctions  ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListLayerVersions  ListLayerVersionsRequest
     * @return ListLayerVersionsResponse
     */
    CompletableFuture<ListLayerVersionsResponse> listLayerVersions(ListLayerVersionsRequest request);

    /**
     * @param request the request parameters of ListLayers  ListLayersRequest
     * @return ListLayersResponse
     */
    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    /**
     * @param request the request parameters of ListProvisionConfigs  ListProvisionConfigsRequest
     * @return ListProvisionConfigsResponse
     */
    CompletableFuture<ListProvisionConfigsResponse> listProvisionConfigs(ListProvisionConfigsRequest request);

    /**
     * @param request the request parameters of ListScalingConfigs  ListScalingConfigsRequest
     * @return ListScalingConfigsResponse
     */
    CompletableFuture<ListScalingConfigsResponse> listScalingConfigs(ListScalingConfigsRequest request);

    /**
     * @param request the request parameters of ListSessions  ListSessionsRequest
     * @return ListSessionsResponse
     */
    CompletableFuture<ListSessionsResponse> listSessions(ListSessionsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation lists MicroSandbox snapshots visible to the current account.</li>
     * <li>Only unexpired snapshots in the Available state are returned.</li>
     * <li>Four filtering methods are supported: account-level listing, filtering by function, filtering by function and source session ID, and filtering by function, source session ID, and qualifier at creation time.</li>
     * <li>Results are paginated in stable descending order by creation time and snapshot ID.</li>
     * <li>ListSnapshots uses a search index for queries, so eventual consistency delays may occur within a short period. GetSnapshot and creating a session from a snapshot use strongly consistent reads from the primary table.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTriggers  ListTriggersRequest
     * @return ListTriggersResponse
     */
    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    /**
     * @param request the request parameters of ListVpcBindings  ListVpcBindingsRequest
     * @return ListVpcBindingsResponse
     */
    CompletableFuture<ListVpcBindingsResponse> listVpcBindings(ListVpcBindingsRequest request);

    /**
     * <b>description</b> :
     * <p>Pauses an Active session by persisting the state of its associated execution environment and then releasing compute resources. After you invoke this operation, the session status changes to Paused, and the session no longer accepts function invocation requests. This operation retains the session configuration (such as SessionTTL) and SessionID. You can use it to break long-running tasks or save snapshots of development environments for cost optimization and state management. This operation applies to custom image functions configured with the HEADER_FIELD or GENERATED_COOKIE affinity type and session isolation.</p>
     * 
     * @param request the request parameters of PauseSession  PauseSessionRequest
     * @return PauseSessionResponse
     */
    CompletableFuture<PauseSessionResponse> pauseSession(PauseSessionRequest request);

    /**
     * @param request the request parameters of PublishFunctionVersion  PublishFunctionVersionRequest
     * @return PublishFunctionVersionResponse
     */
    CompletableFuture<PublishFunctionVersionResponse> publishFunctionVersion(PublishFunctionVersionRequest request);

    /**
     * @param request the request parameters of PutAsyncInvokeConfig  PutAsyncInvokeConfigRequest
     * @return PutAsyncInvokeConfigResponse
     */
    CompletableFuture<PutAsyncInvokeConfigResponse> putAsyncInvokeConfig(PutAsyncInvokeConfigRequest request);

    /**
     * @param request the request parameters of PutConcurrencyConfig  PutConcurrencyConfigRequest
     * @return PutConcurrencyConfigResponse
     */
    CompletableFuture<PutConcurrencyConfigResponse> putConcurrencyConfig(PutConcurrencyConfigRequest request);

    /**
     * @param request the request parameters of PutLayerACL  PutLayerACLRequest
     * @return PutLayerACLResponse
     */
    CompletableFuture<PutLayerACLResponse> putLayerACL(PutLayerACLRequest request);

    /**
     * @param request the request parameters of PutProvisionConfig  PutProvisionConfigRequest
     * @return PutProvisionConfigResponse
     */
    CompletableFuture<PutProvisionConfigResponse> putProvisionConfig(PutProvisionConfigRequest request);

    /**
     * @param request the request parameters of PutScalingConfig  PutScalingConfigRequest
     * @return PutScalingConfigResponse
     */
    CompletableFuture<PutScalingConfigResponse> putScalingConfig(PutScalingConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Resumes a session that is in the Paused state. The system quickly restores the session in a new execution environment based on the previously persisted state, returning it to the state before it was paused. After the session is successfully resumed, its status changes back to Active, and it can continue to accept function calling requests that are routed to the restored instance. This operation applies to custom image functions that are configured with the HEADER_FIELD or GENERATED_COOKIE affinity type and session isolation.</p>
     * 
     * @param request the request parameters of ResumeSession  ResumeSessionRequest
     * @return ResumeSessionResponse
     */
    CompletableFuture<ResumeSessionResponse> resumeSession(ResumeSessionRequest request);

    /**
     * @param request the request parameters of StopAsyncTask  StopAsyncTaskRequest
     * @return StopAsyncTaskResponse
     */
    CompletableFuture<StopAsyncTaskResponse> stopAsyncTask(StopAsyncTaskRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAlias  UpdateAliasRequest
     * @return UpdateAliasResponse
     */
    CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request);

    /**
     * @param request the request parameters of UpdateCustomDomain  UpdateCustomDomainRequest
     * @return UpdateCustomDomainResponse
     */
    CompletableFuture<UpdateCustomDomainResponse> updateCustomDomain(UpdateCustomDomainRequest request);

    /**
     * @param request the request parameters of UpdateFunction  UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    /**
     * @param request the request parameters of UpdateSession  UpdateSessionRequest
     * @return UpdateSessionResponse
     */
    CompletableFuture<UpdateSessionResponse> updateSession(UpdateSessionRequest request);

    /**
     * @param request the request parameters of UpdateTrigger  UpdateTriggerRequest
     * @return UpdateTriggerResponse
     */
    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

}
