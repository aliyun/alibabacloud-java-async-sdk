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
     * @param request the request parameters of ConvertHybridInstance  ConvertHybridInstanceRequest
     * @return ConvertHybridInstanceResponse
     */
    CompletableFuture<ConvertHybridInstanceResponse> convertHybridInstance(ConvertHybridInstanceRequest request);

    /**
     * @param request the request parameters of ConvertInstance  ConvertInstanceRequest
     * @return ConvertInstanceResponse
     */
    CompletableFuture<ConvertInstanceResponse> convertInstance(ConvertInstanceRequest request);

    /**
     * @param request the request parameters of ConvertPrepayInstance  ConvertPrepayInstanceRequest
     * @return ConvertPrepayInstanceResponse
     */
    CompletableFuture<ConvertPrepayInstanceResponse> convertPrepayInstance(ConvertPrepayInstanceRequest request);

    /**
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
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyElasticResourceSpec  ModifyElasticResourceSpecRequest
     * @return ModifyElasticResourceSpecResponse
     */
    CompletableFuture<ModifyElasticResourceSpecResponse> modifyElasticResourceSpec(ModifyElasticResourceSpecRequest request);

    /**
     * @param request the request parameters of ModifyInstanceVswitch  ModifyInstanceVswitchRequest
     * @return ModifyInstanceVswitchResponse
     */
    CompletableFuture<ModifyInstanceVswitchResponse> modifyInstanceVswitch(ModifyInstanceVswitchRequest request);

    /**
     * @param request the request parameters of ModifyNamespaceSpecV2  ModifyNamespaceSpecV2Request
     * @return ModifyNamespaceSpecV2Response
     */
    CompletableFuture<ModifyNamespaceSpecV2Response> modifyNamespaceSpecV2(ModifyNamespaceSpecV2Request request);

    /**
     * @deprecated OpenAPI ModifyPrepayInstanceSpec is deprecated, please use foasconsole::2021-10-28::ModifyInstanceSpec instead.  * @param request  the request parameters of ModifyPrepayInstanceSpec  ModifyPrepayInstanceSpecRequest
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
