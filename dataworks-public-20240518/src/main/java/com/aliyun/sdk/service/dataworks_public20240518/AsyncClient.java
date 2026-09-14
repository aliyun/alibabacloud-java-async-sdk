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
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Reason</strong>: The reason for the request. This parameter is required.</li>
     * <li><strong>ApplyContents</strong>: Contains multiple resource permission request entries. Each entry includes a resource description (Resource), a grantee description (Grantee), access types (AccessTypes), and a permission expiration time (ExpirationTime). A maximum of 400 entries can be submitted in a single request.</li>
     * <li><strong>Resource</strong>: The resource description. You must specify the ResourceSchema.name and version on which the resource parsing depends, as well as the resource metadata (MetaData).</li>
     * <li><strong>Grantee</strong>: The grantee description. You must specify the principal type (PrincipalType) and principal ID (PrincipalId).</li>
     * <li><strong>AccessTypes</strong>: The list of access types. Multiple access type combinations are supported.</li>
     * <li><strong>ExpirationTime</strong>: The permission expiration time, provided as a millisecond-level timestamp.</li>
     * <li><strong>AuthMethod</strong>: Optional. Specifies the authorization method. The system uses the built-in default authorization method if this parameter is not specified.</li>
     * <li><strong>ClientToken</strong>: The client token used to prevent duplicate requests. This parameter is optional.
     * Make sure that all required fields are correctly specified and meet the corresponding constraints. For example, the DefVersion and MetaData in Resource must match the selected DefSchema.</li>
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
     * <li>Tenant Owner, Storage Management Administrator, Project Owner, or O&amp;M Engineer</li>
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
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of BatchUpdateTasks  BatchUpdateTasksRequest
     * @return BatchUpdateTasksResponse
     */
    CompletableFuture<BatchUpdateTasksResponse> batchUpdateTasks(BatchUpdateTasksRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
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
     * <li>You must have purchased DataWorks Basic Edition or a higher edition.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Storage Management Administrator, Project Owner, or O&amp;M Engineer</li>
     * </ul>
     * 
     * @param request the request parameters of CloneDataSource  CloneDataSourceRequest
     * @return CloneDataSourceResponse
     */
    CompletableFuture<CloneDataSourceResponse> cloneDataSource(CloneDataSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Agent name</strong>: Must be unique within the current account.</li>
     * <li><strong>Model configuration</strong>: An optional parameter that specifies the model used by the Agent and its related settings.</li>
     * <li><strong>Visibility level</strong>: Defines who can access the Agent. The Agent can be visible within the account, to a specific project, or to specific users.</li>
     * <li><strong>Visibility scope</strong>: When you set the visibility level to <code>PROJECT</code> or <code>USER</code>, you must specify the list of project IDs or user IDs.</li>
     * <li><strong>Other parameters</strong>: Optional parameters such as display name and description. Set them as needed.</li>
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
     * <li>Use <code>_meta.agent.agentName</code> to specify the bound agent name. This parameter is required.<ul>
     * <li>dataworks_data_agent: DataWorks built-in agent — Data Agent, which provides intelligent data development AI capabilities covering the entire workflow of data integration, development, O&amp;M, governance, and analytics.</li>
     * <li>dataworks_chatbi_agent: DataWorks built-in agent — ChatBI, which uses natural language processing and intelligent analytics technologies to automate the entire analysis workflow from requirement parsing, data extraction, and automatic code generation to visualization report output through conversational interaction.</li>
     * <li>dataworks_ai_assistant_agent: DataWorks built-in agent — AI Assistant Service, which is a DataWorks enterprise-grade dedicated AI assistant built on open source frameworks such as OpenClaw and Hermes Agent.</li>
     * </ul>
     * </li>
     * <li>Use <code>_meta.config.sessionSource</code> to pass through a session source identifier for subsequent retrieval by source.</li>
     * <li>Use <code>_meta.config.sessionTags[].sessionTagCode</code> to pass in session tags.</li>
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
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If you specify multiple publish entities in the parameters, all entities except the first one are ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateComponent  CreateComponentRequest
     * @return CreateComponentResponse
     */
    CompletableFuture<CreateComponentResponse> createComponent(CreateComponentRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * You must have at least one of the following roles in the DataWorks workspace:
     * Tenant Owner, Workspace Administrator, Project Owner, or O&amp;M.</p>
     * 
     * @param request the request parameters of CreateComputeResource  CreateComputeResourceRequest
     * @return CreateComputeResourceResponse
     */
    CompletableFuture<CreateComputeResourceResponse> createComputeResource(CreateComputeResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Creates a metadata crawler for a specified data source and configures the collection scope, resource group, scheduling method, and extended configurations.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call <code>GetCrawlerTypeCapabilities</code> to query the crawler types and their configuration capabilities supported in the current region.</li>
     * <li>Create a crawler by using a data source that matches the <code>Type</code> value. Before creating a crawler, ensure that the data source and the selected resource group pass the connectivity test by calling the <code>TestDataSourceConnectivity</code> API to avoid creating an invalid crawler.</li>
     * <li>After the crawler is created, call <code>RunCrawler</code> to manually run it, or configure periodic scheduling for automatic execution.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * <h2>Precautions</h2>
     * <p>A successful creation only indicates that the crawler configuration has been generated. Metadata collection is not immediately executed.</p>
     * 
     * @param request the request parameters of CreateCrawler  CreateCrawlerRequest
     * @return CreateCrawlerResponse
     */
    CompletableFuture<CreateCrawlerResponse> createCrawler(CreateCrawlerRequest request);

    /**
     * <b>description</b> :
     * <p>Creates and persists a cross-workspace deployment flow. The ObjectIds parameter must contain exactly one top-level object ID from the source project. Child objects of composite objects such as workflows are automatically included by the system. Passing multiple objects causes parameter validation to fail. You can call ListCrossProjectDeploymentCandidates to query candidate objects, call ExecCrossProjectPipelineRun to execute the deployment after creation, and call GetCrossProjectPipelineRun to query the deployment status.</p>
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
     * <p>You must purchase DataWorks Enterprise Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of CreateDataAssetTag  CreateDataAssetTagRequest
     * @return CreateDataAssetTagResponse
     */
    CompletableFuture<CreateDataAssetTagResponse> createDataAssetTag(CreateDataAssetTagRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of CreateDataQualityAlertRule  CreateDataQualityAlertRuleRequest
     * @return CreateDataQualityAlertRuleResponse
     */
    CompletableFuture<CreateDataQualityAlertRuleResponse> createDataQualityAlertRule(CreateDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
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
     * @deprecated OpenAPI CreateDataQualityRule is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or higher to use this feature.
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
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
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
     * <li>You must have purchased DataWorks Basic Edition or a higher edition.</li>
     * <li>You must have at least one of the following roles in the DataWorks project workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Storage Management Administrator, Project Owner, or O&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation is available for all DataWorks editions.</li>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

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
     * <h2>Operation description</h2>
     * <ul>
     * <li>After submission, the system verifies the availability of the MCP Server based on the provided connection information.</li>
     * <li>If the MCP Server connection is unavailable, the operation returns the corresponding error message.</li>
     * <li>The Name field must start with a lowercase letter and can contain only lowercase letters, digits, underscores (_), and hyphens (-). The name must be unique within the current account.</li>
     * <li>The Visibility field defines the visibility level of the MCP Server. Valid values: <code>TENANT</code> (visible within the account), <code>PROJECT</code> (visible to specified projects), and <code>USER</code> (visible to specified users). Depending on the selected value, provide the corresponding <code>VisibilityScope</code> parameter to further specify the visibility scope.</li>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This operation requires DataWorks Professional Edition or a later edition.</p>
     * 
     * @param request the request parameters of CreateParameter  CreateParameterRequest
     * @return CreateParameterResponse
     */
    CompletableFuture<CreateParameterResponse> createParameter(CreateParameterRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If you specify multiple publish entities in the parameters, all entities except the first one are ignored.
     * Notice: This operation may not be available in earlier versions of the SDK. In this case, use the CreateDeployment operation. The parameters are the same as those described in this topic.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePipelineRun  CreatePipelineRunRequest
     * @return CreatePipelineRunResponse
     */
    CompletableFuture<CreatePipelineRunResponse> createPipelineRun(CreatePipelineRunRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>This API operation allows you to create a new approval process definition, including setting basic information such as the approval policy name, description, type, and subtype.</li>
     * <li>You can define a list of condition rules (RuleConditions) to specify the conditions under which the approval process is triggered.</li>
     * <li>Multiple notification services (NotificationServices) can be configured to send notifications to relevant personnel at different stages of the approval process.</li>
     * <li>The approval node list (ApprovalNodes) defines the nodes that must be traversed during the approval process and the approver information for each node.</li>
     * <li>You can choose whether to immediately enable the newly created approval process definition.</li>
     * <li>Note: Certain fields such as Type have specific value constraints. Refer to the constraint descriptions in the documentation.</li>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing of DataWorks common resource groups and the <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a>.</strong></li>
     * <li><strong>Before you call this operation, make sure that you have created the service-linked role AliyunServiceRoleForDataWorks.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of CreateResourceGroup  CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of CreateRoute  CreateRouteRequest
     * @return CreateRouteResponse
     */
    CompletableFuture<CreateRouteResponse> createRoute(CreateRouteRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li><strong>SchemaName</strong>: Select a schema that fits your business needs.</li>
     * <li><strong>ControlModule</strong> and <strong>ControlSubModule</strong>: Specify the module and submodule for the policy, ensuring they match the selected schema.</li>
     * <li><strong>ControlDwScope</strong>: Set the policy scope to either the tenant or workspace level.</li>
     * <li><strong>Workspaces</strong>: If <code>ControlDwScope</code> is set to <code>Workspace</code>, provide the corresponding workspace IDs.</li>
     * <li><strong>Content.Controllers</strong>: The controllers must match the definitions in the selected schema.</li>
     * <li>This operation cannot create system default policies.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecurityStrategy  CreateSecurityStrategyRequest
     * @return CreateSecurityStrategyResponse
     */
    CompletableFuture<CreateSecurityStrategyResponse> createSecurityStrategy(CreateSecurityStrategyRequest request);

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Creates and saves a reusable semantic job definition. This operation only saves the data source, resource group, and reference file configurations without immediately executing the job.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>When <code>Source.type=singleTableFile</code>, call <code>UploadSemanticFile</code> first, use the returned <code>Data.UploadUrl</code> to complete the PUT upload, and then specify <code>Data.FileId</code> in <code>ReferenceFileIds</code>. Alternatively, you can provide a single accessible URI.</li>
     * <li>Configure <code>Source</code>, <code>ProjectId</code>, and <code>ResourceGroupId</code>, and then call this operation to save the job.</li>
     * <li>Use <code>Data.Name</code> from the response to call <code>RunSemanticJob</code>. After the job is complete, use <code>DownloadSemanticResults</code> to retrieve the output.</li>
     * </ol>
     * <h2>Before you begin</h2>
     * <p><code>Name</code> must be unique within the current tenant. The reference file quantity rules differ between single-file sources and other sources. For details, refer to the descriptions of the <code>ReferenceFileIds</code> and <code>ReferenceFileUris</code> fields.</p>
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
     * <li>You must provide either SkillMdOverride or BundleUrl. One of the two parameters is required.</li>
     * <li>Visibility can be set to <code>TENANT</code>, <code>PROJECT</code>, or <code>USER</code>, which indicate visibility within the account, visibility to specified projects, or visibility to specified users, respectively.</li>
     * <li>When Visibility is set to <code>PROJECT</code>, specify the list of visible project IDs by using VisibilityScope.ProjectIds. When Visibility is set to <code>USER</code>, specify the list of visible user IDs by using VisibilityScope.UserIds.</li>
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
     * <p>Notice: This operation does not support batch operations. If more than one workflow is defined in FlowSpec, all workflows except the first one are ignored. In addition, nodes defined within the workflow are also ignored. Call the CreateNode operation to create internal nodes one by one.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateWorkflowDefinition  CreateWorkflowDefinitionRequest
     * @return CreateWorkflowDefinitionResponse
     */
    CompletableFuture<CreateWorkflowDefinitionResponse> createWorkflowDefinition(CreateWorkflowDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
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
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace: tenant owner, storage management administrator, project owner, or O&amp;M engineer.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteCertificate  DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: After a UDF function is published, it cannot be deleted. You must offline the function before deleting it.</p>
     * </blockquote>
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
     * @param request the request parameters of DeleteDIAlarmRule  DeleteDIAlarmRuleRequest
     * @return DeleteDIAlarmRuleResponse
     */
    CompletableFuture<DeleteDIAlarmRuleResponse> deleteDIAlarmRule(DeleteDIAlarmRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <li>This operation is available for all DataWorks editions.</li>
     * <li>To call this operation, you must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation is available for all DataWorks editions.</li>
     * <li>To delete a sharing rule of a data source from Workspace A to Workspace B, you must have the data source sharing permissions in Workspace A or Workspace B. You must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

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
     * <p>Notice: After a node is published, it cannot be deleted. You must offline the node before deleting it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks professional edition and later versions.</p>
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
     * <li><strong>Before you use this operation, ensure you understand the billing method and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> for DataWorks resource groups.</strong></li>
     * <li><strong>Before you use this operation, ensure you have created the Service-Linked Role AliyunServiceRoleForDataWorks.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DeleteResourceGroup  DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>Notice: After a workflow is published, it cannot be deleted. You must offline the workflow before deleting it.</p>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before using this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
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
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
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
     * <p>Notice: The stages of a publish flow are sequential. For more information, see the response of GetPipelineRun. You cannot skip or repeat a stage.
     * Notice: The execution is asynchronous. The response only indicates that the stage is triggered, not that the stage is executed. Check the response of GetPipelineRun for the execution result.
     * Notice: This operation may not be available in earlier SDK versions. In this case, use the ExecDeploymentStage operation. The parameters are the same as those described in this document.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ExecPipelineRunStage  ExecPipelineRunStageRequest
     * @return ExecPipelineRunStageResponse
     */
    CompletableFuture<ExecPipelineRunStageResponse> execPipelineRunStage(ExecPipelineRunStageRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ExecuteAdhocWorkflowInstance  ExecuteAdhocWorkflowInstanceRequest
     * @return ExecuteAdhocWorkflowInstanceResponse
     */
    CompletableFuture<ExecuteAdhocWorkflowInstanceResponse> executeAdhocWorkflowInstance(ExecuteAdhocWorkflowInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to find the most suitable security policy based on the provided control module, sub-module, and workspace ID. If a workspace ID is provided, the policy at the specified workspace level is matched first; otherwise, the tenant-level policy is returned. Note that system policies cannot be deleted or modified.</p>
     * 
     * @param request the request parameters of FindBestMatchSecurityStrategy  FindBestMatchSecurityStrategyRequest
     * @return FindBestMatchSecurityStrategyResponse
     */
    CompletableFuture<FindBestMatchSecurityStrategyResponse> findBestMatchSecurityStrategy(FindBestMatchSecurityStrategyRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API uses an agent\&quot;s name, provided as a parameter, to retrieve its detailed configuration, including the model configuration, system prompt, and tool list.</p>
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This API is used to query the details of resource permission applications based on the provided <code>ProcessInstanceId</code>.</li>
     * <li>A valid <code>ProcessInstanceId</code> parameter must be provided in the request.</li>
     * <li>The response includes the basic information, status, and the list of specific application contents.</li>
     * <li>Each application content includes detailed resource information, the grantee, the requested operation permissions, and more.</li>
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
     * <ol>
     * <li>You must have DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCatalog  GetCatalogRequest
     * @return GetCatalogResponse
     */
    CompletableFuture<GetCatalogResponse> getCatalog(GetCatalogRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This feature is available only in DataWorks Basic Edition and later versions.</li>
     * <li>You must have at least one of the following roles in the DataWorks project: Tenant Owner, Space Administrator, Deployment, Developer, Project Owner, or O\&amp;M.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCertificate  GetCertificateRequest
     * @return GetCertificateResponse
     */
    CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Storage Management Administrator, Deployment, Developer, Project Owner, or O&amp;M Engineer</li>
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
     * <li>Call <code>ListCrawlers</code> to query crawler IDs.</li>
     * <li>Call this operation to retrieve crawler details.</li>
     * <li>To query the complete run history, call <code>ListCrawlerRuns</code>.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or higher is required.</p>
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
     * <p>This operation requires DataWorks Basic Edition or later.</p>
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
     * @deprecated OpenAPI GetDataQualityEvaluationTaskInstance is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScanRun instead.  * @description DataWorks Basic Edition or a higher edition is required to use this operation.
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
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li><strong>Before using this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
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
     * <ol>
     * <li>You must have DataWorks Standard Edition or a higher edition to use this operation.</li>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves the details of a specific approval process definition using the <code>ID</code> parameter.</li>
     * <li>The <code>ID</code> parameter is required and must be a valid process definition ID.</li>
     * <li>The response includes the basic properties of the approval process definition, rule conditions, notification service configurations, and approval nodes.</li>
     * <li>A successful request returns the complete process definition object. A failed request returns an error code and message for troubleshooting.</li>
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
     * <p>This operation is available only in DataWorks Basic Edition and later.</p>
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
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetResourceGroup  GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves the complete configuration information for a security policy by its ID.</li>
     * <li>The API returns an error message if the provided <code>Id</code> is invalid or does not exist.</li>
     * <li>The response includes basic policy information, such as its name and description, and policy details, such as control items and their settings.</li>
     * <li>Note: Some fields in a system default policy cannot be modified or deleted.</li>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of GetTable  GetTableRequest
     * @return GetTableResponse
     */
    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetTaskInstance  GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     */
    CompletableFuture<GetTaskInstanceResponse> getTaskInstance(GetTaskInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>A successful response indicates only that the stop request has been processed. It does not mean that the job has reached a desired state.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>At least one of <code>agentName</code> and <code>sessionSourceList</code> must be provided.</li>
     * <li>Supports combined filtering by <code>tagList</code>, <code>sessionId</code>, and <code>sessionTitle</code>.</li>
     * <li>The response conforms to the Alibaba Cloud OpenAPI paging specification, including <code>totalCount</code>, <code>maxResults</code>, <code>nextToken</code>, and <code>sessionList</code>.</li>
     * <li>If <code>nextToken</code> is an invalid character string, it defaults to 1.</li>
     * <li>By default, 50 records are returned per page. Adjust this by using the <code>maxResults</code> parameter.</li>
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
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator.</li>
     * </ol>
     * 
     * @param request the request parameters of ListCertificates  ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    CompletableFuture<ListCertificatesResponse> listCertificates(ListCertificatesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
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
     * <li>DataWorks Basic Edition or a more advanced edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Developer, Visitor, Project Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, Development Platform Administrator, Data Governance Administrator</li>
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
     * <h2>Request</h2>
     * <ul>
     * <li><strong>Search keyword</strong>: Use the <code>Q</code> parameter to perform a fuzzy search by agent name.</li>
     * <li><strong>Visibility level filtering</strong>: Use the <code>Visibility</code> parameter to filter results by visibility level, such as <code>TENANT</code>, <code>PROJECT</code>, or <code>USER</code>.</li>
     * <li><strong>Paging information</strong>: Use the <code>MaxResults</code> and <code>NextToken</code> parameters to implement paginated queries. <code>NextToken</code> retrieves the next page of results.</li>
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
     * @param request the request parameters of ListDIAlarmRules  ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    CompletableFuture<ListDIAlarmRulesResponse> listDIAlarmRules(ListDIAlarmRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDIJobEvents  ListDIJobEventsRequest
     * @return ListDIJobEventsResponse
     */
    CompletableFuture<ListDIJobEventsResponse> listDIJobEvents(ListDIJobEventsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDIJobMetrics  ListDIJobMetricsRequest
     * @return ListDIJobMetricsResponse
     */
    CompletableFuture<ListDIJobMetricsResponse> listDIJobMetrics(ListDIJobMetricsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDIJobRunDetails  ListDIJobRunDetailsRequest
     * @return ListDIJobRunDetailsResponse
     */
    CompletableFuture<ListDIJobRunDetailsResponse> listDIJobRunDetails(ListDIJobRunDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation requires DataWorks Basic Edition or a later edition.</p>
     * 
     * @param request the request parameters of ListDIJobs  ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    CompletableFuture<ListDIJobsResponse> listDIJobs(ListDIJobsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of ListDataAssetTags  ListDataAssetTagsRequest
     * @return ListDataAssetTagsResponse
     */
    CompletableFuture<ListDataAssetTagsResponse> listDataAssetTags(ListDataAssetTagsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or a higher edition to use this feature.</p>
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
     * @deprecated OpenAPI ListDataQualityEvaluationTasks is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScans instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of ListDataQualityEvaluationTasks  ListDataQualityEvaluationTasksRequest
     * @return ListDataQualityEvaluationTasksResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityEvaluationTasksResponse> listDataQualityEvaluationTasks(ListDataQualityEvaluationTasksRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityResults is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @description 需要购买DataWorks基础版及以上版本才能使用
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
     * <p>This feature requires DataWorks basic edition or higher.</p>
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
     * <li>This operation is available for all DataWorks editions.</li>
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
     * <li>This operation is available for all DataWorks editions.</li>
     * <li>To call this operation, you must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator</li>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before using this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
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
     * <li>You must have DataWorks Basic Edition or a later version to use this API.</li>
     * <li><strong>Before you use this API, make sure that the service-linked role AliyunServiceRoleForDataWorks is created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Standard Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListLineageRelationships  ListLineageRelationshipsRequest
     * @return ListLineageRelationshipsResponse
     */
    CompletableFuture<ListLineageRelationshipsResponse> listLineageRelationships(ListLineageRelationshipsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Standard Edition or a higher edition to use this operation.</li>
     * <li>This operation queries the upstream and downstream entities of the current entity, as well as the lineage relationships between entities.</li>
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
     * <li><strong>Visibility</strong>: Optional. The visibility level for filtering the results.</li>
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
     * <li>This API supports paginated queries, controlled by the <code>NextToken</code> and <code>PageSize</code> parameters.</li>
     * <li><code>DefSchema</code> is a required parameter that specifies the resource type.</li>
     * <li>The <code>ResourceType</code> list can contain multiple resource types for more precise filtering of application orders.</li>
     * <li>You can set <code>StartTime</code> and <code>EndTime</code> to limit the time range of the query.</li>
     * <li><code>Statuses</code> allows you to filter application orders by specific statuses, such as pending approval and authorized.</li>
     * <li>If you need to filter by specific resources or authorization targets, you can provide detailed information through the <code>Resource</code> and <code>Grantee</code> fields.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMyApplications  ListMyApplicationsRequest
     * @return ListMyApplicationsResponse
     */
    CompletableFuture<ListMyApplicationsResponse> listMyApplications(ListMyApplicationsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This API is used to retrieve all permission application orders where the current user is an approver, including pending and processed application orders.</li>
     * <li>You can use the <code>Statuses</code> parameter to filter application orders by specific status.</li>
     * <li><code>NextToken</code> is used for paginated requests. It can be omitted or set to <code>null</code> for the first request. For subsequent requests, pass the <code>NextToken</code> value from the previous response.</li>
     * <li><code>PageSize</code> defaults to 10, with a maximum of 200.</li>
     * <li><code>DefSchema</code> and <code>ResourceType</code> are required fields. Other parameters can be filled in as needed.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMyRelatedApprovals  ListMyRelatedApprovalsRequest
     * @return ListMyRelatedApprovalsResponse
     */
    CompletableFuture<ListMyRelatedApprovalsResponse> listMyRelatedApprovals(ListMyRelatedApprovalsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This feature is available in DataWorks Professional Edition or higher.</p>
     * 
     * @param request the request parameters of ListParameters  ListParametersRequest
     * @return ListParametersResponse
     */
    CompletableFuture<ListParametersResponse> listParameters(ListParametersRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>Only MaxCompute and HMS (EMR cluster) table types are supported.</li>
     * <li>Before calling this API, call ListCrawlers to obtain the MetaEntityId of the metadata crawler, then call ListDatabases to obtain the database ID. For MaxCompute projects with Schema enabled, call ListSchemas to obtain the schema ID. Then call ListTables to obtain the TableId, and pass the returned table ID to this API.</li>
     * </ol>
     * 
     * @param request the request parameters of ListPartitions  ListPartitionsRequest
     * @return ListPartitionsResponse
     */
    CompletableFuture<ListPartitionsResponse> listPartitions(ListPartitionsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to query all pending permission request orders for which the current logged-in user is the approver. It supports filtering by multiple conditions, including resource type, time range, and approval status, to more precisely locate specific request orders.</p>
     * <ul>
     * <li><strong>ResourceType</strong>: Specifies the resource type (such as table), which can have multiple values.</li>
     * <li><strong>Resource</strong>: Provides specific resource search conditions, such as the project, database, or table name.</li>
     * <li><strong>StartTime and EndTime</strong>: Define the time range during which the request was submitted.</li>
     * <li><strong>Statuses</strong>: Allows filtering results by approval status, for example, to view only pending approval requests.</li>
     * <li><strong>Grantee</strong>: Filters request orders based on the authorization principal information.</li>
     * <li><strong>AccessTypes</strong>: Filters based on the specific permission types requested (such as read or update).</li>
     * <li><strong>PageSize and NextToken</strong>: Used for pagination control, specifying the amount of data returned per request and the cursor needed to retrieve the next page of data.
     * Notes:</li>
     * <li>If no filtering conditions are provided, all matching records are returned by default.</li>
     * <li>The <code>NextToken</code> parameter can be empty or omitted for the first call. Subsequent page requests must use the <code>NextToken</code> value provided in the previous response.</li>
     * <li>The default value of <code>PageSize</code> is 10, and the maximum value is 200. If the specified value exceeds the maximum limit, the maximum value is used.</li>
     * <li>When there is no more data to return, the <code>HasMore</code> field is set to <code>false</code>, and <code>NextToken</code> will be empty or absent.</li>
     * </ul>
     * <h2>Response Description</h2>
     * <p>After a successful call to this API, the response body contains paginated results and detailed information for each request order, such as the application time, resource description, authorization principal, requested permissions, and more. Additionally, the approval process status and other related metadata are provided.</p>
     * <ul>
     * <li><strong>Data</strong>: The paginated result set, including page size (<code>PageSize</code>), cursor (<code>NextToken</code>), and whether more data is available (<code>HasMore</code>).</li>
     * <li><strong>ApplicationQueryResponse</strong>: The specific content of each request order, including the reason for the request, submission time, status, and a detailed list of request content.</li>
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
     * <p>Notice: 
     * Earlier SDK versions may not include this interface. If so, use the ListDeployments interface. It accepts the same parameters.</p>
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
     * <p>This feature is available in DataWorks Basic Edition and higher.</p>
     * 
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    /**
     * <b>description</b> :
     * <p>This feature is available in DataWorks Basic Edition and higher.</p>
     * 
     * @param request the request parameters of ListProjectRoles  ListProjectRolesRequest
     * @return ListProjectRolesResponse
     */
    CompletableFuture<ListProjectRolesResponse> listProjectRoles(ListProjectRolesRequest request);

    /**
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
     * <li>This operation requires DataWorks Basic Edition or higher.</li>
     * <li><strong>Before you call this operation, make sure that you have created the service-linked role AliyunServiceRoleForDataWorks.</strong></li>
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
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves a paginated list of configured security policies.</li>
     * <li>The <code>ControlModule</code> and <code>ControlSubModule</code> parameters filter policies by a specific module or submodule.</li>
     * <li>The <code>PageNum</code> and <code>PageSize</code> parameters control pagination. <code>PageNum</code> specifies the page number to retrieve (default: 1), and <code>PageSize</code> specifies the number of policies to return per page (default: 20).</li>
     * <li>Use the <code>MaxResults</code> and <code>NextToken</code> private parameters for advanced pagination.</li>
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
     * <p>Queries the saved semantic node definitions of the current tenant with paging. Use this operation to display the node list, select a node to run, or obtain the workspace to which a node belongs.</p>
     * <h2>Invoke flow</h2>
     * <ol>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> to read <code>Data.SemanticJobs</code> with paging.</li>
     * <li>Use the <code>Name</code> field of a list item to invoke <code>RunSemanticJob</code>, <code>DeleteSemanticJob</code>, or <code>ListSemanticJobRuns</code>.</li>
     * <li>Use the <code>ProjectId</code> field of a list item together with <code>ExecutorJobId</code> to invoke the details, log, and stop operations.</li>
     * </ol>
     * <h2>Notes</h2>
     * <p>This operation returns node definitions, not real-time run statuses. To query run statuses, invoke <code>ListSemanticJobRuns</code>.</p>
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
     * <p>Queries a paged query list of personal development environment (ServerIDE) instances with paging. You can filter results by workspace, resource group, keyword, owner, and instance child class.</p>
     * 
     * @param request the request parameters of ListServerIdeInstances  ListServerIdeInstancesRequest
     * @return ListServerIdeInstancesResponse
     */
    CompletableFuture<ListServerIdeInstancesResponse> listServerIdeInstances(ListServerIdeInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This operation lists the Skills in your account. You can filter the results by criteria such as a search keyword and visibility level.</p>
     * <ul>
     * <li><strong>Q</strong>: An optional search keyword for a fuzzy match on Skill names.</li>
     * <li><strong>Visibility</strong>: An optional parameter to filter Skills by their visibility level. You can specify multiple values.</li>
     * <li><strong>MaxResults</strong>: An optional parameter that specifies the maximum number of results to return per page.</li>
     * <li><strong>NextToken</strong>: An optional pagination token for retrieving the next page of results. Omit this parameter for the first request. For subsequent requests, pass the <code>NextToken</code> value from the previous response to fetch the next page.</li>
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * Only operation logs generated within the previous 31 days can be queried.</p>
     * 
     * @param request the request parameters of ListTaskInstanceOperationLogs  ListTaskInstanceOperationLogsRequest
     * @return ListTaskInstanceOperationLogsResponse
     */
    CompletableFuture<ListTaskInstanceOperationLogsResponse> listTaskInstanceOperationLogs(ListTaskInstanceOperationLogsRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this API operation.</p>
     * 
     * @param request the request parameters of ListTaskInstances  ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     */
    CompletableFuture<ListTaskInstancesResponse> listTaskInstances(ListTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * Only operation logs generated within the previous 31 days can be queried.</p>
     * 
     * @param request the request parameters of ListTaskOperationLogs  ListTaskOperationLogsRequest
     * @return ListTaskOperationLogsResponse
     */
    CompletableFuture<ListTaskOperationLogsResponse> listTaskOperationLogs(ListTaskOperationLogsRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or higher is required.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListWorkflowInstances  ListWorkflowInstancesRequest
     * @return ListWorkflowInstancesResponse
     */
    CompletableFuture<ListWorkflowInstancesResponse> listWorkflowInstances(ListWorkflowInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListWorkflows  ListWorkflowsRequest
     * @return ListWorkflowsResponse
     */
    CompletableFuture<ListWorkflowsResponse> listWorkflows(ListWorkflowsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This operation retrieves session details and streams the Agent response using Server-Sent Events (SSE).</li>
     * <li>If the target session does not exist, the operation returns an error frame with an error code of 400.</li>
     * <li>The response includes information about the Agent\&quot;s request processing, such as message chunks, thought processes, and tool call status updates.</li>
     * <li>The <code>stopReason</code> field indicates why the Agent stops the current turn. Possible values include reaching the maximum turn limit or being canceled.</li>
     * <li>The returned content conforms to the Agent Client Protocol (ACP). For more information, see https\://agentclientprotocol.com.</li>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API sends a user prompt to a specified session ID and accepts the Agent response in SSE (Server-Sent Events) streaming mode.</li>
     * <li>The response may include message fragments, thinking procedures, tool calling status updates, and other information.</li>
     * <li>If the specified session does not exist, a 400 fault is returned through an SSE error frame.</li>
     * <li>The <code>stopReason</code> field indicates why the Agent stopped the current conversation turn.</li>
     * <li>Multiple types of content blocks are supported as prompt input, such as text and OSS file download links.</li>
     * <li>You can optionally provide additional meta information <code>Meta</code> to pass more context to the server.</li>
     * <li>The returned content conforms to the open-source Agent Client Protocol (ACP) specification. For more information, visit: <a href="https://agentclientprotocol.com">https://agentclientprotocol.com</a></li>
     * <li><strong>Before invoking this API, make sure you fully understand the billing methods and pricing of the Data Agent product</strong>: <a href="https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing">https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing</a></li>
     * </ul>
     * 
     * @param request the request parameters of PromptAgentSession  PromptAgentSessionRequest
     * @return PromptAgentSessionResponse
     */
    CompletableFuture<PromptAgentSessionResponse> promptAgentSession(PromptAgentSessionRequest request);

    ResponseIterable<PromptAgentSessionResponseBody> promptAgentSessionWithResponseIterable(PromptAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks has been created before you call this operation.</strong></li>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>You must purchase DataWorks Basic Edition or a more advanced edition to use this operation.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ResumeTaskInstances  ResumeTaskInstancesRequest
     * @return ResumeTaskInstancesResponse
     */
    CompletableFuture<ResumeTaskInstancesResponse> resumeTaskInstances(ResumeTaskInstancesRequest request);

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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of SetSuccessTaskInstances  SetSuccessTaskInstancesRequest
     * @return SetSuccessTaskInstancesResponse
     */
    CompletableFuture<SetSuccessTaskInstancesResponse> setSuccessTaskInstances(SetSuccessTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
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
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of StopTaskInstances  StopTaskInstancesRequest
     * @return StopTaskInstancesResponse
     */
    CompletableFuture<StopTaskInstancesResponse> stopTaskInstances(StopTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of SuspendTaskInstances  SuspendTaskInstancesRequest
     * @return SuspendTaskInstancesResponse
     */
    CompletableFuture<SuspendTaskInstancesResponse> suspendTaskInstances(SuspendTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of TagDataAssets  TagDataAssetsRequest
     * @return TagDataAssetsResponse
     */
    CompletableFuture<TagDataAssetsResponse> tagDataAssets(TagDataAssetsRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks project space:
     * Tenant Owner, Space Administrator, Deployment, Developer, Project Owner, or O\&amp;M.</li>
     * </ol>
     * 
     * @param request the request parameters of TestDataSourceConnectivity  TestDataSourceConnectivityRequest
     * @return TestDataSourceConnectivityResponse
     */
    CompletableFuture<TestDataSourceConnectivityResponse> testDataSourceConnectivity(TestDataSourceConnectivityRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of TriggerSchedulerTaskInstance  TriggerSchedulerTaskInstanceRequest
     * @return TriggerSchedulerTaskInstanceResponse
     */
    CompletableFuture<TriggerSchedulerTaskInstanceResponse> triggerSchedulerTaskInstance(TriggerSchedulerTaskInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of UnTagDataAssets  UnTagDataAssetsRequest
     * @return UnTagDataAssetsResponse
     */
    CompletableFuture<UnTagDataAssetsResponse> unTagDataAssets(UnTagDataAssetsRequest request);

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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks project space:</li>
     * <li>Tenant Owner, tenant administrator, Space Administrator, Project Owner, or O\&amp;M</li>
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
     * <li>Tenant owner, tenant administrator, storage management administrator, project owner, or O&amp;M engineer.</li>
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
     * <p>You must purchase DataWorks Enterprise Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of UpdateDataAssetTag  UpdateDataAssetTagRequest
     * @return UpdateDataAssetTagResponse
     */
    CompletableFuture<UpdateDataAssetTagResponse> updateDataAssetTag(UpdateDataAssetTagRequest request);

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of UpdateDataQualityAlertRule  UpdateDataQualityAlertRuleRequest
     * @return UpdateDataQualityAlertRuleResponse
     */
    CompletableFuture<UpdateDataQualityAlertRuleResponse> updateDataQualityAlertRule(UpdateDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI UpdateDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description DataWorks Basic Edition or above must be purchased to use this operation.
     * 
     * @param request the request parameters of UpdateDataQualityEvaluationTask  UpdateDataQualityEvaluationTaskRequest
     * @return UpdateDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<UpdateDataQualityEvaluationTaskResponse> updateDataQualityEvaluationTask(UpdateDataQualityEvaluationTaskRequest request);

    /**
     * @deprecated OpenAPI UpdateDataQualityRule is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or above to use this feature.
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
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of UpdateImage  UpdateImageRequest
     * @return UpdateImageResponse
     */
    CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation allows you to update the configuration of a specified MCP Server, including the service URL, transport protocol, custom request headers, and visibility settings. Fields that are not provided retain their existing values.
     * <strong>Note</strong>: When you modify the <code>Visibility</code> parameter, selectively provide <code>ProjectIds</code> or <code>UserIds</code> in <code>VisibilityScope</code> based on the visibility setting to ensure that the correct access control scope is applied.</p>
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
     * <h2>Request</h2>
     * <ul>
     * <li>Use this API to modify an existing approval process definition, including its name, description, rule conditions, notification service, and approval nodes.</li>
     * <li>The required <code>Id</code> parameter identifies the approval process definition to update.</li>
     * <li>To overwrite the existing configuration, set the <code>Overwrite</code> parameter to <code>true</code>.</li>
     * <li>The optional <code>ClientToken</code> parameter ensures request idempotency.</li>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation updates the information of a specified node, including but not limited to the node name, description, and owner.</li>
     * <li>The changes are synchronized to DataStudio, and DataStudio creates a new saved version.</li>
     * <li>You can set detailed parameters such as the trigger method, runtime environment configuration, and dependencies of the node.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTaskAsync  UpdateTaskAsyncRequest
     * @return UpdateTaskAsyncResponse
     */
    CompletableFuture<UpdateTaskAsyncResponse> updateTaskAsync(UpdateTaskAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
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
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
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
