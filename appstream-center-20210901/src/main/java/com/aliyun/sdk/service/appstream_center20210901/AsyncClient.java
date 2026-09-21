// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appstream_center20210901.models.*;
import darabonba.core.*;
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

    /**
     * @param request the request parameters of ApproveOtaTask  ApproveOtaTaskRequest
     * @return ApproveOtaTaskResponse
     */
    CompletableFuture<ApproveOtaTaskResponse> approveOtaTask(ApproveOtaTaskRequest request);

    /**
     * @param request the request parameters of AssignWuyingServerPrivateAddresses  AssignWuyingServerPrivateAddressesRequest
     * @return AssignWuyingServerPrivateAddressesResponse
     */
    CompletableFuture<AssignWuyingServerPrivateAddressesResponse> assignWuyingServerPrivateAddresses(AssignWuyingServerPrivateAddressesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you change assigned users, the selected users receive notification emails. Changes typically take about 2 minutes to take effect on the client.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AuthorizeInstanceGroup  AuthorizeInstanceGroupRequest
     * @return AuthorizeInstanceGroupResponse
     */
    CompletableFuture<AuthorizeInstanceGroupResponse> authorizeInstanceGroup(AuthorizeInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation manages user authorization for a delivery group at the application level. The authorization result applies only to the application specified by AppId and does not affect the authorization of other applications in the delivery group. To authorize users for an entire delivery group, call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The delivery group is created, and <strong>the application specified by AppId is deployed in the image used by the delivery group</strong>. Otherwise, the error code <code>InvalidAppId.NotFound</code> is returned.</li>
     * <li>The delivery group <strong>has not been added to a delivery group set that is in effect</strong>. A delivery group that has been added to a set cannot be authorized individually. You must authorize it through the set. Otherwise, the error code <code>InvalidAppInstanceGroup.AuthorizeBlockedBySet</code> is returned.</li>
     * <li>If the workspace to which the delivery group belongs is an Active Directory (AD) workspace, <strong>you must specify UserMeta</strong>, with <code>UserMeta.Type</code> set to <code>ad</code> and <code>UserMeta.AdDomain</code> matching the AD domain bound to the workspace.</li>
     * <li>If the delivery group has been authorized through user groups and mixed authorization of users and user groups is not supported, you cannot authorize by user. Otherwise, the error code <code>AuthAppInstanceGroup.MixNotSupported</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>At least one of AuthorizeUserIds and UnAuthorizeUserIds must be specified.</strong> You can also specify both. If both are empty, this invocation does not change any authorization.</li>
     * <li>When adding authorizations, the sum of the currently authorized users for the application and the users to be added cannot exceed the authorized user quota for the application. If the quota is exceeded, the error code <code>ExceedAppAuthUserQuota</code> is returned. Removing authorizations is not subject to quota limits.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId) and the application IDs of deployed applications in the delivery group (AppId in the Apps list).</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the usernames of the users to be authorized or unauthorized.</li>
     * <li>Call this operation to complete the authorization change.<blockquote>
     * <p>After the authorization is changed, the selected users receive a notification email. It typically takes about 2 minutes for the change to take effect on the client.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of AuthorizeUsersForApp  AuthorizeUsersForAppRequest
     * @return AuthorizeUsersForAppResponse
     */
    CompletableFuture<AuthorizeUsersForAppResponse> authorizeUsersForApp(AuthorizeUsersForAppRequest request);

    /**
     * <b>description</b> :
     * <p>You can batch create model templates under a model provider template in the Wuying Agent Management Center. Multiple models can be added at a time, and one of them can be specified as the default model. Existing models are automatically skipped and not created again.
     * Before using this operation, make sure you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of BatchCreateLlmTemplates  BatchCreateLlmTemplatesRequest
     * @return BatchCreateLlmTemplatesResponse
     */
    CompletableFuture<BatchCreateLlmTemplatesResponse> batchCreateLlmTemplates(BatchCreateLlmTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>You can assign a model group to the resources that belong to agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. The model group serves as the inference engine for agents within the resource group to execute tasks.
     * When an agent runtime has its own model group configured and the resource group it belongs to also has a model group configured, the model group bound to the resource group takes effect. The resource group setting has a higher priority than the agent runtime setting.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before calling this operation.</p>
     * 
     * @param request the request parameters of ConfigResourceGroupModelTemplate  ConfigResourceGroupModelTemplateRequest
     * @return ConfigResourceGroupModelTemplateResponse
     */
    CompletableFuture<ConfigResourceGroupModelTemplateResponse> configResourceGroupModelTemplate(ConfigResourceGroupModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can configure third-party channels for Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. These channels serve as extended Agent communication methods beyond the AgentIM channel.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of ConfigRuntimeChannel  ConfigRuntimeChannelRequest
     * @return ConfigRuntimeChannelResponse
     */
    CompletableFuture<ConfigRuntimeChannelResponse> configRuntimeChannel(ConfigRuntimeChannelRequest request);

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. The model groups serve as inference engines for Agent task execution.
     * Make sure that you are familiar with the operations and usage of the Wuying Agent Management Center before calling this operation.</p>
     * 
     * @param request the request parameters of ConfigRuntimeModelTemplate  ConfigRuntimeModelTemplateRequest
     * @return ConfigRuntimeModelTemplateResponse
     */
    CompletableFuture<ConfigRuntimeModelTemplateResponse> configRuntimeModelTemplate(ConfigRuntimeModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing and pricing</a> of WUYING CloudApp.
     * A delivery group is a logical grouping for delivering cloud applications to end users. It includes the underlying cloud application resources, images that contain cloud applications, resource management policies, and user allocation settings. For details, see <a href="https://help.aliyun.com/document_detail/426046.html">Publish a delivery group</a>.</p>
     * 
     * @param request the request parameters of CreateAppInstanceGroup  CreateAppInstanceGroupRequest
     * @return CreateAppInstanceGroupResponse
     */
    CompletableFuture<CreateAppInstanceGroupResponse> createAppInstanceGroup(CreateAppInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Prepare an available office network, image, and instance type in the target business region. Make sure that the account has the required browser configurations and resource quotas.</li>
     * <li>Specify <code>CloudBrowserName</code> and <code>BizRegionId</code>. Set <code>OsType</code> to <code>Windows</code>.</li>
     * <li>Authorized users must be created in advance and must match the account type. Authorized user groups must belong to the current account and match the account type of the office network.</li>
     * <li><strong><code>Users</code> and <code>UserGroupIds</code> cannot both be non-empty.</strong></li>
     * </ul>
     * <h2>MAU billing parameters</h2>
     * <ul>
     * <li>Set <code>ChargeType</code> to <code>PostPaid</code>.</li>
     * <li><strong>Set <code>SubPayType</code> to <code>mau</code> explicitly. Omitting this field does not enable MAU billing.</strong></li>
     * <li>Set <code>ChargeResourceMode</code> to <code>AppInstance</code>.</li>
     * <li>Do not specify <code>Period</code>, <code>PeriodUnit</code>, <code>AppPackageType</code>, <code>AutoPay</code>, <code>AutoRenew</code>, or <code>NodePool</code>.</li>
     * </ul>
     * <h2>Post-call processing</h2>
     * <p><strong>A successful response does not indicate that the browser resources are ready.</strong> After creation, query the browser group status and confirm that the group is connectable before use.
     * This operation creates a new cloud browser group. You do not need to create a delivery group in advance.</p>
     * <h2>Example description</h2>
     * <p>The example values of fields are provided to demonstrate how to specify the fields. Replace resource identifiers with actual values under your account. Capacity examples do not represent default values or upper limits.
     * An example value of <code>-</code> indicates that the field does not need to be specified. Omit the corresponding parameter when you call the operation. Do not pass the character <code>-</code>.</p>
     * 
     * @param request the request parameters of CreateBrowserInstanceGroup  CreateBrowserInstanceGroupRequest
     * @return CreateBrowserInstanceGroupResponse
     */
    CompletableFuture<CreateBrowserInstanceGroupResponse> createBrowserInstanceGroup(CreateBrowserInstanceGroupRequest request);

    /**
     * @param request the request parameters of CreateImageByInstance  CreateImageByInstanceRequest
     * @return CreateImageByInstanceResponse
     */
    CompletableFuture<CreateImageByInstanceResponse> createImageByInstance(CreateImageByInstanceRequest request);

    /**
     * @param request the request parameters of CreateImageFromAppInstanceGroup  CreateImageFromAppInstanceGroupRequest
     * @return CreateImageFromAppInstanceGroupResponse
     */
    CompletableFuture<CreateImageFromAppInstanceGroupResponse> createImageFromAppInstanceGroup(CreateImageFromAppInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can create a model provider template under Model Templates in the WUYING Agent Management Center. This template is used to configure connection information and keys for model services (such as Alibaba Cloud Bailian, Token Plan, and Moonshot) that an Agent can invoke. After model creation, the model provider template is automatically associated with the specified model template.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before you invoke this operation.</p>
     * 
     * @param request the request parameters of CreateModelProviderTemplate  CreateModelProviderTemplateRequest
     * @return CreateModelProviderTemplateResponse
     */
    CompletableFuture<CreateModelProviderTemplateResponse> createModelProviderTemplate(CreateModelProviderTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can create a model group in the Wuying Agent Management Center to manage the model providers and model scope that an Agent can invoke. After model creation, you can attach the model group to a cloud computer as the inference engine configuration for Agent task execution.
     * Make sure that you are familiar with the operations and usage of the Wuying Agent Management Center before invoking this operation.</p>
     * 
     * @param request the request parameters of CreateModelTemplate  CreateModelTemplateRequest
     * @return CreateModelTemplateResponse
     */
    CompletableFuture<CreateModelTemplateResponse> createModelTemplate(CreateModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>A project corresponds to the resource configuration module in the CloudFlow console.</li>
     * <li>When the ContentId input parameter has multiple versions, this API <notice>uses the default version</notice> and bindss it at the same time.</li>
     * <li>This operation succeeds only when the default version of the Content is in an available state.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateWuyingServer  CreateWuyingServerRequest
     * @return CreateWuyingServerResponse
     */
    CompletableFuture<CreateWuyingServerResponse> createWuyingServer(CreateWuyingServerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not support deleting delivery groups that use subscription resources.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAppInstanceGroup  DeleteAppInstanceGroupRequest
     * @return DeleteAppInstanceGroupResponse
     */
    CompletableFuture<DeleteAppInstanceGroupResponse> deleteAppInstanceGroup(DeleteAppInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Only instances in the initializing or idle state can be deleted. This operation is available only to specific customers.</p>
     * 
     * @param request the request parameters of DeleteAppInstances  DeleteAppInstancesRequest
     * @return DeleteAppInstancesResponse
     */
    CompletableFuture<DeleteAppInstancesResponse> deleteAppInstances(DeleteAppInstancesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete only custom images that belong to your account.</li>
     * <li>For images associated with WUYING Cloud Computer Pool, WUYING Cloud Application, or WUYING Workspace product lines, ensure that no WUYING instances are using the image before you delete it.</li>
     * <li>If a WUYING Cloud Desktop template references an image, the template is also deleted when the image is deleted.</li>
     * <li>For images that span multiple regions, deleting the image removes the image from all regions.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete a model template that has been created under a model service provider template in the WUYING Agent Management Center. Before deletion, ensure that the model is not the default model of an associated model group. Otherwise, the deletion fails. After deletion, the model configurations of associated cloud computers are automatically refreshed.
     * Before using this operation, make sure you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of DeleteLlmTemplate  DeleteLlmTemplateRequest
     * @return DeleteLlmTemplateResponse
     */
    CompletableFuture<DeleteLlmTemplateResponse> deleteLlmTemplate(DeleteLlmTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete a model provider template that has been created under model templates in the WUYING Agent Management Center. Before deletion, ensure that the model provider is not the provider of the default model and is not a system preset type provider (such as WUYING credit package). After deletion, the associated models and key configurations are also removed.
     * Before using this operation, make sure you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of DeleteModelProviderTemplate  DeleteModelProviderTemplateRequest
     * @return DeleteModelProviderTemplateResponse
     */
    CompletableFuture<DeleteModelProviderTemplateResponse> deleteModelProviderTemplate(DeleteModelProviderTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete a model group that has been created in the WUYING Agent Management Center. Before deletion, ensure that the template has not been authorized to any resource. Otherwise, the deletion fails. After deletion, the model providers and models under the model group are also removed.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of DeleteModelTemplate  DeleteModelTemplateRequest
     * @return DeleteModelTemplateResponse
     */
    CompletableFuture<DeleteModelTemplateResponse> deleteModelTemplate(DeleteModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a cloud graphics workstation.</p>
     * 
     * @param request the request parameters of DeleteWuyingServer  DeleteWuyingServerRequest
     * @return DeleteWuyingServerResponse
     */
    CompletableFuture<DeleteWuyingServerResponse> deleteWuyingServer(DeleteWuyingServerRequest request);

    /**
     * @param request the request parameters of DeliverToUserSls  DeliverToUserSlsRequest
     * @return DeliverToUserSlsResponse
     */
    CompletableFuture<DeliverToUserSlsResponse> deliverToUserSls(DeliverToUserSlsRequest request);

    /**
     * @param request the request parameters of DescribeWuyingServer  DescribeWuyingServerRequest
     * @return DescribeWuyingServerResponse
     */
    CompletableFuture<DescribeWuyingServerResponse> describeWuyingServer(DescribeWuyingServerRequest request);

    /**
     * @param request the request parameters of DescribeWuyingServerEipInfo  DescribeWuyingServerEipInfoRequest
     * @return DescribeWuyingServerEipInfoResponse
     */
    CompletableFuture<DescribeWuyingServerEipInfoResponse> describeWuyingServerEipInfo(DescribeWuyingServerEipInfoRequest request);

    /**
     * @param request the request parameters of GetAppInstanceGroup  GetAppInstanceGroupRequest
     * @return GetAppInstanceGroupResponse
     */
    CompletableFuture<GetAppInstanceGroupResponse> getAppInstanceGroup(GetAppInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes the query usage for the monthly active user (MAU) billing scenario.</p>
     * <h2>Before you begin</h2>
     * <p>Obtain the cloud browser group ID under the current account. Call <code>ListBrowserInstanceGroup</code> to retrieve the ID.</p>
     * <h2>Response</h2>
     * <p>The response includes the current configuration, status, and authorization statistics of the browser group. The details return up to 20 bookmarks and 20 website access entries. To retrieve the complete lists, call <code>ListBrowserBookmarks</code> and <code>ListBrowserRestrictedURLs</code>.</p>
     * <h2>What to do next</h2>
     * <p>This operation only queries configurations and does not modify resources. After you read the returned status, perform the connection or management operation that corresponds to the status.</p>
     * <h2>Example description</h2>
     * <p>The <code>-</code> value in the examples indicates that the field is not applicable or not returned in the current scenario. It is not an actual string returned by the operation. Sample resource IDs are masked. Use the actual query results when you call this operation.</p>
     * 
     * @param request the request parameters of GetBrowserInstanceGroup  GetBrowserInstanceGroupRequest
     * @return GetBrowserInstanceGroupResponse
     */
    CompletableFuture<GetBrowserInstanceGroupResponse> getBrowserInstanceGroup(GetBrowserInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Call protocol description: operation_type: polling, required_steps: 1.
     * This operation may require multiple calls (at least one) to obtain the connection credential.
     * On the first call, an application instance is allocated to the specified convenience account and the application is started. If a Ticket is returned, the result is obtained synchronously. If a startup task ID (<code>TaskId</code>) is returned, subsequent calls are required.
     * On subsequent calls, include the <code>TaskId</code> request parameter to invoke the operation and query whether the node is complete. When the returned node status (<code>TaskStatus</code>) is completed (<code>Finished</code>), the connection credential (<code>Ticket</code>) is also returned.</p>
     * <blockquote>
     * <p>Prerequisites</p>
     * <ul>
     * <li>Before calling this operation, make sure that you have created a delivery group and authorized users for the delivery group:</li>
     * <li><ol>
     * <li>The API for creating a delivery group is CreateAppInstanceGroup. For more information about the parameters, see the corresponding API documentation.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>You can call the ListAppInstanceGroup operation to query the list of delivery groups. If the corresponding delivery group is not found, verify that the delivery group has been created and that the authentication credentials belong to the correct tenant.</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The API for authorizing users for a delivery group is AuthorizeInstanceGroup. For more information about the parameters, see the corresponding API documentation.</li>
     * </ol>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    /**
     * @param request the request parameters of GetDebugAppInstance  GetDebugAppInstanceRequest
     * @return GetDebugAppInstanceResponse
     */
    CompletableFuture<GetDebugAppInstanceResponse> getDebugAppInstance(GetDebugAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Visitor information is filled in on the lead capture page when visitors execute a cloud flow. Therefore, the usage mode of cloud applications does not generate visitor information.</p>
     * 
     * @param request the request parameters of GetFileUploadInfo  GetFileUploadInfoRequest
     * @return GetFileUploadInfoResponse
     */
    CompletableFuture<GetFileUploadInfoResponse> getFileUploadInfo(GetFileUploadInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the details of a specified model provider template in the WUYING Agent Management Center, including the provider name, description, and connection configuration list.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of GetModelProviderTemplate  GetModelProviderTemplateRequest
     * @return GetModelProviderTemplateResponse
     */
    CompletableFuture<GetModelProviderTemplateResponse> getModelProviderTemplate(GetModelProviderTemplateRequest request);

    /**
     * @param request the request parameters of GetOtaTaskByTaskId  GetOtaTaskByTaskIdRequest
     * @return GetOtaTaskByTaskIdResponse
     */
    CompletableFuture<GetOtaTaskByTaskIdResponse> getOtaTaskByTaskId(GetOtaTaskByTaskIdRequest request);

    /**
     * @param request the request parameters of GetResourcePrice  GetResourcePriceRequest
     * @return GetResourcePriceResponse
     */
    CompletableFuture<GetResourcePriceResponse> getResourcePrice(GetResourcePriceRequest request);

    /**
     * @param request the request parameters of GetResourceRenewPrice  GetResourceRenewPriceRequest
     * @return GetResourceRenewPriceResponse
     */
    CompletableFuture<GetResourceRenewPriceResponse> getResourceRenewPrice(GetResourceRenewPriceRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the third-party channel configuration status of Agents such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of GetRuntimeChannel  GetRuntimeChannelRequest
     * @return GetRuntimeChannelResponse
     */
    CompletableFuture<GetRuntimeChannelResponse> getRuntimeChannel(GetRuntimeChannelRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the model configuration details currently bound to a specified cloud computer in the Wuying Agent Management Center, including model groups, model provider lists, and associated model information. After you enable the risk information mode, you can also identify differences between the end user\&quot;s actual configuration and the configuration delivered by the administrator.</p>
     * 
     * @param request the request parameters of GetRuntimeModelConfig  GetRuntimeModelConfigRequest
     * @return GetRuntimeModelConfigResponse
     */
    CompletableFuture<GetRuntimeModelConfigResponse> getRuntimeModelConfig(GetRuntimeModelConfigRequest request);

    /**
     * @param request the request parameters of ListAppInstanceGroup  ListAppInstanceGroupRequest
     * @return ListAppInstanceGroupResponse
     */
    CompletableFuture<ListAppInstanceGroupResponse> listAppInstanceGroup(ListAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of ListAppInstances  ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    CompletableFuture<ListAppInstancesResponse> listAppInstances(ListAppInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the list of delivery groups for which a specified user (EndUserId) has been granted <strong>delivery group-level authorization</strong>. The response includes basic information about each delivery group (ID, name, status, region, creation time, expiration time, and more) and the list of applications deployed in the delivery group.
     * Scope of returned results:</p>
     * <ul>
     * <li>Only delivery groups that are authorized to the user as a whole through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are returned. Records authorized on a per-application basis through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation are not included.</li>
     * <li>Only delivery groups whose product type matches the ProductType parameter and that have not been deleted are returned. A delivery group is not returned if its image contains no deployed applications.</li>
     * <li>Results are sorted in reverse chronological order by the update time of the authorization record. The most recently authorized or modified delivery groups appear first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the delivery group to the user.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType and EndUserId are required</strong>. If ProductType is not specified, the error code <code>InvalidParameter.ProductType</code> is returned. If EndUserId is not specified, the error code <code>InvalidParameter.UserId</code> is returned.</li>
     * <li>EndUserId performs an <strong>exact match</strong> on the username. AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName all perform <strong>fuzzy matching</strong> (a hit occurs if the value is contained). When multiple filter conditions are specified, all conditions must be met simultaneously.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100.</li>
     * <li>If the user has no authorized delivery groups that match the conditions, the operation returns normally: AppInstanceGroupModels is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID, and then call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the delivery group to the user.</li>
     * <li>Call this operation to query the delivery groups authorized to the user and the applications deployed in each delivery group.</li>
     * <li>To obtain an application connection ticket for the user, call the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation with the AppInstanceGroupId and the AppId from the Apps list in the response.</li>
     * </ol>
     * 
     * @param request the request parameters of ListAuthorizedAppInstanceGroupByUser  ListAuthorizedAppInstanceGroupByUserRequest
     * @return ListAuthorizedAppInstanceGroupByUserResponse
     */
    CompletableFuture<ListAuthorizedAppInstanceGroupByUserResponse> listAuthorizedAppInstanceGroupByUser(ListAuthorizedAppInstanceGroupByUserRequest request);

    /**
     * @param request the request parameters of ListAuthorizedUserGroups  ListAuthorizedUserGroupsRequest
     * @return ListAuthorizedUserGroupsResponse
     */
    CompletableFuture<ListAuthorizedUserGroupsResponse> listAuthorizedUserGroups(ListAuthorizedUserGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The target cloud browser group or delivery group set must be created, belong to the current account, and match the specified <code>ProductType</code>.</li>
     * <li>When querying authorized users of cloud browsers, set <code>ProductType</code> to <code>CloudBrowser</code>.</li>
     * <li><strong>Specify either <code>AppInstanceGroupId</code> or <code>AppInstanceGroupSetId</code>, but not both.</strong></li>
     * </ul>
     * <h2>Query notes</h2>
     * <ul>
     * <li>This operation returns authorization relationships and does not indicate whether users are currently online or sessions are connected.</li>
     * <li>When querying by set, omit <code>AppId</code> and <code>AppInstancePersistentId</code>.</li>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> for pagination and check <code>TotalCount</code> to determine whether to continue querying.</li>
     * </ul>
     * <h2>Example notes</h2>
     * <p>The examples show how to set the fields. Replace resource identifiers with actual values in your account.
     * An example value of <code>-</code> indicates that the parameter does not need to be set. Omit the corresponding parameter when calling the operation. Do not pass the character <code>-</code>.</p>
     * 
     * @param request the request parameters of ListAuthorizedUsers  ListAuthorizedUsersRequest
     * @return ListAuthorizedUsersResponse
     */
    CompletableFuture<ListAuthorizedUsersResponse> listAuthorizedUsers(ListAuthorizedUsersRequest request);

    /**
     * @param request the request parameters of ListBindInfo  ListBindInfoRequest
     * @return ListBindInfoResponse
     */
    CompletableFuture<ListBindInfoResponse> listBindInfo(ListBindInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to use this operation in the monthly active user (MAU) billing scenario.</p>
     * <h2>Query conditions</h2>
     * <p>You can filter by browser group identity, name, business region, office network, set, authorized user group, and status. Only one status value can be specified at a time.</p>
     * <h2>Paging</h2>
     * <p>Use <code>PageNumber</code> and <code>PageSize</code> for paging. Use the returned <code>TotalCount</code> to determine whether to continue querying the next page.</p>
     * <h2>What to do next</h2>
     * <p>To view the detailed configuration of a single browser group, invoke <code>GetBrowserInstanceGroup</code> with the returned identity.</p>
     * <h2>Example notes</h2>
     * <p>The <code>-</code> in the examples indicates that the field is not applicable or not returned in the current scenario. It is not an actual character string returned by the operation. Resource identities in the examples are masked. Use the actual query results in your environment.</p>
     * 
     * @param request the request parameters of ListBrowserInstanceGroup  ListBrowserInstanceGroupRequest
     * @return ListBrowserInstanceGroupResponse
     */
    CompletableFuture<ListBrowserInstanceGroupResponse> listBrowserInstanceGroup(ListBrowserInstanceGroupRequest request);

    /**
     * @param request the request parameters of ListDesktopAgentRuntime  ListDesktopAgentRuntimeRequest
     * @return ListDesktopAgentRuntimeResponse
     */
    CompletableFuture<ListDesktopAgentRuntimeResponse> listDesktopAgentRuntime(ListDesktopAgentRuntimeRequest request);

    /**
     * @param request the request parameters of ListImage  ListImageRequest
     * @return ListImageResponse
     */
    CompletableFuture<ListImageResponse> listImage(ListImageRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the list of model templates under a model provider template in the WUYING Agent Management Center with paging. Filtering by model group ID, model provider template ID, model template ID, and model encoding is supported. When querying by model group dimension, the default model is automatically pinned to the top.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of ListLlmTemplates  ListLlmTemplatesRequest
     * @return ListLlmTemplatesResponse
     */
    CompletableFuture<ListLlmTemplatesResponse> listLlmTemplates(ListLlmTemplatesRequest request);

    /**
     * @param request the request parameters of ListModelProviderEndpoints  ListModelProviderEndpointsRequest
     * @return ListModelProviderEndpointsResponse
     */
    CompletableFuture<ListModelProviderEndpointsResponse> listModelProviderEndpoints(ListModelProviderEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>You can perform a paged query to retrieve the list of model provider templates under a specified model group in the WUYING Agent Management Center. You can filter results by provider name, model group ID, and provider template ID. Paging is supported.
     * Before you call this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of ListModelProviderTemplates  ListModelProviderTemplatesRequest
     * @return ListModelProviderTemplatesResponse
     */
    CompletableFuture<ListModelProviderTemplatesResponse> listModelProviderTemplates(ListModelProviderTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the list of resource groups authorized by a model group in the WUYING Agent Management Center.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of ListModelTemplateResourceGroup  ListModelTemplateResourceGroupRequest
     * @return ListModelTemplateResourceGroupResponse
     */
    CompletableFuture<ListModelTemplateResourceGroupResponse> listModelTemplateResourceGroup(ListModelTemplateResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can use paged query to retrieve the list of model groups created in the Wuying Agent Management Center. You can filter results by Agent provider, Agent platform, template group ID, and whether models have been configured. Paging is supported.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of ListModelTemplates  ListModelTemplatesRequest
     * @return ListModelTemplatesResponse
     */
    CompletableFuture<ListModelTemplatesResponse> listModelTemplates(ListModelTemplatesRequest request);

    /**
     * @param request the request parameters of ListNodeInstanceType  ListNodeInstanceTypeRequest
     * @return ListNodeInstanceTypeResponse
     */
    CompletableFuture<ListNodeInstanceTypeResponse> listNodeInstanceType(ListNodeInstanceTypeRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListOtaTask  ListOtaTaskRequest
     * @return ListOtaTaskResponse
     */
    CompletableFuture<ListOtaTaskResponse> listOtaTask(ListOtaTaskRequest request);

    /**
     * @param request the request parameters of ListPersistentAppInstances  ListPersistentAppInstancesRequest
     * @return ListPersistentAppInstancesResponse
     */
    CompletableFuture<ListPersistentAppInstancesResponse> listPersistentAppInstances(ListPersistentAppInstancesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The regions returned by this operation are not all available regions. For information about available regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListTagCloudResources  ListTagCloudResourcesRequest
     * @return ListTagCloudResourcesResponse
     */
    CompletableFuture<ListTagCloudResourcesResponse> listTagCloudResources(ListTagCloudResourcesRequest request);

    /**
     * @param request the request parameters of ListTenantConfig  ListTenantConfigRequest
     * @return ListTenantConfigResponse
     */
    CompletableFuture<ListTenantConfigResponse> listTenantConfig(ListTenantConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a list of WUYING workstations.</p>
     * 
     * @param request the request parameters of ListWuyingServer  ListWuyingServerRequest
     * @return ListWuyingServerResponse
     */
    CompletableFuture<ListWuyingServerResponse> listWuyingServer(ListWuyingServerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to pay-as-you-go resource delivery groups that have scheduled auto scaling enabled. The operation can be called only outside the scaling time periods specified in the scheduled auto scaling policy.</p>
     * </blockquote>
     * 
     * @param request the request parameters of LogOffAllSessionsInAppInstanceGroup  LogOffAllSessionsInAppInstanceGroupRequest
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    CompletableFuture<LogOffAllSessionsInAppInstanceGroupResponse> logOffAllSessionsInAppInstanceGroup(LogOffAllSessionsInAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of ModifyAppInstanceGroupAttribute  ModifyAppInstanceGroupAttributeRequest
     * @return ModifyAppInstanceGroupAttributeResponse
     */
    CompletableFuture<ModifyAppInstanceGroupAttributeResponse> modifyAppInstanceGroupAttribute(ModifyAppInstanceGroupAttributeRequest request);

    /**
     * @param request the request parameters of ModifyAppPolicy  ModifyAppPolicyRequest
     * @return ModifyAppPolicyResponse
     */
    CompletableFuture<ModifyAppPolicyResponse> modifyAppPolicy(ModifyAppPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the attributes of a Wuying Cloud Browser.</p>
     * 
     * @param request the request parameters of ModifyBrowserInstanceGroup  ModifyBrowserInstanceGroupRequest
     * @return ModifyBrowserInstanceGroupResponse
     */
    CompletableFuture<ModifyBrowserInstanceGroupResponse> modifyBrowserInstanceGroup(ModifyBrowserInstanceGroupRequest request);

    /**
     * @param request the request parameters of ModifyNodePoolAmount  ModifyNodePoolAmountRequest
     * @return ModifyNodePoolAmountResponse
     */
    CompletableFuture<ModifyNodePoolAmountResponse> modifyNodePoolAmount(ModifyNodePoolAmountRequest request);

    /**
     * <b>description</b> :
     * <p>You can configure the elastic pattern for WUYING Cloud Application resources in Settings:</p>
     * <ul>
     * <li>Fixed quantity: Elastic scaling is not used.</li>
     * <li>Automatic scaling: Automatically scales resources based on the number of connected sessions and the duration without session connections.</li>
     * <li>Scheduled scaling: Executes resource scaling during specified time periods on specified dates.
     * Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing method and pricing</a> of WUYING Cloud Application.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyNodePoolAttribute  ModifyNodePoolAttributeRequest
     * @return ModifyNodePoolAttributeResponse
     */
    CompletableFuture<ModifyNodePoolAttributeResponse> modifyNodePoolAttribute(ModifyNodePoolAttributeRequest request);

    /**
     * @param request the request parameters of ModifyTenantConfig  ModifyTenantConfigRequest
     * @return ModifyTenantConfigResponse
     */
    CompletableFuture<ModifyTenantConfigResponse> modifyTenantConfig(ModifyTenantConfigRequest request);

    /**
     * @param request the request parameters of ModifyWuyingServerAttribute  ModifyWuyingServerAttributeRequest
     * @return ModifyWuyingServerAttributeResponse
     */
    CompletableFuture<ModifyWuyingServerAttributeResponse> modifyWuyingServerAttribute(ModifyWuyingServerAttributeRequest request);

    /**
     * @param request the request parameters of PageListAppInstanceGroupUser  PageListAppInstanceGroupUserRequest
     * @return PageListAppInstanceGroupUserResponse
     */
    CompletableFuture<PageListAppInstanceGroupUserResponse> pageListAppInstanceGroupUser(PageListAppInstanceGroupUserRequest request);

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for resources that belong to Agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. These model groups serve as inference engines for Agents to execute tasks within the resource group.
     * When an Agent runtime has its own model group configured and the resource group it belongs to also has a model group configured, the model group bound to the resource group takes effect. The resource group setting has a higher priority than the Agent runtime setting.
     * When you remove the model group from the resource group to which an Agent runtime belongs, the model group configured on the Agent runtime itself automatically takes effect.
     * Before calling this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of RemoveResourceGroupModelTemplate  RemoveResourceGroupModelTemplateRequest
     * @return RemoveResourceGroupModelTemplateResponse
     */
    CompletableFuture<RemoveResourceGroupModelTemplateResponse> removeResourceGroupModelTemplate(RemoveResourceGroupModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove a specific third-party channel configuration from Agents such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. After the removal, the Agent cannot use the third-party channel for conversations.
     * Before calling this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of RemoveRuntimeChannel  RemoveRuntimeChannelRequest
     * @return RemoveRuntimeChannelResponse
     */
    CompletableFuture<RemoveRuntimeChannelResponse> removeRuntimeChannel(RemoveRuntimeChannelRequest request);

    /**
     * <b>description</b> :
     * <p>You can remove model groups from Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. When an Agent runtime resource needs to switch to a different model group, call this operation first to remove the authorization relationship between the Agent runtime resource and the existing model group.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before calling this operation.</p>
     * 
     * @param request the request parameters of RemoveRuntimeModelTemplate  RemoveRuntimeModelTemplateRequest
     * @return RemoveRuntimeModelTemplateResponse
     */
    CompletableFuture<RemoveRuntimeModelTemplateResponse> removeRuntimeModelTemplate(RemoveRuntimeModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing and pricing</a> of WUYING Workspace.</p>
     * <blockquote>
     * <p>Prerequisites:</p>
     * <ul>
     * <li>The delivery group must be in the PUBLISHED state, and ChargeType must be set to PrePaid.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of RenewAppInstanceGroup  RenewAppInstanceGroupRequest
     * @return RenewAppInstanceGroupResponse
     */
    CompletableFuture<RenewAppInstanceGroupResponse> renewAppInstanceGroup(RenewAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of RenewWuyingServer  RenewWuyingServerRequest
     * @return RenewWuyingServerResponse
     */
    CompletableFuture<RenewWuyingServerResponse> renewWuyingServer(RenewWuyingServerRequest request);

    /**
     * @param request the request parameters of RestartWuyingServer  RestartWuyingServerRequest
     * @return RestartWuyingServerResponse
     */
    CompletableFuture<RestartWuyingServerResponse> restartWuyingServer(RestartWuyingServerRequest request);

    /**
     * @param request the request parameters of StartTaskForDistributeImage  StartTaskForDistributeImageRequest
     * @return StartTaskForDistributeImageResponse
     */
    CompletableFuture<StartTaskForDistributeImageResponse> startTaskForDistributeImage(StartTaskForDistributeImageRequest request);

    /**
     * @param request the request parameters of StartWuyingServer  StartWuyingServerRequest
     * @return StartWuyingServerResponse
     */
    CompletableFuture<StartWuyingServerResponse> startWuyingServer(StartWuyingServerRequest request);

    /**
     * @param request the request parameters of StopWuyingServer  StopWuyingServerRequest
     * @return StopWuyingServerResponse
     */
    CompletableFuture<StopWuyingServerResponse> stopWuyingServer(StopWuyingServerRequest request);

    /**
     * @param request the request parameters of TagCloudResources  TagCloudResourcesRequest
     * @return TagCloudResourcesResponse
     */
    CompletableFuture<TagCloudResourcesResponse> tagCloudResources(TagCloudResourcesRequest request);

    /**
     * @param request the request parameters of UnassignWuyingServerPrivateAddresses  UnassignWuyingServerPrivateAddressesRequest
     * @return UnassignWuyingServerPrivateAddressesResponse
     */
    CompletableFuture<UnassignWuyingServerPrivateAddressesResponse> unassignWuyingServerPrivateAddresses(UnassignWuyingServerPrivateAddressesRequest request);

    /**
     * @param request the request parameters of Unbind  UnbindRequest
     * @return UnbindResponse
     */
    CompletableFuture<UnbindResponse> unbind(UnbindRequest request);

    /**
     * @param request the request parameters of UntagCloudResources  UntagCloudResourcesRequest
     * @return UntagCloudResourcesResponse
     */
    CompletableFuture<UntagCloudResourcesResponse> untagCloudResources(UntagCloudResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: After the image update starts, sessions of end users who are accessing cloud applications will be disconnected. Proceed with caution to avoid data loss for end users.
     * Before calling this API, the delivery group must be in the PUBLISHED, DEPLOYED, or MAINTAIN_FAILED state. You can call GetAppInstanceGroup to query the current state of the delivery group.
     * After the update is published, you typically need to wait about 2 minutes for the changes to take effect on the client.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateAppInstanceGroupImage  UpdateAppInstanceGroupImageRequest
     * @return UpdateAppInstanceGroupImageResponse
     */
    CompletableFuture<UpdateAppInstanceGroupImageResponse> updateAppInstanceGroupImage(UpdateAppInstanceGroupImageRequest request);

    /**
     * <b>description</b> :
     * <p>You can update a model provider template that has been created in the WUYING Agent Management Center, including the template name, description, model service connection configuration, and WUYING security proxy switch. Partial field updates are supported. You only need to pass in the fields that you want to modify.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of UpdateModelProviderTemplate  UpdateModelProviderTemplateRequest
     * @return UpdateModelProviderTemplateResponse
     */
    CompletableFuture<UpdateModelProviderTemplateResponse> updateModelProviderTemplate(UpdateModelProviderTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can update a model group that has been created in the Wuying Agent Management Center, including the group name, description, and model configuration information. You can modify the default model of a model group by updating the Config field. The updated configuration automatically takes effect on associated cloud desktops.
     * Before you call this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of UpdateModelTemplate  UpdateModelTemplateRequest
     * @return UpdateModelTemplateResponse
     */
    CompletableFuture<UpdateModelTemplateResponse> updateModelTemplate(UpdateModelTemplateRequest request);

    /**
     * @param request the request parameters of UpdateWuyingServerImage  UpdateWuyingServerImageRequest
     * @return UpdateWuyingServerImageResponse
     */
    CompletableFuture<UpdateWuyingServerImageResponse> updateWuyingServerImage(UpdateWuyingServerImageRequest request);

}
