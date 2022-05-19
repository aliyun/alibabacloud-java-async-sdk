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

    CompletableFuture<AddAccountRelationResponse> addAccountRelation(AddAccountRelationRequest request);

    CompletableFuture<AllocateCostUnitResourceResponse> allocateCostUnitResource(AllocateCostUnitResourceRequest request);

    CompletableFuture<ApplyInvoiceResponse> applyInvoice(ApplyInvoiceRequest request);

    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    CompletableFuture<ChangeResellerConsumeAmountResponse> changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request);

    CompletableFuture<ConfirmRelationResponse> confirmRelation(ConfirmRelationRequest request);

    CompletableFuture<ConvertChargeTypeResponse> convertChargeType(ConvertChargeTypeRequest request);

    CompletableFuture<CreateAgAccountResponse> createAgAccount(CreateAgAccountRequest request);

    CompletableFuture<CreateCostUnitResponse> createCostUnit(CreateCostUnitRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateResellerUserQuotaResponse> createResellerUserQuota(CreateResellerUserQuotaRequest request);

    CompletableFuture<CreateResourcePackageResponse> createResourcePackage(CreateResourcePackageRequest request);

    CompletableFuture<CreateSavingsPlansInstanceResponse> createSavingsPlansInstance(CreateSavingsPlansInstanceRequest request);

    CompletableFuture<DeleteCostUnitResponse> deleteCostUnit(DeleteCostUnitRequest request);

    CompletableFuture<DescribeInstanceBillResponse> describeInstanceBill(DescribeInstanceBillRequest request);

    CompletableFuture<DescribePricingModuleResponse> describePricingModule(DescribePricingModuleRequest request);

    CompletableFuture<DescribeResourceCoverageDetailResponse> describeResourceCoverageDetail(DescribeResourceCoverageDetailRequest request);

    CompletableFuture<DescribeResourceCoverageTotalResponse> describeResourceCoverageTotal(DescribeResourceCoverageTotalRequest request);

    CompletableFuture<DescribeResourcePackageProductResponse> describeResourcePackageProduct(DescribeResourcePackageProductRequest request);

    CompletableFuture<DescribeResourceUsageDetailResponse> describeResourceUsageDetail(DescribeResourceUsageDetailRequest request);

    CompletableFuture<DescribeResourceUsageTotalResponse> describeResourceUsageTotal(DescribeResourceUsageTotalRequest request);

    CompletableFuture<DescribeSavingsPlansCoverageDetailResponse> describeSavingsPlansCoverageDetail(DescribeSavingsPlansCoverageDetailRequest request);

    CompletableFuture<DescribeSavingsPlansCoverageTotalResponse> describeSavingsPlansCoverageTotal(DescribeSavingsPlansCoverageTotalRequest request);

    CompletableFuture<DescribeSavingsPlansUsageDetailResponse> describeSavingsPlansUsageDetail(DescribeSavingsPlansUsageDetailRequest request);

    CompletableFuture<DescribeSavingsPlansUsageTotalResponse> describeSavingsPlansUsageTotal(DescribeSavingsPlansUsageTotalRequest request);

    CompletableFuture<DescribeSplitItemBillResponse> describeSplitItemBill(DescribeSplitItemBillRequest request);

    CompletableFuture<EnableBillGenerationResponse> enableBillGeneration(EnableBillGenerationRequest request);

    CompletableFuture<GetAccountRelationResponse> getAccountRelation(GetAccountRelationRequest request);

    CompletableFuture<GetCustomerAccountInfoResponse> getCustomerAccountInfo(GetCustomerAccountInfoRequest request);

    CompletableFuture<GetCustomerListResponse> getCustomerList(GetCustomerListRequest request);

    CompletableFuture<GetOrderDetailResponse> getOrderDetail(GetOrderDetailRequest request);

    CompletableFuture<GetPayAsYouGoPriceResponse> getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request);

    CompletableFuture<GetResourcePackagePriceResponse> getResourcePackagePrice(GetResourcePackagePriceRequest request);

    CompletableFuture<GetSubscriptionPriceResponse> getSubscriptionPrice(GetSubscriptionPriceRequest request);

    CompletableFuture<InquiryPriceRefundInstanceResponse> inquiryPriceRefundInstance(InquiryPriceRefundInstanceRequest request);

    CompletableFuture<ModifyAccountRelationResponse> modifyAccountRelation(ModifyAccountRelationRequest request);

    CompletableFuture<ModifyCostUnitResponse> modifyCostUnit(ModifyCostUnitRequest request);

    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    CompletableFuture<QueryAccountBalanceResponse> queryAccountBalance(QueryAccountBalanceRequest request);

    CompletableFuture<QueryAccountBillResponse> queryAccountBill(QueryAccountBillRequest request);

    CompletableFuture<QueryAccountTransactionDetailsResponse> queryAccountTransactionDetails(QueryAccountTransactionDetailsRequest request);

    CompletableFuture<QueryAccountTransactionsResponse> queryAccountTransactions(QueryAccountTransactionsRequest request);

    CompletableFuture<QueryAvailableInstancesResponse> queryAvailableInstances(QueryAvailableInstancesRequest request);

    CompletableFuture<QueryBillResponse> queryBill(QueryBillRequest request);

    CompletableFuture<QueryBillOverviewResponse> queryBillOverview(QueryBillOverviewRequest request);

    CompletableFuture<QueryBillToOSSSubscriptionResponse> queryBillToOSSSubscription(QueryBillToOSSSubscriptionRequest request);

    CompletableFuture<QueryCashCouponsResponse> queryCashCoupons(QueryCashCouponsRequest request);

    CompletableFuture<QueryCostUnitResponse> queryCostUnit(QueryCostUnitRequest request);

    CompletableFuture<QueryCostUnitResourceResponse> queryCostUnitResource(QueryCostUnitResourceRequest request);

    CompletableFuture<QueryCustomerAddressListResponse> queryCustomerAddressList(QueryCustomerAddressListRequest request);

    CompletableFuture<QueryDPUtilizationDetailResponse> queryDPUtilizationDetail(QueryDPUtilizationDetailRequest request);

    CompletableFuture<QueryEvaluateListResponse> queryEvaluateList(QueryEvaluateListRequest request);

    CompletableFuture<QueryFinancialAccountInfoResponse> queryFinancialAccountInfo(QueryFinancialAccountInfoRequest request);

    CompletableFuture<QueryInstanceBillResponse> queryInstanceBill(QueryInstanceBillRequest request);

    CompletableFuture<QueryInstanceByTagResponse> queryInstanceByTag(QueryInstanceByTagRequest request);

    CompletableFuture<QueryInstanceGaapCostResponse> queryInstanceGaapCost(QueryInstanceGaapCostRequest request);

    CompletableFuture<QueryInvoicingCustomerListResponse> queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request);

    CompletableFuture<QueryMonthlyBillResponse> queryMonthlyBill(QueryMonthlyBillRequest request);

    CompletableFuture<QueryMonthlyInstanceConsumptionResponse> queryMonthlyInstanceConsumption(QueryMonthlyInstanceConsumptionRequest request);

    CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request);

    CompletableFuture<QueryPermissionListResponse> queryPermissionList(QueryPermissionListRequest request);

    CompletableFuture<QueryPrepaidCardsResponse> queryPrepaidCards(QueryPrepaidCardsRequest request);

    CompletableFuture<QueryProductListResponse> queryProductList(QueryProductListRequest request);

    CompletableFuture<QueryRIUtilizationDetailResponse> queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request);

    CompletableFuture<QueryRedeemResponse> queryRedeem(QueryRedeemRequest request);

    CompletableFuture<QueryRelationListResponse> queryRelationList(QueryRelationListRequest request);

    CompletableFuture<QueryResellerAvailableQuotaResponse> queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request);

    CompletableFuture<QueryResourcePackageInstancesResponse> queryResourcePackageInstances(QueryResourcePackageInstancesRequest request);

    CompletableFuture<QuerySavingsPlansDeductLogResponse> querySavingsPlansDeductLog(QuerySavingsPlansDeductLogRequest request);

    CompletableFuture<QuerySavingsPlansInstanceResponse> querySavingsPlansInstance(QuerySavingsPlansInstanceRequest request);

    CompletableFuture<QuerySettleBillResponse> querySettleBill(QuerySettleBillRequest request);

    CompletableFuture<QuerySettlementBillResponse> querySettlementBill(QuerySettlementBillRequest request);

    CompletableFuture<QuerySplitItemBillResponse> querySplitItemBill(QuerySplitItemBillRequest request);

    CompletableFuture<QueryUserOmsDataResponse> queryUserOmsData(QueryUserOmsDataRequest request);

    CompletableFuture<RefundInstanceResponse> refundInstance(RefundInstanceRequest request);

    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    CompletableFuture<RelieveAccountRelationResponse> relieveAccountRelation(RelieveAccountRelationRequest request);

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
