// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.waf_openapi20211001.models.*;
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
     * @param request the request parameters of AddAddress  AddAddressRequest
     * @return AddAddressResponse
     */
    CompletableFuture<AddAddressResponse> addAddress(AddAddressRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of ClearAddress  ClearAddressRequest
     * @return ClearAddressResponse
     */
    CompletableFuture<ClearAddressResponse> clearAddress(ClearAddressRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance supports critical event protection. Critical event protection requires a separate upgrade purchase. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the response parameter Details.MajorProtection is true, the instance supports critical event protection. If not, upgrade the instance to enable critical event protection.</p>
     * 
     * @param request the request parameters of ClearMajorProtectionBlackIp  ClearMajorProtectionBlackIpRequest
     * @return ClearMajorProtectionBlackIpResponse
     */
    CompletableFuture<ClearMajorProtectionBlackIpResponse> clearMajorProtectionBlackIp(ClearMajorProtectionBlackIpRequest request);

    /**
     * @param request the request parameters of CopyDefenseTemplate  CopyDefenseTemplateRequest
     * @return CopyDefenseTemplateResponse
     */
    CompletableFuture<CopyDefenseTemplateResponse> copyDefenseTemplate(CopyDefenseTemplateRequest request);

    /**
     * @param request the request parameters of CreateApiExport  CreateApiExportRequest
     * @return CreateApiExportResponse
     */
    CompletableFuture<CreateApiExportResponse> createApiExport(CreateApiExportRequest request);

    /**
     * @param request the request parameters of CreateCerts  CreateCertsRequest
     * @return CreateCertsResponse
     */
    CompletableFuture<CreateCertsResponse> createCerts(CreateCertsRequest request);

    /**
     * <b>description</b> :
     * <p>Before invoking this operation, complete the following steps:</p>
     * <ol>
     * <li>Confirm that you have a WAF instance. Invoke <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of your WAF instance.</li>
     * <li>Confirm that the cloud service to be connected meets the applicable scope. For ECS, CLB, and NLB connections, verify the instance specifications and region. Refer to the &quot;Applicable Scope&quot; section in the <a href="https://help.aliyun.com/document_detail/464617.html">ECS connection</a>, <a href="https://help.aliyun.com/document_detail/464614.html">CLB connection</a>, and <a href="https://help.aliyun.com/document_detail/2853925.html">NLB connection</a> documentation. For Anti-DDoS connections, which are configured for domain names, refer to the &quot;Applicable Scope&quot; section in the <a href="https://help.aliyun.com/document_detail/3032763.html">Anti-DDoS connection</a> documentation.
     * After completing the preceding steps, invoke this operation to connect the cloud service to WAF in cloud native mode.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateCloudResource  CreateCloudResourceRequest
     * @return CreateCloudResourceResponse
     */
    CompletableFuture<CreateCloudResourceResponse> createCloudResource(CreateCloudResourceRequest request);

    /**
     * @param request the request parameters of CreateCloudResourceExtensionCert  CreateCloudResourceExtensionCertRequest
     * @return CreateCloudResourceExtensionCertResponse
     */
    CompletableFuture<CreateCloudResourceExtensionCertResponse> createCloudResourceExtensionCert(CreateCloudResourceExtensionCertRequest request);

    /**
     * @param request the request parameters of CreateDefenseResource  CreateDefenseResourceRequest
     * @return CreateDefenseResourceResponse
     */
    CompletableFuture<CreateDefenseResourceResponse> createDefenseResource(CreateDefenseResourceRequest request);

    /**
     * @param request the request parameters of CreateDefenseResourceGroup  CreateDefenseResourceGroupRequest
     * @return CreateDefenseResourceGroupResponse
     */
    CompletableFuture<CreateDefenseResourceGroupResponse> createDefenseResourceGroup(CreateDefenseResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateDefenseRule  CreateDefenseRuleRequest
     * @return CreateDefenseRuleResponse
     */
    CompletableFuture<CreateDefenseRuleResponse> createDefenseRule(CreateDefenseRuleRequest request);

    /**
     * @param request the request parameters of CreateDefenseTemplate  CreateDefenseTemplateRequest
     * @return CreateDefenseTemplateResponse
     */
    CompletableFuture<CreateDefenseTemplateResponse> createDefenseTemplate(CreateDefenseTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, the domain name (<strong>Domain</strong>) must meet the following requirements.</p>
     * <ul>
     * <li><strong>Domain ownership authentication</strong>: If <strong>AccessType</strong> is set to <strong>share</strong> (CNAME access) or <strong>hybrid_cloud_cname</strong> (hybrid cloud CNAME access) with public cloud disaster recovery enabled, you must first complete domain ownership authentication. Invoke the <a href="https://help.aliyun.com/document_detail/2985193.html">DescribeVerifyContent</a> operation to obtain domain verification information, configure a DNS TXT record or upload an HTTP verification file based on the response, and then invoke the <a href="https://help.aliyun.com/document_detail/2985192.html">VerifyDomainOwner</a> operation to complete domain ownership authentication. When you invoke the <a href="https://help.aliyun.com/document_detail/2985193.html">DescribeVerifyContent</a> and <a href="https://help.aliyun.com/document_detail/2985192.html">VerifyDomainOwner</a> operations, use the <strong>DomainName</strong> parameter to specify the domain name. The <strong>DescribeVerifyContent</strong> operation also requires the <strong>AccessOrigin</strong> parameter to specify the access source. For valid values, refer to the metric description of the DescribeVerifyContent operation.</li>
     * <li><strong>ICP filing</strong>: If <strong>AccessType</strong> is set to <strong>share</strong> (CNAME access) or <strong>hybrid_cloud_cname</strong> (hybrid cloud CNAME access) with public cloud disaster recovery enabled, and the domain name is added to Website Config in a region in the Chinese mainland, the domain name must have a valid ICP filing.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * @param request the request parameters of CreateHybridCloudCluster  CreateHybridCloudClusterRequest
     * @return CreateHybridCloudClusterResponse
     */
    CompletableFuture<CreateHybridCloudClusterResponse> createHybridCloudCluster(CreateHybridCloudClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud parameter in the response is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of CreateHybridCloudClusterRule  CreateHybridCloudClusterRuleRequest
     * @return CreateHybridCloudClusterRuleResponse
     */
    CompletableFuture<CreateHybridCloudClusterRuleResponse> createHybridCloudClusterRule(CreateHybridCloudClusterRuleRequest request);

    /**
     * @param request the request parameters of CreateHybridCloudGroup  CreateHybridCloudGroupRequest
     * @return CreateHybridCloudGroupResponse
     */
    CompletableFuture<CreateHybridCloudGroupResponse> createHybridCloudGroup(CreateHybridCloudGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the WAF instance has hybrid cloud extension nodes purchased. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the value of the Details.HybridCloudNodeExtend response parameter is greater than 0, hybrid cloud extension nodes have been purchased. If not, log on to the WAF console and upgrade the instance to purchase hybrid cloud extension nodes.</p>
     * 
     * @param request the request parameters of CreateLogDeliveryConfig  CreateLogDeliveryConfigRequest
     * @return CreateLogDeliveryConfigResponse
     */
    CompletableFuture<CreateLogDeliveryConfigResponse> createLogDeliveryConfig(CreateLogDeliveryConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance supports critical event protection. Critical event protection requires a separate upgrade purchase. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the response parameter Details.MajorProtection is true, the instance supports critical event protection. If not, upgrade the instance to enable critical event protection.</p>
     * 
     * @param request the request parameters of CreateMajorProtectionBlackIp  CreateMajorProtectionBlackIpRequest
     * @return CreateMajorProtectionBlackIpResponse
     */
    CompletableFuture<CreateMajorProtectionBlackIpResponse> createMajorProtectionBlackIp(CreateMajorProtectionBlackIpRequest request);

    /**
     * <b>description</b> :
     * <p>Before invoking this operation, ensure that the WAF instance supports multi-account management and that the current calling account is configured as a WAF delegated administrator. Invoke the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned Details.ResourceDirectory parameter is true, the instance supports multi-account management. If not, upgrade the instance to enable multi-account management. Invoke the <a href="https://help.aliyun.com/document_detail/2716807.html">DescribeAccountDelegatedStatus</a> operation to check whether the current account is a WAF delegated administrator. If not, refer to the <a href="https://help.aliyun.com/document_detail/2709681.html">Multi-account management feature</a> folder to configure a WAF delegated administrator in the resource directory first.</p>
     * 
     * @param request the request parameters of CreateMemberAccounts  CreateMemberAccountsRequest
     * @return CreateMemberAccountsResponse
     */
    CompletableFuture<CreateMemberAccountsResponse> createMemberAccounts(CreateMemberAccountsRequest request);

    /**
     * @param request the request parameters of CreatePocFunction  CreatePocFunctionRequest
     * @return CreatePocFunctionResponse
     */
    CompletableFuture<CreatePocFunctionResponse> createPocFunction(CreatePocFunctionRequest request);

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can have only one WAF instance in the same region (the Chinese mainland or outside the Chinese mainland). Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to check whether a WAF instance already exists in the region specified by <strong>RegionId</strong>. If a pay-as-you-go instance already exists, call the <a href="https://help.aliyun.com/document_detail/2834183.html">ReleaseInstance</a> operation to release it. If a subscription instance already exists, unsubscribe from it in the WAF console. You can create a new pay-as-you-go instance only after the existing instance is released or unsubscribed.</p>
     * 
     * @param request the request parameters of CreatePostpaidInstance  CreatePostpaidInstanceRequest
     * @return CreatePostpaidInstanceResponse
     */
    CompletableFuture<CreatePostpaidInstanceResponse> createPostpaidInstance(CreatePostpaidInstanceRequest request);

    /**
     * @param request the request parameters of CreateSM2Cert  CreateSM2CertRequest
     * @return CreateSM2CertResponse
     */
    CompletableFuture<CreateSM2CertResponse> createSM2Cert(CreateSM2CertRequest request);

    /**
     * @param request the request parameters of DeleteAddress  DeleteAddressRequest
     * @return DeleteAddressResponse
     */
    CompletableFuture<DeleteAddressResponse> deleteAddress(DeleteAddressRequest request);

    /**
     * @param request the request parameters of DeleteApisecAbnormals  DeleteApisecAbnormalsRequest
     * @return DeleteApisecAbnormalsResponse
     */
    CompletableFuture<DeleteApisecAbnormalsResponse> deleteApisecAbnormals(DeleteApisecAbnormalsRequest request);

    /**
     * @param request the request parameters of DeleteApisecEvents  DeleteApisecEventsRequest
     * @return DeleteApisecEventsResponse
     */
    CompletableFuture<DeleteApisecEventsResponse> deleteApisecEvents(DeleteApisecEventsRequest request);

    /**
     * @param request the request parameters of DeleteCloudResource  DeleteCloudResourceRequest
     * @return DeleteCloudResourceResponse
     */
    CompletableFuture<DeleteCloudResourceResponse> deleteCloudResource(DeleteCloudResourceRequest request);

    /**
     * @param request the request parameters of DeleteCloudResourceExtensionCert  DeleteCloudResourceExtensionCertRequest
     * @return DeleteCloudResourceExtensionCertResponse
     */
    CompletableFuture<DeleteCloudResourceExtensionCertResponse> deleteCloudResourceExtensionCert(DeleteCloudResourceExtensionCertRequest request);

    /**
     * @param request the request parameters of DeleteDefenseResource  DeleteDefenseResourceRequest
     * @return DeleteDefenseResourceResponse
     */
    CompletableFuture<DeleteDefenseResourceResponse> deleteDefenseResource(DeleteDefenseResourceRequest request);

    /**
     * @param request the request parameters of DeleteDefenseResourceGroup  DeleteDefenseResourceGroupRequest
     * @return DeleteDefenseResourceGroupResponse
     */
    CompletableFuture<DeleteDefenseResourceGroupResponse> deleteDefenseResourceGroup(DeleteDefenseResourceGroupRequest request);

    /**
     * @param request the request parameters of DeleteDefenseRule  DeleteDefenseRuleRequest
     * @return DeleteDefenseRuleResponse
     */
    CompletableFuture<DeleteDefenseRuleResponse> deleteDefenseRule(DeleteDefenseRuleRequest request);

    /**
     * @param request the request parameters of DeleteDefenseRuleBlockIp  DeleteDefenseRuleBlockIpRequest
     * @return DeleteDefenseRuleBlockIpResponse
     */
    CompletableFuture<DeleteDefenseRuleBlockIpResponse> deleteDefenseRuleBlockIp(DeleteDefenseRuleBlockIpRequest request);

    /**
     * @param request the request parameters of DeleteDefenseTemplate  DeleteDefenseTemplateRequest
     * @return DeleteDefenseTemplateResponse
     */
    CompletableFuture<DeleteDefenseTemplateResponse> deleteDefenseTemplate(DeleteDefenseTemplateRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloud is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DeleteHybridCloudClusterRule  DeleteHybridCloudClusterRuleRequest
     * @return DeleteHybridCloudClusterRuleResponse
     */
    CompletableFuture<DeleteHybridCloudClusterRuleResponse> deleteHybridCloudClusterRule(DeleteHybridCloudClusterRuleRequest request);

    /**
     * @param request the request parameters of DeleteHybridCloudGroup  DeleteHybridCloudGroupRequest
     * @return DeleteHybridCloudGroupResponse
     */
    CompletableFuture<DeleteHybridCloudGroupResponse> deleteHybridCloudGroup(DeleteHybridCloudGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance has purchased hybrid cloud extension nodes. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloudNodeExtend is greater than 0, hybrid cloud extension nodes have been purchased. If not, log on to the WAF console and purchase hybrid cloud extension nodes by upgrading the instance.</p>
     * 
     * @param request the request parameters of DeleteLogDeliveryConfig  DeleteLogDeliveryConfigRequest
     * @return DeleteLogDeliveryConfigResponse
     */
    CompletableFuture<DeleteLogDeliveryConfigResponse> deleteLogDeliveryConfig(DeleteLogDeliveryConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance supports critical event protection. Critical event protection requires a separate upgrade purchase. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the response parameter Details.MajorProtection is true, the instance supports critical event protection. If not, upgrade the instance to enable critical event protection.</p>
     * 
     * @param request the request parameters of DeleteMajorProtectionBlackIp  DeleteMajorProtectionBlackIpRequest
     * @return DeleteMajorProtectionBlackIpResponse
     */
    CompletableFuture<DeleteMajorProtectionBlackIpResponse> deleteMajorProtectionBlackIp(DeleteMajorProtectionBlackIpRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance supports the multi-account management feature and that the current calling account is configured as a WAF delegated administrator. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.ResourceDirectory response parameter is true, the instance supports the multi-account management feature. If the instance does not support this feature, upgrade the instance to enable multi-account management. Call the <a href="https://help.aliyun.com/document_detail/2716807.html">DescribeAccountDelegatedStatus</a> operation to check whether the current account is a WAF delegated administrator. If not, refer to the <a href="https://help.aliyun.com/document_detail/2709681.html">Multi-account management</a> documentation to configure a WAF delegated administrator in the resource directory first.</p>
     * 
     * @param request the request parameters of DeleteMemberAccount  DeleteMemberAccountRequest
     * @return DeleteMemberAccountResponse
     */
    CompletableFuture<DeleteMemberAccountResponse> deleteMemberAccount(DeleteMemberAccountRequest request);

    /**
     * @param request the request parameters of DescribeAbnormalCloudResources  DescribeAbnormalCloudResourcesRequest
     * @return DescribeAbnormalCloudResourcesResponse
     */
    CompletableFuture<DescribeAbnormalCloudResourcesResponse> describeAbnormalCloudResources(DescribeAbnormalCloudResourcesRequest request);

    /**
     * @param request the request parameters of DescribeAccountDelegatedStatus  DescribeAccountDelegatedStatusRequest
     * @return DescribeAccountDelegatedStatusResponse
     */
    CompletableFuture<DescribeAccountDelegatedStatusResponse> describeAccountDelegatedStatus(DescribeAccountDelegatedStatusRequest request);

    /**
     * @param request the request parameters of DescribeAddresses  DescribeAddressesRequest
     * @return DescribeAddressesResponse
     */
    CompletableFuture<DescribeAddressesResponse> describeAddresses(DescribeAddressesRequest request);

    /**
     * @param request the request parameters of DescribeAlarmBanner  DescribeAlarmBannerRequest
     * @return DescribeAlarmBannerResponse
     */
    CompletableFuture<DescribeAlarmBannerResponse> describeAlarmBanner(DescribeAlarmBannerRequest request);

    /**
     * @param request the request parameters of DescribeAlarmList  DescribeAlarmListRequest
     * @return DescribeAlarmListResponse
     */
    CompletableFuture<DescribeAlarmListResponse> describeAlarmList(DescribeAlarmListRequest request);

    /**
     * @param request the request parameters of DescribeApiExports  DescribeApiExportsRequest
     * @return DescribeApiExportsResponse
     */
    CompletableFuture<DescribeApiExportsResponse> describeApiExports(DescribeApiExportsRequest request);

    /**
     * @param request the request parameters of DescribeApisecAbnormalDomainStatistic  DescribeApisecAbnormalDomainStatisticRequest
     * @return DescribeApisecAbnormalDomainStatisticResponse
     */
    CompletableFuture<DescribeApisecAbnormalDomainStatisticResponse> describeApisecAbnormalDomainStatistic(DescribeApisecAbnormalDomainStatisticRequest request);

    /**
     * @param request the request parameters of DescribeApisecAbnormals  DescribeApisecAbnormalsRequest
     * @return DescribeApisecAbnormalsResponse
     */
    CompletableFuture<DescribeApisecAbnormalsResponse> describeApisecAbnormals(DescribeApisecAbnormalsRequest request);

    /**
     * @param request the request parameters of DescribeApisecApiResources  DescribeApisecApiResourcesRequest
     * @return DescribeApisecApiResourcesResponse
     */
    CompletableFuture<DescribeApisecApiResourcesResponse> describeApisecApiResources(DescribeApisecApiResourcesRequest request);

    /**
     * @param request the request parameters of DescribeApisecAssetTrend  DescribeApisecAssetTrendRequest
     * @return DescribeApisecAssetTrendResponse
     */
    CompletableFuture<DescribeApisecAssetTrendResponse> describeApisecAssetTrend(DescribeApisecAssetTrendRequest request);

    /**
     * @param request the request parameters of DescribeApisecEventDetail  DescribeApisecEventDetailRequest
     * @return DescribeApisecEventDetailResponse
     */
    CompletableFuture<DescribeApisecEventDetailResponse> describeApisecEventDetail(DescribeApisecEventDetailRequest request);

    /**
     * @param request the request parameters of DescribeApisecEventDomainStatistic  DescribeApisecEventDomainStatisticRequest
     * @return DescribeApisecEventDomainStatisticResponse
     */
    CompletableFuture<DescribeApisecEventDomainStatisticResponse> describeApisecEventDomainStatistic(DescribeApisecEventDomainStatisticRequest request);

    /**
     * @param request the request parameters of DescribeApisecEvents  DescribeApisecEventsRequest
     * @return DescribeApisecEventsResponse
     */
    CompletableFuture<DescribeApisecEventsResponse> describeApisecEvents(DescribeApisecEventsRequest request);

    /**
     * @param request the request parameters of DescribeApisecExamples  DescribeApisecExamplesRequest
     * @return DescribeApisecExamplesResponse
     */
    CompletableFuture<DescribeApisecExamplesResponse> describeApisecExamples(DescribeApisecExamplesRequest request);

    /**
     * @param request the request parameters of DescribeApisecLogDeliveries  DescribeApisecLogDeliveriesRequest
     * @return DescribeApisecLogDeliveriesResponse
     */
    CompletableFuture<DescribeApisecLogDeliveriesResponse> describeApisecLogDeliveries(DescribeApisecLogDeliveriesRequest request);

    /**
     * @param request the request parameters of DescribeApisecMatchedHosts  DescribeApisecMatchedHostsRequest
     * @return DescribeApisecMatchedHostsResponse
     */
    CompletableFuture<DescribeApisecMatchedHostsResponse> describeApisecMatchedHosts(DescribeApisecMatchedHostsRequest request);

    /**
     * @param request the request parameters of DescribeApisecProtectionGroups  DescribeApisecProtectionGroupsRequest
     * @return DescribeApisecProtectionGroupsResponse
     */
    CompletableFuture<DescribeApisecProtectionGroupsResponse> describeApisecProtectionGroups(DescribeApisecProtectionGroupsRequest request);

    /**
     * @param request the request parameters of DescribeApisecProtectionResources  DescribeApisecProtectionResourcesRequest
     * @return DescribeApisecProtectionResourcesResponse
     */
    CompletableFuture<DescribeApisecProtectionResourcesResponse> describeApisecProtectionResources(DescribeApisecProtectionResourcesRequest request);

    /**
     * @param request the request parameters of DescribeApisecRules  DescribeApisecRulesRequest
     * @return DescribeApisecRulesResponse
     */
    CompletableFuture<DescribeApisecRulesResponse> describeApisecRules(DescribeApisecRulesRequest request);

    /**
     * @param request the request parameters of DescribeApisecSensitiveDomainStatistic  DescribeApisecSensitiveDomainStatisticRequest
     * @return DescribeApisecSensitiveDomainStatisticResponse
     */
    CompletableFuture<DescribeApisecSensitiveDomainStatisticResponse> describeApisecSensitiveDomainStatistic(DescribeApisecSensitiveDomainStatisticRequest request);

    /**
     * @param request the request parameters of DescribeApisecSlsLogStores  DescribeApisecSlsLogStoresRequest
     * @return DescribeApisecSlsLogStoresResponse
     */
    CompletableFuture<DescribeApisecSlsLogStoresResponse> describeApisecSlsLogStores(DescribeApisecSlsLogStoresRequest request);

    /**
     * @param request the request parameters of DescribeApisecSlsProjects  DescribeApisecSlsProjectsRequest
     * @return DescribeApisecSlsProjectsResponse
     */
    CompletableFuture<DescribeApisecSlsProjectsResponse> describeApisecSlsProjects(DescribeApisecSlsProjectsRequest request);

    /**
     * @param request the request parameters of DescribeApisecStatistics  DescribeApisecStatisticsRequest
     * @return DescribeApisecStatisticsResponse
     */
    CompletableFuture<DescribeApisecStatisticsResponse> describeApisecStatistics(DescribeApisecStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeApisecSuggestions  DescribeApisecSuggestionsRequest
     * @return DescribeApisecSuggestionsResponse
     */
    CompletableFuture<DescribeApisecSuggestionsResponse> describeApisecSuggestions(DescribeApisecSuggestionsRequest request);

    /**
     * @param request the request parameters of DescribeApisecUserOperations  DescribeApisecUserOperationsRequest
     * @return DescribeApisecUserOperationsResponse
     */
    CompletableFuture<DescribeApisecUserOperationsResponse> describeApisecUserOperations(DescribeApisecUserOperationsRequest request);

    /**
     * @param request the request parameters of DescribeBaseRuleChangeLog  DescribeBaseRuleChangeLogRequest
     * @return DescribeBaseRuleChangeLogResponse
     */
    CompletableFuture<DescribeBaseRuleChangeLogResponse> describeBaseRuleChangeLog(DescribeBaseRuleChangeLogRequest request);

    /**
     * @param request the request parameters of DescribeBaseSystemRules  DescribeBaseSystemRulesRequest
     * @return DescribeBaseSystemRulesResponse
     */
    CompletableFuture<DescribeBaseSystemRulesResponse> describeBaseSystemRules(DescribeBaseSystemRulesRequest request);

    /**
     * @param request the request parameters of DescribeBotAppKey  DescribeBotAppKeyRequest
     * @return DescribeBotAppKeyResponse
     */
    CompletableFuture<DescribeBotAppKeyResponse> describeBotAppKey(DescribeBotAppKeyRequest request);

    /**
     * @param request the request parameters of DescribeBotRuleLabels  DescribeBotRuleLabelsRequest
     * @return DescribeBotRuleLabelsResponse
     */
    CompletableFuture<DescribeBotRuleLabelsResponse> describeBotRuleLabels(DescribeBotRuleLabelsRequest request);

    /**
     * @param request the request parameters of DescribeCertDetail  DescribeCertDetailRequest
     * @return DescribeCertDetailResponse
     */
    CompletableFuture<DescribeCertDetailResponse> describeCertDetail(DescribeCertDetailRequest request);

    /**
     * @param request the request parameters of DescribeCerts  DescribeCertsRequest
     * @return DescribeCertsResponse
     */
    CompletableFuture<DescribeCertsResponse> describeCerts(DescribeCertsRequest request);

    /**
     * @param request the request parameters of DescribeChargeModule  DescribeChargeModuleRequest
     * @return DescribeChargeModuleResponse
     */
    CompletableFuture<DescribeChargeModuleResponse> describeChargeModule(DescribeChargeModuleRequest request);

    /**
     * @param request the request parameters of DescribeChargeResult  DescribeChargeResultRequest
     * @return DescribeChargeResultResponse
     */
    CompletableFuture<DescribeChargeResultResponse> describeChargeResult(DescribeChargeResultRequest request);

    /**
     * @param request the request parameters of DescribeCloudResourceAccessPortDetails  DescribeCloudResourceAccessPortDetailsRequest
     * @return DescribeCloudResourceAccessPortDetailsResponse
     */
    CompletableFuture<DescribeCloudResourceAccessPortDetailsResponse> describeCloudResourceAccessPortDetails(DescribeCloudResourceAccessPortDetailsRequest request);

    /**
     * @param request the request parameters of DescribeCloudResourceAccessedPorts  DescribeCloudResourceAccessedPortsRequest
     * @return DescribeCloudResourceAccessedPortsResponse
     */
    CompletableFuture<DescribeCloudResourceAccessedPortsResponse> describeCloudResourceAccessedPorts(DescribeCloudResourceAccessedPortsRequest request);

    /**
     * @param request the request parameters of DescribeCloudResourceList  DescribeCloudResourceListRequest
     * @return DescribeCloudResourceListResponse
     */
    CompletableFuture<DescribeCloudResourceListResponse> describeCloudResourceList(DescribeCloudResourceListRequest request);

    /**
     * @param request the request parameters of DescribeCloudResources  DescribeCloudResourcesRequest
     * @return DescribeCloudResourcesResponse
     */
    CompletableFuture<DescribeCloudResourcesResponse> describeCloudResources(DescribeCloudResourcesRequest request);

    /**
     * @param request the request parameters of DescribeCnameCount  DescribeCnameCountRequest
     * @return DescribeCnameCountResponse
     */
    CompletableFuture<DescribeCnameCountResponse> describeCnameCount(DescribeCnameCountRequest request);

    /**
     * @param request the request parameters of DescribeCommonLogFields  DescribeCommonLogFieldsRequest
     * @return DescribeCommonLogFieldsResponse
     */
    CompletableFuture<DescribeCommonLogFieldsResponse> describeCommonLogFields(DescribeCommonLogFieldsRequest request);

    /**
     * @param request the request parameters of DescribeCustomBaseRuleCompileResult  DescribeCustomBaseRuleCompileResultRequest
     * @return DescribeCustomBaseRuleCompileResultResponse
     */
    CompletableFuture<DescribeCustomBaseRuleCompileResultResponse> describeCustomBaseRuleCompileResult(DescribeCustomBaseRuleCompileResultRequest request);

    /**
     * @param request the request parameters of DescribeDDoSStatus  DescribeDDoSStatusRequest
     * @return DescribeDDoSStatusResponse
     */
    CompletableFuture<DescribeDDoSStatusResponse> describeDDoSStatus(DescribeDDoSStatusRequest request);

    /**
     * @param request the request parameters of DescribeDefaultHttps  DescribeDefaultHttpsRequest
     * @return DescribeDefaultHttpsResponse
     */
    CompletableFuture<DescribeDefaultHttpsResponse> describeDefaultHttps(DescribeDefaultHttpsRequest request);

    /**
     * @param request the request parameters of DescribeDefenseGroupValidResources  DescribeDefenseGroupValidResourcesRequest
     * @return DescribeDefenseGroupValidResourcesResponse
     */
    CompletableFuture<DescribeDefenseGroupValidResourcesResponse> describeDefenseGroupValidResources(DescribeDefenseGroupValidResourcesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResource  DescribeDefenseResourceRequest
     * @return DescribeDefenseResourceResponse
     */
    CompletableFuture<DescribeDefenseResourceResponse> describeDefenseResource(DescribeDefenseResourceRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceGroup  DescribeDefenseResourceGroupRequest
     * @return DescribeDefenseResourceGroupResponse
     */
    CompletableFuture<DescribeDefenseResourceGroupResponse> describeDefenseResourceGroup(DescribeDefenseResourceGroupRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceGroupNames  DescribeDefenseResourceGroupNamesRequest
     * @return DescribeDefenseResourceGroupNamesResponse
     */
    CompletableFuture<DescribeDefenseResourceGroupNamesResponse> describeDefenseResourceGroupNames(DescribeDefenseResourceGroupNamesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceGroups  DescribeDefenseResourceGroupsRequest
     * @return DescribeDefenseResourceGroupsResponse
     */
    CompletableFuture<DescribeDefenseResourceGroupsResponse> describeDefenseResourceGroups(DescribeDefenseResourceGroupsRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceNames  DescribeDefenseResourceNamesRequest
     * @return DescribeDefenseResourceNamesResponse
     */
    CompletableFuture<DescribeDefenseResourceNamesResponse> describeDefenseResourceNames(DescribeDefenseResourceNamesRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that a WAF instance already exists under the current Alibaba Cloud account. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the InstanceId parameter in the response has a value (in the format of waf_v2_public_cn********60f), the instance exists. If no instance exists, call the <a href="https://help.aliyun.com/document_detail/2773874.html">CreatePostpaidInstance</a> operation to create a pay-as-you-go instance, or log on to the WAF console to purchase an instance.</p>
     * 
     * @param request the request parameters of DescribeDefenseResourceOwnerUid  DescribeDefenseResourceOwnerUidRequest
     * @return DescribeDefenseResourceOwnerUidResponse
     */
    CompletableFuture<DescribeDefenseResourceOwnerUidResponse> describeDefenseResourceOwnerUid(DescribeDefenseResourceOwnerUidRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceTemplates  DescribeDefenseResourceTemplatesRequest
     * @return DescribeDefenseResourceTemplatesResponse
     */
    CompletableFuture<DescribeDefenseResourceTemplatesResponse> describeDefenseResourceTemplates(DescribeDefenseResourceTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResources  DescribeDefenseResourcesRequest
     * @return DescribeDefenseResourcesResponse
     */
    CompletableFuture<DescribeDefenseResourcesResponse> describeDefenseResources(DescribeDefenseResourcesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseRule  DescribeDefenseRuleRequest
     * @return DescribeDefenseRuleResponse
     */
    CompletableFuture<DescribeDefenseRuleResponse> describeDefenseRule(DescribeDefenseRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports querying rule statistics for protection templates under the new Bot Management (bot_manager) and new Web Core Protection (waf_base) scenarios.</p>
     * 
     * @param request the request parameters of DescribeDefenseRuleStatistics  DescribeDefenseRuleStatisticsRequest
     * @return DescribeDefenseRuleStatisticsResponse
     */
    CompletableFuture<DescribeDefenseRuleStatisticsResponse> describeDefenseRuleStatistics(DescribeDefenseRuleStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeDefenseRules  DescribeDefenseRulesRequest
     * @return DescribeDefenseRulesResponse
     */
    CompletableFuture<DescribeDefenseRulesResponse> describeDefenseRules(DescribeDefenseRulesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseSceneConfig  DescribeDefenseSceneConfigRequest
     * @return DescribeDefenseSceneConfigResponse
     */
    CompletableFuture<DescribeDefenseSceneConfigResponse> describeDefenseSceneConfig(DescribeDefenseSceneConfigRequest request);

    /**
     * @param request the request parameters of DescribeDefenseTemplate  DescribeDefenseTemplateRequest
     * @return DescribeDefenseTemplateResponse
     */
    CompletableFuture<DescribeDefenseTemplateResponse> describeDefenseTemplate(DescribeDefenseTemplateRequest request);

    /**
     * @param request the request parameters of DescribeDefenseTemplateValidGroups  DescribeDefenseTemplateValidGroupsRequest
     * @return DescribeDefenseTemplateValidGroupsResponse
     */
    CompletableFuture<DescribeDefenseTemplateValidGroupsResponse> describeDefenseTemplateValidGroups(DescribeDefenseTemplateValidGroupsRequest request);

    /**
     * @param request the request parameters of DescribeDefenseTemplateValidResources  DescribeDefenseTemplateValidResourcesRequest
     * @return DescribeDefenseTemplateValidResourcesResponse
     */
    CompletableFuture<DescribeDefenseTemplateValidResourcesResponse> describeDefenseTemplateValidResources(DescribeDefenseTemplateValidResourcesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseTemplates  DescribeDefenseTemplatesRequest
     * @return DescribeDefenseTemplatesResponse
     */
    CompletableFuture<DescribeDefenseTemplatesResponse> describeDefenseTemplates(DescribeDefenseTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeDomainDNSRecord  DescribeDomainDNSRecordRequest
     * @return DescribeDomainDNSRecordResponse
     */
    CompletableFuture<DescribeDomainDNSRecordResponse> describeDomainDNSRecord(DescribeDomainDNSRecordRequest request);

    /**
     * @param request the request parameters of DescribeDomainDetail  DescribeDomainDetailRequest
     * @return DescribeDomainDetailResponse
     */
    CompletableFuture<DescribeDomainDetailResponse> describeDomainDetail(DescribeDomainDetailRequest request);

    /**
     * @param request the request parameters of DescribeDomainUsedPorts  DescribeDomainUsedPortsRequest
     * @return DescribeDomainUsedPortsResponse
     */
    CompletableFuture<DescribeDomainUsedPortsResponse> describeDomainUsedPorts(DescribeDomainUsedPortsRequest request);

    /**
     * @param request the request parameters of DescribeDomains  DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    /**
     * @param request the request parameters of DescribeElasticBills  DescribeElasticBillsRequest
     * @return DescribeElasticBillsResponse
     */
    CompletableFuture<DescribeElasticBillsResponse> describeElasticBills(DescribeElasticBillsRequest request);

    /**
     * @param request the request parameters of DescribeFlowChart  DescribeFlowChartRequest
     * @return DescribeFlowChartResponse
     */
    CompletableFuture<DescribeFlowChartResponse> describeFlowChart(DescribeFlowChartRequest request);

    /**
     * @param request the request parameters of DescribeFlowTopResource  DescribeFlowTopResourceRequest
     * @return DescribeFlowTopResourceResponse
     */
    CompletableFuture<DescribeFlowTopResourceResponse> describeFlowTopResource(DescribeFlowTopResourceRequest request);

    /**
     * @param request the request parameters of DescribeFlowTopUrl  DescribeFlowTopUrlRequest
     * @return DescribeFlowTopUrlResponse
     */
    CompletableFuture<DescribeFlowTopUrlResponse> describeFlowTopUrl(DescribeFlowTopUrlRequest request);

    /**
     * @param request the request parameters of DescribeFreeUserAssetCount  DescribeFreeUserAssetCountRequest
     * @return DescribeFreeUserAssetCountResponse
     */
    CompletableFuture<DescribeFreeUserAssetCountResponse> describeFreeUserAssetCount(DescribeFreeUserAssetCountRequest request);

    /**
     * @param request the request parameters of DescribeFreeUserEventCount  DescribeFreeUserEventCountRequest
     * @return DescribeFreeUserEventCountResponse
     */
    CompletableFuture<DescribeFreeUserEventCountResponse> describeFreeUserEventCount(DescribeFreeUserEventCountRequest request);

    /**
     * @param request the request parameters of DescribeFreeUserEventTypes  DescribeFreeUserEventTypesRequest
     * @return DescribeFreeUserEventTypesResponse
     */
    CompletableFuture<DescribeFreeUserEventTypesResponse> describeFreeUserEventTypes(DescribeFreeUserEventTypesRequest request);

    /**
     * @param request the request parameters of DescribeFreeUserEvents  DescribeFreeUserEventsRequest
     * @return DescribeFreeUserEventsResponse
     */
    CompletableFuture<DescribeFreeUserEventsResponse> describeFreeUserEvents(DescribeFreeUserEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for your WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud response parameter is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudBasicMonitor  DescribeHybridCloudBasicMonitorRequest
     * @return DescribeHybridCloudBasicMonitorResponse
     */
    CompletableFuture<DescribeHybridCloudBasicMonitorResponse> describeHybridCloudBasicMonitor(DescribeHybridCloudBasicMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloud is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudClusterRule  DescribeHybridCloudClusterRuleRequest
     * @return DescribeHybridCloudClusterRuleResponse
     */
    CompletableFuture<DescribeHybridCloudClusterRuleResponse> describeHybridCloudClusterRule(DescribeHybridCloudClusterRuleRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudClusterRules  DescribeHybridCloudClusterRulesRequest
     * @return DescribeHybridCloudClusterRulesResponse
     */
    CompletableFuture<DescribeHybridCloudClusterRulesResponse> describeHybridCloudClusterRules(DescribeHybridCloudClusterRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud response parameter is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudClusterServers  DescribeHybridCloudClusterServersRequest
     * @return DescribeHybridCloudClusterServersResponse
     */
    CompletableFuture<DescribeHybridCloudClusterServersResponse> describeHybridCloudClusterServers(DescribeHybridCloudClusterServersRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudClusters  DescribeHybridCloudClustersRequest
     * @return DescribeHybridCloudClustersResponse
     */
    CompletableFuture<DescribeHybridCloudClustersResponse> describeHybridCloudClusters(DescribeHybridCloudClustersRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned Details.HybridCloud parameter is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudGroups  DescribeHybridCloudGroupsRequest
     * @return DescribeHybridCloudGroupsResponse
     */
    CompletableFuture<DescribeHybridCloudGroupsResponse> describeHybridCloudGroups(DescribeHybridCloudGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloud is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudProcessMonitor  DescribeHybridCloudProcessMonitorRequest
     * @return DescribeHybridCloudProcessMonitorResponse
     */
    CompletableFuture<DescribeHybridCloudProcessMonitorResponse> describeHybridCloudProcessMonitor(DescribeHybridCloudProcessMonitorRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudProtectableCount  DescribeHybridCloudProtectableCountRequest
     * @return DescribeHybridCloudProtectableCountResponse
     */
    CompletableFuture<DescribeHybridCloudProtectableCountResponse> describeHybridCloudProtectableCount(DescribeHybridCloudProtectableCountRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudResourceDetail  DescribeHybridCloudResourceDetailRequest
     * @return DescribeHybridCloudResourceDetailResponse
     */
    CompletableFuture<DescribeHybridCloudResourceDetailResponse> describeHybridCloudResourceDetail(DescribeHybridCloudResourceDetailRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudResources  DescribeHybridCloudResourcesRequest
     * @return DescribeHybridCloudResourcesResponse
     */
    CompletableFuture<DescribeHybridCloudResourcesResponse> describeHybridCloudResources(DescribeHybridCloudResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloud is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudSdkServers  DescribeHybridCloudSdkServersRequest
     * @return DescribeHybridCloudSdkServersResponse
     */
    CompletableFuture<DescribeHybridCloudSdkServersResponse> describeHybridCloudSdkServers(DescribeHybridCloudSdkServersRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloud is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudServerRegions  DescribeHybridCloudServerRegionsRequest
     * @return DescribeHybridCloudServerRegionsResponse
     */
    CompletableFuture<DescribeHybridCloudServerRegionsResponse> describeHybridCloudServerRegions(DescribeHybridCloudServerRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloud is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudSupportRegions  DescribeHybridCloudSupportRegionsRequest
     * @return DescribeHybridCloudSupportRegionsResponse
     */
    CompletableFuture<DescribeHybridCloudSupportRegionsResponse> describeHybridCloudSupportRegions(DescribeHybridCloudSupportRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud parameter in the response is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudUnassignedMachines  DescribeHybridCloudUnassignedMachinesRequest
     * @return DescribeHybridCloudUnassignedMachinesResponse
     */
    CompletableFuture<DescribeHybridCloudUnassignedMachinesResponse> describeHybridCloudUnassignedMachines(DescribeHybridCloudUnassignedMachinesRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudUnsupportPorts  DescribeHybridCloudUnsupportPortsRequest
     * @return DescribeHybridCloudUnsupportPortsResponse
     */
    CompletableFuture<DescribeHybridCloudUnsupportPortsResponse> describeHybridCloudUnsupportPorts(DescribeHybridCloudUnsupportPortsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud parameter in the response is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of DescribeHybridCloudUser  DescribeHybridCloudUserRequest
     * @return DescribeHybridCloudUserResponse
     */
    CompletableFuture<DescribeHybridCloudUserResponse> describeHybridCloudUser(DescribeHybridCloudUserRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeIpAbroadCountryInfos  DescribeIpAbroadCountryInfosRequest
     * @return DescribeIpAbroadCountryInfosResponse
     */
    CompletableFuture<DescribeIpAbroadCountryInfosResponse> describeIpAbroadCountryInfos(DescribeIpAbroadCountryInfosRequest request);

    /**
     * @param request the request parameters of DescribeLogDeliveryConfig  DescribeLogDeliveryConfigRequest
     * @return DescribeLogDeliveryConfigResponse
     */
    CompletableFuture<DescribeLogDeliveryConfigResponse> describeLogDeliveryConfig(DescribeLogDeliveryConfigRequest request);

    /**
     * @param request the request parameters of DescribeLogDeliveryConfigs  DescribeLogDeliveryConfigsRequest
     * @return DescribeLogDeliveryConfigsResponse
     */
    CompletableFuture<DescribeLogDeliveryConfigsResponse> describeLogDeliveryConfigs(DescribeLogDeliveryConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance supports critical event protection. Critical event protection requires a separate upgrade purchase. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the response parameter Details.MajorProtection is true, the instance supports critical event protection. If not, upgrade the instance to enable critical event protection.</p>
     * 
     * @param request the request parameters of DescribeMajorProtectionBlackIps  DescribeMajorProtectionBlackIpsRequest
     * @return DescribeMajorProtectionBlackIpsResponse
     */
    CompletableFuture<DescribeMajorProtectionBlackIpsResponse> describeMajorProtectionBlackIps(DescribeMajorProtectionBlackIpsRequest request);

    /**
     * <b>description</b> :
     * <p>Before invoking this operation, make sure that the WAF instance supports the multi-account management feature and that the current calling account is configured as a WAF delegated administrator. Invoke the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned Details.ResourceDirectory parameter is true, the instance supports the multi-account management feature. If not, upgrade the instance to enable the multi-account management feature. Invoke the <a href="https://help.aliyun.com/document_detail/2716807.html">DescribeAccountDelegatedStatus</a> operation to check whether the current account is a WAF delegated administrator. If not, refer to the <a href="https://help.aliyun.com/document_detail/2709681.html">Multi-account management feature</a> documentation to configure a WAF delegated administrator in the resource folder.</p>
     * 
     * @param request the request parameters of DescribeMemberAccounts  DescribeMemberAccountsRequest
     * @return DescribeMemberAccountsResponse
     */
    CompletableFuture<DescribeMemberAccountsResponse> describeMemberAccounts(DescribeMemberAccountsRequest request);

    /**
     * @param request the request parameters of DescribeNetworkFlowTimeSeriesMetric  DescribeNetworkFlowTimeSeriesMetricRequest
     * @return DescribeNetworkFlowTimeSeriesMetricResponse
     */
    CompletableFuture<DescribeNetworkFlowTimeSeriesMetricResponse> describeNetworkFlowTimeSeriesMetric(DescribeNetworkFlowTimeSeriesMetricRequest request);

    /**
     * @param request the request parameters of DescribeNetworkFlowTopNMetric  DescribeNetworkFlowTopNMetricRequest
     * @return DescribeNetworkFlowTopNMetricResponse
     */
    CompletableFuture<DescribeNetworkFlowTopNMetricResponse> describeNetworkFlowTopNMetric(DescribeNetworkFlowTopNMetricRequest request);

    /**
     * @param request the request parameters of DescribePauseProtectionStatus  DescribePauseProtectionStatusRequest
     * @return DescribePauseProtectionStatusResponse
     */
    CompletableFuture<DescribePauseProtectionStatusResponse> describePauseProtectionStatus(DescribePauseProtectionStatusRequest request);

    /**
     * @param request the request parameters of DescribePeakTrend  DescribePeakTrendRequest
     * @return DescribePeakTrendResponse
     */
    CompletableFuture<DescribePeakTrendResponse> describePeakTrend(DescribePeakTrendRequest request);

    /**
     * @param request the request parameters of DescribePocFunctions  DescribePocFunctionsRequest
     * @return DescribePocFunctionsResponse
     */
    CompletableFuture<DescribePocFunctionsResponse> describePocFunctions(DescribePocFunctionsRequest request);

    /**
     * @param request the request parameters of DescribePostpayBills  DescribePostpayBillsRequest
     * @return DescribePostpayBillsResponse
     */
    CompletableFuture<DescribePostpayBillsResponse> describePostpayBills(DescribePostpayBillsRequest request);

    /**
     * @param request the request parameters of DescribePrepayDailyBills  DescribePrepayDailyBillsRequest
     * @return DescribePrepayDailyBillsResponse
     */
    CompletableFuture<DescribePrepayDailyBillsResponse> describePrepayDailyBills(DescribePrepayDailyBillsRequest request);

    /**
     * @param request the request parameters of DescribeProductInstances  DescribeProductInstancesRequest
     * @return DescribeProductInstancesResponse
     */
    CompletableFuture<DescribeProductInstancesResponse> describeProductInstances(DescribeProductInstancesRequest request);

    /**
     * @param request the request parameters of DescribePunishedDomains  DescribePunishedDomainsRequest
     * @return DescribePunishedDomainsResponse
     */
    CompletableFuture<DescribePunishedDomainsResponse> describePunishedDomains(DescribePunishedDomainsRequest request);

    /**
     * @param request the request parameters of DescribeRelatedDefenseRules  DescribeRelatedDefenseRulesRequest
     * @return DescribeRelatedDefenseRulesResponse
     */
    CompletableFuture<DescribeRelatedDefenseRulesResponse> describeRelatedDefenseRules(DescribeRelatedDefenseRulesRequest request);

    /**
     * @param request the request parameters of DescribeResourceInstanceCerts  DescribeResourceInstanceCertsRequest
     * @return DescribeResourceInstanceCertsResponse
     */
    CompletableFuture<DescribeResourceInstanceCertsResponse> describeResourceInstanceCerts(DescribeResourceInstanceCertsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance has hybrid cloud extension nodes purchased. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloudNodeExtend is greater than 0, hybrid cloud extension nodes have been purchased. If not, log on to the WAF console and upgrade the instance to purchase hybrid cloud extension nodes.</p>
     * 
     * @param request the request parameters of DescribeResourceLogDeliveryStatus  DescribeResourceLogDeliveryStatusRequest
     * @return DescribeResourceLogDeliveryStatusResponse
     */
    CompletableFuture<DescribeResourceLogDeliveryStatusResponse> describeResourceLogDeliveryStatus(DescribeResourceLogDeliveryStatusRequest request);

    /**
     * @param request the request parameters of DescribeResourceLogFieldConfig  DescribeResourceLogFieldConfigRequest
     * @return DescribeResourceLogFieldConfigResponse
     */
    CompletableFuture<DescribeResourceLogFieldConfigResponse> describeResourceLogFieldConfig(DescribeResourceLogFieldConfigRequest request);

    /**
     * @param request the request parameters of DescribeResourceLogStatus  DescribeResourceLogStatusRequest
     * @return DescribeResourceLogStatusResponse
     */
    CompletableFuture<DescribeResourceLogStatusResponse> describeResourceLogStatus(DescribeResourceLogStatusRequest request);

    /**
     * @param request the request parameters of DescribeResourcePort  DescribeResourcePortRequest
     * @return DescribeResourcePortResponse
     */
    CompletableFuture<DescribeResourcePortResponse> describeResourcePort(DescribeResourcePortRequest request);

    /**
     * @param request the request parameters of DescribeResourceRegionId  DescribeResourceRegionIdRequest
     * @return DescribeResourceRegionIdResponse
     */
    CompletableFuture<DescribeResourceRegionIdResponse> describeResourceRegionId(DescribeResourceRegionIdRequest request);

    /**
     * @param request the request parameters of DescribeResourceSupportRegions  DescribeResourceSupportRegionsRequest
     * @return DescribeResourceSupportRegionsResponse
     */
    CompletableFuture<DescribeResourceSupportRegionsResponse> describeResourceSupportRegions(DescribeResourceSupportRegionsRequest request);

    /**
     * @param request the request parameters of DescribeResponseCodeTrendGraph  DescribeResponseCodeTrendGraphRequest
     * @return DescribeResponseCodeTrendGraphResponse
     */
    CompletableFuture<DescribeResponseCodeTrendGraphResponse> describeResponseCodeTrendGraph(DescribeResponseCodeTrendGraphRequest request);

    /**
     * @param request the request parameters of DescribeRoleAuthStatus  DescribeRoleAuthStatusRequest
     * @return DescribeRoleAuthStatusResponse
     */
    CompletableFuture<DescribeRoleAuthStatusResponse> describeRoleAuthStatus(DescribeRoleAuthStatusRequest request);

    /**
     * @param request the request parameters of DescribeRuleGroups  DescribeRuleGroupsRequest
     * @return DescribeRuleGroupsResponse
     */
    CompletableFuture<DescribeRuleGroupsResponse> describeRuleGroups(DescribeRuleGroupsRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopClientIp  DescribeRuleHitsTopClientIpRequest
     * @return DescribeRuleHitsTopClientIpResponse
     */
    CompletableFuture<DescribeRuleHitsTopClientIpResponse> describeRuleHitsTopClientIp(DescribeRuleHitsTopClientIpRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopResource  DescribeRuleHitsTopResourceRequest
     * @return DescribeRuleHitsTopResourceResponse
     */
    CompletableFuture<DescribeRuleHitsTopResourceResponse> describeRuleHitsTopResource(DescribeRuleHitsTopResourceRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopRuleId  DescribeRuleHitsTopRuleIdRequest
     * @return DescribeRuleHitsTopRuleIdResponse
     */
    CompletableFuture<DescribeRuleHitsTopRuleIdResponse> describeRuleHitsTopRuleId(DescribeRuleHitsTopRuleIdRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopTuleType  DescribeRuleHitsTopTuleTypeRequest
     * @return DescribeRuleHitsTopTuleTypeResponse
     */
    CompletableFuture<DescribeRuleHitsTopTuleTypeResponse> describeRuleHitsTopTuleType(DescribeRuleHitsTopTuleTypeRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopUa  DescribeRuleHitsTopUaRequest
     * @return DescribeRuleHitsTopUaResponse
     */
    CompletableFuture<DescribeRuleHitsTopUaResponse> describeRuleHitsTopUa(DescribeRuleHitsTopUaRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopUrl  DescribeRuleHitsTopUrlRequest
     * @return DescribeRuleHitsTopUrlResponse
     */
    CompletableFuture<DescribeRuleHitsTopUrlResponse> describeRuleHitsTopUrl(DescribeRuleHitsTopUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to requests that hit a rule and are identified as threats. The following three types of requests are not included:</p>
     * <ul>
     * <li>Requests that hit a whitelist rule.</li>
     * <li>Requests that hit a bot rule whose action is set to Mark for Origin Fetch.</li>
     * <li>Requests that hit a rule whose action is set to Dynamic Token, Slider, Strict Slider, or JS Challenge, but are allowed because the user passed the verification.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityEventLogs  DescribeSecurityEventLogsRequest
     * @return DescribeSecurityEventLogsResponse
     */
    CompletableFuture<DescribeSecurityEventLogsResponse> describeSecurityEventLogs(DescribeSecurityEventLogsRequest request);

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to requests that hit a rule and are identified as a threat. The following data is excluded:</p>
     * <ul>
     * <li>Requests that hit a whitelist rule.</li>
     * <li>Requests that hit a bot rule where the rule action is &quot;Mark for origin fetch&quot;.</li>
     * <li>Requests that hit a rule with the action &quot;Dynamic Token&quot;, &quot;Slider&quot;, &quot;Strict Slider&quot;, or &quot;JS Challenge&quot;, but are allowed because the user passed the verification.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityEventTimeSeriesMetric  DescribeSecurityEventTimeSeriesMetricRequest
     * @return DescribeSecurityEventTimeSeriesMetricResponse
     */
    CompletableFuture<DescribeSecurityEventTimeSeriesMetricResponse> describeSecurityEventTimeSeriesMetric(DescribeSecurityEventTimeSeriesMetricRequest request);

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to requests that have rule hits and are identified as risky. The following three types of data are excluded:</p>
     * <ul>
     * <li>Requests that hit whitelist rules.</li>
     * <li>Requests that hit bot rules but whose rule action is set to &quot;back-to-origin marking&quot;.</li>
     * <li>Requests that hit rules with actions set to &quot;dynamic token&quot;, &quot;slider&quot;, &quot;strict slider&quot;, or &quot;JS authenticate&quot;, but the user passes the verification and the requests are allowed.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityEventTopNMetric  DescribeSecurityEventTopNMetricRequest
     * @return DescribeSecurityEventTopNMetricResponse
     */
    CompletableFuture<DescribeSecurityEventTopNMetricResponse> describeSecurityEventTopNMetric(DescribeSecurityEventTopNMetricRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveApiStatistic  DescribeSensitiveApiStatisticRequest
     * @return DescribeSensitiveApiStatisticResponse
     */
    CompletableFuture<DescribeSensitiveApiStatisticResponse> describeSensitiveApiStatistic(DescribeSensitiveApiStatisticRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveDetectionResult  DescribeSensitiveDetectionResultRequest
     * @return DescribeSensitiveDetectionResultResponse
     */
    CompletableFuture<DescribeSensitiveDetectionResultResponse> describeSensitiveDetectionResult(DescribeSensitiveDetectionResultRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveOutboundDistribution  DescribeSensitiveOutboundDistributionRequest
     * @return DescribeSensitiveOutboundDistributionResponse
     */
    CompletableFuture<DescribeSensitiveOutboundDistributionResponse> describeSensitiveOutboundDistribution(DescribeSensitiveOutboundDistributionRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveOutboundStatistic  DescribeSensitiveOutboundStatisticRequest
     * @return DescribeSensitiveOutboundStatisticResponse
     */
    CompletableFuture<DescribeSensitiveOutboundStatisticResponse> describeSensitiveOutboundStatistic(DescribeSensitiveOutboundStatisticRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveOutboundTrend  DescribeSensitiveOutboundTrendRequest
     * @return DescribeSensitiveOutboundTrendResponse
     */
    CompletableFuture<DescribeSensitiveOutboundTrendResponse> describeSensitiveOutboundTrend(DescribeSensitiveOutboundTrendRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveRequestLog  DescribeSensitiveRequestLogRequest
     * @return DescribeSensitiveRequestLogResponse
     */
    CompletableFuture<DescribeSensitiveRequestLogResponse> describeSensitiveRequestLog(DescribeSensitiveRequestLogRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveRequests  DescribeSensitiveRequestsRequest
     * @return DescribeSensitiveRequestsResponse
     */
    CompletableFuture<DescribeSensitiveRequestsResponse> describeSensitiveRequests(DescribeSensitiveRequestsRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveStatistic  DescribeSensitiveStatisticRequest
     * @return DescribeSensitiveStatisticResponse
     */
    CompletableFuture<DescribeSensitiveStatisticResponse> describeSensitiveStatistic(DescribeSensitiveStatisticRequest request);

    /**
     * @param request the request parameters of DescribeSlsAuthStatus  DescribeSlsAuthStatusRequest
     * @return DescribeSlsAuthStatusResponse
     */
    CompletableFuture<DescribeSlsAuthStatusResponse> describeSlsAuthStatus(DescribeSlsAuthStatusRequest request);

    /**
     * @param request the request parameters of DescribeSlsLogStore  DescribeSlsLogStoreRequest
     * @return DescribeSlsLogStoreResponse
     */
    CompletableFuture<DescribeSlsLogStoreResponse> describeSlsLogStore(DescribeSlsLogStoreRequest request);

    /**
     * @param request the request parameters of DescribeSlsLogStoreStatus  DescribeSlsLogStoreStatusRequest
     * @return DescribeSlsLogStoreStatusResponse
     */
    CompletableFuture<DescribeSlsLogStoreStatusResponse> describeSlsLogStoreStatus(DescribeSlsLogStoreStatusRequest request);

    /**
     * @param request the request parameters of DescribeTemplateResourceCount  DescribeTemplateResourceCountRequest
     * @return DescribeTemplateResourceCountResponse
     */
    CompletableFuture<DescribeTemplateResourceCountResponse> describeTemplateResourceCount(DescribeTemplateResourceCountRequest request);

    /**
     * @param request the request parameters of DescribeTemplateResources  DescribeTemplateResourcesRequest
     * @return DescribeTemplateResourcesResponse
     */
    CompletableFuture<DescribeTemplateResourcesResponse> describeTemplateResources(DescribeTemplateResourcesRequest request);

    /**
     * @param request the request parameters of DescribeThreatEvent  DescribeThreatEventRequest
     * @return DescribeThreatEventResponse
     */
    CompletableFuture<DescribeThreatEventResponse> describeThreatEvent(DescribeThreatEventRequest request);

    /**
     * @param request the request parameters of DescribeThreatEventDetail  DescribeThreatEventDetailRequest
     * @return DescribeThreatEventDetailResponse
     */
    CompletableFuture<DescribeThreatEventDetailResponse> describeThreatEventDetail(DescribeThreatEventDetailRequest request);

    /**
     * @param request the request parameters of DescribeThreatEventTopMetric  DescribeThreatEventTopMetricRequest
     * @return DescribeThreatEventTopMetricResponse
     */
    CompletableFuture<DescribeThreatEventTopMetricResponse> describeThreatEventTopMetric(DescribeThreatEventTopMetricRequest request);

    /**
     * @param request the request parameters of DescribeUserAbnormalTrend  DescribeUserAbnormalTrendRequest
     * @return DescribeUserAbnormalTrendResponse
     */
    CompletableFuture<DescribeUserAbnormalTrendResponse> describeUserAbnormalTrend(DescribeUserAbnormalTrendRequest request);

    /**
     * @param request the request parameters of DescribeUserAbnormalType  DescribeUserAbnormalTypeRequest
     * @return DescribeUserAbnormalTypeResponse
     */
    CompletableFuture<DescribeUserAbnormalTypeResponse> describeUserAbnormalType(DescribeUserAbnormalTypeRequest request);

    /**
     * @param request the request parameters of DescribeUserApiRequest  DescribeUserApiRequestRequest
     * @return DescribeUserApiRequestResponse
     */
    CompletableFuture<DescribeUserApiRequestResponse> describeUserApiRequest(DescribeUserApiRequestRequest request);

    /**
     * @param request the request parameters of DescribeUserAsset  DescribeUserAssetRequest
     * @return DescribeUserAssetResponse
     */
    CompletableFuture<DescribeUserAssetResponse> describeUserAsset(DescribeUserAssetRequest request);

    /**
     * @param request the request parameters of DescribeUserEventTrend  DescribeUserEventTrendRequest
     * @return DescribeUserEventTrendResponse
     */
    CompletableFuture<DescribeUserEventTrendResponse> describeUserEventTrend(DescribeUserEventTrendRequest request);

    /**
     * @param request the request parameters of DescribeUserEventType  DescribeUserEventTypeRequest
     * @return DescribeUserEventTypeResponse
     */
    CompletableFuture<DescribeUserEventTypeResponse> describeUserEventType(DescribeUserEventTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the log service is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.LogService response parameter is true, the log service is enabled. If the log service is not enabled, log on to the WAF console and upgrade the instance to enable the log service.</p>
     * 
     * @param request the request parameters of DescribeUserLogFieldConfig  DescribeUserLogFieldConfigRequest
     * @return DescribeUserLogFieldConfigResponse
     */
    CompletableFuture<DescribeUserLogFieldConfigResponse> describeUserLogFieldConfig(DescribeUserLogFieldConfigRequest request);

    /**
     * @param request the request parameters of DescribeUserSlsLogRegions  DescribeUserSlsLogRegionsRequest
     * @return DescribeUserSlsLogRegionsResponse
     */
    CompletableFuture<DescribeUserSlsLogRegionsResponse> describeUserSlsLogRegions(DescribeUserSlsLogRegionsRequest request);

    /**
     * @param request the request parameters of DescribeUserTraffic  DescribeUserTrafficRequest
     * @return DescribeUserTrafficResponse
     */
    CompletableFuture<DescribeUserTrafficResponse> describeUserTraffic(DescribeUserTrafficRequest request);

    /**
     * @param request the request parameters of DescribeUserWafLogStatus  DescribeUserWafLogStatusRequest
     * @return DescribeUserWafLogStatusResponse
     */
    CompletableFuture<DescribeUserWafLogStatusResponse> describeUserWafLogStatus(DescribeUserWafLogStatusRequest request);

    /**
     * @param request the request parameters of DescribeVerifyContent  DescribeVerifyContentRequest
     * @return DescribeVerifyContentResponse
     */
    CompletableFuture<DescribeVerifyContentResponse> describeVerifyContent(DescribeVerifyContentRequest request);

    /**
     * @param request the request parameters of DescribeVisitTopIp  DescribeVisitTopIpRequest
     * @return DescribeVisitTopIpResponse
     */
    CompletableFuture<DescribeVisitTopIpResponse> describeVisitTopIp(DescribeVisitTopIpRequest request);

    /**
     * @param request the request parameters of DescribeVisitUas  DescribeVisitUasRequest
     * @return DescribeVisitUasResponse
     */
    CompletableFuture<DescribeVisitUasResponse> describeVisitUas(DescribeVisitUasRequest request);

    /**
     * @param request the request parameters of DescribeWafSourceIpSegment  DescribeWafSourceIpSegmentRequest
     * @return DescribeWafSourceIpSegmentResponse
     */
    CompletableFuture<DescribeWafSourceIpSegmentResponse> describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request);

    /**
     * @param request the request parameters of InitializeWafOperationRole  InitializeWafOperationRoleRequest
     * @return InitializeWafOperationRoleResponse
     */
    CompletableFuture<InitializeWafOperationRoleResponse> initializeWafOperationRole(InitializeWafOperationRoleRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * @param request the request parameters of ModifyApisecAbnormals  ModifyApisecAbnormalsRequest
     * @return ModifyApisecAbnormalsResponse
     */
    CompletableFuture<ModifyApisecAbnormalsResponse> modifyApisecAbnormals(ModifyApisecAbnormalsRequest request);

    /**
     * @param request the request parameters of ModifyApisecApiResource  ModifyApisecApiResourceRequest
     * @return ModifyApisecApiResourceResponse
     */
    CompletableFuture<ModifyApisecApiResourceResponse> modifyApisecApiResource(ModifyApisecApiResourceRequest request);

    /**
     * @param request the request parameters of ModifyApisecEvents  ModifyApisecEventsRequest
     * @return ModifyApisecEventsResponse
     */
    CompletableFuture<ModifyApisecEventsResponse> modifyApisecEvents(ModifyApisecEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure that you have completed the following steps:</p>
     * <ol>
     * <li>Confirm that the API security feature is enabled. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the instance details. If the Details.AgenticApisec or Details.Apisec parameter in the response is true, the API security feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the API security feature.</li>
     * <li>Confirm that WAF is authorized to access cloud resources. You can call the <a href="https://help.aliyun.com/document_detail/2990717.html">DescribeRoleAuthStatus</a> operation to query the authorization status. If WAF is not authorized, call the <a href="https://help.aliyun.com/document_detail/2990727.html">InitializeWafOperationRole</a> operation to grant the authorization.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/2932936.html">DescribeApisecSlsProjects</a> and <a href="https://help.aliyun.com/document_detail/2932935.html">DescribeApisecSlsLogStores</a> operations to query available Simple Log Service (SLS) projects and Logstores.
     * After completing the preceding steps, call this operation to configure API security log delivery.</li>
     * </ol>
     * 
     * @param request the request parameters of ModifyApisecLogDelivery  ModifyApisecLogDeliveryRequest
     * @return ModifyApisecLogDeliveryResponse
     */
    CompletableFuture<ModifyApisecLogDeliveryResponse> modifyApisecLogDelivery(ModifyApisecLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke this operation, make sure that you have created an API security log delivery configuration by invoking the <a href="https://help.aliyun.com/document_detail/2932937.html">ModifyApisecLogDelivery</a> operation. If you have not created a delivery configuration, complete the following prerequisites:</p>
     * <ol>
     * <li>Confirm that the API security feature is enabled. Invoke the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the instance details. If the Details.AgenticApisec or Details.Apisec parameter in the response is true, the API security feature is enabled.</li>
     * <li>Confirm that WAF is authorized to access cloud resources. Invoke the <a href="https://help.aliyun.com/document_detail/2990717.html">DescribeRoleAuthStatus</a> operation to query the authorization status. If WAF is not authorized, invoke the <a href="https://help.aliyun.com/document_detail/2990727.html">InitializeWafOperationRole</a> operation to grant the authorization.</li>
     * <li>Invoke the <a href="https://help.aliyun.com/document_detail/2932936.html">DescribeApisecSlsProjects</a> and <a href="https://help.aliyun.com/document_detail/2932935.html">DescribeApisecSlsLogStores</a> operations to query active SLS projects and Logstores, and then invoke the <a href="https://help.aliyun.com/document_detail/2932937.html">ModifyApisecLogDelivery</a> operation to create a delivery configuration.
     * After you complete the preceding steps, invoke this operation to enable or disable the delivery status of API security logs.</li>
     * </ol>
     * 
     * @param request the request parameters of ModifyApisecLogDeliveryStatus  ModifyApisecLogDeliveryStatusRequest
     * @return ModifyApisecLogDeliveryStatusResponse
     */
    CompletableFuture<ModifyApisecLogDeliveryStatusResponse> modifyApisecLogDeliveryStatus(ModifyApisecLogDeliveryStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that protected objects or protected object groups already exist. For protected objects that have been added to WAF, call the <a href="https://help.aliyun.com/document_detail/461612.html">DescribeDefenseResources</a> operation to query their names. For created protected object groups, call the <a href="https://help.aliyun.com/document_detail/2773860.html">DescribeDefenseResourceGroups</a> operation to query them. If no protected object group has been created, call the <a href="https://help.aliyun.com/document_detail/461739.html">CreateDefenseResourceGroup</a> operation to create one first.</p>
     * 
     * @param request the request parameters of ModifyApisecModuleStatus  ModifyApisecModuleStatusRequest
     * @return ModifyApisecModuleStatusResponse
     */
    CompletableFuture<ModifyApisecModuleStatusResponse> modifyApisecModuleStatus(ModifyApisecModuleStatusRequest request);

    /**
     * @param request the request parameters of ModifyApisecStatus  ModifyApisecStatusRequest
     * @return ModifyApisecStatusResponse
     */
    CompletableFuture<ModifyApisecStatusResponse> modifyApisecStatus(ModifyApisecStatusRequest request);

    /**
     * @param request the request parameters of ModifyCloudResource  ModifyCloudResourceRequest
     * @return ModifyCloudResourceResponse
     */
    CompletableFuture<ModifyCloudResourceResponse> modifyCloudResource(ModifyCloudResourceRequest request);

    /**
     * @param request the request parameters of ModifyCloudResourceCert  ModifyCloudResourceCertRequest
     * @return ModifyCloudResourceCertResponse
     */
    CompletableFuture<ModifyCloudResourceCertResponse> modifyCloudResourceCert(ModifyCloudResourceCertRequest request);

    /**
     * @param request the request parameters of ModifyCloudResourceDefaultCert  ModifyCloudResourceDefaultCertRequest
     * @return ModifyCloudResourceDefaultCertResponse
     */
    CompletableFuture<ModifyCloudResourceDefaultCertResponse> modifyCloudResourceDefaultCert(ModifyCloudResourceDefaultCertRequest request);

    /**
     * @param request the request parameters of ModifyDefaultHttps  ModifyDefaultHttpsRequest
     * @return ModifyDefaultHttpsResponse
     */
    CompletableFuture<ModifyDefaultHttpsResponse> modifyDefaultHttps(ModifyDefaultHttpsRequest request);

    /**
     * @param request the request parameters of ModifyDefenseResourceGroup  ModifyDefenseResourceGroupRequest
     * @return ModifyDefenseResourceGroupResponse
     */
    CompletableFuture<ModifyDefenseResourceGroupResponse> modifyDefenseResourceGroup(ModifyDefenseResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke this operation, make sure that a protected object has been added to WAF. You can invoke the <a href="https://help.aliyun.com/document_detail/461413.html">CreateDomain</a> operation to create a CNAME-based resource, invoke the <a href="https://help.aliyun.com/document_detail/2839876.html">CreateCloudResource</a> operation to create a cloud native mode resource, or invoke the <a href="https://help.aliyun.com/document_detail/2930080.html">CreateDefenseResource</a> operation to create a custom protected object. You can invoke the <a href="https://help.aliyun.com/document_detail/461612.html">DescribeDefenseResources</a> operation to query the protected objects that have been added to WAF.</p>
     * 
     * @param request the request parameters of ModifyDefenseResourceXff  ModifyDefenseResourceXffRequest
     * @return ModifyDefenseResourceXffResponse
     */
    CompletableFuture<ModifyDefenseResourceXffResponse> modifyDefenseResourceXff(ModifyDefenseResourceXffRequest request);

    /**
     * @param request the request parameters of ModifyDefenseRule  ModifyDefenseRuleRequest
     * @return ModifyDefenseRuleResponse
     */
    CompletableFuture<ModifyDefenseRuleResponse> modifyDefenseRule(ModifyDefenseRuleRequest request);

    /**
     * @param request the request parameters of ModifyDefenseRuleCache  ModifyDefenseRuleCacheRequest
     * @return ModifyDefenseRuleCacheResponse
     */
    CompletableFuture<ModifyDefenseRuleCacheResponse> modifyDefenseRuleCache(ModifyDefenseRuleCacheRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you have created a protection rule by calling the <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a> operation.</p>
     * 
     * @param request the request parameters of ModifyDefenseRuleStatus  ModifyDefenseRuleStatusRequest
     * @return ModifyDefenseRuleStatusResponse
     */
    CompletableFuture<ModifyDefenseRuleStatusResponse> modifyDefenseRuleStatus(ModifyDefenseRuleStatusRequest request);

    /**
     * @param request the request parameters of ModifyDefenseSceneConfig  ModifyDefenseSceneConfigRequest
     * @return ModifyDefenseSceneConfigResponse
     */
    CompletableFuture<ModifyDefenseSceneConfigResponse> modifyDefenseSceneConfig(ModifyDefenseSceneConfigRequest request);

    /**
     * @param request the request parameters of ModifyDefenseTemplate  ModifyDefenseTemplateRequest
     * @return ModifyDefenseTemplateResponse
     */
    CompletableFuture<ModifyDefenseTemplateResponse> modifyDefenseTemplate(ModifyDefenseTemplateRequest request);

    /**
     * @param request the request parameters of ModifyDefenseTemplateStatus  ModifyDefenseTemplateStatusRequest
     * @return ModifyDefenseTemplateStatusResponse
     */
    CompletableFuture<ModifyDefenseTemplateStatusResponse> modifyDefenseTemplateStatus(ModifyDefenseTemplateStatusRequest request);

    /**
     * @param request the request parameters of ModifyDomain  ModifyDomainRequest
     * @return ModifyDomainResponse
     */
    CompletableFuture<ModifyDomainResponse> modifyDomain(ModifyDomainRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports modifying the certificate of a domain name that is added by using CNAME (<strong>AccessType</strong> is set to <strong>share</strong> or <strong>hybrid_cloud_cname</strong>). For domain names added in cloud native mode, call the <a href="https://help.aliyun.com/document_detail/2990691.html">ModifyCloudResourceCert</a> operation to modify the certificate.</p>
     * 
     * @param request the request parameters of ModifyDomainCert  ModifyDomainCertRequest
     * @return ModifyDomainCertResponse
     */
    CompletableFuture<ModifyDomainCertResponse> modifyDomainCert(ModifyDomainCertRequest request);

    /**
     * @param request the request parameters of ModifyDomainPunishStatus  ModifyDomainPunishStatusRequest
     * @return ModifyDomainPunishStatusResponse
     */
    CompletableFuture<ModifyDomainPunishStatusResponse> modifyDomainPunishStatus(ModifyDomainPunishStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the Web Application Firewall (WAF) instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud parameter in the response is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of ModifyHybridCloudCluster  ModifyHybridCloudClusterRequest
     * @return ModifyHybridCloudClusterResponse
     */
    CompletableFuture<ModifyHybridCloudClusterResponse> modifyHybridCloudCluster(ModifyHybridCloudClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud parameter in the response is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of ModifyHybridCloudClusterBypassStatus  ModifyHybridCloudClusterBypassStatusRequest
     * @return ModifyHybridCloudClusterBypassStatusResponse
     */
    CompletableFuture<ModifyHybridCloudClusterBypassStatusResponse> modifyHybridCloudClusterBypassStatus(ModifyHybridCloudClusterBypassStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud parameter in the response is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of ModifyHybridCloudClusterRule  ModifyHybridCloudClusterRuleRequest
     * @return ModifyHybridCloudClusterRuleResponse
     */
    CompletableFuture<ModifyHybridCloudClusterRuleResponse> modifyHybridCloudClusterRule(ModifyHybridCloudClusterRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned Details.HybridCloud parameter is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of ModifyHybridCloudGroup  ModifyHybridCloudGroupRequest
     * @return ModifyHybridCloudGroupResponse
     */
    CompletableFuture<ModifyHybridCloudGroupResponse> modifyHybridCloudGroup(ModifyHybridCloudGroupRequest request);

    /**
     * @param request the request parameters of ModifyHybridCloudGroupExpansionServer  ModifyHybridCloudGroupExpansionServerRequest
     * @return ModifyHybridCloudGroupExpansionServerResponse
     */
    CompletableFuture<ModifyHybridCloudGroupExpansionServerResponse> modifyHybridCloudGroupExpansionServer(ModifyHybridCloudGroupExpansionServerRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloud is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of ModifyHybridCloudGroupShrinkServer  ModifyHybridCloudGroupShrinkServerRequest
     * @return ModifyHybridCloudGroupShrinkServerResponse
     */
    CompletableFuture<ModifyHybridCloudGroupShrinkServerResponse> modifyHybridCloudGroupShrinkServer(ModifyHybridCloudGroupShrinkServerRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.HybridCloud response parameter is true, the hybrid cloud feature is enabled. If the feature is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of ModifyHybridCloudSdkPullinStatus  ModifyHybridCloudSdkPullinStatusRequest
     * @return ModifyHybridCloudSdkPullinStatusResponse
     */
    CompletableFuture<ModifyHybridCloudSdkPullinStatusResponse> modifyHybridCloudSdkPullinStatus(ModifyHybridCloudSdkPullinStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the hybrid cloud feature is enabled for the WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.HybridCloud is true, the hybrid cloud feature is enabled. If it is not enabled, log on to the WAF console and upgrade the instance to enable the hybrid cloud feature.</p>
     * 
     * @param request the request parameters of ModifyHybridCloudServer  ModifyHybridCloudServerRequest
     * @return ModifyHybridCloudServerResponse
     */
    CompletableFuture<ModifyHybridCloudServerResponse> modifyHybridCloudServer(ModifyHybridCloudServerRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance has purchased hybrid cloud extension nodes. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned Details.HybridCloudNodeExtend parameter is greater than 0, hybrid cloud extension nodes have been purchased. If not, log on to the WAF console and purchase hybrid cloud extension nodes by upgrading the instance.</p>
     * 
     * @param request the request parameters of ModifyLogDeliveryConfig  ModifyLogDeliveryConfigRequest
     * @return ModifyLogDeliveryConfigResponse
     */
    CompletableFuture<ModifyLogDeliveryConfigResponse> modifyLogDeliveryConfig(ModifyLogDeliveryConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the WAF instance supports critical event protection. Critical event protection requires a separate upgrade purchase. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned parameter Details.MajorProtection is true, the instance supports critical event protection. If not, upgrade the instance to enable critical event protection.</p>
     * 
     * @param request the request parameters of ModifyMajorProtectionBlackIp  ModifyMajorProtectionBlackIpRequest
     * @return ModifyMajorProtectionBlackIpResponse
     */
    CompletableFuture<ModifyMajorProtectionBlackIpResponse> modifyMajorProtectionBlackIp(ModifyMajorProtectionBlackIpRequest request);

    /**
     * <b>description</b> :
     * <p>Before invoking this operation, make sure that the WAF instance supports multi-account management and that the current calling account is configured as a WAF delegated administrator. You can invoke the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the returned Details.ResourceDirectory parameter is true, the instance supports multi-account management. If not supported, you can upgrade the instance to enable multi-account management. You can also invoke the <a href="https://help.aliyun.com/document_detail/2716807.html">DescribeAccountDelegatedStatus</a> operation to query whether the current account is a WAF delegated administrator. If not, refer to the <a href="https://help.aliyun.com/document_detail/2709681.html">multi-account management feature</a> documentation to configure a WAF delegated administrator in the resource folder first.</p>
     * 
     * @param request the request parameters of ModifyMemberAccount  ModifyMemberAccountRequest
     * @return ModifyMemberAccountResponse
     */
    CompletableFuture<ModifyMemberAccountResponse> modifyMemberAccount(ModifyMemberAccountRequest request);

    /**
     * @param request the request parameters of ModifyPauseProtectionStatus  ModifyPauseProtectionStatusRequest
     * @return ModifyPauseProtectionStatusResponse
     */
    CompletableFuture<ModifyPauseProtectionStatusResponse> modifyPauseProtectionStatus(ModifyPauseProtectionStatusRequest request);

    /**
     * @param request the request parameters of ModifyResourceLogDeliveryStatus  ModifyResourceLogDeliveryStatusRequest
     * @return ModifyResourceLogDeliveryStatusResponse
     */
    CompletableFuture<ModifyResourceLogDeliveryStatusResponse> modifyResourceLogDeliveryStatus(ModifyResourceLogDeliveryStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke this operation, make sure you have completed the following steps:</p>
     * <ol>
     * <li>Invoke the <a href="https://help.aliyun.com/document_detail/2773867.html">DescribeDefenseResourceNames</a> operation to obtain the names of created protected objects.</li>
     * <li>Invoke the <a href="https://help.aliyun.com/document_detail/461429.html">DescribeResourceLogStatus</a> operation to query the enabling status of logs for the protected object. If logging is not enabled, invoke the <a href="https://help.aliyun.com/document_detail/461427.html">ModifyResourceLogStatus</a> operation to enable logging (Status=true).
     * After completing the preceding steps, invoke this operation to modify the log field configuration of the protected object.</li>
     * </ol>
     * 
     * @param request the request parameters of ModifyResourceLogFieldConfig  ModifyResourceLogFieldConfigRequest
     * @return ModifyResourceLogFieldConfigResponse
     */
    CompletableFuture<ModifyResourceLogFieldConfigResponse> modifyResourceLogFieldConfig(ModifyResourceLogFieldConfigRequest request);

    /**
     * @param request the request parameters of ModifyResourceLogStatus  ModifyResourceLogStatusRequest
     * @return ModifyResourceLogStatusResponse
     */
    CompletableFuture<ModifyResourceLogStatusResponse> modifyResourceLogStatus(ModifyResourceLogStatusRequest request);

    /**
     * @param request the request parameters of ModifyTemplateResources  ModifyTemplateResourcesRequest
     * @return ModifyTemplateResourcesResponse
     */
    CompletableFuture<ModifyTemplateResourcesResponse> modifyTemplateResources(ModifyTemplateResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that the log service is activated for the WAF instance. Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance details. If the Details.LogService response parameter is true, the log service is activated. If the log service is not activated, log on to the WAF console and upgrade the instance to activate the log service.</p>
     * 
     * @param request the request parameters of ModifyUserLogFieldConfig  ModifyUserLogFieldConfigRequest
     * @return ModifyUserLogFieldConfigResponse
     */
    CompletableFuture<ModifyUserLogFieldConfigResponse> modifyUserLogFieldConfig(ModifyUserLogFieldConfigRequest request);

    /**
     * @param request the request parameters of ModifyUserWafLogStatus  ModifyUserWafLogStatusRequest
     * @return ModifyUserWafLogStatusResponse
     */
    CompletableFuture<ModifyUserWafLogStatusResponse> modifyUserWafLogStatus(ModifyUserWafLogStatusRequest request);

    /**
     * @param request the request parameters of ReCreateCloudResource  ReCreateCloudResourceRequest
     * @return ReCreateCloudResourceResponse
     */
    CompletableFuture<ReCreateCloudResourceResponse> reCreateCloudResource(ReCreateCloudResourceRequest request);

    /**
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation, the system performs the synchronization asynchronously. You can call the <a href="https://help.aliyun.com/document_detail/2743168.html">DescribeProductInstances</a> operation to query the synchronization result.</p>
     * 
     * @param request the request parameters of SyncProductInstance  SyncProductInstanceRequest
     * @return SyncProductInstanceResponse
     */
    CompletableFuture<SyncProductInstanceResponse> syncProductInstance(SyncProductInstanceRequest request);

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
     * @param request the request parameters of VerifyDomainOwner  VerifyDomainOwnerRequest
     * @return VerifyDomainOwnerResponse
     */
    CompletableFuture<VerifyDomainOwnerResponse> verifyDomainOwner(VerifyDomainOwnerRequest request);

}
