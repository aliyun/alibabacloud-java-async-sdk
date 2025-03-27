// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.antiddos_public20170518.models.*;
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
        this.product = "antiddos-public";
        this.version = "2017-05-18";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing", "antiddos.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "antiddos-openapi.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "antiddos-openapi.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "antiddos-openapi.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai", "antiddos.aliyuncs.com"),
            new TeaPair("cn-nanjing", "antiddos-openapi.cn-hangzhou-cloudstone.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "antiddos.aliyuncs.com"),
            new TeaPair("cn-heyuan", "antiddos-openapi.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "antiddos-openapi.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "antiddos-openapi.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hongkong", "antiddos.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "antiddos-openapi.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "antiddos-openapi.ap-northeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "antiddos.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "antiddos-openapi.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "antiddos-openapi.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "antiddos-openapi.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "antiddos-openapi.ap-southeast-6.aliyuncs.com"),
            new TeaPair("us-east-1", "antiddos.aliyuncs.com"),
            new TeaPair("us-west-1", "antiddos.aliyuncs.com"),
            new TeaPair("eu-west-1", "antiddos-openapi.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "antiddos-openapi.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "antiddos-openapi.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "antiddos-openapi.me-east-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "antiddos.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-edge-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-fujian", "antiddos.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "antiddos.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "antiddos.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-wuhan", "antiddos.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "antiddos.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "antiddos.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "antiddos.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "antiddos-openapi.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "antiddos.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "antiddos.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "antiddos.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeBgpPackByIp operation to query the configurations of the Anti-DDoS Origin instance that is associated with an asset. The configurations include the basic protection threshold, burstable protection threshold, and expiration time.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeBgpPackByIp  DescribeBgpPackByIpRequest
     * @return DescribeBgpPackByIpResponse
     */
    @Override
    public CompletableFuture<DescribeBgpPackByIpResponse> describeBgpPackByIp(DescribeBgpPackByIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBgpPackByIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBgpPackByIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBgpPackByIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeCap operation to query the download link to the traffic data that is captured when a DDoS attack event occurs. You can download the traffic data from the download link and use the data as evidence.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCap  DescribeCapRequest
     * @return DescribeCapResponse
     */
    @Override
    public CompletableFuture<DescribeCapResponse> describeCap(DescribeCapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosCount  DescribeDdosCountRequest
     * @return DescribeDdosCountResponse
     */
    @Override
    public CompletableFuture<DescribeDdosCountResponse> describeDdosCount(DescribeDdosCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDdosCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDdosCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDdosCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosCredit operation to query the details of the security credit score of the current Alibaba Cloud account in a specific region. The details include the security credit score, security credit level, and the time period after which blackhole filtering is automatically deactivated.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosCredit  DescribeDdosCreditRequest
     * @return DescribeDdosCreditResponse
     */
    @Override
    public CompletableFuture<DescribeDdosCreditResponse> describeDdosCredit(DescribeDdosCreditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDdosCredit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDdosCreditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDdosCreditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosEventList operation to query the details of the DDoS attack events that occur on an asset by page. The details include the start time, end time, and status of each DDoS attack event.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosEventList  DescribeDdosEventListRequest
     * @return DescribeDdosEventListResponse
     */
    @Override
    public CompletableFuture<DescribeDdosEventListResponse> describeDdosEventList(DescribeDdosEventListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDdosEventList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDdosEventListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDdosEventListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeDdosThreshold operation to query the details of the DDoS mitigation thresholds or traffic scrubbing thresholds for specified assets. The details include the current traffic scrubbing threshold, maximum traffic scrubbing threshold, current DDoS mitigation threshold, and maximum DDoS mitigation threshold.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDdosThreshold  DescribeDdosThresholdRequest
     * @return DescribeDdosThresholdResponse
     */
    @Override
    public CompletableFuture<DescribeDdosThresholdResponse> describeDdosThreshold(DescribeDdosThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDdosThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDdosThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDdosThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeInstance operation to query the details of the assets that are within the current Alibaba Cloud account by page. The details include the IDs and IP addresses of the assets, the basic protection thresholds and traffic scrubbing thresholds that are configured for the assets in Anti-DDoS Origin, and whether the assets are associated with Anti-DDoS Origin instances.</p>
     * <h3><a href="#qps-"></a>Limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If one or more assets of the current Alibaba Cloud account are added to an Anti-DDoS Origin instance, you can call the DescribeInstanceIpAddress operation to query the DDoS mitigation information and the details of the Anti-DDoS Origin instance. The information and the details include the basic protection threshold and traffic scrubbing threshold for the assets, DDoS mitigation status of the assets, ID of the instance, and the mitigation status of the instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 200 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeInstanceIpAddress  DescribeInstanceIpAddressRequest
     * @return DescribeInstanceIpAddressResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceIpAddressResponse> describeInstanceIpAddress(DescribeInstanceIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If one or more assets of the current Alibaba Cloud account are added to an Anti-DDoS Origin instance, you can call the DescribeIpDdosThreshold operation to query the details of the DDoS mitigation threshold or traffic scrubbing threshold for a specific asset. The details include the current traffic scrubbing threshold, maximum scrubbing threshold, current DDoS mitigation threshold, and maximum DDoS mitigation threshold.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeIpDdosThreshold  DescribeIpDdosThresholdRequest
     * @return DescribeIpDdosThresholdResponse
     */
    @Override
    public CompletableFuture<DescribeIpDdosThresholdResponse> describeIpDdosThreshold(DescribeIpDdosThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpDdosThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpDdosThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpDdosThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeIpLocationService operation to query the region of the public IP address for a specified asset that is within the current Alibaba Cloud account. You can also query the details of the Anti-DDoS Origin instance to which the asset is added. The details include the ID and name.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeIpLocationService  DescribeIpLocationServiceRequest
     * @return DescribeIpLocationServiceResponse
     */
    @Override
    public CompletableFuture<DescribeIpLocationServiceResponse> describeIpLocationService(DescribeIpLocationServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpLocationService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpLocationServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpLocationServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about the regions in which Anti-DDoS Origin Basic is available. The information includes the region ID, region name, and code.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyDefenseThreshold  ModifyDefenseThresholdRequest
     * @return ModifyDefenseThresholdResponse
     */
    @Override
    public CompletableFuture<ModifyDefenseThresholdResponse> modifyDefenseThreshold(ModifyDefenseThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDefenseThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDefenseThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDefenseThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyIpDefenseThreshold  ModifyIpDefenseThresholdRequest
     * @return ModifyIpDefenseThresholdResponse
     */
    @Override
    public CompletableFuture<ModifyIpDefenseThresholdResponse> modifyIpDefenseThreshold(ModifyIpDefenseThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIpDefenseThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIpDefenseThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIpDefenseThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
