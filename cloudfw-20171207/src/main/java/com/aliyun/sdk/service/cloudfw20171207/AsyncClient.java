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
     * @param request the request parameters of AddDnsFirewallPolicy  AddDnsFirewallPolicyRequest
     * @return AddDnsFirewallPolicyResponse
     */
    CompletableFuture<AddDnsFirewallPolicyResponse> addDnsFirewallPolicy(AddDnsFirewallPolicyRequest request);

    /**
     * @param request the request parameters of AddDomainResolveRealtimeTask  AddDomainResolveRealtimeTaskRequest
     * @return AddDomainResolveRealtimeTaskResponse
     */
    CompletableFuture<AddDomainResolveRealtimeTaskResponse> addDomainResolveRealtimeTask(AddDomainResolveRealtimeTaskRequest request);

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
     * @param request the request parameters of AddPrivateDnsDomainName  AddPrivateDnsDomainNameRequest
     * @return AddPrivateDnsDomainNameResponse
     */
    CompletableFuture<AddPrivateDnsDomainNameResponse> addPrivateDnsDomainName(AddPrivateDnsDomainNameRequest request);

    /**
     * @deprecated OpenAPI BatchCopyVpcFirewallControlPolicy is deprecated  * @description You can call the BatchCopyVpcFirewallControlPolicy operation to copy all access control policies from a policy group of a source VPC firewall to a policy group of a destination VPC firewall.  
     * Before you call this operation, we recommend that you back up access control policies. For more information about how to back up an access control policy, see [Back up an access control policy](https://www.alibabacloud.com/help/en/cloud-firewall/latest/back-up-and-roll-back-an-access-control-policy).  
     * After you call this operation, all the access control policies in the policy group of the destination VPC firewall are replaced.  
     * The policy groups of the source VPC firewall and the destination VPC firewall must belong to the same Alibaba Cloud account.  
     * ## Limits
     * You can call this operation up to 10 times per second per account. When the number of calls to this operation per second exceeds the limit, throttling is triggered. Throttling may affect your business. We recommend that you take note of the limit on this operation.
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
     * @param request the request parameters of CreateIpsPrivateAssoc  CreateIpsPrivateAssocRequest
     * @return CreateIpsPrivateAssocResponse
     */
    CompletableFuture<CreateIpsPrivateAssocResponse> createIpsPrivateAssoc(CreateIpsPrivateAssocRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a policy that allows, denies, or monitors the traffic that passes through the NAT firewall.</p>
     * 
     * @param request the request parameters of CreateNatFirewallControlPolicy  CreateNatFirewallControlPolicyRequest
     * @return CreateNatFirewallControlPolicyResponse
     */
    CompletableFuture<CreateNatFirewallControlPolicyResponse> createNatFirewallControlPolicy(CreateNatFirewallControlPolicyRequest request);

    /**
     * @param request the request parameters of CreateNatFirewallPreCheck  CreateNatFirewallPreCheckRequest
     * @return CreateNatFirewallPreCheckResponse
     */
    CompletableFuture<CreateNatFirewallPreCheckResponse> createNatFirewallPreCheck(CreateNatFirewallPreCheckRequest request);

    /**
     * @param request the request parameters of CreateNatFirewallSyncTask  CreateNatFirewallSyncTaskRequest
     * @return CreateNatFirewallSyncTaskResponse
     */
    CompletableFuture<CreateNatFirewallSyncTaskResponse> createNatFirewallSyncTask(CreateNatFirewallSyncTaskRequest request);

    /**
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
     * @deprecated OpenAPI CreateVpcFirewallCenManualConfigure is deprecated  * @param request  the request parameters of CreateVpcFirewallCenManualConfigure  CreateVpcFirewallCenManualConfigureRequest
     * @return CreateVpcFirewallCenManualConfigureResponse
     */
    @Deprecated
    CompletableFuture<CreateVpcFirewallCenManualConfigureResponse> createVpcFirewallCenManualConfigure(CreateVpcFirewallCenManualConfigureRequest request);

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
     * @param request the request parameters of CreateVpcFirewallPrecheck  CreateVpcFirewallPrecheckRequest
     * @return CreateVpcFirewallPrecheckResponse
     */
    CompletableFuture<CreateVpcFirewallPrecheckResponse> createVpcFirewallPrecheck(CreateVpcFirewallPrecheckRequest request);

    /**
     * @param request the request parameters of CreateVpcFirewallTask  CreateVpcFirewallTaskRequest
     * @return CreateVpcFirewallTaskResponse
     */
    CompletableFuture<CreateVpcFirewallTaskResponse> createVpcFirewallTask(CreateVpcFirewallTaskRequest request);

    /**
     * @param request the request parameters of DeleteAckClusterConnector  DeleteAckClusterConnectorRequest
     * @return DeleteAckClusterConnectorResponse
     */
    CompletableFuture<DeleteAckClusterConnectorResponse> deleteAckClusterConnector(DeleteAckClusterConnectorRequest request);

    /**
     * @param request the request parameters of DeleteAclBackupData  DeleteAclBackupDataRequest
     * @return DeleteAclBackupDataResponse
     */
    CompletableFuture<DeleteAclBackupDataResponse> deleteAclBackupData(DeleteAclBackupDataRequest request);

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
     * @param request the request parameters of DeleteDnsFirewallPolicy  DeleteDnsFirewallPolicyRequest
     * @return DeleteDnsFirewallPolicyResponse
     */
    CompletableFuture<DeleteDnsFirewallPolicyResponse> deleteDnsFirewallPolicy(DeleteDnsFirewallPolicyRequest request);

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
     * @param request the request parameters of DeleteIpsPrivateAssoc  DeleteIpsPrivateAssocRequest
     * @return DeleteIpsPrivateAssocResponse
     */
    CompletableFuture<DeleteIpsPrivateAssocResponse> deleteIpsPrivateAssoc(DeleteIpsPrivateAssocRequest request);

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
     * @param request the request parameters of DeletePrivateDnsAllDomainName  DeletePrivateDnsAllDomainNameRequest
     * @return DeletePrivateDnsAllDomainNameResponse
     */
    CompletableFuture<DeletePrivateDnsAllDomainNameResponse> deletePrivateDnsAllDomainName(DeletePrivateDnsAllDomainNameRequest request);

    /**
     * @param request the request parameters of DeletePrivateDnsDomainName  DeletePrivateDnsDomainNameRequest
     * @return DeletePrivateDnsDomainNameResponse
     */
    CompletableFuture<DeletePrivateDnsDomainNameResponse> deletePrivateDnsDomainName(DeletePrivateDnsDomainNameRequest request);

    /**
     * @param request the request parameters of DeletePrivateDnsEndpoint  DeletePrivateDnsEndpointRequest
     * @return DeletePrivateDnsEndpointResponse
     */
    CompletableFuture<DeletePrivateDnsEndpointResponse> deletePrivateDnsEndpoint(DeletePrivateDnsEndpointRequest request);

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
     * @param request the request parameters of DescribeAclCheck  DescribeAclCheckRequest
     * @return DescribeAclCheckResponse
     */
    CompletableFuture<DescribeAclCheckResponse> describeAclCheck(DescribeAclCheckRequest request);

    /**
     * @param request the request parameters of DescribeAclCheckQuota  DescribeAclCheckQuotaRequest
     * @return DescribeAclCheckQuotaResponse
     */
    CompletableFuture<DescribeAclCheckQuotaResponse> describeAclCheckQuota(DescribeAclCheckQuotaRequest request);

    /**
     * @param request the request parameters of DescribeAclChecks  DescribeAclChecksRequest
     * @return DescribeAclChecksResponse
     */
    CompletableFuture<DescribeAclChecksResponse> describeAclChecks(DescribeAclChecksRequest request);

    /**
     * @param request the request parameters of DescribeAclRuleCount  DescribeAclRuleCountRequest
     * @return DescribeAclRuleCountResponse
     */
    CompletableFuture<DescribeAclRuleCountResponse> describeAclRuleCount(DescribeAclRuleCountRequest request);

    /**
     * @param request the request parameters of DescribeAclWhitelist  DescribeAclWhitelistRequest
     * @return DescribeAclWhitelistResponse
     */
    CompletableFuture<DescribeAclWhitelistResponse> describeAclWhitelist(DescribeAclWhitelistRequest request);

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
     * <p>You can call the DescribeControlPolicy operation to query the details about access control policies by page.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * @deprecated OpenAPI DescribeFirewallDropStatistics is deprecated  * @param request  the request parameters of DescribeFirewallDropStatistics  DescribeFirewallDropStatisticsRequest
     * @return DescribeFirewallDropStatisticsResponse
     */
    @Deprecated
    CompletableFuture<DescribeFirewallDropStatisticsResponse> describeFirewallDropStatistics(DescribeFirewallDropStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeFirewallTask  DescribeFirewallTaskRequest
     * @return DescribeFirewallTaskResponse
     */
    CompletableFuture<DescribeFirewallTaskResponse> describeFirewallTask(DescribeFirewallTaskRequest request);

    /**
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
     * @param request the request parameters of DescribeInternetOpenPort  DescribeInternetOpenPortRequest
     * @return DescribeInternetOpenPortResponse
     */
    CompletableFuture<DescribeInternetOpenPortResponse> describeInternetOpenPort(DescribeInternetOpenPortRequest request);

    /**
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
     * @param request the request parameters of DescribeInvadeEventStatistic  DescribeInvadeEventStatisticRequest
     * @return DescribeInvadeEventStatisticResponse
     */
    CompletableFuture<DescribeInvadeEventStatisticResponse> describeInvadeEventStatistic(DescribeInvadeEventStatisticRequest request);

    /**
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
     * <p>You can use this operation to query the information about all access control policies that are created for NAT firewalls by page.</p>
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
     * <p>You can use this operation to query the priority range of access control policies that are created for a NAT firewall.</p>
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
     * @param request the request parameters of DescribeOutgoingTag  DescribeOutgoingTagRequest
     * @return DescribeOutgoingTagResponse
     */
    CompletableFuture<DescribeOutgoingTagResponse> describeOutgoingTag(DescribeOutgoingTagRequest request);

    /**
     * @deprecated OpenAPI DescribePageDocuments is deprecated  * @param request  the request parameters of DescribePageDocuments  DescribePageDocumentsRequest
     * @return DescribePageDocumentsResponse
     */
    @Deprecated
    CompletableFuture<DescribePageDocumentsResponse> describePageDocuments(DescribePageDocumentsRequest request);

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
     * @param request the request parameters of DescribePostpayEnabledProtection  DescribePostpayEnabledProtectionRequest
     * @return DescribePostpayEnabledProtectionResponse
     */
    CompletableFuture<DescribePostpayEnabledProtectionResponse> describePostpayEnabledProtection(DescribePostpayEnabledProtectionRequest request);

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
     * @param request the request parameters of DescribePrivateDnsDomainNameList  DescribePrivateDnsDomainNameListRequest
     * @return DescribePrivateDnsDomainNameListResponse
     */
    CompletableFuture<DescribePrivateDnsDomainNameListResponse> describePrivateDnsDomainNameList(DescribePrivateDnsDomainNameListRequest request);

    /**
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
     * @param request the request parameters of DescribeRegionInfo  DescribeRegionInfoRequest
     * @return DescribeRegionInfoResponse
     */
    CompletableFuture<DescribeRegionInfoResponse> describeRegionInfo(DescribeRegionInfoRequest request);

    /**
     * @param request the request parameters of DescribeResourceTypeAutoEnable  DescribeResourceTypeAutoEnableRequest
     * @return DescribeResourceTypeAutoEnableResponse
     */
    CompletableFuture<DescribeResourceTypeAutoEnableResponse> describeResourceTypeAutoEnable(DescribeResourceTypeAutoEnableRequest request);

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
     * @param request the request parameters of DescribeSdlStatistic  DescribeSdlStatisticRequest
     * @return DescribeSdlStatisticResponse
     */
    CompletableFuture<DescribeSdlStatisticResponse> describeSdlStatistic(DescribeSdlStatisticRequest request);

    /**
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
     * @param request the request parameters of DescribeUnprotectedVulnTrend  DescribeUnprotectedVulnTrendRequest
     * @return DescribeUnprotectedVulnTrendResponse
     */
    CompletableFuture<DescribeUnprotectedVulnTrendResponse> describeUnprotectedVulnTrend(DescribeUnprotectedVulnTrendRequest request);

    /**
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
     * <p>You can call this operation to query the edition information about Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
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
     * @param request the request parameters of DescribeVfwIPSConfigList  DescribeVfwIPSConfigListRequest
     * @return DescribeVfwIPSConfigListResponse
     */
    CompletableFuture<DescribeVfwIPSConfigListResponse> describeVfwIPSConfigList(DescribeVfwIPSConfigListRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallAccessDetail  DescribeVpcFirewallAccessDetailRequest
     * @return DescribeVpcFirewallAccessDetailResponse
     */
    CompletableFuture<DescribeVpcFirewallAccessDetailResponse> describeVpcFirewallAccessDetail(DescribeVpcFirewallAccessDetailRequest request);

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
     * @param request the request parameters of DescribeVpcFirewallCenSummaryList  DescribeVpcFirewallCenSummaryListRequest
     * @return DescribeVpcFirewallCenSummaryListResponse
     */
    CompletableFuture<DescribeVpcFirewallCenSummaryListResponse> describeVpcFirewallCenSummaryList(DescribeVpcFirewallCenSummaryListRequest request);

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
     * <p>You can call the DescribeVpcFirewallList operation to query the details about VPC firewalls by page. Each VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVpcFirewallList  DescribeVpcFirewallListRequest
     * @return DescribeVpcFirewallListResponse
     */
    CompletableFuture<DescribeVpcFirewallListResponse> describeVpcFirewallList(DescribeVpcFirewallListRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallManualVSwitchList  DescribeVpcFirewallManualVSwitchListRequest
     * @return DescribeVpcFirewallManualVSwitchListResponse
     */
    CompletableFuture<DescribeVpcFirewallManualVSwitchListResponse> describeVpcFirewallManualVSwitchList(DescribeVpcFirewallManualVSwitchListRequest request);

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
     * @param request the request parameters of DescribeVpcFirewallPrecheckDetail  DescribeVpcFirewallPrecheckDetailRequest
     * @return DescribeVpcFirewallPrecheckDetailResponse
     */
    CompletableFuture<DescribeVpcFirewallPrecheckDetailResponse> describeVpcFirewallPrecheckDetail(DescribeVpcFirewallPrecheckDetailRequest request);

    /**
     * @param request the request parameters of DescribeVpcFirewallSummaryInfo  DescribeVpcFirewallSummaryInfoRequest
     * @return DescribeVpcFirewallSummaryInfoResponse
     */
    CompletableFuture<DescribeVpcFirewallSummaryInfoResponse> describeVpcFirewallSummaryInfo(DescribeVpcFirewallSummaryInfoRequest request);

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
     * @param request the request parameters of EnableSdlProtectedAsset  EnableSdlProtectedAssetRequest
     * @return EnableSdlProtectedAssetResponse
     */
    CompletableFuture<EnableSdlProtectedAssetResponse> enableSdlProtectedAsset(EnableSdlProtectedAssetRequest request);

    /**
     * @param request the request parameters of GetTlsInspectCertificateDownloadUrl  GetTlsInspectCertificateDownloadUrlRequest
     * @return GetTlsInspectCertificateDownloadUrlResponse
     */
    CompletableFuture<GetTlsInspectCertificateDownloadUrlResponse> getTlsInspectCertificateDownloadUrl(GetTlsInspectCertificateDownloadUrlRequest request);

    /**
     * @param request the request parameters of ListTlsInspectCACertificates  ListTlsInspectCACertificatesRequest
     * @return ListTlsInspectCACertificatesResponse
     */
    CompletableFuture<ListTlsInspectCACertificatesResponse> listTlsInspectCACertificates(ListTlsInspectCACertificatesRequest request);

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
     * @deprecated OpenAPI ModifyControlPolicyPosition is deprecated, please use Cloudfw::2017-12-07::ModifyControlPolicyPriority instead.  * @description You can use this operation to modify the priority of an IPv4 access control policy for the Internet firewall. No API operations are provided for you to modify the priority of an IPv6 access control policy for the Internet firewall.
     * ## [](#qps)Limits
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * 
     * @param request the request parameters of ModifyControlPolicyPosition  ModifyControlPolicyPositionRequest
     * @return ModifyControlPolicyPositionResponse
     */
    @Deprecated
    CompletableFuture<ModifyControlPolicyPositionResponse> modifyControlPolicyPosition(ModifyControlPolicyPositionRequest request);

    /**
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
     * @param request the request parameters of ModifyDnsFirewallPolicy  ModifyDnsFirewallPolicyRequest
     * @return ModifyDnsFirewallPolicyResponse
     */
    CompletableFuture<ModifyDnsFirewallPolicyResponse> modifyDnsFirewallPolicy(ModifyDnsFirewallPolicyRequest request);

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
     * @param request the request parameters of ModifyIpsRules  ModifyIpsRulesRequest
     * @return ModifyIpsRulesResponse
     */
    CompletableFuture<ModifyIpsRulesResponse> modifyIpsRules(ModifyIpsRulesRequest request);

    /**
     * @param request the request parameters of ModifyIpsRulesToDefault  ModifyIpsRulesToDefaultRequest
     * @return ModifyIpsRulesToDefaultResponse
     */
    CompletableFuture<ModifyIpsRulesToDefaultResponse> modifyIpsRulesToDefault(ModifyIpsRulesToDefaultRequest request);

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
     * @param request the request parameters of ModifyUserAlarmConfig  ModifyUserAlarmConfigRequest
     * @return ModifyUserAlarmConfigResponse
     */
    CompletableFuture<ModifyUserAlarmConfigResponse> modifyUserAlarmConfig(ModifyUserAlarmConfigRequest request);

    /**
     * @param request the request parameters of ModifyUserIPSWhitelist  ModifyUserIPSWhitelistRequest
     * @return ModifyUserIPSWhitelistResponse
     */
    CompletableFuture<ModifyUserIPSWhitelistResponse> modifyUserIPSWhitelist(ModifyUserIPSWhitelistRequest request);

    /**
     * @param request the request parameters of ModifyUserSlsLogStorageTime  ModifyUserSlsLogStorageTimeRequest
     * @return ModifyUserSlsLogStorageTimeResponse
     */
    CompletableFuture<ModifyUserSlsLogStorageTimeResponse> modifyUserSlsLogStorageTime(ModifyUserSlsLogStorageTimeRequest request);

    /**
     * @param request the request parameters of ModifyVpcFirewallAclEngineMode  ModifyVpcFirewallAclEngineModeRequest
     * @return ModifyVpcFirewallAclEngineModeResponse
     */
    CompletableFuture<ModifyVpcFirewallAclEngineModeResponse> modifyVpcFirewallAclEngineMode(ModifyVpcFirewallAclEngineModeRequest request);

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
     * @param request the request parameters of ResetRuleHitCount  ResetRuleHitCountRequest
     * @return ResetRuleHitCountResponse
     */
    CompletableFuture<ResetRuleHitCountResponse> resetRuleHitCount(ResetRuleHitCountRequest request);

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

    /**
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
     * @param request the request parameters of UpdateAclCheckDetailStatus  UpdateAclCheckDetailStatusRequest
     * @return UpdateAclCheckDetailStatusResponse
     */
    CompletableFuture<UpdateAclCheckDetailStatusResponse> updateAclCheckDetailStatus(UpdateAclCheckDetailStatusRequest request);

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
     * @param request the request parameters of UseAclBackupData  UseAclBackupDataRequest
     * @return UseAclBackupDataResponse
     */
    CompletableFuture<UseAclBackupDataResponse> useAclBackupData(UseAclBackupDataRequest request);

}
