// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.apig20240327.models.*;
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
     * <p>This operation adds a quota rule based on consumers or consumer groups for an AI gateway. Note that this operation takes effect only for AI gateways of a version later than 2.1.21.</p>
     * <blockquote>
     * <p> Recommended call logic:</p>
     * <ul>
     * <li><ol>
     * <li>Perform a dry run to check for rule conflicts.</li>
     * </ol>
     * </li>
     * <li><ul>
     * <li>Set dryRun to true.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>The response returns a conflict preview that contains conflictHash.</li>
     * </ul>
     * </li>
     * <li><ol start="2">
     * <li>Submit the request after confirmation.</li>
     * </ol>
     * </li>
     * <li><ul>
     * <li>If no conflicts exist: Set dryRun to false and overwrite to false.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If conflicts exist and you confirm to overwrite: Set dryRun to false, overwrite to true, and conflictHash to the value returned in the previous step.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of AddGatewayQuotaRule  AddGatewayQuotaRuleRequest
     * @return AddGatewayQuotaRuleResponse
     */
    CompletableFuture<AddGatewayQuotaRuleResponse> addGatewayQuotaRule(AddGatewayQuotaRuleRequest request);

    /**
     * @param request the request parameters of AddGatewaySecurityGroupRule  AddGatewaySecurityGroupRuleRequest
     * @return AddGatewaySecurityGroupRuleResponse
     */
    CompletableFuture<AddGatewaySecurityGroupRuleResponse> addGatewaySecurityGroupRule(AddGatewaySecurityGroupRuleRequest request);

    /**
     * @param request the request parameters of BatchAddConsumerGroupConsumers  BatchAddConsumerGroupConsumersRequest
     * @return BatchAddConsumerGroupConsumersResponse
     */
    CompletableFuture<BatchAddConsumerGroupConsumersResponse> batchAddConsumerGroupConsumers(BatchAddConsumerGroupConsumersRequest request);

    /**
     * @param request the request parameters of BatchDeleteConsumerAuthorizationRule  BatchDeleteConsumerAuthorizationRuleRequest
     * @return BatchDeleteConsumerAuthorizationRuleResponse
     */
    CompletableFuture<BatchDeleteConsumerAuthorizationRuleResponse> batchDeleteConsumerAuthorizationRule(BatchDeleteConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of BatchExportHttpApis  BatchExportHttpApisRequest
     * @return BatchExportHttpApisResponse
     */
    CompletableFuture<BatchExportHttpApisResponse> batchExportHttpApis(BatchExportHttpApisRequest request);

    /**
     * @param request the request parameters of BatchImportHttpApis  BatchImportHttpApisRequest
     * @return BatchImportHttpApisResponse
     */
    CompletableFuture<BatchImportHttpApisResponse> batchImportHttpApis(BatchImportHttpApisRequest request);

    /**
     * @param request the request parameters of BatchRemoveConsumerGroupConsumers  BatchRemoveConsumerGroupConsumersRequest
     * @return BatchRemoveConsumerGroupConsumersResponse
     */
    CompletableFuture<BatchRemoveConsumerGroupConsumersResponse> batchRemoveConsumerGroupConsumers(BatchRemoveConsumerGroupConsumersRequest request);

    /**
     * @param request the request parameters of BatchUpdateHttpApiOperation  BatchUpdateHttpApiOperationRequest
     * @return BatchUpdateHttpApiOperationResponse
     */
    CompletableFuture<BatchUpdateHttpApiOperationResponse> batchUpdateHttpApiOperation(BatchUpdateHttpApiOperationRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckCommodityStatus  CheckCommodityStatusRequest
     * @return CheckCommodityStatusResponse
     */
    CompletableFuture<CheckCommodityStatusResponse> checkCommodityStatus(CheckCommodityStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a model card for model creation under an existing model provider of a specified AI gateway instance. The target gateway must exist, belong to the current account, and be of the AI gateway type. The modelProvider parameter must reference an existing model provider in the gateway. The modelName must be unique within the same AI gateway instance and model provider. You can create up to 1,000 model cards per gateway instance. The credit parameter currently supports only the fixed type, and the billing unit is Credits per million tokens. If this parameter is not specified, the type defaults to fixed and all costs default to 0. Each item in availablePaths must include both path and type.</p>
     * 
     * @param request the request parameters of CreateAiModelCard  CreateAiModelCardRequest
     * @return CreateAiModelCardResponse
     */
    CompletableFuture<CreateAiModelCardResponse> createAiModelCard(CreateAiModelCardRequest request);

    /**
     * @param request the request parameters of CreateAiModelProvider  CreateAiModelProviderRequest
     * @return CreateAiModelProviderResponse
     */
    CompletableFuture<CreateAiModelProviderResponse> createAiModelProvider(CreateAiModelProviderRequest request);

    /**
     * @param request the request parameters of CreateAndAttachPolicy  CreateAndAttachPolicyRequest
     * @return CreateAndAttachPolicyResponse
     */
    CompletableFuture<CreateAndAttachPolicyResponse> createAndAttachPolicy(CreateAndAttachPolicyRequest request);

    /**
     * @param request the request parameters of CreateChatSession  CreateChatSessionRequest
     * @return CreateChatSessionResponse
     */
    CompletableFuture<CreateChatSessionResponse> createChatSession(CreateChatSessionRequest request);

    /**
     * @param request the request parameters of CreateConsumer  CreateConsumerRequest
     * @return CreateConsumerResponse
     */
    CompletableFuture<CreateConsumerResponse> createConsumer(CreateConsumerRequest request);

    /**
     * @deprecated OpenAPI CreateConsumerAuthorizationRule is deprecated  * @param request  the request parameters of CreateConsumerAuthorizationRule  CreateConsumerAuthorizationRuleRequest
     * @return CreateConsumerAuthorizationRuleResponse
     */
    @Deprecated
    CompletableFuture<CreateConsumerAuthorizationRuleResponse> createConsumerAuthorizationRule(CreateConsumerAuthorizationRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Prerequisites: Before creating a consumer authorization rule, prepare resources according to the following dependency chain (the corresponding creation APIs and ID passing relationships are in parentheses):
     * Gateway instance (CreateGateway → gatewayId, with the gw- prefix)
     * Environment (A default environment is automatically created after the gateway is created. You can also call CreateEnvironment → environmentId, with the env- prefix. The gatewayId from Step 1 is required.)
     * HTTP API (CreateHttpApi → httpApiId, with the api- prefix)
     * Route and publish (CreateHttpApiRoute → routeId, with the hr- prefix, which belongs to the API in Step 3. Then, call DeployHttpApi to publish it to the environment in Step 2. Unpublished routes cannot be authorized.)
     * Consumer (CreateConsumer → consumerId, with the cs- prefix, or consumerGroupId, with the csg- prefix. Choose either consumerId or consumerGroupId.)</p>
     * 
     * @param request the request parameters of CreateConsumerAuthorizationRules  CreateConsumerAuthorizationRulesRequest
     * @return CreateConsumerAuthorizationRulesResponse
     */
    CompletableFuture<CreateConsumerAuthorizationRulesResponse> createConsumerAuthorizationRules(CreateConsumerAuthorizationRulesRequest request);

    /**
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
     * @param request the request parameters of CreateDeveloper  CreateDeveloperRequest
     * @return CreateDeveloperResponse
     */
    CompletableFuture<CreateDeveloperResponse> createDeveloper(CreateDeveloperRequest request);

    /**
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * @deprecated OpenAPI CreateEnvironment is deprecated  * @param request  the request parameters of CreateEnvironment  CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    @Deprecated
    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    /**
     * @param request the request parameters of CreateGateway  CreateGatewayRequest
     * @return CreateGatewayResponse
     */
    CompletableFuture<CreateGatewayResponse> createGateway(CreateGatewayRequest request);

    /**
     * <b>description</b> :
     * <h2>调用流程</h2>
     * <p>本接口为指定网关配额规则下的一个消费者或消费者组创建消费明细导出任务，导出内容来自网关访问日志。</p>
     * <ol>
     * <li>调用本接口获取 taskId。新任务返回 Pending，表示已提交，文件尚未生成。</li>
     * <li>使用相同的 gatewayId、ruleId、subjectId 和返回的 taskId 调用 GetGatewayQuotaRuleSubjectUsageExportTask，轮询任务状态。</li>
     * <li>当轮询状态为 Success 且文件未过期时，通过GetGatewayQuotaRuleSubjectUsageExportTask下载 csv.gz 文件；状态为 Failed 时，根据 errorMessage 排查后重新创建任务。</li>
     * </ol>
     * <h2>使用条件与限制</h2>
     * <ul>
     * <li>创建任务时，配额规则必须存在，且目标主体已绑定到该规则。消费者规则使用消费者 ID，消费者组规则使用消费者组 ID。</li>
     * <li>有效导出时间范围内的明细依赖网关访问日志投递，请先启用日志投递并确认所需时段的日志可查询。</li>
     * <li>单次导出时间跨度不得超过一个规则周期。单次最多导出 100000 条明细；后台统计结果超过上限时任务失败，请缩小时间范围后重试。</li>
     * <li>同一用户在当前地域对同一网关、规则和主体在最近 10 分钟内已有 Pending 或 Running 任务时，重复创建会被拒绝；最近 10 分钟内创建且仍为 Pending 或 Running 的导出任务总数达到 3 个时也会被拒绝。请等待已有任务结束。相同 clientToken、相同参数的幂等重试可复用已有任务。</li>
     * <li>任务自创建起的处理超时为 10 分钟。超时后任务按 Failed 处理；这不是任务必定成功完成的时限承诺。</li>
     * <li>创建时确定导出时间范围、计量维度和主体名称，后续查询不会重新计算这些条件。文件成功生成后可在 24 小时内获取下载链接；每次查询生成的签名链接有效期为 10 分钟，具体时间以查询结果为准。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateGatewayQuotaRuleSubjectUsageExportTask  CreateGatewayQuotaRuleSubjectUsageExportTaskRequest
     * @return CreateGatewayQuotaRuleSubjectUsageExportTaskResponse
     */
    CompletableFuture<CreateGatewayQuotaRuleSubjectUsageExportTaskResponse> createGatewayQuotaRuleSubjectUsageExportTask(CreateGatewayQuotaRuleSubjectUsageExportTaskRequest request);

    /**
     * @param request the request parameters of CreateHttpApi  CreateHttpApiRequest
     * @return CreateHttpApiResponse
     */
    CompletableFuture<CreateHttpApiResponse> createHttpApi(CreateHttpApiRequest request);

    /**
     * @param request the request parameters of CreateHttpApiOperation  CreateHttpApiOperationRequest
     * @return CreateHttpApiOperationResponse
     */
    CompletableFuture<CreateHttpApiOperationResponse> createHttpApiOperation(CreateHttpApiOperationRequest request);

    /**
     * @param request the request parameters of CreateHttpApiRoute  CreateHttpApiRouteRequest
     * @return CreateHttpApiRouteResponse
     */
    CompletableFuture<CreateHttpApiRouteResponse> createHttpApiRoute(CreateHttpApiRouteRequest request);

    /**
     * <b>description</b> :
     * <p>The operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of CreateHttpApiVersion  CreateHttpApiVersionRequest
     * @return CreateHttpApiVersionResponse
     */
    CompletableFuture<CreateHttpApiVersionResponse> createHttpApiVersion(CreateHttpApiVersionRequest request);

    /**
     * @param request the request parameters of CreateMcpServer  CreateMcpServerRequest
     * @return CreateMcpServerResponse
     */
    CompletableFuture<CreateMcpServerResponse> createMcpServer(CreateMcpServerRequest request);

    /**
     * @param request the request parameters of CreateMigrationTask  CreateMigrationTaskRequest
     * @return CreateMigrationTaskResponse
     */
    CompletableFuture<CreateMigrationTaskResponse> createMigrationTask(CreateMigrationTaskRequest request);

    /**
     * @param request the request parameters of CreatePluginAttachment  CreatePluginAttachmentRequest
     * @return CreatePluginAttachmentResponse
     */
    CompletableFuture<CreatePluginAttachmentResponse> createPluginAttachment(CreatePluginAttachmentRequest request);

    /**
     * @param request the request parameters of CreatePluginClass  CreatePluginClassRequest
     * @return CreatePluginClassResponse
     */
    CompletableFuture<CreatePluginClassResponse> createPluginClass(CreatePluginClassRequest request);

    /**
     * @param request the request parameters of CreatePluginWorkspace  CreatePluginWorkspaceRequest
     * @return CreatePluginWorkspaceResponse
     */
    CompletableFuture<CreatePluginWorkspaceResponse> createPluginWorkspace(CreatePluginWorkspaceRequest request);

    /**
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * @param request the request parameters of CreatePolicyAttachment  CreatePolicyAttachmentRequest
     * @return CreatePolicyAttachmentResponse
     */
    CompletableFuture<CreatePolicyAttachmentResponse> createPolicyAttachment(CreatePolicyAttachmentRequest request);

    /**
     * @param request the request parameters of CreatePortal  CreatePortalRequest
     * @return CreatePortalResponse
     */
    CompletableFuture<CreatePortalResponse> createPortal(CreatePortalRequest request);

    /**
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * @param request the request parameters of CreateProductCategory  CreateProductCategoryRequest
     * @return CreateProductCategoryResponse
     */
    CompletableFuture<CreateProductCategoryResponse> createProductCategory(CreateProductCategoryRequest request);

    /**
     * @param request the request parameters of CreateProductRef  CreateProductRefRequest
     * @return CreateProductRefResponse
     */
    CompletableFuture<CreateProductRefResponse> createProductRef(CreateProductRefRequest request);

    /**
     * @param request the request parameters of CreateRiskCheckTask  CreateRiskCheckTaskRequest
     * @return CreateRiskCheckTaskResponse
     */
    CompletableFuture<CreateRiskCheckTaskResponse> createRiskCheckTask(CreateRiskCheckTaskRequest request);

    /**
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    /**
     * @param request the request parameters of CreateServiceVersion  CreateServiceVersionRequest
     * @return CreateServiceVersionResponse
     */
    CompletableFuture<CreateServiceVersionResponse> createServiceVersion(CreateServiceVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Before creating a source, you must prepare the dependent resources for the source. For the K8S type, an existing ACK container service cluster is required. You can invoke ListK8sClusterSources to query active clusters. For the MSE_NACOS type, an existing MSE Nacos instance is required. You can invoke ListMseNacosSources to query active instances.</p>
     * 
     * @param request the request parameters of CreateSource  CreateSourceRequest
     * @return CreateSourceResponse
     */
    CompletableFuture<CreateSourceResponse> createSource(CreateSourceRequest request);

    /**
     * @param request the request parameters of DeleteAiModelCard  DeleteAiModelCardRequest
     * @return DeleteAiModelCardResponse
     */
    CompletableFuture<DeleteAiModelCardResponse> deleteAiModelCard(DeleteAiModelCardRequest request);

    /**
     * @param request the request parameters of DeleteAiModelProvider  DeleteAiModelProviderRequest
     * @return DeleteAiModelProviderResponse
     */
    CompletableFuture<DeleteAiModelProviderResponse> deleteAiModelProvider(DeleteAiModelProviderRequest request);

    /**
     * @param request the request parameters of DeleteConsumer  DeleteConsumerRequest
     * @return DeleteConsumerResponse
     */
    CompletableFuture<DeleteConsumerResponse> deleteConsumer(DeleteConsumerRequest request);

    /**
     * @deprecated OpenAPI DeleteConsumerAuthorizationRule is deprecated  * @param request  the request parameters of DeleteConsumerAuthorizationRule  DeleteConsumerAuthorizationRuleRequest
     * @return DeleteConsumerAuthorizationRuleResponse
     */
    @Deprecated
    CompletableFuture<DeleteConsumerAuthorizationRuleResponse> deleteConsumerAuthorizationRule(DeleteConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @deprecated OpenAPI DeleteEnvironment is deprecated  * @param request  the request parameters of DeleteEnvironment  DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     */
    @Deprecated
    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    /**
     * @param request the request parameters of DeleteGateway  DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a quota rule based on a consumer or consumer group for an AI gateway. Note that this operation takes effect only for AI gateways whose version is later than 2.1.19.</p>
     * 
     * @param request the request parameters of DeleteGatewayQuotaRule  DeleteGatewayQuotaRuleRequest
     * @return DeleteGatewayQuotaRuleResponse
     */
    CompletableFuture<DeleteGatewayQuotaRuleResponse> deleteGatewayQuotaRule(DeleteGatewayQuotaRuleRequest request);

    /**
     * @param request the request parameters of DeleteGatewaySecurityGroupRule  DeleteGatewaySecurityGroupRuleRequest
     * @return DeleteGatewaySecurityGroupRuleResponse
     */
    CompletableFuture<DeleteGatewaySecurityGroupRuleResponse> deleteGatewaySecurityGroupRule(DeleteGatewaySecurityGroupRuleRequest request);

    /**
     * @param request the request parameters of DeleteHttpApi  DeleteHttpApiRequest
     * @return DeleteHttpApiResponse
     */
    CompletableFuture<DeleteHttpApiResponse> deleteHttpApi(DeleteHttpApiRequest request);

    /**
     * @param request the request parameters of DeleteHttpApiOperation  DeleteHttpApiOperationRequest
     * @return DeleteHttpApiOperationResponse
     */
    CompletableFuture<DeleteHttpApiOperationResponse> deleteHttpApiOperation(DeleteHttpApiOperationRequest request);

    /**
     * @param request the request parameters of DeleteHttpApiRoute  DeleteHttpApiRouteRequest
     * @return DeleteHttpApiRouteResponse
     */
    CompletableFuture<DeleteHttpApiRouteResponse> deleteHttpApiRoute(DeleteHttpApiRouteRequest request);

    /**
     * @param request the request parameters of DeleteMcpServer  DeleteMcpServerRequest
     * @return DeleteMcpServerResponse
     */
    CompletableFuture<DeleteMcpServerResponse> deleteMcpServer(DeleteMcpServerRequest request);

    /**
     * @param request the request parameters of DeleteMigrationTask  DeleteMigrationTaskRequest
     * @return DeleteMigrationTaskResponse
     */
    CompletableFuture<DeleteMigrationTaskResponse> deleteMigrationTask(DeleteMigrationTaskRequest request);

    /**
     * @param request the request parameters of DeletePluginAttachment  DeletePluginAttachmentRequest
     * @return DeletePluginAttachmentResponse
     */
    CompletableFuture<DeletePluginAttachmentResponse> deletePluginAttachment(DeletePluginAttachmentRequest request);

    /**
     * @param request the request parameters of DeletePluginClass  DeletePluginClassRequest
     * @return DeletePluginClassResponse
     */
    CompletableFuture<DeletePluginClassResponse> deletePluginClass(DeletePluginClassRequest request);

    /**
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * @param request the request parameters of DeletePolicyAttachment  DeletePolicyAttachmentRequest
     * @return DeletePolicyAttachmentResponse
     */
    CompletableFuture<DeletePolicyAttachmentResponse> deletePolicyAttachment(DeletePolicyAttachmentRequest request);

    /**
     * @param request the request parameters of DeletePortal  DeletePortalRequest
     * @return DeletePortalResponse
     */
    CompletableFuture<DeletePortalResponse> deletePortal(DeletePortalRequest request);

    /**
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    /**
     * @param request the request parameters of DeleteProductCategory  DeleteProductCategoryRequest
     * @return DeleteProductCategoryResponse
     */
    CompletableFuture<DeleteProductCategoryResponse> deleteProductCategory(DeleteProductCategoryRequest request);

    /**
     * @param request the request parameters of DeleteProductRef  DeleteProductRefRequest
     * @return DeleteProductRefResponse
     */
    CompletableFuture<DeleteProductRefResponse> deleteProductRef(DeleteProductRefRequest request);

    /**
     * <b>description</b> :
     * <p>The operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    /**
     * @param request the request parameters of DeleteService  DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    /**
     * @param request the request parameters of DeleteServiceVersion  DeleteServiceVersionRequest
     * @return DeleteServiceVersionResponse
     */
    CompletableFuture<DeleteServiceVersionResponse> deleteServiceVersion(DeleteServiceVersionRequest request);

    /**
     * @param request the request parameters of DeleteSource  DeleteSourceRequest
     * @return DeleteSourceResponse
     */
    CompletableFuture<DeleteSourceResponse> deleteSource(DeleteSourceRequest request);

    /**
     * <b>description</b> :
     * <p>Before deployment, the following prerequisites must be met in order: (1) A gateway is created. (2) An HTTP API is created and associated with the gateway by using belongGatewayId. (3) A route is created and associated with an environment by using environmentId. (4) The route is associated with the default subdomain of the environment. Associating only a custom dedicated domain name is insufficient to trigger deployment. You must first call UpdateHttpApiRoute to add the default subdomain of the environment to the route.</p>
     * 
     * @param request the request parameters of DeployHttpApi  DeployHttpApiRequest
     * @return DeployHttpApiResponse
     */
    CompletableFuture<DeployHttpApiResponse> deployHttpApi(DeployHttpApiRequest request);

    /**
     * <b>description</b> :
     * <p>Before deployment, ensure that domainIds have been configured for the MCP server by calling CreateMcpServer or UpdateMcpServer. Call GetMcpServer to confirm the domain name bindng status.</p>
     * 
     * @param request the request parameters of DeployMcpServer  DeployMcpServerRequest
     * @return DeployMcpServerResponse
     */
    CompletableFuture<DeployMcpServerResponse> deployMcpServer(DeployMcpServerRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DetachAndDeletePolicy  DetachAndDeletePolicyRequest
     * @return DetachAndDeletePolicyResponse
     */
    CompletableFuture<DetachAndDeletePolicyResponse> detachAndDeletePolicy(DetachAndDeletePolicyRequest request);

    /**
     * @param request the request parameters of ExportHttpApi  ExportHttpApiRequest
     * @return ExportHttpApiResponse
     */
    CompletableFuture<ExportHttpApiResponse> exportHttpApi(ExportHttpApiRequest request);

    /**
     * @param request the request parameters of GetAiModelCard  GetAiModelCardRequest
     * @return GetAiModelCardResponse
     */
    CompletableFuture<GetAiModelCardResponse> getAiModelCard(GetAiModelCardRequest request);

    /**
     * @param request the request parameters of GetAiModelProvider  GetAiModelProviderRequest
     * @return GetAiModelProviderResponse
     */
    CompletableFuture<GetAiModelProviderResponse> getAiModelProvider(GetAiModelProviderRequest request);

    /**
     * @param request the request parameters of GetApiPathFieldConfig  GetApiPathFieldConfigRequest
     * @return GetApiPathFieldConfigResponse
     */
    CompletableFuture<GetApiPathFieldConfigResponse> getApiPathFieldConfig(GetApiPathFieldConfigRequest request);

    /**
     * @param request the request parameters of GetApiPathFieldTemplate  GetApiPathFieldTemplateRequest
     * @return GetApiPathFieldTemplateResponse
     */
    CompletableFuture<GetApiPathFieldTemplateResponse> getApiPathFieldTemplate(GetApiPathFieldTemplateRequest request);

    /**
     * @param request the request parameters of GetBatchExportTask  GetBatchExportTaskRequest
     * @return GetBatchExportTaskResponse
     */
    CompletableFuture<GetBatchExportTaskResponse> getBatchExportTask(GetBatchExportTaskRequest request);

    /**
     * @param request the request parameters of GetBatchImportTask  GetBatchImportTaskRequest
     * @return GetBatchImportTaskResponse
     */
    CompletableFuture<GetBatchImportTaskResponse> getBatchImportTask(GetBatchImportTaskRequest request);

    /**
     * @param request the request parameters of GetConsumer  GetConsumerRequest
     * @return GetConsumerResponse
     */
    CompletableFuture<GetConsumerResponse> getConsumer(GetConsumerRequest request);

    /**
     * @deprecated OpenAPI GetConsumerAuthorizationRule is deprecated  * @param request  the request parameters of GetConsumerAuthorizationRule  GetConsumerAuthorizationRuleRequest
     * @return GetConsumerAuthorizationRuleResponse
     */
    @Deprecated
    CompletableFuture<GetConsumerAuthorizationRuleResponse> getConsumerAuthorizationRule(GetConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of GetConsumerGroup  GetConsumerGroupRequest
     * @return GetConsumerGroupResponse
     */
    CompletableFuture<GetConsumerGroupResponse> getConsumerGroup(GetConsumerGroupRequest request);

    /**
     * @param request the request parameters of GetDashboard  GetDashboardRequest
     * @return GetDashboardResponse
     */
    CompletableFuture<GetDashboardResponse> getDashboard(GetDashboardRequest request);

    /**
     * @param request the request parameters of GetDeveloper  GetDeveloperRequest
     * @return GetDeveloperResponse
     */
    CompletableFuture<GetDeveloperResponse> getDeveloper(GetDeveloperRequest request);

    /**
     * @param request the request parameters of GetDomain  GetDomainRequest
     * @return GetDomainResponse
     */
    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    /**
     * @deprecated OpenAPI GetEnvironment is deprecated  * @param request  the request parameters of GetEnvironment  GetEnvironmentRequest
     * @return GetEnvironmentResponse
     */
    @Deprecated
    CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request);

    /**
     * @param request the request parameters of GetGateway  GetGatewayRequest
     * @return GetGatewayResponse
     */
    CompletableFuture<GetGatewayResponse> getGateway(GetGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the dynamic forwarding ExtProc gRPC service and port currently bound to the specified gateway. If no service is bound, bound=false is returned.</p>
     * 
     * @param request the request parameters of GetGatewayDfpExtProcService  GetGatewayDfpExtProcServiceRequest
     * @return GetGatewayDfpExtProcServiceResponse
     */
    CompletableFuture<GetGatewayDfpExtProcServiceResponse> getGatewayDfpExtProcService(GetGatewayDfpExtProcServiceRequest request);

    /**
     * @param request the request parameters of GetGatewayElasticPolicy  GetGatewayElasticPolicyRequest
     * @return GetGatewayElasticPolicyResponse
     */
    CompletableFuture<GetGatewayElasticPolicyResponse> getGatewayElasticPolicy(GetGatewayElasticPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries a specific consumer quota rule on an AI gateway.</p>
     * 
     * @param request the request parameters of GetGatewayQuotaRule  GetGatewayQuotaRuleRequest
     * @return GetGatewayQuotaRuleResponse
     */
    CompletableFuture<GetGatewayQuotaRuleResponse> getGatewayQuotaRule(GetGatewayQuotaRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This operation retrieves the usage details of a specific consumption subject under a quota rule. Note that this operation takes effect only for AI gateways of a version later than 2.1.19. Prerequisites: Before calling this operation, make sure that Simple Log Service (SLS) log delivery is enabled for the target gateway by calling UpdateGatewayFeature(name=log-config, value={&quot;enable&quot;:true}). Otherwise, the CloudProductInactive.LogDeliveryNotEnabled error is returned.</p>
     * 
     * @param request the request parameters of GetGatewayQuotaRuleSubjectUsage  GetGatewayQuotaRuleSubjectUsageRequest
     * @return GetGatewayQuotaRuleSubjectUsageResponse
     */
    CompletableFuture<GetGatewayQuotaRuleSubjectUsageResponse> getGatewayQuotaRuleSubjectUsage(GetGatewayQuotaRuleSubjectUsageRequest request);

    /**
     * <b>description</b> :
     * <h2>Call flow</h2>
     * <p>First, call CreateGatewayQuotaRuleSubjectUsageExportTask to create a task. Then, use the returned taskId along with the same gatewayId, ruleId, and subjectId to call this operation in the same region.</p>
     * <ul>
     * <li>Pending or Running: The task is not completed. You can query again after a period of time.</li>
     * <li>Success: Check result.fileExpired and result.downloadUrl. If the file is not expired and a link is returned, you can download the file.</li>
     * <li>Failed: Troubleshoot the issue based on errorMessage. To re-export, call the create operation and use a new clientToken.</li>
     * </ul>
     * <h2>Download link and file validity period</h2>
     * <p>For each successful query where the file is not expired, a signed link with a validity period of 10 minutes is generated. Download the file promptly based on downloadUrlExpiredAt. If the link expires but the file has not reached fileExpiredAt, you can query again to obtain a new link. Querying again does not regenerate the file or extend the 24-hour validity period of the file.
     * After the file reaches fileExpiredAt, this operation no longer issues new links, returns fileExpired=true, and omits downloadUrl and downloadUrlExpiredAt. The task status remains Success. To export again, create a new task.</p>
     * <h2>Query scope and task progress</h2>
     * <p>This operation returns only the export tasks of the current user in the current region that match the gateway, rule, and subject paths. If the paths do not match or the task does not exist, a not found error is returned. Existing tasks are queried based on the information recorded at creation. The export conditions are not recalculated due to subsequent rule resets or subject name changes.
     * If a task remains in the Pending or Running state for more than 10 minutes after creation, the query treats it as a timeout failure. Determine whether the task is completed based on the status, not just totalCount or processedCount.</p>
     * 
     * @param request the request parameters of GetGatewayQuotaRuleSubjectUsageExportTask  GetGatewayQuotaRuleSubjectUsageExportTaskRequest
     * @return GetGatewayQuotaRuleSubjectUsageExportTaskResponse
     */
    CompletableFuture<GetGatewayQuotaRuleSubjectUsageExportTaskResponse> getGatewayQuotaRuleSubjectUsageExportTask(GetGatewayQuotaRuleSubjectUsageExportTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the usage, effective limits, and statistical scopes of nine resource quotas for a specified API gateway or AI gateway. This operation is read-only. A successful response includes all nine items. Quota values for custom plug-ins are not displayed. The result is a current observation read independently from various sources and does not guarantee the success of subsequent resource creation.</p>
     * 
     * @param request the request parameters of GetGatewayResourceQuotaUsage  GetGatewayResourceQuotaUsageRequest
     * @return GetGatewayResourceQuotaUsageResponse
     */
    CompletableFuture<GetGatewayResourceQuotaUsageResponse> getGatewayResourceQuotaUsage(GetGatewayResourceQuotaUsageRequest request);

    /**
     * @param request the request parameters of GetHiMarketConsumer  GetHiMarketConsumerRequest
     * @return GetHiMarketConsumerResponse
     */
    CompletableFuture<GetHiMarketConsumerResponse> getHiMarketConsumer(GetHiMarketConsumerRequest request);

    /**
     * @param request the request parameters of GetHiMarketConsumerCredential  GetHiMarketConsumerCredentialRequest
     * @return GetHiMarketConsumerCredentialResponse
     */
    CompletableFuture<GetHiMarketConsumerCredentialResponse> getHiMarketConsumerCredential(GetHiMarketConsumerCredentialRequest request);

    /**
     * @param request the request parameters of GetHttpApi  GetHttpApiRequest
     * @return GetHttpApiResponse
     */
    CompletableFuture<GetHttpApiResponse> getHttpApi(GetHttpApiRequest request);

    /**
     * @param request the request parameters of GetHttpApiOperation  GetHttpApiOperationRequest
     * @return GetHttpApiOperationResponse
     */
    CompletableFuture<GetHttpApiOperationResponse> getHttpApiOperation(GetHttpApiOperationRequest request);

    /**
     * @param request the request parameters of GetHttpApiRoute  GetHttpApiRouteRequest
     * @return GetHttpApiRouteResponse
     */
    CompletableFuture<GetHttpApiRouteResponse> getHttpApiRoute(GetHttpApiRouteRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of GetMcpServer  GetMcpServerRequest
     * @return GetMcpServerResponse
     */
    CompletableFuture<GetMcpServerResponse> getMcpServer(GetMcpServerRequest request);

    /**
     * @param request the request parameters of GetMigrationNamespacedServices  GetMigrationNamespacedServicesRequest
     * @return GetMigrationNamespacedServicesResponse
     */
    CompletableFuture<GetMigrationNamespacedServicesResponse> getMigrationNamespacedServices(GetMigrationNamespacedServicesRequest request);

    /**
     * @param request the request parameters of GetMigrationTask  GetMigrationTaskRequest
     * @return GetMigrationTaskResponse
     */
    CompletableFuture<GetMigrationTaskResponse> getMigrationTask(GetMigrationTaskRequest request);

    /**
     * @param request the request parameters of GetPluginAttachment  GetPluginAttachmentRequest
     * @return GetPluginAttachmentResponse
     */
    CompletableFuture<GetPluginAttachmentResponse> getPluginAttachment(GetPluginAttachmentRequest request);

    /**
     * @param request the request parameters of GetPluginClass  GetPluginClassRequest
     * @return GetPluginClassResponse
     */
    CompletableFuture<GetPluginClassResponse> getPluginClass(GetPluginClassRequest request);

    /**
     * @param request the request parameters of GetPluginWorkspace  GetPluginWorkspaceRequest
     * @return GetPluginWorkspaceResponse
     */
    CompletableFuture<GetPluginWorkspaceResponse> getPluginWorkspace(GetPluginWorkspaceRequest request);

    /**
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    /**
     * @param request the request parameters of GetPolicyAttachment  GetPolicyAttachmentRequest
     * @return GetPolicyAttachmentResponse
     */
    CompletableFuture<GetPolicyAttachmentResponse> getPolicyAttachment(GetPolicyAttachmentRequest request);

    /**
     * @param request the request parameters of GetPortal  GetPortalRequest
     * @return GetPortalResponse
     */
    CompletableFuture<GetPortalResponse> getPortal(GetPortalRequest request);

    /**
     * @param request the request parameters of GetProduct  GetProductRequest
     * @return GetProductResponse
     */
    CompletableFuture<GetProductResponse> getProduct(GetProductRequest request);

    /**
     * @param request the request parameters of GetProductCategory  GetProductCategoryRequest
     * @return GetProductCategoryResponse
     */
    CompletableFuture<GetProductCategoryResponse> getProductCategory(GetProductCategoryRequest request);

    /**
     * @param request the request parameters of GetProductRef  GetProductRefRequest
     * @return GetProductRefResponse
     */
    CompletableFuture<GetProductRefResponse> getProductRef(GetProductRefRequest request);

    /**
     * @param request the request parameters of GetResourceOverview  GetResourceOverviewRequest
     * @return GetResourceOverviewResponse
     */
    CompletableFuture<GetResourceOverviewResponse> getResourceOverview(GetResourceOverviewRequest request);

    /**
     * @param request the request parameters of GetRiskNotification  GetRiskNotificationRequest
     * @return GetRiskNotificationResponse
     */
    CompletableFuture<GetRiskNotificationResponse> getRiskNotification(GetRiskNotificationRequest request);

    /**
     * <b>description</b> :
     * <p>The operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of GetSecret  GetSecretRequest
     * @return GetSecretResponse
     */
    CompletableFuture<GetSecretResponse> getSecret(GetSecretRequest request);

    /**
     * <b>description</b> :
     * <p>The operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of GetSecretValue  GetSecretValueRequest
     * @return GetSecretValueResponse
     */
    CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request);

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    /**
     * @param request the request parameters of GetSource  GetSourceRequest
     * @return GetSourceResponse
     */
    CompletableFuture<GetSourceResponse> getSource(GetSourceRequest request);

    /**
     * @param request the request parameters of GetTraceConfig  GetTraceConfigRequest
     * @return GetTraceConfigResponse
     */
    CompletableFuture<GetTraceConfigResponse> getTraceConfig(GetTraceConfigRequest request);

    /**
     * @param request the request parameters of HandleOidcCallback  HandleOidcCallbackRequest
     * @return HandleOidcCallbackResponse
     */
    CompletableFuture<HandleOidcCallbackResponse> handleOidcCallback(HandleOidcCallbackRequest request);

    /**
     * @param request the request parameters of ImportHttpApi  ImportHttpApiRequest
     * @return ImportHttpApiResponse
     */
    CompletableFuture<ImportHttpApiResponse> importHttpApi(ImportHttpApiRequest request);

    /**
     * @param request the request parameters of InitiateOidcAuth  InitiateOidcAuthRequest
     * @return InitiateOidcAuthResponse
     */
    CompletableFuture<InitiateOidcAuthResponse> initiateOidcAuth(InitiateOidcAuthRequest request);

    /**
     * @param request the request parameters of InstallPlugin  InstallPluginRequest
     * @return InstallPluginResponse
     */
    CompletableFuture<InstallPluginResponse> installPlugin(InstallPluginRequest request);

    /**
     * @param request the request parameters of InvokeAIAgent  InvokeAIAgentRequest
     * @return InvokeAIAgentResponse
     */
    CompletableFuture<InvokeAIAgentResponse> invokeAIAgent(InvokeAIAgentRequest request);

    ResponseIterable<InvokeAIAgentResponseBody> invokeAIAgentWithResponseIterable(InvokeAIAgentRequest request);

    /**
     * @param request the request parameters of ListAiModelCards  ListAiModelCardsRequest
     * @return ListAiModelCardsResponse
     */
    CompletableFuture<ListAiModelCardsResponse> listAiModelCards(ListAiModelCardsRequest request);

    /**
     * @param request the request parameters of ListAiModelProviders  ListAiModelProvidersRequest
     * @return ListAiModelProvidersResponse
     */
    CompletableFuture<ListAiModelProvidersResponse> listAiModelProviders(ListAiModelProvidersRequest request);

    /**
     * @param request the request parameters of ListApiPathFieldTemplates  ListApiPathFieldTemplatesRequest
     * @return ListApiPathFieldTemplatesResponse
     */
    CompletableFuture<ListApiPathFieldTemplatesResponse> listApiPathFieldTemplates(ListApiPathFieldTemplatesRequest request);

    /**
     * @param request the request parameters of ListBatchExportTasks  ListBatchExportTasksRequest
     * @return ListBatchExportTasksResponse
     */
    CompletableFuture<ListBatchExportTasksResponse> listBatchExportTasks(ListBatchExportTasksRequest request);

    /**
     * @param request the request parameters of ListChatSessions  ListChatSessionsRequest
     * @return ListChatSessionsResponse
     */
    CompletableFuture<ListChatSessionsResponse> listChatSessions(ListChatSessionsRequest request);

    /**
     * @deprecated OpenAPI ListConsumerAuthorizationRules is deprecated  * @param request  the request parameters of ListConsumerAuthorizationRules  ListConsumerAuthorizationRulesRequest
     * @return ListConsumerAuthorizationRulesResponse
     */
    @Deprecated
    CompletableFuture<ListConsumerAuthorizationRulesResponse> listConsumerAuthorizationRules(ListConsumerAuthorizationRulesRequest request);

    /**
     * @param request the request parameters of ListConsumerGroupConsumers  ListConsumerGroupConsumersRequest
     * @return ListConsumerGroupConsumersResponse
     */
    CompletableFuture<ListConsumerGroupConsumersResponse> listConsumerGroupConsumers(ListConsumerGroupConsumersRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the quota rules directly bound to the specified consumer group without expanding the rules bound to individual consumers within the group. Returns an empty list if no direct binding exists.</p>
     * 
     * @param request the request parameters of ListConsumerGroupQuotaRules  ListConsumerGroupQuotaRulesRequest
     * @return ListConsumerGroupQuotaRulesResponse
     */
    CompletableFuture<ListConsumerGroupQuotaRulesResponse> listConsumerGroupQuotaRules(ListConsumerGroupQuotaRulesRequest request);

    /**
     * @param request the request parameters of ListConsumerGroups  ListConsumerGroupsRequest
     * @return ListConsumerGroupsResponse
     */
    CompletableFuture<ListConsumerGroupsResponse> listConsumerGroups(ListConsumerGroupsRequest request);

    /**
     * @param request the request parameters of ListConsumerQuotaRules  ListConsumerQuotaRulesRequest
     * @return ListConsumerQuotaRulesResponse
     */
    CompletableFuture<ListConsumerQuotaRulesResponse> listConsumerQuotaRules(ListConsumerQuotaRulesRequest request);

    /**
     * @param request the request parameters of ListConsumers  ListConsumersRequest
     * @return ListConsumersResponse
     */
    CompletableFuture<ListConsumersResponse> listConsumers(ListConsumersRequest request);

    /**
     * @param request the request parameters of ListDevelopers  ListDevelopersRequest
     * @return ListDevelopersResponse
     */
    CompletableFuture<ListDevelopersResponse> listDevelopers(ListDevelopersRequest request);

    /**
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
     * @deprecated OpenAPI ListEnvironments is deprecated  * @param request  the request parameters of ListEnvironments  ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    @Deprecated
    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of ListExternalServices  ListExternalServicesRequest
     * @return ListExternalServicesResponse
     */
    CompletableFuture<ListExternalServicesResponse> listExternalServices(ListExternalServicesRequest request);

    /**
     * @param request the request parameters of ListGatewayAuthorizableSecurityGroups  ListGatewayAuthorizableSecurityGroupsRequest
     * @return ListGatewayAuthorizableSecurityGroupsResponse
     */
    CompletableFuture<ListGatewayAuthorizableSecurityGroupsResponse> listGatewayAuthorizableSecurityGroups(ListGatewayAuthorizableSecurityGroupsRequest request);

    /**
     * @param request the request parameters of ListGatewayAuthorizedSecurityGroupRules  ListGatewayAuthorizedSecurityGroupRulesRequest
     * @return ListGatewayAuthorizedSecurityGroupRulesResponse
     */
    CompletableFuture<ListGatewayAuthorizedSecurityGroupRulesResponse> listGatewayAuthorizedSecurityGroupRules(ListGatewayAuthorizedSecurityGroupRulesRequest request);

    /**
     * @param request the request parameters of ListGatewayErrorAccessLogs  ListGatewayErrorAccessLogsRequest
     * @return ListGatewayErrorAccessLogsResponse
     */
    CompletableFuture<ListGatewayErrorAccessLogsResponse> listGatewayErrorAccessLogs(ListGatewayErrorAccessLogsRequest request);

    /**
     * @param request the request parameters of ListGatewayFeatures  ListGatewayFeaturesRequest
     * @return ListGatewayFeaturesResponse
     */
    CompletableFuture<ListGatewayFeaturesResponse> listGatewayFeatures(ListGatewayFeaturesRequest request);

    /**
     * @param request the request parameters of ListGatewayLoadBalancers  ListGatewayLoadBalancersRequest
     * @return ListGatewayLoadBalancersResponse
     */
    CompletableFuture<ListGatewayLoadBalancersResponse> listGatewayLoadBalancers(ListGatewayLoadBalancersRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the FinOps quota rules associated with a gateway.</p>
     * 
     * @param request the request parameters of ListGatewayQuotaRules  ListGatewayQuotaRulesRequest
     * @return ListGatewayQuotaRulesResponse
     */
    CompletableFuture<ListGatewayQuotaRulesResponse> listGatewayQuotaRules(ListGatewayQuotaRulesRequest request);

    /**
     * @param request the request parameters of ListGateways  ListGatewaysRequest
     * @return ListGatewaysResponse
     */
    CompletableFuture<ListGatewaysResponse> listGateways(ListGatewaysRequest request);

    /**
     * @param request the request parameters of ListGlobalPolicies  ListGlobalPoliciesRequest
     * @return ListGlobalPoliciesResponse
     */
    CompletableFuture<ListGlobalPoliciesResponse> listGlobalPolicies(ListGlobalPoliciesRequest request);

    /**
     * @param request the request parameters of ListHiMarketConsumerSubscriptions  ListHiMarketConsumerSubscriptionsRequest
     * @return ListHiMarketConsumerSubscriptionsResponse
     */
    CompletableFuture<ListHiMarketConsumerSubscriptionsResponse> listHiMarketConsumerSubscriptions(ListHiMarketConsumerSubscriptionsRequest request);

    /**
     * @param request the request parameters of ListHiMarketConsumers  ListHiMarketConsumersRequest
     * @return ListHiMarketConsumersResponse
     */
    CompletableFuture<ListHiMarketConsumersResponse> listHiMarketConsumers(ListHiMarketConsumersRequest request);

    /**
     * @param request the request parameters of ListHttpApiOperations  ListHttpApiOperationsRequest
     * @return ListHttpApiOperationsResponse
     */
    CompletableFuture<ListHttpApiOperationsResponse> listHttpApiOperations(ListHttpApiOperationsRequest request);

    /**
     * @param request the request parameters of ListHttpApiRoutes  ListHttpApiRoutesRequest
     * @return ListHttpApiRoutesResponse
     */
    CompletableFuture<ListHttpApiRoutesResponse> listHttpApiRoutes(ListHttpApiRoutesRequest request);

    /**
     * @param request the request parameters of ListHttpApis  ListHttpApisRequest
     * @return ListHttpApisResponse
     */
    CompletableFuture<ListHttpApisResponse> listHttpApis(ListHttpApisRequest request);

    /**
     * @param request the request parameters of ListInstallableGateways  ListInstallableGatewaysRequest
     * @return ListInstallableGatewaysResponse
     */
    CompletableFuture<ListInstallableGatewaysResponse> listInstallableGateways(ListInstallableGatewaysRequest request);

    /**
     * @param request the request parameters of ListK8sClusterSources  ListK8sClusterSourcesRequest
     * @return ListK8sClusterSourcesResponse
     */
    CompletableFuture<ListK8sClusterSourcesResponse> listK8sClusterSources(ListK8sClusterSourcesRequest request);

    /**
     * @param request the request parameters of ListMcpProductTools  ListMcpProductToolsRequest
     * @return ListMcpProductToolsResponse
     */
    CompletableFuture<ListMcpProductToolsResponse> listMcpProductTools(ListMcpProductToolsRequest request);

    /**
     * <b>description</b> :
     * <p>The operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of ListMcpServers  ListMcpServersRequest
     * @return ListMcpServersResponse
     */
    CompletableFuture<ListMcpServersResponse> listMcpServers(ListMcpServersRequest request);

    /**
     * @param request the request parameters of ListMigrationTasks  ListMigrationTasksRequest
     * @return ListMigrationTasksResponse
     */
    CompletableFuture<ListMigrationTasksResponse> listMigrationTasks(ListMigrationTasksRequest request);

    /**
     * @param request the request parameters of ListModelCards  ListModelCardsRequest
     * @return ListModelCardsResponse
     */
    CompletableFuture<ListModelCardsResponse> listModelCards(ListModelCardsRequest request);

    /**
     * @param request the request parameters of ListMseNacosSources  ListMseNacosSourcesRequest
     * @return ListMseNacosSourcesResponse
     */
    CompletableFuture<ListMseNacosSourcesResponse> listMseNacosSources(ListMseNacosSourcesRequest request);

    /**
     * @param request the request parameters of ListPluginAttachments  ListPluginAttachmentsRequest
     * @return ListPluginAttachmentsResponse
     */
    CompletableFuture<ListPluginAttachmentsResponse> listPluginAttachments(ListPluginAttachmentsRequest request);

    /**
     * <b>description</b> :
     * <p>The operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of ListPluginClasses  ListPluginClassesRequest
     * @return ListPluginClassesResponse
     */
    CompletableFuture<ListPluginClassesResponse> listPluginClasses(ListPluginClassesRequest request);

    /**
     * @param request the request parameters of ListPluginRepositories  ListPluginRepositoriesRequest
     * @return ListPluginRepositoriesResponse
     */
    CompletableFuture<ListPluginRepositoriesResponse> listPluginRepositories(ListPluginRepositoriesRequest request);

    /**
     * @param request the request parameters of ListPluginWorkspace  ListPluginWorkspaceRequest
     * @return ListPluginWorkspaceResponse
     */
    CompletableFuture<ListPluginWorkspaceResponse> listPluginWorkspace(ListPluginWorkspaceRequest request);

    /**
     * @param request the request parameters of ListPlugins  ListPluginsRequest
     * @return ListPluginsResponse
     */
    CompletableFuture<ListPluginsResponse> listPlugins(ListPluginsRequest request);

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * @param request the request parameters of ListPolicyClasses  ListPolicyClassesRequest
     * @return ListPolicyClassesResponse
     */
    CompletableFuture<ListPolicyClassesResponse> listPolicyClasses(ListPolicyClassesRequest request);

    /**
     * @param request the request parameters of ListPortalPublications  ListPortalPublicationsRequest
     * @return ListPortalPublicationsResponse
     */
    CompletableFuture<ListPortalPublicationsResponse> listPortalPublications(ListPortalPublicationsRequest request);

    /**
     * @param request the request parameters of ListPortals  ListPortalsRequest
     * @return ListPortalsResponse
     */
    CompletableFuture<ListPortalsResponse> listPortals(ListPortalsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of ListPrivateLinkSecurityGroups  ListPrivateLinkSecurityGroupsRequest
     * @return ListPrivateLinkSecurityGroupsResponse
     */
    CompletableFuture<ListPrivateLinkSecurityGroupsResponse> listPrivateLinkSecurityGroups(ListPrivateLinkSecurityGroupsRequest request);

    /**
     * @param request the request parameters of ListProductCategories  ListProductCategoriesRequest
     * @return ListProductCategoriesResponse
     */
    CompletableFuture<ListProductCategoriesResponse> listProductCategories(ListProductCategoriesRequest request);

    /**
     * @param request the request parameters of ListProductPublications  ListProductPublicationsRequest
     * @return ListProductPublicationsResponse
     */
    CompletableFuture<ListProductPublicationsResponse> listProductPublications(ListProductPublicationsRequest request);

    /**
     * @param request the request parameters of ListProductSubscriptions  ListProductSubscriptionsRequest
     * @return ListProductSubscriptionsResponse
     */
    CompletableFuture<ListProductSubscriptionsResponse> listProductSubscriptions(ListProductSubscriptionsRequest request);

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * @param request the request parameters of ListPublishableProducts  ListPublishableProductsRequest
     * @return ListPublishableProductsResponse
     */
    CompletableFuture<ListPublishableProductsResponse> listPublishableProducts(ListPublishableProductsRequest request);

    /**
     * @param request the request parameters of ListRiskCheckResults  ListRiskCheckResultsRequest
     * @return ListRiskCheckResultsResponse
     */
    CompletableFuture<ListRiskCheckResultsResponse> listRiskCheckResults(ListRiskCheckResultsRequest request);

    /**
     * <b>description</b> :
     * <p>The operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of ListSecretReferences  ListSecretReferencesRequest
     * @return ListSecretReferencesResponse
     */
    CompletableFuture<ListSecretReferencesResponse> listSecretReferences(ListSecretReferencesRequest request);

    /**
     * <b>description</b> :
     * <p>The operation supports creating multiple services.</p>
     * 
     * @param request the request parameters of ListSecrets  ListSecretsRequest
     * @return ListSecretsResponse
     */
    CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request);

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
     * @param request the request parameters of ListSources  ListSourcesRequest
     * @return ListSourcesResponse
     */
    CompletableFuture<ListSourcesResponse> listSources(ListSourcesRequest request);

    /**
     * @param request the request parameters of ListSslCerts  ListSslCertsRequest
     * @return ListSslCertsResponse
     */
    CompletableFuture<ListSslCertsResponse> listSslCerts(ListSslCertsRequest request);

    /**
     * @param request the request parameters of ListSyncMCPServer  ListSyncMCPServerRequest
     * @return ListSyncMCPServerResponse
     */
    CompletableFuture<ListSyncMCPServerResponse> listSyncMCPServer(ListSyncMCPServerRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListZones  ListZonesRequest
     * @return ListZonesResponse
     */
    CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request);

    /**
     * @param request the request parameters of LoginDeveloper  LoginDeveloperRequest
     * @return LoginDeveloperResponse
     */
    CompletableFuture<LoginDeveloperResponse> loginDeveloper(LoginDeveloperRequest request);

    /**
     * @param request the request parameters of LogoutDeveloper  LogoutDeveloperRequest
     * @return LogoutDeveloperResponse
     */
    CompletableFuture<LogoutDeveloperResponse> logoutDeveloper(LogoutDeveloperRequest request);

    /**
     * @param request the request parameters of PublishProduct  PublishProductRequest
     * @return PublishProductResponse
     */
    CompletableFuture<PublishProductResponse> publishProduct(PublishProductRequest request);

    /**
     * @param request the request parameters of QueryConsumerAuthorizationRules  QueryConsumerAuthorizationRulesRequest
     * @return QueryConsumerAuthorizationRulesResponse
     */
    CompletableFuture<QueryConsumerAuthorizationRulesResponse> queryConsumerAuthorizationRules(QueryConsumerAuthorizationRulesRequest request);

    /**
     * @param request the request parameters of RefreshPluginOAuthCode  RefreshPluginOAuthCodeRequest
     * @return RefreshPluginOAuthCodeResponse
     */
    CompletableFuture<RefreshPluginOAuthCodeResponse> refreshPluginOAuthCode(RefreshPluginOAuthCodeRequest request);

    /**
     * @param request the request parameters of RemoveConsumerAuthorizationRule  RemoveConsumerAuthorizationRuleRequest
     * @return RemoveConsumerAuthorizationRuleResponse
     */
    CompletableFuture<RemoveConsumerAuthorizationRuleResponse> removeConsumerAuthorizationRule(RemoveConsumerAuthorizationRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This operation resets a quota throttling rule on a gateway. Note that this operation takes effect only on AI gateways of a version later than 2.1.21. The reset clears the historical usage of the consumption subjects on the rule.</p>
     * <blockquote>
     * <p>Recommended call logic:</p>
     * <ul>
     * <li><ol>
     * <li>Perform a dry run to check for rule conflicts.</li>
     * </ol>
     * </li>
     * <li><ul>
     * <li>Set dryRun=true.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>The response returns a conflict preview containing a conflictHash.</li>
     * </ul>
     * </li>
     * <li><ol start="2">
     * <li>Formally submit the request after confirmation.</li>
     * </ol>
     * </li>
     * <li><ul>
     * <li>No conflicts: Set dryRun=false and overwrite=false.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>Conflicts exist and overwrite is confirmed: Set dryRun=false, overwrite=true, and conflictHash=<value returned in the previous step>.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ResetGatewayQuotaRule  ResetGatewayQuotaRuleRequest
     * @return ResetGatewayQuotaRuleResponse
     */
    CompletableFuture<ResetGatewayQuotaRuleResponse> resetGatewayQuotaRule(ResetGatewayQuotaRuleRequest request);

    /**
     * @param request the request parameters of RestartGateway  RestartGatewayRequest
     * @return RestartGatewayResponse
     */
    CompletableFuture<RestartGatewayResponse> restartGateway(RestartGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the currently active credentials for the AI service.</p>
     * 
     * @param request the request parameters of RevealServiceCredential  RevealServiceCredentialRequest
     * @return RevealServiceCredentialResponse
     */
    CompletableFuture<RevealServiceCredentialResponse> revealServiceCredential(RevealServiceCredentialRequest request);

    /**
     * @param request the request parameters of RunPluginPipeline  RunPluginPipelineRequest
     * @return RunPluginPipelineResponse
     */
    CompletableFuture<RunPluginPipelineResponse> runPluginPipeline(RunPluginPipelineRequest request);

    /**
     * @param request the request parameters of SubscribeProduct  SubscribeProductRequest
     * @return SubscribeProductResponse
     */
    CompletableFuture<SubscribeProductResponse> subscribeProduct(SubscribeProductRequest request);

    /**
     * @param request the request parameters of SyncMCPServers  SyncMCPServersRequest
     * @return SyncMCPServersResponse
     */
    CompletableFuture<SyncMCPServersResponse> syncMCPServers(SyncMCPServersRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnDeployMcpServer  UnDeployMcpServerRequest
     * @return UnDeployMcpServerResponse
     */
    CompletableFuture<UnDeployMcpServerResponse> unDeployMcpServer(UnDeployMcpServerRequest request);

    /**
     * @param request the request parameters of UndeployHttpApi  UndeployHttpApiRequest
     * @return UndeployHttpApiResponse
     */
    CompletableFuture<UndeployHttpApiResponse> undeployHttpApi(UndeployHttpApiRequest request);

    /**
     * @param request the request parameters of UninstallPlugin  UninstallPluginRequest
     * @return UninstallPluginResponse
     */
    CompletableFuture<UninstallPluginResponse> uninstallPlugin(UninstallPluginRequest request);

    /**
     * @param request the request parameters of UnpublishProduct  UnpublishProductRequest
     * @return UnpublishProductResponse
     */
    CompletableFuture<UnpublishProductResponse> unpublishProduct(UnpublishProductRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAiModelCard  UpdateAiModelCardRequest
     * @return UpdateAiModelCardResponse
     */
    CompletableFuture<UpdateAiModelCardResponse> updateAiModelCard(UpdateAiModelCardRequest request);

    /**
     * @param request the request parameters of UpdateAiModelProvider  UpdateAiModelProviderRequest
     * @return UpdateAiModelProviderResponse
     */
    CompletableFuture<UpdateAiModelProviderResponse> updateAiModelProvider(UpdateAiModelProviderRequest request);

    /**
     * @param request the request parameters of UpdateAndAttachPolicy  UpdateAndAttachPolicyRequest
     * @return UpdateAndAttachPolicyResponse
     */
    CompletableFuture<UpdateAndAttachPolicyResponse> updateAndAttachPolicy(UpdateAndAttachPolicyRequest request);

    /**
     * @param request the request parameters of UpdateAuthorizationRule  UpdateAuthorizationRuleRequest
     * @return UpdateAuthorizationRuleResponse
     */
    CompletableFuture<UpdateAuthorizationRuleResponse> updateAuthorizationRule(UpdateAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of UpdateCategoryProducts  UpdateCategoryProductsRequest
     * @return UpdateCategoryProductsResponse
     */
    CompletableFuture<UpdateCategoryProductsResponse> updateCategoryProducts(UpdateCategoryProductsRequest request);

    /**
     * @param request the request parameters of UpdateConsumer  UpdateConsumerRequest
     * @return UpdateConsumerResponse
     */
    CompletableFuture<UpdateConsumerResponse> updateConsumer(UpdateConsumerRequest request);

    /**
     * @deprecated OpenAPI UpdateConsumerAuthorizationRule is deprecated  * @description This API operation has been replaced by UpdateAuthorizationRule. The new API path is /v1/authorization-rules/{consumerAuthorizationRuleId}. When you call the new API operation, you only need to provide consumerAuthorizationRuleId in the path and the resources array in the request body. The consumerId parameter is no longer required.
     * 
     * @param request the request parameters of UpdateConsumerAuthorizationRule  UpdateConsumerAuthorizationRuleRequest
     * @return UpdateConsumerAuthorizationRuleResponse
     */
    @Deprecated
    CompletableFuture<UpdateConsumerAuthorizationRuleResponse> updateConsumerAuthorizationRule(UpdateConsumerAuthorizationRuleRequest request);

    /**
     * @param request the request parameters of UpdateConsumerGroup  UpdateConsumerGroupRequest
     * @return UpdateConsumerGroupResponse
     */
    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    /**
     * @param request the request parameters of UpdateDeveloperStatus  UpdateDeveloperStatusRequest
     * @return UpdateDeveloperStatusResponse
     */
    CompletableFuture<UpdateDeveloperStatusResponse> updateDeveloperStatus(UpdateDeveloperStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Only sources of the <strong>container service</strong> type are allowed to update the listener Ingress configurations.</p>
     * 
     * @param request the request parameters of UpdateDomain  UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request);

    /**
     * @deprecated OpenAPI UpdateEnvironment is deprecated  * @param request  the request parameters of UpdateEnvironment  UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    @Deprecated
    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    /**
     * @param request the request parameters of UpdateGatewayElasticPolicy  UpdateGatewayElasticPolicyRequest
     * @return UpdateGatewayElasticPolicyResponse
     */
    CompletableFuture<UpdateGatewayElasticPolicyResponse> updateGatewayElasticPolicy(UpdateGatewayElasticPolicyRequest request);

    /**
     * @param request the request parameters of UpdateGatewayFeature  UpdateGatewayFeatureRequest
     * @return UpdateGatewayFeatureResponse
     */
    CompletableFuture<UpdateGatewayFeatureResponse> updateGatewayFeature(UpdateGatewayFeatureRequest request);

    /**
     * @param request the request parameters of UpdateGatewayLoadBalancer  UpdateGatewayLoadBalancerRequest
     * @return UpdateGatewayLoadBalancerResponse
     */
    CompletableFuture<UpdateGatewayLoadBalancerResponse> updateGatewayLoadBalancer(UpdateGatewayLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the O&amp;M time window of a gateway. This feature is supported only by specific gateway types. If the current gateway does not support modifying the O&amp;M time window, the API returns 409 Conflict.GatewayNotSupportAutoMaintenance.</p>
     * 
     * @param request the request parameters of UpdateGatewayMaintenancePeriod  UpdateGatewayMaintenancePeriodRequest
     * @return UpdateGatewayMaintenancePeriodResponse
     */
    CompletableFuture<UpdateGatewayMaintenancePeriodResponse> updateGatewayMaintenancePeriod(UpdateGatewayMaintenancePeriodRequest request);

    /**
     * @deprecated OpenAPI UpdateGatewayName is deprecated  * @param request  the request parameters of UpdateGatewayName  UpdateGatewayNameRequest
     * @return UpdateGatewayNameResponse
     */
    @Deprecated
    CompletableFuture<UpdateGatewayNameResponse> updateGatewayName(UpdateGatewayNameRequest request);

    /**
     * <b>description</b> :
     * <p>This operation modifies a quota rule on a gateway. Note that this operation takes effect only on AI gateways of a version later than 2.1.21. The modification retains the historical usage of the consumers associated with the rule.</p>
     * <blockquote>
     * <p>Recommended call logic:</p>
     * <ul>
     * <li><ol>
     * <li>Perform a dry run to check for rule conflicts.</li>
     * </ol>
     * </li>
     * <li><ul>
     * <li>Set dryRun=true.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>The response returns a conflict preview that contains a conflictHash.</li>
     * </ul>
     * </li>
     * <li><ol start="2">
     * <li>Submit the request after confirmation.</li>
     * </ol>
     * </li>
     * <li><ul>
     * <li>If no conflicts exist: Set dryRun=false and overwrite=false.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If conflicts exist and you confirm to overwrite: Set dryRun=false, overwrite=true, and conflictHash=<the value returned in the previous step>.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateGatewayQuotaRule  UpdateGatewayQuotaRuleRequest
     * @return UpdateGatewayQuotaRuleResponse
     */
    CompletableFuture<UpdateGatewayQuotaRuleResponse> updateGatewayQuotaRule(UpdateGatewayQuotaRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This operation enables or disables a quota rule on a gateway. Note that this operation applies only to AI gateways of a version later than 2.1.21.</p>
     * 
     * @param request the request parameters of UpdateGatewayQuotaRuleStatus  UpdateGatewayQuotaRuleStatusRequest
     * @return UpdateGatewayQuotaRuleStatusResponse
     */
    CompletableFuture<UpdateGatewayQuotaRuleStatusResponse> updateGatewayQuotaRuleStatus(UpdateGatewayQuotaRuleStatusRequest request);

    /**
     * @param request the request parameters of UpdateHttpApi  UpdateHttpApiRequest
     * @return UpdateHttpApiResponse
     */
    CompletableFuture<UpdateHttpApiResponse> updateHttpApi(UpdateHttpApiRequest request);

    /**
     * @param request the request parameters of UpdateHttpApiOperation  UpdateHttpApiOperationRequest
     * @return UpdateHttpApiOperationResponse
     */
    CompletableFuture<UpdateHttpApiOperationResponse> updateHttpApiOperation(UpdateHttpApiOperationRequest request);

    /**
     * @param request the request parameters of UpdateHttpApiRoute  UpdateHttpApiRouteRequest
     * @return UpdateHttpApiRouteResponse
     */
    CompletableFuture<UpdateHttpApiRouteResponse> updateHttpApiRoute(UpdateHttpApiRouteRequest request);

    /**
     * <b>description</b> :
     * <p>Only sources of the <strong>Container Service</strong> type are allowed to update the Ingress listener configurations.</p>
     * 
     * @param request the request parameters of UpdateMcpServer  UpdateMcpServerRequest
     * @return UpdateMcpServerResponse
     */
    CompletableFuture<UpdateMcpServerResponse> updateMcpServer(UpdateMcpServerRequest request);

    /**
     * @param request the request parameters of UpdateMigrationTask  UpdateMigrationTaskRequest
     * @return UpdateMigrationTaskResponse
     */
    CompletableFuture<UpdateMigrationTaskResponse> updateMigrationTask(UpdateMigrationTaskRequest request);

    /**
     * @param request the request parameters of UpdateNetworkAccess  UpdateNetworkAccessRequest
     * @return UpdateNetworkAccessResponse
     */
    CompletableFuture<UpdateNetworkAccessResponse> updateNetworkAccess(UpdateNetworkAccessRequest request);

    /**
     * @param request the request parameters of UpdatePluginAttachment  UpdatePluginAttachmentRequest
     * @return UpdatePluginAttachmentResponse
     */
    CompletableFuture<UpdatePluginAttachmentResponse> updatePluginAttachment(UpdatePluginAttachmentRequest request);

    /**
     * @param request the request parameters of UpdatePolicy  UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    CompletableFuture<UpdatePolicyResponse> updatePolicy(UpdatePolicyRequest request);

    /**
     * @param request the request parameters of UpdatePortal  UpdatePortalRequest
     * @return UpdatePortalResponse
     */
    CompletableFuture<UpdatePortalResponse> updatePortal(UpdatePortalRequest request);

    /**
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    /**
     * @param request the request parameters of UpdateProductCategory  UpdateProductCategoryRequest
     * @return UpdateProductCategoryResponse
     */
    CompletableFuture<UpdateProductCategoryResponse> updateProductCategory(UpdateProductCategoryRequest request);

    /**
     * @param request the request parameters of UpdateRiskNotification  UpdateRiskNotificationRequest
     * @return UpdateRiskNotificationResponse
     */
    CompletableFuture<UpdateRiskNotificationResponse> updateRiskNotification(UpdateRiskNotificationRequest request);

    /**
     * <b>description</b> :
     * <p>Only sources of the <strong>container service</strong> type allow you to update the listener Ingress configuration.</p>
     * 
     * @param request the request parameters of UpdateSecret  UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    CompletableFuture<UpdateSecretResponse> updateSecret(UpdateSecretRequest request);

    /**
     * @param request the request parameters of UpdateService  UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    /**
     * @param request the request parameters of UpdateServiceVersion  UpdateServiceVersionRequest
     * @return UpdateServiceVersionResponse
     */
    CompletableFuture<UpdateServiceVersionResponse> updateServiceVersion(UpdateServiceVersionRequest request);

    /**
     * @param request the request parameters of UpgradeGateway  UpgradeGatewayRequest
     * @return UpgradeGatewayResponse
     */
    CompletableFuture<UpgradeGatewayResponse> upgradeGateway(UpgradeGatewayRequest request);

    /**
     * @param request the request parameters of VerifyMigrationTask  VerifyMigrationTaskRequest
     * @return VerifyMigrationTaskResponse
     */
    CompletableFuture<VerifyMigrationTaskResponse> verifyMigrationTask(VerifyMigrationTaskRequest request);

}
