// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bssopenapi20230930.models.*;
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
     * @param request the request parameters of AddCouponDeductTag  AddCouponDeductTagRequest
     * @return AddCouponDeductTagResponse
     */
    CompletableFuture<AddCouponDeductTagResponse> addCouponDeductTag(AddCouponDeductTagRequest request);

    /**
     * @param request the request parameters of AllocateCostCenterResource  AllocateCostCenterResourceRequest
     * @return AllocateCostCenterResourceResponse
     */
    CompletableFuture<AllocateCostCenterResourceResponse> allocateCostCenterResource(AllocateCostCenterResourceRequest request);

    /**
     * @param request the request parameters of CancelFundAccountLowAvailableAmountAlarm  CancelFundAccountLowAvailableAmountAlarmRequest
     * @return CancelFundAccountLowAvailableAmountAlarmResponse
     */
    CompletableFuture<CancelFundAccountLowAvailableAmountAlarmResponse> cancelFundAccountLowAvailableAmountAlarm(CancelFundAccountLowAvailableAmountAlarmRequest request);

    /**
     * @param request the request parameters of CreateCostCenter  CreateCostCenterRequest
     * @return CreateCostCenterResponse
     */
    CompletableFuture<CreateCostCenterResponse> createCostCenter(CreateCostCenterRequest request);

    /**
     * @param request the request parameters of CreateCostCenterRule  CreateCostCenterRuleRequest
     * @return CreateCostCenterRuleResponse
     */
    CompletableFuture<CreateCostCenterRuleResponse> createCostCenterRule(CreateCostCenterRuleRequest request);

    /**
     * @param request the request parameters of CreateFundAccountPayRelation  CreateFundAccountPayRelationRequest
     * @return CreateFundAccountPayRelationResponse
     */
    CompletableFuture<CreateFundAccountPayRelationResponse> createFundAccountPayRelation(CreateFundAccountPayRelationRequest request);

    /**
     * @param request the request parameters of CreateFundAccountTransfer  CreateFundAccountTransferRequest
     * @return CreateFundAccountTransferResponse
     */
    CompletableFuture<CreateFundAccountTransferResponse> createFundAccountTransfer(CreateFundAccountTransferRequest request);

    /**
     * @param request the request parameters of CreateInvoice  CreateInvoiceRequest
     * @return CreateInvoiceResponse
     */
    CompletableFuture<CreateInvoiceResponse> createInvoice(CreateInvoiceRequest request);

    /**
     * @param request the request parameters of CreateReportDefinition  CreateReportDefinitionRequest
     * @return CreateReportDefinitionResponse
     */
    CompletableFuture<CreateReportDefinitionResponse> createReportDefinition(CreateReportDefinitionRequest request);

    /**
     * @param request the request parameters of DeleteCostCenter  DeleteCostCenterRequest
     * @return DeleteCostCenterResponse
     */
    CompletableFuture<DeleteCostCenterResponse> deleteCostCenter(DeleteCostCenterRequest request);

    /**
     * @param request the request parameters of DeleteCostCenterRule  DeleteCostCenterRuleRequest
     * @return DeleteCostCenterRuleResponse
     */
    CompletableFuture<DeleteCostCenterRuleResponse> deleteCostCenterRule(DeleteCostCenterRuleRequest request);

    /**
     * @param request the request parameters of DeleteCouponDeductTag  DeleteCouponDeductTagRequest
     * @return DeleteCouponDeductTagResponse
     */
    CompletableFuture<DeleteCouponDeductTagResponse> deleteCouponDeductTag(DeleteCouponDeductTagRequest request);

    /**
     * @param request the request parameters of DeleteReportDefinition  DeleteReportDefinitionRequest
     * @return DeleteReportDefinitionResponse
     */
    CompletableFuture<DeleteReportDefinitionResponse> deleteReportDefinition(DeleteReportDefinitionRequest request);

    /**
     * @param request the request parameters of DescribeCoupon  DescribeCouponRequest
     * @return DescribeCouponResponse
     */
    CompletableFuture<DescribeCouponResponse> describeCoupon(DescribeCouponRequest request);

    /**
     * @param request the request parameters of DescribeCouponItemList  DescribeCouponItemListRequest
     * @return DescribeCouponItemListResponse
     */
    CompletableFuture<DescribeCouponItemListResponse> describeCouponItemList(DescribeCouponItemListRequest request);

    /**
     * @param request the request parameters of DescribeUserSpnSummaryInfo  DescribeUserSpnSummaryInfoRequest
     * @return DescribeUserSpnSummaryInfoResponse
     */
    CompletableFuture<DescribeUserSpnSummaryInfoResponse> describeUserSpnSummaryInfo(DescribeUserSpnSummaryInfoRequest request);

    /**
     * @param request the request parameters of GetFundAccountAvailableAmount  GetFundAccountAvailableAmountRequest
     * @return GetFundAccountAvailableAmountResponse
     */
    CompletableFuture<GetFundAccountAvailableAmountResponse> getFundAccountAvailableAmount(GetFundAccountAvailableAmountRequest request);

    /**
     * @param request the request parameters of GetFundAccountCanAllocateCreditAmount  GetFundAccountCanAllocateCreditAmountRequest
     * @return GetFundAccountCanAllocateCreditAmountResponse
     */
    CompletableFuture<GetFundAccountCanAllocateCreditAmountResponse> getFundAccountCanAllocateCreditAmount(GetFundAccountCanAllocateCreditAmountRequest request);

    /**
     * @param request the request parameters of GetFundAccountCanRecycleAmount  GetFundAccountCanRecycleAmountRequest
     * @return GetFundAccountCanRecycleAmountResponse
     */
    CompletableFuture<GetFundAccountCanRecycleAmountResponse> getFundAccountCanRecycleAmount(GetFundAccountCanRecycleAmountRequest request);

    /**
     * @param request the request parameters of GetFundAccountCanTransferAmount  GetFundAccountCanTransferAmountRequest
     * @return GetFundAccountCanTransferAmountResponse
     */
    CompletableFuture<GetFundAccountCanTransferAmountResponse> getFundAccountCanTransferAmount(GetFundAccountCanTransferAmountRequest request);

    /**
     * @param request the request parameters of GetFundAccountCanWithdrawAmount  GetFundAccountCanWithdrawAmountRequest
     * @return GetFundAccountCanWithdrawAmountResponse
     */
    CompletableFuture<GetFundAccountCanWithdrawAmountResponse> getFundAccountCanWithdrawAmount(GetFundAccountCanWithdrawAmountRequest request);

    /**
     * @param request the request parameters of GetFundAccountLowAvailableAmountAlarm  GetFundAccountLowAvailableAmountAlarmRequest
     * @return GetFundAccountLowAvailableAmountAlarmResponse
     */
    CompletableFuture<GetFundAccountLowAvailableAmountAlarmResponse> getFundAccountLowAvailableAmountAlarm(GetFundAccountLowAvailableAmountAlarmRequest request);

    /**
     * @param request the request parameters of GetFundAccountTransactionDetails  GetFundAccountTransactionDetailsRequest
     * @return GetFundAccountTransactionDetailsResponse
     */
    CompletableFuture<GetFundAccountTransactionDetailsResponse> getFundAccountTransactionDetails(GetFundAccountTransactionDetailsRequest request);

    /**
     * @param request the request parameters of GetOrderDetail  GetOrderDetailRequest
     * @return GetOrderDetailResponse
     */
    CompletableFuture<GetOrderDetailResponse> getOrderDetail(GetOrderDetailRequest request);

    /**
     * @param request the request parameters of GetOrders  GetOrdersRequest
     * @return GetOrdersResponse
     */
    CompletableFuture<GetOrdersResponse> getOrders(GetOrdersRequest request);

    /**
     * @param request the request parameters of GetSavingPlanDeductableCommodity  GetSavingPlanDeductableCommodityRequest
     * @return GetSavingPlanDeductableCommodityResponse
     */
    CompletableFuture<GetSavingPlanDeductableCommodityResponse> getSavingPlanDeductableCommodity(GetSavingPlanDeductableCommodityRequest request);

    /**
     * @param request the request parameters of GetSavingPlanShareAccounts  GetSavingPlanShareAccountsRequest
     * @return GetSavingPlanShareAccountsResponse
     */
    CompletableFuture<GetSavingPlanShareAccountsResponse> getSavingPlanShareAccounts(GetSavingPlanShareAccountsRequest request);

    /**
     * @param request the request parameters of GetSavingPlanUserDeductRule  GetSavingPlanUserDeductRuleRequest
     * @return GetSavingPlanUserDeductRuleResponse
     */
    CompletableFuture<GetSavingPlanUserDeductRuleResponse> getSavingPlanUserDeductRule(GetSavingPlanUserDeductRuleRequest request);

    /**
     * @param request the request parameters of ListCouponDeductTag  ListCouponDeductTagRequest
     * @return ListCouponDeductTagResponse
     */
    CompletableFuture<ListCouponDeductTagResponse> listCouponDeductTag(ListCouponDeductTagRequest request);

    /**
     * @param request the request parameters of ListFundAccount  ListFundAccountRequest
     * @return ListFundAccountResponse
     */
    CompletableFuture<ListFundAccountResponse> listFundAccount(ListFundAccountRequest request);

    /**
     * @param request the request parameters of ListFundAccountPayRelation  ListFundAccountPayRelationRequest
     * @return ListFundAccountPayRelationResponse
     */
    CompletableFuture<ListFundAccountPayRelationResponse> listFundAccountPayRelation(ListFundAccountPayRelationRequest request);

    /**
     * @param request the request parameters of ListInvoiceCandidate  ListInvoiceCandidateRequest
     * @return ListInvoiceCandidateResponse
     */
    CompletableFuture<ListInvoiceCandidateResponse> listInvoiceCandidate(ListInvoiceCandidateRequest request);

    /**
     * @param request the request parameters of ListInvoiceTitle  ListInvoiceTitleRequest
     * @return ListInvoiceTitleResponse
     */
    CompletableFuture<ListInvoiceTitleResponse> listInvoiceTitle(ListInvoiceTitleRequest request);

    /**
     * @param request the request parameters of ListReportDefinitions  ListReportDefinitionsRequest
     * @return ListReportDefinitionsResponse
     */
    CompletableFuture<ListReportDefinitionsResponse> listReportDefinitions(ListReportDefinitionsRequest request);

    /**
     * @param request the request parameters of ModifyCostCenter  ModifyCostCenterRequest
     * @return ModifyCostCenterResponse
     */
    CompletableFuture<ModifyCostCenterResponse> modifyCostCenter(ModifyCostCenterRequest request);

    /**
     * @param request the request parameters of ModifyCostCenterRule  ModifyCostCenterRuleRequest
     * @return ModifyCostCenterRuleResponse
     */
    CompletableFuture<ModifyCostCenterRuleResponse> modifyCostCenterRule(ModifyCostCenterRuleRequest request);

    /**
     * @param request the request parameters of QueryCostCenter  QueryCostCenterRequest
     * @return QueryCostCenterResponse
     */
    CompletableFuture<QueryCostCenterResponse> queryCostCenter(QueryCostCenterRequest request);

    /**
     * @param request the request parameters of QueryCostCenterResource  QueryCostCenterResourceRequest
     * @return QueryCostCenterResourceResponse
     */
    CompletableFuture<QueryCostCenterResourceResponse> queryCostCenterResource(QueryCostCenterResourceRequest request);

    /**
     * @param request the request parameters of QueryCostCenterRule  QueryCostCenterRuleRequest
     * @return QueryCostCenterRuleResponse
     */
    CompletableFuture<QueryCostCenterRuleResponse> queryCostCenterRule(QueryCostCenterRuleRequest request);

    /**
     * @param request the request parameters of QueryCostCenterShareRule  QueryCostCenterShareRuleRequest
     * @return QueryCostCenterShareRuleResponse
     */
    CompletableFuture<QueryCostCenterShareRuleResponse> queryCostCenterShareRule(QueryCostCenterShareRuleRequest request);

    /**
     * @param request the request parameters of SaveCostCenterShareRule  SaveCostCenterShareRuleRequest
     * @return SaveCostCenterShareRuleResponse
     */
    CompletableFuture<SaveCostCenterShareRuleResponse> saveCostCenterShareRule(SaveCostCenterShareRuleRequest request);

    /**
     * @param request the request parameters of SetFundAccountCreditAmount  SetFundAccountCreditAmountRequest
     * @return SetFundAccountCreditAmountResponse
     */
    CompletableFuture<SetFundAccountCreditAmountResponse> setFundAccountCreditAmount(SetFundAccountCreditAmountRequest request);

    /**
     * @param request the request parameters of SetFundAccountLowAvailableAmountAlarm  SetFundAccountLowAvailableAmountAlarmRequest
     * @return SetFundAccountLowAvailableAmountAlarmResponse
     */
    CompletableFuture<SetFundAccountLowAvailableAmountAlarmResponse> setFundAccountLowAvailableAmountAlarm(SetFundAccountLowAvailableAmountAlarmRequest request);

    /**
     * @param request the request parameters of SetSavingPlanUserDeductRule  SetSavingPlanUserDeductRuleRequest
     * @return SetSavingPlanUserDeductRuleResponse
     */
    CompletableFuture<SetSavingPlanUserDeductRuleResponse> setSavingPlanUserDeductRule(SetSavingPlanUserDeductRuleRequest request);

}
