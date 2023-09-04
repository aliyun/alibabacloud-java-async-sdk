// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bssopenapi20171214.models.*;
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
      * 1\\. For more information about a financial relationship, see [Financial relationships](https://help.aliyun.com/document_detail/100376.html?spm=a2c4g.11186623.6.563.52a83908ypl4yE) or [Financial relationships](https://www.alibabacloud.com/help/en/doc-detail/116383.html). 2. If enterprise names used by the management account and a member for real-name verification are the same, you do not need to call an API operation for confirmation. Otherwise, you must call the ConfirmRelation operation for confirmation.
      *
     */
    CompletableFuture<AddAccountRelationResponse> addAccountRelation(AddAccountRelationRequest request);

    CompletableFuture<AllocateCostUnitResourceResponse> allocateCostUnitResource(AllocateCostUnitResourceRequest request);

    CompletableFuture<ApplyInvoiceResponse> applyInvoice(ApplyInvoiceRequest request);

    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    CompletableFuture<ChangeResellerConsumeAmountResponse> changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request);

    /**
      * 1\\. A member needs to confirm an invitation only if a financial management relationship is established between the management account and the member and enterprise names used by the management account and the member for real-name verification are different. 2. The permissions to be confirmed must be the same as those granted to the member when the management account initiates the invitation.
      *
     */
    CompletableFuture<ConfirmRelationResponse> confirmRelation(ConfirmRelationRequest request);

    CompletableFuture<ConvertChargeTypeResponse> convertChargeType(ConvertChargeTypeRequest request);

    /**
      * You can call this operation to create an account so as to establish a master-member financial relationship.
      *
     */
    CompletableFuture<CreateAgAccountResponse> createAgAccount(CreateAgAccountRequest request);

    CompletableFuture<CreateCostUnitResponse> createCostUnit(CreateCostUnitRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateResellerUserQuotaResponse> createResellerUserQuota(CreateResellerUserQuotaRequest request);

    CompletableFuture<CreateResourcePackageResponse> createResourcePackage(CreateResourcePackageRequest request);

    CompletableFuture<CreateSavingsPlansInstanceResponse> createSavingsPlansInstance(CreateSavingsPlansInstanceRequest request);

    CompletableFuture<DeleteCostUnitResponse> deleteCostUnit(DeleteCostUnitRequest request);

    /**
      * This operation is in beta testing and is only available for specific users in the whitelist. Excessive calls may result in performance issues. For example, the response times out.
      *
     */
    CompletableFuture<DescribeCostBudgetsSummaryResponse> describeCostBudgetsSummary(DescribeCostBudgetsSummaryRequest request);

    /**
      * You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.
      *
     */
    CompletableFuture<DescribeInstanceAmortizedCostByAmortizationPeriodResponse> describeInstanceAmortizedCostByAmortizationPeriod(DescribeInstanceAmortizedCostByAmortizationPeriodRequest request);

    CompletableFuture<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse> describeInstanceAmortizedCostByAmortizationPeriodDate(DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest request);

    CompletableFuture<DescribeInstanceAmortizedCostByConsumePeriodResponse> describeInstanceAmortizedCostByConsumePeriod(DescribeInstanceAmortizedCostByConsumePeriodRequest request);

    /**
      * *   Instance bills are generated after the total bill is split. In most cases, the instance bills do not include data generated on the last day of the specified billing cycle.
      * *   The instance information may change during the billing cycle. The instance configurations and types in monthly bills are subject to the point in time when you query bills. For more information, see the corresponding bill details.
      * *   You can query data generated after June 2020 for Cloud Communications services. You can query data generated after November 2020 for Alibaba Cloud Domains.
      *
     */
    CompletableFuture<DescribeInstanceBillResponse> describeInstanceBill(DescribeInstanceBillRequest request);

    CompletableFuture<DescribePricingModuleResponse> describePricingModule(DescribePricingModuleRequest request);

    /**
      * You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.
      *
     */
    CompletableFuture<DescribeProductAmortizedCostByAmortizationPeriodResponse> describeProductAmortizedCostByAmortizationPeriod(DescribeProductAmortizedCostByAmortizationPeriodRequest request);

    CompletableFuture<DescribeProductAmortizedCostByConsumePeriodResponse> describeProductAmortizedCostByConsumePeriod(DescribeProductAmortizedCostByConsumePeriodRequest request);

    /**
      * The amount of the resources deducted from a deduction plan.
      *
     */
    CompletableFuture<DescribeResourceCoverageDetailResponse> describeResourceCoverageDetail(DescribeResourceCoverageDetailRequest request);

    /**
      * Indicates whether the operation was successful.
      *
     */
    CompletableFuture<DescribeResourceCoverageTotalResponse> describeResourceCoverageTotal(DescribeResourceCoverageTotalRequest request);

    CompletableFuture<DescribeResourcePackageProductResponse> describeResourcePackageProduct(DescribeResourcePackageProductRequest request);

    CompletableFuture<DescribeResourceUsageDetailResponse> describeResourceUsageDetail(DescribeResourceUsageDetailRequest request);

    CompletableFuture<DescribeResourceUsageTotalResponse> describeResourceUsageTotal(DescribeResourceUsageTotalRequest request);

    CompletableFuture<DescribeSavingsPlansCoverageDetailResponse> describeSavingsPlansCoverageDetail(DescribeSavingsPlansCoverageDetailRequest request);

    CompletableFuture<DescribeSavingsPlansCoverageTotalResponse> describeSavingsPlansCoverageTotal(DescribeSavingsPlansCoverageTotalRequest request);

    CompletableFuture<DescribeSavingsPlansUsageDetailResponse> describeSavingsPlansUsageDetail(DescribeSavingsPlansUsageDetailRequest request);

    CompletableFuture<DescribeSavingsPlansUsageTotalResponse> describeSavingsPlansUsageTotal(DescribeSavingsPlansUsageTotalRequest request);

    /**
      * The code of the service.
      *
     */
    CompletableFuture<DescribeSplitItemBillResponse> describeSplitItemBill(DescribeSplitItemBillRequest request);

    CompletableFuture<EnableBillGenerationResponse> enableBillGeneration(EnableBillGenerationRequest request);

    CompletableFuture<GetAccountRelationResponse> getAccountRelation(GetAccountRelationRequest request);

    CompletableFuture<GetCustomerAccountInfoResponse> getCustomerAccountInfo(GetCustomerAccountInfoRequest request);

    /**
      * The system queries the IDs of customers of a VNO based on the AccessKey pair used in the request.
      *
     */
    CompletableFuture<GetCustomerListResponse> getCustomerList(GetCustomerListRequest request);

    CompletableFuture<GetOrderDetailResponse> getOrderDetail(GetOrderDetailRequest request);

    /**
      * ### Usage notes
      * 1.  Call the QueryProductList operation to obtain the code of the service. For more information, see [QueryProductList](~~95984~~).
      * 2.  Call the DescribePricingModule operation to obtain the configuration parameters of the service. For more information, see [DescribePricingModule](~~96469~~).
      * 3.  Call the GetPayAsYouGoPrice operation to obtain the pay-as-you-go price of the service based on the returned configuration parameters.
      *
     */
    CompletableFuture<GetPayAsYouGoPriceResponse> getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request);

    CompletableFuture<GetResourcePackagePriceResponse> getResourcePackagePrice(GetResourcePackagePriceRequest request);

    /**
      * 1.  Call the QueryProductList operation to obtain the code of the service. For more information, see [QueryProductList](~~95984~~).
      * 2.  Call the DescribePricingModule operation to obtain the configuration parameters of the service. For more information, see [DescribePricingModule](~~96469~~).
      * 3.  Call the GetSubscriptionPrice operation to obtain the pricing of the service based on the returned configuration parameters.
      *
     */
    CompletableFuture<GetSubscriptionPriceResponse> getSubscriptionPrice(GetSubscriptionPriceRequest request);

    /**
      * 1.  **Check the information about unsubscription and confirm the unsubscription terms and refundable amount. The resource that is unsubscribed cannot be restored.**
      * 2.  Refunds are applicable only for the actual paid amount. Vouchers used for the purchase are non-refundable.
      * 3.  For more information, see [Rules for unsubscribing from resources](https://help.aliyun.com/knowledge_detail/116043.html?spm=a2c81.e1d666e.app.2.62ae11271Kd6iM).
      *
     */
    CompletableFuture<InquiryPriceRefundInstanceResponse> inquiryPriceRefundInstance(InquiryPriceRefundInstanceRequest request);

    CompletableFuture<ModifyAccountRelationResponse> modifyAccountRelation(ModifyAccountRelationRequest request);

    CompletableFuture<ModifyCostUnitResponse> modifyCostUnit(ModifyCostUnitRequest request);

    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    CompletableFuture<QueryAccountBalanceResponse> queryAccountBalance(QueryAccountBalanceRequest request);

    /**
      * ##
      * Before you call this operation, take note of the following items:
      * *   Account bills are summarized based on instance bills. In most cases, the account bills do not include the data generated on the last day of the specified period.
      * *   You can query the data generated in June 2020 or later for Cloud Communications services. However, the query results do not include the data of Alibaba Cloud Domains.
      *
     */
    CompletableFuture<QueryAccountBillResponse> queryAccountBill(QueryAccountBillRequest request);

    CompletableFuture<QueryAccountTransactionDetailsResponse> queryAccountTransactionDetails(QueryAccountTransactionDetailsRequest request);

    CompletableFuture<QueryAccountTransactionsResponse> queryAccountTransactions(QueryAccountTransactionsRequest request);

    CompletableFuture<QueryAvailableInstancesResponse> queryAvailableInstances(QueryAvailableInstancesRequest request);

    CompletableFuture<QueryBillResponse> queryBill(QueryBillRequest request);

    CompletableFuture<QueryBillOverviewResponse> queryBillOverview(QueryBillOverviewRequest request);

    CompletableFuture<QueryBillToOSSSubscriptionResponse> queryBillToOSSSubscription(QueryBillToOSSSubscriptionRequest request);

    CompletableFuture<QueryCashCouponsResponse> queryCashCoupons(QueryCashCouponsRequest request);

    /**
      * You can call this operation to query the information about a service based on the service code.
      *
     */
    CompletableFuture<QueryCommodityListResponse> queryCommodityList(QueryCommodityListRequest request);

    CompletableFuture<QueryCostUnitResponse> queryCostUnit(QueryCostUnitRequest request);

    CompletableFuture<QueryCostUnitResourceResponse> queryCostUnitResource(QueryCostUnitResourceRequest request);

    CompletableFuture<QueryCustomerAddressListResponse> queryCustomerAddressList(QueryCustomerAddressListRequest request);

    /**
      * Limits:
      * *   Only the usage records within the past year can be queried.
      *
     */
    CompletableFuture<QueryDPUtilizationDetailResponse> queryDPUtilizationDetail(QueryDPUtilizationDetailRequest request);

    CompletableFuture<QueryEvaluateListResponse> queryEvaluateList(QueryEvaluateListRequest request);

    CompletableFuture<QueryFinancialAccountInfoResponse> queryFinancialAccountInfo(QueryFinancialAccountInfoRequest request);

    /**
      * ##
      * *   This API operation has been upgraded to DescribeInstanceBill. We recommend that you call the [DescribeInstanceBill](~~209402~~) operation to query the bills of instances or billable items in a billing cycle. You can call the QueryInstanceBill operation to query a maximum of 50,000 data rows in a bill.
      * *   Instance bills are generated after bills are split. In most cases, the instance bills do not include data generated on the last day of the specified period.
      * *   The instance information changes within a billing cycle. The instance configurations and specifications and the time when the instance was used in the billing cycle are all recorded. For more information, see the corresponding bill details.
      * *   You can query the data generated in June 2020 or later for Cloud Communications services, and the data generated in November 2020 or later for Alibaba Cloud Domains.
      *
     */
    CompletableFuture<QueryInstanceBillResponse> queryInstanceBill(QueryInstanceBillRequest request);

    CompletableFuture<QueryInstanceByTagResponse> queryInstanceByTag(QueryInstanceByTagRequest request);

    CompletableFuture<QueryInstanceGaapCostResponse> queryInstanceGaapCost(QueryInstanceGaapCostRequest request);

    CompletableFuture<QueryInvoicingCustomerListResponse> queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request);

    CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request);

    CompletableFuture<QueryPermissionListResponse> queryPermissionList(QueryPermissionListRequest request);

    CompletableFuture<QueryPrepaidCardsResponse> queryPrepaidCards(QueryPrepaidCardsRequest request);

    /**
      * You can call this operation to query the billable items of a service. A billable item is the minimum unit used to calculate costs.
      *
     */
    CompletableFuture<QueryPriceEntityListResponse> queryPriceEntityList(QueryPriceEntityListRequest request);

    CompletableFuture<QueryProductListResponse> queryProductList(QueryProductListRequest request);

    CompletableFuture<QueryRIUtilizationDetailResponse> queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request);

    CompletableFuture<QueryRedeemResponse> queryRedeem(QueryRedeemRequest request);

    CompletableFuture<QueryRelationListResponse> queryRelationList(QueryRelationListRequest request);

    CompletableFuture<QueryResellerAvailableQuotaResponse> queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request);

    CompletableFuture<QueryResellerUserAlarmThresholdResponse> queryResellerUserAlarmThreshold(QueryResellerUserAlarmThresholdRequest request);

    CompletableFuture<QueryResourcePackageInstancesResponse> queryResourcePackageInstances(QueryResourcePackageInstancesRequest request);

    CompletableFuture<QuerySavingsPlansDeductLogResponse> querySavingsPlansDeductLog(QuerySavingsPlansDeductLogRequest request);

    CompletableFuture<QuerySavingsPlansDiscountResponse> querySavingsPlansDiscount(QuerySavingsPlansDiscountRequest request);

    CompletableFuture<QuerySavingsPlansInstanceResponse> querySavingsPlansInstance(QuerySavingsPlansInstanceRequest request);

    CompletableFuture<QuerySettleBillResponse> querySettleBill(QuerySettleBillRequest request);

    CompletableFuture<QuerySkuPriceListResponse> querySkuPriceList(QuerySkuPriceListRequest request);

    /**
      * *   This API operation has been upgraded to DescribeSplitItemBill. We recommend that you call the [DescribeSplitItemBill](~~208169~~) operation to query split bills. You can call the QuerySplitItemBill operation to query a maximum of 50,000 data rows in a bill.
      * *   The data queried by calling the QuerySplitItemBill operation is consistent with the data that is displayed for the specified billing cycle on the Split Bill page in User Center.
      * *   You can call this operation to query split bills generated within the last 12 months.
      * *   This operation returns split bills only after you activate the [Split Bill](https://usercenter2.aliyun.com/finance/split-bill) service in User Center.
      *
     */
    CompletableFuture<QuerySplitItemBillResponse> querySplitItemBill(QuerySplitItemBillRequest request);

    /**
      * You can call this operation to query the usage data of an Alibaba Cloud service. Take note of the following items:
      * *   The service code that you specify for querying the usage data of a specific Alibaba Cloud service must be valid. You can query the usage data by hour or by day.
      * *   The time that you specify must follow the ISO8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
      *     *   Latency exists in data pushes. Therefore, if you set the DataType parameter to Hour, the integrity of usage data recorded in the last 24 hours can be ensured. If you set the DataType parameter to Day, the integrity of usage data recorded in the last two days can be ensured.
      *     *   You can query the usage data that is recorded in the last quarter.
      *
     */
    CompletableFuture<QueryUserOmsDataResponse> queryUserOmsData(QueryUserOmsDataRequest request);

    /**
      * 1.  Refunds are applicable only for the actual paid amount. Vouchers used for the purchase are non-refundable.
      * 2.  Check the information about unsubscription and confirm the unsubscription terms and refundable amount. The resource that is unsubscribed cannot be restored.
      * 3.  For more information, see [Rules for unsubscribing from resources](https://help.aliyun.com/knowledge_detail/116043.html?spm=a2c81.e1d666e.app.2.62ae11271Kd6iM).
      *
     */
    CompletableFuture<RefundInstanceResponse> refundInstance(RefundInstanceRequest request);

    /**
      * A value of true indicates that the execution is complete.
      * A value of false indicates that an error occurs during the execution.
      *
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    CompletableFuture<RelieveAccountRelationResponse> relieveAccountRelation(RelieveAccountRelationRequest request);

    CompletableFuture<RenewChangeInstanceResponse> renewChangeInstance(RenewChangeInstanceRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<RenewResourcePackageResponse> renewResourcePackage(RenewResourcePackageRequest request);

    CompletableFuture<SaveUserCreditResponse> saveUserCredit(SaveUserCreditRequest request);

    CompletableFuture<SetAllExpirationDayResponse> setAllExpirationDay(SetAllExpirationDayRequest request);

    CompletableFuture<SetCreditLabelActionResponse> setCreditLabelAction(SetCreditLabelActionRequest request);

    CompletableFuture<SetRenewalResponse> setRenewal(SetRenewalRequest request);

    CompletableFuture<SetResellerUserAlarmThresholdResponse> setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request);

    CompletableFuture<SetResellerUserQuotaResponse> setResellerUserQuota(SetResellerUserQuotaRequest request);

    CompletableFuture<SetResellerUserStatusResponse> setResellerUserStatus(SetResellerUserStatusRequest request);

    CompletableFuture<SubscribeBillToOSSResponse> subscribeBillToOSS(SubscribeBillToOSSRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnsubscribeBillToOSSResponse> unsubscribeBillToOSS(UnsubscribeBillToOSSRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpgradeResourcePackageResponse> upgradeResourcePackage(UpgradeResourcePackageRequest request);

}
