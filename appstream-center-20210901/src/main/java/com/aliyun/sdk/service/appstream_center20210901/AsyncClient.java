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
     * <p>This operation manages user authorization for an app instance group at the application level. The authorization result applies only to the application specified by AppId and does not affect the authorization relationships of other applications in the app instance group. To authorize users for the entire app instance group, call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The app instance group is created, and <strong>the application specified by AppId is deployed in the image used by the app instance group</strong>. Otherwise, the error code <code>InvalidAppId.NotFound</code> is returned.</li>
     * <li>The app instance group <strong>is not added to an active app instance group set</strong>. App instance groups added to a set cannot be authorized individually and must be authorized through the set. Otherwise, the error code <code>InvalidAppInstanceGroup.AuthorizeBlockedBySet</code> is returned.</li>
     * <li>If the workspace to which the app instance group belongs is an AD workspace, <strong>UserMeta must be specified</strong>, the value of <code>UserMeta.Type</code> must be <code>ad</code>, and the value of <code>UserMeta.AdDomain</code> must be the same as the AD domain bound to the workspace.</li>
     * <li>If the app instance group has been authorized through a user group and mixed authorization of users and user groups is not supported, you cannot authorize individual users. Otherwise, the error code <code>AuthAppInstanceGroup.MixNotSupported</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>Specify at least one of AuthorizeUserIds and UnAuthorizeUserIds</strong>, or specify both. If both are empty, no authorization relationships are changed when you invoke this operation.</li>
     * <li>When adding authorization, the sum of the current number of authorized users for the application and the number of newly added users cannot exceed the authorized user quota for the application. If the quota is exceeded, the error code <code>ExceedAppAuthUserQuota</code> is returned. Removing authorization is not subject to the quota limit.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the app instance group ID (AppInstanceGroupId) and the application IDs of the applications deployed in the app instance group (AppId in the Apps list).</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the usernames of the users to be authorized or whose authorization is to be removed.</li>
     * <li>Call this operation to complete the authorization change.<blockquote>
     * <p>After the authorization is changed, the selected users will receive a notification email. Generally, it takes about 2 minutes for the changes to take effect on the terminal.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of AuthorizeUsersForApp  AuthorizeUsersForAppRequest
     * @return AuthorizeUsersForAppResponse
     */
    CompletableFuture<AuthorizeUsersForAppResponse> authorizeUsersForApp(AuthorizeUsersForAppRequest request);

    /**
     * @param request the request parameters of BatchConfigRuntimeChannel  BatchConfigRuntimeChannelRequest
     * @return BatchConfigRuntimeChannelResponse
     */
    CompletableFuture<BatchConfigRuntimeChannelResponse> batchConfigRuntimeChannel(BatchConfigRuntimeChannelRequest request);

    /**
     * <b>description</b> :
     * <p>You can create model templates in batches under a model provider template in the Wuying Agent Management Center. This allows you to add multiple models at a time and specify one of them as the default model. Existing models are automatically skipped to prevent duplicate model creation. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you use this API.</p>
     * 
     * @param request the request parameters of BatchCreateLlmTemplates  BatchCreateLlmTemplatesRequest
     * @return BatchCreateLlmTemplatesResponse
     */
    CompletableFuture<BatchCreateLlmTemplatesResponse> batchCreateLlmTemplates(BatchCreateLlmTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the parent image is available and an available image distribution record exists in the creation region.</p>
     * <ol>
     * <li>Call ListImage to obtain the parent image ID.</li>
     * <li>Specify the creation mode, cloud disk capacity, and resource type, and then call this operation.</li>
     * <li>Save the returned ImageId, VersionId, and TaskId.</li>
     * <li>Call GetTask to query the creation progress. <strong>A successful request does not indicate that the image creation is complete.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of BuilderImageByParent  BuilderImageByParentRequest
     * @return BuilderImageByParentResponse
     */
    CompletableFuture<BuilderImageByParentResponse> builderImageByParent(BuilderImageByParentRequest request);

    /**
     * <b>description</b> :
     * <p>Call <code>ListAgentInstanceMemory</code> to query the target instance ID and the associated user. <strong>Verify the instance and user before clearing the memory.</strong></p>
     * 
     * @param request the request parameters of ClearAgentInstanceMemory  ClearAgentInstanceMemoryRequest
     * @return ClearAgentInstanceMemoryResponse
     */
    CompletableFuture<ClearAgentInstanceMemoryResponse> clearAgentInstanceMemory(ClearAgentInstanceMemoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can assign a model group to the resource group to which agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center belong. The assigned model group serves as the inference engine for agents in the resource group to execute tasks.
     * If an agent runtime is configured with a model group and its resource group is also configured with a model group, the model group bound to the resource group takes effect. That is, the resource group settings take precedence over the agent runtime settings.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>The ResourceGroupId parameter in this operation specifically refers to the WUYING Enterprise Edition resource group ID, which starts with rg-. This resource group is managed by the WUYING Enterprise Edition control service and must be created before you deploy agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent. You do not need to and cannot create it by using the API of this service. Although the account-level resource group ID in Alibaba Cloud Resource Manager also starts with rg-, it does not belong to WUYING resource groups and cannot be passed as this parameter.</li>
     * <li>Before you call this operation, obtain an existing WUYING resource group ID by using one of the following methods:<ul>
     * <li>Call the DescribeResourceGroups operation of WUYING Cloud Desktop eds-user (API version 2021-03-08). The ResourceGroup[].ResourceGroupId field in the response is the resource group ID required for this parameter. You can set the ResourceClassification request parameter to DesktopAgent and filter agent resource groups by AgentType (JVSClaw or HermesAgent). The AliyunResourceGroupId field in the response is the resource group ID of Alibaba Cloud Resource Manager and cannot be used in this operation.</li>
     * <li>Call the GetRuntimeModelConfig operation of this service. The Data.ResourceGroupId field in the response is the WUYING resource group ID to which the specified agent runtime currently belongs. If the runtime does not belong to any resource group, this field is null.</li>
     * <li>When you call the ListDesktopAgentRuntime operation of this service, you can use the ResourceGroupId request parameter to filter agent runtimes by resource group to confirm which runtimes are included in a specific resource group.</li>
     * </ul>
     * </li>
     * <li>The ListModelTemplateResourceGroup operation returns only the resource groups that have been authorized for a specified model group. It cannot be used to discover resource groups that have not been authorized for any model group.
     * Make sure that you are fully familiar with the operations and usage of the WUYING Agent Management Center before you use this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ConfigResourceGroupModelTemplate  ConfigResourceGroupModelTemplateRequest
     * @return ConfigResourceGroupModelTemplateResponse
     */
    CompletableFuture<ConfigResourceGroupModelTemplateResponse> configResourceGroupModelTemplate(ConfigResourceGroupModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can configure third-party channels for agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. These channels serve as extended agent communication methods in addition to the AgentIM channel.
     * Before you call this operation, make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of ConfigRuntimeChannel  ConfigRuntimeChannelRequest
     * @return ConfigRuntimeChannelResponse
     */
    CompletableFuture<ConfigRuntimeChannelResponse> configRuntimeChannel(ConfigRuntimeChannelRequest request);

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center to serve as inference engines for agent task execution.
     * Before you call this operation, make sure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of ConfigRuntimeModelTemplate  ConfigRuntimeModelTemplateRequest
     * @return ConfigRuntimeModelTemplateResponse
     */
    CompletableFuture<ConfigRuntimeModelTemplateResponse> configRuntimeModelTemplate(ConfigRuntimeModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Only custom images and community images manageable by the current account are supported. If VersionId is omitted, the current active version of the image is used. If specified, it must belong to the image corresponding to ImageId.
     * Call ListImage first to select an image. After creation, save the returned AppId, AppVersionId, ImageId, and VersionId. To dissociate the application, call UnbindApp.</p>
     * 
     * @param request the request parameters of CreateAndBindApp  CreateAndBindAppRequest
     * @return CreateAndBindAppResponse
     */
    CompletableFuture<CreateAndBindAppResponse> createAndBindApp(CreateAndBindAppRequest request);

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
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>Prepare an available office network, image, and specifications in the target business region, and ensure that the account has the corresponding browser configurations and resource quotas.</li>
     * <li>Specify <code>CloudBrowserName</code> and <code>BizRegionId</code>. You must set <code>OsType</code> to <code>Windows</code>.</li>
     * <li>Authorized users must be created in advance and match the account type. Authorized user groups must belong to the current account and match the account type of the office network.</li>
     * <li><strong><code>Users</code> and <code>UserGroupIds</code> cannot be both non-empty.</strong></li>
     * </ul>
     * <h2>MAU billing parameters</h2>
     * <ul>
     * <li>Set <code>ChargeType</code> to <code>PostPaid</code>.</li>
     * <li><strong>You must explicitly set <code>SubPayType</code> to <code>mau</code>. Omitting this field does not enable MAU billing.</strong></li>
     * <li>Set <code>ChargeResourceMode</code> to <code>AppInstance</code>.</li>
     * <li>You do not need to specify <code>Period</code>, <code>PeriodUnit</code>, <code>AppPackageType</code>, <code>AutoPay</code>, <code>AutoRenew</code>, or <code>NodePool</code>.</li>
     * </ul>
     * <h2>Post-call processing</h2>
     * <p><strong>A successful API response does not indicate that the browser resources are ready.</strong> After creation, query the status of the browser group and use it only after confirming that it is connectable.
     * This operation creates a new cloud browser group and does not require a delivery group to be created in advance.</p>
     * <h2>Example descriptions</h2>
     * <p>Field examples are used to demonstrate how to specify values. Replace resource identifiers with the actual values under the current account. Capacity examples do not represent default values or upper limits.
     * An example value of <code>-</code> indicates that the field is not required. When calling the API, omit the corresponding parameter and do not pass the <code>-</code> character.</p>
     * 
     * @param request the request parameters of CreateBrowserInstanceGroup  CreateBrowserInstanceGroupRequest
     * @return CreateBrowserInstanceGroupResponse
     */
    CompletableFuture<CreateBrowserInstanceGroupResponse> createBrowserInstanceGroup(CreateBrowserInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation creates an export task and returns the task ID and initial status. The exported file is not returned synchronously.
     * After the task is created, save TaskId and call DescribeExportTasks to query the task status and progress. The recommended polling interval is 5 to 10 seconds. When the status is FINISHED, use the DownloadUrl in the latest query result to download the XLSX file. When the status is FAILED, check ErrorMsg and stop polling.
     * The task is valid for 24 hours after creation. The download URL has an independent signature validity period of up to 1 hour, which does not exceed the remaining validity period of the task. Query the latest URL before downloading. You cannot obtain a valid download URL after the task expires.
     * The WUYING server list export only accepts the filter fields listed in QueryParamJson. Pagination is controlled by the server. A single task can export up to 100,000 records. The cloud browser bookmarks and URL whitelist exports export the complete list of the target delivery group. This is not affected by the list search terms or the current page. The ownership and product type of the delivery group are verified before execution. Data is read in pages during execution, and no consistent snapshot is provided. A successful creation does not guarantee that subsequent verification, query, or file generation will succeed.</p>
     * 
     * @param request the request parameters of CreateExportTask  CreateExportTaskRequest
     * @return CreateExportTaskResponse
     */
    CompletableFuture<CreateExportTaskResponse> createExportTask(CreateExportTaskRequest request);

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
     * <p>You can create a model creation provider template under the model templates in the Wuying Agent Management Center to configure the connection information and keys for model services (such as Alibaba Cloud Bailian, Token Plan, and Moonshot) that agents can invoke. The created model provider template is automatically associated with the specified model template. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you use this operation.</p>
     * 
     * @param request the request parameters of CreateModelProviderTemplate  CreateModelProviderTemplateRequest
     * @return CreateModelProviderTemplateResponse
     */
    CompletableFuture<CreateModelProviderTemplateResponse> createModelProviderTemplate(CreateModelProviderTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can create a model creation group in the Wuying Agent Management Center to manage the model service providers and model scopes that can be invoked by agents. After creation, you can attach the model creation group to a cloud computer as the inference engine configuration for agents to execute nodes. Ensure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you call this API operation.</p>
     * 
     * @param request the request parameters of CreateModelTemplate  CreateModelTemplateRequest
     * @return CreateModelTemplateResponse
     */
    CompletableFuture<CreateModelTemplateResponse> createModelTemplate(CreateModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Creates one or more workstations.</p>
     * <h3>Before you begin</h3>
     * <ol>
     * <li>Determine the region where the workstation is located and specify BizRegionId. You can call ListZones to query the zones in the region. This operation does not return the office network ID.</li>
     * <li>Call ListImage to query the images applicable to the target workstation and obtain the ImageId.</li>
     * <li>Call ListNodeInstanceType to query the workstation specifications available for purchase in the target region, obtain the ServerInstanceType, and confirm that the specification supports the selected billing method.</li>
     * <li>To specify an office network, specify the OfficeSiteId available for the current account in the target region. If this parameter is not specified, the service attempts to reuse or create a default office network. Prepare a workstation logon password Password that meets the requirements. The image ID, specification, and office network ID cannot be used interchangeably.
     * <a href="~~ListZones~~">ListZones</a>
     * <a href="~~ListImage~~">ListImage</a>
     * <a href="~~ListNodeInstanceType~~">ListNodeInstanceType</a></li>
     * </ol>
     * <h3>Billing parameters</h3>
     * <ul>
     * <li>To use the subscription billing method, set ChargeType to PrePaid and specify both Period and PeriodUnit. Set SubPayType to prePaid. If SubPayType is not specified, the system selects the corresponding value based on the billing method.</li>
     * <li>The combination of Period and PeriodUnit specifies the subscription duration. For example, 1 and Month indicate a subscription duration of one month. The available subscription periods must comply with the sales rules of the target workstation specification.</li>
     * </ul>
     * <h3>Creation results and subsequent operations</h3>
     * <p><strong>A returned workstation ID does not indicate that the resource has been created.</strong> If AutoPay is set to false and the order is unpaid, the returned WuyingServerIdList contains the workstation IDs pre-allocated for this order, and the actual workstations are not yet created. Pay the order corresponding to the returned OrderId first, and then call ListWuyingServer to query the resources and their status. Do not use these IDs to perform deletion or other resource operations before the resources are actually created.
     * To associate the workstation with a virtual node pool, you must prepare an existing VirtualNodePoolId under the current account. This operation only associates existing node pools and does not create virtual node pools.
     * <a href="~~ListWuyingServer~~">ListWuyingServer</a></p>
     * 
     * @param request the request parameters of CreateWuyingServer  CreateWuyingServerRequest
     * @return CreateWuyingServerResponse
     */
    CompletableFuture<CreateWuyingServerResponse> createWuyingServer(CreateWuyingServerRequest request);

    /**
     * <b>description</b> :
     * <p><em>Confirm the deletion scope first.</em>*</p>
     * <ul>
     * <li>If both ImageId and VersionId are specified: only dissociates the adaptation from the specified image version.</li>
     * <li>If ImageId and VersionId are not both specified: initiates the adaptation deletion process. The adaptation cannot be deleted if it is still referenced by multiple images. If the application has other adaptations, it cannot be deleted together with the application.
     * <strong>AdaptorId, AppVersionId, and AppId must be provided at the same time and correspond to the same application adaptation.</strong> Verify these identifiers through the application and image query results first.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAdaptor  DeleteAdaptorRequest
     * @return DeleteAdaptorResponse
     */
    CompletableFuture<DeleteAdaptorResponse> deleteAdaptor(DeleteAdaptorRequest request);

    /**
     * <b>description</b> :
     * <p><em>You must disassociate all images from the target application or version before deletion.</em>*</p>
     * <ol>
     * <li>Call ListApp to obtain the AppId and confirm whether the application can be deleted.</li>
     * <li>Use UnbindApp or DeleteAdaptor to disassociate the related images.</li>
     * <li>Specify AppVersionId to delete a single application version, or omit this parameter to delete the entire application.
     * After an application version is deleted, if the application has no other valid adapters, the application record is also deleted.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteApp  DeleteAppRequest
     * @return DeleteAppResponse
     */
    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

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
     * <p>Only instances in the initializing or idle state can be deleted. This API operation is available only to specific customers.</p>
     * 
     * @param request the request parameters of DeleteAppInstances  DeleteAppInstancesRequest
     * @return DeleteAppInstancesResponse
     */
    CompletableFuture<DeleteAppInstancesResponse> deleteAppInstances(DeleteAppInstancesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can only delete custom images that you own.</li>
     * <li>For images used in the WUYING Cloud Computer Pool, WUYING Cloud App, and WUYING Workstation product lines, ensure that no WUYING instances are using the image before you delete it.</li>
     * <li>If a WUYING cloud desktop template references the image, the template is also deleted when you delete the image.</li>
     * <li>If the image is available in multiple regions, deleting the image removes it from all regions.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a model template created under a model provider template. After the model template is deleted, the system triggers a configuration refresh for the associated model groups.</p>
     * <h3>Before you begin</h3>
     * <p><strong>The model to be deleted cannot be the default model of any associated model group.</strong> If it is still set as the default model, the invocation failed and LlmTemplate.IsDefaultModel is returned.
     * For model groups that allow modifying the default model, proceed as follows:</p>
     * <ol>
     * <li>Confirm the ProviderTemplateId of the model to be deleted and the ModelTemplateId that sets it as the default model.</li>
     * <li>Invoke <a href="~~BatchCreateLlmTemplates~~">BatchCreateLlmTemplates</a> to create another active model under the same provider template and set IsDefaultModel to true for the new model. Specify the model group for which you want to switch the default model by using ModelTemplateId.</li>
     * <li>Confirm that the default model has been switched for all relevant model groups, and then invoke this operation by using the LlmTemplateId of the original model. Switching the default model for only one group does not remove the restriction on the original default model for other groups.
     * When you invoke BatchCreateLlmTemplates, if a model group does not have default model Settings and you do not explicitly specify one in the current request, the service sets the first model in the list as the default model. Therefore, if you create only one model for the first time, it may become the default model even if you set IsDefaultModel to false, and it cannot be directly deleted. The default model for the Common model group is fixed and cannot be modified by using the preceding method.
     * Models that are under system administration and cannot be modified, as well as models that are not available to customers, cannot be deleted by invoking this operation. A model is not necessarily deletable just because it is not the default model.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteLlmTemplate  DeleteLlmTemplateRequest
     * @return DeleteLlmTemplateResponse
     */
    CompletableFuture<DeleteLlmTemplateResponse> deleteLlmTemplate(DeleteLlmTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete model provider templates that are created under model templates in the Wuying Agent Management Center. Before you delete a template, make sure that the model provider is not the provider of the default model and is not a system-preset provider, such as the Wuying credit package. After the template is deleted, its associated models and key configurations are also cleared.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * @param request the request parameters of DeleteModelProviderTemplate  DeleteModelProviderTemplateRequest
     * @return DeleteModelProviderTemplateResponse
     */
    CompletableFuture<DeleteModelProviderTemplateResponse> deleteModelProviderTemplate(DeleteModelProviderTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete a model group created in the Wuying Agent Management Center. Before deletion, ensure that the template is not authorized for any resources. Otherwise, the deletion fails. After the model group is deleted, the model providers and models in the model group are also removed.
     * Before you use this API operation, ensure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of DeleteModelTemplate  DeleteModelTemplateRequest
     * @return DeleteModelTemplateResponse
     */
    CompletableFuture<DeleteModelTemplateResponse> deleteModelTemplate(DeleteModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a workstation.</p>
     * 
     * @param request the request parameters of DeleteWuyingServer  DeleteWuyingServerRequest
     * @return DeleteWuyingServerResponse
     */
    CompletableFuture<DeleteWuyingServerResponse> deleteWuyingServer(DeleteWuyingServerRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Specify the region where SLS is deployed and at least one product delivery scope.</li>
     * <li>Specify either <code>ProjectName</code> or <code>ExistedProjectName</code>. If you use an existing project, make sure that it belongs to the current account and is located in the specified region.</li>
     * <li>Only one enabled delivery configuration can exist for the same account and product type. Before you call this operation, you can call <code>DescribeSlsDeliveryConfig</code> to query existing configurations. If an enabled configuration already exists, calling this operation again returns <code>SlsDeliveryAlreadyExists</code>.</li>
     * </ul>
     * <h2>Configuration management</h2>
     * <ul>
     * <li>This operation is used to configure delivery, not to query logs.</li>
     * <li>To pause delivery, call <code>StopDeliveryConfig</code>. Stopping delivery does not delete the delivery configuration.</li>
     * <li>To reconfigure the delivery destination or rebuild the configuration, query and delete the corresponding old configuration by calling <code>DeleteDeliveryConfig</code> before you call this operation. Deleting a delivery configuration does not delete the SLS project or Logstore.</li>
     * <li>Do not treat repeated calls for an existing configuration as update or resume operations. After the call, you can call <code>DescribeSlsDeliveryConfig</code> to confirm the configuration status.</li>
     * </ul>
     * 
     * @param request the request parameters of DeliverToUserSls  DeliverToUserSlsRequest
     * @return DeliverToUserSlsResponse
     */
    CompletableFuture<DeliverToUserSlsResponse> deliverToUserSls(DeliverToUserSlsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the resource and session events of the current account. Both <code>StartTime</code> and <code>EndTime</code> must be specified, and the time range is inclusive. The service only retrieves logs from 30 days before the call time to the current time, so events outside this window are not returned. If multiple filter parameters are specified, the intersection of the conditions is applied. The results are returned in descending order of the event log time. To use page number-based pagination, specify <code>PageSize</code> and <code>PageNumber</code>. The current version does not use <code>MaxResults</code> and <code>NextToken</code>.</p>
     * 
     * @param request the request parameters of DescribeEvents  DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Calls this operation to query the export tasks under the current Alibaba Cloud account by page to obtain the task status, execution progress, export file names, and download URLs. Export tasks are created by CreateExportTask. This operation only reads task information and does not create, modify, or retry tasks.
     * The query results are returned in descending order of task creation time, with the most recently created tasks listed first. Only tasks in the INIT, RUNNING, FINISHED, and FAILED states are returned. Tasks marked as EXPIRED are not included in the results.
     * When polling a single task by TaskId, set PageNumber to 1 and PageSize to 1, set the polling interval to 5 to 10 seconds, and stop polling after the task enters the FINISHED or FAILED state.
     * A task is valid for 24 hours after creation and is marked as expired by a background task after 25 hours. Therefore, within the 24- to 25-hour window, a FINISHED task may still be queried, but its DownloadUrl is empty. After a task is marked as expired, the query result is an empty array.
     * If the query result is an empty array, it may be because there are no visible tasks under the current account, the task type does not match, the page number is out of bounds, or the tasks have expired. This operation always returns an array structure and does not return an error when the query result is empty.
     * The DownloadUrl is an OSS pre-signed URL. The default maximum validity period is 1 hour and does not exceed the remaining validity period of the task. The server automatically refreshes the URL when it is about to expire. Use the URL returned by the most recent query for downloading and do not cache the initially returned URL for a long time.</p>
     * 
     * @param request the request parameters of DescribeExportTasks  DescribeExportTasksRequest
     * @return DescribeExportTasksResponse
     */
    CompletableFuture<DescribeExportTasksResponse> describeExportTasks(DescribeExportTasksRequest request);

    /**
     * @param request the request parameters of DescribeShareImage  DescribeShareImageRequest
     * @return DescribeShareImageResponse
     */
    CompletableFuture<DescribeShareImageResponse> describeShareImage(DescribeShareImageRequest request);

    /**
     * <b>description</b> :
     * <h2>Query description</h2>
     * <ul>
     * <li>Queries existing delivery configurations under the current account. This operation does not create or modify configurations.</li>
     * <li>You can filter configurations by SLS region, project name, Logstore name, and product type. If multiple conditions are specified, they take effect together.</li>
     * <li>If no filter conditions are specified, all delivery configurations under the current account are queried. If no configurations match the conditions, an empty list is returned.</li>
     * <li>The returned results are displayed hierarchically by project, Logstore, and delivery scope.</li>
     * </ul>
     * <h2>Example description</h2>
     * <p>The examples of names and retention periods are used to demonstrate the format. Refer to the actual configurations. The retention period examples do not represent default values or upper limits.</p>
     * 
     * @param request the request parameters of DescribeSlsDeliveryConfig  DescribeSlsDeliveryConfigRequest
     * @return DescribeSlsDeliveryConfigResponse
     */
    CompletableFuture<DescribeSlsDeliveryConfigResponse> describeSlsDeliveryConfig(DescribeSlsDeliveryConfigRequest request);

    /**
     * <b>description</b> :
     * <p>When querying a specified target, specify either the app instance group ID or the app instance group set ID. When querying a set, the rules of the primary app instance group are returned. You can use the query results as a reference for modifying rules, and then call SetUserProfilePathRules to submit the complete rule list.</p>
     * 
     * @param request the request parameters of DescribeUserProfilePathRules  DescribeUserProfilePathRulesRequest
     * @return DescribeUserProfilePathRulesResponse
     */
    CompletableFuture<DescribeUserProfilePathRulesResponse> describeUserProfilePathRules(DescribeUserProfilePathRulesRequest request);

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
     * @param request the request parameters of FinishValidate  FinishValidateRequest
     * @return FinishValidateResponse
     */
    CompletableFuture<FinishValidateResponse> finishValidate(FinishValidateRequest request);

    /**
     * @param request the request parameters of GetAgentRuntimeStatistic  GetAgentRuntimeStatisticRequest
     * @return GetAgentRuntimeStatisticResponse
     */
    CompletableFuture<GetAgentRuntimeStatisticResponse> getAgentRuntimeStatistic(GetAgentRuntimeStatisticRequest request);

    /**
     * @param request the request parameters of GetAppInstanceGroup  GetAppInstanceGroupRequest
     * @return GetAppInstanceGroupResponse
     */
    CompletableFuture<GetAppInstanceGroupResponse> getAppInstanceGroup(GetAppInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, you must create a task, and the creation or validation resources corresponding to the task must be available.</p>
     * <ol>
     * <li>Obtain the TaskId and actual TaskType from the response of the task creation operation or GetTask.</li>
     * <li>Specify ResourceType to obtain the connection information for the creation or validation environment.</li>
     * <li>Use the returned authorization code together with the user, resource group, and application identifiers in the same response for connection.
     * The authorization code is a sensitive connection credential. Do not record it in public documents or logs. When specifying AppId, you must also specify the matching AppVersionId.</li>
     * </ol>
     * 
     * @param request the request parameters of GetAuthCode  GetAuthCodeRequest
     * @return GetAuthCodeResponse
     */
    CompletableFuture<GetAuthCodeResponse> getAuthCode(GetAuthCodeRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes the query usage for the monthly active user (MAU) billing scenario.</p>
     * <h2>Before you begin</h2>
     * <p>Obtain the ID of the cloud browser group within the current account. You can call the ListBrowserInstanceGroup operation to obtain the ID.</p>
     * <h2>Response content</h2>
     * <p>Returns the current configuration, status, and authorization statistics of the browser group. The bookmark and website access lists in the details return up to 20 entries each. To query the complete lists, call the ListBrowserBookmarks and ListBrowserRestrictedURLs operations, respectively.</p>
     * <h2>What to do next</h2>
     * <p>This operation only queries configurations and does not modify resources. After reading the returned status, perform connection or management operations that match the status.</p>
     * <h2>Example description</h2>
     * <p>In the examples, a hyphen (-) indicates that the field is not applicable to the current scenario or is not returned. It is not an actual string returned by the operation. The examples of common resource IDs are masked. Use the actual query results.</p>
     * 
     * @param request the request parameters of GetBrowserInstanceGroup  GetBrowserInstanceGroupRequest
     * @return GetBrowserInstanceGroupResponse
     */
    CompletableFuture<GetBrowserInstanceGroupResponse> getBrowserInstanceGroup(GetBrowserInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Call protocol description: operation_type: polling, required_steps: 1.
     * This API operation may require multiple calls (at least one) to finally obtain the connection credentials.
     * The first call assigns an application instance to the specified convenience user and starts the application. If a ticket is returned, it indicates that the result is obtained synchronously. If a startup task ID (TaskId) is returned, subsequent calls are required.
     * For subsequent calls, you must pass the TaskId parameter in the request parameters to query whether the task is completed. When the returned task status (TaskStatus) is Finished, the connection credentials (Ticket) are returned at the same time.</p>
     * <blockquote>
     * <p>Prerequisites</p>
     * <ul>
     * <li>Before you call this operation, make sure that a delivery group is created and authorized for the user:</li>
     * <li><ol>
     * <li>The API operation used to create a delivery group is CreateAppInstanceGroup. For more information about the parameters, see the documentation for the corresponding API operation.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>You can call the ListAppInstanceGroup API operation to query the list of delivery groups. If the corresponding delivery group is not found, check whether the delivery group is created or whether the authentication credentials used belong to the correct tenant.</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The API operation used to authorize a delivery group for a user is AuthorizeInstanceGroup. For more information about the parameters, see the documentation for the corresponding API operation.</li>
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
     * <p>Queries the effective versions of an image in various regions by ImageId. If a image version is configured in the same region, the image version is returned first. You can specify BizRegionId to limit the query to a specific region. The returned results are also constrained by the product type and the regions visible to the account. To query the details of a specific version, call GetImageById.</p>
     * 
     * @param request the request parameters of GetEffectiveImageById  GetEffectiveImageByIdRequest
     * @return GetEffectiveImageByIdResponse
     */
    CompletableFuture<GetEffectiveImageByIdResponse> getEffectiveImageById(GetEffectiveImageByIdRequest request);

    /**
     * <b>description</b> :
     * <p>Visitor information is filled in by visitors on the lead capture page when they execute a cloud flow. Therefore, the usage of cloud applications does not generate visitor information.</p>
     * 
     * @param request the request parameters of GetFileUploadInfo  GetFileUploadInfoRequest
     * @return GetFileUploadInfoResponse
     */
    CompletableFuture<GetFileUploadInfoResponse> getFileUploadInfo(GetFileUploadInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You must specify at least one of ImageId and VersionId. If only ImageId is specified, the online version is queried. If VersionId is specified, the specified version is queried. If both parameters are specified, VersionId must belong to the specified image. To query the effective version in each region, call GetEffectiveImageById.</p>
     * 
     * @param request the request parameters of GetImageById  GetImageByIdRequest
     * @return GetImageByIdResponse
     */
    CompletableFuture<GetImageByIdResponse> getImageById(GetImageByIdRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the region distribution status of an image by ImageId. If VersionId is not specified, the online version is queried. If VersionId is specified, the specified version is queried. Returns the non-deleted region distribution records and the list of corresponding region IDs.</p>
     * 
     * @param request the request parameters of GetImageDistributeInfo  GetImageDistributeInfoRequest
     * @return GetImageDistributeInfoResponse
     */
    CompletableFuture<GetImageDistributeInfoResponse> getImageDistributeInfo(GetImageDistributeInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the details of a specified model provider template in the Wuying Agent Management Center, including the provider name, description, and connection configuration list.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * @param request the request parameters of GetModelProviderTemplate  GetModelProviderTemplateRequest
     * @return GetModelProviderTemplateResponse
     */
    CompletableFuture<GetModelProviderTemplateResponse> getModelProviderTemplate(GetModelProviderTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation to retrieve the credentials and connection information required for a client to establish an MQTT connection.</p>
     * <ol>
     * <li>Use <code>MqttUsername</code> and <code>MqttPassword</code> as the username and password when connecting the MQTT client.</li>
     * <li>Use <code>MqttEndpoint</code> as the connection endpoint. If the client meets the required VPC network access conditions, you can use <code>MqttVPCEndpoint</code>. <code>MqttInstanceId</code> is used for token authentication, and <code>MqttGroupId</code> is used to concatenate the MQTT ClientId.</li>
     * <li>Distinguish between publish and subscribe topics based on the <code>topic</code>, <code>type</code>, and <code>permission</code> fields of each item in <code>TopicList</code>. <code>W</code> indicates publish permission, and <code>R</code> indicates subscribe permission.</li>
     * <li><code>ExpireTimeStamp</code> is the UNIX timestamp in milliseconds when the password expires. Credentials may be reused. Retrieve new credentials based on the expiration time returned in the response.
     * The device identity and request IDs in the documentation are demo data. The domain name uses the <code>example.com</code> sample domain. Credentials and instance identity are sample or desensitized values. These examples cannot be used directly for actual connections.</li>
     * </ol>
     * 
     * @param request the request parameters of GetMqttTicket  GetMqttTicketRequest
     * @return GetMqttTicketResponse
     */
    CompletableFuture<GetMqttTicketResponse> getMqttTicket(GetMqttTicketRequest request);

    /**
     * @param request the request parameters of GetOtaTaskByTaskId  GetOtaTaskByTaskIdRequest
     * @return GetOtaTaskByTaskIdResponse
     */
    CompletableFuture<GetOtaTaskByTaskIdResponse> getOtaTaskByTaskId(GetOtaTaskByTaskIdRequest request);

    /**
     * @param request the request parameters of GetResourceGroupAgentModelSettings  GetResourceGroupAgentModelSettingsRequest
     * @return GetResourceGroupAgentModelSettingsResponse
     */
    CompletableFuture<GetResourceGroupAgentModelSettingsResponse> getResourceGroupAgentModelSettings(GetResourceGroupAgentModelSettingsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the resource scale-out price for an existing delivery group. A successful call returns only a quote and does not create an order or add nodes.
     * <strong>Before you call this operation, verify the following conditions:</strong></p>
     * <ul>
     * <li>The delivery group belongs to the current account and is located in a supported region in the Chinese mainland.</li>
     * <li>The product type is WUYING Cloud App or Cloud Browser, and the billing method is subscription and purchased by node. This operation does not apply to browser groups that use the pay-as-you-go billing method or are billed by monthly active users (MAU).</li>
     * <li>The order status of the delivery group is normal, a resource node pool is associated, and no paid but ineffective renewal or scale-in orders exist.</li>
     * <li>The target total number of nodes is greater than the current number of purchased nodes and does not exceed the node quota for the account in the corresponding region, product, and billing method.
     * <strong>Parameter relationships:</strong></li>
     * <li>ProductType, AppInstanceGroupId, and Amount are all required parameters and must be specified at the same time.</li>
     * <li>ProductType must match the product corresponding to AppInstanceGroupId.</li>
     * <li><strong>Amount is the total number of nodes after the scale-out, not the number of nodes added in this operation.</strong> The region, node specifications, and billing method are determined by the existing delivery group and do not need to be passed separately.
     * <strong>Call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Confirm the target delivery group and the current number of purchased nodes. For cloud app Common scenarios, you can first invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListAppInstanceGroup">ListAppInstanceGroup</a> to obtain the identity, and then invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetAppInstanceGroup">GetAppInstanceGroup</a> to query the configuration and NodePool.NodeAmount.</li>
     * <li>Invoke this operation with the same product type, delivery group identity, and target total number of nodes to read the price, coupons, and price calculation rules.</li>
     * <li>After confirming the quote, if you need to execute the scale-out, you can invoke <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ModifyNodePoolAmount">ModifyNodePoolAmount</a> and fill in the target total number in NodePool.NodeAmount as required by the operation. <strong>A successful price inquiry does not mean that an order has been created or the scale-out has been completed.</strong>
     * <strong>Example scenario:</strong>
     * If a cloud app delivery group currently has 1 purchased subscription node and the target is to scale out to 2 nodes, set ProductType to CloudApp, AppInstanceGroupId to the ID of the delivery group, and Amount to 2. Replace the masked resource ID with the actual value under the current account. The example quantity does not represent a default value or quota limit. The price example only illustrates the relationship between the original price, discount amount, and discounted price, and does not represent the fixed selling price of the specification.</li>
     * </ol>
     * 
     * @param request the request parameters of GetResourceModifyPrice  GetResourceModifyPriceRequest
     * @return GetResourceModifyPriceResponse
     */
    CompletableFuture<GetResourceModifyPriceResponse> getResourceModifyPrice(GetResourceModifyPriceRequest request);

    /**
     * @param request the request parameters of GetResourcePrice  GetResourcePriceRequest
     * @return GetResourcePriceResponse
     */
    CompletableFuture<GetResourcePriceResponse> getResourcePrice(GetResourcePriceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the maximum quantity quota. It does not query the used quota, remaining quota, or real-time resource inventory.
     * <strong>Parameter relationships:</strong></p>
     * <ul>
     * <li><code>ResourceType</code> and <code>ProductType</code> are required.</li>
     * <li><code>BizRegionId</code> and <code>ChargeType</code> are optional query conditions and can be specified at the same time. They must be consistent with subsequent purchase or authorization operations.</li>
     * <li>If the region or billing method is omitted, the general quota for the corresponding dimension is queried. The quotas of different regions or billing methods are not added together.</li>
     * <li>If multiple quotas apply at the same time, the larger limit is returned.
     * <strong>Call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Select the resource type, product, business region, and billing method of the payer based on subsequent business needs.</li>
     * <li>Invoke this operation to read <code>Data</code>. Query <code>AppInstanceGroup</code> before creating a delivery group, query <code>AppAuthUser</code> before authorizing an authorized user, and query <code>PoolNodeAmount</code> before purchasing or scaling out nodes.</li>
     * <li>Query the current usage in combination with resources, and then verify the current operation through subsequent creation, authorization, or scale-out operations. <strong>This query does not reserve quotas or guarantee the success of subsequent purchases.</strong>
     * <code>Data=2147483647</code> indicates that no smaller quota limit is obtained in this query. It does not mean that the physical inventory is unlimited.</li>
     * </ol>
     * 
     * @param request the request parameters of GetResourceQuota  GetResourceQuotaRequest
     * @return GetResourceQuotaResponse
     */
    CompletableFuture<GetResourceQuotaResponse> getResourceQuota(GetResourceQuotaRequest request);

    /**
     * @param request the request parameters of GetResourceRenewPrice  GetResourceRenewPriceRequest
     * @return GetResourceRenewPriceResponse
     */
    CompletableFuture<GetResourceRenewPriceResponse> getResourceRenewPrice(GetResourceRenewPriceRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the third-party channel configuration status for agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center.
     * Before calling this operation, make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of GetRuntimeChannel  GetRuntimeChannelRequest
     * @return GetRuntimeChannelResponse
     */
    CompletableFuture<GetRuntimeChannelResponse> getRuntimeChannel(GetRuntimeChannelRequest request);

    /**
     * @param request the request parameters of GetRuntimeChannelQrCodeDetail  GetRuntimeChannelQrCodeDetailRequest
     * @return GetRuntimeChannelQrCodeDetailResponse
     */
    CompletableFuture<GetRuntimeChannelQrCodeDetailResponse> getRuntimeChannelQrCodeDetail(GetRuntimeChannelQrCodeDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the details of the model configuration currently bound to a specified cloud desktop in the Wuying Agent Management Center, including the model group, model provider list, and associated model information. When the risk information mode is enabled, you can also identify discrepancies between the end user\&quot;s actual configuration and the configuration delivered by the administrator.</p>
     * 
     * @param request the request parameters of GetRuntimeModelConfig  GetRuntimeModelConfigRequest
     * @return GetRuntimeModelConfigResponse
     */
    CompletableFuture<GetRuntimeModelConfigResponse> getRuntimeModelConfig(GetRuntimeModelConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Supports two query methods:</p>
     * <ul>
     * <li><strong>By task ID</strong>: Pass TaskId. This method takes precedence over resource information queries.</li>
     * <li><strong>By resource</strong>: Omit TaskId, and pass EntityId, EntityType, and TaskCategory. You can use EntityVersionId to specify the resource version.
     * The API returns the current task status and recorded step information. Determine the overall task result based on Status. The success of a single step does not mean the entire task is successful. You can call ListTaskStep to query the names and categories of image creation and application adaptation steps.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Specify the agent provider, business platform, and business type corresponding to the configuration. After modification, you can use the same combination to query whether the configuration has been updated.</p>
     * 
     * @param request the request parameters of GetTenantMemoryConfig  GetTenantMemoryConfigRequest
     * @return GetTenantMemoryConfigResponse
     */
    CompletableFuture<GetTenantMemoryConfigResponse> getTenantMemoryConfig(GetTenantMemoryConfigRequest request);

    /**
     * <b>description</b> :
     * <p>FileType currently supports only TASK. Use the returned OSS endpoint, bucket, file directory, and temporary credentials to upload files. After the file is uploaded, you can pass the complete OSS object path to ImportImage. Expiration is not supported.</p>
     * 
     * @param request the request parameters of GetUploadInfo  GetUploadInfoRequest
     * @return GetUploadInfoResponse
     */
    CompletableFuture<GetUploadInfoResponse> getUploadInfo(GetUploadInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only ProductType=CloudDesktop is supported. Upload the image file first, and then pass its OSS object path to initiate the import. You can call GetUploadInfo to obtain upload credentials. After the API returns the image and version IDs, you can call GetImageById or GetImageDistributeInfo to query the creation and distribution status. A successful response indicates that the import request has been accepted, not that the image is already available.</p>
     * 
     * @param request the request parameters of ImportImage  ImportImageRequest
     * @return ImportImageResponse
     */
    CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request);

    /**
     * <b>description</b> :
     * <p>Filter by Agent provider, business platform, business type, end user, and instance memory switch as needed. Retain the filter conditions and increment the page number when navigating to the next page.</p>
     * 
     * @param request the request parameters of ListAgentInstanceMemory  ListAgentInstanceMemoryRequest
     * @return ListAgentInstanceMemoryResponse
     */
    CompletableFuture<ListAgentInstanceMemoryResponse> listAgentInstanceMemory(ListAgentInstanceMemoryRequest request);

    /**
     * @param request the request parameters of ListAgentInstanceVersions  ListAgentInstanceVersionsRequest
     * @return ListAgentInstanceVersionsResponse
     */
    CompletableFuture<ListAgentInstanceVersionsResponse> listAgentInstanceVersions(ListAgentInstanceVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>When multiple filter conditions are specified, they take effect together. AppName supports contains matching. If a single-value filter and the corresponding list filter are specified at the same time, the intersection is used. To avoid empty results, specify only one of them.
     * If PageSize is omitted, the default value is 10. We recommend that you start from page 1 and query page by page until the number of retrieved records reaches the value of Count. Before you delete an application, check the Deletable field.</p>
     * 
     * @param request the request parameters of ListApp  ListAppRequest
     * @return ListAppResponse
     */
    CompletableFuture<ListAppResponse> listApp(ListAppRequest request);

    /**
     * @param request the request parameters of ListAppInstanceGroup  ListAppInstanceGroupRequest
     * @return ListAppInstanceGroupResponse
     */
    CompletableFuture<ListAppInstanceGroupResponse> listAppInstanceGroup(ListAppInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to select session specifications and does not create resources. The returned scope is affected by the available specifications and business region of the account. An empty result does not indicate a request failure.
     * <strong>Filtering and pagination:</strong></p>
     * <ul>
     * <li><code>ProductType</code> is required. Explicitly specify <code>BizRegionId</code>, <code>PageNumber</code>, and <code>PageSize</code>.</li>
     * <li>If <code>BizRegionId</code> is not provided, the region of the current request is used. You can call <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/ListRegions">ListRegions</a> to obtain the business region.</li>
     * <li>You can specify both <code>AppInstanceType</code> and <code>AppInstanceTypeList</code>. In this case, only the specifications that meet both conditions are returned. No priority override exists. The list can contain up to 100 items.</li>
     * <li>The specification family, CPU, memory, GPU memory, operating system, and category conditions are filtered by intersection. The union is not automatically applied.</li>
     * <li>Pass <code>PageNumber</code> starting from 1. Use <code>TotalCount</code>, <code>PageSize</code>, and <code>PageNumber</code> to continue pagination until all matching results are read.
     * <strong>Inventory and subsequent calls:</strong></li>
     * <li>Inventory is queried only when <code>QueryInventory=true</code>. If inventory information is not obtained, you cannot determine that the inventory is 0.</li>
     * <li>The inventory is the current query result and does not represent a successful reservation.</li>
     * <li>After obtaining <code>AppInstanceType</code>, you can query the price based on the session specification parameter requirements of <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetResourcePrice">GetResourcePrice</a>.</li>
     * <li>The current query does not use <code>AppCenterImageId</code> to filter specifications. Do not use this parameter to determine the compatibility between images and specifications.
     * Field examples are used to demonstrate how to fill in the fields. The existence of example specifications in the selected region or account is not guaranteed. The GPU count field does not currently provide values. Use the GPU memory field to understand the specifications.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAppInstanceType  ListAppInstanceTypeRequest
     * @return ListAppInstanceTypeResponse
     */
    CompletableFuture<ListAppInstanceTypeResponse> listAppInstanceType(ListAppInstanceTypeRequest request);

    /**
     * @param request the request parameters of ListAppInstances  ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    CompletableFuture<ListAppInstancesResponse> listAppInstances(ListAppInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation returns the list of deployed applications in the application image used by a specified delivery group, including the application ID, name, version, icon, and the number of users currently <strong>authorized by application</strong> for each application (AuthorizedUserCount).
     * The returned AppId is the input for per-application authorization: when you call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to add or remove authorized users for a specified application in a delivery group, pass in the AppId returned by this operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The delivery group is created, and <strong>ProductType matches the product type of the delivery group</strong>. If the delivery group does not exist or the product type does not match, the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>AppInstanceGroupId is required</strong>. This parameter is marked as optional in the parameter table, but the error code <code>InvalidParameter.AppInstanceGroupId</code> is returned if it is not specified.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100. If the values are invalid, the error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code> are returned respectively.</li>
     * <li>If no applications are deployed in the delivery group image, the operation returns normally: Apps is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId).</li>
     * <li>Call this operation to obtain the list of deployed applications in the delivery group and the AppId of each application.</li>
     * <li>To authorize by application, call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation with the returned AppId.</li>
     * </ol>
     * 
     * @param request the request parameters of ListAppsByAppInstanceGroupId  ListAppsByAppInstanceGroupIdRequest
     * @return ListAppsByAppInstanceGroupIdResponse
     */
    CompletableFuture<ListAppsByAppInstanceGroupIdResponse> listAppsByAppInstanceGroupId(ListAppsByAppInstanceGroupIdRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the list of app instance groups to which a specified user (EndUserId) has been granted <strong>app instance group-level authorization</strong>. It returns the basic information of each app instance group (such as ID, name, status, region, creation time, and expiration time) and the list of applications deployed in the app instance group.
     * Scope of returned results:</p>
     * <ul>
     * <li>Only app instance groups that are authorized to the user as a whole through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are returned. Records authorized for individual applications through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation are not included.</li>
     * <li>Only app instance groups whose product type matches ProductType and that are not deleted are returned. If no applications are deployed in the app instance group image, the app instance group is not returned.</li>
     * <li>The results are sorted in descending order based on the update time of the authorization records. The most recently authorized or modified app instance groups are ranked first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation is called to authorize the app instance group to the user.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType and EndUserId are required</strong>. If ProductType is not specified, the error code <code>InvalidParameter.ProductType</code> is returned. If EndUserId is not specified, the error code <code>InvalidParameter.UserId</code> is returned.</li>
     * <li>EndUserId uses <strong>exact match</strong> based on the username. AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName use <strong>fuzzy match</strong> (a hit occurs if the string is contained). If multiple filter conditions are specified, all conditions must be met.</li>
     * <li>PageNumber starts from 1. Valid values for PageSize: 1 to 100.</li>
     * <li>If the user does not have any app instance groups with authorization that meet the conditional requirements, the operation returns a normal response: AppInstanceGroupModels is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID, and then call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the app instance group to the user.</li>
     * <li>Call this operation to query the app instance groups authorized for the user and the applications deployed in the app instance groups.</li>
     * <li>To obtain the application connection ticket for the user, call the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation based on the returned AppInstanceGroupId and the AppId in Apps.</li>
     * </ol>
     * 
     * @param request the request parameters of ListAuthorizedAppInstanceGroupByUser  ListAuthorizedAppInstanceGroupByUserRequest
     * @return ListAuthorizedAppInstanceGroupByUserResponse
     */
    CompletableFuture<ListAuthorizedAppInstanceGroupByUserResponse> listAuthorizedAppInstanceGroupByUser(ListAuthorizedAppInstanceGroupByUserRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the applications authorized for a specified user at the application level. <strong>It returns only the records of applications authorized for the user at the application level</strong> (for example, authorization completed by calling the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). Authorization granted for an entire app instance group by calling the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation is not included in the response.
     * The response is deduplicated by the combination of app instance group and application. Each record corresponds to an application within an app instance group.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The user exists in the current account. If the user does not exist, the error code User.NotFound is returned. You can call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the username.</li>
     * <li>The app instance group to which the application belongs has been created, and the application has been authorized for the user at the application level. If no application-level authorization has been performed, an empty application list is returned.</li>
     * </ul>
     * <h2>Metric description</h2>
     * <ul>
     * <li><strong>EndUserId and ProductType are required.</strong> Set ProductType to CloudApp, which indicates WUYING Cloud App.</li>
     * <li>AppInstanceGroupId, AppId, AppInstanceGroupName, and AppName are optional filter conditions. Fuzzy match is used for all these parameters, and they can be used in any combination. If all of them are omitted, all application-level authorization records for the user are returned.</li>
     * <li>Use PageNumber and PageSize for paging. PageNumber starts from 1, and the valid values for PageSize range from 1 to 100. You can determine whether to continue the query based on the returned TotalCount.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the app instance group ID (AppInstanceGroupId) and the application IDs (AppId in the Apps list) of the applications deployed in the app instance group.</li>
     * <li>Call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize the applications for the target user.</li>
     * <li>Call this operation to query the applications authorized for the user.</li>
     * </ol>
     * 
     * @param request the request parameters of ListAuthorizedAppsByUser  ListAuthorizedAppsByUserRequest
     * @return ListAuthorizedAppsByUserResponse
     */
    CompletableFuture<ListAuthorizedAppsByUserResponse> listAuthorizedAppsByUser(ListAuthorizedAppsByUserRequest request);

    /**
     * @param request the request parameters of ListAuthorizedUserGroups  ListAuthorizedUserGroupsRequest
     * @return ListAuthorizedUserGroupsResponse
     */
    CompletableFuture<ListAuthorizedUserGroupsResponse> listAuthorizedUserGroups(ListAuthorizedUserGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the currently authorized users of a specified app instance group (AppInstanceGroupId) or app instance group set (AppInstanceGroupSetId). It returns the username, account type, email address, phone number, and the authorization mode of the app instance group to which each user belongs.</p>
     * <ul>
     * <li>This operation returns <strong>authorization relationships</strong>, which does not indicate that the users are currently online or have established connections.</li>
     * <li>In the Cloud Browser product, an app instance group is a cloud browser group, and the app instance group ID is the browser group ID.
     * The return scope depends on the authorization mode of the app instance group (the AuthMode response parameter):</li>
     * <li>When the authorization mode is <code>App</code> (application authorization) or <code>AppInstanceGroup</code> (app instance group authorization): returns the users authorized by app instance group through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation and the users authorized by application through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If AppId is specified, only the users <strong>specifically authorized for this application</strong> are returned.</li>
     * <li>When the authorization mode is <code>Session</code> (session authorization): returns the users who are granted persistent sessions, and lists all persistent session IDs granted to each user in AppInstancePersistentIds. If AppInstancePersistentId is specified, only the users granted this session are returned.</li>
     * <li>When querying by app instance group set: returns the users authorized to the set. The AppInstanceGroupId response parameter is the primary app instance group ID of the set, and AppInstanceGroupSetId is the ID of the queried set.
     * When querying by app instance group, the results are sorted in descending order of authorization time, with the most recently authorized users listed first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The target app instance group or app instance group set has been created, belongs to the current account, and its product type matches ProductType. Otherwise, a resource not found error code is returned.</li>
     * <li>Users have been authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> or <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If no users have been authorized, the operation returns a normal response with Users as an empty list and TotalCount as 0.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType, PageNumber, and PageSize are required</strong>. If the value of ProductType is invalid, the <code>ProductTypeInvalid</code> error code is returned.</li>
     * <li><strong>You must specify either AppInstanceGroupId or AppInstanceGroupSetId, but not both</strong>. If both are specified or neither is specified, the <code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code> error code is returned.</li>
     * <li><strong>AppId and AppInstancePersistentId are not supported when querying by app instance group set</strong>. If either is specified, the <code>InvalidParameter.AppId</code> or <code>InvalidParameter.AppInstancePersistentId</code> error code is returned.</li>
     * <li>EndUserId performs <strong>exact match</strong> by username, and UserIdFuzzy performs <strong>fuzzy match</strong> by username (a hit occurs if the username contains the keyword). Both can be specified at the same time, and both conditions must be met.</li>
     * <li>PageNumber starts from 1. The value range of PageSize is 1 to 100.</li>
     * <li>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, TotalCount is the <strong>number of authorization records</strong> that meet the conditions. If the same user has multiple authorization records (for example, authorized for multiple applications), the user is merged into one in Users. Therefore, the number of users returned on the current page may be less than PageSize. Use TotalCount to determine whether to continue paging. When the authorization mode is <code>Session</code>, TotalCount is the number of deduplicated users.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID. For cloud browser groups, call the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</li>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize by app instance group, or call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize by application.</li>
     * <li>Call this operation to query the authorized users. To remove authorization, pass the returned EndUserId to the UnAuthorizeUserIds parameter of the preceding authorization operations.</li>
     * </ol>
     * <h2>Error codes</h2>
     * <ul>
     * <li><code>ProductTypeInvalid</code>: The value of ProductType is invalid.</li>
     * <li><code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code>: Both AppInstanceGroupId and AppInstanceGroupSetId are specified, or neither is specified.</li>
     * <li><code>InvalidParameter.AppId</code>: AppId is specified when querying by app instance group set.</li>
     * <li><code>InvalidParameter.AppInstancePersistentId</code>: AppInstancePersistentId is specified when querying by app instance group set.</li>
     * <li><code>InvalidAppInstanceGroupSpecItem.NotFound</code>: The app instance group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidBrowserInstanceGroup.NotFound</code>: When ProductType is <code>CloudBrowser</code>, the cloud browser group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidAppInstanceGroupSet.NotFound</code>: The app instance group set does not exist, does not belong to the current account, the product type does not match, or there is no available primary app instance group in the set.</li>
     * <li><code>InvalidAppInstanceGroupSet.ActivationFailed</code>: The app instance group set is not in an available state.</li>
     * </ul>
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
     * @param request the request parameters of ListBrowserBookmarks  ListBrowserBookmarksRequest
     * @return ListBrowserBookmarksResponse
     */
    CompletableFuture<ListBrowserBookmarksResponse> listBrowserBookmarks(ListBrowserBookmarksRequest request);

    /**
     * <b>description</b> :
     * <p>This topic describes how to use queries in the monthly active user (MAU) billing scenario.</p>
     * <h2>Query conditions</h2>
     * <p>You can filter by browser group identity, name, business region, office network, set, authorized user group, and status. You can specify only one value for status filtering at a time.</p>
     * <h2>Paging</h2>
     * <p>Use <code>PageNumber</code> and <code>PageSize</code> to perform a paged query. Use the returned <code>TotalCount</code> to determine whether to query the next page.</p>
     * <h2>What to do next</h2>
     * <p>To view the detailed configuration of a single browser group, invoke <code>GetBrowserInstanceGroup</code> by using the returned identity.</p>
     * <h2>Example description</h2>
     * <p>The <code>-</code> in the examples only indicates that the current scenario does not apply or the field is not returned. It is not a character string actually returned by the API operation. Common resource identity examples are masked. Use the actual query results when you use them.</p>
     * 
     * @param request the request parameters of ListBrowserInstanceGroup  ListBrowserInstanceGroupRequest
     * @return ListBrowserInstanceGroupResponse
     */
    CompletableFuture<ListBrowserInstanceGroupResponse> listBrowserInstanceGroup(ListBrowserInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Invoke this operation to perform a paging query on the list of access restriction URLs (Restricted URLs) configured for a cloud browser delivery group or delivery group set to view the details of the URLs configured in the current access control policy.
     * You must specify either BrowserInstanceGroupId or BrowserInstanceGroupSetId, but not both. If you specify BrowserInstanceGroupId, the restricted URLs for the delivery group are queried. If you specify BrowserInstanceGroupSetId, the restricted URLs for the delivery group set are queried. Specifying both or neither returns a parameter error.
     * You can use Keyword to filter restricted URLs by using a case-insensitive include match. If this parameter is not specified, all restricted URLs are returned. Pagination is controlled by PageNumber and PageSize. Valid values for PageSize: 1 to 200. Default value: 200. Default value for PageNumber: 0. If the value is less than 1, the first page is returned. In the response, TotalCount indicates the total number of records that meet the filter conditions, and Data contains the records on the current page. If no data is found, an empty array is returned.</p>
     * 
     * @param request the request parameters of ListBrowserRestrictedURLs  ListBrowserRestrictedURLsRequest
     * @return ListBrowserRestrictedURLsResponse
     */
    CompletableFuture<ListBrowserRestrictedURLsResponse> listBrowserRestrictedURLs(ListBrowserRestrictedURLsRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation to query the execution results of a command invocation (InvocationId) across persistent sessions. This allows you to track the execution status and obtain the command output. The InvocationId is the command execution ID returned when you call RunAppInstanceCommand to deliver a command.
     * Currently, only WuyingServer is supported for ProductType. You must specify at least one of AppInstanceGroupIds and AppInstanceGroupId. If both are specified, AppInstanceGroupIds takes precedence. When AppInstanceGroupIds is specified, you can pass up to 200 delivery group IDs, and these delivery groups must be in the same region. If any delivery group does not exist, a delivery group not found error is returned. If the delivery groups are in different regions, a region mismatch error is returned. When only AppInstanceGroupId is specified, the command execution results under this delivery group are queried.
     * You can use AppInstancePersistentIds to query the execution results of only specified persistent sessions. When AppInstanceGroupIds is specified, only persistent sessions that belong to these delivery groups are retained. If no matching persistent sessions are found, an empty list is returned and TotalCount is 0. For pagination, use PageNumber and PageSize. MaxResults and NextToken do not take effect currently.</p>
     * 
     * @param request the request parameters of ListCommandInvocationResults  ListCommandInvocationResultsRequest
     * @return ListCommandInvocationResultsResponse
     */
    CompletableFuture<ListCommandInvocationResultsResponse> listCommandInvocationResults(ListCommandInvocationResultsRequest request);

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
     * <p>Supports filtering by image ID, name, status, type, package type, operating system, business line, product type, and protocol type. Multiple filter conditions take effect simultaneously, and the results are returned in descending order of image creation time. Returns the basic information and version identifiers of images. To obtain specific version and region distribution information, call ListImage.</p>
     * 
     * @param request the request parameters of ListImageBaseInfo  ListImageBaseInfoRequest
     * @return ListImageBaseInfoResponse
     */
    CompletableFuture<ListImageBaseInfoResponse> listImageBaseInfo(ListImageBaseInfoRequest request);

    /**
     * @param request the request parameters of ListImageTags  ListImageTagsRequest
     * @return ListImageTagsResponse
     */
    CompletableFuture<ListImageTagsResponse> listImageTags(ListImageTagsRequest request);

    /**
     * <b>description</b> :
     * <p>You can use paging to query the list of model templates under a model provider template in the Wuying Agent Management Center. You can filter the results by model group ID, model provider template ID, model template ID, and model encoding. When you query by model group, the default model is automatically pinned to the top.
     * Before you call this operation, make sure that you fully understand the operations and usage of the Wuying Agent Management Center.</p>
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
     * @param request the request parameters of ListModelProviderLlmCodes  ListModelProviderLlmCodesRequest
     * @return ListModelProviderLlmCodesResponse
     */
    CompletableFuture<ListModelProviderLlmCodesResponse> listModelProviderLlmCodes(ListModelProviderLlmCodesRequest request);

    /**
     * <b>description</b> :
     * <p>You can use paging to query the list of model provider templates under a specified model group in the Wuying Agent Management Center. You can filter the templates by provider name, model group ID, and provider template ID. Make sure that you are fully familiar with the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
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
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:ListPublishedAppInstanceGroup permission.
     * Only delivery groups that are in the published state and have deployed applications in their images are included in the query results. This operation only queries information. It does not create delivery groups, assign users, or grant application access permissions.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify ProductType, PageNumber, and PageSize.</strong> The page number starts from 1, and the number of entries per page ranges from 1 to 100.</li>
     * <li>AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName all support fuzzy match. You can specify them individually or in combination. If multiple conditions are specified, all conditions must be met. If both AppId and AppName are specified, they must be met by the same application.</li>
     * <li>If an optional filter parameter is not specified or an empty string is specified, the condition is not used for filtering. The query results are sorted in descending order of the delivery group creation time. A delivery group is not returned multiple times even if it contains multiple matched applications.</li>
     * <li>ExcludeUserId is used to exclude delivery groups for which all applications have been directly authorized to a specified user. It cannot be used to determine whether the user has no access permissions at all.</li>
     * <li>AppId and AppName only filter delivery groups and <strong>do not limit the returned Apps list to the matched applications</strong>.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Initiate a query with PageNumber=1 and the required PageSize. For Wuying Cloud App scenarios, set ProductType=CloudApp.</li>
     * <li>Read AppInstanceGroupModels. To retrieve the next page, keep the product type and filter conditions unchanged and increment PageNumber. If no delivery groups match the conditions, the total count is 0 and the list is empty. If the page number exceeds the range of the current results, the list may also be empty, but the total count still indicates the total number of all matched delivery groups.</li>
     * <li>To obtain the details of a single delivery group, pass the complete AppInstanceGroupId returned and the same ProductType to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The desensitized identity in the examples is used to demonstrate the format. Replace it with your actual identity when you call the operation.</li>
     * </ol>
     * 
     * @param request the request parameters of ListPublishedAppInstanceGroup  ListPublishedAppInstanceGroupRequest
     * @return ListPublishedAppInstanceGroupResponse
     */
    CompletableFuture<ListPublishedAppInstanceGroupResponse> listPublishedAppInstanceGroup(ListPublishedAppInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>To call this operation as a RAM user or by using STS credentials, you must have the <code>appstreaming:ListPublishedApps</code> permission.
     * Only applications deployed in the images of published delivery groups are returned in the query results. This operation only queries information. It does not create delivery groups, nor does it grant or revoke application access permissions.</p>
     * <h2>Return granularity</h2>
     * <p>Results are returned item by item based on the &quot;delivery group + application&quot; combination. If the same application is deployed in multiple published delivery groups, multiple records are returned. <code>TotalCount</code> also counts the number of combinations. The list is sorted in descending order of the creation time of the associated delivery groups.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> The page number starts from <code>1</code>, and the number of entries per page ranges from <code>1</code> to <code>100</code>. If the values are invalid, the error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code> are returned, respectively.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can specify them individually or in combination. If multiple conditions are specified, all conditions must be met.</li>
     * <li>If an optional filter parameter is not specified or an empty string is passed, filtering is not performed based on this condition.</li>
     * <li><code>ExcludeUserId</code> is used to exclude applications that have been authorized for a specified user on a per-application basis, making it easier to filter out applications that can still be authorized for the user. <strong>Access permissions obtained through overall delivery group authorization or user groups are not evaluated by this condition.</strong></li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Initiate a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud App scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>Apps</code>. To retrieve the next page, keep the product type and filter conditions unchanged and increment <code>PageNumber</code>. If no matching results are found, <code>TotalCount</code> is <code>0</code> and <code>Apps</code> is an empty list. If the page number exceeds the result range, <code>Apps</code> may also be empty, but <code>TotalCount</code> still indicates the total number of matching records.</li>
     * <li>When you need to grant authorization to a user for an application on a per-application basis, pass the returned <code>AppInstanceGroupId</code>, <code>AppId</code>, and the same <code>ProductType</code> to <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a>. To view delivery group details, pass <code>AppInstanceGroupId</code> and <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identity in the examples is used to demonstrate the format. Replace it with your actual identity when you invoke the operation.</li>
     * </ol>
     * 
     * @param request the request parameters of ListPublishedApps  ListPublishedAppsRequest
     * @return ListPublishedAppsResponse
     */
    CompletableFuture<ListPublishedAppsResponse> listPublishedApps(ListPublishedAppsRequest request);

    /**
     * <b>description</b> :
     * <p>The returned results are affected by the available region configurations of the account and the product type. If ProductType is omitted, the query is performed based on CloudApp.
     * This operation returns the regions available for image services. You cannot use this information to determine whether a specific image has been distributed to these regions. Before you create or distribute an image based on a parent image, you must also check the region information of the destination image.</p>
     * 
     * @param request the request parameters of ListRegionId  ListRegionIdRequest
     * @return ListRegionIdResponse
     */
    CompletableFuture<ListRegionIdResponse> listRegionId(ListRegionIdRequest request);

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
     * @param request the request parameters of ListRelatedResource  ListRelatedResourceRequest
     * @return ListRelatedResourceResponse
     */
    CompletableFuture<ListRelatedResourceResponse> listRelatedResource(ListRelatedResourceRequest request);

    /**
     * @param request the request parameters of ListTagCloudResources  ListTagCloudResourcesRequest
     * @return ListTagCloudResourcesResponse
     */
    CompletableFuture<ListTagCloudResourcesResponse> listTagCloudResources(ListTagCloudResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation follows the Alibaba Cloud tagging specification and is used to query tags bound to Wuying Cloud App delivery groups. You can view the tags bound to resources by resource ID, or filter resources bound to specified tags by tag keys and values.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>A delivery group is created. You can obtain the delivery group ID by calling the ListAppInstanceGroup operation.</li>
     * <li>Tags are bound to the delivery group. You can bind tags by calling the TagResources operation, or bind them in the console or Tag service.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ResourceType is required</strong>. Only <code>APPINSTANCEGROUP</code> (delivery group) is supported. If you specify other values, the error code <code>InvalidResourceType.Invalid</code> is returned.</li>
     * <li><strong>You must specify at least one of ResourceId.N and Tag.N</strong>. If neither is specified, the error code <code>MissingParameter.ResourceIdsOrTags</code> is returned.<ul>
     * <li>If only ResourceId.N is specified: all tags bound to these resources are returned.</li>
     * <li>If only Tag.N is specified: all resources bound to the specified tags and their matched tags are returned.</li>
     * <li>If both are specified: only records of the specified resources bound to the specified tags are returned.</li>
     * </ul>
     * </li>
     * <li>Tag.N.Key is required. If it is empty, the error code <code>InvalidTagPolicy.KeyInvalid</code> is returned. Tag.N.Value is optional. If it is not specified, the value corresponding to the tag key is not limited.</li>
     * <li>Multiple Tag.N parameters have an AND relationship. A resource is returned only if it is bound to all specified tags.</li>
     * </ul>
     * <h2>Response description</h2>
     * <ul>
     * <li>The response returns one record for each resource and tag key-value pair. If a resource is bound to multiple tags, multiple records are returned.</li>
     * <li>TotalCount indicates the number of records returned in the current request.</li>
     * <li>This operation returns all matched results at once. An empty NextToken in the response indicates that no more data is available.</li>
     * </ul>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Call ListAppInstanceGroup to obtain the delivery group ID.</li>
     * <li>Call TagResources to bind tags to the delivery group.</li>
     * <li>Call this operation to query the binding relationships by resource ID or tag condition.</li>
     * </ol>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Returns application adaptation steps when Type is set to ADAPTOR, and image creation steps when Type is set to IMAGE.
     * This operation returns step definitions, not the actual progress of a specific task. Read the step definitions first, and then display the task progress based on the current step and step status returned by GetTask. The step sets vary across different task types. Do not use the step index as the completion percentage.</p>
     * 
     * @param request the request parameters of ListTaskStep  ListTaskStepRequest
     * @return ListTaskStepResponse
     */
    CompletableFuture<ListTaskStepResponse> listTaskStep(ListTaskStepRequest request);

    /**
     * @param request the request parameters of ListTenantConfig  ListTenantConfigRequest
     * @return ListTenantConfigResponse
     */
    CompletableFuture<ListTenantConfigResponse> listTenantConfig(ListTenantConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the list of WUYING workstations.</p>
     * 
     * @param request the request parameters of ListWuyingServer  ListWuyingServerRequest
     * @return ListWuyingServerResponse
     */
    CompletableFuture<ListWuyingServerResponse> listWuyingServer(ListWuyingServerRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the workload templates available for existing virtual node pools under the current account.</p>
     * <h3>Prerequisites and invocation sequence</h3>
     * <p><strong>You must provide a valid virtual node pool ID that exists under the current account. Querying templates does not require the node pool to be attached to a workstation.</strong></p>
     * <ol>
     * <li>If you already have a node pool ID, you can directly pass it as <code>VirtualNodePoolId</code> to invoke this operation.</li>
     * <li>If a workstation is already associated with a node pool, you can also invoke <a href="~~ListWuyingServer~~">ListWuyingServer</a> to obtain a non-empty <code>VirtualNodePoolId</code> from the corresponding record. This is one way to obtain the ID, but it is not a mandatory step for querying templates.</li>
     * <li>If an empty ID is returned, do not use this value to continue querying. You must obtain a valid node pool ID under the current account before invoking this operation. Do not use a workstation ID, cluster ID, the character string <code>null</code>, or a self-constructed ID.
     * This operation does not create node pools. <a href="~~CreateWuyingServer~~">CreateWuyingServer</a> only associates existing node pools and does not support automatic creation of node pools. If the node pool does not exist or does not belong to the current account, <code>InvalidParameter.VirtualNodePoolId</code> is returned.</li>
     * </ol>
     * <h3>Response</h3>
     * <p>Returns the first 100 records sorted by template configuration order. The template content is Base64-encoded after UTF-8 encoding. You must perform Base64 decoding before use. The current version does not use <code>MaxResults</code> and <code>NextToken</code> for pagination.</p>
     * 
     * @param request the request parameters of ListWuyingServerWorkloadTemplate  ListWuyingServerWorkloadTemplateRequest
     * @return ListWuyingServerWorkloadTemplateResponse
     */
    CompletableFuture<ListWuyingServerWorkloadTemplateResponse> listWuyingServerWorkloadTemplate(ListWuyingServerWorkloadTemplateRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation returns a list of available zone IDs that can be selected by the current Alibaba Cloud account based on the region, product type, and operating system type. A typical use case is to confirm which zones are available before creating a resource that requires a specified vSwitch, and then select a vSwitch located in one of these zones.
     * This operation only queries information. It does not create resources or incur fees.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:ListAppInstanceType permission. If you do not have the required permissions, the error code Forbidden.NoPermission is returned.</li>
     * <li><strong>ProductType, BizRegionId, and OsType are all required.</strong> If any of these parameters is missing, empty, or has an unrecognized value, the error code InvalidParameter.ValueInvalid is returned.</li>
     * <li>BizRegionId must be a region ID supported by App Streaming. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * <li>Call this operation by using the region ID, target product type, and operating system type, and then read the returned ListZonesModel.Zones.</li>
     * <li>When you create a resource and need to specify a vSwitch, select a vSwitch located in one of the returned zones. For example, pass the corresponding vSwitch ID when you call <a href="~~CreateAppInstanceGroup~~">CreateAppInstanceGroup</a> or <a href="~~CreateWuyingServer~~">CreateWuyingServer</a>.
     * The returned list of available zones is determined by the available resources in the current region and may change over time. Query the list in real time before creating resources instead of caching the list for a long time.</li>
     * </ol>
     * 
     * @param request the request parameters of ListZones  ListZonesRequest
     * @return ListZonesResponse
     */
    CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to pay-as-you-go resource delivery groups that have a scheduled scaling policy enabled. It can be called successfully only outside the scaling time windows specified in the scheduled scaling policy.</p>
     * </blockquote>
     * 
     * @param request the request parameters of LogOffAllSessionsInAppInstanceGroup  LogOffAllSessionsInAppInstanceGroupRequest
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    CompletableFuture<LogOffAllSessionsInAppInstanceGroupResponse> logOffAllSessionsInAppInstanceGroup(LogOffAllSessionsInAppInstanceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Call <code>ListAgentInstanceMemory</code> to obtain the target instance IDs. The server validates all instances in the request before updating the memory settings. After the update, you can query the memory settings of the instances.</p>
     * 
     * @param request the request parameters of ModifyAgentInstanceMemoryConfig  ModifyAgentInstanceMemoryConfigRequest
     * @return ModifyAgentInstanceMemoryConfigResponse
     */
    CompletableFuture<ModifyAgentInstanceMemoryConfigResponse> modifyAgentInstanceMemoryConfig(ModifyAgentInstanceMemoryConfigRequest request);

    /**
     * @param request the request parameters of ModifyAppInstanceGroupAttribute  ModifyAppInstanceGroupAttributeRequest
     * @return ModifyAppInstanceGroupAttributeResponse
     */
    CompletableFuture<ModifyAppInstanceGroupAttributeResponse> modifyAppInstanceGroupAttribute(ModifyAppInstanceGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation converts the billing method, which may create an order and trigger subsequent billing changes. <strong>A successful response or a returned task ID does not indicate that the new billing method has taken effect.</strong>
     * <strong>Prerequisites:</strong></p>
     * <ul>
     * <li>The resources belong to the current account, and the product and business region match the request. Only one app instance group can be specified per request.</li>
     * <li>The target billing method must be different from the current one, and the target resource specifications must support the corresponding sales and Billable methods.</li>
     * <li>App instance groups that have been added to a valid collection cannot have their Billable methods converted individually.</li>
     * <li>Multiple app instance groups created in the same batch of orders cannot have their Billable methods converted separately.
     * <strong>Parameter relationships and call sequence:</strong></li>
     * </ul>
     * <ol>
     * <li>Query the resource details first to confirm the product, business region, and current <code>ChargeType</code>. You can use <a href="https://api.aliyun.com/document/appstream-center/2021-09-01/GetAppInstanceGroup">GetAppInstanceGroup</a> to query cloud app instance groups.</li>
     * <li>Explicitly specify the target <code>ChargeType</code>. If you need to purchase a subscription, specify the purchase duration by combining <code>Period</code> and <code>PeriodUnit</code>. The period combination must comply with the sales rules currently supported by the resource.</li>
     * <li>Set <code>AutoPay</code> based on whether automatic payment is allowed. If auto-renewal is involved, explicitly set <code>AutoRenew</code>.</li>
     * <li>After the call, save the returned <code>AppInstanceGroupModel.TaskId</code>. If there are unpaid orders, complete the payment first, and then query the resource details again to confirm that the billing method has been changed.
     * This operation does not accept an expiration time parameter. Do not pass the expiration time from other operations into this request. The task examples only illustrate the purpose of the ID and do not define a fixed prefix or length for actual task IDs.</li>
     * </ol>
     * 
     * @param request the request parameters of ModifyAppInstanceGroupChargeType  ModifyAppInstanceGroupChargeTypeRequest
     * @return ModifyAppInstanceGroupChargeTypeResponse
     */
    CompletableFuture<ModifyAppInstanceGroupChargeTypeResponse> modifyAppInstanceGroupChargeType(ModifyAppInstanceGroupChargeTypeRequest request);

    /**
     * @param request the request parameters of ModifyAppPolicy  ModifyAppPolicyRequest
     * @return ModifyAppPolicyResponse
     */
    CompletableFuture<ModifyAppPolicyResponse> modifyAppPolicy(ModifyAppPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the properties of a Wuying cloud browser.</p>
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
     * @param request the request parameters of ModifyShareImage  ModifyShareImageRequest
     * @return ModifyShareImageResponse
     */
    CompletableFuture<ModifyShareImageResponse> modifyShareImage(ModifyShareImageRequest request);

    /**
     * @param request the request parameters of ModifyTenantConfig  ModifyTenantConfigRequest
     * @return ModifyTenantConfigResponse
     */
    CompletableFuture<ModifyTenantConfigResponse> modifyTenantConfig(ModifyTenantConfigRequest request);

    /**
     * <b>description</b> :
     * <p><em>Modifying the switch status also updates existing instances that have the corresponding memory feature configured under the same business combination.</em>* After the modification, call <code>GetTenantMemoryConfig</code> and pass the same provider, platform, and business type to verify the configuration.</p>
     * 
     * @param request the request parameters of ModifyTenantMemoryConfig  ModifyTenantMemoryConfigRequest
     * @return ModifyTenantMemoryConfigResponse
     */
    CompletableFuture<ModifyTenantMemoryConfigResponse> modifyTenantMemoryConfig(ModifyTenantMemoryConfigRequest request);

    /**
     * @param request the request parameters of ModifyWuyingServerAttribute  ModifyWuyingServerAttributeRequest
     * @return ModifyWuyingServerAttributeResponse
     */
    CompletableFuture<ModifyWuyingServerAttributeResponse> modifyWuyingServerAttribute(ModifyWuyingServerAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The workstation is created and belongs to the current account.</li>
     * <li>When you modify the specifications, the resource must be in the Deployed, Published Successfully, or Maintenance Failed state. The target specifications must be available in the region where the resource is located and compatible with the operating system and existing resource configurations.</li>
     * <li>Conversion between CPU specifications and GPU specifications is not supported.</li>
     * </ul>
     * <h2>Post-processing</h2>
     * <p>A successful response does not indicate that the specification change is complete. If the generated order is unpaid, complete the payment first, and then query the workstation status and specifications to confirm the change result.</p>
     * 
     * @param request the request parameters of ModifyWuyingServerSpec  ModifyWuyingServerSpecRequest
     * @return ModifyWuyingServerSpecResponse
     */
    CompletableFuture<ModifyWuyingServerSpecResponse> modifyWuyingServerSpec(ModifyWuyingServerSpecRequest request);

    /**
     * @param request the request parameters of PageListAppInstanceGroupUser  PageListAppInstanceGroupUserRequest
     * @return PageListAppInstanceGroupUserResponse
     */
    CompletableFuture<PageListAppInstanceGroupUserResponse> pageListAppInstanceGroupUser(PageListAppInstanceGroupUserRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the delivery group ID, name, and status in delivery group reports. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the business region, and then call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the delivery group. AppInstanceGroupId matches the exact ID, and AppInstanceGroupName filters by inclusion. If multiple filter conditions are specified at the same time, the intersection is used. When filtering by date, StatDate specifies a single day, and StartDate and EndDate must be specified in pairs to represent a closed interval. If both a single day and an interval are specified, the results must meet both conditions. Before using EndUserId, make sure that the user has a valid authorization relationship.</p>
     * 
     * @param request the request parameters of QueryAppInstanceGroupReportList  QueryAppInstanceGroupReportListRequest
     * @return QueryAppInstanceGroupReportListResponse
     */
    CompletableFuture<QueryAppInstanceGroupReportListResponse> queryAppInstanceGroupReportList(QueryAppInstanceGroupReportListRequest request);

    /**
     * <b>description</b> :
     * <p>Queries connection statistical reports. Before you invoke this operation, you can invoke <a href="~~ListRegions~~">ListRegions</a> and <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the <code>BizRegionId</code> and <code>AppInstanceGroupId</code> parameters. The <code>ProductType</code>, <code>StartDate</code>, and <code>EndDate</code> parameters are required for server-side validation. The statistical interval is <code>[StartDate, EndDate)</code>, which includes the start time but excludes the end time. Results are returned by page, with a maximum of 1,500 entries per page.</p>
     * 
     * @param request the request parameters of QueryConnectionReport  QueryConnectionReportRequest
     * @return QueryConnectionReportResponse
     */
    CompletableFuture<QueryConnectionReportResponse> queryConnectionReport(QueryConnectionReportRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the daily active user (DAU) report. StartDate and EndDate are required. The date range is inclusive and cannot exceed 180 days. If ProductType is not specified or cannot be recognized, the query defaults to <code>CloudApp</code>. You can use BizRegionId and AppInstanceGroupId to narrow down the scope. If neither is specified, the query returns aggregated data for all business regions. Results are returned in pages, with a maximum of 1,500 records per page.</p>
     * 
     * @param request the request parameters of QueryDauReportData  QueryDauReportDataRequest
     * @return QueryDauReportDataResponse
     */
    CompletableFuture<QueryDauReportDataResponse> queryDauReportData(QueryDauReportDataRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the monthly active user (MAU) report. ProductType, StartDate, and EndDate are required for server-side validation, and the time span cannot exceed 60 months. The API returns statistical values by month. To adapt to offline data generated on the next day, the last month in the query range uses the day before EndDate as the statistical cutoff date. Results are returned by page, with a maximum of 1,500 entries per page.</p>
     * 
     * @param request the request parameters of QueryMauReportData  QueryMauReportDataRequest
     * @return QueryMauReportDataResponse
     */
    CompletableFuture<QueryMauReportDataResponse> queryMauReportData(QueryMauReportDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The caller must have the RAM permissions for the corresponding API operation. The query scope is limited to the model usage of the specified business for the current account. The returned results depend on the generated statistical data and do not indicate that every call is counted in real time.</p>
     * <h2>Time and missing data</h2>
     * <p>Time boundaries are uniformly based on Asia/Shanghai (UTC+8). For a custom range, set <code>StatDateType</code> to <code>1d</code> and specify both <code>StartDate</code> and <code>EndDate</code>. The range includes both the start and end dates, and the maximum span is 90 days. If statistical data is unavailable for some dates, only the existing data within the range is aggregated.
     * If no statistical results are available for <code>24h</code> or <code>1d</code> queries without specified dates, the summary API returns zero values and the list API returns an empty list. <strong>This does not mean that no actual calls were made.</strong> If no statistical results are available for other windows or custom date ranges, metrics or lists may be empty. Do not treat empty values as zeros.</p>
     * <h2>Combined calls</h2>
     * <p>You can call <a href="~~QueryModelUsageInfo~~">QueryModelUsageInfo</a> to obtain summary metrics and <a href="~~QueryModelUsageList~~">QueryModelUsageList</a> to obtain model details. Both API operations can be called independently. When comparing summary and detail data, <code>BizType</code>, <code>StatDateType</code>, <code>StartDate</code>, <code>EndDate</code>, and <code>ModelType</code> must be consistent. <code>Keyword</code> applies only to the detail API. Details filtered by keywords cannot be directly compared with unfiltered summary results.</p>
     * <h2>Request example combinations</h2>
     * <p>In the parameter table, <code>StatDateType=1d</code>, <code>StartDate=2026-08-01</code>, and <code>EndDate=2026-08-07</code> indicate querying the cumulative usage from August 1 to August 7, 2026 (inclusive), in the Asia/Shanghai (UTC+8) time zone. To query the last 7 days, change the value to <code>StatDateType=1w</code> and omit both date parameters.
     * The number of calls, points, and model information in the examples are used to illustrate field meanings. They do not represent the actual usage of the current account and do not constitute a commitment to model specifications or pricing. The actual usage and available model information are subject to the API response.</p>
     * 
     * @param request the request parameters of QueryModelUsageInfo  QueryModelUsageInfoRequest
     * @return QueryModelUsageInfoResponse
     */
    CompletableFuture<QueryModelUsageInfoResponse> queryModelUsageInfo(QueryModelUsageInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The calling identity must have the RAM permissions for the corresponding API operation. The query scope is limited to the model usage of the specified business under the current account. The returned results depend on the generated statistical data and do not represent that every call has been counted in real time.</p>
     * <h2>Time and missing data</h2>
     * <p>Time boundaries are uniformly based on Asia/Shanghai (UTC+8). To use a custom range, set StatDateType to 1d and specify both StartDate and EndDate. The range includes both the start and end dates, with a maximum span of 90 days. If statistical data is unavailable for some dates, only the existing data within the range is aggregated.
     * When no date is specified for 24h or 1d queries and no statistical results are available, the aggregation API returns zero values and the list API returns an empty list. <strong>This does not mean that no actual calls were made.</strong> For other windows or custom date ranges where no statistical results are available, metrics or lists may be empty. Do not treat empty values as zeros.</p>
     * <h2>Combined calls</h2>
     * <p>You can call <a href="~~QueryModelUsageInfo~~">QueryModelUsageInfo</a> to obtain aggregated metrics and <a href="~~QueryModelUsageList~~">QueryModelUsageList</a> to obtain model details. Both API operations can be called independently. When comparing aggregated and detailed data, BizType, StatDateType, StartDate, EndDate, and ModelType must remain consistent. Keyword applies only to the detail API. Details filtered by keyword cannot be directly compared with unfiltered aggregated results.</p>
     * <h2>Pagination and metrics</h2>
     * <p>Start with PageNumber=1 and increment the page number as needed, keeping other filter conditions and sorting methods consistent. The model list may include models that have historical usage but zero calls within the current query range. All ratio fields are returned as decimals between 0 and 1. An empty metric indicates that it is incalculable or the data is unavailable, which is not equivalent to zero.
     * When new statistical data is continuously generated, the count and sorting of different pagination requests may change. When comparing totals and details, ensure that the query conditions are consistent and consider the data update time difference between the two requests.</p>
     * <h2>Request example combinations</h2>
     * <p>In the parameter table, StatDateType=1d, StartDate=2026-08-01, and EndDate=2026-08-07 indicate querying the cumulative usage from August 1 to August 7, 2026 (inclusive), in the Asia/Shanghai (UTC+8) time zone. To query the last 7 days, change to StatDateType=1w and omit both date parameters.
     * The call counts, points, and model information in the examples are used to illustrate field meanings. They do not represent the actual usage of the current account and do not constitute a commitment to model specifications or pricing. Actual usage and available model information are subject to the API response. Custom date queries do not provide TtftP95Ms. The example details show only some fields. Unshown fields do not necessarily return empty values.</p>
     * <h2>Missing statistical records for a single model</h2>
     * <p>If a model already in the model list has no active statistical records within the selected statistical range, CallCount, FailureCount, and PointsConsumption return 0. The input and output point ratios, success rate, cache hit rate, and time to first token latency are empty. In this case, you cannot determine that the model has no actual invoke operations based solely on the zero values.</p>
     * 
     * @param request the request parameters of QueryModelUsageList  QueryModelUsageListRequest
     * @return QueryModelUsageListResponse
     */
    CompletableFuture<QueryModelUsageListResponse> queryModelUsageList(QueryModelUsageListRequest request);

    /**
     * <b>description</b> :
     * <p>Queries network round-trip time (RTT) reports. ProductType, StartDate, and EndDate are required for server-side validation. The statistical interval is [StartDate, EndDate). The minimum, maximum, and average RTT values are measured in milliseconds. The low-RTT threshold is determined by the report statistical caliber, and the current API operation does not return this threshold. Results are returned in pages, with a maximum of 1,500 entries per page.</p>
     * 
     * @param request the request parameters of QueryNetworkRttReport  QueryNetworkRttReportRequest
     * @return QueryNetworkRttReportResponse
     */
    CompletableFuture<QueryNetworkRttReportResponse> queryNetworkRttReport(QueryNetworkRttReportRequest request);

    /**
     * <b>description</b> :
     * <p>Queries node quantity reports. StartDate, EndDate, and StatDateType are required. The query span limit is determined by the statistical granularity: up to 1 day for <code>1m</code> and <code>30m</code>, up to 15 days for <code>6h</code>, and up to 180 days for <code>1d</code>. Both the start and end boundaries are included in the query range. Results are returned in pages, with a maximum of 1,500 entries per page.</p>
     * 
     * @param request the request parameters of QueryNodeReportData  QueryNodeReportDataRequest
     * @return QueryNodeReportDataResponse
     */
    CompletableFuture<QueryNodeReportDataResponse> queryNodeReportData(QueryNodeReportDataRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation to query the session count trend data for the current Alibaba Cloud account on a specified date. The data consists of offline statistical results organized by day and returns the session counts at various time points on that date.
     * The returned results are aggregated in 10-minute intervals. Each data point is identified by an hour (Hh, values 00-23) and a minute (Mi, values 00, 10, 20, 30, 40, 50) representing a time point, and SessionCntMi is the aggregated session count within the 10-minute interval for that time point. The results are sorted in ascending order by hour and minute.
     * You can specify a business region by using BizRegionId and filter by delivery group by using AppInstanceGroupId. If neither parameter is provided, the aggregated session data for all regions and all delivery groups under the current account is returned. The actual region used to filter session data is determined by BizRegionId.
     * StatDate is the statistical date in the yyyyMMdd format. If this parameter is not provided, the data for yesterday is queried by default. Only dates within the last 90 days are supported. If there is no session data on the specified date, an empty list is returned and the return code is NO_DATA.</p>
     * 
     * @param request the request parameters of QuerySessionData  QuerySessionDataRequest
     * @return QuerySessionDataResponse
     */
    CompletableFuture<QuerySessionDataResponse> querySessionData(QuerySessionDataRequest request);

    /**
     * <b>description</b> :
     * <p>Queries session quantity reports. <code>StartDate</code>, <code>EndDate</code>, and <code>StatDateType</code> are required. The query span limit is determined by the statistical granularity: up to 1 day for <code>1m</code> and <code>30m</code>, up to 15 days for <code>6h</code>, and up to 180 days for <code>1d</code>. Both the start and end boundaries are included in the query range. Results are returned in pages, with a maximum of 1,500 records per page.</p>
     * 
     * @param request the request parameters of QuerySessionReportData  QuerySessionReportDataRequest
     * @return QuerySessionReportDataResponse
     */
    CompletableFuture<QuerySessionReportDataResponse> querySessionReportData(QuerySessionReportDataRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the application usage of a specified user on an hourly basis. StartDate and EndDate use the yyyyMMdd format. If either parameter is not provided, it defaults to yesterday. Both dates must be within the last 90 days, and the start date cannot be later than the end date. The query range includes the start and end dates. UserId must be set to the ID of the user to be queried. A maximum of the top five applications by usage duration are returned for each hour.</p>
     * 
     * @param request the request parameters of QueryUserAppUsageAggregateByHour  QueryUserAppUsageAggregateByHourRequest
     * @return QueryUserAppUsageAggregateByHourResponse
     */
    CompletableFuture<QueryUserAppUsageAggregateByHourResponse> queryUserAppUsageAggregateByHour(QueryUserAppUsageAggregateByHourRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the ranking of application usage duration for a specified user within a statistical range. <code>StartDate</code> and <code>EndDate</code> use the <code>yyyyMMdd</code> format. If either parameter is not provided, it defaults to yesterday. Both dates must be within the last 90 days, and the start date cannot be later than the end date. The query range includes the start and end dates. <code>UserId</code> must be set to the ID of the user to be queried. The results are sorted in descending order of cumulative application usage duration.</p>
     * 
     * @param request the request parameters of QueryUserAppUsageTimeRank  QueryUserAppUsageTimeRankRequest
     * @return QueryUserAppUsageTimeRankResponse
     */
    CompletableFuture<QueryUserAppUsageTimeRankResponse> queryUserAppUsageTimeRank(QueryUserAppUsageTimeRankRequest request);

    /**
     * <b>description</b> :
     * <p>Queries user usage reports. <strong><code>ProductType</code>, <code>StartDate</code>, and <code>EndDate</code> are all required.</strong> The interval between the start and end times calculated by full months must not exceed 60 months.
     * The query aggregates data within the closed interval of calendar days between the start and end dates. Statistics for the same user under the same app instance group are merged. The results are paginated in descending order of cumulative usage duration, with a maximum of 1,500 records per page. You can combine <code>ConnectionStatus</code>, <code>UserId</code>, <code>BizRegionId</code>, and <code>AppInstanceGroupId</code> for filtering.</p>
     * <h3>Response handling</h3>
     * <p>A successful response may not contain <code>Code</code> and <code>Message</code>. Do not require these two fields to be <code>200</code> and <code>success</code> respectively. When no matching records are found, the response can normally return <code>Count=0</code> and an empty <code>UserUsageReportDataModel</code> list. This does not indicate a request failure.
     * Example of a successful response when no matching records are found (HTTP status code: 200):</p>
     * <pre><code class="language-json">{
     *   &quot;RequestId&quot;: &quot;01A1F2C3-572F-544E-880D-B0E347E3DCB3&quot;,
     *   &quot;PageSize&quot;: 1,
     *   &quot;PageNumber&quot;: 1,
     *   &quot;Count&quot;: 0,
     *   &quot;UserUsageReportDataModel&quot;: []
     * }
     * </code></pre>
     * 
     * @param request the request parameters of QueryUserUsageReport  QueryUserUsageReportRequest
     * @return QueryUserUsageReportResponse
     */
    CompletableFuture<QueryUserUsageReportResponse> queryUserUsageReport(QueryUserUsageReportRequest request);

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for the resources to which agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent belong in the Wuying Agent Management Center. These model groups serve as inference engines for agents in the resource groups to execute tasks.
     * If an agent runtime is configured with a model group and its resource group is also configured with a model group, the model group bound to the resource group takes effect. That is, the resource group settings take precedence over the agent runtime settings.
     * When you remove the model group from the resource group to which the agent runtime belongs, the model group configured for the agent runtime automatically takes effect.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * @param request the request parameters of RemoveResourceGroupModelTemplate  RemoveResourceGroupModelTemplateRequest
     * @return RemoveResourceGroupModelTemplateResponse
     */
    CompletableFuture<RemoveResourceGroupModelTemplateResponse> removeResourceGroupModelTemplate(RemoveResourceGroupModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove the specific third-party channel configuration for agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. After the configuration is removed, the agent cannot use the third-party channel for conversations.
     * Make sure that you are fully familiar with the operations and usage of the WUYING Agent Management Center before you call this operation.
     * Before you begin:</p>
     * <ul>
     * <li>The RuntimeIds passed to this operation must be agent runtimes that are managed by the WUYING Agent Management Center. The cloud desktops that host these runtimes must be created by calling API operations such as CreateDesktop of Elastic Desktop Service (EDS). Cross-product call chain example: CreateDesktop → ListDesktops → use DesktopId as RuntimeIds.</li>
     * <li>OpenClaw scenario: RuntimeIds are cloud desktop IDs in the format of ecd-xxxx, which are the DesktopId values returned by the ListDesktops operation of EDS.</li>
     * <li>JVS Computer and Hermes Agent scenarios: RuntimeIds are the corresponding JVS IDs in the format of jvs-xxxx. The cloud desktops that host these runtimes are also created by calling API operations such as CreateDesktop of EDS.</li>
     * <li>You can call the ListDesktopAgentRuntime operation of this product to query the agent runtimes managed by the WUYING Agent Management Center. If the query result is empty, the corresponding cloud desktop is not managed. In this case, you must first call the CreateDesktop operation of EDS to create the cloud desktop. The WUYING Agent Management Center automatically manages the cloud desktop after it receives the desktop lifecycle event. After that, you can call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveRuntimeChannel  RemoveRuntimeChannelRequest
     * @return RemoveRuntimeChannelResponse
     */
    CompletableFuture<RemoveRuntimeChannelResponse> removeRuntimeChannel(RemoveRuntimeChannelRequest request);

    /**
     * <b>description</b> :
     * <p>You can remove a model group from agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. When an agent runtime resource needs to change its model group, you must first call this operation to remove the authorization relationship between the agent runtime resource and the original model group.
     * Make sure that you fully understand the operations and usage of the Wuying Agent Management Center before you call this operation.</p>
     * 
     * @param request the request parameters of RemoveRuntimeModelTemplate  RemoveRuntimeModelTemplateRequest
     * @return RemoveRuntimeModelTemplateResponse
     */
    CompletableFuture<RemoveRuntimeModelTemplateResponse> removeRuntimeModelTemplate(RemoveRuntimeModelTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing methods and pricing</a> of WUYING Cloud App before you call this operation.</p>
     * <blockquote>
     * <p>Before you begin:</p>
     * <ul>
     * <li>The delivery group must be in the PUBLISHED state and the ChargeType parameter must be set to PrePaid.</li>
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
     * <b>description</b> :
     * <p>This operation expands the disks of a WUYING workstation.</p>
     * 
     * @param request the request parameters of ResizeWuyingServerDisk  ResizeWuyingServerDiskRequest
     * @return ResizeWuyingServerDiskResponse
     */
    CompletableFuture<ResizeWuyingServerDiskResponse> resizeWuyingServerDisk(ResizeWuyingServerDiskRequest request);

    /**
     * @param request the request parameters of RestartWuyingServer  RestartWuyingServerRequest
     * @return RestartWuyingServerResponse
     */
    CompletableFuture<RestartWuyingServerResponse> restartWuyingServer(RestartWuyingServerRequest request);

    /**
     * <b>description</b> :
     * <p>Issues Cloud Assistant commands to persistent sessions in WUYING Workspace delivery groups. Currently, ProductType supports only WuyingServer and CommandType supports only CloudAssistantCmd. Specifying other values returns a parameter error.
     * The delivery scope supports two methods:</p>
     * <ul>
     * <li>Single delivery group: Specify the delivery group by using AppInstanceGroupId. You can also specify persistent sessions in the delivery group by using AppInstancePersistentId or AppInstancePersistentIds.</li>
     * <li>Multiple delivery groups in the same region: Specify a list of delivery groups by using AppInstanceGroupIds. The command is executed on all persistent sessions in each delivery group in the list. All delivery groups must belong to the same region. Otherwise, InvalidRegion.NotMatch is returned. If any delivery group does not exist or none of the delivery groups have persistent sessions, InvalidAppInstanceGroup.NotFound is returned.
     * You must specify at least one of AppInstanceGroupIds and AppInstanceGroupId. If both are specified, AppInstanceGroupIds takes precedence.
     * This operation only issues commands, which are executed asynchronously in sessions. Regardless of whether the command is issued to one or multiple delivery groups, only one command execution ID (InvocationId) is returned. You can use this ID to call ListCommandInvocationResults to query the execution status and output on each session.</li>
     * </ul>
     * 
     * @param request the request parameters of RunAppInstanceCommand  RunAppInstanceCommandRequest
     * @return RunAppInstanceCommandResponse
     */
    CompletableFuture<RunAppInstanceCommandResponse> runAppInstanceCommand(RunAppInstanceCommandRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this API operation to initiate the third-party channel QR code configuration process in batches for managed cloud desktop runtimes in the Wuying Agent Management Center. The system generates a QR code configuration page URL for each runtime and notifies the authorized user of the runtime by email and SMS. The user can complete the channel configuration by opening the page and scanning the QR code.
     * Usage notes:</p>
     * <ul>
     * <li>Currently, only CloudDesktop is supported for RuntimeType. You can specify up to 200 runtime IDs in a single request.</li>
     * <li>Each runtime must have one and only one authorized user. Otherwise, the sending result for the runtime returns the error code Runtime.UserNotSupported.</li>
     * <li>The taskId in the QR code configuration page URL is valid for 1 hour. After it expires, you must call this API operation again to initiate the process.</li>
     * <li>If the sending fails for some runtimes, the API operation still returns a success response overall. Check the Success, Code, and Message fields for each runtime in Data. If the sending fails for all runtimes, the API operation returns a failure response. If the error codes for all runtimes are the same, that error code is returned. Otherwise, SendQrCodeConfigMessage.SendFailed is returned.</li>
     * <li>Email and SMS notifications are sent on a best-effort basis. Notification failures do not affect the API response. After initiation, you can call GetRuntimeChannelQrCodeDetail to query the details of the QR code configuration process.</li>
     * </ul>
     * 
     * @param request the request parameters of SendRuntimeQrCodeConfigChannelMessage  SendRuntimeQrCodeConfigChannelMessageRequest
     * @return SendRuntimeQrCodeConfigChannelMessageResponse
     */
    CompletableFuture<SendRuntimeQrCodeConfigChannelMessageResponse> sendRuntimeQrCodeConfigChannelMessage(SendRuntimeQrCodeConfigChannelMessageRequest request);

    /**
     * <b>description</b> :
     * <p>First, call <code>DescribeUserProfilePathRules</code> to query the target rules, and then submit the complete list of rules that you want to retain. <strong>The submission overwrites the existing rules of the target. Passing an empty array or omitting the rule list sets the target rules to an empty list.</strong> When a set ID is used, the rules apply to the members of the set. After the rules are configured, you can call the query operation to verify the settings.</p>
     * 
     * @param request the request parameters of SetUserProfilePathRules  SetUserProfilePathRulesRequest
     * @return SetUserProfilePathRulesResponse
     */
    CompletableFuture<SetUserProfilePathRulesResponse> setUserProfilePathRules(SetUserProfilePathRulesRequest request);

    /**
     * @param request the request parameters of StartTaskForCreateImage  StartTaskForCreateImageRequest
     * @return StartTaskForCreateImageResponse
     */
    CompletableFuture<StartTaskForCreateImageResponse> startTaskForCreateImage(StartTaskForCreateImageRequest request);

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
     * @param request the request parameters of SubmitImage  SubmitImageRequest
     * @return SubmitImageResponse
     */
    CompletableFuture<SubmitImageResponse> submitImage(SubmitImageRequest request);

    /**
     * @param request the request parameters of TagCloudResources  TagCloudResourcesRequest
     * @return TagCloudResourcesResponse
     */
    CompletableFuture<TagCloudResourcesResponse> tagCloudResources(TagCloudResourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the <code>appstreaming:TagResources</code> permission.
     * The resources to which you want to bind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only app instance group resources</strong>. You must set ResourceType to <code>APPINSTANCEGROUP</code>. You can obtain the app instance group ID by calling <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a>.</p>
     * <h2>Tag rules</h2>
     * <ul>
     * <li>A single request can bind up to <strong>20 tags</strong> to up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li>A tag key must be 1 to 128 characters in length, and a tag value must be 0 to 256 characters in length. Both are case-sensitive.</li>
     * <li>A tag key cannot start with <code>aliyun</code> or <code>acs:</code> (case-insensitive). Neither tag keys nor tag values can contain <code>http://</code> or <code>https://</code>.</li>
     * <li>Tag keys in the same request cannot be duplicate. Otherwise, the error code <code>InvalidTag.Duplicated</code> is returned.</li>
     * <li>A tag key on a resource can correspond to only one tag value. If the tag key already exists on the resource, the tag value is updated to the new value.</li>
     * <li>A single resource can be bound to up to 20 custom tags. If this limit is exceeded, the error code <code>ResourceTag.CustomTagCountExceed</code> is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified app instance group does not exist or does not belong to the current account, the entire request fails</strong>, and the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned. No tags are bound to any resources.</li>
     * <li>If the binding is successful, the response contains only RequestId and does not return tag details.</li>
     * <li>If multiple resources are specified and the binding fails for only some of the resources, the operation still returns a success response, and the response does not contain failure details. Call ListTagResources to verify the binding results. If only one resource is specified and the binding fails, the operation directly returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the IDs of the app instance groups to which you want to bind tags.</li>
     * <li>Call this operation and specify ResourceType=<code>APPINSTANCEGROUP</code>, ResourceId.N, and Tag.N.Key/Tag.N.Value.</li>
     * <li>To view the tags bound to a resource, call ListTagResources. To unbind tags, call UntagResources.
     * The masked identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

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
     * <b>description</b> :
     * <p>Only custom images and community images manageable by the current account are supported. If VersionId is omitted, the current active version is used. If specified, the version must belong to the image specified by ImageId.
     * Verify the association between the applications and the version through image query results before submitting AppIdList. <strong>Disassociating an application does not delete the application record.</strong> To delete an application, call DeleteApp.</p>
     * 
     * @param request the request parameters of UnbindApp  UnbindAppRequest
     * @return UnbindAppResponse
     */
    CompletableFuture<UnbindAppResponse> unbindApp(UnbindAppRequest request);

    /**
     * @param request the request parameters of UntagCloudResources  UntagCloudResourcesRequest
     * @return UntagCloudResourcesResponse
     */
    CompletableFuture<UntagCloudResourcesResponse> untagCloudResources(UntagCloudResourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>When you call this operation as a RAM user or by using STS credentials, you must have the appstreaming:UntagResources permission.
     * The resources from which you want to remove tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only app instance group resources</strong>. You must set ResourceType to APPINSTANCEGROUP. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID, and call the <a href="~~ListTagResources~~">ListTagResources</a> operation to query the tags bound to the resources.</p>
     * <h2>metric description</h2>
     * <ul>
     * <li>A single request can remove labels from up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li><strong>You must specify at least one of TagKey.N and All</strong>: If neither is specified, or if TagKey.N is not specified and All is set to false, the error code InvalidParameter.TagKeyListOrAll is returned.<ul>
     * <li>If TagKey.N is specified: Only the labels corresponding to these label keys are removed. A maximum of 20 label keys can be specified in a single request. In this case, the All parameter is ignored.</li>
     * <li>If TagKey.N is not specified and All is set to true: All custom labels on the resources are removed, including Wuying system labels that start with <code>System/</code> and are attached by calling the <a href="~~TagResources~~">TagResources</a> operation.</li>
     * </ul>
     * </li>
     * <li>If a specified label key does not exist on a resource, the label key is skipped and no fault is returned.</li>
     * <li>Label keys that start with <code>System/</code> are Wuying system labels. Only System/Scheduler/GRAYSCALE and System/Scheduler/STOP_NEW_USER_CONNECTION are supported. If you specify other label keys that start with <code>System/</code>, the error code InvalidTagPolicy.KeyInvalid or InvalidTag.SystemKeyNotAllow is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified app instance group does not exist or does not belong to the current account, the entire request fails</strong>, and the error code InvalidAppInstanceGroup.NotFound is returned. No tags are removed from any resources.</li>
     * <li>If tags are successfully removed, the response contains only RequestId and does not return tag details.</li>
     * <li>If multiple resources are specified and tags are removed from only some of the resources, the operation still returns a success response, and the response does not contain failure details. You can call the <a href="~~ListTagResources~~">ListTagResources</a> operation to verify the tag removal results. If only one resource is specified and tag removal fails, the operation directly returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the app instance group ID. To confirm the tag keys bound to the resources, call the <a href="~~ListTagResources~~">ListTagResources</a> operation.</li>
     * <li>Call this operation, set ResourceType to APPINSTANCEGROUP, specify ResourceId.N, and specify TagKey.N or set All to true to indicate the tags to be removed.</li>
     * <li>To bind tags again, call the <a href="~~TagResources~~">TagResources</a> operation.
     * The desensitized identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>The AdaptorId must correspond to a valid application adapter manageable by the current account. Pass only the configurations that need to be modified in this request.
     * SilenceParam is used for application startup parameters. UserConfig is used for application runtime configurations. <strong>This operation does not support modifying application scripts or executable file paths through AppScript or ExecuteFileAddress. Do not pass these two parameters.</strong></p>
     * 
     * @param request the request parameters of UpdateAdaptor  UpdateAdaptorRequest
     * @return UpdateAdaptorResponse
     */
    CompletableFuture<UpdateAdaptorResponse> updateAdaptor(UpdateAdaptorRequest request);

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
     * <p>You can only modify images that are owned by the current account and allow modifications. Shared images cannot be modified.
     * You must provide at least one of ImageId and VersionId. If both are provided, they must point to the same image. If VersionId is omitted, the current effective version of the image is used. Passing a non-empty AdaptorIdList updates the application adapter associations of the selected version based on the complete list. Make sure to include the adapters that you want to retain.</p>
     * 
     * @param request the request parameters of UpdateImage  UpdateImageRequest
     * @return UpdateImageResponse
     */
    CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request);

    /**
     * <b>description</b> :
     * <p>The task must exist before you call this operation, and the corresponding creation resource and resource node must be available. The TaskType must match the actual type of the task. <strong>This operation does not support modifying the task step, image version, or destination region by using TaskStep, VersionId, or BizRegionId. Do not pass these three parameters.</strong> A successful request only indicates that the status update call is completed. To query the final status of the task, call GetTask.</p>
     * 
     * @param request the request parameters of UpdateImageTask  UpdateImageTaskRequest
     * @return UpdateImageTaskResponse
     */
    CompletableFuture<UpdateImageTaskResponse> updateImageTask(UpdateImageTaskRequest request);

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

    /**
     * @param request the request parameters of ValidateLlmTemplateConfig  ValidateLlmTemplateConfigRequest
     * @return ValidateLlmTemplateConfigResponse
     */
    CompletableFuture<ValidateLlmTemplateConfigResponse> validateLlmTemplateConfig(ValidateLlmTemplateConfigRequest request);

}
