// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.tablestore20201209.models.*;
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
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckInstancePolicy  CheckInstancePolicyRequest
     * @return CheckInstancePolicyResponse
     */
    CompletableFuture<CheckInstancePolicyResponse> checkInstancePolicy(CheckInstancePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, you must understand the billing and pricing of Tablestore. For more information, see <a href="https://help.aliyun.com/document_detail/27291.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>Each Alibaba Cloud account can create up to 10 instances. The name of an instance must be unique within the region in which the instance resides.</li>
     * <li>After you create an instance, you cannot change the type of the instance. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you delete an instance, make sure that all data tables and time series tables in the instance are deleted and virtual private clouds (VPCs) are unbound from the instance.</p>
     * <ul>
     * <li>To prevent conflicts, do not create an instance that has the same name as the instance that is being deleted.</li>
     * <li>After an instance is deleted, the instance becomes unavailable and the tables, table data, and related indexes in the instance cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot recover a deleted instance policy. Proceed with caution.</p>
     * <ul>
     * <li>After you delete an instance policy, the access control that is specified by the instance policy becomes invalid. Make sure that your instance is in a secure environment.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstancePolicy  DeleteInstancePolicyRequest
     * @return DeleteInstancePolicyResponse
     */
    CompletableFuture<DeleteInstancePolicyResponse> deleteInstancePolicy(DeleteInstancePolicyRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Removing tags from resources helps simplify resource management, optimize system performance, and mitigate potential security vulnerabilities. After a tag is removed from a resource, the system automatically deletes the tag if the tag is not added to other resources.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Before you call this operation, you must understand the billing and pricing of Tablestore. For more information, see <a href="https://help.aliyun.com/document_detail/27291.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>After you enable scalability for an instance, the default upper limit for the VCUs of the instance is the sum of the scalability and the reserved VCUs.</li>
     * <li>To use more computing resources when your business grows, you can modify the upper limit for the VCUs of your instance. The new upper limit for the VCUs of your instance immediately takes effect.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateInstanceElasticVCUUpperLimit  UpdateInstanceElasticVCUUpperLimitRequest
     * @return UpdateInstanceElasticVCUUpperLimitResponse
     */
    CompletableFuture<UpdateInstanceElasticVCUUpperLimitResponse> updateInstanceElasticVCUUpperLimit(UpdateInstanceElasticVCUUpperLimitRequest request);

    /**
     * @param request the request parameters of UpdateInstancePolicy  UpdateInstancePolicyRequest
     * @return UpdateInstancePolicyResponse
     */
    CompletableFuture<UpdateInstancePolicyResponse> updateInstancePolicy(UpdateInstancePolicyRequest request);

}
