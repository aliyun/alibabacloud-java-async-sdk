// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cs20180418.models.*;
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

    CompletableFuture<CallbackClusterTokenResponse> callbackClusterToken(CallbackClusterTokenRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateClusterTokenResponse> createClusterToken(CreateClusterTokenRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteClusterNodeResponse> deleteClusterNode(DeleteClusterNodeRequest request);

    CompletableFuture<DescribeAgilityTunnelAgentInfoResponse> describeAgilityTunnelAgentInfo(DescribeAgilityTunnelAgentInfoRequest request);

    CompletableFuture<DescribeAgilityTunnelCertsResponse> describeAgilityTunnelCerts(DescribeAgilityTunnelCertsRequest request);

    CompletableFuture<DescribeApiVersionResponse> describeApiVersion(DescribeApiVersionRequest request);

    CompletableFuture<DescribeClusterCertsResponse> describeClusterCerts(DescribeClusterCertsRequest request);

    CompletableFuture<DescribeClusterDetailResponse> describeClusterDetail(DescribeClusterDetailRequest request);

    CompletableFuture<DescribeClusterHostsResponse> describeClusterHosts(DescribeClusterHostsRequest request);

    CompletableFuture<DescribeClusterLogsResponse> describeClusterLogs(DescribeClusterLogsRequest request);

    CompletableFuture<DescribeClusterNodeInfoResponse> describeClusterNodeInfo(DescribeClusterNodeInfoRequest request);

    CompletableFuture<DescribeClusterNodeInfoWithInstanceResponse> describeClusterNodeInfoWithInstance(DescribeClusterNodeInfoWithInstanceRequest request);

    CompletableFuture<DescribeClusterNodesResponse> describeClusterNodes(DescribeClusterNodesRequest request);

    CompletableFuture<DescribeClusterScaledNodeResponse> describeClusterScaledNode(DescribeClusterScaledNodeRequest request);

    CompletableFuture<DescribeClusterServicesResponse> describeClusterServices(DescribeClusterServicesRequest request);

    CompletableFuture<DescribeClusterTokensResponse> describeClusterTokens(DescribeClusterTokensRequest request);

    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    CompletableFuture<DescribeKubernetesTemplateResponse> describeKubernetesTemplate(DescribeKubernetesTemplateRequest request);

    CompletableFuture<DescribeKubernetesTemplatesResponse> describeKubernetesTemplates(DescribeKubernetesTemplatesRequest request);

    CompletableFuture<DescribeServiceContainersResponse> describeServiceContainers(DescribeServiceContainersRequest request);

    CompletableFuture<DescribeTaskInfoResponse> describeTaskInfo(DescribeTaskInfoRequest request);

    CompletableFuture<DescribeTemplateAttributeResponse> describeTemplateAttribute(DescribeTemplateAttributeRequest request);

    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    CompletableFuture<DescribeUserContainersResponse> describeUserContainers(DescribeUserContainersRequest request);

    CompletableFuture<DownloadClusterNodeCertsResponse> downloadClusterNodeCerts(DownloadClusterNodeCertsRequest request);

    CompletableFuture<GatherLogsTokenResponse> gatherLogsToken(GatherLogsTokenRequest request);

    CompletableFuture<GetClusterProjectsResponse> getClusterProjects(GetClusterProjectsRequest request);

    CompletableFuture<GetProjectEventsResponse> getProjectEvents(GetProjectEventsRequest request);

    CompletableFuture<GetTriggerHookResponse> getTriggerHook(GetTriggerHookRequest request);

}
