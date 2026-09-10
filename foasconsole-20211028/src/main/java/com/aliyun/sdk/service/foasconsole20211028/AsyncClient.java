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
     * @param request the request parameters of CloseFlinkAiService  CloseFlinkAiServiceRequest
     * @return CloseFlinkAiServiceResponse
     */
    CompletableFuture<CloseFlinkAiServiceResponse> closeFlinkAiService(CloseFlinkAiServiceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before using this API, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/hybrid-pricing">pricing</a> of hybrid billing for Realtime Compute for Apache Flink.</em>*</p>
     * 
     * @param request the request parameters of ConvertHybridInstance  ConvertHybridInstanceRequest
     * @return ConvertHybridInstanceResponse
     */
    CompletableFuture<ConvertHybridInstanceResponse> convertHybridInstance(ConvertHybridInstanceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/switch-from-pay-as-you-go-to-subscription">pricing</a> of fully managed Flink.</em>*</p>
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
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
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
     * <p>In the following cases, you cannot release a workspace:- In pay-as-you-go mode, the workspace is in the Creating, Releasing, or Creation Timed Out state.- If the billing method is subscription, unsubscribe from the resource on the Unsubscription Management page in User Center.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeNamespaces  DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     */
    CompletableFuture<DescribeNamespacesResponse> describeNamespaces(DescribeNamespacesRequest request);

    /**
     * @param request the request parameters of DescribeSupportedRegions  DescribeSupportedRegionsRequest
     * @return DescribeSupportedRegionsResponse
     */
    CompletableFuture<DescribeSupportedRegionsResponse> describeSupportedRegions(DescribeSupportedRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSupportedZones  DescribeSupportedZonesRequest
     * @return DescribeSupportedZonesResponse
     */
    CompletableFuture<DescribeSupportedZonesResponse> describeSupportedZones(DescribeSupportedZonesRequest request);

    /**
     * @param request the request parameters of GetFlinkAiService  GetFlinkAiServiceRequest
     * @return GetFlinkAiServiceResponse
     */
    CompletableFuture<GetFlinkAiServiceResponse> getFlinkAiService(GetFlinkAiServiceRequest request);

    /**
     * @param request the request parameters of GetFlinkAiServiceFreeQuota  GetFlinkAiServiceFreeQuotaRequest
     * @return GetFlinkAiServiceFreeQuotaResponse
     */
    CompletableFuture<GetFlinkAiServiceFreeQuotaResponse> getFlinkAiServiceFreeQuota(GetFlinkAiServiceFreeQuotaRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
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
     * <p>Make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/en/flink/user-guide/reconfigure-resources#task-2507532">billing methods</a> and pricing of Realtime Compute for Apache Flink before you call this operation.</p>
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
     * @deprecated OpenAPI ModifyPrepayInstanceSpec is deprecated, please use foasconsole::2021-10-28::ModifyInstanceSpec instead.  * @description **Before using this operation, make sure that you fully understand the billing method and [pricing](https://www.alibabacloud.com/help/en/flink/product-overview/subscription) of Realtime Compute for Apache Flink.**
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
     * <p><em>Before using this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/flink/product-overview/renewal-policy">pricing</a> of Realtime Compute for Apache Flink.</em>*</p>
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
