// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.wss20211221.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "wss";
        this.version = "2021-12-21";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a> of Wuying Workspace before you call this operation.
     * &lt;props=&quot;intl&quot;&gt;Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/cloud-desktop?#J_8623712560">pricing</a> of Wuying Workspace before you call this operation.
     * If automatic payment is not specified, this operation does not process the payment. You must use the order ID returned by this operation to construct a payment redirect URL and complete the payment. The order takes effect and resources are provisioned only after the payment is completed.</p>
     * 
     * @param request the request parameters of CreateMultiOrder  CreateMultiOrderRequest
     * @return CreateMultiOrderResponse
     */
    @Override
    public CompletableFuture<CreateMultiOrderResponse> createMultiOrder(CreateMultiOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMultiOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMultiOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMultiOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Paging</strong>: Use the <code>NextToken</code> and <code>MaxResults</code> parameters for paging. Set <code>NextToken</code> to an empty character string for the first request.</li>
     * <li><strong>Filtering</strong>: Use the <code>AgentType</code> and <code>AgentIds</code> parameters to filter the returned agent list.</li>
     * <li><strong>Status filtering</strong>: Use the <code>Status</code> parameter to filter agents by status. Valid values: 0 (deleted) and 1 (active).</li>
     * <li><strong>Sorting</strong>: Results are sorted by <code>id</code> in ascending order by default.</li>
     * <li><strong>Additional parameter for anonymous edition</strong>: The <code>FillInstance</code> parameter automatically populates the bound JVS_COPILOT AgentId of the currently logged-on user.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCreditPackageAgents  DescribeCreditPackageAgentsRequest
     * @return DescribeCreditPackageAgentsResponse
     */
    @Override
    public CompletableFuture<DescribeCreditPackageAgentsResponse> describeCreditPackageAgents(DescribeCreditPackageAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCreditPackageAgents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCreditPackageAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCreditPackageAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries credit usage details based on the dimension specified by <code>UsageType</code> (User, CreditPackage, Agent, or EndUser). The response includes the total amount, remaining amount, and used amount of the current credit package, hourly consumption samples, alert thresholds, and periodic quotas.</p>
     * <ul>
     * <li><strong>User</strong>: The user dimension. Returns the total used amount and remaining amount of all active credit packages for the current user.</li>
     * <li><strong>CreditPackage</strong>: The credit package dimension. Returns the total amount, remaining amount, and consumption samples of a specified credit package instance.</li>
     * <li><strong>Agent</strong>: The agent dimension. Returns the cumulative used amount, current period used amount, quota, and alerts for a specified agent.</li>
     * <li><strong>EndUser</strong>: The Wuying user dimension. Returns the shared credit usage, pay-as-you-go credit usage, and total credit usage for the current period of a Wuying user.
     * <strong>Note</strong>:</li>
     * <li>The <code>InstanceIds</code> parameter can be omitted when <code>UsageType</code> is set to <code>User</code>. Set it to the credit package instance ID when <code>UsageType</code> is <code>CreditPackage</code>, the agent ID when <code>UsageType</code> is <code>Agent</code>, and the Wuying ID when <code>UsageType</code> is <code>EndUser</code>.</li>
     * <li>Anonymous requests support the <code>FillInstance</code> parameter. If <code>InstanceIds</code> is not explicitly provided and <code>FillInstance</code> is set to <code>true</code>, the server automatically populates the bound <code>JVS_COPILOT</code> agent ID based on the currently logged-in <code>wyId</code>.</li>
     * <li>Time window constants: The statistical window for <code>dayUsedCredit</code> is <code>now - ONE_DAY_MILLIS</code>, and the statistical window for <code>weekUsedCredit</code> is <code>now - ONE_WEEK_MILLIS</code>.</li>
     * <li>The consumption samples in <code>currentCreditConsumeList</code> are aggregated by hour and may have an asynchronous synchronization delay of up to 5 minutes.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCreditUsageInfo  DescribeCreditUsageInfoRequest
     * @return DescribeCreditUsageInfoResponse
     */
    @Override
    public CompletableFuture<DescribeCreditUsageInfoResponse> describeCreditUsageInfo(DescribeCreditUsageInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCreditUsageInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCreditUsageInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCreditUsageInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports GET and POST methods.</li>
     * <li>The <code>periods</code> parameter is in JSON array format. Each element is a <code>PeriodParam</code> object that contains the <code>periodUnit</code> and <code>baseTime</code> fields.</li>
     * <li>The <code>resourceTypes</code> parameter is in JSON array format and contains multiple resource type strings.</li>
     * <li>The <code>startTime</code> and <code>endTime</code> parameters are in timestamp format and specify the time range for the query.</li>
     * <li>Pagination parameters include <code>nextToken</code>, <code>maxResults</code>, <code>pageNo</code>, and <code>pageSize</code>, which control the number and pagination of returned results.</li>
     * <li>If the <code>resourceTypes</code> parameter contains invalid values or the <code>periods</code> parameter fails JSON parsing, a <code>SalesClientException</code> exception is thrown.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDeductionStatistic  DescribeDeductionStatisticRequest
     * @return DescribeDeductionStatisticResponse
     */
    @Override
    public CompletableFuture<DescribeDeductionStatisticResponse> describeDeductionStatistic(DescribeDeductionStatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeductionStatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeductionStatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeductionStatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDeliveryAddress  DescribeDeliveryAddressRequest
     * @return DescribeDeliveryAddressResponse
     */
    @Override
    public CompletableFuture<DescribeDeliveryAddressResponse> describeDeliveryAddress(DescribeDeliveryAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeliveryAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeliveryAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeliveryAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a> of Elastic Desktop Service.</p>
     * 
     * @param request the request parameters of DescribeGroups  DescribeGroupsRequest
     * @return DescribeGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeGroupsResponse> describeGroups(DescribeGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Filters instances by resource type, instance, and region, and uses paging to query the auto-renewal status.</p>
     * 
     * @param request the request parameters of DescribeInstanceAutoRenewalAttribute  DescribeInstanceAutoRenewalAttributeRequest
     * @return DescribeInstanceAutoRenewalAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAutoRenewalAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAutoRenewalAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product?#/gws/detail/gws">pricing</a> of Elastic Desktop Service.</p>
     * 
     * @param request the request parameters of DescribeMultiPrice  DescribeMultiPriceRequest
     * @return DescribeMultiPriceResponse
     */
    @Override
    public CompletableFuture<DescribeMultiPriceResponse> describeMultiPrice(DescribeMultiPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMultiPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMultiPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMultiPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePackageDeductions  DescribePackageDeductionsRequest
     * @return DescribePackageDeductionsResponse
     */
    @Override
    public CompletableFuture<DescribePackageDeductionsResponse> describePackageDeductions(DescribePackageDeductionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePackageDeductions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePackageDeductionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePackageDeductionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports the GET and POST methods.</li>
     * <li>The periods parameter is in JSON array format. Each element is a PeriodParam object that contains the periodUnit and baseTime fields.</li>
     * <li>The resourceTypes parameter is in JSON array format and contains multiple resource type strings.</li>
     * <li>The startTime and endTime parameters are in timestamp format and specify the time range for the query.</li>
     * <li>The pagination parameters include nextToken, maxResults, pageNo, and pageSize, which are used to control the number of returned results and pagination.</li>
     * <li>If the resourceTypes parameter contains invalid values or the JSON parsing of the periods parameter fails, a SalesClientException is thrown.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRunIdDeductions  DescribeRunIdDeductionsRequest
     * @return DescribeRunIdDeductionsResponse
     */
    @Override
    public CompletableFuture<DescribeRunIdDeductionsResponse> describeRunIdDeductions(DescribeRunIdDeductionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRunIdDeductions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRunIdDeductionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRunIdDeductionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceProperties  ModifyInstancePropertiesRequest
     * @return ModifyInstancePropertiesResponse
     */
    @Override
    public CompletableFuture<ModifyInstancePropertiesResponse> modifyInstanceProperties(ModifyInstancePropertiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceProperties").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstancePropertiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstancePropertiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use this API operation to set the credit usage quota for a specific type of Agent. Batch setting of quotas for multiple Agents is supported.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The <code>AgentType</code> parameter specifies the type of Agent for which you want to set the quota, such as <code>JVSClaw</code> or <code>OpenClaw</code>.</li>
     * <li>The <code>AgentIds</code> parameter is an array that can contain up to 100 Agent IDs.</li>
     * <li>The <code>CreditQuota</code> parameter specifies the credit usage quota for each Agent.</li>
     * </ul>
     * <h3>Examples</h3>
     * 
     * @param request the request parameters of SetAgentCreditQuota  SetAgentCreditQuotaRequest
     * @return SetAgentCreditQuotaResponse
     */
    @Override
    public CompletableFuture<SetAgentCreditQuotaResponse> setAgentCreditQuota(SetAgentCreditQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAgentCreditQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAgentCreditQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAgentCreditQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
