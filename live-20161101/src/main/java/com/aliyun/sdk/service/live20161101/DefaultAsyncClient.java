// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.live20161101.models.*;
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
        this.product = "live";
        this.version = "2016-11-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "live.aliyuncs.com"),
            new TeaPair("cn-beijing", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "live.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "live.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "live.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "live.aliyuncs.com"),
            new TeaPair("eu-central-1", "live.aliyuncs.com"),
            new TeaPair("ap-south-1", "live.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "live.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "live.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "live.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "live.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "live.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "live.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "live.aliyuncs.com"),
            new TeaPair("cn-chengdu", "live.aliyuncs.com"),
            new TeaPair("cn-edge-1", "live.aliyuncs.com"),
            new TeaPair("cn-fujian", "live.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "live.aliyuncs.com"),
            new TeaPair("cn-hongkong", "live.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "live.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "live.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "live.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "live.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "live.aliyuncs.com"),
            new TeaPair("cn-wuhan", "live.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "live.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "live.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "live.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "live.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "live.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "live.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "live.aliyuncs.com"),
            new TeaPair("eu-west-1", "live.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "live.aliyuncs.com"),
            new TeaPair("me-east-1", "live.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "live.aliyuncs.com"),
            new TeaPair("us-east-1", "live.aliyuncs.com"),
            new TeaPair("us-west-1", "live.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to add a component to a production studio, you must first create the production studio and learn about the production studio layouts. You can call this operation to add three types of components: image, text, and subtitle. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterComponent  AddCasterComponentRequest
     * @return AddCasterComponentResponse
     */
    @Override
    public CompletableFuture<AddCasterComponentResponse> addCasterComponent(AddCasterComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCasterComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCasterComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCasterComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To call this operation, you must obtain the production studio ID in advance. The production studio ID is generated after the production studio is created.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.<blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterEpisode  AddCasterEpisodeRequest
     * @return AddCasterEpisodeResponse
     */
    @Override
    public CompletableFuture<AddCasterEpisodeResponse> addCasterEpisode(AddCasterEpisodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCasterEpisode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCasterEpisodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCasterEpisodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You need to create a production studio and obtain the production studio configurations before you call this operation to create an episode list in the production studio. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterEpisodeGroup  AddCasterEpisodeGroupRequest
     * @return AddCasterEpisodeGroupResponse
     */
    @Override
    public CompletableFuture<AddCasterEpisodeGroupResponse> addCasterEpisodeGroup(AddCasterEpisodeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCasterEpisodeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCasterEpisodeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCasterEpisodeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You need to create a production studio and add an episode list to the production studio before you call this operation to add information about the episode list in the production studio. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterEpisodeGroupContent  AddCasterEpisodeGroupContentRequest
     * @return AddCasterEpisodeGroupContentResponse
     */
    @Override
    public CompletableFuture<AddCasterEpisodeGroupContentResponse> addCasterEpisodeGroupContent(AddCasterEpisodeGroupContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCasterEpisodeGroupContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCasterEpisodeGroupContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCasterEpisodeGroupContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>First, create a director desk and add video resources to the director desk, then call this interface to add the director desk layout. To create a director desk using the API, refer to <a href="https://help.aliyun.com/document_detail/69338.html">Create Director Desk</a>.</p>
     * <h2>QPS Limitation</h2>
     * <p>The per-user QPS limit for this interface is 10 times/second. Exceeding this limit will result in API calls being throttled, which may impact your business operations. Please use the API reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitation</a>.</p>
     * 
     * @param request the request parameters of AddCasterLayout  AddCasterLayoutRequest
     * @return AddCasterLayoutResponse
     */
    @Override
    public CompletableFuture<AddCasterLayoutResponse> addCasterLayout(AddCasterLayoutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCasterLayout").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCasterLayoutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCasterLayoutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Create a production studio, add input sources to the production studio, and then call this operation to add the episode list for carousel playback in the production studio. This operation supports videos and components as episodes. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterProgram  AddCasterProgramRequest
     * @return AddCasterProgramResponse
     */
    @Override
    public CompletableFuture<AddCasterProgramResponse> addCasterProgram(AddCasterProgramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCasterProgram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCasterProgramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCasterProgramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>Create a production studio, and then call this operation to add a video source to the production studio. The number of video sources is limited by the number of input channels of the production studio. For information about how to create a production studio by calling an API operation, see <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a>.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of AddCasterVideoResource  AddCasterVideoResourceRequest
     * @return AddCasterVideoResourceResponse
     */
    @Override
    public CompletableFuture<AddCasterVideoResourceResponse> addCasterVideoResource(AddCasterVideoResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCasterVideoResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCasterVideoResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCasterVideoResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following types of custom transcoding templates:</p>
     * <ul>
     * <li>h264: H.264</li>
     * <li>h264-nbhd: H.264 Narrowband HD™</li>
     * <li>h265: H.265</li>
     * <li>h265-nbhd: H.265 Narrowband HD™</li>
     * <li>audio: audio-only</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AddCustomLiveStreamTranscode  AddCustomLiveStreamTranscodeRequest
     * @return AddCustomLiveStreamTranscodeResponse
     */
    @Override
    public CompletableFuture<AddCustomLiveStreamTranscodeResponse> addCustomLiveStreamTranscode(AddCustomLiveStreamTranscodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCustomLiveStreamTranscode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCustomLiveStreamTranscodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCustomLiveStreamTranscodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After you call the <a href="https://help.aliyun.com/document_detail/2848222.html">AddLiveAISubtitle</a> operation to add a subtitle template, you can call this operation to create a subtitle rule for the template.</p>
     * <ul>
     * <li>You must add &quot;_Subtitle template name&quot; after the stream name in the streaming URL to play the subtitle stream.<ul>
     * <li>RTMP: rtmp://example.aliyundoc.com/app/stream_{Subtitle template name}?auth_key={Access token}</li>
     * <li>FLV: <a href="http://example.aliyundoc.com/app/stream_%7BSubtitle">http://example.aliyundoc.com/app/stream_{Subtitle</a> template name}.flv?auth_key={Access token}</li>
     * <li>M3U8: <a href="http://example.aliyundoc.com/app/stream_%7BSubtitle">http://example.aliyundoc.com/app/stream_{Subtitle</a> template name}.m3u8?auth_key={Access token}<blockquote>
     * <p> The live subtitles feature is in invitational preview. You can add up to 300 subtitle templates.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveAIProduceRules  AddLiveAIProduceRulesRequest
     * @return AddLiveAIProduceRulesResponse
     */
    @Override
    public CompletableFuture<AddLiveAIProduceRulesResponse> addLiveAIProduceRules(AddLiveAIProduceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveAIProduceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveAIProduceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveAIProduceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Instructions</h2>
     * <ul>
     * <li>This interface supports adding live caption template configurations, with templates configurable to describe caption content, layout, and more. </li>
     * <li>After adding caption templates, you also need to call the <a href="https://help.aliyun.com/document_detail/2799676.html">AddLiveAIProduceRules</a> interface to add caption rules. Restarting the stream will then enable captions in the broadcast. </li>
     * <li>Real-time captions are currently supported in Beijing, Shanghai, Singapore, Indonesia, and Saudi regions.<blockquote>
     * <p>Notice: The real-time caption feature is currently in beta testing. Each user can add up to 300 caption templates.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS Limit</h2>
     * <p>The QPS limit for this interface per user is 60 requests/second. Exceeding this limit will result in API throttling, which may impact your services. Please use judiciously. For more information, refer to <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitations</a>.</p>
     * 
     * @param request the request parameters of AddLiveAISubtitle  AddLiveAISubtitleRequest
     * @return AddLiveAISubtitleResponse
     */
    @Override
    public CompletableFuture<AddLiveAISubtitleResponse> addLiveAISubtitle(AddLiveAISubtitleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveAISubtitle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveAISubtitleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveAISubtitleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The live stream recording feature allows you to record a live stream and stores the recordings in a specified location. You can view the recordings whenever you want to. Recordings that are stored in OSS support multiple formats, such as Transport Stream (TS), MP4, Flash Video (FLV), and Common Media Application Format (CMAF). You can use different recording policies, including automatic recording, on-demand recording, and manual recording. By calling this operation, you can configure the recording template. For more information about live stream recording, see <a href="https://help.aliyun.com/document_detail/199357.html">Live stream recording</a>.
     * A configuration is identified by the DomainName, AppName, and StreamName parameters all together. If you try to call this operation to add a configuration that has the same DomainName, AppName, and StreamName parameters as an existing configuration, an error indicating that the configuration already exists is returned.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveAppRecordConfig  AddLiveAppRecordConfigRequest
     * @return AddLiveAppRecordConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveAppRecordConfigResponse> addLiveAppRecordConfig(AddLiveAppRecordConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveAppRecordConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveAppRecordConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveAppRecordConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you fully understand the billing method and pricing of live stream snapshots in ApsaraVideo Live. For more information, see <a href="https://help.aliyun.com/document_detail/195286.html">Billing of live stream snapshots</a>.</p>
     * <ul>
     * <li>Make sure that Object Storage Service (OSS) is activated and a specific bucket is created. This way, ApsaraVideo Live can store live stream snapshots in the bucket. For more information, see <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>.</li>
     * <li>If you store snapshots in OSS, storage fees are generated. For more information, see <a href="https://help.aliyun.com/document_detail/173534.html">Storage fees</a>.</li>
     * <li>The OSS bucket must reside in the same region as the live center of the streaming domain. Cross-region snapshot capture is not supported.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveAppSnapshotConfig  AddLiveAppSnapshotConfigRequest
     * @return AddLiveAppSnapshotConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveAppSnapshotConfigResponse> addLiveAppSnapshotConfig(AddLiveAppSnapshotConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveAppSnapshotConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveAppSnapshotConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveAppSnapshotConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The content moderation feature detects undesirable sensitive content in the audio from live streams and returns callbacks to notify you of the violations. Then, you can manually review the content and take actions accordingly.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveAudioAuditConfig  AddLiveAudioAuditConfigRequest
     * @return AddLiveAudioAuditConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveAudioAuditConfigResponse> addLiveAudioAuditConfig(AddLiveAudioAuditConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveAudioAuditConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveAudioAuditConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveAudioAuditConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The content moderation feature returns the audio moderation results based on the configured callback template.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveAudioAuditNotifyConfig  AddLiveAudioAuditNotifyConfigRequest
     * @return AddLiveAudioAuditNotifyConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveAudioAuditNotifyConfigResponse> addLiveAudioAuditNotifyConfig(AddLiveAudioAuditNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveAudioAuditNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveAudioAuditNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveAudioAuditNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveCenterTransfer  AddLiveCenterTransferRequest
     * @return AddLiveCenterTransferResponse
     */
    @Override
    public CompletableFuture<AddLiveCenterTransferResponse> addLiveCenterTransfer(AddLiveCenterTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveCenterTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveCenterTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveCenterTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The automated review feature sends notifications about violations to the callback URL in real time. Then, you can manually review the content and take actions accordingly.</p>
     * <ul>
     * <li>Only some live centers support the automated review feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of AddLiveDetectNotifyConfig  AddLiveDetectNotifyConfigRequest
     * @return AddLiveDetectNotifyConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveDetectNotifyConfigResponse> addLiveDetectNotifyConfig(AddLiveDetectNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveDetectNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveDetectNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveDetectNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You must activate ApsaraVideo Live before you add a domain name. For more information, see <a href="https://help.aliyun.com/document_detail/195292.html">Activate ApsaraVideo Live</a>.</p>
     * <ul>
     * <li>ApsaraVideo Live verifies the ownership of a new domain name that you add. After the verification is passed, the domain name is added to ApsaraVideo Live. ApsaraVideo Live allows you to use a Domain Name System (DNS) record or a verification file to verify the ownership of a domain name. For more information, see <a href="https://help.aliyun.com/document_detail/184466.html">Verify the ownership of a domain name</a>.</li>
     * <li>To use ApsaraVideo Live to ingest and play streams, you must add an ingest domain and a streaming domain. You can add only one domain name at a time.</li>
     * <li>After you add a domain name, you must configure a CNAME record for the domain name. For more information, see <a href="https://help.aliyun.com/document_detail/84929.html">Add a CNAME record</a>.</li>
     * <li>After you add an ingest domain and a streaming domain, you must associate the streaming domain with the ingest domain. For more information, see <a href="https://help.aliyun.com/document_detail/199338.html">Associate a streaming domain with an ingest domain</a>.<blockquote>
     * <p> From February 19, 2019, domain names that are added by calling the AddLiveDomain operation do not support live center ingest. Domain names that are added by using Alibaba Cloud CDN also do not support live center ingest. When you call the AddLiveDomain operation, you can set the LiveDomainType parameter to liveEdge to add an ingest domain that uses edge ingest or set the LiveDomainType parameter to liveVideo to add a streaming domain. You can associate a streaming domain with an ingest domain by calling the AddLiveDomainMapping operation. Domain names added before February 19, 2019, for which live center ingest was configured, are not affected.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveDomain  AddLiveDomainRequest
     * @return AddLiveDomainResponse
     */
    @Override
    public CompletableFuture<AddLiveDomainResponse> addLiveDomain(AddLiveDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call the <a href="https://help.aliyun.com/document_detail/88327.html">AddLiveDomain</a> operation to add a streaming domain and an ingest domain, and then call this operation to create the mapping between the two domain names.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AddLiveDomainMapping  AddLiveDomainMappingRequest
     * @return AddLiveDomainMappingResponse
     */
    @Override
    public CompletableFuture<AddLiveDomainMappingResponse> addLiveDomainMapping(AddLiveDomainMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveDomainMapping").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveDomainMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveDomainMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/88327.html">AddLiveDomain</a> operation to add a main streaming domain and a sub-streaming domain and then call this operation to map the sub-streaming domain to the main streaming domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveDomainPlayMapping  AddLiveDomainPlayMappingRequest
     * @return AddLiveDomainPlayMappingResponse
     */
    @Override
    public CompletableFuture<AddLiveDomainPlayMappingResponse> addLiveDomainPlayMapping(AddLiveDomainPlayMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveDomainPlayMapping").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveDomainPlayMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveDomainPlayMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveMessageGroupBand  AddLiveMessageGroupBandRequest
     * @return AddLiveMessageGroupBandResponse
     */
    @Override
    public CompletableFuture<AddLiveMessageGroupBandResponse> addLiveMessageGroupBand(AddLiveMessageGroupBandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveMessageGroupBand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveMessageGroupBandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveMessageGroupBandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The first time you configure encapsulation for a domain name, domain acceleration is automatically configured and takes effect in 3 to 5 minutes.</p>
     * <ul>
     * <li>If the streaming domain resides in a region outside China, including Singapore, Germany (Frankfurt), Japan (Tokyo), and Indonesia (Jakarta), you may encounter high latency issues. We recommend that you test and verify whether the settings meet expectations.</li>
     * <li>You can call this operation to add a live stream encapsulation configuration. The configuration takes effect only after you re-ingest the stream.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 300 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLivePackageConfig  AddLivePackageConfigRequest
     * @return AddLivePackageConfigResponse
     */
    @Override
    public CompletableFuture<AddLivePackageConfigResponse> addLivePackageConfig(AddLivePackageConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLivePackageConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLivePackageConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLivePackageConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you fully understand the billing method and pricing of stream pulling in ApsaraVideo Live. For more information, see <a href="https://help.aliyun.com/document_detail/195284.html">Billing of standard streaming</a>.</p>
     * <ul>
     * <li>Stream pulling refers to the process of pulling live streams from third-party streaming URLs to a live center of ApsaraVideo Live for CDN acceleration.</li>
     * <li>You can call this operation only for regular stream pulling. That is, you can specify the start time and end time to pull live streams.</li>
     * <li>Regular stream pulling and triggered stream pulling are supported in the ApsaraVideo Live console. For more information, see <a href="https://help.aliyun.com/document_detail/199452.html">Configure stream pulling</a>.</li>
     * <li>You can specify custom values for the AppName and StreamName parameters. Streaming URLs that are generated vary based on different values of the AppName and StreamName parameters. You can use the <a href="https://help.aliyun.com/document_detail/197400.html">URL generator</a> to generate a streaming URL.</li>
     * <li>A configuration is identified by the DomainName, AppName, and StreamName parameters all together. If you try to call this operation to add a configuration that has the same DomainName, AppName, and StreamName parameters as an existing configuration, an error indicating that the configuration already exists is returned.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLivePullStreamInfoConfig  AddLivePullStreamInfoConfigRequest
     * @return AddLivePullStreamInfoConfigResponse
     */
    @Override
    public CompletableFuture<AddLivePullStreamInfoConfigResponse> addLivePullStreamInfoConfig(AddLivePullStreamInfoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLivePullStreamInfoConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLivePullStreamInfoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLivePullStreamInfoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to configure recording callbacks for a domain name, you can query whether the domain name already has recording callbacks configured. For more information, see <a href="https://help.aliyun.com/document_detail/2847893.html">DescribeLiveRecordNotifyConfig</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveRecordNotifyConfig  AddLiveRecordNotifyConfigRequest
     * @return AddLiveRecordNotifyConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveRecordNotifyConfigResponse> addLiveRecordNotifyConfig(AddLiveRecordNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveRecordNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveRecordNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveRecordNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure the Live-to-VOD feature to store recordings in the media library of ApsaraVideo VOD.</p>
     * <blockquote>
     * <p> You cannot configure the Live-to-VOD feature by using a Finance Cloud account.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveRecordVodConfig  AddLiveRecordVodConfigRequest
     * @return AddLiveRecordVodConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveRecordVodConfigResponse> addLiveRecordVodConfig(AddLiveRecordVodConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveRecordVodConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveRecordVodConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveRecordVodConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The live streaming audit function identifies and reviews违规sensitive content at the domain and App level, and promptly notifies users of such violations via callbacks. Users can then review the content and take appropriate actions.</li>
     * <li>Currently, only some live streaming centers support intelligent auditing. For a list of live streaming centers that support this feature, please refer to <a href="https://help.aliyun.com/document_detail/193730.html">Service Regions</a>.</li>
     * </ul>
     * <h2>QPS Limitation</h2>
     * <p>The QPS limit for this API per user is 30 requests/second. Exceeding this limit will result in API throttling, which may impact your services. Please use the API judiciously. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitations</a>.</p>
     * 
     * @param request the request parameters of AddLiveSnapshotDetectPornConfig  AddLiveSnapshotDetectPornConfigRequest
     * @return AddLiveSnapshotDetectPornConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveSnapshotDetectPornConfigResponse> addLiveSnapshotDetectPornConfig(AddLiveSnapshotDetectPornConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveSnapshotDetectPornConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveSnapshotDetectPornConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveSnapshotDetectPornConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS Limit</h3>
     * <p>The QPS limit for this API per user is 30 times/second. Exceeding this limit will result in API calls being throttled, which may impact your business operations. Please use the API reasonably. For more information, please refer to <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitation</a>.</p>
     * 
     * @param request the request parameters of AddLiveSnapshotNotifyConfig  AddLiveSnapshotNotifyConfigRequest
     * @return AddLiveSnapshotNotifyConfigResponse
     */
    @Override
    public CompletableFuture<AddLiveSnapshotNotifyConfigResponse> addLiveSnapshotNotifyConfig(AddLiveSnapshotNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveSnapshotNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveSnapshotNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveSnapshotNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveStreamMerge  AddLiveStreamMergeRequest
     * @return AddLiveStreamMergeResponse
     */
    @Override
    public CompletableFuture<AddLiveStreamMergeResponse> addLiveStreamMerge(AddLiveStreamMergeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveStreamMerge").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveStreamMergeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveStreamMergeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must obtain the customer master key (CMK) in Key Management Service (KMS) before you call this operation to add transcoding configurations. Only standard transcoding templates and Narrowband HD™ transcoding templates are supported for this operation.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of AddLiveStreamTranscode  AddLiveStreamTranscodeRequest
     * @return AddLiveStreamTranscodeResponse
     */
    @Override
    public CompletableFuture<AddLiveStreamTranscodeResponse> addLiveStreamTranscode(AddLiveStreamTranscodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveStreamTranscode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveStreamTranscodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveStreamTranscodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create a watermark template and configure information such as the watermark content and layout in the template.</p>
     * <ul>
     * <li>After you create a watermark template, you must also call the <a href="https://help.aliyun.com/document_detail/2848100.html">AddLiveStreamWatermarkRule</a> operation to add a watermark rule. A live stream in progress can contain the watermark only after the stream is re-ingested.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveStreamWatermark  AddLiveStreamWatermarkRequest
     * @return AddLiveStreamWatermarkResponse
     */
    @Override
    public CompletableFuture<AddLiveStreamWatermarkResponse> addLiveStreamWatermark(AddLiveStreamWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveStreamWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveStreamWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveStreamWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After calling the <a href="https://help.aliyun.com/document_detail/469416.html">AddLiveStreamWatermark</a> API to add a watermark template, you can use this interface to add watermark rules. </p>
     * <h2>QPS Limit</h2>
     * <p> The QPS limit for this interface per user is 60 times/second. Exceeding the limit will result in API calls being throttled, which may impact your business. Please use it reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limit</a>.</p>
     * 
     * @param request the request parameters of AddLiveStreamWatermarkRule  AddLiveStreamWatermarkRuleRequest
     * @return AddLiveStreamWatermarkRuleResponse
     */
    @Override
    public CompletableFuture<AddLiveStreamWatermarkRuleResponse> addLiveStreamWatermarkRule(AddLiveStreamWatermarkRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLiveStreamWatermarkRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLiveStreamWatermarkRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLiveStreamWatermarkRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Create a production studio, add a layout and components to the production studio, and then call this operation to add episodes. If no episode list exists in the production studio, this operation creates an episode list for the production studio. For more information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddPlaylistItems  AddPlaylistItemsRequest
     * @return AddPlaylistItemsResponse
     */
    @Override
    public CompletableFuture<AddPlaylistItemsResponse> addPlaylistItems(AddPlaylistItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPlaylistItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPlaylistItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPlaylistItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add an RTS transcoding configuration. This operation supports four template types: h264, h264-nbhd, h264-origin, and audio.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of AddRtsLiveStreamTranscode  AddRtsLiveStreamTranscodeRequest
     * @return AddRtsLiveStreamTranscodeResponse
     */
    @Override
    public CompletableFuture<AddRtsLiveStreamTranscodeResponse> addRtsLiveStreamTranscode(AddRtsLiveStreamTranscodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddRtsLiveStreamTranscode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddRtsLiveStreamTranscodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddRtsLiveStreamTranscodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must create a production studio in the new playlist mode and add media resources to the production studio before you can call this operation. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.
     * You can add up to 1,000 episodes to an episode list.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>When you select media resources from ApsaraVideo VOD, we recommend that you select resources that are stored in hosted OSS buckets. Resources stored in non-hosted OSS buckets have a validity period. Pay attention to the validity if you select resources that are stored in non-hosted OSS buckets.</li>
     * <li>When you add media resources to a production studio, we recommend that you select resources from ApsaraVideo Live and ApsaraVideo VOD. If you add a third-party stream by specifying a streaming URL, there is a possibility that the stream fails to be played. You must pay attention to the quality and validity of the third-party stream.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddShowIntoShowList  AddShowIntoShowListRequest
     * @return AddShowIntoShowListResponse
     */
    @Override
    public CompletableFuture<AddShowIntoShowListResponse> addShowIntoShowList(AddShowIntoShowListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddShowIntoShowList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddShowIntoShowListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddShowIntoShowListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure a common layout or a studio layout for a virtual studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddStudioLayout  AddStudioLayoutRequest
     * @return AddStudioLayoutResponse
     */
    @Override
    public CompletableFuture<AddStudioLayoutResponse> addStudioLayout(AddStudioLayoutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddStudioLayout").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddStudioLayoutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddStudioLayoutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the streaming domain, and then call this operation to insert SEI to the transcoded streams. Make sure that the stream name is the name of the source stream. This way, the SEI is inserted to all the transcoded streams.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddTrancodeSEI  AddTrancodeSEIRequest
     * @return AddTrancodeSEIResponse
     */
    @Override
    public CompletableFuture<AddTrancodeSEIResponse> addTrancodeSEI(AddTrancodeSEIRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTrancodeSEI").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTrancodeSEIResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTrancodeSEIResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of BanLiveMessageGroup  BanLiveMessageGroupRequest
     * @return BanLiveMessageGroupResponse
     */
    @Override
    public CompletableFuture<BanLiveMessageGroupResponse> banLiveMessageGroup(BanLiveMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BanLiveMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BanLiveMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BanLiveMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the domain names for which you want to delete the configurations, and then call this operation to delete the configurations of these domain domains at a time.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of BatchDeleteLiveDomainConfigs  BatchDeleteLiveDomainConfigsRequest
     * @return BatchDeleteLiveDomainConfigsResponse
     */
    @Override
    public CompletableFuture<BatchDeleteLiveDomainConfigsResponse> batchDeleteLiveDomainConfigs(BatchDeleteLiveDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteLiveDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteLiveDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteLiveDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can query whether up to 20 users are online at a time.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of BatchGetOnlineUsers  BatchGetOnlineUsersRequest
     * @return BatchGetOnlineUsersResponse
     */
    @Override
    public CompletableFuture<BatchGetOnlineUsersResponse> batchGetOnlineUsers(BatchGetOnlineUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetOnlineUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetOnlineUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetOnlineUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the domain names that you want to configure, and then call this operation to configure the domain names in batches.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of BatchSetLiveDomainConfigs  BatchSetLiveDomainConfigsRequest
     * @return BatchSetLiveDomainConfigsResponse
     */
    @Override
    public CompletableFuture<BatchSetLiveDomainConfigsResponse> batchSetLiveDomainConfigs(BatchSetLiveDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSetLiveDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSetLiveDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSetLiveDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS限制</h2>
     * <p>本接口的单用户QPS限制为100次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。更多信息，请参见<a href="https://help.aliyun.com/document_detail/343507.html">QPS限制</a>。</p>
     * 
     * @param request the request parameters of CancelMuteAllGroupUser  CancelMuteAllGroupUserRequest
     * @return CancelMuteAllGroupUserResponse
     */
    @Override
    public CompletableFuture<CancelMuteAllGroupUserResponse> cancelMuteAllGroupUser(CancelMuteAllGroupUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelMuteAllGroupUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelMuteAllGroupUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelMuteAllGroupUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of CancelMuteGroupUser  CancelMuteGroupUserRequest
     * @return CancelMuteGroupUserResponse
     */
    @Override
    public CompletableFuture<CancelMuteGroupUserResponse> cancelMuteGroupUser(CancelMuteGroupUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelMuteGroupUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelMuteGroupUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelMuteGroupUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChangeLiveDomainResourceGroup  ChangeLiveDomainResourceGroupRequest
     * @return ChangeLiveDomainResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeLiveDomainResourceGroupResponse> changeLiveDomainResourceGroup(ChangeLiveDomainResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeLiveDomainResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeLiveDomainResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeLiveDomainResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CheckLiveMessageUsersInGroup  CheckLiveMessageUsersInGroupRequest
     * @return CheckLiveMessageUsersInGroupResponse
     */
    @Override
    public CompletableFuture<CheckLiveMessageUsersInGroupResponse> checkLiveMessageUsersInGroup(CheckLiveMessageUsersInGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckLiveMessageUsersInGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckLiveMessageUsersInGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckLiveMessageUsersInGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CheckLiveMessageUsersOnline  CheckLiveMessageUsersOnlineRequest
     * @return CheckLiveMessageUsersOnlineResponse
     */
    @Override
    public CompletableFuture<CheckLiveMessageUsersOnlineResponse> checkLiveMessageUsersOnline(CheckLiveMessageUsersOnlineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckLiveMessageUsersOnline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckLiveMessageUsersOnlineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckLiveMessageUsersOnlineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the streaming domain, and then call this operation to disable time shifting for the streaming domain or an application or a live stream under the streaming domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CloseLiveShift  CloseLiveShiftRequest
     * @return CloseLiveShiftResponse
     */
    @Override
    public CompletableFuture<CloseLiveShiftResponse> closeLiveShift(CloseLiveShiftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseLiveShift").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseLiveShiftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseLiveShiftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to duplicate a production studio. This way, a new, identical production studio is created.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CopyCaster  CopyCasterRequest
     * @return CopyCasterResponse
     */
    @Override
    public CompletableFuture<CopyCasterResponse> copyCaster(CopyCasterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyCaster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyCasterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyCasterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Streaming fees and transcoding fees are calculated based on the corresponding output resolutions and durations. For more information, see <a href="https://help.aliyun.com/document_detail/64531.html">Billing of production studios</a>.</p>
     * <ul>
     * <li>You can call this operation to apply the configuration of a source scene to a destination scene. This operation takes effect only if the source scene is a PVW scene and the destination scene is a PGM scene. A PVW scene is a preview scene, and a PGM scene is a program scene.</li>
     * <li>The PVW scene and PGM scene must be in the same production studio.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CopyCasterSceneConfig  CopyCasterSceneConfigRequest
     * @return CopyCasterSceneConfigResponse
     */
    @Override
    public CompletableFuture<CopyCasterSceneConfigResponse> copyCasterSceneConfig(CopyCasterSceneConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyCasterSceneConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyCasterSceneConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyCasterSceneConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must enable the production studio feature before you can call this operation to create a production studio. For more information, see <a href="https://help.aliyun.com/document_detail/60361.html">Enable the production studio feature</a>.
     * You can call this operation to create production studios in general mode or playlist mode. Production studios in playlist mode can be used for carousel playback.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateCaster  CreateCasterRequest
     * @return CreateCasterResponse
     */
    @Override
    public CompletableFuture<CreateCasterResponse> createCaster(CreateCasterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCaster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCasterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCasterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation to create a custom template, record the template name. When you call the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation to create a stream mixing task, you can set the MixStreamTemplate parameter to the name of the custom template. This way, you can use the custom template for stream mixing.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateCustomTemplate  CreateCustomTemplateRequest
     * @return CreateCustomTemplateResponse
     */
    @Override
    public CompletableFuture<CreateCustomTemplateResponse> createCustomTemplate(CreateCustomTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create an edge transcoding task.</p>
     * <ul>
     * <li>To call this operation, make sure that you have the permissions to access the edge transcoding feature.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateEdgeTranscodeJob  CreateEdgeTranscodeJobRequest
     * @return CreateEdgeTranscodeJobResponse
     */
    @Override
    public CompletableFuture<CreateEdgeTranscodeJobResponse> createEdgeTranscodeJob(CreateEdgeTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEdgeTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a callback to subscribe to channel or user events. When you create a callback, you can configure parameters such as the callback URL and event type.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateEventSub  CreateEventSubRequest
     * @return CreateEventSubResponse
     */
    @Override
    public CompletableFuture<CreateEventSubResponse> createEventSub(CreateEventSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEventSub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEventSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEventSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The lightweight virtual studio feature is in invitational preview. You can add up to 300 virtual studio templates.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLiveAIStudio  CreateLiveAIStudioRequest
     * @return CreateLiveAIStudioResponse
     */
    @Override
    public CompletableFuture<CreateLiveAIStudioResponse> createLiveAIStudio(CreateLiveAIStudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveAIStudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveAIStudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveAIStudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Stream delay is different from latency caused by streaming protocols. Stream delay is a feature that allows you to delay the playback of a live stream that is processed in the cloud.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLiveDelayConfig  CreateLiveDelayConfigRequest
     * @return CreateLiveDelayConfigResponse
     */
    @Override
    public CompletableFuture<CreateLiveDelayConfigResponse> createLiveDelayConfig(CreateLiveDelayConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveDelayConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveDelayConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveDelayConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When you call other operations to manage the interactive messaging application, you must specify the same data center in which the application is created.</p>
     * <ul>
     * <li>You can create up to 300 interactive messaging applications in an Alibaba Cloud account.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLiveMessageApp  CreateLiveMessageAppRequest
     * @return CreateLiveMessageAppResponse
     */
    @Override
    public CompletableFuture<CreateLiveMessageAppResponse> createLiveMessageApp(CreateLiveMessageAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveMessageApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveMessageAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveMessageAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create an interactive messaging application.</p>
     * <ul>
     * <li>You can create up to 5,000 interactive messaging groups in an interactive messaging application.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLiveMessageGroup  CreateLiveMessageGroupRequest
     * @return CreateLiveMessageGroupResponse
     */
    @Override
    public CompletableFuture<CreateLiveMessageGroupResponse> createLiveMessageGroup(CreateLiveMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create a GA instance and bind it to an acceleration circuit. The granularity is at the stream level. You need to specify the access points where the acceleration circuit starts and ends.</p>
     * <ul>
     * <li>The settings take effect only if the value of AppName and the value of StreamName are the same as the application name and stream name that are specified in the streaming URL.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLivePrivateLine  CreateLivePrivateLineRequest
     * @return CreateLivePrivateLineResponse
     */
    @Override
    public CompletableFuture<CreateLivePrivateLineResponse> createLivePrivateLine(CreateLivePrivateLineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLivePrivateLine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLivePrivateLineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLivePrivateLineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The pulled-stream relay feature is in public preview. You can use it free of charge. After the public preview ends, fees will be charged. The specific end time will be announced.</p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation to create a pulled-stream relay task.</li>
     * <li>The pulled source can be a live stream or video-on-demand (VOD) resources.</li>
     * <li>After a task is created, it starts at the specified start time and ends at the specified end time. A task that ends is automatically deleted.</li>
     * <li>Make sure that the destination URL specified in the task is not used by another task. Otherwise, conflicts occur and stream ingest fails.</li>
     * <li>The events for pulled-stream relay callbacks include state changes of a pulled-stream relay task and exit of a pulled-stream relay task. For more information, see <a href="https://help.aliyun.com/document_detail/2846768.html">Pulled-stream relay callbacks</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLivePullToPush  CreateLivePullToPushRequest
     * @return CreateLivePullToPushResponse
     */
    @Override
    public CompletableFuture<CreateLivePullToPushResponse> createLivePullToPush(CreateLivePullToPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLivePullToPush").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLivePullToPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLivePullToPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>Obtain the streaming domain, and then call this operation to configure real-time log delivery for the streaming domain.
     * This operation is applicable to only streaming domains. If you want to configure real-time log delivery for an ingest domain, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12818093.nav-right.dticket.6cb216d07otFWR#/ticket/createIndex">submit a ticket</a>.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of CreateLiveRealTimeLogDelivery  CreateLiveRealTimeLogDeliveryRequest
     * @return CreateLiveRealTimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<CreateLiveRealTimeLogDeliveryResponse> createLiveRealTimeLogDelivery(CreateLiveRealTimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveRealTimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveRealTimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveRealTimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a monitoring session. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLiveStreamMonitor  CreateLiveStreamMonitorRequest
     * @return CreateLiveStreamMonitorResponse
     */
    @Override
    public CompletableFuture<CreateLiveStreamMonitorResponse> createLiveStreamMonitor(CreateLiveStreamMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveStreamMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveStreamMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveStreamMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must have configured Object Storage Service (OSS) before you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/84932.html">Configure OSS</a>. ApsaraVideo Live allows you to record a live stream in the M3U8 format and store the M3U8 file in OSS. You can edit the TS segments that are included in the stored M3U8 file in real time.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can create an index file only after a live stream is ingested. If no live stream is available within the specified time range or the name of the specified live stream is invalid, the index file fails to be created.</li>
     * <li>The time range that is specified by the StartTime and EndTime parameters must be the duration of at least one TS segment. The default duration of a TS segment is 30 seconds.</li>
     * <li>ApsaraVideo Live stores the information about TS segments for only three months. You can create M3U8 index files only for the recordings of the last three months.</li>
     * <li>OSS stores TS segments for a time period that is specified by the storage configuration in OSS. For more information, see <a href="https://help.aliyun.com/document_detail/31904.html">Configure lifecycle rules</a>.</li>
     * <li>ApsaraVideo Live stores the information about M3U8 index files for six months. You can query the information about only the M3U8 index files that were created in the last six months.</li>
     * <li>OSS stores M3U8 index files for a time period that is specified by the storage configuration in OSS.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 45 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLiveStreamRecordIndexFiles  CreateLiveStreamRecordIndexFilesRequest
     * @return CreateLiveStreamRecordIndexFilesResponse
     */
    @Override
    public CompletableFuture<CreateLiveStreamRecordIndexFilesResponse> createLiveStreamRecordIndexFiles(CreateLiveStreamRecordIndexFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLiveStreamRecordIndexFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLiveStreamRecordIndexFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLiveStreamRecordIndexFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of CreateMessageApp  CreateMessageAppRequest
     * @return CreateMessageAppResponse
     */
    @Override
    public CompletableFuture<CreateMessageAppResponse> createMessageApp(CreateMessageAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMessageApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMessageAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMessageAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of CreateMessageGroup  CreateMessageGroupRequest
     * @return CreateMessageGroupResponse
     */
    @Override
    public CompletableFuture<CreateMessageGroupResponse> createMessageGroup(CreateMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a stream mixing task. This operation supports preset layouts and custom layouts.
     * If you have any questions or suggestions about the use of the stream mixing feature, you are welcome to search the group ID 34935990 in DingTalk to join the developer group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateMixStream  CreateMixStreamRequest
     * @return CreateMixStreamResponse
     */
    @Override
    public CompletableFuture<CreateMixStreamResponse> createMixStream(CreateMixStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMixStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMixStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMixStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRTCWhipStreamAddress  CreateRTCWhipStreamAddressRequest
     * @return CreateRTCWhipStreamAddressResponse
     */
    @Override
    public CompletableFuture<CreateRTCWhipStreamAddressResponse> createRTCWhipStreamAddress(CreateRTCWhipStreamAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRTCWhipStreamAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRTCWhipStreamAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRTCWhipStreamAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>To use the interactive streaming feature, you must use ApsaraVideo Real-time Communication (ARTC) SDK to join a channel and ingest streams over Real-Time Communication (RTC). In specific scenarios, you can ingest streams over Real-Time Messaging Protocol (RTMP) by using tools such as Open Broadcaster Software (OBS). Then, ApsaraVideo Live automatically converts the RTMP streams to RTC streams and distributes the RTC streams to viewers. You can call this operation to generate an ingest URL in the RTMP format. After you ingest RTMP streams, ApsaraVideo Live automatically converts the streams to RTC streams. Do not call this operation if you require only regular live streaming. To quickly ingest RTMP streams and start live streaming, see <a href="https://help.aliyun.com/document_detail/198676.html">Get started with ApsaraVideo Live</a>.</p>
     * <h2><a href="#"></a>Procedure</h2>
     * <ol>
     * <li>Call this operation to generate an ingest URL in the RTMP format.</li>
     * <li>Ingest a stream by using the ingest URL. Other users in the channel can watch the stream.</li>
     * <li>Stop ingesting the stream. Other users in the channel see that the user who ingested the stream leaves the channel.<blockquote>
     * </blockquote>
     * </li>
     * </ol>
     * <ul>
     * <li>You can repeat Steps 2 and 3 within the validity period of the ingest URL.</li>
     * <li>We recommend that you call the <a href="https://help.aliyun.com/document_detail/610801.html">DescribeChannelParticipants</a> operation to query online users in the channel at regular intervals. This way, you can check whether the user who ingests the stream is still in the channel. If the user who ingests the stream is not in the channel, the stream may be interrupted. In this case, we recommend that you stop ingesting the stream and perform Step 2.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of CreateRoomRealTimeStreamAddress  CreateRoomRealTimeStreamAddressRequest
     * @return CreateRoomRealTimeStreamAddressResponse
     */
    @Override
    public CompletableFuture<CreateRoomRealTimeStreamAddressResponse> createRoomRealTimeStreamAddress(CreateRoomRealTimeStreamAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRoomRealTimeStreamAddress").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRoomRealTimeStreamAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRoomRealTimeStreamAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a live subtitle task that transcribes audio in a live stream to text in real time.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateRtcAsrTask  CreateRtcAsrTaskRequest
     * @return CreateRtcAsrTaskResponse
     */
    @Override
    public CompletableFuture<CreateRtcAsrTaskResponse> createRtcAsrTask(CreateRtcAsrTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRtcAsrTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRtcAsrTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRtcAsrTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a subscription to mixed-stream relay events. You can configure parameters such as the callback URL, application to which you want to subscribe, and channel information when you create a subscription.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateRtcMPUEventSub  CreateRtcMPUEventSubRequest
     * @return CreateRtcMPUEventSubResponse
     */
    @Override
    public CompletableFuture<CreateRtcMPUEventSubResponse> createRtcMPUEventSub(CreateRtcMPUEventSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRtcMPUEventSub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRtcMPUEventSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRtcMPUEventSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can delete only production studios that are closed.</p>
     * <ul>
     * <li>When a production studio is deleted, the scenes, components, and layouts of the production studio are also deleted.</li>
     * <li>You cannot recover a deleted production studio.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCaster  DeleteCasterRequest
     * @return DeleteCasterResponse
     */
    @Override
    public CompletableFuture<DeleteCasterResponse> deleteCaster(DeleteCasterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCaster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCasterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCasterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to delete a component in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCasterComponent  DeleteCasterComponentRequest
     * @return DeleteCasterComponentResponse
     */
    @Override
    public CompletableFuture<DeleteCasterComponentResponse> deleteCasterComponent(DeleteCasterComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCasterComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCasterComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCasterComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete an episode in a production studio, you must obtain the ID of the production studio and the ID of the episode.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCasterEpisode  DeleteCasterEpisodeRequest
     * @return DeleteCasterEpisodeResponse
     */
    @Override
    public CompletableFuture<DeleteCasterEpisodeResponse> deleteCasterEpisode(DeleteCasterEpisodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCasterEpisode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCasterEpisodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCasterEpisodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete an episode list in a production studio, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848071.html">AddCasterEpisodeGroup</a> operation to add the episode list in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCasterEpisodeGroup  DeleteCasterEpisodeGroupRequest
     * @return DeleteCasterEpisodeGroupResponse
     */
    @Override
    public CompletableFuture<DeleteCasterEpisodeGroupResponse> deleteCasterEpisodeGroup(DeleteCasterEpisodeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCasterEpisodeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCasterEpisodeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCasterEpisodeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create a production studio and then call this operation to delete a layout in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteCasterLayout  DeleteCasterLayoutRequest
     * @return DeleteCasterLayoutResponse
     */
    @Override
    public CompletableFuture<DeleteCasterLayoutResponse> deleteCasterLayout(DeleteCasterLayoutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCasterLayout").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCasterLayoutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCasterLayoutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to delete the episode list for carousel playback in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCasterProgram  DeleteCasterProgramRequest
     * @return DeleteCasterProgramResponse
     */
    @Override
    public CompletableFuture<DeleteCasterProgramResponse> deleteCasterProgram(DeleteCasterProgramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCasterProgram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCasterProgramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCasterProgramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete the settings of a scene, such as the component setting, layout setting, or both of them.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteCasterSceneConfig  DeleteCasterSceneConfigRequest
     * @return DeleteCasterSceneConfigResponse
     */
    @Override
    public CompletableFuture<DeleteCasterSceneConfigResponse> deleteCasterSceneConfig(DeleteCasterSceneConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCasterSceneConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCasterSceneConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCasterSceneConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to remove an input source from a production studio, make sure that you have called the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteCasterVideoResource  DeleteCasterVideoResourceRequest
     * @return DeleteCasterVideoResourceResponse
     */
    @Override
    public CompletableFuture<DeleteCasterVideoResourceResponse> deleteCasterVideoResource(DeleteCasterVideoResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCasterVideoResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCasterVideoResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCasterVideoResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteChannel  DeleteChannelRequest
     * @return DeleteChannelResponse
     */
    @Override
    public CompletableFuture<DeleteChannelResponse> deleteChannel(DeleteChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the name of the custom stream mixing template that you want to delete, and then call this operation to delete the template.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCustomTemplate  DeleteCustomTemplateRequest
     * @return DeleteCustomTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteCustomTemplateResponse> deleteCustomTemplate(DeleteCustomTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to delete an edge transcoding task.</p>
     * <ul>
     * <li>To call this operation, make sure that you have the permissions to access the edge transcoding feature.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteEdgeTranscodeJob  DeleteEdgeTranscodeJobRequest
     * @return DeleteEdgeTranscodeJobResponse
     */
    @Override
    public CompletableFuture<DeleteEdgeTranscodeJobResponse> deleteEdgeTranscodeJob(DeleteEdgeTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEdgeTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEdgeTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEdgeTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848209.html">CreateEventSubscribe</a> operation to create a callback that is used to subscribe to channel or user events.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteEventSub  DeleteEventSubRequest
     * @return DeleteEventSubResponse
     */
    @Override
    public CompletableFuture<DeleteEventSubResponse> deleteEventSub(DeleteEventSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEventSub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEventSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEventSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a specified subtitle rule.</p>
     * <blockquote>
     * <p> The live subtitles feature is in invitational preview. You can add up to 300 subtitle templates.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveAIProduceRules  DeleteLiveAIProduceRulesRequest
     * @return DeleteLiveAIProduceRulesResponse
     */
    @Override
    public CompletableFuture<DeleteLiveAIProduceRulesResponse> deleteLiveAIProduceRules(DeleteLiveAIProduceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveAIProduceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveAIProduceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveAIProduceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To delete a virtual studio template, you must first unbind the rules. Otherwise, an error occurs.</p>
     * <blockquote>
     * <p> The lightweight virtual studio feature is in invitational preview. You can add up to 300 virtual studio templates.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteLiveAIStudio  DeleteLiveAIStudioRequest
     * @return DeleteLiveAIStudioResponse
     */
    @Override
    public CompletableFuture<DeleteLiveAIStudioResponse> deleteLiveAIStudio(DeleteLiveAIStudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveAIStudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveAIStudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveAIStudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a specified subtitle template for live streaming.</p>
     * <blockquote>
     * <p> The live subtitles feature is in invitational preview. You can add up to 300 subtitle templates.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveAISubtitle  DeleteLiveAISubtitleRequest
     * @return DeleteLiveAISubtitleResponse
     */
    @Override
    public CompletableFuture<DeleteLiveAISubtitleResponse> deleteLiveAISubtitle(DeleteLiveAISubtitleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveAISubtitle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveAISubtitleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveAISubtitleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to delete a recording configuration at the application level.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveAppRecordConfig  DeleteLiveAppRecordConfigRequest
     * @return DeleteLiveAppRecordConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveAppRecordConfigResponse> deleteLiveAppRecordConfig(DeleteLiveAppRecordConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveAppRecordConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveAppRecordConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveAppRecordConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete the snapshot configuration for live streams in an application. The deletion takes effect after you restart stream ingest.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveAppSnapshotConfig  DeleteLiveAppSnapshotConfigRequest
     * @return DeleteLiveAppSnapshotConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveAppSnapshotConfigResponse> deleteLiveAppSnapshotConfig(DeleteLiveAppSnapshotConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveAppSnapshotConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveAppSnapshotConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveAppSnapshotConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to delete an audio moderation configuration.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveAudioAuditConfig  DeleteLiveAudioAuditConfigRequest
     * @return DeleteLiveAudioAuditConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveAudioAuditConfigResponse> deleteLiveAudioAuditConfig(DeleteLiveAudioAuditConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveAudioAuditConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveAudioAuditConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveAudioAuditConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to delete the configuration of callbacks for audio moderation results.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveAudioAuditNotifyConfig  DeleteLiveAudioAuditNotifyConfigRequest
     * @return DeleteLiveAudioAuditNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveAudioAuditNotifyConfigResponse> deleteLiveAudioAuditNotifyConfig(DeleteLiveAudioAuditNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveAudioAuditNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveAudioAuditNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveAudioAuditNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveCenterTransfer  DeleteLiveCenterTransferRequest
     * @return DeleteLiveCenterTransferResponse
     */
    @Override
    public CompletableFuture<DeleteLiveCenterTransferResponse> deleteLiveCenterTransfer(DeleteLiveCenterTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveCenterTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveCenterTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveCenterTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveDelayConfig  DeleteLiveDelayConfigRequest
     * @return DeleteLiveDelayConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveDelayConfigResponse> deleteLiveDelayConfig(DeleteLiveDelayConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveDelayConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveDelayConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveDelayConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>Obtain the main streaming domain, and then call this operation to delete the configuration of callbacks for video moderation results.</li>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveDetectNotifyConfig  DeleteLiveDetectNotifyConfigRequest
     * @return DeleteLiveDetectNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveDetectNotifyConfigResponse> deleteLiveDetectNotifyConfig(DeleteLiveDetectNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveDetectNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveDetectNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveDetectNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After you successfully call the DeleteLiveDomain operation, all records of the specified domain name are deleted. Exercise caution when you perform this operation.</p>
     * <ul>
     * <li>We recommend that you restore to an A record for the domain name at the DNS provider before you remove the domain name. Otherwise, the domain name may become inaccessible. If your domain name is registered with Alibaba Cloud, log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdns.console.aliyun.com%2F%3Fspm%3Da2c4g.11186623.0.0.3cda841fcvk7Qs%5C&lang=zh">Alibaba Cloud DNS console</a> and navigate to the <strong>Domain Name Resolution</strong> page. Find the domain name and then click <strong>DNS Settings</strong> in the Actions column. On the page that appears, change the CNAME record to an A record. If your domain name is registered with another DNS provider, configure similar settings on the platform of that DNS provider.</li>
     * <li>If you want to only suspend the use of the domain name, we recommend that you call the <a href="https://help.aliyun.com/document_detail/88329.html">StopLiveDomain</a> operation.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveDomain  DeleteLiveDomainRequest
     * @return DeleteLiveDomainResponse
     */
    @Override
    public CompletableFuture<DeleteLiveDomainResponse> deleteLiveDomain(DeleteLiveDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the streaming domain has been mapped to the ingest domain before you call this operation to delete the mapping. For more information about how to map a streaming domain to an ingest domain, see <a href="https://help.aliyun.com/document_detail/88782.html">AddLiveDomainMapping</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveDomainMapping  DeleteLiveDomainMappingRequest
     * @return DeleteLiveDomainMappingResponse
     */
    @Override
    public CompletableFuture<DeleteLiveDomainMappingResponse> deleteLiveDomainMapping(DeleteLiveDomainMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveDomainMapping").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveDomainMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveDomainMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the mapping between the main streaming domain and the sub-streaming domain is created. For more information about how to call an operation to create the mapping between a main streaming domain and a sub-streaming domain, see <a href="https://help.aliyun.com/document_detail/173091.html">AddLiveDomainPlayMapping</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveDomainPlayMapping  DeleteLiveDomainPlayMappingRequest
     * @return DeleteLiveDomainPlayMappingResponse
     */
    @Override
    public CompletableFuture<DeleteLiveDomainPlayMappingResponse> deleteLiveDomainPlayMapping(DeleteLiveDomainPlayMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveDomainPlayMapping").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveDomainPlayMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveDomainPlayMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteLiveEdgeTransfer operation to delete the configuration of edge stream relay for a specific domain name. Ingested streams that are already relayed based on the configuration are not affected. The following table describes the scenarios in which edge stream relay takes effect or not.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Scenario</th>
     * <th>Analysis</th>
     * <th>Result</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1\. You ingest a stream after you call the SetLiveEdgeTransfer operation to configure edge stream relay. Then, you call the DeleteLiveEdgeTransfer operation to delete the configuration.</td>
     * <td>The configuration of edge stream relay is available when you ingest the stream.</td>
     * <td>The ingested stream is not affected, and stream relay is not interrupted.</td>
     * </tr>
     * <tr>
     * <td>2\. You call the DeleteLiveEdgeTransfer operation to delete the configuration of edge stream relay after you ingest a stream. Then, you disconnect and resume the ingested stream.</td>
     * <td>The configuration of edge stream relay is not available after you resume the ingested stream.</td>
     * <td>Edge stream relay does not take effect.</td>
     * </tr>
     * <tr>
     * <td>3\. You call the DeleteLiveEdgeTransfer operation before you ingest a stream.</td>
     * <td>The configuration of edge stream relay is not available.</td>
     * <td>Edge stream relay does not take effect.</td>
     * </tr>
     * </tbody></table>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveEdgeTransfer  DeleteLiveEdgeTransferRequest
     * @return DeleteLiveEdgeTransferResponse
     */
    @Override
    public CompletableFuture<DeleteLiveEdgeTransferResponse> deleteLiveEdgeTransfer(DeleteLiveEdgeTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveEdgeTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveEdgeTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveEdgeTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is application to triggered stream pulling. You can call this operation to delete a configuration of triggered stream pulling. If you set the AppName parameter to ali_all_app, configurations of triggered stream pulling for all applications under the domain name are deleted.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveLazyPullStreamInfoConfig  DeleteLiveLazyPullStreamInfoConfigRequest
     * @return DeleteLiveLazyPullStreamInfoConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveLazyPullStreamInfoConfigResponse> deleteLiveLazyPullStreamInfoConfig(DeleteLiveLazyPullStreamInfoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveLazyPullStreamInfoConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveLazyPullStreamInfoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveLazyPullStreamInfoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <ul>
     * <li>After you delete an interactive messaging group, it is no longer available. Every user in the group is notified that the group is closed.</li>
     * <li>After you delete an interactive messaging group, messages in the group are retained for 30 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveMessageGroup  DeleteLiveMessageGroupRequest
     * @return DeleteLiveMessageGroupResponse
     */
    @Override
    public CompletableFuture<DeleteLiveMessageGroupResponse> deleteLiveMessageGroup(DeleteLiveMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveMessageGroupMessage  DeleteLiveMessageGroupMessageRequest
     * @return DeleteLiveMessageGroupMessageResponse
     */
    @Override
    public CompletableFuture<DeleteLiveMessageGroupMessageResponse> deleteLiveMessageGroupMessage(DeleteLiveMessageGroupMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveMessageGroupMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveMessageGroupMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveMessageGroupMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveMessageUserMessage  DeleteLiveMessageUserMessageRequest
     * @return DeleteLiveMessageUserMessageResponse
     */
    @Override
    public CompletableFuture<DeleteLiveMessageUserMessageResponse> deleteLiveMessageUserMessage(DeleteLiveMessageUserMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveMessageUserMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveMessageUserMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveMessageUserMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a live stream encapsulation configuration. The deletion takes effect after you re-ingest the stream.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 300 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLivePackageConfig  DeleteLivePackageConfigRequest
     * @return DeleteLivePackageConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLivePackageConfigResponse> deleteLivePackageConfig(DeleteLivePackageConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLivePackageConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLivePackageConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLivePackageConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you unbind a GA instance from an acceleration circuit, your stream ingest and streaming are no longer accelerated by the GA instance. The GA instance still exists. If you want to release the GA instance, delete it in the GA console.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLivePrivateLine  DeleteLivePrivateLineRequest
     * @return DeleteLivePrivateLineResponse
     */
    @Override
    public CompletableFuture<DeleteLivePrivateLineResponse> deleteLivePrivateLine(DeleteLivePrivateLineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLivePrivateLine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLivePrivateLineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLivePrivateLineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable to regular stream pulling. You can call this operation to delete a configuration of regular stream pulling.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLivePullStreamInfoConfig  DeleteLivePullStreamInfoConfigRequest
     * @return DeleteLivePullStreamInfoConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLivePullStreamInfoConfigResponse> deleteLivePullStreamInfoConfig(DeleteLivePullStreamInfoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLivePullStreamInfoConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLivePullStreamInfoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLivePullStreamInfoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to delete a pulled-stream relay task.</p>
     * <ul>
     * <li>If you delete a running task, the task is immediately stopped and cannot be restarted.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLivePullToPush  DeleteLivePullToPushRequest
     * @return DeleteLivePullToPushResponse
     */
    @Override
    public CompletableFuture<DeleteLivePullToPushResponse> deleteLivePullToPush(DeleteLivePullToPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLivePullToPush").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLivePullToPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLivePullToPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to delete the Logstore that is specified by a configuration of real-time log delivery. Make sure that all parameters meet the requirements when you call this operation.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2848121.html">DescribeLiveDomainRealtimeLogDelivery</a> operation to query the Project, Logstore, and Region parameters.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveRealTimeLogLogstore  DeleteLiveRealTimeLogLogstoreRequest
     * @return DeleteLiveRealTimeLogLogstoreResponse
     */
    @Override
    public CompletableFuture<DeleteLiveRealTimeLogLogstoreResponse> deleteLiveRealTimeLogLogstore(DeleteLiveRealTimeLogLogstoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveRealTimeLogLogstore").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveRealTimeLogLogstoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveRealTimeLogLogstoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><ul>
     * <li>This operation is applicable to only streaming domains. If you want to configure real-tome log delivery for an ingest domain, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12818093.nav-right.dticket.6cb216d07otFWR#/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * </li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2848121.html">DescribeLiveDomainRealtimeLogDelivery</a> to query the Project, Logstore, and Region parameters.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveRealtimeLogDelivery  DeleteLiveRealtimeLogDeliveryRequest
     * @return DeleteLiveRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<DeleteLiveRealtimeLogDeliveryResponse> deleteLiveRealtimeLogDelivery(DeleteLiveRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to delete the configuration of callbacks for live stream recording under the main streaming domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveRecordNotifyConfig  DeleteLiveRecordNotifyConfigRequest
     * @return DeleteLiveRecordNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveRecordNotifyConfigResponse> deleteLiveRecordNotifyConfig(DeleteLiveRecordNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveRecordNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveRecordNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveRecordNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to delete a Live-to-VOD configuration.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveRecordVodConfig  DeleteLiveRecordVodConfigRequest
     * @return DeleteLiveRecordVodConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveRecordVodConfigResponse> deleteLiveRecordVodConfig(DeleteLiveRecordVodConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveRecordVodConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveRecordVodConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveRecordVodConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to delete a video moderation configuration.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveSnapshotDetectPornConfig  DeleteLiveSnapshotDetectPornConfigRequest
     * @return DeleteLiveSnapshotDetectPornConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveSnapshotDetectPornConfigResponse> deleteLiveSnapshotDetectPornConfig(DeleteLiveSnapshotDetectPornConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveSnapshotDetectPornConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveSnapshotDetectPornConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveSnapshotDetectPornConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveSnapshotNotifyConfig  DeleteLiveSnapshotNotifyConfigRequest
     * @return DeleteLiveSnapshotNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveSnapshotNotifyConfigResponse> deleteLiveSnapshotNotifyConfig(DeleteLiveSnapshotNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveSnapshotNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveSnapshotNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveSnapshotNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you call this operation to delete a domain configuration in the canary release environment, you can call the <a href="https://help.aliyun.com/document_detail/297374.html">DescribeLiveDomainStagingConfig</a> operation to obtain the configuration ID.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveSpecificStagingConfig  DeleteLiveSpecificStagingConfigRequest
     * @return DeleteLiveSpecificStagingConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveSpecificStagingConfigResponse> deleteLiveSpecificStagingConfig(DeleteLiveSpecificStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveSpecificStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveSpecificStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveSpecificStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a configuration of stream-level region blocking.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamBlock  DeleteLiveStreamBlockRequest
     * @return DeleteLiveStreamBlockResponse
     */
    @Override
    public CompletableFuture<DeleteLiveStreamBlockResponse> deleteLiveStreamBlock(DeleteLiveStreamBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveStreamBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveStreamBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveStreamBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamMerge  DeleteLiveStreamMergeRequest
     * @return DeleteLiveStreamMergeResponse
     */
    @Override
    public CompletableFuture<DeleteLiveStreamMergeResponse> deleteLiveStreamMerge(DeleteLiveStreamMergeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveStreamMerge").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveStreamMergeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveStreamMergeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, obtain the monitoring session ID from the response parameter <strong>MonitorId</strong> of the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation.</p>
     * <blockquote>
     * <p> You cannot delete a monitoring session that is in the started state. If you try to delete it, a 400 error is reported.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamMonitor  DeleteLiveStreamMonitorRequest
     * @return DeleteLiveStreamMonitorResponse
     */
    @Override
    public CompletableFuture<DeleteLiveStreamMonitorResponse> deleteLiveStreamMonitor(DeleteLiveStreamMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveStreamMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveStreamMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveStreamMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamRecordIndexFiles  DeleteLiveStreamRecordIndexFilesRequest
     * @return DeleteLiveStreamRecordIndexFilesResponse
     */
    @Override
    public CompletableFuture<DeleteLiveStreamRecordIndexFilesResponse> deleteLiveStreamRecordIndexFiles(DeleteLiveStreamRecordIndexFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveStreamRecordIndexFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveStreamRecordIndexFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveStreamRecordIndexFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Standard transcoding templates, Narrowband HD™ transcoding templates, and custom transcoding templates are supported for this operation.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamTranscode  DeleteLiveStreamTranscodeRequest
     * @return DeleteLiveStreamTranscodeResponse
     */
    @Override
    public CompletableFuture<DeleteLiveStreamTranscodeResponse> deleteLiveStreamTranscode(DeleteLiveStreamTranscodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveStreamTranscode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveStreamTranscodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveStreamTranscodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This interface supports deleting the watermark template with the specified TemplateId for live streaming. </p>
     * <h2>QPS Limitation</h2>
     * <p> The per-user QPS limit for this interface is 60 times/second. Exceeding this limit will result in API throttling, which may impact your business operations. Please use it reasonably. For more information, please refer to <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitation</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamWatermark  DeleteLiveStreamWatermarkRequest
     * @return DeleteLiveStreamWatermarkResponse
     */
    @Override
    public CompletableFuture<DeleteLiveStreamWatermarkResponse> deleteLiveStreamWatermark(DeleteLiveStreamWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveStreamWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveStreamWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveStreamWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a watermark rule with a specified ID.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamWatermarkRule  DeleteLiveStreamWatermarkRuleRequest
     * @return DeleteLiveStreamWatermarkRuleResponse
     */
    @Override
    public CompletableFuture<DeleteLiveStreamWatermarkRuleResponse> deleteLiveStreamWatermarkRule(DeleteLiveStreamWatermarkRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveStreamWatermarkRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveStreamWatermarkRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveStreamWatermarkRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the ingest domain, and then call this operation to delete the callback configuration for stream ingest under the ingest domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamsNotifyUrlConfig  DeleteLiveStreamsNotifyUrlConfigRequest
     * @return DeleteLiveStreamsNotifyUrlConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLiveStreamsNotifyUrlConfigResponse> deleteLiveStreamsNotifyUrlConfig(DeleteLiveStreamsNotifyUrlConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLiveStreamsNotifyUrlConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLiveStreamsNotifyUrlConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLiveStreamsNotifyUrlConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DeleteMessageApp  DeleteMessageAppRequest
     * @return DeleteMessageAppResponse
     */
    @Override
    public CompletableFuture<DeleteMessageAppResponse> deleteMessageApp(DeleteMessageAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMessageApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMessageAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMessageAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation to create a stream mixing task and then call this operation to delete the stream mixing task. If you no longer need a mixed stream, be sure to delete it. Mixed streams that are not deleted are continuously ingested.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteMixStream  DeleteMixStreamRequest
     * @return DeleteMixStreamResponse
     */
    @Override
    public CompletableFuture<DeleteMixStreamResponse> deleteMixStream(DeleteMixStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMixStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMixStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMixStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete an episode list, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to create the episode list.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeletePlaylist  DeletePlaylistRequest
     * @return DeletePlaylistResponse
     */
    @Override
    public CompletableFuture<DeletePlaylistResponse> deletePlaylist(DeletePlaylistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePlaylist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePlaylistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePlaylistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to remove an episode, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add the episode.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeletePlaylistItems  DeletePlaylistItemsRequest
     * @return DeletePlaylistItemsResponse
     */
    @Override
    public CompletableFuture<DeletePlaylistItemsResponse> deletePlaylistItems(DeletePlaylistItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePlaylistItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePlaylistItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePlaylistItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteRtcAsrTask  DeleteRtcAsrTaskRequest
     * @return DeleteRtcAsrTaskResponse
     */
    @Override
    public CompletableFuture<DeleteRtcAsrTaskResponse> deleteRtcAsrTask(DeleteRtcAsrTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRtcAsrTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRtcAsrTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRtcAsrTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to delete a subscription to mixed-stream relay events.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the CreateRtcMPUEventSub operation to create the subscription.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteRtcMPUEventSub  DeleteRtcMPUEventSubRequest
     * @return DeleteRtcMPUEventSubResponse
     */
    @Override
    public CompletableFuture<DeleteRtcMPUEventSubResponse> deleteRtcMPUEventSub(DeleteRtcMPUEventSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRtcMPUEventSub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRtcMPUEventSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRtcMPUEventSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete the configuration of authentication for snapshot callbacks for a main streaming domain. For an ongoing live stream, the deletion takes effect after you re-ingest the stream. Snapshot callbacks for the stream are no longer authenticated.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteSnapshotCallbackAuth  DeleteSnapshotCallbackAuthRequest
     * @return DeleteSnapshotCallbackAuthResponse
     */
    @Override
    public CompletableFuture<DeleteSnapshotCallbackAuthResponse> deleteSnapshotCallbackAuth(DeleteSnapshotCallbackAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshotCallbackAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotCallbackAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotCallbackAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete only snapshots that were captured in the last year.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteSnapshotFiles  DeleteSnapshotFilesRequest
     * @return DeleteSnapshotFilesResponse
     */
    @Override
    public CompletableFuture<DeleteSnapshotFilesResponse> deleteSnapshotFiles(DeleteSnapshotFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshotFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a layout in a virtual studio. You can delete only one layout in a call.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteStudioLayout  DeleteStudioLayoutRequest
     * @return DeleteStudioLayoutResponse
     */
    @Override
    public CompletableFuture<DeleteStudioLayoutResponse> deleteStudioLayout(DeleteStudioLayoutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStudioLayout").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStudioLayoutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStudioLayoutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query scheduled tasks that are used to start and stop playing an episode list at specified points in time. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeAutoShowListTasks  DescribeAutoShowListTasksRequest
     * @return DescribeAutoShowListTasksResponse
     */
    @Override
    public CompletableFuture<DescribeAutoShowListTasksResponse> describeAutoShowListTasks(DescribeAutoShowListTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoShowListTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoShowListTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoShowListTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to query the channels of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterChannels  DescribeCasterChannelsRequest
     * @return DescribeCasterChannelsResponse
     */
    @Override
    public CompletableFuture<DescribeCasterChannelsResponse> describeCasterChannels(DescribeCasterChannelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterChannels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterChannelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterChannelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848030.html">AddCasterComponent</a> operation to add components to a production studio and then call this operation to query the components of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterComponents  DescribeCasterComponentsRequest
     * @return DescribeCasterComponentsResponse
     */
    @Override
    public CompletableFuture<DescribeCasterComponentsResponse> describeCasterComponents(DescribeCasterComponentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterComponents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterComponentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterComponentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to query the configurations of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterConfig  DescribeCasterConfigRequest
     * @return DescribeCasterConfigResponse
     */
    @Override
    public CompletableFuture<DescribeCasterConfigResponse> describeCasterConfig(DescribeCasterConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query layouts of a production studio. If no layout ID is specified, the operation returns all layouts of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterLayouts  DescribeCasterLayoutsRequest
     * @return DescribeCasterLayoutsResponse
     */
    @Override
    public CompletableFuture<DescribeCasterLayoutsResponse> describeCasterLayouts(DescribeCasterLayoutsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterLayouts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterLayoutsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterLayoutsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query episodes in the episode list for carousel playback. The supported types of episodes include video resource and component.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterProgram  DescribeCasterProgramRequest
     * @return DescribeCasterProgramResponse
     */
    @Override
    public CompletableFuture<DescribeCasterProgramResponse> describeCasterProgram(DescribeCasterProgramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterProgram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterProgramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterProgramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create a production studio and then call this operation to query the audio configurations of a scene in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeCasterSceneAudio  DescribeCasterSceneAudioRequest
     * @return DescribeCasterSceneAudioResponse
     */
    @Override
    public CompletableFuture<DescribeCasterSceneAudioResponse> describeCasterSceneAudio(DescribeCasterSceneAudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterSceneAudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterSceneAudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterSceneAudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create a production studio and then call this operation to query the scenes of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeCasterScenes  DescribeCasterScenesRequest
     * @return DescribeCasterScenesResponse
     */
    @Override
    public CompletableFuture<DescribeCasterScenesResponse> describeCasterScenes(DescribeCasterScenesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterScenes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterScenesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterScenesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must create a production studio before calling this operation to query the information.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 15 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeCasterStreamUrl  DescribeCasterStreamUrlRequest
     * @return DescribeCasterStreamUrlResponse
     */
    @Override
    public CompletableFuture<DescribeCasterStreamUrlResponse> describeCasterStreamUrl(DescribeCasterStreamUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterStreamUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterStreamUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterStreamUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to query the input sources of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterVideoResources  DescribeCasterVideoResourcesRequest
     * @return DescribeCasterVideoResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeCasterVideoResourcesResponse> describeCasterVideoResources(DescribeCasterVideoResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasterVideoResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCasterVideoResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCasterVideoResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848012.html">CreateCaster</a> operation to create a production studio and then call this operation to query the production studio list. The status of a production studio can be idle or streaming.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasters  DescribeCastersRequest
     * @return DescribeCastersResponse
     */
    @Override
    public CompletableFuture<DescribeCastersResponse> describeCasters(DescribeCastersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCasters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCastersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCastersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query online users in a channel. The returned result does not include details about the users.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeChannelParticipants  DescribeChannelParticipantsRequest
     * @return DescribeChannelParticipantsResponse
     */
    @Override
    public CompletableFuture<DescribeChannelParticipantsResponse> describeChannelParticipants(DescribeChannelParticipantsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeChannelParticipants").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeChannelParticipantsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeChannelParticipantsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about online users in a channel, such as the total number of users during live streaming.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeChannelUsers  DescribeChannelUsersRequest
     * @return DescribeChannelUsersResponse
     */
    @Override
    public CompletableFuture<DescribeChannelUsersResponse> describeChannelUsers(DescribeChannelUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeChannelUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeChannelUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeChannelUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the resource usage data of up to 100 domain names at a time. Separate multiple domain names with commas (,). If you do not specify the DomainName parameter, the resource usage data of all domain names within your Alibaba Cloud account is returned.</p>
     * <ul>
     * <li>The resource usage data includes network traffic that is measured in bytes, bandwidth that is measured in bit/s, and the number of requests.</li>
     * <li>If you do not specify the Interval parameter, you can query the resource usage data in the last 12 months that spans a period of up to 31 days per call. If you specify a time range of 1 to 3 days in a call, the time interval between the entries that are returned is 1 hour. If you specify a time range of more than 3 days in a call, the time interval between the entries that are returned is 1 day.</li>
     * <li>The following table describes the maximum time range per query, the time period within which historical data is available, and the data delay if you specify the Interval parameter.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>90 days</td>
     * <td>366 days</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDomainUsageData  DescribeDomainUsageDataRequest
     * @return DescribeDomainUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeDomainUsageDataResponse> describeDomainUsageData(DescribeDomainUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to obtain domain integrity.</p>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeDomainWithIntegrity  DescribeDomainWithIntegrityRequest
     * @return DescribeDomainWithIntegrityResponse
     */
    @Override
    public CompletableFuture<DescribeDomainWithIntegrityResponse> describeDomainWithIntegrity(DescribeDomainWithIntegrityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainWithIntegrity").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainWithIntegrityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainWithIntegrityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about HTTP Live Streaming (HLS) streams, such as the number of online users and bandwidth.</p>
     * <ul>
     * <li>The number of online users for an HLS stream is counted based on the universally unique identifiers (UUIDs) of users that are placed after the M3U8 URL.</li>
     * <li>You can query the data of up to 100 domain names in a single request. If the DomainName parameter is left empty, the data of all domain names under the account is queried.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeHlsLiveStreamRealTimeBpsData  DescribeHlsLiveStreamRealTimeBpsDataRequest
     * @return DescribeHlsLiveStreamRealTimeBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeHlsLiveStreamRealTimeBpsDataResponse> describeHlsLiveStreamRealTimeBpsData(DescribeHlsLiveStreamRealTimeBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHlsLiveStreamRealTimeBpsData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHlsLiveStreamRealTimeBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHlsLiveStreamRealTimeBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query subtitle rules. Make sure that the parameter settings meet the requirements.</p>
     * <blockquote>
     * <p> The live subtitles feature is in invitational preview. You can add up to 300 subtitle templates.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveAIProduceRules  DescribeLiveAIProduceRulesRequest
     * @return DescribeLiveAIProduceRulesResponse
     */
    @Override
    public CompletableFuture<DescribeLiveAIProduceRulesResponse> describeLiveAIProduceRules(DescribeLiveAIProduceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveAIProduceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveAIProduceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveAIProduceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveAIStudio  DescribeLiveAIStudioRequest
     * @return DescribeLiveAIStudioResponse
     */
    @Override
    public CompletableFuture<DescribeLiveAIStudioResponse> describeLiveAIStudio(DescribeLiveAIStudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveAIStudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveAIStudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveAIStudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This interface supports querying the list of subtitle template information with specified pagination parameters. Ensure that the parameter settings meet the requirements when calling.</p>
     * <blockquote>
     * <p>Notice: The real-time subtitle function is currently in the beta testing phase, and each user can add up to 300 subtitle templates. </p>
     * </blockquote>
     * <h2>QPS Limit</h2>
     * <p>The QPS limit for this interface per user is 60 times/second. Exceeding this limit will result in API calls being throttled, which may impact your business operations. Please use it reasonably. For more information, refer to <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitation</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveAISubtitle  DescribeLiveAISubtitleRequest
     * @return DescribeLiveAISubtitleResponse
     */
    @Override
    public CompletableFuture<DescribeLiveAISubtitleResponse> describeLiveAISubtitle(DescribeLiveAISubtitleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveAISubtitle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveAISubtitleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveAISubtitleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to query audio moderation configurations.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveAudioAuditConfig  DescribeLiveAudioAuditConfigRequest
     * @return DescribeLiveAudioAuditConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveAudioAuditConfigResponse> describeLiveAudioAuditConfig(DescribeLiveAudioAuditConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveAudioAuditConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveAudioAuditConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveAudioAuditConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to query the configuration of callbacks for audio moderation results.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveAudioAuditNotifyConfig  DescribeLiveAudioAuditNotifyConfigRequest
     * @return DescribeLiveAudioAuditNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveAudioAuditNotifyConfigResponse> describeLiveAudioAuditNotifyConfig(DescribeLiveAudioAuditNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveAudioAuditNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveAudioAuditNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveAudioAuditNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveCdnDiagnoseInfo  DescribeLiveCdnDiagnoseInfoRequest
     * @return DescribeLiveCdnDiagnoseInfoResponse
     */
    @Override
    public CompletableFuture<DescribeLiveCdnDiagnoseInfoResponse> describeLiveCdnDiagnoseInfo(DescribeLiveCdnDiagnoseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveCdnDiagnoseInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveCdnDiagnoseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveCdnDiagnoseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The time granularity for the returned data is 5 seconds. The maximum time range to query is 3 hours. You can query data in the last 30 days.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveCenterStreamRateData  DescribeLiveCenterStreamRateDataRequest
     * @return DescribeLiveCenterStreamRateDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveCenterStreamRateDataResponse> describeLiveCenterStreamRateData(DescribeLiveCenterStreamRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveCenterStreamRateData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveCenterStreamRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveCenterStreamRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveCenterTransfer  DescribeLiveCenterTransferRequest
     * @return DescribeLiveCenterTransferResponse
     */
    @Override
    public CompletableFuture<DescribeLiveCenterTransferResponse> describeLiveCenterTransfer(DescribeLiveCenterTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveCenterTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveCenterTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveCenterTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can obtain the certificate name on the <a href="https://help.aliyun.com/document_detail/2584962.html">Certificates</a> page of the ApsaraVideo Live console and then call this operation to query the certificate details.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveCertificateDetail  DescribeLiveCertificateDetailRequest
     * @return DescribeLiveCertificateDetailResponse
     */
    @Override
    public CompletableFuture<DescribeLiveCertificateDetailResponse> describeLiveCertificateDetail(DescribeLiveCertificateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveCertificateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveCertificateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveCertificateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you specify one or more domain names in the request, the certificates of the domain names are returned. If you do not specify a domain name in the request, all certificates within your Alibaba Cloud account are returned.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveCertificateList  DescribeLiveCertificateListRequest
     * @return DescribeLiveCertificateListResponse
     */
    @Override
    public CompletableFuture<DescribeLiveCertificateListResponse> describeLiveCertificateList(DescribeLiveCertificateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveCertificateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveCertificateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveCertificateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDelayConfig  DescribeLiveDelayConfigRequest
     * @return DescribeLiveDelayConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDelayConfigResponse> describeLiveDelayConfig(DescribeLiveDelayConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDelayConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDelayConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDelayConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query your stream delay usage data. The default time granularity is 1 hour.</p>
     * <ul>
     * <li>The maximum time range for a query is 31 days.</li>
     * <li>The minimum time granularity for a query is 1 hour.</li>
     * <li>You can query the data in the last 31 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDelayedStreamingUsage  DescribeLiveDelayedStreamingUsageRequest
     * @return DescribeLiveDelayedStreamingUsageResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDelayedStreamingUsageResponse> describeLiveDelayedStreamingUsage(DescribeLiveDelayedStreamingUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDelayedStreamingUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDelayedStreamingUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDelayedStreamingUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to query the configuration of callbacks for video moderation results.</p>
     * <ul>
     * <li>Only some live centers support the automated review feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDetectNotifyConfig  DescribeLiveDetectNotifyConfigRequest
     * @return DescribeLiveDetectNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDetectNotifyConfigResponse> describeLiveDetectNotifyConfig(DescribeLiveDetectNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDetectNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDetectNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDetectNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The minimum data granularity is 5 minutes. If you do not specify the <code>StartTime</code> parameter, data in the last 24 hours is queried.</p>
     * <ul>
     * <li>You can query data in the last 90 days.</li>
     * <li>You can call this operation to query the bandwidth at each interval.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDetectPornData  DescribeLiveDetectPornDataRequest
     * @return DescribeLiveDetectPornDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDetectPornDataResponse> describeLiveDetectPornData(DescribeLiveDetectPornDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDetectPornData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDetectPornDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDetectPornDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can specify both the StartTime and EndTime parameters to query the data in the specified period of time. If you do not specify the StartTime and EndTime parameters, the data of the last hour is queried by default.</p>
     * <ul>
     * <li>If you specify only the StartTime parameter but not the EndTime parameter, the data of the hour following the specified start time is queried.</li>
     * <li>If you specify only the EndTime parameter but not the StartTime parameter, the data of the hour preceding the specified end time is queried.</li>
     * <li>You can query the data in the last 90 days.</li>
     * <li>This operation is used to monitor data. The data returned by this operation cannot be used as a reference to calculate resource usage for billing.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainBpsData  DescribeLiveDomainBpsDataRequest
     * @return DescribeLiveDomainBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainBpsDataResponse> describeLiveDomainBpsData(DescribeLiveDomainBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query data in the last 90 days. You can specify up to 500 domain names. Separate multiple domain names with commas (,). The data of multiple domain names is aggregated and returned. The following section describes the time granularities of the data entries returned depending on the time range specified by the <strong>StartTime</strong> and <strong>EndTime</strong> parameters:</p>
     * <ul>
     * <li>If the time range is smaller than or equal to 3 days, the time granularity is 5 minutes.</li>
     * <li>If the time range is larger than 3 days but smaller than or equal to 31 days, the time granularity is 1 hour.</li>
     * <li>If the time range is larger than 31 days, the time granularity is 1 day.<blockquote>
     * <p> If neither the <strong>StartTime</strong> nor the <strong>EndTime</strong> parameter is specified, the data of the last 24 hours is returned.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainBpsDataByLayer  DescribeLiveDomainBpsDataByLayerRequest
     * @return DescribeLiveDomainBpsDataByLayerResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainBpsDataByLayerResponse> describeLiveDomainBpsDataByLayer(DescribeLiveDomainBpsDataByLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainBpsDataByLayer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainBpsDataByLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainBpsDataByLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the accelerated domain names that match a certificate.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainByCertificate  DescribeLiveDomainByCertificateRequest
     * @return DescribeLiveDomainByCertificateResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainByCertificateResponse> describeLiveDomainByCertificate(DescribeLiveDomainByCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainByCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainByCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainByCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain a domain name, and then call this operation to query certificate information about the domain name.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainCertificateInfo  DescribeLiveDomainCertificateInfoRequest
     * @return DescribeLiveDomainCertificateInfoResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainCertificateInfoResponse> describeLiveDomainCertificateInfo(DescribeLiveDomainCertificateInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainCertificateInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainCertificateInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainCertificateInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query multiple configurations at a time.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainConfigs  DescribeLiveDomainConfigsRequest
     * @return DescribeLiveDomainConfigsResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainConfigsResponse> describeLiveDomainConfigs(DescribeLiveDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can call this operation to query the basic information about an ingest domain or a streaming domain. If you want to query a newly added domain name, wait a few minutes until the configuration of the domain name is completed in ApsaraVideo Live.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainDetail  DescribeLiveDomainDetailRequest
     * @return DescribeLiveDomainDetailResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainDetailResponse> describeLiveDomainDetail(DescribeLiveDomainDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveDomainEdgeLog  DescribeLiveDomainEdgeLogRequest
     * @return DescribeLiveDomainEdgeLogResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainEdgeLogResponse> describeLiveDomainEdgeLog(DescribeLiveDomainEdgeLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainEdgeLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainEdgeLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainEdgeLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the real-time bitrates and frame rates of live streams, which helps you evaluate the stream ingest quality. A delay exists in data collection and statistics. We recommend that you query the data of more than 5 minutes ago.</p>
     * <blockquote>
     * <p> Use this operation to replace the deprecated DescribeLiveStreamsFrameRateAndBitRateData operation.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainFrameRateAndBitRateData  DescribeLiveDomainFrameRateAndBitRateDataRequest
     * @return DescribeLiveDomainFrameRateAndBitRateDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainFrameRateAndBitRateDataResponse> describeLiveDomainFrameRateAndBitRateData(DescribeLiveDomainFrameRateAndBitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainFrameRateAndBitRateData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainFrameRateAndBitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainFrameRateAndBitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to main streaming domains.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainLimit  DescribeLiveDomainLimitRequest
     * @return DescribeLiveDomainLimitResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainLimitResponse> describeLiveDomainLimit(DescribeLiveDomainLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the offline logs of a single domain name.</p>
     * <ul>
     * <li>The StartTime and EndTime parameters are optional. You can specify both the parameters to query logs that are generated within the specified time period.</li>
     * <li>If you do not specify the StartTime and EndTime parameters, logs that are generated in the last 24 hours are queried by default.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainLog  DescribeLiveDomainLogRequest
     * @return DescribeLiveDomainLogResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainLogResponse> describeLiveDomainLog(DescribeLiveDomainLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveDomainLogExTtl  DescribeLiveDomainLogExTtlRequest
     * @return DescribeLiveDomainLogExTtlResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainLogExTtlResponse> describeLiveDomainLogExTtl(DescribeLiveDomainLogExTtlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainLogExTtl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainLogExTtlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainLogExTtlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the ingest domain, main streaming domain, or sub-streaming domain, and then call this operation to query the mappings of the domain name.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 500 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainMapping  DescribeLiveDomainMappingRequest
     * @return DescribeLiveDomainMappingResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainMappingResponse> describeLiveDomainMapping(DescribeLiveDomainMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainMapping").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
     * <ul>
     * <li>You can query data in the last 90 days.</li>
     * <li>The data is queried by hour or day.</li>
     * <li>The maximum time range for a query is 31 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainMonitoringUsageData  DescribeLiveDomainMonitoringUsageDataRequest
     * @return DescribeLiveDomainMonitoringUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainMonitoringUsageDataResponse> describeLiveDomainMonitoringUsageData(DescribeLiveDomainMonitoringUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainMonitoringUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainMonitoringUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainMonitoringUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveDomainMultiStreamConfig  DescribeLiveDomainMultiStreamConfigRequest
     * @return DescribeLiveDomainMultiStreamConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainMultiStreamConfigResponse> describeLiveDomainMultiStreamConfig(DescribeLiveDomainMultiStreamConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainMultiStreamConfig").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainMultiStreamConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainMultiStreamConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to collect statistics on the number of online users for only Flash Video (FLV), Real-Time Streaming (RTS), and Real-Time Messaging Protocol (RTMP) streams, but not HTTP Live Streaming (HLS) streams. A delay exists in data collection and statistics. We recommend that you query the data of more than 5 minutes ago.</p>
     * <blockquote>
     * <p> Use this operation to replace the deprecated DescribeLiveStreamOnlineUserNum operation.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 200 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainOnlineUserNum  DescribeLiveDomainOnlineUserNumRequest
     * @return DescribeLiveDomainOnlineUserNumResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainOnlineUserNumResponse> describeLiveDomainOnlineUserNum(DescribeLiveDomainOnlineUserNumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainOnlineUserNum").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainOnlineUserNumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainOnlineUserNumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is used to monitor data. The returned data cannot be used as a reference to calculate resource usage for billing.</p>
     * <ul>
     * <li>You can query data within the previous 90 days.</li>
     * <li>The data is delayed for 3 to 5 minutes.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainPublishErrorCode  DescribeLiveDomainPublishErrorCodeRequest
     * @return DescribeLiveDomainPublishErrorCodeResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainPublishErrorCodeResponse> describeLiveDomainPublishErrorCode(DescribeLiveDomainPublishErrorCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainPublishErrorCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainPublishErrorCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainPublishErrorCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The bandwidth unit is bit/s.</p>
     * <ul>
     * <li>You can specify multiple domain names by separating them with commas (,).</li>
     * <li>If you do not specify the StartTime or EndTime parameter, the data of the last 24 hours is queried. You can specify both the StartTime and EndTime parameters to query the data of a specific time range.</li>
     * <li>You can query the data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainPushBpsData  DescribeLiveDomainPushBpsDataRequest
     * @return DescribeLiveDomainPushBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainPushBpsDataResponse> describeLiveDomainPushBpsData(DescribeLiveDomainPushBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainPushBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainPushBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainPushBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The traffic unit is bytes.</p>
     * <ul>
     * <li>You can specify multiple domain names by separating them with commas (,).</li>
     * <li>If you do not specify the StartTime or EndTime parameter, the data of the last 24 hours is queried. You can specify both the StartTime and EndTime parameters to query the data of a specific time range.</li>
     * <li>You can query the data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainPushTrafficData  DescribeLiveDomainPushTrafficDataRequest
     * @return DescribeLiveDomainPushTrafficDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainPushTrafficDataResponse> describeLiveDomainPushTrafficData(DescribeLiveDomainPushTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainPushTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainPushTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainPushTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the geographical distribution of viewers, the visitor ranking of a streaming domain, and the number of independent requests from IP addresses under a streaming domain within a specified time period.</p>
     * <ul>
     * <li>If you do not specify the StartTime or EndTime parameter, the data of the last 24 hours is queried. You can specify both the StartTime and EndTime parameters to query the data of a specific time range.</li>
     * <li>You can specify only one streaming domain in each request.</li>
     * <li>You can query the data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainPvUvData  DescribeLiveDomainPvUvDataRequest
     * @return DescribeLiveDomainPvUvDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainPvUvDataResponse> describeLiveDomainPvUvData(DescribeLiveDomainPvUvDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainPvUvData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainPvUvDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainPvUvDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the bandwidth usage of one or more specified domain names.</p>
     * <ul>
     * <li>You can query data in the last seven days. The time range that is specified by the StartTime and EndTime parameters cannot exceed 24 hours for a query.</li>
     * <li>If you specify neither the StartTime parameter nor the EndTime parameter, the data of the last hour is returned.</li>
     * <li>This operation is used to monitor data. The data returned by this operation cannot be used as a reference to calculate resource usage for billing.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainRealTimeBpsData  DescribeLiveDomainRealTimeBpsDataRequest
     * @return DescribeLiveDomainRealTimeBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainRealTimeBpsDataResponse> describeLiveDomainRealTimeBpsData(DescribeLiveDomainRealTimeBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainRealTimeBpsData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainRealTimeBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainRealTimeBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The following table describes the time granularities supported by this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>Usually 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>Unlimited</td>
     * <td>366 days</td>
     * <td>After 04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainRealTimeHttpCodeData  DescribeLiveDomainRealTimeHttpCodeDataRequest
     * @return DescribeLiveDomainRealTimeHttpCodeDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainRealTimeHttpCodeDataResponse> describeLiveDomainRealTimeHttpCodeData(DescribeLiveDomainRealTimeHttpCodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainRealTimeHttpCodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainRealTimeHttpCodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainRealTimeHttpCodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the real-time traffic in a region for an Internet service provider (ISP) within a specified period of time under one or more streaming domains.</p>
     * <ul>
     * <li>If you do not specify the StartTime parameter or the EndTime parameter, the data of the last hour is returned. You can specify both the StartTime and EndTime parameters to query the data of a specific time range.</li>
     * <li>This operation is used to monitor data. The data returned by this operation cannot be used as a reference to calculate resource usage for billing.</li>
     * <li>You can query the data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>This operation does not have a queries per second (QPS) limit on a single user. You can call this operation based on your business requirements.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainRealTimeTrafficData  DescribeLiveDomainRealTimeTrafficDataRequest
     * @return DescribeLiveDomainRealTimeTrafficDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainRealTimeTrafficDataResponse> describeLiveDomainRealTimeTrafficData(DescribeLiveDomainRealTimeTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainRealTimeTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainRealTimeTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainRealTimeTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the status of real-time log delivery for a domain name. Make sure that the parameter settings meet the requirements.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainRealtimeLogDelivery  DescribeLiveDomainRealtimeLogDeliveryRequest
     * @return DescribeLiveDomainRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainRealtimeLogDeliveryResponse> describeLiveDomainRealtimeLogDelivery(DescribeLiveDomainRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the number of concurrent recording channels on each day and event tracking data at different time intervals. This way, you can measure the peak number of concurrent recording channels on each day or month.</p>
     * <ul>
     * <li>The number of time shifting channels is not included in the number of recording channels.</li>
     * <li>You can query data by domain name or query data for multiple domain names at a time. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>If you set the data granularity to 1 minute, the maximum time range to query is 24 hours. You can query data in the last 60 days.</li>
     * <li>If you set the data granularity to 1 hour, the maximum time range to query is 31 days. You can query data in the last 180 days.</li>
     * <li>If you set the data granularity to 1 day, the maximum time range to query is 90 days. You can query data in the last 366 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainRecordUsageData  DescribeLiveDomainRecordUsageDataRequest
     * @return DescribeLiveDomainRecordUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainRecordUsageDataResponse> describeLiveDomainRecordUsageData(DescribeLiveDomainRecordUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainRecordUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainRecordUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainRecordUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to collect statistics on the total number of snapshots on a day.</p>
     * <ul>
     * <li>You can query data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>This operation does not have a queries per second (QPS) limit on a single user. You can call this operation based on your business requirements.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainSnapshotData  DescribeLiveDomainSnapshotDataRequest
     * @return DescribeLiveDomainSnapshotDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainSnapshotDataResponse> describeLiveDomainSnapshotData(DescribeLiveDomainSnapshotDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainSnapshotData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainSnapshotDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainSnapshotDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can call this operation to query the feature configurations of an accelerated domain name in the canary release environment.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainStagingConfig  DescribeLiveDomainStagingConfigRequest
     * @return DescribeLiveDomainStagingConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainStagingConfigResponse> describeLiveDomainStagingConfig(DescribeLiveDomainStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to collect the transcoding usage data at each time interval.</p>
     * <ul>
     * <li>You can specify multiple domain names by separating them with commas (,).</li>
     * <li>You can query data in the last 90 days.</li>
     * <li>The time granularity of data is 1 hour or 1 day.</li>
     * <li>For information about the billing of different transcoding types and transcoding resolutions, see the description about billing of different transcoding specifications in transcoding bills in the <a href="https://help.aliyun.com/document_detail/90424.html">Billing of live stream transcoding</a> section of the ApsaraVideo Live pricing page.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainStreamTranscodeData  DescribeLiveDomainStreamTranscodeDataRequest
     * @return DescribeLiveDomainStreamTranscodeDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainStreamTranscodeDataResponse> describeLiveDomainStreamTranscodeData(DescribeLiveDomainStreamTranscodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainStreamTranscodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainStreamTranscodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainStreamTranscodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the time shifting usage data at each time interval.</p>
     * <ul>
     * <li>You can query data in the last 90 days.</li>
     * <li>The time interval is 1 hour.</li>
     * <li>The maximum time range for a query is 31 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainTimeShiftData  DescribeLiveDomainTimeShiftDataRequest
     * @return DescribeLiveDomainTimeShiftDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainTimeShiftDataResponse> describeLiveDomainTimeShiftData(DescribeLiveDomainTimeShiftDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainTimeShiftData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainTimeShiftDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainTimeShiftDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you do not specify the StartTime or EndTime parameter, the data of the last 24 hours is returned.</p>
     * <ul>
     * <li>This operation is used to monitor data. The data returned by this operation cannot be used as a reference to calculate resource usage for billing.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainTrafficData  DescribeLiveDomainTrafficDataRequest
     * @return DescribeLiveDomainTrafficDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainTrafficDataResponse> describeLiveDomainTrafficData(DescribeLiveDomainTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveDomainTranscodeParams  DescribeLiveDomainTranscodeParamsRequest
     * @return DescribeLiveDomainTranscodeParamsResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDomainTranscodeParamsResponse> describeLiveDomainTranscodeParams(DescribeLiveDomainTranscodeParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDomainTranscodeParams").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDomainTranscodeParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDomainTranscodeParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You can query data in the previous 90 days.</li>
     * <li>The maximum time range to query is 31 days.</li>
     * </ul>
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDrmUsageData  DescribeLiveDrmUsageDataRequest
     * @return DescribeLiveDrmUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveDrmUsageDataResponse> describeLiveDrmUsageData(DescribeLiveDrmUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveDrmUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveDrmUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveDrmUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the ingest domain, and then call this operation to query the configuration of edge stream relay.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveEdgeTransfer  DescribeLiveEdgeTransferRequest
     * @return DescribeLiveEdgeTransferResponse
     */
    @Override
    public CompletableFuture<DescribeLiveEdgeTransferResponse> describeLiveEdgeTransfer(DescribeLiveEdgeTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveEdgeTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveEdgeTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveEdgeTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The maximum time range for a query is 31 days.</p>
     * <ul>
     * <li>The minimum time granularity for a query is 5 minutes.</li>
     * <li>You can query the data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveGrtnDuration  DescribeLiveGrtnDurationRequest
     * @return DescribeLiveGrtnDurationResponse
     */
    @Override
    public CompletableFuture<DescribeLiveGrtnDurationResponse> describeLiveGrtnDuration(DescribeLiveGrtnDurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveGrtnDuration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveGrtnDurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveGrtnDurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about all certificates that you have configured.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveHttpsDomainList  DescribeLiveHttpsDomainListRequest
     * @return DescribeLiveHttpsDomainListResponse
     */
    @Override
    public CompletableFuture<DescribeLiveHttpsDomainListResponse> describeLiveHttpsDomainList(DescribeLiveHttpsDomainListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveHttpsDomainList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveHttpsDomainListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveHttpsDomainListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can query data in the last 30 days. The time range for a query cannot exceed 24 hours.</p>
     * <ul>
     * <li>The time granularity for a query is 5 minutes.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveInteractionMetricData  DescribeLiveInteractionMetricDataRequest
     * @return DescribeLiveInteractionMetricDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveInteractionMetricDataResponse> describeLiveInteractionMetricData(DescribeLiveInteractionMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveInteractionMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveInteractionMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveInteractionMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveIpInfo  DescribeLiveIpInfoRequest
     * @return DescribeLiveIpInfoResponse
     */
    @Override
    public CompletableFuture<DescribeLiveIpInfoResponse> describeLiveIpInfo(DescribeLiveIpInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveIpInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveIpInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveIpInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>This operation is applicable to regular stream pulling. You can call this operation to query the configurations of regular stream pulling for a domain name.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveLazyPullStreamConfig  DescribeLiveLazyPullStreamConfigRequest
     * @return DescribeLiveLazyPullStreamConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveLazyPullStreamConfigResponse> describeLiveLazyPullStreamConfig(DescribeLiveLazyPullStreamConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveLazyPullStreamConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveLazyPullStreamConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveLazyPullStreamConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveMessageApp  DescribeLiveMessageAppRequest
     * @return DescribeLiveMessageAppResponse
     */
    @Override
    public CompletableFuture<DescribeLiveMessageAppResponse> describeLiveMessageApp(DescribeLiveMessageAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveMessageApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveMessageAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveMessageAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveMessageGroup  DescribeLiveMessageGroupRequest
     * @return DescribeLiveMessageGroupResponse
     */
    @Override
    public CompletableFuture<DescribeLiveMessageGroupResponse> describeLiveMessageGroup(DescribeLiveMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveMessageGroupBand  DescribeLiveMessageGroupBandRequest
     * @return DescribeLiveMessageGroupBandResponse
     */
    @Override
    public CompletableFuture<DescribeLiveMessageGroupBandResponse> describeLiveMessageGroupBand(DescribeLiveMessageGroupBandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveMessageGroupBand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveMessageGroupBandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveMessageGroupBandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query live stream encapsulation configurations.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 300 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePackageConfig  DescribeLivePackageConfigRequest
     * @return DescribeLivePackageConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLivePackageConfigResponse> describeLivePackageConfig(DescribeLivePackageConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLivePackageConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLivePackageConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLivePackageConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call the CreateLivePrivateLine operation, you can call this operation to query available acceleration regions, which are access points where acceleration circuits start.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePrivateLineAreas  DescribeLivePrivateLineAreasRequest
     * @return DescribeLivePrivateLineAreasResponse
     */
    @Override
    public CompletableFuture<DescribeLivePrivateLineAreasResponse> describeLivePrivateLineAreas(DescribeLivePrivateLineAreasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLivePrivateLineAreas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLivePrivateLineAreasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLivePrivateLineAreasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you set the IsGaInstance parameter to yes, the status of GA instances is queried. If you set the IsGaInstance parameter to no, the binding information between GA instances and acceleration circuits is queried.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePrivateLineAvailGA  DescribeLivePrivateLineAvailGARequest
     * @return DescribeLivePrivateLineAvailGAResponse
     */
    @Override
    public CompletableFuture<DescribeLivePrivateLineAvailGAResponse> describeLivePrivateLineAvailGA(DescribeLivePrivateLineAvailGARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLivePrivateLineAvailGA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLivePrivateLineAvailGAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLivePrivateLineAvailGAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The minimum time granularity for a query is 1 hour. The maximum time range for a query is 31 days. You can query the production studio usage data in the last 90 days.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveProducerUsageData  DescribeLiveProducerUsageDataRequest
     * @return DescribeLiveProducerUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveProducerUsageDataResponse> describeLiveProducerUsageData(DescribeLiveProducerUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveProducerUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveProducerUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveProducerUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>This operation is applicable to regular stream pulling. You can call this operation to query the regular stream pulling configurations for a domain name.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLivePullStreamConfig  DescribeLivePullStreamConfigRequest
     * @return DescribeLivePullStreamConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLivePullStreamConfigResponse> describeLivePullStreamConfig(DescribeLivePullStreamConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLivePullStreamConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLivePullStreamConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLivePullStreamConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the information about a pulled-stream relay task.</p>
     * <ul>
     * <li>This operation allows you to query the configurations and status of a task with a specified ID.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePullToPush  DescribeLivePullToPushRequest
     * @return DescribeLivePullToPushResponse
     */
    @Override
    public CompletableFuture<DescribeLivePullToPushResponse> describeLivePullToPush(DescribeLivePullToPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLivePullToPush").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLivePullToPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLivePullToPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query pulled-stream relay tasks.</p>
     * <ul>
     * <li>You can query tasks by page. Fuzzy search is supported based on task IDs, task names, and destination URLs.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePullToPushList  DescribeLivePullToPushListRequest
     * @return DescribeLivePullToPushListResponse
     */
    @Override
    public CompletableFuture<DescribeLivePullToPushListResponse> describeLivePullToPushList(DescribeLivePullToPushListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLivePullToPushList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLivePullToPushListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLivePullToPushListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The time granularity of the data is 1 hour.</p>
     * <ul>
     * <li>You can query data in the last 31 days.</li>
     * <li>If you do not specify the StartTime or EndTime parameter, the data of the last 24 hours is queried. You can specify both the StartTime and EndTime parameters to query the data of a specific time range.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePushProxyLog  DescribeLivePushProxyLogRequest
     * @return DescribeLivePushProxyLogResponse
     */
    @Override
    public CompletableFuture<DescribeLivePushProxyLogResponse> describeLivePushProxyLog(DescribeLivePushProxyLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLivePushProxyLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLivePushProxyLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLivePushProxyLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the usage data of live center stream relay.</p>
     * <ul>
     * <li>The maximum time range for a query is 31 days.</li>
     * <li>The minimum time granularity for a query is 1 day.</li>
     * <li>You can query the data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePushProxyUsageData  DescribeLivePushProxyUsageDataRequest
     * @return DescribeLivePushProxyUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeLivePushProxyUsageDataResponse> describeLivePushProxyUsageData(DescribeLivePushProxyUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLivePushProxyUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLivePushProxyUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLivePushProxyUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can collect statistics on the number of real-time log deliveries. The number of failed real-time log deliveries and the number of successful real-time log deliveries are counted.</p>
     * <ul>
     * <li>You can query the data by UID.</li>
     * <li>You are charged for both successful and failed real-time log deliveries.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveRealtimeDeliveryAcc  DescribeLiveRealtimeDeliveryAccRequest
     * @return DescribeLiveRealtimeDeliveryAccResponse
     */
    @Override
    public CompletableFuture<DescribeLiveRealtimeDeliveryAccResponse> describeLiveRealtimeDeliveryAcc(DescribeLiveRealtimeDeliveryAccRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveRealtimeDeliveryAcc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveRealtimeDeliveryAccResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveRealtimeDeliveryAccResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the status of authorization for real-time log delivery.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveRealtimeLogAuthorized  DescribeLiveRealtimeLogAuthorizedRequest
     * @return DescribeLiveRealtimeLogAuthorizedResponse
     */
    @Override
    public CompletableFuture<DescribeLiveRealtimeLogAuthorizedResponse> describeLiveRealtimeLogAuthorized(DescribeLiveRealtimeLogAuthorizedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveRealtimeLogAuthorized").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveRealtimeLogAuthorizedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveRealtimeLogAuthorizedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the recording configurations of all applications under the main streaming domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveRecordConfig  DescribeLiveRecordConfigRequest
     * @return DescribeLiveRecordConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveRecordConfigResponse> describeLiveRecordConfig(DescribeLiveRecordConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveRecordConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveRecordConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveRecordConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the configuration of callbacks for live stream recording under the domain name.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveRecordNotifyConfig  DescribeLiveRecordNotifyConfigRequest
     * @return DescribeLiveRecordNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveRecordNotifyConfigResponse> describeLiveRecordNotifyConfig(DescribeLiveRecordNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveRecordNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveRecordNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveRecordNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveRecordNotifyRecords  DescribeLiveRecordNotifyRecordsRequest
     * @return DescribeLiveRecordNotifyRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeLiveRecordNotifyRecordsResponse> describeLiveRecordNotifyRecords(DescribeLiveRecordNotifyRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveRecordNotifyRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveRecordNotifyRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveRecordNotifyRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Obtain the streaming domain, and then call this operation to query the Live-to-VOD configurations.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveRecordVodConfigs  DescribeLiveRecordVodConfigsRequest
     * @return DescribeLiveRecordVodConfigsResponse
     */
    @Override
    public CompletableFuture<DescribeLiveRecordVodConfigsResponse> describeLiveRecordVodConfigs(DescribeLiveRecordVodConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveRecordVodConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveRecordVodConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveRecordVodConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable to the streaming domains.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 10 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveShiftConfigs  DescribeLiveShiftConfigsRequest
     * @return DescribeLiveShiftConfigsResponse
     */
    @Override
    public CompletableFuture<DescribeLiveShiftConfigsResponse> describeLiveShiftConfigs(DescribeLiveShiftConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveShiftConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveShiftConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveShiftConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the snapshot configurations.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveSnapshotConfig  DescribeLiveSnapshotConfigRequest
     * @return DescribeLiveSnapshotConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveSnapshotConfigResponse> describeLiveSnapshotConfig(DescribeLiveSnapshotConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveSnapshotConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveSnapshotConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveSnapshotConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to query video moderation configurations. The configurations can be sorted in ascending or descending order.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveSnapshotDetectPornConfig  DescribeLiveSnapshotDetectPornConfigRequest
     * @return DescribeLiveSnapshotDetectPornConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveSnapshotDetectPornConfigResponse> describeLiveSnapshotDetectPornConfig(DescribeLiveSnapshotDetectPornConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveSnapshotDetectPornConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveSnapshotDetectPornConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveSnapshotDetectPornConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveSnapshotNotifyConfig  DescribeLiveSnapshotNotifyConfigRequest
     * @return DescribeLiveSnapshotNotifyConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveSnapshotNotifyConfigResponse> describeLiveSnapshotNotifyConfig(DescribeLiveSnapshotNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveSnapshotNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveSnapshotNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveSnapshotNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamAuthChecking  DescribeLiveStreamAuthCheckingRequest
     * @return DescribeLiveStreamAuthCheckingResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamAuthCheckingResponse> describeLiveStreamAuthChecking(DescribeLiveStreamAuthCheckingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamAuthChecking").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamAuthCheckingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamAuthCheckingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the frame rates and bitrates of an RTMP stream within a specified time period. You can call this operation to query historical data.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamBitRateData  DescribeLiveStreamBitRateDataRequest
     * @return DescribeLiveStreamBitRateDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamBitRateDataResponse> describeLiveStreamBitRateData(DescribeLiveStreamBitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamBitRateData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamBitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamBitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the numbers of online source streams and transcoded streams. The streams that are returned by calling this operation are encoded in H.264 or H.265.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation once per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamCount  DescribeLiveStreamCountRequest
     * @return DescribeLiveStreamCountResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamCountResponse> describeLiveStreamCount(DescribeLiveStreamCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamCount").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the streaming domain, and then call this operation to query the live streaming latency.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamDelayConfig  DescribeLiveStreamDelayConfigRequest
     * @return DescribeLiveStreamDelayConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamDelayConfigResponse> describeLiveStreamDelayConfig(DescribeLiveStreamDelayConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamDelayConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamDelayConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamDelayConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query a set of audio and video frame rates and bitrates of an RTMP stream within a specified time range.</p>
     * <ul>
     * <li>This operation is used to monitor data. The data returned by this operation cannot be used as a reference to calculate resource usage for billing.</li>
     * <li>You can query data in the last 90 days.</li>
     * <li>The data is delayed for 3 to 5 minutes.</li>
     * <li>The maximum time range that you can specify is 1 hour.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLiveStreamDetailFrameRateAndBitRateData  DescribeLiveStreamDetailFrameRateAndBitRateDataRequest
     * @return DescribeLiveStreamDetailFrameRateAndBitRateDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamDetailFrameRateAndBitRateDataResponse> describeLiveStreamDetailFrameRateAndBitRateData(DescribeLiveStreamDetailFrameRateAndBitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamDetailFrameRateAndBitRateData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamDetailFrameRateAndBitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamDetailFrameRateAndBitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The data returned by this operation is delayed for an average of 2 to 5 minutes.</p>
     * <ul>
     * <li>This operation queries the number of historical online users for only Flash Video (FLV) and Real-Time Messaging Protocol (RTMP) streams.</li>
     * <li>This operation does not query the number of viewers that are watching transcoded streams.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamHistoryUserNum  DescribeLiveStreamHistoryUserNumRequest
     * @return DescribeLiveStreamHistoryUserNumResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamHistoryUserNumResponse> describeLiveStreamHistoryUserNum(DescribeLiveStreamHistoryUserNumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamHistoryUserNum").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamHistoryUserNumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamHistoryUserNumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamMerge  DescribeLiveStreamMergeRequest
     * @return DescribeLiveStreamMergeResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamMergeResponse> describeLiveStreamMerge(DescribeLiveStreamMergeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamMerge").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamMergeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamMergeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to query the monitoring data of streams under a domain name for the first time, you must <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12818093.nav-right.dticket.6cb216d07otFWR#/ticket/createIndex">submit a ticket</a> for backend configuration. Provide the following information in the ticket:</p>
     * <ul>
     * <li>The domain name that you want to query</li>
     * <li>The maximum number of concurrent streams under the domain name</li>
     * <li>The maximum number of concurrent online users in each stream</li>
     * <li>The protocols used for the client requests<blockquote>
     * <p> The review is expected to be completed within one business day after you submit the ticket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2><a href="#"></a>Usage limits</h2>
     * <ul>
     * <li>By default, statistics on the number of viewers who watch streams over the HTTP Live Streaming (HLS) protocol cannot be collected.</li>
     * <li>You can specify only one domain name in each call.</li>
     * <li>The maximum time range to query is 24 hours.</li>
     * <li>The minimum data granularity to query is 1 minute.</li>
     * <li>You can query data in the last 31 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamMetricDetailData  DescribeLiveStreamMetricDetailDataRequest
     * @return DescribeLiveStreamMetricDetailDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamMetricDetailDataResponse> describeLiveStreamMetricDetailData(DescribeLiveStreamMetricDetailDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamMetricDetailData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamMetricDetailDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamMetricDetailDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><a href="https://help.aliyun.com/document_detail/2848129.html">Create monitoring sessions</a> before you call this operation to query the monitoring session list. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamMonitorList  DescribeLiveStreamMonitorListRequest
     * @return DescribeLiveStreamMonitorListResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamMonitorListResponse> describeLiveStreamMonitorList(DescribeLiveStreamMonitorListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamMonitorList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamMonitorListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamMonitorListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query prefetch tasks in the last three days.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamPreloadTasks  DescribeLiveStreamPreloadTasksRequest
     * @return DescribeLiveStreamPreloadTasksResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamPreloadTasksResponse> describeLiveStreamPreloadTasks(DescribeLiveStreamPreloadTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamPreloadTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamPreloadTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamPreloadTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can query data of a single domain name in each request. If you specify multiple domain names, an error is returned.</p>
     * <ul>
     * <li>The maximum time range to query is 24 hours.</li>
     * <li>The minimum data granularity to query is 1 minute.</li>
     * <li>You can query data in the last 31 days.</li>
     * <li>This operation is used to monitor data. The data returned by this operation cannot be used as a reference to calculate resource usage for billing.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamPushMetricDetailData  DescribeLiveStreamPushMetricDetailDataRequest
     * @return DescribeLiveStreamPushMetricDetailDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamPushMetricDetailDataResponse> describeLiveStreamPushMetricDetailData(DescribeLiveStreamPushMetricDetailDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamPushMetricDetailData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamPushMetricDetailDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamPushMetricDetailDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the recordings of the live stream.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamRecordContent  DescribeLiveStreamRecordContentRequest
     * @return DescribeLiveStreamRecordContentResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamRecordContentResponse> describeLiveStreamRecordContent(DescribeLiveStreamRecordContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamRecordContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamRecordContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamRecordContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>ApsaraVideo Live stores the information about M3U8 index files for six months. You can query the information about only the M3U8 index files that were created in the last six months. OSS stores M3U8 index files for a time period that is specified by the storage configuration in OSS.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamRecordIndexFile  DescribeLiveStreamRecordIndexFileRequest
     * @return DescribeLiveStreamRecordIndexFileResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamRecordIndexFileResponse> describeLiveStreamRecordIndexFile(DescribeLiveStreamRecordIndexFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamRecordIndexFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamRecordIndexFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamRecordIndexFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  ApsaraVideo Live stores the information about M3U8 index files for six months. You can query the information about only the M3U8 index files that were created in the last six months.</p>
     * <ul>
     * <li>OSS stores M3U8 index files for a time period that is specified by the storage configuration in OSS.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamRecordIndexFiles  DescribeLiveStreamRecordIndexFilesRequest
     * @return DescribeLiveStreamRecordIndexFilesResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamRecordIndexFilesResponse> describeLiveStreamRecordIndexFiles(DescribeLiveStreamRecordIndexFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamRecordIndexFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamRecordIndexFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamRecordIndexFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query only snapshots that were captured in the last year.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamSnapshotInfo  DescribeLiveStreamSnapshotInfoRequest
     * @return DescribeLiveStreamSnapshotInfoResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamSnapshotInfoResponse> describeLiveStreamSnapshotInfo(DescribeLiveStreamSnapshotInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamSnapshotInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamSnapshotInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamSnapshotInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the streaming domain, and then call this operation to query the status of a stream in real time. If the stream is in the offline status, you can check the stream ingest callback to learn about the reason that causes the offline status. This operation does not provide detailed information.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamState  DescribeLiveStreamStateRequest
     * @return DescribeLiveStreamStateResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamStateResponse> describeLiveStreamState(DescribeLiveStreamStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the transcoding configurations.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamTranscodeInfo  DescribeLiveStreamTranscodeInfoRequest
     * @return DescribeLiveStreamTranscodeInfoResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamTranscodeInfoResponse> describeLiveStreamTranscodeInfo(DescribeLiveStreamTranscodeInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamTranscodeInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamTranscodeInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamTranscodeInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The maximum time range for a query is 24 hours.</p>
     * <ul>
     * <li>The minimum time granularity for a query is 5 minutes.</li>
     * <li>You can query data in the last 31 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamTranscodeMetricData  DescribeLiveStreamTranscodeMetricDataRequest
     * @return DescribeLiveStreamTranscodeMetricDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamTranscodeMetricDataResponse> describeLiveStreamTranscodeMetricData(DescribeLiveStreamTranscodeMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamTranscodeMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamTranscodeMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamTranscodeMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamTranscodeStreamNum  DescribeLiveStreamTranscodeStreamNumRequest
     * @return DescribeLiveStreamTranscodeStreamNumResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamTranscodeStreamNumResponse> describeLiveStreamTranscodeStreamNum(DescribeLiveStreamTranscodeStreamNumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamTranscodeStreamNum").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamTranscodeStreamNumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamTranscodeStreamNumResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you can specify the PageNumber and PageSize parameters to view watermark rules on separate pages. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamWatermarkRules  DescribeLiveStreamWatermarkRulesRequest
     * @return DescribeLiveStreamWatermarkRulesResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamWatermarkRulesResponse> describeLiveStreamWatermarkRules(DescribeLiveStreamWatermarkRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamWatermarkRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamWatermarkRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamWatermarkRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query watermark templates. You can use the PageNumber parameter to view results on separate pages. Make sure that you configure parameters properly when you call this operation.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamWatermarks  DescribeLiveStreamWatermarksRequest
     * @return DescribeLiveStreamWatermarksResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamWatermarksResponse> describeLiveStreamWatermarks(DescribeLiveStreamWatermarksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamWatermarks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamWatermarksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamWatermarksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The stream URLs refer to the URLs for playing in particular.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 50 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsBlockList  DescribeLiveStreamsBlockListRequest
     * @return DescribeLiveStreamsBlockListResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamsBlockListResponse> describeLiveStreamsBlockList(DescribeLiveStreamsBlockListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamsBlockList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamsBlockListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamsBlockListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the operation history of live streams under a domain name or in an application. The operations include all API operations that were called on live streams.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsControlHistory  DescribeLiveStreamsControlHistoryRequest
     * @return DescribeLiveStreamsControlHistoryResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamsControlHistoryResponse> describeLiveStreamsControlHistory(DescribeLiveStreamsControlHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamsControlHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamsControlHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamsControlHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsNotifyRecords  DescribeLiveStreamsNotifyRecordsRequest
     * @return DescribeLiveStreamsNotifyRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamsNotifyRecordsResponse> describeLiveStreamsNotifyRecords(DescribeLiveStreamsNotifyRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamsNotifyRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamsNotifyRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamsNotifyRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveStreamsNotifyUrlConfig  DescribeLiveStreamsNotifyUrlConfigRequest
     * @return DescribeLiveStreamsNotifyUrlConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamsNotifyUrlConfigResponse> describeLiveStreamsNotifyUrlConfig(DescribeLiveStreamsNotifyUrlConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamsNotifyUrlConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamsNotifyUrlConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamsNotifyUrlConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the following types of streams.</p>
     * <ul>
     * <li>all: all streams.</li>
     * <li>raw: source streams.</li>
     * <li>trans: transcoded streams.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsOnlineList  DescribeLiveStreamsOnlineListRequest
     * @return DescribeLiveStreamsOnlineListResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamsOnlineListResponse> describeLiveStreamsOnlineList(DescribeLiveStreamsOnlineListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamsOnlineList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamsOnlineListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamsOnlineListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>This operation allows you to query streams in the last 30 days. The information of active streams during the queried period is returned. This operation supports the following sorting methods.</p>
     * <ul>
     * <li>stream_name_desc: sorts the entries in descending order by stream name.</li>
     * <li>stream_name_asc: sorts the entries in ascending order by stream name.</li>
     * <li>publish_time_desc: sorts the entries in descending order by stream ingest time.</li>
     * <li>publish_time_asc: sorts the entries in ascending order by stream ingest time.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 3 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsPublishList  DescribeLiveStreamsPublishListRequest
     * @return DescribeLiveStreamsPublishListResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamsPublishListResponse> describeLiveStreamsPublishList(DescribeLiveStreamsPublishListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamsPublishList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamsPublishListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamsPublishListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The maximum time range for a query is 15 days.</p>
     * <ul>
     * <li>You can query data in the last 18 months.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsTotalCount  DescribeLiveStreamsTotalCountRequest
     * @return DescribeLiveStreamsTotalCountResponse
     */
    @Override
    public CompletableFuture<DescribeLiveStreamsTotalCountResponse> describeLiveStreamsTotalCount(DescribeLiveStreamsTotalCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveStreamsTotalCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveStreamsTotalCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveStreamsTotalCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you do not specify the StartTime or EndTime parameter, data of the current month is queried by default. To query data within a specific time range, you must specify both the StartTime and EndTime parameters.</p>
     * <ul>
     * <li>You can query data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveTopDomainsByFlow  DescribeLiveTopDomainsByFlowRequest
     * @return DescribeLiveTopDomainsByFlowResponse
     */
    @Override
    public CompletableFuture<DescribeLiveTopDomainsByFlowResponse> describeLiveTopDomainsByFlow(DescribeLiveTopDomainsByFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveTopDomainsByFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveTopDomainsByFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveTopDomainsByFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveTrafficDomainLog  DescribeLiveTrafficDomainLogRequest
     * @return DescribeLiveTrafficDomainLogResponse
     */
    @Override
    public CompletableFuture<DescribeLiveTrafficDomainLogResponse> describeLiveTrafficDomainLog(DescribeLiveTrafficDomainLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveTrafficDomainLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveTrafficDomainLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveTrafficDomainLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>The maximum time range for a query is 24 hours. </li>
     * <li>The minimum time range for a query is 1 hour. </li>
     * <li>You can query data in the last 31 days.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveUpVideoAudioInfo  DescribeLiveUpVideoAudioInfoRequest
     * @return DescribeLiveUpVideoAudioInfoResponse
     */
    @Override
    public CompletableFuture<DescribeLiveUpVideoAudioInfoResponse> describeLiveUpVideoAudioInfo(DescribeLiveUpVideoAudioInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveUpVideoAudioInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveUpVideoAudioInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveUpVideoAudioInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to estimate resource usage of the current month based on the metering method that is specified on the first day of the month. You can call this operation to estimate resource usage of only the current month within your Alibaba Cloud account. The time range used for the estimation starts at 00:00 on the first day of the month and ends 2 hours earlier than the current time.</p>
     * <ul>
     * <li>Pay by monthly 95th percentile bandwidth: The top 5% values between the start time and end time are excluded. The highest value among the remaining values is the estimated value.</li>
     * <li>Pay by average daily peak bandwidth per month: Estimated value = Sum of daily peak bandwidth values/Number of days. The current day is excluded.</li>
     * <li>Pay by 4th peak bandwidth per month: The estimated value is the 4th peak bandwidth value between the start time and end time. If the time range is less than four days, the estimated value is 0.</li>
     * <li>Pay by average daily 95th percentile bandwidth per month: Estimated value = Sum of daily 95th percentile bandwidth values/Number of days. The current day is excluded.</li>
     * <li>Pay by 95th percentile bandwidth with 50% off from 00:00 to 08:00: The top 5% values between the start time and end time are excluded. The highest value among the remaining values is the estimated value.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation once per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveUserBillPrediction  DescribeLiveUserBillPredictionRequest
     * @return DescribeLiveUserBillPredictionResponse
     */
    @Override
    public CompletableFuture<DescribeLiveUserBillPredictionResponse> describeLiveUserBillPrediction(DescribeLiveUserBillPredictionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveUserBillPrediction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveUserBillPredictionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveUserBillPredictionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can call this operation to query all domain names of ApsaraVideo Live within your Alibaba Cloud account. The supported types of domain names are streaming domains and edge ingest domains.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveUserDomains  DescribeLiveUserDomainsRequest
     * @return DescribeLiveUserDomainsResponse
     */
    @Override
    public CompletableFuture<DescribeLiveUserDomainsResponse> describeLiveUserDomains(DescribeLiveUserDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveUserDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveUserDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveUserDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveUserStreamMetricData  DescribeLiveUserStreamMetricDataRequest
     * @return DescribeLiveUserStreamMetricDataResponse
     */
    @Override
    public CompletableFuture<DescribeLiveUserStreamMetricDataResponse> describeLiveUserStreamMetricData(DescribeLiveUserStreamMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveUserStreamMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveUserStreamMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveUserStreamMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveUserTags  DescribeLiveUserTagsRequest
     * @return DescribeLiveUserTagsResponse
     */
    @Override
    public CompletableFuture<DescribeLiveUserTagsResponse> describeLiveUserTags(DescribeLiveUserTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveUserTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveUserTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveUserTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLiveUserTrafficLog  DescribeLiveUserTrafficLogRequest
     * @return DescribeLiveUserTrafficLogResponse
     */
    @Override
    public CompletableFuture<DescribeLiveUserTrafficLogResponse> describeLiveUserTrafficLog(DescribeLiveUserTrafficLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveUserTrafficLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveUserTrafficLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveUserTrafficLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You can call this operation to query the ownership verification content of a single domain name.</li>
     * <li>You can call this operation up to 30 times per second per account.</li>
     * <li>When you call this operation, you need to specify a domain name as a request parameter.</li>
     * <li>After a successful call, the verification content and request ID are returned, which can be used for subsequent operations.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLiveVerifyContent  DescribeLiveVerifyContentRequest
     * @return DescribeLiveVerifyContentResponse
     */
    @Override
    public CompletableFuture<DescribeLiveVerifyContentResponse> describeLiveVerifyContent(DescribeLiveVerifyContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLiveVerifyContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLiveVerifyContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLiveVerifyContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The maximum time range for a query is 31 days.</li>
     * <li>The minimum time granularity for a query is 5 minutes.</li>
     * <li>You can query the data in the last 90 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeMeterLiveBypassDuration  DescribeMeterLiveBypassDurationRequest
     * @return DescribeMeterLiveBypassDurationResponse
     */
    @Override
    public CompletableFuture<DescribeMeterLiveBypassDurationResponse> describeMeterLiveBypassDuration(DescribeMeterLiveBypassDurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMeterLiveBypassDuration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMeterLiveBypassDurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMeterLiveBypassDurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation to create stream mixing tasks and then call this operation to query the list of stream mixing tasks.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeMixStreamList  DescribeMixStreamListRequest
     * @return DescribeMixStreamListResponse
     */
    @Override
    public CompletableFuture<DescribeMixStreamListResponse> describeMixStreamList(DescribeMixStreamListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMixStreamList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMixStreamListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMixStreamListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about the factors that cause latency of first frames within a specified period of time. You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKFirstFrameCost  DescribeRTSNativeSDKFirstFrameCostRequest
     * @return DescribeRTSNativeSDKFirstFrameCostResponse
     */
    @Override
    public CompletableFuture<DescribeRTSNativeSDKFirstFrameCostResponse> describeRTSNativeSDKFirstFrameCost(DescribeRTSNativeSDKFirstFrameCostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRTSNativeSDKFirstFrameCost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRTSNativeSDKFirstFrameCostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRTSNativeSDKFirstFrameCostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the average latency of first frames within a specified period of time. You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKFirstFrameDelay  DescribeRTSNativeSDKFirstFrameDelayRequest
     * @return DescribeRTSNativeSDKFirstFrameDelayResponse
     */
    @Override
    public CompletableFuture<DescribeRTSNativeSDKFirstFrameDelayResponse> describeRTSNativeSDKFirstFrameDelay(DescribeRTSNativeSDKFirstFrameDelayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRTSNativeSDKFirstFrameDelay").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRTSNativeSDKFirstFrameDelayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRTSNativeSDKFirstFrameDelayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the causes of playback failures that occurred within a specified period of time. The causes are returned in the form of status codes. You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKPlayFailStatus  DescribeRTSNativeSDKPlayFailStatusRequest
     * @return DescribeRTSNativeSDKPlayFailStatusResponse
     */
    @Override
    public CompletableFuture<DescribeRTSNativeSDKPlayFailStatusResponse> describeRTSNativeSDKPlayFailStatus(DescribeRTSNativeSDKPlayFailStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRTSNativeSDKPlayFailStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRTSNativeSDKPlayFailStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRTSNativeSDKPlayFailStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the playback duration within a specified period of time. You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKPlayTime  DescribeRTSNativeSDKPlayTimeRequest
     * @return DescribeRTSNativeSDKPlayTimeResponse
     */
    @Override
    public CompletableFuture<DescribeRTSNativeSDKPlayTimeResponse> describeRTSNativeSDKPlayTime(DescribeRTSNativeSDKPlayTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRTSNativeSDKPlayTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRTSNativeSDKPlayTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRTSNativeSDKPlayTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>QPS limit You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKVvData  DescribeRTSNativeSDKVvDataRequest
     * @return DescribeRTSNativeSDKVvDataResponse
     */
    @Override
    public CompletableFuture<DescribeRTSNativeSDKVvDataResponse> describeRTSNativeSDKVvData(DescribeRTSNativeSDKVvDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRTSNativeSDKVvData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRTSNativeSDKVvDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRTSNativeSDKVvDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRtcCloudRecordingFiles  DescribeRtcCloudRecordingFilesRequest
     * @return DescribeRtcCloudRecordingFilesResponse
     */
    @Override
    public CompletableFuture<DescribeRtcCloudRecordingFilesResponse> describeRtcCloudRecordingFiles(DescribeRtcCloudRecordingFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRtcCloudRecordingFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRtcCloudRecordingFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRtcCloudRecordingFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>You can call this operation to query information about a subscription to mixed-stream relay events. </li>
     * <li>Before you call this operation, make sure that you have called the CreateRtcMPUEventSub operation to create the subscription.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <ul>
     * <li>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRtcMPUEventSub  DescribeRtcMPUEventSubRequest
     * @return DescribeRtcMPUEventSubResponse
     */
    @Override
    public CompletableFuture<DescribeRtcMPUEventSubResponse> describeRtcMPUEventSub(DescribeRtcMPUEventSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRtcMPUEventSub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRtcMPUEventSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRtcMPUEventSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot call this operation if the episode list is empty. For information about how to add episodes to the episode list, see <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeShowList  DescribeShowListRequest
     * @return DescribeShowListResponse
     */
    @Override
    public CompletableFuture<DescribeShowListResponse> describeShowList(DescribeShowListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeShowList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeShowListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeShowListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries configurations of stream-level region blocking.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeStreamLocationBlock  DescribeStreamLocationBlockRequest
     * @return DescribeStreamLocationBlockResponse
     */
    @Override
    public CompletableFuture<DescribeStreamLocationBlockResponse> describeStreamLocationBlock(DescribeStreamLocationBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStreamLocationBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStreamLocationBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStreamLocationBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/215388.html">AddStudioLayout</a> operation to configure layouts for a virtual studio before you call this operation to query layouts.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeStudioLayouts  DescribeStudioLayoutsRequest
     * @return DescribeStudioLayoutsResponse
     */
    @Override
    public CompletableFuture<DescribeStudioLayoutsResponse> describeStudioLayouts(DescribeStudioLayoutsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStudioLayouts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStudioLayoutsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStudioLayoutsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the stream pulling information about a live stream of a headline.</p>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeToutiaoLivePlay  DescribeToutiaoLivePlayRequest
     * @return DescribeToutiaoLivePlayResponse
     */
    @Override
    public CompletableFuture<DescribeToutiaoLivePlayResponse> describeToutiaoLivePlay(DescribeToutiaoLivePlayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeToutiaoLivePlay").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeToutiaoLivePlayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeToutiaoLivePlayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the ingest information of a specified live stream that is ingested to Toutiao.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeToutiaoLivePublish  DescribeToutiaoLivePublishRequest
     * @return DescribeToutiaoLivePublishResponse
     */
    @Override
    public CompletableFuture<DescribeToutiaoLivePublishResponse> describeToutiaoLivePublish(DescribeToutiaoLivePublishRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeToutiaoLivePublish").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeToutiaoLivePublishResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeToutiaoLivePublishResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUidOnlineStreams  DescribeUidOnlineStreamsRequest
     * @return DescribeUidOnlineStreamsResponse
     */
    @Override
    public CompletableFuture<DescribeUidOnlineStreamsResponse> describeUidOnlineStreams(DescribeUidOnlineStreamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUidOnlineStreams").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUidOnlineStreamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUidOnlineStreamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the daily peak inbound bandwidth.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeUpBpsPeakData  DescribeUpBpsPeakDataRequest
     * @return DescribeUpBpsPeakDataResponse
     */
    @Override
    public CompletableFuture<DescribeUpBpsPeakDataResponse> describeUpBpsPeakData(DescribeUpBpsPeakDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUpBpsPeakData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUpBpsPeakDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUpBpsPeakDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the daily peak inbound bandwidth of a leased line.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeUpBpsPeakOfLine  DescribeUpBpsPeakOfLineRequest
     * @return DescribeUpBpsPeakOfLineResponse
     */
    @Override
    public CompletableFuture<DescribeUpBpsPeakOfLineResponse> describeUpBpsPeakOfLine(DescribeUpBpsPeakOfLineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUpBpsPeakOfLine").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUpBpsPeakOfLineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUpBpsPeakOfLineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the daily peak number of concurrently ingested streams.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeUpPeakPublishStreamData  DescribeUpPeakPublishStreamDataRequest
     * @return DescribeUpPeakPublishStreamDataResponse
     */
    @Override
    public CompletableFuture<DescribeUpPeakPublishStreamDataResponse> describeUpPeakPublishStreamData(DescribeUpPeakPublishStreamDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUpPeakPublishStreamData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUpPeakPublishStreamDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUpPeakPublishStreamDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain a domain name for which real-time log delivery is enabled, and then call this operation to suspend real-time log delivery for the domain name.
     * This operation is applicable to only streaming domains. If you want to configure real-time log delivery for an ingest domain, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12818093.nav-right.dticket.6cb216d07otFWR#/ticket/createIndex">submit a ticket</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DisableLiveRealtimeLogDelivery  DisableLiveRealtimeLogDeliveryRequest
     * @return DisableLiveRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<DisableLiveRealtimeLogDeliveryResponse> disableLiveRealtimeLogDelivery(DisableLiveRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableLiveRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableLiveRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableLiveRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Dynamically updating a watermark means replacing the watermark template ID during live streaming. Before you call this operation to update a watermark, you must prepare the watermark template ID that is used for replacement. The watermark template ID is specified by the <strong>TemplateId</strong> parameter of this operation. You can call the <a href="https://help.aliyun.com/document_detail/2848102.html">DescribeLiveStreamWatermarks</a> operation to obtain available watermark template IDs.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DynamicUpdateWaterMarkStreamRule  DynamicUpdateWaterMarkStreamRuleRequest
     * @return DynamicUpdateWaterMarkStreamRuleResponse
     */
    @Override
    public CompletableFuture<DynamicUpdateWaterMarkStreamRuleResponse> dynamicUpdateWaterMarkStreamRule(DynamicUpdateWaterMarkStreamRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DynamicUpdateWaterMarkStreamRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DynamicUpdateWaterMarkStreamRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DynamicUpdateWaterMarkStreamRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update all configurations of episodes in an episode list or replace the episodes.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of EditPlaylist  EditPlaylistRequest
     * @return EditPlaylistResponse
     */
    @Override
    public CompletableFuture<EditPlaylistResponse> editPlaylist(EditPlaylistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditPlaylist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditPlaylistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditPlaylistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create an editing task by specifying the production studio ID and the episode ID. You will not receive a notification after the editing task is created. You can call the <a href="https://help.aliyun.com/document_detail/2848059.html">GetEditingJobInfo</a> operation to query the status of the editing task.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of EditShowAndReplace  EditShowAndReplaceRequest
     * @return EditShowAndReplaceResponse
     */
    @Override
    public CompletableFuture<EditShowAndReplaceResponse> editShowAndReplace(EditShowAndReplaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditShowAndReplace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditShowAndReplaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditShowAndReplaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to switch a specified scene to the standby resource. Only a PGM scene is supported.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of EffectCasterUrgent  EffectCasterUrgentRequest
     * @return EffectCasterUrgentResponse
     */
    @Override
    public CompletableFuture<EffectCasterUrgentResponse> effectCasterUrgent(EffectCasterUrgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EffectCasterUrgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EffectCasterUrgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EffectCasterUrgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the resource is referenced by the scene.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of EffectCasterVideoResource  EffectCasterVideoResourceRequest
     * @return EffectCasterVideoResourceResponse
     */
    @Override
    public CompletableFuture<EffectCasterVideoResourceResponse> effectCasterVideoResource(EffectCasterVideoResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EffectCasterVideoResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EffectCasterVideoResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EffectCasterVideoResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>This operation is applicable to only streaming domains. If you want to configure real-time log delivery for an ingest domain, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12818093.nav-right.dticket.6cb216d07otFWR#/ticket/createIndex">submit a ticket</a>.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of EnableLiveRealtimeLogDelivery  EnableLiveRealtimeLogDeliveryRequest
     * @return EnableLiveRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<EnableLiveRealtimeLogDeliveryResponse> enableLiveRealtimeLogDelivery(EnableLiveRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableLiveRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableLiveRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableLiveRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to disable a live stream and specify the time when the live stream is resumed. If the time is not specified, you can call the <a href="https://help.aliyun.com/document_detail/2847831.html">ResumeLiveStream</a> operation to resume the live stream. This operation supports only the live streams ingested by streamers.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation disables a live stream by adding the stream to the blacklist. You can disable up to 10,000 live streams. If the limit is reached, you cannot disable any more live streams. Pay attention to the number of live streams that are disabled. You can call the <a href="https://help.aliyun.com/document_detail/2847825.html">DescribeLiveStreamsBlockList</a> operation to query the number of live streams that are disabled.</li>
     * <li>An interrupted live stream is not added to the blacklist and does not occupy the quota.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ForbidLiveStream  ForbidLiveStreamRequest
     * @return ForbidLiveStreamResponse
     */
    @Override
    public CompletableFuture<ForbidLiveStreamResponse> forbidLiveStream(ForbidLiveStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ForbidLiveStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ForbidLiveStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ForbidLiveStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all custom stream mixing templates. A list of template names and template configurations is returned.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetAllCustomTemplates  GetAllCustomTemplatesRequest
     * @return GetAllCustomTemplatesResponse
     */
    @Override
    public CompletableFuture<GetAllCustomTemplatesResponse> getAllCustomTemplates(GetAllCustomTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAllCustomTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAllCustomTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAllCustomTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the name of the custom stream mixing template, and then call this operation to query the information about the template.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetCustomTemplate  GetCustomTemplateRequest
     * @return GetCustomTemplateResponse
     */
    @Override
    public CompletableFuture<GetCustomTemplateResponse> getCustomTemplate(GetCustomTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To call this operation, make sure that you have the permissions to access the edge transcoding feature.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetEdgeTranscodeJob  GetEdgeTranscodeJobRequest
     * @return GetEdgeTranscodeJobResponse
     */
    @Override
    public CompletableFuture<GetEdgeTranscodeJobResponse> getEdgeTranscodeJob(GetEdgeTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEdgeTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEdgeTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEdgeTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the details of an edge transcoding template.</p>
     * <ul>
     * <li>To call this operation, make sure that you have the permissions to access the edge transcoding feature.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetEdgeTranscodeTemplate  GetEdgeTranscodeTemplateRequest
     * @return GetEdgeTranscodeTemplateResponse
     */
    @Override
    public CompletableFuture<GetEdgeTranscodeTemplateResponse> getEdgeTranscodeTemplate(GetEdgeTranscodeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEdgeTranscodeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEdgeTranscodeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEdgeTranscodeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When you call this operation, you can specify the CasterId and ShowId parameters to query the information about specific editing tasks. Make sure that the parameter settings meet the requirements.</p>
     * <ul>
     * <li>If you specify the ShowId parameter in the request, the information about the editing tasks for the specified episode is returned.</li>
     * <li>If you do not specify the ShowId parameter in the request, the information about the editing tasks for the entire episode list is returned.</li>
     * </ul>
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetEditingJobInfo  GetEditingJobInfoRequest
     * @return GetEditingJobInfoResponse
     */
    @Override
    public CompletableFuture<GetEditingJobInfoResponse> getEditingJobInfo(GetEditingJobInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEditingJobInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEditingJobInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEditingJobInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of GetMessageApp  GetMessageAppRequest
     * @return GetMessageAppResponse
     */
    @Override
    public CompletableFuture<GetMessageAppResponse> getMessageApp(GetMessageAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessageApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of GetMessageGroup  GetMessageGroupRequest
     * @return GetMessageGroupResponse
     */
    @Override
    public CompletableFuture<GetMessageGroupResponse> getMessageGroup(GetMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>Obtain the user ID, device ID, and device type of the client, and then pass the information to the server. When you call this operation, the server obtains a token and returns the token to the client. Different users have different user IDs, and different devices have different device IDs.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of GetMessageToken  GetMessageTokenRequest
     * @return GetMessageTokenResponse
     */
    @Override
    public CompletableFuture<GetMessageTokenResponse> getMessageToken(GetMessageTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessageToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTranscodeTaskStatus  GetTranscodeTaskStatusRequest
     * @return GetTranscodeTaskStatusResponse
     */
    @Override
    public CompletableFuture<GetTranscodeTaskStatusResponse> getTranscodeTaskStatus(GetTranscodeTaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTranscodeTaskStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTranscodeTaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTranscodeTaskStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of HotLiveRtcStream  HotLiveRtcStreamRequest
     * @return HotLiveRtcStreamResponse
     */
    @Override
    public CompletableFuture<HotLiveRtcStreamResponse> hotLiveRtcStream(HotLiveRtcStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HotLiveRtcStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotLiveRtcStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotLiveRtcStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a scheduled task to start and stop the playback of an episode list at specified points in time. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of InitializeAutoShowListTask  InitializeAutoShowListTaskRequest
     * @return InitializeAutoShowListTaskResponse
     */
    @Override
    public CompletableFuture<InitializeAutoShowListTaskResponse> initializeAutoShowListTask(InitializeAutoShowListTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitializeAutoShowListTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitializeAutoShowListTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitializeAutoShowListTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 200 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of JoinMessageGroup  JoinMessageGroupRequest
     * @return JoinMessageGroupResponse
     */
    @Override
    public CompletableFuture<JoinMessageGroupResponse> joinMessageGroup(JoinMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of KickLiveMessageGroupUser  KickLiveMessageGroupUserRequest
     * @return KickLiveMessageGroupUserResponse
     */
    @Override
    public CompletableFuture<KickLiveMessageGroupUserResponse> kickLiveMessageGroupUser(KickLiveMessageGroupUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("KickLiveMessageGroupUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(KickLiveMessageGroupUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<KickLiveMessageGroupUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of LeaveMessageGroup  LeaveMessageGroupRequest
     * @return LeaveMessageGroupResponse
     */
    @Override
    public CompletableFuture<LeaveMessageGroupResponse> leaveMessageGroup(LeaveMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LeaveMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LeaveMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LeaveMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query edge transcoding tasks.</p>
     * <ul>
     * <li>To call this operation, make sure that you have the permissions to access the edge transcoding feature.</li>
     * <li>You can query only tasks created or modified in the last 180 days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListEdgeTranscodeJob  ListEdgeTranscodeJobRequest
     * @return ListEdgeTranscodeJobResponse
     */
    @Override
    public CompletableFuture<ListEdgeTranscodeJobResponse> listEdgeTranscodeJob(ListEdgeTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEdgeTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEdgeTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEdgeTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the list of edge transcoding templates.</p>
     * <ul>
     * <li>To call this operation, make sure that you have the permissions to access the edge transcoding feature.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListEdgeTranscodeTemplate  ListEdgeTranscodeTemplateRequest
     * @return ListEdgeTranscodeTemplateResponse
     */
    @Override
    public CompletableFuture<ListEdgeTranscodeTemplateResponse> listEdgeTranscodeTemplate(ListEdgeTranscodeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEdgeTranscodeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEdgeTranscodeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEdgeTranscodeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListEventSub  ListEventSubRequest
     * @return ListEventSubResponse
     */
    @Override
    public CompletableFuture<ListEventSubResponse> listEventSub(ListEventSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEventSub").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEventSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEventSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The maximum time range to query is seven days.</p>
     * <ul>
     * <li>The minimum time granularity to query is 1 minute.</li>
     * <li>You can query data in the last seven days.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListEventSubEvent  ListEventSubEventRequest
     * @return ListEventSubEventResponse
     */
    @Override
    public CompletableFuture<ListEventSubEventResponse> listEventSubEvent(ListEventSubEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEventSubEvent").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEventSubEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEventSubEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveDelayConfig  ListLiveDelayConfigRequest
     * @return ListLiveDelayConfigResponse
     */
    @Override
    public CompletableFuture<ListLiveDelayConfigResponse> listLiveDelayConfig(ListLiveDelayConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveDelayConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveDelayConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveDelayConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageApps  ListLiveMessageAppsRequest
     * @return ListLiveMessageAppsResponse
     */
    @Override
    public CompletableFuture<ListLiveMessageAppsResponse> listLiveMessageApps(ListLiveMessageAppsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveMessageApps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveMessageAppsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveMessageAppsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageGroupByPage  ListLiveMessageGroupByPageRequest
     * @return ListLiveMessageGroupByPageResponse
     */
    @Override
    public CompletableFuture<ListLiveMessageGroupByPageResponse> listLiveMessageGroupByPage(ListLiveMessageGroupByPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveMessageGroupByPage").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveMessageGroupByPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveMessageGroupByPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageGroupMessages  ListLiveMessageGroupMessagesRequest
     * @return ListLiveMessageGroupMessagesResponse
     */
    @Override
    public CompletableFuture<ListLiveMessageGroupMessagesResponse> listLiveMessageGroupMessages(ListLiveMessageGroupMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveMessageGroupMessages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveMessageGroupMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveMessageGroupMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <ul>
     * <li>For a super group, which has more than 2,000 users, the user list cannot be queried. In addition, the notifications about users entering or leaving the group are sent at an interval of at least of 5 seconds. These notifications display the accurate number of users in the group for the time being, but do not display the list of all users entering or leaving the group. Once a group is upgraded to a super group, the user list of the group is immediately cleared. The super group cannot be restored to a normal group until all users in the group leave the group (that is, the group is closed). After you reopen the group, it is restored to a normal group.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageGroupUsers  ListLiveMessageGroupUsersRequest
     * @return ListLiveMessageGroupUsersResponse
     */
    @Override
    public CompletableFuture<ListLiveMessageGroupUsersResponse> listLiveMessageGroupUsers(ListLiveMessageGroupUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveMessageGroupUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveMessageGroupUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveMessageGroupUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageGroups  ListLiveMessageGroupsRequest
     * @return ListLiveMessageGroupsResponse
     */
    @Override
    public CompletableFuture<ListLiveMessageGroupsResponse> listLiveMessageGroups(ListLiveMessageGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveMessageGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveMessageGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveMessageGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all configurations of real-time log delivery under an account. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveRealtimeLogDelivery  ListLiveRealtimeLogDeliveryRequest
     * @return ListLiveRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<ListLiveRealtimeLogDeliveryResponse> listLiveRealtimeLogDelivery(ListLiveRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query all domain names that are associated with a specific configuration of real-time log delivery. The returned results indicate whether real-time log delivery is enabled or disabled for the domain names.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2848121.html">DescribeLiveDomainRealtimeLogDelivery</a> to query the Project, Logstore, and Region parameters.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveRealtimeLogDeliveryDomains  ListLiveRealtimeLogDeliveryDomainsRequest
     * @return ListLiveRealtimeLogDeliveryDomainsResponse
     */
    @Override
    public CompletableFuture<ListLiveRealtimeLogDeliveryDomainsResponse> listLiveRealtimeLogDeliveryDomains(ListLiveRealtimeLogDeliveryDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveRealtimeLogDeliveryDomains").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveRealtimeLogDeliveryDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveRealtimeLogDeliveryDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all configurations of real-time log delivery. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveRealtimeLogDeliveryInfos  ListLiveRealtimeLogDeliveryInfosRequest
     * @return ListLiveRealtimeLogDeliveryInfosResponse
     */
    @Override
    public CompletableFuture<ListLiveRealtimeLogDeliveryInfosResponse> listLiveRealtimeLogDeliveryInfos(ListLiveRealtimeLogDeliveryInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveRealtimeLogDeliveryInfos").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveRealtimeLogDeliveryInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveRealtimeLogDeliveryInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessage  ListMessageRequest
     * @return ListMessageResponse
     */
    @Override
    public CompletableFuture<ListMessageResponse> listMessage(ListMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessageApp  ListMessageAppRequest
     * @return ListMessageAppResponse
     */
    @Override
    public CompletableFuture<ListMessageAppResponse> listMessageApp(ListMessageAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMessageApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessageAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessageAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessageGroup  ListMessageGroupRequest
     * @return ListMessageGroupResponse
     */
    @Override
    public CompletableFuture<ListMessageGroupResponse> listMessageGroup(ListMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessageGroupUser  ListMessageGroupUserRequest
     * @return ListMessageGroupUserResponse
     */
    @Override
    public CompletableFuture<ListMessageGroupUserResponse> listMessageGroupUser(ListMessageGroupUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMessageGroupUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessageGroupUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessageGroupUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessageGroupUserById  ListMessageGroupUserByIdRequest
     * @return ListMessageGroupUserByIdResponse
     */
    @Override
    public CompletableFuture<ListMessageGroupUserByIdResponse> listMessageGroupUserById(ListMessageGroupUserByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMessageGroupUserById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessageGroupUserByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessageGroupUserByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListMuteGroupUser  ListMuteGroupUserRequest
     * @return ListMuteGroupUserResponse
     */
    @Override
    public CompletableFuture<ListMuteGroupUserResponse> listMuteGroupUser(ListMuteGroupUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMuteGroupUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMuteGroupUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMuteGroupUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add episode lists and then call this operation to query the episode lists.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListPlaylist  ListPlaylistRequest
     * @return ListPlaylistResponse
     */
    @Override
    public CompletableFuture<ListPlaylistResponse> listPlaylist(ListPlaylistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPlaylist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPlaylistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPlaylistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add episodes to an episode list and then call this operation to query the episodes in the episode list</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListPlaylistItems  ListPlaylistItemsRequest
     * @return ListPlaylistItemsResponse
     */
    @Override
    public CompletableFuture<ListPlaylistItemsResponse> listPlaylistItems(ListPlaylistItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPlaylistItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPlaylistItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPlaylistItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the callback records of a subscription to mixed-stream relay events in the last seven days.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListRtcMPUEventSubRecord  ListRtcMPUEventSubRecordRequest
     * @return ListRtcMPUEventSubRecordResponse
     */
    @Override
    public CompletableFuture<ListRtcMPUEventSubRecordResponse> listRtcMPUEventSubRecord(ListRtcMPUEventSubRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRtcMPUEventSubRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRtcMPUEventSubRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRtcMPUEventSubRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call the ListRtcMPUTaskDetail operation to query the parameters of mixed-stream relay tasks that were created by calling the StartLiveMPUTask operation.</p>
     * <ul>
     * <li>By default, the query results are sorted in reverse chronological order based on the task update time.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListRtcMPUTaskDetail  ListRtcMPUTaskDetailRequest
     * @return ListRtcMPUTaskDetailResponse
     */
    @Override
    public CompletableFuture<ListRtcMPUTaskDetailResponse> listRtcMPUTaskDetail(ListRtcMPUTaskDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRtcMPUTaskDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRtcMPUTaskDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRtcMPUTaskDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LiveUpstreamQosData  LiveUpstreamQosDataRequest
     * @return LiveUpstreamQosDataResponse
     */
    @Override
    public CompletableFuture<LiveUpstreamQosDataResponse> liveUpstreamQosData(LiveUpstreamQosDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LiveUpstreamQosData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LiveUpstreamQosDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LiveUpstreamQosDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MiguLivePullToPushStart  MiguLivePullToPushStartRequest
     * @return MiguLivePullToPushStartResponse
     */
    @Override
    public CompletableFuture<MiguLivePullToPushStartResponse> miguLivePullToPushStart(MiguLivePullToPushStartRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MiguLivePullToPushStart").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MiguLivePullToPushStartResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MiguLivePullToPushStartResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MiguLivePullToPushStatus  MiguLivePullToPushStatusRequest
     * @return MiguLivePullToPushStatusResponse
     */
    @Override
    public CompletableFuture<MiguLivePullToPushStatusResponse> miguLivePullToPushStatus(MiguLivePullToPushStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MiguLivePullToPushStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MiguLivePullToPushStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MiguLivePullToPushStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a text, image, or subtitle component.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyCasterComponent  ModifyCasterComponentRequest
     * @return ModifyCasterComponentResponse
     */
    @Override
    public CompletableFuture<ModifyCasterComponentResponse> modifyCasterComponent(ModifyCasterComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCasterComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCasterComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCasterComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the configurations of an episode in a production studio. You cannot change the episode type.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyCasterEpisode  ModifyCasterEpisodeRequest
     * @return ModifyCasterEpisodeResponse
     */
    @Override
    public CompletableFuture<ModifyCasterEpisodeResponse> modifyCasterEpisode(ModifyCasterEpisodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCasterEpisode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCasterEpisodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCasterEpisodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to modify a layout of the production studio. This operation supports the default and adaptive scaling modes.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyCasterLayout  ModifyCasterLayoutRequest
     * @return ModifyCasterLayoutResponse
     */
    @Override
    public CompletableFuture<ModifyCasterLayoutResponse> modifyCasterLayout(ModifyCasterLayoutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCasterLayout").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCasterLayoutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCasterLayoutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848074.html">AddCasterProgram</a> operation to add the episode list for carousel playback in a production studio and then call this operation to modify the episode list. The supported types of episodes include video resource and component.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyCasterProgram  ModifyCasterProgramRequest
     * @return ModifyCasterProgramResponse
     */
    @Override
    public CompletableFuture<ModifyCasterProgramResponse> modifyCasterProgram(ModifyCasterProgramRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCasterProgram").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCasterProgramResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCasterProgramResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create a production studio before you call this operation to modify input sources of the production studio.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ModifyCasterVideoResource  ModifyCasterVideoResourceRequest
     * @return ModifyCasterVideoResourceResponse
     */
    @Override
    public CompletableFuture<ModifyCasterVideoResourceResponse> modifyCasterVideoResource(ModifyCasterVideoResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCasterVideoResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCasterVideoResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCasterVideoResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLiveAIStudio  ModifyLiveAIStudioRequest
     * @return ModifyLiveAIStudioResponse
     */
    @Override
    public CompletableFuture<ModifyLiveAIStudioResponse> modifyLiveAIStudio(ModifyLiveAIStudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveAIStudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveAIStudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveAIStudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveDomainSchdmByProperty  ModifyLiveDomainSchdmByPropertyRequest
     * @return ModifyLiveDomainSchdmByPropertyResponse
     */
    @Override
    public CompletableFuture<ModifyLiveDomainSchdmByPropertyResponse> modifyLiveDomainSchdmByProperty(ModifyLiveDomainSchdmByPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveDomainSchdmByProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveDomainSchdmByPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveDomainSchdmByPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageAppAudit  ModifyLiveMessageAppAuditRequest
     * @return ModifyLiveMessageAppAuditResponse
     */
    @Override
    public CompletableFuture<ModifyLiveMessageAppAuditResponse> modifyLiveMessageAppAudit(ModifyLiveMessageAppAuditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveMessageAppAudit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveMessageAppAuditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveMessageAppAuditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageAppCallback  ModifyLiveMessageAppCallbackRequest
     * @return ModifyLiveMessageAppCallbackResponse
     */
    @Override
    public CompletableFuture<ModifyLiveMessageAppCallbackResponse> modifyLiveMessageAppCallback(ModifyLiveMessageAppCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveMessageAppCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveMessageAppCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveMessageAppCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageAppDisable  ModifyLiveMessageAppDisableRequest
     * @return ModifyLiveMessageAppDisableResponse
     */
    @Override
    public CompletableFuture<ModifyLiveMessageAppDisableResponse> modifyLiveMessageAppDisable(ModifyLiveMessageAppDisableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveMessageAppDisable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveMessageAppDisableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveMessageAppDisableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageGroup  ModifyLiveMessageGroupRequest
     * @return ModifyLiveMessageGroupResponse
     */
    @Override
    public CompletableFuture<ModifyLiveMessageGroupResponse> modifyLiveMessageGroup(ModifyLiveMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageGroupBand  ModifyLiveMessageGroupBandRequest
     * @return ModifyLiveMessageGroupBandResponse
     */
    @Override
    public CompletableFuture<ModifyLiveMessageGroupBandResponse> modifyLiveMessageGroupBand(ModifyLiveMessageGroupBandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveMessageGroupBand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveMessageGroupBandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveMessageGroupBandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLiveMessageUserInfo  ModifyLiveMessageUserInfoRequest
     * @return ModifyLiveMessageUserInfoResponse
     */
    @Override
    public CompletableFuture<ModifyLiveMessageUserInfoResponse> modifyLiveMessageUserInfo(ModifyLiveMessageUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveMessageUserInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveMessageUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveMessageUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to modify the configuration of real-time log delivery for a domain name. Logs for a domain name can be delivered to only one Logstore.
     * This operation is applicable to only streaming domains. If you want to configure real-time log delivery for an ingest domain, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12818093.nav-right.dticket.6cb216d07otFWR#/ticket/createIndex">submit a ticket</a>.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2848121.html">DescribeLiveDomainRealtimeLogDelivery</a> operation to query the Project, Logstore, and Region parameters.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveRealtimeLogDelivery  ModifyLiveRealtimeLogDeliveryRequest
     * @return ModifyLiveRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<ModifyLiveRealtimeLogDeliveryResponse> modifyLiveRealtimeLogDelivery(ModifyLiveRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLiveRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLiveRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLiveRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to change the position of an episode in an episode list, how many times an episode list is played, and the specific point in time at which the episode of the highest priority in an episode list is played.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyShowList  ModifyShowListRequest
     * @return ModifyShowListResponse
     */
    @Override
    public CompletableFuture<ModifyShowListResponse> modifyShowList(ModifyShowListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyShowList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyShowListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyShowListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a layout of a virtual studio. When you call this operation, specify only the parameters that you want to modify.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyStudioLayout  ModifyStudioLayoutRequest
     * @return ModifyStudioLayoutResponse
     */
    @Override
    public CompletableFuture<ModifyStudioLayoutResponse> modifyStudioLayout(ModifyStudioLayoutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStudioLayout").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyStudioLayoutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyStudioLayoutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of MuteAllGroupUser  MuteAllGroupUserRequest
     * @return MuteAllGroupUserResponse
     */
    @Override
    public CompletableFuture<MuteAllGroupUserResponse> muteAllGroupUser(MuteAllGroupUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MuteAllGroupUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MuteAllGroupUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MuteAllGroupUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of MuteGroupUser  MuteGroupUserRequest
     * @return MuteGroupUserResponse
     */
    @Override
    public CompletableFuture<MuteGroupUserResponse> muteGroupUser(MuteGroupUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MuteGroupUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MuteGroupUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MuteGroupUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot configure time shifting and delayed transcoding at the same time.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of OpenLiveShift  OpenLiveShiftRequest
     * @return OpenLiveShiftResponse
     */
    @Override
    public CompletableFuture<OpenLiveShiftResponse> openLiveShift(OpenLiveShiftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenLiveShift").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenLiveShiftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenLiveShiftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you add episodes to an episode list and start live streaming, you can call this operation to switch among episodes. For information about how to add episodes to an episode list, see <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of PlayChoosenShow  PlayChoosenShowRequest
     * @return PlayChoosenShowResponse
     */
    @Override
    public CompletableFuture<PlayChoosenShowResponse> playChoosenShow(PlayChoosenShowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PlayChoosenShow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PlayChoosenShowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PlayChoosenShowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Function name is required for calling this operation. You can get the function name by calling the <a href="~~297374#doc-api-live-DescribeLiveDomainStagingConfig~~" title="Queries the configurations in the canary release environment.">DescribeLiveDomainStagingConfig</a> operation.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 30 queries per minute. Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of PublishLiveStagingConfigToProduction  PublishLiveStagingConfigToProductionRequest
     * @return PublishLiveStagingConfigToProductionResponse
     */
    @Override
    public CompletableFuture<PublishLiveStagingConfigToProductionResponse> publishLiveStagingConfigToProduction(PublishLiveStagingConfigToProductionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishLiveStagingConfigToProduction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishLiveStagingConfigToProductionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishLiveStagingConfigToProductionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLiveDomainMultiStreamList  QueryLiveDomainMultiStreamListRequest
     * @return QueryLiveDomainMultiStreamListResponse
     */
    @Override
    public CompletableFuture<QueryLiveDomainMultiStreamListResponse> queryLiveDomainMultiStreamList(QueryLiveDomainMultiStreamListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryLiveDomainMultiStreamList").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLiveDomainMultiStreamListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLiveDomainMultiStreamListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of QueryMessageApp  QueryMessageAppRequest
     * @return QueryMessageAppResponse
     */
    @Override
    public CompletableFuture<QueryMessageAppResponse> queryMessageApp(QueryMessageAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMessageApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMessageAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMessageAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryRtcAsrTasks  QueryRtcAsrTasksRequest
     * @return QueryRtcAsrTasksResponse
     */
    @Override
    public CompletableFuture<QueryRtcAsrTasksResponse> queryRtcAsrTasks(QueryRtcAsrTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRtcAsrTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRtcAsrTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRtcAsrTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have configured authentication for snapshot callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/2847907.html">SetSnapshotCallbackAuth</a>. You can call this operation to query the configuration of authentication for snapshot callbacks for a main streaming domain. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of QuerySnapshotCallbackAuth  QuerySnapshotCallbackAuthRequest
     * @return QuerySnapshotCallbackAuthResponse
     */
    @Override
    public CompletableFuture<QuerySnapshotCallbackAuthResponse> querySnapshotCallbackAuth(QuerySnapshotCallbackAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySnapshotCallbackAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySnapshotCallbackAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySnapshotCallbackAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you fully understand the billing method and pricing of live stream recording in ApsaraVideo Live. For more information, see <a href="https://help.aliyun.com/document_detail/195287.html">Billing of live stream recording</a>.</p>
     * <ul>
     * <li>If a live stream is being automatically or manually recorded, you can call this operation to stop recording the live stream.</li>
     * <li>If you call this operation to start recording a live stream while it is being recorded, a TaskAlreadyStarted error is returned, indicating that the task has been started.</li>
     * <li>If a live stream that you manually record is interrupted, the recording stops.</li>
     * <li>If automatic recording is not configured for the live stream, ApsaraVideo Live does not automatically record the live stream after it is resumed.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RealTimeRecordCommand  RealTimeRecordCommandRequest
     * @return RealTimeRecordCommandResponse
     */
    @Override
    public CompletableFuture<RealTimeRecordCommandResponse> realTimeRecordCommand(RealTimeRecordCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RealTimeRecordCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RealTimeRecordCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RealTimeRecordCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to restore a deleted interactive messaging group within 30 days after you call the <a href="https://help.aliyun.com/document_detail/2848163.html">DeleteLiveMessageGroup</a> to delete the group.</p>
     * <ul>
     * <li>After you restore a group, the messages that were stored in the group before it was deleted can still be queried.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RecoverLiveMessageDeletedGroup  RecoverLiveMessageDeletedGroupRequest
     * @return RecoverLiveMessageDeletedGroupResponse
     */
    @Override
    public CompletableFuture<RecoverLiveMessageDeletedGroupResponse> recoverLiveMessageDeletedGroup(RecoverLiveMessageDeletedGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecoverLiveMessageDeletedGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoverLiveMessageDeletedGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoverLiveMessageDeletedGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RemoveLiveMessageGroupBand  RemoveLiveMessageGroupBandRequest
     * @return RemoveLiveMessageGroupBandResponse
     */
    @Override
    public CompletableFuture<RemoveLiveMessageGroupBandResponse> removeLiveMessageGroupBand(RemoveLiveMessageGroupBandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveLiveMessageGroupBand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveLiveMessageGroupBandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveLiveMessageGroupBandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You cannot use this operation on empty episode lists. For information about how to add episodes to an episode list, see <a href="https://help.aliyun.com/document_detail/370861.html">AddShowIntoShowList</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of RemoveShowFromShowList  RemoveShowFromShowListRequest
     * @return RemoveShowFromShowListResponse
     */
    @Override
    public CompletableFuture<RemoveShowFromShowListResponse> removeShowFromShowList(RemoveShowFromShowListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveShowFromShowList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveShowFromShowListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveShowFromShowListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove one or more users from a channel.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RemoveTerminals  RemoveTerminalsRequest
     * @return RemoveTerminalsResponse
     */
    @Override
    public CompletableFuture<RemoveTerminalsResponse> removeTerminals(RemoveTerminalsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTerminals").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTerminalsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTerminalsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Only product studios in playlist mode and general mode are supported. Virtual studios are not supported.</p>
     * <ul>
     * <li>After you restart a production studio, the current settings such as the resolution and screen orientation are reloaded to restore the previous playback status.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RestartCaster  RestartCasterRequest
     * @return RestartCasterResponse
     */
    @Override
    public CompletableFuture<RestartCasterResponse> restartCaster(RestartCasterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartCaster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartCasterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartCasterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to restart a pulled-stream relay task.</p>
     * <ul>
     * <li>You can restart a task that is running (even if the task is in an abnormal retry state) or a task that is stopped. For a task that is running, this operation stops and then restarts it. For a task that is stopped, this operation directly starts it.</li>
     * <li>You cannot restart a task if the start time specified for the task has not been reached.</li>
     * <li>If a task is restarted, the task runs based on the latest configuration of the task. This interrupts stream ingest.</li>
     * <li>If a task for a list of ApsaraVideo VOD resources is restarted, the list plays from the beginning based on the latest configuration. You can call an operation to update the video index and playback progress to achieve successive playback.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RestartLivePullToPush  RestartLivePullToPushRequest
     * @return RestartLivePullToPushResponse
     */
    @Override
    public CompletableFuture<RestartLivePullToPushResponse> restartLivePullToPush(RestartLivePullToPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartLivePullToPush").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartLivePullToPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartLivePullToPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartTranscodeTask  RestartTranscodeTaskRequest
     * @return RestartTranscodeTaskResponse
     */
    @Override
    public CompletableFuture<RestartTranscodeTaskResponse> restartTranscodeTask(RestartTranscodeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartTranscodeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartTranscodeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartTranscodeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to resume the ingest of a stream. This operation supports only the live streams ingested by streamers.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ResumeLiveStream  ResumeLiveStreamRequest
     * @return ResumeLiveStreamResponse
     */
    @Override
    public CompletableFuture<ResumeLiveStreamResponse> resumeLiveStream(ResumeLiveStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeLiveStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeLiveStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeLiveStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Function name is required for calling this operation. You can get the function name by calling the <a href="~~297374#doc-api-live-DescribeLiveDomainStagingConfig~~" title="Queries the configurations in the canary release environment.">DescribeLiveDomainStagingConfig</a> operation.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 30 queries per minute. Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of RollbackLiveStagingConfig  RollbackLiveStagingConfigRequest
     * @return RollbackLiveStagingConfigResponse
     */
    @Override
    public CompletableFuture<RollbackLiveStagingConfigResponse> rollbackLiveStagingConfig(RollbackLiveStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackLiveStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackLiveStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackLiveStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of SendLike  SendLikeRequest
     * @return SendLikeResponse
     */
    @Override
    public CompletableFuture<SendLikeResponse> sendLike(SendLikeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendLike").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendLikeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendLikeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group. You can send messages to a group only if the group is active, which requires that one or more users have joined the group. Offline messages are not supported. If you fail to send a message, check whether users exist in the group. If you want to send a message when all users are offline, we recommend that you store the message locally and send it after users get online.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendLiveMessageGroup  SendLiveMessageGroupRequest
     * @return SendLiveMessageGroupResponse
     */
    @Override
    public CompletableFuture<SendLiveMessageGroupResponse> sendLiveMessageGroup(SendLiveMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendLiveMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendLiveMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendLiveMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendLiveMessageUser  SendLiveMessageUserRequest
     * @return SendLiveMessageUserResponse
     */
    @Override
    public CompletableFuture<SendLiveMessageUserResponse> sendLiveMessageUser(SendLiveMessageUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendLiveMessageUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendLiveMessageUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendLiveMessageUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of SendMessageToGroup  SendMessageToGroupRequest
     * @return SendMessageToGroupResponse
     */
    @Override
    public CompletableFuture<SendMessageToGroupResponse> sendMessageToGroup(SendMessageToGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendMessageToGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendMessageToGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendMessageToGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of SendMessageToGroupUsers  SendMessageToGroupUsersRequest
     * @return SendMessageToGroupUsersResponse
     */
    @Override
    public CompletableFuture<SendMessageToGroupUsersResponse> sendMessageToGroupUsers(SendMessageToGroupUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendMessageToGroupUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendMessageToGroupUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendMessageToGroupUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to configure a channel for the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetCasterChannel  SetCasterChannelRequest
     * @return SetCasterChannelResponse
     */
    @Override
    public CompletableFuture<SetCasterChannelResponse> setCasterChannel(SetCasterChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCasterChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCasterChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCasterChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to configure the production studio. This operation completely replaces existing configurations. If you leave a parameter empty, the corresponding configuration is cleared for the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetCasterConfig  SetCasterConfigRequest
     * @return SetCasterConfigResponse
     */
    @Override
    public CompletableFuture<SetCasterConfigResponse> setCasterConfig(SetCasterConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCasterConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCasterConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCasterConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>This operation configures a scene by clearing all previous settings of the scene and applying new settings, including the layout setting, to the scene.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SetCasterSceneConfig  SetCasterSceneConfigRequest
     * @return SetCasterSceneConfigResponse
     */
    @Override
    public CompletableFuture<SetCasterSceneConfigResponse> setCasterSceneConfig(SetCasterSceneConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCasterSceneConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCasterSceneConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCasterSceneConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the domain name, and then call this operation to enable or disable the certificate of a domain name and modify the certificate information.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveDomainCertificate  SetLiveDomainCertificateRequest
     * @return SetLiveDomainCertificateResponse
     */
    @Override
    public CompletableFuture<SetLiveDomainCertificateResponse> setLiveDomainCertificate(SetLiveDomainCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveDomainCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveDomainCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveDomainCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure dual-stream disaster recovery for a streaming domain, which allows you to ingest two streams that have the same name.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveDomainMultiStreamConfig  SetLiveDomainMultiStreamConfigRequest
     * @return SetLiveDomainMultiStreamConfigResponse
     */
    @Override
    public CompletableFuture<SetLiveDomainMultiStreamConfigResponse> setLiveDomainMultiStreamConfig(SetLiveDomainMultiStreamConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveDomainMultiStreamConfig").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveDomainMultiStreamConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveDomainMultiStreamConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetLiveDomainMultiStreamMaster  SetLiveDomainMultiStreamMasterRequest
     * @return SetLiveDomainMultiStreamMasterResponse
     */
    @Override
    public CompletableFuture<SetLiveDomainMultiStreamMasterResponse> setLiveDomainMultiStreamMaster(SetLiveDomainMultiStreamMasterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveDomainMultiStreamMaster").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveDomainMultiStreamMasterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveDomainMultiStreamMasterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetLiveDomainMultiStreamOptimalMode  SetLiveDomainMultiStreamOptimalModeRequest
     * @return SetLiveDomainMultiStreamOptimalModeResponse
     */
    @Override
    public CompletableFuture<SetLiveDomainMultiStreamOptimalModeResponse> setLiveDomainMultiStreamOptimalMode(SetLiveDomainMultiStreamOptimalModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveDomainMultiStreamOptimalMode").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveDomainMultiStreamOptimalModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveDomainMultiStreamOptimalModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Obtain the accelerated domain name, and then call this operation to set or modify the domain name configurations in the canary release environment. For more information, see <strong>Format of the Functions parameter</strong>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SetLiveDomainStagingConfig  SetLiveDomainStagingConfigRequest
     * @return SetLiveDomainStagingConfigResponse
     */
    @Override
    public CompletableFuture<SetLiveDomainStagingConfigResponse> setLiveDomainStagingConfig(SetLiveDomainStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveDomainStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveDomainStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveDomainStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the SetLiveEdgeTransfer operation to configure edge stream relay. The configuration takes effect for ingested streams that start after edge stream relay is configured. The following table describes the scenarios in which edge stream relay takes effect or not.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Scenario</th>
     * <th>Analysis</th>
     * <th>Result</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1\. You ingest a stream before you call the SetLiveEdgeTransfer operation.</td>
     * <td>The configuration of edge stream relay is not available.</td>
     * <td>The ingested stream is not affected by your call of the SetLiveEdgeTransfer operation. Edge stream relay does not take effect.</td>
     * </tr>
     * <tr>
     * <td>2\. You disconnect an ingested stream that started before you called the SetLiveEdgeTransfer operation, and then resume the ingested stream.</td>
     * <td>The configuration of edge stream relay is available.</td>
     * <td>Edge stream relay takes effect for the resumed ingested stream based on the configuration.</td>
     * </tr>
     * <tr>
     * <td>3\. You ingest a stream after you call the SetLiveEdgeTransfer operation.</td>
     * <td>The configuration of edge stream relay is available.</td>
     * <td>Edge stream relay takes effect for the ingested stream based on the configuration.</td>
     * </tr>
     * </tbody></table>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveEdgeTransfer  SetLiveEdgeTransferRequest
     * @return SetLiveEdgeTransferResponse
     */
    @Override
    public CompletableFuture<SetLiveEdgeTransferResponse> setLiveEdgeTransfer(SetLiveEdgeTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveEdgeTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveEdgeTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveEdgeTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure triggered stream pulling. The configuration lets ApsaraVideo Live automatically pull live streams from the origin server when the origin server starts to play live streams.</p>
     * <blockquote>
     * <p> The IPv6 protocol is not supported.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveLazyPullStreamInfoConfig  SetLiveLazyPullStreamInfoConfigRequest
     * @return SetLiveLazyPullStreamInfoConfigResponse
     */
    @Override
    public CompletableFuture<SetLiveLazyPullStreamInfoConfigResponse> setLiveLazyPullStreamInfoConfig(SetLiveLazyPullStreamInfoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveLazyPullStreamInfoConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveLazyPullStreamInfoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveLazyPullStreamInfoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can call this operation to configure custom SEI for a mixed-stream relay task.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveMpuTaskSei  SetLiveMpuTaskSeiRequest
     * @return SetLiveMpuTaskSeiResponse
     */
    @Override
    public CompletableFuture<SetLiveMpuTaskSeiResponse> setLiveMpuTaskSei(SetLiveMpuTaskSeiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveMpuTaskSei").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveMpuTaskSeiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveMpuTaskSeiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can configure up to 200 stream-level region blocking rules for a domain name. If there are rules in which the same application name and the same stream name are specified, the rule that is updated the most recently takes effect.</p>
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveStreamBlock  SetLiveStreamBlockRequest
     * @return SetLiveStreamBlockResponse
     */
    @Override
    public CompletableFuture<SetLiveStreamBlockResponse> setLiveStreamBlock(SetLiveStreamBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveStreamBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveStreamBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveStreamBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to configure the latency of a streaming domain.</p>
     * <ul>
     * <li>Because an integer number of groups of pictures (GOPs) are cached, the latency is not less than the GOP size. The actual latency is calculated based on the GOP size. For example, if RtmpDelay is set to 4 seconds and the GOP size is 2 seconds, the minimum latency is 2 seconds (4 seconds minus 2 seconds) and the maximum latency is 6 seconds (4 seconds plus 2 seconds). If the GOP size is greater than the value of RtmpDelay, for example, the GOP size is 5 seconds and RtmpDelay is set to 4 seconds, the latency ranges from 0 to 9 seconds.</li>
     * <li>Configuration for the latency of an audio-only stream is invalid. By default, the latency is close to 0.</li>
     * <li>For HTTP Live Streaming (HLS)-based playback, the segment size equals the latency divided by 3. Round the value down to the nearest integer. The value cannot be less than 1 second. Then, calculate the maximum number of segments. If the segment size is greater than or equal to 3 seconds, the maximum number of segments is 4. Otherwise, the maximum number of segments is 6.</li>
     * <li>The actual HLS segment size is not smaller than the GOP size.</li>
     * <li>The latency of HLS-based playback equals the configured segment size times 3.</li>
     * <li>If you do not call this operation, the default latency is 2 seconds for Real-Time Messaging Protocol (RTMP)-based playback and 4 seconds for Flash Video (FLV)-based playback. By default, the size of an HLS segment is 5 seconds. In this case, the latency is 15 seconds and the maximum number of segments is 6.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveStreamDelayConfig  SetLiveStreamDelayConfigRequest
     * @return SetLiveStreamDelayConfigResponse
     */
    @Override
    public CompletableFuture<SetLiveStreamDelayConfigResponse> setLiveStreamDelayConfig(SetLiveStreamDelayConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveStreamDelayConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveStreamDelayConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveStreamDelayConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to specify multiple URLs to prefetch at a time. You can specify up to 100 URLs in a request.</p>
     * <ul>
     * <li>URLs in the HTTP Live Steaming (HLS) format are not supported.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveStreamPreloadTasks  SetLiveStreamPreloadTasksRequest
     * @return SetLiveStreamPreloadTasksResponse
     */
    @Override
    public CompletableFuture<SetLiveStreamPreloadTasksResponse> setLiveStreamPreloadTasks(SetLiveStreamPreloadTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveStreamPreloadTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveStreamPreloadTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveStreamPreloadTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to configure the callback URL and authentication information of an ingest domain.</p>
     * <ul>
     * <li>If you configure callbacks for stream ingest status, you can receive callback notifications about successful or interrupted stream ingest in a timely manner. For more information, see <a href="https://help.aliyun.com/document_detail/54787.html">Format of stream ingest callbacks</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveStreamsNotifyUrlConfig  SetLiveStreamsNotifyUrlConfigRequest
     * @return SetLiveStreamsNotifyUrlConfigResponse
     */
    @Override
    public CompletableFuture<SetLiveStreamsNotifyUrlConfigResponse> setLiveStreamsNotifyUrlConfig(SetLiveStreamsNotifyUrlConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetLiveStreamsNotifyUrlConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetLiveStreamsNotifyUrlConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetLiveStreamsNotifyUrlConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Create a production studio in playlist mode, and then call this operation to add the background material. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <ul>
     * <li>You can call this operation to create, update, or delete the background of the episode list. To delete the background, leave the ResourceType, ResourceUrl, and MaterialId parameters empty.<blockquote>
     * </blockquote>
     * </li>
     * <li>When you select media resources from ApsaraVideo VOD, we recommend that you select resources that are stored in hosted OSS buckets. Resources stored in non-hosted OSS buckets have a validity period. Pay attention to the validity if you select resources that are stored in non-hosted OSS buckets.</li>
     * <li>When you add media resources to a production studio, we recommend that you select resources from ApsaraVideo Live and ApsaraVideo VOD. If you add a third-party stream by specifying a streaming URL, there is a possibility that the stream fails to be played. You must pay attention to the quality and validity of the third-party stream.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetShowListBackground  SetShowListBackgroundRequest
     * @return SetShowListBackgroundResponse
     */
    @Override
    public CompletableFuture<SetShowListBackgroundResponse> setShowListBackground(SetShowListBackgroundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetShowListBackground").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetShowListBackgroundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetShowListBackgroundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you configure authentication for snapshot callbacks, you need to specify the callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/2847897.html">AddLiveAppSnapshotConfig</a>.</p>
     * <ul>
     * <li>You can call this operation to configure authentication for snapshot callbacks for a main streaming domain. Make sure that the parameter settings meet the requirements.</li>
     * <li>ApsaraVideo Live allows you to add a specific signature header to each HTTP or HTTPS callback request. This way, the server that receives callback messages can authenticate the signature to prevent illegal or invalid requests. For more information, see <a href="https://help.aliyun.com/document_detail/417349.html">Usage notes for callback authentication</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetSnapshotCallbackAuth  SetSnapshotCallbackAuthRequest
     * @return SetSnapshotCallbackAuthResponse
     */
    @Override
    public CompletableFuture<SetSnapshotCallbackAuthResponse> setSnapshotCallbackAuth(SetSnapshotCallbackAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSnapshotCallbackAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSnapshotCallbackAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSnapshotCallbackAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to start the production studio. If the production studio does not have a PVW scene or a PGM scene, this operation creates and starts such scenes and starts audio and video processing tasks.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartCaster  StartCasterRequest
     * @return StartCasterResponse
     */
    @Override
    public CompletableFuture<StartCasterResponse> startCaster(StartCasterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartCaster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartCasterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartCasterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to start a specified PVW scene.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartCasterScene  StartCasterSceneRequest
     * @return StartCasterSceneResponse
     */
    @Override
    public CompletableFuture<StartCasterSceneResponse> startCasterScene(StartCasterSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartCasterScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartCasterSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartCasterSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to start an edge transcoding task.</p>
     * <ul>
     * <li>To call this operation, make sure that you have the permissions to access the edge transcoding feature and the edge transcoding task that you specify is not started.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartEdgeTranscodeJob  StartEdgeTranscodeJobRequest
     * @return StartEdgeTranscodeJobResponse
     */
    @Override
    public CompletableFuture<StartEdgeTranscodeJobResponse> startEdgeTranscodeJob(StartEdgeTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartEdgeTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartEdgeTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartEdgeTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation does not work if the Alibaba Cloud account to which the domain name belongs has overdue payments or the domain name is invalid.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartLiveDomain  StartLiveDomainRequest
     * @return StartLiveDomainResponse
     */
    @Override
    public CompletableFuture<StartLiveDomainResponse> startLiveDomain(StartLiveDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartLiveDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartLiveDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartLiveDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>By default, you can create up to 200 single-stream relay tasks and up to 40 mixed-stream relay tasks for an application. To increase the quota, <a href="https://smartservice.console.aliyun.com/service/create-ticket">submit a ticket</a>.</p>
     * <h3><a href="#"></a>Lifecycle of a stream relay task</h3>
     * <p><strong>Start</strong></p>
     * <ul>
     * <li>Call the StartLiveMPUTask operation to create a task.<ul>
     * <li>If no user joins the channel, an error indicating that the channel does not exist is returned.</li>
     * <li>Stream relay is not performed if no stream is ingested. In this case, no relayed stream is available for playback.</li>
     * <li>If the task is in the mixed-stream relay mode, make sure that at least one user is ingesting a stream, which can be relayed for playback. A black screen is displayed in the pane of a user who is not ingesting a stream.</li>
     * </ul>
     * </li>
     * <li>We recommend that you record the task status, task mode, and task parameters on your business server.<ul>
     * <li>Task status: started or stopped.</li>
     * <li>Task mode: single-stream relay or mixed-stream relay.</li>
     * <li>Task parameters: the latest input parameters. For example, after your call of the UpdateLiveMPUTask operation is successful, record the task parameters, which are the latest.</li>
     * </ul>
     * </li>
     * <li>In co-streaming or battle scenarios, the task is in the mixed-stream relay mode. If the streamer leaves the channel due to exceptions and re-joins the channel, you can directly call the StartLiveMPUTask operation on your business server to start stream relay based on the recorded task parameters.<ul>
     * <li>If the task has not been automatically cleared by the system, the task is directly started.</li>
     * <li>If the task has not been automatically cleared by the system, a message indicating that <strong>the task already exists</strong> is returned.
     * <strong>End</strong></li>
     * </ul>
     * </li>
     * <li>After the streamer leaves the channel, you need to call the <a href="https://help.aliyun.com/document_detail/2362742.html">StopLiveMPUTask</a> operation to stop the task.</li>
     * <li>If all users specified in the task have left the channel, but you do not call the StopLiveMPUTask operation, the system stops the task in 2 minutes.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartLiveMPUTask  StartLiveMPUTaskRequest
     * @return StartLiveMPUTaskResponse
     */
    @Override
    public CompletableFuture<StartLiveMPUTaskResponse> startLiveMPUTask(StartLiveMPUTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartLiveMPUTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartLiveMPUTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartLiveMPUTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation to create a monitoring session, obtain the value of the response parameter <strong>MonitorId</strong>, and then start live monitoring.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartLiveStreamMonitor  StartLiveStreamMonitorRequest
     * @return StartLiveStreamMonitorResponse
     */
    @Override
    public CompletableFuture<StartLiveStreamMonitorResponse> startLiveStreamMonitor(StartLiveStreamMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartLiveStreamMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartLiveStreamMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartLiveStreamMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add episodes to an episode list and then call this operation to start playing the episode list.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartPlaylist  StartPlaylistRequest
     * @return StartPlaylistResponse
     */
    @Override
    public CompletableFuture<StartPlaylistResponse> startPlaylist(StartPlaylistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartPlaylist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartPlaylistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartPlaylistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartRtcCloudRecording  StartRtcCloudRecordingRequest
     * @return StartRtcCloudRecordingResponse
     */
    @Override
    public CompletableFuture<StartRtcCloudRecordingResponse> startRtcCloudRecording(StartRtcCloudRecordingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartRtcCloudRecording").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartRtcCloudRecordingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartRtcCloudRecordingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and call this operation to stop the production studio. When a production studio is stopped, its PVW and PGM scenes are stopped.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopCaster  StopCasterRequest
     * @return StopCasterResponse
     */
    @Override
    public CompletableFuture<StopCasterResponse> stopCaster(StopCasterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopCaster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopCasterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopCasterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage note</h2>
     * <p>This operation is only applicable to the PVW scenes.</p>
     * 
     * @param request the request parameters of StopCasterScene  StopCasterSceneRequest
     * @return StopCasterSceneResponse
     */
    @Override
    public CompletableFuture<StopCasterSceneResponse> stopCasterScene(StopCasterSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopCasterScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopCasterSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopCasterSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to stop an edge transcoding task.</p>
     * <ul>
     * <li>To call this operation, make sure that you have the permissions to access the edge transcoding feature and the edge transcoding task that you specify is running.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopEdgeTranscodeJob  StopEdgeTranscodeJobRequest
     * @return StopEdgeTranscodeJobResponse
     */
    @Override
    public CompletableFuture<StopEdgeTranscodeJobResponse> stopEdgeTranscodeJob(StopEdgeTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopEdgeTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopEdgeTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopEdgeTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you disable a domain name, the information about the domain name is retained. ApsaraVideo Live automatically reroutes all requests that are destined for the domain name to the origin.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopLiveDomain  StopLiveDomainRequest
     * @return StopLiveDomainResponse
     */
    @Override
    public CompletableFuture<StopLiveDomainResponse> stopLiveDomain(StopLiveDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopLiveDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLiveDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLiveDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Make sure that a mixed-stream relay task is started before you call this operation. You can call the <a href="https://help.aliyun.com/document_detail/2848199.html">StartLiveMPUTask</a> operation to start a mixed-stream relay task.</p>
     * <ul>
     * <li>If a mixed-stream relay task becomes abnormal, the task is automatically stopped 2 minutes after the last person leaves the channel. In this case, you do not need to call the StopLiveMPUTask operation. If you need to resume a mixed-stream relay task that is stopped, call the <a href="https://help.aliyun.com/document_detail/2848199.html">StartLiveMPUTask</a> operation again.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopLiveMPUTask  StopLiveMPUTaskRequest
     * @return StopLiveMPUTaskResponse
     */
    @Override
    public CompletableFuture<StopLiveMPUTaskResponse> stopLiveMPUTask(StopLiveMPUTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopLiveMPUTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLiveMPUTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLiveMPUTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to stop a pulled-stream relay task.</p>
     * <ul>
     * <li>You can stop a task that is running (even if the task is in an abnormal retry state). You cannot stop a task that is not running.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopLivePullToPush  StopLivePullToPushRequest
     * @return StopLivePullToPushResponse
     */
    @Override
    public CompletableFuture<StopLivePullToPushResponse> stopLivePullToPush(StopLivePullToPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopLivePullToPush").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLivePullToPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLivePullToPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to stop live monitoring, make sure that live monitoring is started. You can call the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation to create a monitoring session, obtain the value of the response parameter <strong>MonitorId</strong>, and then start live monitoring.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopLiveStreamMonitor  StopLiveStreamMonitorRequest
     * @return StopLiveStreamMonitorResponse
     */
    @Override
    public CompletableFuture<StopLiveStreamMonitorResponse> stopLiveStreamMonitor(StopLiveStreamMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopLiveStreamMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLiveStreamMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLiveStreamMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add episodes to an episode list and then call this operation to stop playing the episode list.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopPlaylist  StopPlaylistRequest
     * @return StopPlaylistResponse
     */
    @Override
    public CompletableFuture<StopPlaylistResponse> stopPlaylist(StopPlaylistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopPlaylist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopPlaylistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopPlaylistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopRtcAsrTask  StopRtcAsrTaskRequest
     * @return StopRtcAsrTaskResponse
     */
    @Override
    public CompletableFuture<StopRtcAsrTaskResponse> stopRtcAsrTask(StopRtcAsrTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopRtcAsrTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopRtcAsrTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopRtcAsrTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopRtcCloudRecording  StopRtcCloudRecordingRequest
     * @return StopRtcCloudRecordingResponse
     */
    @Override
    public CompletableFuture<StopRtcCloudRecordingResponse> stopRtcCloudRecording(StopRtcCloudRecordingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopRtcCloudRecording").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopRtcCloudRecordingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopRtcCloudRecordingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The key of the tag. Valid values of N: <strong>1 to 20</strong>.</p>
     * 
     * @param request the request parameters of TagLiveResources  TagLiveResourcesRequest
     * @return TagLiveResourcesResponse
     */
    @Override
    public CompletableFuture<TagLiveResourcesResponse> tagLiveResources(TagLiveResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagLiveResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagLiveResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagLiveResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnTagLiveResources  UnTagLiveResourcesRequest
     * @return UnTagLiveResourcesResponse
     */
    @Override
    public CompletableFuture<UnTagLiveResourcesResponse> unTagLiveResources(UnTagLiveResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnTagLiveResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnTagLiveResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnTagLiveResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <ul>
     * <li>If a user was muted by calling the AddLiveMessageGroupBand operation, the user remains muted even after you call the UnbanLiveMessageGroup operation.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UnbanLiveMessageGroup  UnbanLiveMessageGroupRequest
     * @return UnbanLiveMessageGroupResponse
     */
    @Override
    public CompletableFuture<UnbanLiveMessageGroupResponse> unbanLiveMessageGroup(UnbanLiveMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbanLiveMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbanLiveMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbanLiveMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>To call this operation to change the resource group to which a production studio belongs, you must have access permissions on the original resource group and the destination resource group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateCasterResourceGroup  UpdateCasterResourceGroupRequest
     * @return UpdateCasterResourceGroupResponse
     */
    @Override
    public CompletableFuture<UpdateCasterResourceGroupResponse> updateCasterResourceGroup(UpdateCasterResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCasterResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCasterResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCasterResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to modify the audio configurations of a scene in the production studio. This operation supports the audio mixing mode and the audio follows video (AFV) mode.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateCasterSceneAudio  UpdateCasterSceneAudioRequest
     * @return UpdateCasterSceneAudioResponse
     */
    @Override
    public CompletableFuture<UpdateCasterSceneAudioResponse> updateCasterSceneAudio(UpdateCasterSceneAudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCasterSceneAudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCasterSceneAudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCasterSceneAudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a scene, including the layout, without invalidating the previous configurations. This operation is more efficient than the SetCasterSceneConfig operation.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateCasterSceneConfig  UpdateCasterSceneConfigRequest
     * @return UpdateCasterSceneConfigResponse
     */
    @Override
    public CompletableFuture<UpdateCasterSceneConfigResponse> updateCasterSceneConfig(UpdateCasterSceneConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCasterSceneConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCasterSceneConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCasterSceneConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following types of custom transcoding templates:</p>
     * <ul>
     * <li>h264: custom H.264 standard transcoding.</li>
     * <li>h264-nbhd: custom H.264 Narrowband HD™ transcoding.</li>
     * <li>h265: custom H.265 standard transcoding.</li>
     * <li>h265-nbhd: custom H.265 Narrowband HD™ transcoding.</li>
     * <li>audio: audio-only transcoding.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account.</p>
     * 
     * @param request the request parameters of UpdateCustomLiveStreamTranscode  UpdateCustomLiveStreamTranscodeRequest
     * @return UpdateCustomLiveStreamTranscodeResponse
     */
    @Override
    public CompletableFuture<UpdateCustomLiveStreamTranscodeResponse> updateCustomLiveStreamTranscode(UpdateCustomLiveStreamTranscodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomLiveStreamTranscode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomLiveStreamTranscodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomLiveStreamTranscodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update an edge transcoding task.</p>
     * <ul>
     * <li>To call this operation, make sure that you have the permissions to access the edge transcoding feature and the edge transcoding task that you specify is not started.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateEdgeTranscodeJob  UpdateEdgeTranscodeJobRequest
     * @return UpdateEdgeTranscodeJobResponse
     */
    @Override
    public CompletableFuture<UpdateEdgeTranscodeJobResponse> updateEdgeTranscodeJob(UpdateEdgeTranscodeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEdgeTranscodeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEdgeTranscodeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEdgeTranscodeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848209.html">CreateEventSub</a> operation to create a callback that is used to subscribe to channel or user events.</p>
     * <ul>
     * <li>An existing channel that you specify in this operation still uses its original callback configuration. The updated configuration can apply to the channel only if you restart the channel after it is closed for longer than 20 minutes.</li>
     * <li>If you only want to update specific parameters, you must also specify the other required parameters with their original values.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateEventSub  UpdateEventSubRequest
     * @return UpdateEventSubResponse
     */
    @Override
    public CompletableFuture<UpdateEventSubResponse> updateEventSub(UpdateEventSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEventSub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEventSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEventSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the parameters of a specified subtitle rule.</p>
     * <blockquote>
     * <p> The live subtitles feature is in invitational preview. You can add up to 300 subtitle templates.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveAIProduceRules  UpdateLiveAIProduceRulesRequest
     * @return UpdateLiveAIProduceRulesResponse
     */
    @Override
    public CompletableFuture<UpdateLiveAIProduceRulesResponse> updateLiveAIProduceRules(UpdateLiveAIProduceRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveAIProduceRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveAIProduceRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveAIProduceRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLiveAISubtitle  UpdateLiveAISubtitleRequest
     * @return UpdateLiveAISubtitleResponse
     */
    @Override
    public CompletableFuture<UpdateLiveAISubtitleResponse> updateLiveAISubtitle(UpdateLiveAISubtitleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveAISubtitle").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveAISubtitleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveAISubtitleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to update a recording configuration.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveAppRecordConfig  UpdateLiveAppRecordConfigRequest
     * @return UpdateLiveAppRecordConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveAppRecordConfigResponse> updateLiveAppRecordConfig(UpdateLiveAppRecordConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveAppRecordConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveAppRecordConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveAppRecordConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a snapshot configuration of a streaming domain. The captured snapshots are stored in OSS. The modification takes effect after you restart stream ingest.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveAppSnapshotConfig  UpdateLiveAppSnapshotConfigRequest
     * @return UpdateLiveAppSnapshotConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveAppSnapshotConfigResponse> updateLiveAppSnapshotConfig(UpdateLiveAppSnapshotConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveAppSnapshotConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveAppSnapshotConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveAppSnapshotConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to modify an audio moderation configuration.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveAudioAuditConfig  UpdateLiveAudioAuditConfigRequest
     * @return UpdateLiveAudioAuditConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveAudioAuditConfigResponse> updateLiveAudioAuditConfig(UpdateLiveAudioAuditConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveAudioAuditConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveAudioAuditConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveAudioAuditConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLiveAudioAuditNotifyConfig  UpdateLiveAudioAuditNotifyConfigRequest
     * @return UpdateLiveAudioAuditNotifyConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveAudioAuditNotifyConfigResponse> updateLiveAudioAuditNotifyConfig(UpdateLiveAudioAuditNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveAudioAuditNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveAudioAuditNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveAudioAuditNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify only the <strong>time-related</strong> parameters, including TransferArgs, StartTime, and EndTime.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveCenterTransfer  UpdateLiveCenterTransferRequest
     * @return UpdateLiveCenterTransferResponse
     */
    @Override
    public CompletableFuture<UpdateLiveCenterTransferResponse> updateLiveCenterTransfer(UpdateLiveCenterTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveCenterTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveCenterTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveCenterTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateLiveDelayConfig  UpdateLiveDelayConfigRequest
     * @return UpdateLiveDelayConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveDelayConfigResponse> updateLiveDelayConfig(UpdateLiveDelayConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveDelayConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveDelayConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveDelayConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to modify the configuration of callbacks for video moderation results.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveDetectNotifyConfig  UpdateLiveDetectNotifyConfigRequest
     * @return UpdateLiveDetectNotifyConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveDetectNotifyConfigResponse> updateLiveDetectNotifyConfig(UpdateLiveDetectNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveDetectNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveDetectNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveDetectNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Make sure that a mixed-stream relay task is created before you call this operation. You can call the <a href="https://help.aliyun.com/document_detail/2848199.html">StartLiveMPUTask</a> operation to create a mixed-stream relay task.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveMPUTask  UpdateLiveMPUTaskRequest
     * @return UpdateLiveMPUTaskResponse
     */
    @Override
    public CompletableFuture<UpdateLiveMPUTaskResponse> updateLiveMPUTask(UpdateLiveMPUTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveMPUTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveMPUTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveMPUTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update a live stream encapsulation configuration. The update takes effect only after you re-ingest the stream.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 300 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLivePackageConfig  UpdateLivePackageConfigRequest
     * @return UpdateLivePackageConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLivePackageConfigResponse> updateLivePackageConfig(UpdateLivePackageConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLivePackageConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLivePackageConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLivePackageConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable to regular stream pulling. You can call this operation to modify the stream pulling settings of a live stream, including the origin URL, start time, and end time.</p>
     * <blockquote>
     * <p> After this operation is complete, ApsaraVideo Live uses the updated settings for regular stream pulling. Make sure that the modification does not affect your business.</p>
     * </blockquote>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLivePullStreamInfoConfig  UpdateLivePullStreamInfoConfigRequest
     * @return UpdateLivePullStreamInfoConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLivePullStreamInfoConfigResponse> updateLivePullStreamInfoConfig(UpdateLivePullStreamInfoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLivePullStreamInfoConfig").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLivePullStreamInfoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLivePullStreamInfoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update a pulled-stream relay task.</p>
     * <ul>
     * <li>As long as the specified start time of a task has not been reached, you can modify the SourceType, Region, and DstUrl parameters of the task.</li>
     * <li>If a task is running (even if the task is in an abnormal retry state), you can modify only the CallbackUrl and RepeatTime parameters of the task. The update takes effect immediately.</li>
     * <li>If a task is stopped, you can modify all parameters of the task except SourceType, Region, and DstUrl.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLivePullToPush  UpdateLivePullToPushRequest
     * @return UpdateLivePullToPushResponse
     */
    @Override
    public CompletableFuture<UpdateLivePullToPushResponse> updateLivePullToPush(UpdateLivePullToPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLivePullToPush").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLivePullToPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLivePullToPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the following settings:</p>
     * <ul>
     * <li>The callback URL that is used to receive notifications about recording events and status. For more information, see <a href="https://help.aliyun.com/document_detail/55016.html">Recording event callbacks</a>.</li>
     * <li>The callback URL for on-demand recordings. For more information, see <a href="https://help.aliyun.com/document_detail/85910.html">On-demand recording callbacks</a>.</li>
     * <li>The setting that specifies whether to enable callbacks for recording status.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveRecordNotifyConfig  UpdateLiveRecordNotifyConfigRequest
     * @return UpdateLiveRecordNotifyConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveRecordNotifyConfigResponse> updateLiveRecordNotifyConfig(UpdateLiveRecordNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveRecordNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveRecordNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveRecordNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveRecordVodConfig  UpdateLiveRecordVodConfigRequest
     * @return UpdateLiveRecordVodConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveRecordVodConfigResponse> updateLiveRecordVodConfig(UpdateLiveRecordVodConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveRecordVodConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveRecordVodConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveRecordVodConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Obtain the main streaming domain, and then call this operation to modify a video moderation configuration.</p>
     * <ul>
     * <li>Only some live centers support the content moderation feature. For more information, see <a href="https://help.aliyun.com/document_detail/193730.html">Supported regions</a>.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveSnapshotDetectPornConfig  UpdateLiveSnapshotDetectPornConfigRequest
     * @return UpdateLiveSnapshotDetectPornConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveSnapshotDetectPornConfigResponse> updateLiveSnapshotDetectPornConfig(UpdateLiveSnapshotDetectPornConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveSnapshotDetectPornConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveSnapshotDetectPornConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveSnapshotDetectPornConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveSnapshotNotifyConfig  UpdateLiveSnapshotNotifyConfigRequest
     * @return UpdateLiveSnapshotNotifyConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLiveSnapshotNotifyConfigResponse> updateLiveSnapshotNotifyConfig(UpdateLiveSnapshotNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveSnapshotNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveSnapshotNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveSnapshotNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the configurations of a monitoring session. The updates that you make to the input source configurations when the monitoring session is in the Running state immediately take effect.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveStreamMonitor  UpdateLiveStreamMonitorRequest
     * @return UpdateLiveStreamMonitorResponse
     */
    @Override
    public CompletableFuture<UpdateLiveStreamMonitorResponse> updateLiveStreamMonitor(UpdateLiveStreamMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveStreamMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveStreamMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveStreamMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must obtain the customer master key (CMK) in Key Management Service (KMS) before you call this operation to update a transcoding configuration. Only standard transcoding templates and Narrowband HD™ transcoding templates are supported for this operation.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * 
     * @param request the request parameters of UpdateLiveStreamTranscode  UpdateLiveStreamTranscodeRequest
     * @return UpdateLiveStreamTranscodeResponse
     */
    @Override
    public CompletableFuture<UpdateLiveStreamTranscodeResponse> updateLiveStreamTranscode(UpdateLiveStreamTranscodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveStreamTranscode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveStreamTranscodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveStreamTranscodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to modify the parameters of a watermark template with a specified ID.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of UpdateLiveStreamWatermark  UpdateLiveStreamWatermarkRequest
     * @return UpdateLiveStreamWatermarkResponse
     */
    @Override
    public CompletableFuture<UpdateLiveStreamWatermarkResponse> updateLiveStreamWatermark(UpdateLiveStreamWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveStreamWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveStreamWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveStreamWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to modify the parameters of a watermark rule with a specified ID.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveStreamWatermarkRule  UpdateLiveStreamWatermarkRuleRequest
     * @return UpdateLiveStreamWatermarkRuleResponse
     */
    @Override
    public CompletableFuture<UpdateLiveStreamWatermarkRuleResponse> updateLiveStreamWatermarkRule(UpdateLiveStreamWatermarkRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLiveStreamWatermarkRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLiveStreamWatermarkRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLiveStreamWatermarkRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of UpdateMessageApp  UpdateMessageAppRequest
     * @return UpdateMessageAppResponse
     */
    @Override
    public CompletableFuture<UpdateMessageAppResponse> updateMessageApp(UpdateMessageAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMessageApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMessageAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMessageAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of UpdateMessageGroup  UpdateMessageGroupRequest
     * @return UpdateMessageGroupResponse
     */
    @Override
    public CompletableFuture<UpdateMessageGroupResponse> updateMessageGroup(UpdateMessageGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMessageGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMessageGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMessageGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update a stream mixing task. This operation allows you to modify the input sources and layout, but not other parameters such as the output resolution.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateMixStream  UpdateMixStreamRequest
     * @return UpdateMixStreamResponse
     */
    @Override
    public CompletableFuture<UpdateMixStreamResponse> updateMixStream(UpdateMixStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMixStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMixStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMixStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRtcCloudRecording  UpdateRtcCloudRecordingRequest
     * @return UpdateRtcCloudRecordingResponse
     */
    @Override
    public CompletableFuture<UpdateRtcCloudRecordingResponse> updateRtcCloudRecording(UpdateRtcCloudRecordingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRtcCloudRecording").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRtcCloudRecordingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRtcCloudRecordingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update a subscription to mixed-stream relay events. You can modify parameters such as the callback URL and channel IDs.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you have called the CreateRtcMPUEventSub operation to create the subscription.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateRtcMPUEventSub  UpdateRtcMPUEventSubRequest
     * @return UpdateRtcMPUEventSubResponse
     */
    @Override
    public CompletableFuture<UpdateRtcMPUEventSubResponse> updateRtcMPUEventSub(UpdateRtcMPUEventSubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRtcMPUEventSub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRtcMPUEventSubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRtcMPUEventSubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following types of custom transcoding templates: h264, h264-nbhd, h264-origin, and audio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * 
     * @param request the request parameters of UpdateRtsLiveStreamTranscode  UpdateRtsLiveStreamTranscodeRequest
     * @return UpdateRtsLiveStreamTranscodeResponse
     */
    @Override
    public CompletableFuture<UpdateRtsLiveStreamTranscodeResponse> updateRtsLiveStreamTranscode(UpdateRtsLiveStreamTranscodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRtsLiveStreamTranscode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRtsLiveStreamTranscodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRtsLiveStreamTranscodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of VerifyLiveDomainOwner  VerifyLiveDomainOwnerRequest
     * @return VerifyLiveDomainOwnerResponse
     */
    @Override
    public CompletableFuture<VerifyLiveDomainOwnerResponse> verifyLiveDomainOwner(VerifyLiveDomainOwnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyLiveDomainOwner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyLiveDomainOwnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyLiveDomainOwnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
