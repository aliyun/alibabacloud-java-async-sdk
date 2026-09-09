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
     * @param request the request parameters of CheckBudgetNameExists  CheckBudgetNameExistsRequest
     * @return CheckBudgetNameExistsResponse
     */
    CompletableFuture<CheckBudgetNameExistsResponse> checkBudgetNameExists(CheckBudgetNameExistsRequest request);

    /**
     * @param request the request parameters of CreateBudget  CreateBudgetRequest
     * @return CreateBudgetResponse
     */
    CompletableFuture<CreateBudgetResponse> createBudget(CreateBudgetRequest request);

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
     * <p>When calling this operation, note the following:</p>
     * <ul>
     * <li>A user can subscribe to one type of bill file at a time.</li>
     * <li>Except for monthly bill PDFs, after subscription, starting from the next day, the system pushes a bill file that contains full detailed data from the beginning of the current month to date. Before the 4th of each month, the system pushes the full bill file for the entire previous billing cycle.</li>
     * <li>Monthly bill PDFs are pushed before the 4th of each month for the previous month.</li>
     * <li>Bill files generated on a daily basis may have latency. Delayed bills are pushed the day after they are generated and may include bills from before the previous day that were delayed until the previous day. Pull the full file for the previous month at the beginning of each month.<blockquote>
     * <p>Apply for permissions as described in the documentation: <a href="https://www.alibabacloud.com/help/en/user-center/user-guide/billing-subscription">Bill subscription</a></p>
     * </blockquote>
     * </li>
     * <li>This subscription is the same feature as Expenses and Costs - Bill Subscription. Subscriptions are shared between the two.</li>
     * <li>When subscribing to a directory under a bucket, ensure the directory name complies with the naming conventions:<ul>
     * <li>Emojis are not allowed. Use valid UTF-8 characters.</li>
     * <li>/ is used to separate paths and can quickly create subdirectories. Do not start with / or \, and do not use consecutive / characters.</li>
     * <li>Subdirectories named .. are not allowed.</li>
     * <li>The total length must be 1 to 254 characters.</li>
     * </ul>
     * </li>
     * <li>File names:<ul>
     * <li><p>Example: <strong>consumeDetailBillV2</strong> (billing item bill details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>{Account UID}_{Sales site ID}_{Bill type}_{YYYYMM|YYYYMMDD}</code>, for example: <code>169**_2688801000001_consumeDetailBillV2_20190312</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>{Account UID}_{Sales site ID}_{Bill type}_{YYYYMM|YYYYMM}</code>, for example: <code>169**_2688801000001_consumeDetailBillV2_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Monthly bill PDF type files are in .pdf format. All other file types are .csv files. When the data volume is large, the system automatically splits the exported bill into multiple files and compresses them into one or more zip files. The zip file name format is the same.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateReportDefinition  CreateReportDefinitionRequest
     * @return CreateReportDefinitionResponse
     */
    CompletableFuture<CreateReportDefinitionResponse> createReportDefinition(CreateReportDefinitionRequest request);

    /**
     * @param request the request parameters of DeleteBudget  DeleteBudgetRequest
     * @return DeleteBudgetResponse
     */
    CompletableFuture<DeleteBudgetResponse> deleteBudget(DeleteBudgetRequest request);

    /**
     * <b>description</b> :
     * <p>This API is in canary release and is only available to whitelisted users. Excessive calls may cause performance issues such as response timeouts.</p>
     * 
     * @param request the request parameters of DeleteCostCenter  DeleteCostCenterRequest
     * @return DeleteCostCenterResponse
     */
    CompletableFuture<DeleteCostCenterResponse> deleteCostCenter(DeleteCostCenterRequest request);

    /**
     * <b>description</b> :
     * <p>This API is in canary release and is only available to whitelisted users. Excessive calls may cause performance issues such as response timeouts.</p>
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
     * @param request the request parameters of DescribeBudget  DescribeBudgetRequest
     * @return DescribeBudgetResponse
     */
    CompletableFuture<DescribeBudgetResponse> describeBudget(DescribeBudgetRequest request);

    /**
     * @param request the request parameters of DescribeBudgets  DescribeBudgetsRequest
     * @return DescribeBudgetsResponse
     */
    CompletableFuture<DescribeBudgetsResponse> describeBudgets(DescribeBudgetsRequest request);

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
     * <p>Modify one or more financial units</p>
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
     * <p>Query cost center expense overview results for a specified billing period</p>
     * 
     * @param request the request parameters of QueryCostByCostCenter  QueryCostByCostCenterRequest
     * @return QueryCostByCostCenterResponse
     */
    CompletableFuture<QueryCostByCostCenterResponse> queryCostByCostCenter(QueryCostByCostCenterRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a parent financial unit and its child financial units.</p>
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
     * <p>Query parent cost center and its child cost centers.</p>
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
     * <p>Provides the SLA compensation details list for a user. Only data from the last two months is available.</p>
     * 
     * @param request the request parameters of QueryMonthlySlaList  QueryMonthlySlaListRequest
     * @return QueryMonthlySlaListResponse
     */
    CompletableFuture<QueryMonthlySlaListResponse> queryMonthlySlaList(QueryMonthlySlaListRequest request);

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
     * Note: Only compensation for the last two months can be claimed. Historical compensation has been automatically issued.</li>
     * </ol>
     * 
     * @param request the request parameters of SubmitSlaCouponApply  SubmitSlaCouponApplyRequest
     * @return SubmitSlaCouponApplyResponse
     */
    CompletableFuture<SubmitSlaCouponApplyResponse> submitSlaCouponApply(SubmitSlaCouponApplyRequest request);

    /**
     * @param request the request parameters of UpdateBudget  UpdateBudgetRequest
     * @return UpdateBudgetResponse
     */
    CompletableFuture<UpdateBudgetResponse> updateBudget(UpdateBudgetRequest request);

}
