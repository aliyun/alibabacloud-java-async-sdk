// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.agency20221216.models.*;
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
        this.product = "Agency";
        this.version = "2022-12-16";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "agency.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "agency.aliyuncs.com"),
            new TeaPair("ap-south-1", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-chengdu", "agency.aliyuncs.com"),
            new TeaPair("cn-edge-1", "agency.aliyuncs.com"),
            new TeaPair("cn-fujian", "agency.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "agency.aliyuncs.com"),
            new TeaPair("cn-hongkong", "agency.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "agency.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "agency.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "agency.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "agency.aliyuncs.com"),
            new TeaPair("cn-qingdao", "agency.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-wuhan", "agency.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "agency.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "agency.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "agency.aliyuncs.com"),
            new TeaPair("eu-central-1", "agency.aliyuncs.com"),
            new TeaPair("eu-west-1", "agency.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "agency.aliyuncs.com"),
            new TeaPair("me-east-1", "agency.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "agency.aliyuncs.com"),
            new TeaPair("us-east-1", "agency.aliyuncs.com"),
            new TeaPair("us-west-1", "agency.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AutomaticWriteOff  AutomaticWriteOffRequest
     * @return AutomaticWriteOffResponse
     */
    @Override
    public CompletableFuture<AutomaticWriteOffResponse> automaticWriteOff(AutomaticWriteOffRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AutomaticWriteOff").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AutomaticWriteOffResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AutomaticWriteOffResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelCoupon  CancelCouponRequest
     * @return CancelCouponResponse
     */
    @Override
    public CompletableFuture<CancelCouponResponse> cancelCoupon(CancelCouponRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCoupon").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCouponResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCouponResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CancelSubscriptionBillResponse> cancelSubscriptionBill(CancelSubscriptionBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelSubscriptionBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelSubscriptionBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelSubscriptionBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * @param request the request parameters of CouponApprovalStatusList  CouponApprovalStatusListRequest
     * @return CouponApprovalStatusListResponse
     */
    @Override
    public CompletableFuture<CouponApprovalStatusListResponse> couponApprovalStatusList(CouponApprovalStatusListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CouponApprovalStatusList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CouponApprovalStatusListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CouponApprovalStatusListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCouponTemplate  CreateCouponTemplateRequest
     * @return CreateCouponTemplateResponse
     */
    @Override
    public CompletableFuture<CreateCouponTemplateResponse> createCouponTemplate(CreateCouponTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCouponTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCouponTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCouponTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomer  CreateCustomerRequest
     * @return CreateCustomerResponse
     */
    @Override
    public CompletableFuture<CreateCustomerResponse> createCustomer(CreateCustomerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be a channel master distributor partner or a channel distributor partner on the Alibaba Cloud International Website.</p>
     * 
     * @param request the request parameters of CustomerQuotaRecordList  CustomerQuotaRecordListRequest
     * @return CustomerQuotaRecordListResponse
     */
    @Override
    public CompletableFuture<CustomerQuotaRecordListResponse> customerQuotaRecordList(CustomerQuotaRecordListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CustomerQuotaRecordList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CustomerQuotaRecordListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CustomerQuotaRecordListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeductOutstandingBalance  DeductOutstandingBalanceRequest
     * @return DeductOutstandingBalanceResponse
     */
    @Override
    public CompletableFuture<DeductOutstandingBalanceResponse> deductOutstandingBalance(DeductOutstandingBalanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeductOutstandingBalance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeductOutstandingBalanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeductOutstandingBalanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the current caller is a distribution partner. 
     * <notice>Available only on the China site.</notice>.</p>
     * 
     * @param request the request parameters of DeleteCouponTemplate  DeleteCouponTemplateRequest
     * @return DeleteCouponTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteCouponTemplateResponse> deleteCouponTemplate(DeleteCouponTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCouponTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCouponTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCouponTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international channel master distributor partner or an Alibaba Cloud international channel distributor partner.
     * <strong>This content is published only on the China site (Chinese).</strong>.</p>
     * 
     * @param request the request parameters of EditEndUserStatus  EditEndUserStatusRequest
     * @return EditEndUserStatusResponse
     */
    @Override
    public CompletableFuture<EditEndUserStatusResponse> editEndUserStatus(EditEndUserStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditEndUserStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditEndUserStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditEndUserStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud reseller partner.
     * <strong>This content is published only on the China site.</strong>.</p>
     * 
     * @param request the request parameters of EditNewBuyStatus  EditNewBuyStatusRequest
     * @return EditNewBuyStatusResponse
     */
    @Override
    public CompletableFuture<EditNewBuyStatusResponse> editNewBuyStatus(EditNewBuyStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditNewBuyStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditNewBuyStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditNewBuyStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international channel distributor partner or an Alibaba Cloud international channel reseller partner.
     * <strong>This content is published only on the Chinese site.</strong>.</p>
     * 
     * @param request the request parameters of EditZeroCreditShutdown  EditZeroCreditShutdownRequest
     * @return EditZeroCreditShutdownResponse
     */
    @Override
    public CompletableFuture<EditZeroCreditShutdownResponse> editZeroCreditShutdown(EditZeroCreditShutdownRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditZeroCreditShutdown").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditZeroCreditShutdownResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditZeroCreditShutdownResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.</p>
     * 
     * @param request the request parameters of ExportCustomerQuotaRecord  ExportCustomerQuotaRecordRequest
     * @return ExportCustomerQuotaRecordResponse
     */
    @Override
    public CompletableFuture<ExportCustomerQuotaRecordResponse> exportCustomerQuotaRecord(ExportCustomerQuotaRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportCustomerQuotaRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportCustomerQuotaRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportCustomerQuotaRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportReversedDeductionHistory  ExportReversedDeductionHistoryRequest
     * @return ExportReversedDeductionHistoryResponse
     */
    @Override
    public CompletableFuture<ExportReversedDeductionHistoryResponse> exportReversedDeductionHistory(ExportReversedDeductionHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportReversedDeductionHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportReversedDeductionHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportReversedDeductionHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountInfo  GetAccountInfoRequest
     * @return GetAccountInfoResponse
     */
    @Override
    public CompletableFuture<GetAccountInfoResponse> getAccountInfo(GetAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * @param request the request parameters of GetCommissionableProducts  GetCommissionableProductsRequest
     * @return GetCommissionableProductsResponse
     */
    @Override
    public CompletableFuture<GetCommissionableProductsResponse> getCommissionableProducts(GetCommissionableProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCommissionableProducts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCommissionableProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCommissionableProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the International site</p>
     * 
     * @param request the request parameters of GetCouponTemplateDetail  GetCouponTemplateDetailRequest
     * @return GetCouponTemplateDetailResponse
     */
    @Override
    public CompletableFuture<GetCouponTemplateDetailResponse> getCouponTemplateDetail(GetCouponTemplateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCouponTemplateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCouponTemplateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCouponTemplateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCoupondeductProductCode  GetCoupondeductProductCodeRequest
     * @return GetCoupondeductProductCodeResponse
     */
    @Override
    public CompletableFuture<GetCoupondeductProductCodeResponse> getCoupondeductProductCode(GetCoupondeductProductCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCoupondeductProductCode").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCoupondeductProductCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCoupondeductProductCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCreditInfo  GetCreditInfoRequest
     * @return GetCreditInfoResponse
     */
    @Override
    public CompletableFuture<GetCreditInfoResponse> getCreditInfo(GetCreditInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCreditInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCreditInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCreditInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud International site channel master distributor partner or an Alibaba Cloud International site channel distributor partner.</p>
     * 
     * @param request the request parameters of GetCustomerOrders  GetCustomerOrdersRequest
     * @return GetCustomerOrdersResponse
     */
    @Override
    public CompletableFuture<GetCustomerOrdersResponse> getCustomerOrders(GetCustomerOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerOrders").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDailyBill  GetDailyBillRequest
     * @return GetDailyBillResponse
     */
    @Override
    public CompletableFuture<GetDailyBillResponse> getDailyBill(GetDailyBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDailyBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDailyBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDailyBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInviteStatus  GetInviteStatusRequest
     * @return GetInviteStatusResponse
     */
    @Override
    public CompletableFuture<GetInviteStatusResponse> getInviteStatus(GetInviteStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInviteStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInviteStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInviteStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMonthlyBill  GetMonthlyBillRequest
     * @return GetMonthlyBillResponse
     */
    @Override
    public CompletableFuture<GetMonthlyBillResponse> getMonthlyBill(GetMonthlyBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMonthlyBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMonthlyBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMonthlyBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.</p>
     * 
     * @param request the request parameters of GetPurchaseControlRecord  GetPurchaseControlRecordRequest
     * @return GetPurchaseControlRecordResponse
     */
    @Override
    public CompletableFuture<GetPurchaseControlRecordResponse> getPurchaseControlRecord(GetPurchaseControlRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPurchaseControlRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPurchaseControlRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPurchaseControlRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.
     * <strong>This content is published only on the international site.</strong>.</p>
     * 
     * @param request the request parameters of GetShutdownPolicyRecord  GetShutdownPolicyRecordRequest
     * @return GetShutdownPolicyRecordResponse
     */
    @Override
    public CompletableFuture<GetShutdownPolicyRecordResponse> getShutdownPolicyRecord(GetShutdownPolicyRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetShutdownPolicyRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetShutdownPolicyRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetShutdownPolicyRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTier2CouponApprovalDetail  GetTier2CouponApprovalDetailRequest
     * @return GetTier2CouponApprovalDetailResponse
     */
    @Override
    public CompletableFuture<GetTier2CouponApprovalDetailResponse> getTier2CouponApprovalDetail(GetTier2CouponApprovalDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTier2CouponApprovalDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTier2CouponApprovalDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTier2CouponApprovalDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUnassociatedCustomer  GetUnassociatedCustomerRequest
     * @return GetUnassociatedCustomerResponse
     */
    @Override
    public CompletableFuture<GetUnassociatedCustomerResponse> getUnassociatedCustomer(GetUnassociatedCustomerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUnassociatedCustomer").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUnassociatedCustomerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUnassociatedCustomerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InviteSubAccount  InviteSubAccountRequest
     * @return InviteSubAccountResponse
     */
    @Override
    public CompletableFuture<InviteSubAccountResponse> inviteSubAccount(InviteSubAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InviteSubAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InviteSubAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InviteSubAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<InviteSubResellerResponse> inviteSubReseller(InviteSubResellerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InviteSubReseller").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InviteSubResellerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InviteSubResellerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IssueCouponForCustomer  IssueCouponForCustomerRequest
     * @return IssueCouponForCustomerResponse
     */
    @Override
    public CompletableFuture<IssueCouponForCustomerResponse> issueCouponForCustomer(IssueCouponForCustomerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IssueCouponForCustomer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IssueCouponForCustomerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IssueCouponForCustomerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCountries  ListCountriesRequest
     * @return ListCountriesResponse
     */
    @Override
    public CompletableFuture<ListCountriesResponse> listCountries(ListCountriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCountries").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCountriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCountriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * @param request the request parameters of ListCouponUsage  ListCouponUsageRequest
     * @return ListCouponUsageResponse
     */
    @Override
    public CompletableFuture<ListCouponUsageResponse> listCouponUsage(ListCouponUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCouponUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCouponUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCouponUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExportTasks  ListExportTasksRequest
     * @return ListExportTasksResponse
     */
    @Override
    public CompletableFuture<ListExportTasksResponse> listExportTasks(ListExportTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListExportTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExportTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExportTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTier2CouponApproval  ListTier2CouponApprovalRequest
     * @return ListTier2CouponApprovalResponse
     */
    @Override
    public CompletableFuture<ListTier2CouponApprovalResponse> listTier2CouponApproval(ListTier2CouponApprovalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTier2CouponApproval").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTier2CouponApprovalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTier2CouponApprovalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ProcessApproval  ProcessApprovalRequest
     * @return ProcessApprovalResponse
     */
    @Override
    public CompletableFuture<ProcessApprovalResponse> processApproval(ProcessApprovalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ProcessApproval").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ProcessApprovalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ProcessApprovalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAutomaticWriteOffChangeRecords  QueryAutomaticWriteOffChangeRecordsRequest
     * @return QueryAutomaticWriteOffChangeRecordsResponse
     */
    @Override
    public CompletableFuture<QueryAutomaticWriteOffChangeRecordsResponse> queryAutomaticWriteOffChangeRecords(QueryAutomaticWriteOffChangeRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAutomaticWriteOffChangeRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAutomaticWriteOffChangeRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAutomaticWriteOffChangeRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryReversedDeductionHistory  QueryReversedDeductionHistoryRequest
     * @return QueryReversedDeductionHistoryResponse
     */
    @Override
    public CompletableFuture<QueryReversedDeductionHistoryResponse> queryReversedDeductionHistory(QueryReversedDeductionHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryReversedDeductionHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryReversedDeductionHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryReversedDeductionHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud International site channel master distributor partner or an Alibaba Cloud International site channel distributor partner.</p>
     * 
     * @param request the request parameters of QuotaListExportPaged  QuotaListExportPagedRequest
     * @return QuotaListExportPagedResponse
     */
    @Override
    public CompletableFuture<QuotaListExportPagedResponse> quotaListExportPaged(QuotaListExportPagedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuotaListExportPaged").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuotaListExportPagedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuotaListExportPagedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResendEmail  ResendEmailRequest
     * @return ResendEmailResponse
     */
    @Override
    public CompletableFuture<ResendEmailResponse> resendEmail(ResendEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResendEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResendEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResendEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetAccountInfo  SetAccountInfoRequest
     * @return SetAccountInfoResponse
     */
    @Override
    public CompletableFuture<SetAccountInfoResponse> setAccountInfo(SetAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAccountInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetCreditLine  SetCreditLineRequest
     * @return SetCreditLineResponse
     */
    @Override
    public CompletableFuture<SetCreditLineResponse> setCreditLine(SetCreditLineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCreditLine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCreditLineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCreditLineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetWarningThreshold  SetWarningThresholdRequest
     * @return SetWarningThresholdResponse
     */
    @Override
    public CompletableFuture<SetWarningThresholdResponse> setWarningThreshold(SetWarningThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetWarningThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetWarningThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetWarningThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<SubscriptionBillResponse> subscriptionBill(SubscriptionBillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubscriptionBill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubscriptionBillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubscriptionBillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
