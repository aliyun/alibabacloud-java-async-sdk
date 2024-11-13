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
     * <b>description</b> :
     * <p>You can call the AddAddressBook operation to create an address book for access control. The address book can be an IP address book, an ECS tag-based address book, a port address book, or a domain address book.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddAddressBook  AddAddressBookRequest
     * @return AddAddressBookResponse
     */
    CompletableFuture<AddAddressBookResponse> addAddressBook(AddAddressBookRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the AddControlPolicy operation to create an access control policy to allow, block, or monitor traffic that reaches Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddControlPolicy  AddControlPolicyRequest
     * @return AddControlPolicyResponse
     */
    CompletableFuture<AddControlPolicyResponse> addControlPolicy(AddControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to add members to Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddInstanceMembers  AddInstanceMembersRequest
     * @return AddInstanceMembersResponse
     */
    CompletableFuture<AddInstanceMembersResponse> addInstanceMembers(AddInstanceMembersRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the BatchCopyVpcFirewallControlPolicy operation to copy all access control policies from a policy group of a source VPC firewall to a policy group of a destination VPC firewall.<br>Before you call this operation, we recommend that you back up access control policies. For more information about how to back up an access control policy, see <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/back-up-and-roll-back-an-access-control-policy">Back up an access control policy</a>.<br>After you call this operation, all the access control policies in the policy group of the destination VPC firewall are replaced.<br>The policy groups of the source VPC firewall and the destination VPC firewall must belong to the same Alibaba Cloud account.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. When the number of calls to this operation per second exceeds the limit, throttling is triggered. Throttling may affect your business. We recommend that you take note of the limit on this operation.</p>
     * 
     * @param request the request parameters of BatchCopyVpcFirewallControlPolicy  BatchCopyVpcFirewallControlPolicyRequest
     * @return BatchCopyVpcFirewallControlPolicyResponse
     */
    CompletableFuture<BatchCopyVpcFirewallControlPolicyResponse> batchCopyVpcFirewallControlPolicy(BatchCopyVpcFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of BatchDeleteVpcFirewallControlPolicy  BatchDeleteVpcFirewallControlPolicyRequest
     * @return BatchDeleteVpcFirewallControlPolicyResponse
     */
    CompletableFuture<BatchDeleteVpcFirewallControlPolicyResponse> batchDeleteVpcFirewallControlPolicy(BatchDeleteVpcFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of CreateDownloadTask  CreateDownloadTaskRequest
     * @return CreateDownloadTaskResponse
     */
    CompletableFuture<CreateDownloadTaskResponse> createDownloadTask(CreateDownloadTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a policy that allows, denies, or monitors the traffic that passes through the NAT firewall.</p>
     * 
     * @param request the request parameters of CreateNatFirewallControlPolicy  CreateNatFirewallControlPolicyRequest
     * @return CreateNatFirewallControlPolicyResponse
     */
    CompletableFuture<CreateNatFirewallControlPolicyResponse> createNatFirewallControlPolicy(CreateNatFirewallControlPolicyRequest request);

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
     * <p>You can call the CreateVpcFirewallCenConfigure operation to create a VPC firewall. The VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. The VPC firewall cannot protect mutual access traffic between VBRs, between CCN instances, or between VBRs and CCN instances. For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallCenConfigure  CreateVpcFirewallCenConfigureRequest
     * @return CreateVpcFirewallCenConfigureResponse
     */
    CompletableFuture<CreateVpcFirewallCenConfigureResponse> createVpcFirewallCenConfigure(CreateVpcFirewallCenConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. The VPC firewall does not control the mutual access traffic between VPCs that reside in different regions or belong to different Alibaba Cloud accounts. The firewall also does not control the mutual access traffic between VPCs and virtual border routers (VBRs). For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h3><a href="#qps"></a>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallConfigure  CreateVpcFirewallConfigureRequest
     * @return CreateVpcFirewallConfigureResponse
     */
    CompletableFuture<CreateVpcFirewallConfigureResponse> createVpcFirewallConfigure(CreateVpcFirewallConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the CreateVpcFirewallControlPolicy operation to create an access control policy in a specified policy group for a VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateVpcFirewallControlPolicy  CreateVpcFirewallControlPolicyRequest
     * @return CreateVpcFirewallControlPolicyResponse
     */
    CompletableFuture<CreateVpcFirewallControlPolicyResponse> createVpcFirewallControlPolicy(CreateVpcFirewallControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DeleteAddressBook operation to delete an address book for access control.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteAddressBook  DeleteAddressBookRequest
     * @return DeleteAddressBookResponse
     */
    CompletableFuture<DeleteAddressBookResponse> deleteAddressBook(DeleteAddressBookRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DeleteControlPolicy operation to delete an access control policy that applies to inbound or outbound traffic.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation to delete file download tasks and delete the files.
     * **
     * <strong>Warning</strong> Both tasks and involved files are deleted. You can no longer download the involved files by using the download links. This operation is irreversible. Proceed with caution.</p>
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
     * <p>You can call this operation to remove up to 20 members from Cloud Firewall at a time. Separate multiple members with commas (,). After a member is removed, Cloud Firewall can no longer access the cloud resources of the member. Proceed with caution. Before you call this operation, call the <a href="https://help.aliyun.com/document_detail/271704.html">DescribeInstanceMembers</a> operation to obtain the information about the members that are added to Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteInstanceMembers  DeleteInstanceMembersRequest
     * @return DeleteInstanceMembersResponse
     */
    CompletableFuture<DeleteInstanceMembersResponse> deleteInstanceMembers(DeleteInstanceMembersRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to delete an outbound access control policy that is created for a NAT firewall.</p>
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
     * <p>You can call the DeleteVpcFirewallCenConfigure operation to delete a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallCenConfigure  DeleteVpcFirewallCenConfigureRequest
     * @return DeleteVpcFirewallCenConfigureResponse
     */
    CompletableFuture<DeleteVpcFirewallCenConfigureResponse> deleteVpcFirewallCenConfigure(DeleteVpcFirewallCenConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallConfigure operation to delete a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallConfigure  DeleteVpcFirewallConfigureRequest
     * @return DeleteVpcFirewallConfigureResponse
     */
    CompletableFuture<DeleteVpcFirewallConfigureResponse> deleteVpcFirewallConfigure(DeleteVpcFirewallConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallControlPolicy operation to delete an access control policy from a specific policy group for a VPC firewall. Different access control policies are used for the VPC firewall that is used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewall that is used to protect each Express Connect circuit. </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteVpcFirewallControlPolicy  DeleteVpcFirewallControlPolicyRequest
     * @return DeleteVpcFirewallControlPolicyResponse
     */
    CompletableFuture<DeleteVpcFirewallControlPolicyResponse> deleteVpcFirewallControlPolicy(DeleteVpcFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of DescribeACLProtectTrend  DescribeACLProtectTrendRequest
     * @return DescribeACLProtectTrendResponse
     */
    CompletableFuture<DescribeACLProtectTrendResponse> describeACLProtectTrend(DescribeACLProtectTrendRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details about an address book for an access control policy.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeAddressBook  DescribeAddressBookRequest
     * @return DescribeAddressBookResponse
     */
    CompletableFuture<DescribeAddressBookResponse> describeAddressBook(DescribeAddressBookRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeAssetList operation to query the assets that are protected by Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * @param request the request parameters of DescribeCfwRiskLevelSummary  DescribeCfwRiskLevelSummaryRequest
     * @return DescribeCfwRiskLevelSummaryResponse
     */
    CompletableFuture<DescribeCfwRiskLevelSummaryResponse> describeCfwRiskLevelSummary(DescribeCfwRiskLevelSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeControlPolicy operation to query the details about access control policies by page.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeControlPolicy  DescribeControlPolicyRequest
     * @return DescribeControlPolicyResponse
     */
    CompletableFuture<DescribeControlPolicyResponse> describeControlPolicy(DescribeControlPolicyRequest request);

    /**
     * @param request the request parameters of DescribeDefaultIPSConfig  DescribeDefaultIPSConfigRequest
     * @return DescribeDefaultIPSConfigResponse
     */
    CompletableFuture<DescribeDefaultIPSConfigResponse> describeDefaultIPSConfig(DescribeDefaultIPSConfigRequest request);

    /**
     * @deprecated OpenAPI DescribeDomainResolve is deprecated  * @description You can use this operation to query the DNS record of a domain name. This operation can retrieve DNS records only from Alibaba Cloud DNS. Before you can call this operation, make sure that your domain name is hosted on Alibaba Cloud DNS.
     * ## Limits
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * <p>You can use this operation to query the information about members in Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstanceMembers  DescribeInstanceMembersRequest
     * @return DescribeInstanceMembersResponse
     */
    CompletableFuture<DescribeInstanceMembersResponse> describeInstanceMembers(DescribeInstanceMembersRequest request);

    /**
     * @param request the request parameters of DescribeInstanceRiskLevels  DescribeInstanceRiskLevelsRequest
     * @return DescribeInstanceRiskLevelsResponse
     */
    CompletableFuture<DescribeInstanceRiskLevelsResponse> describeInstanceRiskLevels(DescribeInstanceRiskLevelsRequest request);

    /**
     * @param request the request parameters of DescribeInternetOpenIp  DescribeInternetOpenIpRequest
     * @return DescribeInternetOpenIpResponse
     */
    CompletableFuture<DescribeInternetOpenIpResponse> describeInternetOpenIp(DescribeInternetOpenIpRequest request);

    /**
     * @param request the request parameters of DescribeInternetTrafficTrend  DescribeInternetTrafficTrendRequest
     * @return DescribeInternetTrafficTrendResponse
     */
    CompletableFuture<DescribeInternetTrafficTrendResponse> describeInternetTrafficTrend(DescribeInternetTrafficTrendRequest request);

    /**
     * @param request the request parameters of DescribeInvadeEventList  DescribeInvadeEventListRequest
     * @return DescribeInvadeEventListResponse
     */
    CompletableFuture<DescribeInvadeEventListResponse> describeInvadeEventList(DescribeInvadeEventListRequest request);

    /**
     * @param request the request parameters of DescribeNatAclPageStatus  DescribeNatAclPageStatusRequest
     * @return DescribeNatAclPageStatusResponse
     */
    CompletableFuture<DescribeNatAclPageStatusResponse> describeNatAclPageStatus(DescribeNatAclPageStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the information about all access control policies that are created for NAT firewalls by page.</p>
     * 
     * @param request the request parameters of DescribeNatFirewallControlPolicy  DescribeNatFirewallControlPolicyRequest
     * @return DescribeNatFirewallControlPolicyResponse
     */
    CompletableFuture<DescribeNatFirewallControlPolicyResponse> describeNatFirewallControlPolicy(DescribeNatFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of DescribeNatFirewallList  DescribeNatFirewallListRequest
     * @return DescribeNatFirewallListResponse
     */
    CompletableFuture<DescribeNatFirewallListResponse> describeNatFirewallList(DescribeNatFirewallListRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the priority range of access control policies that are created for a NAT firewall.</p>
     * 
     * @param request the request parameters of DescribeNatFirewallPolicyPriorUsed  DescribeNatFirewallPolicyPriorUsedRequest
     * @return DescribeNatFirewallPolicyPriorUsedResponse
     */
    CompletableFuture<DescribeNatFirewallPolicyPriorUsedResponse> describeNatFirewallPolicyPriorUsed(DescribeNatFirewallPolicyPriorUsedRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingDestinationIP  DescribeOutgoingDestinationIPRequest
     * @return DescribeOutgoingDestinationIPResponse
     */
    CompletableFuture<DescribeOutgoingDestinationIPResponse> describeOutgoingDestinationIP(DescribeOutgoingDestinationIPRequest request);

    /**
     * @param request the request parameters of DescribeOutgoingDomain  DescribeOutgoingDomainRequest
     * @return DescribeOutgoingDomainResponse
     */
    CompletableFuture<DescribeOutgoingDomainResponse> describeOutgoingDomain(DescribeOutgoingDomainRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribePolicyAdvancedConfig operation to query whether the strict mode is enabled for an access control policy.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribePolicyAdvancedConfig  DescribePolicyAdvancedConfigRequest
     * @return DescribePolicyAdvancedConfigResponse
     */
    CompletableFuture<DescribePolicyAdvancedConfigResponse> describePolicyAdvancedConfig(DescribePolicyAdvancedConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the priority range of the access control policies that match specific query conditions.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribePolicyPriorUsed  DescribePolicyPriorUsedRequest
     * @return DescribePolicyPriorUsedResponse
     */
    CompletableFuture<DescribePolicyPriorUsedResponse> describePolicyPriorUsed(DescribePolicyPriorUsedRequest request);

    /**
     * <b>description</b> :
     * <p>If you use Cloud Firewall that uses the pay-as-you-go billing method, you can call this operation to query traffic details accurate to the granularity of specific resource instances. If you use Cloud Firewall that uses the subscription billing method, you can call this operation to query the overall traffic details.</p>
     * 
     * @param request the request parameters of DescribePostpayTrafficDetail  DescribePostpayTrafficDetailRequest
     * @return DescribePostpayTrafficDetailResponse
     */
    CompletableFuture<DescribePostpayTrafficDetailResponse> describePostpayTrafficDetail(DescribePostpayTrafficDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query statistics of the current Cloud Firewall from the date of purchase.</p>
     * 
     * @param request the request parameters of DescribePostpayTrafficTotal  DescribePostpayTrafficTotalRequest
     * @return DescribePostpayTrafficTotalResponse
     */
    CompletableFuture<DescribePostpayTrafficTotalResponse> describePostpayTrafficTotal(DescribePostpayTrafficTotalRequest request);

    /**
     * @param request the request parameters of DescribePrefixLists  DescribePrefixListsRequest
     * @return DescribePrefixListsResponse
     */
    CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeRiskEventGroup operation to query and download the details of intrusion events. We recommend that you query the details of 5 to 10 intrusion events at a time. If you do not need to query the geographical information about IP addresses, you can set the NoLocation parameter to true to prevent query timeout.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * @param request the request parameters of DescribeSignatureLibVersion  DescribeSignatureLibVersionRequest
     * @return DescribeSignatureLibVersionResponse
     */
    CompletableFuture<DescribeSignatureLibVersionResponse> describeSignatureLibVersion(DescribeSignatureLibVersionRequest request);

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
     * @param request the request parameters of DescribeUserAssetIPTrafficInfo  DescribeUserAssetIPTrafficInfoRequest
     * @return DescribeUserAssetIPTrafficInfoResponse
     */
    CompletableFuture<DescribeUserAssetIPTrafficInfoResponse> describeUserAssetIPTrafficInfo(DescribeUserAssetIPTrafficInfoRequest request);

    /**
     * @param request the request parameters of DescribeUserBuyVersion  DescribeUserBuyVersionRequest
     * @return DescribeUserBuyVersionResponse
     */
    CompletableFuture<DescribeUserBuyVersionResponse> describeUserBuyVersion(DescribeUserBuyVersionRequest request);

    /**
     * @param request the request parameters of DescribeUserIPSWhitelist  DescribeUserIPSWhitelistRequest
     * @return DescribeUserIPSWhitelistResponse
     */
    CompletableFuture<DescribeUserIPSWhitelistResponse> describeUserIPSWhitelist(DescribeUserIPSWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallAclGroupList operation to query the information about all policy groups of access control policies that are created for VPC firewalls.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallAclGroupList  DescribeVpcFirewallAclGroupListRequest
     * @return DescribeVpcFirewallAclGroupListResponse
     */
    CompletableFuture<DescribeVpcFirewallAclGroupListResponse> describeVpcFirewallAclGroupList(DescribeVpcFirewallAclGroupListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallCenDetail operation to query the details about a VPC firewall. The VPC firewall protects access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallCenDetail  DescribeVpcFirewallCenDetailRequest
     * @return DescribeVpcFirewallCenDetailResponse
     */
    CompletableFuture<DescribeVpcFirewallCenDetailResponse> describeVpcFirewallCenDetail(DescribeVpcFirewallCenDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallCenList operation to query VPC firewalls. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallCenList  DescribeVpcFirewallCenListRequest
     * @return DescribeVpcFirewallCenListResponse
     */
    CompletableFuture<DescribeVpcFirewallCenListResponse> describeVpcFirewallCenList(DescribeVpcFirewallCenListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallControlPolicy operation to query the information about all access control policies that are created for a specified VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallControlPolicy  DescribeVpcFirewallControlPolicyRequest
     * @return DescribeVpcFirewallControlPolicyResponse
     */
    CompletableFuture<DescribeVpcFirewallControlPolicyResponse> describeVpcFirewallControlPolicy(DescribeVpcFirewallControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallDefaultIPSConfig operation to query the intrusion prevention configurations of a VPC firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallDefaultIPSConfig  DescribeVpcFirewallDefaultIPSConfigRequest
     * @return DescribeVpcFirewallDefaultIPSConfigResponse
     */
    CompletableFuture<DescribeVpcFirewallDefaultIPSConfigResponse> describeVpcFirewallDefaultIPSConfig(DescribeVpcFirewallDefaultIPSConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallDetail operation to query the details about a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.<br>Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/createvpcfirewallconfigure">CreateVpcFirewallConfigure</a> operation.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallDetail  DescribeVpcFirewallDetailRequest
     * @return DescribeVpcFirewallDetailResponse
     */
    CompletableFuture<DescribeVpcFirewallDetailResponse> describeVpcFirewallDetail(DescribeVpcFirewallDetailRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallIPSWhitelist  DescribeVpcFirewallIPSWhitelistRequest
     * @return DescribeVpcFirewallIPSWhitelistResponse
     */
    CompletableFuture<DescribeVpcFirewallIPSWhitelistResponse> describeVpcFirewallIPSWhitelist(DescribeVpcFirewallIPSWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallList operation to query the details about VPC firewalls by page. Each VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallList  DescribeVpcFirewallListRequest
     * @return DescribeVpcFirewallListResponse
     */
    CompletableFuture<DescribeVpcFirewallListResponse> describeVpcFirewallList(DescribeVpcFirewallListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the priority range of access control policies that are created for a VPC firewall in a specific policy group.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallPolicyPriorUsed  DescribeVpcFirewallPolicyPriorUsedRequest
     * @return DescribeVpcFirewallPolicyPriorUsedResponse
     */
    CompletableFuture<DescribeVpcFirewallPolicyPriorUsedResponse> describeVpcFirewallPolicyPriorUsed(DescribeVpcFirewallPolicyPriorUsedRequest request);

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
     * <b>description</b> :
     * <p>You can call the ModifyAddressBook operation to modify the address book that is configured for access control.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyAddressBook  ModifyAddressBookRequest
     * @return ModifyAddressBookResponse
     */
    CompletableFuture<ModifyAddressBookResponse> modifyAddressBook(ModifyAddressBookRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the configurations of an access control policy. The policy allows Cloud Firewall to allow, deny, or monitor the traffic that passes through Cloud Firewall.</p>
     * <h2><a href="#qps"></a>Limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyControlPolicy  ModifyControlPolicyRequest
     * @return ModifyControlPolicyResponse
     */
    CompletableFuture<ModifyControlPolicyResponse> modifyControlPolicy(ModifyControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the priority of an IPv4 access control policy for the Internet firewall. No API operations are provided for you to modify the priority of an IPv6 access control policy for the Internet firewall.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyControlPolicyPosition  ModifyControlPolicyPositionRequest
     * @return ModifyControlPolicyPositionResponse
     */
    CompletableFuture<ModifyControlPolicyPositionResponse> modifyControlPolicyPosition(ModifyControlPolicyPositionRequest request);

    /**
     * @param request the request parameters of ModifyDefaultIPSConfig  ModifyDefaultIPSConfigRequest
     * @return ModifyDefaultIPSConfigResponse
     */
    CompletableFuture<ModifyDefaultIPSConfigResponse> modifyDefaultIPSConfig(ModifyDefaultIPSConfigRequest request);

    /**
     * @param request the request parameters of ModifyFirewallV2RoutePolicySwitch  ModifyFirewallV2RoutePolicySwitchRequest
     * @return ModifyFirewallV2RoutePolicySwitchResponse
     */
    CompletableFuture<ModifyFirewallV2RoutePolicySwitchResponse> modifyFirewallV2RoutePolicySwitch(ModifyFirewallV2RoutePolicySwitchRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyInstanceMemberAttributes operation to update the information about members in Cloud Firewall.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second for each account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyInstanceMemberAttributes  ModifyInstanceMemberAttributesRequest
     * @return ModifyInstanceMemberAttributesResponse
     */
    CompletableFuture<ModifyInstanceMemberAttributesResponse> modifyInstanceMemberAttributes(ModifyInstanceMemberAttributesRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the configurations of an access control policy. The policy is used to allow, deny, or monitor traffic that reaches a NAT firewall.</p>
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
     * @param request the request parameters of ModifyObjectGroupOperation  ModifyObjectGroupOperationRequest
     * @return ModifyObjectGroupOperationResponse
     */
    CompletableFuture<ModifyObjectGroupOperationResponse> modifyObjectGroupOperation(ModifyObjectGroupOperationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyPolicyAdvancedConfig operation to enable or disable the strict mode for an access control policy.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyPolicyAdvancedConfig  ModifyPolicyAdvancedConfigRequest
     * @return ModifyPolicyAdvancedConfigResponse
     */
    CompletableFuture<ModifyPolicyAdvancedConfigResponse> modifyPolicyAdvancedConfig(ModifyPolicyAdvancedConfigRequest request);

    /**
     * @param request the request parameters of ModifyTrFirewallV2Configuration  ModifyTrFirewallV2ConfigurationRequest
     * @return ModifyTrFirewallV2ConfigurationResponse
     */
    CompletableFuture<ModifyTrFirewallV2ConfigurationResponse> modifyTrFirewallV2Configuration(ModifyTrFirewallV2ConfigurationRequest request);

    /**
     * @param request the request parameters of ModifyTrFirewallV2RoutePolicyScope  ModifyTrFirewallV2RoutePolicyScopeRequest
     * @return ModifyTrFirewallV2RoutePolicyScopeResponse
     */
    CompletableFuture<ModifyTrFirewallV2RoutePolicyScopeResponse> modifyTrFirewallV2RoutePolicyScope(ModifyTrFirewallV2RoutePolicyScopeRequest request);

    /**
     * @param request the request parameters of ModifyUserIPSWhitelist  ModifyUserIPSWhitelistRequest
     * @return ModifyUserIPSWhitelistResponse
     */
    CompletableFuture<ModifyUserIPSWhitelistResponse> modifyUserIPSWhitelist(ModifyUserIPSWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallCenConfigure operation to modify the configurations of a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallCenConfigure  ModifyVpcFirewallCenConfigureRequest
     * @return ModifyVpcFirewallCenConfigureResponse
     */
    CompletableFuture<ModifyVpcFirewallCenConfigureResponse> modifyVpcFirewallCenConfigure(ModifyVpcFirewallCenConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallCenSwitchStatus operation to enable or disable a VPC firewall. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. After you enable the VPC firewall, the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. After you disable the VPC firewall, the VPC firewall no longer protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance.
     * Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallCenSwitchStatus  ModifyVpcFirewallCenSwitchStatusRequest
     * @return ModifyVpcFirewallCenSwitchStatusResponse
     */
    CompletableFuture<ModifyVpcFirewallCenSwitchStatusResponse> modifyVpcFirewallCenSwitchStatus(ModifyVpcFirewallCenSwitchStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallConfigure operation to modify the configurations of a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallConfigure  ModifyVpcFirewallConfigureRequest
     * @return ModifyVpcFirewallConfigureResponse
     */
    CompletableFuture<ModifyVpcFirewallConfigureResponse> modifyVpcFirewallConfigure(ModifyVpcFirewallConfigureRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallControlPolicy operation to modify the configurations of an access control policy that is created for a VPC firewall in a specified policy group. Different access control policies are used for the VPC firewalls that are used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewalls that are used to protect each Express Connect circuit.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallControlPolicy  ModifyVpcFirewallControlPolicyRequest
     * @return ModifyVpcFirewallControlPolicyResponse
     */
    CompletableFuture<ModifyVpcFirewallControlPolicyResponse> modifyVpcFirewallControlPolicy(ModifyVpcFirewallControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the priority of an access control policy that is created for a VPC firewall in a specific policy group.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallControlPolicyPosition  ModifyVpcFirewallControlPolicyPositionRequest
     * @return ModifyVpcFirewallControlPolicyPositionResponse
     */
    CompletableFuture<ModifyVpcFirewallControlPolicyPositionResponse> modifyVpcFirewallControlPolicyPosition(ModifyVpcFirewallControlPolicyPositionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the intrusion prevention configurations of a VPC firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call the ModifyVpcFirewallSwitchStatus operation to enable or disable a VPC firewall. The VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit. After you enable the VPC firewall, the VPC firewall protects access traffic between two VPCs that are connected by using an Express Connect circuit. After you disable the VPC firewall, the VPC firewall no longer protects access traffic between two VPCs that are connected by using an Express Connect circuit.
     * Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyVpcFirewallSwitchStatus  ModifyVpcFirewallSwitchStatusRequest
     * @return ModifyVpcFirewallSwitchStatusResponse
     */
    CompletableFuture<ModifyVpcFirewallSwitchStatusResponse> modifyVpcFirewallSwitchStatus(ModifyVpcFirewallSwitchStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the PutDisableAllFwSwitch operation to turn off all firewall switches.</p>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PutDisableAllFwSwitch  PutDisableAllFwSwitchRequest
     * @return PutDisableAllFwSwitchResponse
     */
    CompletableFuture<PutDisableAllFwSwitchResponse> putDisableAllFwSwitch(PutDisableAllFwSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the PutDisableFwSwitch operation to disable a firewall for specific assets. After you disable the firewall, traffic does not pass through Cloud Firewall.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PutDisableFwSwitch  PutDisableFwSwitchRequest
     * @return PutDisableFwSwitchResponse
     */
    CompletableFuture<PutDisableFwSwitchResponse> putDisableFwSwitch(PutDisableFwSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the PutEnableAllFwSwitch operation to enable a firewall for all public IP addresses within your Alibaba Cloud account.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PutEnableAllFwSwitch  PutEnableAllFwSwitchRequest
     * @return PutEnableAllFwSwitchResponse
     */
    CompletableFuture<PutEnableAllFwSwitchResponse> putEnableAllFwSwitch(PutEnableAllFwSwitchRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable a firewall. After you enable a firewall, traffic passes through Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PutEnableFwSwitch  PutEnableFwSwitchRequest
     * @return PutEnableFwSwitchResponse
     */
    CompletableFuture<PutEnableFwSwitchResponse> putEnableFwSwitch(PutEnableFwSwitchRequest request);

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
     * <p>You can call the ResetVpcFirewallRuleHitCount operation to clear the count on hits of an access control policy that is created for a VPC firewall in a specific policy group.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ResetVpcFirewallRuleHitCount  ResetVpcFirewallRuleHitCountRequest
     * @return ResetVpcFirewallRuleHitCountResponse
     */
    CompletableFuture<ResetVpcFirewallRuleHitCountResponse> resetVpcFirewallRuleHitCount(ResetVpcFirewallRuleHitCountRequest request);

    /**
     * @param request the request parameters of SwitchSecurityProxy  SwitchSecurityProxyRequest
     * @return SwitchSecurityProxyResponse
     */
    CompletableFuture<SwitchSecurityProxyResponse> switchSecurityProxy(SwitchSecurityProxyRequest request);

}
