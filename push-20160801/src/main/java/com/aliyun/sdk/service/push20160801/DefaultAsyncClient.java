// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.push20160801.models.*;
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
        this.product = "Push";
        this.version = "2016-08-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-south-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cloudpush.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-chengdu", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-fujian", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hongkong", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-qingdao", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cloudpush.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-central-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-west-1", "cloudpush.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cloudpush.aliyuncs.com"),
            new TeaPair("me-east-1", "cloudpush.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cloudpush.aliyuncs.com"),
            new TeaPair("us-east-1", "cloudpush.aliyuncs.com"),
            new TeaPair("us-west-1", "cloudpush.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>You can attach up to 10 aliases in a single request. The attachment takes effect immediately.</p>
     * 
     * @param request the request parameters of BindAlias  BindAliasRequest
     * @return BindAliasResponse
     */
    @Override
    public CompletableFuture<BindAliasResponse> bindAlias(BindAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindAlias").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindPhone  BindPhoneRequest
     * @return BindPhoneResponse
     */
    @Override
    public CompletableFuture<BindPhoneResponse> bindPhone(BindPhoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindPhone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindPhoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindPhoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindTag  BindTagRequest
     * @return BindTagResponse
     */
    @Override
    public CompletableFuture<BindTagResponse> bindTag(BindTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelPush  CancelPushRequest
     * @return CancelPushResponse
     */
    @Override
    public CompletableFuture<CancelPushResponse> cancelPush(CancelPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelPush").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the returned ExpireTime is greater than the current timestamp, it does not necessarily mean that the certificate is available. You must also check whether the Status is OK.</li>
     * <li>The REVOKED status is returned by the APNs server. If the certificate is in the REVOKED status, at least one push notification sent to APNs in the corresponding environment has failed.</li>
     * </ul>
     * 
     * @param request the request parameters of CheckCertificate  CheckCertificateRequest
     * @return CheckCertificateResponse
     */
    @Override
    public CompletableFuture<CheckCertificateResponse> checkCertificate(CheckCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CheckDevice is deprecated, please use Push::2016-08-01::CheckDevices instead.  * @param request  the request parameters of CheckDevice  CheckDeviceRequest
     * @return CheckDeviceResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CheckDeviceResponse> checkDevice(CheckDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckDevices  CheckDevicesRequest
     * @return CheckDevicesResponse
     */
    @Override
    public CompletableFuture<CheckDevicesResponse> checkDevices(CheckDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you do not call this operation, the continuous push task automatically ends when it reaches its time-to-live (TTL).</p>
     * 
     * @param request the request parameters of CompleteContinuouslyPush  CompleteContinuouslyPushRequest
     * @return CompleteContinuouslyPushResponse
     */
    @Override
    public CompletableFuture<CompleteContinuouslyPushResponse> completeContinuouslyPush(CompleteContinuouslyPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompleteContinuouslyPush").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompleteContinuouslyPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompleteContinuouslyPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation resolves the issue of the maximum number of targets per call in the <a href="https://help.aliyun.com/document_detail/2249916.html">Push advanced push operation</a>, regardless of whether the push is based on devices, accounts, or aliases.</p>
     * <ul>
     * <li>Using continuous push indicates that the business scenario involves sending the same message to a large number of devices. In this case, call the continuous push operation appropriately. For each call, aggregate a group of devices for the push. Currently, the maximum number of targets per push is 1,000 for device-based, account-based, and alias-based pushes. The total number of pushes for the same MessageId is limited to 10,000. If a higher quota is required, contact technical support to evaluate the specific scenario.</li>
     * <li>Before using this operation, call the Push operation, set Target to TBD (To Be Determined), and specify the message content to obtain the MessageId of the message in the push system. Then, you can repeatedly call this operation based on the MessageId and specify different target groups to push the message to these targets.</li>
     * <li>After you call the Push operation and set the target to TBD to obtain the MessageId, the message is retained in the push system for 24 hours by default. Before the message expires, you can use this operation to push the message to specified targets at any time. Pushes are not allowed after the message expires or the maximum total number of pushes is exceeded.</li>
     * <li>Each time you call this operation to specify devices, the message is pushed immediately. Scheduled pushes are not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of ContinuouslyPush  ContinuouslyPushRequest
     * @return ContinuouslyPushResponse
     */
    @Override
    public CompletableFuture<ContinuouslyPushResponse> continuouslyPush(ContinuouslyPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ContinuouslyPush").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContinuouslyPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContinuouslyPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListSummaryApps is deprecated, please use Mhub::2017-08-25::ListApps instead.  * @param request  the request parameters of ListSummaryApps  ListSummaryAppsRequest
     * @return ListSummaryAppsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListSummaryAppsResponse> listSummaryApps(ListSummaryAppsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSummaryApps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSummaryAppsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSummaryAppsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    @Override
    public CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> of Mobile Push.</em>*
     * In some business scenarios, you may need to push different messages to a large number of different devices within a very short time. When the number of devices and messages is extremely large, a high queries per second (QPS) rate is generated. This may reach the QPS limit for a single source IP address and cause some push tasks to fail.
     * This operation is designed to address this issue. It allows you to pass up to 100 independent push tasks in a single call. By aggregating requests, it effectively reduces the QPS and improves the stability and success rate of mass single-target push tasks. The rate limit for batch push is 500 calls per second per account.
     * Each independent push task only supports three types of push targets: device, account, and alias. SMS integration configuration is currently not supported.</p>
     * <blockquote>
     * <p>The SDK must be upgraded to version 3.11.0 or later.</p>
     * </blockquote>
     * <h2>PushTask properties</h2>
     * <ul>
     * <li>The PushTask property format is PushTask.N.Property. It includes:<ul>
     * <li>Push target (destination)</li>
     * <li>Push configuration (config)</li>
     * <li>iOS notification task configuration</li>
     * <li>Android notification task configuration</li>
     * <li>Android auxiliary pop-up window configuration</li>
     * <li>HarmonyOS notification task configuration </li>
     * <li>Push control</li>
     * </ul>
     * </li>
     * <li>Each PushTask represents an independent push task. A maximum of 100 push tasks are supported. The push-related configurations are the same as those in the Push operation.</li>
     * <li>The PushTask.N.Target parameter only supports the DEVICE, ACCOUNT, and ALIAS types.</li>
     * <li>PushTask does not support SMS linkage configuration.</li>
     * <li>The product of the number of parent nodes and child nodes cannot exceed 10,000. Otherwise, the parameter is considered invalid.</li>
     * </ul>
     * 
     * @param request the request parameters of MassPush  MassPushRequest
     * @return MassPushResponse
     */
    @Override
    public CompletableFuture<MassPushResponse> massPush(MassPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MassPush").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MassPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MassPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing method and pricing</a> of EMAS Mobile Push.</p>
     * 
     * @param request the request parameters of MassPushV2  MassPushV2Request
     * @return MassPushV2Response
     */
    @Override
    public CompletableFuture<MassPushV2Response> massPushV2(MassPushV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MassPushV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MassPushV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MassPushV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> of EMAS Mobile Push.</em>*
     * This operation distinguishes between Android, iOS, and HarmonyOS platforms. For push calls on different platforms, you must pass the AppKey corresponding to the platform.</p>
     * 
     * @param request the request parameters of Push  PushRequest
     * @return PushResponse
     */
    @Override
    public CompletableFuture<PushResponse> push(PushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Push").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>This operation will be deprecated soon. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">advanced push API</a>, which provides enhanced push capabilities. To achieve the same result, set the <code>DeviceType</code> parameter to <code>ANDROID</code> and the <code>PushType</code> parameter to <code>MESSAGE</code> in the advanced push API.</em>*
     * <strong>Before using this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> for EMAS Mobile Push.</strong>
     * By default, this operation sends messages only to online devices. If a device is offline, set the <code>StoreOffline</code> parameter. The push system then stores the message and delivers it automatically when the device comes online.</p>
     * 
     * @param request the request parameters of PushMessageToAndroid  PushMessageToAndroidRequest
     * @return PushMessageToAndroidResponse
     */
    @Override
    public CompletableFuture<PushMessageToAndroidResponse> pushMessageToAndroid(PushMessageToAndroidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushMessageToAndroid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushMessageToAndroidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushMessageToAndroidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>This API is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">advanced push API</a> for more push capabilities. In that API, set the push platform <code>DeviceType</code> to <code>iOS</code> and the push type <code>PushType</code> to <code>MESSAGE</code> to achieve the same effect.</em>*
     * <strong>Before you use this API, review the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> for EMAS Mobile Push.</strong>
     * By default, this API sends messages only to online devices. If a device is offline, you can set the <code>StoreOffline</code> parameter. The push system then saves the message and automatically delivers it when the device comes back online.</p>
     * 
     * @param request the request parameters of PushMessageToiOS  PushMessageToiOSRequest
     * @return PushMessageToiOSResponse
     */
    @Override
    public CompletableFuture<PushMessageToiOSResponse> pushMessageToiOS(PushMessageToiOSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushMessageToiOS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushMessageToiOSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushMessageToiOSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">Advanced Push API</a> instead. In that API, set the <code>DeviceType</code> parameter to <code>ANDROID</code> and the <code>PushType</code> parameter to <code>NOTICE</code>.</em>*
     * <strong>Before using this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing model</a> for EMAS Mobile Push.</strong></p>
     * 
     * @param request the request parameters of PushNoticeToAndroid  PushNoticeToAndroidRequest
     * @return PushNoticeToAndroidResponse
     */
    @Override
    public CompletableFuture<PushNoticeToAndroidResponse> pushNoticeToAndroid(PushNoticeToAndroidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushNoticeToAndroid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushNoticeToAndroidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushNoticeToAndroidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">Advanced Push API</a> instead. Set the <code>DeviceType</code> parameter to <code>iOS</code> and the <code>PushType</code> parameter to <code>NOTICE</code>.</em>*
     * <strong>Before you use this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing model</a> for EMAS Mobile Push.</strong></p>
     * 
     * @param request the request parameters of PushNoticeToiOS  PushNoticeToiOSRequest
     * @return PushNoticeToiOSResponse
     */
    @Override
    public CompletableFuture<PushNoticeToiOSResponse> pushNoticeToiOS(PushNoticeToiOSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushNoticeToiOS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushNoticeToiOSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushNoticeToiOSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing rules and pricing</a> of EMAS mobile push.</em>*
     * This operation differentiates between the Android, iOS, and HarmonyOS platforms. To send push notifications to different platforms, pass in the AppKey that corresponds to the target platform.</p>
     * 
     * @param request the request parameters of PushV2  PushV2Request
     * @return PushV2Response
     */
    @Override
    public CompletableFuture<PushV2Response> pushV2(PushV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAliases  QueryAliasesRequest
     * @return QueryAliasesResponse
     */
    @Override
    public CompletableFuture<QueryAliasesResponse> queryAliases(QueryAliasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAliases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAliasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAliasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceInfo  QueryDeviceInfoRequest
     * @return QueryDeviceInfoResponse
     */
    @Override
    public CompletableFuture<QueryDeviceInfoResponse> queryDeviceInfo(QueryDeviceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Currently, this API supports only daily data. The daily dimension lets you query data for up to 31 days. Days are calculated based on UTC+8.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceStat  QueryDeviceStatRequest
     * @return QueryDeviceStatResponse
     */
    @Override
    public CompletableFuture<QueryDeviceStatResponse> queryDeviceStat(QueryDeviceStatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceStat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceStatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceStatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDevicesByAccount  QueryDevicesByAccountRequest
     * @return QueryDevicesByAccountResponse
     */
    @Override
    public CompletableFuture<QueryDevicesByAccountResponse> queryDevicesByAccount(QueryDevicesByAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicesByAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicesByAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicesByAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDevicesByAlias  QueryDevicesByAliasRequest
     * @return QueryDevicesByAliasResponse
     */
    @Override
    public CompletableFuture<QueryDevicesByAliasResponse> queryDevicesByAlias(QueryDevicesByAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicesByAlias").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicesByAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicesByAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPushRecords  QueryPushRecordsRequest
     * @return QueryPushRecordsResponse
     */
    @Override
    public CompletableFuture<QueryPushRecordsResponse> queryPushRecords(QueryPushRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPushRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPushRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPushRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPushStatByApp  QueryPushStatByAppRequest
     * @return QueryPushStatByAppResponse
     */
    @Override
    public CompletableFuture<QueryPushStatByAppResponse> queryPushStatByApp(QueryPushStatByAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPushStatByApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPushStatByAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPushStatByAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPushStatByMsg  QueryPushStatByMsgRequest
     * @return QueryPushStatByMsgResponse
     */
    @Override
    public CompletableFuture<QueryPushStatByMsgResponse> queryPushStatByMsg(QueryPushStatByMsgRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPushStatByMsg").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPushStatByMsgResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPushStatByMsgResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTags  QueryTagsRequest
     * @return QueryTagsResponse
     */
    @Override
    public CompletableFuture<QueryTagsResponse> queryTags(QueryTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation returns data only at the daily granularity. You can query up to 31 days of data. Deduplicated device counts reset on the first day of each month.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryUniqueDeviceStat  QueryUniqueDeviceStatRequest
     * @return QueryUniqueDeviceStatResponse
     */
    @Override
    public CompletableFuture<QueryUniqueDeviceStatResponse> queryUniqueDeviceStat(QueryUniqueDeviceStatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryUniqueDeviceStat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryUniqueDeviceStatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryUniqueDeviceStatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deleting a tag takes time. The time required depends on the number of tagged resources. Do not immediately recreate a tag with the same name after you delete it. Wait at least 5 minutes before you recreate a tag in the same app. If you delete multiple tags, wait at least 5 minutes for each deleted tag before you recreate them.</p>
     * 
     * @param request the request parameters of RemoveTag  RemoveTagRequest
     * @return RemoveTagResponse
     */
    @Override
    public CompletableFuture<RemoveTagResponse> removeTag(RemoveTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindAlias  UnbindAliasRequest
     * @return UnbindAliasResponse
     */
    @Override
    public CompletableFuture<UnbindAliasResponse> unbindAlias(UnbindAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindAlias").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindPhone  UnbindPhoneRequest
     * @return UnbindPhoneResponse
     */
    @Override
    public CompletableFuture<UnbindPhoneResponse> unbindPhone(UnbindPhoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindPhone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindPhoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindPhoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindTag  UnbindTagRequest
     * @return UnbindTagResponse
     */
    @Override
    public CompletableFuture<UnbindTagResponse> unbindTag(UnbindTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
