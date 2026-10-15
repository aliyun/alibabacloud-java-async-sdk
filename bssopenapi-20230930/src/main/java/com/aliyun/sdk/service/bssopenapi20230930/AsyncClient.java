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
     * @param request the request parameters of AddCreditSeats  AddCreditSeatsRequest
     * @return AddCreditSeatsResponse
     */
    CompletableFuture<AddCreditSeatsResponse> addCreditSeats(AddCreditSeatsRequest request);

    /**
     * @param request the request parameters of AllocateCostCenterResource  AllocateCostCenterResourceRequest
     * @return AllocateCostCenterResourceResponse
     */
    CompletableFuture<AllocateCostCenterResourceResponse> allocateCostCenterResource(AllocateCostCenterResourceRequest request);

    /**
     * <b>description</b> :
     * <p>Cancels the low balance alert for a fund account.</p>
     * 
     * @param request the request parameters of CancelFundAccountLowAvailableAmountAlarm  CancelFundAccountLowAvailableAmountAlarmRequest
     * @return CancelFundAccountLowAvailableAmountAlarmResponse
     */
    CompletableFuture<CancelFundAccountLowAvailableAmountAlarmResponse> cancelFundAccountLowAvailableAmountAlarm(CancelFundAccountLowAvailableAmountAlarmRequest request);

    /**
     * @param request the request parameters of CheckAccountExist  CheckAccountExistRequest
     * @return CheckAccountExistResponse
     */
    CompletableFuture<CheckAccountExistResponse> checkAccountExist(CheckAccountExistRequest request);

    /**
     * <b>description</b> :
     * <p>Creates one or more cost centers.</p>
     * 
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
     * @param request the request parameters of CreateCreditSeat  CreateCreditSeatRequest
     * @return CreateCreditSeatResponse
     */
    CompletableFuture<CreateCreditSeatResponse> createCreditSeat(CreateCreditSeatRequest request);

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
     * <b>description</b> :
     * <p>When you call this operation, note the following items:</p>
     * <ul>
     * <li>You can subscribe to only one type of billing file at a time.</li>
     * <li>Except for monthly billing PDFs, starting from the day after the subscription is created, a billing file containing all detailed data from the beginning of the current month to the current day is pushed daily. A full billing file for the entire previous billing cycle is pushed before the 4th day of each month.</li>
     * <li>Monthly billing PDFs for the previous month are pushed before the 4th day of each month.</li>
     * <li>Billing files generated on a daily basis may be delayed. Delayed bills are pushed on the day after they are generated and may include bills that were delayed and generated on the previous day. Pull the full files for the previous month at the beginning of each month.<blockquote>
     * <p>Apply for the billing subscription permissions as described in the documentation: <a href="https://www.alibabacloud.com/help/en/user-center/user-guide/billing-subscription">Billing subscription</a>.</p>
     * </blockquote>
     * </li>
     * <li>This subscription and the billing subscription in the Expenses and Costs console are the same feature, and subscriptions are interoperable.</li>
     * <li>When you subscribe to a directory under a bucket, make sure that the directory naming conventions are met:<ul>
     * <li>Emojis are not allowed. Use valid UTF-8 characters.</li>
     * <li>The forward slash (/) is used to separate paths and create subdirectories. Do not start the path with a forward slash (/) or a backslash (\), and do not use consecutive forward slashes.</li>
     * <li>Subdirectories named .. are not allowed.</li>
     * <li>The total length must be 1 to 254 characters.</li>
     * </ul>
     * </li>
     * <li>File names:<ul>
     * <li><p>Example: <strong>consumeDetailBillV2</strong> (billing item details)</p>
     * <ul>
     * <li><p>Format of the file name pushed daily: <code>{Account UID}_{Site ID}_{Bill type}_{YYYYMM|YYYYMMDD}</code>. Example: <code>169**_2688801000001_consumeDetailBillV2_20190312</code>.</p>
     * </li>
     * <li><p>Format of the complete file name pushed at the beginning of the next month: <code>{Account UID}_{Site ID}_{Bill type}_{YYYYMM|YYYYMM}</code>. Example: <code>169**_2688801000001_consumeDetailBillV2_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Monthly billing PDF files are in the .pdf format, and other files are in the .csv format. When the data volume is large, the system automatically splits an exported bill into multiple files and compresses them into one or more ZIP files. The ZIP file names follow the same format.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateReportDefinition  CreateReportDefinitionRequest
     * @return CreateReportDefinitionResponse
     */
    CompletableFuture<CreateReportDefinitionResponse> createReportDefinition(CreateReportDefinitionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is in canary release and is available only to specific whitelisted users. Calling this operation too frequently may cause performance issues such as response timeouts.</p>
     * 
     * @param request the request parameters of DeleteCostCenter  DeleteCostCenterRequest
     * @return DeleteCostCenterResponse
     */
    CompletableFuture<DeleteCostCenterResponse> deleteCostCenter(DeleteCostCenterRequest request);

    /**
     * <b>description</b> :
     * <p>This API is in canary release and is available only to specific whitelisted users. Calling this API too frequently may cause performance issues such as response timeouts.</p>
     * 
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
     * @param request the request parameters of DescribeDeductLogs  DescribeDeductLogsRequest
     * @return DescribeDeductLogsResponse
     */
    CompletableFuture<DescribeDeductLogsResponse> describeDeductLogs(DescribeDeductLogsRequest request);

    /**
     * @param request the request parameters of DescribeFrInstances  DescribeFrInstancesRequest
     * @return DescribeFrInstancesResponse
     */
    CompletableFuture<DescribeFrInstancesResponse> describeFrInstances(DescribeFrInstancesRequest request);

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
     * <b>description</b> :
     * <p>Modifies one or more cost centers.</p>
     * 
     * @param request the request parameters of ModifyCostCenter  ModifyCostCenterRequest
     * @return ModifyCostCenterResponse
     */
    CompletableFuture<ModifyCostCenterResponse> modifyCostCenter(ModifyCostCenterRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies one or more financial units.</p>
     * 
     * @param request the request parameters of ModifyCostCenterRule  ModifyCostCenterRuleRequest
     * @return ModifyCostCenterRuleResponse
     */
    CompletableFuture<ModifyCostCenterRuleResponse> modifyCostCenterRule(ModifyCostCenterRuleRequest request);

    /**
     * @param request the request parameters of PayOrder  PayOrderRequest
     * @return PayOrderResponse
     */
    CompletableFuture<PayOrderResponse> payOrder(PayOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the cost overview results of a financial unit for a specified billing cycle.</p>
     * 
     * @param request the request parameters of QueryCostByCostCenter  QueryCostByCostCenterRequest
     * @return QueryCostByCostCenterResponse
     */
    CompletableFuture<QueryCostByCostCenterResponse> queryCostByCostCenter(QueryCostByCostCenterRequest request);

    /**
     * <b>description</b> :
     * <p>Queries parent cost centers and their child cost centers.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries a parent cost center and its child cost centers.</p>
     * 
     * @param request the request parameters of QueryCostCenterRule  QueryCostCenterRuleRequest
     * @return QueryCostCenterRuleResponse
     */
    CompletableFuture<QueryCostCenterRuleResponse> queryCostCenterRule(QueryCostCenterRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the cost allocation rules of a user\&quot;s financial units.</p>
     * 
     * @param request the request parameters of QueryCostCenterShareRule  QueryCostCenterShareRuleRequest
     * @return QueryCostCenterShareRuleResponse
     */
    CompletableFuture<QueryCostCenterShareRuleResponse> queryCostCenterShareRule(QueryCostCenterShareRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the SLA compensation details list for a user. Only data from the last two months is available.</p>
     * 
     * @param request the request parameters of QueryMonthlySlaList  QueryMonthlySlaListRequest
     * @return QueryMonthlySlaListResponse
     */
    CompletableFuture<QueryMonthlySlaListResponse> queryMonthlySlaList(QueryMonthlySlaListRequest request);

    /**
     * @param request the request parameters of ReduceCreditSeats  ReduceCreditSeatsRequest
     * @return ReduceCreditSeatsResponse
     */
    CompletableFuture<ReduceCreditSeatsResponse> reduceCreditSeats(ReduceCreditSeatsRequest request);

    /**
     * @param request the request parameters of RenewCreditSeat  RenewCreditSeatRequest
     * @return RenewCreditSeatResponse
     */
    CompletableFuture<RenewCreditSeatResponse> renewCreditSeat(RenewCreditSeatRequest request);

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

    /**
     * <b>description</b> :
     * <ol>
     * <li>Call QueryMonthlySlaList to obtain the claimable months and records.</li>
     * <li>Claim by month or by record.
     * Note: You can only claim compensation for the recent two months. Historical compensation has been automatically issued.</li>
     * </ol>
     * 
     * @param request the request parameters of SubmitSlaCouponApply  SubmitSlaCouponApplyRequest
     * @return SubmitSlaCouponApplyResponse
     */
    CompletableFuture<SubmitSlaCouponApplyResponse> submitSlaCouponApply(SubmitSlaCouponApplyRequest request);

    /**
     * @param request the request parameters of UpgradeCreditSeat  UpgradeCreditSeatRequest
     * @return UpgradeCreditSeatResponse
     */
    CompletableFuture<UpgradeCreditSeatResponse> upgradeCreditSeat(UpgradeCreditSeatRequest request);

}
