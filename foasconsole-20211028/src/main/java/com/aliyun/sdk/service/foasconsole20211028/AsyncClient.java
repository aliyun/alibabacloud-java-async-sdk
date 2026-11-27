// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.foasconsole20211028.models.*;
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
     * <b>description</b> :
     * <p>Disables the Flink AI service.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guidelines</strong>: If you call this OpenAPI operation in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official skill provided by the platform</a>. If you integrate the OpenAPI client and call the operation directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI/Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CloseFlinkAiService  CloseFlinkAiServiceRequest
     * @return CloseFlinkAiServiceResponse
     */
    CompletableFuture<CloseFlinkAiServiceResponse> closeFlinkAiService(CloseFlinkAiServiceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/hybrid-pricing">pricing</a> of hybrid billing for Fully Managed Flink.</em>*</p>
     * 
     * @param request the request parameters of ConvertHybridInstance  ConvertHybridInstanceRequest
     * @return ConvertHybridInstanceResponse
     */
    CompletableFuture<ConvertHybridInstanceResponse> convertHybridInstance(ConvertHybridInstanceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/switch-from-pay-as-you-go-to-subscription">pricing</a> of fully managed Flink before you call this operation.</em>*</p>
     * 
     * @param request the request parameters of ConvertInstance  ConvertInstanceRequest
     * @return ConvertInstanceResponse
     */
    CompletableFuture<ConvertInstanceResponse> convertInstance(ConvertInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure that you fully understand the <a href="https://www.alibabacloud.com/help/en/flink/product-overview/switch-from-subscription-to-pay-as-you-go">billing methods and pricing</a> of Alibaba Cloud Realtime Compute for Apache Flink.</p>
     * 
     * @param request the request parameters of ConvertPrepayInstance  ConvertPrepayInstanceRequest
     * @return ConvertPrepayInstanceResponse
     */
    CompletableFuture<ConvertPrepayInstanceResponse> convertPrepayInstance(ConvertPrepayInstanceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/billing-overview">pricing</a> of fully managed Flink.</em>*</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this OpenAPI operation in automated scenarios such as AI assistants or Code Agents, we recommend that you install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official Skill encapsulated by the platform</a>. If you integrate the OpenAPI client and call the operation directly, append the AlibabaCloud-Agent-Skills/custom identifier to the User-Agent in the request header. This helps the platform continuously improve support for AI/Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a workspace in a fully managed Flink instance.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this OpenAPI operation in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official skill provided by the platform</a>. If you integrate the OpenAPI client and call the operation directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI/Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/refund-policy">pricing</a> of Realtime Compute for Apache Flink.</em>*</p>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You cannot release a workspace in the following scenarios: - In pay-as-you-go mode, the workspace is in the Creating, Releasing, or Creation Timed Out state. - If the billing method is subscription, unsubscribe from the resources on the Unsubscription page in the User Center.
     * <strong>AI/Agent invocation guide</strong>: If you call this API operation in automated scenarios such as AI assistants or Code Agents, we recommend that you install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">officially encapsulated skill</a>. If you integrate the OpenAPI client and call the API operation directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent header of the request. This helps the platform continuously improve support for AI/Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call DescribeNamespaces to query the namespace information of a specific instance.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this OpenAPI in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official platform-encapsulated skill</a>. If you integrate the OpenAPI client and call the API directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header to help the platform continuously improve support for AI and agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeNamespaces  DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     */
    CompletableFuture<DescribeNamespacesResponse> describeNamespaces(DescribeNamespacesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the regions available for purchase.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this OpenAPI in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official platform-encapsulated skill</a>. If you integrate the OpenAPI client and call the API directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI and Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeSupportedRegions  DescribeSupportedRegionsRequest
     * @return DescribeSupportedRegionsResponse
     */
    CompletableFuture<DescribeSupportedRegionsResponse> describeSupportedRegions(DescribeSupportedRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the zones available for purchase.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guidelines</strong>: If you call this OpenAPI in automated scenarios such as AI assistants or Code Agents, we recommend that you install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official skill provided by the platform</a>. If you integrate the OpenAPI client and call the API directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI and agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeSupportedZones  DescribeSupportedZonesRequest
     * @return DescribeSupportedZonesResponse
     */
    CompletableFuture<DescribeSupportedZonesResponse> describeSupportedZones(DescribeSupportedZonesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the status of the Flink AI service.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this OpenAPI in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official platform-encapsulated skill</a>. If you integrate the OpenAPI client and call the API directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI and Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetFlinkAiService  GetFlinkAiServiceRequest
     * @return GetFlinkAiServiceResponse
     */
    CompletableFuture<GetFlinkAiServiceResponse> getFlinkAiService(GetFlinkAiServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the usage of the free quota for Flink AI services.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this OpenAPI in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official platform-encapsulated skill</a>. If you integrate the OpenAPI client and call the API directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI and Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetFlinkAiServiceFreeQuota  GetFlinkAiServiceFreeQuotaRequest
     * @return GetFlinkAiServiceFreeQuotaResponse
     */
    CompletableFuture<GetFlinkAiServiceFreeQuotaResponse> getFlinkAiServiceFreeQuota(GetFlinkAiServiceFreeQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call ListTagResources to query resource tags. You can query keys by tag values, query values by keys, or retrieve all tags used in a fully managed Flink workspace.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this API in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official skill provided by the platform</a>. If you integrate the OpenAPI client and call the API directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI and agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the shutdown protection for Flink AI services.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this API in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official platform-encapsulated skill</a>. If you integrate the OpenAPI client and call the API directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI/Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyAiServiceProtection  ModifyAiServiceProtectionRequest
     * @return ModifyAiServiceProtectionResponse
     */
    CompletableFuture<ModifyAiServiceProtectionResponse> modifyAiServiceProtection(ModifyAiServiceProtectionRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/en/flink/user-guide/reconfigure-resources#task-2507532">billing methods</a> and pricing of Realtime Compute for Apache Flink before you call this operation.</p>
     * 
     * @param request the request parameters of ModifyElasticResourceSpec  ModifyElasticResourceSpecRequest
     * @return ModifyElasticResourceSpecResponse
     */
    CompletableFuture<ModifyElasticResourceSpecResponse> modifyElasticResourceSpec(ModifyElasticResourceSpecRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the <a href="https://www.alibabacloud.com/help/en/flink/user-guide/reconfigure-resources#task-2507532">billing methods</a> and pricing of Realtime Compute for Apache Flink before you call this operation.</p>
     * 
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
     * @deprecated OpenAPI ModifyInstanceVswitch is deprecated  * @description Before using this operation, make sure that you fully understand the restrictions on [modifying vSwitches](https://www.alibabacloud.com/help/en/flink/user-guide/modify-a-vswitch) in Realtime Compute for Apache Flink.
     * 
     * @param request the request parameters of ModifyInstanceVswitch  ModifyInstanceVswitchRequest
     * @return ModifyInstanceVswitchResponse
     */
    @Deprecated
    CompletableFuture<ModifyInstanceVswitchResponse> modifyInstanceVswitch(ModifyInstanceVswitchRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>When calling this operation, note the following: - The order status must be normal, that is, OrderType=NORMAL. - When decreasing the quota, the specified resource specification quantity cannot be less than the quantity already in use. For details about the project resource specifications before and after the change, call <a href="https://help.aliyun.com/document_detail/323441.html">DescribeNamespaces</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyNamespaceSpecV2  ModifyNamespaceSpecV2Request
     * @return ModifyNamespaceSpecV2Response
     */
    CompletableFuture<ModifyNamespaceSpecV2Response> modifyNamespaceSpecV2(ModifyNamespaceSpecV2Request request);

    /**
     * @deprecated OpenAPI ModifyPrepayInstanceSpec is deprecated, please use foasconsole::2021-10-28::ModifyInstanceSpec instead.  * @description **Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/help/en/flink/product-overview/subscription) of fully managed Flink.**
     * 
     * @param request the request parameters of ModifyPrepayInstanceSpec  ModifyPrepayInstanceSpecRequest
     * @return ModifyPrepayInstanceSpecResponse
     */
    @Deprecated
    CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request);

    /**
     * @deprecated OpenAPI ModifyPrepayNamespaceSpec is deprecated, please use foasconsole::2021-10-28::ModifyNamespaceSpec instead.  * @param request  the request parameters of ModifyPrepayNamespaceSpec  ModifyPrepayNamespaceSpecRequest
     * @return ModifyPrepayNamespaceSpecResponse
     */
    @Deprecated
    CompletableFuture<ModifyPrepayNamespaceSpecResponse> modifyPrepayNamespaceSpec(ModifyPrepayNamespaceSpecRequest request);

    /**
     * <b>description</b> :
     * <p>Activates the Flink AI service.</p>
     * <blockquote>
     * <p><strong>AI/Agent invocation guide</strong>: If you call this OpenAPI in automated scenarios such as AI assistants or Code Agents, install and use the <a href="https://skills.aliyun.com/skills/alibabacloud-flink-instance-manage">official skill encapsulated by the platform</a>. If you integrate the OpenAPI client and call the API directly, include the AlibabaCloud-Agent-Skills/custom identifier in the User-Agent request header. This helps the platform continuously improve support for AI/Agent scenarios.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OpenFlinkAiService  OpenFlinkAiServiceRequest
     * @return OpenFlinkAiServiceResponse
     */
    CompletableFuture<OpenFlinkAiServiceResponse> openFlinkAiService(OpenFlinkAiServiceRequest request);

    /**
     * @param request the request parameters of QueryConvertInstancePrice  QueryConvertInstancePriceRequest
     * @return QueryConvertInstancePriceResponse
     */
    CompletableFuture<QueryConvertInstancePriceResponse> queryConvertInstancePrice(QueryConvertInstancePriceRequest request);

    /**
     * @param request the request parameters of QueryConvertPrepayInstancePrice  QueryConvertPrepayInstancePriceRequest
     * @return QueryConvertPrepayInstancePriceResponse
     */
    CompletableFuture<QueryConvertPrepayInstancePriceResponse> queryConvertPrepayInstancePrice(QueryConvertPrepayInstancePriceRequest request);

    /**
     * @param request the request parameters of QueryCreateInstancePrice  QueryCreateInstancePriceRequest
     * @return QueryCreateInstancePriceResponse
     */
    CompletableFuture<QueryCreateInstancePriceResponse> queryCreateInstancePrice(QueryCreateInstancePriceRequest request);

    /**
     * @param request the request parameters of QueryModifyInstancePrice  QueryModifyInstancePriceRequest
     * @return QueryModifyInstancePriceResponse
     */
    CompletableFuture<QueryModifyInstancePriceResponse> queryModifyInstancePrice(QueryModifyInstancePriceRequest request);

    /**
     * @param request the request parameters of QueryRenewInstancePrice  QueryRenewInstancePriceRequest
     * @return QueryRenewInstancePriceResponse
     */
    CompletableFuture<QueryRenewInstancePriceResponse> queryRenewInstancePrice(QueryRenewInstancePriceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/renewal-policy">pricing</a> of fully managed Flink.</em>*</p>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

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

}
