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
     * <b>description</b> :
     * <p>Deducts user quota consumption.</p>
     * 
     * @param request the request parameters of ChangeResellerConsumeAmount  ChangeResellerConsumeAmountRequest
     * @return ChangeResellerConsumeAmountResponse
     */
    CompletableFuture<ChangeResellerConsumeAmountResponse> changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>Currently, only financial management linking is supported. The linked account needs to confirm the invitation only when the real-name verification information of the main account and the linked account is inconsistent.</li>
     * <li>The permissions to be confirmed must be exactly the same as the permissions specified in the invitation initiated by the main account for the confirmation to succeed.</li>
     * </ol>
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
     * <p>Creates a master-member relationship for financial management.</p>
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
     * <p>This OpenAPI is in beta and available only to whitelisted users. Excessive calls may cause performance issues, such as response timeouts.</p>
     * 
     * @param request the request parameters of DescribeCostBudgetsSummary  DescribeCostBudgetsSummaryRequest
     * @return DescribeCostBudgetsSummaryResponse
     */
    CompletableFuture<DescribeCostBudgetsSummaryResponse> describeCostBudgetsSummary(DescribeCostBudgetsSummaryRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Amortized costs cannot be used for settlement or reconciliation. They are used to allocate your subscription and pay-as-you-go fees based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. The reason for this delay is that scenarios such as delayed billing, refunds, bill adjustments, and overdue payment write-offs can occur during the month. The data for the current month does not include unsettled pay-as-you-go fees for which bills have not yet been generated.</li>
     * <li>Amortized cost data from the last 12 months is available.</li>
     * <li>Data for attached resources is reflected in the amortized costs 48 hours after the split bill is generated. To use this feature, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data for items that are not attached resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs are not updated intra-month. They are updated only after 12:00 on the sixth day of the following month. Consequently, specific costs for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available for these months.</li>
     * <li>Amortized cost data is available for querying 48 hours after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature.</li>
     * </ul>
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
     * <b>description</b> :
     * <ul>
     * <li>Amortized costs are not used for settlement or reconciliation. They are used to allocate your cloud expenses, including both subscription and pay-as-you-go fees, based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. This delay accounts for events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs. Data for the current month does not include unsettled pay-as-you-go fees.</li>
     * <li>Amortized cost data is available for the past 12 months.</li>
     * <li>Data for attached resources in the amortized costs is updated 48 hours after the split bill is generated. To view the costs of attached resources, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data for other resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs are not updated mid-month. They are updated only after 12:00 on the sixth day of the following month. In addition, specific costs for attached resources, such as domain names, buckets, and EIPs, of products such as CDN, OSS, and Internet Shared Bandwidth, are not provided for this period.</li>
     * <li>Amortized cost data is available only after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Costs</a> feature. The data becomes available 48 hours after enablement.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceAmortizedCostByConsumePeriod  DescribeInstanceAmortizedCostByConsumePeriodRequest
     * @return DescribeInstanceAmortizedCostByConsumePeriodResponse
     */
    CompletableFuture<DescribeInstanceAmortizedCostByConsumePeriodResponse> describeInstanceAmortizedCostByConsumePeriod(DescribeInstanceAmortizedCostByConsumePeriodRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The query results for the current month are for reference only and cannot be used as the basis for reconciliation. The final bill for the current month can be viewed or exported after 12:00 on the 3rd day of the next month. During the month, a few scenarios may occur, including but not limited to delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>The bill data for the current month does not include unsettled pay-as-you-go data that is unbilled or accumulating.</li>
     * <li>Data for the last 18 months is supported. </li>
     * <li>Bill data is updated with a 24-hour delay compared to actual consumption. Information related to the instance ID, such as instance configuration, instance type, instance alias, resource group, public IP address, private IP address, and zone, is updated with a 48-hour delay.  </li>
     * <li>Bill data does not provide the specific costs of individual split items, such as domain names, buckets, and EIPs, for split-type cloud services, such as CDN, OSS, and Internet Shared Bandwidth. To view data that includes split items, go to the split bill page.</li>
     * <li>For cloud communication products, only detail data from June 2020 onwards is supported. For HiChina products, including domain names and trademarks, only detail data from November 2020 onwards is supported.</li>
     * <li>The rate limit is 10 requests per second per user. If a timeout occurs, retry the request.</li>
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
     * <ul>
     * <li>Amortized costs are for cost allocation purposes only and cannot be used for settlement or reconciliation. This feature allocates your cloud expenses, including both subscription and pay-as-you-go fees, based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. Data for the current month is not final. This is because it does not include unsettled pay-as-you-go fees and may change due to events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>Amortized cost data for the past 12 months is available.</li>
     * <li>Data for attached resources, which requires you to enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>, is updated 48 hours after the split bill is generated. Data for other resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs were not updated during the month. They were updated only after 12:00 on the sixth day of the following month. In addition, cost details for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available for this period.</li>
     * <li>Amortized cost data becomes available 48 hours after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeProductAmortizedCostByAmortizationPeriod  DescribeProductAmortizedCostByAmortizationPeriodRequest
     * @return DescribeProductAmortizedCostByAmortizationPeriodResponse
     */
    CompletableFuture<DescribeProductAmortizedCostByAmortizationPeriodResponse> describeProductAmortizedCostByAmortizationPeriod(DescribeProductAmortizedCostByAmortizationPeriodRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Amortized costs are used for cost allocation and cannot be used for settlement or reconciliation. This feature allocates your cloud expenses, including both subscription and pay-as-you-go fees, based on specified rules.</li>
     * <li>The final data for a given month is available after 12:00 on the sixth day of the following month. This delay ensures that potential mid-month events, such as delayed billing, refunds, bill adjustments, and overdue payment write-offs, are included. Data for the current month does not include unsettled pay-as-you-go fees that have not yet been billed or are still accumulating.</li>
     * <li>Amortized cost data for the past 12 months is available.</li>
     * <li>Data related to attached resources is updated in the amortized costs 48 hours after the corresponding split bill is generated. To view the costs of attached resources, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data that is not related to attached resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs were not updated mid-month and were only updated after 12:00 on the sixth day of the following month. Additionally, for this period, specific costs for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available.</li>
     * <li>Amortized cost data is provided only after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature. The data is available 48 hours after you enable it.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeProductAmortizedCostByConsumePeriod  DescribeProductAmortizedCostByConsumePeriodRequest
     * @return DescribeProductAmortizedCostByConsumePeriodResponse
     */
    CompletableFuture<DescribeProductAmortizedCostByConsumePeriodResponse> describeProductAmortizedCostByConsumePeriod(DescribeProductAmortizedCostByConsumePeriodRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>The data is consistent with the list data in the Coverage Overview section of the Resource Instance Management menu in the User Center.</li>
     * <li>Currently, coverage queries are supported for reserved instances (RIs) and storage capacity units (SCUs).</li>
     * <li>Coverage queries are provided in three dimensions: hour, day, and month.</li>
     * </ol>
     * 
     * @param request the request parameters of DescribeResourceCoverageDetail  DescribeResourceCoverageDetailRequest
     * @return DescribeResourceCoverageDetailResponse
     */
    CompletableFuture<DescribeResourceCoverageDetailResponse> describeResourceCoverageDetail(DescribeResourceCoverageDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the same summary data as the Coverage Overview in the Resource Instance Management menu of the User Center.
     * Currently, coverage queries are supported for two resource types: reserved instances (RIs) and storage capacity units (SCUs).</p>
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
     * <ul>
     * <li>The query results for the current month\&quot;s split bills are for reference only and cannot be used as the basis for reconciliation. The final bill for the current month can be queried after 12:00 on the 4th day of the next month. The split bill data for the current month does not include unsettled pay-as-you-go data (unbilled or being accumulated).</li>
     * <li>Split bill data is available for the last 12 months.</li>
     * <li>Split bill data is updated with a 48-hour delay compared to actual expenses. For split cloud services (such as CDN, OSS, and Internet Shared Bandwidth), the specific expenses for each attached resource (such as domain names, buckets, and EIPs) are updated with a 72-hour delay.</li>
     * <li>Split bill data is available only after you enable the feature on the &lt;props=&quot;china&quot;&gt;<a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a>&lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/finance/split-bill">Split Bill</a> page in the console. The data becomes available 24 hours after you enable the feature.</li>
     * <li>The rate limit is 10 requests per second per user. If a timeout occurs, retry the request.</li>
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
     * <p>The system queries the list of associated end customer UIDs based on the AccessKey pair in the request.</p>
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
     * <h3>Operation description</h3>
     * <ol>
     * <li>Call QueryProductList to obtain the product code. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">Query product information</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of a product. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">Query pricing module information</a>.</li>
     * <li>Call this operation with the obtained product configuration parameters to query the price of a pay-as-you-go product.</li>
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
     * <li>Call QueryProductList to obtain the product code. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">Query product information</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the product. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">Query product module information</a>.</li>
     * <li>Call this operation to query the prices of subscription products based on the obtained product configuration parameters.</li>
     * <li>Concatenate the Config parameter under ModuleList based on the config parameter returned by the DescribePricingModule operation. Do not omit any parameters. Otherwise, an error occurs during the price inquiry.</li>
     * </ol>
     * 
     * @param request the request parameters of GetSubscriptionPrice  GetSubscriptionPriceRequest
     * @return GetSubscriptionPriceResponse
     */
    CompletableFuture<GetSubscriptionPriceResponse> getSubscriptionPrice(GetSubscriptionPriceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li><strong>Carefully verify the information about the resource to be unsubscribed, and confirm the unsubscription terms and refund amount. Resources cannot be recovered after unsubscription.</strong></li>
     * <li>Only the actual paid amount is refunded. Used vouchers are not refunded.</li>
     * <li>For other questions, refer to: &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/knowledge_detail/116043.html?spm=a2c81.e1d666e.app.2.62ae11271Kd6iM">Refund rules</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Refund rules for Alibaba Cloud International Website</a></li>
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
     * @param request the request parameters of PayOrder  PayOrderRequest
     * @return PayOrderResponse
     */
    CompletableFuture<PayOrderResponse> payOrder(PayOrderRequest request);

    /**
     * @param request the request parameters of QueryAccountBalance  QueryAccountBalanceRequest
     * @return QueryAccountBalanceResponse
     */
    CompletableFuture<QueryAccountBalanceResponse> queryAccountBalance(QueryAccountBalanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Data for the current month is for reference only. Do not use it for reconciliation. The final bill for the current month is available to view or export after 12:00 on the third day of the next month. This delay accounts for mid-month events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>Data from the last 18 months is available.</li>
     * <li>Billing data is updated 24 hours after actual resource consumption. Information related to instance IDs, such as instance configurations, instance types, instance nicknames, resource groups, public IP addresses, private IP addresses, and zones, is updated with a 48-hour delay.</li>
     * <li>Billing data does not include the costs of attached resources, such as domain names, buckets, and elastic IP addresses (EIPs), for products such as CDN, OSS, and Internet Shared Bandwidth. To view statistics that include data for attached resources, go to Split Bill.</li>
     * <li>For Alibaba Cloud Communications products, detailed data is available only from June 2020 onwards. For HiChina products, such as Domain Names and trademarks, detailed data is available only from November 2020 onwards.</li>
     * <li>Each account is limited to 10 queries per second. If a timeout occurs, retry the request.</li>
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
     * <p>Retrieves a list of commodity information based on a product code.</p>
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
     * <li>Only usage records from the past year are supported.</li>
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
     * <h2>API description</h2>
     * <p>Note the following when you call this operation:</p>
     * <ul>
     * <li>The API for instance bills has been upgraded. We recommend that you use the new operation <a href="https://help.aliyun.com/document_detail/209402.html">DescribeInstanceBill</a>. This operation no longer supports querying data beyond the 50,000th row.</li>
     * <li>Instance bills are generated based on split billing data. A delay of about one day may occur.</li>
     * <li>Instance information may change within a billing cycle. The instance Config and Spec in the monthly summary reflect the information at the time the record was generated. For more information, see the corresponding detailed bill.</li>
     * <li>Data for Alibaba Cloud Communications products is available from June 2020. Data for HiChina products is available from November 2020.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>For the international site (alibabacloud.com), select Singapore as the endpoint.</li>
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
     * <p>Queries the pricing entities under a commodity. A pricing entity is the smallest product capability used for metering and cost calculation.</p>
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
     * <b>description</b> :
     * <p>Queries the alarm thresholds for low quotas.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>The query results for the current month are for reference only and cannot be used for reconciliation. The final bill for the current month is available for viewing or export after 12:00 on the 2nd of the following month. During the month, a few scenarios may occur, including but not limited to delayed billing, refunds, adjustments, and overdue payment write-offs.</li>
     * <li>Bill data is updated with a 5-hour delay relative to actual cost consumption.</li>
     * <li>For bills in the &quot;Unsettled&quot; state in historical billing cycles, the status is updated to settled 5 hours after payment. For bills in the &quot;Unsettled&quot; state in the current month, the status is updated to settled when the bill is generated at 12:00 on the 2nd of the following month.</li>
     * <li>This API supports graceful backoff with a request rate of 600/60(s).</li>
     * <li>The rate limit per user is 10 requests per second. If a timeout occurs, retry the request.</li>
     * </ul>
     * 
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
     * <ul>
     * <li>The API for split bills is upgraded. We recommend that you use the new <a href="https://help.aliyun.com/document_detail/208169.html">DescribeSplitItemBill</a> operation. This operation no longer supports querying more than 50,000 rows of data.</li>
     * <li>The data is consistent with the split bill data for the specified billing cycle in the User Center.</li>
     * <li>You can query split bills that were generated within the last 12 months.</li>
     * <li>To use this feature, you must first enable it on the <a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a> page in the console.</li>
     * </ul>
     * 
     * @param request the request parameters of QuerySplitItemBill  QuerySplitItemBillRequest
     * @return QuerySplitItemBillResponse
     */
    CompletableFuture<QuerySplitItemBillResponse> querySplitItemBill(QuerySplitItemBillRequest request);

    /**
     * <b>description</b> :
     * <h2>API description</h2>
     * <ul>
     * <li>The specified cloud service parameter must be one of the following cloud service codes. The metering data types include hourly and daily.</li>
     * <li>The time format must comply with the ISO 8601 standard. Time specification constraints:<ul>
     * <li>   Due to delays in data push, the data integrity of hourly metering data is guaranteed for the past 24 hours, and the data integrity of daily metering data is guaranteed for the past 2 days.</li>
     * <li>   The time span can cover the metering data of the most recent quarter.</li>
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
     * <li>Only the actual paid amount is refunded. Used vouchers are not refunded.</li>
     * <li>Carefully verify the information about the resource to be unsubscribed, and confirm the unsubscription terms and refund amount. Resources cannot be recovered after unsubscription.</li>
     * <li>This operation can be called only by direct customers. Reseller customers cannot use this operation.</li>
     * <li>For other questions, refer to: &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/knowledge_detail/116043.html?spm=a2c81.e1d666e.app.2.62ae11271Kd6iM">Refund policy</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Refund rules for Alibaba Cloud International site</a></li>
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
     * <b>description</b> :
     * <p>Configures low-balance alert rules for quotas.</p>
     * 
     * @param request the request parameters of SetResellerUserAlarmThreshold  SetResellerUserAlarmThresholdRequest
     * @return SetResellerUserAlarmThresholdResponse
     */
    CompletableFuture<SetResellerUserAlarmThresholdResponse> setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request);

    /**
     * <b>description</b> :
     * <p>设置用户配额账本的Quota额度</p>
     * 
     * @param request the request parameters of SetResellerUserQuota  SetResellerUserQuotaRequest
     * @return SetResellerUserQuotaResponse
     */
    CompletableFuture<SetResellerUserQuotaResponse> setResellerUserQuota(SetResellerUserQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>Sets the status of a reseller\&quot;s user account, such as frozen or hosted.</p>
     * 
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
     * <p>Before calling this operation, note the following information:</p>
     * <ul>
     * <li>You can subscribe to one type of bill file at a time.</li>
     * <li>After subscription, the bill file generated on the previous day is pushed daily starting from the next day. On the 4th of each month, the full bill files for the entire billing cycle of the previous month are pushed. The monthly bill PDF is pushed on the 4th of each month for the previous month.</li>
     * <li>Bill files generated on a daily basis may be delayed. Delayed bills are pushed the day after they are generated and may include bills from earlier days that were delayed until the previous day. Pull the full files for the previous month at the beginning of each month.<blockquote>
     * <p>To use OSS subscription for the first time, grant the <a href="https://ram.console.aliyun.com/#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the subscribing user. If the authorization is revoked, the system stops pushing files, and the user must re-authorize.</p>
     * </blockquote>
     * </li>
     * <li>This subscription is the same feature as &quot;Bill Data Storage&quot; in the Expenses and Costs console. Subscriptions are synchronized between the two.</li>
     * <li>When subscribing to a directory under a bucket, follow the directory naming conventions:<ul>
     * <li>Emojis are not allowed. Use valid UTF-8 characters.</li>
     * <li>Use / to separate paths and quickly create subdirectories. Do not start with / or \, and do not use consecutive / characters.</li>
     * <li>A subdirectory named .. is not allowed.</li>
     * <li>The total length must be 1 to 254 characters.</li>
     * </ul>
     * </li>
     * <li>File names:<ul>
     * <li><p><strong>BillingItemDetailForBillingPeriod</strong> (billing item details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>UID_BillingItemDetail_YYYYMMDD</code>, for example, <code>169**_BillingItemDetail_20190310</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>UID_BillingItemDetail_YYYYMM</code>, for example, <code>169**_BillingItemDetail_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>InstanceDetailForBillingPeriod</strong> (instance bill details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>UID_InstanceDetail_YYYYMMDD</code>, for example, <code>169**_InstanceDetail_20190310</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>UID_InstanceDetail_YYYYMM</code>, for example, <code>169**_InstanceDetail_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>InstanceDetailMonthly</strong> (instance bill summary by billing cycle)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_InstanceDetailMonthly_YYYYMM</code>, for example, <code>169**_InstanceDetailMonthly_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>BillingItemDetailMonthly</strong> (billing item summary by billing cycle)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_BillingItemDetailMonthly_YYYYMM</code>, for example, <code>169**_BillingItemDetailMonthly_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>SplitItemDetailDaily</strong> (split bill daily summary)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_SplitItemDetailDaily_YYYYMM</code>, for example, <code>169**_SplitItemDetailDaily_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>MonthBill</strong> (monthly bill PDF)</p>
     * <ul>
     * <li>Monthly push file name format: <code>UID_MonthBill_YYYYMM</code>, for example, <code>169**_MonthBill_201903</code>. The file for the previous month is pushed on the 4th of each month.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Except for MonthBill, which is a PDF file, all other file types are CSV files. If the number of rows in a bill file exceeds a certain threshold, the file is automatically split into multiple CSV files, which are then compressed into a single ZIP file. The ZIP file name follows the same format.</li>
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
