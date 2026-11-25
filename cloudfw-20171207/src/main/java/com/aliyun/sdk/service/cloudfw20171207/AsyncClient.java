// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudfw20171207.models.*;
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
     * @param request the request parameters of AddAclBackupData  AddAclBackupDataRequest
     * @return AddAclBackupDataResponse
     */
    CompletableFuture<AddAclBackupDataResponse> addAclBackupData(AddAclBackupDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to create an address book, including IPv4 address books, ECS tag-based address books, IPv6 address books, domain name address books, and ACK address books.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable rate.</p>
     * 
     * @param request the request parameters of AddAddressBook  AddAddressBookRequest
     * @return AddAddressBookResponse
     */
    CompletableFuture<AddAddressBookResponse> addAddressBook(AddAddressBookRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to create a policy that allows, denies, or monitors traffic passing through Cloud Firewall.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of AddControlPolicy  AddControlPolicyRequest
     * @return AddControlPolicyResponse
     */
    CompletableFuture<AddControlPolicyResponse> addControlPolicy(AddControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a DNS firewall access control policy to allow, deny, or monitor traffic that passes through the DNS firewall.</p>
     * <h2>Quotas</h2>
     * <p>DNS firewall policies are counted independently in the DNS policy table (counted separately by IP version), but <strong>share the same quota limit</strong> with Internet access control policies (determined by the Cloud Firewall edition). If the number of address combinations expanded from a single policy exceeds the limit, or the total number of policies exceeds the limit, the system returns ErrorAclExtendedCountExceed (-200139).</p>
     * <blockquote>
     * <p>The DescribeAclCheckQuota operation returns the quota for the number of ACL policy checks, which is unrelated to firewall policy count quota. You cannot use it to predict whether the quota for this operation is sufficient. Check firewall policy count quota in the Cloud Firewall console.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AddDnsFirewallPolicy  AddDnsFirewallPolicyRequest
     * @return AddDnsFirewallPolicyResponse
     */
    CompletableFuture<AddDnsFirewallPolicyResponse> addDnsFirewallPolicy(AddDnsFirewallPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a real-time domain name resolution task for a specified domain name.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Before calling this operation, you must activate Cloud Firewall. You can activate it on the Cloud Firewall buy page (Chinese site: <a href="https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn">https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn</a>; International site: <a href="https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl">https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl</a>).</li>
     * <li>You can call the DescribeUserBuyVersion operation to query the UserStatus parameter. If false is returned, the current account has not purchased or activated Cloud Firewall.</li>
     * </ul>
     * 
     * @param request the request parameters of AddDomainResolveRealtimeTask  AddDomainResolveRealtimeTaskRequest
     * @return AddDomainResolveRealtimeTaskResponse
     */
    CompletableFuture<AddDomainResolveRealtimeTaskResponse> addDomainResolveRealtimeTask(AddDomainResolveRealtimeTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Adds member accounts to Cloud Firewall.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The caller\&quot;s Alibaba Cloud account must be a delegated administrator (DA) or management account (MA) of a resource directory. Otherwise, the ErrorInstanceAliuidNotDaMa (-103313) error is returned. You can call the DescribeInstanceRdAccounts operation to verify the identity of the current account.</li>
     * <li>The UID of the member account to be added must belong to the same resource directory. Otherwise, the ErrorInstanceMemberNotBelongRd (-103308) error is returned.</li>
     * </ul>
     * <h2>Rate limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of AddInstanceMembers  AddInstanceMembersRequest
     * @return AddInstanceMembersResponse
     */
    CompletableFuture<AddInstanceMembersResponse> addInstanceMembers(AddInstanceMembersRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to retrieve the DNS resolution results of a domain name. Currently, only Alibaba Cloud DNS is supported for retrieving resolution results. The domain name to be queried must use Alibaba Cloud DNS to retrieve its resolution results.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user for this operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of AddPrivateDnsDomainName  AddPrivateDnsDomainNameRequest
     * @return AddPrivateDnsDomainNameResponse
     */
    CompletableFuture<AddPrivateDnsDomainNameResponse> addPrivateDnsDomainName(AddPrivateDnsDomainNameRequest request);

    /**
     * @deprecated OpenAPI BatchCopyVpcFirewallControlPolicy is deprecated  * @description This API operation copies all firewall policies from a policy group of the source virtual private cloud (VPC) border firewalls to a policy group of the destination virtual private cloud (VPC) border firewalls.
     * Before performing this operation, back up your firewall policies. For more information about policy backup, see [Policy backup](https://help.aliyun.com/document_detail/170363.html).
     * After this operation is complete, the firewall policies in the policy group of the destination virtual private cloud (VPC) border firewalls are completely replaced by those in the policy group of the source virtual private cloud (VPC) border firewalls.
     * The policy groups of the source and destination virtual private cloud (VPC) border firewalls must belong to the same Alibaba Cloud account.
     * ## QPS limit
     * The queries per second (QPS) limit on this API operation is 10 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API operation at a reasonable rate.
     * 
     * @param request the request parameters of BatchCopyVpcFirewallControlPolicy  BatchCopyVpcFirewallControlPolicyRequest
     * @return BatchCopyVpcFirewallControlPolicyResponse
     */
    @Deprecated
    CompletableFuture<BatchCopyVpcFirewallControlPolicyResponse> batchCopyVpcFirewallControlPolicy(BatchCopyVpcFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of BatchDeleteVpcFirewallControlPolicy  BatchDeleteVpcFirewallControlPolicyRequest
     * @return BatchDeleteVpcFirewallControlPolicyResponse
     */
    CompletableFuture<BatchDeleteVpcFirewallControlPolicyResponse> batchDeleteVpcFirewallControlPolicy(BatchDeleteVpcFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of ClearLogStoreStorage  ClearLogStoreStorageRequest
     * @return ClearLogStoreStorageResponse
     */
    CompletableFuture<ClearLogStoreStorageResponse> clearLogStoreStorage(ClearLogStoreStorageRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of CreateAckClusterConnector  CreateAckClusterConnectorRequest
     * @return CreateAckClusterConnectorResponse
     */
    CompletableFuture<CreateAckClusterConnectorResponse> createAckClusterConnector(CreateAckClusterConnectorRequest request);

    /**
     * @param request the request parameters of CreateAclCheck  CreateAclCheckRequest
     * @return CreateAclCheckResponse
     */
    CompletableFuture<CreateAclCheckResponse> createAclCheck(CreateAclCheckRequest request);

    /**
     * @param request the request parameters of CreateApplicationCustomRules  CreateApplicationCustomRulesRequest
     * @return CreateApplicationCustomRulesResponse
     */
    CompletableFuture<CreateApplicationCustomRulesResponse> createApplicationCustomRules(CreateApplicationCustomRulesRequest request);

    /**
     * @param request the request parameters of CreateApplicationTemplate  CreateApplicationTemplateRequest
     * @return CreateApplicationTemplateResponse
     */
    CompletableFuture<CreateApplicationTemplateResponse> createApplicationTemplate(CreateApplicationTemplateRequest request);

    /**
     * @param request the request parameters of CreateDownloadTask  CreateDownloadTaskRequest
     * @return CreateDownloadTaskResponse
     */
    CompletableFuture<CreateDownloadTaskResponse> createDownloadTask(CreateDownloadTaskRequest request);

    /**
     * @param request the request parameters of CreateInstanceSyncTask  CreateInstanceSyncTaskRequest
     * @return CreateInstanceSyncTaskResponse
     */
    CompletableFuture<CreateInstanceSyncTaskResponse> createInstanceSyncTask(CreateInstanceSyncTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an IPS private IP tracing association for an Internet NAT gateway that is protected by Cloud Firewall.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The target NAT gateway must be managed by Cloud Firewall and asset synchronization must be completed. Asset synchronization is an asynchronous task. If you call this operation before the synchronization of a newly created NAT gateway is completed, the error code -103204 is returned.</li>
     * <li>If SNAT is configured for the NAT gateway, you must enable session logs first. Otherwise, the error code -103583 is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpsPrivateAssoc  CreateIpsPrivateAssocRequest
     * @return CreateIpsPrivateAssocResponse
     */
    CompletableFuture<CreateIpsPrivateAssocResponse> createIpsPrivateAssoc(CreateIpsPrivateAssocRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a policy to allow, deny, or monitor traffic that passes through a NAT firewall.</p>
     * 
     * @param request the request parameters of CreateNatFirewallControlPolicy  CreateNatFirewallControlPolicyRequest
     * @return CreateNatFirewallControlPolicyResponse
     */
    CompletableFuture<CreateNatFirewallControlPolicyResponse> createNatFirewallControlPolicy(CreateNatFirewallControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a policy that allows, denies, or monitors traffic passing through a NAT firewall.</p>
     * 
     * @param request the request parameters of CreateNatFirewallPreCheck  CreateNatFirewallPreCheckRequest
     * @return CreateNatFirewallPreCheckResponse
     */
    CompletableFuture<CreateNatFirewallPreCheckResponse> createNatFirewallPreCheck(CreateNatFirewallPreCheckRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a NAT firewall asset synchronization task.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Before calling this operation, ensure that your account has purchased and activated a Cloud Firewall instance. Both subscription and pay-as-you-go billing methods are supported.</li>
     * <li>You can activate Cloud Firewall on the buy page (China site: <a href="https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn">https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn</a>; International site: <a href="https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl">https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl</a>). After activation, call the DescribeUserBuyVersion operation and check the UserStatus parameter to confirm the activation status.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNatFirewallSyncTask  CreateNatFirewallSyncTaskRequest
     * @return CreateNatFirewallSyncTaskResponse
     */
    CompletableFuture<CreateNatFirewallSyncTaskResponse> createNatFirewallSyncTask(CreateNatFirewallSyncTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a private DNS firewall endpoint. When you call this operation, you must specify PrimaryVSwitchId. The region and zone of the primary and secondary vSwitches must support private DNS firewalls.</p>
     * 
     * @param request the request parameters of CreatePrivateDnsEndpoint  CreatePrivateDnsEndpointRequest
     * @return CreatePrivateDnsEndpointResponse
     */
    CompletableFuture<CreatePrivateDnsEndpointResponse> createPrivateDnsEndpoint(CreatePrivateDnsEndpointRequest request);

    /**
     * @param request the request parameters of CreateSecurityProxy  CreateSecurityProxyRequest
     * @return CreateSecurityProxyResponse
     */
    CompletableFuture<CreateSecurityProxyResponse> createSecurityProxy(CreateSecurityProxyRequest request);

    /**
     * @param request the request parameters of CreateSlsLogDispatch  CreateSlsLogDispatchRequest
     * @return CreateSlsLogDispatchResponse
     */
    CompletableFuture<CreateSlsLogDispatchResponse> createSlsLogDispatch(CreateSlsLogDispatchRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a virtual private cloud (VPC) firewall for an Enterprise Edition transit router (TR). Before calling this operation, you must create a CEN instance and an Enterprise Edition transit router in the CEN console, and synchronize the transit router to Cloud Firewall. Then, call this operation by using the CenId, TransitRouterId, RegionNo, and RouteMode parameters.</p>
     * 
     * @param request the request parameters of CreateTrFirewallV2  CreateTrFirewallV2Request
     * @return CreateTrFirewallV2Response
     */
    CompletableFuture<CreateTrFirewallV2Response> createTrFirewallV2(CreateTrFirewallV2Request request);

    /**
     * @param request the request parameters of CreateTrFirewallV2RoutePolicy  CreateTrFirewallV2RoutePolicyRequest
     * @return CreateTrFirewallV2RoutePolicyResponse
     */
    CompletableFuture<CreateTrFirewallV2RoutePolicyResponse> createTrFirewallV2RoutePolicy(CreateTrFirewallV2RoutePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to create virtual private cloud (VPC) firewalls at the border for VPC-connected instances in a CEN. The virtual private cloud (VPC) firewalls protect mutual access traffic between network instances (including VPCs, VBRs, and CCNs) in the CEN and a specified VPC. It does not protect mutual access traffic between VBRs, between CCNs, or between a VBR and a CCN. Prerequisites: (1) Invoke the CreateCen operation to create a CEN. (2) Create a VPC (at least two VPCs are required). (3) Invoke the AttachCenChildInstance operation to associate the VPCs with the CEN. (4) The CEN has no conflicting route maps or transit router (TR) routing. For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">Limits on virtual private cloud (VPC) firewalls</a>.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user is 10 calls per second. If you exceed the limit, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallCenConfigure  CreateVpcFirewallCenConfigureRequest
     * @return CreateVpcFirewallCenConfigureResponse
     */
    CompletableFuture<CreateVpcFirewallCenConfigureResponse> createVpcFirewallCenConfigure(CreateVpcFirewallCenConfigureRequest request);

    /**
     * @deprecated OpenAPI CreateVpcFirewallCenManualConfigure is deprecated  * @description This operation is typically used to create a VPC firewall for VPC-connected instances in a Cloud Enterprise Network (CEN). The VPC firewall protects the traffic between network instances in the CEN and the specified VPC. The network instances include VPCs, virtual border routers (VBRs), and Cloud Connect Networks (CCNs). The VPC firewall does not protect the traffic between VBRs, between CCNs, or between a VBR and a CCN. For more information, see [Limits on VPC firewalls](https://help.aliyun.com/document_detail/172295.html).
     * ## QPS limits
     * The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Invoke the API at a reasonable frequency.
     * 
     * @param request the request parameters of CreateVpcFirewallCenManualConfigure  CreateVpcFirewallCenManualConfigureRequest
     * @return CreateVpcFirewallCenManualConfigureResponse
     */
    @Deprecated
    CompletableFuture<CreateVpcFirewallCenManualConfigureResponse> createVpcFirewallCenManualConfigure(CreateVpcFirewallCenManualConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to create a VPC firewall. This virtual private cloud (VPC) firewall protects traffic between two VPCs connected through Express Connect. This VPC firewall does not support protection for cross-region traffic, cross-account traffic, or traffic between a VPC and a virtual border router (VBR). For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h3>Rate limit</h3>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API invocations are throttled, which may affect your business. Manage your invocations appropriately.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallConfigure  CreateVpcFirewallConfigureRequest
     * @return CreateVpcFirewallConfigureResponse
     */
    CompletableFuture<CreateVpcFirewallConfigureResponse> createVpcFirewallConfigure(CreateVpcFirewallConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to add an access control policy to a specified virtual private cloud (VPC) firewall policy group. Different access control policies are used when a VPC firewall protects traffic between two VPCs connected through a Cloud Enterprise Network (CEN) instance or traffic between two VPCs connected through an Express Connect circuit.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the number of calls exceeds the limit, throttling is triggered, which may affect your business. Invoke this operation as appropriate.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallControlPolicy  CreateVpcFirewallControlPolicyRequest
     * @return CreateVpcFirewallControlPolicyResponse
     */
    CompletableFuture<CreateVpcFirewallControlPolicyResponse> createVpcFirewallControlPolicy(CreateVpcFirewallControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a policy to allow, deny, or monitor traffic passing through a NAT firewall.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallPrecheck  CreateVpcFirewallPrecheckRequest
     * @return CreateVpcFirewallPrecheckResponse
     */
    CompletableFuture<CreateVpcFirewallPrecheckResponse> createVpcFirewallPrecheck(CreateVpcFirewallPrecheckRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to create a VPC firewall. The VPC firewall protects traffic between two VPCs that are connected by using Express Connect. The VPC firewall does not support protecting cross-region or cross-account traffic between VPCs, or traffic between a VPC and a virtual border router (VBR). For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">Limits on VPC firewalls</a>.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit on this operation is 10 queries per second per account. API calls that exceed this limit are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallTask  CreateVpcFirewallTaskRequest
     * @return CreateVpcFirewallTaskResponse
     */
    CompletableFuture<CreateVpcFirewallTaskResponse> createVpcFirewallTask(CreateVpcFirewallTaskRequest request);

    /**
     * @param request the request parameters of CreateWebFilterRules  CreateWebFilterRulesRequest
     * @return CreateWebFilterRulesResponse
     */
    CompletableFuture<CreateWebFilterRulesResponse> createWebFilterRules(CreateWebFilterRulesRequest request);

    /**
     * @param request the request parameters of CreateWebFilterTemplate  CreateWebFilterTemplateRequest
     * @return CreateWebFilterTemplateResponse
     */
    CompletableFuture<CreateWebFilterTemplateResponse> createWebFilterTemplate(CreateWebFilterTemplateRequest request);

    /**
     * <b>description</b> :
     * <h2>Rate limit</h2>
     * <p>The rate limit for this API operation is 10 queries per second (QPS) per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DeleteAckClusterConnector  DeleteAckClusterConnectorRequest
     * @return DeleteAckClusterConnectorResponse
     */
    CompletableFuture<DeleteAckClusterConnectorResponse> deleteAckClusterConnector(DeleteAckClusterConnectorRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to delete address books in access control.</p>
     * <h2>Rate limits</h2>
     * <p>The rate limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeleteAclBackupData  DeleteAclBackupDataRequest
     * @return DeleteAclBackupDataResponse
     */
    CompletableFuture<DeleteAclBackupDataResponse> deleteAclBackupData(DeleteAclBackupDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to delete an address book from access control.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of DeleteAddressBook  DeleteAddressBookRequest
     * @return DeleteAddressBookResponse
     */
    CompletableFuture<DeleteAddressBookResponse> deleteAddressBook(DeleteAddressBookRequest request);

    /**
     * @param request the request parameters of DeleteApplicationCustomRules  DeleteApplicationCustomRulesRequest
     * @return DeleteApplicationCustomRulesResponse
     */
    CompletableFuture<DeleteApplicationCustomRulesResponse> deleteApplicationCustomRules(DeleteApplicationCustomRulesRequest request);

    /**
     * @param request the request parameters of DeleteApplicationTemplate  DeleteApplicationTemplateRequest
     * @return DeleteApplicationTemplateResponse
     */
    CompletableFuture<DeleteApplicationTemplateResponse> deleteApplicationTemplate(DeleteApplicationTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to delete an access control policy whose traffic direction is inbound or outbound.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 requests per second. If the limit is exceeded, API requests are throttled, which may affect your business. Invoke this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DeleteControlPolicy  DeleteControlPolicyRequest
     * @return DeleteControlPolicyResponse
     */
    CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request);

    /**
     * @param request the request parameters of DeleteControlPolicyTemplate  DeleteControlPolicyTemplateRequest
     * @return DeleteControlPolicyTemplateResponse
     */
    CompletableFuture<DeleteControlPolicyTemplateResponse> deleteControlPolicyTemplate(DeleteControlPolicyTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a policy to allow, deny, or monitor traffic that passes through a NAT firewall.</p>
     * 
     * @param request the request parameters of DeleteDnsFirewallPolicy  DeleteDnsFirewallPolicyRequest
     * @return DeleteDnsFirewallPolicyResponse
     */
    CompletableFuture<DeleteDnsFirewallPolicyResponse> deleteDnsFirewallPolicy(DeleteDnsFirewallPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Calling this operation immediately deletes the file download task and the downloaded file.</p>
     * <blockquote>
     * <p>Danger: The delete operation deletes the corresponding task and file. <strong>The file can no longer be downloaded by using the existing download link. This operation is irreversible. Proceed with caution.</strong>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDownloadTask  DeleteDownloadTaskRequest
     * @return DeleteDownloadTaskResponse
     */
    CompletableFuture<DeleteDownloadTaskResponse> deleteDownloadTask(DeleteDownloadTaskRequest request);

    /**
     * @param request the request parameters of DeleteFirewallV2RoutePolicies  DeleteFirewallV2RoutePoliciesRequest
     * @return DeleteFirewallV2RoutePoliciesResponse
     */
    CompletableFuture<DeleteFirewallV2RoutePoliciesResponse> deleteFirewallV2RoutePolicies(DeleteFirewallV2RoutePoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DeleteInstanceMembers operation to delete up to 20 Cloud Firewall member accounts at a time. Separate multiple member account UIDs with commas (,). After a member account is deleted, Cloud Firewall cannot access the cloud resources of the deleted member account. Proceed with caution. Before deleting member accounts, call the <a href="https://help.aliyun.com/document_detail/271704.html">DescribeInstanceMembers</a> operation to obtain the information about Cloud Firewall member accounts.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeleteInstanceMembers  DeleteInstanceMembersRequest
     * @return DeleteInstanceMembersResponse
     */
    CompletableFuture<DeleteInstanceMembersResponse> deleteInstanceMembers(DeleteInstanceMembersRequest request);

    /**
     * @param request the request parameters of DeleteIpsPrivateAssoc  DeleteIpsPrivateAssocRequest
     * @return DeleteIpsPrivateAssocResponse
     */
    CompletableFuture<DeleteIpsPrivateAssocResponse> deleteIpsPrivateAssoc(DeleteIpsPrivateAssocRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to delete an access control policy for outbound traffic of a NAT firewall.</p>
     * 
     * @param request the request parameters of DeleteNatFirewallControlPolicy  DeleteNatFirewallControlPolicyRequest
     * @return DeleteNatFirewallControlPolicyResponse
     */
    CompletableFuture<DeleteNatFirewallControlPolicyResponse> deleteNatFirewallControlPolicy(DeleteNatFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of DeleteNatFirewallControlPolicyBatch  DeleteNatFirewallControlPolicyBatchRequest
     * @return DeleteNatFirewallControlPolicyBatchResponse
     */
    CompletableFuture<DeleteNatFirewallControlPolicyBatchResponse> deleteNatFirewallControlPolicyBatch(DeleteNatFirewallControlPolicyBatchRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is typically used to retrieve the DNS resolution results of a domain name. Currently, resolution results can only be retrieved from Alibaba Cloud DNS. To retrieve the resolution results, the domain name to be queried must use Alibaba Cloud DNS.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DeletePrivateDnsAllDomainName  DeletePrivateDnsAllDomainNameRequest
     * @return DeletePrivateDnsAllDomainNameResponse
     */
    CompletableFuture<DeletePrivateDnsAllDomainNameResponse> deletePrivateDnsAllDomainName(DeletePrivateDnsAllDomainNameRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a domain name that requires private DNS resolution.</p>
     * 
     * @param request the request parameters of DeletePrivateDnsDomainName  DeletePrivateDnsDomainNameRequest
     * @return DeletePrivateDnsDomainNameResponse
     */
    CompletableFuture<DeletePrivateDnsDomainNameResponse> deletePrivateDnsDomainName(DeletePrivateDnsDomainNameRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a policy to allow, deny, or monitor traffic that passes through a NAT firewall.</p>
     * 
     * @param request the request parameters of DeletePrivateDnsEndpoint  DeletePrivateDnsEndpointRequest
     * @return DeletePrivateDnsEndpointResponse
     */
    CompletableFuture<DeletePrivateDnsEndpointResponse> deletePrivateDnsEndpoint(DeletePrivateDnsEndpointRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Before you call this API, make sure that your account has purchased Cloud Firewall. If you call this API without purchasing Cloud Firewall, error code <code>202</code> and error message <code>not buy user</code> are returned.</li>
     * <li>You can call <a href="~~DescribeUserBuyVersion~~">DescribeUserBuyVersion</a> to query the purchase status. The <code>UserStatus</code> field in the response indicates whether the Cloud Firewall service is valid. A value of <code>false</code> indicates that the service is not activated or has expired.</li>
     * <li>Activate Cloud Firewall:<ul>
     * <li>China site: <a href="https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn">https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn</a></li>
     * <li>International site: <a href="https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl">https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSecurityProxy  DeleteSecurityProxyRequest
     * @return DeleteSecurityProxyResponse
     */
    CompletableFuture<DeleteSecurityProxyResponse> deleteSecurityProxy(DeleteSecurityProxyRequest request);

    /**
     * @param request the request parameters of DeleteTrFirewallV2  DeleteTrFirewallV2Request
     * @return DeleteTrFirewallV2Response
     */
    CompletableFuture<DeleteTrFirewallV2Response> deleteTrFirewallV2(DeleteTrFirewallV2Request request);

    /**
     * <b>description</b> :
     * <p>This operation deletes VPC border firewalls. The VPC border firewalls protect mutual access traffic between network instances in a CEN and a specified VPC. Network instances include VPCs, virtual border routers (VBRs), and Cloud Connect Networks (CCNs).
     * Before you invoke this operation, make sure that you have invoked the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation to create VPC border firewalls.</p>
     * <h2>Rate limit</h2>
     * <p>You can invoke this operation up to 10 times per second per account. If the number of invocations per second exceeds the limit, throttling is triggered, which may affect your business. Invoke this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallCenConfigure  DeleteVpcFirewallCenConfigureRequest
     * @return DeleteVpcFirewallCenConfigureResponse
     */
    CompletableFuture<DeleteVpcFirewallCenConfigureResponse> deleteVpcFirewallCenConfigure(DeleteVpcFirewallCenConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used to delete virtual private cloud (VPC) firewalls at the border. The virtual private cloud (VPC) firewalls protect traffic between two VPCs connected over Express Connect.
     * Before you invoke this operation, you must invoke the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation to create virtual private cloud (VPC) firewalls.
     * This operation is asynchronous. After you successfully invoke this operation, the status changes to deleting. You must perform polling on the DescribeVpcFirewallList operation until the target VpcFirewallId disappears. The virtual private cloud (VPC) firewalls to be deleted must be in the opened or closed state. Firewalls in states such as notconfigured or deleting cannot be deleted, and an ErrorFirewallStatus fault is returned.</p>
     * <h2>Rate limit</h2>
     * <p>The rate limit for this operation is 10 queries per second (QPS) per account. Exceeding this limit triggers throttling, which may affect your business. Plan your API invocations accordingly.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallConfigure  DeleteVpcFirewallConfigureRequest
     * @return DeleteVpcFirewallConfigureResponse
     */
    CompletableFuture<DeleteVpcFirewallConfigureResponse> deleteVpcFirewallConfigure(DeleteVpcFirewallConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to delete the access control policy of a specified VPC firewall policy group. VPC firewall instances that protect Cloud Enterprise Network (CEN) instances and VPC firewall instances that protect Express Connect circuits use a different access control policy.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API invocations are throttled, which may affect your services. Invoke the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallControlPolicy  DeleteVpcFirewallControlPolicyRequest
     * @return DeleteVpcFirewallControlPolicyResponse
     */
    CompletableFuture<DeleteVpcFirewallControlPolicyResponse> deleteVpcFirewallControlPolicy(DeleteVpcFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of DeleteWebFilterRules  DeleteWebFilterRulesRequest
     * @return DeleteWebFilterRulesResponse
     */
    CompletableFuture<DeleteWebFilterRulesResponse> deleteWebFilterRules(DeleteWebFilterRulesRequest request);

    /**
     * @param request the request parameters of DeleteWebFilterTemplate  DeleteWebFilterTemplateRequest
     * @return DeleteWebFilterTemplateResponse
     */
    CompletableFuture<DeleteWebFilterTemplateResponse> deleteWebFilterTemplate(DeleteWebFilterTemplateRequest request);

    /**
     * @param request the request parameters of DescribeACLProtectTrend  DescribeACLProtectTrendRequest
     * @return DescribeACLProtectTrendResponse
     */
    CompletableFuture<DescribeACLProtectTrendResponse> describeACLProtectTrend(DescribeACLProtectTrendRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical scope covers the current Cloud Firewall instance of the user, including all data since the purchase date.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Before you call this operation, the account must have purchased Purchase Cloud Firewall instance. If no instance is purchased, the operation returns the error code <code>202</code>.</li>
     * <li>You can call <a href="~~DescribeUserBuyVersion~~">DescribeUserBuyVersion</a> to query the purchase status. The <code>UserStatus</code> field in the response indicates whether the Cloud Firewall instance is valid. A value of <code>false</code> indicates that the instance is invalid or not activated.</li>
     * <li>Purchase Purchase Cloud Firewall instance:<ul>
     * <li>China site: <a href="https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn">https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn</a></li>
     * <li>International site: <a href="https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl">https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAITrafficAnalysisStatus  DescribeAITrafficAnalysisStatusRequest
     * @return DescribeAITrafficAnalysisStatusResponse
     */
    CompletableFuture<DescribeAITrafficAnalysisStatusResponse> describeAITrafficAnalysisStatus(DescribeAITrafficAnalysisStatusRequest request);

    /**
     * @param request the request parameters of DescribeAccessInstanceRegionList  DescribeAccessInstanceRegionListRequest
     * @return DescribeAccessInstanceRegionListResponse
     */
    CompletableFuture<DescribeAccessInstanceRegionListResponse> describeAccessInstanceRegionList(DescribeAccessInstanceRegionListRequest request);

    /**
     * @param request the request parameters of DescribeAccessInstanceTask  DescribeAccessInstanceTaskRequest
     * @return DescribeAccessInstanceTaskResponse
     */
    CompletableFuture<DescribeAccessInstanceTaskResponse> describeAccessInstanceTask(DescribeAccessInstanceTaskRequest request);

    /**
     * @param request the request parameters of DescribeAccessInstanceVSwitchList  DescribeAccessInstanceVSwitchListRequest
     * @return DescribeAccessInstanceVSwitchListResponse
     */
    CompletableFuture<DescribeAccessInstanceVSwitchListResponse> describeAccessInstanceVSwitchList(DescribeAccessInstanceVSwitchListRequest request);

    /**
     * @param request the request parameters of DescribeAccessInstanceVpcList  DescribeAccessInstanceVpcListRequest
     * @return DescribeAccessInstanceVpcListResponse
     */
    CompletableFuture<DescribeAccessInstanceVpcListResponse> describeAccessInstanceVpcList(DescribeAccessInstanceVpcListRequest request);

    /**
     * @param request the request parameters of DescribeAccessInstanceZoneList  DescribeAccessInstanceZoneListRequest
     * @return DescribeAccessInstanceZoneListResponse
     */
    CompletableFuture<DescribeAccessInstanceZoneListResponse> describeAccessInstanceZoneList(DescribeAccessInstanceZoneListRequest request);

    /**
     * @param request the request parameters of DescribeAckClusterConnector  DescribeAckClusterConnectorRequest
     * @return DescribeAckClusterConnectorResponse
     */
    CompletableFuture<DescribeAckClusterConnectorResponse> describeAckClusterConnector(DescribeAckClusterConnectorRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The rate limit for this API operation is 10 queries per second (QPS) per user. If you exceed the limit, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeAckClusterConnectors  DescribeAckClusterConnectorsRequest
     * @return DescribeAckClusterConnectorsResponse
     */
    CompletableFuture<DescribeAckClusterConnectorsResponse> describeAckClusterConnectors(DescribeAckClusterConnectorsRequest request);

    /**
     * @param request the request parameters of DescribeAckClusterNamespaces  DescribeAckClusterNamespacesRequest
     * @return DescribeAckClusterNamespacesResponse
     */
    CompletableFuture<DescribeAckClusterNamespacesResponse> describeAckClusterNamespaces(DescribeAckClusterNamespacesRequest request);

    /**
     * @param request the request parameters of DescribeAckClusterPodLabels  DescribeAckClusterPodLabelsRequest
     * @return DescribeAckClusterPodLabelsResponse
     */
    CompletableFuture<DescribeAckClusterPodLabelsResponse> describeAckClusterPodLabels(DescribeAckClusterPodLabelsRequest request);

    /**
     * @param request the request parameters of DescribeAckClusters  DescribeAckClustersRequest
     * @return DescribeAckClustersResponse
     */
    CompletableFuture<DescribeAckClustersResponse> describeAckClusters(DescribeAckClustersRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user for this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeAclApps  DescribeAclAppsRequest
     * @return DescribeAclAppsResponse
     */
    CompletableFuture<DescribeAclAppsResponse> describeAclApps(DescribeAclAppsRequest request);

    /**
     * @param request the request parameters of DescribeAclBackupList  DescribeAclBackupListRequest
     * @return DescribeAclBackupListResponse
     */
    CompletableFuture<DescribeAclBackupListResponse> describeAclBackupList(DescribeAclBackupListRequest request);

    /**
     * <b>description</b> :
     * <h2>Rate limit</h2>
     * <p>The rate limit for this API operation is 10 queries per second (QPS) per user. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeAclCheck  DescribeAclCheckRequest
     * @return DescribeAclCheckResponse
     */
    CompletableFuture<DescribeAclCheckResponse> describeAclCheck(DescribeAclCheckRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The QPS limit per user for this API operation is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeAclCheckQuota  DescribeAclCheckQuotaRequest
     * @return DescribeAclCheckQuotaResponse
     */
    CompletableFuture<DescribeAclCheckQuotaResponse> describeAclCheckQuota(DescribeAclCheckQuotaRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeAclChecks  DescribeAclChecksRequest
     * @return DescribeAclChecksResponse
     */
    CompletableFuture<DescribeAclChecksResponse> describeAclChecks(DescribeAclChecksRequest request);

    /**
     * <b>description</b> :
     * <h2>Rate limit</h2>
     * <p>The rate limit for this API operation is 10 queries per second (QPS) per user. Exceeding this limit triggers throttling, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeAclRuleCount  DescribeAclRuleCountRequest
     * @return DescribeAclRuleCountResponse
     */
    CompletableFuture<DescribeAclRuleCountResponse> describeAclRuleCount(DescribeAclRuleCountRequest request);

    /**
     * <b>description</b> :
     * <h2>Rate limit</h2>
     * <p>The rate limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeAclWhitelist  DescribeAclWhitelistRequest
     * @return DescribeAclWhitelistResponse
     */
    CompletableFuture<DescribeAclWhitelistResponse> describeAclWhitelist(DescribeAclWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the details of access control policy address books.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeAddressBook  DescribeAddressBookRequest
     * @return DescribeAddressBookResponse
     */
    CompletableFuture<DescribeAddressBookResponse> describeAddressBook(DescribeAddressBookRequest request);

    /**
     * @param request the request parameters of DescribeApplicationStatistics  DescribeApplicationStatisticsRequest
     * @return DescribeApplicationStatisticsResponse
     */
    CompletableFuture<DescribeApplicationStatisticsResponse> describeApplicationStatistics(DescribeApplicationStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>This API is generally used to query information about assets protected by Cloud Firewall with pagination.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this API is 10 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please make calls appropriately.</p>
     * 
     * @param request the request parameters of DescribeAssetList  DescribeAssetListRequest
     * @return DescribeAssetListResponse
     */
    CompletableFuture<DescribeAssetListResponse> describeAssetList(DescribeAssetListRequest request);

    /**
     * @param request the request parameters of DescribeAssetRiskList  DescribeAssetRiskListRequest
     * @return DescribeAssetRiskListResponse
     */
    CompletableFuture<DescribeAssetRiskListResponse> describeAssetRiskList(DescribeAssetRiskListRequest request);

    /**
     * @param request the request parameters of DescribeAssetStatistic  DescribeAssetStatisticRequest
     * @return DescribeAssetStatisticResponse
     */
    CompletableFuture<DescribeAssetStatisticResponse> describeAssetStatistic(DescribeAssetStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to perform paging queries on the information about assets protected by Cloud Firewall.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Invoke the API at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeAttackAppCategory  DescribeAttackAppCategoryRequest
     * @return DescribeAttackAppCategoryResponse
     */
    CompletableFuture<DescribeAttackAppCategoryResponse> describeAttackAppCategory(DescribeAttackAppCategoryRequest request);

    /**
     * @param request the request parameters of DescribeBatchSlsDispatchStatus  DescribeBatchSlsDispatchStatusRequest
     * @return DescribeBatchSlsDispatchStatusResponse
     */
    CompletableFuture<DescribeBatchSlsDispatchStatusResponse> describeBatchSlsDispatchStatus(DescribeBatchSlsDispatchStatusRequest request);

    /**
     * @deprecated OpenAPI DescribeCfwRiskLevelSummary is deprecated  * @param request  the request parameters of DescribeCfwRiskLevelSummary  DescribeCfwRiskLevelSummaryRequest
     * @return DescribeCfwRiskLevelSummaryResponse
     */
    @Deprecated
    CompletableFuture<DescribeCfwRiskLevelSummaryResponse> describeCfwRiskLevelSummary(DescribeCfwRiskLevelSummaryRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user for this API operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeClearAuthInfo  DescribeClearAuthInfoRequest
     * @return DescribeClearAuthInfoResponse
     */
    CompletableFuture<DescribeClearAuthInfoResponse> describeClearAuthInfo(DescribeClearAuthInfoRequest request);

    /**
     * @param request the request parameters of DescribeConfiguredDestinationIP  DescribeConfiguredDestinationIPRequest
     * @return DescribeConfiguredDestinationIPResponse
     */
    CompletableFuture<DescribeConfiguredDestinationIPResponse> describeConfiguredDestinationIP(DescribeConfiguredDestinationIPRequest request);

    /**
     * @param request the request parameters of DescribeConfiguredDomainNames  DescribeConfiguredDomainNamesRequest
     * @return DescribeConfiguredDomainNamesResponse
     */
    CompletableFuture<DescribeConfiguredDomainNamesResponse> describeConfiguredDomainNames(DescribeConfiguredDomainNamesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used for paging and paged query of access control policy information.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user is 10 calls per second. If you invoke the API and exceed the limit, API calls are throttled, which may affect your business. Invoke the operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeControlPolicy  DescribeControlPolicyRequest
     * @return DescribeControlPolicyResponse
     */
    CompletableFuture<DescribeControlPolicyResponse> describeControlPolicy(DescribeControlPolicyRequest request);

    /**
     * @param request the request parameters of DescribeControlPolicyDomainResolve  DescribeControlPolicyDomainResolveRequest
     * @return DescribeControlPolicyDomainResolveResponse
     */
    CompletableFuture<DescribeControlPolicyDomainResolveResponse> describeControlPolicyDomainResolve(DescribeControlPolicyDomainResolveRequest request);

    /**
     * @param request the request parameters of DescribeCreatedNatFirewall  DescribeCreatedNatFirewallRequest
     * @return DescribeCreatedNatFirewallResponse
     */
    CompletableFuture<DescribeCreatedNatFirewallResponse> describeCreatedNatFirewall(DescribeCreatedNatFirewallRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used to query information about Cloud Firewall member accounts.</p>
     * <h2>Rate limit</h2>
     * <p>The rate limit for this operation is 10 queries per second (QPS) per user. If the limit is exceeded, API calls are throttled, which may affect your services. Invoke this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeCtrlInstanceMemberAccounts  DescribeCtrlInstanceMemberAccountsRequest
     * @return DescribeCtrlInstanceMemberAccountsResponse
     */
    CompletableFuture<DescribeCtrlInstanceMemberAccountsResponse> describeCtrlInstanceMemberAccounts(DescribeCtrlInstanceMemberAccountsRequest request);

    /**
     * @param request the request parameters of DescribeDefaultIPSConfig  DescribeDefaultIPSConfigRequest
     * @return DescribeDefaultIPSConfigResponse
     */
    CompletableFuture<DescribeDefaultIPSConfigResponse> describeDefaultIPSConfig(DescribeDefaultIPSConfigRequest request);

    /**
     * @param request the request parameters of DescribeDnsFirewallPolicy  DescribeDnsFirewallPolicyRequest
     * @return DescribeDnsFirewallPolicyResponse
     */
    CompletableFuture<DescribeDnsFirewallPolicyResponse> describeDnsFirewallPolicy(DescribeDnsFirewallPolicyRequest request);

    /**
     * @deprecated OpenAPI DescribeDomainResolve is deprecated  * @description This operation is generally used to retrieve the DNS resolution results for a domain name. Currently, only resolution results from Alibaba Cloud DNS are supported. The domain name to be queried must use Alibaba Cloud DNS to retrieve its resolution results.
     * ## QPS limits
     * The QPS limit per user for this operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.
     * 
     * @param request the request parameters of DescribeDomainResolve  DescribeDomainResolveRequest
     * @return DescribeDomainResolveResponse
     */
    @Deprecated
    CompletableFuture<DescribeDomainResolveResponse> describeDomainResolve(DescribeDomainResolveRequest request);

    /**
     * @param request the request parameters of DescribeDownloadTask  DescribeDownloadTaskRequest
     * @return DescribeDownloadTaskResponse
     */
    CompletableFuture<DescribeDownloadTaskResponse> describeDownloadTask(DescribeDownloadTaskRequest request);

    /**
     * @param request the request parameters of DescribeDownloadTaskType  DescribeDownloadTaskTypeRequest
     * @return DescribeDownloadTaskTypeResponse
     */
    CompletableFuture<DescribeDownloadTaskTypeResponse> describeDownloadTaskType(DescribeDownloadTaskTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the event logs of Cloud Firewall. This operation supports five types of logs: application access control (app_ctl), web filtering (web_filter), TLS inspection (tls), intrusion prevention (ips), and threat intelligence (threat_intelligence). You can filter logs by time range, source IP address, destination IP address, URL, action, rule result, and attack type. The logs are returned with paging. StartTime and EndTime are UNIX timestamps in seconds. The time span for a single query cannot exceed 8 days. If FirewallType is not specified, the Internet Border firewall (InternetFirewall) is queried by default. To query the VPC firewall, set FirewallType to VpcFirewall.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 requests per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeEventLog  DescribeEventLogRequest
     * @return DescribeEventLogResponse
     */
    CompletableFuture<DescribeEventLogResponse> describeEventLog(DescribeEventLogRequest request);

    /**
     * @deprecated OpenAPI DescribeFirewallDropStatistics is deprecated  * @description ### Rate limit
     * The rate limit for this API operation is 10 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.
     * 
     * @param request the request parameters of DescribeFirewallDropStatistics  DescribeFirewallDropStatisticsRequest
     * @return DescribeFirewallDropStatisticsResponse
     */
    @Deprecated
    CompletableFuture<DescribeFirewallDropStatisticsResponse> describeFirewallDropStatistics(DescribeFirewallDropStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeFirewallDropTrend  DescribeFirewallDropTrendRequest
     * @return DescribeFirewallDropTrendResponse
     */
    CompletableFuture<DescribeFirewallDropTrendResponse> describeFirewallDropTrend(DescribeFirewallDropTrendRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The rate limit for this API operation is 10 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeFirewallTask  DescribeFirewallTaskRequest
     * @return DescribeFirewallTaskResponse
     */
    CompletableFuture<DescribeFirewallTaskResponse> describeFirewallTask(DescribeFirewallTaskRequest request);

    /**
     * @param request the request parameters of DescribeFirewallTrafficTrend  DescribeFirewallTrafficTrendRequest
     * @return DescribeFirewallTrafficTrendResponse
     */
    CompletableFuture<DescribeFirewallTrafficTrendResponse> describeFirewallTrafficTrend(DescribeFirewallTrafficTrendRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeFirewallVSwitch  DescribeFirewallVSwitchRequest
     * @return DescribeFirewallVSwitchResponse
     */
    CompletableFuture<DescribeFirewallVSwitchResponse> describeFirewallVSwitch(DescribeFirewallVSwitchRequest request);

    /**
     * @param request the request parameters of DescribeFirewallVswitchResources  DescribeFirewallVswitchResourcesRequest
     * @return DescribeFirewallVswitchResourcesResponse
     */
    CompletableFuture<DescribeFirewallVswitchResourcesResponse> describeFirewallVswitchResources(DescribeFirewallVswitchResourcesRequest request);

    /**
     * @param request the request parameters of DescribeIPSRules  DescribeIPSRulesRequest
     * @return DescribeIPSRulesResponse
     */
    CompletableFuture<DescribeIPSRulesResponse> describeIPSRules(DescribeIPSRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about the member accounts of Cloud Firewall.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If you exceed the limit, API calls are throttled. This may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeInstanceMembers  DescribeInstanceMembersRequest
     * @return DescribeInstanceMembersResponse
     */
    CompletableFuture<DescribeInstanceMembersResponse> describeInstanceMembers(DescribeInstanceMembersRequest request);

    /**
     * @param request the request parameters of DescribeInstanceRdAccounts  DescribeInstanceRdAccountsRequest
     * @return DescribeInstanceRdAccountsResponse
     */
    CompletableFuture<DescribeInstanceRdAccountsResponse> describeInstanceRdAccounts(DescribeInstanceRdAccountsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceRiskLevels  DescribeInstanceRiskLevelsRequest
     * @return DescribeInstanceRiskLevelsResponse
     */
    CompletableFuture<DescribeInstanceRiskLevelsResponse> describeInstanceRiskLevels(DescribeInstanceRiskLevelsRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user for this API operation is 10. If you exceed the limit, API calls are throttled, which may affect your business. Call the API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeInternetDropTrafficTrend  DescribeInternetDropTrafficTrendRequest
     * @return DescribeInternetDropTrafficTrendResponse
     */
    CompletableFuture<DescribeInternetDropTrafficTrendResponse> describeInternetDropTrafficTrend(DescribeInternetDropTrafficTrendRequest request);

    /**
     * @param request the request parameters of DescribeInternetOpenDetail  DescribeInternetOpenDetailRequest
     * @return DescribeInternetOpenDetailResponse
     */
    CompletableFuture<DescribeInternetOpenDetailResponse> describeInternetOpenDetail(DescribeInternetOpenDetailRequest request);

    /**
     * @param request the request parameters of DescribeInternetOpenIp  DescribeInternetOpenIpRequest
     * @return DescribeInternetOpenIpResponse
     */
    CompletableFuture<DescribeInternetOpenIpResponse> describeInternetOpenIp(DescribeInternetOpenIpRequest request);

    /**
     * <b>description</b> :
     * <h2>Rate limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeInternetOpenPort  DescribeInternetOpenPortRequest
     * @return DescribeInternetOpenPortResponse
     */
    CompletableFuture<DescribeInternetOpenPortResponse> describeInternetOpenPort(DescribeInternetOpenPortRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeInternetOpenService  DescribeInternetOpenServiceRequest
     * @return DescribeInternetOpenServiceResponse
     */
    CompletableFuture<DescribeInternetOpenServiceResponse> describeInternetOpenService(DescribeInternetOpenServiceRequest request);

    /**
     * @param request the request parameters of DescribeInternetOpenStatistic  DescribeInternetOpenStatisticRequest
     * @return DescribeInternetOpenStatisticResponse
     */
    CompletableFuture<DescribeInternetOpenStatisticResponse> describeInternetOpenStatistic(DescribeInternetOpenStatisticRequest request);

    /**
     * @param request the request parameters of DescribeInternetServiceNameList  DescribeInternetServiceNameListRequest
     * @return DescribeInternetServiceNameListResponse
     */
    CompletableFuture<DescribeInternetServiceNameListResponse> describeInternetServiceNameList(DescribeInternetServiceNameListRequest request);

    /**
     * @param request the request parameters of DescribeInternetSlb  DescribeInternetSlbRequest
     * @return DescribeInternetSlbResponse
     */
    CompletableFuture<DescribeInternetSlbResponse> describeInternetSlb(DescribeInternetSlbRequest request);

    /**
     * @param request the request parameters of DescribeInternetTimeTop  DescribeInternetTimeTopRequest
     * @return DescribeInternetTimeTopResponse
     */
    CompletableFuture<DescribeInternetTimeTopResponse> describeInternetTimeTop(DescribeInternetTimeTopRequest request);

    /**
     * @param request the request parameters of DescribeInternetTrafficTop  DescribeInternetTrafficTopRequest
     * @return DescribeInternetTrafficTopResponse
     */
    CompletableFuture<DescribeInternetTrafficTopResponse> describeInternetTrafficTop(DescribeInternetTrafficTopRequest request);

    /**
     * @param request the request parameters of DescribeInternetTrafficTrend  DescribeInternetTrafficTrendRequest
     * @return DescribeInternetTrafficTrendResponse
     */
    CompletableFuture<DescribeInternetTrafficTrendResponse> describeInternetTrafficTrend(DescribeInternetTrafficTrendRequest request);

    /**
     * @param request the request parameters of DescribeInvadeEcsTrend  DescribeInvadeEcsTrendRequest
     * @return DescribeInvadeEcsTrendResponse
     */
    CompletableFuture<DescribeInvadeEcsTrendResponse> describeInvadeEcsTrend(DescribeInvadeEcsTrendRequest request);

    /**
     * @param request the request parameters of DescribeInvadeEventDetail  DescribeInvadeEventDetailRequest
     * @return DescribeInvadeEventDetailResponse
     */
    CompletableFuture<DescribeInvadeEventDetailResponse> describeInvadeEventDetail(DescribeInvadeEventDetailRequest request);

    /**
     * @param request the request parameters of DescribeInvadeEventList  DescribeInvadeEventListRequest
     * @return DescribeInvadeEventListResponse
     */
    CompletableFuture<DescribeInvadeEventListResponse> describeInvadeEventList(DescribeInvadeEventListRequest request);

    /**
     * @param request the request parameters of DescribeInvadeEventNameList  DescribeInvadeEventNameListRequest
     * @return DescribeInvadeEventNameListResponse
     */
    CompletableFuture<DescribeInvadeEventNameListResponse> describeInvadeEventNameList(DescribeInvadeEventNameListRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the original packet payload of a specified intrusion event. You can locate a single event by using the event UUID (EventUuid) or filter events by public IP address, private IP address, asset instance ID, and time range. StartTime and EndTime are required and must be UNIX timestamps in seconds. The response includes the original payload, the payload length (PayloadLen), and the start and end positions of the matched content in the highlight interval (HighlightStart and HighlightEnd) to help restore alert details.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeInvadeEventPayload  DescribeInvadeEventPayloadRequest
     * @return DescribeInvadeEventPayloadResponse
     */
    CompletableFuture<DescribeInvadeEventPayloadResponse> describeInvadeEventPayload(DescribeInvadeEventPayloadRequest request);

    /**
     * @param request the request parameters of DescribeInvadeEventStatistic  DescribeInvadeEventStatisticRequest
     * @return DescribeInvadeEventStatisticResponse
     */
    CompletableFuture<DescribeInvadeEventStatisticResponse> describeInvadeEventStatistic(DescribeInvadeEventStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used to perform paged queries on the information about assets protected by Cloud Firewall.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeIpsPrivateAssoc  DescribeIpsPrivateAssocRequest
     * @return DescribeIpsPrivateAssocResponse
     */
    CompletableFuture<DescribeIpsPrivateAssocResponse> describeIpsPrivateAssoc(DescribeIpsPrivateAssocRequest request);

    /**
     * @param request the request parameters of DescribeIspInfo  DescribeIspInfoRequest
     * @return DescribeIspInfoResponse
     */
    CompletableFuture<DescribeIspInfoResponse> describeIspInfo(DescribeIspInfoRequest request);

    /**
     * @param request the request parameters of DescribeLocationInfo  DescribeLocationInfoRequest
     * @return DescribeLocationInfoResponse
     */
    CompletableFuture<DescribeLocationInfoResponse> describeLocationInfo(DescribeLocationInfoRequest request);

    /**
     * @param request the request parameters of DescribeLogStoreInfo  DescribeLogStoreInfoRequest
     * @return DescribeLogStoreInfoResponse
     */
    CompletableFuture<DescribeLogStoreInfoResponse> describeLogStoreInfo(DescribeLogStoreInfoRequest request);

    /**
     * @param request the request parameters of DescribeMemberInfo  DescribeMemberInfoRequest
     * @return DescribeMemberInfoResponse
     */
    CompletableFuture<DescribeMemberInfoResponse> describeMemberInfo(DescribeMemberInfoRequest request);

    /**
     * @param request the request parameters of DescribeNatAclPageStatus  DescribeNatAclPageStatusRequest
     * @return DescribeNatAclPageStatusResponse
     */
    CompletableFuture<DescribeNatAclPageStatusResponse> describeNatAclPageStatus(DescribeNatAclPageStatusRequest request);

    /**
     * @param request the request parameters of DescribeNatFirewallAclGroupList  DescribeNatFirewallAclGroupListRequest
     * @return DescribeNatFirewallAclGroupListResponse
     */
    CompletableFuture<DescribeNatFirewallAclGroupListResponse> describeNatFirewallAclGroupList(DescribeNatFirewallAclGroupListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries access control policies for NAT firewalls and returns the results in a paginated list.</p>
     * 
     * @param request the request parameters of DescribeNatFirewallControlPolicy  DescribeNatFirewallControlPolicyRequest
     * @return DescribeNatFirewallControlPolicyResponse
     */
    CompletableFuture<DescribeNatFirewallControlPolicyResponse> describeNatFirewallControlPolicy(DescribeNatFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of DescribeNatFirewallDropTrafficTrend  DescribeNatFirewallDropTrafficTrendRequest
     * @return DescribeNatFirewallDropTrafficTrendResponse
     */
    CompletableFuture<DescribeNatFirewallDropTrafficTrendResponse> describeNatFirewallDropTrafficTrend(DescribeNatFirewallDropTrafficTrendRequest request);

    /**
     * @param request the request parameters of DescribeNatFirewallList  DescribeNatFirewallListRequest
     * @return DescribeNatFirewallListResponse
     */
    CompletableFuture<DescribeNatFirewallListResponse> describeNatFirewallList(DescribeNatFirewallListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to query the effective policy priority range for an access control policy that manages outbound traffic of a NAT firewall.</p>
     * 
     * @param request the request parameters of DescribeNatFirewallPolicyPriorUsed  DescribeNatFirewallPolicyPriorUsedRequest
     * @return DescribeNatFirewallPolicyPriorUsedResponse
     */
    CompletableFuture<DescribeNatFirewallPolicyPriorUsedResponse> describeNatFirewallPolicyPriorUsed(DescribeNatFirewallPolicyPriorUsedRequest request);

    /**
     * @param request the request parameters of DescribeNatFirewallPrecheckDetail  DescribeNatFirewallPrecheckDetailRequest
     * @return DescribeNatFirewallPrecheckDetailResponse
     */
    CompletableFuture<DescribeNatFirewallPrecheckDetailResponse> describeNatFirewallPrecheckDetail(DescribeNatFirewallPrecheckDetailRequest request);

    /**
     * @param request the request parameters of DescribeNatFirewallQuota  DescribeNatFirewallQuotaRequest
     * @return DescribeNatFirewallQuotaResponse
     */
    CompletableFuture<DescribeNatFirewallQuotaResponse> describeNatFirewallQuota(DescribeNatFirewallQuotaRequest request);

    /**
     * @param request the request parameters of DescribeNatFirewallTimeTop  DescribeNatFirewallTimeTopRequest
     * @return DescribeNatFirewallTimeTopResponse
     */
    CompletableFuture<DescribeNatFirewallTimeTopResponse> describeNatFirewallTimeTop(DescribeNatFirewallTimeTopRequest request);

    /**
     * @param request the request parameters of DescribeNatFirewallTrafficTrend  DescribeNatFirewallTrafficTrendRequest
     * @return DescribeNatFirewallTrafficTrendResponse
     */
    CompletableFuture<DescribeNatFirewallTrafficTrendResponse> describeNatFirewallTrafficTrend(DescribeNatFirewallTrafficTrendRequest request);

    /**
     * @param request the request parameters of DescribeNetworkInstanceList  DescribeNetworkInstanceListRequest
     * @return DescribeNetworkInstanceListResponse
     */
    CompletableFuture<DescribeNetworkInstanceListResponse> describeNetworkInstanceList(DescribeNetworkInstanceListRequest request);

    /**
     * @param request the request parameters of DescribeNetworkInstanceRelationList  DescribeNetworkInstanceRelationListRequest
     * @return DescribeNetworkInstanceRelationListResponse
     */
    CompletableFuture<DescribeNetworkInstanceRelationListResponse> describeNetworkInstanceRelationList(DescribeNetworkInstanceRelationListRequest request);

    /**
     * @param request the request parameters of DescribeNetworkTrafficTopRatio  DescribeNetworkTrafficTopRatioRequest
     * @return DescribeNetworkTrafficTopRatioResponse
     */
    CompletableFuture<DescribeNetworkTrafficTopRatioResponse> describeNetworkTrafficTopRatio(DescribeNetworkTrafficTopRatioRequest request);

    /**
     * @param request the request parameters of DescribeOpenIpAccessSrcStat  DescribeOpenIpAccessSrcStatRequest
     * @return DescribeOpenIpAccessSrcStatResponse
     */
    CompletableFuture<DescribeOpenIpAccessSrcStatResponse> describeOpenIpAccessSrcStat(DescribeOpenIpAccessSrcStatRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingAssetList  DescribeOutgoingAssetListRequest
     * @return DescribeOutgoingAssetListResponse
     */
    CompletableFuture<DescribeOutgoingAssetListResponse> describeOutgoingAssetList(DescribeOutgoingAssetListRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingDestination  DescribeOutgoingDestinationRequest
     * @return DescribeOutgoingDestinationResponse
     */
    CompletableFuture<DescribeOutgoingDestinationResponse> describeOutgoingDestination(DescribeOutgoingDestinationRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingDestinationCategory  DescribeOutgoingDestinationCategoryRequest
     * @return DescribeOutgoingDestinationCategoryResponse
     */
    CompletableFuture<DescribeOutgoingDestinationCategoryResponse> describeOutgoingDestinationCategory(DescribeOutgoingDestinationCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the destination IP addresses of outbound connections.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Make sure that Cloud Firewall is activated for your account. Both subscription and pay-as-you-go editions are supported.</li>
     * <li>You can call the DescribeUserBuyVersion operation to query the UserStatus parameter. A value of false indicates that Cloud Firewall is not activated.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeOutgoingDestinationIP  DescribeOutgoingDestinationIPRequest
     * @return DescribeOutgoingDestinationIPResponse
     */
    CompletableFuture<DescribeOutgoingDestinationIPResponse> describeOutgoingDestinationIP(DescribeOutgoingDestinationIPRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingDestinationIPDetail  DescribeOutgoingDestinationIPDetailRequest
     * @return DescribeOutgoingDestinationIPDetailResponse
     */
    CompletableFuture<DescribeOutgoingDestinationIPDetailResponse> describeOutgoingDestinationIPDetail(DescribeOutgoingDestinationIPDetailRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingDomain  DescribeOutgoingDomainRequest
     * @return DescribeOutgoingDomainResponse
     */
    CompletableFuture<DescribeOutgoingDomainResponse> describeOutgoingDomain(DescribeOutgoingDomainRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingDomainDetail  DescribeOutgoingDomainDetailRequest
     * @return DescribeOutgoingDomainDetailResponse
     */
    CompletableFuture<DescribeOutgoingDomainDetailResponse> describeOutgoingDomainDetail(DescribeOutgoingDomainDetailRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingRiskDomainAndIpCount  DescribeOutgoingRiskDomainAndIpCountRequest
     * @return DescribeOutgoingRiskDomainAndIpCountResponse
     */
    CompletableFuture<DescribeOutgoingRiskDomainAndIpCountResponse> describeOutgoingRiskDomainAndIpCount(DescribeOutgoingRiskDomainAndIpCountRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the trend of outbound connection risks.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Ensure that Cloud Firewall is activated before you call this operation.</li>
     * <li>You can call the DescribeUserBuyVersion operation to query the UserStatus parameter. If false is returned, the service is not activated.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeOutgoingRiskTrend  DescribeOutgoingRiskTrendRequest
     * @return DescribeOutgoingRiskTrendResponse
     */
    CompletableFuture<DescribeOutgoingRiskTrendResponse> describeOutgoingRiskTrend(DescribeOutgoingRiskTrendRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingStatistic  DescribeOutgoingStatisticRequest
     * @return DescribeOutgoingStatisticResponse
     */
    CompletableFuture<DescribeOutgoingStatisticResponse> describeOutgoingStatistic(DescribeOutgoingStatisticRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 per user. If you exceed the limit, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeOutgoingTag  DescribeOutgoingTagRequest
     * @return DescribeOutgoingTagResponse
     */
    CompletableFuture<DescribeOutgoingTagResponse> describeOutgoingTag(DescribeOutgoingTagRequest request);

    /**
     * @deprecated OpenAPI DescribePageDocuments is deprecated  * @description ## QPS limit
     * The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.
     * 
     * @param request the request parameters of DescribePageDocuments  DescribePageDocumentsRequest
     * @return DescribePageDocumentsResponse
     */
    @Deprecated
    CompletableFuture<DescribePageDocumentsResponse> describePageDocuments(DescribePageDocumentsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used to query the enabling status of the strict mode for access control policies.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Before you call this operation, you must purchase and activate Cloud Firewall. You can activate it on the Cloud Firewall buy page (China site: <a href="https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn">https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn</a>; International site: <a href="https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl">https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl</a>).</li>
     * </ul>
     * <h2>Rate limit</h2>
     * <p>The rate limit for this operation is 10 queries per second (QPS) per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation as needed.</p>
     * 
     * @param request the request parameters of DescribePolicyAdvancedConfig  DescribePolicyAdvancedConfigRequest
     * @return DescribePolicyAdvancedConfigResponse
     */
    CompletableFuture<DescribePolicyAdvancedConfigResponse> describePolicyAdvancedConfig(DescribePolicyAdvancedConfigRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the effective priority range of access control policies for inbound and outbound traffic.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for this operation is 10 requests per second per user. Calls that exceed this limit are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DescribePolicyPriorUsed  DescribePolicyPriorUsedRequest
     * @return DescribePolicyPriorUsedResponse
     */
    CompletableFuture<DescribePolicyPriorUsedResponse> describePolicyPriorUsed(DescribePolicyPriorUsedRequest request);

    /**
     * <b>description</b> :
     * <p>For pay-as-you-go users, the billing details are accurate to the specific resource instance level. For subscription users, only overall queries are supported.</p>
     * 
     * @param request the request parameters of DescribePostpayBill  DescribePostpayBillRequest
     * @return DescribePostpayBillResponse
     */
    CompletableFuture<DescribePostpayBillResponse> describePostpayBill(DescribePostpayBillRequest request);

    /**
     * @param request the request parameters of DescribePostpayEnabledProtection  DescribePostpayEnabledProtectionRequest
     * @return DescribePostpayEnabledProtectionResponse
     */
    CompletableFuture<DescribePostpayEnabledProtectionResponse> describePostpayEnabledProtection(DescribePostpayEnabledProtectionRequest request);

    /**
     * <b>description</b> :
     * <p>For pay-as-you-go users, the details are accurate to the specific resource instance level. For subscription users, only overall queries are supported.</p>
     * 
     * @param request the request parameters of DescribePostpayTrafficDetail  DescribePostpayTrafficDetailRequest
     * @return DescribePostpayTrafficDetailResponse
     */
    CompletableFuture<DescribePostpayTrafficDetailResponse> describePostpayTrafficDetail(DescribePostpayTrafficDetailRequest request);

    /**
     * <b>description</b> :
     * <p>The statistics are for the current Cloud Firewall instance and include all data from the date of purchase.</p>
     * 
     * @param request the request parameters of DescribePostpayTrafficTotal  DescribePostpayTrafficTotalRequest
     * @return DescribePostpayTrafficTotalResponse
     */
    CompletableFuture<DescribePostpayTrafficTotalResponse> describePostpayTrafficTotal(DescribePostpayTrafficTotalRequest request);

    /**
     * @param request the request parameters of DescribePostpayUserInternetStatus  DescribePostpayUserInternetStatusRequest
     * @return DescribePostpayUserInternetStatusResponse
     */
    CompletableFuture<DescribePostpayUserInternetStatusResponse> describePostpayUserInternetStatus(DescribePostpayUserInternetStatusRequest request);

    /**
     * @param request the request parameters of DescribePostpayUserNatStatus  DescribePostpayUserNatStatusRequest
     * @return DescribePostpayUserNatStatusResponse
     */
    CompletableFuture<DescribePostpayUserNatStatusResponse> describePostpayUserNatStatus(DescribePostpayUserNatStatusRequest request);

    /**
     * @param request the request parameters of DescribePostpayUserVpcStatus  DescribePostpayUserVpcStatusRequest
     * @return DescribePostpayUserVpcStatusResponse
     */
    CompletableFuture<DescribePostpayUserVpcStatusResponse> describePostpayUserVpcStatus(DescribePostpayUserVpcStatusRequest request);

    /**
     * @param request the request parameters of DescribePrefixLists  DescribePrefixListsRequest
     * @return DescribePrefixListsResponse
     */
    CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request);

    /**
     * <b>description</b> :
     * <p>The statistical scope covers the current Cloud Firewall instances of the user and includes all data since the purchase date.</p>
     * 
     * @param request the request parameters of DescribePrepayBillTotal  DescribePrepayBillTotalRequest
     * @return DescribePrepayBillTotalResponse
     */
    CompletableFuture<DescribePrepayBillTotalResponse> describePrepayBillTotal(DescribePrepayBillTotalRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of domain names that require resolution by using private DNS endpoints.</p>
     * 
     * @param request the request parameters of DescribePrivateDnsDomainNameList  DescribePrivateDnsDomainNameListRequest
     * @return DescribePrivateDnsDomainNameListResponse
     */
    CompletableFuture<DescribePrivateDnsDomainNameListResponse> describePrivateDnsDomainNameList(DescribePrivateDnsDomainNameListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the details of a private DNS endpoint.</p>
     * 
     * @param request the request parameters of DescribePrivateDnsEndpointDetail  DescribePrivateDnsEndpointDetailRequest
     * @return DescribePrivateDnsEndpointDetailResponse
     */
    CompletableFuture<DescribePrivateDnsEndpointDetailResponse> describePrivateDnsEndpointDetail(DescribePrivateDnsEndpointDetailRequest request);

    /**
     * @param request the request parameters of DescribePrivateDnsEndpointList  DescribePrivateDnsEndpointListRequest
     * @return DescribePrivateDnsEndpointListResponse
     */
    CompletableFuture<DescribePrivateDnsEndpointListResponse> describePrivateDnsEndpointList(DescribePrivateDnsEndpointListRequest request);

    /**
     * @param request the request parameters of DescribePrivateDnsStatistics  DescribePrivateDnsStatisticsRequest
     * @return DescribePrivateDnsStatisticsResponse
     */
    CompletableFuture<DescribePrivateDnsStatisticsResponse> describePrivateDnsStatistics(DescribePrivateDnsStatisticsRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user for this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeRegionInfo  DescribeRegionInfoRequest
     * @return DescribeRegionInfoResponse
     */
    CompletableFuture<DescribeRegionInfoResponse> describeRegionInfo(DescribeRegionInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to retrieve the DNS resolution results of a domain name. Currently, only Alibaba Cloud DNS is supported for retrieving resolution results. The domain name to be queried must use Alibaba Cloud DNS to obtain its resolution results.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit per user for this operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeRegionResourceTypeAutoEnable  DescribeRegionResourceTypeAutoEnableRequest
     * @return DescribeRegionResourceTypeAutoEnableResponse
     */
    CompletableFuture<DescribeRegionResourceTypeAutoEnableResponse> describeRegionResourceTypeAutoEnable(DescribeRegionResourceTypeAutoEnableRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used to obtain the DNS resolution results of a domain name. Currently, only Alibaba Cloud DNS is supported for obtaining resolution results. The domain name to be queried must use Alibaba Cloud DNS to retrieve its resolution results.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit per user for this operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeResourceTypeAutoEnable  DescribeResourceTypeAutoEnableRequest
     * @return DescribeResourceTypeAutoEnableResponse
     */
    CompletableFuture<DescribeResourceTypeAutoEnableResponse> describeResourceTypeAutoEnable(DescribeResourceTypeAutoEnableRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries and downloads detailed data of intrusion prevention events. Query 5 to 10 entries at a time. To prevent query timeouts, set the NoLocation parameter to true if you do not need to return IP geolocation information.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeRiskEventGroup  DescribeRiskEventGroupRequest
     * @return DescribeRiskEventGroupResponse
     */
    CompletableFuture<DescribeRiskEventGroupResponse> describeRiskEventGroup(DescribeRiskEventGroupRequest request);

    /**
     * @param request the request parameters of DescribeRiskEventPayload  DescribeRiskEventPayloadRequest
     * @return DescribeRiskEventPayloadResponse
     */
    CompletableFuture<DescribeRiskEventPayloadResponse> describeRiskEventPayload(DescribeRiskEventPayloadRequest request);

    /**
     * @param request the request parameters of DescribeRiskEventStatistic  DescribeRiskEventStatisticRequest
     * @return DescribeRiskEventStatisticResponse
     */
    CompletableFuture<DescribeRiskEventStatisticResponse> describeRiskEventStatistic(DescribeRiskEventStatisticRequest request);

    /**
     * @param request the request parameters of DescribeRiskEventTopAttackApp  DescribeRiskEventTopAttackAppRequest
     * @return DescribeRiskEventTopAttackAppResponse
     */
    CompletableFuture<DescribeRiskEventTopAttackAppResponse> describeRiskEventTopAttackApp(DescribeRiskEventTopAttackAppRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can make up to 10 queries per second (QPS) to this API. If you exceed this limit, your API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeRiskEventTopAttackAsset  DescribeRiskEventTopAttackAssetRequest
     * @return DescribeRiskEventTopAttackAssetResponse
     */
    CompletableFuture<DescribeRiskEventTopAttackAssetResponse> describeRiskEventTopAttackAsset(DescribeRiskEventTopAttackAssetRequest request);

    /**
     * @param request the request parameters of DescribeRiskEventTopAttackType  DescribeRiskEventTopAttackTypeRequest
     * @return DescribeRiskEventTopAttackTypeResponse
     */
    CompletableFuture<DescribeRiskEventTopAttackTypeResponse> describeRiskEventTopAttackType(DescribeRiskEventTopAttackTypeRequest request);

    /**
     * @deprecated OpenAPI DescribeRiskSecurityGroupDetail is deprecated  * @param request  the request parameters of DescribeRiskSecurityGroupDetail  DescribeRiskSecurityGroupDetailRequest
     * @return DescribeRiskSecurityGroupDetailResponse
     */
    @Deprecated
    CompletableFuture<DescribeRiskSecurityGroupDetailResponse> describeRiskSecurityGroupDetail(DescribeRiskSecurityGroupDetailRequest request);

    /**
     * @param request the request parameters of DescribeSdlEventDetail  DescribeSdlEventDetailRequest
     * @return DescribeSdlEventDetailResponse
     */
    CompletableFuture<DescribeSdlEventDetailResponse> describeSdlEventDetail(DescribeSdlEventDetailRequest request);

    /**
     * @param request the request parameters of DescribeSdlEventList  DescribeSdlEventListRequest
     * @return DescribeSdlEventListResponse
     */
    CompletableFuture<DescribeSdlEventListResponse> describeSdlEventList(DescribeSdlEventListRequest request);

    /**
     * @param request the request parameters of DescribeSdlEventSdList  DescribeSdlEventSdListRequest
     * @return DescribeSdlEventSdListResponse
     */
    CompletableFuture<DescribeSdlEventSdListResponse> describeSdlEventSdList(DescribeSdlEventSdListRequest request);

    /**
     * @param request the request parameters of DescribeSdlEventStatistic  DescribeSdlEventStatisticRequest
     * @return DescribeSdlEventStatisticResponse
     */
    CompletableFuture<DescribeSdlEventStatisticResponse> describeSdlEventStatistic(DescribeSdlEventStatisticRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this API is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeSdlLastPayload  DescribeSdlLastPayloadRequest
     * @return DescribeSdlLastPayloadResponse
     */
    CompletableFuture<DescribeSdlLastPayloadResponse> describeSdlLastPayload(DescribeSdlLastPayloadRequest request);

    /**
     * @param request the request parameters of DescribeSdlStatistic  DescribeSdlStatisticRequest
     * @return DescribeSdlStatisticResponse
     */
    CompletableFuture<DescribeSdlStatisticResponse> describeSdlStatistic(DescribeSdlStatisticRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to perform a paged query for information about assets protected by Cloud Firewall. You can use paging to retrieve the data.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit per user for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Invoke this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeSecurityMode  DescribeSecurityModeRequest
     * @return DescribeSecurityModeResponse
     */
    CompletableFuture<DescribeSecurityModeResponse> describeSecurityMode(DescribeSecurityModeRequest request);

    /**
     * @deprecated OpenAPI DescribeSecurityProxy is deprecated, please use Cloudfw::2017-12-07::DescribeNatFirewallList instead.  * @param request  the request parameters of DescribeSecurityProxy  DescribeSecurityProxyRequest
     * @return DescribeSecurityProxyResponse
     */
    @Deprecated
    CompletableFuture<DescribeSecurityProxyResponse> describeSecurityProxy(DescribeSecurityProxyRequest request);

    /**
     * @param request the request parameters of DescribeSecurityProxyResources  DescribeSecurityProxyResourcesRequest
     * @return DescribeSecurityProxyResourcesResponse
     */
    CompletableFuture<DescribeSecurityProxyResourcesResponse> describeSecurityProxyResources(DescribeSecurityProxyResourcesRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveSwitch  DescribeSensitiveSwitchRequest
     * @return DescribeSensitiveSwitchResponse
     */
    CompletableFuture<DescribeSensitiveSwitchResponse> describeSensitiveSwitch(DescribeSensitiveSwitchRequest request);

    /**
     * @param request the request parameters of DescribeSignatureLibVersion  DescribeSignatureLibVersionRequest
     * @return DescribeSignatureLibVersionResponse
     */
    CompletableFuture<DescribeSignatureLibVersionResponse> describeSignatureLibVersion(DescribeSignatureLibVersionRequest request);

    /**
     * @param request the request parameters of DescribeSlrGrant  DescribeSlrGrantRequest
     * @return DescribeSlrGrantResponse
     */
    CompletableFuture<DescribeSlrGrantResponse> describeSlrGrant(DescribeSlrGrantRequest request);

    /**
     * @param request the request parameters of DescribeSlsAnalyzeOpenStatus  DescribeSlsAnalyzeOpenStatusRequest
     * @return DescribeSlsAnalyzeOpenStatusResponse
     */
    CompletableFuture<DescribeSlsAnalyzeOpenStatusResponse> describeSlsAnalyzeOpenStatus(DescribeSlsAnalyzeOpenStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, call ModifySlsDispatchConfig to obtain the TaskId.</p>
     * 
     * @param request the request parameters of DescribeTaskDispatchStatus  DescribeTaskDispatchStatusRequest
     * @return DescribeTaskDispatchStatusResponse
     */
    CompletableFuture<DescribeTaskDispatchStatusResponse> describeTaskDispatchStatus(DescribeTaskDispatchStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to perform paging queries on the information about NAT firewall access control policies.</p>
     * 
     * @param request the request parameters of DescribeThreatIntelligenceSwitch  DescribeThreatIntelligenceSwitchRequest
     * @return DescribeThreatIntelligenceSwitchResponse
     */
    CompletableFuture<DescribeThreatIntelligenceSwitchResponse> describeThreatIntelligenceSwitch(DescribeThreatIntelligenceSwitchRequest request);

    /**
     * @param request the request parameters of DescribeTrFirewallPolicyBackUpAssociationList  DescribeTrFirewallPolicyBackUpAssociationListRequest
     * @return DescribeTrFirewallPolicyBackUpAssociationListResponse
     */
    CompletableFuture<DescribeTrFirewallPolicyBackUpAssociationListResponse> describeTrFirewallPolicyBackUpAssociationList(DescribeTrFirewallPolicyBackUpAssociationListRequest request);

    /**
     * @param request the request parameters of DescribeTrFirewallV2RoutePolicyList  DescribeTrFirewallV2RoutePolicyListRequest
     * @return DescribeTrFirewallV2RoutePolicyListResponse
     */
    CompletableFuture<DescribeTrFirewallV2RoutePolicyListResponse> describeTrFirewallV2RoutePolicyList(DescribeTrFirewallV2RoutePolicyListRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a virtual private cloud (VPC) firewall for an Enterprise Edition transit router. You can obtain the FirewallId by calling DescribeTrFirewallsV2List. If the firewall is not created, you must first create an Enterprise Edition transit router in Cloud Enterprise Network (CEN) and then call CreateTrFirewallV2 to create the firewall and obtain the FirewallId.</p>
     * 
     * @param request the request parameters of DescribeTrFirewallsV2Detail  DescribeTrFirewallsV2DetailRequest
     * @return DescribeTrFirewallsV2DetailResponse
     */
    CompletableFuture<DescribeTrFirewallsV2DetailResponse> describeTrFirewallsV2Detail(DescribeTrFirewallsV2DetailRequest request);

    /**
     * @param request the request parameters of DescribeTrFirewallsV2List  DescribeTrFirewallsV2ListRequest
     * @return DescribeTrFirewallsV2ListResponse
     */
    CompletableFuture<DescribeTrFirewallsV2ListResponse> describeTrFirewallsV2List(DescribeTrFirewallsV2ListRequest request);

    /**
     * @param request the request parameters of DescribeTrFirewallsV2RouteList  DescribeTrFirewallsV2RouteListRequest
     * @return DescribeTrFirewallsV2RouteListResponse
     */
    CompletableFuture<DescribeTrFirewallsV2RouteListResponse> describeTrFirewallsV2RouteList(DescribeTrFirewallsV2RouteListRequest request);

    /**
     * @param request the request parameters of DescribeTrafficLog  DescribeTrafficLogRequest
     * @return DescribeTrafficLogResponse
     */
    CompletableFuture<DescribeTrafficLogResponse> describeTrafficLog(DescribeTrafficLogRequest request);

    /**
     * @param request the request parameters of DescribeTransitRouterResourcesList  DescribeTransitRouterResourcesListRequest
     * @return DescribeTransitRouterResourcesListResponse
     */
    CompletableFuture<DescribeTransitRouterResourcesListResponse> describeTransitRouterResourcesList(DescribeTransitRouterResourcesListRequest request);

    /**
     * @param request the request parameters of DescribeUnprotectedPortTrend  DescribeUnprotectedPortTrendRequest
     * @return DescribeUnprotectedPortTrendResponse
     */
    CompletableFuture<DescribeUnprotectedPortTrendResponse> describeUnprotectedPortTrend(DescribeUnprotectedPortTrendRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. If you exceed this limit, API calls are throttled, which may impact your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeUnprotectedVulnTrend  DescribeUnprotectedVulnTrendRequest
     * @return DescribeUnprotectedVulnTrendResponse
     */
    CompletableFuture<DescribeUnprotectedVulnTrendResponse> describeUnprotectedVulnTrend(DescribeUnprotectedVulnTrendRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The QPS limit for this interface is 10 calls per second per user. Exceeding this limit throttles API calls and may affect your service. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeUserAlarmConfig  DescribeUserAlarmConfigRequest
     * @return DescribeUserAlarmConfigResponse
     */
    CompletableFuture<DescribeUserAlarmConfigResponse> describeUserAlarmConfig(DescribeUserAlarmConfigRequest request);

    /**
     * @deprecated OpenAPI DescribeUserAssetIPTrafficInfo is deprecated  * @param request  the request parameters of DescribeUserAssetIPTrafficInfo  DescribeUserAssetIPTrafficInfoRequest
     * @return DescribeUserAssetIPTrafficInfoResponse
     */
    @Deprecated
    CompletableFuture<DescribeUserAssetIPTrafficInfoResponse> describeUserAssetIPTrafficInfo(DescribeUserAssetIPTrafficInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to query and retrieve Cloud Firewall instance information for a user.</p>
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user is 10 calls per second. If you exceed this limit, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeUserBuyVersion  DescribeUserBuyVersionRequest
     * @return DescribeUserBuyVersionResponse
     */
    CompletableFuture<DescribeUserBuyVersionResponse> describeUserBuyVersion(DescribeUserBuyVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second for each user. If you exceed this limit, API calls are throttled, which can impact your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeUserIPSWhitelist  DescribeUserIPSWhitelistRequest
     * @return DescribeUserIPSWhitelistResponse
     */
    CompletableFuture<DescribeUserIPSWhitelistResponse> describeUserIPSWhitelist(DescribeUserIPSWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeVfwIPSConfigList  DescribeVfwIPSConfigListRequest
     * @return DescribeVfwIPSConfigListResponse
     */
    CompletableFuture<DescribeVfwIPSConfigListResponse> describeVfwIPSConfigList(DescribeVfwIPSConfigListRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallAccessDetail  DescribeVpcFirewallAccessDetailRequest
     * @return DescribeVpcFirewallAccessDetailResponse
     */
    CompletableFuture<DescribeVpcFirewallAccessDetailResponse> describeVpcFirewallAccessDetail(DescribeVpcFirewallAccessDetailRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query all access control policy groups of a VPC firewall.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallAclGroupList  DescribeVpcFirewallAclGroupListRequest
     * @return DescribeVpcFirewallAclGroupListResponse
     */
    CompletableFuture<DescribeVpcFirewallAclGroupListResponse> describeVpcFirewallAclGroupList(DescribeVpcFirewallAclGroupListRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallAssetList  DescribeVpcFirewallAssetListRequest
     * @return DescribeVpcFirewallAssetListResponse
     */
    CompletableFuture<DescribeVpcFirewallAssetListResponse> describeVpcFirewallAssetList(DescribeVpcFirewallAssetListRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallAssetRegionList  DescribeVpcFirewallAssetRegionListRequest
     * @return DescribeVpcFirewallAssetRegionListResponse
     */
    CompletableFuture<DescribeVpcFirewallAssetRegionListResponse> describeVpcFirewallAssetRegionList(DescribeVpcFirewallAssetRegionListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the details of a virtual private cloud (VPC) firewall. The VPC firewall controls mutual access traffic between network instances (including VPCs, virtual border routers (VBRs), and Cloud Connect Network (CCN) instances) in a CEN instance and a specified VPC.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the number of calls per second exceeds the limit, throttling is triggered. Throttling may affect your business. Invoke this operation within the limit.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallCenDetail  DescribeVpcFirewallCenDetailRequest
     * @return DescribeVpcFirewallCenDetailResponse
     */
    CompletableFuture<DescribeVpcFirewallCenDetailResponse> describeVpcFirewallCenDetail(DescribeVpcFirewallCenDetailRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the details of a VPC firewall. The firewall protects traffic between a specified VPC and a network instance that is attached to a Cloud Enterprise Network (CEN) instance. The network instance can be a VPC, a Virtual Border Router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. We recommend that you plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallCenList  DescribeVpcFirewallCenListRequest
     * @return DescribeVpcFirewallCenListResponse
     */
    CompletableFuture<DescribeVpcFirewallCenListResponse> describeVpcFirewallCenList(DescribeVpcFirewallCenListRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallCenSummaryList  DescribeVpcFirewallCenSummaryListRequest
     * @return DescribeVpcFirewallCenSummaryListResponse
     */
    CompletableFuture<DescribeVpcFirewallCenSummaryListResponse> describeVpcFirewallCenSummaryList(DescribeVpcFirewallCenSummaryListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to query the access control policies of virtual private cloud (VPC) firewalls. Virtual private cloud (VPC) firewalls use different access control policies when protecting traffic between two VPCs connected by Cloud Enterprise Network (CEN) and traffic between two VPCs connected by Express Connect.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit per user for this operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallControlPolicy  DescribeVpcFirewallControlPolicyRequest
     * @return DescribeVpcFirewallControlPolicyResponse
     */
    CompletableFuture<DescribeVpcFirewallControlPolicyResponse> describeVpcFirewallControlPolicy(DescribeVpcFirewallControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the intrusion prevention configuration of a specified VPC firewall. Before you call this operation, you must create a VPC firewall instance.</p>
     * <h2>QPS limit</h2>
     * <p>This API operation has a limit of 10 queries per second (QPS) per user. If you exceed this limit, your calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallDefaultIPSConfig  DescribeVpcFirewallDefaultIPSConfigRequest
     * @return DescribeVpcFirewallDefaultIPSConfigResponse
     */
    CompletableFuture<DescribeVpcFirewallDefaultIPSConfigResponse> describeVpcFirewallDefaultIPSConfig(DescribeVpcFirewallDefaultIPSConfigRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the details of a VPC firewall. The VPC firewall protects traffic between two VPCs that are connected by an Express Connect circuit. Before you call this operation, you must create a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>QPS limit</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 calls per second for each user. If you exceed this limit, your API calls are throttled. This can affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallDetail  DescribeVpcFirewallDetailRequest
     * @return DescribeVpcFirewallDetailResponse
     */
    CompletableFuture<DescribeVpcFirewallDetailResponse> describeVpcFirewallDetail(DescribeVpcFirewallDetailRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed this limit, API calls are throttled. Throttling can affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallDomainList  DescribeVpcFirewallDomainListRequest
     * @return DescribeVpcFirewallDomainListResponse
     */
    CompletableFuture<DescribeVpcFirewallDomainListResponse> describeVpcFirewallDomainList(DescribeVpcFirewallDomainListRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallDomainRelationList  DescribeVpcFirewallDomainRelationListRequest
     * @return DescribeVpcFirewallDomainRelationListResponse
     */
    CompletableFuture<DescribeVpcFirewallDomainRelationListResponse> describeVpcFirewallDomainRelationList(DescribeVpcFirewallDomainRelationListRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallDropTrafficTrend  DescribeVpcFirewallDropTrafficTrendRequest
     * @return DescribeVpcFirewallDropTrafficTrendResponse
     */
    CompletableFuture<DescribeVpcFirewallDropTrafficTrendResponse> describeVpcFirewallDropTrafficTrend(DescribeVpcFirewallDropTrafficTrendRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallIPSWhitelist  DescribeVpcFirewallIPSWhitelistRequest
     * @return DescribeVpcFirewallIPSWhitelistResponse
     */
    CompletableFuture<DescribeVpcFirewallIPSWhitelistResponse> describeVpcFirewallIPSWhitelist(DescribeVpcFirewallIPSWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used to perform a paging query on the information about virtual private cloud (VPC) border firewalls. The virtual private cloud (VPC) border firewalls protect traffic between two VPCs connected by Express Connect.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API invocations are throttled, which may affect your services. Invoke the API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallList  DescribeVpcFirewallListRequest
     * @return DescribeVpcFirewallListResponse
     */
    CompletableFuture<DescribeVpcFirewallListResponse> describeVpcFirewallList(DescribeVpcFirewallListRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the vSwitch list in manual mode for a firewall. <strong>Required parameters</strong>: If OwnerId (owner user ID, Long type) is empty, ErrorOwnerId is returned. If regionNo (region) is empty, ErrorRegionNoError is returned. If vpcId is empty, ErrorVpcIdError is returned. <strong>Before you begin</strong>: Call <a href="~~DescribeVpcFirewallList~~">DescribeVpcFirewallList</a> to obtain VpcFirewallId, OwnerId (from LocalVpc.OwnerId or PeerVpc.OwnerId in the response), and VpcId (from LocalVpc.VpcId or PeerVpc.VpcId in the response).</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallManualVSwitchList  DescribeVpcFirewallManualVSwitchListRequest
     * @return DescribeVpcFirewallManualVSwitchListResponse
     */
    CompletableFuture<DescribeVpcFirewallManualVSwitchListResponse> describeVpcFirewallManualVSwitchList(DescribeVpcFirewallManualVSwitchListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to query the effective policy priority range of the access control policy in a specified VPC firewall policy group.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallPolicyPriorUsed  DescribeVpcFirewallPolicyPriorUsedRequest
     * @return DescribeVpcFirewallPolicyPriorUsedResponse
     */
    CompletableFuture<DescribeVpcFirewallPolicyPriorUsedResponse> describeVpcFirewallPolicyPriorUsed(DescribeVpcFirewallPolicyPriorUsedRequest request);

    /**
     * <b>description</b> :
     * <h2>Rate limits</h2>
     * <p>The rate limit for this API operation is 10 queries per second (QPS) per user. If you exceed the limit, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallPrecheckDetail  DescribeVpcFirewallPrecheckDetailRequest
     * @return DescribeVpcFirewallPrecheckDetailResponse
     */
    CompletableFuture<DescribeVpcFirewallPrecheckDetailResponse> describeVpcFirewallPrecheckDetail(DescribeVpcFirewallPrecheckDetailRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallSummaryInfo  DescribeVpcFirewallSummaryInfoRequest
     * @return DescribeVpcFirewallSummaryInfoResponse
     */
    CompletableFuture<DescribeVpcFirewallSummaryInfoResponse> describeVpcFirewallSummaryInfo(DescribeVpcFirewallSummaryInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the information about assets involved in VPC mutual access. When you call this operation, you must set IsAITraffic to &quot;true&quot;. Otherwise, the -340103 error is returned.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallTrafficAssetList  DescribeVpcFirewallTrafficAssetListRequest
     * @return DescribeVpcFirewallTrafficAssetListResponse
     */
    CompletableFuture<DescribeVpcFirewallTrafficAssetListResponse> describeVpcFirewallTrafficAssetList(DescribeVpcFirewallTrafficAssetListRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallTrafficTrend  DescribeVpcFirewallTrafficTrendRequest
     * @return DescribeVpcFirewallTrafficTrendResponse
     */
    CompletableFuture<DescribeVpcFirewallTrafficTrendResponse> describeVpcFirewallTrafficTrend(DescribeVpcFirewallTrafficTrendRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallZone  DescribeVpcFirewallZoneRequest
     * @return DescribeVpcFirewallZoneResponse
     */
    CompletableFuture<DescribeVpcFirewallZoneResponse> describeVpcFirewallZone(DescribeVpcFirewallZoneRequest request);

    /**
     * @param request the request parameters of DescribeVpcListLite  DescribeVpcListLiteRequest
     * @return DescribeVpcListLiteResponse
     */
    CompletableFuture<DescribeVpcListLiteResponse> describeVpcListLite(DescribeVpcListLiteRequest request);

    /**
     * @param request the request parameters of DescribeVpcZone  DescribeVpcZoneRequest
     * @return DescribeVpcZoneResponse
     */
    CompletableFuture<DescribeVpcZoneResponse> describeVpcZone(DescribeVpcZoneRequest request);

    /**
     * @param request the request parameters of DescribeVulnerabilityProtectedList  DescribeVulnerabilityProtectedListRequest
     * @return DescribeVulnerabilityProtectedListResponse
     */
    CompletableFuture<DescribeVulnerabilityProtectedListResponse> describeVulnerabilityProtectedList(DescribeVulnerabilityProtectedListRequest request);

    /**
     * @param request the request parameters of DisableSdlProtectedAsset  DisableSdlProtectedAssetRequest
     * @return DisableSdlProtectedAssetResponse
     */
    CompletableFuture<DisableSdlProtectedAssetResponse> disableSdlProtectedAsset(DisableSdlProtectedAssetRequest request);

    /**
     * <b>description</b> :
     * <p>Enables data leak detection (SDL) protection for the specified assets.</p>
     * 
     * @param request the request parameters of EnableSdlProtectedAsset  EnableSdlProtectedAssetRequest
     * @return EnableSdlProtectedAssetResponse
     */
    CompletableFuture<EnableSdlProtectedAssetResponse> enableSdlProtectedAsset(EnableSdlProtectedAssetRequest request);

    /**
     * @param request the request parameters of GetApplicationTemplate  GetApplicationTemplateRequest
     * @return GetApplicationTemplateResponse
     */
    CompletableFuture<GetApplicationTemplateResponse> getApplicationTemplate(GetApplicationTemplateRequest request);

    /**
     * @param request the request parameters of GetFirewallFeature  GetFirewallFeatureRequest
     * @return GetFirewallFeatureResponse
     */
    CompletableFuture<GetFirewallFeatureResponse> getFirewallFeature(GetFirewallFeatureRequest request);

    /**
     * <b>description</b> :
     * <p>This operation returns a temporary download link for the Certificate Authority (CA) certificate. The link is valid for one minute. After the link expires, call this operation again to obtain a new download link.</p>
     * 
     * @param request the request parameters of GetTlsInspectCertificateDownloadUrl  GetTlsInspectCertificateDownloadUrlRequest
     * @return GetTlsInspectCertificateDownloadUrlResponse
     */
    CompletableFuture<GetTlsInspectCertificateDownloadUrlResponse> getTlsInspectCertificateDownloadUrl(GetTlsInspectCertificateDownloadUrlRequest request);

    /**
     * @param request the request parameters of ListApplicationCustomRules  ListApplicationCustomRulesRequest
     * @return ListApplicationCustomRulesResponse
     */
    CompletableFuture<ListApplicationCustomRulesResponse> listApplicationCustomRules(ListApplicationCustomRulesRequest request);

    /**
     * @param request the request parameters of ListApplicationTemplate  ListApplicationTemplateRequest
     * @return ListApplicationTemplateResponse
     */
    CompletableFuture<ListApplicationTemplateResponse> listApplicationTemplate(ListApplicationTemplateRequest request);

    /**
     * @param request the request parameters of ListApplicationUpdateDynamics  ListApplicationUpdateDynamicsRequest
     * @return ListApplicationUpdateDynamicsResponse
     */
    CompletableFuture<ListApplicationUpdateDynamicsResponse> listApplicationUpdateDynamics(ListApplicationUpdateDynamicsRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * @param request the request parameters of ListTlsInspectCACertificates  ListTlsInspectCACertificatesRequest
     * @return ListTlsInspectCACertificatesResponse
     */
    CompletableFuture<ListTlsInspectCACertificatesResponse> listTlsInspectCACertificates(ListTlsInspectCACertificatesRequest request);

    /**
     * @param request the request parameters of ListWebFilterRules  ListWebFilterRulesRequest
     * @return ListWebFilterRulesResponse
     */
    CompletableFuture<ListWebFilterRulesResponse> listWebFilterRules(ListWebFilterRulesRequest request);

    /**
     * @param request the request parameters of ListWebFilterTemplates  ListWebFilterTemplatesRequest
     * @return ListWebFilterTemplatesResponse
     */
    CompletableFuture<ListWebFilterTemplatesResponse> listWebFilterTemplates(ListWebFilterTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to modify an address book.</p>
     * <h2>Rate limits</h2>
     * <p>The QPS limit for a single user is 10 requests per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ModifyAddressBook  ModifyAddressBookRequest
     * @return ModifyAddressBookResponse
     */
    CompletableFuture<ModifyAddressBookResponse> modifyAddressBook(ModifyAddressBookRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure that you understand the billing methods and <a href="https://help.aliyun.com/zh/cloud-firewall/cloudfirewall/product-overview/pay-as-you-go">pricing</a> for the pay-as-you-go edition of Cloud Firewall.</p>
     * 
     * @param request the request parameters of ModifyCfwInstance  ModifyCfwInstanceRequest
     * @return ModifyCfwInstanceResponse
     */
    CompletableFuture<ModifyCfwInstanceResponse> modifyCfwInstance(ModifyCfwInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used to modify the configurations of an access control policy that allows, denies, or monitors traffic passing through Cloud Firewall.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ModifyControlPolicy  ModifyControlPolicyRequest
     * @return ModifyControlPolicyResponse
     */
    CompletableFuture<ModifyControlPolicyResponse> modifyControlPolicy(ModifyControlPolicyRequest request);

    /**
     * @deprecated OpenAPI ModifyControlPolicyPosition is deprecated, please use Cloudfw::2017-12-07::ModifyControlPolicyPriority instead.  * @description You can call this operation to modify the priority of an IPv4 access control policy for the Internet firewall. This operation does not support modifying the priority of IPv6 access control policies.
     * ## QPS limit
     * The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, API calls are throttled, which can affect your business. We recommend that you call this operation within this limit.
     * 
     * @param request the request parameters of ModifyControlPolicyPosition  ModifyControlPolicyPositionRequest
     * @return ModifyControlPolicyPositionResponse
     */
    @Deprecated
    CompletableFuture<ModifyControlPolicyPositionResponse> modifyControlPolicyPosition(ModifyControlPolicyPositionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to modify the configuration of an access control policy that allows, denies, or monitors traffic passing through Cloud Firewall.</p>
     * <h2>Before you begin</h2>
     * <p>Before calling this operation, call DescribeControlPolicy and pass the same Direction parameter to obtain the current policy list and the number of policies. This helps you determine the valid value range of the Order parameter, which is from 1 to the number of policies.</p>
     * <h2>Rate limit</h2>
     * <p>The rate limit for this operation is 10 queries per second (QPS) per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation as needed.</p>
     * 
     * @param request the request parameters of ModifyControlPolicyPriority  ModifyControlPolicyPriorityRequest
     * @return ModifyControlPolicyPriorityResponse
     */
    CompletableFuture<ModifyControlPolicyPriorityResponse> modifyControlPolicyPriority(ModifyControlPolicyPriorityRequest request);

    /**
     * @param request the request parameters of ModifyDefaultIPSConfig  ModifyDefaultIPSConfigRequest
     * @return ModifyDefaultIPSConfigResponse
     */
    CompletableFuture<ModifyDefaultIPSConfigResponse> modifyDefaultIPSConfig(ModifyDefaultIPSConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies a DNS firewall access control policy to allow, deny, or monitor DNS firewall traffic.</p>
     * 
     * @param request the request parameters of ModifyDnsFirewallPolicy  ModifyDnsFirewallPolicyRequest
     * @return ModifyDnsFirewallPolicyResponse
     */
    CompletableFuture<ModifyDnsFirewallPolicyResponse> modifyDnsFirewallPolicy(ModifyDnsFirewallPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation modifies the route policy switch of the virtual private cloud (VPC) firewalls for a transit router (TR).</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>You have created virtual private cloud (VPC) firewalls for a transit router (TR) and obtained the FirewallId by calling CreateTrFirewallV2.</li>
     * <li>You have created a route policy and obtained the TrFirewallRoutePolicyId by calling CreateTrFirewallV2RoutePolicy.</li>
     * <li>You can call DescribeTrFirewallsV2List and DescribeTrFirewallV2RoutePolicyList to query and confirm the preceding resources.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyFirewallV2RoutePolicySwitch  ModifyFirewallV2RoutePolicySwitchRequest
     * @return ModifyFirewallV2RoutePolicySwitchResponse
     */
    CompletableFuture<ModifyFirewallV2RoutePolicySwitchResponse> modifyFirewallV2RoutePolicySwitch(ModifyFirewallV2RoutePolicySwitchRequest request);

    /**
     * <b>description</b> :
     * <p>This operation updates the attributes of member accounts in Cloud Firewall.</p>
     * <h2>QPS limit</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 for each user. If you exceed this limit, API calls are rate-limited. This may affect your business operations. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ModifyInstanceMemberAttributes  ModifyInstanceMemberAttributesRequest
     * @return ModifyInstanceMemberAttributesResponse
     */
    CompletableFuture<ModifyInstanceMemberAttributesResponse> modifyInstanceMemberAttributes(ModifyInstanceMemberAttributesRequest request);

    /**
     * @param request the request parameters of ModifyIpsRules  ModifyIpsRulesRequest
     * @return ModifyIpsRulesResponse
     */
    CompletableFuture<ModifyIpsRulesResponse> modifyIpsRules(ModifyIpsRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Restores user-defined intrusion prevention system (IPS) rules to the system defaults by deleting user override records. After restoration, the rules follow the default values of the rule library. This operation uses the FirewallType parameter to determine the scope and input constraints:\n- <strong>InternetFirewall / VpcFirewall</strong>: The scope is the entire account. RuleType is required. You must specify at least one of Rules or AttackApp.\n- <strong>NatFirewall</strong>: The scope is a single NAT firewall instance specified by ProxyId. RuleType is optional. Both Rules and AttackApp are optional.\nThe two branches handle an empty array for Rules differently. For the Internet or VPC firewall, passing [] is equivalent to restoring all rules of the specified RuleType. For the NAT firewall, passing [] returns a 400 ErrorParameters error. To restore all rules for a NAT firewall, do not pass the Rules parameter.</p>
     * 
     * @param request the request parameters of ModifyIpsRulesToDefault  ModifyIpsRulesToDefaultRequest
     * @return ModifyIpsRulesToDefaultResponse
     */
    CompletableFuture<ModifyIpsRulesToDefaultResponse> modifyIpsRulesToDefault(ModifyIpsRulesToDefaultRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to modify the configuration of an access control policy that allows, denies, or monitors traffic passing through a NAT firewall.</p>
     * 
     * @param request the request parameters of ModifyNatFirewallControlPolicy  ModifyNatFirewallControlPolicyRequest
     * @return ModifyNatFirewallControlPolicyResponse
     */
    CompletableFuture<ModifyNatFirewallControlPolicyResponse> modifyNatFirewallControlPolicy(ModifyNatFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of ModifyNatFirewallControlPolicyPosition  ModifyNatFirewallControlPolicyPositionRequest
     * @return ModifyNatFirewallControlPolicyPositionResponse
     */
    CompletableFuture<ModifyNatFirewallControlPolicyPositionResponse> modifyNatFirewallControlPolicyPosition(ModifyNatFirewallControlPolicyPositionRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Before you call this operation, you must activate Cloud Firewall.</li>
     * <li>You can call <a href="~~DescribeUserBuyVersion~~">DescribeUserBuyVersion</a> to query the activation status. The UserStatus field in the response indicates whether the Cloud Firewall instance is valid. A value of false indicates that the instance is invalid or not activated.</li>
     * <li>Activate Cloud Firewall:<ul>
     * <li>China site: <a href="https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn">https://common-buy.aliyun.com/?commodityCode=cfw_sub_public_cn</a></li>
     * <li>International site: <a href="https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl">https://common-buy-intl.alibabacloud.com/?commodityCode=cfw_sub_public_intl</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyObjectGroupOperation  ModifyObjectGroupOperationRequest
     * @return ModifyObjectGroupOperationResponse
     */
    CompletableFuture<ModifyObjectGroupOperationResponse> modifyObjectGroupOperation(ModifyObjectGroupOperationRequest request);

    /**
     * <b>description</b> :
     * <p>This operation enables or disables the strict mode for access control policies.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If you exceed the limit, API calls are throttled, which can affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of ModifyPolicyAdvancedConfig  ModifyPolicyAdvancedConfigRequest
     * @return ModifyPolicyAdvancedConfigResponse
     */
    CompletableFuture<ModifyPolicyAdvancedConfigResponse> modifyPolicyAdvancedConfig(ModifyPolicyAdvancedConfigRequest request);

    /**
     * @param request the request parameters of ModifyPrivateDnsEndpoint  ModifyPrivateDnsEndpointRequest
     * @return ModifyPrivateDnsEndpointResponse
     */
    CompletableFuture<ModifyPrivateDnsEndpointResponse> modifyPrivateDnsEndpoint(ModifyPrivateDnsEndpointRequest request);

    /**
     * @param request the request parameters of ModifyResourceTypeAutoEnable  ModifyResourceTypeAutoEnableRequest
     * @return ModifyResourceTypeAutoEnableResponse
     */
    CompletableFuture<ModifyResourceTypeAutoEnableResponse> modifyResourceTypeAutoEnable(ModifyResourceTypeAutoEnableRequest request);

    /**
     * @param request the request parameters of ModifySensitiveSwitch  ModifySensitiveSwitchRequest
     * @return ModifySensitiveSwitchResponse
     */
    CompletableFuture<ModifySensitiveSwitchResponse> modifySensitiveSwitch(ModifySensitiveSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, call DescribeUserBuyVersion to obtain the LogVersion of the user.</p>
     * 
     * @param request the request parameters of ModifySlsDispatchConfig  ModifySlsDispatchConfigRequest
     * @return ModifySlsDispatchConfigResponse
     */
    CompletableFuture<ModifySlsDispatchConfigResponse> modifySlsDispatchConfig(ModifySlsDispatchConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this API up to 10 times per second per user. If you exceed this limit, API calls are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ModifySlsDispatchStatus  ModifySlsDispatchStatusRequest
     * @return ModifySlsDispatchStatusResponse
     */
    CompletableFuture<ModifySlsDispatchStatusResponse> modifySlsDispatchStatus(ModifySlsDispatchStatusRequest request);

    /**
     * @param request the request parameters of ModifyThreatIntelligenceSwitch  ModifyThreatIntelligenceSwitchRequest
     * @return ModifyThreatIntelligenceSwitchResponse
     */
    CompletableFuture<ModifyThreatIntelligenceSwitchResponse> modifyThreatIntelligenceSwitch(ModifyThreatIntelligenceSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the configuration of a virtual private cloud (VPC) firewall. Although the API operation is named ModifyTrFirewallV2Configuration, it supports all types of VPC firewalls and is not limited to CEN Enterprise Edition TR firewalls. The FirewallId format is not limited to the vfw-tr-* prefix. Before you call this API operation, you must create a VPC firewall instance. You can create a TR firewall by calling CreateTrFirewallV2 and query its FirewallId by calling DescribeTrFirewallsV2List.</p>
     * 
     * @param request the request parameters of ModifyTrFirewallV2Configuration  ModifyTrFirewallV2ConfigurationRequest
     * @return ModifyTrFirewallV2ConfigurationResponse
     */
    CompletableFuture<ModifyTrFirewallV2ConfigurationResponse> modifyTrFirewallV2Configuration(ModifyTrFirewallV2ConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>Supports modifications for <em>point-to-multipoint</em> and <em>multipoint interconnection</em> scenarios. Does not support modifications for <em>point-to-point</em> scenarios.</p>
     * 
     * @param request the request parameters of ModifyTrFirewallV2RoutePolicyScope  ModifyTrFirewallV2RoutePolicyScopeRequest
     * @return ModifyTrFirewallV2RoutePolicyScopeResponse
     */
    CompletableFuture<ModifyTrFirewallV2RoutePolicyScopeResponse> modifyTrFirewallV2RoutePolicyScope(ModifyTrFirewallV2RoutePolicyScopeRequest request);

    /**
     * @param request the request parameters of ModifyUserAlarmConfig  ModifyUserAlarmConfigRequest
     * @return ModifyUserAlarmConfigResponse
     */
    CompletableFuture<ModifyUserAlarmConfigResponse> modifyUserAlarmConfig(ModifyUserAlarmConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled. This can affect your business. We recommend that you call the API at a reasonable rate.</p>
     * 
     * @param request the request parameters of ModifyUserIPSWhitelist  ModifyUserIPSWhitelistRequest
     * @return ModifyUserIPSWhitelistResponse
     */
    CompletableFuture<ModifyUserIPSWhitelistResponse> modifyUserIPSWhitelist(ModifyUserIPSWhitelistRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 per user. Calls that exceed this limit are rate-limited, which may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ModifyUserSlsLogStorageTime  ModifyUserSlsLogStorageTimeRequest
     * @return ModifyUserSlsLogStorageTimeResponse
     */
    CompletableFuture<ModifyUserSlsLogStorageTimeResponse> modifyUserSlsLogStorageTime(ModifyUserSlsLogStorageTimeRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>This API is limited to 10 queries per second (QPS) per user. Calls that exceed this limit are throttled. This may affect your business. Plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallAclEngineMode  ModifyVpcFirewallAclEngineModeRequest
     * @return ModifyVpcFirewallAclEngineModeResponse
     */
    CompletableFuture<ModifyVpcFirewallAclEngineModeResponse> modifyVpcFirewallAclEngineMode(ModifyVpcFirewallAclEngineModeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation modifies the configuration of a VPC firewall. The VPC firewall protects traffic between network instances in a Cloud Enterprise Network (CEN) and a specified VPC. The network instances include VPCs, virtual border routers (VBRs), and Cloud Connect Network (CCN) instances. Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation to create a VPC firewall.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for a single user. If the limit is exceeded, API calls are throttled. This may affect your business. Please plan your API calls accordingly.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallCenConfigure  ModifyVpcFirewallCenConfigureRequest
     * @return ModifyVpcFirewallCenConfigureResponse
     */
    CompletableFuture<ModifyVpcFirewallCenConfigureResponse> modifyVpcFirewallCenConfigure(ModifyVpcFirewallCenConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>This operation modifies the status of a VPC firewall. The firewall protects traffic between network instances in a Cloud Enterprise Network (CEN) and a specified Virtual Private Cloud (VPC). The network instances include VPCs, Virtual Border Routers (VBRs), and Cloud Connect Network (CCN) instances. If the firewall is enabled, it protects traffic between the network instances in the CEN and the specified VPC. If the firewall is disabled, it no longer protects this traffic.
     * Before you call this operation, you must create a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled. Throttling may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallCenSwitchStatus  ModifyVpcFirewallCenSwitchStatusRequest
     * @return ModifyVpcFirewallCenSwitchStatusResponse
     */
    CompletableFuture<ModifyVpcFirewallCenSwitchStatusResponse> modifyVpcFirewallCenSwitchStatus(ModifyVpcFirewallCenSwitchStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is generally used to modify the configuration of a VPC border firewall. The VPC border firewall protects traffic between two VPCs connected over Express Connect.
     * Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation to create a VPC border firewall.</p>
     * <h2>Rate limit</h2>
     * <p>You can call this operation up to 10 times per second. Requests that exceed this limit are throttled, which may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallConfigure  ModifyVpcFirewallConfigureRequest
     * @return ModifyVpcFirewallConfigureResponse
     */
    CompletableFuture<ModifyVpcFirewallConfigureResponse> modifyVpcFirewallConfigure(ModifyVpcFirewallConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is typically used to modify the configuration of an access control policy for a specified VPC firewall policy group. VPC firewall instances that protect Cloud Enterprise Network (CEN) instances and VPC firewall instances that protect Express Connect circuits use different access control policies.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallControlPolicy  ModifyVpcFirewallControlPolicyRequest
     * @return ModifyVpcFirewallControlPolicyResponse
     */
    CompletableFuture<ModifyVpcFirewallControlPolicyResponse> modifyVpcFirewallControlPolicy(ModifyVpcFirewallControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the priority of an access control policy in a policy group for a VPC firewall.</p>
     * <h2>QPS limit</h2>
     * <p>The limit on the number of queries per second (QPS) for a single user is 10. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallControlPolicyPosition  ModifyVpcFirewallControlPolicyPositionRequest
     * @return ModifyVpcFirewallControlPolicyPositionResponse
     */
    CompletableFuture<ModifyVpcFirewallControlPolicyPositionResponse> modifyVpcFirewallControlPolicyPosition(ModifyVpcFirewallControlPolicyPositionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the intrusion prevention configuration of a VPC firewall.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 per user. If the QPS limit is exceeded, API calls are throttled. This may affect your business. We recommend that you take this limit into consideration when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallDefaultIPSConfig  ModifyVpcFirewallDefaultIPSConfigRequest
     * @return ModifyVpcFirewallDefaultIPSConfigResponse
     */
    CompletableFuture<ModifyVpcFirewallDefaultIPSConfigResponse> modifyVpcFirewallDefaultIPSConfig(ModifyVpcFirewallDefaultIPSConfigRequest request);

    /**
     * @param request the request parameters of ModifyVpcFirewallIPSWhitelist  ModifyVpcFirewallIPSWhitelistRequest
     * @return ModifyVpcFirewallIPSWhitelistResponse
     */
    CompletableFuture<ModifyVpcFirewallIPSWhitelistResponse> modifyVpcFirewallIPSWhitelist(ModifyVpcFirewallIPSWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>This operation modifies the switch status of virtual private cloud (VPC) firewalls at the border. The virtual private cloud (VPC) firewalls at the border protect traffic between two VPCs connected over Express Connect. After you enable the virtual private cloud (VPC) firewalls at the border, the mutual access traffic between the two VPCs connected over Express Connect is protected by the virtual private cloud (VPC) firewalls at the border. After the shutdown of the virtual private cloud (VPC) firewalls at the border, the virtual private cloud (VPC) firewalls at the border no longer protect the mutual access traffic between the two VPCs connected over Express Connect.
     * Before you invoke this operation, you must have invoked the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation to create virtual private cloud (VPC) firewalls at the border.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit per user for this operation is 10. If the number of invocations per second exceeds the limit, throttling is triggered, which may affect your services. Make invocations at a reasonable rate.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallSwitchStatus  ModifyVpcFirewallSwitchStatusRequest
     * @return ModifyVpcFirewallSwitchStatusResponse
     */
    CompletableFuture<ModifyVpcFirewallSwitchStatusResponse> modifyVpcFirewallSwitchStatus(ModifyVpcFirewallSwitchStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation disables all firewall switches.</p>
     * <h2>Rate limit</h2>
     * <p>The rate limit for a single user is 10 queries per second (QPS). If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of PutDisableAllFwSwitch  PutDisableAllFwSwitchRequest
     * @return PutDisableAllFwSwitchResponse
     */
    CompletableFuture<PutDisableAllFwSwitchResponse> putDisableAllFwSwitch(PutDisableAllFwSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>Disables the firewall switch. After the firewall switch is disabled, traffic does not pass through Cloud Firewall.</p>
     * <h2>QPS limit</h2>
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of PutDisableFwSwitch  PutDisableFwSwitchRequest
     * @return PutDisableFwSwitchResponse
     */
    CompletableFuture<PutDisableFwSwitchResponse> putDisableFwSwitch(PutDisableFwSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation protects all public IP addresses of your Alibaba Cloud account.</p>
     * <h2>QPS limits</h2>
     * <p>This API operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of PutEnableAllFwSwitch  PutEnableAllFwSwitchRequest
     * @return PutEnableAllFwSwitchResponse
     */
    CompletableFuture<PutEnableAllFwSwitchResponse> putEnableAllFwSwitch(PutEnableAllFwSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>This operation enables the firewall switch. Traffic passes through Cloud Firewall only after the firewall switch is enabled.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 5 requests per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of PutEnableFwSwitch  PutEnableFwSwitchRequest
     * @return PutEnableFwSwitchResponse
     */
    CompletableFuture<PutEnableFwSwitchResponse> putEnableFwSwitch(PutEnableFwSwitchRequest request);

    /**
     * @param request the request parameters of ReleaseExpiredInstance  ReleaseExpiredInstanceRequest
     * @return ReleaseExpiredInstanceResponse
     */
    CompletableFuture<ReleaseExpiredInstanceResponse> releaseExpiredInstance(ReleaseExpiredInstanceRequest request);

    /**
     * @param request the request parameters of ReleasePostInstance  ReleasePostInstanceRequest
     * @return ReleasePostInstanceResponse
     */
    CompletableFuture<ReleasePostInstanceResponse> releasePostInstance(ReleasePostInstanceRequest request);

    /**
     * @param request the request parameters of ResetNatFirewallRuleHitCount  ResetNatFirewallRuleHitCountRequest
     * @return ResetNatFirewallRuleHitCountResponse
     */
    CompletableFuture<ResetNatFirewallRuleHitCountResponse> resetNatFirewallRuleHitCount(ResetNatFirewallRuleHitCountRequest request);

    /**
     * <b>description</b> :
     * <p>This operation resets the hit count of an access control policy in a VPC firewall policy group.</p>
     * <h2>QPS limit</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. If you exceed this limit, API calls are throttled, which may impact your business. Plan your calls accordingly.</p>
     * 
     * @param request the request parameters of ResetRuleHitCount  ResetRuleHitCountRequest
     * @return ResetRuleHitCountResponse
     */
    CompletableFuture<ResetRuleHitCountResponse> resetRuleHitCount(ResetRuleHitCountRequest request);

    /**
     * <b>description</b> :
     * <p>This operation resets the hit count of a specific access control policy in a VPC firewall policy group to zero.</p>
     * <h2>QPS limit</h2>
     * <p>This operation has a queries per second (QPS) limit of 10 per user. Calls that exceed this limit are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of ResetVpcFirewallRuleHitCount  ResetVpcFirewallRuleHitCountRequest
     * @return ResetVpcFirewallRuleHitCountResponse
     */
    CompletableFuture<ResetVpcFirewallRuleHitCountResponse> resetVpcFirewallRuleHitCount(ResetVpcFirewallRuleHitCountRequest request);

    /**
     * <b>description</b> :
     * <p>Each Cloud Firewall instance supports up to 100 associations for TLS inspection policies.</p>
     * 
     * @param request the request parameters of SetAutoProtectNewAssets  SetAutoProtectNewAssetsRequest
     * @return SetAutoProtectNewAssetsResponse
     */
    CompletableFuture<SetAutoProtectNewAssetsResponse> setAutoProtectNewAssets(SetAutoProtectNewAssetsRequest request);

    /**
     * @param request the request parameters of SwitchSecurityProxy  SwitchSecurityProxyRequest
     * @return SwitchSecurityProxyResponse
     */
    CompletableFuture<SwitchSecurityProxyResponse> switchSecurityProxy(SwitchSecurityProxyRequest request);

    /**
     * <b>description</b> :
     * <p>The analysis covers all data for your Cloud Firewall instance from the date of purchase.</p>
     * 
     * @param request the request parameters of UpdateAITrafficAnalysisStatus  UpdateAITrafficAnalysisStatusRequest
     * @return UpdateAITrafficAnalysisStatusResponse
     */
    CompletableFuture<UpdateAITrafficAnalysisStatusResponse> updateAITrafficAnalysisStatus(UpdateAITrafficAnalysisStatusRequest request);

    /**
     * @param request the request parameters of UpdateAckClusterConnector  UpdateAckClusterConnectorRequest
     * @return UpdateAckClusterConnectorResponse
     */
    CompletableFuture<UpdateAckClusterConnectorResponse> updateAckClusterConnector(UpdateAckClusterConnectorRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of UpdateAclCheckDetailStatus  UpdateAclCheckDetailStatusRequest
     * @return UpdateAclCheckDetailStatusResponse
     */
    CompletableFuture<UpdateAclCheckDetailStatusResponse> updateAclCheckDetailStatus(UpdateAclCheckDetailStatusRequest request);

    /**
     * @param request the request parameters of UpdateApplicationCustomRules  UpdateApplicationCustomRulesRequest
     * @return UpdateApplicationCustomRulesResponse
     */
    CompletableFuture<UpdateApplicationCustomRulesResponse> updateApplicationCustomRules(UpdateApplicationCustomRulesRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of UpdateApplicationTemplate  UpdateApplicationTemplateRequest
     * @return UpdateApplicationTemplateResponse
     */
    CompletableFuture<UpdateApplicationTemplateResponse> updateApplicationTemplate(UpdateApplicationTemplateRequest request);

    /**
     * @param request the request parameters of UpdateFirewallFeature  UpdateFirewallFeatureRequest
     * @return UpdateFirewallFeatureResponse
     */
    CompletableFuture<UpdateFirewallFeatureResponse> updateFirewallFeature(UpdateFirewallFeatureRequest request);

    /**
     * @param request the request parameters of UpdatePostpayUserInternetStatus  UpdatePostpayUserInternetStatusRequest
     * @return UpdatePostpayUserInternetStatusResponse
     */
    CompletableFuture<UpdatePostpayUserInternetStatusResponse> updatePostpayUserInternetStatus(UpdatePostpayUserInternetStatusRequest request);

    /**
     * @param request the request parameters of UpdatePostpayUserNatStatus  UpdatePostpayUserNatStatusRequest
     * @return UpdatePostpayUserNatStatusResponse
     */
    CompletableFuture<UpdatePostpayUserNatStatusResponse> updatePostpayUserNatStatus(UpdatePostpayUserNatStatusRequest request);

    /**
     * @param request the request parameters of UpdatePostpayUserVpcStatus  UpdatePostpayUserVpcStatusRequest
     * @return UpdatePostpayUserVpcStatusResponse
     */
    CompletableFuture<UpdatePostpayUserVpcStatusResponse> updatePostpayUserVpcStatus(UpdatePostpayUserVpcStatusRequest request);

    /**
     * @param request the request parameters of UpdateSecurityProxy  UpdateSecurityProxyRequest
     * @return UpdateSecurityProxyResponse
     */
    CompletableFuture<UpdateSecurityProxyResponse> updateSecurityProxy(UpdateSecurityProxyRequest request);

    /**
     * @param request the request parameters of UpdateWebFilterRules  UpdateWebFilterRulesRequest
     * @return UpdateWebFilterRulesResponse
     */
    CompletableFuture<UpdateWebFilterRulesResponse> updateWebFilterRules(UpdateWebFilterRulesRequest request);

    /**
     * @param request the request parameters of UpdateWebFilterTemplate  UpdateWebFilterTemplateRequest
     * @return UpdateWebFilterTemplateResponse
     */
    CompletableFuture<UpdateWebFilterTemplateResponse> updateWebFilterTemplate(UpdateWebFilterTemplateRequest request);

    /**
     * @param request the request parameters of UseAclBackupData  UseAclBackupDataRequest
     * @return UseAclBackupDataResponse
     */
    CompletableFuture<UseAclBackupDataResponse> useAclBackupData(UseAclBackupDataRequest request);

}
