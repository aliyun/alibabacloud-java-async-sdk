// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bssopenapi20171214.models.*;
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
     * <b>description</b> :
     * <p>For more information about a financial relationship, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/116383.html">Usage notes on the trusteeship</a>. 
     * If enterprise names used by the management account and a member for real-name verification are the same, you do not need to call an API operation for confirmation. Otherwise, you must call the ConfirmRelation operation for confirmation.</p>
     * 
     * @param request the request parameters of AddAccountRelation  AddAccountRelationRequest
     * @return AddAccountRelationResponse
     */
    CompletableFuture<AddAccountRelationResponse> addAccountRelation(AddAccountRelationRequest request);

    /**
     * @param request the request parameters of AllocateCostUnitResource  AllocateCostUnitResourceRequest
     * @return AllocateCostUnitResourceResponse
     */
    CompletableFuture<AllocateCostUnitResourceResponse> allocateCostUnitResource(AllocateCostUnitResourceRequest request);

    /**
     * @param request the request parameters of ApplyInvoice  ApplyInvoiceRequest
     * @return ApplyInvoiceResponse
     */
    CompletableFuture<ApplyInvoiceResponse> applyInvoice(ApplyInvoiceRequest request);

    /**
     * @param request the request parameters of CancelOrder  CancelOrderRequest
     * @return CancelOrderResponse
     */
    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    /**
     * @param request the request parameters of ChangeResellerConsumeAmount  ChangeResellerConsumeAmountRequest
     * @return ChangeResellerConsumeAmountResponse
     */
    CompletableFuture<ChangeResellerConsumeAmountResponse> changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request);

    /**
     * <b>description</b> :
     * <p>1\. A member needs to confirm an invitation only if a financial management relationship is established between the management account and the member and enterprise names used by the management account and the member for real-name verification are different. 2. The permissions to be confirmed must be the same as those granted to the member when the management account initiates the invitation.</p>
     * 
     * @param request the request parameters of ConfirmRelation  ConfirmRelationRequest
     * @return ConfirmRelationResponse
     */
    CompletableFuture<ConfirmRelationResponse> confirmRelation(ConfirmRelationRequest request);

    /**
     * @param request the request parameters of ConvertChargeType  ConvertChargeTypeRequest
     * @return ConvertChargeTypeResponse
     */
    CompletableFuture<ConvertChargeTypeResponse> convertChargeType(ConvertChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create an account so as to establish a master-member financial relationship.</p>
     * 
     * @param request the request parameters of CreateAgAccount  CreateAgAccountRequest
     * @return CreateAgAccountResponse
     */
    CompletableFuture<CreateAgAccountResponse> createAgAccount(CreateAgAccountRequest request);

    /**
     * @param request the request parameters of CreateCostUnit  CreateCostUnitRequest
     * @return CreateCostUnitResponse
     */
    CompletableFuture<CreateCostUnitResponse> createCostUnit(CreateCostUnitRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateResellerUserQuota  CreateResellerUserQuotaRequest
     * @return CreateResellerUserQuotaResponse
     */
    CompletableFuture<CreateResellerUserQuotaResponse> createResellerUserQuota(CreateResellerUserQuotaRequest request);

    /**
     * @param request the request parameters of CreateResourcePackage  CreateResourcePackageRequest
     * @return CreateResourcePackageResponse
     */
    CompletableFuture<CreateResourcePackageResponse> createResourcePackage(CreateResourcePackageRequest request);

    /**
     * @param request the request parameters of CreateSavingsPlansInstance  CreateSavingsPlansInstanceRequest
     * @return CreateSavingsPlansInstanceResponse
     */
    CompletableFuture<CreateSavingsPlansInstanceResponse> createSavingsPlansInstance(CreateSavingsPlansInstanceRequest request);

    /**
     * @param request the request parameters of DeleteCostUnit  DeleteCostUnitRequest
     * @return DeleteCostUnitResponse
     */
    CompletableFuture<DeleteCostUnitResponse> deleteCostUnit(DeleteCostUnitRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is in beta testing and is only available for specific users in the whitelist. Excessive calls may result in performance issues. For example, the response times out.</p>
     * 
     * @param request the request parameters of DescribeCostBudgetsSummary  DescribeCostBudgetsSummaryRequest
     * @return DescribeCostBudgetsSummaryResponse
     */
    CompletableFuture<DescribeCostBudgetsSummaryResponse> describeCostBudgetsSummary(DescribeCostBudgetsSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.</p>
     * 
     * @param request the request parameters of DescribeInstanceAmortizedCostByAmortizationPeriod  DescribeInstanceAmortizedCostByAmortizationPeriodRequest
     * @return DescribeInstanceAmortizedCostByAmortizationPeriodResponse
     */
    CompletableFuture<DescribeInstanceAmortizedCostByAmortizationPeriodResponse> describeInstanceAmortizedCostByAmortizationPeriod(DescribeInstanceAmortizedCostByAmortizationPeriodRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAmortizedCostByAmortizationPeriodDate  DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest
     * @return DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse
     */
    CompletableFuture<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse> describeInstanceAmortizedCostByAmortizationPeriodDate(DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAmortizedCostByConsumePeriod  DescribeInstanceAmortizedCostByConsumePeriodRequest
     * @return DescribeInstanceAmortizedCostByConsumePeriodResponse
     */
    CompletableFuture<DescribeInstanceAmortizedCostByConsumePeriodResponse> describeInstanceAmortizedCostByConsumePeriod(DescribeInstanceAmortizedCostByConsumePeriodRequest request);

    /**
     * <b>description</b> :
     * <p>  Instance bills are generated after the total bill is split. In most cases, the instance bills do not include data generated on the last day of the specified billing cycle.</p>
     * <ul>
     * <li>The instance information may change during the billing cycle. The instance configurations and types in monthly bills are subject to the point in time when you query bills. For more information, see the corresponding bill details.</li>
     * <li>You can query data generated after June 2020 for Cloud Communications services. You can query data generated after November 2020 for Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceBill  DescribeInstanceBillRequest
     * @return DescribeInstanceBillResponse
     */
    CompletableFuture<DescribeInstanceBillResponse> describeInstanceBill(DescribeInstanceBillRequest request);

    /**
     * @param request the request parameters of DescribeInstanceDeductAmortizedCostByAmortizationPeriod  DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest
     * @return DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse
     */
    CompletableFuture<DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse> describeInstanceDeductAmortizedCostByAmortizationPeriod(DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest request);

    /**
     * @param request the request parameters of DescribePricingModule  DescribePricingModuleRequest
     * @return DescribePricingModuleResponse
     */
    CompletableFuture<DescribePricingModuleResponse> describePricingModule(DescribePricingModuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.</p>
     * 
     * @param request the request parameters of DescribeProductAmortizedCostByAmortizationPeriod  DescribeProductAmortizedCostByAmortizationPeriodRequest
     * @return DescribeProductAmortizedCostByAmortizationPeriodResponse
     */
    CompletableFuture<DescribeProductAmortizedCostByAmortizationPeriodResponse> describeProductAmortizedCostByAmortizationPeriod(DescribeProductAmortizedCostByAmortizationPeriodRequest request);

    /**
     * @param request the request parameters of DescribeProductAmortizedCostByConsumePeriod  DescribeProductAmortizedCostByConsumePeriodRequest
     * @return DescribeProductAmortizedCostByConsumePeriodResponse
     */
    CompletableFuture<DescribeProductAmortizedCostByConsumePeriodResponse> describeProductAmortizedCostByConsumePeriod(DescribeProductAmortizedCostByConsumePeriodRequest request);

    /**
     * <b>description</b> :
     * <p>1\. The queried coverage details are the same as those displayed in the table on the Coverage tab of the Manage Reserved Instances page in the Billing Management console.
     * 2\. You can call this operation to query the coverage details of RIs or SCUs.
     * 3\. You can call this operation to query coverage details at an hourly, daily, or monthly granularity.</p>
     * 
     * @param request the request parameters of DescribeResourceCoverageDetail  DescribeResourceCoverageDetailRequest
     * @return DescribeResourceCoverageDetailResponse
     */
    CompletableFuture<DescribeResourceCoverageDetailResponse> describeResourceCoverageDetail(DescribeResourceCoverageDetailRequest request);

    /**
     * <b>description</b> :
     * <p>The queried total coverage data is the same as the aggregated data displayed on the Coverage tab of the Manage Reserved Instances page in the Billing Management console.
     * You can call this operation to query the total coverage data of RIs or SCUs.</p>
     * 
     * @param request the request parameters of DescribeResourceCoverageTotal  DescribeResourceCoverageTotalRequest
     * @return DescribeResourceCoverageTotalResponse
     */
    CompletableFuture<DescribeResourceCoverageTotalResponse> describeResourceCoverageTotal(DescribeResourceCoverageTotalRequest request);

    /**
     * @param request the request parameters of DescribeResourcePackageProduct  DescribeResourcePackageProductRequest
     * @return DescribeResourcePackageProductResponse
     */
    CompletableFuture<DescribeResourcePackageProductResponse> describeResourcePackageProduct(DescribeResourcePackageProductRequest request);

    /**
     * @param request the request parameters of DescribeResourceUsageDetail  DescribeResourceUsageDetailRequest
     * @return DescribeResourceUsageDetailResponse
     */
    CompletableFuture<DescribeResourceUsageDetailResponse> describeResourceUsageDetail(DescribeResourceUsageDetailRequest request);

    /**
     * @param request the request parameters of DescribeResourceUsageTotal  DescribeResourceUsageTotalRequest
     * @return DescribeResourceUsageTotalResponse
     */
    CompletableFuture<DescribeResourceUsageTotalResponse> describeResourceUsageTotal(DescribeResourceUsageTotalRequest request);

    /**
     * @param request the request parameters of DescribeSavingsPlansCoverageDetail  DescribeSavingsPlansCoverageDetailRequest
     * @return DescribeSavingsPlansCoverageDetailResponse
     */
    CompletableFuture<DescribeSavingsPlansCoverageDetailResponse> describeSavingsPlansCoverageDetail(DescribeSavingsPlansCoverageDetailRequest request);

    /**
     * @param request the request parameters of DescribeSavingsPlansCoverageTotal  DescribeSavingsPlansCoverageTotalRequest
     * @return DescribeSavingsPlansCoverageTotalResponse
     */
    CompletableFuture<DescribeSavingsPlansCoverageTotalResponse> describeSavingsPlansCoverageTotal(DescribeSavingsPlansCoverageTotalRequest request);

    /**
     * @param request the request parameters of DescribeSavingsPlansUsageDetail  DescribeSavingsPlansUsageDetailRequest
     * @return DescribeSavingsPlansUsageDetailResponse
     */
    CompletableFuture<DescribeSavingsPlansUsageDetailResponse> describeSavingsPlansUsageDetail(DescribeSavingsPlansUsageDetailRequest request);

    /**
     * @param request the request parameters of DescribeSavingsPlansUsageTotal  DescribeSavingsPlansUsageTotalRequest
     * @return DescribeSavingsPlansUsageTotalResponse
     */
    CompletableFuture<DescribeSavingsPlansUsageTotalResponse> describeSavingsPlansUsageTotal(DescribeSavingsPlansUsageTotalRequest request);

    /**
     * <b>description</b> :
     * <p>  The data that you query by calling this operation is the same as the data that is queried by billing cycles in the Split Bill module of Cost Allocation.</p>
     * <ul>
     * <li>You can query split bills that were generated within the last 12 months by calling this operation.</li>
     * <li>You can query split bills only after you enable the <a href="https://usercenter2-intl.aliyun.com/finance/split-bill">Split Bill</a> service in the User Center console.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSplitItemBill  DescribeSplitItemBillRequest
     * @return DescribeSplitItemBillResponse
     */
    CompletableFuture<DescribeSplitItemBillResponse> describeSplitItemBill(DescribeSplitItemBillRequest request);

    /**
     * @param request the request parameters of GetAccountRelation  GetAccountRelationRequest
     * @return GetAccountRelationResponse
     */
    CompletableFuture<GetAccountRelationResponse> getAccountRelation(GetAccountRelationRequest request);

    /**
     * @param request the request parameters of GetCustomerAccountInfo  GetCustomerAccountInfoRequest
     * @return GetCustomerAccountInfoResponse
     */
    CompletableFuture<GetCustomerAccountInfoResponse> getCustomerAccountInfo(GetCustomerAccountInfoRequest request);

    /**
     * <b>description</b> :
     * <p>The system queries the IDs of customers of a VNO based on the AccessKey pair used in the request.</p>
     * 
     * @param request the request parameters of GetCustomerList  GetCustomerListRequest
     * @return GetCustomerListResponse
     */
    CompletableFuture<GetCustomerListResponse> getCustomerList(GetCustomerListRequest request);

    /**
     * @param request the request parameters of GetOrderDetail  GetOrderDetailRequest
     * @return GetOrderDetailResponse
     */
    CompletableFuture<GetOrderDetailResponse> getOrderDetail(GetOrderDetailRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ol>
     * <li>Call the QueryProductList operation to obtain the code of the service. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">QueryProductList</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the service. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a>.</li>
     * <li>Call the GetPayAsYouGoPrice operation to obtain the pay-as-you-go price of the service based on the returned configuration parameters.</li>
     * </ol>
     * 
     * @param request the request parameters of GetPayAsYouGoPrice  GetPayAsYouGoPriceRequest
     * @return GetPayAsYouGoPriceResponse
     */
    CompletableFuture<GetPayAsYouGoPriceResponse> getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request);

    /**
     * @param request the request parameters of GetResourcePackagePrice  GetResourcePackagePriceRequest
     * @return GetResourcePackagePriceResponse
     */
    CompletableFuture<GetResourcePackagePriceResponse> getResourcePackagePrice(GetResourcePackagePriceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>Call the QueryProductList operation to obtain the code of the service. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">QueryProductList</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the service. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a>.</li>
     * <li>Call the GetSubscriptionPrice operation to obtain the pricing of the service based on the returned configuration parameters.</li>
     * </ol>
     * 
     * @param request the request parameters of GetSubscriptionPrice  GetSubscriptionPriceRequest
     * @return GetSubscriptionPriceResponse
     */
    CompletableFuture<GetSubscriptionPriceResponse> getSubscriptionPrice(GetSubscriptionPriceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li><strong>Check the information about unsubscription and confirm the unsubscription terms and refundable amount. The resource that is unsubscribed cannot be restored.</strong></li>
     * <li>Refunds are applicable only for the actual paid amount. Vouchers used for the purchase are non-refundable.</li>
     * <li>For more information, see <a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Rules for unsubscribing from resources</a>.</li>
     * </ol>
     * 
     * @param request the request parameters of InquiryPriceRefundInstance  InquiryPriceRefundInstanceRequest
     * @return InquiryPriceRefundInstanceResponse
     */
    CompletableFuture<InquiryPriceRefundInstanceResponse> inquiryPriceRefundInstance(InquiryPriceRefundInstanceRequest request);

    /**
     * @param request the request parameters of ModifyAccountRelation  ModifyAccountRelationRequest
     * @return ModifyAccountRelationResponse
     */
    CompletableFuture<ModifyAccountRelationResponse> modifyAccountRelation(ModifyAccountRelationRequest request);

    /**
     * @param request the request parameters of ModifyCostUnit  ModifyCostUnitRequest
     * @return ModifyCostUnitResponse
     */
    CompletableFuture<ModifyCostUnitResponse> modifyCostUnit(ModifyCostUnitRequest request);

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    /**
     * @param request the request parameters of QueryAccountBalance  QueryAccountBalanceRequest
     * @return QueryAccountBalanceResponse
     */
    CompletableFuture<QueryAccountBalanceResponse> queryAccountBalance(QueryAccountBalanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Account bills are summarized based on instance bills. In most cases, the account bills do not include the data generated on the last day of the specified period.</li>
     * <li>You can query the data generated in June 2020 or later for Cloud Communications services. However, the query results do not include the data of Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryAccountBill  QueryAccountBillRequest
     * @return QueryAccountBillResponse
     */
    CompletableFuture<QueryAccountBillResponse> queryAccountBill(QueryAccountBillRequest request);

    /**
     * @param request the request parameters of QueryAccountTransactionDetails  QueryAccountTransactionDetailsRequest
     * @return QueryAccountTransactionDetailsResponse
     */
    CompletableFuture<QueryAccountTransactionDetailsResponse> queryAccountTransactionDetails(QueryAccountTransactionDetailsRequest request);

    /**
     * @param request the request parameters of QueryAccountTransactions  QueryAccountTransactionsRequest
     * @return QueryAccountTransactionsResponse
     */
    CompletableFuture<QueryAccountTransactionsResponse> queryAccountTransactions(QueryAccountTransactionsRequest request);

    /**
     * @param request the request parameters of QueryAvailableInstances  QueryAvailableInstancesRequest
     * @return QueryAvailableInstancesResponse
     */
    CompletableFuture<QueryAvailableInstancesResponse> queryAvailableInstances(QueryAvailableInstancesRequest request);

    /**
     * @param request the request parameters of QueryBill  QueryBillRequest
     * @return QueryBillResponse
     */
    CompletableFuture<QueryBillResponse> queryBill(QueryBillRequest request);

    /**
     * @param request the request parameters of QueryBillOverview  QueryBillOverviewRequest
     * @return QueryBillOverviewResponse
     */
    CompletableFuture<QueryBillOverviewResponse> queryBillOverview(QueryBillOverviewRequest request);

    /**
     * @param request the request parameters of QueryBillToOSSSubscription  QueryBillToOSSSubscriptionRequest
     * @return QueryBillToOSSSubscriptionResponse
     */
    CompletableFuture<QueryBillToOSSSubscriptionResponse> queryBillToOSSSubscription(QueryBillToOSSSubscriptionRequest request);

    /**
     * @param request the request parameters of QueryCashCoupons  QueryCashCouponsRequest
     * @return QueryCashCouponsResponse
     */
    CompletableFuture<QueryCashCouponsResponse> queryCashCoupons(QueryCashCouponsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a service based on the service code.</p>
     * 
     * @param request the request parameters of QueryCommodityList  QueryCommodityListRequest
     * @return QueryCommodityListResponse
     */
    CompletableFuture<QueryCommodityListResponse> queryCommodityList(QueryCommodityListRequest request);

    /**
     * @param request the request parameters of QueryCostUnit  QueryCostUnitRequest
     * @return QueryCostUnitResponse
     */
    CompletableFuture<QueryCostUnitResponse> queryCostUnit(QueryCostUnitRequest request);

    /**
     * @param request the request parameters of QueryCostUnitResource  QueryCostUnitResourceRequest
     * @return QueryCostUnitResourceResponse
     */
    CompletableFuture<QueryCostUnitResourceResponse> queryCostUnitResource(QueryCostUnitResourceRequest request);

    /**
     * @param request the request parameters of QueryCustomerAddressList  QueryCustomerAddressListRequest
     * @return QueryCustomerAddressListResponse
     */
    CompletableFuture<QueryCustomerAddressListResponse> queryCustomerAddressList(QueryCustomerAddressListRequest request);

    /**
     * <b>description</b> :
     * <p>Limits:</p>
     * <ul>
     * <li>Only the usage records within the past year can be queried.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryDPUtilizationDetail  QueryDPUtilizationDetailRequest
     * @return QueryDPUtilizationDetailResponse
     */
    CompletableFuture<QueryDPUtilizationDetailResponse> queryDPUtilizationDetail(QueryDPUtilizationDetailRequest request);

    /**
     * @param request the request parameters of QueryEvaluateList  QueryEvaluateListRequest
     * @return QueryEvaluateListResponse
     */
    CompletableFuture<QueryEvaluateListResponse> queryEvaluateList(QueryEvaluateListRequest request);

    /**
     * @param request the request parameters of QueryFinancialAccountInfo  QueryFinancialAccountInfoRequest
     * @return QueryFinancialAccountInfoResponse
     */
    CompletableFuture<QueryFinancialAccountInfoResponse> queryFinancialAccountInfo(QueryFinancialAccountInfoRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <ul>
     * <li>This API operation has been upgraded to DescribeInstanceBill. We recommend that you call the <a href="https://help.aliyun.com/document_detail/209402.html">DescribeInstanceBill</a> operation to query the bills of instances or billable items in a billing cycle. You can call the QueryInstanceBill operation to query a maximum of 50,000 data rows in a bill.</li>
     * <li>Instance bills are generated after bills are split. In most cases, the instance bills do not include data generated on the last day of the specified period.</li>
     * <li>The instance information changes within a billing cycle. The instance configurations and specifications and the time when the instance was used in the billing cycle are all recorded. For more information, see the corresponding bill details.</li>
     * <li>You can query the data generated in June 2020 or later for Cloud Communications services, and the data generated in November 2020 or later for Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryInstanceBill  QueryInstanceBillRequest
     * @return QueryInstanceBillResponse
     */
    CompletableFuture<QueryInstanceBillResponse> queryInstanceBill(QueryInstanceBillRequest request);

    /**
     * @param request the request parameters of QueryInstanceByTag  QueryInstanceByTagRequest
     * @return QueryInstanceByTagResponse
     */
    CompletableFuture<QueryInstanceByTagResponse> queryInstanceByTag(QueryInstanceByTagRequest request);

    /**
     * @param request the request parameters of QueryInstanceGaapCost  QueryInstanceGaapCostRequest
     * @return QueryInstanceGaapCostResponse
     */
    CompletableFuture<QueryInstanceGaapCostResponse> queryInstanceGaapCost(QueryInstanceGaapCostRequest request);

    /**
     * @param request the request parameters of QueryInvoicingCustomerList  QueryInvoicingCustomerListRequest
     * @return QueryInvoicingCustomerListResponse
     */
    CompletableFuture<QueryInvoicingCustomerListResponse> queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request);

    /**
     * @param request the request parameters of QueryOrders  QueryOrdersRequest
     * @return QueryOrdersResponse
     */
    CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request);

    /**
     * @param request the request parameters of QueryPermissionList  QueryPermissionListRequest
     * @return QueryPermissionListResponse
     */
    CompletableFuture<QueryPermissionListResponse> queryPermissionList(QueryPermissionListRequest request);

    /**
     * @param request the request parameters of QueryPrepaidCards  QueryPrepaidCardsRequest
     * @return QueryPrepaidCardsResponse
     */
    CompletableFuture<QueryPrepaidCardsResponse> queryPrepaidCards(QueryPrepaidCardsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the billable items of a service. A billable item is the minimum unit used to calculate costs.</p>
     * 
     * @param request the request parameters of QueryPriceEntityList  QueryPriceEntityListRequest
     * @return QueryPriceEntityListResponse
     */
    CompletableFuture<QueryPriceEntityListResponse> queryPriceEntityList(QueryPriceEntityListRequest request);

    /**
     * @param request the request parameters of QueryProductList  QueryProductListRequest
     * @return QueryProductListResponse
     */
    CompletableFuture<QueryProductListResponse> queryProductList(QueryProductListRequest request);

    /**
     * @param request the request parameters of QueryRIUtilizationDetail  QueryRIUtilizationDetailRequest
     * @return QueryRIUtilizationDetailResponse
     */
    CompletableFuture<QueryRIUtilizationDetailResponse> queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request);

    /**
     * @param request the request parameters of QueryRedeem  QueryRedeemRequest
     * @return QueryRedeemResponse
     */
    CompletableFuture<QueryRedeemResponse> queryRedeem(QueryRedeemRequest request);

    /**
     * @param request the request parameters of QueryRelationList  QueryRelationListRequest
     * @return QueryRelationListResponse
     */
    CompletableFuture<QueryRelationListResponse> queryRelationList(QueryRelationListRequest request);

    /**
     * @param request the request parameters of QueryResellerAvailableQuota  QueryResellerAvailableQuotaRequest
     * @return QueryResellerAvailableQuotaResponse
     */
    CompletableFuture<QueryResellerAvailableQuotaResponse> queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request);

    /**
     * @param request the request parameters of QueryResellerUserAlarmThreshold  QueryResellerUserAlarmThresholdRequest
     * @return QueryResellerUserAlarmThresholdResponse
     */
    CompletableFuture<QueryResellerUserAlarmThresholdResponse> queryResellerUserAlarmThreshold(QueryResellerUserAlarmThresholdRequest request);

    /**
     * @param request the request parameters of QueryResourcePackageInstances  QueryResourcePackageInstancesRequest
     * @return QueryResourcePackageInstancesResponse
     */
    CompletableFuture<QueryResourcePackageInstancesResponse> queryResourcePackageInstances(QueryResourcePackageInstancesRequest request);

    /**
     * @param request the request parameters of QuerySavingsPlansDeductLog  QuerySavingsPlansDeductLogRequest
     * @return QuerySavingsPlansDeductLogResponse
     */
    CompletableFuture<QuerySavingsPlansDeductLogResponse> querySavingsPlansDeductLog(QuerySavingsPlansDeductLogRequest request);

    /**
     * @param request the request parameters of QuerySavingsPlansDiscount  QuerySavingsPlansDiscountRequest
     * @return QuerySavingsPlansDiscountResponse
     */
    CompletableFuture<QuerySavingsPlansDiscountResponse> querySavingsPlansDiscount(QuerySavingsPlansDiscountRequest request);

    /**
     * @param request the request parameters of QuerySavingsPlansInstance  QuerySavingsPlansInstanceRequest
     * @return QuerySavingsPlansInstanceResponse
     */
    CompletableFuture<QuerySavingsPlansInstanceResponse> querySavingsPlansInstance(QuerySavingsPlansInstanceRequest request);

    /**
     * @param request the request parameters of QuerySettleBill  QuerySettleBillRequest
     * @return QuerySettleBillResponse
     */
    CompletableFuture<QuerySettleBillResponse> querySettleBill(QuerySettleBillRequest request);

    /**
     * @param request the request parameters of QuerySkuPriceList  QuerySkuPriceListRequest
     * @return QuerySkuPriceListResponse
     */
    CompletableFuture<QuerySkuPriceListResponse> querySkuPriceList(QuerySkuPriceListRequest request);

    /**
     * <b>description</b> :
     * <p>  This API operation has been upgraded to DescribeSplitItemBill. We recommend that you call the <a href="https://help.aliyun.com/document_detail/208169.html">DescribeSplitItemBill</a> operation to query split bills. You can call the QuerySplitItemBill operation to query a maximum of 50,000 data rows in a bill.</p>
     * <ul>
     * <li>The data queried by calling the QuerySplitItemBill operation is consistent with the data that is displayed for the specified billing cycle on the Split Bill page in User Center.</li>
     * <li>You can call this operation to query split bills generated within the last 12 months.</li>
     * <li>This operation returns split bills only after you activate the <a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a> service in User Center.</li>
     * </ul>
     * 
     * @param request the request parameters of QuerySplitItemBill  QuerySplitItemBillRequest
     * @return QuerySplitItemBillResponse
     */
    CompletableFuture<QuerySplitItemBillResponse> querySplitItemBill(QuerySplitItemBillRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the usage data of an Alibaba Cloud service. Take note of the following items:</p>
     * <ul>
     * <li>The service code that you specify for querying the usage data of a specific Alibaba Cloud service must be valid. You can query the usage data by hour or by day.</li>
     * <li>The time that you specify must follow the ISO8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.<ul>
     * <li>Latency exists in data pushes. Therefore, if you set the DataType parameter to Hour, the integrity of usage data recorded in the last 24 hours can be ensured. If you set the DataType parameter to Day, the integrity of usage data recorded in the last two days can be ensured.</li>
     * <li>You can query the usage data that is recorded in the last quarter.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryUserOmsData  QueryUserOmsDataRequest
     * @return QueryUserOmsDataResponse
     */
    CompletableFuture<QueryUserOmsDataResponse> queryUserOmsData(QueryUserOmsDataRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>Refunds are applicable only for the actual paid amount. Vouchers used for the purchase are non-refundable.</li>
     * <li>Check the information about unsubscription and confirm the unsubscription terms and refundable amount. The resource that is unsubscribed cannot be restored.</li>
     * <li>For more information, see <a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Rules for unsubscribing from resources</a>.</li>
     * </ol>
     * 
     * @param request the request parameters of RefundInstance  RefundInstanceRequest
     * @return RefundInstanceResponse
     */
    CompletableFuture<RefundInstanceResponse> refundInstance(RefundInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is provided for only VNOs to release instances. If a non-specific VNO calls this operation, the request is blocked.</p>
     * 
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * @param request the request parameters of RelieveAccountRelation  RelieveAccountRelationRequest
     * @return RelieveAccountRelationResponse
     */
    CompletableFuture<RelieveAccountRelationResponse> relieveAccountRelation(RelieveAccountRelationRequest request);

    /**
     * @param request the request parameters of RenewChangeInstance  RenewChangeInstanceRequest
     * @return RenewChangeInstanceResponse
     */
    CompletableFuture<RenewChangeInstanceResponse> renewChangeInstance(RenewChangeInstanceRequest request);

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * @param request the request parameters of RenewResourcePackage  RenewResourcePackageRequest
     * @return RenewResourcePackageResponse
     */
    CompletableFuture<RenewResourcePackageResponse> renewResourcePackage(RenewResourcePackageRequest request);

    /**
     * @param request the request parameters of SetAllExpirationDay  SetAllExpirationDayRequest
     * @return SetAllExpirationDayResponse
     */
    CompletableFuture<SetAllExpirationDayResponse> setAllExpirationDay(SetAllExpirationDayRequest request);

    /**
     * @param request the request parameters of SetRenewal  SetRenewalRequest
     * @return SetRenewalResponse
     */
    CompletableFuture<SetRenewalResponse> setRenewal(SetRenewalRequest request);

    /**
     * @param request the request parameters of SetResellerUserAlarmThreshold  SetResellerUserAlarmThresholdRequest
     * @return SetResellerUserAlarmThresholdResponse
     */
    CompletableFuture<SetResellerUserAlarmThresholdResponse> setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request);

    /**
     * @param request the request parameters of SetResellerUserQuota  SetResellerUserQuotaRequest
     * @return SetResellerUserQuotaResponse
     */
    CompletableFuture<SetResellerUserQuotaResponse> setResellerUserQuota(SetResellerUserQuotaRequest request);

    /**
     * @param request the request parameters of SetResellerUserStatus  SetResellerUserStatusRequest
     * @return SetResellerUserStatusResponse
     */
    CompletableFuture<SetResellerUserStatusResponse> setResellerUserStatus(SetResellerUserStatusRequest request);

    /**
     * @param request the request parameters of SetSavingPlanUserDeductRule  SetSavingPlanUserDeductRuleRequest
     * @return SetSavingPlanUserDeductRuleResponse
     */
    CompletableFuture<SetSavingPlanUserDeductRuleResponse> setSavingPlanUserDeductRule(SetSavingPlanUserDeductRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can subscribe to only one type of bill at a time.</li>
     * <li>The bills generated on the previous day are pushed on a daily basis the next day after you subscribe to the bills. The full-data bills for the previous month are pushed on the fourth day of each month. The monthly bills in the PDF format for the previous month are pushed on the fourth day of each month.</li>
     * <li>The daily bills may be delayed. The delayed bills are pushed the next day after they are generated. The delayed bills may include the bills that should have been pushed on the previous day. We recommend that you query the full-data bills for the previous month at the beginning of each month.</li>
     * <li>The bill subscriber must have the <a href="https://ram.console.aliyun.com/#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission.</li>
     * <li>The SubscribeBillToOSS operation has the same functionality as the Save Expense Details to OSS Bucket feature in User Center.</li>
     * <li>To subscribe to the bills stored in an OSS bucket, make sure that the directory name specified for the OSS bucket conforms to the following naming rules:</li>
     * </ul>
     * <ol>
     * <li><ol>
     * <li>The directory name can contain only UTF-8 characters and cannot contain emoticons.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>Forward slashes (/) are used to separate paths and can be used to create subdirectories with ease. The directory name cannot start with a forward slash (/), a backslash (\\), or consecutive forward slashes (/).</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The name of a subdirectory cannot be set to two consecutive periods (..).</li>
     * </ol>
     * </li>
     * <li><ol start="4">
     * <li>The directory name must be 1 to 254 characters in length.</li>
     * </ol>
     * </li>
     * </ol>
     * <ul>
     * <li>File names:<ul>
     * <li><strong>BillingItemDetailForBillingPeriod</strong> (Detailed bills of billable items)<ul>
     * <li>File name format for a daily push: <code>UID_BillingItemDetail_YYYYMMDD</code>. Example: <code>169**_BillingItemDetail_20190310</code>.</li>
     * <li>File name format for a full-data push at the beginning of the next month: <code>UID_BillingItemDetail_YYYYMM</code>. Example: <code>169**_BillingItemDetail_201903</code>.</li>
     * </ul>
     * </li>
     * <li><strong>InstanceDetailForBillingPeriod</strong> (Detailed bills of instances)<ul>
     * <li>File name format for a daily push: <code>UID_InstanceDetail_YYYYMMDD</code>. Example: <code>169**_InstanceDetail_20190310</code>.</li>
     * <li>File name format for a full-data push at the beginning of the next month: <code>UID_InstanceDetail_YYYYMM</code>. Example: <code>169**_InstanceDetail_201903</code>.</li>
     * </ul>
     * </li>
     * <li><strong>InstanceDetailMonthly</strong> (Instance-based bills summarized by billing cycle)<ul>
     * <li>File name format for a daily push: <code>UID_InstanceDetailMonthly_YYYYMM</code>. Example: <code>169**_InstanceDetailMonthly_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>BillingItemDetailMonthly</strong> (Billable item-based bills summarized by billing cycle)<ul>
     * <li>File name format for a daily push: <code>UID_BillingItemDetailMonthly_YYYYMM</code>. Example: <code>169**_BillingItemDetailMonthly_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>SplitItemDetailDaily</strong> (Split bills summarized by day)<ul>
     * <li>File name format for a daily push: <code>UID_SplitItemDetailDaily_YYYYMM</code>. Example: <code>169**_SplitItemDetailDaily_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>MonthBill</strong> (Monthly bill in the PDF format)<ul>
     * <li>File name format for a monthly push: <code>UID_MonthBill_YYYYMM</code>. Example: <code>169**_MonthBill_201903</code>. The bill for the previous month is pushed on the fourth day of each month.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>The bills of the MonthBill type are PDF files, whereas the bills of other types are CSV files. If the number of data rows in a bill exceeds a threshold, the bill is automatically split into multiple CSV files. Then, the multiple CSV files are automatically merged and compressed into a ZIP file that has the same name format as the original file.</li>
     * </ul>
     * 
     * @param request the request parameters of SubscribeBillToOSS  SubscribeBillToOSSRequest
     * @return SubscribeBillToOSSResponse
     */
    CompletableFuture<SubscribeBillToOSSResponse> subscribeBillToOSS(SubscribeBillToOSSRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnsubscribeBillToOSS  UnsubscribeBillToOSSRequest
     * @return UnsubscribeBillToOSSResponse
     */
    CompletableFuture<UnsubscribeBillToOSSResponse> unsubscribeBillToOSS(UnsubscribeBillToOSSRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpgradeResourcePackage  UpgradeResourcePackageRequest
     * @return UpgradeResourcePackageResponse
     */
    CompletableFuture<UpgradeResourcePackageResponse> upgradeResourcePackage(UpgradeResourcePackageRequest request);

}
