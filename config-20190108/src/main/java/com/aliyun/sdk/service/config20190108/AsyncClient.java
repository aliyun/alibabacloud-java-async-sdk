// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.config20190108.models.*;
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

    CompletableFuture<ActiveConfigRulesResponse> activeConfigRules(ActiveConfigRulesRequest request);

    CompletableFuture<DeleteConfigRulesResponse> deleteConfigRules(DeleteConfigRulesRequest request);

    CompletableFuture<DescribeComplianceResponse> describeCompliance(DescribeComplianceRequest request);

    CompletableFuture<DescribeComplianceSummaryResponse> describeComplianceSummary(DescribeComplianceSummaryRequest request);

    CompletableFuture<DescribeConfigRuleResponse> describeConfigRule(DescribeConfigRuleRequest request);

    CompletableFuture<DescribeConfigurationRecorderResponse> describeConfigurationRecorder(DescribeConfigurationRecorderRequest request);

    CompletableFuture<DescribeDeliveryChannelsResponse> describeDeliveryChannels(DescribeDeliveryChannelsRequest request);

    CompletableFuture<DescribeDiscoveredResourceResponse> describeDiscoveredResource(DescribeDiscoveredResourceRequest request);

    CompletableFuture<DescribeEvaluationResultsResponse> describeEvaluationResults(DescribeEvaluationResultsRequest request);

    CompletableFuture<GetAggregateDiscoveredResourceResponse> getAggregateDiscoveredResource(GetAggregateDiscoveredResourceRequest request);

    CompletableFuture<GetDiscoveredResourceCountsResponse> getDiscoveredResourceCounts(GetDiscoveredResourceCountsRequest request);

    CompletableFuture<GetDiscoveredResourceSummaryResponse> getDiscoveredResourceSummary(GetDiscoveredResourceSummaryRequest request);

    CompletableFuture<GetResourceComplianceTimelineResponse> getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request);

    CompletableFuture<GetResourceConfigurationTimelineResponse> getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request);

    CompletableFuture<GetSupportedResourceTypesResponse> getSupportedResourceTypes(GetSupportedResourceTypesRequest request);

    CompletableFuture<ListAggregateDiscoveredResourcesResponse> listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request);

    CompletableFuture<ListConfigRulesResponse> listConfigRules(ListConfigRulesRequest request);

    CompletableFuture<ListDiscoveredResourcesResponse> listDiscoveredResources(ListDiscoveredResourcesRequest request);

    CompletableFuture<ListRemediationTemplatesResponse> listRemediationTemplates(ListRemediationTemplatesRequest request);

    CompletableFuture<PutConfigRuleResponse> putConfigRule(PutConfigRuleRequest request);

    CompletableFuture<PutConfigurationRecorderResponse> putConfigurationRecorder(PutConfigurationRecorderRequest request);

    CompletableFuture<PutDeliveryChannelResponse> putDeliveryChannel(PutDeliveryChannelRequest request);

    CompletableFuture<PutEvaluationsResponse> putEvaluations(PutEvaluationsRequest request);

    CompletableFuture<StartConfigRuleEvaluationResponse> startConfigRuleEvaluation(StartConfigRuleEvaluationRequest request);

    CompletableFuture<StartConfigurationRecorderResponse> startConfigurationRecorder(StartConfigurationRecorderRequest request);

    CompletableFuture<StopConfigRulesResponse> stopConfigRules(StopConfigRulesRequest request);

}
