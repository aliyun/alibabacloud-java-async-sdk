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

    CompletableFuture<BindEndpointResponse> bindEndpoint(BindEndpointRequest request);

    CompletableFuture<CreateEndpointResponse> createEndpoint(CreateEndpointRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateSlotResponse> createSlot(CreateSlotRequest request);

    CompletableFuture<CreateSlotsResponse> createSlots(CreateSlotsRequest request);

    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    CompletableFuture<DeleteEndpointResponse> deleteEndpoint(DeleteEndpointRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteSlotResponse> deleteSlot(DeleteSlotRequest request);

    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    CompletableFuture<DescribeComponentResponse> describeComponent(DescribeComponentRequest request);

    CompletableFuture<DescribeEndpointResponse> describeEndpoint(DescribeEndpointRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeSlotResponse> describeSlot(DescribeSlotRequest request);

    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    CompletableFuture<ListEndpointsResponse> listEndpoints(ListEndpointsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListSlotsResponse> listSlots(ListSlotsRequest request);

    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<QueryInstanceMetricsResponse> queryInstanceMetrics(QueryInstanceMetricsRequest request);

    CompletableFuture<QuerySlotMetricsResponse> querySlotMetrics(QuerySlotMetricsRequest request);

    CompletableFuture<QueryStatisticResponse> queryStatistic(QueryStatisticRequest request);

    CompletableFuture<ReloadSlotResponse> reloadSlot(ReloadSlotRequest request);

    CompletableFuture<StopSlotResponse> stopSlot(StopSlotRequest request);

    CompletableFuture<UnbindEndpointResponse> unbindEndpoint(UnbindEndpointRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateSlotResponse> updateSlot(UpdateSlotRequest request);

}
