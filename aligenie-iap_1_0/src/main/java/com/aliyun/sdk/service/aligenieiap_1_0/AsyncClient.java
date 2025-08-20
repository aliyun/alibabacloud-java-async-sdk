// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aligenieiap_1_0.models.*;
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
     * @param request the request parameters of AppUseTimeReport  AppUseTimeReportRequest
     * @return AppUseTimeReportResponse
     */
    CompletableFuture<AppUseTimeReportResponse> appUseTimeReport(AppUseTimeReportRequest request);

    /**
     * @param request the request parameters of CallBackThirdRightSendPlan  CallBackThirdRightSendPlanRequest
     * @return CallBackThirdRightSendPlanResponse
     */
    CompletableFuture<CallBackThirdRightSendPlanResponse> callBackThirdRightSendPlan(CallBackThirdRightSendPlanRequest request);

    /**
     * @param request the request parameters of CheckThirdRightSendPlan  CheckThirdRightSendPlanRequest
     * @return CheckThirdRightSendPlanResponse
     */
    CompletableFuture<CheckThirdRightSendPlanResponse> checkThirdRightSendPlan(CheckThirdRightSendPlanRequest request);

    /**
     * @param request the request parameters of CreateReminder  CreateReminderRequest
     * @return CreateReminderResponse
     */
    CompletableFuture<CreateReminderResponse> createReminder(CreateReminderRequest request);

    /**
     * @param request the request parameters of DeleteReminder  DeleteReminderRequest
     * @return DeleteReminderResponse
     */
    CompletableFuture<DeleteReminderResponse> deleteReminder(DeleteReminderRequest request);

    /**
     * @param request the request parameters of GetAccountForApp  GetAccountForAppRequest
     * @return GetAccountForAppResponse
     */
    CompletableFuture<GetAccountForAppResponse> getAccountForApp(GetAccountForAppRequest request);

    /**
     * @param request the request parameters of GetBusAppConfig  GetBusAppConfigRequest
     * @return GetBusAppConfigResponse
     */
    CompletableFuture<GetBusAppConfigResponse> getBusAppConfig(GetBusAppConfigRequest request);

    /**
     * @param request the request parameters of GetPhoneNumber  GetPhoneNumberRequest
     * @return GetPhoneNumberResponse
     */
    CompletableFuture<GetPhoneNumberResponse> getPhoneNumber(GetPhoneNumberRequest request);

    /**
     * @param request the request parameters of GetReminder  GetReminderRequest
     * @return GetReminderResponse
     */
    CompletableFuture<GetReminderResponse> getReminder(GetReminderRequest request);

    /**
     * @param request the request parameters of ListReminders  ListRemindersRequest
     * @return ListRemindersResponse
     */
    CompletableFuture<ListRemindersResponse> listReminders(ListRemindersRequest request);

    /**
     * @param request the request parameters of PullCashier  PullCashierRequest
     * @return PullCashierResponse
     */
    CompletableFuture<PullCashierResponse> pullCashier(PullCashierRequest request);

    /**
     * @param request the request parameters of PushNotifications  PushNotificationsRequest
     * @return PushNotificationsResponse
     */
    CompletableFuture<PushNotificationsResponse> pushNotifications(PushNotificationsRequest request);

    /**
     * @param request the request parameters of SendNotifications  SendNotificationsRequest
     * @return SendNotificationsResponse
     */
    CompletableFuture<SendNotificationsResponse> sendNotifications(SendNotificationsRequest request);

    /**
     * @param request the request parameters of ThirdImmediateMsgPush  ThirdImmediateMsgPushRequest
     * @return ThirdImmediateMsgPushResponse
     */
    CompletableFuture<ThirdImmediateMsgPushResponse> thirdImmediateMsgPush(ThirdImmediateMsgPushRequest request);

    /**
     * @param request the request parameters of UpdateReminder  UpdateReminderRequest
     * @return UpdateReminderResponse
     */
    CompletableFuture<UpdateReminderResponse> updateReminder(UpdateReminderRequest request);

    /**
     * @param request the request parameters of VideoAppReport  VideoAppReportRequest
     * @return VideoAppReportResponse
     */
    CompletableFuture<VideoAppReportResponse> videoAppReport(VideoAppReportRequest request);

    /**
     * @param request the request parameters of WakeUpApp  WakeUpAppRequest
     * @return WakeUpAppResponse
     */
    CompletableFuture<WakeUpAppResponse> wakeUpApp(WakeUpAppRequest request);

}
