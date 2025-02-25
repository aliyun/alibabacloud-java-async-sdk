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

    CompletableFuture<AppUseTimeReportResponse> appUseTimeReport(AppUseTimeReportRequest request);

    CompletableFuture<CallBackThirdRightSendPlanResponse> callBackThirdRightSendPlan(CallBackThirdRightSendPlanRequest request);

    CompletableFuture<CheckThirdRightSendPlanResponse> checkThirdRightSendPlan(CheckThirdRightSendPlanRequest request);

    CompletableFuture<CreateReminderResponse> createReminder(CreateReminderRequest request);

    CompletableFuture<DeleteReminderResponse> deleteReminder(DeleteReminderRequest request);

    CompletableFuture<GetAccountForAppResponse> getAccountForApp(GetAccountForAppRequest request);

    CompletableFuture<GetBusAppConfigResponse> getBusAppConfig(GetBusAppConfigRequest request);

    CompletableFuture<GetPhoneNumberResponse> getPhoneNumber(GetPhoneNumberRequest request);

    CompletableFuture<GetReminderResponse> getReminder(GetReminderRequest request);

    CompletableFuture<ListRemindersResponse> listReminders(ListRemindersRequest request);

    CompletableFuture<PullCashierResponse> pullCashier(PullCashierRequest request);

    CompletableFuture<PushNotificationsResponse> pushNotifications(PushNotificationsRequest request);

    CompletableFuture<SendNotificationsResponse> sendNotifications(SendNotificationsRequest request);

    CompletableFuture<UpdateReminderResponse> updateReminder(UpdateReminderRequest request);

    CompletableFuture<VideoAppReportResponse> videoAppReport(VideoAppReportRequest request);

    CompletableFuture<WakeUpAppResponse> wakeUpApp(WakeUpAppRequest request);

}
