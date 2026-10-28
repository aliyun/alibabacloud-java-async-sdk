// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agency20221216.models.*;
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
     * @param request the request parameters of AutomaticWriteOff  AutomaticWriteOffRequest
     * @return AutomaticWriteOffResponse
     */
    CompletableFuture<AutomaticWriteOffResponse> automaticWriteOff(AutomaticWriteOffRequest request);

    /**
     * @param request the request parameters of CancelCoupon  CancelCouponRequest
     * @return CancelCouponResponse
     */
    CompletableFuture<CancelCouponResponse> cancelCoupon(CancelCouponRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that the caller is an international Alibaba Cloud master reseller partner.
     * You can unsubscribe from one type of bill file at a time.
     * After the corresponding bill type is unsubscribed, files are no longer pushed to the specified OSS space.
     * <strong>This content is published only on the international site.</strong></p>
     * 
     * @param request the request parameters of CancelSubscriptionBill  CancelSubscriptionBillRequest
     * @return CancelSubscriptionBillResponse
     */
    CompletableFuture<CancelSubscriptionBillResponse> cancelSubscriptionBill(CancelSubscriptionBillRequest request);

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * @param request the request parameters of CouponApprovalStatusList  CouponApprovalStatusListRequest
     * @return CouponApprovalStatusListResponse
     */
    CompletableFuture<CouponApprovalStatusListResponse> couponApprovalStatusList(CouponApprovalStatusListRequest request);

    /**
     * @param request the request parameters of CreateCouponTemplate  CreateCouponTemplateRequest
     * @return CreateCouponTemplateResponse
     */
    CompletableFuture<CreateCouponTemplateResponse> createCouponTemplate(CreateCouponTemplateRequest request);

    /**
     * @param request the request parameters of CreateCustomer  CreateCustomerRequest
     * @return CreateCustomerResponse
     */
    CompletableFuture<CreateCustomerResponse> createCustomer(CreateCustomerRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be a channel master distributor partner or a channel distributor partner on the Alibaba Cloud International Website.</p>
     * 
     * @param request the request parameters of CustomerQuotaRecordList  CustomerQuotaRecordListRequest
     * @return CustomerQuotaRecordListResponse
     */
    CompletableFuture<CustomerQuotaRecordListResponse> customerQuotaRecordList(CustomerQuotaRecordListRequest request);

    /**
     * @param request the request parameters of DeductOutstandingBalance  DeductOutstandingBalanceRequest
     * @return DeductOutstandingBalanceResponse
     */
    CompletableFuture<DeductOutstandingBalanceResponse> deductOutstandingBalance(DeductOutstandingBalanceRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that the current caller is a distribution partner. 
     * <notice>Available only on the China site.</notice>.</p>
     * 
     * @param request the request parameters of DeleteCouponTemplate  DeleteCouponTemplateRequest
     * @return DeleteCouponTemplateResponse
     */
    CompletableFuture<DeleteCouponTemplateResponse> deleteCouponTemplate(DeleteCouponTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international channel master distributor partner or an Alibaba Cloud international channel distributor partner.
     * <strong>This content is published only on the China site (Chinese).</strong>.</p>
     * 
     * @param request the request parameters of EditEndUserStatus  EditEndUserStatusRequest
     * @return EditEndUserStatusResponse
     */
    CompletableFuture<EditEndUserStatusResponse> editEndUserStatus(EditEndUserStatusRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud reseller partner.
     * <strong>This content is published only on the China site.</strong>.</p>
     * 
     * @param request the request parameters of EditNewBuyStatus  EditNewBuyStatusRequest
     * @return EditNewBuyStatusResponse
     */
    CompletableFuture<EditNewBuyStatusResponse> editNewBuyStatus(EditNewBuyStatusRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international channel distributor partner or an Alibaba Cloud international channel reseller partner.
     * <strong>This content is published only on the Chinese site.</strong>.</p>
     * 
     * @param request the request parameters of EditZeroCreditShutdown  EditZeroCreditShutdownRequest
     * @return EditZeroCreditShutdownResponse
     */
    CompletableFuture<EditZeroCreditShutdownResponse> editZeroCreditShutdown(EditZeroCreditShutdownRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.</p>
     * 
     * @param request the request parameters of ExportCustomerQuotaRecord  ExportCustomerQuotaRecordRequest
     * @return ExportCustomerQuotaRecordResponse
     */
    CompletableFuture<ExportCustomerQuotaRecordResponse> exportCustomerQuotaRecord(ExportCustomerQuotaRecordRequest request);

    /**
     * @param request the request parameters of ExportReversedDeductionHistory  ExportReversedDeductionHistoryRequest
     * @return ExportReversedDeductionHistoryResponse
     */
    CompletableFuture<ExportReversedDeductionHistoryResponse> exportReversedDeductionHistory(ExportReversedDeductionHistoryRequest request);

    /**
     * @param request the request parameters of GetAccountInfo  GetAccountInfoRequest
     * @return GetAccountInfoResponse
     */
    CompletableFuture<GetAccountInfoResponse> getAccountInfo(GetAccountInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * @param request the request parameters of GetCommissionableProducts  GetCommissionableProductsRequest
     * @return GetCommissionableProductsResponse
     */
    CompletableFuture<GetCommissionableProductsResponse> getCommissionableProducts(GetCommissionableProductsRequest request);

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the International site</p>
     * 
     * @param request the request parameters of GetCouponTemplateDetail  GetCouponTemplateDetailRequest
     * @return GetCouponTemplateDetailResponse
     */
    CompletableFuture<GetCouponTemplateDetailResponse> getCouponTemplateDetail(GetCouponTemplateDetailRequest request);

    /**
     * @param request the request parameters of GetCoupondeductProductCode  GetCoupondeductProductCodeRequest
     * @return GetCoupondeductProductCodeResponse
     */
    CompletableFuture<GetCoupondeductProductCodeResponse> getCoupondeductProductCode(GetCoupondeductProductCodeRequest request);

    /**
     * @param request the request parameters of GetCreditInfo  GetCreditInfoRequest
     * @return GetCreditInfoResponse
     */
    CompletableFuture<GetCreditInfoResponse> getCreditInfo(GetCreditInfoRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud International site channel master distributor partner or an Alibaba Cloud International site channel distributor partner.</p>
     * 
     * @param request the request parameters of GetCustomerOrders  GetCustomerOrdersRequest
     * @return GetCustomerOrdersResponse
     */
    CompletableFuture<GetCustomerOrdersResponse> getCustomerOrders(GetCustomerOrdersRequest request);

    /**
     * @param request the request parameters of GetDailyBill  GetDailyBillRequest
     * @return GetDailyBillResponse
     */
    CompletableFuture<GetDailyBillResponse> getDailyBill(GetDailyBillRequest request);

    /**
     * @param request the request parameters of GetInviteStatus  GetInviteStatusRequest
     * @return GetInviteStatusResponse
     */
    CompletableFuture<GetInviteStatusResponse> getInviteStatus(GetInviteStatusRequest request);

    /**
     * @param request the request parameters of GetMonthlyBill  GetMonthlyBillRequest
     * @return GetMonthlyBillResponse
     */
    CompletableFuture<GetMonthlyBillResponse> getMonthlyBill(GetMonthlyBillRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.</p>
     * 
     * @param request the request parameters of GetPurchaseControlRecord  GetPurchaseControlRecordRequest
     * @return GetPurchaseControlRecordResponse
     */
    CompletableFuture<GetPurchaseControlRecordResponse> getPurchaseControlRecord(GetPurchaseControlRecordRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.
     * <strong>This content is published only on the international site.</strong>.</p>
     * 
     * @param request the request parameters of GetShutdownPolicyRecord  GetShutdownPolicyRecordRequest
     * @return GetShutdownPolicyRecordResponse
     */
    CompletableFuture<GetShutdownPolicyRecordResponse> getShutdownPolicyRecord(GetShutdownPolicyRecordRequest request);

    /**
     * @param request the request parameters of GetTier2CouponApprovalDetail  GetTier2CouponApprovalDetailRequest
     * @return GetTier2CouponApprovalDetailResponse
     */
    CompletableFuture<GetTier2CouponApprovalDetailResponse> getTier2CouponApprovalDetail(GetTier2CouponApprovalDetailRequest request);

    /**
     * @param request the request parameters of GetUnassociatedCustomer  GetUnassociatedCustomerRequest
     * @return GetUnassociatedCustomerResponse
     */
    CompletableFuture<GetUnassociatedCustomerResponse> getUnassociatedCustomer(GetUnassociatedCustomerRequest request);

    /**
     * @param request the request parameters of InviteSubAccount  InviteSubAccountRequest
     * @return InviteSubAccountResponse
     */
    CompletableFuture<InviteSubAccountResponse> inviteSubAccount(InviteSubAccountRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>The caller of this operation must be a channel master reseller partner on Alibaba Cloud International Website.</li>
     * <li>The system automatically determines whether the invitation is cross-region based on whether the RegisterNation parameter falls within the T1 contract coverage area. You can call the ListCountries operation to query the contract coverage area.</li>
     * </ol>
     * <ul>
     * <li>If the invitation is cross-region, a cross-region invitation approval process is initiated. After Alibaba Cloud approves the request, an invitation registration email is sent to the specified email address.</li>
     * <li>If the invitation is not cross-region, an invitation registration email is sent directly.</li>
     * </ul>
     * 
     * @param request the request parameters of InviteSubReseller  InviteSubResellerRequest
     * @return InviteSubResellerResponse
     */
    CompletableFuture<InviteSubResellerResponse> inviteSubReseller(InviteSubResellerRequest request);

    /**
     * @param request the request parameters of IssueCouponForCustomer  IssueCouponForCustomerRequest
     * @return IssueCouponForCustomerResponse
     */
    CompletableFuture<IssueCouponForCustomerResponse> issueCouponForCustomer(IssueCouponForCustomerRequest request);

    /**
     * @param request the request parameters of ListCountries  ListCountriesRequest
     * @return ListCountriesResponse
     */
    CompletableFuture<ListCountriesResponse> listCountries(ListCountriesRequest request);

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * @param request the request parameters of ListCouponUsage  ListCouponUsageRequest
     * @return ListCouponUsageResponse
     */
    CompletableFuture<ListCouponUsageResponse> listCouponUsage(ListCouponUsageRequest request);

    /**
     * @param request the request parameters of ListExportTasks  ListExportTasksRequest
     * @return ListExportTasksResponse
     */
    CompletableFuture<ListExportTasksResponse> listExportTasks(ListExportTasksRequest request);

    /**
     * @param request the request parameters of ListTier2CouponApproval  ListTier2CouponApprovalRequest
     * @return ListTier2CouponApprovalResponse
     */
    CompletableFuture<ListTier2CouponApprovalResponse> listTier2CouponApproval(ListTier2CouponApprovalRequest request);

    /**
     * @param request the request parameters of ProcessApproval  ProcessApprovalRequest
     * @return ProcessApprovalResponse
     */
    CompletableFuture<ProcessApprovalResponse> processApproval(ProcessApprovalRequest request);

    /**
     * @param request the request parameters of QueryAutomaticWriteOffChangeRecords  QueryAutomaticWriteOffChangeRecordsRequest
     * @return QueryAutomaticWriteOffChangeRecordsResponse
     */
    CompletableFuture<QueryAutomaticWriteOffChangeRecordsResponse> queryAutomaticWriteOffChangeRecords(QueryAutomaticWriteOffChangeRecordsRequest request);

    /**
     * @param request the request parameters of QueryReversedDeductionHistory  QueryReversedDeductionHistoryRequest
     * @return QueryReversedDeductionHistoryResponse
     */
    CompletableFuture<QueryReversedDeductionHistoryResponse> queryReversedDeductionHistory(QueryReversedDeductionHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud International site channel master distributor partner or an Alibaba Cloud International site channel distributor partner.</p>
     * 
     * @param request the request parameters of QuotaListExportPaged  QuotaListExportPagedRequest
     * @return QuotaListExportPagedResponse
     */
    CompletableFuture<QuotaListExportPagedResponse> quotaListExportPaged(QuotaListExportPagedRequest request);

    /**
     * @param request the request parameters of ResendEmail  ResendEmailRequest
     * @return ResendEmailResponse
     */
    CompletableFuture<ResendEmailResponse> resendEmail(ResendEmailRequest request);

    /**
     * @param request the request parameters of SetAccountInfo  SetAccountInfoRequest
     * @return SetAccountInfoResponse
     */
    CompletableFuture<SetAccountInfoResponse> setAccountInfo(SetAccountInfoRequest request);

    /**
     * @param request the request parameters of SetCreditLine  SetCreditLineRequest
     * @return SetCreditLineResponse
     */
    CompletableFuture<SetCreditLineResponse> setCreditLine(SetCreditLineRequest request);

    /**
     * @param request the request parameters of SetWarningThreshold  SetWarningThresholdRequest
     * @return SetWarningThresholdResponse
     */
    CompletableFuture<SetWarningThresholdResponse> setWarningThreshold(SetWarningThresholdRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Ensure that the caller is an Alibaba Cloud international master reseller partner.</li>
     * <li>A user can subscribe to one type of bill file at a time.</li>
     * <li>After subscription, bill files generated on the previous day are pushed daily starting from the next day. On the 5th of each month, full bill files for the previous billing cycle are pushed.</li>
     * <li>Bill files generated on a daily basis may be delayed. Delayed bill files are pushed the day after they are generated and may include bills that were delayed from earlier days. Pull the full files for the previous month at the beginning of each month.</li>
     * <li>Grant the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the subscribing user.</li>
     * <li>File names.</li>
     * </ul>
     * <pre><code class="language-.">BillingItemDetailForBillingPeriod   (Billing item detail)
     *   
     * Daily push file name format: UID_PartnerBillingItemDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_BillingItemDetail_20190310_0001_01.
     *   
     * Full file name format at the beginning of the next month: UID_PartnerBillingItemDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetail_201903_0001_01.
     * InstanceDetailForBillingPeriod  (Instance bill detail)
     *  
     *  Daily push file name format: UID_PartnerInstanceDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_InstanceDetail_20190310_0001_01.
     *   
     * Full file name format at the beginning of the next month: UID_PartnerInstanceDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetail_201903_1999-0001_01.
     * BillingItemDetailMonthly   (Billing item monthly bill)
     *   
     * Daily push file name format: UID_PartnerBillingItemDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetailMonthly_201903_0001_01. This file is updated daily with full data from the beginning of the month to the current day, until the 5th of the next month.
     * InstanceDetailMonthly  (Instance monthly bill)
     *   
     * Daily push file name format: UID_PartnerInstanceDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetailMonthly_201903_0001_01. This file is updated daily with full data from the beginning of the month to the current day, until the 5th of the next month.
     * fileNo exists only when the number of bill rows reaches the split threshold and the file is split.
     * </code></pre>
     * <p><strong>This content is published only on the Chinese site.</strong>.</p>
     * 
     * @param request the request parameters of SubscriptionBill  SubscriptionBillRequest
     * @return SubscriptionBillResponse
     */
    CompletableFuture<SubscriptionBillResponse> subscriptionBill(SubscriptionBillRequest request);

}
