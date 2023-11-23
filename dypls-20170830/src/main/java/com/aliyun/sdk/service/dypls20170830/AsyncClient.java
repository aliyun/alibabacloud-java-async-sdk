// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dypls20170830.models.*;
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

    CompletableFuture<ApplyArInvoiceWithSourceResponse> applyArInvoiceWithSource(ApplyArInvoiceWithSourceRequest request);

    CompletableFuture<ApplyBlackInfoExportResponse> applyBlackInfoExport(ApplyBlackInfoExportRequest request);

    CompletableFuture<ApplyCallRecordExportResponse> applyCallRecordExport(ApplyCallRecordExportRequest request);

    CompletableFuture<ApplyGroupNumberExportResponse> applyGroupNumberExport(ApplyGroupNumberExportRequest request);

    CompletableFuture<ApplyRingToneResponse> applyRingTone(ApplyRingToneRequest request);

    CompletableFuture<BatchOccupySecretResResponse> batchOccupySecretRes(BatchOccupySecretResRequest request);

    CompletableFuture<BindResourceResponse> bindResource(BindResourceRequest request);

    CompletableFuture<BlackOperateResponse> blackOperate(BlackOperateRequest request);

    CompletableFuture<CreateCertifyInfoResponse> createCertifyInfo(CreateCertifyInfoRequest request);

    CompletableFuture<CreateContactsResponse> createContacts(CreateContactsRequest request);

    CompletableFuture<CreateGroupDetailResponse> createGroupDetail(CreateGroupDetailRequest request);

    CompletableFuture<CreateGroupInfoResponse> createGroupInfo(CreateGroupInfoRequest request);

    CompletableFuture<CreateLogicalDeleteResponse> createLogicalDelete(CreateLogicalDeleteRequest request);

    CompletableFuture<CreateMessageCallbackResponse> createMessageCallback(CreateMessageCallbackRequest request);

    CompletableFuture<CreateMessageQueueResponse> createMessageQueue(CreateMessageQueueRequest request);

    CompletableFuture<CreatePhysicalDeleteResponse> createPhysicalDelete(CreatePhysicalDeleteRequest request);

    CompletableFuture<CreatePoolInfoResponse> createPoolInfo(CreatePoolInfoRequest request);

    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    CompletableFuture<CreateRingToneResponse> createRingTone(CreateRingToneRequest request);

    CompletableFuture<CreateSubsTrialResponse> createSubsTrial(CreateSubsTrialRequest request);

    CompletableFuture<CreateTransferRecordResponse> createTransferRecord(CreateTransferRecordRequest request);

    CompletableFuture<DeleteCertifyInfoResponse> deleteCertifyInfo(DeleteCertifyInfoRequest request);

    CompletableFuture<DeleteContactsResponse> deleteContacts(DeleteContactsRequest request);

    CompletableFuture<DeleteGroupDetailResponse> deleteGroupDetail(DeleteGroupDetailRequest request);

    CompletableFuture<DeleteMessageCallbackResponse> deleteMessageCallback(DeleteMessageCallbackRequest request);

    CompletableFuture<DeleteRingToneResponse> deleteRingTone(DeleteRingToneRequest request);

    CompletableFuture<DownloadCompleteResponse> downloadComplete(DownloadCompleteRequest request);

    CompletableFuture<ExportResResponse> exportRes(ExportResRequest request);

    CompletableFuture<GetEinvoicePdfDataResponse> getEinvoicePdfData(GetEinvoicePdfDataRequest request);

    CompletableFuture<GetSecretAsrInfoResponse> getSecretAsrInfo(GetSecretAsrInfoRequest request);

    CompletableFuture<GetUserResourceTagStatusResponse> getUserResourceTagStatus(GetUserResourceTagStatusRequest request);

    CompletableFuture<ListAsrLanguageModelsResponse> listAsrLanguageModels(ListAsrLanguageModelsRequest request);

    CompletableFuture<LockResourceResponse> lockResource(LockResourceRequest request);

    CompletableFuture<OccupySecretResResponse> occupySecretRes(OccupySecretResRequest request);

    CompletableFuture<OrderSucceededCallbackResponse> orderSucceededCallback(OrderSucceededCallbackRequest request);

    CompletableFuture<PoolConfigResponse> poolConfig(PoolConfigRequest request);

    CompletableFuture<PurchaseResourcesResponse> purchaseResources(PurchaseResourcesRequest request);

    CompletableFuture<QueryBindingDetailsResponse> queryBindingDetails(QueryBindingDetailsRequest request);

    CompletableFuture<QueryBlackListResponse> queryBlackList(QueryBlackListRequest request);

    CompletableFuture<QueryBuyPageInitDataResponse> queryBuyPageInitData(QueryBuyPageInitDataRequest request);

    CompletableFuture<QueryBuyPageResCountResponse> queryBuyPageResCount(QueryBuyPageResCountRequest request);

    CompletableFuture<QueryBuyPageResInfoResponse> queryBuyPageResInfo(QueryBuyPageResInfoRequest request);

    CompletableFuture<QueryBuyResInfoResponse> queryBuyResInfo(QueryBuyResInfoRequest request);

    CompletableFuture<QueryCallRecordingListResponse> queryCallRecordingList(QueryCallRecordingListRequest request);

    CompletableFuture<QueryCertifyInfoListResponse> queryCertifyInfoList(QueryCertifyInfoListRequest request);

    CompletableFuture<QueryCertifyOverviewInfoResponse> queryCertifyOverviewInfo(QueryCertifyOverviewInfoRequest request);

    CompletableFuture<QueryContactsListResponse> queryContactsList(QueryContactsListRequest request);

    CompletableFuture<QueryCustInfoResponse> queryCustInfo(QueryCustInfoRequest request);

    CompletableFuture<QueryDownloadUrlResponse> queryDownloadUrl(QueryDownloadUrlRequest request);

    CompletableFuture<QueryEffectiveInvoiceListByBillNosResponse> queryEffectiveInvoiceListByBillNos(QueryEffectiveInvoiceListByBillNosRequest request);

    CompletableFuture<QueryExportResUrlResponse> queryExportResUrl(QueryExportResUrlRequest request);

    CompletableFuture<QueryGroupDetailListResponse> queryGroupDetailList(QueryGroupDetailListRequest request);

    CompletableFuture<QueryGroupInfoListResponse> queryGroupInfoList(QueryGroupInfoListRequest request);

    CompletableFuture<QueryInvoiceInfoByRequestNoResponse> queryInvoiceInfoByRequestNo(QueryInvoiceInfoByRequestNoRequest request);

    CompletableFuture<QueryMessageCallbackInfoResponse> queryMessageCallbackInfo(QueryMessageCallbackInfoRequest request);

    CompletableFuture<QueryMessageQueueListResponse> queryMessageQueueList(QueryMessageQueueListRequest request);

    CompletableFuture<QueryMonthlyBillInfoResponse> queryMonthlyBillInfo(QueryMonthlyBillInfoRequest request);

    CompletableFuture<QueryMonthlyStatisticsInfoResponse> queryMonthlyStatisticsInfo(QueryMonthlyStatisticsInfoRequest request);

    CompletableFuture<QueryNoBuyTasksResponse> queryNoBuyTasks(QueryNoBuyTasksRequest request);

    CompletableFuture<QueryNoDistributeResponse> queryNoDistribute(QueryNoDistributeRequest request);

    CompletableFuture<QueryOpenStatusResponse> queryOpenStatus(QueryOpenStatusRequest request);

    CompletableFuture<QueryPackageDetailResponse> queryPackageDetail(QueryPackageDetailRequest request);

    CompletableFuture<QueryPackageListResponse> queryPackageList(QueryPackageListRequest request);

    CompletableFuture<QueryPackageStatisticsResponse> queryPackageStatistics(QueryPackageStatisticsRequest request);

    CompletableFuture<QueryPoolCityListResponse> queryPoolCityList(QueryPoolCityListRequest request);

    CompletableFuture<QueryPoolInfoListResponse> queryPoolInfoList(QueryPoolInfoListRequest request);

    CompletableFuture<QueryPoolMonthlyBillInfoResponse> queryPoolMonthlyBillInfo(QueryPoolMonthlyBillInfoRequest request);

    CompletableFuture<QueryPoolStatisticsInfoResponse> queryPoolStatisticsInfo(QueryPoolStatisticsInfoRequest request);

    CompletableFuture<QueryPoolSummaryInfoResponse> queryPoolSummaryInfo(QueryPoolSummaryInfoRequest request);

    CompletableFuture<QueryPurchasedInfoResponse> queryPurchasedInfo(QueryPurchasedInfoRequest request);

    CompletableFuture<QueryPurchasedResListResponse> queryPurchasedResList(QueryPurchasedResListRequest request);

    CompletableFuture<QueryQRCodeInfoResponse> queryQRCodeInfo(QueryQRCodeInfoRequest request);

    CompletableFuture<QueryRecordingUrlResponse> queryRecordingUrl(QueryRecordingUrlRequest request);

    CompletableFuture<QueryResSummaryInfoResponse> queryResSummaryInfo(QueryResSummaryInfoRequest request);

    CompletableFuture<QueryRingToneUrlResponse> queryRingToneUrl(QueryRingToneUrlRequest request);

    CompletableFuture<QueryRingTonesResponse> queryRingTones(QueryRingTonesRequest request);

    CompletableFuture<QuerySimplePoolInfoListResponse> querySimplePoolInfoList(QuerySimplePoolInfoListRequest request);

    CompletableFuture<QueryStatisticsInfoResponse> queryStatisticsInfo(QueryStatisticsInfoRequest request);

    CompletableFuture<QueryTagOpenStatusResponse> queryTagOpenStatus(QueryTagOpenStatusRequest request);

    CompletableFuture<QueryTransferDetailsResponse> queryTransferDetails(QueryTransferDetailsRequest request);

    CompletableFuture<QueryTransferRecordResponse> queryTransferRecord(QueryTransferRecordRequest request);

    CompletableFuture<QueryTransferRecordsResponse> queryTransferRecords(QueryTransferRecordsRequest request);

    CompletableFuture<QueryUserDeleteStatusResponse> queryUserDeleteStatus(QueryUserDeleteStatusRequest request);

    CompletableFuture<QueryUserInfoResponse> queryUserInfo(QueryUserInfoRequest request);

    CompletableFuture<QueryUserResPoolInfoResponse> queryUserResPoolInfo(QueryUserResPoolInfoRequest request);

    CompletableFuture<QueryVirtualOperationShowResponse> queryVirtualOperationShow(QueryVirtualOperationShowRequest request);

    CompletableFuture<QueryWarningListResponse> queryWarningList(QueryWarningListRequest request);

    CompletableFuture<QueryWaybillOrderInfoResponse> queryWaybillOrderInfo(QueryWaybillOrderInfoRequest request);

    CompletableFuture<QueryWaybillOrderStatisticsInfoResponse> queryWaybillOrderStatisticsInfo(QueryWaybillOrderStatisticsInfoRequest request);

    CompletableFuture<ReleaseResourceResponse> releaseResource(ReleaseResourceRequest request);

    CompletableFuture<TestTtsRingToneResponse> testTtsRingTone(TestTtsRingToneRequest request);

    CompletableFuture<UnbindResourceResponse> unbindResource(UnbindResourceRequest request);

    CompletableFuture<UnlockResourceResponse> unlockResource(UnlockResourceRequest request);

    CompletableFuture<UpdateContactsResponse> updateContacts(UpdateContactsRequest request);

    CompletableFuture<UpdateGroupDetailResponse> updateGroupDetail(UpdateGroupDetailRequest request);

    CompletableFuture<UpdateGroupInfoResponse> updateGroupInfo(UpdateGroupInfoRequest request);

    CompletableFuture<UpdatePoolNameResponse> updatePoolName(UpdatePoolNameRequest request);

    CompletableFuture<UpdateResRemarkResponse> updateResRemark(UpdateResRemarkRequest request);

    CompletableFuture<ValidateOrderResponse> validateOrder(ValidateOrderRequest request);

}
