// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.tag20180828.models.*;
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
     * <p>If you use the Tag Policy feature in single-account mode, you can call this API operation to attach a tag policy to the current logon account. If you use the Tag Policy feature in multi-account mode, you can call this API operation to attach a tag policy to the Root folder, a folder other than the Root folder, or a member in a resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to attach the tag policy with an ID of <code>p-de62a0bf400e4b69****</code> to the current logon account. In this example, the Tag Policy feature in single-account mode is used.</p>
     * 
     * @param request the request parameters of AttachPolicy  AttachPolicyRequest
     * @return AttachPolicyResponse
     */
    CompletableFuture<AttachPolicyResponse> attachPolicy(AttachPolicyRequest request);

    /**
     * @param request the request parameters of CheckCreatedByEnabled  CheckCreatedByEnabledRequest
     * @return CheckCreatedByEnabledResponse
     */
    CompletableFuture<CheckCreatedByEnabledResponse> checkCreatedByEnabled(CheckCreatedByEnabledRequest request);

    /**
     * @param request the request parameters of CloseCreatedBy  CloseCreatedByRequest
     * @return CloseCreatedByResponse
     */
    CompletableFuture<CloseCreatedByResponse> closeCreatedBy(CloseCreatedByRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to call the API operation to create a tag policy named <code>test</code>. In this example, the Tag Policy feature in multi-account mode is used. The tag policy defines that resources to which the <code>CostCenter:Beijing</code> or <code>CostCenter:Shanghai</code> tag is added are compliant and other resources are not compliant.</p>
     * 
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>A preset tag is a tag that you create in advance and is available for the resources in all regions. You can create preset tags in the stage of tag planning and add them to specific resources in the stage of tag implementation. When you create a preset tag, you can specify only the tag key. You can specify a tag value in the future.
     * This topic provides an example on how to call the API operation to create a preset tag whose tag key is <code>Environment</code> to indicate the business environment.</p>
     * 
     * @param request the request parameters of CreateTags  CreateTagsRequest
     * @return CreateTagsResponse
     */
    CompletableFuture<CreateTagsResponse> createTags(CreateTagsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a tag policy, make sure that the tag policy is detached from all objects to which the tag policy is attached. For more information about how to detach a tag policy, see <a href="https://help.aliyun.com/document_detail/429724.html">DetachPolicy</a>.
     * This topic provides an example on how to call the API operation to delete the tag policy with an ID of <code>p-557cb141331f41c7****</code>.</p>
     * 
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to delete the preset tag whose tag key is <code>Environment</code> and tag value is <code>test</code>.</p>
     * 
     * @param request the request parameters of DeleteTag  DeleteTagRequest
     * @return DeleteTagResponse
     */
    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can call this API operation to detach a tag policy from the current logon account. If you use the Tag Policy feature in multi-account mode, you can call this API operation to detach a tag policy from the Root folder, a folder other than the Root folder, or a member in a resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to detach the tag policy with an ID of <code>p-a3381efe2fe34a75****</code> from the current logon account. In this example, the Tag Policy feature in single-account mode is used.</p>
     * 
     * @param request the request parameters of DetachPolicy  DetachPolicyRequest
     * @return DetachPolicyResponse
     */
    CompletableFuture<DetachPolicyResponse> detachPolicy(DetachPolicyRequest request);

    /**
     * @param request the request parameters of DisablePolicyType  DisablePolicyTypeRequest
     * @return DisablePolicyTypeResponse
     */
    CompletableFuture<DisablePolicyTypeResponse> disablePolicyType(DisablePolicyTypeRequest request);

    /**
     * @param request the request parameters of EnablePolicyType  EnablePolicyTypeRequest
     * @return EnablePolicyTypeResponse
     */
    CompletableFuture<EnablePolicyTypeResponse> enablePolicyType(EnablePolicyTypeRequest request);

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can call this API operation to generate a resource non-compliance report for the current logon account. If you use the Tag Policy feature in multi-account mode, you can call this API operation to generate a resource non-compliance report for the Root folder, a folder other than the Root folder, or a member in a resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call this API operation to generate a resource non-compliance report for the current logon account. In this example, the Tag Policy feature in single-account mode is used.</p>
     * 
     * @param request the request parameters of GenerateConfigRuleReport  GenerateConfigRuleReportRequest
     * @return GenerateConfigRuleReportResponse
     */
    CompletableFuture<GenerateConfigRuleReportResponse> generateConfigRuleReport(GenerateConfigRuleReportRequest request);

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the basic information of the resource non-compliance report that is last generated for the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the basic information of the resource non-compliance report that is last generated for an object in the resource directory. The object can be the Root folder, a folder other than the Root folder, or a member. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call this API operation to query the basic information of the resource non-compliance report that is last generated for the current logon account. In this example, the Tag Policy feature in single-account mode is used. The response shows that the ID of the report is <code>crp-ao0786618088006c****</code>.</p>
     * 
     * @param request the request parameters of GetConfigRuleReport  GetConfigRuleReportRequest
     * @return GetConfigRuleReportResponse
     */
    CompletableFuture<GetConfigRuleReportResponse> getConfigRuleReport(GetConfigRuleReportRequest request);

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the effective tag policy for the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the effective tag policy for the Root folder, a folder other than the Root folder, or a member in the resource directory. You can also use a member of a resource directory to call this API operation to query the effective tag policy for the member. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * An effective tag policy is obtained based on tag policy inheritance. For more information, see <a href="https://help.aliyun.com/document_detail/417435.html">Inheritance of a tag policy and calculation of an effective tag policy</a>.
     * This topic provides an example on how to call the API operation to query the effective tag policy for the current logon account. In this example, the Tag Policy feature in single-account mode is used.</p>
     * 
     * @param request the request parameters of GetEffectivePolicy  GetEffectivePolicyRequest
     * @return GetEffectivePolicyResponse
     */
    CompletableFuture<GetEffectivePolicyResponse> getEffectivePolicy(GetEffectivePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the details of the tag policy with an ID of <code>p-557cb141331f41c7****</code>.</p>
     * 
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the status of the Tag Policy feature for the current logon account. The response shows that the Tag Policy feature in multi-account mode is enabled for the current logon account.</p>
     * 
     * @param request the request parameters of GetPolicyEnableStatus  GetPolicyEnableStatusRequest
     * @return GetPolicyEnableStatusResponse
     */
    CompletableFuture<GetPolicyEnableStatusResponse> getPolicyEnableStatus(GetPolicyEnableStatusRequest request);

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the tag detection tasks for the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the tag detection tasks for the Root folder, a folder other than the Root folder, or a member in the resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to query the tag detection tasks for the current logon account. In this example, the Tag Policy feature in single-account mode is used. The response shows that only one tag detection task exists.</p>
     * 
     * @param request the request parameters of ListConfigRulesForTarget  ListConfigRulesForTargetRequest
     * @return ListConfigRulesForTargetResponse
     */
    CompletableFuture<ListConfigRulesForTargetResponse> listConfigRulesForTarget(ListConfigRulesForTargetRequest request);

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query all tag policies that are created for the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query all tag policies that are created for the resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to query all tag policies that are created for the current logon account. In this example, the Tag Policy feature in single-account mode is used. The response shows that two tag policies are created.</p>
     * 
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the tag policies that are attached to the account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the tag policies that are attached to the Root folder, a folder other than the Root folder, or a member in the resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to query the tag policies that are attached to the current logon account. In this example, the Tag Policy feature in single-account mode is used. The response shows that only one tag policy is attached to the current logon account.</p>
     * 
     * @param request the request parameters of ListPoliciesForTarget  ListPoliciesForTargetRequest
     * @return ListPoliciesForTargetResponse
     */
    CompletableFuture<ListPoliciesForTargetResponse> listPoliciesForTarget(ListPoliciesForTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation in the China (Shenzhen) region to query virtual private clouds (VPCs) to which the tag key <code>k1</code> is added. The response shows that the tag key is added to two VPCs.</p>
     * 
     * @param request the request parameters of ListResourcesByTag  ListResourcesByTagRequest
     * @return ListResourcesByTagResponse
     */
    CompletableFuture<ListResourcesByTagResponse> listResourcesByTag(ListResourcesByTagRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Call example</h3>
     * <ul>
     * <li>Query a list of resource types supported by TagResources or UntagResources. For more information, see <a href="https://api.alibabacloud.com/api/Tag/2018-08-28/ListSupportResourceTypes?tab=DEBUG%5C&params=%7B%22RegionId%22:%22cn-hangzhou%22,%22SupportCode%22:%22TAG_CONSOLE_SUPPORT%22%7D">Example</a>.</li>
     * <li>Query a list of resource types supported by ListTagResources or ListResourcesByTag. For more information, see <a href="https://api.alibabacloud.com/api/Tag/2018-08-28/ListSupportResourceTypes?tab=DEBUG%5C&params=%7B%22RegionId%22:%22cn-hangzhou%22%7D">Example</a>.</li>
     * <li>Query a list of resource types that support createdby tags. For more information, see <a href="https://api.alibabacloud.com/api/Tag/2018-08-28/ListSupportResourceTypes?tab=DEBUG%5C&params=%7B%22RegionId%22:%22cn-hangzhou%22,%22SupportCode%22:%22CREATED_BY_TAG_CONSOLE_SUPPORT%22%7D">Example</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSupportResourceTypes  ListSupportResourceTypesRequest
     * @return ListSupportResourceTypesResponse
     */
    CompletableFuture<ListSupportResourceTypesResponse> listSupportResourceTypes(ListSupportResourceTypesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the tag keys in the <code>cn-hangzhou</code> region. The response shows that the following tag keys exist: <code>team</code>, <code>k1</code>, and <code>k2</code>.</p>
     * 
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the Alibaba Cloud services that support tags, see <a href="https://help.aliyun.com/document_detail/171455.html">Services that work with Tag</a>.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the values of the tag key <code>k1</code> in the <code>cn-hangzhou</code> region. The response shows that the value of the tag key <code>k1</code> is <code>v1</code>.</p>
     * 
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * <b>description</b> :
     * <p>If you use the Tag Policy feature in single-account mode, you can use the current logon account to call this API operation to query the object to which a tag policy is attached. The object is the current logon account. If you use the Tag Policy feature in multi-account mode, you can use the management account of a resource directory to call this API operation to query the objects to which a tag policy is attached. The objects include the Root folder, folders other than the Root folder, and members in the resource directory. For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.
     * This topic provides an example on how to call the API operation to query the objects to which the tag policy with an ID of <code>p-de62a0bf400e4b69****</code> is attached. In this example, the Tag Policy feature in multi-account mode is used. The response shows that the tag policy is attached to two members in the related resource directory.</p>
     * 
     * @param request the request parameters of ListTargetsForPolicy  ListTargetsForPolicyRequest
     * @return ListTargetsForPolicyResponse
     */
    CompletableFuture<ListTargetsForPolicyResponse> listTargetsForPolicy(ListTargetsForPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to change the name of a tag policy to <code>test</code>.</p>
     * 
     * @param request the request parameters of ModifyPolicy  ModifyPolicyRequest
     * @return ModifyPolicyResponse
     */
    CompletableFuture<ModifyPolicyResponse> modifyPolicy(ModifyPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>createdby tags can help you analyze costs and bills and manage the costs of cloud resources in an efficient manner. You can identify the creators of resources based on the createdby tags added to the resources. createdby tags are system tags that are provided by Alibaba Cloud and automatically added to resources. The key of createdby tags is <code>acs:tag:createdby</code>.</p>
     * 
     * @param request the request parameters of OpenCreatedBy  OpenCreatedByRequest
     * @return OpenCreatedByResponse
     */
    CompletableFuture<OpenCreatedByResponse> openCreatedBy(OpenCreatedByRequest request);

    /**
     * <b>description</b> :
     * <p>Tags are used to identify resources. Tags allow you to categorize, search for, and aggregate resources that have the same characteristics from different dimensions. This facilitates resource management. For more information, see <a href="https://help.aliyun.com/document_detail/156983.html">Tag overview</a>.
     * For information about the Alibaba Cloud services that support tags, see <a href="https://help.aliyun.com/document_detail/171455.html">Services that work with Tag</a>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>After you remove a tag, the tag is automatically deleted within 24 hours if it is not added to other resources.
     * For information about the Alibaba Cloud services that support tags, see <a href="https://help.aliyun.com/document_detail/171455.html">Services that work with Tag</a>.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
