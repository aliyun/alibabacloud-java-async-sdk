// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vpcipam20230228.models.*;
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
     * <p>  Before you provision a CIDR block, make sure that an IPAM pool is created. You can call the <strong>CreateIpamPool</strong> operation to create an IPAM pool.</p>
     * <ul>
     * <li>If no CIDR block is provisioned to a parent pool, you cannot provision CIDR blocks to its subpools.</li>
     * <li>If a CIDR block is provisioned to a parent pool, you can provision CIDR blocks to its subpools and the CIDR blocks must be subsets of the CIDR block provisioned to the parent pool.</li>
     * <li>If a CIDR block is provisioned to a parent pool and allocations are created, CIDR blocks provisioned to its subpools cannot overlap with existing allocated CIDR blocks.</li>
     * <li>You can provision CIDR blocks to a pool only in the region where the IPAM is hosted.</li>
     * <li>CIDR blocks provisioned to an IPAM pool cannot overlap with the CIDR blocks provisioned to other pools in the same scope.</li>
     * <li>A maximum of 1 CIDR block can be provisioned to a public IPv6 top-level pool, while up to 50 CIDR blocks can be provisioned to other types of address pools.</li>
     * </ul>
     * 
     * @param request the request parameters of AddIpamPoolCidr  AddIpamPoolCidrRequest
     * @return AddIpamPoolCidrResponse
     */
    CompletableFuture<AddIpamPoolCidrResponse> addIpamPoolCidr(AddIpamPoolCidrRequest request);

    /**
     * <b>description</b> :
     * <p>  The specified resource discovery instance can only be associated with one IPAM instance and associations cannot be duplicated.</p>
     * 
     * @param request the request parameters of AssociateIpamResourceDiscovery  AssociateIpamResourceDiscoveryRequest
     * @return AssociateIpamResourceDiscoveryResponse
     */
    CompletableFuture<AssociateIpamResourceDiscoveryResponse> associateIpamResourceDiscovery(AssociateIpamResourceDiscoveryRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create only one IPAM with each Alibaba Cloud account in each region.</li>
     * <li>Only IPv4 IP addresses can be allocated.</li>
     * <li>When you create an IPAM instance:<ul>
     * <li>If there is no custom resource discovery in the region, the system creates a default resource discovery associated with the IPAM instance.</li>
     * <li>If there is a custom resource discovery in the region, the system converts it to a default resource discovery and associates it with the IPAM instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpam  CreateIpamRequest
     * @return CreateIpamResponse
     */
    CompletableFuture<CreateIpamResponse> createIpam(CreateIpamRequest request);

    /**
     * <b>description</b> :
     * <p>The number of public IPv6 IPAM top pool for a specific ISP that a user is allowed to create per region is limited to 1.</p>
     * 
     * @param request the request parameters of CreateIpamPool  CreateIpamPoolRequest
     * @return CreateIpamPoolResponse
     */
    CompletableFuture<CreateIpamPoolResponse> createIpamPool(CreateIpamPoolRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you reserve a custom CIDR block, make sure that an IPAM pool is created and CIDR blocks are added to the pool. You can call <strong>CreateIpamPool</strong> to create an IPAM pool and call <strong>AddIpamPoolCidr</strong> to add CIDR blocks to the pool.</p>
     * <ul>
     * <li>When you specify Cidr or CidrMask to reserve a custom CIDR block, the mask must fall within the range specified by the IPAM pool.</li>
     * <li>If the IPAM pool has the region attribute, you must reserve a custom CIDR block in the region to which the IPAM pool belongs.</li>
     * <li>The custom CIDR block that you want to reserve cannot overlap with existing CIDR blocks created from the IPAM pool.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpamPoolAllocation  CreateIpamPoolAllocationRequest
     * @return CreateIpamPoolAllocationResponse
     */
    CompletableFuture<CreateIpamPoolAllocationResponse> createIpamPoolAllocation(CreateIpamPoolAllocationRequest request);

    /**
     * <b>description</b> :
     * <p>  Each Alibaba Cloud account can create only one resource discovery instance in each region.</p>
     * <ul>
     * <li>You can create only custom resource discovery instances.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpamResourceDiscovery  CreateIpamResourceDiscoveryRequest
     * @return CreateIpamResourceDiscoveryResponse
     */
    CompletableFuture<CreateIpamResourceDiscoveryResponse> createIpamResourceDiscovery(CreateIpamResourceDiscoveryRequest request);

    /**
     * @param request the request parameters of CreateIpamScope  CreateIpamScopeRequest
     * @return CreateIpamScopeResponse
     */
    CompletableFuture<CreateIpamScopeResponse> createIpamScope(CreateIpamScopeRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Prerequisites</h2>
     * <ul>
     * <li>Before you delete an IPAM, make sure that all IPAM pools of the IPAM are deleted. You can call <strong>DeleteIpamPool</strong> to delete IPAM pools.</li>
     * <li>Before you delete an IPAM, make sure that all IPAM scopes of the IPAM are deleted. You can call <strong>DeleteIpamScope</strong> to delete IPAM scopes.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpam  DeleteIpamRequest
     * @return DeleteIpamResponse
     */
    CompletableFuture<DeleteIpamResponse> deleteIpam(DeleteIpamRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Before you delete a parent pool, make sure that all subpools of the parent pool are deleted.</li>
     * <li>If an effective region is specified for a parent pool and IP addresses are allocated from the parent pool, you cannot delete the parent pool.</li>
     * <li>If an effective region is specified for a subpool and IP addresses are allocated from the subpool, you cannot delete the subpool.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpamPool  DeleteIpamPoolRequest
     * @return DeleteIpamPoolResponse
     */
    CompletableFuture<DeleteIpamPoolResponse> deleteIpamPool(DeleteIpamPoolRequest request);

    /**
     * @param request the request parameters of DeleteIpamPoolAllocation  DeleteIpamPoolAllocationRequest
     * @return DeleteIpamPoolAllocationResponse
     */
    CompletableFuture<DeleteIpamPoolAllocationResponse> deleteIpamPoolAllocation(DeleteIpamPoolAllocationRequest request);

    /**
     * <b>description</b> :
     * <p>  If CIDR blocks are provisioned to a parent pool and its subpools, you must first delete the CIDR blocks provisioned to the subpools before you delete the ones provisioned to the parent pool.</p>
     * <ul>
     * <li>If CIDR blocks are provisioned only to the parent pool, directly delete them.</li>
     * <li>If CIDR blocks are allocated from provisioned ones, you must first delete the allocated CIDR blocks before you delete the provisioned ones.</li>
     * <li>You can delete CIDR blocks provisioned to an IPAM pool only in the region where the IPAM is hosted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpamPoolCidr  DeleteIpamPoolCidrRequest
     * @return DeleteIpamPoolCidrResponse
     */
    CompletableFuture<DeleteIpamPoolCidrResponse> deleteIpamPoolCidr(DeleteIpamPoolCidrRequest request);

    /**
     * <b>description</b> :
     * <p>  If a resource discovery instance is shared, it cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteIpamResourceDiscovery  DeleteIpamResourceDiscoveryRequest
     * @return DeleteIpamResourceDiscoveryResponse
     */
    CompletableFuture<DeleteIpamResourceDiscoveryResponse> deleteIpamResourceDiscovery(DeleteIpamResourceDiscoveryRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You cannot delete the private scope and public scope created by the system.</li>
     * <li>Before you delete an IPAM scope, make sure that all pools within the scope are deleted. You can call <strong>DeleteIpamPool</strong> to delete IPAM pools.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpamScope  DeleteIpamScopeRequest
     * @return DeleteIpamScopeResponse
     */
    CompletableFuture<DeleteIpamScopeResponse> deleteIpamScope(DeleteIpamScopeRequest request);

    /**
     * @param request the request parameters of DissociateIpamResourceDiscovery  DissociateIpamResourceDiscoveryRequest
     * @return DissociateIpamResourceDiscoveryResponse
     */
    CompletableFuture<DissociateIpamResourceDiscoveryResponse> dissociateIpamResourceDiscovery(DissociateIpamResourceDiscoveryRequest request);

    /**
     * @param request the request parameters of GetIpamPoolAllocation  GetIpamPoolAllocationRequest
     * @return GetIpamPoolAllocationResponse
     */
    CompletableFuture<GetIpamPoolAllocationResponse> getIpamPoolAllocation(GetIpamPoolAllocationRequest request);

    /**
     * @param request the request parameters of GetIpamPoolNextAvailableCidr  GetIpamPoolNextAvailableCidrRequest
     * @return GetIpamPoolNextAvailableCidrResponse
     */
    CompletableFuture<GetIpamPoolNextAvailableCidrResponse> getIpamPoolNextAvailableCidr(GetIpamPoolNextAvailableCidrRequest request);

    /**
     * @param request the request parameters of GetVpcIpamServiceStatus  GetVpcIpamServiceStatusRequest
     * @return GetVpcIpamServiceStatusResponse
     */
    CompletableFuture<GetVpcIpamServiceStatusResponse> getVpcIpamServiceStatus(GetVpcIpamServiceStatusRequest request);

    /**
     * @param request the request parameters of ListIpamDiscoveredResource  ListIpamDiscoveredResourceRequest
     * @return ListIpamDiscoveredResourceResponse
     */
    CompletableFuture<ListIpamDiscoveredResourceResponse> listIpamDiscoveredResource(ListIpamDiscoveredResourceRequest request);

    /**
     * @param request the request parameters of ListIpamPoolAllocations  ListIpamPoolAllocationsRequest
     * @return ListIpamPoolAllocationsResponse
     */
    CompletableFuture<ListIpamPoolAllocationsResponse> listIpamPoolAllocations(ListIpamPoolAllocationsRequest request);

    /**
     * @param request the request parameters of ListIpamPoolCidrs  ListIpamPoolCidrsRequest
     * @return ListIpamPoolCidrsResponse
     */
    CompletableFuture<ListIpamPoolCidrsResponse> listIpamPoolCidrs(ListIpamPoolCidrsRequest request);

    /**
     * @param request the request parameters of ListIpamPools  ListIpamPoolsRequest
     * @return ListIpamPoolsResponse
     */
    CompletableFuture<ListIpamPoolsResponse> listIpamPools(ListIpamPoolsRequest request);

    /**
     * @param request the request parameters of ListIpamResourceCidrs  ListIpamResourceCidrsRequest
     * @return ListIpamResourceCidrsResponse
     */
    CompletableFuture<ListIpamResourceCidrsResponse> listIpamResourceCidrs(ListIpamResourceCidrsRequest request);

    /**
     * @param request the request parameters of ListIpamResourceDiscoveries  ListIpamResourceDiscoveriesRequest
     * @return ListIpamResourceDiscoveriesResponse
     */
    CompletableFuture<ListIpamResourceDiscoveriesResponse> listIpamResourceDiscoveries(ListIpamResourceDiscoveriesRequest request);

    /**
     * @param request the request parameters of ListIpamResourceDiscoveryAssociations  ListIpamResourceDiscoveryAssociationsRequest
     * @return ListIpamResourceDiscoveryAssociationsResponse
     */
    CompletableFuture<ListIpamResourceDiscoveryAssociationsResponse> listIpamResourceDiscoveryAssociations(ListIpamResourceDiscoveryAssociationsRequest request);

    /**
     * @param request the request parameters of ListIpamScopes  ListIpamScopesRequest
     * @return ListIpamScopesResponse
     */
    CompletableFuture<ListIpamScopesResponse> listIpamScopes(ListIpamScopesRequest request);

    /**
     * @param request the request parameters of ListIpams  ListIpamsRequest
     * @return ListIpamsResponse
     */
    CompletableFuture<ListIpamsResponse> listIpams(ListIpamsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object that you want to query.</li>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of OpenVpcIpamService  OpenVpcIpamServiceRequest
     * @return OpenVpcIpamServiceResponse
     */
    CompletableFuture<OpenVpcIpamServiceResponse> openVpcIpamService(OpenVpcIpamServiceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following items:</p>
     * <ul>
     * <li>Each tag key that is added to an instance must be unique.</li>
     * <li>You cannot create tags without adding them to instances. All tags must be added to instances.</li>
     * <li>You can add at most 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.</li>
     * </ul>
     * 
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
     * @param request the request parameters of UpdateIpam  UpdateIpamRequest
     * @return UpdateIpamResponse
     */
    CompletableFuture<UpdateIpamResponse> updateIpam(UpdateIpamRequest request);

    /**
     * @param request the request parameters of UpdateIpamPool  UpdateIpamPoolRequest
     * @return UpdateIpamPoolResponse
     */
    CompletableFuture<UpdateIpamPoolResponse> updateIpamPool(UpdateIpamPoolRequest request);

    /**
     * @param request the request parameters of UpdateIpamPoolAllocation  UpdateIpamPoolAllocationRequest
     * @return UpdateIpamPoolAllocationResponse
     */
    CompletableFuture<UpdateIpamPoolAllocationResponse> updateIpamPoolAllocation(UpdateIpamPoolAllocationRequest request);

    /**
     * <b>description</b> :
     * <p>  You can add or remove effective regions only for custom resource discovery instances.</p>
     * <ul>
     * <li>When removing effective regions from a resource discovery instance, the hosted region cannot be included.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateIpamResourceDiscovery  UpdateIpamResourceDiscoveryRequest
     * @return UpdateIpamResourceDiscoveryResponse
     */
    CompletableFuture<UpdateIpamResourceDiscoveryResponse> updateIpamResourceDiscovery(UpdateIpamResourceDiscoveryRequest request);

    /**
     * @param request the request parameters of UpdateIpamScope  UpdateIpamScopeRequest
     * @return UpdateIpamScopeResponse
     */
    CompletableFuture<UpdateIpamScopeResponse> updateIpamScope(UpdateIpamScopeRequest request);

}
