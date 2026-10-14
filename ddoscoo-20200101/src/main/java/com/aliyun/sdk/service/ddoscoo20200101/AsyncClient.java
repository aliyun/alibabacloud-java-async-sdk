// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddoscoo20200101.models.*;
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
     * <h3>QPS limit</h3>
     * <p>If you exceed the limit, your API calls are throttled, which may impact your business. To avoid throttling, call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of AddAutoCcBlacklist  AddAutoCcBlacklistRequest
     * @return AddAutoCcBlacklistResponse
     */
    CompletableFuture<AddAutoCcBlacklistResponse> addAutoCcBlacklist(AddAutoCcBlacklistRequest request);

    /**
     * <b>description</b> :
     * <p>This operation adds whitelist IP addresses for a single Anti-DDoS Pro or Anti-DDoS Premium instance so that the instance directly allows request traffic from the specified IP addresses.
     * After whitelist IP addresses are added, they are permanently valid by default. If you no longer need the whitelist IP addresses, invoke <a href="https://help.aliyun.com/document_detail/157505.html">EmptyAutoCcWhitelist</a> to clear the whitelist IP address list.</p>
     * <h3>QPS limit</h3>
     * <p>You can invoke this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Invoke this operation within the limit.</p>
     * 
     * @param request the request parameters of AddAutoCcWhitelist  AddAutoCcWhitelistRequest
     * @return AddAutoCcWhitelistResponse
     */
    CompletableFuture<AddAutoCcWhitelistResponse> addAutoCcWhitelist(AddAutoCcWhitelistRequest request);

    /**
     * @param request the request parameters of AssociateWebCert  AssociateWebCertRequest
     * @return AssociateWebCertResponse
     */
    CompletableFuture<AssociateWebCertResponse> associateWebCert(AssociateWebCertRequest request);

    /**
     * @param request the request parameters of AttachSceneDefenseObject  AttachSceneDefenseObjectRequest
     * @return AttachSceneDefenseObjectResponse
     */
    CompletableFuture<AttachSceneDefenseObjectResponse> attachSceneDefenseObject(AttachSceneDefenseObjectRequest request);

    /**
     * @param request the request parameters of ConfigDomainSecurityProfile  ConfigDomainSecurityProfileRequest
     * @return ConfigDomainSecurityProfileResponse
     */
    CompletableFuture<ConfigDomainSecurityProfileResponse> configDomainSecurityProfile(ConfigDomainSecurityProfileRequest request);

    /**
     * @param request the request parameters of ConfigL7GlobalRule  ConfigL7GlobalRuleRequest
     * @return ConfigL7GlobalRuleResponse
     */
    CompletableFuture<ConfigL7GlobalRuleResponse> configL7GlobalRule(ConfigL7GlobalRuleRequest request);

    /**
     * <b>description</b> :
     * <p>If a website that is added to Anti-DDoS Pro and Anti-DDoS Premium has multiple origin servers in the website configuration, you can modify the load balancing algorithm by configuring back-to-origin policies. The default algorithm is IP Hash. You can change it to polling or Least Time. For more information, see the description of the <strong>Policy</strong> request parameter.</p>
     * 
     * @param request the request parameters of ConfigL7RsPolicy  ConfigL7RsPolicyRequest
     * @return ConfigL7RsPolicyResponse
     */
    CompletableFuture<ConfigL7RsPolicyResponse> configL7RsPolicy(ConfigL7RsPolicyRequest request);

    /**
     * @param request the request parameters of ConfigL7UsKeepalive  ConfigL7UsKeepaliveRequest
     * @return ConfigL7UsKeepaliveResponse
     */
    CompletableFuture<ConfigL7UsKeepaliveResponse> configL7UsKeepalive(ConfigL7UsKeepaliveRequest request);

    /**
     * @param request the request parameters of ConfigLayer4RealLimit  ConfigLayer4RealLimitRequest
     * @return ConfigLayer4RealLimitResponse
     */
    CompletableFuture<ConfigLayer4RealLimitResponse> configLayer4RealLimit(ConfigLayer4RealLimitRequest request);

    /**
     * @param request the request parameters of ConfigLayer4Remark  ConfigLayer4RemarkRequest
     * @return ConfigLayer4RemarkResponse
     */
    CompletableFuture<ConfigLayer4RemarkResponse> configLayer4Remark(ConfigLayer4RemarkRequest request);

    /**
     * @param request the request parameters of ConfigLayer4RuleBakMode  ConfigLayer4RuleBakModeRequest
     * @return ConfigLayer4RuleBakModeResponse
     */
    CompletableFuture<ConfigLayer4RuleBakModeResponse> configLayer4RuleBakMode(ConfigLayer4RuleBakModeRequest request);

    /**
     * @param request the request parameters of ConfigLayer4RulePolicy  ConfigLayer4RulePolicyRequest
     * @return ConfigLayer4RulePolicyResponse
     */
    CompletableFuture<ConfigLayer4RulePolicyResponse> configLayer4RulePolicy(ConfigLayer4RulePolicyRequest request);

    /**
     * @param request the request parameters of ConfigNetworkRegionBlock  ConfigNetworkRegionBlockRequest
     * @return ConfigNetworkRegionBlockResponse
     */
    CompletableFuture<ConfigNetworkRegionBlockResponse> configNetworkRegionBlock(ConfigNetworkRegionBlockRequest request);

    /**
     * @param request the request parameters of ConfigNetworkRules  ConfigNetworkRulesRequest
     * @return ConfigNetworkRulesResponse
     */
    CompletableFuture<ConfigNetworkRulesResponse> configNetworkRules(ConfigNetworkRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation adds a UDP reflection attack attack prevention protection policy for an Anti-DDoS Pro or Anti-DDoS Premium instance to filter specified reflection source ports.</p>
     * <h3>QPS limit</h3>
     * <p>You can invoke this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Invoke this operation as needed.</p>
     * 
     * @param request the request parameters of ConfigUdpReflect  ConfigUdpReflectRequest
     * @return ConfigUdpReflectResponse
     */
    CompletableFuture<ConfigUdpReflectResponse> configUdpReflect(ConfigUdpReflectRequest request);

    /**
     * @param request the request parameters of ConfigWebCCRuleV2  ConfigWebCCRuleV2Request
     * @return ConfigWebCCRuleV2Response
     */
    CompletableFuture<ConfigWebCCRuleV2Response> configWebCCRuleV2(ConfigWebCCRuleV2Request request);

    /**
     * @param request the request parameters of ConfigWebCCTemplate  ConfigWebCCTemplateRequest
     * @return ConfigWebCCTemplateResponse
     */
    CompletableFuture<ConfigWebCCTemplateResponse> configWebCCTemplate(ConfigWebCCTemplateRequest request);

    /**
     * @param request the request parameters of ConfigWebIpSet  ConfigWebIpSetRequest
     * @return ConfigWebIpSetResponse
     */
    CompletableFuture<ConfigWebIpSetResponse> configWebIpSet(ConfigWebIpSetRequest request);

    /**
     * @param request the request parameters of CreateAsyncTask  CreateAsyncTaskRequest
     * @return CreateAsyncTaskResponse
     */
    CompletableFuture<CreateAsyncTaskResponse> createAsyncTask(CreateAsyncTaskRequest request);

    /**
     * @param request the request parameters of CreateDomainResource  CreateDomainResourceRequest
     * @return CreateDomainResourceResponse
     */
    CompletableFuture<CreateDomainResourceResponse> createDomainResource(CreateDomainResourceRequest request);

    /**
     * @param request the request parameters of CreateNetworkRules  CreateNetworkRulesRequest
     * @return CreateNetworkRulesResponse
     */
    CompletableFuture<CreateNetworkRulesResponse> createNetworkRules(CreateNetworkRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports integration with Terraform. For more information about Terraform, see <a href="https://help.aliyun.com/document_detail/95820.html">What is Terraform</a>.</p>
     * 
     * @param request the request parameters of CreatePort  CreatePortRequest
     * @return CreatePortResponse
     */
    CompletableFuture<CreatePortResponse> createPort(CreatePortRequest request);

    /**
     * @param request the request parameters of CreateSceneDefensePolicy  CreateSceneDefensePolicyRequest
     * @return CreateSceneDefensePolicyResponse
     */
    CompletableFuture<CreateSceneDefensePolicyResponse> createSceneDefensePolicy(CreateSceneDefensePolicyRequest request);

    /**
     * @param request the request parameters of CreateSchedulerRule  CreateSchedulerRuleRequest
     * @return CreateSchedulerRuleResponse
     */
    CompletableFuture<CreateSchedulerRuleResponse> createSchedulerRule(CreateSchedulerRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the CreateTagResources operation to add tags to multiple Anti-DDoS Proxy instances at a time.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateTagResources  CreateTagResourcesRequest
     * @return CreateTagResourcesResponse
     */
    CompletableFuture<CreateTagResourcesResponse> createTagResources(CreateTagResourcesRequest request);

    /**
     * @deprecated OpenAPI CreateWebCCRule is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.  * @param request  the request parameters of CreateWebCCRule  CreateWebCCRuleRequest
     * @return CreateWebCCRuleResponse
     */
    @Deprecated
    CompletableFuture<CreateWebCCRuleResponse> createWebCCRule(CreateWebCCRuleRequest request);

    /**
     * @param request the request parameters of CreateWebRule  CreateWebRuleRequest
     * @return CreateWebRuleResponse
     */
    CompletableFuture<CreateWebRuleResponse> createWebRule(CreateWebRuleRequest request);

    /**
     * @param request the request parameters of DeleteAsyncTask  DeleteAsyncTaskRequest
     * @return DeleteAsyncTaskResponse
     */
    CompletableFuture<DeleteAsyncTaskResponse> deleteAsyncTask(DeleteAsyncTaskRequest request);

    /**
     * @param request the request parameters of DeleteAutoCcBlacklist  DeleteAutoCcBlacklistRequest
     * @return DeleteAutoCcBlacklistResponse
     */
    CompletableFuture<DeleteAutoCcBlacklistResponse> deleteAutoCcBlacklist(DeleteAutoCcBlacklistRequest request);

    /**
     * @param request the request parameters of DeleteAutoCcWhitelist  DeleteAutoCcWhitelistRequest
     * @return DeleteAutoCcWhitelistResponse
     */
    CompletableFuture<DeleteAutoCcWhitelistResponse> deleteAutoCcWhitelist(DeleteAutoCcWhitelistRequest request);

    /**
     * @param request the request parameters of DeleteDomainResource  DeleteDomainResourceRequest
     * @return DeleteDomainResourceResponse
     */
    CompletableFuture<DeleteDomainResourceResponse> deleteDomainResource(DeleteDomainResourceRequest request);

    /**
     * @param request the request parameters of DeleteNetworkRule  DeleteNetworkRuleRequest
     * @return DeleteNetworkRuleResponse
     */
    CompletableFuture<DeleteNetworkRuleResponse> deleteNetworkRule(DeleteNetworkRuleRequest request);

    /**
     * <b>description</b> :
     * <p>After you delete a port forwarding rule, the Anti-DDoS Pro or Anti-DDoS Premium instance no longer forwards service traffic on the Layer 4 port. Before you delete a specific port forwarding rule, make sure that the service traffic destined for the Layer 4 port is redirected to the origin server. This can prevent negative impacts on your services.</p>
     * <blockquote>
     * <p>You can call this operation by using Terraform. For more information about Terraform, see <a href="https://help.aliyun.com/document_detail/95820.html">What is Terraform?</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeletePort  DeletePortRequest
     * @return DeletePortResponse
     */
    CompletableFuture<DeletePortResponse> deletePort(DeletePortRequest request);

    /**
     * @param request the request parameters of DeleteSceneDefensePolicy  DeleteSceneDefensePolicyRequest
     * @return DeleteSceneDefensePolicyResponse
     */
    CompletableFuture<DeleteSceneDefensePolicyResponse> deleteSceneDefensePolicy(DeleteSceneDefensePolicyRequest request);

    /**
     * @param request the request parameters of DeleteSchedulerRule  DeleteSchedulerRuleRequest
     * @return DeleteSchedulerRuleResponse
     */
    CompletableFuture<DeleteSchedulerRuleResponse> deleteSchedulerRule(DeleteSchedulerRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation removes tags from an Anti-DDoS Proxy (Chinese Mainland) instance.</p>
     * <blockquote>
     * <p>Only Anti-DDoS Proxy (Chinese Mainland) supports the tag feature.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DeleteTagResources  DeleteTagResourcesRequest
     * @return DeleteTagResourcesResponse
     */
    CompletableFuture<DeleteTagResourcesResponse> deleteTagResources(DeleteTagResourcesRequest request);

    /**
     * @deprecated OpenAPI DeleteWebCCRule is deprecated, please use ddoscoo::2020-01-01::DeleteWebCCRuleV2 instead.  * @param request  the request parameters of DeleteWebCCRule  DeleteWebCCRuleRequest
     * @return DeleteWebCCRuleResponse
     */
    @Deprecated
    CompletableFuture<DeleteWebCCRuleResponse> deleteWebCCRule(DeleteWebCCRuleRequest request);

    /**
     * @param request the request parameters of DeleteWebCCRuleV2  DeleteWebCCRuleV2Request
     * @return DeleteWebCCRuleV2Response
     */
    CompletableFuture<DeleteWebCCRuleV2Response> deleteWebCCRuleV2(DeleteWebCCRuleV2Request request);

    /**
     * <b>description</b> :
     * <p>You can call the DeleteWebCacheCustomRule operation to delete the custom rules of the Static Page Caching policy for a website.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteWebCacheCustomRule  DeleteWebCacheCustomRuleRequest
     * @return DeleteWebCacheCustomRuleResponse
     */
    CompletableFuture<DeleteWebCacheCustomRuleResponse> deleteWebCacheCustomRule(DeleteWebCacheCustomRuleRequest request);

    /**
     * @param request the request parameters of DeleteWebPreciseAccessRule  DeleteWebPreciseAccessRuleRequest
     * @return DeleteWebPreciseAccessRuleResponse
     */
    CompletableFuture<DeleteWebPreciseAccessRuleResponse> deleteWebPreciseAccessRule(DeleteWebPreciseAccessRuleRequest request);

    /**
     * @param request the request parameters of DeleteWebRule  DeleteWebRuleRequest
     * @return DeleteWebRuleResponse
     */
    CompletableFuture<DeleteWebRuleResponse> deleteWebRule(DeleteWebRuleRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries detailed information about asynchronous export tasks, including task ID, start and end times, status, parameters, results, and more.</p>
     * <h3>QPS limits</h3>
     * <p>The single-user QPS limit for this operation is 10 queries per second (QPS). API calls that exceed this limit will be throttled, which may affect your business. You should call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeAsyncTasks  DescribeAsyncTasksRequest
     * @return DescribeAsyncTasksResponse
     */
    CompletableFuture<DescribeAsyncTasksResponse> describeAsyncTasks(DescribeAsyncTasksRequest request);

    /**
     * @param request the request parameters of DescribeAttackAnalysisMaxQps  DescribeAttackAnalysisMaxQpsRequest
     * @return DescribeAttackAnalysisMaxQpsResponse
     */
    CompletableFuture<DescribeAttackAnalysisMaxQpsResponse> describeAttackAnalysisMaxQps(DescribeAttackAnalysisMaxQpsRequest request);

    /**
     * @param request the request parameters of DescribeAutoCcBlacklist  DescribeAutoCcBlacklistRequest
     * @return DescribeAutoCcBlacklistResponse
     */
    CompletableFuture<DescribeAutoCcBlacklistResponse> describeAutoCcBlacklist(DescribeAutoCcBlacklistRequest request);

    /**
     * @param request the request parameters of DescribeAutoCcListCount  DescribeAutoCcListCountRequest
     * @return DescribeAutoCcListCountResponse
     */
    CompletableFuture<DescribeAutoCcListCountResponse> describeAutoCcListCount(DescribeAutoCcListCountRequest request);

    /**
     * @param request the request parameters of DescribeAutoCcWhitelist  DescribeAutoCcWhitelistRequest
     * @return DescribeAutoCcWhitelistResponse
     */
    CompletableFuture<DescribeAutoCcWhitelistResponse> describeAutoCcWhitelist(DescribeAutoCcWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeBackSourceCidr  DescribeBackSourceCidrRequest
     * @return DescribeBackSourceCidrResponse
     */
    CompletableFuture<DescribeBackSourceCidrResponse> describeBackSourceCidr(DescribeBackSourceCidrRequest request);

    /**
     * @param request the request parameters of DescribeBlackholeStatus  DescribeBlackholeStatusRequest
     * @return DescribeBlackholeStatusResponse
     */
    CompletableFuture<DescribeBlackholeStatusResponse> describeBlackholeStatus(DescribeBlackholeStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the near-origin traffic diversion configurations of an Anti-DDoS Pro and Anti-DDoS Premium instance in the Chinese mainland.</p>
     * <blockquote>
     * <p>This operation is applicable only to Anti-DDoS Pro and Anti-DDoS Premium (Chinese Mainland).</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can invoke this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Invoke this operation within the limit.</p>
     * 
     * @param request the request parameters of DescribeBlockStatus  DescribeBlockStatusRequest
     * @return DescribeBlockStatusResponse
     */
    CompletableFuture<DescribeBlockStatusResponse> describeBlockStatus(DescribeBlockStatusRequest request);

    /**
     * @param request the request parameters of DescribeCdnLinkageRules  DescribeCdnLinkageRulesRequest
     * @return DescribeCdnLinkageRulesResponse
     */
    CompletableFuture<DescribeCdnLinkageRulesResponse> describeCdnLinkageRules(DescribeCdnLinkageRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all certificates that are available for a domain name protected by an Anti-DDoS instance. A domain name can be associated with multiple certificates. For example, a query for a specific domain name can return both a certificate for that specific domain name and a wildcard certificate.</p>
     * <blockquote>
     * <p>To query the certificate that is currently used by a domain name, call the <a href="https://help.aliyun.com/document_detail/473610.html">DescribeWebRules</a> operation to obtain the CertName and CertRegion values. Then, call the <a href="https://help.aliyun.com/document_detail/411733.html">ListUserCertificateOrder</a> operation of Certificate Management Service. Use the returned CertName value to query the corresponding certificate ID and other details.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCerts  DescribeCertsRequest
     * @return DescribeCertsResponse
     */
    CompletableFuture<DescribeCertsResponse> describeCerts(DescribeCertsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to Anti-DDoS Proxy (Outside Chinese Mainland).</p>
     * 
     * @param request the request parameters of DescribeCnameReuses  DescribeCnameReusesRequest
     * @return DescribeCnameReusesResponse
     */
    CompletableFuture<DescribeCnameReusesResponse> describeCnameReuses(DescribeCnameReusesRequest request);

    /**
     * @param request the request parameters of DescribeDDoSEvents  DescribeDDoSEventsRequest
     * @return DescribeDDoSEventsResponse
     */
    CompletableFuture<DescribeDDoSEventsResponse> describeDDoSEvents(DescribeDDoSEventsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the list of DDoS attack events within a specified time range by using paging. DDoS attack events contain the following information: attack start time and end time, attack type, attacked object, and peak attack traffic (peak bandwidth or peak packet forwarding rate).</p>
     * <h3>Rate limit</h3>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Invoke this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of DescribeDDosAllEventList  DescribeDDosAllEventListRequest
     * @return DescribeDDosAllEventListResponse
     */
    CompletableFuture<DescribeDDosAllEventListResponse> describeDDosAllEventList(DescribeDDosAllEventListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to querying data of volumetric attacks. It is not applicable to querying data of web resource exhaustion or connection flood attacks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDDosEventArea  DescribeDDosEventAreaRequest
     * @return DescribeDDosEventAreaResponse
     */
    CompletableFuture<DescribeDDosEventAreaResponse> describeDDosEventArea(DescribeDDosEventAreaRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to querying data of volumetric attacks. It is not applicable to querying data of web resource exhaustion or connection flood attacks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDDosEventAttackType  DescribeDDosEventAttackTypeRequest
     * @return DescribeDDosEventAttackTypeResponse
     */
    CompletableFuture<DescribeDDosEventAttackTypeResponse> describeDDosEventAttackType(DescribeDDosEventAttackTypeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to querying data of volumetric attacks. It is not applicable to querying data of web resource exhaustion or connection flood attacks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDDosEventIsp  DescribeDDosEventIspRequest
     * @return DescribeDDosEventIspResponse
     */
    CompletableFuture<DescribeDDosEventIspResponse> describeDDosEventIsp(DescribeDDosEventIspRequest request);

    /**
     * @param request the request parameters of DescribeDDosEventMax  DescribeDDosEventMaxRequest
     * @return DescribeDDosEventMaxResponse
     */
    CompletableFuture<DescribeDDosEventMaxResponse> describeDDosEventMax(DescribeDDosEventMaxRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to querying data of volumetric attacks. It is not applicable to querying data of web resource exhaustion or connection flood attacks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDDosEventSrcIp  DescribeDDosEventSrcIpRequest
     * @return DescribeDDosEventSrcIpResponse
     */
    CompletableFuture<DescribeDDosEventSrcIpResponse> describeDDosEventSrcIp(DescribeDDosEventSrcIpRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDefenseCountStatistics operation to query the information about advanced mitigation sessions of an Anti-DDoS Proxy (Outside Chinese Mainland) instance. For example, you can query the number of advanced mitigation sessions that are used within the current calendar month and the number of remaining advanced mitigation sessions.</p>
     * <blockquote>
     * <p> This operation is suitable only for Anti-DDoS Proxy (Outside Chinese Mainland).</p>
     * </blockquote>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDefenseCountStatistics  DescribeDefenseCountStatisticsRequest
     * @return DescribeDefenseCountStatisticsResponse
     */
    CompletableFuture<DescribeDefenseCountStatisticsResponse> describeDefenseCountStatistics(DescribeDefenseCountStatisticsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is available only for the Anti-DDoS Premium service.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDefenseRecords  DescribeDefenseRecordsRequest
     * @return DescribeDefenseRecordsResponse
     */
    CompletableFuture<DescribeDefenseRecordsResponse> describeDefenseRecords(DescribeDefenseRecordsRequest request);

    /**
     * @param request the request parameters of DescribeDestinationPortEvent  DescribeDestinationPortEventRequest
     * @return DescribeDestinationPortEventResponse
     */
    CompletableFuture<DescribeDestinationPortEventResponse> describeDestinationPortEvent(DescribeDestinationPortEventRequest request);

    /**
     * @param request the request parameters of DescribeDomainAttackEvents  DescribeDomainAttackEventsRequest
     * @return DescribeDomainAttackEventsResponse
     */
    CompletableFuture<DescribeDomainAttackEventsResponse> describeDomainAttackEvents(DescribeDomainAttackEventsRequest request);

    /**
     * @param request the request parameters of DescribeDomainBps  DescribeDomainBpsRequest
     * @return DescribeDomainBpsResponse
     */
    CompletableFuture<DescribeDomainBpsResponse> describeDomainBps(DescribeDomainBpsRequest request);

    /**
     * @param request the request parameters of DescribeDomainCcProtectSwitch  DescribeDomainCcProtectSwitchRequest
     * @return DescribeDomainCcProtectSwitchResponse
     */
    CompletableFuture<DescribeDomainCcProtectSwitchResponse> describeDomainCcProtectSwitch(DescribeDomainCcProtectSwitchRequest request);

    /**
     * @param request the request parameters of DescribeDomainH2Fingerprint  DescribeDomainH2FingerprintRequest
     * @return DescribeDomainH2FingerprintResponse
     */
    CompletableFuture<DescribeDomainH2FingerprintResponse> describeDomainH2Fingerprint(DescribeDomainH2FingerprintRequest request);

    /**
     * @param request the request parameters of DescribeDomainOverview  DescribeDomainOverviewRequest
     * @return DescribeDomainOverviewResponse
     */
    CompletableFuture<DescribeDomainOverviewResponse> describeDomainOverview(DescribeDomainOverviewRequest request);

    /**
     * @param request the request parameters of DescribeDomainQPSList  DescribeDomainQPSListRequest
     * @return DescribeDomainQPSListResponse
     */
    CompletableFuture<DescribeDomainQPSListResponse> describeDomainQPSList(DescribeDomainQPSListRequest request);

    /**
     * <b>description</b> :
     * <p>This API returns a paginated list of detailed configurations for your website forwarding rules, such as website domain name, protocol, HTTPS settings, and CC attack protection configuration.
     * This API integrates with Terraform. For more information about Terraform, see <a href="https://help.aliyun.com/document_detail/95820.html">What is Terraform?</a>.</p>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 50 calls per second. If you exceed this limit, API calls are throttled, which may affect your business. Plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeDomainResource  DescribeDomainResourceRequest
     * @return DescribeDomainResourceResponse
     */
    CompletableFuture<DescribeDomainResourceResponse> describeDomainResource(DescribeDomainResourceRequest request);

    /**
     * @param request the request parameters of DescribeDomainSecurityProfile  DescribeDomainSecurityProfileRequest
     * @return DescribeDomainSecurityProfileResponse
     */
    CompletableFuture<DescribeDomainSecurityProfileResponse> describeDomainSecurityProfile(DescribeDomainSecurityProfileRequest request);

    /**
     * @param request the request parameters of DescribeDomainStatusCodeCount  DescribeDomainStatusCodeCountRequest
     * @return DescribeDomainStatusCodeCountResponse
     */
    CompletableFuture<DescribeDomainStatusCodeCountResponse> describeDomainStatusCodeCount(DescribeDomainStatusCodeCountRequest request);

    /**
     * @param request the request parameters of DescribeDomainStatusCodeList  DescribeDomainStatusCodeListRequest
     * @return DescribeDomainStatusCodeListResponse
     */
    CompletableFuture<DescribeDomainStatusCodeListResponse> describeDomainStatusCodeList(DescribeDomainStatusCodeListRequest request);

    /**
     * @param request the request parameters of DescribeDomainTopAttackList  DescribeDomainTopAttackListRequest
     * @return DescribeDomainTopAttackListResponse
     */
    CompletableFuture<DescribeDomainTopAttackListResponse> describeDomainTopAttackList(DescribeDomainTopAttackListRequest request);

    /**
     * @param request the request parameters of DescribeDomainTopFingerprint  DescribeDomainTopFingerprintRequest
     * @return DescribeDomainTopFingerprintResponse
     */
    CompletableFuture<DescribeDomainTopFingerprintResponse> describeDomainTopFingerprint(DescribeDomainTopFingerprintRequest request);

    /**
     * @param request the request parameters of DescribeDomainTopHttpMethod  DescribeDomainTopHttpMethodRequest
     * @return DescribeDomainTopHttpMethodResponse
     */
    CompletableFuture<DescribeDomainTopHttpMethodResponse> describeDomainTopHttpMethod(DescribeDomainTopHttpMethodRequest request);

    /**
     * @param request the request parameters of DescribeDomainTopReferer  DescribeDomainTopRefererRequest
     * @return DescribeDomainTopRefererResponse
     */
    CompletableFuture<DescribeDomainTopRefererResponse> describeDomainTopReferer(DescribeDomainTopRefererRequest request);

    /**
     * @param request the request parameters of DescribeDomainTopUserAgent  DescribeDomainTopUserAgentRequest
     * @return DescribeDomainTopUserAgentResponse
     */
    CompletableFuture<DescribeDomainTopUserAgentResponse> describeDomainTopUserAgent(DescribeDomainTopUserAgentRequest request);

    /**
     * @param request the request parameters of DescribeDomainViewSourceCountries  DescribeDomainViewSourceCountriesRequest
     * @return DescribeDomainViewSourceCountriesResponse
     */
    CompletableFuture<DescribeDomainViewSourceCountriesResponse> describeDomainViewSourceCountries(DescribeDomainViewSourceCountriesRequest request);

    /**
     * @param request the request parameters of DescribeDomainViewSourceProvinces  DescribeDomainViewSourceProvincesRequest
     * @return DescribeDomainViewSourceProvincesResponse
     */
    CompletableFuture<DescribeDomainViewSourceProvincesResponse> describeDomainViewSourceProvinces(DescribeDomainViewSourceProvincesRequest request);

    /**
     * @param request the request parameters of DescribeDomainViewTopCostTime  DescribeDomainViewTopCostTimeRequest
     * @return DescribeDomainViewTopCostTimeResponse
     */
    CompletableFuture<DescribeDomainViewTopCostTimeResponse> describeDomainViewTopCostTime(DescribeDomainViewTopCostTimeRequest request);

    /**
     * @param request the request parameters of DescribeDomainViewTopUrl  DescribeDomainViewTopUrlRequest
     * @return DescribeDomainViewTopUrlResponse
     */
    CompletableFuture<DescribeDomainViewTopUrlResponse> describeDomainViewTopUrl(DescribeDomainViewTopUrlRequest request);

    /**
     * @param request the request parameters of DescribeDomains  DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to Anti-DDoS Pro and Anti-DDoS Premium (the Chinese mainland) service.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeElasticBandwidthSpec  DescribeElasticBandwidthSpecRequest
     * @return DescribeElasticBandwidthSpecResponse
     */
    CompletableFuture<DescribeElasticBandwidthSpecResponse> describeElasticBandwidthSpec(DescribeElasticBandwidthSpecRequest request);

    /**
     * @param request the request parameters of DescribeElasticQps  DescribeElasticQpsRequest
     * @return DescribeElasticQpsResponse
     */
    CompletableFuture<DescribeElasticQpsResponse> describeElasticQps(DescribeElasticQpsRequest request);

    /**
     * @param request the request parameters of DescribeElasticQpsRecord  DescribeElasticQpsRecordRequest
     * @return DescribeElasticQpsRecordResponse
     */
    CompletableFuture<DescribeElasticQpsRecordResponse> describeElasticQpsRecord(DescribeElasticQpsRecordRequest request);

    /**
     * @param request the request parameters of DescribeHeaders  DescribeHeadersRequest
     * @return DescribeHeadersResponse
     */
    CompletableFuture<DescribeHeadersResponse> describeHeaders(DescribeHeadersRequest request);

    /**
     * @param request the request parameters of DescribeHealthCheckList  DescribeHealthCheckListRequest
     * @return DescribeHealthCheckListResponse
     */
    CompletableFuture<DescribeHealthCheckListResponse> describeHealthCheckList(DescribeHealthCheckListRequest request);

    /**
     * @param request the request parameters of DescribeHealthCheckStatus  DescribeHealthCheckStatusRequest
     * @return DescribeHealthCheckStatusResponse
     */
    CompletableFuture<DescribeHealthCheckStatusResponse> describeHealthCheckStatus(DescribeHealthCheckStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the IP address and line information of an Anti-DDoS Pro or Anti-DDoS Premium instance, such as the IP address, status, and protection line of the instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can invoke this operation up to 10 times per second per account. If the number of calls exceeds the limit, throttling is triggered. Throttling may affect your business. Invoke this operation within the limit.</p>
     * 
     * @param request the request parameters of DescribeInstanceDetails  DescribeInstanceDetailsRequest
     * @return DescribeInstanceDetailsResponse
     */
    CompletableFuture<DescribeInstanceDetailsResponse> describeInstanceDetails(DescribeInstanceDetailsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceExt  DescribeInstanceExtRequest
     * @return DescribeInstanceExtResponse
     */
    CompletableFuture<DescribeInstanceExtResponse> describeInstanceExt(DescribeInstanceExtRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the IDs, editions, remarks, and IP types of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeInstanceIds  DescribeInstanceIdsRequest
     * @return DescribeInstanceIdsResponse
     */
    CompletableFuture<DescribeInstanceIdsResponse> describeInstanceIds(DescribeInstanceIdsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the specifications of multiple Anti-DDoS Pro or Anti-DDoS Premium instances in batches, such as the clean bandwidth, mitigation bandwidth, feature edition, number of protected domain names, and number of ports.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeInstanceSpecs  DescribeInstanceSpecsRequest
     * @return DescribeInstanceSpecsResponse
     */
    CompletableFuture<DescribeInstanceSpecsResponse> describeInstanceSpecs(DescribeInstanceSpecsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceStatistics  DescribeInstanceStatisticsRequest
     * @return DescribeInstanceStatisticsResponse
     */
    CompletableFuture<DescribeInstanceStatisticsResponse> describeInstanceStatistics(DescribeInstanceStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceStatus  DescribeInstanceStatusRequest
     * @return DescribeInstanceStatusResponse
     */
    CompletableFuture<DescribeInstanceStatusResponse> describeInstanceStatus(DescribeInstanceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of Anti-DDoS Pro or Anti-DDoS Premium instances owned by the current Alibaba Cloud account by using paging. The details include the instance ID, edition, expiration time, and service traffic forwarding status.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 invocations per second. If the limit is exceeded, API invocations are throttled, which may affect your services. Invoke this operation based on your business requirements.</p>
     * 
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeL7GlobalRule  DescribeL7GlobalRuleRequest
     * @return DescribeL7GlobalRuleResponse
     */
    CompletableFuture<DescribeL7GlobalRuleResponse> describeL7GlobalRule(DescribeL7GlobalRuleRequest request);

    /**
     * @param request the request parameters of DescribeL7RsPolicy  DescribeL7RsPolicyRequest
     * @return DescribeL7RsPolicyResponse
     */
    CompletableFuture<DescribeL7RsPolicyResponse> describeL7RsPolicy(DescribeL7RsPolicyRequest request);

    /**
     * @param request the request parameters of DescribeL7UsKeepalive  DescribeL7UsKeepaliveRequest
     * @return DescribeL7UsKeepaliveResponse
     */
    CompletableFuture<DescribeL7UsKeepaliveResponse> describeL7UsKeepalive(DescribeL7UsKeepaliveRequest request);

    /**
     * @param request the request parameters of DescribeLayer4RulePolicy  DescribeLayer4RulePolicyRequest
     * @return DescribeLayer4RulePolicyResponse
     */
    CompletableFuture<DescribeLayer4RulePolicyResponse> describeLayer4RulePolicy(DescribeLayer4RulePolicyRequest request);

    /**
     * @param request the request parameters of DescribeLogStoreExistStatus  DescribeLogStoreExistStatusRequest
     * @return DescribeLogStoreExistStatusResponse
     */
    CompletableFuture<DescribeLogStoreExistStatusResponse> describeLogStoreExistStatus(DescribeLogStoreExistStatusRequest request);

    /**
     * @param request the request parameters of DescribeNetworkRegionBlock  DescribeNetworkRegionBlockRequest
     * @return DescribeNetworkRegionBlockResponse
     */
    CompletableFuture<DescribeNetworkRegionBlockResponse> describeNetworkRegionBlock(DescribeNetworkRegionBlockRequest request);

    /**
     * @param request the request parameters of DescribeNetworkRuleAttributes  DescribeNetworkRuleAttributesRequest
     * @return DescribeNetworkRuleAttributesResponse
     */
    CompletableFuture<DescribeNetworkRuleAttributesResponse> describeNetworkRuleAttributes(DescribeNetworkRuleAttributesRequest request);

    /**
     * @param request the request parameters of DescribeNetworkRules  DescribeNetworkRulesRequest
     * @return DescribeNetworkRulesResponse
     */
    CompletableFuture<DescribeNetworkRulesResponse> describeNetworkRules(DescribeNetworkRulesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to Anti-DDoS Pro and Anti-DDoS Premium (the Chinese mainland).
     * Operation log types include: settings for elastic protection specifications of an instance, Unblock (deactivation of blackhole filtering), settings for near-origin traffic diversion, offsetting with anti-DDoS mitigation plans, changing an ECS IP address, and clearing full logs.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeOpEntities  DescribeOpEntitiesRequest
     * @return DescribeOpEntitiesResponse
     */
    CompletableFuture<DescribeOpEntitiesResponse> describeOpEntities(DescribeOpEntitiesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports integration with Terraform. For more information about Terraform, see <a href="https://help.aliyun.com/document_detail/95820.html">What is Terraform?</a>.</p>
     * 
     * @param request the request parameters of DescribePort  DescribePortRequest
     * @return DescribePortResponse
     */
    CompletableFuture<DescribePortResponse> describePort(DescribePortRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the peak bandwidth and peak packet rate of attack traffic on one or more Anti-DDoS Pro or Anti-DDoS Premium instances within a specific period of time.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribePortAttackMaxFlow  DescribePortAttackMaxFlowRequest
     * @return DescribePortAttackMaxFlowResponse
     */
    CompletableFuture<DescribePortAttackMaxFlowResponse> describePortAttackMaxFlow(DescribePortAttackMaxFlowRequest request);

    /**
     * @param request the request parameters of DescribePortAutoCcStatus  DescribePortAutoCcStatusRequest
     * @return DescribePortAutoCcStatusResponse
     */
    CompletableFuture<DescribePortAutoCcStatusResponse> describePortAutoCcStatus(DescribePortAutoCcStatusRequest request);

    /**
     * @param request the request parameters of DescribePortCcAttackTopIP  DescribePortCcAttackTopIPRequest
     * @return DescribePortCcAttackTopIPResponse
     */
    CompletableFuture<DescribePortCcAttackTopIPResponse> describePortCcAttackTopIP(DescribePortCcAttackTopIPRequest request);

    /**
     * @param request the request parameters of DescribePortConnsCount  DescribePortConnsCountRequest
     * @return DescribePortConnsCountResponse
     */
    CompletableFuture<DescribePortConnsCountResponse> describePortConnsCount(DescribePortConnsCountRequest request);

    /**
     * @param request the request parameters of DescribePortConnsList  DescribePortConnsListRequest
     * @return DescribePortConnsListResponse
     */
    CompletableFuture<DescribePortConnsListResponse> describePortConnsList(DescribePortConnsListRequest request);

    /**
     * @param request the request parameters of DescribePortFlowList  DescribePortFlowListRequest
     * @return DescribePortFlowListResponse
     */
    CompletableFuture<DescribePortFlowListResponse> describePortFlowList(DescribePortFlowListRequest request);

    /**
     * @param request the request parameters of DescribePortMaxConns  DescribePortMaxConnsRequest
     * @return DescribePortMaxConnsResponse
     */
    CompletableFuture<DescribePortMaxConnsResponse> describePortMaxConns(DescribePortMaxConnsRequest request);

    /**
     * @param request the request parameters of DescribePortViewSourceCountries  DescribePortViewSourceCountriesRequest
     * @return DescribePortViewSourceCountriesResponse
     */
    CompletableFuture<DescribePortViewSourceCountriesResponse> describePortViewSourceCountries(DescribePortViewSourceCountriesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the distribution of request source Internet service providers (ISPs) for an Anti-DDoS Pro or Anti-DDoS Premium instance within a specified time period.</p>
     * <blockquote>
     * <p>Because the Layer 4 transport-layer identity statistics algorithm of Anti-DDoS Pro and Anti-DDoS Premium has been updated, the data returned by this operation does not reflect the actual traffic volume. The data can only be used to calculate the proportion of requests from different ISPs (that is, the distribution of request source ISPs). To obtain request traffic data, call <a href="https://help.aliyun.com/document_detail/157460.html">DescribePortFlowList</a>.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of DescribePortViewSourceIsps  DescribePortViewSourceIspsRequest
     * @return DescribePortViewSourceIspsResponse
     */
    CompletableFuture<DescribePortViewSourceIspsResponse> describePortViewSourceIsps(DescribePortViewSourceIspsRequest request);

    /**
     * @param request the request parameters of DescribePortViewSourceProvinces  DescribePortViewSourceProvincesRequest
     * @return DescribePortViewSourceProvincesResponse
     */
    CompletableFuture<DescribePortViewSourceProvincesResponse> describePortViewSourceProvinces(DescribePortViewSourceProvincesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeSceneDefenseObjects operation to query the protected objects of a scenario-specific custom policy.
     * Before you call this operation, make sure that you have created a scenario-specific custom policy by calling the <a href="https://help.aliyun.com/document_detail/159779.html">CreateSceneDefensePolicy</a> operation.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeSceneDefenseObjects  DescribeSceneDefenseObjectsRequest
     * @return DescribeSceneDefenseObjectsResponse
     */
    CompletableFuture<DescribeSceneDefenseObjectsResponse> describeSceneDefenseObjects(DescribeSceneDefenseObjectsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the detailed configurations of created scenario-specific policies, such as the policy status, protected objects, and protection rules.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per user. If the number of calls exceeds the limit, throttling is triggered. This may affect your business. Call this operation within the limit.</p>
     * 
     * @param request the request parameters of DescribeSceneDefensePolicies  DescribeSceneDefensePoliciesRequest
     * @return DescribeSceneDefensePoliciesResponse
     */
    CompletableFuture<DescribeSceneDefensePoliciesResponse> describeSceneDefensePolicies(DescribeSceneDefensePoliciesRequest request);

    /**
     * @param request the request parameters of DescribeSchedulerRules  DescribeSchedulerRulesRequest
     * @return DescribeSchedulerRulesResponse
     */
    CompletableFuture<DescribeSchedulerRulesResponse> describeSchedulerRules(DescribeSchedulerRulesRequest request);

    /**
     * @param request the request parameters of DescribeSlaEventList  DescribeSlaEventListRequest
     * @return DescribeSlaEventListResponse
     */
    CompletableFuture<DescribeSlaEventListResponse> describeSlaEventList(DescribeSlaEventListRequest request);

    /**
     * @param request the request parameters of DescribeSlsAuthStatus  DescribeSlsAuthStatusRequest
     * @return DescribeSlsAuthStatusResponse
     */
    CompletableFuture<DescribeSlsAuthStatusResponse> describeSlsAuthStatus(DescribeSlsAuthStatusRequest request);

    /**
     * @param request the request parameters of DescribeSlsLogstoreInfo  DescribeSlsLogstoreInfoRequest
     * @return DescribeSlsLogstoreInfoResponse
     */
    CompletableFuture<DescribeSlsLogstoreInfoResponse> describeSlsLogstoreInfo(DescribeSlsLogstoreInfoRequest request);

    /**
     * @param request the request parameters of DescribeSlsOpenStatus  DescribeSlsOpenStatusRequest
     * @return DescribeSlsOpenStatusResponse
     */
    CompletableFuture<DescribeSlsOpenStatusResponse> describeSlsOpenStatus(DescribeSlsOpenStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries whether your Alibaba Cloud account has authorized Anti-DDoS Pro and Anti-DDoS Premium to access other cloud services.</p>
     * <h3>QPS limits</h3>
     * <p>The maximum number of queries per second (QPS) for this operation is 10 per user. If the number of API calls exceeds this limit, throttling is triggered. This may affect your business operations. Ensure that you call this operation at an appropriate rate.</p>
     * 
     * @param request the request parameters of DescribeStsGrantStatus  DescribeStsGrantStatusRequest
     * @return DescribeStsGrantStatusResponse
     */
    CompletableFuture<DescribeStsGrantStatusResponse> describeStsGrantStatus(DescribeStsGrantStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation lets you query the system logs of Anti-DDoS Pro. System logs currently include only the billing logs of burstable clean bandwidth.
     * If you have enabled burstable clean bandwidth, you can call this operation to query the billing details of burstable clean bandwidth.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit for this operation is 10 per second per user. If the number of calls per second exceeds this limit, throttling is triggered. This may affect your business operations. Therefore, call this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of DescribeSystemLog  DescribeSystemLogRequest
     * @return DescribeSystemLogResponse
     */
    CompletableFuture<DescribeSystemLogResponse> describeSystemLog(DescribeSystemLogRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all tag keys and the number of Anti-DDoS Proxy (Chinese Mainland) instances to which each tag key is added by page.</p>
     * <blockquote>
     * <p> Only Anti-DDoS Proxy (Chinese Mainland) supports tags.</p>
     * </blockquote>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeTagKeys  DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     */
    CompletableFuture<DescribeTagKeysResponse> describeTagKeys(DescribeTagKeysRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeTagResources operation to query the information about the tags that are added to an Anti-DDoS Proxy (Chinese Mainland) instance.</p>
     * <blockquote>
     * <p> Only Anti-DDoS Proxy (Chinese Mainland) supports tags.</p>
     * </blockquote>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeTagResources  DescribeTagResourcesRequest
     * @return DescribeTagResourcesResponse
     */
    CompletableFuture<DescribeTagResourcesResponse> describeTagResources(DescribeTagResourcesRequest request);

    /**
     * @param request the request parameters of DescribeTotalAttackMaxFlow  DescribeTotalAttackMaxFlowRequest
     * @return DescribeTotalAttackMaxFlowResponse
     */
    CompletableFuture<DescribeTotalAttackMaxFlowResponse> describeTotalAttackMaxFlow(DescribeTotalAttackMaxFlowRequest request);

    /**
     * @param request the request parameters of DescribeUdpReflect  DescribeUdpReflectRequest
     * @return DescribeUdpReflectResponse
     */
    CompletableFuture<DescribeUdpReflectResponse> describeUdpReflect(DescribeUdpReflectRequest request);

    /**
     * @param request the request parameters of DescribeUnBlackholeCount  DescribeUnBlackholeCountRequest
     * @return DescribeUnBlackholeCountResponse
     */
    CompletableFuture<DescribeUnBlackholeCountResponse> describeUnBlackholeCount(DescribeUnBlackholeCountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to Anti-DDoS Pro and Anti-DDoS Premium (the Chinese mainland) service.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeUnBlockCount  DescribeUnBlockCountRequest
     * @return DescribeUnBlockCountResponse
     */
    CompletableFuture<DescribeUnBlockCountResponse> describeUnBlockCount(DescribeUnBlockCountRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the full log switch status of all domain names that are added to Anti-DDoS Pro for protection.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit on this operation is 10 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your business. We recommend that you call this operation at a proper frequency.</p>
     * 
     * @param request the request parameters of DescribeWebAccessLogDispatchStatus  DescribeWebAccessLogDispatchStatusRequest
     * @return DescribeWebAccessLogDispatchStatusResponse
     */
    CompletableFuture<DescribeWebAccessLogDispatchStatusResponse> describeWebAccessLogDispatchStatus(DescribeWebAccessLogDispatchStatusRequest request);

    /**
     * @param request the request parameters of DescribeWebAccessLogEmptyCount  DescribeWebAccessLogEmptyCountRequest
     * @return DescribeWebAccessLogEmptyCountResponse
     */
    CompletableFuture<DescribeWebAccessLogEmptyCountResponse> describeWebAccessLogEmptyCount(DescribeWebAccessLogEmptyCountRequest request);

    /**
     * @param request the request parameters of DescribeWebAccessLogStatus  DescribeWebAccessLogStatusRequest
     * @return DescribeWebAccessLogStatusResponse
     */
    CompletableFuture<DescribeWebAccessLogStatusResponse> describeWebAccessLogStatus(DescribeWebAccessLogStatusRequest request);

    /**
     * @param request the request parameters of DescribeWebAccessMode  DescribeWebAccessModeRequest
     * @return DescribeWebAccessModeResponse
     */
    CompletableFuture<DescribeWebAccessModeResponse> describeWebAccessMode(DescribeWebAccessModeRequest request);

    /**
     * @param request the request parameters of DescribeWebAreaBlockConfigs  DescribeWebAreaBlockConfigsRequest
     * @return DescribeWebAreaBlockConfigsResponse
     */
    CompletableFuture<DescribeWebAreaBlockConfigsResponse> describeWebAreaBlockConfigs(DescribeWebAreaBlockConfigsRequest request);

    /**
     * @deprecated OpenAPI DescribeWebCCRules is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.  * @param request  the request parameters of DescribeWebCCRules  DescribeWebCCRulesRequest
     * @return DescribeWebCCRulesResponse
     */
    @Deprecated
    CompletableFuture<DescribeWebCCRulesResponse> describeWebCCRules(DescribeWebCCRulesRequest request);

    /**
     * @param request the request parameters of DescribeWebCCRulesV2  DescribeWebCCRulesV2Request
     * @return DescribeWebCCRulesV2Response
     */
    CompletableFuture<DescribeWebCCRulesV2Response> describeWebCCRulesV2(DescribeWebCCRulesV2Request request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeWebCacheConfigs operation to query the Static Page Caching configurations of websites. The configurations include cache modes and custom caching rules.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeWebCacheConfigs  DescribeWebCacheConfigsRequest
     * @return DescribeWebCacheConfigsResponse
     */
    CompletableFuture<DescribeWebCacheConfigsResponse> describeWebCacheConfigs(DescribeWebCacheConfigsRequest request);

    /**
     * @param request the request parameters of DescribeWebCcProtectSwitch  DescribeWebCcProtectSwitchRequest
     * @return DescribeWebCcProtectSwitchResponse
     */
    CompletableFuture<DescribeWebCcProtectSwitchResponse> describeWebCcProtectSwitch(DescribeWebCcProtectSwitchRequest request);

    /**
     * @param request the request parameters of DescribeWebCustomPorts  DescribeWebCustomPortsRequest
     * @return DescribeWebCustomPortsResponse
     */
    CompletableFuture<DescribeWebCustomPortsResponse> describeWebCustomPorts(DescribeWebCustomPortsRequest request);

    /**
     * @param request the request parameters of DescribeWebInstanceRelations  DescribeWebInstanceRelationsRequest
     * @return DescribeWebInstanceRelationsResponse
     */
    CompletableFuture<DescribeWebInstanceRelationsResponse> describeWebInstanceRelations(DescribeWebInstanceRelationsRequest request);

    /**
     * @param request the request parameters of DescribeWebPreciseAccessRule  DescribeWebPreciseAccessRuleRequest
     * @return DescribeWebPreciseAccessRuleResponse
     */
    CompletableFuture<DescribeWebPreciseAccessRuleResponse> describeWebPreciseAccessRule(DescribeWebPreciseAccessRuleRequest request);

    /**
     * @param request the request parameters of DescribeWebReportTopIp  DescribeWebReportTopIpRequest
     * @return DescribeWebReportTopIpResponse
     */
    CompletableFuture<DescribeWebReportTopIpResponse> describeWebReportTopIp(DescribeWebReportTopIpRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the configurations of website forwarding rules that you have created by using paging. For example, you can query the forwarding protocol type, origin server address, HTTPS configuration, and IP blacklist configuration.
     * Before you invoke this operation, you must have invoked <a href="https://help.aliyun.com/document_detail/157463.html">CreateWebRule</a> to create website forwarding rules.</p>
     * <h3>QPS limit</h3>
     * <p>You can invoke this operation up to 50 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Invoke this operation within the limit.</p>
     * 
     * @param request the request parameters of DescribeWebRules  DescribeWebRulesRequest
     * @return DescribeWebRulesResponse
     */
    CompletableFuture<DescribeWebRulesResponse> describeWebRules(DescribeWebRulesRequest request);

    /**
     * @param request the request parameters of DetachSceneDefenseObject  DetachSceneDefenseObjectRequest
     * @return DetachSceneDefenseObjectResponse
     */
    CompletableFuture<DetachSceneDefenseObjectResponse> detachSceneDefenseObject(DetachSceneDefenseObjectRequest request);

    /**
     * @param request the request parameters of DisableSceneDefensePolicy  DisableSceneDefensePolicyRequest
     * @return DisableSceneDefensePolicyResponse
     */
    CompletableFuture<DisableSceneDefensePolicyResponse> disableSceneDefensePolicy(DisableSceneDefensePolicyRequest request);

    /**
     * @param request the request parameters of DisableWebAccessLogConfig  DisableWebAccessLogConfigRequest
     * @return DisableWebAccessLogConfigResponse
     */
    CompletableFuture<DisableWebAccessLogConfigResponse> disableWebAccessLogConfig(DisableWebAccessLogConfigRequest request);

    /**
     * @param request the request parameters of DisableWebCC  DisableWebCCRequest
     * @return DisableWebCCResponse
     */
    CompletableFuture<DisableWebCCResponse> disableWebCC(DisableWebCCRequest request);

    /**
     * @param request the request parameters of DisableWebCCRule  DisableWebCCRuleRequest
     * @return DisableWebCCRuleResponse
     */
    CompletableFuture<DisableWebCCRuleResponse> disableWebCCRule(DisableWebCCRuleRequest request);

    /**
     * @param request the request parameters of EmptyAutoCcBlacklist  EmptyAutoCcBlacklistRequest
     * @return EmptyAutoCcBlacklistResponse
     */
    CompletableFuture<EmptyAutoCcBlacklistResponse> emptyAutoCcBlacklist(EmptyAutoCcBlacklistRequest request);

    /**
     * @param request the request parameters of EmptyAutoCcWhitelist  EmptyAutoCcWhitelistRequest
     * @return EmptyAutoCcWhitelistResponse
     */
    CompletableFuture<EmptyAutoCcWhitelistResponse> emptyAutoCcWhitelist(EmptyAutoCcWhitelistRequest request);

    /**
     * @param request the request parameters of EmptySlsLogstore  EmptySlsLogstoreRequest
     * @return EmptySlsLogstoreResponse
     */
    CompletableFuture<EmptySlsLogstoreResponse> emptySlsLogstore(EmptySlsLogstoreRequest request);

    /**
     * @param request the request parameters of EnableSceneDefensePolicy  EnableSceneDefensePolicyRequest
     * @return EnableSceneDefensePolicyResponse
     */
    CompletableFuture<EnableSceneDefensePolicyResponse> enableSceneDefensePolicy(EnableSceneDefensePolicyRequest request);

    /**
     * @param request the request parameters of EnableWebAccessLogConfig  EnableWebAccessLogConfigRequest
     * @return EnableWebAccessLogConfigResponse
     */
    CompletableFuture<EnableWebAccessLogConfigResponse> enableWebAccessLogConfig(EnableWebAccessLogConfigRequest request);

    /**
     * @param request the request parameters of EnableWebCC  EnableWebCCRequest
     * @return EnableWebCCResponse
     */
    CompletableFuture<EnableWebCCResponse> enableWebCC(EnableWebCCRequest request);

    /**
     * @param request the request parameters of EnableWebCCRule  EnableWebCCRuleRequest
     * @return EnableWebCCRuleResponse
     */
    CompletableFuture<EnableWebCCRuleResponse> enableWebCCRule(EnableWebCCRuleRequest request);

    /**
     * @param request the request parameters of ModifyBizBandWidthMode  ModifyBizBandWidthModeRequest
     * @return ModifyBizBandWidthModeResponse
     */
    CompletableFuture<ModifyBizBandWidthModeResponse> modifyBizBandWidthMode(ModifyBizBandWidthModeRequest request);

    /**
     * @param request the request parameters of ModifyBlackholeStatus  ModifyBlackholeStatusRequest
     * @return ModifyBlackholeStatusResponse
     */
    CompletableFuture<ModifyBlackholeStatusResponse> modifyBlackholeStatus(ModifyBlackholeStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is suitable only for Anti-DDoS Proxy (Chinese Mainland).</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyBlockStatus  ModifyBlockStatusRequest
     * @return ModifyBlockStatusResponse
     */
    CompletableFuture<ModifyBlockStatusResponse> modifyBlockStatus(ModifyBlockStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is suitable only for Anti-DDoS Premium.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyCnameReuse  ModifyCnameReuseRequest
     * @return ModifyCnameReuseResponse
     */
    CompletableFuture<ModifyCnameReuseResponse> modifyCnameReuse(ModifyCnameReuseRequest request);

    /**
     * @param request the request parameters of ModifyDomainResource  ModifyDomainResourceRequest
     * @return ModifyDomainResourceResponse
     */
    CompletableFuture<ModifyDomainResourceResponse> modifyDomainResource(ModifyDomainResourceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to Anti-DDoS Pro (the Chinese mainland) service.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyElasticBandWidth  ModifyElasticBandWidthRequest
     * @return ModifyElasticBandWidthResponse
     */
    CompletableFuture<ModifyElasticBandWidthResponse> modifyElasticBandWidth(ModifyElasticBandWidthRequest request);

    /**
     * @param request the request parameters of ModifyElasticBizBandWidth  ModifyElasticBizBandWidthRequest
     * @return ModifyElasticBizBandWidthResponse
     */
    CompletableFuture<ModifyElasticBizBandWidthResponse> modifyElasticBizBandWidth(ModifyElasticBizBandWidthRequest request);

    /**
     * <b>description</b> :
     * <p>Both IPv4 and IPv6 instances support burstable QPS.</p>
     * 
     * @param request the request parameters of ModifyElasticBizQps  ModifyElasticBizQpsRequest
     * @return ModifyElasticBizQpsResponse
     */
    CompletableFuture<ModifyElasticBizQpsResponse> modifyElasticBizQps(ModifyElasticBizQpsRequest request);

    /**
     * @param request the request parameters of ModifyFullLogTtl  ModifyFullLogTtlRequest
     * @return ModifyFullLogTtlResponse
     */
    CompletableFuture<ModifyFullLogTtlResponse> modifyFullLogTtl(ModifyFullLogTtlRequest request);

    /**
     * @param request the request parameters of ModifyHeaders  ModifyHeadersRequest
     * @return ModifyHeadersResponse
     */
    CompletableFuture<ModifyHeadersResponse> modifyHeaders(ModifyHeadersRequest request);

    /**
     * @param request the request parameters of ModifyHealthCheckConfig  ModifyHealthCheckConfigRequest
     * @return ModifyHealthCheckConfigResponse
     */
    CompletableFuture<ModifyHealthCheckConfigResponse> modifyHealthCheckConfig(ModifyHealthCheckConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is suitable only for Anti-DDoS Proxy (Chinese Mainland).</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyHttp2Enable  ModifyHttp2EnableRequest
     * @return ModifyHttp2EnableResponse
     */
    CompletableFuture<ModifyHttp2EnableResponse> modifyHttp2Enable(ModifyHttp2EnableRequest request);

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    /**
     * @param request the request parameters of ModifyInstanceRemark  ModifyInstanceRemarkRequest
     * @return ModifyInstanceRemarkResponse
     */
    CompletableFuture<ModifyInstanceRemarkResponse> modifyInstanceRemark(ModifyInstanceRemarkRequest request);

    /**
     * @param request the request parameters of ModifyNetworkRuleAttribute  ModifyNetworkRuleAttributeRequest
     * @return ModifyNetworkRuleAttributeResponse
     */
    CompletableFuture<ModifyNetworkRuleAttributeResponse> modifyNetworkRuleAttribute(ModifyNetworkRuleAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This feature is available only for a website that supports HTTPS. If HTTPS is selected for Protocol, we recommend that you enable this feature.</p>
     * 
     * @param request the request parameters of ModifyOcspStatus  ModifyOcspStatusRequest
     * @return ModifyOcspStatusResponse
     */
    CompletableFuture<ModifyOcspStatusResponse> modifyOcspStatus(ModifyOcspStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be used with Terraform. For more information, see <a href="https://help.aliyun.com/document_detail/95820.html">What is Terraform</a>.</p>
     * 
     * @param request the request parameters of ModifyPort  ModifyPortRequest
     * @return ModifyPortResponse
     */
    CompletableFuture<ModifyPortResponse> modifyPort(ModifyPortRequest request);

    /**
     * @param request the request parameters of ModifyPortAutoCcStatus  ModifyPortAutoCcStatusRequest
     * @return ModifyPortAutoCcStatusResponse
     */
    CompletableFuture<ModifyPortAutoCcStatusResponse> modifyPortAutoCcStatus(ModifyPortAutoCcStatusRequest request);

    /**
     * @param request the request parameters of ModifyQpsMode  ModifyQpsModeRequest
     * @return ModifyQpsModeResponse
     */
    CompletableFuture<ModifyQpsModeResponse> modifyQpsMode(ModifyQpsModeRequest request);

    /**
     * @param request the request parameters of ModifySceneDefensePolicy  ModifySceneDefensePolicyRequest
     * @return ModifySceneDefensePolicyResponse
     */
    CompletableFuture<ModifySceneDefensePolicyResponse> modifySceneDefensePolicy(ModifySceneDefensePolicyRequest request);

    /**
     * @param request the request parameters of ModifySchedulerRule  ModifySchedulerRuleRequest
     * @return ModifySchedulerRuleResponse
     */
    CompletableFuture<ModifySchedulerRuleResponse> modifySchedulerRule(ModifySchedulerRuleRequest request);

    /**
     * @param request the request parameters of ModifyTlsConfig  ModifyTlsConfigRequest
     * @return ModifyTlsConfigResponse
     */
    CompletableFuture<ModifyTlsConfigResponse> modifyTlsConfig(ModifyTlsConfigRequest request);

    /**
     * @param request the request parameters of ModifyWebAIProtectMode  ModifyWebAIProtectModeRequest
     * @return ModifyWebAIProtectModeResponse
     */
    CompletableFuture<ModifyWebAIProtectModeResponse> modifyWebAIProtectMode(ModifyWebAIProtectModeRequest request);

    /**
     * @param request the request parameters of ModifyWebAIProtectSwitch  ModifyWebAIProtectSwitchRequest
     * @return ModifyWebAIProtectSwitchResponse
     */
    CompletableFuture<ModifyWebAIProtectSwitchResponse> modifyWebAIProtectSwitch(ModifyWebAIProtectSwitchRequest request);

    /**
     * @param request the request parameters of ModifyWebAccessMode  ModifyWebAccessModeRequest
     * @return ModifyWebAccessModeResponse
     */
    CompletableFuture<ModifyWebAccessModeResponse> modifyWebAccessMode(ModifyWebAccessModeRequest request);

    /**
     * @param request the request parameters of ModifyWebAreaBlock  ModifyWebAreaBlockRequest
     * @return ModifyWebAreaBlockResponse
     */
    CompletableFuture<ModifyWebAreaBlockResponse> modifyWebAreaBlock(ModifyWebAreaBlockRequest request);

    /**
     * <b>description</b> :
     * <p>This operation sets the status of the Location Blacklist feature for website services (for domain names).</p>
     * <h3>QPS limits</h3>
     * <p>The single-user queries per second (QPS) limit for this operation is 10. API calls that exceed the limit are throttled, which may affect your business. We recommend that you call this operation at an appropriate rate.</p>
     * 
     * @param request the request parameters of ModifyWebAreaBlockSwitch  ModifyWebAreaBlockSwitchRequest
     * @return ModifyWebAreaBlockSwitchResponse
     */
    CompletableFuture<ModifyWebAreaBlockSwitchResponse> modifyWebAreaBlockSwitch(ModifyWebAreaBlockSwitchRequest request);

    /**
     * @param request the request parameters of ModifyWebCCGlobalSwitch  ModifyWebCCGlobalSwitchRequest
     * @return ModifyWebCCGlobalSwitchResponse
     */
    CompletableFuture<ModifyWebCCGlobalSwitchResponse> modifyWebCCGlobalSwitch(ModifyWebCCGlobalSwitchRequest request);

    /**
     * @deprecated OpenAPI ModifyWebCCRule is deprecated, please use ddoscoo::2020-01-01::ConfigWebCCRuleV2 instead.  * @param request  the request parameters of ModifyWebCCRule  ModifyWebCCRuleRequest
     * @return ModifyWebCCRuleResponse
     */
    @Deprecated
    CompletableFuture<ModifyWebCCRuleResponse> modifyWebCCRule(ModifyWebCCRuleRequest request);

    /**
     * @param request the request parameters of ModifyWebCacheCustomRule  ModifyWebCacheCustomRuleRequest
     * @return ModifyWebCacheCustomRuleResponse
     */
    CompletableFuture<ModifyWebCacheCustomRuleResponse> modifyWebCacheCustomRule(ModifyWebCacheCustomRuleRequest request);

    /**
     * @param request the request parameters of ModifyWebCacheMode  ModifyWebCacheModeRequest
     * @return ModifyWebCacheModeResponse
     */
    CompletableFuture<ModifyWebCacheModeResponse> modifyWebCacheMode(ModifyWebCacheModeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyWebCacheSwitch operation to enable or disable the Static Page Caching policy for a website.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyWebCacheSwitch  ModifyWebCacheSwitchRequest
     * @return ModifyWebCacheSwitchResponse
     */
    CompletableFuture<ModifyWebCacheSwitchResponse> modifyWebCacheSwitch(ModifyWebCacheSwitchRequest request);

    /**
     * @param request the request parameters of ModifyWebIpSetSwitch  ModifyWebIpSetSwitchRequest
     * @return ModifyWebIpSetSwitchResponse
     */
    CompletableFuture<ModifyWebIpSetSwitchResponse> modifyWebIpSetSwitch(ModifyWebIpSetSwitchRequest request);

    /**
     * @param request the request parameters of ModifyWebPreciseAccessRule  ModifyWebPreciseAccessRuleRequest
     * @return ModifyWebPreciseAccessRuleResponse
     */
    CompletableFuture<ModifyWebPreciseAccessRuleResponse> modifyWebPreciseAccessRule(ModifyWebPreciseAccessRuleRequest request);

    /**
     * @param request the request parameters of ModifyWebPreciseAccessSwitch  ModifyWebPreciseAccessSwitchRequest
     * @return ModifyWebPreciseAccessSwitchResponse
     */
    CompletableFuture<ModifyWebPreciseAccessSwitchResponse> modifyWebPreciseAccessSwitch(ModifyWebPreciseAccessSwitchRequest request);

    /**
     * @param request the request parameters of ModifyWebRule  ModifyWebRuleRequest
     * @return ModifyWebRuleResponse
     */
    CompletableFuture<ModifyWebRuleResponse> modifyWebRule(ModifyWebRuleRequest request);

    /**
     * <b>description</b> :
     * <p>After an Anti-DDoS instance expires, it stops providing DDoS attack protection services. Seven days after expiration, it stops forwarding service traffic.</p>
     * <ul>
     * <li>We recommend that you renew your instance before it expires to avoid impacts on service protection and forwarding. You can call <a href="https://help.aliyun.com/document_detail/91478.html">DescribeInstances</a> to query the expiration time of an instance. To renew the instance, go to the <a href="https://yundun.console.aliyun.com/?p=ddoscoo">Anti-DDoS console</a> to perform the operation.</li>
     * <li>If you do not plan to renew the instance, we recommend that you restore the protected service IP (no longer use the Anti-DDoS IP as the service IP) or service DNS parsing (no longer parse service traffic to the CNAME address of Anti-DDoS) before the Anti-DDoS instance expires. This prevents service traffic from being forwarded to the Anti-DDoS instance and avoids disruption to normal service forwarding when the instance expires.
     * After the instance expires, you can call this operation to release the specified Anti-DDoS instance.<blockquote>
     * <p>Before releasing the specified instance, ensure that you have restored the protected service IP or service DNS parsing.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the SwitchSchedulerRule operation to modify the resources to which service traffic is switched for a scheduling rule. For example, you can switch service traffic to an Anti-DDoS Pro or Anti-DDoS Premium instance for scrubbing or switch the service traffic back to the associated cloud resources.
     * Before you call this operation, you must have created a scheduling rule by calling the <a href="https://help.aliyun.com/document_detail/157479.html">CreateSchedulerRule</a> operation.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of SwitchSchedulerRule  SwitchSchedulerRuleRequest
     * @return SwitchSchedulerRuleResponse
     */
    CompletableFuture<SwitchSchedulerRuleResponse> switchSchedulerRule(SwitchSchedulerRuleRequest request);

}
