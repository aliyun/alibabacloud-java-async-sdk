// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.bssopenapi20171214.models.*;
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
        this.product = "BssOpenApi";
        this.version = "2017-12-14";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai", "business.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "business.aliyuncs.com"),
            new TeaPair("cn-chengdu", "business.aliyuncs.com"),
            new TeaPair("cn-edge-1", "business.aliyuncs.com"),
            new TeaPair("cn-fujian", "business.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "business.aliyuncs.com"),
            new TeaPair("cn-hongkong", "business.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "business.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "business.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "business.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "business.aliyuncs.com"),
            new TeaPair("cn-qingdao", "business.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "business.aliyuncs.com"),
            new TeaPair("cn-wuhan", "business.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "business.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "business.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "business.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "business.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "business.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "business.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "business.aliyuncs.com"),
            new TeaPair("eu-central-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "business.ap-southeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>For more information about a financial relationship, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/116383.html">Usage notes on the trusteeship</a>. 
     * If enterprise names used by the management account and a member for real-name verification are the same, you do not need to call an API operation for confirmation. Otherwise, you must call the ConfirmRelation operation for confirmation.</p>
     * 
     * @param request the request parameters of AddAccountRelation  AddAccountRelationRequest
     * @return AddAccountRelationResponse
     */
    @Override
    public CompletableFuture<AddAccountRelationResponse> addAccountRelation(AddAccountRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddAccountRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAccountRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAccountRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AllocateCostUnitResource  AllocateCostUnitResourceRequest
     * @return AllocateCostUnitResourceResponse
     */
    @Override
    public CompletableFuture<AllocateCostUnitResourceResponse> allocateCostUnitResource(AllocateCostUnitResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateCostUnitResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateCostUnitResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateCostUnitResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyInvoice  ApplyInvoiceRequest
     * @return ApplyInvoiceResponse
     */
    @Override
    public CompletableFuture<ApplyInvoiceResponse> applyInvoice(ApplyInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelOrder  CancelOrderRequest
     * @return CancelOrderResponse
     */
    @Override
    public CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResellerConsumeAmount  ChangeResellerConsumeAmountRequest
     * @return ChangeResellerConsumeAmountResponse
     */
    @Override
    public CompletableFuture<ChangeResellerConsumeAmountResponse> changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResellerConsumeAmount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResellerConsumeAmountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResellerConsumeAmountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>1\. A member needs to confirm an invitation only if a financial management relationship is established between the management account and the member and enterprise names used by the management account and the member for real-name verification are different. 2. The permissions to be confirmed must be the same as those granted to the member when the management account initiates the invitation.</p>
     * 
     * @param request the request parameters of ConfirmRelation  ConfirmRelationRequest
     * @return ConfirmRelationResponse
     */
    @Override
    public CompletableFuture<ConfirmRelationResponse> confirmRelation(ConfirmRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfirmRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConvertChargeType  ConvertChargeTypeRequest
     * @return ConvertChargeTypeResponse
     */
    @Override
    public CompletableFuture<ConvertChargeTypeResponse> convertChargeType(ConvertChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConvertChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConvertChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConvertChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create an account so as to establish a master-member financial relationship.</p>
     * 
     * @param request the request parameters of CreateAgAccount  CreateAgAccountRequest
     * @return CreateAgAccountResponse
     */
    @Override
    public CompletableFuture<CreateAgAccountResponse> createAgAccount(CreateAgAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCostUnit  CreateCostUnitRequest
     * @return CreateCostUnitResponse
     */
    @Override
    public CompletableFuture<CreateCostUnitResponse> createCostUnit(CreateCostUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCostUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCostUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCostUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResellerUserQuota  CreateResellerUserQuotaRequest
     * @return CreateResellerUserQuotaResponse
     */
    @Override
    public CompletableFuture<CreateResellerUserQuotaResponse> createResellerUserQuota(CreateResellerUserQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResellerUserQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResellerUserQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResellerUserQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResourcePackage  CreateResourcePackageRequest
     * @return CreateResourcePackageResponse
     */
    @Override
    public CompletableFuture<CreateResourcePackageResponse> createResourcePackage(CreateResourcePackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResourcePackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourcePackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourcePackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSavingsPlansInstance  CreateSavingsPlansInstanceRequest
     * @return CreateSavingsPlansInstanceResponse
     */
    @Override
    public CompletableFuture<CreateSavingsPlansInstanceResponse> createSavingsPlansInstance(CreateSavingsPlansInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSavingsPlansInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSavingsPlansInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSavingsPlansInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCostUnit  DeleteCostUnitRequest
     * @return DeleteCostUnitResponse
     */
    @Override
    public CompletableFuture<DeleteCostUnitResponse> deleteCostUnit(DeleteCostUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCostUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCostUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCostUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is in beta testing and is only available for specific users in the whitelist. Excessive calls may result in performance issues. For example, the response times out.</p>
     * 
     * @param request the request parameters of DescribeCostBudgetsSummary  DescribeCostBudgetsSummaryRequest
     * @return DescribeCostBudgetsSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeCostBudgetsSummaryResponse> describeCostBudgetsSummary(DescribeCostBudgetsSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCostBudgetsSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCostBudgetsSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCostBudgetsSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.</p>
     * 
     * @param request the request parameters of DescribeInstanceAmortizedCostByAmortizationPeriod  DescribeInstanceAmortizedCostByAmortizationPeriodRequest
     * @return DescribeInstanceAmortizedCostByAmortizationPeriodResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceAmortizedCostByAmortizationPeriodResponse> describeInstanceAmortizedCostByAmortizationPeriod(DescribeInstanceAmortizedCostByAmortizationPeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAmortizedCostByAmortizationPeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAmortizedCostByAmortizationPeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAmortizedCostByAmortizationPeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceAmortizedCostByAmortizationPeriodDate  DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest
     * @return DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse> describeInstanceAmortizedCostByAmortizationPeriodDate(DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAmortizedCostByAmortizationPeriodDate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceAmortizedCostByConsumePeriod  DescribeInstanceAmortizedCostByConsumePeriodRequest
     * @return DescribeInstanceAmortizedCostByConsumePeriodResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceAmortizedCostByConsumePeriodResponse> describeInstanceAmortizedCostByConsumePeriod(DescribeInstanceAmortizedCostByConsumePeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAmortizedCostByConsumePeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAmortizedCostByConsumePeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAmortizedCostByConsumePeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeInstanceBillResponse> describeInstanceBill(DescribeInstanceBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceDeductAmortizedCostByAmortizationPeriod  DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest
     * @return DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse> describeInstanceDeductAmortizedCostByAmortizationPeriod(DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceDeductAmortizedCostByAmortizationPeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePricingModule  DescribePricingModuleRequest
     * @return DescribePricingModuleResponse
     */
    @Override
    public CompletableFuture<DescribePricingModuleResponse> describePricingModule(DescribePricingModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePricingModule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePricingModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePricingModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.</p>
     * 
     * @param request the request parameters of DescribeProductAmortizedCostByAmortizationPeriod  DescribeProductAmortizedCostByAmortizationPeriodRequest
     * @return DescribeProductAmortizedCostByAmortizationPeriodResponse
     */
    @Override
    public CompletableFuture<DescribeProductAmortizedCostByAmortizationPeriodResponse> describeProductAmortizedCostByAmortizationPeriod(DescribeProductAmortizedCostByAmortizationPeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProductAmortizedCostByAmortizationPeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProductAmortizedCostByAmortizationPeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProductAmortizedCostByAmortizationPeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeProductAmortizedCostByConsumePeriod  DescribeProductAmortizedCostByConsumePeriodRequest
     * @return DescribeProductAmortizedCostByConsumePeriodResponse
     */
    @Override
    public CompletableFuture<DescribeProductAmortizedCostByConsumePeriodResponse> describeProductAmortizedCostByConsumePeriod(DescribeProductAmortizedCostByConsumePeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProductAmortizedCostByConsumePeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProductAmortizedCostByConsumePeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProductAmortizedCostByConsumePeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>1\. The queried coverage details are the same as those displayed in the table on the Coverage tab of the Manage Reserved Instances page in the Billing Management console.
     * 2\. You can call this operation to query the coverage details of RIs or SCUs.
     * 3\. You can call this operation to query coverage details at an hourly, daily, or monthly granularity.</p>
     * 
     * @param request the request parameters of DescribeResourceCoverageDetail  DescribeResourceCoverageDetailRequest
     * @return DescribeResourceCoverageDetailResponse
     */
    @Override
    public CompletableFuture<DescribeResourceCoverageDetailResponse> describeResourceCoverageDetail(DescribeResourceCoverageDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceCoverageDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceCoverageDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceCoverageDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queried total coverage data is the same as the aggregated data displayed on the Coverage tab of the Manage Reserved Instances page in the Billing Management console.
     * You can call this operation to query the total coverage data of RIs or SCUs.</p>
     * 
     * @param request the request parameters of DescribeResourceCoverageTotal  DescribeResourceCoverageTotalRequest
     * @return DescribeResourceCoverageTotalResponse
     */
    @Override
    public CompletableFuture<DescribeResourceCoverageTotalResponse> describeResourceCoverageTotal(DescribeResourceCoverageTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceCoverageTotal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceCoverageTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceCoverageTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeResourcePackageProduct  DescribeResourcePackageProductRequest
     * @return DescribeResourcePackageProductResponse
     */
    @Override
    public CompletableFuture<DescribeResourcePackageProductResponse> describeResourcePackageProduct(DescribeResourcePackageProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourcePackageProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourcePackageProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourcePackageProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeResourceUsageDetail  DescribeResourceUsageDetailRequest
     * @return DescribeResourceUsageDetailResponse
     */
    @Override
    public CompletableFuture<DescribeResourceUsageDetailResponse> describeResourceUsageDetail(DescribeResourceUsageDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceUsageDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceUsageDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceUsageDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeResourceUsageTotal  DescribeResourceUsageTotalRequest
     * @return DescribeResourceUsageTotalResponse
     */
    @Override
    public CompletableFuture<DescribeResourceUsageTotalResponse> describeResourceUsageTotal(DescribeResourceUsageTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceUsageTotal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceUsageTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceUsageTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSavingsPlansCoverageDetail  DescribeSavingsPlansCoverageDetailRequest
     * @return DescribeSavingsPlansCoverageDetailResponse
     */
    @Override
    public CompletableFuture<DescribeSavingsPlansCoverageDetailResponse> describeSavingsPlansCoverageDetail(DescribeSavingsPlansCoverageDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSavingsPlansCoverageDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSavingsPlansCoverageDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSavingsPlansCoverageDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSavingsPlansCoverageTotal  DescribeSavingsPlansCoverageTotalRequest
     * @return DescribeSavingsPlansCoverageTotalResponse
     */
    @Override
    public CompletableFuture<DescribeSavingsPlansCoverageTotalResponse> describeSavingsPlansCoverageTotal(DescribeSavingsPlansCoverageTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSavingsPlansCoverageTotal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSavingsPlansCoverageTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSavingsPlansCoverageTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSavingsPlansUsageDetail  DescribeSavingsPlansUsageDetailRequest
     * @return DescribeSavingsPlansUsageDetailResponse
     */
    @Override
    public CompletableFuture<DescribeSavingsPlansUsageDetailResponse> describeSavingsPlansUsageDetail(DescribeSavingsPlansUsageDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSavingsPlansUsageDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSavingsPlansUsageDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSavingsPlansUsageDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSavingsPlansUsageTotal  DescribeSavingsPlansUsageTotalRequest
     * @return DescribeSavingsPlansUsageTotalResponse
     */
    @Override
    public CompletableFuture<DescribeSavingsPlansUsageTotalResponse> describeSavingsPlansUsageTotal(DescribeSavingsPlansUsageTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSavingsPlansUsageTotal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSavingsPlansUsageTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSavingsPlansUsageTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeSplitItemBillResponse> describeSplitItemBill(DescribeSplitItemBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSplitItemBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSplitItemBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSplitItemBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountRelation  GetAccountRelationRequest
     * @return GetAccountRelationResponse
     */
    @Override
    public CompletableFuture<GetAccountRelationResponse> getAccountRelation(GetAccountRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountRelation").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomerAccountInfo  GetCustomerAccountInfoRequest
     * @return GetCustomerAccountInfoResponse
     */
    @Override
    public CompletableFuture<GetCustomerAccountInfoResponse> getCustomerAccountInfo(GetCustomerAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerAccountInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The system queries the IDs of customers of a VNO based on the AccessKey pair used in the request.</p>
     * 
     * @param request the request parameters of GetCustomerList  GetCustomerListRequest
     * @return GetCustomerListResponse
     */
    @Override
    public CompletableFuture<GetCustomerListResponse> getCustomerList(GetCustomerListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrderDetail  GetOrderDetailRequest
     * @return GetOrderDetailResponse
     */
    @Override
    public CompletableFuture<GetOrderDetailResponse> getOrderDetail(GetOrderDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOrderDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrderDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrderDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetPayAsYouGoPriceResponse> getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPayAsYouGoPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPayAsYouGoPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPayAsYouGoPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourcePackagePrice  GetResourcePackagePriceRequest
     * @return GetResourcePackagePriceResponse
     */
    @Override
    public CompletableFuture<GetResourcePackagePriceResponse> getResourcePackagePrice(GetResourcePackagePriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourcePackagePrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourcePackagePriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourcePackagePriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetSubscriptionPriceResponse> getSubscriptionPrice(GetSubscriptionPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSubscriptionPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSubscriptionPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSubscriptionPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<InquiryPriceRefundInstanceResponse> inquiryPriceRefundInstance(InquiryPriceRefundInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InquiryPriceRefundInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InquiryPriceRefundInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InquiryPriceRefundInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAccountRelation  ModifyAccountRelationRequest
     * @return ModifyAccountRelationResponse
     */
    @Override
    public CompletableFuture<ModifyAccountRelationResponse> modifyAccountRelation(ModifyAccountRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAccountRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAccountRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAccountRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCostUnit  ModifyCostUnitRequest
     * @return ModifyCostUnitResponse
     */
    @Override
    public CompletableFuture<ModifyCostUnitResponse> modifyCostUnit(ModifyCostUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCostUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCostUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCostUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountBalance  QueryAccountBalanceRequest
     * @return QueryAccountBalanceResponse
     */
    @Override
    public CompletableFuture<QueryAccountBalanceResponse> queryAccountBalance(QueryAccountBalanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountBalance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountBalanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountBalanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryAccountBillResponse> queryAccountBill(QueryAccountBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountTransactionDetails  QueryAccountTransactionDetailsRequest
     * @return QueryAccountTransactionDetailsResponse
     */
    @Override
    public CompletableFuture<QueryAccountTransactionDetailsResponse> queryAccountTransactionDetails(QueryAccountTransactionDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountTransactionDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountTransactionDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountTransactionDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountTransactions  QueryAccountTransactionsRequest
     * @return QueryAccountTransactionsResponse
     */
    @Override
    public CompletableFuture<QueryAccountTransactionsResponse> queryAccountTransactions(QueryAccountTransactionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountTransactions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountTransactionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountTransactionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAvailableInstances  QueryAvailableInstancesRequest
     * @return QueryAvailableInstancesResponse
     */
    @Override
    public CompletableFuture<QueryAvailableInstancesResponse> queryAvailableInstances(QueryAvailableInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAvailableInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAvailableInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAvailableInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryBill  QueryBillRequest
     * @return QueryBillResponse
     */
    @Override
    public CompletableFuture<QueryBillResponse> queryBill(QueryBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryBillOverview  QueryBillOverviewRequest
     * @return QueryBillOverviewResponse
     */
    @Override
    public CompletableFuture<QueryBillOverviewResponse> queryBillOverview(QueryBillOverviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBillOverview").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBillOverviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBillOverviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryBillToOSSSubscription  QueryBillToOSSSubscriptionRequest
     * @return QueryBillToOSSSubscriptionResponse
     */
    @Override
    public CompletableFuture<QueryBillToOSSSubscriptionResponse> queryBillToOSSSubscription(QueryBillToOSSSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBillToOSSSubscription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBillToOSSSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBillToOSSSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCashCoupons  QueryCashCouponsRequest
     * @return QueryCashCouponsResponse
     */
    @Override
    public CompletableFuture<QueryCashCouponsResponse> queryCashCoupons(QueryCashCouponsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCashCoupons").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCashCouponsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCashCouponsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a service based on the service code.</p>
     * 
     * @param request the request parameters of QueryCommodityList  QueryCommodityListRequest
     * @return QueryCommodityListResponse
     */
    @Override
    public CompletableFuture<QueryCommodityListResponse> queryCommodityList(QueryCommodityListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCommodityList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCommodityListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCommodityListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCostUnit  QueryCostUnitRequest
     * @return QueryCostUnitResponse
     */
    @Override
    public CompletableFuture<QueryCostUnitResponse> queryCostUnit(QueryCostUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCostUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCostUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCostUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCostUnitResource  QueryCostUnitResourceRequest
     * @return QueryCostUnitResourceResponse
     */
    @Override
    public CompletableFuture<QueryCostUnitResourceResponse> queryCostUnitResource(QueryCostUnitResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCostUnitResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCostUnitResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCostUnitResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCustomerAddressList  QueryCustomerAddressListRequest
     * @return QueryCustomerAddressListResponse
     */
    @Override
    public CompletableFuture<QueryCustomerAddressListResponse> queryCustomerAddressList(QueryCustomerAddressListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCustomerAddressList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCustomerAddressListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCustomerAddressListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryDPUtilizationDetailResponse> queryDPUtilizationDetail(QueryDPUtilizationDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDPUtilizationDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDPUtilizationDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDPUtilizationDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEvaluateList  QueryEvaluateListRequest
     * @return QueryEvaluateListResponse
     */
    @Override
    public CompletableFuture<QueryEvaluateListResponse> queryEvaluateList(QueryEvaluateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEvaluateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEvaluateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEvaluateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFinancialAccountInfo  QueryFinancialAccountInfoRequest
     * @return QueryFinancialAccountInfoResponse
     */
    @Override
    public CompletableFuture<QueryFinancialAccountInfoResponse> queryFinancialAccountInfo(QueryFinancialAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFinancialAccountInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFinancialAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFinancialAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryInstanceBillResponse> queryInstanceBill(QueryInstanceBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryInstanceBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryInstanceBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryInstanceBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryInstanceByTag  QueryInstanceByTagRequest
     * @return QueryInstanceByTagResponse
     */
    @Override
    public CompletableFuture<QueryInstanceByTagResponse> queryInstanceByTag(QueryInstanceByTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryInstanceByTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryInstanceByTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryInstanceByTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryInstanceGaapCost  QueryInstanceGaapCostRequest
     * @return QueryInstanceGaapCostResponse
     */
    @Override
    public CompletableFuture<QueryInstanceGaapCostResponse> queryInstanceGaapCost(QueryInstanceGaapCostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryInstanceGaapCost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryInstanceGaapCostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryInstanceGaapCostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryInvoicingCustomerList  QueryInvoicingCustomerListRequest
     * @return QueryInvoicingCustomerListResponse
     */
    @Override
    public CompletableFuture<QueryInvoicingCustomerListResponse> queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryInvoicingCustomerList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryInvoicingCustomerListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryInvoicingCustomerListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOrders  QueryOrdersRequest
     * @return QueryOrdersResponse
     */
    @Override
    public CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOrders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPermissionList  QueryPermissionListRequest
     * @return QueryPermissionListResponse
     */
    @Override
    public CompletableFuture<QueryPermissionListResponse> queryPermissionList(QueryPermissionListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPermissionList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPermissionListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPermissionListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPrepaidCards  QueryPrepaidCardsRequest
     * @return QueryPrepaidCardsResponse
     */
    @Override
    public CompletableFuture<QueryPrepaidCardsResponse> queryPrepaidCards(QueryPrepaidCardsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPrepaidCards").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPrepaidCardsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPrepaidCardsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the billable items of a service. A billable item is the minimum unit used to calculate costs.</p>
     * 
     * @param request the request parameters of QueryPriceEntityList  QueryPriceEntityListRequest
     * @return QueryPriceEntityListResponse
     */
    @Override
    public CompletableFuture<QueryPriceEntityListResponse> queryPriceEntityList(QueryPriceEntityListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPriceEntityList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPriceEntityListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPriceEntityListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryProductList  QueryProductListRequest
     * @return QueryProductListResponse
     */
    @Override
    public CompletableFuture<QueryProductListResponse> queryProductList(QueryProductListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryProductList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProductListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProductListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRIUtilizationDetail  QueryRIUtilizationDetailRequest
     * @return QueryRIUtilizationDetailResponse
     */
    @Override
    public CompletableFuture<QueryRIUtilizationDetailResponse> queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRIUtilizationDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRIUtilizationDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRIUtilizationDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRedeem  QueryRedeemRequest
     * @return QueryRedeemResponse
     */
    @Override
    public CompletableFuture<QueryRedeemResponse> queryRedeem(QueryRedeemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRedeem").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRedeemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRedeemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRelationList  QueryRelationListRequest
     * @return QueryRelationListResponse
     */
    @Override
    public CompletableFuture<QueryRelationListResponse> queryRelationList(QueryRelationListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRelationList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRelationListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRelationListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryResellerAvailableQuota  QueryResellerAvailableQuotaRequest
     * @return QueryResellerAvailableQuotaResponse
     */
    @Override
    public CompletableFuture<QueryResellerAvailableQuotaResponse> queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryResellerAvailableQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryResellerAvailableQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryResellerAvailableQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryResellerUserAlarmThreshold  QueryResellerUserAlarmThresholdRequest
     * @return QueryResellerUserAlarmThresholdResponse
     */
    @Override
    public CompletableFuture<QueryResellerUserAlarmThresholdResponse> queryResellerUserAlarmThreshold(QueryResellerUserAlarmThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryResellerUserAlarmThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryResellerUserAlarmThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryResellerUserAlarmThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryResourcePackageInstances  QueryResourcePackageInstancesRequest
     * @return QueryResourcePackageInstancesResponse
     */
    @Override
    public CompletableFuture<QueryResourcePackageInstancesResponse> queryResourcePackageInstances(QueryResourcePackageInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryResourcePackageInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryResourcePackageInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryResourcePackageInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySavingsPlansDeductLog  QuerySavingsPlansDeductLogRequest
     * @return QuerySavingsPlansDeductLogResponse
     */
    @Override
    public CompletableFuture<QuerySavingsPlansDeductLogResponse> querySavingsPlansDeductLog(QuerySavingsPlansDeductLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySavingsPlansDeductLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySavingsPlansDeductLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySavingsPlansDeductLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySavingsPlansDiscount  QuerySavingsPlansDiscountRequest
     * @return QuerySavingsPlansDiscountResponse
     */
    @Override
    public CompletableFuture<QuerySavingsPlansDiscountResponse> querySavingsPlansDiscount(QuerySavingsPlansDiscountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySavingsPlansDiscount").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySavingsPlansDiscountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySavingsPlansDiscountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySavingsPlansInstance  QuerySavingsPlansInstanceRequest
     * @return QuerySavingsPlansInstanceResponse
     */
    @Override
    public CompletableFuture<QuerySavingsPlansInstanceResponse> querySavingsPlansInstance(QuerySavingsPlansInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySavingsPlansInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySavingsPlansInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySavingsPlansInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySettleBill  QuerySettleBillRequest
     * @return QuerySettleBillResponse
     */
    @Override
    public CompletableFuture<QuerySettleBillResponse> querySettleBill(QuerySettleBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySettleBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySettleBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySettleBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySkuPriceList  QuerySkuPriceListRequest
     * @return QuerySkuPriceListResponse
     */
    @Override
    public CompletableFuture<QuerySkuPriceListResponse> querySkuPriceList(QuerySkuPriceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySkuPriceList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySkuPriceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySkuPriceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QuerySplitItemBillResponse> querySplitItemBill(QuerySplitItemBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySplitItemBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySplitItemBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySplitItemBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryUserOmsDataResponse> queryUserOmsData(QueryUserOmsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryUserOmsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryUserOmsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryUserOmsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RefundInstanceResponse> refundInstance(RefundInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefundInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefundInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefundInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is provided for only VNOs to release instances. If a non-specific VNO calls this operation, the request is blocked.</p>
     * 
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    @Override
    public CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RelieveAccountRelation  RelieveAccountRelationRequest
     * @return RelieveAccountRelationResponse
     */
    @Override
    public CompletableFuture<RelieveAccountRelationResponse> relieveAccountRelation(RelieveAccountRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RelieveAccountRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RelieveAccountRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RelieveAccountRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewChangeInstance  RenewChangeInstanceRequest
     * @return RenewChangeInstanceResponse
     */
    @Override
    public CompletableFuture<RenewChangeInstanceResponse> renewChangeInstance(RenewChangeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewChangeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewChangeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewChangeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    @Override
    public CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewResourcePackage  RenewResourcePackageRequest
     * @return RenewResourcePackageResponse
     */
    @Override
    public CompletableFuture<RenewResourcePackageResponse> renewResourcePackage(RenewResourcePackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewResourcePackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewResourcePackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewResourcePackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetAllExpirationDay  SetAllExpirationDayRequest
     * @return SetAllExpirationDayResponse
     */
    @Override
    public CompletableFuture<SetAllExpirationDayResponse> setAllExpirationDay(SetAllExpirationDayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAllExpirationDay").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAllExpirationDayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAllExpirationDayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetRenewal  SetRenewalRequest
     * @return SetRenewalResponse
     */
    @Override
    public CompletableFuture<SetRenewalResponse> setRenewal(SetRenewalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetRenewal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetRenewalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetRenewalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetResellerUserAlarmThreshold  SetResellerUserAlarmThresholdRequest
     * @return SetResellerUserAlarmThresholdResponse
     */
    @Override
    public CompletableFuture<SetResellerUserAlarmThresholdResponse> setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetResellerUserAlarmThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetResellerUserAlarmThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetResellerUserAlarmThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetResellerUserQuota  SetResellerUserQuotaRequest
     * @return SetResellerUserQuotaResponse
     */
    @Override
    public CompletableFuture<SetResellerUserQuotaResponse> setResellerUserQuota(SetResellerUserQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetResellerUserQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetResellerUserQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetResellerUserQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetResellerUserStatus  SetResellerUserStatusRequest
     * @return SetResellerUserStatusResponse
     */
    @Override
    public CompletableFuture<SetResellerUserStatusResponse> setResellerUserStatus(SetResellerUserStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetResellerUserStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetResellerUserStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetResellerUserStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetSavingPlanUserDeductRule  SetSavingPlanUserDeductRuleRequest
     * @return SetSavingPlanUserDeductRuleResponse
     */
    @Override
    public CompletableFuture<SetSavingPlanUserDeductRuleResponse> setSavingPlanUserDeductRule(SetSavingPlanUserDeductRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSavingPlanUserDeductRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSavingPlanUserDeductRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSavingPlanUserDeductRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<SubscribeBillToOSSResponse> subscribeBillToOSS(SubscribeBillToOSSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubscribeBillToOSS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubscribeBillToOSSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubscribeBillToOSSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnsubscribeBillToOSS  UnsubscribeBillToOSSRequest
     * @return UnsubscribeBillToOSSResponse
     */
    @Override
    public CompletableFuture<UnsubscribeBillToOSSResponse> unsubscribeBillToOSS(UnsubscribeBillToOSSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnsubscribeBillToOSS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnsubscribeBillToOSSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnsubscribeBillToOSSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeResourcePackage  UpgradeResourcePackageRequest
     * @return UpgradeResourcePackageResponse
     */
    @Override
    public CompletableFuture<UpgradeResourcePackageResponse> upgradeResourcePackage(UpgradeResourcePackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeResourcePackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeResourcePackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeResourcePackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
