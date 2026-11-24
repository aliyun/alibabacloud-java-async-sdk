// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.market20151101.models.*;
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
     * @param request the request parameters of ActivateLicense  ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    CompletableFuture<ActivateLicenseResponse> activateLicense(ActivateLicenseRequest request);

    /**
     * @param request the request parameters of AutoRenewInstance  AutoRenewInstanceRequest
     * @return AutoRenewInstanceResponse
     */
    CompletableFuture<AutoRenewInstanceResponse> autoRenewInstance(AutoRenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Confirms the receipt of a subscription notification failure message.</p>
     * <ul>
     * <li>After a successful call, the message will no longer be returned in subsequent queries. The platform considers that the merchant has correctly processed the message.</li>
     * </ul>
     * 
     * @param request the request parameters of ConfirmNotification  ConfirmNotificationRequest
     * @return ConfirmNotificationResponse
     */
    CompletableFuture<ConfirmNotificationResponse> confirmNotification(ConfirmNotificationRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you fully understand the billing method and <a href="https://market.aliyun.com/">pricing</a> of Alibaba Cloud Marketplace products.
     * To create an order for a commercial image, refer to <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a>.</p>
     * 
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
     * @param request the request parameters of CrossAccountVerifyToken  CrossAccountVerifyTokenRequest
     * @return CrossAccountVerifyTokenResponse
     */
    CompletableFuture<CrossAccountVerifyTokenResponse> crossAccountVerifyToken(CrossAccountVerifyTokenRequest request);

    /**
     * <b>description</b> :
     * <h3><strong>Note: This API operation supports Alibaba Cloud accounts and RAM users in retrieving API quota, total capacity, and usage information.</strong></h3>
     * 
     * @param request the request parameters of DescribeApiMetering  DescribeApiMeteringRequest
     * @return DescribeApiMeteringResponse
     */
    CompletableFuture<DescribeApiMeteringResponse> describeApiMetering(DescribeApiMeteringRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCurrentNodeInfo  DescribeCurrentNodeInfoRequest
     * @return DescribeCurrentNodeInfoResponse
     */
    CompletableFuture<DescribeCurrentNodeInfoResponse> describeCurrentNodeInfo(DescribeCurrentNodeInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation by using a promotion service provider account.</p>
     * 
     * @param request the request parameters of DescribeDistributionProducts  DescribeDistributionProductsRequest
     * @return DescribeDistributionProductsResponse
     */
    CompletableFuture<DescribeDistributionProductsResponse> describeDistributionProducts(DescribeDistributionProductsRequest request);

    /**
     * <b>description</b> :
     * <p>Call this operation by using a promotion service provider account. Calls from non-promotion service provider accounts will fail.</p>
     * 
     * @param request the request parameters of DescribeDistributionProductsLink  DescribeDistributionProductsLinkRequest
     * @return DescribeDistributionProductsLinkResponse
     */
    CompletableFuture<DescribeDistributionProductsLinkResponse> describeDistributionProductsLink(DescribeDistributionProductsLinkRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the information about failed subscription notifications for a service provider.</p>
     * <ul>
     * <li>If no unconfirmed failed notifications exist, TotalCount returns 0.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFailedNotifications  DescribeFailedNotificationsRequest
     * @return DescribeFailedNotificationsResponse
     */
    CompletableFuture<DescribeFailedNotificationsResponse> describeFailedNotifications(DescribeFailedNotificationsRequest request);

    /**
     * @param request the request parameters of DescribeImageInstanceForIsv  DescribeImageInstanceForIsvRequest
     * @return DescribeImageInstanceForIsvResponse
     */
    CompletableFuture<DescribeImageInstanceForIsvResponse> describeImageInstanceForIsv(DescribeImageInstanceForIsvRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeInstanceForIsv  DescribeInstanceForIsvRequest
     * @return DescribeInstanceForIsvResponse
     */
    CompletableFuture<DescribeInstanceForIsvResponse> describeInstanceForIsv(DescribeInstanceForIsvRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries business information based on an authorization code and first verifies whether the authorization code is valid.</p>
     * <ul>
     * <li>If the authorization code is invalid, an error message is returned.</li>
     * <li>If the authorization code is valid, the authorization information is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvoiceForIsv  DescribeInvoiceForIsvRequest
     * @return DescribeInvoiceForIsvResponse
     */
    CompletableFuture<DescribeInvoiceForIsvResponse> describeInvoiceForIsv(DescribeInvoiceForIsvRequest request);

    /**
     * @param request the request parameters of DescribeLicense  DescribeLicenseRequest
     * @return DescribeLicenseResponse
     */
    CompletableFuture<DescribeLicenseResponse> describeLicense(DescribeLicenseRequest request);

    /**
     * @param request the request parameters of DescribeOrder  DescribeOrderRequest
     * @return DescribeOrderResponse
     */
    CompletableFuture<DescribeOrderResponse> describeOrder(DescribeOrderRequest request);

    /**
     * @param request the request parameters of DescribeOrderForIsv  DescribeOrderForIsvRequest
     * @return DescribeOrderForIsvResponse
     */
    CompletableFuture<DescribeOrderForIsvResponse> describeOrderForIsv(DescribeOrderForIsvRequest request);

    /**
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
     * @param request the request parameters of DescribeProduct  DescribeProductRequest
     * @return DescribeProductResponse
     */
    CompletableFuture<DescribeProductResponse> describeProduct(DescribeProductRequest request);

    /**
     * @param request the request parameters of DescribeProducts  DescribeProductsRequest
     * @return DescribeProductsResponse
     */
    CompletableFuture<DescribeProductsResponse> describeProducts(DescribeProductsRequest request);

    /**
     * @param request the request parameters of DescribeProjectAttachments  DescribeProjectAttachmentsRequest
     * @return DescribeProjectAttachmentsResponse
     */
    CompletableFuture<DescribeProjectAttachmentsResponse> describeProjectAttachments(DescribeProjectAttachmentsRequest request);

    /**
     * @param request the request parameters of DescribeProjectInfo  DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     */
    CompletableFuture<DescribeProjectInfoResponse> describeProjectInfo(DescribeProjectInfoRequest request);

    /**
     * @param request the request parameters of DescribeProjectMessages  DescribeProjectMessagesRequest
     * @return DescribeProjectMessagesResponse
     */
    CompletableFuture<DescribeProjectMessagesResponse> describeProjectMessages(DescribeProjectMessagesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeProjectNodes  DescribeProjectNodesRequest
     * @return DescribeProjectNodesResponse
     */
    CompletableFuture<DescribeProjectNodesResponse> describeProjectNodes(DescribeProjectNodesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeProjectOperateLogs  DescribeProjectOperateLogsRequest
     * @return DescribeProjectOperateLogsResponse
     */
    CompletableFuture<DescribeProjectOperateLogsResponse> describeProjectOperateLogs(DescribeProjectOperateLogsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of FinishCurrentProjectNode  FinishCurrentProjectNodeRequest
     * @return FinishCurrentProjectNodeResponse
     */
    CompletableFuture<FinishCurrentProjectNodeResponse> finishCurrentProjectNode(FinishCurrentProjectNodeRequest request);

    /**
     * <b>description</b> :
     * <p>Queries information about failed subscription notifications for merchants.</p>
     * <ul>
     * <li>If no unconfirmed notification failure information exists, TotalCount returns 0.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInvoiceForIsv  ModifyInvoiceForIsvRequest
     * @return ModifyInvoiceForIsvResponse
     */
    CompletableFuture<ModifyInvoiceForIsvResponse> modifyInvoiceForIsv(ModifyInvoiceForIsvRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of PauseProject  PauseProjectRequest
     * @return PauseProjectResponse
     */
    CompletableFuture<PauseProjectResponse> pauseProject(PauseProjectRequest request);

    /**
     * <b>description</b> :
     * <h3>Encoding and format requirements</h3>
     * <ul>
     * <li>All request parameters must be URL-encoded.</li>
     * <li>Ensure that the Metering field in the parameters is submitted strictly according to the examples in the documentation. In the past, many submissions were not valid JSON fields. You can use a JSON formatting tool to check the field before submission. Otherwise, the API call will fail.</li>
     * </ul>
     * <h3>Request frequency and single write volume limits</h3>
     * <ul>
     * <li>For hourly or daily metering: Alibaba Cloud Marketplace limits requests to once every 60 seconds per InstanceId, and each request supports writing up to 100 metering data records.</li>
     * <li>For real-time metering (for large model scenarios): Alibaba Cloud Marketplace has no frequency limit for requests per InstanceId, and each request supports writing up to 10 metering data records.</li>
     * </ul>
     * <h3>Limits on batch pushing of metering data</h3>
     * <ul>
     * <li>Batch pushing across InstanceIds of different products is not supported. When pushing in batches, ensure that all InstanceIds belong to the same product.</li>
     * <li>When pushing metering data in batches, the InstanceId attribute must belong to instances generated by the same product. Pushing instances of multiple products at the same time is not supported.</li>
     * </ul>
     * <h3>Time requirements for pushing metering data</h3>
     * <ul>
     * <li>For products billed hourly, the billing cutoff time is the next hour, and metering data must be pushed on time. For example, if the metering data is for 08:10 to 08:20, it must be pushed before 09:59. Otherwise, no bill will be generated. The rule for daily billing is similar: the data for the previous day must be pushed before 01:59 the next day. Otherwise, an error will be reported when pushing the metering data, and no bill will be generated.</li>
     * <li>For products billed by the minute, real-time pushed data is aggregated by the minute, and bills are generated by the minute.</li>
     * <li>If a product is set to real-time billing, StartTime and EndTime can be of any time width, but EndTime must be greater than StartTime.</li>
     * <li>If a product is set to non-real-time billing (such as hourly or daily), the interval between StartTime and EndTime must be greater than 5 minutes.</li>
     * </ul>
     * <h3>Timeliness of pushing data and billing</h3>
     * <ul>
     * <li>If the instance status is expired, metering data pushed after the expiration will not be billed. For example, if an instance expires at 2025-07-09 12:20:00, the metering data pushed for the hour from 2025-07-09 13:00:00 to 2025-07-09 14:00:00 will not be billed. However, the metering data for the hour from 2025-07-09 12:00:00 to 2025-07-09 13:00:00 can still be billed normally.</li>
     * <li>After metering data is pushed, bills are not generated immediately. For hourly billing, the bill is generated in the next time interval. For example, the bill for 08:00 to 09:00 is generated after 10:00. For daily billing, the bill is generated the next day. After the bill is generated, customers can view it in <a href="https://billing-cost.console.aliyun.com/finance/expense-report/expense-detail-by-instance">Alibaba Cloud Bill Details</a>.</li>
     * </ul>
     * <h3>Rounding down of amounts</h3>
     * <ul>
     * <li>If the bill amount is too small and a single bill amount is less than 0.01 CNY, the bill amount for the buyer is 0. For example, if the unit price of a product is 0.001 CNY per time and it is billed by the minute, and 9 times are consumed every minute, the bill amount per minute is 0. If it is billed hourly and the bill amount for a single hour is less than 0.01 CNY, the bill amount for the buyer is 0. The probability of rounding down to zero for minute-level billing may be higher than that for hourly billing.</li>
     * </ul>
     * 
     * @param request the request parameters of PushMeteringData  PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    CompletableFuture<PushMeteringDataResponse> pushMeteringData(PushMeteringDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation applies to prepaid pay-per-use products. Service providers can use this operation to push user usage deductions to Alibaba Cloud Marketplace.</li>
     * <li>This operation uses a forced update mode to directly deduct the specified number of uses. The caller must determine whether the user\&quot;s usage exceeds the limit.</li>
     * <li>All request parameters must be URL-encoded.</li>
     * <li>Use the <code>ClientToken</code> parameter to ensure idempotence. The same <code>ClientToken</code> cannot be submitted repeatedly within 24 hours.</li>
     * <li>Retries for the same deduction operation must use the same <code>ClientToken</code>. New operations must use a new <code>ClientToken</code>.</li>
     * <li>If the previous request succeeded, even if no response was received due to a gateway timeout, a retry with the same <code>ClientToken</code> returns a success response idempotently without duplicate deductions.</li>
     * <li>If the result of the previous request is undetermined and the request is in the PROCESSING state, a retry with the same <code>ClientToken</code> returns a <code>DuplicateClientToken</code> error. Retry later or contact Alibaba Cloud Marketplace to confirm the push status.</li>
     * <li>Only one operation can be executed for the same <code>InstanceId</code> at a time. Concurrent requests return a <code>Throttling</code> error. Retry later.</li>
     * <li>You can directly call this operation in <a href="https://api.aliyun.com/#product=Market&api=PushTimesUsage&type=RPC&version=2015-11-01">OpenAPI Explorer</a> without the need to manually calculate the signature.</li>
     * </ul>
     * 
     * @param request the request parameters of PushTimesUsage  PushTimesUsageRequest
     * @return PushTimesUsageResponse
     */
    CompletableFuture<PushTimesUsageResponse> pushTimesUsage(PushTimesUsageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of ResumeProject  ResumeProjectRequest
     * @return ResumeProjectResponse
     */
    CompletableFuture<ResumeProjectResponse> resumeProject(ResumeProjectRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * @param request the request parameters of RollbackCurrentProjectNode  RollbackCurrentProjectNodeRequest
     * @return RollbackCurrentProjectNodeResponse
     */
    CompletableFuture<RollbackCurrentProjectNodeResponse> rollbackCurrentProjectNode(RollbackCurrentProjectNodeRequest request);

}
