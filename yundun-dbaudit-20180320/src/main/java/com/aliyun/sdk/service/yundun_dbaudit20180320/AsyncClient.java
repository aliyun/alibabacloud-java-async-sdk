// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yundun_dbaudit20180320.models.*;
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
     * @param request the request parameters of ConfigInstanceNetwork  ConfigInstanceNetworkRequest
     * @return ConfigInstanceNetworkResponse
     */
    CompletableFuture<ConfigInstanceNetworkResponse> configInstanceNetwork(ConfigInstanceNetworkRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAttribute  DescribeInstanceAttributeRequest
     * @return DescribeInstanceAttributeResponse
     */
    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeLoginTicket  DescribeLoginTicketRequest
     * @return DescribeLoginTicketResponse
     */
    CompletableFuture<DescribeLoginTicketResponse> describeLoginTicket(DescribeLoginTicketRequest request);

    /**
     * @param request the request parameters of DescribeSyncInfo  DescribeSyncInfoRequest
     * @return DescribeSyncInfoResponse
     */
    CompletableFuture<DescribeSyncInfoResponse> describeSyncInfo(DescribeSyncInfoRequest request);

    /**
     * @param request the request parameters of GetAgentList  GetAgentListRequest
     * @return GetAgentListResponse
     */
    CompletableFuture<GetAgentListResponse> getAgentList(GetAgentListRequest request);

    /**
     * @param request the request parameters of GetAuditCount  GetAuditCountRequest
     * @return GetAuditCountResponse
     */
    CompletableFuture<GetAuditCountResponse> getAuditCount(GetAuditCountRequest request);

    /**
     * @param request the request parameters of GetAuditCountDistribution  GetAuditCountDistributionRequest
     * @return GetAuditCountDistributionResponse
     */
    CompletableFuture<GetAuditCountDistributionResponse> getAuditCountDistribution(GetAuditCountDistributionRequest request);

    /**
     * @param request the request parameters of GetDBAuditCountList  GetDBAuditCountListRequest
     * @return GetDBAuditCountListResponse
     */
    CompletableFuture<GetDBAuditCountListResponse> getDBAuditCountList(GetDBAuditCountListRequest request);

    /**
     * @param request the request parameters of GetLogDetail  GetLogDetailRequest
     * @return GetLogDetailResponse
     */
    CompletableFuture<GetLogDetailResponse> getLogDetail(GetLogDetailRequest request);

    /**
     * @param request the request parameters of GetLogList  GetLogListRequest
     * @return GetLogListResponse
     */
    CompletableFuture<GetLogListResponse> getLogList(GetLogListRequest request);

    /**
     * @param request the request parameters of GetLogTypeDistribution  GetLogTypeDistributionRequest
     * @return GetLogTypeDistributionResponse
     */
    CompletableFuture<GetLogTypeDistributionResponse> getLogTypeDistribution(GetLogTypeDistributionRequest request);

    /**
     * @param request the request parameters of GetRiskLevelDistribution  GetRiskLevelDistributionRequest
     * @return GetRiskLevelDistributionResponse
     */
    CompletableFuture<GetRiskLevelDistributionResponse> getRiskLevelDistribution(GetRiskLevelDistributionRequest request);

    /**
     * @param request the request parameters of GetSessionDistribution  GetSessionDistributionRequest
     * @return GetSessionDistributionResponse
     */
    CompletableFuture<GetSessionDistributionResponse> getSessionDistribution(GetSessionDistributionRequest request);

    /**
     * @param request the request parameters of GetSessionList  GetSessionListRequest
     * @return GetSessionListResponse
     */
    CompletableFuture<GetSessionListResponse> getSessionList(GetSessionListRequest request);

    /**
     * @param request the request parameters of ListDataSourceAttribute  ListDataSourceAttributeRequest
     * @return ListDataSourceAttributeResponse
     */
    CompletableFuture<ListDataSourceAttributeResponse> listDataSourceAttribute(ListDataSourceAttributeRequest request);

    /**
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * @param request the request parameters of ListSystemAlarms  ListSystemAlarmsRequest
     * @return ListSystemAlarmsResponse
     */
    CompletableFuture<ListSystemAlarmsResponse> listSystemAlarms(ListSystemAlarmsRequest request);

    /**
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

}
