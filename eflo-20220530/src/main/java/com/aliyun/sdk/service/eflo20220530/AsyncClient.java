// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eflo20220530.models.*;
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
     * <p>Apply for a secondary private IP address for the specified Lingjun Elastic Network Interface.</p>
     * <ul>
     * <li>If the PrivateIp field is empty, a secondary private IP address is automatically assigned and the unique identifier of the IP address is returned.</li>
     * <li>You can use the GetLeniPrivateIpAddress or ListLeniPrivateIpAddresses interface to check whether the secondary private IP address is assigned.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignLeniPrivateIpAddress  AssignLeniPrivateIpAddressRequest
     * @return AssignLeniPrivateIpAddressResponse
     */
    CompletableFuture<AssignLeniPrivateIpAddressResponse> assignLeniPrivateIpAddress(AssignLeniPrivateIpAddressRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Apply for secondary private IP addresses</p>
     * </blockquote>
     * <ul>
     * <li>By default, each network interface controller can apply for three secondary private IP addresses. If the quota is exceeded, contact the administrator.</li>
     * <li>The secondary private IP address is allocated from the Lingjun subnet to which the current network interface controller belongs. The first address and the last two addresses belong to reserved addresses and do not participate in the allocation.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignPrivateIpAddress  AssignPrivateIpAddressRequest
     * @return AssignPrivateIpAddressResponse
     */
    CompletableFuture<AssignPrivateIpAddressResponse> assignPrivateIpAddress(AssignPrivateIpAddressRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> <strong>Add a CIDR block</strong></p>
     * </blockquote>
     * <ul>
     * <li>The CIDR block cannot start with 0. The subnet mask must be 8 to 28 bits in length.</li>
     * <li>The secondary IPv4 CIDR block must not overlap with the primary IPv4 CIDR block of the Lingjun CIDR block and the added secondary IPv4 CIDR block.</li>
     * <li>You cannot use 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 as the CIDR block of Lingjun. Example: In the Lingjun CIDR block whose primary IPv4 CIDR block is 192.168.0.0/16, you cannot add the following CIDR blocks as additional IPv4 CIDR blocks. The CIDR block that is in the same range as 192.168.0.0/16. A CIDR block that is larger than 192.168.0.0/16. Example: 192.168.0.0/8. A CIDR block that is smaller than 192.168.0.0/16. Example: 192.168.0.0/24.</li>
     * <li>By default, each tenant can create three additional CIDR blocks in each region.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateVpdCidrBlock  AssociateVpdCidrBlockRequest
     * @return AssociateVpdCidrBlockResponse
     */
    CompletableFuture<AssociateVpdCidrBlockResponse> associateVpdCidrBlock(AssociateVpdCidrBlockRequest request);

    /**
     * <b>description</b> :
     * <p>This interface is an asynchronous interface. You need to use the query interface to wait for the Lingjun Elastic Network Interface to reach the available state.</p>
     * 
     * @param request the request parameters of AttachElasticNetworkInterface  AttachElasticNetworkInterfaceRequest
     * @return AttachElasticNetworkInterfaceResponse
     */
    CompletableFuture<AttachElasticNetworkInterfaceResponse> attachElasticNetworkInterface(AttachElasticNetworkInterfaceRequest request);

    /**
     * @param request the request parameters of CreateElasticNetworkInterface  CreateElasticNetworkInterfaceRequest
     * @return CreateElasticNetworkInterfaceResponse
     */
    CompletableFuture<CreateElasticNetworkInterfaceResponse> createElasticNetworkInterface(CreateElasticNetworkInterfaceRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that you have sufficient Lingjun HUB quota.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the system will return the ID of a Lingjun HUB. At this time, the Lingjun HUB instance may not be created yet, and the system background creation task is still in progress. You can call the ListErs or GetEr operation to query the status of the Lingjun HUB.<ul>
     * <li>If the status of the Lingjun HUB is Executing, it indicates that it is being created.</li>
     * <li>If the status of the Lingjun HUB is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateEr  CreateErRequest
     * @return CreateErResponse
     */
    CompletableFuture<CreateErResponse> createEr(CreateErRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a network instance connection, note that:</p>
     * <ul>
     * <li>Make sure that you have created a Lingjun HUB instance.</li>
     * <li>Make sure that you have sufficient quota for network instance connections.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the system returns the ID of the network instance connection. In this case, the network instance connection may not be created yet, and the system is still creating the network instance in the background. You can query the connection status of a network instance by ListErAttachments or GetErAttachment:<ul>
     * <li>If the connection status of the network instance is Executing, the network instance is being created.</li>
     * <li>If the connection status of the network instance is Available, the network instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateErAttachment  CreateErAttachmentRequest
     * @return CreateErAttachmentResponse
     */
    CompletableFuture<CreateErAttachmentResponse> createErAttachment(CreateErAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a routing policy, note that:</p>
     * <ul>
     * <li>Make sure that you have created a Lingjun HUB instance.</li>
     * <li>Make sure that you have created a network instance connection.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the system returns the ID of the routing policy. In this case, the routing policy instance may not be created yet, and the system background creation task is still in progress. You can use ListErRouteMaps or GetErRouteMap to query the status of a routing policy.<ul>
     * <li>If the status of the routing policy is Execute, the system is creating the instance.</li>
     * <li>If the status of the routing policy is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateErRouteMap  CreateErRouteMapRequest
     * @return CreateErRouteMapResponse
     */
    CompletableFuture<CreateErRouteMapResponse> createErRouteMap(CreateErRouteMapRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun subnet, note that:</p>
     * <ul>
     * <li>You have created a Lingjun CIDR block.</li>
     * <li>Only one network segment can be specified for a Lingjun subnet.</li>
     * <li>The network segment cannot be modified after the Lingjun subnet is created.</li>
     * <li>Make sure that you have sufficient Lingjun subnet quota.</li>
     * <li>This interface is an asynchronous interface. After calling this interface, the system will return the ID of a Lingjun subnet. At this time, the Lingjun network segment may not be created yet, and the system background creation task is still in progress. You can call the ListSubnets or GetSubnet operation to query the status of the CIDR block of Lingjun.<ul>
     * <li>If the status of the Lingjun subnet is Executed, it indicates that it is being created.</li>
     * <li>If the status of the Lingjun subnet is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSubnet  CreateSubnetRequest
     * @return CreateSubnetResponse
     */
    CompletableFuture<CreateSubnetResponse> createSubnet(CreateSubnetRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun connection, note that:</p>
     * <ul>
     * <li>When you specify the vccId parameter, the system will configure the purchased Lingjun connection for you. When the default vccId parameter is set, the system will automatically place an order and configure the Lingjun connection for you.</li>
     * <li>Make sure that you have called the InitializeVcc operation to grant permissions.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the system will return the Lingjun connection ID, but the Lingjun connection instance may not be created yet, and the system background creation task is still in progress. You can call the ListVccs or GetVcc operation to query the status of the Lingjun connection.<ul>
     * <li>If the status of the Lingjun connection is Executed, the Lingjun connection is being created.</li>
     * <li>If the status of the Lingjun connection is Available, the Lingjun connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVcc  CreateVccRequest
     * @return CreateVccResponse
     */
    CompletableFuture<CreateVccResponse> createVcc(CreateVccRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create cross-account authorization for Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that the Alibaba Cloud ID and Lingjun HUB instance that you want to authorize are correct.</li>
     * <li>If you authorize the account of the other party, the account of the other party can load your local network instance to its Lingjun HUB, and the other party\&quot;s network will be connected to your network. Please proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVccGrantRule  CreateVccGrantRuleRequest
     * @return CreateVccGrantRuleResponse
     */
    CompletableFuture<CreateVccGrantRuleResponse> createVccGrantRule(CreateVccGrantRuleRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a VBR route entry, take note of the following items:</p>
     * <ul>
     * <li>After you call this operation, static route entries and BGP network announcements are created on the VBR to which the Lingjun connection belongs.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the VBR static route entry may not be created yet, and the system still creates the static route entry in the background. You can query the status of VBR static route entries by ListVccRouteEntries or GetVccRouteEntry:<ul>
     * <li>If the VBR static route entry is in the Executing state, it indicates that it is being created.</li>
     * <li>If the status of the VBR static route entry is Available, the VBR is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVccRouteEntry  CreateVccRouteEntryRequest
     * @return CreateVccRouteEntryResponse
     */
    CompletableFuture<CreateVccRouteEntryResponse> createVccRouteEntry(CreateVccRouteEntryRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a CIDR block for Lingjun, take note of the following:</p>
     * <ul>
     * <li>A Lingjun network segment can specify an additional network segment in addition to a main network segment.</li>
     * <li>After the Lingjun network segment is created, the network segment cannot be modified.</li>
     * <li>Make sure that you have a sufficient quota of Lingjun CIDR blocks.</li>
     * <li>This interface is an asynchronous interface. After calling this interface, the system will return the ID of a Lingjun network segment. At this time, the Lingjun network segment may not be created yet, and the system background creation task is still in progress. You can call the ListVpds or GetVpd operation to query the status of the CIDR block of Lingjun.<ul>
     * <li>If the status of the Lingjun CIDR block is Executed, the CIDR block is being created.</li>
     * <li>If the status of the Lingjun CIDR block is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpd  CreateVpdRequest
     * @return CreateVpdResponse
     */
    CompletableFuture<CreateVpdResponse> createVpd(CreateVpdRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create cross-account authorization for Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that the Alibaba Cloud ID and Lingjun HUB instance that you want to authorize are correct.</li>
     * <li>If you authorize the account of the other party, the account of the other party can load your local network instance to its Lingjun HUB, and the other party\&quot;s network will be connected to your network. Please proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpdGrantRule  CreateVpdGrantRuleRequest
     * @return CreateVpdGrantRuleResponse
     */
    CompletableFuture<CreateVpdGrantRuleResponse> createVpdGrantRule(CreateVpdGrantRuleRequest request);

    /**
     * @param request the request parameters of DeleteElasticNetworkInterface  DeleteElasticNetworkInterfaceRequest
     * @return DeleteElasticNetworkInterfaceResponse
     */
    CompletableFuture<DeleteElasticNetworkInterfaceResponse> deleteElasticNetworkInterface(DeleteElasticNetworkInterfaceRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete the Lingjun HUB, note that:</p>
     * <ul>
     * <li>Before you delete the instance, make sure that no network instance is connected to the Lingjun HUB instance.</li>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun HUB instance may not be deleted, and the system background deletion task is still in progress. You can call the ListErs or GetEr operation to query the deletion status of the Lingjun HUB.<ul>
     * <li>If the status of the Lingjun HUB is Deleting, the Lingjun HUB instance is being deleted.</li>
     * <li>If no Lingjun HUB instance is recorded, the Lingjun HUB instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEr  DeleteErRequest
     * @return DeleteErResponse
     */
    CompletableFuture<DeleteErResponse> deleteEr(DeleteErRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a network instance connection, take note of the following:</p>
     * <ul>
     * <li>Before you delete the instance, make sure that no routing policy exists under the network instance connection instance.</li>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the network instance that is connected to the instance may not be deleted. The system still deletes the instance in the background. You can call the ListErAttachments or GetErAttachment to query the deletion status of network instance connections:<ul>
     * <li>If the status of the network instance connection is Deleting, the network instance connection is being deleted.</li>
     * <li>If there is no connection record for the network instance, the connection to the network instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteErAttachment  DeleteErAttachmentRequest
     * @return DeleteErAttachmentResponse
     */
    CompletableFuture<DeleteErAttachmentResponse> deleteErAttachment(DeleteErAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a routing policy, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the routing policy instance may not be deleted yet, and the system background deletion task is still in progress. You can call the ListErRouteMaps or GetErRouteMap operation to query the deletion status of a routing policy.<ul>
     * <li>If the routing policy is in the Deleting state, the routing policy instance is being deleted.</li>
     * <li>If no routing policy instance is recorded, the routing policy instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteErRouteMap  DeleteErRouteMapRequest
     * @return DeleteErRouteMapResponse
     */
    CompletableFuture<DeleteErRouteMapResponse> deleteErRouteMap(DeleteErRouteMapRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a Lingjun subnet, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun subnet instance may not be deleted, and the system background deletion task is still in progress. You can call the ListSubnets or GetSubnet operation to query the deletion status of the subnet.<ul>
     * <li>If the status of the Lingjun subnet is Deleting, the Lingjun subnet instance is being deleted.</li>
     * <li>If there is no record of the Lingjun subnet instance, the Lingjun subnet instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSubnet  DeleteSubnetRequest
     * @return DeleteSubnetResponse
     */
    CompletableFuture<DeleteSubnetResponse> deleteSubnet(DeleteSubnetRequest request);

    /**
     * @param request the request parameters of DeleteVccGrantRule  DeleteVccGrantRuleRequest
     * @return DeleteVccGrantRuleResponse
     */
    CompletableFuture<DeleteVccGrantRuleResponse> deleteVccGrantRule(DeleteVccGrantRuleRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a VBR static route entry, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the VBR static route entries may not be deleted. The system still deletes the VBR static route entries in the background. You can call the ListVccRouteEntries or GetVccRouteEntry to query the deletion status of VBR static route entries:<ul>
     * <li>If the VBR static route entry is in the Deleting state, the VBR static route entry is being deleted.</li>
     * <li>If no VBR static route entry instance is recorded, the VBR static route entry instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVccRouteEntry  DeleteVccRouteEntryRequest
     * @return DeleteVccRouteEntryResponse
     */
    CompletableFuture<DeleteVccRouteEntryResponse> deleteVccRouteEntry(DeleteVccRouteEntryRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a Lingjun CIDR block, take note of the following items:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>Before deleting, make sure that all Lingjun subnet instances under the Lingjun CIDR block have been deleted.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun network segment instance may not be deleted, and the system background deletion task is still in progress. You can call the ListVpds or GetVpd operation to query the deletion status of the CIDR block.<ul>
     * <li>If the status of the Lingjun CIDR block is Deleting, the Lingjun CIDR block is being deleted.</li>
     * <li>If there is no record of the Lingjun CIDR block instance, the Lingjun CIDR block instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpd  DeleteVpdRequest
     * @return DeleteVpdResponse
     */
    CompletableFuture<DeleteVpdResponse> deleteVpd(DeleteVpdRequest request);

    /**
     * @param request the request parameters of DeleteVpdGrantRule  DeleteVpdGrantRuleRequest
     * @return DeleteVpdGrantRuleResponse
     */
    CompletableFuture<DeleteVpdGrantRuleResponse> deleteVpdGrantRule(DeleteVpdGrantRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query whether a user account has a <strong>AliyunServiceRoleForEfloVcc</strong> role.</p>
     * <blockquote>
     * <p> If you do not have a <strong>AliyunServiceRoleForEfloVcc</strong> role, you need to use the initializeVcc interface to complete authorization, otherwise users will not be able to use Lingjun to connect to the product.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeSlr  DescribeSlrRequest
     * @return DescribeSlrResponse
     */
    CompletableFuture<DescribeSlrResponse> describeSlr(DescribeSlrRequest request);

    /**
     * <b>description</b> :
     * <p>This interface is an asynchronous interface, and you need to use the query interface to wait for the Lingjun Elastic Network Interface to reach the unbound state.</p>
     * 
     * @param request the request parameters of DetachElasticNetworkInterface  DetachElasticNetworkInterfaceRequest
     * @return DetachElasticNetworkInterfaceResponse
     */
    CompletableFuture<DetachElasticNetworkInterfaceResponse> detachElasticNetworkInterface(DetachElasticNetworkInterfaceRequest request);

    /**
     * @param request the request parameters of GetDestinationCidrBlock  GetDestinationCidrBlockRequest
     * @return GetDestinationCidrBlockResponse
     */
    CompletableFuture<GetDestinationCidrBlockResponse> getDestinationCidrBlock(GetDestinationCidrBlockRequest request);

    /**
     * @param request the request parameters of GetElasticNetworkInterface  GetElasticNetworkInterfaceRequest
     * @return GetElasticNetworkInterfaceResponse
     */
    CompletableFuture<GetElasticNetworkInterfaceResponse> getElasticNetworkInterface(GetElasticNetworkInterfaceRequest request);

    /**
     * @param request the request parameters of GetEr  GetErRequest
     * @return GetErResponse
     */
    CompletableFuture<GetErResponse> getEr(GetErRequest request);

    /**
     * @param request the request parameters of GetErAttachment  GetErAttachmentRequest
     * @return GetErAttachmentResponse
     */
    CompletableFuture<GetErAttachmentResponse> getErAttachment(GetErAttachmentRequest request);

    /**
     * @param request the request parameters of GetErRouteEntry  GetErRouteEntryRequest
     * @return GetErRouteEntryResponse
     */
    CompletableFuture<GetErRouteEntryResponse> getErRouteEntry(GetErRouteEntryRequest request);

    /**
     * @param request the request parameters of GetErRouteMap  GetErRouteMapRequest
     * @return GetErRouteMapResponse
     */
    CompletableFuture<GetErRouteMapResponse> getErRouteMap(GetErRouteMapRequest request);

    /**
     * @param request the request parameters of GetFabricTopology  GetFabricTopologyRequest
     * @return GetFabricTopologyResponse
     */
    CompletableFuture<GetFabricTopologyResponse> getFabricTopology(GetFabricTopologyRequest request);

    /**
     * @param request the request parameters of GetLeniPrivateIpAddress  GetLeniPrivateIpAddressRequest
     * @return GetLeniPrivateIpAddressResponse
     */
    CompletableFuture<GetLeniPrivateIpAddressResponse> getLeniPrivateIpAddress(GetLeniPrivateIpAddressRequest request);

    /**
     * @param request the request parameters of GetLniPrivateIpAddress  GetLniPrivateIpAddressRequest
     * @return GetLniPrivateIpAddressResponse
     */
    CompletableFuture<GetLniPrivateIpAddressResponse> getLniPrivateIpAddress(GetLniPrivateIpAddressRequest request);

    /**
     * @param request the request parameters of GetNetworkInterface  GetNetworkInterfaceRequest
     * @return GetNetworkInterfaceResponse
     */
    CompletableFuture<GetNetworkInterfaceResponse> getNetworkInterface(GetNetworkInterfaceRequest request);

    /**
     * @param request the request parameters of GetNodeInfoForPod  GetNodeInfoForPodRequest
     * @return GetNodeInfoForPodResponse
     */
    CompletableFuture<GetNodeInfoForPodResponse> getNodeInfoForPod(GetNodeInfoForPodRequest request);

    /**
     * @param request the request parameters of GetSubnet  GetSubnetRequest
     * @return GetSubnetResponse
     */
    CompletableFuture<GetSubnetResponse> getSubnet(GetSubnetRequest request);

    /**
     * @param request the request parameters of GetVcc  GetVccRequest
     * @return GetVccResponse
     */
    CompletableFuture<GetVccResponse> getVcc(GetVccRequest request);

    /**
     * @param request the request parameters of GetVccGrantRule  GetVccGrantRuleRequest
     * @return GetVccGrantRuleResponse
     */
    CompletableFuture<GetVccGrantRuleResponse> getVccGrantRule(GetVccGrantRuleRequest request);

    /**
     * @param request the request parameters of GetVccRouteEntry  GetVccRouteEntryRequest
     * @return GetVccRouteEntryResponse
     */
    CompletableFuture<GetVccRouteEntryResponse> getVccRouteEntry(GetVccRouteEntryRequest request);

    /**
     * @param request the request parameters of GetVpd  GetVpdRequest
     * @return GetVpdResponse
     */
    CompletableFuture<GetVpdResponse> getVpd(GetVpdRequest request);

    /**
     * @param request the request parameters of GetVpdGrantRule  GetVpdGrantRuleRequest
     * @return GetVpdGrantRuleResponse
     */
    CompletableFuture<GetVpdGrantRuleResponse> getVpdGrantRule(GetVpdGrantRuleRequest request);

    /**
     * @param request the request parameters of GetVpdRouteEntry  GetVpdRouteEntryRequest
     * @return GetVpdRouteEntryResponse
     */
    CompletableFuture<GetVpdRouteEntryResponse> getVpdRouteEntry(GetVpdRouteEntryRequest request);

    /**
     * @param request the request parameters of InitializeVcc  InitializeVccRequest
     * @return InitializeVccResponse
     */
    CompletableFuture<InitializeVccResponse> initializeVcc(InitializeVccRequest request);

    /**
     * @param request the request parameters of ListElasticNetworkInterfaces  ListElasticNetworkInterfacesRequest
     * @return ListElasticNetworkInterfacesResponse
     */
    CompletableFuture<ListElasticNetworkInterfacesResponse> listElasticNetworkInterfaces(ListElasticNetworkInterfacesRequest request);

    /**
     * @param request the request parameters of ListErAttachments  ListErAttachmentsRequest
     * @return ListErAttachmentsResponse
     */
    CompletableFuture<ListErAttachmentsResponse> listErAttachments(ListErAttachmentsRequest request);

    /**
     * @param request the request parameters of ListErRouteEntries  ListErRouteEntriesRequest
     * @return ListErRouteEntriesResponse
     */
    CompletableFuture<ListErRouteEntriesResponse> listErRouteEntries(ListErRouteEntriesRequest request);

    /**
     * @param request the request parameters of ListErRouteMaps  ListErRouteMapsRequest
     * @return ListErRouteMapsResponse
     */
    CompletableFuture<ListErRouteMapsResponse> listErRouteMaps(ListErRouteMapsRequest request);

    /**
     * @param request the request parameters of ListErs  ListErsRequest
     * @return ListErsResponse
     */
    CompletableFuture<ListErsResponse> listErs(ListErsRequest request);

    /**
     * @param request the request parameters of ListInstancesByNcd  ListInstancesByNcdRequest
     * @return ListInstancesByNcdResponse
     */
    CompletableFuture<ListInstancesByNcdResponse> listInstancesByNcd(ListInstancesByNcdRequest request);

    /**
     * @param request the request parameters of ListLeniPrivateIpAddresses  ListLeniPrivateIpAddressesRequest
     * @return ListLeniPrivateIpAddressesResponse
     */
    CompletableFuture<ListLeniPrivateIpAddressesResponse> listLeniPrivateIpAddresses(ListLeniPrivateIpAddressesRequest request);

    /**
     * @param request the request parameters of ListLniPrivateIpAddress  ListLniPrivateIpAddressRequest
     * @return ListLniPrivateIpAddressResponse
     */
    CompletableFuture<ListLniPrivateIpAddressResponse> listLniPrivateIpAddress(ListLniPrivateIpAddressRequest request);

    /**
     * @param request the request parameters of ListNetworkInterfaces  ListNetworkInterfacesRequest
     * @return ListNetworkInterfacesResponse
     */
    CompletableFuture<ListNetworkInterfacesResponse> listNetworkInterfaces(ListNetworkInterfacesRequest request);

    /**
     * @param request the request parameters of ListNodeInfosForPod  ListNodeInfosForPodRequest
     * @return ListNodeInfosForPodResponse
     */
    CompletableFuture<ListNodeInfosForPodResponse> listNodeInfosForPod(ListNodeInfosForPodRequest request);

    /**
     * @param request the request parameters of ListSubnets  ListSubnetsRequest
     * @return ListSubnetsResponse
     */
    CompletableFuture<ListSubnetsResponse> listSubnets(ListSubnetsRequest request);

    /**
     * @param request the request parameters of ListVccFlowInfos  ListVccFlowInfosRequest
     * @return ListVccFlowInfosResponse
     */
    CompletableFuture<ListVccFlowInfosResponse> listVccFlowInfos(ListVccFlowInfosRequest request);

    /**
     * @param request the request parameters of ListVccGrantRules  ListVccGrantRulesRequest
     * @return ListVccGrantRulesResponse
     */
    CompletableFuture<ListVccGrantRulesResponse> listVccGrantRules(ListVccGrantRulesRequest request);

    /**
     * @param request the request parameters of ListVccRouteEntries  ListVccRouteEntriesRequest
     * @return ListVccRouteEntriesResponse
     */
    CompletableFuture<ListVccRouteEntriesResponse> listVccRouteEntries(ListVccRouteEntriesRequest request);

    /**
     * @param request the request parameters of ListVccs  ListVccsRequest
     * @return ListVccsResponse
     */
    CompletableFuture<ListVccsResponse> listVccs(ListVccsRequest request);

    /**
     * @param request the request parameters of ListVpdGrantRules  ListVpdGrantRulesRequest
     * @return ListVpdGrantRulesResponse
     */
    CompletableFuture<ListVpdGrantRulesResponse> listVpdGrantRules(ListVpdGrantRulesRequest request);

    /**
     * @param request the request parameters of ListVpdRouteEntries  ListVpdRouteEntriesRequest
     * @return ListVpdRouteEntriesResponse
     */
    CompletableFuture<ListVpdRouteEntriesResponse> listVpdRouteEntries(ListVpdRouteEntriesRequest request);

    /**
     * @param request the request parameters of ListVpds  ListVpdsRequest
     * @return ListVpdsResponse
     */
    CompletableFuture<ListVpdsResponse> listVpds(ListVpdsRequest request);

    /**
     * @param request the request parameters of QueryInstanceNcd  QueryInstanceNcdRequest
     * @return QueryInstanceNcdResponse
     */
    CompletableFuture<QueryInstanceNcdResponse> queryInstanceNcd(QueryInstanceNcdRequest request);

    /**
     * <b>description</b> :
     * <p>Only unsubscribable for Lingjun connections in the prepayment status.</p>
     * 
     * @param request the request parameters of RefundVcc  RefundVccRequest
     * @return RefundVccResponse
     */
    CompletableFuture<RefundVccResponse> refundVcc(RefundVccRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows the user to retry the operation if the Lingjun connection creation and deletion processes fail. Only the Lingjun connection in the creation failure and deletion failure state can be retried</p>
     * 
     * @param request the request parameters of RetryVcc  RetryVccRequest
     * @return RetryVccResponse
     */
    CompletableFuture<RetryVccResponse> retryVcc(RetryVccRequest request);

    /**
     * @param request the request parameters of UnAssignPrivateIpAddress  UnAssignPrivateIpAddressRequest
     * @return UnAssignPrivateIpAddressResponse
     */
    CompletableFuture<UnAssignPrivateIpAddressResponse> unAssignPrivateIpAddress(UnAssignPrivateIpAddressRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> If the attached CIDR block has Lingjun subnet resources, you must delete the dependent resources before you can delete the attached CIDR block.</li>
     * </ul>
     * 
     * @param request the request parameters of UnAssociateVpdCidrBlock  UnAssociateVpdCidrBlockRequest
     * @return UnAssociateVpdCidrBlockResponse
     */
    CompletableFuture<UnAssociateVpdCidrBlockResponse> unAssociateVpdCidrBlock(UnAssociateVpdCidrBlockRequest request);

    /**
     * @param request the request parameters of UnassignLeniPrivateIpAddress  UnassignLeniPrivateIpAddressRequest
     * @return UnassignLeniPrivateIpAddressResponse
     */
    CompletableFuture<UnassignLeniPrivateIpAddressResponse> unassignLeniPrivateIpAddress(UnassignLeniPrivateIpAddressRequest request);

    /**
     * @param request the request parameters of UpdateElasticNetworkInterface  UpdateElasticNetworkInterfaceRequest
     * @return UpdateElasticNetworkInterfaceResponse
     */
    CompletableFuture<UpdateElasticNetworkInterfaceResponse> updateElasticNetworkInterface(UpdateElasticNetworkInterfaceRequest request);

    /**
     * @param request the request parameters of UpdateEr  UpdateErRequest
     * @return UpdateErResponse
     */
    CompletableFuture<UpdateErResponse> updateEr(UpdateErRequest request);

    /**
     * @param request the request parameters of UpdateErAttachment  UpdateErAttachmentRequest
     * @return UpdateErAttachmentResponse
     */
    CompletableFuture<UpdateErAttachmentResponse> updateErAttachment(UpdateErAttachmentRequest request);

    /**
     * @param request the request parameters of UpdateErRouteMap  UpdateErRouteMapRequest
     * @return UpdateErRouteMapResponse
     */
    CompletableFuture<UpdateErRouteMapResponse> updateErRouteMap(UpdateErRouteMapRequest request);

    /**
     * @param request the request parameters of UpdateLeniPrivateIpAddress  UpdateLeniPrivateIpAddressRequest
     * @return UpdateLeniPrivateIpAddressResponse
     */
    CompletableFuture<UpdateLeniPrivateIpAddressResponse> updateLeniPrivateIpAddress(UpdateLeniPrivateIpAddressRequest request);

    /**
     * @param request the request parameters of UpdateSubnet  UpdateSubnetRequest
     * @return UpdateSubnetResponse
     */
    CompletableFuture<UpdateSubnetResponse> updateSubnet(UpdateSubnetRequest request);

    /**
     * @param request the request parameters of UpdateVcc  UpdateVccRequest
     * @return UpdateVccResponse
     */
    CompletableFuture<UpdateVccResponse> updateVcc(UpdateVccRequest request);

    /**
     * @param request the request parameters of UpdateVpd  UpdateVpdRequest
     * @return UpdateVpdResponse
     */
    CompletableFuture<UpdateVpdResponse> updateVpd(UpdateVpdRequest request);

}
