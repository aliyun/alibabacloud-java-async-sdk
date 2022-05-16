// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paiplugin20220112.models.*;
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
     * 注册运营活动。
     */
    CompletableFuture<CreateCampaignResponse> createCampaign(CreateCampaignRequest request);

    /**
     * 注册人群。
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * 注册预测任务。
     */
    CompletableFuture<CreateInferenceJobResponse> createInferenceJob(CreateInferenceJobRequest request);

    /**
     * 注册触达计划。
     */
    CompletableFuture<CreateScheduleResponse> createSchedule(CreateScheduleRequest request);

    /**
     * 注册签名。
    
     */
    CompletableFuture<CreateSignatureResponse> createSignature(CreateSignatureRequest request);

    /**
     * 注册模板。
    
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * 注册训练任务。
    
     */
    CompletableFuture<CreateTrainingJobResponse> createTrainingJob(CreateTrainingJobRequest request);

    /**
     * 删除运营活动
    
     */
    CompletableFuture<DeleteCampaignResponse> deleteCampaign(DeleteCampaignRequest request);

    /**
     * 删除人群
    
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * 删除预测任务。
     */
    CompletableFuture<DeleteInferenceJobResponse> deleteInferenceJob(DeleteInferenceJobRequest request);

    /**
     * 删除触达计划。
    
     */
    CompletableFuture<DeleteScheduleResponse> deleteSchedule(DeleteScheduleRequest request);

    /**
     * 删除签名。
    
     */
    CompletableFuture<DeleteSignatureResponse> deleteSignature(DeleteSignatureRequest request);

    /**
     * 删除模板
    
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * 删除训练任务。
     */
    CompletableFuture<DeleteTrainingJobResponse> deleteTrainingJob(DeleteTrainingJobRequest request);

    /**
     * 获取算法详情。
     */
    CompletableFuture<GetAlgorithmResponse> getAlgorithm(GetAlgorithmRequest request);

    /**
     * 获取运营活动详情。
     */
    CompletableFuture<GetCampaignResponse> getCampaign(GetCampaignRequest request);

    /**
     * 获取人群详情。
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * 获取预测任务详情。
     */
    CompletableFuture<GetInferenceJobResponse> getInferenceJob(GetInferenceJobRequest request);

    /**
     * 获取短信配置。
     */
    CompletableFuture<GetMessageConfigResponse> getMessageConfig(GetMessageConfigRequest request);

    /**
     * 获取触达计划详情。
     */
    CompletableFuture<GetScheduleResponse> getSchedule(GetScheduleRequest request);

    /**
     * 获取签名详情。
     */
    CompletableFuture<GetSignatureResponse> getSignature(GetSignatureRequest request);

    /**
     * 获取模板详情。
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * 获取训练任务详情。
     */
    CompletableFuture<GetTrainingJobResponse> getTrainingJob(GetTrainingJobRequest request);

    /**
     * 获取账号状态。
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * 获取算法列表。
     */
    CompletableFuture<ListAlgorithmsResponse> listAlgorithms(ListAlgorithmsRequest request);

    /**
     * 获取运营活动列表。
     */
    CompletableFuture<ListCampaignsResponse> listCampaigns(ListCampaignsRequest request);

    /**
     * 获取人群列表。
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * 获取预测任务列表。
     */
    CompletableFuture<ListInferenceJobsResponse> listInferenceJobs(ListInferenceJobsRequest request);

    /**
     * 获取短信发送统计列表。
    获取短信发送统计数据，可按指定条件获取分类别详细数据，返回数据按日期顺序排列，发送统计为空的日期默认不返回。
    发送数据在48小时内会随实际短信发送状态不断更新，最终数据以48小时后数据为准。
     */
    CompletableFuture<ListMessageMetricsResponse> listMessageMetrics(ListMessageMetricsRequest request);

    /**
     * 查询短信发送详情列表。
     */
    CompletableFuture<ListMessagesResponse> listMessages(ListMessagesRequest request);

    /**
     * 获取触达计划列表。
     */
    CompletableFuture<ListSchedulesResponse> listSchedules(ListSchedulesRequest request);

    /**
     * 获取签名列表。
     */
    CompletableFuture<ListSignaturesResponse> listSignatures(ListSignaturesRequest request);

    /**
     * 获取模板列表。
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * 获取训练任务列表。
     */
    CompletableFuture<ListTrainingJobsResponse> listTrainingJobs(ListTrainingJobsRequest request);

    /**
     * 发送短信。
     */
    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

    /**
     * 短信回执。
     */
    CompletableFuture<SmsReportResponse> smsReport(SmsReportRequest request);

    /**
     * 短信上行。
     */
    CompletableFuture<SmsUpResponse> smsUp(SmsUpRequest request);

    /**
     * 更新运营活动
     */
    CompletableFuture<UpdateCampaignResponse> updateCampaign(UpdateCampaignRequest request);

    /**
     * 更新回执Url。
    
     */
    CompletableFuture<UpdateReportUrlResponse> updateReportUrl(UpdateReportUrlRequest request);

    /**
     * 更新上行Url。
     */
    CompletableFuture<UpdateUploadUrlResponse> updateUploadUrl(UpdateUploadUrlRequest request);

}
