// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eais20190624.models.*;
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
     * @param request the request parameters of AttachEai  AttachEaiRequest
     * @return AttachEaiResponse
     */
    CompletableFuture<AttachEaiResponse> attachEai(AttachEaiRequest request);

    /**
     * @param request the request parameters of AttachEaisEi  AttachEaisEiRequest
     * @return AttachEaisEiResponse
     */
    CompletableFuture<AttachEaisEiResponse> attachEaisEi(AttachEaisEiRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateEai  CreateEaiRequest
     * @return CreateEaiResponse
     */
    CompletableFuture<CreateEaiResponse> createEai(CreateEaiRequest request);

    /**
     * @param request the request parameters of CreateEaiEci  CreateEaiEciRequest
     * @return CreateEaiEciResponse
     */
    CompletableFuture<CreateEaiEciResponse> createEaiEci(CreateEaiEciRequest request);

    /**
     * @param request the request parameters of CreateEaiEcs  CreateEaiEcsRequest
     * @return CreateEaiEcsResponse
     */
    CompletableFuture<CreateEaiEcsResponse> createEaiEcs(CreateEaiEcsRequest request);

    /**
     * @param request the request parameters of CreateEaiJupyter  CreateEaiJupyterRequest
     * @return CreateEaiJupyterResponse
     */
    CompletableFuture<CreateEaiJupyterResponse> createEaiJupyter(CreateEaiJupyterRequest request);

    /**
     * @param request the request parameters of CreateEaisEi  CreateEaisEiRequest
     * @return CreateEaisEiResponse
     */
    CompletableFuture<CreateEaisEiResponse> createEaisEi(CreateEaisEiRequest request);

    /**
     * @param request the request parameters of DeleteEai  DeleteEaiRequest
     * @return DeleteEaiResponse
     */
    CompletableFuture<DeleteEaiResponse> deleteEai(DeleteEaiRequest request);

    /**
     * @param request the request parameters of DeleteEaiAll  DeleteEaiAllRequest
     * @return DeleteEaiAllResponse
     */
    CompletableFuture<DeleteEaiAllResponse> deleteEaiAll(DeleteEaiAllRequest request);

    /**
     * @param request the request parameters of DeleteEaisEi  DeleteEaisEiRequest
     * @return DeleteEaisEiResponse
     */
    CompletableFuture<DeleteEaisEiResponse> deleteEaisEi(DeleteEaisEiRequest request);

    /**
     * @param request the request parameters of DescribeEais  DescribeEaisRequest
     * @return DescribeEaisResponse
     */
    CompletableFuture<DescribeEaisResponse> describeEais(DescribeEaisRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DetachEai  DetachEaiRequest
     * @return DetachEaiResponse
     */
    CompletableFuture<DetachEaiResponse> detachEai(DetachEaiRequest request);

    /**
     * @param request the request parameters of DetachEaisEi  DetachEaisEiRequest
     * @return DetachEaisEiResponse
     */
    CompletableFuture<DetachEaisEiResponse> detachEaisEi(DetachEaisEiRequest request);

    /**
     * @param request the request parameters of GetInstanceMetrics  GetInstanceMetricsRequest
     * @return GetInstanceMetricsResponse
     */
    CompletableFuture<GetInstanceMetricsResponse> getInstanceMetrics(GetInstanceMetricsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of StartEaiJupyter  StartEaiJupyterRequest
     * @return StartEaiJupyterResponse
     */
    CompletableFuture<StartEaiJupyterResponse> startEaiJupyter(StartEaiJupyterRequest request);

    /**
     * @param request the request parameters of StartEaisEi  StartEaisEiRequest
     * @return StartEaisEiResponse
     */
    CompletableFuture<StartEaisEiResponse> startEaisEi(StartEaisEiRequest request);

    /**
     * @param request the request parameters of StopEaiJupyter  StopEaiJupyterRequest
     * @return StopEaiJupyterResponse
     */
    CompletableFuture<StopEaiJupyterResponse> stopEaiJupyter(StopEaiJupyterRequest request);

    /**
     * @param request the request parameters of StopEaisEi  StopEaisEiRequest
     * @return StopEaisEiResponse
     */
    CompletableFuture<StopEaisEiResponse> stopEaisEi(StopEaisEiRequest request);

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
