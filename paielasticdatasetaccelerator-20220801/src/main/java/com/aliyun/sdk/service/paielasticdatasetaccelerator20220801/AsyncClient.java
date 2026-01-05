// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models.*;
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
     * @param request the request parameters of BindEndpoint  BindEndpointRequest
     * @return BindEndpointResponse
     */
    CompletableFuture<BindEndpointResponse> bindEndpoint(BindEndpointRequest request);

    /**
     * @param request the request parameters of CreateEndpoint  CreateEndpointRequest
     * @return CreateEndpointResponse
     */
    CompletableFuture<CreateEndpointResponse> createEndpoint(CreateEndpointRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateSlot  CreateSlotRequest
     * @return CreateSlotResponse
     */
    CompletableFuture<CreateSlotResponse> createSlot(CreateSlotRequest request);

    /**
     * @param request the request parameters of CreateSlots  CreateSlotsRequest
     * @return CreateSlotsResponse
     */
    CompletableFuture<CreateSlotsResponse> createSlots(CreateSlotsRequest request);

    /**
     * @param request the request parameters of CreateTag  CreateTagRequest
     * @return CreateTagResponse
     */
    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    /**
     * @param request the request parameters of DeleteEndpoint  DeleteEndpointRequest
     * @return DeleteEndpointResponse
     */
    CompletableFuture<DeleteEndpointResponse> deleteEndpoint(DeleteEndpointRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteSlot  DeleteSlotRequest
     * @return DeleteSlotResponse
     */
    CompletableFuture<DeleteSlotResponse> deleteSlot(DeleteSlotRequest request);

    /**
     * @param request the request parameters of DeleteTag  DeleteTagRequest
     * @return DeleteTagResponse
     */
    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    /**
     * @param request the request parameters of DescribeComponent  DescribeComponentRequest
     * @return DescribeComponentResponse
     */
    CompletableFuture<DescribeComponentResponse> describeComponent(DescribeComponentRequest request);

    /**
     * @param request the request parameters of DescribeEndpoint  DescribeEndpointRequest
     * @return DescribeEndpointResponse
     */
    CompletableFuture<DescribeEndpointResponse> describeEndpoint(DescribeEndpointRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeSlot  DescribeSlotRequest
     * @return DescribeSlotResponse
     */
    CompletableFuture<DescribeSlotResponse> describeSlot(DescribeSlotRequest request);

    /**
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    /**
     * @param request the request parameters of ListEndpoints  ListEndpointsRequest
     * @return ListEndpointsResponse
     */
    CompletableFuture<ListEndpointsResponse> listEndpoints(ListEndpointsRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListSlots  ListSlotsRequest
     * @return ListSlotsResponse
     */
    CompletableFuture<ListSlotsResponse> listSlots(ListSlotsRequest request);

    /**
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    /**
     * @param request the request parameters of QueryInstanceMetrics  QueryInstanceMetricsRequest
     * @return QueryInstanceMetricsResponse
     */
    CompletableFuture<QueryInstanceMetricsResponse> queryInstanceMetrics(QueryInstanceMetricsRequest request);

    /**
     * @param request the request parameters of QuerySlotMetrics  QuerySlotMetricsRequest
     * @return QuerySlotMetricsResponse
     */
    CompletableFuture<QuerySlotMetricsResponse> querySlotMetrics(QuerySlotMetricsRequest request);

    /**
     * @param request the request parameters of QueryStatistic  QueryStatisticRequest
     * @return QueryStatisticResponse
     */
    CompletableFuture<QueryStatisticResponse> queryStatistic(QueryStatisticRequest request);

    /**
     * @param request the request parameters of ReloadSlot  ReloadSlotRequest
     * @return ReloadSlotResponse
     */
    CompletableFuture<ReloadSlotResponse> reloadSlot(ReloadSlotRequest request);

    /**
     * @param request the request parameters of StopSlot  StopSlotRequest
     * @return StopSlotResponse
     */
    CompletableFuture<StopSlotResponse> stopSlot(StopSlotRequest request);

    /**
     * @param request the request parameters of UnbindEndpoint  UnbindEndpointRequest
     * @return UnbindEndpointResponse
     */
    CompletableFuture<UnbindEndpointResponse> unbindEndpoint(UnbindEndpointRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateSlot  UpdateSlotRequest
     * @return UpdateSlotResponse
     */
    CompletableFuture<UpdateSlotResponse> updateSlot(UpdateSlotRequest request);

}
