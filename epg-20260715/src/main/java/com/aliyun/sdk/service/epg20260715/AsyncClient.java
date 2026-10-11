// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.epg20260715.models.*;
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
     * @param request the request parameters of AddIpAddressesToEgressProxyIpPool  AddIpAddressesToEgressProxyIpPoolRequest
     * @return AddIpAddressesToEgressProxyIpPoolResponse
     */
    CompletableFuture<AddIpAddressesToEgressProxyIpPoolResponse> addIpAddressesToEgressProxyIpPool(AddIpAddressesToEgressProxyIpPoolRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to attach egress proxy rule groups to an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>This operation attaches one or more egress proxy rule groups to a specified egress proxy configuration and specifies the priority of each egress proxy rule group in the egress proxy configuration.</li>
     * <li>The <strong>AttachEgressProxyRuleGroupsToConfiguration</strong> operation is asynchronous. After you send the request, the system returns a response, but the egress proxy rule groups are not yet attached. The attachment task is still running in the background. You can call GetEgressProxyConfigurationAttribute to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Configuring</strong> state, the configuration is being updated.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the attachment is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachEgressProxyRuleGroupsToConfiguration  AttachEgressProxyRuleGroupsToConfigurationRequest
     * @return AttachEgressProxyRuleGroupsToConfigurationResponse
     */
    CompletableFuture<AttachEgressProxyRuleGroupsToConfigurationResponse> attachEgressProxyRuleGroupsToConfiguration(AttachEgressProxyRuleGroupsToConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>The <strong>CreateEgressProxyConfiguration</strong> operation is asynchronous. After you call this operation, the system returns the ID of the egress proxy configuration, but the configuration is not yet created. The creation task is still running in the background. You can call GetEgressProxyConfigurationAttribute to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Provisioning</strong> state, the configuration is being created.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the configuration is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateEgressProxyConfiguration  CreateEgressProxyConfigurationRequest
     * @return CreateEgressProxyConfigurationResponse
     */
    CompletableFuture<CreateEgressProxyConfigurationResponse> createEgressProxyConfiguration(CreateEgressProxyConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>CreateEgressProxyGateway</strong> operation is asynchronous. After you call this operation, the system returns an instance ID, but the egress proxy gateway instance is not yet created and the creation task is still running in the background. You can call GetEgressProxyGatewayAttribute to query the creation status of the egress proxy gateway instance:</p>
     * <ul>
     * <li>When the egress proxy gateway instance is in the <strong>Provisioning</strong> state, the instance is being created.</li>
     * <li>When the egress proxy gateway instance is in the <strong>Active</strong> state, the instance is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEgressProxyGateway  CreateEgressProxyGatewayRequest
     * @return CreateEgressProxyGatewayResponse
     */
    CompletableFuture<CreateEgressProxyGatewayResponse> createEgressProxyGateway(CreateEgressProxyGatewayRequest request);

    /**
     * @param request the request parameters of CreateEgressProxyIpPool  CreateEgressProxyIpPoolRequest
     * @return CreateEgressProxyIpPoolResponse
     */
    CompletableFuture<CreateEgressProxyIpPoolResponse> createEgressProxyIpPool(CreateEgressProxyIpPoolRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create an egress rule group, take note of the following items:</p>
     * <ul>
     * <li>You can create egress rules in batches by phase (PreDns, PreRequest, and PostResponse) when you create the rule group.</li>
     * <li>Within the same phase of a rule group, rule priorities (Priority) must be unique. Valid values: 1 to 1000. A smaller value indicates a higher priority.</li>
     * <li>This operation is asynchronous. After you call this operation, the system returns the ID of the egress rule group, but the rule group is not yet created. The creation task is still running in the background. You can call GetEgressProxyRuleGroupAttribute to query the status of the egress rule group:<ul>
     * <li>If the egress rule group is in the <strong>Provisioning</strong> state, the rule group is being created.</li>
     * <li>If the egress rule group is in the <strong>Available</strong> state, the rule group is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateEgressProxyRuleGroup  CreateEgressProxyRuleGroupRequest
     * @return CreateEgressProxyRuleGroupResponse
     */
    CompletableFuture<CreateEgressProxyRuleGroupResponse> createEgressProxyRuleGroup(CreateEgressProxyRuleGroupRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create multiple egress proxy rules in a specified egress rule group, note the following items:</p>
     * <ul>
     * <li>Egress rules are created in groups based on the effective phase (PreDns, PreRequest, or PostResponse).</li>
     * <li>Within the same effective phase of an egress rule group, the priority of rules must be unique.</li>
     * <li>Valid values for the priority: 1 to 1000. A smaller value indicates a higher priority.</li>
     * <li>This operation is asynchronous. After you call this operation, the system returns the IDs of the created egress rules, but the rules are not yet created. The creation task is still running in the background. You can call the GetEgressProxyRuleGroupAttribute operation to query the status of the egress rule group:<ul>
     * <li>If the egress rule group is in the <strong>Provisioning</strong> state, the rules are being created.</li>
     * <li>If the egress rule group is in the <strong>Available</strong> state, the rules are created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateEgressProxyRules  CreateEgressProxyRulesRequest
     * @return CreateEgressProxyRulesResponse
     */
    CompletableFuture<CreateEgressProxyRulesResponse> createEgressProxyRules(CreateEgressProxyRulesRequest request);

    /**
     * @param request the request parameters of DeleteEgressProxyConfiguration  DeleteEgressProxyConfigurationRequest
     * @return DeleteEgressProxyConfigurationResponse
     */
    CompletableFuture<DeleteEgressProxyConfigurationResponse> deleteEgressProxyConfiguration(DeleteEgressProxyConfigurationRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><code>EgressProxyGatewayId</code> is a required parameter that specifies the egress proxy gateway instance ID to delete.</li>
     * <li><code>ClientToken</code> is an optional parameter used to ensure the idempotence of the request.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEgressProxyGateway  DeleteEgressProxyGatewayRequest
     * @return DeleteEgressProxyGatewayResponse
     */
    CompletableFuture<DeleteEgressProxyGatewayResponse> deleteEgressProxyGateway(DeleteEgressProxyGatewayRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>EgressProxyIpPoolId</strong> is a required parameter that specifies the ID of the egress proxy IP address pool to delete.</li>
     * <li><strong>ClientToken</strong> is an optional parameter used to ensure the idempotence of the request.</li>
     * <li><strong>DryRun</strong> is an optional parameter. Default value: <code>false</code>. If you set this parameter to <code>true</code>, the system only prechecks the request and does not perform the delete operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEgressProxyIpPool  DeleteEgressProxyIpPoolRequest
     * @return DeleteEgressProxyIpPoolResponse
     */
    CompletableFuture<DeleteEgressProxyIpPoolResponse> deleteEgressProxyIpPool(DeleteEgressProxyIpPoolRequest request);

    /**
     * @param request the request parameters of DeleteEgressProxyRuleGroup  DeleteEgressProxyRuleGroupRequest
     * @return DeleteEgressProxyRuleGroupResponse
     */
    CompletableFuture<DeleteEgressProxyRuleGroupResponse> deleteEgressProxyRuleGroup(DeleteEgressProxyRuleGroupRequest request);

    /**
     * @param request the request parameters of DeleteEgressProxyRules  DeleteEgressProxyRulesRequest
     * @return DeleteEgressProxyRulesResponse
     */
    CompletableFuture<DeleteEgressProxyRulesResponse> deleteEgressProxyRules(DeleteEgressProxyRulesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to disassociate egress proxy rule groups from an egress proxy configuration, take note of the following items:</p>
     * <ul>
     * <li>This operation disassociates one or more egress proxy rule groups from a specified egress proxy configuration. After the disassociation, these egress proxy rule groups no longer take effect in the egress proxy configuration.</li>
     * <li>The <strong>DetachEgressProxyRuleGroupsFromConfiguration</strong> operation is asynchronous. After you send a request, the system returns a response, but the egress proxy rule groups are not yet disassociated. The disassociation task is still running in the background. You can call the GetEgressProxyConfigurationAttribute operation to query the status of the egress proxy configuration:<ul>
     * <li>If the egress proxy configuration is in the <strong>Configuring</strong> state, the configuration is being updated.</li>
     * <li>If the egress proxy configuration is in the <strong>Available</strong> state, the disassociation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DetachEgressProxyRuleGroupsFromConfiguration  DetachEgressProxyRuleGroupsFromConfigurationRequest
     * @return DetachEgressProxyRuleGroupsFromConfigurationResponse
     */
    CompletableFuture<DetachEgressProxyRuleGroupsFromConfigurationResponse> detachEgressProxyRuleGroupsFromConfiguration(DetachEgressProxyRuleGroupsFromConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p><em>GetEgressProxyConfigurationAttribute</em>* is a synchronous API operation that returns the details of a specified egress proxy configuration in real time after the call. You can determine the current status of the egress proxy configuration based on the returned <strong>Status</strong>. For example, <strong>Provisioning</strong> indicates that the configuration is being created, and <strong>Available</strong> indicates that the configuration is created and available.</p>
     * 
     * @param request the request parameters of GetEgressProxyConfigurationAttribute  GetEgressProxyConfigurationAttributeRequest
     * @return GetEgressProxyConfigurationAttributeResponse
     */
    CompletableFuture<GetEgressProxyConfigurationAttributeResponse> getEgressProxyConfigurationAttribute(GetEgressProxyConfigurationAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>GetEgressProxyGatewayAttribute</em>* is a synchronous operation that returns the current attribute information of the egress proxy gateway in real time after it is called.
     * You can determine the current status of the egress proxy gateway based on the returned <strong>Status</strong>. For example, <strong>Provisioning</strong> indicates that the instance is being created, <strong>Active</strong> indicates that the instance is running, <strong>Configuring</strong> indicates that the instance is being reconfigured, and <strong>Inactive</strong> indicates that the instance is stopped.</p>
     * 
     * @param request the request parameters of GetEgressProxyGatewayAttribute  GetEgressProxyGatewayAttributeRequest
     * @return GetEgressProxyGatewayAttributeResponse
     */
    CompletableFuture<GetEgressProxyGatewayAttributeResponse> getEgressProxyGatewayAttribute(GetEgressProxyGatewayAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>EgressProxyIpPoolId</code>，可以获取到与该ID关联的出口代理IP池的所有相关信息，包括但不限于名称、描述、网络类型等。请确保提供的<code>EgressProxyIpPoolId</code>是有效的且属于您的账户。</p>
     * 
     * @param request the request parameters of GetEgressProxyIpPoolAttribute  GetEgressProxyIpPoolAttributeRequest
     * @return GetEgressProxyIpPoolAttributeResponse
     */
    CompletableFuture<GetEgressProxyIpPoolAttributeResponse> getEgressProxyIpPoolAttribute(GetEgressProxyIpPoolAttributeRequest request);

    /**
     * @param request the request parameters of GetEgressProxyRuleGroupAttribute  GetEgressProxyRuleGroupAttributeRequest
     * @return GetEgressProxyRuleGroupAttributeResponse
     */
    CompletableFuture<GetEgressProxyRuleGroupAttributeResponse> getEgressProxyRuleGroupAttribute(GetEgressProxyRuleGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>ListEgressProxyConfigurations</em>* is a synchronous API operation that returns a list of egress proxy configurations that meet the specified conditions in real time after the call. The returned results are paginated by using <strong>MaxResults</strong> and <strong>NextToken</strong>:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, all data has been returned.</li>
     * <li>If <strong>NextToken</strong> has a value, you can use it as the <strong>NextToken</strong> for the next call to continue the query.</li>
     * </ul>
     * 
     * @param request the request parameters of ListEgressProxyConfigurations  ListEgressProxyConfigurationsRequest
     * @return ListEgressProxyConfigurationsResponse
     */
    CompletableFuture<ListEgressProxyConfigurationsResponse> listEgressProxyConfigurations(ListEgressProxyConfigurationsRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>MaxResults</code> 参数用于指定每页返回的最大结果数量，默认值为20，最大可设置为1000。</li>
     * <li><code>NextToken</code> 参数用于分页查询时获取下一页的数据。</li>
     * <li><code>Skip</code> 参数用于跳过指定数量的结果，默认值为0。</li>
     * <li><code>VpcIds</code> 参数允许通过指定一个或多个VPC ID来过滤查询结果，一次最多支持20个ID。</li>
     * <li><code>EgressProxyGatewayIds</code> 和 <code>EgressProxyGatewayNames</code> 分别允许通过实例ID和实例名称来过滤查询结果，每次请求中每个参数最多支持20个值。</li>
     * <li><code>Status</code> 参数可用于根据实例状态（如Active, Inactive等）进行过滤。</li>
     * <li><code>ResourceGroupId</code> 参数允许按资源组ID过滤查询结果。</li>
     * <li><code>Tags</code> 参数支持基于标签键值对的过滤条件，可以用来更精确地定位特定资源。
     * 请注意，所有数组类型的参数在实际使用时需要按照API的具体要求格式化输入数据。</li>
     * </ul>
     * 
     * @param request the request parameters of ListEgressProxyGateways  ListEgressProxyGatewaysRequest
     * @return ListEgressProxyGatewaysResponse
     */
    CompletableFuture<ListEgressProxyGatewaysResponse> listEgressProxyGateways(ListEgressProxyGatewaysRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>MaxResults</code> 参数用于控制每页返回的结果数量，默认为20，最大值为1000。</li>
     * <li><code>NextToken</code> 用于分页查询时获取下一页的数据。</li>
     * <li><code>Skip</code> 参数用于跳过指定数量的记录，默认值为0。</li>
     * <li>可以通过 <code>EgressProxyGatewayIds</code>, <code>EgressProxyIpPoolIds</code>, <code>EgressProxyIpPoolNames</code> 等参数进行过滤查询。</li>
     * <li><code>Status</code> 参数支持按状态过滤结果。</li>
     * <li><code>Tags</code> 参数可用于更细粒度的资源筛选。</li>
     * <li>返回结果中包含 <code>NextToken</code> 以便于继续请求后续页面的数据。</li>
     * <li><code>CreateTime</code> 字段表示的是UTC时间格式。</li>
     * </ul>
     * 
     * @param request the request parameters of ListEgressProxyIpPools  ListEgressProxyIpPoolsRequest
     * @return ListEgressProxyIpPoolsResponse
     */
    CompletableFuture<ListEgressProxyIpPoolsResponse> listEgressProxyIpPools(ListEgressProxyIpPoolsRequest request);

    /**
     * @param request the request parameters of ListEgressProxyRuleGroups  ListEgressProxyRuleGroupsRequest
     * @return ListEgressProxyRuleGroupsResponse
     */
    CompletableFuture<ListEgressProxyRuleGroupsResponse> listEgressProxyRuleGroups(ListEgressProxyRuleGroupsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Shifts a resource to another resource group. After the shift, the resource belongs to the new resource group. For valid values of the ResourceType parameter, see the metric description.</p>
     * 
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * @param request the request parameters of RemoveIpAddressesFromEgressProxyIpPool  RemoveIpAddressesFromEgressProxyIpPoolRequest
     * @return RemoveIpAddressesFromEgressProxyIpPoolResponse
     */
    CompletableFuture<RemoveIpAddressesFromEgressProxyIpPoolResponse> removeIpAddressesFromEgressProxyIpPool(RemoveIpAddressesFromEgressProxyIpPoolRequest request);

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
     * @param request the request parameters of UpdateEgressProxyConfigurationAttribute  UpdateEgressProxyConfigurationAttributeRequest
     * @return UpdateEgressProxyConfigurationAttributeResponse
     */
    CompletableFuture<UpdateEgressProxyConfigurationAttributeResponse> updateEgressProxyConfigurationAttribute(UpdateEgressProxyConfigurationAttributeRequest request);

    /**
     * @param request the request parameters of UpdateEgressProxyGatewayAttribute  UpdateEgressProxyGatewayAttributeRequest
     * @return UpdateEgressProxyGatewayAttributeResponse
     */
    CompletableFuture<UpdateEgressProxyGatewayAttributeResponse> updateEgressProxyGatewayAttribute(UpdateEgressProxyGatewayAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>EgressProxyIpPoolId</code> 是必填参数，用来指定要更新的出口地址池ID。</li>
     * <li><code>DryRun</code> 参数可以设置为 <code>true</code> 来预检此次请求而不实际执行更改，默认值为 <code>false</code>。</li>
     * <li><code>Scheduler</code> 和 <code>HashFactor</code> 参数用于定义出口IP的选择逻辑及相关的哈希因子，可根据具体需求进行设置。</li>
     * <li>其他参数如 <code>EgressProxyIpPoolName</code>, <code>Description</code> 等均为可选项，提供给用户根据需要自定义出口地址池的名字和描述等信息。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateEgressProxyIpPoolAttribute  UpdateEgressProxyIpPoolAttributeRequest
     * @return UpdateEgressProxyIpPoolAttributeResponse
     */
    CompletableFuture<UpdateEgressProxyIpPoolAttributeResponse> updateEgressProxyIpPoolAttribute(UpdateEgressProxyIpPoolAttributeRequest request);

    /**
     * @param request the request parameters of UpdateEgressProxyRuleGroupAttribute  UpdateEgressProxyRuleGroupAttributeRequest
     * @return UpdateEgressProxyRuleGroupAttributeResponse
     */
    CompletableFuture<UpdateEgressProxyRuleGroupAttributeResponse> updateEgressProxyRuleGroupAttribute(UpdateEgressProxyRuleGroupAttributeRequest request);

    /**
     * @param request the request parameters of UpdateEgressProxyRulesAttribute  UpdateEgressProxyRulesAttributeRequest
     * @return UpdateEgressProxyRulesAttributeResponse
     */
    CompletableFuture<UpdateEgressProxyRulesAttributeResponse> updateEgressProxyRulesAttribute(UpdateEgressProxyRulesAttributeRequest request);

}
