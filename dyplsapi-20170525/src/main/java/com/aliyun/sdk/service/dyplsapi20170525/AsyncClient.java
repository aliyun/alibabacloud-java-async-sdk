// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dyplsapi20170525.models.*;
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

    CompletableFuture<AddAxnTrackNoResponse> addAxnTrackNo(AddAxnTrackNoRequest request);

    CompletableFuture<AddSecretBlacklistResponse> addSecretBlacklist(AddSecretBlacklistRequest request);

    CompletableFuture<BindAxbResponse> bindAxb(BindAxbRequest request);

    CompletableFuture<BindAxgResponse> bindAxg(BindAxgRequest request);

    CompletableFuture<BindAxnResponse> bindAxn(BindAxnRequest request);

    CompletableFuture<BindAxnExtensionResponse> bindAxnExtension(BindAxnExtensionRequest request);

    CompletableFuture<BuySecretNoResponse> buySecretNo(BuySecretNoRequest request);

    CompletableFuture<CancelPickUpWaybillResponse> cancelPickUpWaybill(CancelPickUpWaybillRequest request);

    CompletableFuture<ConfirmSendSmsResponse> confirmSendSms(ConfirmSendSmsRequest request);

    CompletableFuture<CreateAxgGroupResponse> createAxgGroup(CreateAxgGroupRequest request);

    CompletableFuture<CreatePickUpWaybillResponse> createPickUpWaybill(CreatePickUpWaybillRequest request);

    CompletableFuture<DeleteSecretBlacklistResponse> deleteSecretBlacklist(DeleteSecretBlacklistRequest request);

    CompletableFuture<GetSecretAsrDetailResponse> getSecretAsrDetail(GetSecretAsrDetailRequest request);

    CompletableFuture<GetSubscriptionDetailResponse> getSubscriptionDetail(GetSubscriptionDetailRequest request);

    CompletableFuture<GetTotalPublicUrlResponse> getTotalPublicUrl(GetTotalPublicUrlRequest request);

    CompletableFuture<LockSecretNoResponse> lockSecretNo(LockSecretNoRequest request);

    CompletableFuture<OperateAxgGroupResponse> operateAxgGroup(OperateAxgGroupRequest request);

    CompletableFuture<OperateBlackNoResponse> operateBlackNo(OperateBlackNoRequest request);

    CompletableFuture<QueryCallStatusResponse> queryCallStatus(QueryCallStatusRequest request);

    CompletableFuture<QueryPhoneNoAByTrackNoResponse> queryPhoneNoAByTrackNo(QueryPhoneNoAByTrackNoRequest request);

    CompletableFuture<QueryRecordFileDownloadUrlResponse> queryRecordFileDownloadUrl(QueryRecordFileDownloadUrlRequest request);

    CompletableFuture<QuerySecretNoDetailResponse> querySecretNoDetail(QuerySecretNoDetailRequest request);

    CompletableFuture<QuerySecretNoRemainResponse> querySecretNoRemain(QuerySecretNoRemainRequest request);

    CompletableFuture<QuerySubsIdResponse> querySubsId(QuerySubsIdRequest request);

    CompletableFuture<QuerySubscriptionDetailResponse> querySubscriptionDetail(QuerySubscriptionDetailRequest request);

    CompletableFuture<ReleaseSecretNoResponse> releaseSecretNo(ReleaseSecretNoRequest request);

    CompletableFuture<UnbindSubscriptionResponse> unbindSubscription(UnbindSubscriptionRequest request);

    CompletableFuture<UnlockSecretNoResponse> unlockSecretNo(UnlockSecretNoRequest request);

    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

}
