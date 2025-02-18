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
     * @param request the request parameters of ActivateVersionManagement  ActivateVersionManagementRequest
     * @return ActivateVersionManagementResponse
     */
    CompletableFuture<ActivateVersionManagementResponse> activateVersionManagement(ActivateVersionManagementRequest request);

    /**
     * @param request the request parameters of ApplyCertificate  ApplyCertificateRequest
     * @return ApplyCertificateResponse
     */
    CompletableFuture<ApplyCertificateResponse> applyCertificate(ApplyCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to create or update multiple DNS records at a time. It is suitable for managing a large number of DNS configurations. Supported record types include but are not limited to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI. The operation allows you to configure the priority, flag, tag, and weight for DNS records. In addition, for specific types of records, such as CERT, SSHFP, SMIMEA, and TLSA, advanced settings such as certificate information and encryption algorithms are also supported.
     * Successful and failed records along with error messages are listed in the response.</p>
     * 
     * @param request the request parameters of BatchCreateRecords  BatchCreateRecordsRequest
     * @return BatchCreateRecordsResponse
     */
    CompletableFuture<BatchCreateRecordsResponse> batchCreateRecords(BatchCreateRecordsRequest request);

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
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * @param request the request parameters of CreateNetworkOptimization  CreateNetworkOptimizationRequest
     * @return CreateNetworkOptimizationResponse
     */
    CompletableFuture<CreateNetworkOptimizationResponse> createNetworkOptimization(CreateNetworkOptimizationRequest request);

    /**
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
     * @param request the request parameters of CreateRoutineRelatedRecord  CreateRoutineRelatedRecordRequest
     * @return CreateRoutineRelatedRecordResponse
     */
    CompletableFuture<CreateRoutineRelatedRecordResponse> createRoutineRelatedRecord(CreateRoutineRelatedRecordRequest request);

    /**
     * @param request the request parameters of CreateRoutineRelatedRoute  CreateRoutineRelatedRouteRequest
     * @return CreateRoutineRelatedRouteResponse
     */
    CompletableFuture<CreateRoutineRelatedRouteResponse> createRoutineRelatedRoute(CreateRoutineRelatedRouteRequest request);

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
     * <p>  Make sure that you have an available plan before you add a website.</p>
     * <ul>
     * <li>Make sure that your website domain name has an ICP filing if the location you want to specify covers the Chinese mainland.</li>
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
     * <p>This API operation allows you to deliver logs to destinations such as Simple Log Service (SLS), HTTP servers, Object Storage Service (OSS), Amazon Simple Storage Service (S3), and Kafka. You can specify the task name, log fields to deliver, data center, discard rate, delivery type, and delivery details.</p>
     * <ul>
     * <li><strong>Field filtering</strong>: Use the <code>FieldName</code> parameter to specify log fields to deliver.</li>
     * <li><strong>Filtering rules</strong>: Use the <code>FilterRules</code> parameter to pre-process and filter log data.</li>
     * <li><strong>Diverse delivery destinations</strong>: Logs can be delivered to different destinations. Configuration parameters vary with delivery destinations.</li>
     * </ul>
     * <h2><a href="#"></a>Precautions</h2>
     * <ul>
     * <li>Make sure that you have sufficient permissions to perform delivery tasks.</li>
     * <li>If you enable encryption or authentication, properly configure corresponding parameters.</li>
     * <li>Verify the syntax of <code>FilterRules</code> to make sure that filtering logic works as expected.</li>
     * <li>Specify advanced settings such as the number of retries and timeout period based on your needs to have optimal delivery efficiency and stability.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUserDeliveryTask  CreateUserDeliveryTaskRequest
     * @return CreateUserDeliveryTaskResponse
     */
    CompletableFuture<CreateUserDeliveryTaskResponse> createUserDeliveryTask(CreateUserDeliveryTaskRequest request);

    /**
     * @param request the request parameters of CreateWaitingRoom  CreateWaitingRoomRequest
     * @return CreateWaitingRoomResponse
     */
    CompletableFuture<CreateWaitingRoomResponse> createWaitingRoom(CreateWaitingRoomRequest request);

    /**
     * @param request the request parameters of CreateWaitingRoomEvent  CreateWaitingRoomEventRequest
     * @return CreateWaitingRoomEventResponse
     */
    CompletableFuture<CreateWaitingRoomEventResponse> createWaitingRoomEvent(CreateWaitingRoomEventRequest request);

    /**
     * @param request the request parameters of CreateWaitingRoomRule  CreateWaitingRoomRuleRequest
     * @return CreateWaitingRoomRuleResponse
     */
    CompletableFuture<CreateWaitingRoomRuleResponse> createWaitingRoomRule(CreateWaitingRoomRuleRequest request);

    /**
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
     * @param request the request parameters of DeleteRoutineCodeVersion  DeleteRoutineCodeVersionRequest
     * @return DeleteRoutineCodeVersionResponse
     */
    CompletableFuture<DeleteRoutineCodeVersionResponse> deleteRoutineCodeVersion(DeleteRoutineCodeVersionRequest request);

    /**
     * @param request the request parameters of DeleteRoutineRelatedRecord  DeleteRoutineRelatedRecordRequest
     * @return DeleteRoutineRelatedRecordResponse
     */
    CompletableFuture<DeleteRoutineRelatedRecordResponse> deleteRoutineRelatedRecord(DeleteRoutineRelatedRecordRequest request);

    /**
     * @param request the request parameters of DeleteRoutineRelatedRoute  DeleteRoutineRelatedRouteRequest
     * @return DeleteRoutineRelatedRouteResponse
     */
    CompletableFuture<DeleteRoutineRelatedRouteResponse> deleteRoutineRelatedRoute(DeleteRoutineRelatedRouteRequest request);

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
     * <b>description</b> :
     * <p>*****&gt; </p>
     * <ul>
     * <li>Deleted tasks cannot be restored. Proceed with caution.</li>
     * <li>To call this operation, you must have an account that has the required permissions.</li>
     * <li>The returned <code>RequestId</code> value can be used to track the request processing progress and troubleshoot issues.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteUserDeliveryTask  DeleteUserDeliveryTaskRequest
     * @return DeleteUserDeliveryTaskResponse
     */
    CompletableFuture<DeleteUserDeliveryTaskResponse> deleteUserDeliveryTask(DeleteUserDeliveryTaskRequest request);

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
     * @param request the request parameters of DescribeDDoSL7QpsList  DescribeDDoSL7QpsListRequest
     * @return DescribeDDoSL7QpsListResponse
     */
    CompletableFuture<DescribeDDoSL7QpsListResponse> describeDDoSL7QpsList(DescribeDDoSL7QpsListRequest request);

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
     * @param request the request parameters of DescribeRatePlanInstanceStatus  DescribeRatePlanInstanceStatusRequest
     * @return DescribeRatePlanInstanceStatusResponse
     */
    CompletableFuture<DescribeRatePlanInstanceStatusResponse> describeRatePlanInstanceStatus(DescribeRatePlanInstanceStatusRequest request);

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
     * @param request the request parameters of ExportRecords  ExportRecordsRequest
     * @return ExportRecordsResponse
     */
    CompletableFuture<ExportRecordsResponse> exportRecords(ExportRecordsRequest request);

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
     * @param request the request parameters of GetDevelopmentMode  GetDevelopmentModeRequest
     * @return GetDevelopmentModeResponse
     */
    CompletableFuture<GetDevelopmentModeResponse> getDevelopmentMode(GetDevelopmentModeRequest request);

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
     * @param request the request parameters of GetLoadBalancer  GetLoadBalancerRequest
     * @return GetLoadBalancerResponse
     */
    CompletableFuture<GetLoadBalancerResponse> getLoadBalancer(GetLoadBalancerRequest request);

    /**
     * @param request the request parameters of GetManagedTransform  GetManagedTransformRequest
     * @return GetManagedTransformResponse
     */
    CompletableFuture<GetManagedTransformResponse> getManagedTransform(GetManagedTransformRequest request);

    /**
     * @param request the request parameters of GetNetworkOptimization  GetNetworkOptimizationRequest
     * @return GetNetworkOptimizationResponse
     */
    CompletableFuture<GetNetworkOptimizationResponse> getNetworkOptimization(GetNetworkOptimizationRequest request);

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
     * <b>description</b> :
     * <p>  Every time the code of a routine is released to the staging environment, a version number is generated. Such code is for tests only.</p>
     * <ul>
     * <li>A routine can retain a maximum of 10 code versions. If the number of versions reaches the limit, you must call the DeleteRoutineCodeRevision operation to delete unwanted versions.</li>
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
     * <p>You can call this operation to query the remaining quota for delivering a specific category of real-time logs in a website within an Alibaba Cloud account. This is essential for monitoring and managing your log delivery capacity to ensure that logs can be delivered to the destination and prevent data loss or latency caused by insufficient quota.
     * <strong>Take note of the following parameters:</strong></p>
     * <ul>
     * <li>``</li>
     * <li><code>BusinessType</code> is required. You must specify a log category to obtain the corresponding quota information.</li>
     * <li><code>SiteId</code> specifies the ID of a website, which must be a valid integer that corresponds to a website that you configured on Alibaba Cloud.
     * <strong>Response:</strong></li>
     * <li>If a request is successful, the system returns the remaining log delivery quota (<code>FreeQuota</code>), request ID (<code>RequestId</code>), website ID (<code>SiteId</code>), and log category (<code>BusinessType</code>). You can confirm and record the returned data.</li>
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
     * @param request the request parameters of GetSitePause  GetSitePauseRequest
     * @return GetSitePauseResponse
     */
    CompletableFuture<GetSitePauseResponse> getSitePause(GetSitePauseRequest request);

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
     * @param request the request parameters of GetUploadTask  GetUploadTaskRequest
     * @return GetUploadTaskResponse
     */
    CompletableFuture<GetUploadTaskResponse> getUploadTask(GetUploadTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  This API operation queries the details of a delivery task, including the task name, discard rate, region, log category, status, delivery destination, configuration, and filtering rules.****</p>
     * <ul>
     * <li>You can call this operation to query detailed information about a log delivery task to analyze log processing efficiency or troubleshoot delivery problems.****</li>
     * <li>****````</li>
     * </ul>
     * 
     * @param request the request parameters of GetUserDeliveryTask  GetUserDeliveryTaskRequest
     * @return GetUserDeliveryTaskResponse
     */
    CompletableFuture<GetUserDeliveryTaskResponse> getUserDeliveryTask(GetUserDeliveryTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the remaining real-time log delivery quota of each log category in your Alibaba Cloud account. You must provide your Alibaba Cloud account ID (aliUid) and log category (BusinessType). The system then returns the remaining quota of the log category to help you track the usage.</p>
     * 
     * @param request the request parameters of GetUserLogDeliveryQuota  GetUserLogDeliveryQuotaRequest
     * @return GetUserLogDeliveryQuotaResponse
     */
    CompletableFuture<GetUserLogDeliveryQuotaResponse> getUserLogDeliveryQuota(GetUserLogDeliveryQuotaRequest request);

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
     * @param request the request parameters of ListCertificates  ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    CompletableFuture<ListCertificatesResponse> listCertificates(ListCertificatesRequest request);

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
     * <p> You can call this operation 100 times per second.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListEdgeRoutineRecords  ListEdgeRoutineRecordsRequest
     * @return ListEdgeRoutineRecordsResponse
     */
    CompletableFuture<ListEdgeRoutineRecordsResponse> listEdgeRoutineRecords(ListEdgeRoutineRecordsRequest request);

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
     * @param request the request parameters of ListLoadBalancerOriginStatus  ListLoadBalancerOriginStatusRequest
     * @return ListLoadBalancerOriginStatusResponse
     */
    CompletableFuture<ListLoadBalancerOriginStatusResponse> listLoadBalancerOriginStatus(ListLoadBalancerOriginStatusRequest request);

    /**
     * <b>description</b> :
     * <p>When you call an operation to create a traffic steering policy based on the originating country or region for a load balancer, you can use the code of a region or subregion to specify traffic that is sent from the region or subregion.</p>
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
     * <p>The DNS records related to Edge Container, Edge Routine, and TCP/UDP proxy are not returned in this operation.</p>
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
     * @param request the request parameters of ListRoutineCanaryAreas  ListRoutineCanaryAreasRequest
     * @return ListRoutineCanaryAreasResponse
     */
    CompletableFuture<ListRoutineCanaryAreasResponse> listRoutineCanaryAreas(ListRoutineCanaryAreasRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specifications that you can select for a routine.</p>
     * 
     * @param request the request parameters of ListRoutineOptionalSpecs  ListRoutineOptionalSpecsRequest
     * @return ListRoutineOptionalSpecsResponse
     */
    CompletableFuture<ListRoutineOptionalSpecsResponse> listRoutineOptionalSpecs(ListRoutineOptionalSpecsRequest request);

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
     * @param request the request parameters of ListUploadTasks  ListUploadTasksRequest
     * @return ListUploadTasksResponse
     */
    CompletableFuture<ListUploadTasksResponse> listUploadTasks(ListUploadTasksRequest request);

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
     * <p>You can call this operation to query details of all waiting room events related to a waiting room in a website.</p>
     * 
     * @param request the request parameters of ListWaitingRoomEvents  ListWaitingRoomEventsRequest
     * @return ListWaitingRoomEventsResponse
     */
    CompletableFuture<ListWaitingRoomEventsResponse> listWaitingRoomEvents(ListWaitingRoomEventsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the waiting room bypass rules that are associated with a website.</p>
     * 
     * @param request the request parameters of ListWaitingRoomRules  ListWaitingRoomRulesRequest
     * @return ListWaitingRoomRulesResponse
     */
    CompletableFuture<ListWaitingRoomRulesResponse> listWaitingRoomRules(ListWaitingRoomRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query detailed configurations about all waiting rooms in a website, including the status, name, and queuing rules of each waiting room.</p>
     * 
     * @param request the request parameters of ListWaitingRooms  ListWaitingRoomsRequest
     * @return ListWaitingRoomsResponse
     */
    CompletableFuture<ListWaitingRoomsResponse> listWaitingRooms(ListWaitingRoomsRequest request);

    /**
     * @param request the request parameters of PreloadCaches  PreloadCachesRequest
     * @return PreloadCachesResponse
     */
    CompletableFuture<PreloadCachesResponse> preloadCaches(PreloadCachesRequest request);

    /**
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
     * @param request the request parameters of RebuildEdgeContainerAppStagingEnv  RebuildEdgeContainerAppStagingEnvRequest
     * @return RebuildEdgeContainerAppStagingEnvResponse
     */
    CompletableFuture<RebuildEdgeContainerAppStagingEnvResponse> rebuildEdgeContainerAppStagingEnv(RebuildEdgeContainerAppStagingEnvRequest request);

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
     * @param request the request parameters of SetCertificate  SetCertificateRequest
     * @return SetCertificateResponse
     */
    CompletableFuture<SetCertificateResponse> setCertificate(SetCertificateRequest request);

    /**
     * @param request the request parameters of SetClientCertificateHostnames  SetClientCertificateHostnamesRequest
     * @return SetClientCertificateHostnamesResponse
     */
    CompletableFuture<SetClientCertificateHostnamesResponse> setClientCertificateHostnames(SetClientCertificateHostnamesRequest request);

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
     * @param request the request parameters of StartScheduledPreloadExecution  StartScheduledPreloadExecutionRequest
     * @return StartScheduledPreloadExecutionResponse
     */
    CompletableFuture<StartScheduledPreloadExecutionResponse> startScheduledPreloadExecution(StartScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of StopScheduledPreloadExecution  StopScheduledPreloadExecutionRequest
     * @return StopScheduledPreloadExecutionResponse
     */
    CompletableFuture<StopScheduledPreloadExecutionResponse> stopScheduledPreloadExecution(StopScheduledPreloadExecutionRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

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
     * @param request the request parameters of UpdateCustomScenePolicy  UpdateCustomScenePolicyRequest
     * @return UpdateCustomScenePolicyResponse
     */
    CompletableFuture<UpdateCustomScenePolicyResponse> updateCustomScenePolicy(UpdateCustomScenePolicyRequest request);

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
     * @param request the request parameters of UpdateRatePlanSpec  UpdateRatePlanSpecRequest
     * @return UpdateRatePlanSpecResponse
     */
    CompletableFuture<UpdateRatePlanSpecResponse> updateRatePlanSpec(UpdateRatePlanSpecRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to update multiple types of DNS records, including but not limited to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI. You can modify the record content by providing the necessary fields such as Value, Priority, and Flag. For origins added in CNAME records such as OSS and S3, the API enables you to configure authentication details to ensure secure access.</p>
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>The record value (Value) must match the record type. For example, the CNAME record should correspond to the target domain name.</li>
     * <li>You must specify a priority (Priority) for some record types, such as MX and SRV.</li>
     * <li>You must specify specific fields such as Flag and Tag for CAA records.</li>
     * <li>When you update security records such as CERT and SSHFP, you must accurately set fields such as Type and Algorithm.</li>
     * <li>If your origin type is OSS or S3, configure the authentication details in AuthConf based on the permissions.</li>
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
     * @param request the request parameters of UpdateSiteNameExclusive  UpdateSiteNameExclusiveRequest
     * @return UpdateSiteNameExclusiveResponse
     */
    CompletableFuture<UpdateSiteNameExclusiveResponse> updateSiteNameExclusive(UpdateSiteNameExclusiveRequest request);

    /**
     * @param request the request parameters of UpdateSitePause  UpdateSitePauseRequest
     * @return UpdateSitePauseResponse
     */
    CompletableFuture<UpdateSitePauseResponse> updateSitePause(UpdateSitePauseRequest request);

    /**
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
     * @param request the request parameters of UpdateUserDeliveryTask  UpdateUserDeliveryTaskRequest
     * @return UpdateUserDeliveryTaskResponse
     */
    CompletableFuture<UpdateUserDeliveryTaskResponse> updateUserDeliveryTask(UpdateUserDeliveryTaskRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>You can call this operation to enable or disable a delivery task by using TaskName and Method. The response includes the most recent status and operation result details of the task.</p>
     * 
     * @param request the request parameters of UpdateUserDeliveryTaskStatus  UpdateUserDeliveryTaskStatusRequest
     * @return UpdateUserDeliveryTaskStatusResponse
     */
    CompletableFuture<UpdateUserDeliveryTaskStatusResponse> updateUserDeliveryTaskStatus(UpdateUserDeliveryTaskStatusRequest request);

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
     * <p>You can call this API operation to modify the configurations of a waiting room bypass rule for your website, including the rule name, status, and rule content.</p>
     * 
     * @param request the request parameters of UpdateWaitingRoomRule  UpdateWaitingRoomRuleRequest
     * @return UpdateWaitingRoomRuleResponse
     */
    CompletableFuture<UpdateWaitingRoomRuleResponse> updateWaitingRoomRule(UpdateWaitingRoomRuleRequest request);

    /**
     * @param request the request parameters of UploadClientCaCertificate  UploadClientCaCertificateRequest
     * @return UploadClientCaCertificateResponse
     */
    CompletableFuture<UploadClientCaCertificateResponse> uploadClientCaCertificate(UploadClientCaCertificateRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>For a website connected by using NS setup, this operation verifies whether the nameservers of the website are the nameservers assigned by Alibaba Cloud.</li>
     * <li>For a website connected by using CNAME setup, this operation verifies whether the website has a TXT record whose hostname is  _esaauth.[websiteDomainName] and record value is the value of VerifyCode to the DNS records of your domain. You can see the VerifyCode field in the site information.</li>
     * </ol>
     * 
     * @param request the request parameters of VerifySite  VerifySiteRequest
     * @return VerifySiteResponse
     */
    CompletableFuture<VerifySiteResponse> verifySite(VerifySiteRequest request);

}
