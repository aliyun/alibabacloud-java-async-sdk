// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.resellertrade20191227.models.*;
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
        this.product = "ResellerTrade";
        this.version = "2019-12-27";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-south-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-chengdu", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-edge-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-fujian", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hongkong", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-qingdao", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-wuhan", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-central-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-west-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "resellertrade.aliyuncs.com"),
            new TeaPair("me-east-1", "resellertrade.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("us-east-1", "resellertrade.aliyuncs.com"),
            new TeaPair("us-west-1", "resellertrade.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<CreateCouponTemplateResponse> createCouponTemplate(CreateCouponTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCouponTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCouponTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCouponTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DiscardCouponListResponse> discardCouponList(DiscardCouponListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DiscardCouponList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DiscardCouponListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DiscardCouponListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetCouponPageResponse> getCouponPage(GetCouponPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCouponPage").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCouponPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCouponPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<GetRelationResponse> getRelation(GetRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRelation").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetResellerPayOrderResponse> getResellerPayOrder(GetResellerPayOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResellerPayOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResellerPayOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResellerPayOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<LabelPartnerUserResponse> labelPartnerUser(LabelPartnerUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LabelPartnerUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LabelPartnerUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LabelPartnerUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<MigrateResourceResponse> migrateResource(MigrateResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MigrateResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<OfflineActivityResponse> offlineActivity(OfflineActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OfflineActivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PayResultCallbackResponse> payResultCallback(PayResultCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PayResultCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PayResultCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PayResultCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PublicActivityResponse> publicActivity(PublicActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublicActivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublicActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublicActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryActivityResponse> queryActivity(QueryActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryActivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryEcoRelationResponse> queryEcoRelation(QueryEcoRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEcoRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEcoRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEcoRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SaveActivityResponse> saveActivity(SaveActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveActivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SendCouponResponse> sendCoupon(SendCouponRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendCoupon").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendCouponResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendCouponResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TransferResourceResponse> transferResource(TransferResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransferResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
