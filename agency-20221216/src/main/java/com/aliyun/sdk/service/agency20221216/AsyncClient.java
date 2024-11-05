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
     * <b>description</b> :
     * <p>Make sure that you are a distributor of the Alibaba Cloud international ecosystem.
     * You can call this operation to cancel the subscription to only one type of bill at a time.
     * After the subscription to a type of bill is canceled, bills of this type are no longer pushed to the specified Object Storage Service (OSS) bucket.
     * **This topic is published only on the international site (alibabacloud.com).</p>
     * 
     * @param request the request parameters of CancelSubscriptionBill  CancelSubscriptionBillRequest
     * @return CancelSubscriptionBillResponse
     */
    CompletableFuture<CancelSubscriptionBillResponse> cancelSubscriptionBill(CancelSubscriptionBillRequest request);

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
     * @param request the request parameters of CustomerQuotaRecordList  CustomerQuotaRecordListRequest
     * @return CustomerQuotaRecordListResponse
     */
    CompletableFuture<CustomerQuotaRecordListResponse> customerQuotaRecordList(CustomerQuotaRecordListRequest request);

    /**
     * <b>description</b> :
     * <p>Note that sometimes you may find that the customer\&quot;s Used Credit is negative. This indicates that there is no need to restore the Used Credit, and its ready for customer\&quot;s usage. This phenomenon occurs because a refund is generated while the customer\&quot;s credit is full, thereby triggered additional increasing on the customer\&quot;s credit.
     * For example, if the customer\&quot;s maximum Available Credit is 1000 with no usage, and a refund of 300 occurs, the Used Credit will become -300.</p>
     * 
     * @param request the request parameters of DeductOutstandingBalance  DeductOutstandingBalanceRequest
     * @return DeductOutstandingBalanceResponse
     */
    CompletableFuture<DeductOutstandingBalanceResponse> deductOutstandingBalance(DeductOutstandingBalanceRequest request);

    /**
     * <b>description</b> :
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * @param request the request parameters of EditEndUserStatus  EditEndUserStatusRequest
     * @return EditEndUserStatusResponse
     */
    CompletableFuture<EditEndUserStatusResponse> editEndUserStatus(EditEndUserStatusRequest request);

    /**
     * <b>description</b> :
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * @param request the request parameters of EditNewBuyStatus  EditNewBuyStatusRequest
     * @return EditNewBuyStatusResponse
     */
    CompletableFuture<EditNewBuyStatusResponse> editNewBuyStatus(EditNewBuyStatusRequest request);

    /**
     * <b>description</b> :
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * @param request the request parameters of EditZeroCreditShutdown  EditZeroCreditShutdownRequest
     * @return EditZeroCreditShutdownResponse
     */
    CompletableFuture<EditZeroCreditShutdownResponse> editZeroCreditShutdown(EditZeroCreditShutdownRequest request);

    /**
     * <b>description</b> :
     * <p>Caller must be a Partner from International Site, either Distribution or Reseller will do.</p>
     * 
     * @param request the request parameters of ExportCustomerQuotaRecord  ExportCustomerQuotaRecordRequest
     * @return ExportCustomerQuotaRecordResponse
     */
    CompletableFuture<ExportCustomerQuotaRecordResponse> exportCustomerQuotaRecord(ExportCustomerQuotaRecordRequest request);

    /**
     * @param request the request parameters of GetAccountInfo  GetAccountInfoRequest
     * @return GetAccountInfoResponse
     */
    CompletableFuture<GetAccountInfoResponse> getAccountInfo(GetAccountInfoRequest request);

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
     * @param request the request parameters of GetUnassociatedCustomer  GetUnassociatedCustomerRequest
     * @return GetUnassociatedCustomerResponse
     */
    CompletableFuture<GetUnassociatedCustomerResponse> getUnassociatedCustomer(GetUnassociatedCustomerRequest request);

    /**
     * <b>description</b> :
     * <p>The current API request rate for the Cloud Product has not been disclosed.</p>
     * 
     * @param request the request parameters of InviteSubAccount  InviteSubAccountRequest
     * @return InviteSubAccountResponse
     */
    CompletableFuture<InviteSubAccountResponse> inviteSubAccount(InviteSubAccountRequest request);

    /**
     * @param request the request parameters of IssueCouponForCustomer  IssueCouponForCustomerRequest
     * @return IssueCouponForCustomerResponse
     */
    CompletableFuture<IssueCouponForCustomerResponse> issueCouponForCustomer(IssueCouponForCustomerRequest request);

    /**
     * <b>description</b> :
     * <p>The current API request rate for cloud products has not been disclosed.</p>
     * 
     * @param request the request parameters of ListCountries  ListCountriesRequest
     * @return ListCountriesResponse
     */
    CompletableFuture<ListCountriesResponse> listCountries(ListCountriesRequest request);

    /**
     * @param request the request parameters of ListCouponUsage  ListCouponUsageRequest
     * @return ListCouponUsageResponse
     */
    CompletableFuture<ListCouponUsageResponse> listCouponUsage(ListCouponUsageRequest request);

    /**
     * <b>description</b> :
     * <p>Caller must be a Partner from International Site, either Distribution or Reseller will do.</p>
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
     * <p>  Make sure that you are a distributor of the Alibaba Cloud international ecosystem.</p>
     * <ul>
     * <li>You can call this operation to subscribe to only one type of bill at a time.</li>
     * <li>After the subscription to a type of bill is generated, the bill for the previous day is pushed on a daily basis from the next day. On the fifth day of each month, the full-data bill for the previous month is pushed.</li>
     * <li>A daily bill may be delayed. The delayed bill is pushed the next day after it is generated. The delayed bill may contain the bill data that is delayed until the previous day. We recommend that you query the full-data bill for the previous month at the beginning of each month.</li>
     * <li>Your account must be granted the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission.</li>
     * <li>The following file name formats are supported for bills:</li>
     * </ul>
     * <pre><code>BillingItemDetailForBillingPeriod
     *   
     * File name format of a daily bill: UID_PartnerBillingItemDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_BillingItemDetail_20190310_0001_01. 
     *   
     * File name format of a monthly full-data bill: UID_PartnerBillingItemDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetail_201903_0001_01. 
     * InstanceDetailForBillingPeriod
     *  
     *  File name format of a daily bill: UID_PartnerInstanceDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_InstanceDetail_20190310_0001_01. 
     *   
     * File name format of a monthly full-data bill: UID_PartnerInstanceDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetail_201903_1999-0001_01. 
     * BillingItemDetailMonthly
     *   
     * File name format of a daily bill: UID_PartnerBillingItemDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetailMonthly_201903_0001_01. This bill contains the bill data that is generated from the beginning of the current month to the fifth day of the next month. 
     * InstanceDetailMonthly
     *   
     * File name format of a daily bill: UID_PartnerInstanceDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetailMonthly_201903_0001_01. This bill contains the bill data that is generated from the beginning of the current month to the fifth day of the next month. 
     * The fileNo field exists only when the number of bill rows reaches the maximum rows in a single bill file and the bill is split into multiple files.
     * </code></pre>
     * <p>**This topic is published only on the international site (alibabacloud.com).</p>
     * 
     * @param request the request parameters of SubscriptionBill  SubscriptionBillRequest
     * @return SubscriptionBillResponse
     */
    CompletableFuture<SubscriptionBillResponse> subscriptionBill(SubscriptionBillRequest request);

}
