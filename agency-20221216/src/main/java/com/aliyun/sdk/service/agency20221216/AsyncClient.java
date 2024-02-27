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
      * Make sure that you are a distributor of the Alibaba Cloud international ecosystem.
      * You can call this operation to cancel the subscription to only one type of bill at a time.
      * After the subscription to a type of bill is canceled, bills of this type are no longer pushed to the specified Object Storage Service (OSS) bucket.
      * **This topic is published only on the international site (alibabacloud.com).
      *
     */
    CompletableFuture<CancelSubscriptionBillResponse> cancelSubscriptionBill(CancelSubscriptionBillRequest request);

    CompletableFuture<CreateCustomerResponse> createCustomer(CreateCustomerRequest request);

    CompletableFuture<CustomerQuotaRecordListResponse> customerQuotaRecordList(CustomerQuotaRecordListRequest request);

    /**
      * Note that sometimes you may find that the customer\\"s Used Credit is negative. This indicates that there is no need to restore the Used Credit, and its ready for customer\\"s usage. This phenomenon occurs because a refund is generated while the customer\\"s credit is full, thereby triggered additional increasing on the customer\\"s credit.
      * For example, if the customer\\"s maximum Available Credit is 1000 with no usage, and a refund of 300 occurs, the Used Credit will become -300.
      *
     */
    CompletableFuture<DeductOutstandingBalanceResponse> deductOutstandingBalance(DeductOutstandingBalanceRequest request);

    /**
      * The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
      * **This content is only published on the international site. **
      *
     */
    CompletableFuture<EditEndUserStatusResponse> editEndUserStatus(EditEndUserStatusRequest request);

    /**
      * The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
      * **This content is only published on the international site. **
      *
     */
    CompletableFuture<EditNewBuyStatusResponse> editNewBuyStatus(EditNewBuyStatusRequest request);

    /**
      * The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
      * **This content is only published on the international site. **
      *
     */
    CompletableFuture<EditZeroCreditShutdownResponse> editZeroCreditShutdown(EditZeroCreditShutdownRequest request);

    /**
      * Caller must be a Partner from International Site, either Distribution or Reseller will do.
      *
     */
    CompletableFuture<ExportCustomerQuotaRecordResponse> exportCustomerQuotaRecord(ExportCustomerQuotaRecordRequest request);

    CompletableFuture<GetAccountInfoResponse> getAccountInfo(GetAccountInfoRequest request);

    CompletableFuture<GetCreditInfoResponse> getCreditInfo(GetCreditInfoRequest request);

    CompletableFuture<GetDailyBillResponse> getDailyBill(GetDailyBillRequest request);

    CompletableFuture<GetInviteStatusResponse> getInviteStatus(GetInviteStatusRequest request);

    CompletableFuture<GetMonthlyBillResponse> getMonthlyBill(GetMonthlyBillRequest request);

    CompletableFuture<GetUnassociatedCustomerResponse> getUnassociatedCustomer(GetUnassociatedCustomerRequest request);

    /**
      * The current API request rate for the Cloud Product has not been disclosed.
      *
     */
    CompletableFuture<InviteSubAccountResponse> inviteSubAccount(InviteSubAccountRequest request);

    /**
      * The current API request rate for cloud products has not been disclosed.
      *
     */
    CompletableFuture<ListCountriesResponse> listCountries(ListCountriesRequest request);

    /**
      * Caller must be a Partner from International Site, either Distribution or Reseller will do.
      *
     */
    CompletableFuture<QuotaListExportPagedResponse> quotaListExportPaged(QuotaListExportPagedRequest request);

    CompletableFuture<ResendEmailResponse> resendEmail(ResendEmailRequest request);

    CompletableFuture<SetAccountInfoResponse> setAccountInfo(SetAccountInfoRequest request);

    CompletableFuture<SetCreditLineResponse> setCreditLine(SetCreditLineRequest request);

    CompletableFuture<SetWarningThresholdResponse> setWarningThreshold(SetWarningThresholdRequest request);

    /**
      * *   Make sure that you are a distributor of the Alibaba Cloud international ecosystem.
      * *   You can call this operation to subscribe to only one type of bill at a time.
      * *   After the subscription to a type of bill is generated, the bill for the previous day is pushed on a daily basis from the next day. On the fifth day of each month, the full-data bill for the previous month is pushed.
      * *   A daily bill may be delayed. The delayed bill is pushed the next day after it is generated. The delayed bill may contain the bill data that is delayed until the previous day. We recommend that you query the full-data bill for the previous month at the beginning of each month.
      * *   Your account must be granted the [AliyunConsumeDump2OSSRole](https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D) permission.
      * *   The following file name formats are supported for bills:
      * ```
      * BillingItemDetailForBillingPeriod
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
      * ```
      * **This topic is published only on the international site (alibabacloud.com).
      *
     */
    CompletableFuture<SubscriptionBillResponse> subscriptionBill(SubscriptionBillRequest request);

}
