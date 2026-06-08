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
     * <b>description</b> :
     * <blockquote>
     * <p> This operation may not be available in earlier versions of the SDK. In this case, use the AbolishDeployment operation. The parameters for AbolishDeployment are the same as those described in this topic.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AbolishPipelineRun  AbolishPipelineRunRequest
     * @return AbolishPipelineRunResponse
     */
    CompletableFuture<AbolishPipelineRunResponse> abolishPipelineRun(AbolishPipelineRunRequest request);

    /**
     * @param request the request parameters of AddEntityIntoMetaCollection  AddEntityIntoMetaCollectionRequest
     * @return AddEntityIntoMetaCollectionResponse
     */
    CompletableFuture<AddEntityIntoMetaCollectionResponse> addEntityIntoMetaCollection(AddEntityIntoMetaCollectionRequest request);

    /**
     * @param request the request parameters of ApplyResourceAccessPermission  ApplyResourceAccessPermissionRequest
     * @return ApplyResourceAccessPermissionResponse
     */
    CompletableFuture<ApplyResourceAccessPermissionResponse> applyResourceAccessPermission(ApplyResourceAccessPermissionRequest request);

    /**
     * @param request the request parameters of ApproveProcessInstance  ApproveProcessInstanceRequest
     * @return ApproveProcessInstanceResponse
     */
    CompletableFuture<ApproveProcessInstanceResponse> approveProcessInstance(ApproveProcessInstanceRequest request);

    /**
     * @param request the request parameters of AssociateProjectToImage  AssociateProjectToImageRequest
     * @return AssociateProjectToImageResponse
     */
    CompletableFuture<AssociateProjectToImageResponse> associateProjectToImage(AssociateProjectToImageRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateProjectToResourceGroup  AssociateProjectToResourceGroupRequest
     * @return AssociateProjectToResourceGroupResponse
     */
    CompletableFuture<AssociateProjectToResourceGroupResponse> associateProjectToResourceGroup(AssociateProjectToResourceGroupRequest request);

    /**
     * @deprecated OpenAPI AttachDataQualityRulesToEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @param request  the request parameters of AttachDataQualityRulesToEvaluationTask  AttachDataQualityRulesToEvaluationTaskRequest
     * @return AttachDataQualityRulesToEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<AttachDataQualityRulesToEvaluationTaskResponse> attachDataQualityRulesToEvaluationTask(AttachDataQualityRulesToEvaluationTaskRequest request);

    /**
     * @param request the request parameters of BatchCreateMetaEntities  BatchCreateMetaEntitiesRequest
     * @return BatchCreateMetaEntitiesResponse
     */
    CompletableFuture<BatchCreateMetaEntitiesResponse> batchCreateMetaEntities(BatchCreateMetaEntitiesRequest request);

    /**
     * @param request the request parameters of BatchDeleteMetaEntities  BatchDeleteMetaEntitiesRequest
     * @return BatchDeleteMetaEntitiesResponse
     */
    CompletableFuture<BatchDeleteMetaEntitiesResponse> batchDeleteMetaEntities(BatchDeleteMetaEntitiesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of BatchUpdateTasks  BatchUpdateTasksRequest
     * @return BatchUpdateTasksResponse
     */
    CompletableFuture<BatchUpdateTasksResponse> batchUpdateTasks(BatchUpdateTasksRequest request);

    /**
     * @param request the request parameters of CancelAgentSession  CancelAgentSessionRequest
     * @return CancelAgentSessionResponse
     */
    CompletableFuture<CancelAgentSessionResponse> cancelAgentSession(CancelAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of CloneDataSource  CloneDataSourceRequest
     * @return CloneDataSourceResponse
     */
    CompletableFuture<CloneDataSourceResponse> cloneDataSource(CloneDataSourceRequest request);

    /**
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request);

    /**
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
     * @param request the request parameters of CreateComponent  CreateComponentRequest
     * @return CreateComponentResponse
     */
    CompletableFuture<CreateComponentResponse> createComponent(CreateComponentRequest request);

    /**
     * @param request the request parameters of CreateComputeResource  CreateComputeResourceRequest
     * @return CreateComputeResourceResponse
     */
    CompletableFuture<CreateComputeResourceResponse> createComputeResource(CreateComputeResourceRequest request);

    /**
     * @param request the request parameters of CreateCustomAttribute  CreateCustomAttributeRequest
     * @return CreateCustomAttributeResponse
     */
    CompletableFuture<CreateCustomAttributeResponse> createCustomAttribute(CreateCustomAttributeRequest request);

    /**
     * @param request the request parameters of CreateDIAlarmRule  CreateDIAlarmRuleRequest
     * @return CreateDIAlarmRuleResponse
     */
    CompletableFuture<CreateDIAlarmRuleResponse> createDIAlarmRule(CreateDIAlarmRuleRequest request);

    /**
     * <b>description</b> :
     * <p>  This API operation is available for all DataWorks editions.</p>
     * <ul>
     * <li>You can call this API operation to create a synchronization task. When you call this API operation, you must configure parameters such as SourceDataSourceSettings, DestinationDataSourceSettings, MigrationType, TransformationRules, TableMappings, and JobSettings. The SourceDataSourceSettings parameter defines the settings related to the source. The DestinationDataSourceSettings parameter defines the settings related to the destination. The MigrationType parameter defines the synchronization task type. The TransformationRules parameter defines the transformation rules for objects involved in the synchronization task. The TableMappings parameter defines the mappings between rules used to select synchronization objects in the source and transformation rules applied to the selected synchronization objects. The JobSettings parameter defines the settings for the dimension of the synchronization task, including policies for data type mappings between source fields and destination fields and settings for periodic scheduling.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDIJob  CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    CompletableFuture<CreateDIJobResponse> createDIJob(CreateDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of CreateDataAssetTag  CreateDataAssetTagRequest
     * @return CreateDataAssetTagResponse
     */
    CompletableFuture<CreateDataAssetTagResponse> createDataAssetTag(CreateDataAssetTagRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of CreateDataQualityAlertRule  CreateDataQualityAlertRuleRequest
     * @return CreateDataQualityAlertRuleResponse
     */
    CompletableFuture<CreateDataQualityAlertRuleResponse> createDataQualityAlertRule(CreateDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description This API operation is supported in all DataWorks editions.
     * 
     * @param request the request parameters of CreateDataQualityEvaluationTask  CreateDataQualityEvaluationTaskRequest
     * @return CreateDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<CreateDataQualityEvaluationTaskResponse> createDataQualityEvaluationTask(CreateDataQualityEvaluationTaskRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityEvaluationTaskInstance is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScanRun instead.  * @param request  the request parameters of CreateDataQualityEvaluationTaskInstance  CreateDataQualityEvaluationTaskInstanceRequest
     * @return CreateDataQualityEvaluationTaskInstanceResponse
     */
    @Deprecated
    CompletableFuture<CreateDataQualityEvaluationTaskInstanceResponse> createDataQualityEvaluationTaskInstance(CreateDataQualityEvaluationTaskInstanceRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityRule is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @param request  the request parameters of CreateDataQualityRule  CreateDataQualityRuleRequest
     * @return CreateDataQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<CreateDataQualityRuleResponse> createDataQualityRule(CreateDataQualityRuleRequest request);

    /**
     * @deprecated OpenAPI CreateDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityTemplate instead.  * @param request  the request parameters of CreateDataQualityRuleTemplate  CreateDataQualityRuleTemplateRequest
     * @return CreateDataQualityRuleTemplateResponse
     */
    @Deprecated
    CompletableFuture<CreateDataQualityRuleTemplateResponse> createDataQualityRuleTemplate(CreateDataQualityRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of CreateDataQualityScan  CreateDataQualityScanRequest
     * @return CreateDataQualityScanResponse
     */
    CompletableFuture<CreateDataQualityScanResponse> createDataQualityScan(CreateDataQualityScanRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of CreateDataQualityScanRun  CreateDataQualityScanRunRequest
     * @return CreateDataQualityScanRunResponse
     */
    CompletableFuture<CreateDataQualityScanRunResponse> createDataQualityScanRun(CreateDataQualityScanRunRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of CreateDataQualityTemplate  CreateDataQualityTemplateRequest
     * @return CreateDataQualityTemplateResponse
     */
    CompletableFuture<CreateDataQualityTemplateResponse> createDataQualityTemplate(CreateDataQualityTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to share a data source from Workspace A to Workspace B, you must have the permissions to share the data source in both workspaces. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
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
     * <p> You cannot use this API operation to create multiple UDFs at a time. If you specify multiple UDFs by using FlowSpec, the system creates only the first specified UDF.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateFunction  CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation does not support batch processing. If multiple publishing entities are specified in the parameters, only the first one will be processed; the others will be ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateIdentifyCredential  CreateIdentifyCredentialRequest
     * @return CreateIdentifyCredentialResponse
     */
    CompletableFuture<CreateIdentifyCredentialResponse> createIdentifyCredential(CreateIdentifyCredentialRequest request);

    /**
     * @param request the request parameters of CreateLineageRelationship  CreateLineageRelationshipRequest
     * @return CreateLineageRelationshipResponse
     */
    CompletableFuture<CreateLineageRelationshipResponse> createLineageRelationship(CreateLineageRelationshipRequest request);

    /**
     * @param request the request parameters of CreateMcpServer  CreateMcpServerRequest
     * @return CreateMcpServerResponse
     */
    CompletableFuture<CreateMcpServerResponse> createMcpServer(CreateMcpServerRequest request);

    /**
     * @param request the request parameters of CreateMetaCollection  CreateMetaCollectionRequest
     * @return CreateMetaCollectionResponse
     */
    CompletableFuture<CreateMetaCollectionResponse> createMetaCollection(CreateMetaCollectionRequest request);

    /**
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
     * <p> You cannot use this API operation to create multiple nodes at a time. If you specify multiple nodes by using FlowSpec, the system creates only the first specified node.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateNode  CreateNodeRequest
     * @return CreateNodeResponse
     */
    CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request);

    /**
     * @param request the request parameters of CreateParameter  CreateParameterRequest
     * @return CreateParameterResponse
     */
    CompletableFuture<CreateParameterResponse> createParameter(CreateParameterRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Batch operations are not currently supported. If you specify multiple entities in the parameters, only the first entity takes effect, and the rest are ignored.
     *  This operation may not be available in earlier versions of the SDK. In this case, use the CreateDeployment operation. The parameters for CreateDeployment are the same as those described in this topic.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePipelineRun  CreatePipelineRunRequest
     * @return CreatePipelineRunResponse
     */
    CompletableFuture<CreatePipelineRunResponse> createPipelineRun(CreatePipelineRunRequest request);

    /**
     * @param request the request parameters of CreateProcessDefinition  CreateProcessDefinitionRequest
     * @return CreateProcessDefinitionResponse
     */
    CompletableFuture<CreateProcessDefinitionResponse> createProcessDefinition(CreateProcessDefinitionRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>**Before you call this API operation, you must make sure that you have a good command of the billing details and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> of serverless resource groups.</li>
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
     * @param request the request parameters of CreateSecurityStrategy  CreateSecurityStrategyRequest
     * @return CreateSecurityStrategyResponse
     */
    CompletableFuture<CreateSecurityStrategyResponse> createSecurityStrategy(CreateSecurityStrategyRequest request);

    /**
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
     * <p>You cannot use this API operation to create multiple workflows at a time. If you specify multiple workflows by using FlowSpec, the system creates only the first specified workflow. Other specified workflows and the nodes in the workflows are ignored. You can call the CreateNode operation to create a node.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateWorkflowDefinition  CreateWorkflowDefinitionRequest
     * @return CreateWorkflowDefinitionResponse
     */
    CompletableFuture<CreateWorkflowDefinitionResponse> createWorkflowDefinition(CreateWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of CreateWorkflowInstances  CreateWorkflowInstancesRequest
     * @return CreateWorkflowInstancesResponse
     */
    CompletableFuture<CreateWorkflowInstancesResponse> createWorkflowInstances(CreateWorkflowInstancesRequest request);

    /**
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
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteCertificate  DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A UDF that is deployed cannot be deleted. If you want to delete such a UDF, you must first undeploy the UDF.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteComponent  DeleteComponentRequest
     * @return DeleteComponentResponse
     */
    CompletableFuture<DeleteComponentResponse> deleteComponent(DeleteComponentRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteComputeResource  DeleteComputeResourceRequest
     * @return DeleteComputeResourceResponse
     */
    CompletableFuture<DeleteComputeResourceResponse> deleteComputeResource(DeleteComputeResourceRequest request);

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
     * <p>Subscribe to DataWorks Basic Edition or a higher version to use this API.</p>
     * 
     * @param request the request parameters of DeleteDataQualityAlertRule  DeleteDataQualityAlertRuleRequest
     * @return DeleteDataQualityAlertRuleResponse
     */
    CompletableFuture<DeleteDataQualityAlertRuleResponse> deleteDataQualityAlertRule(DeleteDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI DeleteDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::DeleteDataQualityScan instead.  * @param request  the request parameters of DeleteDataQualityEvaluationTask  DeleteDataQualityEvaluationTaskRequest
     * @return DeleteDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<DeleteDataQualityEvaluationTaskResponse> deleteDataQualityEvaluationTask(DeleteDataQualityEvaluationTaskRequest request);

    /**
     * @param request the request parameters of DeleteDataQualityRule  DeleteDataQualityRuleRequest
     * @return DeleteDataQualityRuleResponse
     */
    CompletableFuture<DeleteDataQualityRuleResponse> deleteDataQualityRule(DeleteDataQualityRuleRequest request);

    /**
     * @deprecated OpenAPI DeleteDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::DeleteDataQualityTemplate instead.  * @param request  the request parameters of DeleteDataQualityRuleTemplate  DeleteDataQualityRuleTemplateRequest
     * @return DeleteDataQualityRuleTemplateResponse
     */
    @Deprecated
    CompletableFuture<DeleteDataQualityRuleTemplateResponse> deleteDataQualityRuleTemplate(DeleteDataQualityRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of DeleteDataQualityScan  DeleteDataQualityScanRequest
     * @return DeleteDataQualityScanResponse
     */
    CompletableFuture<DeleteDataQualityScanResponse> deleteDataQualityScan(DeleteDataQualityScanRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Request description</h2>
     * <ul>
     * <li><strong>Id</strong>: the unique identifier of the user-defined rule template, in the format <code>USER_DEFINED:&lt;template_id&gt;</code>.</li>
     * <li><strong>ProjectId</strong>: The ID of the DataWorks project to which the rule template belongs.
     * This API is used to remove data quality rule templates that are no longer needed from the system. Make sure the provided <code>Id</code> and <code>ProjectId</code> are correct when calling this API operation; otherwise, the deletion may fail or lead to unexpected data loss. Use this function with caution and verify the exact information of the template before performing the operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataQualityTemplate  DeleteDataQualityTemplateRequest
     * @return DeleteDataQualityTemplateResponse
     */
    CompletableFuture<DeleteDataQualityTemplateResponse> deleteDataQualityTemplate(DeleteDataQualityTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all Dataworks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
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
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to delete a sharing rule of a data source from Workspace A to Workspace B, you must have the permissions to share the data source in Workspace A or Workspace B. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
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
     * <p> A UDF that is deployed cannot be deleted. If you want to delete such a UDF, you must first undeploy the UDF.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFunction  DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    /**
     * @param request the request parameters of DeleteLineageRelationship  DeleteLineageRelationshipRequest
     * @return DeleteLineageRelationshipResponse
     */
    CompletableFuture<DeleteLineageRelationshipResponse> deleteLineageRelationship(DeleteLineageRelationshipRequest request);

    /**
     * @param request the request parameters of DeleteMcpServer  DeleteMcpServerRequest
     * @return DeleteMcpServerResponse
     */
    CompletableFuture<DeleteMcpServerResponse> deleteMcpServer(DeleteMcpServerRequest request);

    /**
     * @param request the request parameters of DeleteMetaCollection  DeleteMetaCollectionRequest
     * @return DeleteMetaCollectionResponse
     */
    CompletableFuture<DeleteMetaCollectionResponse> deleteMetaCollection(DeleteMetaCollectionRequest request);

    /**
     * @param request the request parameters of DeleteMetaEntityDef  DeleteMetaEntityDefRequest
     * @return DeleteMetaEntityDefResponse
     */
    CompletableFuture<DeleteMetaEntityDefResponse> deleteMetaEntityDef(DeleteMetaEntityDefRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of DeleteNetwork  DeleteNetworkRequest
     * @return DeleteNetworkResponse
     */
    CompletableFuture<DeleteNetworkResponse> deleteNetwork(DeleteNetworkRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A node that is deployed cannot be deleted. If you want to delete such a node, you must first undeploy the node.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

    /**
     * @param request the request parameters of DeleteParameter  DeleteParameterRequest
     * @return DeleteParameterResponse
     */
    CompletableFuture<DeleteParameterResponse> deleteParameter(DeleteParameterRequest request);

    /**
     * @param request the request parameters of DeleteProcessDefinition  DeleteProcessDefinitionRequest
     * @return DeleteProcessDefinitionResponse
     */
    CompletableFuture<DeleteProcessDefinitionResponse> deleteProcessDefinition(DeleteProcessDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p> A file resource that is deployed cannot be deleted. If you want to delete such a file resource, you must first undeploy the file resource.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>**Before you call this API operation, you must make sure that you have a good command of the billing details and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> of serverless resource groups.</li>
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
     * @param request the request parameters of DeleteSecurityStrategy  DeleteSecurityStrategyRequest
     * @return DeleteSecurityStrategyResponse
     */
    CompletableFuture<DeleteSecurityStrategyResponse> deleteSecurityStrategy(DeleteSecurityStrategyRequest request);

    /**
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of DeleteWorkflow  DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    CompletableFuture<DeleteWorkflowResponse> deleteWorkflow(DeleteWorkflowRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A workflow that is deployed cannot be deleted. If you want to delete such a workflow, you must first undeploy the workflow.</p>
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
     * @deprecated OpenAPI DetachDataQualityRulesFromEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @param request  the request parameters of DetachDataQualityRulesFromEvaluationTask  DetachDataQualityRulesFromEvaluationTaskRequest
     * @return DetachDataQualityRulesFromEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<DetachDataQualityRulesFromEvaluationTaskResponse> detachDataQualityRulesFromEvaluationTask(DetachDataQualityRulesFromEvaluationTaskRequest request);

    /**
     * @param request the request parameters of DisableProcessDefinition  DisableProcessDefinitionRequest
     * @return DisableProcessDefinitionResponse
     */
    CompletableFuture<DisableProcessDefinitionResponse> disableProcessDefinition(DisableProcessDefinitionRequest request);

    /**
     * @param request the request parameters of DissociateProjectFromImage  DissociateProjectFromImageRequest
     * @return DissociateProjectFromImageResponse
     */
    CompletableFuture<DissociateProjectFromImageResponse> dissociateProjectFromImage(DissociateProjectFromImageRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateProjectFromResourceGroup  DissociateProjectFromResourceGroupRequest
     * @return DissociateProjectFromResourceGroupResponse
     */
    CompletableFuture<DissociateProjectFromResourceGroupResponse> dissociateProjectFromResourceGroup(DissociateProjectFromResourceGroupRequest request);

    /**
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
     * <b>description</b> :
     * <blockquote>
     * <p> The stages in a process are sequential. For more information, see the GetDeployment operation. Skipping or repeating a stage is not allowed.
     *  The execution of a stage is asynchronous. The response of this operation indicates only whether a stage is triggered but does not indicate whether the execution of the stage is successful. You can call the GetDeployment operation to check whether the execution is successful.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ExecPipelineRunStage  ExecPipelineRunStageRequest
     * @return ExecPipelineRunStageResponse
     */
    CompletableFuture<ExecPipelineRunStageResponse> execPipelineRunStage(ExecPipelineRunStageRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ExecuteAdhocWorkflowInstance  ExecuteAdhocWorkflowInstanceRequest
     * @return ExecuteAdhocWorkflowInstanceResponse
     */
    CompletableFuture<ExecuteAdhocWorkflowInstanceResponse> executeAdhocWorkflowInstance(ExecuteAdhocWorkflowInstanceRequest request);

    /**
     * @param request the request parameters of FindBestMatchSecurityStrategy  FindBestMatchSecurityStrategyRequest
     * @return FindBestMatchSecurityStrategyResponse
     */
    CompletableFuture<FindBestMatchSecurityStrategyResponse> findBestMatchSecurityStrategy(FindBestMatchSecurityStrategyRequest request);

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    /**
     * @param request the request parameters of GetAgentSessionArtifactMeta  GetAgentSessionArtifactMetaRequest
     * @return GetAgentSessionArtifactMetaResponse
     */
    CompletableFuture<GetAgentSessionArtifactMetaResponse> getAgentSessionArtifactMeta(GetAgentSessionArtifactMetaRequest request);

    /**
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
     * @param request the request parameters of GetApplicationContents  GetApplicationContentsRequest
     * @return GetApplicationContentsResponse
     */
    CompletableFuture<GetApplicationContentsResponse> getApplicationContents(GetApplicationContentsRequest request);

    /**
     * @param request the request parameters of GetBusiness  GetBusinessRequest
     * @return GetBusinessResponse
     */
    CompletableFuture<GetBusinessResponse> getBusiness(GetBusinessRequest request);

    /**
     * @param request the request parameters of GetCatalog  GetCatalogRequest
     * @return GetCatalogResponse
     */
    CompletableFuture<GetCatalogResponse> getCatalog(GetCatalogRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Deploy, Develop, Workspace Owner, and O\&amp;M.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCertificate  GetCertificateRequest
     * @return GetCertificateResponse
     */
    CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request);

    /**
     * @param request the request parameters of GetColumn  GetColumnRequest
     * @return GetColumnResponse
     */
    CompletableFuture<GetColumnResponse> getColumn(GetColumnRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * </ol>
     * 
     * @param request the request parameters of GetComponent  GetComponentRequest
     * @return GetComponentResponse
     */
    CompletableFuture<GetComponentResponse> getComponent(GetComponentRequest request);

    /**
     * @param request the request parameters of GetComputeResource  GetComputeResourceRequest
     * @return GetComputeResourceResponse
     */
    CompletableFuture<GetComputeResourceResponse> getComputeResource(GetComputeResourceRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetCreateWorkflowInstancesResult  GetCreateWorkflowInstancesResultRequest
     * @return GetCreateWorkflowInstancesResultResponse
     */
    CompletableFuture<GetCreateWorkflowInstancesResultResponse> getCreateWorkflowInstancesResult(GetCreateWorkflowInstancesResultRequest request);

    /**
     * @param request the request parameters of GetCustomAttribute  GetCustomAttributeRequest
     * @return GetCustomAttributeResponse
     */
    CompletableFuture<GetCustomAttributeResponse> getCustomAttribute(GetCustomAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetDIJob  GetDIJobRequest
     * @return GetDIJobResponse
     */
    CompletableFuture<GetDIJobResponse> getDIJob(GetDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetDIJobLog  GetDIJobLogRequest
     * @return GetDIJobLogResponse
     */
    CompletableFuture<GetDIJobLogResponse> getDIJobLog(GetDIJobLogRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetDataQualityAlertRule  GetDataQualityAlertRuleRequest
     * @return GetDataQualityAlertRuleResponse
     */
    CompletableFuture<GetDataQualityAlertRuleResponse> getDataQualityAlertRule(GetDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI GetDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @param request  the request parameters of GetDataQualityEvaluationTask  GetDataQualityEvaluationTaskRequest
     * @return GetDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<GetDataQualityEvaluationTaskResponse> getDataQualityEvaluationTask(GetDataQualityEvaluationTaskRequest request);

    /**
     * @deprecated OpenAPI GetDataQualityEvaluationTaskInstance is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScanRun instead.  * @param request  the request parameters of GetDataQualityEvaluationTaskInstance  GetDataQualityEvaluationTaskInstanceRequest
     * @return GetDataQualityEvaluationTaskInstanceResponse
     */
    @Deprecated
    CompletableFuture<GetDataQualityEvaluationTaskInstanceResponse> getDataQualityEvaluationTaskInstance(GetDataQualityEvaluationTaskInstanceRequest request);

    /**
     * @deprecated OpenAPI GetDataQualityRule is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScan instead.  * @description This API operation is available for all DataWorks editions.
     * 
     * @param request the request parameters of GetDataQualityRule  GetDataQualityRuleRequest
     * @return GetDataQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<GetDataQualityRuleResponse> getDataQualityRule(GetDataQualityRuleRequest request);

    /**
     * @deprecated OpenAPI GetDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::GetDataQualityTemplate instead.  * @description This API operation is available for all DataWorks editions.
     * 
     * @param request the request parameters of GetDataQualityRuleTemplate  GetDataQualityRuleTemplateRequest
     * @return GetDataQualityRuleTemplateResponse
     */
    @Deprecated
    CompletableFuture<GetDataQualityRuleTemplateResponse> getDataQualityRuleTemplate(GetDataQualityRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetDataQualityScan  GetDataQualityScanRequest
     * @return GetDataQualityScanResponse
     */
    CompletableFuture<GetDataQualityScanResponse> getDataQualityScan(GetDataQualityScanRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetDataQualityScanRun  GetDataQualityScanRunRequest
     * @return GetDataQualityScanRunResponse
     */
    CompletableFuture<GetDataQualityScanRunResponse> getDataQualityScanRun(GetDataQualityScanRunRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetDataQualityScanRunLog  GetDataQualityScanRunLogRequest
     * @return GetDataQualityScanRunLogResponse
     */
    CompletableFuture<GetDataQualityScanRunLogResponse> getDataQualityScanRunLog(GetDataQualityScanRunLogRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetDataQualityTemplate  GetDataQualityTemplateRequest
     * @return GetDataQualityTemplateResponse
     */
    CompletableFuture<GetDataQualityTemplateResponse> getDataQualityTemplate(GetDataQualityTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deployment, Development, Project Owner, and O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of GetDataSource  GetDataSourceRequest
     * @return GetDataSourceResponse
     */
    CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request);

    /**
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
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    /**
     * @param request the request parameters of GetJobStatus  GetJobStatusRequest
     * @return GetJobStatusResponse
     */
    CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request);

    /**
     * @param request the request parameters of GetLineageRelationship  GetLineageRelationshipRequest
     * @return GetLineageRelationshipResponse
     */
    CompletableFuture<GetLineageRelationshipResponse> getLineageRelationship(GetLineageRelationshipRequest request);

    /**
     * @param request the request parameters of GetMcpServer  GetMcpServerRequest
     * @return GetMcpServerResponse
     */
    CompletableFuture<GetMcpServerResponse> getMcpServer(GetMcpServerRequest request);

    /**
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
     * @param request the request parameters of GetParameter  GetParameterRequest
     * @return GetParameterResponse
     */
    CompletableFuture<GetParameterResponse> getParameter(GetParameterRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>This operation supports MaxCompute and HMS (EMR cluster) tables only.</li>
     * </ol>
     * 
     * @param request the request parameters of GetPartition  GetPartitionRequest
     * @return GetPartitionResponse
     */
    CompletableFuture<GetPartitionResponse> getPartition(GetPartitionRequest request);

    /**
     * @param request the request parameters of GetPipelineRun  GetPipelineRunRequest
     * @return GetPipelineRunResponse
     */
    CompletableFuture<GetPipelineRunResponse> getPipelineRun(GetPipelineRunRequest request);

    /**
     * @param request the request parameters of GetProcessDefinition  GetProcessDefinitionRequest
     * @return GetProcessDefinitionResponse
     */
    CompletableFuture<GetProcessDefinitionResponse> getProcessDefinition(GetProcessDefinitionRequest request);

    /**
     * @param request the request parameters of GetProcessInstance  GetProcessInstanceRequest
     * @return GetProcessInstanceResponse
     */
    CompletableFuture<GetProcessInstanceResponse> getProcessInstance(GetProcessInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetProjectMember  GetProjectMemberRequest
     * @return GetProjectMemberResponse
     */
    CompletableFuture<GetProjectMemberResponse> getProjectMember(GetProjectMemberRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</p>
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
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this API operation to query the information only about MaxCompute and Hologres schemas.</li>
     * </ol>
     * 
     * @param request the request parameters of GetSchema  GetSchemaRequest
     * @return GetSchemaResponse
     */
    CompletableFuture<GetSchemaResponse> getSchema(GetSchemaRequest request);

    /**
     * @param request the request parameters of GetSecurityStrategy  GetSecurityStrategyRequest
     * @return GetSecurityStrategyResponse
     */
    CompletableFuture<GetSecurityStrategyResponse> getSecurityStrategy(GetSecurityStrategyRequest request);

    /**
     * @param request the request parameters of GetSkill  GetSkillRequest
     * @return GetSkillResponse
     */
    CompletableFuture<GetSkillResponse> getSkill(GetSkillRequest request);

    /**
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * </blockquote>
     * <ul>
     * <li>You cannot use this API operation to import multiple workflows at a time. If you specify multiple workflows by using FlowSpec, the system imports only the first specified workflow.</li>
     * <li>ImportWorkflowDefinition is an asynchronous operation. After you send a request, an asynchronous task is generated, and the system returns the ID of the asynchronous task. You can call the GetJobStatus operation to query the status of the asynchronous task.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportWorkflowDefinition  ImportWorkflowDefinitionRequest
     * @return ImportWorkflowDefinitionResponse
     */
    CompletableFuture<ImportWorkflowDefinitionResponse> importWorkflowDefinition(ImportWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of ListAgentSessionArtifacts  ListAgentSessionArtifactsRequest
     * @return ListAgentSessionArtifactsResponse
     */
    CompletableFuture<ListAgentSessionArtifactsResponse> listAgentSessionArtifacts(ListAgentSessionArtifactsRequest request);

    /**
     * @param request the request parameters of ListAgentSessions  ListAgentSessionsRequest
     * @return ListAgentSessionsResponse
     */
    CompletableFuture<ListAgentSessionsResponse> listAgentSessions(ListAgentSessionsRequest request);

    /**
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
     * @param request the request parameters of ListColumns  ListColumnsRequest
     * @return ListColumnsResponse
     */
    CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    /**
     * @param request the request parameters of ListComputeResources  ListComputeResourcesRequest
     * @return ListComputeResourcesResponse
     */
    CompletableFuture<ListComputeResourcesResponse> listComputeResources(ListComputeResourcesRequest request);

    /**
     * @param request the request parameters of ListCrawlerTypes  ListCrawlerTypesRequest
     * @return ListCrawlerTypesResponse
     */
    CompletableFuture<ListCrawlerTypesResponse> listCrawlerTypes(ListCrawlerTypesRequest request);

    /**
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of ListDataAssets  ListDataAssetsRequest
     * @return ListDataAssetsResponse
     */
    CompletableFuture<ListDataAssetsResponse> listDataAssets(ListDataAssetsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDataQualityAlertRules  ListDataQualityAlertRulesRequest
     * @return ListDataQualityAlertRulesResponse
     */
    CompletableFuture<ListDataQualityAlertRulesResponse> listDataQualityAlertRules(ListDataQualityAlertRulesRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityEvaluationTaskInstances is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @description This API operation is available for all DataWorks editions.
     * 
     * @param request the request parameters of ListDataQualityEvaluationTaskInstances  ListDataQualityEvaluationTaskInstancesRequest
     * @return ListDataQualityEvaluationTaskInstancesResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityEvaluationTaskInstancesResponse> listDataQualityEvaluationTaskInstances(ListDataQualityEvaluationTaskInstancesRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityEvaluationTasks is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScans instead.  * @description This API operation is available for all DataWorks editions.
     * 
     * @param request the request parameters of ListDataQualityEvaluationTasks  ListDataQualityEvaluationTasksRequest
     * @return ListDataQualityEvaluationTasksResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityEvaluationTasksResponse> listDataQualityEvaluationTasks(ListDataQualityEvaluationTasksRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityResults is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @description This API operation is available for all DataWorks editions.
     * 
     * @param request the request parameters of ListDataQualityResults  ListDataQualityResultsRequest
     * @return ListDataQualityResultsResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityResultsResponse> listDataQualityResults(ListDataQualityResultsRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityRuleTemplates is deprecated, please use dataworks-public::2024-05-18::ListDataQualityTemplates instead.  * @param request  the request parameters of ListDataQualityRuleTemplates  ListDataQualityRuleTemplatesRequest
     * @return ListDataQualityRuleTemplatesResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityRuleTemplatesResponse> listDataQualityRuleTemplates(ListDataQualityRuleTemplatesRequest request);

    /**
     * @deprecated OpenAPI ListDataQualityRules is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScans instead.  * @description This API operation is available for all DataWorks editions.
     * 
     * @param request the request parameters of ListDataQualityRules  ListDataQualityRulesRequest
     * @return ListDataQualityRulesResponse
     */
    @Deprecated
    CompletableFuture<ListDataQualityRulesResponse> listDataQualityRules(ListDataQualityRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDataQualityScanRuns  ListDataQualityScanRunsRequest
     * @return ListDataQualityScanRunsResponse
     */
    CompletableFuture<ListDataQualityScanRunsResponse> listDataQualityScanRuns(ListDataQualityScanRunsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDataQualityScans  ListDataQualityScansRequest
     * @return ListDataQualityScansResponse
     */
    CompletableFuture<ListDataQualityScansResponse> listDataQualityScans(ListDataQualityScansRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDataQualityTemplates  ListDataQualityTemplatesRequest
     * @return ListDataQualityTemplatesResponse
     */
    CompletableFuture<ListDataQualityTemplatesResponse> listDataQualityTemplates(ListDataQualityTemplatesRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>If you want to query the sharing rules of a data source that is associated with Workspace A, you must have the permissions to share the data source in Workspace A. You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
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
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * @param request the request parameters of ListImageAssociatedProjects  ListImageAssociatedProjectsRequest
     * @return ListImageAssociatedProjectsResponse
     */
    CompletableFuture<ListImageAssociatedProjectsResponse> listImageAssociatedProjects(ListImageAssociatedProjectsRequest request);

    /**
     * @param request the request parameters of ListImageVersions  ListImageVersionsRequest
     * @return ListImageVersionsResponse
     */
    CompletableFuture<ListImageVersionsResponse> listImageVersions(ListImageVersionsRequest request);

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * @param request the request parameters of ListLineageRelationships  ListLineageRelationshipsRequest
     * @return ListLineageRelationshipsResponse
     */
    CompletableFuture<ListLineageRelationshipsResponse> listLineageRelationships(ListLineageRelationshipsRequest request);

    /**
     * @param request the request parameters of ListLineages  ListLineagesRequest
     * @return ListLineagesResponse
     */
    CompletableFuture<ListLineagesResponse> listLineages(ListLineagesRequest request);

    /**
     * @param request the request parameters of ListMcpServers  ListMcpServersRequest
     * @return ListMcpServersResponse
     */
    CompletableFuture<ListMcpServersResponse> listMcpServers(ListMcpServersRequest request);

    /**
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
     * @param request the request parameters of ListMyApplications  ListMyApplicationsRequest
     * @return ListMyApplicationsResponse
     */
    CompletableFuture<ListMyApplicationsResponse> listMyApplications(ListMyApplicationsRequest request);

    /**
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
     * @param request the request parameters of ListParameterVersions  ListParameterVersionsRequest
     * @return ListParameterVersionsResponse
     */
    CompletableFuture<ListParameterVersionsResponse> listParameterVersions(ListParameterVersionsRequest request);

    /**
     * @param request the request parameters of ListParameters  ListParametersRequest
     * @return ListParametersResponse
     */
    CompletableFuture<ListParametersResponse> listParameters(ListParametersRequest request);

    /**
     * @param request the request parameters of ListPartitions  ListPartitionsRequest
     * @return ListPartitionsResponse
     */
    CompletableFuture<ListPartitionsResponse> listPartitions(ListPartitionsRequest request);

    /**
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
     * @param request the request parameters of ListPipelineRuns  ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    CompletableFuture<ListPipelineRunsResponse> listPipelineRuns(ListPipelineRunsRequest request);

    /**
     * @param request the request parameters of ListProcessDefinitions  ListProcessDefinitionsRequest
     * @return ListProcessDefinitionsResponse
     */
    CompletableFuture<ListProcessDefinitionsResponse> listProcessDefinitions(ListProcessDefinitionsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>**Make sure that the AliyunServiceRoleForDataWorks service-linked role is created before you call this operation.</li>
     * </ol>
     * 
     * @param request the request parameters of ListResourceGroupAssociateProjects  ListResourceGroupAssociateProjectsRequest
     * @return ListResourceGroupAssociateProjectsResponse
     */
    CompletableFuture<ListResourceGroupAssociateProjectsResponse> listResourceGroupAssociateProjects(ListResourceGroupAssociateProjectsRequest request);

    /**
     * @param request the request parameters of ListResourceGroupMetricData  ListResourceGroupMetricDataRequest
     * @return ListResourceGroupMetricDataResponse
     */
    CompletableFuture<ListResourceGroupMetricDataResponse> listResourceGroupMetricData(ListResourceGroupMetricDataRequest request);

    /**
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListRoutes  ListRoutesRequest
     * @return ListRoutesResponse
     */
    CompletableFuture<ListRoutesResponse> listRoutes(ListRoutesRequest request);

    /**
     * @param request the request parameters of ListSchemas  ListSchemasRequest
     * @return ListSchemasResponse
     */
    CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request);

    /**
     * @param request the request parameters of ListSecurityStrategies  ListSecurityStrategiesRequest
     * @return ListSecurityStrategiesResponse
     */
    CompletableFuture<ListSecurityStrategiesResponse> listSecurityStrategies(ListSecurityStrategiesRequest request);

    /**
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request);

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * You can call this operation to query only the operation logs generated within the previous 31 days.</p>
     * 
     * @param request the request parameters of ListTaskInstanceOperationLogs  ListTaskInstanceOperationLogsRequest
     * @return ListTaskInstanceOperationLogsResponse
     */
    CompletableFuture<ListTaskInstanceOperationLogsResponse> listTaskInstanceOperationLogs(ListTaskInstanceOperationLogsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListTaskInstances  ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     */
    CompletableFuture<ListTaskInstancesResponse> listTaskInstances(ListTaskInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * You can call this operation to query only the operation logs generated within the previous 31 days.</p>
     * 
     * @param request the request parameters of ListTaskOperationLogs  ListTaskOperationLogsRequest
     * @return ListTaskOperationLogsResponse
     */
    CompletableFuture<ListTaskOperationLogsResponse> listTaskOperationLogs(ListTaskOperationLogsRequest request);

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListWorkflowInstances  ListWorkflowInstancesRequest
     * @return ListWorkflowInstancesResponse
     */
    CompletableFuture<ListWorkflowInstancesResponse> listWorkflowInstances(ListWorkflowInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListWorkflows  ListWorkflowsRequest
     * @return ListWorkflowsResponse
     */
    CompletableFuture<ListWorkflowsResponse> listWorkflows(ListWorkflowsRequest request);

    /**
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
     * @param request the request parameters of PromptAgentSession  PromptAgentSessionRequest
     * @return PromptAgentSessionResponse
     */
    CompletableFuture<PromptAgentSessionResponse> promptAgentSession(PromptAgentSessionRequest request);

    ResponseIterable<PromptAgentSessionResponseBody> promptAgentSessionWithResponseIterable(PromptAgentSessionRequest request);

    /**
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of RevokeMemberProjectRoles  RevokeMemberProjectRolesRequest
     * @return RevokeMemberProjectRolesResponse
     */
    CompletableFuture<RevokeMemberProjectRolesResponse> revokeMemberProjectRoles(RevokeMemberProjectRolesRequest request);

    /**
     * @param request the request parameters of RollbackParameter  RollbackParameterRequest
     * @return RollbackParameterResponse
     */
    CompletableFuture<RollbackParameterResponse> rollbackParameter(RollbackParameterRequest request);

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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of StartWorkflowInstances  StartWorkflowInstancesRequest
     * @return StartWorkflowInstancesResponse
     */
    CompletableFuture<StartWorkflowInstancesResponse> startWorkflowInstances(StartWorkflowInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of StopDIJob  StopDIJobRequest
     * @return StopDIJobResponse
     */
    CompletableFuture<StopDIJobResponse> stopDIJob(StopDIJobRequest request);

    /**
     * @param request the request parameters of StopProcessInstance  StopProcessInstanceRequest
     * @return StopProcessInstanceResponse
     */
    CompletableFuture<StopProcessInstanceResponse> stopProcessInstance(StopProcessInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>Your account must be assigned one of the following roles of the desired workspace: Tenant Owner, Workspace Administrator, Deploy, Develop, Workspace Owner, and O\&amp;M</li>
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
     * @param request the request parameters of UpdateColumnBusinessMetadata  UpdateColumnBusinessMetadataRequest
     * @return UpdateColumnBusinessMetadataResponse
     */
    CompletableFuture<UpdateColumnBusinessMetadataResponse> updateColumnBusinessMetadata(UpdateColumnBusinessMetadataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is currently in beta. To join the beta testing, please submit a request. You can call this operation after we add you to the beta program.</p>
     * 
     * @param request the request parameters of UpdateComponent  UpdateComponentRequest
     * @return UpdateComponentResponse
     */
    CompletableFuture<UpdateComponentResponse> updateComponent(UpdateComponentRequest request);

    /**
     * @param request the request parameters of UpdateComputeResource  UpdateComputeResourceRequest
     * @return UpdateComputeResourceResponse
     */
    CompletableFuture<UpdateComputeResourceResponse> updateComputeResource(UpdateComputeResourceRequest request);

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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of UpdateDIJob  UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    CompletableFuture<UpdateDIJobResponse> updateDIJob(UpdateDIJobRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of UpdateDataAssetTag  UpdateDataAssetTagRequest
     * @return UpdateDataAssetTagResponse
     */
    CompletableFuture<UpdateDataAssetTagResponse> updateDataAssetTag(UpdateDataAssetTagRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of UpdateDataQualityAlertRule  UpdateDataQualityAlertRuleRequest
     * @return UpdateDataQualityAlertRuleResponse
     */
    CompletableFuture<UpdateDataQualityAlertRuleResponse> updateDataQualityAlertRule(UpdateDataQualityAlertRuleRequest request);

    /**
     * @deprecated OpenAPI UpdateDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description This API operation is supported in all DataWorks editions.
     * 
     * @param request the request parameters of UpdateDataQualityEvaluationTask  UpdateDataQualityEvaluationTaskRequest
     * @return UpdateDataQualityEvaluationTaskResponse
     */
    @Deprecated
    CompletableFuture<UpdateDataQualityEvaluationTaskResponse> updateDataQualityEvaluationTask(UpdateDataQualityEvaluationTaskRequest request);

    /**
     * @deprecated OpenAPI UpdateDataQualityRule is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @param request  the request parameters of UpdateDataQualityRule  UpdateDataQualityRuleRequest
     * @return UpdateDataQualityRuleResponse
     */
    @Deprecated
    CompletableFuture<UpdateDataQualityRuleResponse> updateDataQualityRule(UpdateDataQualityRuleRequest request);

    /**
     * @deprecated OpenAPI UpdateDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityTemplate instead.  * @param request  the request parameters of UpdateDataQualityRuleTemplate  UpdateDataQualityRuleTemplateRequest
     * @return UpdateDataQualityRuleTemplateResponse
     */
    @Deprecated
    CompletableFuture<UpdateDataQualityRuleTemplateResponse> updateDataQualityRuleTemplate(UpdateDataQualityRuleTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of UpdateDataQualityScan  UpdateDataQualityScanRequest
     * @return UpdateDataQualityScanResponse
     */
    CompletableFuture<UpdateDataQualityScanResponse> updateDataQualityScan(UpdateDataQualityScanRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of UpdateDataQualityTemplate  UpdateDataQualityTemplateRequest
     * @return UpdateDataQualityTemplateResponse
     */
    CompletableFuture<UpdateDataQualityTemplateResponse> updateDataQualityTemplate(UpdateDataQualityTemplateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
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
     * @param request the request parameters of UpdateMcpServer  UpdateMcpServerRequest
     * @return UpdateMcpServerResponse
     */
    CompletableFuture<UpdateMcpServerResponse> updateMcpServer(UpdateMcpServerRequest request);

    /**
     * @param request the request parameters of UpdateMetaCollection  UpdateMetaCollectionRequest
     * @return UpdateMetaCollectionResponse
     */
    CompletableFuture<UpdateMetaCollectionResponse> updateMetaCollection(UpdateMetaCollectionRequest request);

    /**
     * @param request the request parameters of UpdateMetaEntity  UpdateMetaEntityRequest
     * @return UpdateMetaEntityResponse
     */
    CompletableFuture<UpdateMetaEntityResponse> updateMetaEntity(UpdateMetaEntityRequest request);

    /**
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
     * @param request the request parameters of UpdateParameter  UpdateParameterRequest
     * @return UpdateParameterResponse
     */
    CompletableFuture<UpdateParameterResponse> updateParameter(UpdateParameterRequest request);

    /**
     * @param request the request parameters of UpdateProcessDefinition  UpdateProcessDefinitionRequest
     * @return UpdateProcessDefinitionResponse
     */
    CompletableFuture<UpdateProcessDefinitionResponse> updateProcessDefinition(UpdateProcessDefinitionRequest request);

    /**
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
     * @param request the request parameters of UpdateSecurityStrategy  UpdateSecurityStrategyRequest
     * @return UpdateSecurityStrategyResponse
     */
    CompletableFuture<UpdateSecurityStrategyResponse> updateSecurityStrategy(UpdateSecurityStrategyRequest request);

    /**
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
     * <p>This API operation is available for all DataWorks editions.</p>
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of UpdateWorkflow  UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    CompletableFuture<UpdateWorkflowResponse> updateWorkflow(UpdateWorkflowRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple workflows at a time. If you specify multiple workflows in the FlowSpec filed, only the first workflow is created. Other specified workflows and the nodes in the workflows are ignored. You can call the UpdateNode operation to update a node.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateWorkflowDefinition  UpdateWorkflowDefinitionRequest
     * @return UpdateWorkflowDefinitionResponse
     */
    CompletableFuture<UpdateWorkflowDefinitionResponse> updateWorkflowDefinition(UpdateWorkflowDefinitionRequest request);

}
