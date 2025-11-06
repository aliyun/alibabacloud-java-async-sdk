// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.amqp20190901.models.*;
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
     * @param request the request parameters of Bind  BindRequest
     * @return BindResponse
     */
    CompletableFuture<BindResponse> bind(BindRequest request);

    /**
     * @param request the request parameters of CancelUserSetting  CancelUserSettingRequest
     * @return CancelUserSettingResponse
     */
    CompletableFuture<CancelUserSettingResponse> cancelUserSetting(CancelUserSettingRequest request);

    /**
     * @param request the request parameters of ConfigureUserSetting  ConfigureUserSettingRequest
     * @return ConfigureUserSettingResponse
     */
    CompletableFuture<ConfigureUserSettingResponse> configureUserSetting(ConfigureUserSettingRequest request);

    /**
     * @param request the request parameters of ConsoleClearPretendStatus  ConsoleClearPretendStatusRequest
     * @return ConsoleClearPretendStatusResponse
     */
    CompletableFuture<ConsoleClearPretendStatusResponse> consoleClearPretendStatus(ConsoleClearPretendStatusRequest request);

    /**
     * @param request the request parameters of ConsoleSavePretendStatus  ConsoleSavePretendStatusRequest
     * @return ConsoleSavePretendStatusResponse
     */
    CompletableFuture<ConsoleSavePretendStatusResponse> consoleSavePretendStatus(ConsoleSavePretendStatusRequest request);

    /**
     * @param request the request parameters of CreateCloudMonitorSLR  CreateCloudMonitorSLRRequest
     * @return CreateCloudMonitorSLRResponse
     */
    CompletableFuture<CreateCloudMonitorSLRResponse> createCloudMonitorSLR(CreateCloudMonitorSLRRequest request);

    /**
     * @param request the request parameters of CreateExchange  CreateExchangeRequest
     * @return CreateExchangeResponse
     */
    CompletableFuture<CreateExchangeResponse> createExchange(CreateExchangeRequest request);

    /**
     * @param request the request parameters of CreateLogDeliverySLR  CreateLogDeliverySLRRequest
     * @return CreateLogDeliverySLRResponse
     */
    CompletableFuture<CreateLogDeliverySLRResponse> createLogDeliverySLR(CreateLogDeliverySLRRequest request);

    /**
     * @param request the request parameters of CreateQueue  CreateQueueRequest
     * @return CreateQueueResponse
     */
    CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request);

    /**
     * @param request the request parameters of CreateVhost  CreateVhostRequest
     * @return CreateVhostResponse
     */
    CompletableFuture<CreateVhostResponse> createVhost(CreateVhostRequest request);

    /**
     * @param request the request parameters of DashboardCheckServiceStatus  DashboardCheckServiceStatusRequest
     * @return DashboardCheckServiceStatusResponse
     */
    CompletableFuture<DashboardCheckServiceStatusResponse> dashboardCheckServiceStatus(DashboardCheckServiceStatusRequest request);

    /**
     * @param request the request parameters of DashboardList  DashboardListRequest
     * @return DashboardListResponse
     */
    CompletableFuture<DashboardListResponse> dashboardList(DashboardListRequest request);

    /**
     * @param request the request parameters of DeleteExchange  DeleteExchangeRequest
     * @return DeleteExchangeResponse
     */
    CompletableFuture<DeleteExchangeResponse> deleteExchange(DeleteExchangeRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteQueue  DeleteQueueRequest
     * @return DeleteQueueResponse
     */
    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    /**
     * @param request the request parameters of DeleteStaticAccount  DeleteStaticAccountRequest
     * @return DeleteStaticAccountResponse
     */
    CompletableFuture<DeleteStaticAccountResponse> deleteStaticAccount(DeleteStaticAccountRequest request);

    /**
     * @param request the request parameters of DeleteVhost  DeleteVhostRequest
     * @return DeleteVhostResponse
     */
    CompletableFuture<DeleteVhostResponse> deleteVhost(DeleteVhostRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of Export  ExportRequest
     * @return ExportResponse
     */
    CompletableFuture<ExportResponse> export(ExportRequest request);

    /**
     * @param request the request parameters of FetchStaticAccount  FetchStaticAccountRequest
     * @return FetchStaticAccountResponse
     */
    CompletableFuture<FetchStaticAccountResponse> fetchStaticAccount(FetchStaticAccountRequest request);

    /**
     * @param request the request parameters of GetAckInfoByInterval  GetAckInfoByIntervalRequest
     * @return GetAckInfoByIntervalResponse
     */
    CompletableFuture<GetAckInfoByIntervalResponse> getAckInfoByInterval(GetAckInfoByIntervalRequest request);

    /**
     * @param request the request parameters of GetAckInfoOfMessage  GetAckInfoOfMessageRequest
     * @return GetAckInfoOfMessageResponse
     */
    CompletableFuture<GetAckInfoOfMessageResponse> getAckInfoOfMessage(GetAckInfoOfMessageRequest request);

    /**
     * @param request the request parameters of GetBindingCount  GetBindingCountRequest
     * @return GetBindingCountResponse
     */
    CompletableFuture<GetBindingCountResponse> getBindingCount(GetBindingCountRequest request);

    /**
     * @param request the request parameters of GetBindingErrorByTaskId  GetBindingErrorByTaskIdRequest
     * @return GetBindingErrorByTaskIdResponse
     */
    CompletableFuture<GetBindingErrorByTaskIdResponse> getBindingErrorByTaskId(GetBindingErrorByTaskIdRequest request);

    /**
     * @param request the request parameters of GetCommonBuyUrl  GetCommonBuyUrlRequest
     * @return GetCommonBuyUrlResponse
     */
    CompletableFuture<GetCommonBuyUrlResponse> getCommonBuyUrl(GetCommonBuyUrlRequest request);

    /**
     * @param request the request parameters of GetConsumeTraceByQueueAndRocketMqMsgId  GetConsumeTraceByQueueAndRocketMqMsgIdRequest
     * @return GetConsumeTraceByQueueAndRocketMqMsgIdResponse
     */
    CompletableFuture<GetConsumeTraceByQueueAndRocketMqMsgIdResponse> getConsumeTraceByQueueAndRocketMqMsgId(GetConsumeTraceByQueueAndRocketMqMsgIdRequest request);

    /**
     * @param request the request parameters of GetExchangeErrorByTaskId  GetExchangeErrorByTaskIdRequest
     * @return GetExchangeErrorByTaskIdResponse
     */
    CompletableFuture<GetExchangeErrorByTaskIdResponse> getExchangeErrorByTaskId(GetExchangeErrorByTaskIdRequest request);

    /**
     * @param request the request parameters of GetExchangeRate  GetExchangeRateRequest
     * @return GetExchangeRateResponse
     */
    CompletableFuture<GetExchangeRateResponse> getExchangeRate(GetExchangeRateRequest request);

    /**
     * @param request the request parameters of GetMsgIdListByQueue  GetMsgIdListByQueueRequest
     * @return GetMsgIdListByQueueResponse
     */
    CompletableFuture<GetMsgIdListByQueueResponse> getMsgIdListByQueue(GetMsgIdListByQueueRequest request);

    /**
     * @param request the request parameters of GetQueueConsumers  GetQueueConsumersRequest
     * @return GetQueueConsumersResponse
     */
    CompletableFuture<GetQueueConsumersResponse> getQueueConsumers(GetQueueConsumersRequest request);

    /**
     * @param request the request parameters of GetQueueErrorByTaskId  GetQueueErrorByTaskIdRequest
     * @return GetQueueErrorByTaskIdResponse
     */
    CompletableFuture<GetQueueErrorByTaskIdResponse> getQueueErrorByTaskId(GetQueueErrorByTaskIdRequest request);

    /**
     * @param request the request parameters of GetQueueRate  GetQueueRateRequest
     * @return GetQueueRateResponse
     */
    CompletableFuture<GetQueueRateResponse> getQueueRate(GetQueueRateRequest request);

    /**
     * @param request the request parameters of GetSendTraceByConnectionAndChannelAndDeliveryTag  GetSendTraceByConnectionAndChannelAndDeliveryTagRequest
     * @return GetSendTraceByConnectionAndChannelAndDeliveryTagResponse
     */
    CompletableFuture<GetSendTraceByConnectionAndChannelAndDeliveryTagResponse> getSendTraceByConnectionAndChannelAndDeliveryTag(GetSendTraceByConnectionAndChannelAndDeliveryTagRequest request);

    /**
     * @param request the request parameters of GetSendTraceByMsgId  GetSendTraceByMsgIdRequest
     * @return GetSendTraceByMsgIdResponse
     */
    CompletableFuture<GetSendTraceByMsgIdResponse> getSendTraceByMsgId(GetSendTraceByMsgIdRequest request);

    /**
     * @param request the request parameters of GetSendTraceByQueue  GetSendTraceByQueueRequest
     * @return GetSendTraceByQueueResponse
     */
    CompletableFuture<GetSendTraceByQueueResponse> getSendTraceByQueue(GetSendTraceByQueueRequest request);

    /**
     * @param request the request parameters of GetStatisticsByVhost  GetStatisticsByVhostRequest
     * @return GetStatisticsByVhostResponse
     */
    CompletableFuture<GetStatisticsByVhostResponse> getStatisticsByVhost(GetStatisticsByVhostRequest request);

    /**
     * @param request the request parameters of GetTaskByUid  GetTaskByUidRequest
     * @return GetTaskByUidResponse
     */
    CompletableFuture<GetTaskByUidResponse> getTaskByUid(GetTaskByUidRequest request);

    /**
     * @param request the request parameters of GetTpsByTime  GetTpsByTimeRequest
     * @return GetTpsByTimeResponse
     */
    CompletableFuture<GetTpsByTimeResponse> getTpsByTime(GetTpsByTimeRequest request);

    /**
     * @param request the request parameters of GetUserSetting  GetUserSettingRequest
     * @return GetUserSettingResponse
     */
    CompletableFuture<GetUserSettingResponse> getUserSetting(GetUserSettingRequest request);

    /**
     * @param request the request parameters of GetVhostErrorByTaskId  GetVhostErrorByTaskIdRequest
     * @return GetVhostErrorByTaskIdResponse
     */
    CompletableFuture<GetVhostErrorByTaskIdResponse> getVhostErrorByTaskId(GetVhostErrorByTaskIdRequest request);

    /**
     * @param request the request parameters of GetVhostRate  GetVhostRateRequest
     * @return GetVhostRateResponse
     */
    CompletableFuture<GetVhostRateResponse> getVhostRate(GetVhostRateRequest request);

    /**
     * @param request the request parameters of ImportDefinitionAsynchronous  ImportDefinitionAsynchronousRequest
     * @return ImportDefinitionAsynchronousResponse
     */
    CompletableFuture<ImportDefinitionAsynchronousResponse> importDefinitionAsynchronous(ImportDefinitionAsynchronousRequest request);

    /**
     * @param request the request parameters of InstancePreivew  InstancePreivewRequest
     * @return InstancePreivewResponse
     */
    CompletableFuture<InstancePreivewResponse> instancePreivew(InstancePreivewRequest request);

    /**
     * @param request the request parameters of ListExchange  ListExchangeRequest
     * @return ListExchangeResponse
     */
    CompletableFuture<ListExchangeResponse> listExchange(ListExchangeRequest request);

    /**
     * @param request the request parameters of ListExchangeDownstreamBindings  ListExchangeDownstreamBindingsRequest
     * @return ListExchangeDownstreamBindingsResponse
     */
    CompletableFuture<ListExchangeDownstreamBindingsResponse> listExchangeDownstreamBindings(ListExchangeDownstreamBindingsRequest request);

    /**
     * @param request the request parameters of ListExchangeUpstreamBindings  ListExchangeUpstreamBindingsRequest
     * @return ListExchangeUpstreamBindingsResponse
     */
    CompletableFuture<ListExchangeUpstreamBindingsResponse> listExchangeUpstreamBindings(ListExchangeUpstreamBindingsRequest request);

    /**
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    /**
     * @param request the request parameters of ListInstanceAlarm  ListInstanceAlarmRequest
     * @return ListInstanceAlarmResponse
     */
    CompletableFuture<ListInstanceAlarmResponse> listInstanceAlarm(ListInstanceAlarmRequest request);

    /**
     * @param request the request parameters of ListLogstore  ListLogstoreRequest
     * @return ListLogstoreResponse
     */
    CompletableFuture<ListLogstoreResponse> listLogstore(ListLogstoreRequest request);

    /**
     * @param request the request parameters of ListProject  ListProjectRequest
     * @return ListProjectResponse
     */
    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    /**
     * @param request the request parameters of ListQueue  ListQueueRequest
     * @return ListQueueResponse
     */
    CompletableFuture<ListQueueResponse> listQueue(ListQueueRequest request);

    /**
     * @param request the request parameters of ListQueueUpstreamBindings  ListQueueUpstreamBindingsRequest
     * @return ListQueueUpstreamBindingsResponse
     */
    CompletableFuture<ListQueueUpstreamBindingsResponse> listQueueUpstreamBindings(ListQueueUpstreamBindingsRequest request);

    /**
     * @param request the request parameters of ListStaticAccounts  ListStaticAccountsRequest
     * @return ListStaticAccountsResponse
     */
    CompletableFuture<ListStaticAccountsResponse> listStaticAccounts(ListStaticAccountsRequest request);

    /**
     * @param request the request parameters of ListVhost  ListVhostRequest
     * @return ListVhostResponse
     */
    CompletableFuture<ListVhostResponse> listVhost(ListVhostRequest request);

    /**
     * @param request the request parameters of Metadata  MetadataRequest
     * @return MetadataResponse
     */
    CompletableFuture<MetadataResponse> metadata(MetadataRequest request);

    /**
     * @param request the request parameters of PurgeQueue  PurgeQueueRequest
     * @return PurgeQueueResponse
     */
    CompletableFuture<PurgeQueueResponse> purgeQueue(PurgeQueueRequest request);

    /**
     * @param request the request parameters of QueryMessageByMessageId  QueryMessageByMessageIdRequest
     * @return QueryMessageByMessageIdResponse
     */
    CompletableFuture<QueryMessageByMessageIdResponse> queryMessageByMessageId(QueryMessageByMessageIdRequest request);

    /**
     * @param request the request parameters of QueryMessageByQueueName  QueryMessageByQueueNameRequest
     * @return QueryMessageByQueueNameResponse
     */
    CompletableFuture<QueryMessageByQueueNameResponse> queryMessageByQueueName(QueryMessageByQueueNameRequest request);

    /**
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * @param request the request parameters of SendMessage  SendMessageRequest
     * @return SendMessageResponse
     */
    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

    /**
     * @param request the request parameters of SendMessageCopy  SendMessageCopyRequest
     * @return SendMessageCopyResponse
     */
    CompletableFuture<SendMessageCopyResponse> sendMessageCopy(SendMessageCopyRequest request);

    /**
     * @param request the request parameters of Unbind  UnbindRequest
     * @return UnbindResponse
     */
    CompletableFuture<UnbindResponse> unbind(UnbindRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateInstanceRetryStrategy  UpdateInstanceRetryStrategyRequest
     * @return UpdateInstanceRetryStrategyResponse
     */
    CompletableFuture<UpdateInstanceRetryStrategyResponse> updateInstanceRetryStrategy(UpdateInstanceRetryStrategyRequest request);

    /**
     * @param request the request parameters of UpdateServerlessSwitch  UpdateServerlessSwitchRequest
     * @return UpdateServerlessSwitchResponse
     */
    CompletableFuture<UpdateServerlessSwitchResponse> updateServerlessSwitch(UpdateServerlessSwitchRequest request);

    /**
     * @param request the request parameters of UpgradeLimits  UpgradeLimitsRequest
     * @return UpgradeLimitsResponse
     */
    CompletableFuture<UpgradeLimitsResponse> upgradeLimits(UpgradeLimitsRequest request);

}
