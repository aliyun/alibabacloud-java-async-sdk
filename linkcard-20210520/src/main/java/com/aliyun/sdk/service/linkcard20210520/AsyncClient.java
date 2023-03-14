// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkcard20210520.models.*;
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

    CompletableFuture<AddCardToDirectionalGroupResponse> addCardToDirectionalGroup(AddCardToDirectionalGroupRequest request);

    CompletableFuture<AddDirectionalAddressResponse> addDirectionalAddress(AddDirectionalAddressRequest request);

    CompletableFuture<AddDirectionalCardResponse> addDirectionalCard(AddDirectionalCardRequest request);

    CompletableFuture<AddDirectionalGroupResponse> addDirectionalGroup(AddDirectionalGroupRequest request);

    CompletableFuture<AddTagsToCardResponse> addTagsToCard(AddTagsToCardRequest request);

    CompletableFuture<BatchAddDirectionalAddressResponse> batchAddDirectionalAddress(BatchAddDirectionalAddressRequest request);

    CompletableFuture<DeleteDirectionalAddressResponse> deleteDirectionalAddress(DeleteDirectionalAddressRequest request);

    CompletableFuture<DeleteDirectionalGroupResponse> deleteDirectionalGroup(DeleteDirectionalGroupRequest request);

    CompletableFuture<ForceActivationResponse> forceActivation(ForceActivationRequest request);

    CompletableFuture<GetCardDetailResponse> getCardDetail(GetCardDetailRequest request);

    CompletableFuture<GetCardFlowInfoResponse> getCardFlowInfo(GetCardFlowInfoRequest request);

    CompletableFuture<GetCardLatestFlowResponse> getCardLatestFlow(GetCardLatestFlowRequest request);

    CompletableFuture<GetCardRealStatusResponse> getCardRealStatus(GetCardRealStatusRequest request);

    CompletableFuture<GetCardStatusStatisticsResponse> getCardStatusStatistics(GetCardStatusStatisticsRequest request);

    CompletableFuture<GetCredentialPoolStatisticsResponse> getCredentialPoolStatistics(GetCredentialPoolStatisticsRequest request);

    CompletableFuture<GetOperateResultResponse> getOperateResult(GetOperateResultRequest request);

    CompletableFuture<GetRealNameStatusResponse> getRealNameStatus(GetRealNameStatusRequest request);

    CompletableFuture<GetSimCardStateDistributionResponse> getSimCardStateDistribution(GetSimCardStateDistributionRequest request);

    CompletableFuture<ListCardInfoResponse> listCardInfo(ListCardInfoRequest request);

    CompletableFuture<ListDirectionalAddressResponse> listDirectionalAddress(ListDirectionalAddressRequest request);

    CompletableFuture<ListDirectionalDetailResponse> listDirectionalDetail(ListDirectionalDetailRequest request);

    CompletableFuture<ListOrderResponse> listOrder(ListOrderRequest request);

    CompletableFuture<RebindResumeSingleCardResponse> rebindResumeSingleCard(RebindResumeSingleCardRequest request);

    CompletableFuture<RenewResponse> renew(RenewRequest request);

    CompletableFuture<ResumeSingleCardResponse> resumeSingleCard(ResumeSingleCardRequest request);

    CompletableFuture<SetCardStopRuleResponse> setCardStopRule(SetCardStopRuleRequest request);

    CompletableFuture<StopSingleCardResponse> stopSingleCard(StopSingleCardRequest request);

    CompletableFuture<UpdateAutoRechargeSwitchResponse> updateAutoRechargeSwitch(UpdateAutoRechargeSwitchRequest request);

    CompletableFuture<VerifyIotCardResponse> verifyIotCard(VerifyIotCardRequest request);

}
