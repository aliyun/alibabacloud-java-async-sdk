// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dataworks_public20240518.models.*;
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
     * @param request the request parameters of AbolishCrossProjectPipelineRun  AbolishCrossProjectPipelineRunRequest
     * @return AbolishCrossProjectPipelineRunResponse
     */
    CompletableFuture<AbolishCrossProjectPipelineRunResponse> abolishCrossProjectPipelineRun(AbolishCrossProjectPipelineRunRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation may not be available in earlier versions of the SDK. In this case, use the AbolishDeployment operation. The parameters are the same as those described in this document.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AbolishPipelineRun  AbolishPipelineRunRequest
     * @return AbolishPipelineRunResponse
     */
    CompletableFuture<AbolishPipelineRunResponse> abolishPipelineRun(AbolishPipelineRunRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a more advanced edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of AddEntityIntoMetaCollection  AddEntityIntoMetaCollectionRequest
     * @return AddEntityIntoMetaCollectionResponse
     */
    CompletableFuture<AddEntityIntoMetaCollectionResponse> addEntityIntoMetaCollection(AddEntityIntoMetaCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>Adds an administrator. Only the owner or an administrator of the knowledge base can perform this operation. The caller and tenant are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of AddKnowledgeBaseAdministrator  AddKnowledgeBaseAdministratorRequest
     * @return AddKnowledgeBaseAdministratorResponse
     */
    CompletableFuture<AddKnowledgeBaseAdministratorResponse> addKnowledgeBaseAdministrator(AddKnowledgeBaseAdministratorRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Reason</strong>: The reason for the application. This parameter is required.</li>
     * <li><strong>ApplyContents</strong>: The list of resource permission applications. Each item includes the resource description (Resource), grantee description (Grantee), access types (AccessTypes), and expiration time (ExpirationTime). The maximum number of items per request is 400.</li>
     * <li><strong>Resource</strong>: The resource description. You must specify the ResourceSchema.name and version on which resource parsing depends, as well as the resource metadata (MetaData).</li>
     * <li><strong>Grantee</strong>: The grantee description. You must specify the principal type (PrincipalType) and principal ID (PrincipalId).</li>
     * <li><strong>AccessTypes</strong>: The list of permission types. Multiple permission combinations are supported.</li>
     * <li><strong>ExpirationTime</strong>: The expiration time of the permissions, provided as a millisecond timestamp.</li>
     * <li><strong>AuthMethod</strong>: The authorization method. This parameter is optional. By default, the built-in default authorization method is used.</li>
     * <li><strong>ClientToken</strong>: The client token used to prevent duplicate requests. This parameter is optional.
     * Make sure that all required fields are correctly filled in and meet the corresponding constraints. For example, the DefVersion and MetaData in Resource must match the selected DefSchema.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyResourceAccessPermission  ApplyResourceAccessPermissionRequest
     * @return ApplyResourceAccessPermissionResponse
     */
    CompletableFuture<ApplyResourceAccessPermissionResponse> applyResourceAccessPermission(ApplyResourceAccessPermissionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows you to approve or reject a specified approval process instance by passing in the ProcessInstanceId and approval information (including ApprovalComment and ApprovalAction).</li>
     * <li>ApprovalAction can be <code>Agree</code> or <code>Deny</code>, indicating approval or rejection respectively.</li>
     * <li>ApprovalComment is required and records the specific approval opinion.</li>
     * </ul>
     * 
     * @param request the request parameters of ApproveProcessInstance  ApproveProcessInstanceRequest
     * @return ApproveProcessInstanceResponse
     */
    CompletableFuture<ApproveProcessInstanceResponse> approveProcessInstance(ApproveProcessInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only when the canary release feature is enabled. Before calling this operation, ensure that the canary release feature is enabled for the current account and the destination region.
     * Archiving only modifies the archive flag of the session and does not stop or delete the session. If Archived is set to true, the session is archived. If Archived is set to false, the session is unarchived. If this parameter is omitted, the default value true is used. You can use the Archived parameter of ListAgentSessions to query archived and unarchived sessions separately.
     * The caller must have access permissions on the current session and the corresponding OpenAPI action permissions. An HTTP 200 status code does not indicate that the business operation is successful. You must check JsonRpcResponse.Error. The successful result is located in JsonRpcResponse.Result.</p>
     * 
     * @param request the request parameters of ArchiveAgentSession  ArchiveAgentSessionRequest
     * @return ArchiveAgentSessionResponse
     */
    CompletableFuture<ArchiveAgentSessionResponse> archiveAgentSession(ArchiveAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of AssociateProjectToImage  AssociateProjectToImageRequest
     * @return AssociateProjectToImageResponse
     */
    CompletableFuture<AssociateProjectToImageResponse> associateProjectToImage(AssociateProjectToImageRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have purchased DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Project Owner, or O&amp;M Engineer</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateProjectToResourceGroup  AssociateProjectToResourceGroupRequest
     * @return AssociateProjectToResourceGroupResponse
     */
    CompletableFuture<AssociateProjectToResourceGroupResponse> associateProjectToResourceGroup(AssociateProjectToResourceGroupRequest request);

    /**
     * @deprecated OpenAPI AttachDataQualityRulesToEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of AttachDataQualityRulesToEvaluationTask  AttachDataQualityRulesToEvaluationTaskRequest
     * @return AttachDataQualityRulesToEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<AttachDataQualityRulesToEvaluationTaskResponse> attachDataQualityRulesToEvaluationTask(AttachDataQualityRulesToEvaluationTaskRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of BatchCreateMetaEntities  BatchCreateMetaEntitiesRequest
     * @return BatchCreateMetaEntitiesResponse
     */
    CompletableFuture<BatchCreateMetaEntitiesResponse> batchCreateMetaEntities(BatchCreateMetaEntitiesRequest request);

    /**
     * <b>description</b> :
     * <p>Requires DataWorks Professional Edition or a higher edition.</p>
     * 
     * @param request the request parameters of BatchDeleteMetaEntities  BatchDeleteMetaEntitiesRequest
     * @return BatchDeleteMetaEntitiesResponse
     */
    CompletableFuture<BatchDeleteMetaEntitiesResponse> batchDeleteMetaEntities(BatchDeleteMetaEntitiesRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or later is required.</p>
     * 
     * @param request the request parameters of BatchUpdateTasks  BatchUpdateTasksRequest
     * @return BatchUpdateTasksResponse
     */
    CompletableFuture<BatchUpdateTasksResponse> batchUpdateTasks(BatchUpdateTasksRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or higher is required.</li>
     * <li><strong>Ensure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this API operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of BuildImage  BuildImageRequest
     * @return BuildImageResponse
     */
    CompletableFuture<BuildImageResponse> buildImage(BuildImageRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation is mainly used to actively interrupt an ongoing session, especially when the session is in a streaming response state.</li>
     * <li><code>sessionId</code> is a required parameter that identifies the specific session to cancel.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelAgentSession  CancelAgentSessionRequest
     * @return CancelAgentSessionResponse
     */
    CompletableFuture<CancelAgentSessionResponse> cancelAgentSession(CancelAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of CancelImageTest  CancelImageTestRequest
     * @return CancelImageTestResponse
     */
    CompletableFuture<CancelImageTestResponse> cancelImageTest(CancelImageTestRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or higher is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant owner, workspace administrator, project owner, or O&amp;M engineer.</li>
     * </ul>
     * 
     * @param request the request parameters of CloneDataSource  CloneDataSourceRequest
     * @return CloneDataSourceResponse
     */
    CompletableFuture<CloneDataSourceResponse> cloneDataSource(CloneDataSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Agent name</strong>: Must be unique within the current account.</li>
     * <li><strong>Model configuration</strong>: Optional. Specifies the model used by the agent and its related settings.</li>
     * <li><strong>Visibility level</strong>: Defines who can access the agent. Supports account-wide, project-specific, or user-specific visibility.</li>
     * <li><strong>Visibility scope</strong>: When <code>PROJECT</code> or <code>USER</code> is selected as the visibility level, you must specify the specific project IDs or user IDs.</li>
     * <li><strong>Other parameters</strong>: Parameters such as the display name and description are optional. Specify them as needed.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation creates a new agent session.</li>
     * <li>Specify the name of the bound agent by using <code>Params.Meta.Agent.AgentName</code>. This parameter is required.<ul>
     * <li>dataworks_data_agent: DataWorks built-in agent - Data Agent. It provides AI capabilities for the entire data development lifecycle, including data integration, development, O&amp;M, governance, and analysis.</li>
     * <li>dataworks_chatbi_agent: DataWorks built-in agent - ChatBI. Based on natural language processing and intelligent analysis technologies, it automates the entire analysis process from requirement parsing, data extraction, and automatic code generation to visual report output through conversational interaction.</li>
     * <li>dataworks_ai_assistant_agent: DataWorks built-in agent - AI Assistant. An enterprise-grade AI assistant for DataWorks built on open-source frameworks such as OpenClaw and Hermes Agent.</li>
     * </ul>
     * </li>
     * <li>You can specify the session source by using <code>Params.Meta.Config.SessionSource</code> to facilitate subsequent retrieval by source.</li>
     * <li>You can pass session tags by using <code>Params.Meta.Config.SessionTags[].SessionTagCode</code>.</li>
     * <li>Set optional initial session configurations by using <code>Params.Meta.InitialConfigOptions</code>. Use <code>Model</code>, <code>Mode</code>, and <code>ReasoningEffort</code> for the model, authorization mode, and reasoning configuration, respectively. After the session is created, save the session ID from the response to send prompts or subscribe to session events later.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgentSession  CreateAgentSessionRequest
     * @return CreateAgentSessionResponse
     */
    CompletableFuture<CreateAgentSessionResponse> createAgentSession(CreateAgentSessionRequest request);

    /**
     * @param request the request parameters of CreateAlertRule  CreateAlertRuleRequest
     * @return CreateAlertRuleResponse
     */
    CompletableFuture<CreateAlertRuleResponse> createAlertRule(CreateAlertRuleRequest request);

    /**
     * @param request the request parameters of CreateBusiness  CreateBusinessRequest
     * @return CreateBusinessResponse
     */
    CompletableFuture<CreateBusinessResponse> createBusiness(CreateBusinessRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition to use this feature.</p>
     * 
     * @param request the request parameters of CreateCalendar  CreateCalendarRequest
     * @return CreateCalendarResponse
     */
    CompletableFuture<CreateCalendarResponse> createCalendar(CreateCalendarRequest request);

    /**
     * @param request the request parameters of CreateCodeReview  CreateCodeReviewRequest
     * @return CreateCodeReviewResponse
     */
    CompletableFuture<CreateCodeReviewResponse> createCodeReview(CreateCodeReviewRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If you specify multiple publish entities in the parameters, all entities except the first one are ignored.
     * This operation is part of the new Data Studio capabilities and applies only to workspaces that use the new Data Studio feature. If the new Data Studio feature is not used, use the corresponding operation of the 2020-05-18 version.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateComponent  CreateComponentRequest
     * @return CreateComponentResponse
     */
    CompletableFuture<CreateComponentResponse> createComponent(CreateComponentRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or later is required.
     * You must have at least one of the following roles in the DataWorks workspace: tenant owner, workspace administrator, project owner, or O&amp;M engineer.</p>
     * 
     * @param request the request parameters of CreateComputeResource  CreateComputeResourceRequest
     * @return CreateComputeResourceResponse
     */
    CompletableFuture<CreateComputeResourceResponse> createComputeResource(CreateComputeResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Create a metadata crawler for a specified data source, and configure the collection scope, resource group, scheduling method, and extended configurations.</p>
     * <h2>Recommended procedure</h2>
     * <ol>
     * <li>Call GetCrawlerTypeCapabilities to query the crawler types supported in the current region and their configuration capabilities.</li>
     * <li>Create a crawler by using a data source that matches the Type. Before you create the crawler, make sure that the data source and the selected resource group pass the connectivity test by calling the TestDataSourceConnectivity API. This prevents you from creating an invalid crawler.</li>
     * <li>After the crawler is created, call RunCrawler to manually run the crawler, or configure periodic scheduling to automatically run the crawler.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>You must purchase DataWorks Basic Edition or higher to use this feature.</p>
     * <h2>Precautions</h2>
     * <p>A successful creation only indicates that the crawler configuration is generated. The metadata collection is not immediately executed.</p>
     * 
     * @param request the request parameters of CreateCrawler  CreateCrawlerRequest
     * @return CreateCrawlerResponse
     */
    CompletableFuture<CreateCrawlerResponse> createCrawler(CreateCrawlerRequest request);

    /**
     * <b>description</b> :
     * <p>Creates and finalizes a cross-workspace deployment pipeline. The ObjectIds parameter must contain one and only one top-level object ID from the source workspace. Sub-objects of composite objects such as workflows are automatically included by the system. Passing multiple objects causes parameter validation to fail. You can call ListCrossProjectDeploymentCandidates to query candidate objects. After creation, call ExecCrossProjectPipelineRun to execute the deployment, and call GetCrossProjectPipelineRun to query the status.</p>
     * 
     * @param request the request parameters of CreateCrossProjectPipelineRun  CreateCrossProjectPipelineRunRequest
     * @return CreateCrossProjectPipelineRunResponse
     */
    CompletableFuture<CreateCrossProjectPipelineRunResponse> createCrossProjectPipelineRun(CreateCrossProjectPipelineRunRequest request);

    /**
     * @param request the request parameters of CreateCustomAttribute  CreateCustomAttributeRequest
     * @return CreateCustomAttributeResponse
     */
    CompletableFuture<CreateCustomAttributeResponse> createCustomAttribute(CreateCustomAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of CreateDIAlarmRule  CreateDIAlarmRuleRequest
     * @return CreateDIAlarmRuleResponse
     */
    CompletableFuture<CreateDIAlarmRuleResponse> createDIAlarmRule(CreateDIAlarmRuleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>This operation creates a data integration synchronization task. Parameters include the source configuration SourceDataSourceSettings and the destination configuration DestinationDataSourceSettings, the supported synchronization type MigrationType, transformation rules defined through TransformationRules for mapping operations such as adding columns and renaming tables, specific tables to synchronize and the mapping rules to apply defined in TableMappings, and task-level settings such as column mappings and scheduling configurations defined in JobSettings.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDIJob  CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    CompletableFuture<CreateDIJobResponse> createDIJob(CreateDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or later to use this feature.</p>
     * 
     * @param request the request parameters of CreateDataAssetTag  CreateDataAssetTagRequest
     * @return CreateDataAssetTagResponse
     */
    CompletableFuture<CreateDataAssetTagResponse> createDataAssetTag(CreateDataAssetTagRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or later is required.</p>
     * 
     * @param request the request parameters of CreateDataQualityAlertRule  CreateDataQualityAlertRuleRequest
     * @return CreateDataQualityAlertRuleResponse
     */
    CompletableFuture<CreateDataQualityAlertRuleResponse> createDataQualityAlertRule(CreateDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or later to use this feature.
     * 
     * @param request the request parameters of CreateDataQualityEvaluationTask  CreateDataQualityEvaluationTaskRequest
     * @return CreateDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<CreateDataQualityEvaluationTaskResponse> createDataQualityEvaluationTask(CreateDataQualityEvaluationTaskRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityEvaluationTaskInstance is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScanRun instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of CreateDataQualityEvaluationTaskInstance  CreateDataQualityEvaluationTaskInstanceRequest
     * @return CreateDataQualityEvaluationTaskInstanceResponse
     */
    @Deprecated
    CompletableFuture<CreateDataQualityEvaluationTaskInstanceResponse> createDataQualityEvaluationTaskInstance(CreateDataQualityEvaluationTaskInstanceRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityRule is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a later edition to use this feature.
     * 
     * @param request the request parameters of CreateDataQualityRule  CreateDataQualityRuleRequest
     * @return CreateDataQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<CreateDataQualityRuleResponse> createDataQualityRule(CreateDataQualityRuleRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityTemplate instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of CreateDataQualityRuleTemplate  CreateDataQualityRuleTemplateRequest
     * @return CreateDataQualityRuleTemplateResponse
     */
    @Deprecated
    CompletableFuture<CreateDataQualityRuleTemplateResponse> createDataQualityRuleTemplate(CreateDataQualityRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this feature.</p>
     * 
     * @param request the request parameters of CreateDataQualityScan  CreateDataQualityScanRequest
     * @return CreateDataQualityScanResponse
     */
    CompletableFuture<CreateDataQualityScanResponse> createDataQualityScan(CreateDataQualityScanRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of CreateDataQualityScanRun  CreateDataQualityScanRunRequest
     * @return CreateDataQualityScanRunResponse
     */
    CompletableFuture<CreateDataQualityScanRunResponse> createDataQualityScanRun(CreateDataQualityScanRunRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of CreateDataQualityTemplate  CreateDataQualityTemplateRequest
     * @return CreateDataQualityTemplateResponse
     */
    CompletableFuture<CreateDataQualityTemplateResponse> createDataQualityTemplate(CreateDataQualityTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a more advanced edition to use this API.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>tenant owner, workspace administrator, project owner, or operator.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li>To share a data source from Workspace A to Workspace B, you must have the data source sharing permissions in both workspaces. You must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataSourceSharedRule  CreateDataSourceSharedRuleRequest
     * @return CreateDataSourceSharedRuleResponse
     */
    CompletableFuture<CreateDataSourceSharedRuleResponse> createDataSourceSharedRule(CreateDataSourceSharedRuleRequest request);

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    /**
     * @param request the request parameters of CreateDatasetVersion  CreateDatasetVersionRequest
     * @return CreateDatasetVersionResponse
     */
    CompletableFuture<CreateDatasetVersionResponse> createDatasetVersion(CreateDatasetVersionRequest request);

    /**
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    /**
     * @param request the request parameters of CreateFolder  CreateFolderRequest
     * @return CreateFolderResponse
     */
    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If more than one UDF function is defined in the FlowSpec, all functions after the first one are ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateFunction  CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If you specify multiple publish entities in the parameters, all entities except the first one are ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateIdentifyCredential  CreateIdentifyCredentialRequest
     * @return CreateIdentifyCredentialResponse
     */
    CompletableFuture<CreateIdentifyCredentialResponse> createIdentifyCredential(CreateIdentifyCredentialRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a more advanced edition to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a knowledge base. The tenant and caller identity are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of CreateKnowledgeBase  CreateKnowledgeBaseRequest
     * @return CreateKnowledgeBaseResponse
     */
    CompletableFuture<CreateKnowledgeBaseResponse> createKnowledgeBase(CreateKnowledgeBaseRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a knowledge base build task. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of CreateKnowledgeBaseBuildTask  CreateKnowledgeBaseBuildTaskRequest
     * @return CreateKnowledgeBaseBuildTaskResponse
     */
    CompletableFuture<CreateKnowledgeBaseBuildTaskResponse> createKnowledgeBaseBuildTask(CreateKnowledgeBaseBuildTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a knowledge base build task instance. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of CreateKnowledgeBaseBuildTaskInstance  CreateKnowledgeBaseBuildTaskInstanceRequest
     * @return CreateKnowledgeBaseBuildTaskInstanceResponse
     */
    CompletableFuture<CreateKnowledgeBaseBuildTaskInstanceResponse> createKnowledgeBaseBuildTaskInstance(CreateKnowledgeBaseBuildTaskInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a knowledge object. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of CreateKnowledgeObject  CreateKnowledgeObjectRequest
     * @return CreateKnowledgeObjectResponse
     */
    CompletableFuture<CreateKnowledgeObjectResponse> createKnowledgeObject(CreateKnowledgeObjectRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an upload session for a knowledge object. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of CreateKnowledgeObjectUpload  CreateKnowledgeObjectUploadRequest
     * @return CreateKnowledgeObjectUploadResponse
     */
    CompletableFuture<CreateKnowledgeObjectUploadResponse> createKnowledgeObjectUpload(CreateKnowledgeObjectUploadRequest request);

    /**
     * <b>description</b> :
     * <p>Manages knowledge sources for a knowledge base. The identity is determined by the POP context, and credentials are not returned in query responses.</p>
     * 
     * @param request the request parameters of CreateKnowledgeSource  CreateKnowledgeSourceRequest
     * @return CreateKnowledgeSourceResponse
     */
    CompletableFuture<CreateKnowledgeSourceResponse> createKnowledgeSource(CreateKnowledgeSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateLineageRelationship  CreateLineageRelationshipRequest
     * @return CreateLineageRelationshipResponse
     */
    CompletableFuture<CreateLineageRelationshipResponse> createLineageRelationship(CreateLineageRelationshipRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>After submission, the system verifies the availability of the MCP server based on the provided connection information.</li>
     * <li>If the MCP server connection is unavailable, the API returns the corresponding error message.</li>
     * <li>The Name field must start with a lowercase letter and can contain only lowercase letters, digits, underscores (_), and hyphens (-). It must be unique within the current account.</li>
     * <li>The Visibility field defines the visibility level of the MCP server. Valid values: <code>TENANT</code> (visible within the account), <code>PROJECT</code> (visible to specified projects), and <code>USER</code> (visible to specified users). Depending on the selected value, you must provide the corresponding VisibilityScope parameter to further specify the visibility scope.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMcpServer  CreateMcpServerRequest
     * @return CreateMcpServerResponse
     */
    CompletableFuture<CreateMcpServerResponse> createMcpServer(CreateMcpServerRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateMetaCollection  CreateMetaCollectionRequest
     * @return CreateMetaCollectionResponse
     */
    CompletableFuture<CreateMetaCollectionResponse> createMetaCollection(CreateMetaCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of CreateMetaEntityDef  CreateMetaEntityDefRequest
     * @return CreateMetaEntityDefResponse
     */
    CompletableFuture<CreateMetaEntityDefResponse> createMetaEntityDef(CreateMetaEntityDefRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of CreateNetwork  CreateNetworkRequest
     * @return CreateNetworkResponse
     */
    CompletableFuture<CreateNetworkResponse> createNetwork(CreateNetworkRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If more than one node is defined in FlowSpec, all nodes after the first one are ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateNode  CreateNodeRequest
     * @return CreateNodeResponse
     */
    CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or higher is required.</p>
     * 
     * @param request the request parameters of CreateParameter  CreateParameterRequest
     * @return CreateParameterResponse
     */
    CompletableFuture<CreateParameterResponse> createParameter(CreateParameterRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If you specify multiple entities to be deployed in the request parameters, only the first entity is processed and the rest are ignored.
     * Notice: This operation may not be available in earlier versions of the SDK. In this case, use the CreateDeployment operation, which uses the same parameters as described in this document.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePipelineRun  CreatePipelineRunRequest
     * @return CreatePipelineRunResponse
     */
    CompletableFuture<CreatePipelineRunResponse> createPipelineRun(CreatePipelineRunRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API allows you to create an approval flow definition, including setting basic information such as the policy name, description, type, and subtype.</li>
     * <li>You can define a list of condition rules (RuleConditions) to specify the conditions under which the approval flow is triggered.</li>
     * <li>You can configure multiple notification services (NotificationServices) to send notifications to relevant personnel at different stages of the approval flow.</li>
     * <li>The list of approval nodes (ApprovalNodes) defines the nodes that the approval process must pass through and the approver information.</li>
     * <li>You can choose whether to immediately enable the newly created approval flow definition.</li>
     * <li>Note: Some fields, such as Type, have specific value limits. Refer to the constraint description section in the documentation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateProcessDefinition  CreateProcessDefinitionRequest
     * @return CreateProcessDefinitionResponse
     */
    CompletableFuture<CreateProcessDefinitionResponse> createProcessDefinition(CreateProcessDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of CreateProjectMember  CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     */
    CompletableFuture<CreateProjectMemberResponse> createProjectMember(CreateProjectMemberRequest request);

    /**
     * @param request the request parameters of CreateProjectRole  CreateProjectRoleRequest
     * @return CreateProjectRoleResponse
     */
    CompletableFuture<CreateProjectRoleResponse> createProjectRole(CreateProjectRoleRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this API operation.</li>
     * <li><strong>Before you call this API operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> of DataWorks general-purpose resource groups.</strong></li>
     * <li><strong>Before you call this API operation, make sure that you have created the service-linked role AliyunServiceRoleForDataWorks.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of CreateResourceGroup  CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of CreateRoute  CreateRouteRequest
     * @return CreateRouteResponse
     */
    CompletableFuture<CreateRouteResponse> createRoute(CreateRouteRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>SchemaName</strong>: Select an appropriate schema name based on your business requirements.</li>
     * <li><strong>ControlModule</strong> and <strong>ControlSubModule</strong>: Specify the module and submodule to which the policy applies. Make sure that they match the selected schema.</li>
     * <li><strong>ControlDwScope</strong>: Define the application scope of the policy, which can be the tenant level or the workspace level.</li>
     * <li><strong>Workspaces</strong>: If <code>ControlDwScope</code> is set to <code>Workspace</code>, you must provide a list of associated workspace IDs.</li>
     * <li><strong>Content.Controllers</strong>: The list of control items in the policy content must comply with the valid control item definitions of the selected schema.</li>
     * <li>System default policies cannot be created by calling this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecurityStrategy  CreateSecurityStrategyRequest
     * @return CreateSecurityStrategyResponse
     */
    CompletableFuture<CreateSecurityStrategyResponse> createSecurityStrategy(CreateSecurityStrategyRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Creates and saves a reusable semantic task definition. This API operation only saves the configurations of the data source, resource group, and reference files, and does not execute the task immediately.</p>
     * <h2>Recommended procedure</h2>
     * <ol>
     * <li>If <code>Source.type</code> is set to <code>singleTableFile</code>, call <code>UploadSemanticFile</code> first, use the returned <code>Data.UploadUrl</code> to complete the PUT upload, and then specify <code>Data.FileId</code> in <code>ReferenceFileIds</code>. Alternatively, you can provide a single accessible URI.</li>
     * <li>Configure <code>Source</code>, <code>ProjectId</code>, and <code>ResourceGroupId</code>, and then call this operation to save the task.</li>
     * <li>Call <code>RunSemanticJob</code> by using <code>Data.Name</code> in the response. After the task is completed, call <code>DownloadSemanticResults</code> to obtain the output.</li>
     * </ol>
     * <h2>Precautions</h2>
     * <p><code>Name</code> must be unique within the current tenant. The rules for the number of reference files differ between single-file sources and other sources. For details, refer to the descriptions of the <code>ReferenceFileIds</code> and <code>ReferenceFileUris</code> fields.</p>
     * 
     * @param request the request parameters of CreateSemanticJob  CreateSemanticJobRequest
     * @return CreateSemanticJobResponse
     */
    CompletableFuture<CreateSemanticJobResponse> createSemanticJob(CreateSemanticJobRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a personal development environment (ServerIDE) instance. After you specify the DataWorks workspace, resource group, image, and specifications, the instance is created and the instance ID is returned.</p>
     * 
     * @param request the request parameters of CreateServerIdeInstance  CreateServerIdeInstanceRequest
     * @return CreateServerIdeInstanceResponse
     */
    CompletableFuture<CreateServerIdeInstanceResponse> createServerIdeInstance(CreateServerIdeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>You must specify either the SkillMdOverride or BundleUrl parameter.</li>
     * <li>You can set Visibility to TENANT, PROJECT, or USER, which indicates that the skill is visible within the account, visible to specified projects, or visible to specified users, respectively.</li>
     * <li>If Visibility is set to PROJECT, you must specify the IDs of the projects in which the skill is visible by using VisibilityScope.ProjectIds. If Visibility is set to USER, you must specify the IDs of the users who can see the skill by using VisibilityScope.UserIds.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSkill  CreateSkillRequest
     * @return CreateSkillResponse
     */
    CompletableFuture<CreateSkillResponse> createSkill(CreateSkillRequest request);

    /**
     * @param request the request parameters of CreateUdfFile  CreateUdfFileRequest
     * @return CreateUdfFileResponse
     */
    CompletableFuture<CreateUdfFileResponse> createUdfFile(CreateUdfFileRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If more than one workflow is defined in the FlowSpec, all workflows except the first one are ignored. In addition, nodes defined within the workflow are also directly ignored. Call the CreateNode operation to create internal nodes one by one.</notice>
     * This operation is part of the new Data Studio capabilities and applies only to workspaces that use the new Data Studio. If you do not use the new Data Studio, use the corresponding operation of the 2020-05-18 version.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateWorkflowDefinition  CreateWorkflowDefinitionRequest
     * @return CreateWorkflowDefinitionResponse
     */
    CompletableFuture<CreateWorkflowDefinitionResponse> createWorkflowDefinition(CreateWorkflowDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or higher to use this operation.</p>
     * 
     * @param request the request parameters of CreateWorkflowInstances  CreateWorkflowInstancesRequest
     * @return CreateWorkflowInstancesResponse
     */
    CompletableFuture<CreateWorkflowInstancesResponse> createWorkflowInstances(CreateWorkflowInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation deletes an Agent with the specified name from DataWorks. When calling this operation, you must provide the name of the Agent to delete.</p>
     * 
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only when the canary release feature is enabled. Before calling this operation, ensure that the canary release feature is enabled for the current account and the target region.
     * Verify the target session before proceeding. A deleted session cannot be recovered by unarchiving it through ArchiveAgentSession. To temporarily hide a session, use ArchiveAgentSession. To stop the current execution, use CancelAgentSession.
     * The caller must have access permissions for the current session and the corresponding OpenAPI action permissions. An HTTP 200 status code does not indicate a successful business operation. You must check JsonRpcResponse.Error for errors. Successful results are located in JsonRpcResponse.Result.</p>
     * 
     * @param request the request parameters of DeleteAgentSession  DeleteAgentSessionRequest
     * @return DeleteAgentSessionResponse
     */
    CompletableFuture<DeleteAgentSessionResponse> deleteAgentSession(DeleteAgentSessionRequest request);

    /**
     * @param request the request parameters of DeleteAlertRule  DeleteAlertRuleRequest
     * @return DeleteAlertRuleResponse
     */
    CompletableFuture<DeleteAlertRuleResponse> deleteAlertRule(DeleteAlertRuleRequest request);

    /**
     * @param request the request parameters of DeleteBusiness  DeleteBusinessRequest
     * @return DeleteBusinessResponse
     */
    CompletableFuture<DeleteBusinessResponse> deleteBusiness(DeleteBusinessRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Enterprise Edition is required.
     * You cannot delete a scheduling calendar that is referenced by nodes. Remove the node references first.</p>
     * 
     * @param request the request parameters of DeleteCalendar  DeleteCalendarRequest
     * @return DeleteCalendarResponse
     */
    CompletableFuture<DeleteCalendarResponse> deleteCalendar(DeleteCalendarRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace: tenant owner, workspace administrator, project owner, or O&amp;M engineer.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteCertificate  DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request);

    /**
     * <b>description</b> :
     * <p><notice>After a UDF function is deployed, it cannot be deleted. You must undeploy it before deleting it.</notice>
     * This API operation belongs to the new Data Studio capabilities and applies only to workspaces that use the new Data Studio feature. If you do not use the new Data Studio feature, use the corresponding API operation of the 2020-05-18 version.</p>
     * 
     * @param request the request parameters of DeleteComponent  DeleteComponentRequest
     * @return DeleteComponentResponse
     */
    CompletableFuture<DeleteComponentResponse> deleteComponent(DeleteComponentRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * <li>Tenant Owner, Workspace Administrator, Project Owner, O\&amp;M</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteComputeResource  DeleteComputeResourceRequest
     * @return DeleteComputeResourceResponse
     */
    CompletableFuture<DeleteComputeResourceResponse> deleteComputeResource(DeleteComputeResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Delete metadata crawlers that are no longer in use.</p>
     * <h2>Recommended procedure</h2>
     * <ol>
     * <li>Call <code>ListCrawlers</code> to query the crawler ID.</li>
     * <li>After confirming that the crawler is no longer needed, call this operation.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or higher is required.</p>
     * <h2>Precautions</h2>
     * <p>After the crawler is deleted, it cannot be queried, updated, or run. The collected metadata is cleaned up by the system, and the cleanup result may be delayed.</p>
     * 
     * @param request the request parameters of DeleteCrawler  DeleteCrawlerRequest
     * @return DeleteCrawlerResponse
     */
    CompletableFuture<DeleteCrawlerResponse> deleteCrawler(DeleteCrawlerRequest request);

    /**
     * @param request the request parameters of DeleteCustomAttribute  DeleteCustomAttributeRequest
     * @return DeleteCustomAttributeResponse
     */
    CompletableFuture<DeleteCustomAttributeResponse> deleteCustomAttribute(DeleteCustomAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of DeleteDIAlarmRule  DeleteDIAlarmRuleRequest
     * @return DeleteDIAlarmRuleResponse
     */
    CompletableFuture<DeleteDIAlarmRuleResponse> deleteDIAlarmRule(DeleteDIAlarmRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of DeleteDIJob  DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    CompletableFuture<DeleteDIJobResponse> deleteDIJob(DeleteDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of DeleteDataAssetTag  DeleteDataAssetTagRequest
     * @return DeleteDataAssetTagResponse
     */
    CompletableFuture<DeleteDataAssetTagResponse> deleteDataAssetTag(DeleteDataAssetTagRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of DeleteDataQualityAlertRule  DeleteDataQualityAlertRuleRequest
     * @return DeleteDataQualityAlertRuleResponse
     */
    CompletableFuture<DeleteDataQualityAlertRuleResponse> deleteDataQualityAlertRule(DeleteDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI DeleteDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::DeleteDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or higher to use this feature.
     * 
     * @param request the request parameters of DeleteDataQualityEvaluationTask  DeleteDataQualityEvaluationTaskRequest
     * @return DeleteDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<DeleteDataQualityEvaluationTaskResponse> deleteDataQualityEvaluationTask(DeleteDataQualityEvaluationTaskRequest request);

    /**
     * <b>description</b> :
     * <p>需要购买DataWorks基础版及以上版本才能使用</p>
     * 
     * @param request the request parameters of DeleteDataQualityRule  DeleteDataQualityRuleRequest
     * @return DeleteDataQualityRuleResponse
     */
    CompletableFuture<DeleteDataQualityRuleResponse> deleteDataQualityRule(DeleteDataQualityRuleRequest request);

    /**
     * @deprecated OpenAPI DeleteDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::DeleteDataQualityTemplate instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this operation.
     * 
     * @param request the request parameters of DeleteDataQualityRuleTemplate  DeleteDataQualityRuleTemplateRequest
     * @return DeleteDataQualityRuleTemplateResponse
     */
    @Deprecated
    CompletableFuture<DeleteDataQualityRuleTemplateResponse> deleteDataQualityRuleTemplate(DeleteDataQualityRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of DeleteDataQualityScan  DeleteDataQualityScanRequest
     * @return DeleteDataQualityScanResponse
     */
    CompletableFuture<DeleteDataQualityScanResponse> deleteDataQualityScan(DeleteDataQualityScanRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Id</strong>: The unique identifier of a custom rule template, in the format of <code>USER_DEFINED:&lt;template_id&gt;</code>.</li>
     * <li><strong>ProjectId</strong>: The ID of the DataWorks workspace to which the rule template belongs.
     * This operation removes a data quality rule template that is no longer needed. Make sure that the <code>Id</code> and <code>ProjectId</code> values are correct. Otherwise, the deletion may fail or cause unexpected data loss. Exercise caution when performing this operation and verify the template information before proceeding.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataQualityTemplate  DeleteDataQualityTemplateRequest
     * @return DeleteDataQualityTemplateResponse
     */
    CompletableFuture<DeleteDataQualityTemplateResponse> deleteDataQualityTemplate(DeleteDataQualityTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li>To call this operation, you must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a later edition is required.</li>
     * <li>To delete a sharing rule that shares a data source from Workspace A to Workspace B, the operator must have the data source sharing permission in Workspace A or Workspace B. The operator must be assigned at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant owner, tenant administrator, workspace administrator, or project owner</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataSourceSharedRule  DeleteDataSourceSharedRuleRequest
     * @return DeleteDataSourceSharedRuleResponse
     */
    CompletableFuture<DeleteDataSourceSharedRuleResponse> deleteDataSourceSharedRule(DeleteDataSourceSharedRuleRequest request);

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    /**
     * @param request the request parameters of DeleteDatasetVersion  DeleteDatasetVersionRequest
     * @return DeleteDatasetVersionResponse
     */
    CompletableFuture<DeleteDatasetVersionResponse> deleteDatasetVersion(DeleteDatasetVersionRequest request);

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    /**
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * After a UDF is published, it cannot be deleted. You must unpublish the UDF before you can delete it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFunction  DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this API operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a knowledge base. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of DeleteKnowledgeBase  DeleteKnowledgeBaseRequest
     * @return DeleteKnowledgeBaseResponse
     */
    CompletableFuture<DeleteKnowledgeBaseResponse> deleteKnowledgeBase(DeleteKnowledgeBaseRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a knowledge base build task. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of DeleteKnowledgeBaseBuildTask  DeleteKnowledgeBaseBuildTaskRequest
     * @return DeleteKnowledgeBaseBuildTaskResponse
     */
    CompletableFuture<DeleteKnowledgeBaseBuildTaskResponse> deleteKnowledgeBaseBuildTask(DeleteKnowledgeBaseBuildTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a knowledge object. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of DeleteKnowledgeObject  DeleteKnowledgeObjectRequest
     * @return DeleteKnowledgeObjectResponse
     */
    CompletableFuture<DeleteKnowledgeObjectResponse> deleteKnowledgeObject(DeleteKnowledgeObjectRequest request);

    /**
     * <b>description</b> :
     * <p>Manages knowledge sources in a knowledge base. The identity is determined by the POP context, and credentials are not returned in the response.</p>
     * 
     * @param request the request parameters of DeleteKnowledgeSource  DeleteKnowledgeSourceRequest
     * @return DeleteKnowledgeSourceResponse
     */
    CompletableFuture<DeleteKnowledgeSourceResponse> deleteKnowledgeSource(DeleteKnowledgeSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteLineageRelationship  DeleteLineageRelationshipRequest
     * @return DeleteLineageRelationshipResponse
     */
    CompletableFuture<DeleteLineageRelationshipResponse> deleteLineageRelationship(DeleteLineageRelationshipRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API allows you to delete the corresponding MCP Server instance based on the provided MCP Server name. Make sure you have the appropriate permissions and verify that the MCP Server name to be deleted is correct before calling.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>The deletion operation is irreversible. Proceed with caution.</li>
     * <li>Ensure that you have sufficient permissions (<code>dataworks:DeleteMcpServer</code>) to perform this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMcpServer  DeleteMcpServerRequest
     * @return DeleteMcpServerResponse
     */
    CompletableFuture<DeleteMcpServerResponse> deleteMcpServer(DeleteMcpServerRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteMetaCollection  DeleteMetaCollectionRequest
     * @return DeleteMetaCollectionResponse
     */
    CompletableFuture<DeleteMetaCollectionResponse> deleteMetaCollection(DeleteMetaCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of DeleteMetaEntityDef  DeleteMetaEntityDefRequest
     * @return DeleteMetaEntityDefResponse
     */
    CompletableFuture<DeleteMetaEntityDefResponse> deleteMetaEntityDef(DeleteMetaEntityDefRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of DeleteNetwork  DeleteNetworkRequest
     * @return DeleteNetworkResponse
     */
    CompletableFuture<DeleteNetworkResponse> deleteNetwork(DeleteNetworkRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;notice&gt;After a node is deployed, it cannot be deleted. You must undeploy the node before deleting it.&gt;&lt;/notice&gt;</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks Professional Edition and later versions.</p>
     * 
     * @param request the request parameters of DeleteParameter  DeleteParameterRequest
     * @return DeleteParameterResponse
     */
    CompletableFuture<DeleteParameterResponse> deleteParameter(DeleteParameterRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This API deletes a process definition by its ID.</li>
     * <li>This operation is irreversible. Proceed with caution.</li>
     * <li>Before calling this API, back up relevant data or confirm that the process definition is no longer required.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProcessDefinition  DeleteProcessDefinitionRequest
     * @return DeleteProcessDefinitionResponse
     */
    CompletableFuture<DeleteProcessDefinitionResponse> deleteProcessDefinition(DeleteProcessDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * <blockquote>
     * <p>Note: After a workspace is deleted, it is moved to the recycle bin on the <strong>Workspaces</strong> page in the console. The workspace is permanently removed after a 14-day cool-down period. During this period, you cannot create a workspace with the same name.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of DeleteProjectMember  DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     */
    CompletableFuture<DeleteProjectMemberResponse> deleteProjectMember(DeleteProjectMemberRequest request);

    /**
     * @param request the request parameters of DeleteProjectRole  DeleteProjectRoleRequest
     * @return DeleteProjectRoleResponse
     */
    CompletableFuture<DeleteProjectRoleResponse> deleteProjectRole(DeleteProjectRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * After a file resource is published, it cannot be deleted. You must unpublish the file resource before you can delete it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires DataWorks Basic Edition or a later version.</li>
     * <li><strong>Before you use this operation, ensure you understand the billing method and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> for DataWorks general-purpose resource groups.</strong></li>
     * <li><strong>Before you use this operation, ensure you have created the Service-Linked Role AliyunServiceRoleForDataWorks.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DeleteResourceGroup  DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of DeleteRoute  DeleteRouteRequest
     * @return DeleteRouteResponse
     */
    CompletableFuture<DeleteRouteResponse> deleteRoute(DeleteRouteRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can delete a security strategy by providing its ID.</li>
     * <li>You cannot delete a system strategy.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSecurityStrategy  DeleteSecurityStrategyRequest
     * @return DeleteSecurityStrategyResponse
     */
    CompletableFuture<DeleteSecurityStrategyResponse> deleteSecurityStrategy(DeleteSecurityStrategyRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Archives and deletes a saved semantic job definition so that it no longer appears in the list of available jobs.</p>
     * <h2>Call flow</h2>
     * <ol>
     * <li>Obtain the job name from <code>CreateSemanticJob.Data.Name</code> or <code>ListSemanticJobs.Data.SemanticJobs[].Name</code>.</li>
     * <li>To check whether any active runs exist, call <code>ListSemanticJobRuns</code> first. If necessary, stop the execution by calling <code>KillSemanticJob</code>.</li>
     * <li>Call this operation to delete the job definition.</li>
     * </ol>
     * <h2>Result description</h2>
     * <p>A successful response indicates that the deletion request is complete. After deletion, you can no longer use the name to call <code>RunSemanticJob</code>.</p>
     * 
     * @param request the request parameters of DeleteSemanticJob  DeleteSemanticJobRequest
     * @return DeleteSemanticJobResponse
     */
    CompletableFuture<DeleteSemanticJobResponse> deleteSemanticJob(DeleteSemanticJobRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified personal development environment (ServerIDE) instance and returns the instance ID.</p>
     * 
     * @param request the request parameters of DeleteServerIdeInstance  DeleteServerIdeInstanceRequest
     * @return DeleteServerIdeInstanceResponse
     */
    CompletableFuture<DeleteServerIdeInstanceResponse> deleteServerIdeInstance(DeleteServerIdeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a Skill with the specified name from DataWorks. The exact name of the Skill to delete must be provided when invoking this API.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>Ensure that you have sufficient permissions to perform the delete operation.</li>
     * <li>The delete operation is irreversible. Use it with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this feature.</p>
     * 
     * @param request the request parameters of DeleteTask  DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of DeleteWorkflow  DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    CompletableFuture<DeleteWorkflowResponse> deleteWorkflow(DeleteWorkflowRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>&lt;notice&gt;After a workflow is published, it cannot be deleted. You must undeploy the workflow before deleting it.&gt;&lt;/notice&gt;</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteWorkflowDefinition  DeleteWorkflowDefinitionRequest
     * @return DeleteWorkflowDefinitionResponse
     */
    CompletableFuture<DeleteWorkflowDefinitionResponse> deleteWorkflowDefinition(DeleteWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of DeployFile  DeployFileRequest
     * @return DeployFileResponse
     */
    CompletableFuture<DeployFileResponse> deployFile(DeployFileRequest request);

    /**
     * @deprecated OpenAPI DetachDataQualityRulesFromEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of DetachDataQualityRulesFromEvaluationTask  DetachDataQualityRulesFromEvaluationTaskRequest
     * @return DetachDataQualityRulesFromEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<DetachDataQualityRulesFromEvaluationTaskResponse> detachDataQualityRulesFromEvaluationTask(DetachDataQualityRulesFromEvaluationTaskRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this API operation.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this API operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DisableImage  DisableImageRequest
     * @return DisableImageResponse
     */
    CompletableFuture<DisableImageResponse> disableImage(DisableImageRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API disables the specified approval process definition.</li>
     * <li>A disabled approval process definition remains inactive until it is re-enabled.</li>
     * <li>You must provide a valid process definition ID as a path parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableProcessDefinition  DisableProcessDefinitionRequest
     * @return DisableProcessDefinitionResponse
     */
    CompletableFuture<DisableProcessDefinitionResponse> disableProcessDefinition(DisableProcessDefinitionRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires DataWorks Basic Edition or a later version.</li>
     * <li><strong>Before calling this operation, ensure you have created the AliyunServiceRoleForDataWorks service-linked role.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DissociateProjectFromImage  DissociateProjectFromImageRequest
     * @return DissociateProjectFromImageResponse
     */
    CompletableFuture<DissociateProjectFromImageResponse> dissociateProjectFromImage(DissociateProjectFromImageRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires a subscription to DataWorks Basic Edition or a higher edition.</li>
     * <li>You must have one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>tenant owner, workspace administrator, project owner, or operator</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateProjectFromResourceGroup  DissociateProjectFromResourceGroupRequest
     * @return DissociateProjectFromResourceGroupResponse
     */
    CompletableFuture<DissociateProjectFromResourceGroupResponse> dissociateProjectFromResourceGroup(DissociateProjectFromResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Retrieves temporary download URLs for result files of a submitted semantic job run, such as semantic model YAML artifacts. This operation returns download URLs and does not directly return file content.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Use the job name <code>JobName</code> to locate the job.</li>
     * <li>To retrieve artifacts of a specific run, specify the <code>JobRunId</code> from the <code>RunSemanticJob.Data.JobRunId</code> or <code>ListSemanticJobRuns</code> response. If you do not specify this parameter, the artifacts of the most recent run are returned.</li>
     * <li>Download the corresponding files from <code>Data.Results[].DownloadUrl</code>.</li>
     * </ol>
     * <h2>Before you begin</h2>
     * <p>The download URL is a temporary credential. Use it only briefly on the client side. Do not write it to logs or store it for long-term use.</p>
     * 
     * @param request the request parameters of DownloadSemanticResults  DownloadSemanticResultsRequest
     * @return DownloadSemanticResultsResponse
     */
    CompletableFuture<DownloadSemanticResultsResponse> downloadSemanticResults(DownloadSemanticResultsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li><strong>Make sure that you have created the service-linked role AliyunServiceRoleForDataWorks before you call this API operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of EnableImage  EnableImageRequest
     * @return EnableImageResponse
     */
    CompletableFuture<EnableImageResponse> enableImage(EnableImageRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API enables an existing process definition. You must provide the process definition ID as a path parameter.</p>
     * 
     * @param request the request parameters of EnableProcessDefinition  EnableProcessDefinitionRequest
     * @return EnableProcessDefinitionResponse
     */
    CompletableFuture<EnableProcessDefinitionResponse> enableProcessDefinition(EnableProcessDefinitionRequest request);

    /**
     * @param request the request parameters of EstablishRelationTableToBusiness  EstablishRelationTableToBusinessRequest
     * @return EstablishRelationTableToBusinessResponse
     */
    CompletableFuture<EstablishRelationTableToBusinessResponse> establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request);

    /**
     * @param request the request parameters of ExecCrossProjectPipelineRun  ExecCrossProjectPipelineRunRequest
     * @return ExecCrossProjectPipelineRunResponse
     */
    CompletableFuture<ExecCrossProjectPipelineRunResponse> execCrossProjectPipelineRun(ExecCrossProjectPipelineRunRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The stages in a deployment pipeline are sequential. For more information, see the return values of GetPipelineRun. You cannot skip or repeatedly execute a stage.
     * Notice: The execution process is asynchronous. The return value only indicates whether the execution is successfully triggered, not whether the stage is successfully executed. The execution result is subject to the return values of GetPipelineRun.
     * Notice: This operation may not be available in earlier SDK versions. In this case, use the ExecDeploymentStage operation, which uses the same parameters as described in this document.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ExecPipelineRunStage  ExecPipelineRunStageRequest
     * @return ExecPipelineRunStageResponse
     */
    CompletableFuture<ExecPipelineRunStageResponse> execPipelineRunStage(ExecPipelineRunStageRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or later is required to use this operation.</p>
     * 
     * @param request the request parameters of ExecuteAdhocWorkflowInstance  ExecuteAdhocWorkflowInstanceRequest
     * @return ExecuteAdhocWorkflowInstanceResponse
     */
    CompletableFuture<ExecuteAdhocWorkflowInstanceResponse> executeAdhocWorkflowInstance(ExecuteAdhocWorkflowInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation queries the most suitable security policy based on the provided control module, submodule, and workspace ID. If a workspace ID is provided, the system preferentially matches policies at the specified workspace level. Otherwise, tenant-level policies are returned. Note that system policies cannot be deleted or modified.</p>
     * 
     * @param request the request parameters of FindBestMatchSecurityStrategy  FindBestMatchSecurityStrategyRequest
     * @return FindBestMatchSecurityStrategyResponse
     */
    CompletableFuture<FindBestMatchSecurityStrategyResponse> findBestMatchSecurityStrategy(FindBestMatchSecurityStrategyRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation retrieves the detailed configuration information of an agent by its name, including but not limited to model configurations, system prompts, and tool lists. You must provide the exact agent name as a parameter in the request.</p>
     * 
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation retrieves the metadata and content of a single artifact based on <code>SessionId</code> and <code>ArtifactPath</code>.</li>
     * <li><code>SessionId</code> and <code>ArtifactPath</code> are required.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentSessionArtifactMeta  GetAgentSessionArtifactMetaRequest
     * @return GetAgentSessionArtifactMetaResponse
     */
    CompletableFuture<GetAgentSessionArtifactMetaResponse> getAgentSessionArtifactMeta(GetAgentSessionArtifactMetaRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only when the canary release feature is enabled. Before calling this operation, ensure that the corresponding canary release is enabled for your account and the target region.
     * This API operation provides a read-only SSE subscription and does not submit questions. Use a GET request and maintain streaming reads. Do not read the response as a standard JSON object at once. For long-running tasks that may exceed the timeout of a single request, establish an independent event subscription before calling PromptAgentSession. After creating a session, set SessionCode to the SessionId and read both streams in parallel. The Events stream displays real-time progress, while the built-in SSE of the Prompt stream is used to read the final state and business errors of the current turn.
     * Events display messages, tool invoke, and execution progress. The establishment of a subscription connection, heartbeats, or an HTTP 200 status code does not indicate task completion. Determine task completion based on the actual final state events and the Prompt invoke results.
     * When resuming after a disconnection, pass the ID of the last consumed remote event as Last-Event-Id. Also, save and pass back the EventEpoch of the same event stream if the server has returned it. When subscribing for the first time without a cursor, omit these two parameters to receive only real-time events after the subscription is established. Explicitly setting Last-Event-Id to 0 attempts to replay from the starting point still in the cache, which does not mean the complete history can be retrieved. Retrieve the complete history by calling LoadAgentSession. Do not generate cursors or epochs yourself, or use local message sequence numbers as replacements.
     * The event cache is bounded. If you receive a resynchronization prompt such as state_resync_required or the cursor is no longer available, restore the history by calling LoadAgentSession and then re-establish the subscription. LoadAgentSession is used for refreshing and exception recovery, and should not be called repeatedly to replace real-time event subscriptions. If the Prompt stream times out or disconnects before receiving the business final state, the result of the current turn is unknown, and you can continue to observe the progress through the Events stream. Avoid automatically resending the Prompt. Closing the Events subscription does not trigger CancelAgentSession.
     * Servers that support epoch information return eventEpoch in the data of the stream_open control frame and provide a mapping between the business sessionId and nativeSessionId. Save the identifiers returned by the server. Do not assume that the business session ID is the same as the native session ID. The cursor and eventEpoch must come from the same event stream epoch of the same native session, and cannot be reused across native sessions or epochs. Do not advance the cursor when the control frame does not have an ID.</p>
     * 
     * @param request the request parameters of GetAgentSessionEvents  GetAgentSessionEventsRequest
     * @return GetAgentSessionEventsResponse
     */
    CompletableFuture<GetAgentSessionEventsResponse> getAgentSessionEvents(GetAgentSessionEventsRequest request);

    ResponseIterable<GetAgentSessionEventsResponseBody> getAgentSessionEventsWithResponseIterable(GetAgentSessionEventsRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation retrieves usage statistics for AI tokens in a specified session. It provides a breakdown of tokens for prompts, completions, and thoughts, as well as the total token count and the number of cache-hit tokens.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentSessionTokenUsage  GetAgentSessionTokenUsageRequest
     * @return GetAgentSessionTokenUsageResponse
     */
    CompletableFuture<GetAgentSessionTokenUsageResponse> getAgentSessionTokenUsage(GetAgentSessionTokenUsageRequest request);

    /**
     * @param request the request parameters of GetAlertRule  GetAlertRuleRequest
     * @return GetAlertRuleResponse
     */
    CompletableFuture<GetAlertRuleResponse> getAlertRule(GetAlertRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Specify a valid <code>ProcessInstanceId</code> to retrieve the corresponding resource access request.</li>
     * <li>The response includes the basic details and status of the request, along with its items.</li>
     * <li>Each item includes information about the resource, the grantee, and the requested operation permissions.</li>
     * </ul>
     * 
     * @param request the request parameters of GetApplicationContents  GetApplicationContentsRequest
     * @return GetApplicationContentsResponse
     */
    CompletableFuture<GetApplicationContentsResponse> getApplicationContents(GetApplicationContentsRequest request);

    /**
     * @param request the request parameters of GetBatchChangeTableOwnerStatus  GetBatchChangeTableOwnerStatusRequest
     * @return GetBatchChangeTableOwnerStatusResponse
     */
    CompletableFuture<GetBatchChangeTableOwnerStatusResponse> getBatchChangeTableOwnerStatus(GetBatchChangeTableOwnerStatusRequest request);

    /**
     * @param request the request parameters of GetBusiness  GetBusinessRequest
     * @return GetBusinessResponse
     */
    CompletableFuture<GetBusinessResponse> getBusiness(GetBusinessRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Enterprise Edition is required to use this API.</p>
     * 
     * @param request the request parameters of GetCalendar  GetCalendarRequest
     * @return GetCalendarResponse
     */
    CompletableFuture<GetCalendarResponse> getCalendar(GetCalendarRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCatalog  GetCatalogRequest
     * @return GetCatalogResponse
     */
    CompletableFuture<GetCatalogResponse> getCatalog(GetCatalogRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a more advanced edition to use this API.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace: tenant owner, workspace administrator, deployer, developer, project owner, or operator.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCertificate  GetCertificateRequest
     * @return GetCertificateResponse
     */
    CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request);

    /**
     * @param request the request parameters of GetCodeReview  GetCodeReviewRequest
     * @return GetCodeReviewResponse
     */
    CompletableFuture<GetCodeReviewResponse> getCodeReview(GetCodeReviewRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this API operation.</li>
     * </ol>
     * 
     * @param request the request parameters of GetColumn  GetColumnRequest
     * @return GetColumnResponse
     */
    CompletableFuture<GetColumnResponse> getColumn(GetColumnRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of GetComponent  GetComponentRequest
     * @return GetComponentResponse
     */
    CompletableFuture<GetComponentResponse> getComponent(GetComponentRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Developer, Project Owner, O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of GetComputeResource  GetComputeResourceRequest
     * @return GetComputeResourceResponse
     */
    CompletableFuture<GetComputeResourceResponse> getComputeResource(GetComputeResourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant owner, workspace administrator, deployer, developer, project owner, or operator.</li>
     * </ul>
     * 
     * @param request the request parameters of GetComputeResourceAuthUserMappings  GetComputeResourceAuthUserMappingsRequest
     * @return GetComputeResourceAuthUserMappingsResponse
     */
    CompletableFuture<GetComputeResourceAuthUserMappingsResponse> getComputeResourceAuthUserMappings(GetComputeResourceAuthUserMappingsRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the configuration, availability status, and latest run information of a specified metadata crawler.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call ListCrawlers to query the crawler ID.</li>
     * <li>Call this operation to obtain the crawler details.</li>
     * <li>To query the complete run history, call ListCrawlerRuns.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>You must purchase DataWorks Basic Edition or a more advanced edition to use this operation.</p>
     * <h2>Precautions</h2>
     * <p>If the crawler has not been run, the latest run status and task instance ID may be empty.</p>
     * 
     * @param request the request parameters of GetCrawler  GetCrawlerRequest
     * @return GetCrawlerResponse
     */
    CompletableFuture<GetCrawlerResponse> getCrawler(GetCrawlerRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the crawler types that can be created in the current region, as well as the data sources, collection scope, resource groups, scheduling, AI metadata description, and extension configuration capabilities supported by each type.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call this operation before creating or updating a crawler.</li>
     * <li>Construct a <code>CreateCrawler</code> or <code>UpdateCrawler</code> request based on the returned capability information.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * <h2>Precautions</h2>
     * <p>Capabilities may vary by region and crawler type. Use the actual response of this operation as the reference.</p>
     * 
     * @param request the request parameters of GetCrawlerTypeCapabilities  GetCrawlerTypeCapabilitiesRequest
     * @return GetCrawlerTypeCapabilitiesResponse
     */
    CompletableFuture<GetCrawlerTypeCapabilitiesResponse> getCrawlerTypeCapabilities(GetCrawlerTypeCapabilitiesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetCreateWorkflowInstancesResult  GetCreateWorkflowInstancesResultRequest
     * @return GetCreateWorkflowInstancesResultResponse
     */
    CompletableFuture<GetCreateWorkflowInstancesResultResponse> getCreateWorkflowInstancesResult(GetCreateWorkflowInstancesResultRequest request);

    /**
     * @param request the request parameters of GetCrossProjectPipelineRun  GetCrossProjectPipelineRunRequest
     * @return GetCrossProjectPipelineRunResponse
     */
    CompletableFuture<GetCrossProjectPipelineRunResponse> getCrossProjectPipelineRun(GetCrossProjectPipelineRunRequest request);

    /**
     * @param request the request parameters of GetCustomAttribute  GetCustomAttributeRequest
     * @return GetCustomAttributeResponse
     */
    CompletableFuture<GetCustomAttributeResponse> getCustomAttribute(GetCustomAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of GetDIJob  GetDIJobRequest
     * @return GetDIJobResponse
     */
    CompletableFuture<GetDIJobResponse> getDIJob(GetDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetDIJobLog  GetDIJobLogRequest
     * @return GetDIJobLogResponse
     */
    CompletableFuture<GetDIJobLogResponse> getDIJobLog(GetDIJobLogRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of GetDataQualityAlertRule  GetDataQualityAlertRuleRequest
     * @return GetDataQualityAlertRuleResponse
     */
    CompletableFuture<GetDataQualityAlertRuleResponse> getDataQualityAlertRule(GetDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI GetDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description Available only with DataWorks Basic Edition or higher.
     * 
     * @param request the request parameters of GetDataQualityEvaluationTask  GetDataQualityEvaluationTaskRequest
     * @return GetDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<GetDataQualityEvaluationTaskResponse> getDataQualityEvaluationTask(GetDataQualityEvaluationTaskRequest request);

    /**
     * @deprecated OpenAPI GetDataQualityEvaluationTaskInstance is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScanRun instead.  * @description DataWorks Basic Edition or a higher edition is required.
     * 
     * @param request the request parameters of GetDataQualityEvaluationTaskInstance  GetDataQualityEvaluationTaskInstanceRequest
     * @return GetDataQualityEvaluationTaskInstanceResponse
     */
    @Deprecated
    CompletableFuture<GetDataQualityEvaluationTaskInstanceResponse> getDataQualityEvaluationTaskInstance(GetDataQualityEvaluationTaskInstanceRequest request);

    /**
     * @deprecated OpenAPI GetDataQualityRule is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of GetDataQualityRule  GetDataQualityRuleRequest
     * @return GetDataQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<GetDataQualityRuleResponse> getDataQualityRule(GetDataQualityRuleRequest request);

    /**
     * @deprecated OpenAPI GetDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::GetDataQualityTemplate instead.  * @description You can call this operation only if you have purchased DataWorks Basic Edition or a more advanced edition.
     * 
     * @param request the request parameters of GetDataQualityRuleTemplate  GetDataQualityRuleTemplateRequest
     * @return GetDataQualityRuleTemplateResponse
     */
    @Deprecated
    CompletableFuture<GetDataQualityRuleTemplateResponse> getDataQualityRuleTemplate(GetDataQualityRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of GetDataQualityScan  GetDataQualityScanRequest
     * @return GetDataQualityScanResponse
     */
    CompletableFuture<GetDataQualityScanResponse> getDataQualityScan(GetDataQualityScanRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or higher is required.</p>
     * 
     * @param request the request parameters of GetDataQualityScanRun  GetDataQualityScanRunRequest
     * @return GetDataQualityScanRunResponse
     */
    CompletableFuture<GetDataQualityScanRunResponse> getDataQualityScanRun(GetDataQualityScanRunRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetDataQualityScanRunLog  GetDataQualityScanRunLogRequest
     * @return GetDataQualityScanRunLogResponse
     */
    CompletableFuture<GetDataQualityScanRunLogResponse> getDataQualityScanRunLog(GetDataQualityScanRunLogRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of GetDataQualityTemplate  GetDataQualityTemplateRequest
     * @return GetDataQualityTemplateResponse
     */
    CompletableFuture<GetDataQualityTemplateResponse> getDataQualityTemplate(GetDataQualityTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deployment, Developer, Project Owner, or O&amp;M Engineer</li>
     * </ul>
     * 
     * @param request the request parameters of GetDataSource  GetDataSourceRequest
     * @return GetDataSourceResponse
     */
    CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of GetDatabase  GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    /**
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request);

    /**
     * @param request the request parameters of GetDatasetVersion  GetDatasetVersionRequest
     * @return GetDatasetVersionResponse
     */
    CompletableFuture<GetDatasetVersionResponse> getDatasetVersion(GetDatasetVersionRequest request);

    /**
     * @param request the request parameters of GetDeploymentPackage  GetDeploymentPackageRequest
     * @return GetDeploymentPackageResponse
     */
    CompletableFuture<GetDeploymentPackageResponse> getDeploymentPackage(GetDeploymentPackageRequest request);

    /**
     * @param request the request parameters of GetFile  GetFileRequest
     * @return GetFileResponse
     */
    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    /**
     * @param request the request parameters of GetFileVersion  GetFileVersionRequest
     * @return GetFileVersionResponse
     */
    CompletableFuture<GetFileVersionResponse> getFileVersion(GetFileVersionRequest request);

    /**
     * @param request the request parameters of GetFolder  GetFolderRequest
     * @return GetFolderResponse
     */
    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    /**
     * @param request the request parameters of GetFunction  GetFunctionRequest
     * @return GetFunctionResponse
     */
    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    /**
     * @param request the request parameters of GetIDEEventDetail  GetIDEEventDetailRequest
     * @return GetIDEEventDetailResponse
     */
    CompletableFuture<GetIDEEventDetailResponse> getIDEEventDetail(GetIDEEventDetailRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or later is required.</li>
     * <li><strong>Ensure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or higher is required.</li>
     * <li><strong>Ensure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this API operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of GetImageTestResult  GetImageTestResultRequest
     * @return GetImageTestResultResponse
     */
    CompletableFuture<GetImageTestResultResponse> getImageTestResult(GetImageTestResultRequest request);

    /**
     * @param request the request parameters of GetJobStatus  GetJobStatusRequest
     * @return GetJobStatusResponse
     */
    CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a knowledge base. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of GetKnowledgeBase  GetKnowledgeBaseRequest
     * @return GetKnowledgeBaseResponse
     */
    CompletableFuture<GetKnowledgeBaseResponse> getKnowledgeBase(GetKnowledgeBaseRequest request);

    /**
     * <b>description</b> :
     * <p>Reads a knowledge base build task or instance. The tenant and caller identity are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of GetKnowledgeBaseBuildTask  GetKnowledgeBaseBuildTaskRequest
     * @return GetKnowledgeBaseBuildTaskResponse
     */
    CompletableFuture<GetKnowledgeBaseBuildTaskResponse> getKnowledgeBaseBuildTask(GetKnowledgeBaseBuildTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a knowledge base build task or instance. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of GetKnowledgeBaseBuildTaskInstance  GetKnowledgeBaseBuildTaskInstanceRequest
     * @return GetKnowledgeBaseBuildTaskInstanceResponse
     */
    CompletableFuture<GetKnowledgeBaseBuildTaskInstanceResponse> getKnowledgeBaseBuildTaskInstance(GetKnowledgeBaseBuildTaskInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the temporary download link for the original artifact package of a successful build instance. The model YAML is obtained through the knowledge object API and is not included in the TGZ result of this API.</p>
     * 
     * @param request the request parameters of GetKnowledgeBaseBuildTaskResult  GetKnowledgeBaseBuildTaskResultRequest
     * @return GetKnowledgeBaseBuildTaskResultResponse
     */
    CompletableFuture<GetKnowledgeBaseBuildTaskResultResponse> getKnowledgeBaseBuildTaskResult(GetKnowledgeBaseBuildTaskResultRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a knowledge object. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of GetKnowledgeObject  GetKnowledgeObjectRequest
     * @return GetKnowledgeObjectResponse
     */
    CompletableFuture<GetKnowledgeObjectResponse> getKnowledgeObject(GetKnowledgeObjectRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the current details of a knowledge point. GRAPH returns a one-hop local graph centered on the specified node. WIKI and KNOWLEDGE_CONTENT return readable content.</p>
     * 
     * @param request the request parameters of GetKnowledgePoint  GetKnowledgePointRequest
     * @return GetKnowledgePointResponse
     */
    CompletableFuture<GetKnowledgePointResponse> getKnowledgePoint(GetKnowledgePointRequest request);

    /**
     * <b>description</b> :
     * <p>Manages knowledge sources for a knowledge base. The identity is determined by the POP context, and credentials are not returned in the query response.</p>
     * 
     * @param request the request parameters of GetKnowledgeSource  GetKnowledgeSourceRequest
     * @return GetKnowledgeSourceResponse
     */
    CompletableFuture<GetKnowledgeSourceResponse> getKnowledgeSource(GetKnowledgeSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Standard Edition or a higher edition to use this operation.</li>
     * </ol>
     * 
     * @param request the request parameters of GetLineageRelationship  GetLineageRelationshipRequest
     * @return GetLineageRelationshipResponse
     */
    CompletableFuture<GetLineageRelationshipResponse> getLineageRelationship(GetLineageRelationshipRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API returns the detailed configuration of a specific MCP Server by name. The response includes the creator ID, modifier ID, service address, and transport protocol. You must provide the exact name of the MCP Server in the request.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>Ensure you have the required permissions to call this API.</li>
     * <li>The MCP Server name is case-sensitive.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMcpServer  GetMcpServerRequest
     * @return GetMcpServerResponse
     */
    CompletableFuture<GetMcpServerResponse> getMcpServer(GetMcpServerRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of GetMetaCollection  GetMetaCollectionRequest
     * @return GetMetaCollectionResponse
     */
    CompletableFuture<GetMetaCollectionResponse> getMetaCollection(GetMetaCollectionRequest request);

    /**
     * @param request the request parameters of GetMetaEntity  GetMetaEntityRequest
     * @return GetMetaEntityResponse
     */
    CompletableFuture<GetMetaEntityResponse> getMetaEntity(GetMetaEntityRequest request);

    /**
     * @param request the request parameters of GetMetaEntityDef  GetMetaEntityDefRequest
     * @return GetMetaEntityDefResponse
     */
    CompletableFuture<GetMetaEntityDefResponse> getMetaEntityDef(GetMetaEntityDefRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a later edition to use this API.</p>
     * 
     * @param request the request parameters of GetNetwork  GetNetworkRequest
     * @return GetNetworkResponse
     */
    CompletableFuture<GetNetworkResponse> getNetwork(GetNetworkRequest request);

    /**
     * @param request the request parameters of GetNode  GetNodeRequest
     * @return GetNodeResponse
     */
    CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks Professional Edition or later.</p>
     * 
     * @param request the request parameters of GetParameter  GetParameterRequest
     * @return GetParameterResponse
     */
    CompletableFuture<GetParameterResponse> getParameter(GetParameterRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>Only MaxCompute and HMS (EMR cluster) table types are supported.</li>
     * </ol>
     * 
     * @param request the request parameters of GetPartition  GetPartitionRequest
     * @return GetPartitionResponse
     */
    CompletableFuture<GetPartitionResponse> getPartition(GetPartitionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation may not be available in earlier SDK versions. In this case, use the GetDeployment operation instead. The parameters are the same as those described in this document.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetPipelineRun  GetPipelineRunRequest
     * @return GetPipelineRunResponse
     */
    CompletableFuture<GetPipelineRunResponse> getPipelineRun(GetPipelineRunRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries all information about a specific approval process definition by using the specified <code>Id</code> parameter.</li>
     * <li><code>Id</code> is required and must be a valid process definition ID.</li>
     * <li>The returned information includes but is not limited to the basic attributes, rule conditions, notification service configurations, and approval nodes of the process definition.</li>
     * <li>If the request is successful, the data containing the complete process definition object is returned. If the request fails, the corresponding error code and message are provided to help troubleshoot the issue.</li>
     * </ul>
     * 
     * @param request the request parameters of GetProcessDefinition  GetProcessDefinitionRequest
     * @return GetProcessDefinitionResponse
     */
    CompletableFuture<GetProcessDefinitionResponse> getProcessDefinition(GetProcessDefinitionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API is used to monitor and manage the status of an approval process. By providing the approval process instance ID, you can query for related information, such as the approval process definition, current approval nodes, and the tasks on each node.</p>
     * 
     * @param request the request parameters of GetProcessInstance  GetProcessInstanceRequest
     * @return GetProcessInstanceResponse
     */
    CompletableFuture<GetProcessInstanceResponse> getProcessInstance(GetProcessInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetProjectMember  GetProjectMemberRequest
     * @return GetProjectMemberResponse
     */
    CompletableFuture<GetProjectMemberResponse> getProjectMember(GetProjectMemberRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only if you have purchased DataWorks Basic Edition or a later edition.</p>
     * 
     * @param request the request parameters of GetProjectRole  GetProjectRoleRequest
     * @return GetProjectRoleResponse
     */
    CompletableFuture<GetProjectRoleResponse> getProjectRole(GetProjectRoleRequest request);

    /**
     * @param request the request parameters of GetRerunWorkflowInstancesResult  GetRerunWorkflowInstancesResultRequest
     * @return GetRerunWorkflowInstancesResultResponse
     */
    CompletableFuture<GetRerunWorkflowInstancesResultResponse> getRerunWorkflowInstancesResult(GetRerunWorkflowInstancesResultRequest request);

    /**
     * @param request the request parameters of GetResource  GetResourceRequest
     * @return GetResourceResponse
     */
    CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a later edition to use this feature.</p>
     * 
     * @param request the request parameters of GetResourceGroup  GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetRoute  GetRouteRequest
     * @return GetRouteResponse
     */
    CompletableFuture<GetRouteResponse> getRoute(GetRouteRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>Only MaxCompute and Hologres types are supported.</li>
     * </ol>
     * 
     * @param request the request parameters of GetSchema  GetSchemaRequest
     * @return GetSchemaResponse
     */
    CompletableFuture<GetSchemaResponse> getSchema(GetSchemaRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API retrieves all configuration information of a specific security policy by using the specified security policy ID.</li>
     * <li>Ensure that the provided <code>Id</code> parameter value is valid and exists. Otherwise, an error message is returned.</li>
     * <li>The returned data structure includes the basic information of the policy, such as the name and description, and the detailed policy content, such as control items and their settings.</li>
     * <li>Note: Some fields of system default policies may be protected from modification or deletion.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSecurityStrategy  GetSecurityStrategyRequest
     * @return GetSecurityStrategyResponse
     */
    CompletableFuture<GetSecurityStrategyResponse> getSecurityStrategy(GetSecurityStrategyRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the detailed status and runtime information of a semantic job run on the executor side. This is used to poll execution progress or troubleshoot run failures.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Call <code>RunSemanticJob</code> or <code>ListSemanticJobRuns</code> to obtain the <code>ExecutorJobId</code>.</li>
     * <li>Use the <code>ProjectId</code> returned by the job definition as the <code>ProjectId</code> for this operation.</li>
     * <li>Determine the current status based on the executor details in <code>Data</code>. If the job is still running, continue polling this operation.</li>
     * </ol>
     * <h2>Related operations</h2>
     * <p>To retrieve logs, call <code>GetSemanticJobLog</code>. To stop a run, call <code>KillSemanticJob</code>.</p>
     * 
     * @param request the request parameters of GetSemanticJobDetail  GetSemanticJobDetailRequest
     * @return GetSemanticJobDetailResponse
     */
    CompletableFuture<GetSemanticJobDetailResponse> getSemanticJobDetail(GetSemanticJobDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Reads the execution logs of a semantic job run to observe the execution process and identify failure causes.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Specify the run by using <code>RunSemanticJob.Data.ExecutorJobId</code> or <code>ListSemanticJobRuns[].ExecutorJobId</code>.</li>
     * <li>Call this operation with the <code>ProjectId</code> of the corresponding task.</li>
     * <li>Analyze the log segments in <code>Data</code> together with the run status returned by <code>GetSemanticJobDetail</code>.</li>
     * </ol>
     * <h2>Before you begin</h2>
     * <p>Logs are used for diagnostics and do not represent the final result files. Obtain result artifacts by calling <code>DownloadSemanticResults</code>.</p>
     * 
     * @param request the request parameters of GetSemanticJobLog  GetSemanticJobLogRequest
     * @return GetSemanticJobLogResponse
     */
    CompletableFuture<GetSemanticJobLogResponse> getSemanticJobLog(GetSemanticJobLogRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the basic information, running status, image, network, dataset, and credential configurations of a specified personal development environment (ServerIDE) instance.</p>
     * 
     * @param request the request parameters of GetServerIdeInstance  GetServerIdeInstanceRequest
     * @return GetServerIdeInstanceResponse
     */
    CompletableFuture<GetServerIdeInstanceResponse> getServerIdeInstance(GetServerIdeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Overview</h2>
     * <ul>
     * <li><strong>request parameters</strong>: The name of the target Skill.</li>
     * <li><strong>response parameters</strong>: The details of the Skill, including its name, description, creator ID, modifier ID, visibility level, visibility scope, the body of the SKILL.md file, a temporary download link for bundle.zip (which requires no authentication and will expire), the creation time, and the last modified time.</li>
     * <li><strong>Note</strong>: The <code>BundleUrl</code> is a temporary download link. Once the link expires, you must call this operation again to get a new one.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSkill  GetSkillRequest
     * @return GetSkillResponse
     */
    CompletableFuture<GetSkillResponse> getSkill(GetSkillRequest request);

    /**
     * @param request the request parameters of GetSnapshot  GetSnapshotRequest
     * @return GetSnapshotResponse
     */
    CompletableFuture<GetSnapshotResponse> getSnapshot(GetSnapshotRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this API.</li>
     * </ol>
     * 
     * @param request the request parameters of GetTable  GetTableRequest
     * @return GetTableResponse
     */
    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this feature.</p>
     * 
     * @param request the request parameters of GetTaskInstance  GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     */
    CompletableFuture<GetTaskInstanceResponse> getTaskInstance(GetTaskInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetTaskInstanceLog  GetTaskInstanceLogRequest
     * @return GetTaskInstanceLogResponse
     */
    CompletableFuture<GetTaskInstanceLogResponse> getTaskInstanceLog(GetTaskInstanceLogRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of GetUpdateTaskResult  GetUpdateTaskResultRequest
     * @return GetUpdateTaskResultResponse
     */
    CompletableFuture<GetUpdateTaskResultResponse> getUpdateTaskResult(GetUpdateTaskResultRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or higher is required to use this feature.</p>
     * 
     * @param request the request parameters of GetWorkflow  GetWorkflowRequest
     * @return GetWorkflowResponse
     */
    CompletableFuture<GetWorkflowResponse> getWorkflow(GetWorkflowRequest request);

    /**
     * @param request the request parameters of GetWorkflowDefinition  GetWorkflowDefinitionRequest
     * @return GetWorkflowDefinitionResponse
     */
    CompletableFuture<GetWorkflowDefinitionResponse> getWorkflowDefinition(GetWorkflowDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetWorkflowInstance  GetWorkflowInstanceRequest
     * @return GetWorkflowInstanceResponse
     */
    CompletableFuture<GetWorkflowInstanceResponse> getWorkflowInstance(GetWorkflowInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Grants retrieval permissions to a user. Only the knowledge base owner or administrator can perform this operation. The caller and tenant are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of GrantKnowledgeBaseRetrieval  GrantKnowledgeBaseRetrievalRequest
     * @return GrantKnowledgeBaseRetrievalResponse
     */
    CompletableFuture<GrantKnowledgeBaseRetrievalResponse> grantKnowledgeBaseRetrieval(GrantKnowledgeBaseRetrievalRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GrantMemberProjectRoles  GrantMemberProjectRolesRequest
     * @return GrantMemberProjectRolesResponse
     */
    CompletableFuture<GrantMemberProjectRolesResponse> grantMemberProjectRoles(GrantMemberProjectRolesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>This operation does not support importing multiple workflows. If more than one workflow is defined in the FlowSpec, all workflows after the first one are ignored.</li>
     * <li>This is an asynchronous operation. Calling this operation returns an asynchronous task object. To query the execution status of the task, call GetJobStatus.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportWorkflowDefinition  ImportWorkflowDefinitionRequest
     * @return ImportWorkflowDefinitionResponse
     */
    CompletableFuture<ImportWorkflowDefinitionResponse> importWorkflowDefinition(ImportWorkflowDefinitionRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Sends a stop request to the executor for a specified semantic job run. This is applicable to scenarios where a job runs for an extended period, requires manual termination, or needs resource reclamation.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Obtain the <code>ExecutorJobId</code> from <code>RunSemanticJob</code> or <code>ListSemanticJobRuns</code>, and use the <code>ProjectId</code> of the job.</li>
     * <li>Optionally specify <code>RetryTimes</code>.</li>
     * <li>After the call, poll the final status by calling <code>GetSemanticJobDetail</code>. If necessary, call <code>GetSemanticJobLog</code> for diagnostics.</li>
     * </ol>
     * <h2>Precautions</h2>
     * <p>A successful response indicates only that the stop request has been processed. It does not mean that the job has reached a terminal state.</p>
     * 
     * @param request the request parameters of KillSemanticJob  KillSemanticJobRequest
     * @return KillSemanticJobResponse
     */
    CompletableFuture<KillSemanticJobResponse> killSemanticJob(KillSemanticJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries all artifact files generated in a specific session. You can use the <code>Params.RequestId</code> parameter to filter files produced by a single request.</li>
     * <li>The <code>NextToken</code> parameter is used to retrieve more results in a paginated manner. You do not need to provide this value for the first call.</li>
     * <li>By default, a maximum of 50 records are returned per page. You can adjust this value by using the <code>MaxResults</code> parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAgentSessionArtifacts  ListAgentSessionArtifactsRequest
     * @return ListAgentSessionArtifactsResponse
     */
    CompletableFuture<ListAgentSessionArtifactsResponse> listAgentSessionArtifacts(ListAgentSessionArtifactsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request instructions</h2>
     * <ul>
     * <li>You must specify at least one of <code>Params.AgentName</code> and <code>Params.SessionSourceList</code>. You can also filter sessions by <code>Params.TagList</code>, <code>Params.SessionId</code>, and <code>Params.SessionTitle</code>.</li>
     * <li>If <code>Params.Archived</code> is set to <code>true</code>, only archived sessions are queried. If it is set to <code>false</code> or omitted, only unarchived sessions are queried. To query both types of sessions, send separate requests and handle the pagination for each.</li>
     * <li>The session list is located in <code>JsonRpcResponse.Result.AgentSessions</code>. The pagination information is located in <code>TotalCount</code>, <code>MaxResults</code>, and <code>NextToken</code> under the same <code>Result</code>.</li>
     * <li>The default value of <code>Params.MaxResults</code> is 50. For the first page, you can pass <code>Params.NextToken=1</code>. For subsequent pages, pass the <code>NextToken</code> value from the response as is.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAgentSessions  ListAgentSessionsRequest
     * @return ListAgentSessionsResponse
     */
    CompletableFuture<ListAgentSessionsResponse> listAgentSessions(ListAgentSessionsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries all available agents under the current tenant.</li>
     * <li>Supports exact match filtering by using the <code>agentName</code> parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request);

    /**
     * @param request the request parameters of ListAlertRules  ListAlertRulesRequest
     * @return ListAlertRulesResponse
     */
    CompletableFuture<ListAlertRulesResponse> listAlertRules(ListAlertRulesRequest request);

    /**
     * @param request the request parameters of ListBusiness  ListBusinessRequest
     * @return ListBusinessResponse
     */
    CompletableFuture<ListBusinessResponse> listBusiness(ListBusinessRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Enterprise Edition is required.</p>
     * 
     * @param request the request parameters of ListCalendarVersions  ListCalendarVersionsRequest
     * @return ListCalendarVersionsResponse
     */
    CompletableFuture<ListCalendarVersionsResponse> listCalendarVersions(ListCalendarVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Enterprise Edition is required.</p>
     * 
     * @param request the request parameters of ListCalendars  ListCalendarsRequest
     * @return ListCalendarsResponse
     */
    CompletableFuture<ListCalendarsResponse> listCalendars(ListCalendarsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of ListCatalogs  ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    CompletableFuture<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace: Tenant Owner, Workspace Administrator, Deployer, Developer, Guest, Project Owner, Operator, Model Designer, Security Administrator, Data Analyst, Open Platform Administrator, or Data Governance Administrator.</li>
     * </ol>
     * 
     * @param request the request parameters of ListCertificates  ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    CompletableFuture<ListCertificatesResponse> listCertificates(ListCertificatesRequest request);

    /**
     * @param request the request parameters of ListCodeReviews  ListCodeReviewsRequest
     * @return ListCodeReviewsResponse
     */
    CompletableFuture<ListCodeReviewsResponse> listCodeReviews(ListCodeReviewsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * </ol>
     * 
     * @param request the request parameters of ListColumns  ListColumnsRequest
     * @return ListColumnsResponse
     */
    CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace: Tenant Owner, Workspace Administrator, Deployer, Developer, Guest, Project Owner, Operator, Model Designer, Security Administrator, Data Analyst, Open Platform Administrator, or Data Governance Administrator.</li>
     * </ol>
     * 
     * @param request the request parameters of ListComputeResources  ListComputeResourcesRequest
     * @return ListComputeResourcesResponse
     */
    CompletableFuture<ListComputeResourcesResponse> listComputeResources(ListComputeResourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the run records of a specified metadata crawler within the last 30 days by paging, with optional filtering by run start time and status.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Invoke <code>ListCrawlers</code> to obtain the crawler ID.</li>
     * <li>Invoke this operation to query run records and node instance IDs.</li>
     * <li>For asynchronous operations such as running or stopping, use the final status returned by this operation as the source of truth.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * <h2>Precautions</h2>
     * <p>If no time range is specified, the system queries records from the last 30 days by default.</p>
     * 
     * @param request the request parameters of ListCrawlerRuns  ListCrawlerRunsRequest
     * @return ListCrawlerRunsResponse
     */
    CompletableFuture<ListCrawlerRunsResponse> listCrawlerRuns(ListCrawlerRunsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of ListCrawlerTypes  ListCrawlerTypesRequest
     * @return ListCrawlerTypesResponse
     */
    CompletableFuture<ListCrawlerTypesResponse> listCrawlerTypes(ListCrawlerTypesRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Performs a paged query of metadata crawlers that you have access to. Supports filtering by workspace, data source, crawler type, environment, owner, and name.</p>
     * <h2>Recommended flow</h2>
     * <ol>
     * <li>Combine filter conditions as needed to perform a conditional query of the crawler list.</li>
     * <li>Use the returned crawler IDs to invoke the get details, update, run, stop, run records, or delete operations.</li>
     * </ol>
     * <h2>Version requirements</h2>
     * <p>DataWorks Basic Edition or higher is required.</p>
     * <h2>Precautions</h2>
     * <p>When multiple filter conditions are provided at the same time, they take effect in combination. The name field supports fuzzy match.</p>
     * 
     * @param request the request parameters of ListCrawlers  ListCrawlersRequest
     * @return ListCrawlersResponse
     */
    CompletableFuture<ListCrawlersResponse> listCrawlers(ListCrawlersRequest request);

    /**
     * @param request the request parameters of ListCrossProjectDeploymentCandidates  ListCrossProjectDeploymentCandidatesRequest
     * @return ListCrossProjectDeploymentCandidatesResponse
     */
    CompletableFuture<ListCrossProjectDeploymentCandidatesResponse> listCrossProjectDeploymentCandidates(ListCrossProjectDeploymentCandidatesRequest request);

    /**
     * @param request the request parameters of ListCrossProjectDeploymentEnvironments  ListCrossProjectDeploymentEnvironmentsRequest
     * @return ListCrossProjectDeploymentEnvironmentsResponse
     */
    CompletableFuture<ListCrossProjectDeploymentEnvironmentsResponse> listCrossProjectDeploymentEnvironments(ListCrossProjectDeploymentEnvironmentsRequest request);

    /**
     * @param request the request parameters of ListCrossProjectPipelineRunItems  ListCrossProjectPipelineRunItemsRequest
     * @return ListCrossProjectPipelineRunItemsResponse
     */
    CompletableFuture<ListCrossProjectPipelineRunItemsResponse> listCrossProjectPipelineRunItems(ListCrossProjectPipelineRunItemsRequest request);

    /**
     * @param request the request parameters of ListCrossProjectPipelineRuns  ListCrossProjectPipelineRunsRequest
     * @return ListCrossProjectPipelineRunsResponse
     */
    CompletableFuture<ListCrossProjectPipelineRunsResponse> listCrossProjectPipelineRuns(ListCrossProjectPipelineRunsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Search keyword</strong>: You can use the <code>Q</code> parameter to perform a fuzzy match by agent name.</li>
     * <li><strong>Visibility level filter</strong>: You can use the <code>Visibility</code> parameter to filter results by visibility level, such as <code>TENANT</code>, <code>PROJECT</code>, or <code>USER</code>.</li>
     * <li><strong>Paging information</strong>: You can use the <code>MaxResults</code> and <code>NextToken</code> parameters to implement a paged query. The <code>NextToken</code> parameter is used to retrieve the next page of data.</li>
     * </ul>
     * 
     * @param request the request parameters of ListCustomAgents  ListCustomAgentsRequest
     * @return ListCustomAgentsResponse
     */
    CompletableFuture<ListCustomAgentsResponse> listCustomAgents(ListCustomAgentsRequest request);

    /**
     * @param request the request parameters of ListCustomAttributes  ListCustomAttributesRequest
     * @return ListCustomAttributesResponse
     */
    CompletableFuture<ListCustomAttributesResponse> listCustomAttributes(ListCustomAttributesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListDIAlarmRules  ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    CompletableFuture<ListDIAlarmRulesResponse> listDIAlarmRules(ListDIAlarmRulesRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of ListDIJobEvents  ListDIJobEventsRequest
     * @return ListDIJobEventsResponse
     */
    CompletableFuture<ListDIJobEventsResponse> listDIJobEvents(ListDIJobEventsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListDIJobMetrics  ListDIJobMetricsRequest
     * @return ListDIJobMetricsResponse
     */
    CompletableFuture<ListDIJobMetricsResponse> listDIJobMetrics(ListDIJobMetricsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListDIJobRunDetails  ListDIJobRunDetailsRequest
     * @return ListDIJobRunDetailsResponse
     */
    CompletableFuture<ListDIJobRunDetailsResponse> listDIJobRunDetails(ListDIJobRunDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListDIJobs  ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    CompletableFuture<ListDIJobsResponse> listDIJobs(ListDIJobsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or higher to use this operation.</p>
     * 
     * @param request the request parameters of ListDataAssetTags  ListDataAssetTagsRequest
     * @return ListDataAssetTagsResponse
     */
    CompletableFuture<ListDataAssetTagsResponse> listDataAssetTags(ListDataAssetTagsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or a later edition to use this feature.</p>
     * 
     * @param request the request parameters of ListDataAssets  ListDataAssetsRequest
     * @return ListDataAssetsResponse
     */
    CompletableFuture<ListDataAssetsResponse> listDataAssets(ListDataAssetsRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of ListDataQualityAlertRules  ListDataQualityAlertRulesRequest
     * @return ListDataQualityAlertRulesResponse
     */
    CompletableFuture<ListDataQualityAlertRulesResponse> listDataQualityAlertRules(ListDataQualityAlertRulesRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityEvaluationTaskInstances is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @description You must purchase DataWorks Basic Edition or above to use this feature.
     * 
     * @param request the request parameters of ListDataQualityEvaluationTaskInstances  ListDataQualityEvaluationTaskInstancesRequest
     * @return ListDataQualityEvaluationTaskInstancesResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityEvaluationTaskInstancesResponse> listDataQualityEvaluationTaskInstances(ListDataQualityEvaluationTaskInstancesRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityEvaluationTasks is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScans instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this API operation.
     * 
     * @param request the request parameters of ListDataQualityEvaluationTasks  ListDataQualityEvaluationTasksRequest
     * @return ListDataQualityEvaluationTasksResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityEvaluationTasksResponse> listDataQualityEvaluationTasks(ListDataQualityEvaluationTasksRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityResults is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @description You must purchase DataWorks Basic Edition or higher to use this API.
     * 
     * @param request the request parameters of ListDataQualityResults  ListDataQualityResultsRequest
     * @return ListDataQualityResultsResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityResultsResponse> listDataQualityResults(ListDataQualityResultsRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityRuleTemplates is deprecated, please use dataworks-public::2024-05-18::ListDataQualityTemplates instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of ListDataQualityRuleTemplates  ListDataQualityRuleTemplatesRequest
     * @return ListDataQualityRuleTemplatesResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityRuleTemplatesResponse> listDataQualityRuleTemplates(ListDataQualityRuleTemplatesRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityRules is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScans instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of ListDataQualityRules  ListDataQualityRulesRequest
     * @return ListDataQualityRulesResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityRulesResponse> listDataQualityRules(ListDataQualityRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this feature.</p>
     * 
     * @param request the request parameters of ListDataQualityScanRuns  ListDataQualityScanRunsRequest
     * @return ListDataQualityScanRunsResponse
     */
    CompletableFuture<ListDataQualityScanRunsResponse> listDataQualityScanRuns(ListDataQualityScanRunsRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of ListDataQualityScans  ListDataQualityScansRequest
     * @return ListDataQualityScansResponse
     */
    CompletableFuture<ListDataQualityScansResponse> listDataQualityScans(ListDataQualityScansRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListDataQualityTemplates  ListDataQualityTemplatesRequest
     * @return ListDataQualityTemplatesResponse
     */
    CompletableFuture<ListDataQualityTemplatesResponse> listDataQualityTemplates(ListDataQualityTemplatesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>To query the sharing rules of a data source associated with a workspace, you must have the data source sharing permissions in that workspace. You must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataSourceSharedRules  ListDataSourceSharedRulesRequest
     * @return ListDataSourceSharedRulesResponse
     */
    CompletableFuture<ListDataSourceSharedRulesResponse> listDataSourceSharedRules(ListDataSourceSharedRulesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li>To call this operation, you must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>For the StarRocks type, only the Internal catalog is supported.</li>
     * </ol>
     * 
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    /**
     * @param request the request parameters of ListDatasetVersions  ListDatasetVersionsRequest
     * @return ListDatasetVersionsResponse
     */
    CompletableFuture<ListDatasetVersionsResponse> listDatasetVersions(ListDatasetVersionsRequest request);

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request);

    /**
     * @param request the request parameters of ListDeploymentPackageFiles  ListDeploymentPackageFilesRequest
     * @return ListDeploymentPackageFilesResponse
     */
    CompletableFuture<ListDeploymentPackageFilesResponse> listDeploymentPackageFiles(ListDeploymentPackageFilesRequest request);

    /**
     * @param request the request parameters of ListDeploymentPackages  ListDeploymentPackagesRequest
     * @return ListDeploymentPackagesResponse
     */
    CompletableFuture<ListDeploymentPackagesResponse> listDeploymentPackages(ListDeploymentPackagesRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of ListDownstreamTaskInstances  ListDownstreamTaskInstancesRequest
     * @return ListDownstreamTaskInstancesResponse
     */
    CompletableFuture<ListDownstreamTaskInstancesResponse> listDownstreamTaskInstances(ListDownstreamTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListDownstreamTasks  ListDownstreamTasksRequest
     * @return ListDownstreamTasksResponse
     */
    CompletableFuture<ListDownstreamTasksResponse> listDownstreamTasks(ListDownstreamTasksRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of ListEntitiesInMetaCollection  ListEntitiesInMetaCollectionRequest
     * @return ListEntitiesInMetaCollectionResponse
     */
    CompletableFuture<ListEntitiesInMetaCollectionResponse> listEntitiesInMetaCollection(ListEntitiesInMetaCollectionRequest request);

    /**
     * @param request the request parameters of ListFileVersions  ListFileVersionsRequest
     * @return ListFileVersionsResponse
     */
    CompletableFuture<ListFileVersionsResponse> listFileVersions(ListFileVersionsRequest request);

    /**
     * @param request the request parameters of ListFiles  ListFilesRequest
     * @return ListFilesResponse
     */
    CompletableFuture<ListFilesResponse> listFiles(ListFilesRequest request);

    /**
     * @param request the request parameters of ListFolders  ListFoldersRequest
     * @return ListFoldersResponse
     */
    CompletableFuture<ListFoldersResponse> listFolders(ListFoldersRequest request);

    /**
     * @param request the request parameters of ListFunctions  ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or higher to call this operation.</li>
     * <li><strong>Before you call this operation, ensure that the AliyunServiceRoleForDataWorks service-linked role is created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImageAssociatedProjects  ListImageAssociatedProjectsRequest
     * @return ListImageAssociatedProjectsResponse
     */
    CompletableFuture<ListImageAssociatedProjectsResponse> listImageAssociatedProjects(ListImageAssociatedProjectsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or later to use this API operation.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this API operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImageTestResults  ListImageTestResultsRequest
     * @return ListImageTestResultsResponse
     */
    CompletableFuture<ListImageTestResultsResponse> listImageTestResults(ListImageTestResultsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>To use this API, you must purchase DataWorks Basic Edition or a later edition.</li>
     * <li><strong>Ensure you create the service-linked role AliyunServiceRoleForDataWorks before you call this API.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImageVersions  ListImageVersionsRequest
     * @return ListImageVersionsResponse
     */
    CompletableFuture<ListImageVersionsResponse> listImageVersions(ListImageVersionsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or later is required.</li>
     * <li><strong>Before you call this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks is created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * <b>description</b> :
     * <p>Lists the administrators. Only the owner or administrators of the knowledge base can perform this operation. The caller and tenant are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of ListKnowledgeBaseAdministrators  ListKnowledgeBaseAdministratorsRequest
     * @return ListKnowledgeBaseAdministratorsResponse
     */
    CompletableFuture<ListKnowledgeBaseAdministratorsResponse> listKnowledgeBaseAdministrators(ListKnowledgeBaseAdministratorsRequest request);

    /**
     * <b>description</b> :
     * <p>Reads knowledge base build tasks or instances. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of ListKnowledgeBaseBuildTaskInstances  ListKnowledgeBaseBuildTaskInstancesRequest
     * @return ListKnowledgeBaseBuildTaskInstancesResponse
     */
    CompletableFuture<ListKnowledgeBaseBuildTaskInstancesResponse> listKnowledgeBaseBuildTaskInstances(ListKnowledgeBaseBuildTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Reads knowledge base build tasks or instances. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of ListKnowledgeBaseBuildTasks  ListKnowledgeBaseBuildTasksRequest
     * @return ListKnowledgeBaseBuildTasksResponse
     */
    CompletableFuture<ListKnowledgeBaseBuildTasksResponse> listKnowledgeBaseBuildTasks(ListKnowledgeBaseBuildTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Lists user retrieval authorizations. Only the knowledge base owner or administrator can perform this operation. The caller and tenant are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of ListKnowledgeBaseRetrievalGrants  ListKnowledgeBaseRetrievalGrantsRequest
     * @return ListKnowledgeBaseRetrievalGrantsResponse
     */
    CompletableFuture<ListKnowledgeBaseRetrievalGrantsResponse> listKnowledgeBaseRetrievalGrants(ListKnowledgeBaseRetrievalGrantsRequest request);

    /**
     * <b>description</b> :
     * <p>Lists knowledge bases. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of ListKnowledgeBases  ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    CompletableFuture<ListKnowledgeBasesResponse> listKnowledgeBases(ListKnowledgeBasesRequest request);

    /**
     * <b>description</b> :
     * <p>Lists knowledge objects. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of ListKnowledgeObjects  ListKnowledgeObjectsRequest
     * @return ListKnowledgeObjectsResponse
     */
    CompletableFuture<ListKnowledgeObjectsResponse> listKnowledgeObjects(ListKnowledgeObjectsRequest request);

    /**
     * <b>description</b> :
     * <p>Lists the currently visible knowledge points in a knowledge base in a paginated manner. You can filter the knowledge points by type, such as GRAPH, WIKI, and KNOWLEDGE_CONTENT.</p>
     * 
     * @param request the request parameters of ListKnowledgePoints  ListKnowledgePointsRequest
     * @return ListKnowledgePointsResponse
     */
    CompletableFuture<ListKnowledgePointsResponse> listKnowledgePoints(ListKnowledgePointsRequest request);

    /**
     * <b>description</b> :
     * <p>Manages knowledge sources in a knowledge base. The identity is determined by the POP context, and credentials are not returned in the query response.</p>
     * 
     * @param request the request parameters of ListKnowledgeSources  ListKnowledgeSourcesRequest
     * @return ListKnowledgeSourcesResponse
     */
    CompletableFuture<ListKnowledgeSourcesResponse> listKnowledgeSources(ListKnowledgeSourcesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Standard Edition or later is required.</li>
     * </ol>
     * 
     * @param request the request parameters of ListLineageRelationships  ListLineageRelationshipsRequest
     * @return ListLineageRelationshipsResponse
     */
    CompletableFuture<ListLineageRelationshipsResponse> listLineageRelationships(ListLineageRelationshipsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Standard Edition or a more advanced edition to use this operation.</li>
     * <li>This operation queries the upstream and downstream entities of the current entity and the lineage relationships between the entities.</li>
     * </ol>
     * 
     * @param request the request parameters of ListLineages  ListLineagesRequest
     * @return ListLineagesResponse
     */
    CompletableFuture<ListLineagesResponse> listLineages(ListLineagesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This operation retrieves a paginated list of all MCP Servers within your account. You can filter the list by search keyword and visibility level, and control pagination by specifying the maximum number of results and a next page token.</p>
     * <ul>
     * <li><strong>Q</strong>: Optional. The search keyword for a fuzzy search on MCP Server names.</li>
     * <li><strong>Visibility</strong>: Optional. The visibility levels for filtering the results. You can specify multiple levels, such as TENANT, PROJECT, or USER.</li>
     * <li><strong>MaxResults</strong>: Optional. The maximum number of results to return per page. By default, no limit is applied.</li>
     * <li><strong>NextToken</strong>: Optional. The next page token from a previous response. Use this parameter to retrieve the next page of results.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMcpServers  ListMcpServersRequest
     * @return ListMcpServersResponse
     */
    CompletableFuture<ListMcpServersResponse> listMcpServers(ListMcpServersRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListMetaCollections  ListMetaCollectionsRequest
     * @return ListMetaCollectionsResponse
     */
    CompletableFuture<ListMetaCollectionsResponse> listMetaCollections(ListMetaCollectionsRequest request);

    /**
     * @param request the request parameters of ListMetaEntities  ListMetaEntitiesRequest
     * @return ListMetaEntitiesResponse
     */
    CompletableFuture<ListMetaEntitiesResponse> listMetaEntities(ListMetaEntitiesRequest request);

    /**
     * @param request the request parameters of ListMetaEntityDefs  ListMetaEntityDefsRequest
     * @return ListMetaEntityDefsResponse
     */
    CompletableFuture<ListMetaEntityDefsResponse> listMetaEntityDefs(ListMetaEntityDefsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Use <code>NextToken</code> and <code>PageSize</code> to paginate the results.</li>
     * <li><code>DefSchema</code> is required and specifies the resource type.</li>
     * <li>Specify multiple resource types in <code>ResourceType</code> to narrow the results.</li>
     * <li>Use <code>StartTime</code> and <code>EndTime</code> to restrict the query to a time range.</li>
     * <li>Use <code>Statuses</code> to filter requests by status, such as pending approval or authorization succeeded.</li>
     * <li>To filter by specific resources or grantees, specify the details in <code>Resource</code> and <code>Grantee</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMyApplications  ListMyApplicationsRequest
     * @return ListMyApplicationsResponse
     */
    CompletableFuture<ListMyApplicationsResponse> listMyApplications(ListMyApplicationsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation lists permission requests for which the current user is an approver, including requests pending approval and requests that have already been reviewed.</li>
     * <li>Use <code>Statuses</code> to filter requests by status.</li>
     * <li>For the first page, omit <code>NextToken</code> or set it to <code>null</code>. For subsequent pages, pass the <code>NextToken</code> value returned in the previous response.</li>
     * <li><code>PageSize</code> defaults to 10 and supports a maximum of 200.</li>
     * <li><code>DefSchema</code> and <code>ResourceType</code> are required. Other parameters are optional.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMyRelatedApprovals  ListMyRelatedApprovalsRequest
     * @return ListMyRelatedApprovalsResponse
     */
    CompletableFuture<ListMyRelatedApprovalsResponse> listMyRelatedApprovals(ListMyRelatedApprovalsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a later edition to use this feature.</p>
     * 
     * @param request the request parameters of ListNetworks  ListNetworksRequest
     * @return ListNetworksResponse
     */
    CompletableFuture<ListNetworksResponse> listNetworks(ListNetworksRequest request);

    /**
     * @param request the request parameters of ListNodeDependencies  ListNodeDependenciesRequest
     * @return ListNodeDependenciesResponse
     */
    CompletableFuture<ListNodeDependenciesResponse> listNodeDependencies(ListNodeDependenciesRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * <b>description</b> :
     * <p>This feature is available in DataWorks Professional Edition and higher editions.</p>
     * 
     * @param request the request parameters of ListParameterVersions  ListParameterVersionsRequest
     * @return ListParameterVersionsResponse
     */
    CompletableFuture<ListParameterVersionsResponse> listParameterVersions(ListParameterVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or later is required.</p>
     * 
     * @param request the request parameters of ListParameters  ListParametersRequest
     * @return ListParametersResponse
     */
    CompletableFuture<ListParametersResponse> listParameters(ListParametersRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>Currently, only MaxCompute and HMS (EMR cluster) tables are supported.</li>
     * <li>Before you call this API operation, call ListCrawlers to obtain the MetaEntityId of the metadata crawler, and then call ListDatabases to obtain the database ID. For MaxCompute projects with the schema feature enabled, call ListSchemas to obtain the schema ID. Then, call ListTables to obtain the TableId, and pass the returned table ID to this API operation.</li>
     * </ol>
     * 
     * @param request the request parameters of ListPartitions  ListPartitionsRequest
     * @return ListPartitionsResponse
     */
    CompletableFuture<ListPartitionsResponse> listPartitions(ListPartitionsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries all pending permission requests for which the current logged-on user is the approver. You can filter the applications by using various conditions, such as resource type, time range, and approval status, to accurately locate specific applications.</p>
     * <ul>
     * <li><strong>ResourceType</strong>: specifies the resource types, such as tables. Multiple values are supported.</li>
     * <li><strong>Resource</strong>: specifies the exact resource search conditions, such as the project, database, or table name.</li>
     * <li><strong>StartTime and EndTime</strong>: define the time range when the applications were initiated.</li>
     * <li><strong>Statuses</strong>: filters the results by approval status, such as viewing only the pending approval status.</li>
     * <li><strong>Grantee</strong>: filters the applications based on the grantee information.</li>
     * <li><strong>AccessTypes</strong>: filters the applications based on the specific permission types requested, such as read or update.</li>
     * <li><strong>PageSize and NextToken</strong>: are used for pagination control. PageSize specifies the number of entries to return per page, and NextToken specifies the cursor required to retrieve the next page.
     * Precautions:</li>
     * <li>If no filter conditions are provided, all matching records are returned by default.</li>
     * <li>The <code>NextToken</code> parameter can be left empty or omitted in the first call. For subsequent page requests, you must use the <code>NextToken</code> value provided in the previous response.</li>
     * <li>The default value of <code>PageSize</code> is 10, and the maximum value is 200. If the specified value exceeds the maximum limit, the maximum value is used.</li>
     * <li>When no more data is available, the <code>HasMore</code> field is set to <code>false</code>, and <code>NextToken</code> is empty or does not exist.</li>
     * </ul>
     * <h2>Response description</h2>
     * <p>After a successful API call, the response body contains the paginated results and the details of each application, such as the application time, resource description, grantee, and requested permissions. In addition, the status of the approval process and other related metadata are provided.</p>
     * <ul>
     * <li><strong>Data</strong>: the paginated result set, which includes information such as the page size (<code>PageSize</code>), cursor (<code>NextToken</code>), and whether more data is available (<code>HasMore</code>).</li>
     * <li><strong>ApplicationQueryResponse</strong>: the specific content of each application, including the application reason, initiation time, status, and the detailed list of application contents.</li>
     * </ul>
     * 
     * @param request the request parameters of ListPendingApprovals  ListPendingApprovalsRequest
     * @return ListPendingApprovalsResponse
     */
    CompletableFuture<ListPendingApprovalsResponse> listPendingApprovals(ListPendingApprovalsRequest request);

    /**
     * @param request the request parameters of ListPipelineRunItems  ListPipelineRunItemsRequest
     * @return ListPipelineRunItemsResponse
     */
    CompletableFuture<ListPipelineRunItemsResponse> listPipelineRunItems(ListPipelineRunItemsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation may not be available in earlier versions of the SDK. In this case, use the ListDeployments operation, which uses the same parameters as described in this document.</notice></p>
     * </blockquote>
     * 
     * @param request the request parameters of ListPipelineRuns  ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    CompletableFuture<ListPipelineRunsResponse> listPipelineRuns(ListPipelineRunsRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Queries process definitions of a specified policy type.</li>
     * <li>This operation supports paginated queries. You can use the<code>PageSize</code> and<code>PageNumber</code> parameters to control the page size and page number.</li>
     * <li>You can also use the<code>NextToken</code> and<code>MaxResults</code> parameters to page through large result sets.</li>
     * <li>The response includes the total count, page size, current page number, and a list of process definitions.</li>
     * <li>Each process definition includes key attributes, such as its ID, enabled status, and priority.</li>
     * </ul>
     * 
     * @param request the request parameters of ListProcessDefinitions  ListProcessDefinitionsRequest
     * @return ListProcessDefinitionsResponse
     */
    CompletableFuture<ListProcessDefinitionsResponse> listProcessDefinitions(ListProcessDefinitionsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListProjectRoles  ListProjectRolesRequest
     * @return ListProjectRolesResponse
     */
    CompletableFuture<ListProjectRolesResponse> listProjectRoles(ListProjectRolesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks has been created before you call this operation.</strong></li>
     * <li>This operation returns only the workspaces that the current caller has access to. Unauthorized workspaces are not included in the response.</li>
     * </ol>
     * 
     * @param request the request parameters of ListResourceGroupAssociateProjects  ListResourceGroupAssociateProjectsRequest
     * @return ListResourceGroupAssociateProjectsResponse
     */
    CompletableFuture<ListResourceGroupAssociateProjectsResponse> listResourceGroupAssociateProjects(ListResourceGroupAssociateProjectsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks has been created before you call this operation.</strong></li>
     * <li>This operation applies only to serverless resource groups.</li>
     * </ol>
     * 
     * @param request the request parameters of ListResourceGroupMetricData  ListResourceGroupMetricDataRequest
     * @return ListResourceGroupMetricDataResponse
     */
    CompletableFuture<ListResourceGroupMetricDataResponse> listResourceGroupMetricData(ListResourceGroupMetricDataRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or later is required.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this API operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListRoutes  ListRoutesRequest
     * @return ListRoutesResponse
     */
    CompletableFuture<ListRoutesResponse> listRoutes(ListRoutesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or higher to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListSchemas  ListSchemasRequest
     * @return ListSchemasResponse
     */
    CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves the configured security policies in the system in pages.</li>
     * <li>You can use the <code>ControlModule</code> and <code>ControlSubModule</code> parameters to filter policies under specific modules or submodules.</li>
     * <li>The pagination parameters include <code>PageNum</code> and <code>PageSize</code>, which indicate the page number and the number of entries per page. The default values are 1 and 20.</li>
     * <li>If you need further pagination control, you can use the <code>MaxResults</code> and <code>NextToken</code> parameters (private parameters).</li>
     * </ul>
     * 
     * @param request the request parameters of ListSecurityStrategies  ListSecurityStrategiesRequest
     * @return ListSecurityStrategiesResponse
     */
    CompletableFuture<ListSecurityStrategiesResponse> listSecurityStrategies(ListSecurityStrategiesRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>View the historical run records of a semantic job with pagination to obtain the run ID, executor job ID, status, and time information for each submission.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Use the job name from <code>CreateSemanticJob.Data.Name</code> or <code>ListSemanticJobs</code> as the <code>JobName</code>.</li>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> to read records page by page.</li>
     * <li>Use the <code>JobRunId</code> from a record to call <code>DownloadSemanticResults</code>, and use the <code>ExecutorJobId</code> to call the detail, log, or stop operations.</li>
     * </ol>
     * <h2>Before you begin</h2>
     * <p>Pagination starts from page 1 by default. Each page contains a maximum of 200 records.</p>
     * 
     * @param request the request parameters of ListSemanticJobRuns  ListSemanticJobRunsRequest
     * @return ListSemanticJobRunsResponse
     */
    CompletableFuture<ListSemanticJobRunsResponse> listSemanticJobRuns(ListSemanticJobRunsRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>List saved semantic job definitions for the current tenant to display available jobs, select a job to run, or find the workspace that owns a job.</p>
     * <h2>Workflow</h2>
     * <ol>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> to page through <code>Data.SemanticJobs</code>.</li>
     * <li>Use the <code>Name</code> of a list item to invoke <code>RunSemanticJob</code>, <code>DeleteSemanticJob</code>, or <code>ListSemanticJobRuns</code>.</li>
     * <li>Use the <code>ProjectId</code> of a list item together with <code>ExecutorJobId</code> to invoke the details, log, and stop operations.</li>
     * </ol>
     * <h2>Precautions</h2>
     * <p>This operation returns job definitions. For current run status, call <code>ListSemanticJobRuns</code>.</p>
     * 
     * @param request the request parameters of ListSemanticJobs  ListSemanticJobsRequest
     * @return ListSemanticJobsResponse
     */
    CompletableFuture<ListSemanticJobsResponse> listSemanticJobs(ListSemanticJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the ECS instance types available when creating a personal development environment (ServerIDE). You can filter by CPU or GPU type. If no type is specified, both CPU and GPU instance types are returned.</p>
     * 
     * @param request the request parameters of ListServerIdeEcsSpecs  ListServerIdeEcsSpecsRequest
     * @return ListServerIdeEcsSpecsResponse
     */
    CompletableFuture<ListServerIdeEcsSpecsResponse> listServerIdeEcsSpecs(ListServerIdeEcsSpecsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the available images for creating a personal development environment (ServerIDE) by using paging. Supports filtering by image name and labels.</p>
     * 
     * @param request the request parameters of ListServerIdeImages  ListServerIdeImagesRequest
     * @return ListServerIdeImagesResponse
     */
    CompletableFuture<ListServerIdeImagesResponse> listServerIdeImages(ListServerIdeImagesRequest request);

    /**
     * <b>description</b> :
     * <p>Lists personal development environment (ServerIDE) instances with pagination. You can filter by workspace, resource group, keyword, owner, and instance subtype.</p>
     * 
     * @param request the request parameters of ListServerIdeInstances  ListServerIdeInstancesRequest
     * @return ListServerIdeInstancesResponse
     */
    CompletableFuture<ListServerIdeInstancesResponse> listServerIdeInstances(ListServerIdeInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation returns a paginated list of skills for the current account. You can filter the results by search keywords and visibility levels.</p>
     * <ul>
     * <li><strong>Q</strong>: Optional. The search keyword used for fuzzy match by skill name.</li>
     * <li><strong>Visibility</strong>: Optional. The visibility levels used to filter the results. You can specify multiple values.</li>
     * <li><strong>MaxResults</strong>: Optional. The maximum number of entries to return in the current request.</li>
     * <li><strong>NextToken</strong>: Optional. The paging token used to retrieve the next page of results. Do not specify this parameter in the first request. In subsequent requests, specify the NextToken value returned in the previous response to retrieve the next page.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request);

    /**
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * </ol>
     * 
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this API.
     * You can only query operation logs generated within the past 31 days.</p>
     * 
     * @param request the request parameters of ListTaskInstanceOperationLogs  ListTaskInstanceOperationLogsRequest
     * @return ListTaskInstanceOperationLogsResponse
     */
    CompletableFuture<ListTaskInstanceOperationLogsResponse> listTaskInstanceOperationLogs(ListTaskInstanceOperationLogsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this operation.</p>
     * 
     * @param request the request parameters of ListTaskInstances  ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     */
    CompletableFuture<ListTaskInstancesResponse> listTaskInstances(ListTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or later is required to use this feature.
     * Only operation logs from the past 31 days can be queried.</p>
     * 
     * @param request the request parameters of ListTaskOperationLogs  ListTaskOperationLogsRequest
     * @return ListTaskOperationLogsResponse
     */
    CompletableFuture<ListTaskOperationLogsResponse> listTaskOperationLogs(ListTaskOperationLogsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a later edition to use this feature.</p>
     * 
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of ListUpstreamTaskInstances  ListUpstreamTaskInstancesRequest
     * @return ListUpstreamTaskInstancesResponse
     */
    CompletableFuture<ListUpstreamTaskInstancesResponse> listUpstreamTaskInstances(ListUpstreamTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListUpstreamTasks  ListUpstreamTasksRequest
     * @return ListUpstreamTasksResponse
     */
    CompletableFuture<ListUpstreamTasksResponse> listUpstreamTasks(ListUpstreamTasksRequest request);

    /**
     * @param request the request parameters of ListWorkflowDefinitions  ListWorkflowDefinitionsRequest
     * @return ListWorkflowDefinitionsResponse
     */
    CompletableFuture<ListWorkflowDefinitionsResponse> listWorkflowDefinitions(ListWorkflowDefinitionsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this feature.</p>
     * 
     * @param request the request parameters of ListWorkflowInstances  ListWorkflowInstancesRequest
     * @return ListWorkflowInstancesResponse
     */
    CompletableFuture<ListWorkflowInstancesResponse> listWorkflowInstances(ListWorkflowInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a later edition to use this feature.</p>
     * 
     * @param request the request parameters of ListWorkflows  ListWorkflowsRequest
     * @return ListWorkflowsResponse
     */
    CompletableFuture<ListWorkflowsResponse> listWorkflows(ListWorkflowsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation recovers the details of a specified session and returns the agent response in a streaming manner by using Server-Sent Events (SSE).</li>
     * <li>If the target session does not exist, an error frame with the error code 400 is returned.</li>
     * <li>The response includes processing information about how the agent handles the request, such as message chunks, thinking process, and tool invocation status updates.</li>
     * <li>The <code>stopReason</code> field indicates the reason why the agent stops the current conversation turn. Valid values include but are not limited to reaching the maximum number of turns and being canceled.</li>
     * <li>The returned content complies with the open source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com">https://agentclientprotocol.com</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of LoadAgentSession  LoadAgentSessionRequest
     * @return LoadAgentSessionResponse
     */
    CompletableFuture<LoadAgentSessionResponse> loadAgentSession(LoadAgentSessionRequest request);

    ResponseIterable<LoadAgentSessionResponseBody> loadAgentSessionWithResponseIterable(LoadAgentSessionRequest request);

    /**
     * @param request the request parameters of MoveFunction  MoveFunctionRequest
     * @return MoveFunctionResponse
     */
    CompletableFuture<MoveFunctionResponse> moveFunction(MoveFunctionRequest request);

    /**
     * @param request the request parameters of MoveNode  MoveNodeRequest
     * @return MoveNodeResponse
     */
    CompletableFuture<MoveNodeResponse> moveNode(MoveNodeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is part of the new Data Studio capabilities and applies only to workspaces that use the new Data Studio feature. If you do not use the new Data Studio feature, use the corresponding operation in the 2020-05-18 version.</p>
     * 
     * @param request the request parameters of MoveResource  MoveResourceRequest
     * @return MoveResourceResponse
     */
    CompletableFuture<MoveResourceResponse> moveResource(MoveResourceRequest request);

    /**
     * @param request the request parameters of MoveWorkflowDefinition  MoveWorkflowDefinitionRequest
     * @return MoveWorkflowDefinitionResponse
     */
    CompletableFuture<MoveWorkflowDefinitionResponse> moveWorkflowDefinition(MoveWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of PreviewDatasetVersion  PreviewDatasetVersionRequest
     * @return PreviewDatasetVersionResponse
     */
    CompletableFuture<PreviewDatasetVersionResponse> previewDatasetVersion(PreviewDatasetVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Previews the parameter parsing results for each cycle based on the provided script parameters, business date, and scheduling configuration. A task ID is not required.</p>
     * <ul>
     * <li>This operation only performs a simulated preview and does not create or run actual tasks. The simulated cycles returned for weekly and monthly schedules cannot be used as the basis for determining actual trigger dates.</li>
     * <li><code>Bizdate</code> is the starting business date, normalized to 00:00:00 on that date in the time zone of the service region. <code>TriggerTime</code> is the scheduled trigger time for the corresponding simulated cycle.</li>
     * <li>System identifiers such as <code>$nodeid</code> use a simulated context. The preview value of <code>$nodeid</code> is <code>0</code>, which does not represent an actual task.</li>
     * <li>The parsing result for each cycle is indicated by <code>Success</code>. If the parsing is successful, <code>Parameters</code> is returned. If the parsing fails, <code>ErrorMessage</code> is returned, and partial parsing results for the cycle are not returned.</li>
     * </ul>
     * 
     * @param request the request parameters of PreviewTaskParameters  PreviewTaskParametersRequest
     * @return PreviewTaskParametersResponse
     */
    CompletableFuture<PreviewTaskParametersResponse> previewTaskParameters(PreviewTaskParametersRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation sends a user prompt to a specified session ID and accepts the agent response as Server-Sent Events (SSE) streams.</li>
     * <li>The response may include message chunks, thinking procedures, and tool invocation status updates.</li>
     * <li>If the specified session does not exist, a 400 error is returned in an SSE error frame.</li>
     * <li>The <code>stopReason</code> field indicates the reason why the agent stopped the current conversation turn.</li>
     * <li>This operation supports multiple types of content blocks as prompt input, such as text and OSS file download links.</li>
     * <li>You can optionally provide additional metadata in <code>Meta</code> to pass more context to the server.</li>
     * <li>The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com">https://agentclientprotocol.com</a>.</li>
     * <li><strong>Before you use this API operation, make sure that you fully understand the billing methods and pricing of Data Agent</strong>: <a href="https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing">https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing</a></li>
     * </ul>
     * <h2>Long-running tasks and timeout recovery</h2>
     * <p>For long-running tasks that may exceed the single-request timeout, after the GetAgentSessionEvents canary release is enabled for the current account and target region, first establish an Events subscription and then call PromptAgentSession to read both streams in parallel. Use Events to display real-time progress, and use the Prompt stream to read the final state and business errors of the current turn. Each message is displayed only once.
     * If the Prompt stream times out or disconnects before the final business state is received, the result of the current turn is unknown. Continue to observe Events, and call LoadAgentSession when you need to verify the session history. Do not automatically resend the prompt.</p>
     * 
     * @param request the request parameters of PromptAgentSession  PromptAgentSessionRequest
     * @return PromptAgentSessionResponse
     */
    CompletableFuture<PromptAgentSessionResponse> promptAgentSession(PromptAgentSessionRequest request);

    ResponseIterable<PromptAgentSessionResponseBody> promptAgentSessionWithResponseIterable(PromptAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or later to use this operation.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of PublishImage  PublishImageRequest
     * @return PublishImageResponse
     */
    CompletableFuture<PublishImageResponse> publishImage(PublishImageRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher version to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of RemoveEntityFromMetaCollection  RemoveEntityFromMetaCollectionRequest
     * @return RemoveEntityFromMetaCollectionResponse
     */
    CompletableFuture<RemoveEntityFromMetaCollectionResponse> removeEntityFromMetaCollection(RemoveEntityFromMetaCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>Removes an administrator. Only the owner or an administrator of the knowledge base can perform this operation. The caller and tenant are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of RemoveKnowledgeBaseAdministrator  RemoveKnowledgeBaseAdministratorRequest
     * @return RemoveKnowledgeBaseAdministratorResponse
     */
    CompletableFuture<RemoveKnowledgeBaseAdministratorResponse> removeKnowledgeBaseAdministrator(RemoveKnowledgeBaseAdministratorRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this operation.</p>
     * 
     * @param request the request parameters of RemoveTaskInstanceDependencies  RemoveTaskInstanceDependenciesRequest
     * @return RemoveTaskInstanceDependenciesResponse
     */
    CompletableFuture<RemoveTaskInstanceDependenciesResponse> removeTaskInstanceDependencies(RemoveTaskInstanceDependenciesRequest request);

    /**
     * @param request the request parameters of RenameFunction  RenameFunctionRequest
     * @return RenameFunctionResponse
     */
    CompletableFuture<RenameFunctionResponse> renameFunction(RenameFunctionRequest request);

    /**
     * @param request the request parameters of RenameNode  RenameNodeRequest
     * @return RenameNodeResponse
     */
    CompletableFuture<RenameNodeResponse> renameNode(RenameNodeRequest request);

    /**
     * @param request the request parameters of RenameResource  RenameResourceRequest
     * @return RenameResourceResponse
     */
    CompletableFuture<RenameResourceResponse> renameResource(RenameResourceRequest request);

    /**
     * @param request the request parameters of RenameWorkflowDefinition  RenameWorkflowDefinitionRequest
     * @return RenameWorkflowDefinitionResponse
     */
    CompletableFuture<RenameWorkflowDefinitionResponse> renameWorkflowDefinition(RenameWorkflowDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>Replies to a permission_request issued by the DataAgent daemon. Supports submitting answers to ask_user_question or canceling the current interaction. The PermissionRequestId must be obtained from params.data.requestId in the _qwen/notify event (params.kind=permission_request) of the original PromptAgentSession SSE. The reply only returns whether it is accepted. Subsequent execution events are still returned through the original PromptAgentSession SSE. Do not repeatedly submit the same round of prompt.</p>
     * 
     * @param request the request parameters of ReplyAgentSession  ReplyAgentSessionRequest
     * @return ReplyAgentSessionResponse
     */
    CompletableFuture<ReplyAgentSessionResponse> replyAgentSession(ReplyAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Requires DataWorks Basic Edition or higher.</p>
     * 
     * @param request the request parameters of RerunTaskInstances  RerunTaskInstancesRequest
     * @return RerunTaskInstancesResponse
     */
    CompletableFuture<RerunTaskInstancesResponse> rerunTaskInstances(RerunTaskInstancesRequest request);

    /**
     * @param request the request parameters of RerunWorkflowInstances  RerunWorkflowInstancesRequest
     * @return RerunWorkflowInstancesResponse
     */
    CompletableFuture<RerunWorkflowInstancesResponse> rerunWorkflowInstances(RerunWorkflowInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or later is required.</p>
     * 
     * @param request the request parameters of ResumeTaskInstances  ResumeTaskInstancesRequest
     * @return ResumeTaskInstancesResponse
     */
    CompletableFuture<ResumeTaskInstancesResponse> resumeTaskInstances(ResumeTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Searches one or more knowledge bases that the caller is authorized to access and returns knowledge point summaries, relationship paths, and candidates for ambiguous references.</p>
     * 
     * @param request the request parameters of RetrieveKnowledgePoints  RetrieveKnowledgePointsRequest
     * @return RetrieveKnowledgePointsResponse
     */
    CompletableFuture<RetrieveKnowledgePointsResponse> retrieveKnowledgePoints(RetrieveKnowledgePointsRequest request);

    /**
     * <b>description</b> :
     * <p>Retries a knowledge base build task instance. The tenant and caller identity are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of RetryKnowledgeBaseBuildTaskInstance  RetryKnowledgeBaseBuildTaskInstanceRequest
     * @return RetryKnowledgeBaseBuildTaskInstanceResponse
     */
    CompletableFuture<RetryKnowledgeBaseBuildTaskInstanceResponse> retryKnowledgeBaseBuildTaskInstance(RetryKnowledgeBaseBuildTaskInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Revokes user retrieval permissions. Only the knowledge base owner or administrator can perform this operation. The caller and tenant are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of RevokeKnowledgeBaseRetrieval  RevokeKnowledgeBaseRetrievalRequest
     * @return RevokeKnowledgeBaseRetrievalResponse
     */
    CompletableFuture<RevokeKnowledgeBaseRetrievalResponse> revokeKnowledgeBaseRetrieval(RevokeKnowledgeBaseRetrievalRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required to use this operation.</p>
     * 
     * @param request the request parameters of RevokeMemberProjectRoles  RevokeMemberProjectRolesRequest
     * @return RevokeMemberProjectRolesResponse
     */
    CompletableFuture<RevokeMemberProjectRolesResponse> revokeMemberProjectRoles(RevokeMemberProjectRolesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li><strong>Before you call this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks is created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of RollbackImage  RollbackImageRequest
     * @return RollbackImageResponse
     */
    CompletableFuture<RollbackImageResponse> rollbackImage(RollbackImageRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks Professional Edition or a later version.</p>
     * 
     * @param request the request parameters of RollbackParameter  RollbackParameterRequest
     * @return RollbackParameterResponse
     */
    CompletableFuture<RollbackParameterResponse> rollbackParameter(RollbackParameterRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Submits a run request for a specified metadata crawler.</p>
     * <h2>Recommended process</h2>
     * <ol>
     * <li>Call <code>ListCrawlers</code> to query the IDs of available crawlers.</li>
     * <li>Call this operation to submit a run request.</li>
     * <li>Call <code>ListCrawlerRuns</code> to query the final run status.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or higher is required.</p>
     * <h2>Billing description</h2>
     * <p>Running a collection task consumes compute resources and may incur fees. The actual fees depend on the resource group used and the DataWorks billing rules.
     * If the crawler has the AI metadata description feature enabled (<code>EnableAiComment=true</code>), collecting metadata and generating AI descriptions consumes tokens. For information about the complimentary token quota and billing rules after the quota is exceeded, see <a href="https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing">Data Agent billing</a>.</p>
     * <h2>Precautions</h2>
     * <p>A successful response only indicates that the run request has been accepted. It does not indicate that the collection task is complete.</p>
     * 
     * @param request the request parameters of RunCrawler  RunCrawlerRequest
     * @return RunCrawlerResponse
     */
    CompletableFuture<RunCrawlerResponse> runCrawler(RunCrawlerRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of RunImageTest  RunImageTestRequest
     * @return RunImageTestResponse
     */
    CompletableFuture<RunImageTestResponse> runImageTest(RunImageTestRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Loads a saved semantic job definition by <code>Name</code> and submits a new analysis run to the executor. This operation does not accept runtime overrides for <code>Source</code>, resource groups, or reference files. The execution always uses the configuration saved by <code>CreateSemanticJob</code>.</p>
     * <h2>Pre-execution validation</h2>
     * <p>The service validates the existence and access permissions of the job, and re-validates whether the associated files still exist. For files associated through <code>ReferenceFileIds</code>, the service resolves them into temporary addresses readable by the current run before submission. If a file is deleted after upload or an invalid file ID is specified, the submission fails.</p>
     * <h2>Response and What to do next</h2>
     * <p><code>Data.JobRunId</code> is the identity of the current semantics job run and is used by <code>DownloadSemanticResults</code> to download the exact output of this run. <code>Data.ExecutorJobId</code> is the identity of the executor job and is used by <code>GetSemanticJobDetail</code>, <code>GetSemanticJobLog</code>, and <code>KillSemanticJob</code>. A successful response indicates that the executor has accepted the submission, not that the model analysis or result files are complete.</p>
     * <h2>Billing</h2>
     * <p><strong>Before using this operation, make sure that you fully understand the billing method and pricing of the <a href="https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing">model calls</a> used by semantic construction.</strong></p>
     * 
     * @param request the request parameters of RunSemanticJob  RunSemanticJobRequest
     * @return RunSemanticJobResponse
     */
    CompletableFuture<RunSemanticJobResponse> runSemanticJob(RunSemanticJobRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this operation.</p>
     * 
     * @param request the request parameters of SetSuccessTaskInstances  SetSuccessTaskInstancesRequest
     * @return SetSuccessTaskInstancesResponse
     */
    CompletableFuture<SetSuccessTaskInstancesResponse> setSuccessTaskInstances(SetSuccessTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of StartDIJob  StartDIJobRequest
     * @return StartDIJobResponse
     */
    CompletableFuture<StartDIJobResponse> startDIJob(StartDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>Starts a specified personal development environment (ServerIDE) instance and returns the instance ID.</p>
     * 
     * @param request the request parameters of StartServerIdeInstance  StartServerIdeInstanceRequest
     * @return StartServerIdeInstanceResponse
     */
    CompletableFuture<StartServerIdeInstanceResponse> startServerIdeInstance(StartServerIdeInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this operation.</p>
     * 
     * @param request the request parameters of StartWorkflowInstances  StartWorkflowInstancesRequest
     * @return StartWorkflowInstancesResponse
     */
    CompletableFuture<StartWorkflowInstancesResponse> startWorkflowInstances(StartWorkflowInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Stops the currently running task of a specified metadata crawler.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call <code>ListCrawlerRuns</code> to confirm that the crawler has a running task.</li>
     * <li>Call this operation to submit a stop request.</li>
     * <li>Call <code>ListCrawlerRuns</code> again to confirm the final run status.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * <h2>Precautions</h2>
     * <p>The call fails if the crawler has no running task. A successful response only indicates that the stop request has been accepted.</p>
     * 
     * @param request the request parameters of StopCrawler  StopCrawlerRequest
     * @return StopCrawlerResponse
     */
    CompletableFuture<StopCrawlerResponse> stopCrawler(StopCrawlerRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of StopDIJob  StopDIJobRequest
     * @return StopDIJobResponse
     */
    CompletableFuture<StopDIJobResponse> stopDIJob(StopDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>Stops a knowledge base build task instance. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of StopKnowledgeBaseBuildTaskInstance  StopKnowledgeBaseBuildTaskInstanceRequest
     * @return StopKnowledgeBaseBuildTaskInstanceResponse
     */
    CompletableFuture<StopKnowledgeBaseBuildTaskInstanceResponse> stopKnowledgeBaseBuildTaskInstance(StopKnowledgeBaseBuildTaskInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Requesters can use this operation to withdraw an approval process they initiated.</li>
     * <li>Only the initiator of the approval process can call this operation.</li>
     * <li>After a successful call, the operation terminates the approval process and updates its status to withdrawn.</li>
     * </ul>
     * 
     * @param request the request parameters of StopProcessInstance  StopProcessInstanceRequest
     * @return StopProcessInstanceResponse
     */
    CompletableFuture<StopProcessInstanceResponse> stopProcessInstance(StopProcessInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Stops a specified personal development environment (ServerIDE) instance and returns the instance ID.</p>
     * 
     * @param request the request parameters of StopServerIdeInstance  StopServerIdeInstanceRequest
     * @return StopServerIdeInstanceResponse
     */
    CompletableFuture<StopServerIdeInstanceResponse> stopServerIdeInstance(StopServerIdeInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or higher to use this operation.
     * Instance termination mechanism and precautions:</p>
     * <ol>
     * <li>Instance termination is an asynchronous operation. Sending a termination request does not mean that the instance stops immediately. Continue to query the instance status after the request to confirm the termination result. If external compute resources are involved, you must also verify the actual status of the remote job.</li>
     * <li>The DataWorks instance status may not be consistent with the remote job status. For tasks that rely on external compute resources (such as MaxCompute, EMR, and SSH), DataWorks sends a termination request to the remote end through a client. Due to network exceptions, client compatibility, and other factors, the DataWorks instance may be marked as failed while the remote job is still running. Therefore, you cannot determine that the remote job has terminated based only on the DataWorks instance status. Go to the corresponding computing platform to check the status and manually terminate the job if necessary to prevent the job from continuing to run or consuming additional resources.</li>
     * <li>Pay special attention to MaxCompute tasks that run in public scheduling resource groups. DataWorks public scheduling resource groups will be taken offline soon. Due to component version and compatibility limitations, the termination commands for some MaxCompute tasks may not take effect on the remote end. In this case, go to MaxCompute to query the actual status of the corresponding instance. If it is still running, execute the kill operation in MaxCompute and confirm again that it has terminated.</li>
     * </ol>
     * 
     * @param request the request parameters of StopTaskInstances  StopTaskInstancesRequest
     * @return StopTaskInstancesResponse
     */
    CompletableFuture<StopTaskInstancesResponse> stopTaskInstances(StopTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or higher to use this feature.</p>
     * 
     * @param request the request parameters of StopWorkflowInstances  StopWorkflowInstancesRequest
     * @return StopWorkflowInstancesResponse
     */
    CompletableFuture<StopWorkflowInstancesResponse> stopWorkflowInstances(StopWorkflowInstancesRequest request);

    /**
     * @param request the request parameters of SubmitBatchChangeTableOwner  SubmitBatchChangeTableOwnerRequest
     * @return SubmitBatchChangeTableOwnerResponse
     */
    CompletableFuture<SubmitBatchChangeTableOwnerResponse> submitBatchChangeTableOwner(SubmitBatchChangeTableOwnerRequest request);

    /**
     * @param request the request parameters of SubmitFile  SubmitFileRequest
     * @return SubmitFileResponse
     */
    CompletableFuture<SubmitFileResponse> submitFile(SubmitFileRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or higher to use this operation.</p>
     * 
     * @param request the request parameters of SuspendTaskInstances  SuspendTaskInstancesRequest
     * @return SuspendTaskInstancesResponse
     */
    CompletableFuture<SuspendTaskInstancesResponse> suspendTaskInstances(SuspendTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or higher to use this operation.</p>
     * 
     * @param request the request parameters of TagDataAssets  TagDataAssetsRequest
     * @return TagDataAssetsResponse
     */
    CompletableFuture<TagDataAssetsResponse> tagDataAssets(TagDataAssetsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks project space:&lt;br&gt;
     *  Tenant Owner, Workspace Administrator, Deployer, Developer, Project Owner, or Operator.</li>
     * </ol>
     * 
     * @param request the request parameters of TestDataSourceConnectivity  TestDataSourceConnectivityRequest
     * @return TestDataSourceConnectivityResponse
     */
    CompletableFuture<TestDataSourceConnectivityResponse> testDataSourceConnectivity(TestDataSourceConnectivityRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of TriggerSchedulerTaskInstance  TriggerSchedulerTaskInstanceRequest
     * @return TriggerSchedulerTaskInstanceResponse
     */
    CompletableFuture<TriggerSchedulerTaskInstanceResponse> triggerSchedulerTaskInstance(TriggerSchedulerTaskInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or a later edition to use this operation.</p>
     * 
     * @param request the request parameters of UnTagDataAssets  UnTagDataAssetsRequest
     * @return UnTagDataAssetsResponse
     */
    CompletableFuture<UnTagDataAssetsResponse> unTagDataAssets(UnTagDataAssetsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only when the canary release feature is enabled. Before calling this operation, ensure that the canary release feature is enabled for the current account and the target region.
     * Updates a custom agent that the current identity has administrative permissions for. The Name parameter is used to locate the target agent and is not used for renaming. Call GetAgent first to read the current AgentVersion, and explicitly pass ExpectedVersion during the update. If a conflict occurs, re-read the version and verify the differences instead of blindly overwriting.
     * Omit reference lists that do not need to be modified. The current new backend retains existing references for empty arrays of Tools, Skills, and CallableAgents, but clears references for an empty array of ExpertSuites. A unified empty array clearing rule cannot be used. Tools already includes Kind and the corresponding tool configurations, using the same structure as CreateAgent. Specifying only Name is not a valid tool configuration.
     * For official skills, specify only Source=OFFICIAL and SkillId. For official suites, specify only Source=OFFICIAL and SuiteId, without mixing in name, version, or artifact fields. The integer Version and VersionSelector for custom resources are mutually exclusive. The version selection capability depends on the deployment of the target server.
     * If PublishImmediately is omitted or set to false, only the definition is saved. If it is set to true, a new draft version is saved before requesting publication. Saving and publishing are not atomic operations. If publishing fails, the draft version may have already been incremented. In this case, call GetAgent to read the current version before deciding whether to retry, to avoid generating duplicate versions.</p>
     * 
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the title of an agent session accessible by the current identity without changing the task execution status.</p>
     * 
     * @param request the request parameters of UpdateAgentSessionTitle  UpdateAgentSessionTitleRequest
     * @return UpdateAgentSessionTitleResponse
     */
    CompletableFuture<UpdateAgentSessionTitleResponse> updateAgentSessionTitle(UpdateAgentSessionTitleRequest request);

    /**
     * @param request the request parameters of UpdateAlertRule  UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     */
    CompletableFuture<UpdateAlertRuleResponse> updateAlertRule(UpdateAlertRuleRequest request);

    /**
     * @param request the request parameters of UpdateBusiness  UpdateBusinessRequest
     * @return UpdateBusinessResponse
     */
    CompletableFuture<UpdateBusinessResponse> updateBusiness(UpdateBusinessRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition to use this feature.
     * The calendar name cannot be modified. Unsubmitted dates are not retained.</p>
     * 
     * @param request the request parameters of UpdateCalendar  UpdateCalendarRequest
     * @return UpdateCalendarResponse
     */
    CompletableFuture<UpdateCalendarResponse> updateCalendar(UpdateCalendarRequest request);

    /**
     * @param request the request parameters of UpdateCodeReview  UpdateCodeReviewRequest
     * @return UpdateCodeReviewResponse
     */
    CompletableFuture<UpdateCodeReviewResponse> updateCodeReview(UpdateCodeReviewRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires DataWorks Basic Edition or a later version.</li>
     * <li>This operation supports only MaxCompute, hms, and dlf tables.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateColumnBusinessMetadata  UpdateColumnBusinessMetadataRequest
     * @return UpdateColumnBusinessMetadataResponse
     */
    CompletableFuture<UpdateColumnBusinessMetadataResponse> updateColumnBusinessMetadata(UpdateColumnBusinessMetadataRequest request);

    /**
     * <b>description</b> :
     * <p>This API is currently in trial. To use this API, submit an application. After the administrator adds you to the trial list, you can call this API.</p>
     * 
     * @param request the request parameters of UpdateComponent  UpdateComponentRequest
     * @return UpdateComponentResponse
     */
    CompletableFuture<UpdateComponentResponse> updateComponent(UpdateComponentRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or later is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace: tenant owner, tenant administrator, workspace administrator, project owner, or O&amp;M engineer.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateComputeResource  UpdateComputeResourceRequest
     * @return UpdateComputeResourceResponse
     */
    CompletableFuture<UpdateComputeResourceResponse> updateComputeResource(UpdateComputeResourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * <li>Tenant owner, tenant administrator, workspace administrator, project owner, or O&amp;M engineer.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateComputeResourceAuthUserMappings  UpdateComputeResourceAuthUserMappingsRequest
     * @return UpdateComputeResourceAuthUserMappingsResponse
     */
    CompletableFuture<UpdateComputeResourceAuthUserMappingsResponse> updateComputeResourceAuthUserMappings(UpdateComputeResourceAuthUserMappingsRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Partially updates the resource group, collection scope, scheduling, AI metadata description, or extension configurations of a specified metadata crawler.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call <code>GetCrawler</code> to query the current configurations.</li>
     * <li>Call <code>GetCrawlerTypeCapabilities</code> to check the configuration capabilities supported by the crawler type.</li>
     * <li>Call this operation with only the fields that you want to update.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * <h2>Precautions</h2>
     * <p>At least one updatable field must be provided. Fields that are not provided remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateCrawler  UpdateCrawlerRequest
     * @return UpdateCrawlerResponse
     */
    CompletableFuture<UpdateCrawlerResponse> updateCrawler(UpdateCrawlerRequest request);

    /**
     * @param request the request parameters of UpdateCustomAttribute  UpdateCustomAttributeRequest
     * @return UpdateCustomAttributeResponse
     */
    CompletableFuture<UpdateCustomAttributeResponse> updateCustomAttribute(UpdateCustomAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of UpdateDIAlarmRule  UpdateDIAlarmRuleRequest
     * @return UpdateDIAlarmRuleResponse
     */
    CompletableFuture<UpdateDIAlarmRuleResponse> updateDIAlarmRule(UpdateDIAlarmRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This feature requires DataWorks Basic Edition or higher.</p>
     * 
     * @param request the request parameters of UpdateDIJob  UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    CompletableFuture<UpdateDIJobResponse> updateDIJob(UpdateDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or a later edition to use this feature.</p>
     * 
     * @param request the request parameters of UpdateDataAssetTag  UpdateDataAssetTagRequest
     * @return UpdateDataAssetTagResponse
     */
    CompletableFuture<UpdateDataAssetTagResponse> updateDataAssetTag(UpdateDataAssetTagRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or later is required.</p>
     * 
     * @param request the request parameters of UpdateDataQualityAlertRule  UpdateDataQualityAlertRuleRequest
     * @return UpdateDataQualityAlertRuleResponse
     */
    CompletableFuture<UpdateDataQualityAlertRuleResponse> updateDataQualityAlertRule(UpdateDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI UpdateDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or later to use this feature.
     * 
     * @param request the request parameters of UpdateDataQualityEvaluationTask  UpdateDataQualityEvaluationTaskRequest
     * @return UpdateDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<UpdateDataQualityEvaluationTaskResponse> updateDataQualityEvaluationTask(UpdateDataQualityEvaluationTaskRequest request);

    /**
     * @deprecated OpenAPI UpdateDataQualityRule is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a later edition to use this operation.
     * 
     * @param request the request parameters of UpdateDataQualityRule  UpdateDataQualityRuleRequest
     * @return UpdateDataQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<UpdateDataQualityRuleResponse> updateDataQualityRule(UpdateDataQualityRuleRequest request);

    /**
     * @deprecated OpenAPI UpdateDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityTemplate instead.  * @description You can call this operation only after you purchase DataWorks Basic Edition or a higher edition.
     * 
     * @param request the request parameters of UpdateDataQualityRuleTemplate  UpdateDataQualityRuleTemplateRequest
     * @return UpdateDataQualityRuleTemplateResponse
     */
    @Deprecated
    CompletableFuture<UpdateDataQualityRuleTemplateResponse> updateDataQualityRuleTemplate(UpdateDataQualityRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of UpdateDataQualityScan  UpdateDataQualityScanRequest
     * @return UpdateDataQualityScanResponse
     */
    CompletableFuture<UpdateDataQualityScanResponse> updateDataQualityScan(UpdateDataQualityScanRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of UpdateDataQualityTemplate  UpdateDataQualityTemplateRequest
     * @return UpdateDataQualityTemplateResponse
     */
    CompletableFuture<UpdateDataQualityTemplateResponse> updateDataQualityTemplate(UpdateDataQualityTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or later is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, Project Owner, or O&amp;M Engineer.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request);

    /**
     * @param request the request parameters of UpdateDatasetVersion  UpdateDatasetVersionRequest
     * @return UpdateDatasetVersionResponse
     */
    CompletableFuture<UpdateDatasetVersionResponse> updateDatasetVersion(UpdateDatasetVersionRequest request);

    /**
     * @param request the request parameters of UpdateFile  UpdateFileRequest
     * @return UpdateFileResponse
     */
    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    /**
     * @param request the request parameters of UpdateFolder  UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    /**
     * @param request the request parameters of UpdateFunction  UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    /**
     * @param request the request parameters of UpdateIDEEventResult  UpdateIDEEventResultRequest
     * @return UpdateIDEEventResultResponse
     */
    CompletableFuture<UpdateIDEEventResultResponse> updateIDEEventResult(UpdateIDEEventResultRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or higher is required.</li>
     * <li><strong>Ensure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of UpdateImage  UpdateImageRequest
     * @return UpdateImageResponse
     */
    CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a knowledge base. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of UpdateKnowledgeBase  UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    CompletableFuture<UpdateKnowledgeBaseResponse> updateKnowledgeBase(UpdateKnowledgeBaseRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a knowledge base build task. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of UpdateKnowledgeBaseBuildTask  UpdateKnowledgeBaseBuildTaskRequest
     * @return UpdateKnowledgeBaseBuildTaskResponse
     */
    CompletableFuture<UpdateKnowledgeBaseBuildTaskResponse> updateKnowledgeBaseBuildTask(UpdateKnowledgeBaseBuildTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a knowledge object. The tenant and caller identities are determined by the POP authentication context.</p>
     * 
     * @param request the request parameters of UpdateKnowledgeObject  UpdateKnowledgeObjectRequest
     * @return UpdateKnowledgeObjectResponse
     */
    CompletableFuture<UpdateKnowledgeObjectResponse> updateKnowledgeObject(UpdateKnowledgeObjectRequest request);

    /**
     * <b>description</b> :
     * <p>Manages knowledge sources in a knowledge base. The identity is determined by the POP context, and credentials are not returned in the response.</p>
     * 
     * @param request the request parameters of UpdateKnowledgeSource  UpdateKnowledgeSourceRequest
     * @return UpdateKnowledgeSourceResponse
     */
    CompletableFuture<UpdateKnowledgeSourceResponse> updateKnowledgeSource(UpdateKnowledgeSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Updates the configurations of a specified MCP server, including the service URL, transport protocol, custom request headers, and visibility settings. Fields that are not specified remain unchanged.
     * <strong>Note</strong>: When you modify the <code>Visibility</code> parameter, specify <code>ProjectIds</code> or <code>UserIds</code> in <code>VisibilityScope</code> based on the visibility setting to ensure that the correct access control scope is applied.</p>
     * 
     * @param request the request parameters of UpdateMcpServer  UpdateMcpServerRequest
     * @return UpdateMcpServerResponse
     */
    CompletableFuture<UpdateMcpServerResponse> updateMcpServer(UpdateMcpServerRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateMetaCollection  UpdateMetaCollectionRequest
     * @return UpdateMetaCollectionResponse
     */
    CompletableFuture<UpdateMetaCollectionResponse> updateMetaCollection(UpdateMetaCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Professional Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of UpdateMetaEntity  UpdateMetaEntityRequest
     * @return UpdateMetaEntityResponse
     */
    CompletableFuture<UpdateMetaEntityResponse> updateMetaEntity(UpdateMetaEntityRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of UpdateMetaEntityDef  UpdateMetaEntityDefRequest
     * @return UpdateMetaEntityDefResponse
     */
    CompletableFuture<UpdateMetaEntityDefResponse> updateMetaEntityDef(UpdateMetaEntityDefRequest request);

    /**
     * @param request the request parameters of UpdateNode  UpdateNodeRequest
     * @return UpdateNodeResponse
     */
    CompletableFuture<UpdateNodeResponse> updateNode(UpdateNodeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks Professional Edition and later.</p>
     * 
     * @param request the request parameters of UpdateParameter  UpdateParameterRequest
     * @return UpdateParameterResponse
     */
    CompletableFuture<UpdateParameterResponse> updateParameter(UpdateParameterRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows you to modify an existing approval process definition, including the name, description, rule conditions, notification services, and approval nodes.</li>
     * <li><code>Id</code> is a required parameter used to specify the approval process definition to be updated.</li>
     * <li>To overwrite the existing configuration, set the <code>Overwrite</code> parameter to <code>true</code>.</li>
     * <li><code>ClientToken</code> is optional and used to ensure the idempotency of the request.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateProcessDefinition  UpdateProcessDefinitionRequest
     * @return UpdateProcessDefinitionResponse
     */
    CompletableFuture<UpdateProcessDefinitionResponse> updateProcessDefinition(UpdateProcessDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>This feature requires DataWorks Basic Edition or a later version.</p>
     * 
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    /**
     * @param request the request parameters of UpdateProjectRole  UpdateProjectRoleRequest
     * @return UpdateProjectRoleResponse
     */
    CompletableFuture<UpdateProjectRoleResponse> updateProjectRole(UpdateProjectRoleRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</p>
     * 
     * @param request the request parameters of UpdateResourceGroup  UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of UpdateRoute  UpdateRouteRequest
     * @return UpdateRouteResponse
     */
    CompletableFuture<UpdateRouteResponse> updateRoute(UpdateRouteRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage</h2>
     * <ul>
     * <li>Use this API to update a specified security policy, including its name, description, associated workspace IDs, and policy content.</li>
     * <li>You cannot modify some properties of default system policies, such as the schema name and control module.</li>
     * <li>When <code>ControlDwScope</code> is set to <code>Workspace</code>, use the <code>Workspaces</code> parameter to associate the policy with specific workspaces.</li>
     * <li>When updating the policy content (<code>Content</code>), ensure that the provided controllers (<code>Controllers</code>) conform to the requirements of the selected schema.</li>
     * <li>The optional <code>ClientToken</code> parameter ensures request idempotence.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSecurityStrategy  UpdateSecurityStrategyRequest
     * @return UpdateSecurityStrategyResponse
     */
    CompletableFuture<UpdateSecurityStrategyResponse> updateSecurityStrategy(UpdateSecurityStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified personal development environment (ServerIDE) instance. You can modify the CU, image, instance name, VPC, dataset, and credential configurations. If the CU and image parameters are not specified, the existing instance configurations are retained.</p>
     * 
     * @param request the request parameters of UpdateServerIdeInstance  UpdateServerIdeInstanceRequest
     * @return UpdateServerIdeInstanceResponse
     */
    CompletableFuture<UpdateServerIdeInstanceResponse> updateServerIdeInstance(UpdateServerIdeInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to update an existing Skill and create a new version based on the current highest version or a specified version. Fields not provided in the request retain their original values. You can update the Skill content by providing either <code>SkillMdOverride</code> or <code>BundleUrl</code>. You can also set additional information such as the visibility scope.</p>
     * 
     * @param request the request parameters of UpdateSkill  UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    CompletableFuture<UpdateSkillResponse> updateSkill(UpdateSkillRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateTableBusinessMetadata  UpdateTableBusinessMetadataRequest
     * @return UpdateTableBusinessMetadataResponse
     */
    CompletableFuture<UpdateTableBusinessMetadataResponse> updateTableBusinessMetadata(UpdateTableBusinessMetadataRequest request);

    /**
     * @param request the request parameters of UpdateTask  UpdateTaskRequest
     * @return UpdateTaskResponse
     */
    CompletableFuture<UpdateTaskResponse> updateTask(UpdateTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation is asynchronous. You must call the <code>GetUpdateTaskResult</code> operation to poll the update result.</li>
     * <li>This API operation is used to update the information of a specified node, including but not limited to the node name, description, and owner.</li>
     * <li>The modifications are synced to Data Studio, and a new saved version is generated in Data Studio.</li>
     * <li>You can set detailed parameters such as the trigger mode, runtime environment configuration, and dependencies of the node.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTaskAsync  UpdateTaskAsyncRequest
     * @return UpdateTaskAsyncResponse
     */
    CompletableFuture<UpdateTaskAsyncResponse> updateTaskAsync(UpdateTaskAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this operation.</p>
     * 
     * @param request the request parameters of UpdateTaskInstances  UpdateTaskInstancesRequest
     * @return UpdateTaskInstancesResponse
     */
    CompletableFuture<UpdateTaskInstancesResponse> updateTaskInstances(UpdateTaskInstancesRequest request);

    /**
     * @param request the request parameters of UpdateUdfFile  UpdateUdfFileRequest
     * @return UpdateUdfFileResponse
     */
    CompletableFuture<UpdateUdfFileResponse> updateUdfFile(UpdateUdfFileRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or later to use this operation.</p>
     * 
     * @param request the request parameters of UpdateWorkflow  UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    CompletableFuture<UpdateWorkflowResponse> updateWorkflow(UpdateWorkflowRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This API does not support batch operations. If you define more than one workflow definition in the FlowSpec, all workflow definitions except the first one are ignored. In addition, nodes defined within the workflow definition are also ignored. Call the UpdateNode API to update internal nodes one by one.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateWorkflowDefinition  UpdateWorkflowDefinitionRequest
     * @return UpdateWorkflowDefinitionResponse
     */
    CompletableFuture<UpdateWorkflowDefinitionResponse> updateWorkflowDefinition(UpdateWorkflowDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only when the canary release feature is enabled. Before calling this operation, ensure that the canary release feature is enabled for the current account and the target region.
     * Uploads a local file to an agent session that the current caller has access to, and references the file in the conversation. The size of a single file ranges from 1 byte to 10,485,760 bytes (10 MiB). The caller must have access permissions to the target session and the dataworks:UploadAgentSessionFile permission.
     * Call sequence.</p>
     * <ol>
     * <li>Use the SessionId of an existing session, set UploadMode to prepare, and pass the original file name, the byte count Size, and the 32-character lowercase hexadecimal ContentMd5 of the original bytes. The prepare step returns UploadId and Signature, issuing only the upload URL without starting a cold session instance.</li>
     * <li>Within the validity period of the signature, send an HTTP PUT request to Signature.Url with the original file bytes as the request body, using all the request headers returned in Signature.Headers. The URL and request headers must be used exactly as provided. The ContentMd5 parameter is in hexadecimal format, while the Content-MD5 signature header is Base64-encoded. The two are not interchangeable. The signature is valid for 5 minutes. For the exact expiration time, see ExpiresAt.</li>
     * <li>After the PUT request succeeds, set UploadMode to complete, pass the UploadId returned by prepare, and keep SessionId, Name, Size, and ContentMd5 consistent. The server resumes the session, and the runtime within the instance downloads the staged object, verifies the size and MD5, writes it to the working directory, and returns Id, Name, RelativePath, and Size. Repeated complete calls use the same UploadId. The same attachment receipt is returned only when the existing file content is identical.</li>
     * <li>Call PromptAgentSession, add a content block with Type set to resource_link, Name set to the original file name, and Uri set to dataagent-attachment: followed by RelativePath in Params.Prompt, and send it along with the text content block. The backend resolves the reference to the working directory of the session based on the current authenticated session.
     * For the sample file sample.csv, the original bytes are hello followed by a line feed, Size is 6, and ContentMd5 is b1946ac92492d2347c6235b4d2611184. The SessionId example session and the upload identifier examples are used only to illustrate the parameter structure. Actual calls must use a created session and the values returned by prepare. The Signature.Url example is used only to illustrate the format. The actual PUT request must use the complete signed URL returned by the current prepare call.
     * Error handling.
     * You must check the outer POP/BFF failures, JsonRpcResponse.Error, and the expected result fields simultaneously. Missing upload stages or size limit exceedances may result in an HTTP 400 response from the gateway, such as MissingUploadMode or InvalidSize. Business rejections such as object not found or metadata mismatch return an HTTP 400 response with a general Code 400 in the public POP, and the Message retains the actual business code, such as SESSION_ATTACHMENT_OBJECT_MISMATCH. Dependency failures, HTTP 5xx errors, timeouts, and unknown execution results must not be treated as parameter rejections or successful uploads, and automatic write retries must not be performed. When the result is unknown, retain the original upload metadata and UploadId, and verify the result first.
     * This API operation does not accept ContentBase64. Signature expiration only invalidates the upload authorization and does not indicate that the staged object has been deleted. This description does not guarantee an automatic cleanup cycle for the object.</li>
     * </ol>
     * 
     * @param request the request parameters of UploadAgentSessionFile  UploadAgentSessionFileRequest
     * @return UploadAgentSessionFileResponse
     */
    CompletableFuture<UploadAgentSessionFileResponse> uploadAgentSessionFile(UploadAgentSessionFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Requests an upload slot for a reference file to prepare a file for the <code>singleTableFile</code> source of <code>CreateSemanticJob</code>.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Pass the file name, MIME type, and actual size to this operation to obtain <code>Data.UploadUrl</code> and <code>Data.FileId</code>.</li>
     * <li>Perform an HTTP PUT upload with the same <code>Content-Type</code> before the <code>UploadUrl</code> expires.</li>
     * <li>After the upload is complete, use <code>FileId</code> as the only element of <code>CreateSemanticJob.ReferenceFileIds</code>.</li>
     * </ol>
     * <h2>Security considerations</h2>
     * <p><code>UploadUrl</code> is a short-lived pre-signed PUT URL. The holder can write to the corresponding object. Do not log, share, or persist this URL.</p>
     * 
     * @param request the request parameters of UploadSemanticFile  UploadSemanticFileRequest
     * @return UploadSemanticFileResponse
     */
    CompletableFuture<UploadSemanticFileResponse> uploadSemanticFile(UploadSemanticFileRequest request);

}
