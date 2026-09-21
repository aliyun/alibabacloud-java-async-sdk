// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.esa20240910.models.*;
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
     * @param request the request parameters of ActivateClientCertificate  ActivateClientCertificateRequest
     * @return ActivateClientCertificateResponse
     */
    CompletableFuture<ActivateClientCertificateResponse> activateClientCertificate(ActivateClientCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Prerequisites for enabling site version management:</p>
     * <ol>
     * <li>The site plan must include the version management quota item <code>version_management_available</code>, and its value must be <code>true</code>.</li>
     * </ol>
     * 
     * @param request the request parameters of ActivateVersionManagement  ActivateVersionManagementRequest
     * @return ActivateVersionManagementResponse
     */
    CompletableFuture<ActivateVersionManagementResponse> activateVersionManagement(ActivateVersionManagementRequest request);

    /**
     * @param request the request parameters of AddUserBusinessForm  AddUserBusinessFormRequest
     * @return AddUserBusinessFormResponse
     */
    CompletableFuture<AddUserBusinessFormResponse> addUserBusinessForm(AddUserBusinessFormRequest request);

    /**
     * @param request the request parameters of ApplyCertificate  ApplyCertificateRequest
     * @return ApplyCertificateResponse
     */
    CompletableFuture<ApplyCertificateResponse> applyCertificate(ApplyCertificateRequest request);

    /**
     * @param request the request parameters of ApplyCustomHostnameCertificate  ApplyCustomHostnameCertificateRequest
     * @return ApplyCustomHostnameCertificateResponse
     */
    CompletableFuture<ApplyCustomHostnameCertificateResponse> applyCustomHostnameCertificate(ApplyCustomHostnameCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation allows you to create or update multiple DNS records at a time. It is suitable for scenarios that require managing a large number of DNS configurations. Supported record types include but are not limited to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI. Detailed configuration items are provided to meet specific requirements, such as Priority, Flag, Tag, and Weight. In addition, for specific record types such as CERT, SSHFP, SMIMEA, and TLSA, advanced settings such as certificate information and encryption algorithms are supported.
     * Successfully and unsuccessfully processed records are listed separately in the response, so that you can identify which records are processed, which records failed, and the failure reasons.</p>
     * 
     * @param request the request parameters of BatchCreateRecords  BatchCreateRecordsRequest
     * @return BatchCreateRecordsResponse
     */
    CompletableFuture<BatchCreateRecordsResponse> batchCreateRecords(BatchCreateRecordsRequest request);

    /**
     * @param request the request parameters of BatchCreateWafRules  BatchCreateWafRulesRequest
     * @return BatchCreateWafRulesResponse
     */
    CompletableFuture<BatchCreateWafRulesResponse> batchCreateWafRules(BatchCreateWafRulesRequest request);

    /**
     * @param request the request parameters of BatchDeleteKv  BatchDeleteKvRequest
     * @return BatchDeleteKvResponse
     */
    CompletableFuture<BatchDeleteKvResponse> batchDeleteKv(BatchDeleteKvRequest request);

    /**
     * @param request the request parameters of BatchGetExpressionFields  BatchGetExpressionFieldsRequest
     * @return BatchGetExpressionFieldsResponse
     */
    CompletableFuture<BatchGetExpressionFieldsResponse> batchGetExpressionFields(BatchGetExpressionFieldsRequest request);

    /**
     * @param request the request parameters of BatchPutKv  BatchPutKvRequest
     * @return BatchPutKvResponse
     */
    CompletableFuture<BatchPutKvResponse> batchPutKv(BatchPutKvRequest request);

    /**
     * @param request the request parameters of BatchUpdateWafRules  BatchUpdateWafRulesRequest
     * @return BatchUpdateWafRulesResponse
     */
    CompletableFuture<BatchUpdateWafRulesResponse> batchUpdateWafRules(BatchUpdateWafRulesRequest request);

    /**
     * @param request the request parameters of BlockObject  BlockObjectRequest
     * @return BlockObjectResponse
     */
    CompletableFuture<BlockObjectResponse> blockObject(BlockObjectRequest request);

    /**
     * @param request the request parameters of CheckAssumeSlrRole  CheckAssumeSlrRoleRequest
     * @return CheckAssumeSlrRoleResponse
     */
    CompletableFuture<CheckAssumeSlrRoleResponse> checkAssumeSlrRole(CheckAssumeSlrRoleRequest request);

    /**
     * @param request the request parameters of CheckSiteFeaturesMatchPlan  CheckSiteFeaturesMatchPlanRequest
     * @return CheckSiteFeaturesMatchPlanResponse
     */
    CompletableFuture<CheckSiteFeaturesMatchPlanResponse> checkSiteFeaturesMatchPlan(CheckSiteFeaturesMatchPlanRequest request);

    /**
     * @param request the request parameters of CheckSiteName  CheckSiteNameRequest
     * @return CheckSiteNameResponse
     */
    CompletableFuture<CheckSiteNameResponse> checkSiteName(CheckSiteNameRequest request);

    /**
     * @param request the request parameters of CheckSiteProjectName  CheckSiteProjectNameRequest
     * @return CheckSiteProjectNameResponse
     */
    CompletableFuture<CheckSiteProjectNameResponse> checkSiteProjectName(CheckSiteProjectNameRequest request);

    /**
     * @param request the request parameters of CheckUserProjectName  CheckUserProjectNameRequest
     * @return CheckUserProjectNameResponse
     */
    CompletableFuture<CheckUserProjectNameResponse> checkUserProjectName(CheckUserProjectNameRequest request);

    /**
     * @param request the request parameters of CloneVersion  CloneVersionRequest
     * @return CloneVersionResponse
     */
    CompletableFuture<CloneVersionResponse> cloneVersion(CloneVersionRequest request);

    /**
     * @param request the request parameters of CommitRoutineStagingCode  CommitRoutineStagingCodeRequest
     * @return CommitRoutineStagingCodeResponse
     */
    CompletableFuture<CommitRoutineStagingCodeResponse> commitRoutineStagingCode(CommitRoutineStagingCodeRequest request);

    /**
     * @param request the request parameters of CreateCacheRule  CreateCacheRuleRequest
     * @return CreateCacheRuleResponse
     */
    CompletableFuture<CreateCacheRuleResponse> createCacheRule(CreateCacheRuleRequest request);

    /**
     * @param request the request parameters of CreateClientCertificate  CreateClientCertificateRequest
     * @return CreateClientCertificateResponse
     */
    CompletableFuture<CreateClientCertificateResponse> createClientCertificate(CreateClientCertificateRequest request);

    /**
     * @param request the request parameters of CreateCompressionRule  CreateCompressionRuleRequest
     * @return CreateCompressionRuleResponse
     */
    CompletableFuture<CreateCompressionRuleResponse> createCompressionRule(CreateCompressionRuleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the acceleration area is set to the Chinese mainland only or global, the site domain name must have a valid Internet Content Provider (ICP) filing.</li>
     * <li>Each user can invoke this operation up to 100 times per hour.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomHostname  CreateCustomHostnameRequest
     * @return CreateCustomHostnameResponse
     */
    CompletableFuture<CreateCustomHostnameResponse> createCustomHostname(CreateCustomHostnameRequest request);

    /**
     * @param request the request parameters of CreateCustomResponseCodeRule  CreateCustomResponseCodeRuleRequest
     * @return CreateCustomResponseCodeRuleResponse
     */
    CompletableFuture<CreateCustomResponseCodeRuleResponse> createCustomResponseCodeRule(CreateCustomResponseCodeRuleRequest request);

    /**
     * @param request the request parameters of CreateCustomScenePolicy  CreateCustomScenePolicyRequest
     * @return CreateCustomScenePolicyResponse
     */
    CompletableFuture<CreateCustomScenePolicyResponse> createCustomScenePolicy(CreateCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of CreateEdgeContainerApp  CreateEdgeContainerAppRequest
     * @return CreateEdgeContainerAppResponse
     */
    CompletableFuture<CreateEdgeContainerAppResponse> createEdgeContainerApp(CreateEdgeContainerAppRequest request);

    /**
     * @param request the request parameters of CreateEdgeContainerAppImageSecret  CreateEdgeContainerAppImageSecretRequest
     * @return CreateEdgeContainerAppImageSecretResponse
     */
    CompletableFuture<CreateEdgeContainerAppImageSecretResponse> createEdgeContainerAppImageSecret(CreateEdgeContainerAppImageSecretRequest request);

    /**
     * @param request the request parameters of CreateEdgeContainerAppRecord  CreateEdgeContainerAppRecordRequest
     * @return CreateEdgeContainerAppRecordResponse
     */
    CompletableFuture<CreateEdgeContainerAppRecordResponse> createEdgeContainerAppRecord(CreateEdgeContainerAppRecordRequest request);

    /**
     * @param request the request parameters of CreateEdgeContainerAppVersion  CreateEdgeContainerAppVersionRequest
     * @return CreateEdgeContainerAppVersionResponse
     */
    CompletableFuture<CreateEdgeContainerAppVersionResponse> createEdgeContainerAppVersion(CreateEdgeContainerAppVersionRequest request);

    /**
     * @param request the request parameters of CreateEnvironment  CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    /**
     * @param request the request parameters of CreateHttpIncomingRequestHeaderModificationRule  CreateHttpIncomingRequestHeaderModificationRuleRequest
     * @return CreateHttpIncomingRequestHeaderModificationRuleResponse
     */
    CompletableFuture<CreateHttpIncomingRequestHeaderModificationRuleResponse> createHttpIncomingRequestHeaderModificationRule(CreateHttpIncomingRequestHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of CreateHttpIncomingResponseHeaderModificationRule  CreateHttpIncomingResponseHeaderModificationRuleRequest
     * @return CreateHttpIncomingResponseHeaderModificationRuleResponse
     */
    CompletableFuture<CreateHttpIncomingResponseHeaderModificationRuleResponse> createHttpIncomingResponseHeaderModificationRule(CreateHttpIncomingResponseHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of CreateHttpRequestHeaderModificationRule  CreateHttpRequestHeaderModificationRuleRequest
     * @return CreateHttpRequestHeaderModificationRuleResponse
     */
    CompletableFuture<CreateHttpRequestHeaderModificationRuleResponse> createHttpRequestHeaderModificationRule(CreateHttpRequestHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of CreateHttpResponseHeaderModificationRule  CreateHttpResponseHeaderModificationRuleRequest
     * @return CreateHttpResponseHeaderModificationRuleResponse
     */
    CompletableFuture<CreateHttpResponseHeaderModificationRuleResponse> createHttpResponseHeaderModificationRule(CreateHttpResponseHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of CreateHttpsApplicationConfiguration  CreateHttpsApplicationConfigurationRequest
     * @return CreateHttpsApplicationConfigurationResponse
     */
    CompletableFuture<CreateHttpsApplicationConfigurationResponse> createHttpsApplicationConfiguration(CreateHttpsApplicationConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>A site supports only one global configuration (without Rule-related parameters). To exceed this limit, you must provide the RuleName, Rule, and RuleEnable parameters to create a rule-based configuration.</p>
     * 
     * @param request the request parameters of CreateHttpsBasicConfiguration  CreateHttpsBasicConfigurationRequest
     * @return CreateHttpsBasicConfigurationResponse
     */
    CompletableFuture<CreateHttpsBasicConfigurationResponse> createHttpsBasicConfiguration(CreateHttpsBasicConfigurationRequest request);

    /**
     * @param request the request parameters of CreateImageTransform  CreateImageTransformRequest
     * @return CreateImageTransformResponse
     */
    CompletableFuture<CreateImageTransformResponse> createImageTransform(CreateImageTransformRequest request);

    /**
     * @param request the request parameters of CreateKvNamespace  CreateKvNamespaceRequest
     * @return CreateKvNamespaceResponse
     */
    CompletableFuture<CreateKvNamespaceResponse> createKvNamespace(CreateKvNamespaceRequest request);

    /**
     * @param request the request parameters of CreateList  CreateListRequest
     * @return CreateListResponse
     */
    CompletableFuture<CreateListResponse> createList(CreateListRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a load balancing service based on your business requirements. You can configure settings such as adaptive routing, weighted polling, rule matching, and health checks to effectively manage and optimize traffic.
     * Only Enterprise plans support the load balancing service. To use this feature, contact Alibaba Cloud sales to apply for an Enterprise plan.</p>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>The site plan must be Standard Edition or higher to use the WebSocket feature. When calling this API, you must provide at least one feature configuration parameter. Providing only SiteId returns an error.</p>
     * 
     * @param request the request parameters of CreateNetworkOptimization  CreateNetworkOptimizationRequest
     * @return CreateNetworkOptimizationResponse
     */
    CompletableFuture<CreateNetworkOptimizationResponse> createNetworkOptimization(CreateNetworkOptimizationRequest request);

    /**
     * <b>description</b> :
     * <p>You can add multiple origins to an origin pool, such as a domain name, IP, OSS, or S3. Back-to-origin authentication is available for OSS and S3 origins.</p>
     * 
     * @param request the request parameters of CreateOriginPool  CreateOriginPoolRequest
     * @return CreateOriginPoolResponse
     */
    CompletableFuture<CreateOriginPoolResponse> createOriginPool(CreateOriginPoolRequest request);

    /**
     * @param request the request parameters of CreateOriginProtection  CreateOriginProtectionRequest
     * @return CreateOriginProtectionResponse
     */
    CompletableFuture<CreateOriginProtectionResponse> createOriginProtection(CreateOriginProtectionRequest request);

    /**
     * @param request the request parameters of CreateOriginRule  CreateOriginRuleRequest
     * @return CreateOriginRuleResponse
     */
    CompletableFuture<CreateOriginRuleResponse> createOriginRule(CreateOriginRuleRequest request);

    /**
     * @param request the request parameters of CreatePage  CreatePageRequest
     * @return CreatePageResponse
     */
    CompletableFuture<CreatePageResponse> createPage(CreatePageRequest request);

    /**
     * @param request the request parameters of CreateRecord  CreateRecordRequest
     * @return CreateRecordResponse
     */
    CompletableFuture<CreateRecordResponse> createRecord(CreateRecordRequest request);

    /**
     * @param request the request parameters of CreateRedirectRule  CreateRedirectRuleRequest
     * @return CreateRedirectRuleResponse
     */
    CompletableFuture<CreateRedirectRuleResponse> createRedirectRule(CreateRedirectRuleRequest request);

    /**
     * @param request the request parameters of CreateRewriteUrlRule  CreateRewriteUrlRuleRequest
     * @return CreateRewriteUrlRuleResponse
     */
    CompletableFuture<CreateRewriteUrlRuleResponse> createRewriteUrlRule(CreateRewriteUrlRuleRequest request);

    /**
     * @param request the request parameters of CreateRoutine  CreateRoutineRequest
     * @return CreateRoutineResponse
     */
    CompletableFuture<CreateRoutineResponse> createRoutine(CreateRoutineRequest request);

    /**
     * @param request the request parameters of CreateRoutineBuild  CreateRoutineBuildRequest
     * @return CreateRoutineBuildResponse
     */
    CompletableFuture<CreateRoutineBuildResponse> createRoutineBuild(CreateRoutineBuildRequest request);

    /**
     * @param request the request parameters of CreateRoutineBuildConfiguration  CreateRoutineBuildConfigurationRequest
     * @return CreateRoutineBuildConfigurationResponse
     */
    CompletableFuture<CreateRoutineBuildConfigurationResponse> createRoutineBuildConfiguration(CreateRoutineBuildConfigurationRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>When creating a Routine code version deployment, the <code>Env</code> parameter only supports <code>staging</code> for the staging environment or <code>production</code> for the production environment.</li>
     * <li>The <code>CodeVersions</code> parameter supports a maximum of two versions for canary release, and the total percentage of these versions must equal 100%.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRoutineCodeDeployment  CreateRoutineCodeDeploymentRequest
     * @return CreateRoutineCodeDeploymentResponse
     */
    CompletableFuture<CreateRoutineCodeDeploymentResponse> createRoutineCodeDeployment(CreateRoutineCodeDeploymentRequest request);

    /**
     * @param request the request parameters of CreateRoutineRelatedRecord  CreateRoutineRelatedRecordRequest
     * @return CreateRoutineRelatedRecordResponse
     */
    CompletableFuture<CreateRoutineRelatedRecordResponse> createRoutineRelatedRecord(CreateRoutineRelatedRecordRequest request);

    /**
     * @param request the request parameters of CreateRoutineRoute  CreateRoutineRouteRequest
     * @return CreateRoutineRouteResponse
     */
    CompletableFuture<CreateRoutineRouteResponse> createRoutineRoute(CreateRoutineRouteRequest request);

    /**
     * @param request the request parameters of CreateRoutineWithAssetsCodeVersion  CreateRoutineWithAssetsCodeVersionRequest
     * @return CreateRoutineWithAssetsCodeVersionResponse
     */
    CompletableFuture<CreateRoutineWithAssetsCodeVersionResponse> createRoutineWithAssetsCodeVersion(CreateRoutineWithAssetsCodeVersionRequest request);

    /**
     * @param request the request parameters of CreateScheduledPreloadExecutions  CreateScheduledPreloadExecutionsRequest
     * @return CreateScheduledPreloadExecutionsResponse
     */
    CompletableFuture<CreateScheduledPreloadExecutionsResponse> createScheduledPreloadExecutions(CreateScheduledPreloadExecutionsRequest request);

    /**
     * @param request the request parameters of CreateScheduledPreloadJob  CreateScheduledPreloadJobRequest
     * @return CreateScheduledPreloadJobResponse
     */
    CompletableFuture<CreateScheduledPreloadJobResponse> createScheduledPreloadJob(CreateScheduledPreloadJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before creating a site, you must have an active plan instance.</li>
     * <li>If the acceleration area is set to the Chinese mainland only or global, the site domain name must have a valid Chinese Internet Content Provider (ICP) filing.</li>
     * <li>Each user can invoke this operation up to 100 times per hour.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSite  CreateSiteRequest
     * @return CreateSiteResponse
     */
    CompletableFuture<CreateSiteResponse> createSite(CreateSiteRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Custom field limits</strong>: The key name of a custom field can contain only letters, digits, underscores (_), and spaces. The key name cannot contain other characters. Otherwise, errors may occur.</p>
     * <ul>
     * <li><strong>Parameter passing</strong>: Submit <code>SiteId</code>, <code>RequestHeaders</code>, <code>ResponseHeaders</code>, and <code>Cookies</code> by using <code>formData</code>. Each array element matches a custom field name.</li>
     * <li><strong>(Required) SiteId</strong>: Although <code>SiteId</code> is not marked as required in the Required column, you must specify a website ID by using this parameter when you can call this API operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSiteCustomLog  CreateSiteCustomLogRequest
     * @return CreateSiteCustomLogResponse
     */
    CompletableFuture<CreateSiteCustomLogResponse> createSiteCustomLog(CreateSiteCustomLogRequest request);

    /**
     * <b>description</b> :
     * <p>The site plan associated with SiteId must support real-time log delivery (such as the Standard plan). Call GetSiteLogDeliveryQuota to perform a pre-check, or verify the plan level by checking the PlanName field returned by ListSites.</p>
     * 
     * @param request the request parameters of CreateSiteDeliveryTask  CreateSiteDeliveryTaskRequest
     * @return CreateSiteDeliveryTaskResponse
     */
    CompletableFuture<CreateSiteDeliveryTaskResponse> createSiteDeliveryTask(CreateSiteDeliveryTaskRequest request);

    /**
     * @param request the request parameters of CreateSlrRoleForRealtimeLog  CreateSlrRoleForRealtimeLogRequest
     * @return CreateSlrRoleForRealtimeLogResponse
     */
    CompletableFuture<CreateSlrRoleForRealtimeLogResponse> createSlrRoleForRealtimeLog(CreateSlrRoleForRealtimeLogRequest request);

    /**
     * <b>description</b> :
     * <p>The selected site must be activated. After you create a site, call the VerifySite operation to verify the site. A site that passes verification is automatically activated, which means the Passed response parameter is set to true.</p>
     * 
     * @param request the request parameters of CreateTransportLayerApplication  CreateTransportLayerApplicationRequest
     * @return CreateTransportLayerApplicationResponse
     */
    CompletableFuture<CreateTransportLayerApplicationResponse> createTransportLayerApplication(CreateTransportLayerApplicationRequest request);

    /**
     * @param request the request parameters of CreateUrlObservation  CreateUrlObservationRequest
     * @return CreateUrlObservationResponse
     */
    CompletableFuture<CreateUrlObservationResponse> createUrlObservation(CreateUrlObservationRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to create a delivery node for specific log data. Multiple delivery destinations and detailed configuration options are supported, including but not limited to Simple Log Service (SLS), HTTP services, Alibaba Cloud Object Storage Service (OSS), S3-compatible storage, and Kafka MSMQ. You can customize the node name, select log fields, specify a data center, set the discard rate, select a delivery type, and configure the corresponding delivery details based on the selected type.</p>
     * <ul>
     * <li><strong>Field selection</strong>: Use <code>FieldName</code> to specify the log fields to deliver.</li>
     * <li><strong>Filter rules</strong>: Use <code>FilterRules</code> to implement pre-processing and filtering of log data.</li>
     * <li><strong>Diverse delivery</strong>: Supports SLS, HTTP(S), Alibaba Cloud OSS, S3-compatible storage, and Kafka delivery methods, each with its own specific configuration parameters.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Ensure that the provided credentials (such as AccessKey and SecretKey) have sufficient permissions to perform the delivery operation.</li>
     * <li>When you select a delivery method that requires encryption or authentication, correctly configure the related security parameters.</li>
     * <li>Verify the syntax of <code>FilterRules</code> to ensure that the filtering logic meets your expectations.</li>
     * <li>Adjust advanced parameters such as the maximum number of retries and timeout period as needed to optimize delivery efficiency and stability.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUserDeliveryTask  CreateUserDeliveryTaskRequest
     * @return CreateUserDeliveryTaskResponse
     */
    CompletableFuture<CreateUserDeliveryTaskResponse> createUserDeliveryTask(CreateUserDeliveryTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation allows you to create a WAF ruleset for a specified instance.</li>
     * <li>InstanceId is a required parameter that specifies the instance for which you want to create the ruleset.</li>
     * <li>The Phase parameter defines the phase in which the ruleset is applied, such as custom rules or rate limiting.</li>
     * <li>Name and Expression are required parameters that specify the ruleset name and the match expression.</li>
     * <li>The optional Description parameter provides a text description of the ruleset function or purpose.</li>
     * <li>Status controls whether the ruleset takes effect immediately (<code>on</code>) or is disabled (<code>off</code>).</li>
     * <li>Use the Rules parameter to configure a detailed list of rules. Each rule contains properties such as name, position, expression, and action.</li>
     * <li>A successful response returns the unique identifier Id of the newly created ruleset and the RuleIds list of all associated rule IDs.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUserWafRuleset  CreateUserWafRulesetRequest
     * @return CreateUserWafRulesetResponse
     */
    CompletableFuture<CreateUserWafRulesetResponse> createUserWafRuleset(CreateUserWafRulesetRequest request);

    /**
     * @param request the request parameters of CreateVideoProcessing  CreateVideoProcessingRequest
     * @return CreateVideoProcessingResponse
     */
    CompletableFuture<CreateVideoProcessingResponse> createVideoProcessing(CreateVideoProcessingRequest request);

    /**
     * @param request the request parameters of CreateWafRule  CreateWafRuleRequest
     * @return CreateWafRuleResponse
     */
    CompletableFuture<CreateWafRuleResponse> createWafRule(CreateWafRuleRequest request);

    /**
     * @param request the request parameters of CreateWafRuleset  CreateWafRulesetRequest
     * @return CreateWafRulesetResponse
     */
    CompletableFuture<CreateWafRulesetResponse> createWafRuleset(CreateWafRulesetRequest request);

    /**
     * @param request the request parameters of CreateWaitingRoom  CreateWaitingRoomRequest
     * @return CreateWaitingRoomResponse
     */
    CompletableFuture<CreateWaitingRoomResponse> createWaitingRoom(CreateWaitingRoomRequest request);

    /**
     * <b>description</b> :
     * <p>Your site plan must be Advanced or higher to use this feature. The number of configurations for this feature cannot exceed the quota included in your site plan.</p>
     * 
     * @param request the request parameters of CreateWaitingRoomEvent  CreateWaitingRoomEventRequest
     * @return CreateWaitingRoomEventResponse
     */
    CompletableFuture<CreateWaitingRoomEventResponse> createWaitingRoomEvent(CreateWaitingRoomEventRequest request);

    /**
     * <b>description</b> :
     * <p>Your site plan must be Enterprise Edition or higher to use this feature, and the site plan must support this feature.</p>
     * 
     * @param request the request parameters of CreateWaitingRoomRule  CreateWaitingRoomRuleRequest
     * @return CreateWaitingRoomRuleResponse
     */
    CompletableFuture<CreateWaitingRoomRuleResponse> createWaitingRoomRule(CreateWaitingRoomRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Version management must be enabled through the ActivateVersionManagement operation (the site VersionManagement status is true). Version management can be disabled only when only version 0 and the default environment exist.</p>
     * 
     * @param request the request parameters of DeactivateVersionManagement  DeactivateVersionManagementRequest
     * @return DeactivateVersionManagementResponse
     */
    CompletableFuture<DeactivateVersionManagementResponse> deactivateVersionManagement(DeactivateVersionManagementRequest request);

    /**
     * @param request the request parameters of DeleteCacheRule  DeleteCacheRuleRequest
     * @return DeleteCacheRuleResponse
     */
    CompletableFuture<DeleteCacheRuleResponse> deleteCacheRule(DeleteCacheRuleRequest request);

    /**
     * @param request the request parameters of DeleteCertificate  DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request);

    /**
     * @param request the request parameters of DeleteClientCaCertificate  DeleteClientCaCertificateRequest
     * @return DeleteClientCaCertificateResponse
     */
    CompletableFuture<DeleteClientCaCertificateResponse> deleteClientCaCertificate(DeleteClientCaCertificateRequest request);

    /**
     * @param request the request parameters of DeleteClientCertificate  DeleteClientCertificateRequest
     * @return DeleteClientCertificateResponse
     */
    CompletableFuture<DeleteClientCertificateResponse> deleteClientCertificate(DeleteClientCertificateRequest request);

    /**
     * @param request the request parameters of DeleteCompressionRule  DeleteCompressionRuleRequest
     * @return DeleteCompressionRuleResponse
     */
    CompletableFuture<DeleteCompressionRuleResponse> deleteCompressionRule(DeleteCompressionRuleRequest request);

    /**
     * @param request the request parameters of DeleteCustomHostname  DeleteCustomHostnameRequest
     * @return DeleteCustomHostnameResponse
     */
    CompletableFuture<DeleteCustomHostnameResponse> deleteCustomHostname(DeleteCustomHostnameRequest request);

    /**
     * @param request the request parameters of DeleteCustomResponseCodeRule  DeleteCustomResponseCodeRuleRequest
     * @return DeleteCustomResponseCodeRuleResponse
     */
    CompletableFuture<DeleteCustomResponseCodeRuleResponse> deleteCustomResponseCodeRule(DeleteCustomResponseCodeRuleRequest request);

    /**
     * @param request the request parameters of DeleteCustomScenePolicy  DeleteCustomScenePolicyRequest
     * @return DeleteCustomScenePolicyResponse
     */
    CompletableFuture<DeleteCustomScenePolicyResponse> deleteCustomScenePolicy(DeleteCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of DeleteEdgeContainerApp  DeleteEdgeContainerAppRequest
     * @return DeleteEdgeContainerAppResponse
     */
    CompletableFuture<DeleteEdgeContainerAppResponse> deleteEdgeContainerApp(DeleteEdgeContainerAppRequest request);

    /**
     * @param request the request parameters of DeleteEdgeContainerAppImageSecret  DeleteEdgeContainerAppImageSecretRequest
     * @return DeleteEdgeContainerAppImageSecretResponse
     */
    CompletableFuture<DeleteEdgeContainerAppImageSecretResponse> deleteEdgeContainerAppImageSecret(DeleteEdgeContainerAppImageSecretRequest request);

    /**
     * @param request the request parameters of DeleteEdgeContainerAppRecord  DeleteEdgeContainerAppRecordRequest
     * @return DeleteEdgeContainerAppRecordResponse
     */
    CompletableFuture<DeleteEdgeContainerAppRecordResponse> deleteEdgeContainerAppRecord(DeleteEdgeContainerAppRecordRequest request);

    /**
     * @param request the request parameters of DeleteEdgeContainerAppVersion  DeleteEdgeContainerAppVersionRequest
     * @return DeleteEdgeContainerAppVersionResponse
     */
    CompletableFuture<DeleteEdgeContainerAppVersionResponse> deleteEdgeContainerAppVersion(DeleteEdgeContainerAppVersionRequest request);

    /**
     * @param request the request parameters of DeleteEnvironment  DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     */
    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    /**
     * @param request the request parameters of DeleteHttpDDoSIntelligentRule  DeleteHttpDDoSIntelligentRuleRequest
     * @return DeleteHttpDDoSIntelligentRuleResponse
     */
    CompletableFuture<DeleteHttpDDoSIntelligentRuleResponse> deleteHttpDDoSIntelligentRule(DeleteHttpDDoSIntelligentRuleRequest request);

    /**
     * @param request the request parameters of DeleteHttpIncomingRequestHeaderModificationRule  DeleteHttpIncomingRequestHeaderModificationRuleRequest
     * @return DeleteHttpIncomingRequestHeaderModificationRuleResponse
     */
    CompletableFuture<DeleteHttpIncomingRequestHeaderModificationRuleResponse> deleteHttpIncomingRequestHeaderModificationRule(DeleteHttpIncomingRequestHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of DeleteHttpIncomingResponseHeaderModificationRule  DeleteHttpIncomingResponseHeaderModificationRuleRequest
     * @return DeleteHttpIncomingResponseHeaderModificationRuleResponse
     */
    CompletableFuture<DeleteHttpIncomingResponseHeaderModificationRuleResponse> deleteHttpIncomingResponseHeaderModificationRule(DeleteHttpIncomingResponseHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of DeleteHttpRequestHeaderModificationRule  DeleteHttpRequestHeaderModificationRuleRequest
     * @return DeleteHttpRequestHeaderModificationRuleResponse
     */
    CompletableFuture<DeleteHttpRequestHeaderModificationRuleResponse> deleteHttpRequestHeaderModificationRule(DeleteHttpRequestHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of DeleteHttpResponseHeaderModificationRule  DeleteHttpResponseHeaderModificationRuleRequest
     * @return DeleteHttpResponseHeaderModificationRuleResponse
     */
    CompletableFuture<DeleteHttpResponseHeaderModificationRuleResponse> deleteHttpResponseHeaderModificationRule(DeleteHttpResponseHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of DeleteHttpsApplicationConfiguration  DeleteHttpsApplicationConfigurationRequest
     * @return DeleteHttpsApplicationConfigurationResponse
     */
    CompletableFuture<DeleteHttpsApplicationConfigurationResponse> deleteHttpsApplicationConfiguration(DeleteHttpsApplicationConfigurationRequest request);

    /**
     * @param request the request parameters of DeleteHttpsBasicConfiguration  DeleteHttpsBasicConfigurationRequest
     * @return DeleteHttpsBasicConfigurationResponse
     */
    CompletableFuture<DeleteHttpsBasicConfigurationResponse> deleteHttpsBasicConfiguration(DeleteHttpsBasicConfigurationRequest request);

    /**
     * @param request the request parameters of DeleteImageTransform  DeleteImageTransformRequest
     * @return DeleteImageTransformResponse
     */
    CompletableFuture<DeleteImageTransformResponse> deleteImageTransform(DeleteImageTransformRequest request);

    /**
     * @param request the request parameters of DeleteKeylessServer  DeleteKeylessServerRequest
     * @return DeleteKeylessServerResponse
     */
    CompletableFuture<DeleteKeylessServerResponse> deleteKeylessServer(DeleteKeylessServerRequest request);

    /**
     * @param request the request parameters of DeleteKv  DeleteKvRequest
     * @return DeleteKvResponse
     */
    CompletableFuture<DeleteKvResponse> deleteKv(DeleteKvRequest request);

    /**
     * @param request the request parameters of DeleteKvNamespace  DeleteKvNamespaceRequest
     * @return DeleteKvNamespaceResponse
     */
    CompletableFuture<DeleteKvNamespaceResponse> deleteKvNamespace(DeleteKvNamespaceRequest request);

    /**
     * @param request the request parameters of DeleteList  DeleteListRequest
     * @return DeleteListResponse
     */
    CompletableFuture<DeleteListResponse> deleteList(DeleteListRequest request);

    /**
     * <b>description</b> :
     * <p>Delete a load balancer by its ID, only one can be deleted at a time.</p>
     * 
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    /**
     * @param request the request parameters of DeleteNetworkOptimization  DeleteNetworkOptimizationRequest
     * @return DeleteNetworkOptimizationResponse
     */
    CompletableFuture<DeleteNetworkOptimizationResponse> deleteNetworkOptimization(DeleteNetworkOptimizationRequest request);

    /**
     * @param request the request parameters of DeleteOriginCaCertificate  DeleteOriginCaCertificateRequest
     * @return DeleteOriginCaCertificateResponse
     */
    CompletableFuture<DeleteOriginCaCertificateResponse> deleteOriginCaCertificate(DeleteOriginCaCertificateRequest request);

    /**
     * @param request the request parameters of DeleteOriginClientCertificate  DeleteOriginClientCertificateRequest
     * @return DeleteOriginClientCertificateResponse
     */
    CompletableFuture<DeleteOriginClientCertificateResponse> deleteOriginClientCertificate(DeleteOriginClientCertificateRequest request);

    /**
     * @param request the request parameters of DeleteOriginPool  DeleteOriginPoolRequest
     * @return DeleteOriginPoolResponse
     */
    CompletableFuture<DeleteOriginPoolResponse> deleteOriginPool(DeleteOriginPoolRequest request);

    /**
     * @param request the request parameters of DeleteOriginProtection  DeleteOriginProtectionRequest
     * @return DeleteOriginProtectionResponse
     */
    CompletableFuture<DeleteOriginProtectionResponse> deleteOriginProtection(DeleteOriginProtectionRequest request);

    /**
     * @param request the request parameters of DeleteOriginRule  DeleteOriginRuleRequest
     * @return DeleteOriginRuleResponse
     */
    CompletableFuture<DeleteOriginRuleResponse> deleteOriginRule(DeleteOriginRuleRequest request);

    /**
     * @param request the request parameters of DeletePage  DeletePageRequest
     * @return DeletePageResponse
     */
    CompletableFuture<DeletePageResponse> deletePage(DeletePageRequest request);

    /**
     * @param request the request parameters of DeleteRecord  DeleteRecordRequest
     * @return DeleteRecordResponse
     */
    CompletableFuture<DeleteRecordResponse> deleteRecord(DeleteRecordRequest request);

    /**
     * @param request the request parameters of DeleteRedirectRule  DeleteRedirectRuleRequest
     * @return DeleteRedirectRuleResponse
     */
    CompletableFuture<DeleteRedirectRuleResponse> deleteRedirectRule(DeleteRedirectRuleRequest request);

    /**
     * @param request the request parameters of DeleteRewriteUrlRule  DeleteRewriteUrlRuleRequest
     * @return DeleteRewriteUrlRuleResponse
     */
    CompletableFuture<DeleteRewriteUrlRuleResponse> deleteRewriteUrlRule(DeleteRewriteUrlRuleRequest request);

    /**
     * @param request the request parameters of DeleteRoutine  DeleteRoutineRequest
     * @return DeleteRoutineResponse
     */
    CompletableFuture<DeleteRoutineResponse> deleteRoutine(DeleteRoutineRequest request);

    /**
     * @param request the request parameters of DeleteRoutineBuildConfiguration  DeleteRoutineBuildConfigurationRequest
     * @return DeleteRoutineBuildConfigurationResponse
     */
    CompletableFuture<DeleteRoutineBuildConfigurationResponse> deleteRoutineBuildConfiguration(DeleteRoutineBuildConfigurationRequest request);

    /**
     * @param request the request parameters of DeleteRoutineCodeVersion  DeleteRoutineCodeVersionRequest
     * @return DeleteRoutineCodeVersionResponse
     */
    CompletableFuture<DeleteRoutineCodeVersionResponse> deleteRoutineCodeVersion(DeleteRoutineCodeVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>When you create a Routine code version for deployment, the environment name <code>Env</code> supports only the staging environment <code>staging</code> or the production environment <code>production</code>.</li>
     * <li>The <code>CodeVersions</code> parameter supports canary release of up to two versions, and the total proportion of these versions must equal 100%.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRoutineEnvironmentVariables  DeleteRoutineEnvironmentVariablesRequest
     * @return DeleteRoutineEnvironmentVariablesResponse
     */
    CompletableFuture<DeleteRoutineEnvironmentVariablesResponse> deleteRoutineEnvironmentVariables(DeleteRoutineEnvironmentVariablesRequest request);

    /**
     * @param request the request parameters of DeleteRoutineRelatedRecord  DeleteRoutineRelatedRecordRequest
     * @return DeleteRoutineRelatedRecordResponse
     */
    CompletableFuture<DeleteRoutineRelatedRecordResponse> deleteRoutineRelatedRecord(DeleteRoutineRelatedRecordRequest request);

    /**
     * @param request the request parameters of DeleteRoutineRoute  DeleteRoutineRouteRequest
     * @return DeleteRoutineRouteResponse
     */
    CompletableFuture<DeleteRoutineRouteResponse> deleteRoutineRoute(DeleteRoutineRouteRequest request);

    /**
     * @param request the request parameters of DeleteScheduledPreloadExecution  DeleteScheduledPreloadExecutionRequest
     * @return DeleteScheduledPreloadExecutionResponse
     */
    CompletableFuture<DeleteScheduledPreloadExecutionResponse> deleteScheduledPreloadExecution(DeleteScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of DeleteScheduledPreloadJob  DeleteScheduledPreloadJobRequest
     * @return DeleteScheduledPreloadJobResponse
     */
    CompletableFuture<DeleteScheduledPreloadJobResponse> deleteScheduledPreloadJob(DeleteScheduledPreloadJobRequest request);

    /**
     * @param request the request parameters of DeleteSite  DeleteSiteRequest
     * @return DeleteSiteResponse
     */
    CompletableFuture<DeleteSiteResponse> deleteSite(DeleteSiteRequest request);

    /**
     * @param request the request parameters of DeleteSiteDeliveryTask  DeleteSiteDeliveryTaskRequest
     * @return DeleteSiteDeliveryTaskResponse
     */
    CompletableFuture<DeleteSiteDeliveryTaskResponse> deleteSiteDeliveryTask(DeleteSiteDeliveryTaskRequest request);

    /**
     * @param request the request parameters of DeleteSiteOriginClientCertificate  DeleteSiteOriginClientCertificateRequest
     * @return DeleteSiteOriginClientCertificateResponse
     */
    CompletableFuture<DeleteSiteOriginClientCertificateResponse> deleteSiteOriginClientCertificate(DeleteSiteOriginClientCertificateRequest request);

    /**
     * @param request the request parameters of DeleteTransportLayerApplication  DeleteTransportLayerApplicationRequest
     * @return DeleteTransportLayerApplicationResponse
     */
    CompletableFuture<DeleteTransportLayerApplicationResponse> deleteTransportLayerApplication(DeleteTransportLayerApplicationRequest request);

    /**
     * @param request the request parameters of DeleteUrlObservation  DeleteUrlObservationRequest
     * @return DeleteUrlObservationResponse
     */
    CompletableFuture<DeleteUrlObservationResponse> deleteUrlObservation(DeleteUrlObservationRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to delete an existing task delivery configuration based on the specified <strong>task name</strong> and <strong>Alibaba Cloud UID</strong>. Before proceeding, verify that the provided information is accurate to avoid disrupting the processing of related logs or data.
     * <strong>Note:</strong></p>
     * <ul>
     * <li>The deletion operation is irreversible. Proceed with caution.</li>
     * <li>Only accounts with the required permissions can call this operation.</li>
     * <li>You can use the returned <code>RequestId</code> to track the request progress and troubleshoot issues.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteUserDeliveryTask  DeleteUserDeliveryTaskRequest
     * @return DeleteUserDeliveryTaskResponse
     */
    CompletableFuture<DeleteUserDeliveryTaskResponse> deleteUserDeliveryTask(DeleteUserDeliveryTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>The <code>InstanceId</code> and <code>Id</code> parameters are required. These parameters specify the ID of the WAF instance and the ID of the ruleset to delete.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteUserWafRuleset  DeleteUserWafRulesetRequest
     * @return DeleteUserWafRulesetResponse
     */
    CompletableFuture<DeleteUserWafRulesetResponse> deleteUserWafRuleset(DeleteUserWafRulesetRequest request);

    /**
     * @param request the request parameters of DeleteVersion  DeleteVersionRequest
     * @return DeleteVersionResponse
     */
    CompletableFuture<DeleteVersionResponse> deleteVersion(DeleteVersionRequest request);

    /**
     * @param request the request parameters of DeleteVideoProcessing  DeleteVideoProcessingRequest
     * @return DeleteVideoProcessingResponse
     */
    CompletableFuture<DeleteVideoProcessingResponse> deleteVideoProcessing(DeleteVideoProcessingRequest request);

    /**
     * @param request the request parameters of DeleteWafRule  DeleteWafRuleRequest
     * @return DeleteWafRuleResponse
     */
    CompletableFuture<DeleteWafRuleResponse> deleteWafRule(DeleteWafRuleRequest request);

    /**
     * @param request the request parameters of DeleteWafRuleset  DeleteWafRulesetRequest
     * @return DeleteWafRulesetResponse
     */
    CompletableFuture<DeleteWafRulesetResponse> deleteWafRuleset(DeleteWafRulesetRequest request);

    /**
     * @param request the request parameters of DeleteWaitingRoom  DeleteWaitingRoomRequest
     * @return DeleteWaitingRoomResponse
     */
    CompletableFuture<DeleteWaitingRoomResponse> deleteWaitingRoom(DeleteWaitingRoomRequest request);

    /**
     * @param request the request parameters of DeleteWaitingRoomEvent  DeleteWaitingRoomEventRequest
     * @return DeleteWaitingRoomEventResponse
     */
    CompletableFuture<DeleteWaitingRoomEventResponse> deleteWaitingRoomEvent(DeleteWaitingRoomEventRequest request);

    /**
     * @param request the request parameters of DeleteWaitingRoomRule  DeleteWaitingRoomRuleRequest
     * @return DeleteWaitingRoomRuleResponse
     */
    CompletableFuture<DeleteWaitingRoomRuleResponse> deleteWaitingRoomRule(DeleteWaitingRoomRuleRequest request);

    /**
     * @param request the request parameters of DescribeBotPrice  DescribeBotPriceRequest
     * @return DescribeBotPriceResponse
     */
    CompletableFuture<DescribeBotPriceResponse> describeBotPrice(DescribeBotPriceRequest request);

    /**
     * @param request the request parameters of DescribeCacheReservePrice  DescribeCacheReservePriceRequest
     * @return DescribeCacheReservePriceResponse
     */
    CompletableFuture<DescribeCacheReservePriceResponse> describeCacheReservePrice(DescribeCacheReservePriceRequest request);

    /**
     * @param request the request parameters of DescribeCacheReservePriceGap  DescribeCacheReservePriceGapRequest
     * @return DescribeCacheReservePriceGapResponse
     */
    CompletableFuture<DescribeCacheReservePriceGapResponse> describeCacheReservePriceGap(DescribeCacheReservePriceGapRequest request);

    /**
     * @param request the request parameters of DescribeConditionIPBInfo  DescribeConditionIPBInfoRequest
     * @return DescribeConditionIPBInfoResponse
     */
    CompletableFuture<DescribeConditionIPBInfoResponse> describeConditionIPBInfo(DescribeConditionIPBInfoRequest request);

    /**
     * @param request the request parameters of DescribeCustomScenePolicies  DescribeCustomScenePoliciesRequest
     * @return DescribeCustomScenePoliciesResponse
     */
    CompletableFuture<DescribeCustomScenePoliciesResponse> describeCustomScenePolicies(DescribeCustomScenePoliciesRequest request);

    /**
     * @param request the request parameters of DescribeDDoSAllEventList  DescribeDDoSAllEventListRequest
     * @return DescribeDDoSAllEventListResponse
     */
    CompletableFuture<DescribeDDoSAllEventListResponse> describeDDoSAllEventList(DescribeDDoSAllEventListRequest request);

    /**
     * @param request the request parameters of DescribeDDoSBpsList  DescribeDDoSBpsListRequest
     * @return DescribeDDoSBpsListResponse
     */
    CompletableFuture<DescribeDDoSBpsListResponse> describeDDoSBpsList(DescribeDDoSBpsListRequest request);

    /**
     * @param request the request parameters of DescribeDDoSBpsMax  DescribeDDoSBpsMaxRequest
     * @return DescribeDDoSBpsMaxResponse
     */
    CompletableFuture<DescribeDDoSBpsMaxResponse> describeDDoSBpsMax(DescribeDDoSBpsMaxRequest request);

    /**
     * @param request the request parameters of DescribeDDoSEventMax  DescribeDDoSEventMaxRequest
     * @return DescribeDDoSEventMaxResponse
     */
    CompletableFuture<DescribeDDoSEventMaxResponse> describeDDoSEventMax(DescribeDDoSEventMaxRequest request);

    /**
     * @param request the request parameters of DescribeDDoSL7QpsList  DescribeDDoSL7QpsListRequest
     * @return DescribeDDoSL7QpsListResponse
     */
    CompletableFuture<DescribeDDoSL7QpsListResponse> describeDDoSL7QpsList(DescribeDDoSL7QpsListRequest request);

    /**
     * @param request the request parameters of DescribeDDoSOverseasAttackCount  DescribeDDoSOverseasAttackCountRequest
     * @return DescribeDDoSOverseasAttackCountResponse
     */
    CompletableFuture<DescribeDDoSOverseasAttackCountResponse> describeDDoSOverseasAttackCount(DescribeDDoSOverseasAttackCountRequest request);

    /**
     * @param request the request parameters of DescribeDDoSPrice  DescribeDDoSPriceRequest
     * @return DescribeDDoSPriceResponse
     */
    CompletableFuture<DescribeDDoSPriceResponse> describeDDoSPrice(DescribeDDoSPriceRequest request);

    /**
     * @param request the request parameters of DescribeDdosMaxBurstGbps  DescribeDdosMaxBurstGbpsRequest
     * @return DescribeDdosMaxBurstGbpsResponse
     */
    CompletableFuture<DescribeDdosMaxBurstGbpsResponse> describeDdosMaxBurstGbps(DescribeDdosMaxBurstGbpsRequest request);

    /**
     * @param request the request parameters of DescribeEdgeContainerAppStats  DescribeEdgeContainerAppStatsRequest
     * @return DescribeEdgeContainerAppStatsResponse
     */
    CompletableFuture<DescribeEdgeContainerAppStatsResponse> describeEdgeContainerAppStats(DescribeEdgeContainerAppStatsRequest request);

    /**
     * @param request the request parameters of DescribeHttpDDoSAttackIntelligentProtection  DescribeHttpDDoSAttackIntelligentProtectionRequest
     * @return DescribeHttpDDoSAttackIntelligentProtectionResponse
     */
    CompletableFuture<DescribeHttpDDoSAttackIntelligentProtectionResponse> describeHttpDDoSAttackIntelligentProtection(DescribeHttpDDoSAttackIntelligentProtectionRequest request);

    /**
     * @param request the request parameters of DescribeHttpDDoSAttackProtection  DescribeHttpDDoSAttackProtectionRequest
     * @return DescribeHttpDDoSAttackProtectionResponse
     */
    CompletableFuture<DescribeHttpDDoSAttackProtectionResponse> describeHttpDDoSAttackProtection(DescribeHttpDDoSAttackProtectionRequest request);

    /**
     * @param request the request parameters of DescribeHttpDDoSAttackRules  DescribeHttpDDoSAttackRulesRequest
     * @return DescribeHttpDDoSAttackRulesResponse
     */
    CompletableFuture<DescribeHttpDDoSAttackRulesResponse> describeHttpDDoSAttackRules(DescribeHttpDDoSAttackRulesRequest request);

    /**
     * @param request the request parameters of DescribeHttpDDoSIntelligentAclRules  DescribeHttpDDoSIntelligentAclRulesRequest
     * @return DescribeHttpDDoSIntelligentAclRulesResponse
     */
    CompletableFuture<DescribeHttpDDoSIntelligentAclRulesResponse> describeHttpDDoSIntelligentAclRules(DescribeHttpDDoSIntelligentAclRulesRequest request);

    /**
     * @param request the request parameters of DescribeHttpDDoSIntelligentRateLimitRules  DescribeHttpDDoSIntelligentRateLimitRulesRequest
     * @return DescribeHttpDDoSIntelligentRateLimitRulesResponse
     */
    CompletableFuture<DescribeHttpDDoSIntelligentRateLimitRulesResponse> describeHttpDDoSIntelligentRateLimitRules(DescribeHttpDDoSIntelligentRateLimitRulesRequest request);

    /**
     * @param request the request parameters of DescribeKvAccountStatus  DescribeKvAccountStatusRequest
     * @return DescribeKvAccountStatusResponse
     */
    CompletableFuture<DescribeKvAccountStatusResponse> describeKvAccountStatus(DescribeKvAccountStatusRequest request);

    /**
     * @param request the request parameters of DescribePreloadTasks  DescribePreloadTasksRequest
     * @return DescribePreloadTasksResponse
     */
    CompletableFuture<DescribePreloadTasksResponse> describePreloadTasks(DescribePreloadTasksRequest request);

    /**
     * @param request the request parameters of DescribePurgeTasks  DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     */
    CompletableFuture<DescribePurgeTasksResponse> describePurgeTasks(DescribePurgeTasksRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the instance status of a plan only after you purchase and create the plan instance.</p>
     * 
     * @param request the request parameters of DescribeRatePlanInstanceStatus  DescribeRatePlanInstanceStatusRequest
     * @return DescribeRatePlanInstanceStatusResponse
     */
    CompletableFuture<DescribeRatePlanInstanceStatusResponse> describeRatePlanInstanceStatus(DescribeRatePlanInstanceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>The purchase period is measured in months.</p>
     * 
     * @param request the request parameters of DescribeRatePlanPrice  DescribeRatePlanPriceRequest
     * @return DescribeRatePlanPriceResponse
     */
    CompletableFuture<DescribeRatePlanPriceResponse> describeRatePlanPrice(DescribeRatePlanPriceRequest request);

    /**
     * <b>description</b> :
     * <p>The plan name and plan code can be obtained from the <a href="~~DescribeRatePlanPrice~~">DescribeRatePlanPrice</a> operation.</p>
     * 
     * @param request the request parameters of DescribeRatePlanPriceGap  DescribeRatePlanPriceGapRequest
     * @return DescribeRatePlanPriceGapResponse
     */
    CompletableFuture<DescribeRatePlanPriceGapResponse> describeRatePlanPriceGap(DescribeRatePlanPriceGapRequest request);

    /**
     * @param request the request parameters of DescribeRuleMetadata  DescribeRuleMetadataRequest
     * @return DescribeRuleMetadataResponse
     */
    CompletableFuture<DescribeRuleMetadataResponse> describeRuleMetadata(DescribeRuleMetadataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you do not specify StartTime and EndTime, log data from the past 24 hours is returned by default. If you specify StartTime and EndTime, logs are queried based on the specified time range.</li>
     * <li>The time granularity for querying data is one hour.</li>
     * <li>The maximum number of times that each user can call this operation per second: 50.</li>
     * <li>Only log records from the last month can be queried (the time span between the start time and the current time cannot exceed 31 days).</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSiteLogs  DescribeSiteLogsRequest
     * @return DescribeSiteLogsResponse
     */
    CompletableFuture<DescribeSiteLogsResponse> describeSiteLogs(DescribeSiteLogsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you do not specify StartTime and EndTime, this operation returns data from the past 24 hours. If you specify StartTime and EndTime, this operation returns data for the specified time range.</li>
     * <li>The time granularity of returned data varies based on the time span between StartTime and EndTime.<ul>
     * <li>Less than or equal to 3 hours: returns data at 1-minute granularity.</li>
     * <li>Greater than 3 hours and less than or equal to 12 hours: returns data at 5-minute granularity.</li>
     * <li>Greater than 12 hours and less than or equal to 1 day: returns data at 15-minute granularity.</li>
     * <li>Greater than 1 day and less than or equal to 10 days: returns data at 1-hour granularity.</li>
     * <li>Greater than 10 days and less than or equal to 31 days: returns data at 1-day granularity.</li>
     * </ul>
     * </li>
     * <li>Due to the large number of access requests during the query time range, data analytics results may involve sampling.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSiteTimeSeriesData  DescribeSiteTimeSeriesDataRequest
     * @return DescribeSiteTimeSeriesDataResponse
     */
    CompletableFuture<DescribeSiteTimeSeriesDataResponse> describeSiteTimeSeriesData(DescribeSiteTimeSeriesDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you do not specify StartTime and EndTime, data from the last 24 hours is returned. If you specify StartTime and EndTime, data for the specified time range is returned.</li>
     * <li>Due to a large number of visits during the queried time range, the data analytics results may be sampled.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSiteTopData  DescribeSiteTopDataRequest
     * @return DescribeSiteTopDataResponse
     */
    CompletableFuture<DescribeSiteTopDataResponse> describeSiteTopData(DescribeSiteTopDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you do not specify StartTime and EndTime, this operation returns data from the past 24 hours. If you specify StartTime and EndTime, this operation returns data for the specified time range.</li>
     * <li>The time granularity of the returned data varies based on the time span between StartTime and EndTime.<ul>
     * <li>Less than or equal to 3 hours: returns data at 1-minute granularity.</li>
     * <li>Greater than 3 hours and less than or equal to 12 hours: returns data at 5-minute granularity.</li>
     * <li>Greater than 12 hours and less than or equal to 1 day: returns data at 15-minute granularity.</li>
     * <li>Greater than 1 day and less than or equal to 10 days: returns data at 1-hour granularity.</li>
     * <li>Greater than 10 days and less than or equal to 31 days: returns data at 1-day granularity.</li>
     * </ul>
     * </li>
     * <li>Because the number of access requests during the query period may be large, the data analytics results may be based on sampling.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSiteWafTimeSeriesData  DescribeSiteWafTimeSeriesDataRequest
     * @return DescribeSiteWafTimeSeriesDataResponse
     */
    CompletableFuture<DescribeSiteWafTimeSeriesDataResponse> describeSiteWafTimeSeriesData(DescribeSiteWafTimeSeriesDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you do not specify StartTime or EndTime, this operation returns data from the past 24 hours. If you specify StartTime and EndTime, this operation returns data for the specified time range.</li>
     * <li>Because of the high number of access requests during the query time range, data analytics may involve sampling.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSiteWafTopData  DescribeSiteWafTopDataRequest
     * @return DescribeSiteWafTopDataResponse
     */
    CompletableFuture<DescribeSiteWafTopDataResponse> describeSiteWafTopData(DescribeSiteWafTopDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Make sure that you have activated the Layer 4 acceleration service before calling this operation.1. Call GenerateTraceDiagnose to obtain a diagnostic link. 2. Open the link in a browser to complete client diagnostics. 3. Call ListTraceTasks to obtain the TaskId/TraceId. 4. Call this operation to retrieve the report.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeTraceDiagnoseReport  DescribeTraceDiagnoseReportRequest
     * @return DescribeTraceDiagnoseReportResponse
     */
    CompletableFuture<DescribeTraceDiagnoseReportResponse> describeTraceDiagnoseReport(DescribeTraceDiagnoseReportRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not specify StartTime and EndTime, this operation returns data from the past 24 hours. If you specify StartTime and EndTime, this operation returns data for the specified time range.</p>
     * 
     * @param request the request parameters of DescribeUrlObservationData  DescribeUrlObservationDataRequest
     * @return DescribeUrlObservationDataResponse
     */
    CompletableFuture<DescribeUrlObservationDataResponse> describeUrlObservationData(DescribeUrlObservationDataRequest request);

    /**
     * @param request the request parameters of DescribeUserResourcePackage  DescribeUserResourcePackageRequest
     * @return DescribeUserResourcePackageResponse
     */
    CompletableFuture<DescribeUserResourcePackageResponse> describeUserResourcePackage(DescribeUserResourcePackageRequest request);

    /**
     * <b>description</b> :
     * <p>Maximum storage duration: 93 days.</p>
     * <ul>
     * <li>Maximum query time range: 31 days.</li>
     * <li>Default time range: 24 hours.
     * All times are expressed in UTC+0.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeWafUsageData  DescribeWafUsageDataRequest
     * @return DescribeWafUsageDataResponse
     */
    CompletableFuture<DescribeWafUsageDataResponse> describeWafUsageData(DescribeWafUsageDataRequest request);

    /**
     * @param request the request parameters of DisableCustomScenePolicy  DisableCustomScenePolicyRequest
     * @return DisableCustomScenePolicyResponse
     */
    CompletableFuture<DisableCustomScenePolicyResponse> disableCustomScenePolicy(DisableCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of EditSiteWafSettings  EditSiteWafSettingsRequest
     * @return EditSiteWafSettingsResponse
     */
    CompletableFuture<EditSiteWafSettingsResponse> editSiteWafSettings(EditSiteWafSettingsRequest request);

    /**
     * @param request the request parameters of EnableCustomScenePolicy  EnableCustomScenePolicyRequest
     * @return EnableCustomScenePolicyResponse
     */
    CompletableFuture<EnableCustomScenePolicyResponse> enableCustomScenePolicy(EnableCustomScenePolicyRequest request);

    /**
     * @param request the request parameters of ExportRecordCnames  ExportRecordCnamesRequest
     * @return ExportRecordCnamesResponse
     */
    CompletableFuture<ExportRecordCnamesResponse> exportRecordCnames(ExportRecordCnamesRequest request);

    /**
     * @param request the request parameters of ExportRecords  ExportRecordsRequest
     * @return ExportRecordsResponse
     */
    CompletableFuture<ExportRecordsResponse> exportRecords(ExportRecordsRequest request);

    /**
     * @param request the request parameters of GenerateTraceDiagnose  GenerateTraceDiagnoseRequest
     * @return GenerateTraceDiagnoseResponse
     */
    CompletableFuture<GenerateTraceDiagnoseResponse> generateTraceDiagnose(GenerateTraceDiagnoseRequest request);

    /**
     * @param request the request parameters of GetApiSchemaUsage  GetApiSchemaUsageRequest
     * @return GetApiSchemaUsageResponse
     */
    CompletableFuture<GetApiSchemaUsageResponse> getApiSchemaUsage(GetApiSchemaUsageRequest request);

    /**
     * @param request the request parameters of GetAutomaticFrequencyControlConfig  GetAutomaticFrequencyControlConfigRequest
     * @return GetAutomaticFrequencyControlConfigResponse
     */
    CompletableFuture<GetAutomaticFrequencyControlConfigResponse> getAutomaticFrequencyControlConfig(GetAutomaticFrequencyControlConfigRequest request);

    /**
     * @param request the request parameters of GetCacheReserve  GetCacheReserveRequest
     * @return GetCacheReserveResponse
     */
    CompletableFuture<GetCacheReserveResponse> getCacheReserve(GetCacheReserveRequest request);

    /**
     * @param request the request parameters of GetCacheReserveSpecification  GetCacheReserveSpecificationRequest
     * @return GetCacheReserveSpecificationResponse
     */
    CompletableFuture<GetCacheReserveSpecificationResponse> getCacheReserveSpecification(GetCacheReserveSpecificationRequest request);

    /**
     * @param request the request parameters of GetCacheRule  GetCacheRuleRequest
     * @return GetCacheRuleResponse
     */
    CompletableFuture<GetCacheRuleResponse> getCacheRule(GetCacheRuleRequest request);

    /**
     * @param request the request parameters of GetCacheTag  GetCacheTagRequest
     * @return GetCacheTagResponse
     */
    CompletableFuture<GetCacheTagResponse> getCacheTag(GetCacheTagRequest request);

    /**
     * @param request the request parameters of GetCertificate  GetCertificateRequest
     * @return GetCertificateResponse
     */
    CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request);

    /**
     * @param request the request parameters of GetCertificateQuota  GetCertificateQuotaRequest
     * @return GetCertificateQuotaResponse
     */
    CompletableFuture<GetCertificateQuotaResponse> getCertificateQuota(GetCertificateQuotaRequest request);

    /**
     * @param request the request parameters of GetClientCaCertificate  GetClientCaCertificateRequest
     * @return GetClientCaCertificateResponse
     */
    CompletableFuture<GetClientCaCertificateResponse> getClientCaCertificate(GetClientCaCertificateRequest request);

    /**
     * @param request the request parameters of GetClientCaCertificateHostnames  GetClientCaCertificateHostnamesRequest
     * @return GetClientCaCertificateHostnamesResponse
     */
    CompletableFuture<GetClientCaCertificateHostnamesResponse> getClientCaCertificateHostnames(GetClientCaCertificateHostnamesRequest request);

    /**
     * @param request the request parameters of GetClientCertificate  GetClientCertificateRequest
     * @return GetClientCertificateResponse
     */
    CompletableFuture<GetClientCertificateResponse> getClientCertificate(GetClientCertificateRequest request);

    /**
     * @param request the request parameters of GetClientCertificateHostnames  GetClientCertificateHostnamesRequest
     * @return GetClientCertificateHostnamesResponse
     */
    CompletableFuture<GetClientCertificateHostnamesResponse> getClientCertificateHostnames(GetClientCertificateHostnamesRequest request);

    /**
     * @param request the request parameters of GetCnameFlattening  GetCnameFlatteningRequest
     * @return GetCnameFlatteningResponse
     */
    CompletableFuture<GetCnameFlatteningResponse> getCnameFlattening(GetCnameFlatteningRequest request);

    /**
     * @param request the request parameters of GetCompressionRule  GetCompressionRuleRequest
     * @return GetCompressionRuleResponse
     */
    CompletableFuture<GetCompressionRuleResponse> getCompressionRule(GetCompressionRuleRequest request);

    /**
     * @param request the request parameters of GetCrossBorderOptimization  GetCrossBorderOptimizationRequest
     * @return GetCrossBorderOptimizationResponse
     */
    CompletableFuture<GetCrossBorderOptimizationResponse> getCrossBorderOptimization(GetCrossBorderOptimizationRequest request);

    /**
     * @param request the request parameters of GetCustomHostname  GetCustomHostnameRequest
     * @return GetCustomHostnameResponse
     */
    CompletableFuture<GetCustomHostnameResponse> getCustomHostname(GetCustomHostnameRequest request);

    /**
     * @param request the request parameters of GetCustomResponseCodeRule  GetCustomResponseCodeRuleRequest
     * @return GetCustomResponseCodeRuleResponse
     */
    CompletableFuture<GetCustomResponseCodeRuleResponse> getCustomResponseCodeRule(GetCustomResponseCodeRuleRequest request);

    /**
     * @param request the request parameters of GetDcvDelegation  GetDcvDelegationRequest
     * @return GetDcvDelegationResponse
     */
    CompletableFuture<GetDcvDelegationResponse> getDcvDelegation(GetDcvDelegationRequest request);

    /**
     * @param request the request parameters of GetDevelopmentMode  GetDevelopmentModeRequest
     * @return GetDevelopmentModeResponse
     */
    CompletableFuture<GetDevelopmentModeResponse> getDevelopmentMode(GetDevelopmentModeRequest request);

    /**
     * @param request the request parameters of GetEdgeContainer  GetEdgeContainerRequest
     * @return GetEdgeContainerResponse
     */
    CompletableFuture<GetEdgeContainerResponse> getEdgeContainer(GetEdgeContainerRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerApp  GetEdgeContainerAppRequest
     * @return GetEdgeContainerAppResponse
     */
    CompletableFuture<GetEdgeContainerAppResponse> getEdgeContainerApp(GetEdgeContainerAppRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerAppLogRiver  GetEdgeContainerAppLogRiverRequest
     * @return GetEdgeContainerAppLogRiverResponse
     */
    CompletableFuture<GetEdgeContainerAppLogRiverResponse> getEdgeContainerAppLogRiver(GetEdgeContainerAppLogRiverRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerAppResourceCapacity  GetEdgeContainerAppResourceCapacityRequest
     * @return GetEdgeContainerAppResourceCapacityResponse
     */
    CompletableFuture<GetEdgeContainerAppResourceCapacityResponse> getEdgeContainerAppResourceCapacity(GetEdgeContainerAppResourceCapacityRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerAppResourceReserve  GetEdgeContainerAppResourceReserveRequest
     * @return GetEdgeContainerAppResourceReserveResponse
     */
    CompletableFuture<GetEdgeContainerAppResourceReserveResponse> getEdgeContainerAppResourceReserve(GetEdgeContainerAppResourceReserveRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerAppResourceStatus  GetEdgeContainerAppResourceStatusRequest
     * @return GetEdgeContainerAppResourceStatusResponse
     */
    CompletableFuture<GetEdgeContainerAppResourceStatusResponse> getEdgeContainerAppResourceStatus(GetEdgeContainerAppResourceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You must first activate the edge container service by calling OpenEdgeContainer, and then confirm that an available application exists by calling ListEdgeContainerApps or create an application by calling CreateEdgeContainerApp.</p>
     * 
     * @param request the request parameters of GetEdgeContainerAppStatus  GetEdgeContainerAppStatusRequest
     * @return GetEdgeContainerAppStatusResponse
     */
    CompletableFuture<GetEdgeContainerAppStatusResponse> getEdgeContainerAppStatus(GetEdgeContainerAppStatusRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerAppVersion  GetEdgeContainerAppVersionRequest
     * @return GetEdgeContainerAppVersionResponse
     */
    CompletableFuture<GetEdgeContainerAppVersionResponse> getEdgeContainerAppVersion(GetEdgeContainerAppVersionRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerDeployRegions  GetEdgeContainerDeployRegionsRequest
     * @return GetEdgeContainerDeployRegionsResponse
     */
    CompletableFuture<GetEdgeContainerDeployRegionsResponse> getEdgeContainerDeployRegions(GetEdgeContainerDeployRegionsRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerLogs  GetEdgeContainerLogsRequest
     * @return GetEdgeContainerLogsResponse
     */
    CompletableFuture<GetEdgeContainerLogsResponse> getEdgeContainerLogs(GetEdgeContainerLogsRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerStagingDeployStatus  GetEdgeContainerStagingDeployStatusRequest
     * @return GetEdgeContainerStagingDeployStatusResponse
     */
    CompletableFuture<GetEdgeContainerStagingDeployStatusResponse> getEdgeContainerStagingDeployStatus(GetEdgeContainerStagingDeployStatusRequest request);

    /**
     * @param request the request parameters of GetEdgeContainerTerminal  GetEdgeContainerTerminalRequest
     * @return GetEdgeContainerTerminalResponse
     */
    CompletableFuture<GetEdgeContainerTerminalResponse> getEdgeContainerTerminal(GetEdgeContainerTerminalRequest request);

    /**
     * @param request the request parameters of GetErService  GetErServiceRequest
     * @return GetErServiceResponse
     */
    CompletableFuture<GetErServiceResponse> getErService(GetErServiceRequest request);

    /**
     * @param request the request parameters of GetFailFile  GetFailFileRequest
     * @return GetFailFileResponse
     */
    CompletableFuture<GetFailFileResponse> getFailFile(GetFailFileRequest request);

    /**
     * @param request the request parameters of GetHttpIncomingRequestHeaderModificationRule  GetHttpIncomingRequestHeaderModificationRuleRequest
     * @return GetHttpIncomingRequestHeaderModificationRuleResponse
     */
    CompletableFuture<GetHttpIncomingRequestHeaderModificationRuleResponse> getHttpIncomingRequestHeaderModificationRule(GetHttpIncomingRequestHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of GetHttpIncomingResponseHeaderModificationRule  GetHttpIncomingResponseHeaderModificationRuleRequest
     * @return GetHttpIncomingResponseHeaderModificationRuleResponse
     */
    CompletableFuture<GetHttpIncomingResponseHeaderModificationRuleResponse> getHttpIncomingResponseHeaderModificationRule(GetHttpIncomingResponseHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of GetHttpRequestHeaderModificationRule  GetHttpRequestHeaderModificationRuleRequest
     * @return GetHttpRequestHeaderModificationRuleResponse
     */
    CompletableFuture<GetHttpRequestHeaderModificationRuleResponse> getHttpRequestHeaderModificationRule(GetHttpRequestHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of GetHttpResponseHeaderModificationRule  GetHttpResponseHeaderModificationRuleRequest
     * @return GetHttpResponseHeaderModificationRuleResponse
     */
    CompletableFuture<GetHttpResponseHeaderModificationRuleResponse> getHttpResponseHeaderModificationRule(GetHttpResponseHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of GetHttpsApplicationConfiguration  GetHttpsApplicationConfigurationRequest
     * @return GetHttpsApplicationConfigurationResponse
     */
    CompletableFuture<GetHttpsApplicationConfigurationResponse> getHttpsApplicationConfiguration(GetHttpsApplicationConfigurationRequest request);

    /**
     * @param request the request parameters of GetHttpsBasicConfiguration  GetHttpsBasicConfigurationRequest
     * @return GetHttpsBasicConfigurationResponse
     */
    CompletableFuture<GetHttpsBasicConfigurationResponse> getHttpsBasicConfiguration(GetHttpsBasicConfigurationRequest request);

    /**
     * @param request the request parameters of GetIPv6  GetIPv6Request
     * @return GetIPv6Response
     */
    CompletableFuture<GetIPv6Response> getIPv6(GetIPv6Request request);

    /**
     * @param request the request parameters of GetImageTransform  GetImageTransformRequest
     * @return GetImageTransformResponse
     */
    CompletableFuture<GetImageTransformResponse> getImageTransform(GetImageTransformRequest request);

    /**
     * @param request the request parameters of GetKeylessServer  GetKeylessServerRequest
     * @return GetKeylessServerResponse
     */
    CompletableFuture<GetKeylessServerResponse> getKeylessServer(GetKeylessServerRequest request);

    /**
     * @param request the request parameters of GetKv  GetKvRequest
     * @return GetKvResponse
     */
    CompletableFuture<GetKvResponse> getKv(GetKvRequest request);

    /**
     * @param request the request parameters of GetKvAccount  GetKvAccountRequest
     * @return GetKvAccountResponse
     */
    CompletableFuture<GetKvAccountResponse> getKvAccount(GetKvAccountRequest request);

    /**
     * @param request the request parameters of GetKvDetail  GetKvDetailRequest
     * @return GetKvDetailResponse
     */
    CompletableFuture<GetKvDetailResponse> getKvDetail(GetKvDetailRequest request);

    /**
     * @param request the request parameters of GetKvNamespace  GetKvNamespaceRequest
     * @return GetKvNamespaceResponse
     */
    CompletableFuture<GetKvNamespaceResponse> getKvNamespace(GetKvNamespaceRequest request);

    /**
     * @param request the request parameters of GetList  GetListRequest
     * @return GetListResponse
     */
    CompletableFuture<GetListResponse> getList(GetListRequest request);

    /**
     * <b>description</b> :
     * <p>This API allows you to query the configuration details of a specific load balancer by providing the required authentication information and resource identity. The details include but are not limited to the name, session persistence policy, and load balancing policy.</p>
     * 
     * @param request the request parameters of GetLoadBalancer  GetLoadBalancerRequest
     * @return GetLoadBalancerResponse
     */
    CompletableFuture<GetLoadBalancerResponse> getLoadBalancer(GetLoadBalancerRequest request);

    /**
     * @param request the request parameters of GetMainDomainName  GetMainDomainNameRequest
     * @return GetMainDomainNameResponse
     */
    CompletableFuture<GetMainDomainNameResponse> getMainDomainName(GetMainDomainNameRequest request);

    /**
     * @param request the request parameters of GetManagedTransform  GetManagedTransformRequest
     * @return GetManagedTransformResponse
     */
    CompletableFuture<GetManagedTransformResponse> getManagedTransform(GetManagedTransformRequest request);

    /**
     * <b>description</b> :
     * <p>Used with the Edge Routine (ER) feature to automatically match an active site.</p>
     * 
     * @param request the request parameters of GetMatchSite  GetMatchSiteRequest
     * @return GetMatchSiteResponse
     */
    CompletableFuture<GetMatchSiteResponse> getMatchSite(GetMatchSiteRequest request);

    /**
     * @param request the request parameters of GetNetworkOptimization  GetNetworkOptimizationRequest
     * @return GetNetworkOptimizationResponse
     */
    CompletableFuture<GetNetworkOptimizationResponse> getNetworkOptimization(GetNetworkOptimizationRequest request);

    /**
     * @param request the request parameters of GetOriginCaCertificate  GetOriginCaCertificateRequest
     * @return GetOriginCaCertificateResponse
     */
    CompletableFuture<GetOriginCaCertificateResponse> getOriginCaCertificate(GetOriginCaCertificateRequest request);

    /**
     * @param request the request parameters of GetOriginClientCertificate  GetOriginClientCertificateRequest
     * @return GetOriginClientCertificateResponse
     */
    CompletableFuture<GetOriginClientCertificateResponse> getOriginClientCertificate(GetOriginClientCertificateRequest request);

    /**
     * @param request the request parameters of GetOriginClientCertificateHostnames  GetOriginClientCertificateHostnamesRequest
     * @return GetOriginClientCertificateHostnamesResponse
     */
    CompletableFuture<GetOriginClientCertificateHostnamesResponse> getOriginClientCertificateHostnames(GetOriginClientCertificateHostnamesRequest request);

    /**
     * @param request the request parameters of GetOriginPool  GetOriginPoolRequest
     * @return GetOriginPoolResponse
     */
    CompletableFuture<GetOriginPoolResponse> getOriginPool(GetOriginPoolRequest request);

    /**
     * @param request the request parameters of GetOriginProtection  GetOriginProtectionRequest
     * @return GetOriginProtectionResponse
     */
    CompletableFuture<GetOriginProtectionResponse> getOriginProtection(GetOriginProtectionRequest request);

    /**
     * @param request the request parameters of GetOriginRule  GetOriginRuleRequest
     * @return GetOriginRuleResponse
     */
    CompletableFuture<GetOriginRuleResponse> getOriginRule(GetOriginRuleRequest request);

    /**
     * @param request the request parameters of GetPage  GetPageRequest
     * @return GetPageResponse
     */
    CompletableFuture<GetPageResponse> getPage(GetPageRequest request);

    /**
     * @param request the request parameters of GetPageShield  GetPageShieldRequest
     * @return GetPageShieldResponse
     */
    CompletableFuture<GetPageShieldResponse> getPageShield(GetPageShieldRequest request);

    /**
     * @param request the request parameters of GetPerformanceDataCollection  GetPerformanceDataCollectionRequest
     * @return GetPerformanceDataCollectionResponse
     */
    CompletableFuture<GetPerformanceDataCollectionResponse> getPerformanceDataCollection(GetPerformanceDataCollectionRequest request);

    /**
     * @param request the request parameters of GetPurgeQuota  GetPurgeQuotaRequest
     * @return GetPurgeQuotaResponse
     */
    CompletableFuture<GetPurgeQuotaResponse> getPurgeQuota(GetPurgeQuotaRequest request);

    /**
     * @param request the request parameters of GetRealtimeDeliveryField  GetRealtimeDeliveryFieldRequest
     * @return GetRealtimeDeliveryFieldResponse
     */
    CompletableFuture<GetRealtimeDeliveryFieldResponse> getRealtimeDeliveryField(GetRealtimeDeliveryFieldRequest request);

    /**
     * @param request the request parameters of GetRecord  GetRecordRequest
     * @return GetRecordResponse
     */
    CompletableFuture<GetRecordResponse> getRecord(GetRecordRequest request);

    /**
     * @param request the request parameters of GetRedirectRule  GetRedirectRuleRequest
     * @return GetRedirectRuleResponse
     */
    CompletableFuture<GetRedirectRuleResponse> getRedirectRule(GetRedirectRuleRequest request);

    /**
     * @param request the request parameters of GetReleaseTime  GetReleaseTimeRequest
     * @return GetReleaseTimeResponse
     */
    CompletableFuture<GetReleaseTimeResponse> getReleaseTime(GetReleaseTimeRequest request);

    /**
     * @param request the request parameters of GetRewriteUrlRule  GetRewriteUrlRuleRequest
     * @return GetRewriteUrlRuleResponse
     */
    CompletableFuture<GetRewriteUrlRuleResponse> getRewriteUrlRule(GetRewriteUrlRuleRequest request);

    /**
     * @param request the request parameters of GetRoutine  GetRoutineRequest
     * @return GetRoutineResponse
     */
    CompletableFuture<GetRoutineResponse> getRoutine(GetRoutineRequest request);

    /**
     * @param request the request parameters of GetRoutineAccessToken  GetRoutineAccessTokenRequest
     * @return GetRoutineAccessTokenResponse
     */
    CompletableFuture<GetRoutineAccessTokenResponse> getRoutineAccessToken(GetRoutineAccessTokenRequest request);

    /**
     * @param request the request parameters of GetRoutineBuild  GetRoutineBuildRequest
     * @return GetRoutineBuildResponse
     */
    CompletableFuture<GetRoutineBuildResponse> getRoutineBuild(GetRoutineBuildRequest request);

    /**
     * @param request the request parameters of GetRoutineBuildConfiguration  GetRoutineBuildConfigurationRequest
     * @return GetRoutineBuildConfigurationResponse
     */
    CompletableFuture<GetRoutineBuildConfigurationResponse> getRoutineBuildConfiguration(GetRoutineBuildConfigurationRequest request);

    /**
     * @param request the request parameters of GetRoutineCodeVersion  GetRoutineCodeVersionRequest
     * @return GetRoutineCodeVersionResponse
     */
    CompletableFuture<GetRoutineCodeVersionResponse> getRoutineCodeVersion(GetRoutineCodeVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>By calling this API operation, you can retrieve detailed information about a specific code version of a Routine, including but not limited to the version status, creation time, and whether the version contains Assets resource files. You must specify the Routine name and the code version number as request parameters.</p>
     * 
     * @param request the request parameters of GetRoutineCodeVersionInfo  GetRoutineCodeVersionInfoRequest
     * @return GetRoutineCodeVersionInfoResponse
     */
    CompletableFuture<GetRoutineCodeVersionInfoResponse> getRoutineCodeVersionInfo(GetRoutineCodeVersionInfoRequest request);

    /**
     * @param request the request parameters of GetRoutineRoute  GetRoutineRouteRequest
     * @return GetRoutineRouteResponse
     */
    CompletableFuture<GetRoutineRouteResponse> getRoutineRoute(GetRoutineRouteRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Each upload of test code for an Edge Routine generates a version number, which occupies one CodeRev code version slot. This is used for testing purposes only.</li>
     * <li>An Edge Routine can retain a maximum of 10 version numbers. After the limit is exceeded, manually call DeleteRoutineCodeRevision to delete unused versions.</li>
     * </ul>
     * 
     * @param request the request parameters of GetRoutineStagingCodeUploadInfo  GetRoutineStagingCodeUploadInfoRequest
     * @return GetRoutineStagingCodeUploadInfoResponse
     */
    CompletableFuture<GetRoutineStagingCodeUploadInfoResponse> getRoutineStagingCodeUploadInfo(GetRoutineStagingCodeUploadInfoRequest request);

    /**
     * @param request the request parameters of GetRoutineStagingEnvIp  GetRoutineStagingEnvIpRequest
     * @return GetRoutineStagingEnvIpResponse
     */
    CompletableFuture<GetRoutineStagingEnvIpResponse> getRoutineStagingEnvIp(GetRoutineStagingEnvIpRequest request);

    /**
     * @param request the request parameters of GetRoutineUserInfo  GetRoutineUserInfoRequest
     * @return GetRoutineUserInfoResponse
     */
    CompletableFuture<GetRoutineUserInfoResponse> getRoutineUserInfo(GetRoutineUserInfoRequest request);

    /**
     * @param request the request parameters of GetScheduledPreloadJob  GetScheduledPreloadJobRequest
     * @return GetScheduledPreloadJobResponse
     */
    CompletableFuture<GetScheduledPreloadJobResponse> getScheduledPreloadJob(GetScheduledPreloadJobRequest request);

    /**
     * @param request the request parameters of GetSeoBypass  GetSeoBypassRequest
     * @return GetSeoBypassResponse
     */
    CompletableFuture<GetSeoBypassResponse> getSeoBypass(GetSeoBypassRequest request);

    /**
     * @param request the request parameters of GetSite  GetSiteRequest
     * @return GetSiteResponse
     */
    CompletableFuture<GetSiteResponse> getSite(GetSiteRequest request);

    /**
     * @param request the request parameters of GetSiteCurrentNS  GetSiteCurrentNSRequest
     * @return GetSiteCurrentNSResponse
     */
    CompletableFuture<GetSiteCurrentNSResponse> getSiteCurrentNS(GetSiteCurrentNSRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Description</strong>: You can call this operation to query the configuration of custom log fields for a website, including custom fields in request headers, response headers, and cookies.</p>
     * <ul>
     * <li><strong>Scenarios</strong>: You can call this operation in scenarios where you need to obtain specific HTTP headers or cookie information for log analysis.</li>
     * </ul>
     * <hr>
     * 
     * @param request the request parameters of GetSiteCustomLog  GetSiteCustomLogRequest
     * @return GetSiteCustomLogResponse
     */
    CompletableFuture<GetSiteCustomLogResponse> getSiteCustomLog(GetSiteCustomLogRequest request);

    /**
     * @param request the request parameters of GetSiteDeliveryTask  GetSiteDeliveryTaskRequest
     * @return GetSiteDeliveryTaskResponse
     */
    CompletableFuture<GetSiteDeliveryTaskResponse> getSiteDeliveryTask(GetSiteDeliveryTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the remaining quota of the real-time log delivery service for a specific site and business type under a specified Alibaba Cloud account. This is important for monitoring and managing your log delivery capacity to ensure that logs can be smoothly pushed to the destination storage and to prevent data loss or delays caused by insufficient quota.
     * <strong>Parameter notes:</strong></p>
     * <ul>
     * <li><code>BusinessType</code> is required. Specify the business type to obtain the corresponding quota information.</li>
     * <li><code>SiteId</code> must be a valid site ID in integer format and must correspond to the site configured in Alibaba Cloud.
     * <strong>Response:</strong></li>
     * <li>A successful response returns the delivery quota (<code>FreeQuota</code>), request ID (<code>RequestId</code>), site ID (<code>SiteId</code>), and business type (<code>BusinessType</code>) for confirmation and logging purposes.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSiteLogDeliveryQuota  GetSiteLogDeliveryQuotaRequest
     * @return GetSiteLogDeliveryQuotaResponse
     */
    CompletableFuture<GetSiteLogDeliveryQuotaResponse> getSiteLogDeliveryQuota(GetSiteLogDeliveryQuotaRequest request);

    /**
     * @param request the request parameters of GetSiteNameExclusive  GetSiteNameExclusiveRequest
     * @return GetSiteNameExclusiveResponse
     */
    CompletableFuture<GetSiteNameExclusiveResponse> getSiteNameExclusive(GetSiteNameExclusiveRequest request);

    /**
     * @param request the request parameters of GetSiteOriginClientCertificate  GetSiteOriginClientCertificateRequest
     * @return GetSiteOriginClientCertificateResponse
     */
    CompletableFuture<GetSiteOriginClientCertificateResponse> getSiteOriginClientCertificate(GetSiteOriginClientCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This API applies only to sites that use NS mode.</p>
     * 
     * @param request the request parameters of GetSitePause  GetSitePauseRequest
     * @return GetSitePauseResponse
     */
    CompletableFuture<GetSitePauseResponse> getSitePause(GetSitePauseRequest request);

    /**
     * @param request the request parameters of GetSiteTrafficSequence  GetSiteTrafficSequenceRequest
     * @return GetSiteTrafficSequenceResponse
     */
    CompletableFuture<GetSiteTrafficSequenceResponse> getSiteTrafficSequence(GetSiteTrafficSequenceRequest request);

    /**
     * @param request the request parameters of GetSiteWafSettings  GetSiteWafSettingsRequest
     * @return GetSiteWafSettingsResponse
     */
    CompletableFuture<GetSiteWafSettingsResponse> getSiteWafSettings(GetSiteWafSettingsRequest request);

    /**
     * @param request the request parameters of GetTieredCache  GetTieredCacheRequest
     * @return GetTieredCacheResponse
     */
    CompletableFuture<GetTieredCacheResponse> getTieredCache(GetTieredCacheRequest request);

    /**
     * @param request the request parameters of GetTransportLayerApplication  GetTransportLayerApplicationRequest
     * @return GetTransportLayerApplicationResponse
     */
    CompletableFuture<GetTransportLayerApplicationResponse> getTransportLayerApplication(GetTransportLayerApplicationRequest request);

    /**
     * @param request the request parameters of GetUploadTask  GetUploadTaskRequest
     * @return GetUploadTaskResponse
     */
    CompletableFuture<GetUploadTaskResponse> getUploadTask(GetUploadTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Features</strong>: This operation retrieves the detailed delivery information of a specified task under an Alibaba Cloud account, including the task name, discard rate, region, business type, status, delivery type and configuration, and filter rules.</li>
     * <li><strong>Scenarios</strong>: Use this operation when you need to understand or check the log processing and delivery configuration of a specific task for analyzing processing efficiency or troubleshooting issues.</li>
     * </ul>
     * 
     * @param request the request parameters of GetUserDeliveryTask  GetUserDeliveryTaskRequest
     * @return GetUserDeliveryTaskResponse
     */
    CompletableFuture<GetUserDeliveryTaskResponse> getUserDeliveryTask(GetUserDeliveryTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the real-time log delivery quota for different business types in your Alibaba Cloud account. You must provide your Alibaba Cloud user ID (aliUid) and the business type (BusinessType). The system returns the remaining quota for the specified business type, helping you understand the current quota usage.</p>
     * 
     * @param request the request parameters of GetUserLogDeliveryQuota  GetUserLogDeliveryQuotaRequest
     * @return GetUserLogDeliveryQuotaResponse
     */
    CompletableFuture<GetUserLogDeliveryQuotaResponse> getUserLogDeliveryQuota(GetUserLogDeliveryQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the real-time log delivery quota for different business types in your Alibaba Cloud account. You must provide your Alibaba Cloud user ID (aliUid) and the business type (BusinessType). The system returns the remaining quota for the specified business type, helping you understand the current quota usage.</p>
     * 
     * @param request the request parameters of GetUserMaxPlanQuota  GetUserMaxPlanQuotaRequest
     * @return GetUserMaxPlanQuotaResponse
     */
    CompletableFuture<GetUserMaxPlanQuotaResponse> getUserMaxPlanQuota(GetUserMaxPlanQuotaRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>By calling the <code>GetUserWafRuleset</code> operation, you can retrieve information about a specific Web Application Firewall (WAF) ruleset based on the instance ID and ruleset ID. The returned information includes but is not limited to the position, name, description, status, and specific rules of the ruleset. Make sure that you correctly specify the required parameters to avoid request failures.</p>
     * 
     * @param request the request parameters of GetUserWafRuleset  GetUserWafRulesetRequest
     * @return GetUserWafRulesetResponse
     */
    CompletableFuture<GetUserWafRulesetResponse> getUserWafRuleset(GetUserWafRulesetRequest request);

    /**
     * @param request the request parameters of GetVideoProcessing  GetVideoProcessingRequest
     * @return GetVideoProcessingResponse
     */
    CompletableFuture<GetVideoProcessingResponse> getVideoProcessing(GetVideoProcessingRequest request);

    /**
     * @param request the request parameters of GetWafBotAppKey  GetWafBotAppKeyRequest
     * @return GetWafBotAppKeyResponse
     */
    CompletableFuture<GetWafBotAppKeyResponse> getWafBotAppKey(GetWafBotAppKeyRequest request);

    /**
     * @param request the request parameters of GetWafFilter  GetWafFilterRequest
     * @return GetWafFilterResponse
     */
    CompletableFuture<GetWafFilterResponse> getWafFilter(GetWafFilterRequest request);

    /**
     * @param request the request parameters of GetWafQuota  GetWafQuotaRequest
     * @return GetWafQuotaResponse
     */
    CompletableFuture<GetWafQuotaResponse> getWafQuota(GetWafQuotaRequest request);

    /**
     * @param request the request parameters of GetWafRule  GetWafRuleRequest
     * @return GetWafRuleResponse
     */
    CompletableFuture<GetWafRuleResponse> getWafRule(GetWafRuleRequest request);

    /**
     * @param request the request parameters of GetWafRuleset  GetWafRulesetRequest
     * @return GetWafRulesetResponse
     */
    CompletableFuture<GetWafRulesetResponse> getWafRuleset(GetWafRulesetRequest request);

    /**
     * @param request the request parameters of GetWaitingRoomPreviewPage  GetWaitingRoomPreviewPageRequest
     * @return GetWaitingRoomPreviewPageResponse
     */
    CompletableFuture<GetWaitingRoomPreviewPageResponse> getWaitingRoomPreviewPage(GetWaitingRoomPreviewPageRequest request);

    /**
     * @param request the request parameters of ListAWSRegionInfos  ListAWSRegionInfosRequest
     * @return ListAWSRegionInfosResponse
     */
    CompletableFuture<ListAWSRegionInfosResponse> listAWSRegionInfos(ListAWSRegionInfosRequest request);

    /**
     * @param request the request parameters of ListAsyncTasks  ListAsyncTasksRequest
     * @return ListAsyncTasksResponse
     */
    CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request);

    /**
     * @param request the request parameters of ListBotInstances  ListBotInstancesRequest
     * @return ListBotInstancesResponse
     */
    CompletableFuture<ListBotInstancesResponse> listBotInstances(ListBotInstancesRequest request);

    /**
     * @param request the request parameters of ListCacheReserveInstances  ListCacheReserveInstancesRequest
     * @return ListCacheReserveInstancesResponse
     */
    CompletableFuture<ListCacheReserveInstancesResponse> listCacheReserveInstances(ListCacheReserveInstancesRequest request);

    /**
     * @param request the request parameters of ListCacheRules  ListCacheRulesRequest
     * @return ListCacheRulesResponse
     */
    CompletableFuture<ListCacheRulesResponse> listCacheRules(ListCacheRulesRequest request);

    /**
     * @param request the request parameters of ListCasCertificates  ListCasCertificatesRequest
     * @return ListCasCertificatesResponse
     */
    CompletableFuture<ListCasCertificatesResponse> listCasCertificates(ListCasCertificatesRequest request);

    /**
     * @param request the request parameters of ListCertificates  ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    CompletableFuture<ListCertificatesResponse> listCertificates(ListCertificatesRequest request);

    /**
     * @param request the request parameters of ListCertificatesByRecord  ListCertificatesByRecordRequest
     * @return ListCertificatesByRecordResponse
     */
    CompletableFuture<ListCertificatesByRecordResponse> listCertificatesByRecord(ListCertificatesByRecordRequest request);

    /**
     * @param request the request parameters of ListCiphers  ListCiphersRequest
     * @return ListCiphersResponse
     */
    CompletableFuture<ListCiphersResponse> listCiphers(ListCiphersRequest request);

    /**
     * @param request the request parameters of ListClientCaCertificates  ListClientCaCertificatesRequest
     * @return ListClientCaCertificatesResponse
     */
    CompletableFuture<ListClientCaCertificatesResponse> listClientCaCertificates(ListClientCaCertificatesRequest request);

    /**
     * @param request the request parameters of ListClientCertificates  ListClientCertificatesRequest
     * @return ListClientCertificatesResponse
     */
    CompletableFuture<ListClientCertificatesResponse> listClientCertificates(ListClientCertificatesRequest request);

    /**
     * @param request the request parameters of ListCompressionRules  ListCompressionRulesRequest
     * @return ListCompressionRulesResponse
     */
    CompletableFuture<ListCompressionRulesResponse> listCompressionRules(ListCompressionRulesRequest request);

    /**
     * @param request the request parameters of ListCustomHostnames  ListCustomHostnamesRequest
     * @return ListCustomHostnamesResponse
     */
    CompletableFuture<ListCustomHostnamesResponse> listCustomHostnames(ListCustomHostnamesRequest request);

    /**
     * @param request the request parameters of ListCustomResponseCodeRules  ListCustomResponseCodeRulesRequest
     * @return ListCustomResponseCodeRulesResponse
     */
    CompletableFuture<ListCustomResponseCodeRulesResponse> listCustomResponseCodeRules(ListCustomResponseCodeRulesRequest request);

    /**
     * @param request the request parameters of ListDDoSInstances  ListDDoSInstancesRequest
     * @return ListDDoSInstancesResponse
     */
    CompletableFuture<ListDDoSInstancesResponse> listDDoSInstances(ListDDoSInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Checks whether vs_addr values in the vipInfo collection are VIPs.</p>
     * 
     * @param request the request parameters of ListESAIPInfo  ListESAIPInfoRequest
     * @return ListESAIPInfoResponse
     */
    CompletableFuture<ListESAIPInfoResponse> listESAIPInfo(ListESAIPInfoRequest request);

    /**
     * @param request the request parameters of ListEdgeContainerAppImageSecrets  ListEdgeContainerAppImageSecretsRequest
     * @return ListEdgeContainerAppImageSecretsResponse
     */
    CompletableFuture<ListEdgeContainerAppImageSecretsResponse> listEdgeContainerAppImageSecrets(ListEdgeContainerAppImageSecretsRequest request);

    /**
     * @param request the request parameters of ListEdgeContainerAppRecords  ListEdgeContainerAppRecordsRequest
     * @return ListEdgeContainerAppRecordsResponse
     */
    CompletableFuture<ListEdgeContainerAppRecordsResponse> listEdgeContainerAppRecords(ListEdgeContainerAppRecordsRequest request);

    /**
     * @param request the request parameters of ListEdgeContainerAppVersions  ListEdgeContainerAppVersionsRequest
     * @return ListEdgeContainerAppVersionsResponse
     */
    CompletableFuture<ListEdgeContainerAppVersionsResponse> listEdgeContainerAppVersions(ListEdgeContainerAppVersionsRequest request);

    /**
     * @param request the request parameters of ListEdgeContainerApps  ListEdgeContainerAppsRequest
     * @return ListEdgeContainerAppsResponse
     */
    CompletableFuture<ListEdgeContainerAppsResponse> listEdgeContainerApps(ListEdgeContainerAppsRequest request);

    /**
     * @param request the request parameters of ListEdgeContainerRecords  ListEdgeContainerRecordsRequest
     * @return ListEdgeContainerRecordsResponse
     */
    CompletableFuture<ListEdgeContainerRecordsResponse> listEdgeContainerRecords(ListEdgeContainerRecordsRequest request);

    /**
     * @param request the request parameters of ListEdgeRoutinePlans  ListEdgeRoutinePlansRequest
     * @return ListEdgeRoutinePlansResponse
     */
    CompletableFuture<ListEdgeRoutinePlansResponse> listEdgeRoutinePlans(ListEdgeRoutinePlansRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API call frequency: 100 calls per second.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListEdgeRoutineRecords  ListEdgeRoutineRecordsRequest
     * @return ListEdgeRoutineRecordsResponse
     */
    CompletableFuture<ListEdgeRoutineRecordsResponse> listEdgeRoutineRecords(ListEdgeRoutineRecordsRequest request);

    /**
     * @param request the request parameters of ListEnvironments  ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    /**
     * @param request the request parameters of ListHttpIncomingRequestHeaderModificationRules  ListHttpIncomingRequestHeaderModificationRulesRequest
     * @return ListHttpIncomingRequestHeaderModificationRulesResponse
     */
    CompletableFuture<ListHttpIncomingRequestHeaderModificationRulesResponse> listHttpIncomingRequestHeaderModificationRules(ListHttpIncomingRequestHeaderModificationRulesRequest request);

    /**
     * @param request the request parameters of ListHttpIncomingResponseHeaderModificationRules  ListHttpIncomingResponseHeaderModificationRulesRequest
     * @return ListHttpIncomingResponseHeaderModificationRulesResponse
     */
    CompletableFuture<ListHttpIncomingResponseHeaderModificationRulesResponse> listHttpIncomingResponseHeaderModificationRules(ListHttpIncomingResponseHeaderModificationRulesRequest request);

    /**
     * @param request the request parameters of ListHttpRequestHeaderModificationRules  ListHttpRequestHeaderModificationRulesRequest
     * @return ListHttpRequestHeaderModificationRulesResponse
     */
    CompletableFuture<ListHttpRequestHeaderModificationRulesResponse> listHttpRequestHeaderModificationRules(ListHttpRequestHeaderModificationRulesRequest request);

    /**
     * @param request the request parameters of ListHttpResponseHeaderModificationRules  ListHttpResponseHeaderModificationRulesRequest
     * @return ListHttpResponseHeaderModificationRulesResponse
     */
    CompletableFuture<ListHttpResponseHeaderModificationRulesResponse> listHttpResponseHeaderModificationRules(ListHttpResponseHeaderModificationRulesRequest request);

    /**
     * @param request the request parameters of ListHttpsApplicationConfigurations  ListHttpsApplicationConfigurationsRequest
     * @return ListHttpsApplicationConfigurationsResponse
     */
    CompletableFuture<ListHttpsApplicationConfigurationsResponse> listHttpsApplicationConfigurations(ListHttpsApplicationConfigurationsRequest request);

    /**
     * @param request the request parameters of ListHttpsBasicConfigurations  ListHttpsBasicConfigurationsRequest
     * @return ListHttpsBasicConfigurationsResponse
     */
    CompletableFuture<ListHttpsBasicConfigurationsResponse> listHttpsBasicConfigurations(ListHttpsBasicConfigurationsRequest request);

    /**
     * @param request the request parameters of ListImageTransforms  ListImageTransformsRequest
     * @return ListImageTransformsResponse
     */
    CompletableFuture<ListImageTransformsResponse> listImageTransforms(ListImageTransformsRequest request);

    /**
     * @param request the request parameters of ListInstanceQuotas  ListInstanceQuotasRequest
     * @return ListInstanceQuotasResponse
     */
    CompletableFuture<ListInstanceQuotasResponse> listInstanceQuotas(ListInstanceQuotasRequest request);

    /**
     * @param request the request parameters of ListInstanceQuotasWithUsage  ListInstanceQuotasWithUsageRequest
     * @return ListInstanceQuotasWithUsageResponse
     */
    CompletableFuture<ListInstanceQuotasWithUsageResponse> listInstanceQuotasWithUsage(ListInstanceQuotasWithUsageRequest request);

    /**
     * @param request the request parameters of ListInstancesQuota  ListInstancesQuotaRequest
     * @return ListInstancesQuotaResponse
     */
    CompletableFuture<ListInstancesQuotaResponse> listInstancesQuota(ListInstancesQuotaRequest request);

    /**
     * @param request the request parameters of ListKeylessServers  ListKeylessServersRequest
     * @return ListKeylessServersResponse
     */
    CompletableFuture<ListKeylessServersResponse> listKeylessServers(ListKeylessServersRequest request);

    /**
     * @param request the request parameters of ListKvs  ListKvsRequest
     * @return ListKvsResponse
     */
    CompletableFuture<ListKvsResponse> listKvs(ListKvsRequest request);

    /**
     * @param request the request parameters of ListLists  ListListsRequest
     * @return ListListsResponse
     */
    CompletableFuture<ListListsResponse> listLists(ListListsRequest request);

    /**
     * <b>description</b> :
     * <p>Query the status of origins under load balancers. You can pass multiple load balancer IDs at once, separated by commas. This is for load balancers that have monitors configured. It will probe the origins in the source address pools used by the load balancers and record the current status of each origin.</p>
     * <ul>
     * <li>Healthy(healthy): The probe result is available.</li>
     * <li>Unhealthy(unhealthy): The probe result is unavailable.</li>
     * <li>Unknown(unknown): Unknown, the monitor has not yet probed.</li>
     * <li>Undetected(undetected): The load balancer to which the origin belongs is not bound to a monitor.</li>
     * </ul>
     * 
     * @param request the request parameters of ListLoadBalancerOriginStatus  ListLoadBalancerOriginStatusRequest
     * @return ListLoadBalancerOriginStatusResponse
     */
    CompletableFuture<ListLoadBalancerOriginStatusResponse> listLoadBalancerOriginStatus(ListLoadBalancerOriginStatusRequest request);

    /**
     * <b>description</b> :
     * <p>When you create a country/region-based scheduling policy for a load balancing instance by calling an OpenAPI operation, use the primary or secondary region code from the lookup table to represent traffic originating from the corresponding geographic region.</p>
     * 
     * @param request the request parameters of ListLoadBalancerRegions  ListLoadBalancerRegionsRequest
     * @return ListLoadBalancerRegionsResponse
     */
    CompletableFuture<ListLoadBalancerRegionsResponse> listLoadBalancerRegions(ListLoadBalancerRegionsRequest request);

    /**
     * @param request the request parameters of ListLoadBalancers  ListLoadBalancersRequest
     * @return ListLoadBalancersResponse
     */
    CompletableFuture<ListLoadBalancersResponse> listLoadBalancers(ListLoadBalancersRequest request);

    /**
     * @param request the request parameters of ListManagedRulesGroups  ListManagedRulesGroupsRequest
     * @return ListManagedRulesGroupsResponse
     */
    CompletableFuture<ListManagedRulesGroupsResponse> listManagedRulesGroups(ListManagedRulesGroupsRequest request);

    /**
     * @param request the request parameters of ListNetworkOptimizations  ListNetworkOptimizationsRequest
     * @return ListNetworkOptimizationsResponse
     */
    CompletableFuture<ListNetworkOptimizationsResponse> listNetworkOptimizations(ListNetworkOptimizationsRequest request);

    /**
     * @param request the request parameters of ListOriginCaCertificates  ListOriginCaCertificatesRequest
     * @return ListOriginCaCertificatesResponse
     */
    CompletableFuture<ListOriginCaCertificatesResponse> listOriginCaCertificates(ListOriginCaCertificatesRequest request);

    /**
     * @param request the request parameters of ListOriginClientCertificates  ListOriginClientCertificatesRequest
     * @return ListOriginClientCertificatesResponse
     */
    CompletableFuture<ListOriginClientCertificatesResponse> listOriginClientCertificates(ListOriginClientCertificatesRequest request);

    /**
     * @param request the request parameters of ListOriginPools  ListOriginPoolsRequest
     * @return ListOriginPoolsResponse
     */
    CompletableFuture<ListOriginPoolsResponse> listOriginPools(ListOriginPoolsRequest request);

    /**
     * @param request the request parameters of ListOriginRules  ListOriginRulesRequest
     * @return ListOriginRulesResponse
     */
    CompletableFuture<ListOriginRulesResponse> listOriginRules(ListOriginRulesRequest request);

    /**
     * @param request the request parameters of ListPages  ListPagesRequest
     * @return ListPagesResponse
     */
    CompletableFuture<ListPagesResponse> listPages(ListPagesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the list of pay-as-you-go plan instances under your account. You can filter and sort results by multiple conditions.</p>
     * 
     * @param request the request parameters of ListPostpaidRatePlanInstances  ListPostpaidRatePlanInstancesRequest
     * @return ListPostpaidRatePlanInstancesResponse
     */
    CompletableFuture<ListPostpaidRatePlanInstancesResponse> listPostpaidRatePlanInstances(ListPostpaidRatePlanInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>By specifying the AliUid of a user and the service region (China site or international site), the API returns all pay-as-you-go site plans applicable to the user, including plan names, billing methods, and pricing information.</p>
     * 
     * @param request the request parameters of ListPostpaidSitePlans  ListPostpaidSitePlansRequest
     * @return ListPostpaidSitePlansResponse
     */
    CompletableFuture<ListPostpaidSitePlansResponse> listPostpaidSitePlans(ListPostpaidSitePlansRequest request);

    /**
     * @param request the request parameters of ListQuotasMinEffectPlan  ListQuotasMinEffectPlanRequest
     * @return ListQuotasMinEffectPlanResponse
     */
    CompletableFuture<ListQuotasMinEffectPlanResponse> listQuotasMinEffectPlan(ListQuotasMinEffectPlanRequest request);

    /**
     * <b>description</b> :
     * <p>DNS records corresponding to edge containers, edge functions, and Layer 4 acceleration will not be returned by this API.</p>
     * 
     * @param request the request parameters of ListRecords  ListRecordsRequest
     * @return ListRecordsResponse
     */
    CompletableFuture<ListRecordsResponse> listRecords(ListRecordsRequest request);

    /**
     * @param request the request parameters of ListRedirectRules  ListRedirectRulesRequest
     * @return ListRedirectRulesResponse
     */
    CompletableFuture<ListRedirectRulesResponse> listRedirectRules(ListRedirectRulesRequest request);

    /**
     * @param request the request parameters of ListRewriteUrlRules  ListRewriteUrlRulesRequest
     * @return ListRewriteUrlRulesResponse
     */
    CompletableFuture<ListRewriteUrlRulesResponse> listRewriteUrlRules(ListRewriteUrlRulesRequest request);

    /**
     * @param request the request parameters of ListRoutineBuildConfigurations  ListRoutineBuildConfigurationsRequest
     * @return ListRoutineBuildConfigurationsResponse
     */
    CompletableFuture<ListRoutineBuildConfigurationsResponse> listRoutineBuildConfigurations(ListRoutineBuildConfigurationsRequest request);

    /**
     * @param request the request parameters of ListRoutineBuilds  ListRoutineBuildsRequest
     * @return ListRoutineBuildsResponse
     */
    CompletableFuture<ListRoutineBuildsResponse> listRoutineBuilds(ListRoutineBuildsRequest request);

    /**
     * @param request the request parameters of ListRoutineCanaryAreas  ListRoutineCanaryAreasRequest
     * @return ListRoutineCanaryAreasResponse
     */
    CompletableFuture<ListRoutineCanaryAreasResponse> listRoutineCanaryAreas(ListRoutineCanaryAreasRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the code version list of a specified Edge Routine program. This operation supports paging and fuzzy search. You can set the Name parameter to specify the Edge Routine program name, use PageNumber and PageSize for paging control, and use SearchKeyWord for fuzzy matching against code version descriptions.
     * The response includes detailed information about each code version, such as the revision number, description, and creation time.</p>
     * 
     * @param request the request parameters of ListRoutineCodeVersions  ListRoutineCodeVersionsRequest
     * @return ListRoutineCodeVersionsResponse
     */
    CompletableFuture<ListRoutineCodeVersionsResponse> listRoutineCodeVersions(ListRoutineCodeVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to perform a paged query of all Edge Routines (Routines) created under your account, and provides the Routine quota and usage for your current plan. You can specify the paging parameters <code>PageNumber</code> and <code>PageSize</code> to control the number of returned results, and use <code>SearchKeyWord</code> to perform a fuzzy search to filter specific Routine names.</p>
     * 
     * @param request the request parameters of ListRoutineEnvironmentVariables  ListRoutineEnvironmentVariablesRequest
     * @return ListRoutineEnvironmentVariablesResponse
     */
    CompletableFuture<ListRoutineEnvironmentVariablesResponse> listRoutineEnvironmentVariables(ListRoutineEnvironmentVariablesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of related records for a specified edge routine. You can use pagination parameters to retrieve partial results, or use fuzzy keywords to filter specific record entries.</p>
     * 
     * @param request the request parameters of ListRoutineRelatedRecords  ListRoutineRelatedRecordsRequest
     * @return ListRoutineRelatedRecordsResponse
     */
    CompletableFuture<ListRoutineRelatedRecordsResponse> listRoutineRelatedRecords(ListRoutineRelatedRecordsRequest request);

    /**
     * @param request the request parameters of ListRoutineRoutes  ListRoutineRoutesRequest
     * @return ListRoutineRoutesResponse
     */
    CompletableFuture<ListRoutineRoutesResponse> listRoutineRoutes(ListRoutineRoutesRequest request);

    /**
     * @param request the request parameters of ListScheduledPreloadExecutions  ListScheduledPreloadExecutionsRequest
     * @return ListScheduledPreloadExecutionsResponse
     */
    CompletableFuture<ListScheduledPreloadExecutionsResponse> listScheduledPreloadExecutions(ListScheduledPreloadExecutionsRequest request);

    /**
     * @param request the request parameters of ListScheduledPreloadJobs  ListScheduledPreloadJobsRequest
     * @return ListScheduledPreloadJobsResponse
     */
    CompletableFuture<ListScheduledPreloadJobsResponse> listScheduledPreloadJobs(ListScheduledPreloadJobsRequest request);

    /**
     * @param request the request parameters of ListSiteDeliveryTasks  ListSiteDeliveryTasksRequest
     * @return ListSiteDeliveryTasksResponse
     */
    CompletableFuture<ListSiteDeliveryTasksResponse> listSiteDeliveryTasks(ListSiteDeliveryTasksRequest request);

    /**
     * @param request the request parameters of ListSiteFunctions  ListSiteFunctionsRequest
     * @return ListSiteFunctionsResponse
     */
    CompletableFuture<ListSiteFunctionsResponse> listSiteFunctions(ListSiteFunctionsRequest request);

    /**
     * @param request the request parameters of ListSiteOriginClientCertificates  ListSiteOriginClientCertificatesRequest
     * @return ListSiteOriginClientCertificatesResponse
     */
    CompletableFuture<ListSiteOriginClientCertificatesResponse> listSiteOriginClientCertificates(ListSiteOriginClientCertificatesRequest request);

    /**
     * @param request the request parameters of ListSiteRoutes  ListSiteRoutesRequest
     * @return ListSiteRoutesResponse
     */
    CompletableFuture<ListSiteRoutesResponse> listSiteRoutes(ListSiteRoutesRequest request);

    /**
     * @param request the request parameters of ListSites  ListSitesRequest
     * @return ListSitesResponse
     */
    CompletableFuture<ListSitesResponse> listSites(ListSitesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTraceTasks  ListTraceTasksRequest
     * @return ListTraceTasksResponse
     */
    CompletableFuture<ListTraceTasksResponse> listTraceTasks(ListTraceTasksRequest request);

    /**
     * @param request the request parameters of ListTransportLayerApplications  ListTransportLayerApplicationsRequest
     * @return ListTransportLayerApplicationsResponse
     */
    CompletableFuture<ListTransportLayerApplicationsResponse> listTransportLayerApplications(ListTransportLayerApplicationsRequest request);

    /**
     * @param request the request parameters of ListUploadTasks  ListUploadTasksRequest
     * @return ListUploadTasksResponse
     */
    CompletableFuture<ListUploadTasksResponse> listUploadTasks(ListUploadTasksRequest request);

    /**
     * @param request the request parameters of ListUrlObservations  ListUrlObservationsRequest
     * @return ListUrlObservationsResponse
     */
    CompletableFuture<ListUrlObservationsResponse> listUrlObservations(ListUrlObservationsRequest request);

    /**
     * @param request the request parameters of ListUserDeliveryTasks  ListUserDeliveryTasksRequest
     * @return ListUserDeliveryTasksResponse
     */
    CompletableFuture<ListUserDeliveryTasksResponse> listUserDeliveryTasks(ListUserDeliveryTasksRequest request);

    /**
     * @param request the request parameters of ListUserRatePlanInstances  ListUserRatePlanInstancesRequest
     * @return ListUserRatePlanInstancesResponse
     */
    CompletableFuture<ListUserRatePlanInstancesResponse> listUserRatePlanInstances(ListUserRatePlanInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to perform a paged query for all Edge Routines created under your account. It also returns the Edge Routine quota for your current plan and the number of Edge Routines already in use. You can specify the PageNumber and PageSize paging parameters to control the number of results returned, and use SearchKeyWord to perform a fuzzy search to filter Routine names.</p>
     * 
     * @param request the request parameters of ListUserRoutines  ListUserRoutinesRequest
     * @return ListUserRoutinesResponse
     */
    CompletableFuture<ListUserRoutinesResponse> listUserRoutines(ListUserRoutinesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li><code>InstanceId</code> is a required parameter that specifies the WAF instance to query.</li>
     * <li>The <code>Phase</code> parameter filters rule sets by WAF processing phase, such as custom rules and rate limiting rules.</li>
     * <li>Use <code>NameLike</code> in <code>QueryArgs</code> to perform a fuzzy search on rule set names.</li>
     * <li>The <code>PageNumber</code> and <code>PageSize</code> parameters control pagination and default to 1 and 20, respectively.</li>
     * <li>The response includes the request ID, current plan usage, the total record count, and a list of rule set details.</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserWafRulesets  ListUserWafRulesetsRequest
     * @return ListUserWafRulesetsResponse
     */
    CompletableFuture<ListUserWafRulesetsResponse> listUserWafRulesets(ListUserWafRulesetsRequest request);

    /**
     * @param request the request parameters of ListVersions  ListVersionsRequest
     * @return ListVersionsResponse
     */
    CompletableFuture<ListVersionsResponse> listVersions(ListVersionsRequest request);

    /**
     * @param request the request parameters of ListVideoProcessings  ListVideoProcessingsRequest
     * @return ListVideoProcessingsResponse
     */
    CompletableFuture<ListVideoProcessingsResponse> listVideoProcessings(ListVideoProcessingsRequest request);

    /**
     * @param request the request parameters of ListWafManagedRules  ListWafManagedRulesRequest
     * @return ListWafManagedRulesResponse
     */
    CompletableFuture<ListWafManagedRulesResponse> listWafManagedRules(ListWafManagedRulesRequest request);

    /**
     * @param request the request parameters of ListWafPhases  ListWafPhasesRequest
     * @return ListWafPhasesResponse
     */
    CompletableFuture<ListWafPhasesResponse> listWafPhases(ListWafPhasesRequest request);

    /**
     * @param request the request parameters of ListWafRules  ListWafRulesRequest
     * @return ListWafRulesResponse
     */
    CompletableFuture<ListWafRulesResponse> listWafRules(ListWafRulesRequest request);

    /**
     * @param request the request parameters of ListWafRulesets  ListWafRulesetsRequest
     * @return ListWafRulesetsResponse
     */
    CompletableFuture<ListWafRulesetsResponse> listWafRulesets(ListWafRulesetsRequest request);

    /**
     * @param request the request parameters of ListWafTemplateRules  ListWafTemplateRulesRequest
     * @return ListWafTemplateRulesResponse
     */
    CompletableFuture<ListWafTemplateRulesResponse> listWafTemplateRules(ListWafTemplateRulesRequest request);

    /**
     * @param request the request parameters of ListWafUsageOfRules  ListWafUsageOfRulesRequest
     * @return ListWafUsageOfRulesResponse
     */
    CompletableFuture<ListWafUsageOfRulesResponse> listWafUsageOfRules(ListWafUsageOfRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Use this operation to query details of all waiting room events related to a waiting room in a website.</p>
     * 
     * @param request the request parameters of ListWaitingRoomEvents  ListWaitingRoomEventsRequest
     * @return ListWaitingRoomEventsResponse
     */
    CompletableFuture<ListWaitingRoomEventsResponse> listWaitingRoomEvents(ListWaitingRoomEventsRequest request);

    /**
     * <b>description</b> :
     * <p>This API allows users to query the list of waiting room bypass rules associated with a specific site.</p>
     * 
     * @param request the request parameters of ListWaitingRoomRules  ListWaitingRoomRulesRequest
     * @return ListWaitingRoomRulesResponse
     */
    CompletableFuture<ListWaitingRoomRulesResponse> listWaitingRoomRules(ListWaitingRoomRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This API allows you to query the configuration details of all waiting rooms for a specified site, including the enabled status, name, and queuing rules.</p>
     * 
     * @param request the request parameters of ListWaitingRooms  ListWaitingRoomsRequest
     * @return ListWaitingRoomsResponse
     */
    CompletableFuture<ListWaitingRoomsResponse> listWaitingRooms(ListWaitingRoomsRequest request);

    /**
     * @param request the request parameters of ModifyInstanceFeatures  ModifyInstanceFeaturesRequest
     * @return ModifyInstanceFeaturesResponse
     */
    CompletableFuture<ModifyInstanceFeaturesResponse> modifyInstanceFeatures(ModifyInstanceFeaturesRequest request);

    /**
     * @param request the request parameters of ModifySiteFeatures  ModifySiteFeaturesRequest
     * @return ModifySiteFeaturesResponse
     */
    CompletableFuture<ModifySiteFeaturesResponse> modifySiteFeatures(ModifySiteFeaturesRequest request);

    /**
     * @param request the request parameters of OpenEdgeContainer  OpenEdgeContainerRequest
     * @return OpenEdgeContainerResponse
     */
    CompletableFuture<OpenEdgeContainerResponse> openEdgeContainer(OpenEdgeContainerRequest request);

    /**
     * @param request the request parameters of OpenErService  OpenErServiceRequest
     * @return OpenErServiceResponse
     */
    CompletableFuture<OpenErServiceResponse> openErService(OpenErServiceRequest request);

    /**
     * @param request the request parameters of PreloadCaches  PreloadCachesRequest
     * @return PreloadCachesResponse
     */
    CompletableFuture<PreloadCachesResponse> preloadCaches(PreloadCachesRequest request);

    /**
     * <b>description</b> :
     * <p>Prerequisites: 1) Activate the edge container service (by calling the OpenEdgeContainer operation or using the console). 2) Create an application (by calling CreateEdgeContainerApp to obtain the AppId). 3) Create an application version (by calling CreateEdgeContainerAppVersion to obtain the VersionId).</p>
     * 
     * @param request the request parameters of PublishEdgeContainerAppVersion  PublishEdgeContainerAppVersionRequest
     * @return PublishEdgeContainerAppVersionResponse
     */
    CompletableFuture<PublishEdgeContainerAppVersionResponse> publishEdgeContainerAppVersion(PublishEdgeContainerAppVersionRequest request);

    /**
     * @param request the request parameters of PublishRoutineCodeVersion  PublishRoutineCodeVersionRequest
     * @return PublishRoutineCodeVersionResponse
     */
    CompletableFuture<PublishRoutineCodeVersionResponse> publishRoutineCodeVersion(PublishRoutineCodeVersionRequest request);

    /**
     * @param request the request parameters of PurchaseBotInstance  PurchaseBotInstanceRequest
     * @return PurchaseBotInstanceResponse
     */
    CompletableFuture<PurchaseBotInstanceResponse> purchaseBotInstance(PurchaseBotInstanceRequest request);

    /**
     * @param request the request parameters of PurchaseCacheReserve  PurchaseCacheReserveRequest
     * @return PurchaseCacheReserveResponse
     */
    CompletableFuture<PurchaseCacheReserveResponse> purchaseCacheReserve(PurchaseCacheReserveRequest request);

    /**
     * @param request the request parameters of PurchaseDDoSInstance  PurchaseDDoSInstanceRequest
     * @return PurchaseDDoSInstanceResponse
     */
    CompletableFuture<PurchaseDDoSInstanceResponse> purchaseDDoSInstance(PurchaseDDoSInstanceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can obtain the plan name and plan code by calling the DescribeRatePlanPrice operation.</li>
     * <li>If the acceleration region is not set to overseas, the site must have a valid Internet Content Provider (ICP) filing.</li>
     * </ol>
     * 
     * @param request the request parameters of PurchaseRatePlan  PurchaseRatePlanRequest
     * @return PurchaseRatePlanResponse
     */
    CompletableFuture<PurchaseRatePlanResponse> purchaseRatePlan(PurchaseRatePlanRequest request);

    /**
     * @param request the request parameters of PurgeCaches  PurgeCachesRequest
     * @return PurgeCachesResponse
     */
    CompletableFuture<PurgeCachesResponse> purgeCaches(PurgeCachesRequest request);

    /**
     * @param request the request parameters of PutKv  PutKvRequest
     * @return PutKvResponse
     */
    CompletableFuture<PutKvResponse> putKv(PutKvRequest request);

    /**
     * @param request the request parameters of ReDoRoutineBuild  ReDoRoutineBuildRequest
     * @return ReDoRoutineBuildResponse
     */
    CompletableFuture<ReDoRoutineBuildResponse> reDoRoutineBuild(ReDoRoutineBuildRequest request);

    /**
     * @param request the request parameters of RebuildEdgeContainerAppStagingEnv  RebuildEdgeContainerAppStagingEnvRequest
     * @return RebuildEdgeContainerAppStagingEnvResponse
     */
    CompletableFuture<RebuildEdgeContainerAppStagingEnvResponse> rebuildEdgeContainerAppStagingEnv(RebuildEdgeContainerAppStagingEnvRequest request);

    /**
     * @param request the request parameters of RecoverSite  RecoverSiteRequest
     * @return RecoverSiteResponse
     */
    CompletableFuture<RecoverSiteResponse> recoverSite(RecoverSiteRequest request);

    /**
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * @param request the request parameters of ResetScheduledPreloadJob  ResetScheduledPreloadJobRequest
     * @return ResetScheduledPreloadJobResponse
     */
    CompletableFuture<ResetScheduledPreloadJobResponse> resetScheduledPreloadJob(ResetScheduledPreloadJobRequest request);

    /**
     * @param request the request parameters of RevokeClientCertificate  RevokeClientCertificateRequest
     * @return RevokeClientCertificateResponse
     */
    CompletableFuture<RevokeClientCertificateResponse> revokeClientCertificate(RevokeClientCertificateRequest request);

    /**
     * @param request the request parameters of RollbackEdgeContainerAppVersion  RollbackEdgeContainerAppVersionRequest
     * @return RollbackEdgeContainerAppVersionResponse
     */
    CompletableFuture<RollbackEdgeContainerAppVersionResponse> rollbackEdgeContainerAppVersion(RollbackEdgeContainerAppVersionRequest request);

    /**
     * @param request the request parameters of RollbackEnvironmentVersion  RollbackEnvironmentVersionRequest
     * @return RollbackEnvironmentVersionResponse
     */
    CompletableFuture<RollbackEnvironmentVersionResponse> rollbackEnvironmentVersion(RollbackEnvironmentVersionRequest request);

    /**
     * @param request the request parameters of SetAutomaticFrequencyControlConfig  SetAutomaticFrequencyControlConfigRequest
     * @return SetAutomaticFrequencyControlConfigResponse
     */
    CompletableFuture<SetAutomaticFrequencyControlConfigResponse> setAutomaticFrequencyControlConfig(SetAutomaticFrequencyControlConfigRequest request);

    /**
     * @param request the request parameters of SetCertificate  SetCertificateRequest
     * @return SetCertificateResponse
     */
    CompletableFuture<SetCertificateResponse> setCertificate(SetCertificateRequest request);

    /**
     * @param request the request parameters of SetClientCaCertificateHostnames  SetClientCaCertificateHostnamesRequest
     * @return SetClientCaCertificateHostnamesResponse
     */
    CompletableFuture<SetClientCaCertificateHostnamesResponse> setClientCaCertificateHostnames(SetClientCaCertificateHostnamesRequest request);

    /**
     * @param request the request parameters of SetClientCertificateHostnames  SetClientCertificateHostnamesRequest
     * @return SetClientCertificateHostnamesResponse
     */
    CompletableFuture<SetClientCertificateHostnamesResponse> setClientCertificateHostnames(SetClientCertificateHostnamesRequest request);

    /**
     * @param request the request parameters of SetDdosMaxBurstGbps  SetDdosMaxBurstGbpsRequest
     * @return SetDdosMaxBurstGbpsResponse
     */
    CompletableFuture<SetDdosMaxBurstGbpsResponse> setDdosMaxBurstGbps(SetDdosMaxBurstGbpsRequest request);

    /**
     * @param request the request parameters of SetHttpDDoSAttackIntelligentProtection  SetHttpDDoSAttackIntelligentProtectionRequest
     * @return SetHttpDDoSAttackIntelligentProtectionResponse
     */
    CompletableFuture<SetHttpDDoSAttackIntelligentProtectionResponse> setHttpDDoSAttackIntelligentProtection(SetHttpDDoSAttackIntelligentProtectionRequest request);

    /**
     * @param request the request parameters of SetHttpDDoSAttackProtection  SetHttpDDoSAttackProtectionRequest
     * @return SetHttpDDoSAttackProtectionResponse
     */
    CompletableFuture<SetHttpDDoSAttackProtectionResponse> setHttpDDoSAttackProtection(SetHttpDDoSAttackProtectionRequest request);

    /**
     * @param request the request parameters of SetHttpDDoSAttackRuleAction  SetHttpDDoSAttackRuleActionRequest
     * @return SetHttpDDoSAttackRuleActionResponse
     */
    CompletableFuture<SetHttpDDoSAttackRuleActionResponse> setHttpDDoSAttackRuleAction(SetHttpDDoSAttackRuleActionRequest request);

    /**
     * @param request the request parameters of SetHttpDDoSAttackRuleStatus  SetHttpDDoSAttackRuleStatusRequest
     * @return SetHttpDDoSAttackRuleStatusResponse
     */
    CompletableFuture<SetHttpDDoSAttackRuleStatusResponse> setHttpDDoSAttackRuleStatus(SetHttpDDoSAttackRuleStatusRequest request);

    /**
     * @param request the request parameters of SetKeylessServer  SetKeylessServerRequest
     * @return SetKeylessServerResponse
     */
    CompletableFuture<SetKeylessServerResponse> setKeylessServer(SetKeylessServerRequest request);

    /**
     * @param request the request parameters of SetOriginClientCertificateHostnames  SetOriginClientCertificateHostnamesRequest
     * @return SetOriginClientCertificateHostnamesResponse
     */
    CompletableFuture<SetOriginClientCertificateHostnamesResponse> setOriginClientCertificateHostnames(SetOriginClientCertificateHostnamesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you do not specify StartTime and EndTime, this operation returns data from the past 24 hours. If you specify StartTime and EndTime, this operation returns data for the specified time range.</li>
     * <li>The time granularity of returned data varies based on the time range specified by StartTime and EndTime.<ul>
     * <li>If the time range is less than or equal to 3 hours, data is returned at a 1-minute granularity.</li>
     * <li>If the time range is greater than 3 hours and less than or equal to 1 day, data is returned at a 5-minute granularity.</li>
     * <li>If the time range is greater than 1 day and less than or equal to 10 days, data is returned at an hourly granularity.</li>
     * <li>If the time range is greater than 10 days and less than or equal to 31 days, data is returned at a daily granularity.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SetRoutineEnvironmentVariables  SetRoutineEnvironmentVariablesRequest
     * @return SetRoutineEnvironmentVariablesResponse
     */
    CompletableFuture<SetRoutineEnvironmentVariablesResponse> setRoutineEnvironmentVariables(SetRoutineEnvironmentVariablesRequest request);

    /**
     * @param request the request parameters of StartScheduledPreloadExecution  StartScheduledPreloadExecutionRequest
     * @return StartScheduledPreloadExecutionResponse
     */
    CompletableFuture<StartScheduledPreloadExecutionResponse> startScheduledPreloadExecution(StartScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of StopRoutineBuild  StopRoutineBuildRequest
     * @return StopRoutineBuildResponse
     */
    CompletableFuture<StopRoutineBuildResponse> stopRoutineBuild(StopRoutineBuildRequest request);

    /**
     * @param request the request parameters of StopScheduledPreloadExecution  StopScheduledPreloadExecutionRequest
     * @return StopScheduledPreloadExecutionResponse
     */
    CompletableFuture<StopScheduledPreloadExecutionResponse> stopScheduledPreloadExecution(StopScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of StopSite  StopSiteRequest
     * @return StopSiteResponse
     */
    CompletableFuture<StopSiteResponse> stopSite(StopSiteRequest request);

    /**
     * @param request the request parameters of SubmitUploadTask  SubmitUploadTaskRequest
     * @return SubmitUploadTaskResponse
     */
    CompletableFuture<SubmitUploadTaskResponse> submitUploadTask(SubmitUploadTaskRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Before you use this operation, make sure that the site is connected to the ESA platform and enabled.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TraceSite  TraceSiteRequest
     * @return TraceSiteResponse
     */
    CompletableFuture<TraceSiteResponse> traceSite(TraceSiteRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateBotSpec  UpdateBotSpecRequest
     * @return UpdateBotSpecResponse
     */
    CompletableFuture<UpdateBotSpecResponse> updateBotSpec(UpdateBotSpecRequest request);

    /**
     * @param request the request parameters of UpdateCacheReserve  UpdateCacheReserveRequest
     * @return UpdateCacheReserveResponse
     */
    CompletableFuture<UpdateCacheReserveResponse> updateCacheReserve(UpdateCacheReserveRequest request);

    /**
     * @param request the request parameters of UpdateCacheReserveSpec  UpdateCacheReserveSpecRequest
     * @return UpdateCacheReserveSpecResponse
     */
    CompletableFuture<UpdateCacheReserveSpecResponse> updateCacheReserveSpec(UpdateCacheReserveSpecRequest request);

    /**
     * @param request the request parameters of UpdateCacheRule  UpdateCacheRuleRequest
     * @return UpdateCacheRuleResponse
     */
    CompletableFuture<UpdateCacheRuleResponse> updateCacheRule(UpdateCacheRuleRequest request);

    /**
     * @param request the request parameters of UpdateCacheTag  UpdateCacheTagRequest
     * @return UpdateCacheTagResponse
     */
    CompletableFuture<UpdateCacheTagResponse> updateCacheTag(UpdateCacheTagRequest request);

    /**
     * @param request the request parameters of UpdateCnameFlattening  UpdateCnameFlatteningRequest
     * @return UpdateCnameFlatteningResponse
     */
    CompletableFuture<UpdateCnameFlatteningResponse> updateCnameFlattening(UpdateCnameFlatteningRequest request);

    /**
     * @param request the request parameters of UpdateCompressionRule  UpdateCompressionRuleRequest
     * @return UpdateCompressionRuleResponse
     */
    CompletableFuture<UpdateCompressionRuleResponse> updateCompressionRule(UpdateCompressionRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can only modify the priority of a rule configuration. You cannot modify global configurations.</p>
     * 
     * @param request the request parameters of UpdateConfigSequence  UpdateConfigSequenceRequest
     * @return UpdateConfigSequenceResponse
     */
    CompletableFuture<UpdateConfigSequenceResponse> updateConfigSequence(UpdateConfigSequenceRequest request);

    /**
     * <b>description</b> :
     * <p>The site plan must be Enterprise Edition or higher to enable China mainland network access optimization.</p>
     * 
     * @param request the request parameters of UpdateCrossBorderOptimization  UpdateCrossBorderOptimizationRequest
     * @return UpdateCrossBorderOptimizationResponse
     */
    CompletableFuture<UpdateCrossBorderOptimizationResponse> updateCrossBorderOptimization(UpdateCrossBorderOptimizationRequest request);

    /**
     * @param request the request parameters of UpdateCustomHostname  UpdateCustomHostnameRequest
     * @return UpdateCustomHostnameResponse
     */
    CompletableFuture<UpdateCustomHostnameResponse> updateCustomHostname(UpdateCustomHostnameRequest request);

    /**
     * @param request the request parameters of UpdateCustomResponseCodeRule  UpdateCustomResponseCodeRuleRequest
     * @return UpdateCustomResponseCodeRuleResponse
     */
    CompletableFuture<UpdateCustomResponseCodeRuleResponse> updateCustomResponseCodeRule(UpdateCustomResponseCodeRuleRequest request);

    /**
     * @param request the request parameters of UpdateCustomScenePolicy  UpdateCustomScenePolicyRequest
     * @return UpdateCustomScenePolicyResponse
     */
    CompletableFuture<UpdateCustomScenePolicyResponse> updateCustomScenePolicy(UpdateCustomScenePolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call <code>PurchaseDDoSInstance</code> to purchase a DDoS instance. A newly purchased DDoS instance can only be associated with a pay-as-you-go plan instance.</li>
     * <li>Call <code>ListDDoSInstances</code> to query the list of DDoS instances.</li>
     * <li>Specification changes are not allowed within 31 days of purchase.</li>
     * <li>You can change specifications once per calendar month (from the 1st to the 31st of each month).</li>
     * <li>After a successful specification change, billing starts immediately on the same day based on the new instance specifications.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDDoSSpec  UpdateDDoSSpecRequest
     * @return UpdateDDoSSpecResponse
     */
    CompletableFuture<UpdateDDoSSpecResponse> updateDDoSSpec(UpdateDDoSSpecRequest request);

    /**
     * @param request the request parameters of UpdateDevelopmentMode  UpdateDevelopmentModeRequest
     * @return UpdateDevelopmentModeResponse
     */
    CompletableFuture<UpdateDevelopmentModeResponse> updateDevelopmentMode(UpdateDevelopmentModeRequest request);

    /**
     * @param request the request parameters of UpdateEdgeContainerAppLogRiver  UpdateEdgeContainerAppLogRiverRequest
     * @return UpdateEdgeContainerAppLogRiverResponse
     */
    CompletableFuture<UpdateEdgeContainerAppLogRiverResponse> updateEdgeContainerAppLogRiver(UpdateEdgeContainerAppLogRiverRequest request);

    /**
     * @param request the request parameters of UpdateEdgeContainerAppResourceReserve  UpdateEdgeContainerAppResourceReserveRequest
     * @return UpdateEdgeContainerAppResourceReserveResponse
     */
    CompletableFuture<UpdateEdgeContainerAppResourceReserveResponse> updateEdgeContainerAppResourceReserve(UpdateEdgeContainerAppResourceReserveRequest request);

    /**
     * @param request the request parameters of UpdateEnvironment  UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    /**
     * @param request the request parameters of UpdateEnvironmentVersion  UpdateEnvironmentVersionRequest
     * @return UpdateEnvironmentVersionResponse
     */
    CompletableFuture<UpdateEnvironmentVersionResponse> updateEnvironmentVersion(UpdateEnvironmentVersionRequest request);

    /**
     * @param request the request parameters of UpdateHttpIncomingRequestHeaderModificationRule  UpdateHttpIncomingRequestHeaderModificationRuleRequest
     * @return UpdateHttpIncomingRequestHeaderModificationRuleResponse
     */
    CompletableFuture<UpdateHttpIncomingRequestHeaderModificationRuleResponse> updateHttpIncomingRequestHeaderModificationRule(UpdateHttpIncomingRequestHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of UpdateHttpIncomingResponseHeaderModificationRule  UpdateHttpIncomingResponseHeaderModificationRuleRequest
     * @return UpdateHttpIncomingResponseHeaderModificationRuleResponse
     */
    CompletableFuture<UpdateHttpIncomingResponseHeaderModificationRuleResponse> updateHttpIncomingResponseHeaderModificationRule(UpdateHttpIncomingResponseHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of UpdateHttpRequestHeaderModificationRule  UpdateHttpRequestHeaderModificationRuleRequest
     * @return UpdateHttpRequestHeaderModificationRuleResponse
     */
    CompletableFuture<UpdateHttpRequestHeaderModificationRuleResponse> updateHttpRequestHeaderModificationRule(UpdateHttpRequestHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of UpdateHttpResponseHeaderModificationRule  UpdateHttpResponseHeaderModificationRuleRequest
     * @return UpdateHttpResponseHeaderModificationRuleResponse
     */
    CompletableFuture<UpdateHttpResponseHeaderModificationRuleResponse> updateHttpResponseHeaderModificationRule(UpdateHttpResponseHeaderModificationRuleRequest request);

    /**
     * @param request the request parameters of UpdateHttpsApplicationConfiguration  UpdateHttpsApplicationConfigurationRequest
     * @return UpdateHttpsApplicationConfigurationResponse
     */
    CompletableFuture<UpdateHttpsApplicationConfigurationResponse> updateHttpsApplicationConfiguration(UpdateHttpsApplicationConfigurationRequest request);

    /**
     * @param request the request parameters of UpdateHttpsBasicConfiguration  UpdateHttpsBasicConfigurationRequest
     * @return UpdateHttpsBasicConfigurationResponse
     */
    CompletableFuture<UpdateHttpsBasicConfigurationResponse> updateHttpsBasicConfiguration(UpdateHttpsBasicConfigurationRequest request);

    /**
     * @param request the request parameters of UpdateIPv6  UpdateIPv6Request
     * @return UpdateIPv6Response
     */
    CompletableFuture<UpdateIPv6Response> updateIPv6(UpdateIPv6Request request);

    /**
     * @param request the request parameters of UpdateImageTransform  UpdateImageTransformRequest
     * @return UpdateImageTransformResponse
     */
    CompletableFuture<UpdateImageTransformResponse> updateImageTransform(UpdateImageTransformRequest request);

    /**
     * @param request the request parameters of UpdateList  UpdateListRequest
     * @return UpdateListResponse
     */
    CompletableFuture<UpdateListResponse> updateList(UpdateListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation modifies multiple configurations for a load balancer, including its name, acceleration status, session persistence policy, and advanced traffic routing settings.&gt;Notice: Changes to certain parameters might affect the stability of existing services. Proceed with caution.</p>
     * 
     * @param request the request parameters of UpdateLoadBalancer  UpdateLoadBalancerRequest
     * @return UpdateLoadBalancerResponse
     */
    CompletableFuture<UpdateLoadBalancerResponse> updateLoadBalancer(UpdateLoadBalancerRequest request);

    /**
     * @param request the request parameters of UpdateManagedTransform  UpdateManagedTransformRequest
     * @return UpdateManagedTransformResponse
     */
    CompletableFuture<UpdateManagedTransformResponse> updateManagedTransform(UpdateManagedTransformRequest request);

    /**
     * @param request the request parameters of UpdateNetworkOptimization  UpdateNetworkOptimizationRequest
     * @return UpdateNetworkOptimizationResponse
     */
    CompletableFuture<UpdateNetworkOptimizationResponse> updateNetworkOptimization(UpdateNetworkOptimizationRequest request);

    /**
     * @param request the request parameters of UpdateOriginPool  UpdateOriginPoolRequest
     * @return UpdateOriginPoolResponse
     */
    CompletableFuture<UpdateOriginPoolResponse> updateOriginPool(UpdateOriginPoolRequest request);

    /**
     * @param request the request parameters of UpdateOriginProtection  UpdateOriginProtectionRequest
     * @return UpdateOriginProtectionResponse
     */
    CompletableFuture<UpdateOriginProtectionResponse> updateOriginProtection(UpdateOriginProtectionRequest request);

    /**
     * @param request the request parameters of UpdateOriginProtectionIpWhiteList  UpdateOriginProtectionIpWhiteListRequest
     * @return UpdateOriginProtectionIpWhiteListResponse
     */
    CompletableFuture<UpdateOriginProtectionIpWhiteListResponse> updateOriginProtectionIpWhiteList(UpdateOriginProtectionIpWhiteListRequest request);

    /**
     * @param request the request parameters of UpdateOriginRule  UpdateOriginRuleRequest
     * @return UpdateOriginRuleResponse
     */
    CompletableFuture<UpdateOriginRuleResponse> updateOriginRule(UpdateOriginRuleRequest request);

    /**
     * @param request the request parameters of UpdatePage  UpdatePageRequest
     * @return UpdatePageResponse
     */
    CompletableFuture<UpdatePageResponse> updatePage(UpdatePageRequest request);

    /**
     * @param request the request parameters of UpdatePerformanceDataCollection  UpdatePerformanceDataCollectionRequest
     * @return UpdatePerformanceDataCollectionResponse
     */
    CompletableFuture<UpdatePerformanceDataCollectionResponse> updatePerformanceDataCollection(UpdatePerformanceDataCollectionRequest request);

    /**
     * @param request the request parameters of UpdateRatePlanSpec  UpdateRatePlanSpecRequest
     * @return UpdateRatePlanSpecResponse
     */
    CompletableFuture<UpdateRatePlanSpecResponse> updateRatePlanSpec(UpdateRatePlanSpecRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation allows you to update a DNS record, including but not limited to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI record types. You can modify the record content by specifying the corresponding record value, priority, flag, and other fields. For CNAME origin servers that require authentication, such as OSS and S3, this API operation also supports configuring origin authentication information to ensure secure access.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The record value (Value) must match the record type. For example, a CNAME record must correspond to a target domain name.</li>
     * <li>Certain record types, such as MX and SRV, require a priority (Priority) value.</li>
     * <li>CAA records require specific fields such as Flag and Tag.</li>
     * <li>When updating security records such as CERT and SSHFP, accurately set the Type, Algorithm, and other fields.</li>
     * <li>When using OSS or S3 as the origin server, configure the authentication details in AuthConf based on the permission settings.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRecord  UpdateRecordRequest
     * @return UpdateRecordResponse
     */
    CompletableFuture<UpdateRecordResponse> updateRecord(UpdateRecordRequest request);

    /**
     * @param request the request parameters of UpdateRedirectRule  UpdateRedirectRuleRequest
     * @return UpdateRedirectRuleResponse
     */
    CompletableFuture<UpdateRedirectRuleResponse> updateRedirectRule(UpdateRedirectRuleRequest request);

    /**
     * @param request the request parameters of UpdateRewriteUrlRule  UpdateRewriteUrlRuleRequest
     * @return UpdateRewriteUrlRuleResponse
     */
    CompletableFuture<UpdateRewriteUrlRuleResponse> updateRewriteUrlRule(UpdateRewriteUrlRuleRequest request);

    /**
     * @param request the request parameters of UpdateRoutineBuildConfiguration  UpdateRoutineBuildConfigurationRequest
     * @return UpdateRoutineBuildConfigurationResponse
     */
    CompletableFuture<UpdateRoutineBuildConfigurationResponse> updateRoutineBuildConfiguration(UpdateRoutineBuildConfigurationRequest request);

    /**
     * @param request the request parameters of UpdateRoutineConfigDescription  UpdateRoutineConfigDescriptionRequest
     * @return UpdateRoutineConfigDescriptionResponse
     */
    CompletableFuture<UpdateRoutineConfigDescriptionResponse> updateRoutineConfigDescription(UpdateRoutineConfigDescriptionRequest request);

    /**
     * @param request the request parameters of UpdateRoutineRoute  UpdateRoutineRouteRequest
     * @return UpdateRoutineRouteResponse
     */
    CompletableFuture<UpdateRoutineRouteResponse> updateRoutineRoute(UpdateRoutineRouteRequest request);

    /**
     * @param request the request parameters of UpdateScheduledPreloadExecution  UpdateScheduledPreloadExecutionRequest
     * @return UpdateScheduledPreloadExecutionResponse
     */
    CompletableFuture<UpdateScheduledPreloadExecutionResponse> updateScheduledPreloadExecution(UpdateScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of UpdateSeoBypass  UpdateSeoBypassRequest
     * @return UpdateSeoBypassResponse
     */
    CompletableFuture<UpdateSeoBypassResponse> updateSeoBypass(UpdateSeoBypassRequest request);

    /**
     * <b>description</b> :
     * <p>When you change the DNS setup of a website from NS to CNAME, note the following prerequisites:</p>
     * <ul>
     * <li>The website only has proxied A/AAAA and CNAME records.</li>
     * <li>The DNS passthrough mode and custom nameserver features are not enabled for the website.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSiteAccessType  UpdateSiteAccessTypeRequest
     * @return UpdateSiteAccessTypeResponse
     */
    CompletableFuture<UpdateSiteAccessTypeResponse> updateSiteAccessType(UpdateSiteAccessTypeRequest request);

    /**
     * @param request the request parameters of UpdateSiteCoverage  UpdateSiteCoverageRequest
     * @return UpdateSiteCoverageResponse
     */
    CompletableFuture<UpdateSiteCoverageResponse> updateSiteCoverage(UpdateSiteCoverageRequest request);

    /**
     * @param request the request parameters of UpdateSiteCustomLog  UpdateSiteCustomLogRequest
     * @return UpdateSiteCustomLogResponse
     */
    CompletableFuture<UpdateSiteCustomLogResponse> updateSiteCustomLog(UpdateSiteCustomLogRequest request);

    /**
     * @param request the request parameters of UpdateSiteDeliveryTask  UpdateSiteDeliveryTaskRequest
     * @return UpdateSiteDeliveryTaskResponse
     */
    CompletableFuture<UpdateSiteDeliveryTaskResponse> updateSiteDeliveryTask(UpdateSiteDeliveryTaskRequest request);

    /**
     * @param request the request parameters of UpdateSiteDeliveryTaskStatus  UpdateSiteDeliveryTaskStatusRequest
     * @return UpdateSiteDeliveryTaskStatusResponse
     */
    CompletableFuture<UpdateSiteDeliveryTaskStatusResponse> updateSiteDeliveryTaskStatus(UpdateSiteDeliveryTaskStatusRequest request);

    /**
     * @param request the request parameters of UpdateSiteInstance  UpdateSiteInstanceRequest
     * @return UpdateSiteInstanceResponse
     */
    CompletableFuture<UpdateSiteInstanceResponse> updateSiteInstance(UpdateSiteInstanceRequest request);

    /**
     * @param request the request parameters of UpdateSiteNameExclusive  UpdateSiteNameExclusiveRequest
     * @return UpdateSiteNameExclusiveResponse
     */
    CompletableFuture<UpdateSiteNameExclusiveResponse> updateSiteNameExclusive(UpdateSiteNameExclusiveRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation can be called only for sites that use the NS access mode.</p>
     * 
     * @param request the request parameters of UpdateSitePause  UpdateSitePauseRequest
     * @return UpdateSitePauseResponse
     */
    CompletableFuture<UpdateSitePauseResponse> updateSitePause(UpdateSitePauseRequest request);

    /**
     * <b>description</b> :
     * <p>The site plan must be Enterprise Edition or higher to use the custom NS feature.</p>
     * 
     * @param request the request parameters of UpdateSiteVanityNS  UpdateSiteVanityNSRequest
     * @return UpdateSiteVanityNSResponse
     */
    CompletableFuture<UpdateSiteVanityNSResponse> updateSiteVanityNS(UpdateSiteVanityNSRequest request);

    /**
     * @param request the request parameters of UpdateTieredCache  UpdateTieredCacheRequest
     * @return UpdateTieredCacheResponse
     */
    CompletableFuture<UpdateTieredCacheResponse> updateTieredCache(UpdateTieredCacheRequest request);

    /**
     * <b>description</b> :
     * <p>If ListTransportLayerApplications returns an empty Layer 4 acceleration application list, use CreateTransportLayerApplication to create a Layer 4 acceleration application, and then use this API to modify the configurations of the Layer 4 acceleration application.
     * When creating a Layer 4 acceleration application, the selected site must be an activated site. After creating a site, call the VerifySite API to verify it. A site that passes verification is automatically activated, indicated by the response parameter Passed=true.</p>
     * 
     * @param request the request parameters of UpdateTransportLayerApplication  UpdateTransportLayerApplicationRequest
     * @return UpdateTransportLayerApplicationResponse
     */
    CompletableFuture<UpdateTransportLayerApplicationResponse> updateTransportLayerApplication(UpdateTransportLayerApplicationRequest request);

    /**
     * @param request the request parameters of UpdateUrlObservation  UpdateUrlObservationRequest
     * @return UpdateUrlObservationResponse
     */
    CompletableFuture<UpdateUrlObservationResponse> updateUrlObservation(UpdateUrlObservationRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, you must have successfully created a task with the target TaskName by using CreateUserDeliveryTask. Only then can you use this operation to update the delivery task configuration.</p>
     * 
     * @param request the request parameters of UpdateUserDeliveryTask  UpdateUserDeliveryTaskRequest
     * @return UpdateUserDeliveryTaskResponse
     */
    CompletableFuture<UpdateUserDeliveryTaskResponse> updateUserDeliveryTask(UpdateUserDeliveryTaskRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>Use this operation to enable or disable a delivery task by using TaskName and Method. The response includes the most recent status and operation result details of the task.</p>
     * 
     * @param request the request parameters of UpdateUserDeliveryTaskStatus  UpdateUserDeliveryTaskStatusRequest
     * @return UpdateUserDeliveryTaskStatusResponse
     */
    CompletableFuture<UpdateUserDeliveryTaskStatusResponse> updateUserDeliveryTaskStatus(UpdateUserDeliveryTaskStatusRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation updates an existing WAF ruleset. You can modify the position, name, description, status, and expression of the ruleset.</li>
     * <li>Include only the parameters that you want to modify. Omit parameters that you do not want to change.</li>
     * <li>Note: Before you call this operation, ensure that the <code>InstanceId</code> and <code>Id</code> values are correct. Otherwise, the request may fail.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateUserWafRuleset  UpdateUserWafRulesetRequest
     * @return UpdateUserWafRulesetResponse
     */
    CompletableFuture<UpdateUserWafRulesetResponse> updateUserWafRuleset(UpdateUserWafRulesetRequest request);

    /**
     * @param request the request parameters of UpdateVersionDesc  UpdateVersionDescRequest
     * @return UpdateVersionDescResponse
     */
    CompletableFuture<UpdateVersionDescResponse> updateVersionDesc(UpdateVersionDescRequest request);

    /**
     * @param request the request parameters of UpdateVideoProcessing  UpdateVideoProcessingRequest
     * @return UpdateVideoProcessingResponse
     */
    CompletableFuture<UpdateVideoProcessingResponse> updateVideoProcessing(UpdateVideoProcessingRequest request);

    /**
     * @param request the request parameters of UpdateWafRule  UpdateWafRuleRequest
     * @return UpdateWafRuleResponse
     */
    CompletableFuture<UpdateWafRuleResponse> updateWafRule(UpdateWafRuleRequest request);

    /**
     * @param request the request parameters of UpdateWafRuleset  UpdateWafRulesetRequest
     * @return UpdateWafRulesetResponse
     */
    CompletableFuture<UpdateWafRulesetResponse> updateWafRuleset(UpdateWafRulesetRequest request);

    /**
     * @param request the request parameters of UpdateWaitingRoom  UpdateWaitingRoomRequest
     * @return UpdateWaitingRoomResponse
     */
    CompletableFuture<UpdateWaitingRoomResponse> updateWaitingRoom(UpdateWaitingRoomRequest request);

    /**
     * @param request the request parameters of UpdateWaitingRoomEvent  UpdateWaitingRoomEventRequest
     * @return UpdateWaitingRoomEventResponse
     */
    CompletableFuture<UpdateWaitingRoomEventResponse> updateWaitingRoomEvent(UpdateWaitingRoomEventRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the rule settings of a specific waiting room for a site, including the rule name, enabled status, and rule content.</p>
     * 
     * @param request the request parameters of UpdateWaitingRoomRule  UpdateWaitingRoomRuleRequest
     * @return UpdateWaitingRoomRuleResponse
     */
    CompletableFuture<UpdateWaitingRoomRuleResponse> updateWaitingRoomRule(UpdateWaitingRoomRuleRequest request);

    /**
     * @param request the request parameters of UpgradeEnvironmentVersion  UpgradeEnvironmentVersionRequest
     * @return UpgradeEnvironmentVersionResponse
     */
    CompletableFuture<UpgradeEnvironmentVersionResponse> upgradeEnvironmentVersion(UpgradeEnvironmentVersionRequest request);

    /**
     * @param request the request parameters of UploadClientCaCertificate  UploadClientCaCertificateRequest
     * @return UploadClientCaCertificateResponse
     */
    CompletableFuture<UploadClientCaCertificateResponse> uploadClientCaCertificate(UploadClientCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>You can add multiple origin servers under a source address. Origin servers of the domain name, IP address, OSS, and S3 types are supported. Back-to-origin authentication is supported for OSS and S3 origin servers.</p>
     * 
     * @param request the request parameters of UploadOriginCaCertificate  UploadOriginCaCertificateRequest
     * @return UploadOriginCaCertificateResponse
     */
    CompletableFuture<UploadOriginCaCertificateResponse> uploadOriginCaCertificate(UploadOriginCaCertificateRequest request);

    /**
     * @param request the request parameters of UploadOriginClientCertificate  UploadOriginClientCertificateRequest
     * @return UploadOriginClientCertificateResponse
     */
    CompletableFuture<UploadOriginClientCertificateResponse> uploadOriginClientCertificate(UploadOriginClientCertificateRequest request);

    /**
     * @param request the request parameters of UploadSiteOriginClientCertificate  UploadSiteOriginClientCertificateRequest
     * @return UploadSiteOriginClientCertificateResponse
     */
    CompletableFuture<UploadSiteOriginClientCertificateResponse> uploadSiteOriginClientCertificate(UploadSiteOriginClientCertificateRequest request);

    /**
     * @param request the request parameters of VerifyCustomHostname  VerifyCustomHostnameRequest
     * @return VerifyCustomHostnameResponse
     */
    CompletableFuture<VerifyCustomHostnameResponse> verifyCustomHostname(VerifyCustomHostnameRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>For sites connected through NS, verifies whether the current NS servers of the site are the NS servers assigned by Alibaba Cloud.</li>
     * <li>For sites connected through CNAME, verifies whether the site has a TXT record with the name _esaauth.[site name] and the content set to the site verification code (see the VerifyCode field in the site information).</li>
     * </ol>
     * 
     * @param request the request parameters of VerifySite  VerifySiteRequest
     * @return VerifySiteResponse
     */
    CompletableFuture<VerifySiteResponse> verifySite(VerifySiteRequest request);

}
