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
      * You can call the AddAddressBook operation to create an address book for access control. The address book can be an IP address book, an ECS tag-based address book, a port address book, or a domain address book.
      * ## [](#qps)Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AddAddressBookResponse> addAddressBook(AddAddressBookRequest request);

    /**
      * You can call the AddControlPolicy operation to create an access control policy to allow, block, or monitor traffic that reaches Cloud Firewall.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AddControlPolicyResponse> addControlPolicy(AddControlPolicyRequest request);

    /**
      * You can call the AddInstanceMembers operation to add members to Cloud Firewall. 
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AddInstanceMembersResponse> addInstanceMembers(AddInstanceMembersRequest request);

    /**
      * You can call the BatchCopyVpcFirewallControlPolicy operation to copy all access control policies from a policy group of a source VPC firewall to a policy group of a destination VPC firewall.  
      * Before you call this operation, we recommend that you back up access control policies. For more information about how to back up an access control policy, see [Back up an access control policy](https://www.alibabacloud.com/help/en/cloud-firewall/latest/back-up-and-roll-back-an-access-control-policy).  
      * After you call this operation, all the access control policies in the policy group of the destination VPC firewall are replaced.  
      * The policy groups of the source VPC firewall and the destination VPC firewall must belong to the same Alibaba Cloud account.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. When the number of calls to this operation per second exceeds the limit, throttling is triggered. Throttling may affect your business. We recommend that you take note of the limit on this operation.
      *
     */
    CompletableFuture<BatchCopyVpcFirewallControlPolicyResponse> batchCopyVpcFirewallControlPolicy(BatchCopyVpcFirewallControlPolicyRequest request);

    CompletableFuture<CreateDownloadTaskResponse> createDownloadTask(CreateDownloadTaskRequest request);

    /**
      * You can call this operation to create a policy that allows, denies, or monitors the traffic that passes through the NAT firewall.
      *
     */
    CompletableFuture<CreateNatFirewallControlPolicyResponse> createNatFirewallControlPolicy(CreateNatFirewallControlPolicyRequest request);

    CompletableFuture<CreateTrFirewallV2Response> createTrFirewallV2(CreateTrFirewallV2Request request);

    CompletableFuture<CreateTrFirewallV2RoutePolicyResponse> createTrFirewallV2RoutePolicy(CreateTrFirewallV2RoutePolicyRequest request);

    /**
      * You can call the CreateVpcFirewallCenConfigure operation to create a VPC firewall. The VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. The VPC firewall cannot protect mutual access traffic between VBRs, between CCN instances, or between VBRs and CCN instances. For more information, see [VPC firewall limits](~~172295~~).
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateVpcFirewallCenConfigureResponse> createVpcFirewallCenConfigure(CreateVpcFirewallCenConfigureRequest request);

    /**
      * You can call this operation to create a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. The VPC firewall does not control the mutual access traffic between VPCs that reside in different regions or belong to different Alibaba Cloud accounts. The firewall also does not control the mutual access traffic between VPCs and virtual border routers (VBRs). For more information, see [VPC firewall limits](~~172295~~).
      * ### [](#qps)QPS limit
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateVpcFirewallConfigureResponse> createVpcFirewallConfigure(CreateVpcFirewallConfigureRequest request);

    /**
      * You can call the CreateVpcFirewallControlPolicy operation to create an access control policy in a specified policy group for a VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateVpcFirewallControlPolicyResponse> createVpcFirewallControlPolicy(CreateVpcFirewallControlPolicyRequest request);

    /**
      * You can call the DeleteAddressBook operation to delete an address book for access control.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteAddressBookResponse> deleteAddressBook(DeleteAddressBookRequest request);

    /**
      * You can call the DeleteControlPolicy operation to delete an access control policy that applies to inbound or outbound traffic.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request);

    CompletableFuture<DeleteControlPolicyTemplateResponse> deleteControlPolicyTemplate(DeleteControlPolicyTemplateRequest request);

    CompletableFuture<DeleteDownloadTaskResponse> deleteDownloadTask(DeleteDownloadTaskRequest request);

    CompletableFuture<DeleteFirewallV2RoutePoliciesResponse> deleteFirewallV2RoutePolicies(DeleteFirewallV2RoutePoliciesRequest request);

    /**
      * You can call the DeleteInstanceMembers operation to remove members from Cloud Firewall. 
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteInstanceMembersResponse> deleteInstanceMembers(DeleteInstanceMembersRequest request);

    /**
      * You can use this operation to delete an outbound access control policy that is created for a NAT firewall.
      *
     */
    CompletableFuture<DeleteNatFirewallControlPolicyResponse> deleteNatFirewallControlPolicy(DeleteNatFirewallControlPolicyRequest request);

    CompletableFuture<DeleteNatFirewallControlPolicyBatchResponse> deleteNatFirewallControlPolicyBatch(DeleteNatFirewallControlPolicyBatchRequest request);

    CompletableFuture<DeleteTrFirewallV2Response> deleteTrFirewallV2(DeleteTrFirewallV2Request request);

    /**
      * You can call the DeleteVpcFirewallCenConfigure operation to delete a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the [CreateVpcFirewallCenConfigure](~~345772~~) operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteVpcFirewallCenConfigureResponse> deleteVpcFirewallCenConfigure(DeleteVpcFirewallCenConfigureRequest request);

    /**
      * You can call the DeleteVpcFirewallConfigure operation to delete a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the [CreateVpcFirewallConfigure](~~342893~~) operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteVpcFirewallConfigureResponse> deleteVpcFirewallConfigure(DeleteVpcFirewallConfigureRequest request);

    /**
      * You can call the DeleteVpcFirewallControlPolicy operation to delete an access control policy from a specific policy group for a VPC firewall. Different access control policies are used for the VPC firewall that is used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewall that is used to protect each Express Connect circuit. 
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteVpcFirewallControlPolicyResponse> deleteVpcFirewallControlPolicy(DeleteVpcFirewallControlPolicyRequest request);

    CompletableFuture<DescribeACLProtectTrendResponse> describeACLProtectTrend(DescribeACLProtectTrendRequest request);

    /**
      * You can call this operation to query the details about an address book for an access control policy.
      * ## [](#qps)Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeAddressBookResponse> describeAddressBook(DescribeAddressBookRequest request);

    /**
      * You can call the DescribeAssetList operation to query the assets that are protected by Cloud Firewall.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeAssetListResponse> describeAssetList(DescribeAssetListRequest request);

    CompletableFuture<DescribeAssetRiskListResponse> describeAssetRiskList(DescribeAssetRiskListRequest request);

    CompletableFuture<DescribeCfwRiskLevelSummaryResponse> describeCfwRiskLevelSummary(DescribeCfwRiskLevelSummaryRequest request);

    /**
      * You can call the DescribeControlPolicy operation to query the details about access control policies by page.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeControlPolicyResponse> describeControlPolicy(DescribeControlPolicyRequest request);

    CompletableFuture<DescribeDefaultIPSConfigResponse> describeDefaultIPSConfig(DescribeDefaultIPSConfigRequest request);

    /**
      * You can use this operation to query the DNS record of a domain name. This operation can retrieve DNS records only from Alibaba Cloud DNS. Before you can call this operation, make sure that your domain name is hosted on Alibaba Cloud DNS.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDomainResolveResponse> describeDomainResolve(DescribeDomainResolveRequest request);

    CompletableFuture<DescribeDownloadTaskResponse> describeDownloadTask(DescribeDownloadTaskRequest request);

    CompletableFuture<DescribeDownloadTaskTypeResponse> describeDownloadTaskType(DescribeDownloadTaskTypeRequest request);

    /**
      * You can use this operation to query the information about members in Cloud Firewall.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeInstanceMembersResponse> describeInstanceMembers(DescribeInstanceMembersRequest request);

    CompletableFuture<DescribeInstanceRiskLevelsResponse> describeInstanceRiskLevels(DescribeInstanceRiskLevelsRequest request);

    CompletableFuture<DescribeInternetOpenIpResponse> describeInternetOpenIp(DescribeInternetOpenIpRequest request);

    CompletableFuture<DescribeInternetTrafficTrendResponse> describeInternetTrafficTrend(DescribeInternetTrafficTrendRequest request);

    CompletableFuture<DescribeInvadeEventListResponse> describeInvadeEventList(DescribeInvadeEventListRequest request);

    CompletableFuture<DescribeNatAclPageStatusResponse> describeNatAclPageStatus(DescribeNatAclPageStatusRequest request);

    /**
      * You can use this operation to query the information about all access control policies that are created for NAT firewalls by page.
      *
     */
    CompletableFuture<DescribeNatFirewallControlPolicyResponse> describeNatFirewallControlPolicy(DescribeNatFirewallControlPolicyRequest request);

    /**
      * You can use this operation to query the priority range of access control policies that are created for a NAT firewall.
      *
     */
    CompletableFuture<DescribeNatFirewallPolicyPriorUsedResponse> describeNatFirewallPolicyPriorUsed(DescribeNatFirewallPolicyPriorUsedRequest request);

    CompletableFuture<DescribeOutgoingDestinationIPResponse> describeOutgoingDestinationIP(DescribeOutgoingDestinationIPRequest request);

    CompletableFuture<DescribeOutgoingDomainResponse> describeOutgoingDomain(DescribeOutgoingDomainRequest request);

    /**
      * You can call the DescribePolicyAdvancedConfig operation to query whether the strict mode is enabled for an access control policy.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribePolicyAdvancedConfigResponse> describePolicyAdvancedConfig(DescribePolicyAdvancedConfigRequest request);

    /**
      * You can call the DescribePolicyPriorUsed operation to query the priority range of the access control policies that match specific query conditions.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribePolicyPriorUsedResponse> describePolicyPriorUsed(DescribePolicyPriorUsedRequest request);

    CompletableFuture<DescribePostpayTrafficDetailResponse> describePostpayTrafficDetail(DescribePostpayTrafficDetailRequest request);

    CompletableFuture<DescribePostpayTrafficTotalResponse> describePostpayTrafficTotal(DescribePostpayTrafficTotalRequest request);

    CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request);

    /**
      * You can call the DescribeRiskEventGroup operation to query and download the details of intrusion events. We recommend that you query the details of 5 to 10 intrusion events at a time. If you do not need to query the geographical information about IP addresses, you can set the NoLocation parameter to true to prevent query timeout.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeRiskEventGroupResponse> describeRiskEventGroup(DescribeRiskEventGroupRequest request);

    CompletableFuture<DescribeRiskEventPayloadResponse> describeRiskEventPayload(DescribeRiskEventPayloadRequest request);

    CompletableFuture<DescribeSignatureLibVersionResponse> describeSignatureLibVersion(DescribeSignatureLibVersionRequest request);

    CompletableFuture<DescribeTrFirewallPolicyBackUpAssociationListResponse> describeTrFirewallPolicyBackUpAssociationList(DescribeTrFirewallPolicyBackUpAssociationListRequest request);

    CompletableFuture<DescribeTrFirewallV2RoutePolicyListResponse> describeTrFirewallV2RoutePolicyList(DescribeTrFirewallV2RoutePolicyListRequest request);

    CompletableFuture<DescribeTrFirewallsV2DetailResponse> describeTrFirewallsV2Detail(DescribeTrFirewallsV2DetailRequest request);

    CompletableFuture<DescribeTrFirewallsV2ListResponse> describeTrFirewallsV2List(DescribeTrFirewallsV2ListRequest request);

    CompletableFuture<DescribeTrFirewallsV2RouteListResponse> describeTrFirewallsV2RouteList(DescribeTrFirewallsV2RouteListRequest request);

    CompletableFuture<DescribeUserAssetIPTrafficInfoResponse> describeUserAssetIPTrafficInfo(DescribeUserAssetIPTrafficInfoRequest request);

    CompletableFuture<DescribeUserIPSWhitelistResponse> describeUserIPSWhitelist(DescribeUserIPSWhitelistRequest request);

    /**
      * You can call the DescribeVpcFirewallAclGroupList operation to query the information about all policy groups of access control policies that are created for VPC firewalls.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVpcFirewallAclGroupListResponse> describeVpcFirewallAclGroupList(DescribeVpcFirewallAclGroupListRequest request);

    /**
      * You can call the DescribeVpcFirewallCenDetail operation to query the details about a VPC firewall. The VPC firewall protects access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVpcFirewallCenDetailResponse> describeVpcFirewallCenDetail(DescribeVpcFirewallCenDetailRequest request);

    /**
      * You can call the DescribeVpcFirewallCenList operation to query VPC firewalls. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVpcFirewallCenListResponse> describeVpcFirewallCenList(DescribeVpcFirewallCenListRequest request);

    /**
      * You can call the DescribeVpcFirewallControlPolicy operation to query the information about all access control policies that are created for a specified VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVpcFirewallControlPolicyResponse> describeVpcFirewallControlPolicy(DescribeVpcFirewallControlPolicyRequest request);

    /**
      * You can call the DescribeVpcFirewallDefaultIPSConfig operation to query the intrusion prevention configurations of a VPC firewall.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVpcFirewallDefaultIPSConfigResponse> describeVpcFirewallDefaultIPSConfig(DescribeVpcFirewallDefaultIPSConfigRequest request);

    /**
      * You can call the DescribeVpcFirewallDetail operation to query the details about a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.  
      * Before you call the operation, make sure that you created a VPC firewall by calling the [CreateVpcFirewallConfigure](https://www.alibabacloud.com/help/en/cloud-firewall/latest/createvpcfirewallconfigure) operation.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVpcFirewallDetailResponse> describeVpcFirewallDetail(DescribeVpcFirewallDetailRequest request);

    CompletableFuture<DescribeVpcFirewallIPSWhitelistResponse> describeVpcFirewallIPSWhitelist(DescribeVpcFirewallIPSWhitelistRequest request);

    /**
      * You can call the DescribeVpcFirewallList operation to query the details about VPC firewalls by page. Each VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.
      * ### Limits
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVpcFirewallListResponse> describeVpcFirewallList(DescribeVpcFirewallListRequest request);

    /**
      * You can call the DescribeVpcFirewallPolicyPriorUsed operation to query the priority range of access control policies that are created for a VPC firewall in a specific policy group.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVpcFirewallPolicyPriorUsedResponse> describeVpcFirewallPolicyPriorUsed(DescribeVpcFirewallPolicyPriorUsedRequest request);

    CompletableFuture<DescribeVpcListLiteResponse> describeVpcListLite(DescribeVpcListLiteRequest request);

    CompletableFuture<DescribeVpcZoneResponse> describeVpcZone(DescribeVpcZoneRequest request);

    CompletableFuture<DescribeVulnerabilityProtectedListResponse> describeVulnerabilityProtectedList(DescribeVulnerabilityProtectedListRequest request);

    /**
      * You can call the ModifyAddressBook operation to modify the address book that is configured for access control.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyAddressBookResponse> modifyAddressBook(ModifyAddressBookRequest request);

    /**
      * You can call this operation to modify the configurations of an access control policy. The policy allows Cloud Firewall to allow, deny, or monitor the traffic that passes through Cloud Firewall.
      * ## [](#qps)Limit
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyControlPolicyResponse> modifyControlPolicy(ModifyControlPolicyRequest request);

    /**
      * You can use this operation to modify the priority of an IPv4 access control policy for the Internet firewall. No API operations are provided for you to modify the priority of an IPv6 access control policy for the Internet firewall.
      * ## [](#qps)Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyControlPolicyPositionResponse> modifyControlPolicyPosition(ModifyControlPolicyPositionRequest request);

    CompletableFuture<ModifyDefaultIPSConfigResponse> modifyDefaultIPSConfig(ModifyDefaultIPSConfigRequest request);

    CompletableFuture<ModifyFirewallV2RoutePolicySwitchResponse> modifyFirewallV2RoutePolicySwitch(ModifyFirewallV2RoutePolicySwitchRequest request);

    /**
      * You can call the ModifyInstanceMemberAttributes operation to update the information about members in Cloud Firewall.  
      * ## Limits
      * You can call this operation up to 10 times per second for each account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyInstanceMemberAttributesResponse> modifyInstanceMemberAttributes(ModifyInstanceMemberAttributesRequest request);

    /**
      * You can use this operation to modify the configurations of an access control policy. The policy is used to allow, deny, or monitor traffic that reaches a NAT firewall.
      *
     */
    CompletableFuture<ModifyNatFirewallControlPolicyResponse> modifyNatFirewallControlPolicy(ModifyNatFirewallControlPolicyRequest request);

    CompletableFuture<ModifyNatFirewallControlPolicyPositionResponse> modifyNatFirewallControlPolicyPosition(ModifyNatFirewallControlPolicyPositionRequest request);

    /**
      * You can call the ModifyPolicyAdvancedConfig operation to enable or disable the strict mode for an access control policy.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyPolicyAdvancedConfigResponse> modifyPolicyAdvancedConfig(ModifyPolicyAdvancedConfigRequest request);

    CompletableFuture<ModifyTrFirewallV2ConfigurationResponse> modifyTrFirewallV2Configuration(ModifyTrFirewallV2ConfigurationRequest request);

    CompletableFuture<ModifyTrFirewallV2RoutePolicyScopeResponse> modifyTrFirewallV2RoutePolicyScope(ModifyTrFirewallV2RoutePolicyScopeRequest request);

    CompletableFuture<ModifyUserIPSWhitelistResponse> modifyUserIPSWhitelist(ModifyUserIPSWhitelistRequest request);

    /**
      * You can call the ModifyVpcFirewallCenConfigure operation to modify the configurations of a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the [CreateVpcFirewallCenConfigure](~~345772~~) operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyVpcFirewallCenConfigureResponse> modifyVpcFirewallCenConfigure(ModifyVpcFirewallCenConfigureRequest request);

    /**
      * You can call the ModifyVpcFirewallCenSwitchStatus operation to enable or disable a VPC firewall. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. After you enable the VPC firewall, the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. After you disable the VPC firewall, the VPC firewall no longer protect mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance.
      * Before you call this operation, make sure that you have created a VPC firewall by calling the [CreateVpcFirewallCenConfigure](~~345772~~) operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyVpcFirewallCenSwitchStatusResponse> modifyVpcFirewallCenSwitchStatus(ModifyVpcFirewallCenSwitchStatusRequest request);

    /**
      * You can call the ModifyVpcFirewallConfigure operation to modify the configurations of a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the [CreateVpcFirewallConfigure](~~342893~~) operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyVpcFirewallConfigureResponse> modifyVpcFirewallConfigure(ModifyVpcFirewallConfigureRequest request);

    /**
      * You can call the ModifyVpcFirewallControlPolicy operation to modify the configurations of an access control policy that is created for a VPC firewall in a specified policy group. Different access control policies are used for the VPC firewalls that are used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewalls that are used to protect each Express Connect circuit.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyVpcFirewallControlPolicyResponse> modifyVpcFirewallControlPolicy(ModifyVpcFirewallControlPolicyRequest request);

    /**
      * You can use this operation to modify the priority of an access control policy that is created for a VPC firewall in a specific policy group.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyVpcFirewallControlPolicyPositionResponse> modifyVpcFirewallControlPolicyPosition(ModifyVpcFirewallControlPolicyPositionRequest request);

    /**
      * You can call the ModifyVpcFirewallDefaultIPSConfig operation to modify the intrusion prevention configurations of a VPC firewall.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyVpcFirewallDefaultIPSConfigResponse> modifyVpcFirewallDefaultIPSConfig(ModifyVpcFirewallDefaultIPSConfigRequest request);

    CompletableFuture<ModifyVpcFirewallIPSWhitelistResponse> modifyVpcFirewallIPSWhitelist(ModifyVpcFirewallIPSWhitelistRequest request);

    /**
      * You can call the ModifyVpcFirewallSwitchStatus operation to enable or disable a VPC firewall. The VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit. After you enable the VPC firewall, the VPC firewall protects access traffic between two VPCs that are connected by using an Express Connect circuit. After you disable the VPC firewall, the VPC firewall no longer protects access traffic between two VPCs that are connected by using an Express Connect circuit.
      * Before you call the operation, make sure that you created a VPC firewall by calling the [CreateVpcFirewallConfigure](~~342893~~) operation.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyVpcFirewallSwitchStatusResponse> modifyVpcFirewallSwitchStatus(ModifyVpcFirewallSwitchStatusRequest request);

    /**
      * You can call the PutDisableAllFwSwitch operation to turn off all firewall switches. 
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PutDisableAllFwSwitchResponse> putDisableAllFwSwitch(PutDisableAllFwSwitchRequest request);

    /**
      * You can call the PutDisableFwSwitch operation to disable a firewall for specific assets. After you disable the firewall, traffic does not pass through Cloud Firewall.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PutDisableFwSwitchResponse> putDisableFwSwitch(PutDisableFwSwitchRequest request);

    /**
      * You can call the PutEnableAllFwSwitch operation to enable a firewall for all public IP addresses within your Alibaba Cloud account.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PutEnableAllFwSwitchResponse> putEnableAllFwSwitch(PutEnableAllFwSwitchRequest request);

    /**
      * You can call the PutEnableFwSwitch operation to enable a firewall. After you enable a firewall, traffic passes through Cloud Firewall.
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<PutEnableFwSwitchResponse> putEnableFwSwitch(PutEnableFwSwitchRequest request);

    CompletableFuture<ReleasePostInstanceResponse> releasePostInstance(ReleasePostInstanceRequest request);

    CompletableFuture<ResetNatFirewallRuleHitCountResponse> resetNatFirewallRuleHitCount(ResetNatFirewallRuleHitCountRequest request);

    /**
      * You can call the ResetVpcFirewallRuleHitCount operation to clear the count on hits of an access control policy that is created for a VPC firewall in a specific policy group.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ResetVpcFirewallRuleHitCountResponse> resetVpcFirewallRuleHitCount(ResetVpcFirewallRuleHitCountRequest request);

}
