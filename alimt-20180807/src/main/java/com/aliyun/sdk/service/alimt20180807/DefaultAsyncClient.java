// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20180807;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.alimt20180807.models.*;
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
        this.product = "alimt";
        this.version = "2018-08-07";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "mt.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mt.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "mt.aliyuncs.com"),
            new TeaPair("ap-south-1", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mt.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mt.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mt.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mt.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mt.aliyuncs.com"),
            new TeaPair("cn-fujian", "mt.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mt.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mt.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mt.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mt.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mt.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mt.aliyuncs.com"),
            new TeaPair("cn-qingdao", "mt.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mt.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mt.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mt.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mt.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mt.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mt.aliyuncs.com"),
            new TeaPair("eu-central-1", "mt.aliyuncs.com"),
            new TeaPair("eu-west-1", "mt.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mt.aliyuncs.com"),
            new TeaPair("me-east-1", "mt.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mt.aliyuncs.com"),
            new TeaPair("us-east-1", "mt.aliyuncs.com"),
            new TeaPair("us-west-1", "mt.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<MachineTranslateECommerceResponse> machineTranslateECommerce(MachineTranslateECommerceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MachineTranslateECommerce").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MachineTranslateECommerceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MachineTranslateECommerceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<MachineTranslateGeneralResponse> machineTranslateGeneral(MachineTranslateGeneralRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MachineTranslateGeneral").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MachineTranslateGeneralResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MachineTranslateGeneralResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
