// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.live20161101.models.*;
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
     * <b>description</b> :
     * <p>Before you call this operation to add a component to a production studio, you must first create the production studio and learn about the production studio layouts. You can call this operation to add three types of components: image, text, and subtitle. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterComponent  AddCasterComponentRequest
     * @return AddCasterComponentResponse
     */
    CompletableFuture<AddCasterComponentResponse> addCasterComponent(AddCasterComponentRequest request);

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
    CompletableFuture<AddCasterEpisodeResponse> addCasterEpisode(AddCasterEpisodeRequest request);

    /**
     * <b>description</b> :
     * <p>You need to create a production studio and obtain the production studio configurations before you call this operation to create an episode list in the production studio. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterEpisodeGroup  AddCasterEpisodeGroupRequest
     * @return AddCasterEpisodeGroupResponse
     */
    CompletableFuture<AddCasterEpisodeGroupResponse> addCasterEpisodeGroup(AddCasterEpisodeGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You need to create a production studio and add an episode list to the production studio before you call this operation to add information about the episode list in the production studio. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterEpisodeGroupContent  AddCasterEpisodeGroupContentRequest
     * @return AddCasterEpisodeGroupContentResponse
     */
    CompletableFuture<AddCasterEpisodeGroupContentResponse> addCasterEpisodeGroupContent(AddCasterEpisodeGroupContentRequest request);

    /**
     * <b>description</b> :
     * <p>First, create a director desk and add video resources to the director desk, then call this interface to add the director desk layout. To create a director desk using the API, refer to <a href="https://help.aliyun.com/document_detail/69338.html">Create Director Desk</a>.</p>
     * <h2>QPS Limitation</h2>
     * <p>The per-user QPS limit for this interface is 10 times/second. Exceeding this limit will result in API calls being throttled, which may impact your business operations. Please use the API reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitation</a>.</p>
     * 
     * @param request the request parameters of AddCasterLayout  AddCasterLayoutRequest
     * @return AddCasterLayoutResponse
     */
    CompletableFuture<AddCasterLayoutResponse> addCasterLayout(AddCasterLayoutRequest request);

    /**
     * <b>description</b> :
     * <p>Create a production studio, add input sources to the production studio, and then call this operation to add the episode list for carousel playback in the production studio. This operation supports videos and components as episodes. For information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddCasterProgram  AddCasterProgramRequest
     * @return AddCasterProgramResponse
     */
    CompletableFuture<AddCasterProgramResponse> addCasterProgram(AddCasterProgramRequest request);

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
    CompletableFuture<AddCasterVideoResourceResponse> addCasterVideoResource(AddCasterVideoResourceRequest request);

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
    CompletableFuture<AddCustomLiveStreamTranscodeResponse> addCustomLiveStreamTranscode(AddCustomLiveStreamTranscodeRequest request);

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
    CompletableFuture<AddLiveAIProduceRulesResponse> addLiveAIProduceRules(AddLiveAIProduceRulesRequest request);

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
    CompletableFuture<AddLiveAISubtitleResponse> addLiveAISubtitle(AddLiveAISubtitleRequest request);

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
    CompletableFuture<AddLiveAppRecordConfigResponse> addLiveAppRecordConfig(AddLiveAppRecordConfigRequest request);

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
    CompletableFuture<AddLiveAppSnapshotConfigResponse> addLiveAppSnapshotConfig(AddLiveAppSnapshotConfigRequest request);

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
    CompletableFuture<AddLiveAudioAuditConfigResponse> addLiveAudioAuditConfig(AddLiveAudioAuditConfigRequest request);

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
    CompletableFuture<AddLiveAudioAuditNotifyConfigResponse> addLiveAudioAuditNotifyConfig(AddLiveAudioAuditNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveCenterTransfer  AddLiveCenterTransferRequest
     * @return AddLiveCenterTransferResponse
     */
    CompletableFuture<AddLiveCenterTransferResponse> addLiveCenterTransfer(AddLiveCenterTransferRequest request);

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
    CompletableFuture<AddLiveDetectNotifyConfigResponse> addLiveDetectNotifyConfig(AddLiveDetectNotifyConfigRequest request);

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
    CompletableFuture<AddLiveDomainResponse> addLiveDomain(AddLiveDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Call the <a href="https://help.aliyun.com/document_detail/88327.html">AddLiveDomain</a> operation to add a streaming domain and an ingest domain, and then call this operation to create the mapping between the two domain names.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AddLiveDomainMapping  AddLiveDomainMappingRequest
     * @return AddLiveDomainMappingResponse
     */
    CompletableFuture<AddLiveDomainMappingResponse> addLiveDomainMapping(AddLiveDomainMappingRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/88327.html">AddLiveDomain</a> operation to add a main streaming domain and a sub-streaming domain and then call this operation to map the sub-streaming domain to the main streaming domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveDomainPlayMapping  AddLiveDomainPlayMappingRequest
     * @return AddLiveDomainPlayMappingResponse
     */
    CompletableFuture<AddLiveDomainPlayMappingResponse> addLiveDomainPlayMapping(AddLiveDomainPlayMappingRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveMessageGroupBand  AddLiveMessageGroupBandRequest
     * @return AddLiveMessageGroupBandResponse
     */
    CompletableFuture<AddLiveMessageGroupBandResponse> addLiveMessageGroupBand(AddLiveMessageGroupBandRequest request);

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
    CompletableFuture<AddLivePackageConfigResponse> addLivePackageConfig(AddLivePackageConfigRequest request);

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
    CompletableFuture<AddLivePullStreamInfoConfigResponse> addLivePullStreamInfoConfig(AddLivePullStreamInfoConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to configure recording callbacks for a domain name, you can query whether the domain name already has recording callbacks configured. For more information, see <a href="https://help.aliyun.com/document_detail/2847893.html">DescribeLiveRecordNotifyConfig</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveRecordNotifyConfig  AddLiveRecordNotifyConfigRequest
     * @return AddLiveRecordNotifyConfigResponse
     */
    CompletableFuture<AddLiveRecordNotifyConfigResponse> addLiveRecordNotifyConfig(AddLiveRecordNotifyConfigRequest request);

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
    CompletableFuture<AddLiveRecordVodConfigResponse> addLiveRecordVodConfig(AddLiveRecordVodConfigRequest request);

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
    CompletableFuture<AddLiveSnapshotDetectPornConfigResponse> addLiveSnapshotDetectPornConfig(AddLiveSnapshotDetectPornConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS Limit</h3>
     * <p>The QPS limit for this API per user is 30 times/second. Exceeding this limit will result in API calls being throttled, which may impact your business operations. Please use the API reasonably. For more information, please refer to <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitation</a>.</p>
     * 
     * @param request the request parameters of AddLiveSnapshotNotifyConfig  AddLiveSnapshotNotifyConfigRequest
     * @return AddLiveSnapshotNotifyConfigResponse
     */
    CompletableFuture<AddLiveSnapshotNotifyConfigResponse> addLiveSnapshotNotifyConfig(AddLiveSnapshotNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddLiveStreamMerge  AddLiveStreamMergeRequest
     * @return AddLiveStreamMergeResponse
     */
    CompletableFuture<AddLiveStreamMergeResponse> addLiveStreamMerge(AddLiveStreamMergeRequest request);

    /**
     * <b>description</b> :
     * <p>You must obtain the customer master key (CMK) in Key Management Service (KMS) before you call this operation to add transcoding configurations. Only standard transcoding templates and Narrowband HD™ transcoding templates are supported for this operation.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of AddLiveStreamTranscode  AddLiveStreamTranscodeRequest
     * @return AddLiveStreamTranscodeResponse
     */
    CompletableFuture<AddLiveStreamTranscodeResponse> addLiveStreamTranscode(AddLiveStreamTranscodeRequest request);

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
    CompletableFuture<AddLiveStreamWatermarkResponse> addLiveStreamWatermark(AddLiveStreamWatermarkRequest request);

    /**
     * <b>description</b> :
     * <p>After calling the <a href="https://help.aliyun.com/document_detail/469416.html">AddLiveStreamWatermark</a> API to add a watermark template, you can use this interface to add watermark rules. </p>
     * <h2>QPS Limit</h2>
     * <p> The QPS limit for this interface per user is 60 times/second. Exceeding the limit will result in API calls being throttled, which may impact your business. Please use it reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limit</a>.</p>
     * 
     * @param request the request parameters of AddLiveStreamWatermarkRule  AddLiveStreamWatermarkRuleRequest
     * @return AddLiveStreamWatermarkRuleResponse
     */
    CompletableFuture<AddLiveStreamWatermarkRuleResponse> addLiveStreamWatermarkRule(AddLiveStreamWatermarkRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Create a production studio, add a layout and components to the production studio, and then call this operation to add episodes. If no episode list exists in the production studio, this operation creates an episode list for the production studio. For more information about how to create a production studio, see <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddPlaylistItems  AddPlaylistItemsRequest
     * @return AddPlaylistItemsResponse
     */
    CompletableFuture<AddPlaylistItemsResponse> addPlaylistItems(AddPlaylistItemsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to add an RTS transcoding configuration. This operation supports four template types: h264, h264-nbhd, h264-origin, and audio.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of AddRtsLiveStreamTranscode  AddRtsLiveStreamTranscodeRequest
     * @return AddRtsLiveStreamTranscodeResponse
     */
    CompletableFuture<AddRtsLiveStreamTranscodeResponse> addRtsLiveStreamTranscode(AddRtsLiveStreamTranscodeRequest request);

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
    CompletableFuture<AddShowIntoShowListResponse> addShowIntoShowList(AddShowIntoShowListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure a common layout or a studio layout for a virtual studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddStudioLayout  AddStudioLayoutRequest
     * @return AddStudioLayoutResponse
     */
    CompletableFuture<AddStudioLayoutResponse> addStudioLayout(AddStudioLayoutRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the streaming domain, and then call this operation to insert SEI to the transcoded streams. Make sure that the stream name is the name of the source stream. This way, the SEI is inserted to all the transcoded streams.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddTrancodeSEI  AddTrancodeSEIRequest
     * @return AddTrancodeSEIResponse
     */
    CompletableFuture<AddTrancodeSEIResponse> addTrancodeSEI(AddTrancodeSEIRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of BanLiveMessageGroup  BanLiveMessageGroupRequest
     * @return BanLiveMessageGroupResponse
     */
    CompletableFuture<BanLiveMessageGroupResponse> banLiveMessageGroup(BanLiveMessageGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the domain names for which you want to delete the configurations, and then call this operation to delete the configurations of these domain domains at a time.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of BatchDeleteLiveDomainConfigs  BatchDeleteLiveDomainConfigsRequest
     * @return BatchDeleteLiveDomainConfigsResponse
     */
    CompletableFuture<BatchDeleteLiveDomainConfigsResponse> batchDeleteLiveDomainConfigs(BatchDeleteLiveDomainConfigsRequest request);

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
    CompletableFuture<BatchGetOnlineUsersResponse> batchGetOnlineUsers(BatchGetOnlineUsersRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the domain names that you want to configure, and then call this operation to configure the domain names in batches.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of BatchSetLiveDomainConfigs  BatchSetLiveDomainConfigsRequest
     * @return BatchSetLiveDomainConfigsResponse
     */
    CompletableFuture<BatchSetLiveDomainConfigsResponse> batchSetLiveDomainConfigs(BatchSetLiveDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS限制</h2>
     * <p>本接口的单用户QPS限制为100次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。更多信息，请参见<a href="https://help.aliyun.com/document_detail/343507.html">QPS限制</a>。</p>
     * 
     * @param request the request parameters of CancelMuteAllGroupUser  CancelMuteAllGroupUserRequest
     * @return CancelMuteAllGroupUserResponse
     */
    CompletableFuture<CancelMuteAllGroupUserResponse> cancelMuteAllGroupUser(CancelMuteAllGroupUserRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of CancelMuteGroupUser  CancelMuteGroupUserRequest
     * @return CancelMuteGroupUserResponse
     */
    CompletableFuture<CancelMuteGroupUserResponse> cancelMuteGroupUser(CancelMuteGroupUserRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChangeLiveDomainResourceGroup  ChangeLiveDomainResourceGroupRequest
     * @return ChangeLiveDomainResourceGroupResponse
     */
    CompletableFuture<ChangeLiveDomainResourceGroupResponse> changeLiveDomainResourceGroup(ChangeLiveDomainResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CheckLiveMessageUsersInGroup  CheckLiveMessageUsersInGroupRequest
     * @return CheckLiveMessageUsersInGroupResponse
     */
    CompletableFuture<CheckLiveMessageUsersInGroupResponse> checkLiveMessageUsersInGroup(CheckLiveMessageUsersInGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CheckLiveMessageUsersOnline  CheckLiveMessageUsersOnlineRequest
     * @return CheckLiveMessageUsersOnlineResponse
     */
    CompletableFuture<CheckLiveMessageUsersOnlineResponse> checkLiveMessageUsersOnline(CheckLiveMessageUsersOnlineRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the streaming domain, and then call this operation to disable time shifting for the streaming domain or an application or a live stream under the streaming domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CloseLiveShift  CloseLiveShiftRequest
     * @return CloseLiveShiftResponse
     */
    CompletableFuture<CloseLiveShiftResponse> closeLiveShift(CloseLiveShiftRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to duplicate a production studio. This way, a new, identical production studio is created.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CopyCaster  CopyCasterRequest
     * @return CopyCasterResponse
     */
    CompletableFuture<CopyCasterResponse> copyCaster(CopyCasterRequest request);

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
    CompletableFuture<CopyCasterSceneConfigResponse> copyCasterSceneConfig(CopyCasterSceneConfigRequest request);

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
    CompletableFuture<CreateCasterResponse> createCaster(CreateCasterRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation to create a custom template, record the template name. When you call the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation to create a stream mixing task, you can set the MixStreamTemplate parameter to the name of the custom template. This way, you can use the custom template for stream mixing.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateCustomTemplate  CreateCustomTemplateRequest
     * @return CreateCustomTemplateResponse
     */
    CompletableFuture<CreateCustomTemplateResponse> createCustomTemplate(CreateCustomTemplateRequest request);

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
    CompletableFuture<CreateEdgeTranscodeJobResponse> createEdgeTranscodeJob(CreateEdgeTranscodeJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a callback to subscribe to channel or user events. When you create a callback, you can configure parameters such as the callback URL and event type.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateEventSub  CreateEventSubRequest
     * @return CreateEventSubResponse
     */
    CompletableFuture<CreateEventSubResponse> createEventSub(CreateEventSubRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The lightweight virtual studio feature is in invitational preview. You can add up to 300 virtual studio templates.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLiveAIStudio  CreateLiveAIStudioRequest
     * @return CreateLiveAIStudioResponse
     */
    CompletableFuture<CreateLiveAIStudioResponse> createLiveAIStudio(CreateLiveAIStudioRequest request);

    /**
     * <b>description</b> :
     * <p>Stream delay is different from latency caused by streaming protocols. Stream delay is a feature that allows you to delay the playback of a live stream that is processed in the cloud.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLiveDelayConfig  CreateLiveDelayConfigRequest
     * @return CreateLiveDelayConfigResponse
     */
    CompletableFuture<CreateLiveDelayConfigResponse> createLiveDelayConfig(CreateLiveDelayConfigRequest request);

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
    CompletableFuture<CreateLiveMessageAppResponse> createLiveMessageApp(CreateLiveMessageAppRequest request);

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
    CompletableFuture<CreateLiveMessageGroupResponse> createLiveMessageGroup(CreateLiveMessageGroupRequest request);

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
    CompletableFuture<CreateLivePrivateLineResponse> createLivePrivateLine(CreateLivePrivateLineRequest request);

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
    CompletableFuture<CreateLivePullToPushResponse> createLivePullToPush(CreateLivePullToPushRequest request);

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
    CompletableFuture<CreateLiveRealTimeLogDeliveryResponse> createLiveRealTimeLogDelivery(CreateLiveRealTimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a monitoring session. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateLiveStreamMonitor  CreateLiveStreamMonitorRequest
     * @return CreateLiveStreamMonitorResponse
     */
    CompletableFuture<CreateLiveStreamMonitorResponse> createLiveStreamMonitor(CreateLiveStreamMonitorRequest request);

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
    CompletableFuture<CreateLiveStreamRecordIndexFilesResponse> createLiveStreamRecordIndexFiles(CreateLiveStreamRecordIndexFilesRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of CreateMessageApp  CreateMessageAppRequest
     * @return CreateMessageAppResponse
     */
    CompletableFuture<CreateMessageAppResponse> createMessageApp(CreateMessageAppRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of CreateMessageGroup  CreateMessageGroupRequest
     * @return CreateMessageGroupResponse
     */
    CompletableFuture<CreateMessageGroupResponse> createMessageGroup(CreateMessageGroupRequest request);

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
    CompletableFuture<CreateMixStreamResponse> createMixStream(CreateMixStreamRequest request);

    /**
     * @param request the request parameters of CreateRTCWhipStreamAddress  CreateRTCWhipStreamAddressRequest
     * @return CreateRTCWhipStreamAddressResponse
     */
    CompletableFuture<CreateRTCWhipStreamAddressResponse> createRTCWhipStreamAddress(CreateRTCWhipStreamAddressRequest request);

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
    CompletableFuture<CreateRoomRealTimeStreamAddressResponse> createRoomRealTimeStreamAddress(CreateRoomRealTimeStreamAddressRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a live subtitle task that transcribes audio in a live stream to text in real time.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateRtcAsrTask  CreateRtcAsrTaskRequest
     * @return CreateRtcAsrTaskResponse
     */
    CompletableFuture<CreateRtcAsrTaskResponse> createRtcAsrTask(CreateRtcAsrTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a subscription to mixed-stream relay events. You can configure parameters such as the callback URL, application to which you want to subscribe, and channel information when you create a subscription.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateRtcMPUEventSub  CreateRtcMPUEventSubRequest
     * @return CreateRtcMPUEventSubResponse
     */
    CompletableFuture<CreateRtcMPUEventSubResponse> createRtcMPUEventSub(CreateRtcMPUEventSubRequest request);

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
    CompletableFuture<DeleteCasterResponse> deleteCaster(DeleteCasterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to delete a component in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCasterComponent  DeleteCasterComponentRequest
     * @return DeleteCasterComponentResponse
     */
    CompletableFuture<DeleteCasterComponentResponse> deleteCasterComponent(DeleteCasterComponentRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete an episode in a production studio, you must obtain the ID of the production studio and the ID of the episode.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCasterEpisode  DeleteCasterEpisodeRequest
     * @return DeleteCasterEpisodeResponse
     */
    CompletableFuture<DeleteCasterEpisodeResponse> deleteCasterEpisode(DeleteCasterEpisodeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete an episode list in a production studio, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848071.html">AddCasterEpisodeGroup</a> operation to add the episode list in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCasterEpisodeGroup  DeleteCasterEpisodeGroupRequest
     * @return DeleteCasterEpisodeGroupResponse
     */
    CompletableFuture<DeleteCasterEpisodeGroupResponse> deleteCasterEpisodeGroup(DeleteCasterEpisodeGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create a production studio and then call this operation to delete a layout in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteCasterLayout  DeleteCasterLayoutRequest
     * @return DeleteCasterLayoutResponse
     */
    CompletableFuture<DeleteCasterLayoutResponse> deleteCasterLayout(DeleteCasterLayoutRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to delete the episode list for carousel playback in the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCasterProgram  DeleteCasterProgramRequest
     * @return DeleteCasterProgramResponse
     */
    CompletableFuture<DeleteCasterProgramResponse> deleteCasterProgram(DeleteCasterProgramRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete the settings of a scene, such as the component setting, layout setting, or both of them.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteCasterSceneConfig  DeleteCasterSceneConfigRequest
     * @return DeleteCasterSceneConfigResponse
     */
    CompletableFuture<DeleteCasterSceneConfigResponse> deleteCasterSceneConfig(DeleteCasterSceneConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to remove an input source from a production studio, make sure that you have called the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteCasterVideoResource  DeleteCasterVideoResourceRequest
     * @return DeleteCasterVideoResourceResponse
     */
    CompletableFuture<DeleteCasterVideoResourceResponse> deleteCasterVideoResource(DeleteCasterVideoResourceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteChannel  DeleteChannelRequest
     * @return DeleteChannelResponse
     */
    CompletableFuture<DeleteChannelResponse> deleteChannel(DeleteChannelRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the name of the custom stream mixing template that you want to delete, and then call this operation to delete the template.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteCustomTemplate  DeleteCustomTemplateRequest
     * @return DeleteCustomTemplateResponse
     */
    CompletableFuture<DeleteCustomTemplateResponse> deleteCustomTemplate(DeleteCustomTemplateRequest request);

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
    CompletableFuture<DeleteEdgeTranscodeJobResponse> deleteEdgeTranscodeJob(DeleteEdgeTranscodeJobRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848209.html">CreateEventSubscribe</a> operation to create a callback that is used to subscribe to channel or user events.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteEventSub  DeleteEventSubRequest
     * @return DeleteEventSubResponse
     */
    CompletableFuture<DeleteEventSubResponse> deleteEventSub(DeleteEventSubRequest request);

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
    CompletableFuture<DeleteLiveAIProduceRulesResponse> deleteLiveAIProduceRules(DeleteLiveAIProduceRulesRequest request);

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
    CompletableFuture<DeleteLiveAIStudioResponse> deleteLiveAIStudio(DeleteLiveAIStudioRequest request);

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
    CompletableFuture<DeleteLiveAISubtitleResponse> deleteLiveAISubtitle(DeleteLiveAISubtitleRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to delete a recording configuration at the application level.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveAppRecordConfig  DeleteLiveAppRecordConfigRequest
     * @return DeleteLiveAppRecordConfigResponse
     */
    CompletableFuture<DeleteLiveAppRecordConfigResponse> deleteLiveAppRecordConfig(DeleteLiveAppRecordConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete the snapshot configuration for live streams in an application. The deletion takes effect after you restart stream ingest.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveAppSnapshotConfig  DeleteLiveAppSnapshotConfigRequest
     * @return DeleteLiveAppSnapshotConfigResponse
     */
    CompletableFuture<DeleteLiveAppSnapshotConfigResponse> deleteLiveAppSnapshotConfig(DeleteLiveAppSnapshotConfigRequest request);

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
    CompletableFuture<DeleteLiveAudioAuditConfigResponse> deleteLiveAudioAuditConfig(DeleteLiveAudioAuditConfigRequest request);

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
    CompletableFuture<DeleteLiveAudioAuditNotifyConfigResponse> deleteLiveAudioAuditNotifyConfig(DeleteLiveAudioAuditNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveCenterTransfer  DeleteLiveCenterTransferRequest
     * @return DeleteLiveCenterTransferResponse
     */
    CompletableFuture<DeleteLiveCenterTransferResponse> deleteLiveCenterTransfer(DeleteLiveCenterTransferRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveDelayConfig  DeleteLiveDelayConfigRequest
     * @return DeleteLiveDelayConfigResponse
     */
    CompletableFuture<DeleteLiveDelayConfigResponse> deleteLiveDelayConfig(DeleteLiveDelayConfigRequest request);

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
    CompletableFuture<DeleteLiveDetectNotifyConfigResponse> deleteLiveDetectNotifyConfig(DeleteLiveDetectNotifyConfigRequest request);

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
    CompletableFuture<DeleteLiveDomainResponse> deleteLiveDomain(DeleteLiveDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that the streaming domain has been mapped to the ingest domain before you call this operation to delete the mapping. For more information about how to map a streaming domain to an ingest domain, see <a href="https://help.aliyun.com/document_detail/88782.html">AddLiveDomainMapping</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveDomainMapping  DeleteLiveDomainMappingRequest
     * @return DeleteLiveDomainMappingResponse
     */
    CompletableFuture<DeleteLiveDomainMappingResponse> deleteLiveDomainMapping(DeleteLiveDomainMappingRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the mapping between the main streaming domain and the sub-streaming domain is created. For more information about how to call an operation to create the mapping between a main streaming domain and a sub-streaming domain, see <a href="https://help.aliyun.com/document_detail/173091.html">AddLiveDomainPlayMapping</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveDomainPlayMapping  DeleteLiveDomainPlayMappingRequest
     * @return DeleteLiveDomainPlayMappingResponse
     */
    CompletableFuture<DeleteLiveDomainPlayMappingResponse> deleteLiveDomainPlayMapping(DeleteLiveDomainPlayMappingRequest request);

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
    CompletableFuture<DeleteLiveEdgeTransferResponse> deleteLiveEdgeTransfer(DeleteLiveEdgeTransferRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is application to triggered stream pulling. You can call this operation to delete a configuration of triggered stream pulling. If you set the AppName parameter to ali_all_app, configurations of triggered stream pulling for all applications under the domain name are deleted.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveLazyPullStreamInfoConfig  DeleteLiveLazyPullStreamInfoConfigRequest
     * @return DeleteLiveLazyPullStreamInfoConfigResponse
     */
    CompletableFuture<DeleteLiveLazyPullStreamInfoConfigResponse> deleteLiveLazyPullStreamInfoConfig(DeleteLiveLazyPullStreamInfoConfigRequest request);

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
    CompletableFuture<DeleteLiveMessageGroupResponse> deleteLiveMessageGroup(DeleteLiveMessageGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveMessageGroupMessage  DeleteLiveMessageGroupMessageRequest
     * @return DeleteLiveMessageGroupMessageResponse
     */
    CompletableFuture<DeleteLiveMessageGroupMessageResponse> deleteLiveMessageGroupMessage(DeleteLiveMessageGroupMessageRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveMessageUserMessage  DeleteLiveMessageUserMessageRequest
     * @return DeleteLiveMessageUserMessageResponse
     */
    CompletableFuture<DeleteLiveMessageUserMessageResponse> deleteLiveMessageUserMessage(DeleteLiveMessageUserMessageRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a live stream encapsulation configuration. The deletion takes effect after you re-ingest the stream.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 300 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLivePackageConfig  DeleteLivePackageConfigRequest
     * @return DeleteLivePackageConfigResponse
     */
    CompletableFuture<DeleteLivePackageConfigResponse> deleteLivePackageConfig(DeleteLivePackageConfigRequest request);

    /**
     * <b>description</b> :
     * <p>After you unbind a GA instance from an acceleration circuit, your stream ingest and streaming are no longer accelerated by the GA instance. The GA instance still exists. If you want to release the GA instance, delete it in the GA console.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLivePrivateLine  DeleteLivePrivateLineRequest
     * @return DeleteLivePrivateLineResponse
     */
    CompletableFuture<DeleteLivePrivateLineResponse> deleteLivePrivateLine(DeleteLivePrivateLineRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable to regular stream pulling. You can call this operation to delete a configuration of regular stream pulling.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLivePullStreamInfoConfig  DeleteLivePullStreamInfoConfigRequest
     * @return DeleteLivePullStreamInfoConfigResponse
     */
    CompletableFuture<DeleteLivePullStreamInfoConfigResponse> deleteLivePullStreamInfoConfig(DeleteLivePullStreamInfoConfigRequest request);

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
    CompletableFuture<DeleteLivePullToPushResponse> deleteLivePullToPush(DeleteLivePullToPushRequest request);

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
    CompletableFuture<DeleteLiveRealTimeLogLogstoreResponse> deleteLiveRealTimeLogLogstore(DeleteLiveRealTimeLogLogstoreRequest request);

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
    CompletableFuture<DeleteLiveRealtimeLogDeliveryResponse> deleteLiveRealtimeLogDelivery(DeleteLiveRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to delete the configuration of callbacks for live stream recording under the main streaming domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveRecordNotifyConfig  DeleteLiveRecordNotifyConfigRequest
     * @return DeleteLiveRecordNotifyConfigResponse
     */
    CompletableFuture<DeleteLiveRecordNotifyConfigResponse> deleteLiveRecordNotifyConfig(DeleteLiveRecordNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to delete a Live-to-VOD configuration.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveRecordVodConfig  DeleteLiveRecordVodConfigRequest
     * @return DeleteLiveRecordVodConfigResponse
     */
    CompletableFuture<DeleteLiveRecordVodConfigResponse> deleteLiveRecordVodConfig(DeleteLiveRecordVodConfigRequest request);

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
    CompletableFuture<DeleteLiveSnapshotDetectPornConfigResponse> deleteLiveSnapshotDetectPornConfig(DeleteLiveSnapshotDetectPornConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveSnapshotNotifyConfig  DeleteLiveSnapshotNotifyConfigRequest
     * @return DeleteLiveSnapshotNotifyConfigResponse
     */
    CompletableFuture<DeleteLiveSnapshotNotifyConfigResponse> deleteLiveSnapshotNotifyConfig(DeleteLiveSnapshotNotifyConfigRequest request);

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
    CompletableFuture<DeleteLiveSpecificStagingConfigResponse> deleteLiveSpecificStagingConfig(DeleteLiveSpecificStagingConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a configuration of stream-level region blocking.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamBlock  DeleteLiveStreamBlockRequest
     * @return DeleteLiveStreamBlockResponse
     */
    CompletableFuture<DeleteLiveStreamBlockResponse> deleteLiveStreamBlock(DeleteLiveStreamBlockRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamMerge  DeleteLiveStreamMergeRequest
     * @return DeleteLiveStreamMergeResponse
     */
    CompletableFuture<DeleteLiveStreamMergeResponse> deleteLiveStreamMerge(DeleteLiveStreamMergeRequest request);

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
    CompletableFuture<DeleteLiveStreamMonitorResponse> deleteLiveStreamMonitor(DeleteLiveStreamMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamRecordIndexFiles  DeleteLiveStreamRecordIndexFilesRequest
     * @return DeleteLiveStreamRecordIndexFilesResponse
     */
    CompletableFuture<DeleteLiveStreamRecordIndexFilesResponse> deleteLiveStreamRecordIndexFiles(DeleteLiveStreamRecordIndexFilesRequest request);

    /**
     * <b>description</b> :
     * <p>Standard transcoding templates, Narrowband HD™ transcoding templates, and custom transcoding templates are supported for this operation.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamTranscode  DeleteLiveStreamTranscodeRequest
     * @return DeleteLiveStreamTranscodeResponse
     */
    CompletableFuture<DeleteLiveStreamTranscodeResponse> deleteLiveStreamTranscode(DeleteLiveStreamTranscodeRequest request);

    /**
     * <b>description</b> :
     * <p>This interface supports deleting the watermark template with the specified TemplateId for live streaming. </p>
     * <h2>QPS Limitation</h2>
     * <p> The per-user QPS limit for this interface is 60 times/second. Exceeding this limit will result in API throttling, which may impact your business operations. Please use it reasonably. For more information, please refer to <a href="https://help.aliyun.com/document_detail/343507.html">QPS Limitation</a>.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamWatermark  DeleteLiveStreamWatermarkRequest
     * @return DeleteLiveStreamWatermarkResponse
     */
    CompletableFuture<DeleteLiveStreamWatermarkResponse> deleteLiveStreamWatermark(DeleteLiveStreamWatermarkRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a watermark rule with a specified ID.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamWatermarkRule  DeleteLiveStreamWatermarkRuleRequest
     * @return DeleteLiveStreamWatermarkRuleResponse
     */
    CompletableFuture<DeleteLiveStreamWatermarkRuleResponse> deleteLiveStreamWatermarkRule(DeleteLiveStreamWatermarkRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the ingest domain, and then call this operation to delete the callback configuration for stream ingest under the ingest domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteLiveStreamsNotifyUrlConfig  DeleteLiveStreamsNotifyUrlConfigRequest
     * @return DeleteLiveStreamsNotifyUrlConfigResponse
     */
    CompletableFuture<DeleteLiveStreamsNotifyUrlConfigResponse> deleteLiveStreamsNotifyUrlConfig(DeleteLiveStreamsNotifyUrlConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DeleteMessageApp  DeleteMessageAppRequest
     * @return DeleteMessageAppResponse
     */
    CompletableFuture<DeleteMessageAppResponse> deleteMessageApp(DeleteMessageAppRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation to create a stream mixing task and then call this operation to delete the stream mixing task. If you no longer need a mixed stream, be sure to delete it. Mixed streams that are not deleted are continuously ingested.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteMixStream  DeleteMixStreamRequest
     * @return DeleteMixStreamResponse
     */
    CompletableFuture<DeleteMixStreamResponse> deleteMixStream(DeleteMixStreamRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete an episode list, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to create the episode list.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeletePlaylist  DeletePlaylistRequest
     * @return DeletePlaylistResponse
     */
    CompletableFuture<DeletePlaylistResponse> deletePlaylist(DeletePlaylistRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to remove an episode, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add the episode.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeletePlaylistItems  DeletePlaylistItemsRequest
     * @return DeletePlaylistItemsResponse
     */
    CompletableFuture<DeletePlaylistItemsResponse> deletePlaylistItems(DeletePlaylistItemsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteRtcAsrTask  DeleteRtcAsrTaskRequest
     * @return DeleteRtcAsrTaskResponse
     */
    CompletableFuture<DeleteRtcAsrTaskResponse> deleteRtcAsrTask(DeleteRtcAsrTaskRequest request);

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
    CompletableFuture<DeleteRtcMPUEventSubResponse> deleteRtcMPUEventSub(DeleteRtcMPUEventSubRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete the configuration of authentication for snapshot callbacks for a main streaming domain. For an ongoing live stream, the deletion takes effect after you re-ingest the stream. Snapshot callbacks for the stream are no longer authenticated.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteSnapshotCallbackAuth  DeleteSnapshotCallbackAuthRequest
     * @return DeleteSnapshotCallbackAuthResponse
     */
    CompletableFuture<DeleteSnapshotCallbackAuthResponse> deleteSnapshotCallbackAuth(DeleteSnapshotCallbackAuthRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete only snapshots that were captured in the last year.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteSnapshotFiles  DeleteSnapshotFilesRequest
     * @return DeleteSnapshotFilesResponse
     */
    CompletableFuture<DeleteSnapshotFilesResponse> deleteSnapshotFiles(DeleteSnapshotFilesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a layout in a virtual studio. You can delete only one layout in a call.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteStudioLayout  DeleteStudioLayoutRequest
     * @return DeleteStudioLayoutResponse
     */
    CompletableFuture<DeleteStudioLayoutResponse> deleteStudioLayout(DeleteStudioLayoutRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query scheduled tasks that are used to start and stop playing an episode list at specified points in time. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeAutoShowListTasks  DescribeAutoShowListTasksRequest
     * @return DescribeAutoShowListTasksResponse
     */
    CompletableFuture<DescribeAutoShowListTasksResponse> describeAutoShowListTasks(DescribeAutoShowListTasksRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to query the channels of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterChannels  DescribeCasterChannelsRequest
     * @return DescribeCasterChannelsResponse
     */
    CompletableFuture<DescribeCasterChannelsResponse> describeCasterChannels(DescribeCasterChannelsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848030.html">AddCasterComponent</a> operation to add components to a production studio and then call this operation to query the components of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterComponents  DescribeCasterComponentsRequest
     * @return DescribeCasterComponentsResponse
     */
    CompletableFuture<DescribeCasterComponentsResponse> describeCasterComponents(DescribeCasterComponentsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to query the configurations of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterConfig  DescribeCasterConfigRequest
     * @return DescribeCasterConfigResponse
     */
    CompletableFuture<DescribeCasterConfigResponse> describeCasterConfig(DescribeCasterConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query layouts of a production studio. If no layout ID is specified, the operation returns all layouts of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterLayouts  DescribeCasterLayoutsRequest
     * @return DescribeCasterLayoutsResponse
     */
    CompletableFuture<DescribeCasterLayoutsResponse> describeCasterLayouts(DescribeCasterLayoutsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query episodes in the episode list for carousel playback. The supported types of episodes include video resource and component.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterProgram  DescribeCasterProgramRequest
     * @return DescribeCasterProgramResponse
     */
    CompletableFuture<DescribeCasterProgramResponse> describeCasterProgram(DescribeCasterProgramRequest request);

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
    CompletableFuture<DescribeCasterSceneAudioResponse> describeCasterSceneAudio(DescribeCasterSceneAudioRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation to create a production studio and then call this operation to query the scenes of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeCasterScenes  DescribeCasterScenesRequest
     * @return DescribeCasterScenesResponse
     */
    CompletableFuture<DescribeCasterScenesResponse> describeCasterScenes(DescribeCasterScenesRequest request);

    /**
     * <b>description</b> :
     * <p>You must create a production studio before calling this operation to query the information.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 15 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeCasterStreamUrl  DescribeCasterStreamUrlRequest
     * @return DescribeCasterStreamUrlResponse
     */
    CompletableFuture<DescribeCasterStreamUrlResponse> describeCasterStreamUrl(DescribeCasterStreamUrlRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to query the input sources of the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasterVideoResources  DescribeCasterVideoResourcesRequest
     * @return DescribeCasterVideoResourcesResponse
     */
    CompletableFuture<DescribeCasterVideoResourcesResponse> describeCasterVideoResources(DescribeCasterVideoResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848012.html">CreateCaster</a> operation to create a production studio and then call this operation to query the production studio list. The status of a production studio can be idle or streaming.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeCasters  DescribeCastersRequest
     * @return DescribeCastersResponse
     */
    CompletableFuture<DescribeCastersResponse> describeCasters(DescribeCastersRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query online users in a channel. The returned result does not include details about the users.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeChannelParticipants  DescribeChannelParticipantsRequest
     * @return DescribeChannelParticipantsResponse
     */
    CompletableFuture<DescribeChannelParticipantsResponse> describeChannelParticipants(DescribeChannelParticipantsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about online users in a channel, such as the total number of users during live streaming.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeChannelUsers  DescribeChannelUsersRequest
     * @return DescribeChannelUsersResponse
     */
    CompletableFuture<DescribeChannelUsersResponse> describeChannelUsers(DescribeChannelUsersRequest request);

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
    CompletableFuture<DescribeDomainUsageDataResponse> describeDomainUsageData(DescribeDomainUsageDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to obtain domain integrity.</p>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeDomainWithIntegrity  DescribeDomainWithIntegrityRequest
     * @return DescribeDomainWithIntegrityResponse
     */
    CompletableFuture<DescribeDomainWithIntegrityResponse> describeDomainWithIntegrity(DescribeDomainWithIntegrityRequest request);

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
    CompletableFuture<DescribeHlsLiveStreamRealTimeBpsDataResponse> describeHlsLiveStreamRealTimeBpsData(DescribeHlsLiveStreamRealTimeBpsDataRequest request);

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
    CompletableFuture<DescribeLiveAIProduceRulesResponse> describeLiveAIProduceRules(DescribeLiveAIProduceRulesRequest request);

    /**
     * @param request the request parameters of DescribeLiveAIStudio  DescribeLiveAIStudioRequest
     * @return DescribeLiveAIStudioResponse
     */
    CompletableFuture<DescribeLiveAIStudioResponse> describeLiveAIStudio(DescribeLiveAIStudioRequest request);

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
    CompletableFuture<DescribeLiveAISubtitleResponse> describeLiveAISubtitle(DescribeLiveAISubtitleRequest request);

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
    CompletableFuture<DescribeLiveAudioAuditConfigResponse> describeLiveAudioAuditConfig(DescribeLiveAudioAuditConfigRequest request);

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
    CompletableFuture<DescribeLiveAudioAuditNotifyConfigResponse> describeLiveAudioAuditNotifyConfig(DescribeLiveAudioAuditNotifyConfigRequest request);

    /**
     * @param request the request parameters of DescribeLiveCdnDiagnoseInfo  DescribeLiveCdnDiagnoseInfoRequest
     * @return DescribeLiveCdnDiagnoseInfoResponse
     */
    CompletableFuture<DescribeLiveCdnDiagnoseInfoResponse> describeLiveCdnDiagnoseInfo(DescribeLiveCdnDiagnoseInfoRequest request);

    /**
     * <b>description</b> :
     * <p>The time granularity for the returned data is 5 seconds. The maximum time range to query is 3 hours. You can query data in the last 30 days.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveCenterStreamRateData  DescribeLiveCenterStreamRateDataRequest
     * @return DescribeLiveCenterStreamRateDataResponse
     */
    CompletableFuture<DescribeLiveCenterStreamRateDataResponse> describeLiveCenterStreamRateData(DescribeLiveCenterStreamRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveCenterTransfer  DescribeLiveCenterTransferRequest
     * @return DescribeLiveCenterTransferResponse
     */
    CompletableFuture<DescribeLiveCenterTransferResponse> describeLiveCenterTransfer(DescribeLiveCenterTransferRequest request);

    /**
     * <b>description</b> :
     * <p>You can obtain the certificate name on the <a href="https://help.aliyun.com/document_detail/2584962.html">Certificates</a> page of the ApsaraVideo Live console and then call this operation to query the certificate details.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveCertificateDetail  DescribeLiveCertificateDetailRequest
     * @return DescribeLiveCertificateDetailResponse
     */
    CompletableFuture<DescribeLiveCertificateDetailResponse> describeLiveCertificateDetail(DescribeLiveCertificateDetailRequest request);

    /**
     * <b>description</b> :
     * <p>If you specify one or more domain names in the request, the certificates of the domain names are returned. If you do not specify a domain name in the request, all certificates within your Alibaba Cloud account are returned.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveCertificateList  DescribeLiveCertificateListRequest
     * @return DescribeLiveCertificateListResponse
     */
    CompletableFuture<DescribeLiveCertificateListResponse> describeLiveCertificateList(DescribeLiveCertificateListRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDelayConfig  DescribeLiveDelayConfigRequest
     * @return DescribeLiveDelayConfigResponse
     */
    CompletableFuture<DescribeLiveDelayConfigResponse> describeLiveDelayConfig(DescribeLiveDelayConfigRequest request);

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
    CompletableFuture<DescribeLiveDelayedStreamingUsageResponse> describeLiveDelayedStreamingUsage(DescribeLiveDelayedStreamingUsageRequest request);

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
    CompletableFuture<DescribeLiveDetectNotifyConfigResponse> describeLiveDetectNotifyConfig(DescribeLiveDetectNotifyConfigRequest request);

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
    CompletableFuture<DescribeLiveDetectPornDataResponse> describeLiveDetectPornData(DescribeLiveDetectPornDataRequest request);

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
    CompletableFuture<DescribeLiveDomainBpsDataResponse> describeLiveDomainBpsData(DescribeLiveDomainBpsDataRequest request);

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
    CompletableFuture<DescribeLiveDomainBpsDataByLayerResponse> describeLiveDomainBpsDataByLayer(DescribeLiveDomainBpsDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the accelerated domain names that match a certificate.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainByCertificate  DescribeLiveDomainByCertificateRequest
     * @return DescribeLiveDomainByCertificateResponse
     */
    CompletableFuture<DescribeLiveDomainByCertificateResponse> describeLiveDomainByCertificate(DescribeLiveDomainByCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain a domain name, and then call this operation to query certificate information about the domain name.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainCertificateInfo  DescribeLiveDomainCertificateInfoRequest
     * @return DescribeLiveDomainCertificateInfoResponse
     */
    CompletableFuture<DescribeLiveDomainCertificateInfoResponse> describeLiveDomainCertificateInfo(DescribeLiveDomainCertificateInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query multiple configurations at a time.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainConfigs  DescribeLiveDomainConfigsRequest
     * @return DescribeLiveDomainConfigsResponse
     */
    CompletableFuture<DescribeLiveDomainConfigsResponse> describeLiveDomainConfigs(DescribeLiveDomainConfigsRequest request);

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
    CompletableFuture<DescribeLiveDomainDetailResponse> describeLiveDomainDetail(DescribeLiveDomainDetailRequest request);

    /**
     * @param request the request parameters of DescribeLiveDomainEdgeLog  DescribeLiveDomainEdgeLogRequest
     * @return DescribeLiveDomainEdgeLogResponse
     */
    CompletableFuture<DescribeLiveDomainEdgeLogResponse> describeLiveDomainEdgeLog(DescribeLiveDomainEdgeLogRequest request);

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
    CompletableFuture<DescribeLiveDomainFrameRateAndBitRateDataResponse> describeLiveDomainFrameRateAndBitRateData(DescribeLiveDomainFrameRateAndBitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies only to main streaming domains.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainLimit  DescribeLiveDomainLimitRequest
     * @return DescribeLiveDomainLimitResponse
     */
    CompletableFuture<DescribeLiveDomainLimitResponse> describeLiveDomainLimit(DescribeLiveDomainLimitRequest request);

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
    CompletableFuture<DescribeLiveDomainLogResponse> describeLiveDomainLog(DescribeLiveDomainLogRequest request);

    /**
     * @param request the request parameters of DescribeLiveDomainLogExTtl  DescribeLiveDomainLogExTtlRequest
     * @return DescribeLiveDomainLogExTtlResponse
     */
    CompletableFuture<DescribeLiveDomainLogExTtlResponse> describeLiveDomainLogExTtl(DescribeLiveDomainLogExTtlRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the ingest domain, main streaming domain, or sub-streaming domain, and then call this operation to query the mappings of the domain name.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 500 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainMapping  DescribeLiveDomainMappingRequest
     * @return DescribeLiveDomainMappingResponse
     */
    CompletableFuture<DescribeLiveDomainMappingResponse> describeLiveDomainMapping(DescribeLiveDomainMappingRequest request);

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
    CompletableFuture<DescribeLiveDomainMonitoringUsageDataResponse> describeLiveDomainMonitoringUsageData(DescribeLiveDomainMonitoringUsageDataRequest request);

    /**
     * @param request the request parameters of DescribeLiveDomainMultiStreamConfig  DescribeLiveDomainMultiStreamConfigRequest
     * @return DescribeLiveDomainMultiStreamConfigResponse
     */
    CompletableFuture<DescribeLiveDomainMultiStreamConfigResponse> describeLiveDomainMultiStreamConfig(DescribeLiveDomainMultiStreamConfigRequest request);

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
    CompletableFuture<DescribeLiveDomainOnlineUserNumResponse> describeLiveDomainOnlineUserNum(DescribeLiveDomainOnlineUserNumRequest request);

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
    CompletableFuture<DescribeLiveDomainPublishErrorCodeResponse> describeLiveDomainPublishErrorCode(DescribeLiveDomainPublishErrorCodeRequest request);

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
    CompletableFuture<DescribeLiveDomainPushBpsDataResponse> describeLiveDomainPushBpsData(DescribeLiveDomainPushBpsDataRequest request);

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
    CompletableFuture<DescribeLiveDomainPushTrafficDataResponse> describeLiveDomainPushTrafficData(DescribeLiveDomainPushTrafficDataRequest request);

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
    CompletableFuture<DescribeLiveDomainPvUvDataResponse> describeLiveDomainPvUvData(DescribeLiveDomainPvUvDataRequest request);

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
    CompletableFuture<DescribeLiveDomainRealTimeBpsDataResponse> describeLiveDomainRealTimeBpsData(DescribeLiveDomainRealTimeBpsDataRequest request);

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
    CompletableFuture<DescribeLiveDomainRealTimeHttpCodeDataResponse> describeLiveDomainRealTimeHttpCodeData(DescribeLiveDomainRealTimeHttpCodeDataRequest request);

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
    CompletableFuture<DescribeLiveDomainRealTimeTrafficDataResponse> describeLiveDomainRealTimeTrafficData(DescribeLiveDomainRealTimeTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the status of real-time log delivery for a domain name. Make sure that the parameter settings meet the requirements.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveDomainRealtimeLogDelivery  DescribeLiveDomainRealtimeLogDeliveryRequest
     * @return DescribeLiveDomainRealtimeLogDeliveryResponse
     */
    CompletableFuture<DescribeLiveDomainRealtimeLogDeliveryResponse> describeLiveDomainRealtimeLogDelivery(DescribeLiveDomainRealtimeLogDeliveryRequest request);

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
    CompletableFuture<DescribeLiveDomainRecordUsageDataResponse> describeLiveDomainRecordUsageData(DescribeLiveDomainRecordUsageDataRequest request);

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
    CompletableFuture<DescribeLiveDomainSnapshotDataResponse> describeLiveDomainSnapshotData(DescribeLiveDomainSnapshotDataRequest request);

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
    CompletableFuture<DescribeLiveDomainStagingConfigResponse> describeLiveDomainStagingConfig(DescribeLiveDomainStagingConfigRequest request);

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
    CompletableFuture<DescribeLiveDomainStreamTranscodeDataResponse> describeLiveDomainStreamTranscodeData(DescribeLiveDomainStreamTranscodeDataRequest request);

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
    CompletableFuture<DescribeLiveDomainTimeShiftDataResponse> describeLiveDomainTimeShiftData(DescribeLiveDomainTimeShiftDataRequest request);

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
    CompletableFuture<DescribeLiveDomainTrafficDataResponse> describeLiveDomainTrafficData(DescribeLiveDomainTrafficDataRequest request);

    /**
     * @param request the request parameters of DescribeLiveDomainTranscodeParams  DescribeLiveDomainTranscodeParamsRequest
     * @return DescribeLiveDomainTranscodeParamsResponse
     */
    CompletableFuture<DescribeLiveDomainTranscodeParamsResponse> describeLiveDomainTranscodeParams(DescribeLiveDomainTranscodeParamsRequest request);

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
    CompletableFuture<DescribeLiveDrmUsageDataResponse> describeLiveDrmUsageData(DescribeLiveDrmUsageDataRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the ingest domain, and then call this operation to query the configuration of edge stream relay.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveEdgeTransfer  DescribeLiveEdgeTransferRequest
     * @return DescribeLiveEdgeTransferResponse
     */
    CompletableFuture<DescribeLiveEdgeTransferResponse> describeLiveEdgeTransfer(DescribeLiveEdgeTransferRequest request);

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
    CompletableFuture<DescribeLiveGrtnDurationResponse> describeLiveGrtnDuration(DescribeLiveGrtnDurationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about all certificates that you have configured.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveHttpsDomainList  DescribeLiveHttpsDomainListRequest
     * @return DescribeLiveHttpsDomainListResponse
     */
    CompletableFuture<DescribeLiveHttpsDomainListResponse> describeLiveHttpsDomainList(DescribeLiveHttpsDomainListRequest request);

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
    CompletableFuture<DescribeLiveInteractionMetricDataResponse> describeLiveInteractionMetricData(DescribeLiveInteractionMetricDataRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveIpInfo  DescribeLiveIpInfoRequest
     * @return DescribeLiveIpInfoResponse
     */
    CompletableFuture<DescribeLiveIpInfoResponse> describeLiveIpInfo(DescribeLiveIpInfoRequest request);

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
    CompletableFuture<DescribeLiveLazyPullStreamConfigResponse> describeLiveLazyPullStreamConfig(DescribeLiveLazyPullStreamConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveMessageApp  DescribeLiveMessageAppRequest
     * @return DescribeLiveMessageAppResponse
     */
    CompletableFuture<DescribeLiveMessageAppResponse> describeLiveMessageApp(DescribeLiveMessageAppRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveMessageGroup  DescribeLiveMessageGroupRequest
     * @return DescribeLiveMessageGroupResponse
     */
    CompletableFuture<DescribeLiveMessageGroupResponse> describeLiveMessageGroup(DescribeLiveMessageGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveMessageGroupBand  DescribeLiveMessageGroupBandRequest
     * @return DescribeLiveMessageGroupBandResponse
     */
    CompletableFuture<DescribeLiveMessageGroupBandResponse> describeLiveMessageGroupBand(DescribeLiveMessageGroupBandRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query live stream encapsulation configurations.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 300 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePackageConfig  DescribeLivePackageConfigRequest
     * @return DescribeLivePackageConfigResponse
     */
    CompletableFuture<DescribeLivePackageConfigResponse> describeLivePackageConfig(DescribeLivePackageConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the CreateLivePrivateLine operation, you can call this operation to query available acceleration regions, which are access points where acceleration circuits start.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePrivateLineAreas  DescribeLivePrivateLineAreasRequest
     * @return DescribeLivePrivateLineAreasResponse
     */
    CompletableFuture<DescribeLivePrivateLineAreasResponse> describeLivePrivateLineAreas(DescribeLivePrivateLineAreasRequest request);

    /**
     * <b>description</b> :
     * <p>If you set the IsGaInstance parameter to yes, the status of GA instances is queried. If you set the IsGaInstance parameter to no, the binding information between GA instances and acceleration circuits is queried.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLivePrivateLineAvailGA  DescribeLivePrivateLineAvailGARequest
     * @return DescribeLivePrivateLineAvailGAResponse
     */
    CompletableFuture<DescribeLivePrivateLineAvailGAResponse> describeLivePrivateLineAvailGA(DescribeLivePrivateLineAvailGARequest request);

    /**
     * <b>description</b> :
     * <p>The minimum time granularity for a query is 1 hour. The maximum time range for a query is 31 days. You can query the production studio usage data in the last 90 days.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveProducerUsageData  DescribeLiveProducerUsageDataRequest
     * @return DescribeLiveProducerUsageDataResponse
     */
    CompletableFuture<DescribeLiveProducerUsageDataResponse> describeLiveProducerUsageData(DescribeLiveProducerUsageDataRequest request);

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
    CompletableFuture<DescribeLivePullStreamConfigResponse> describeLivePullStreamConfig(DescribeLivePullStreamConfigRequest request);

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
    CompletableFuture<DescribeLivePullToPushResponse> describeLivePullToPush(DescribeLivePullToPushRequest request);

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
    CompletableFuture<DescribeLivePullToPushListResponse> describeLivePullToPushList(DescribeLivePullToPushListRequest request);

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
    CompletableFuture<DescribeLivePushProxyLogResponse> describeLivePushProxyLog(DescribeLivePushProxyLogRequest request);

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
    CompletableFuture<DescribeLivePushProxyUsageDataResponse> describeLivePushProxyUsageData(DescribeLivePushProxyUsageDataRequest request);

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
    CompletableFuture<DescribeLiveRealtimeDeliveryAccResponse> describeLiveRealtimeDeliveryAcc(DescribeLiveRealtimeDeliveryAccRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the status of authorization for real-time log delivery.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveRealtimeLogAuthorized  DescribeLiveRealtimeLogAuthorizedRequest
     * @return DescribeLiveRealtimeLogAuthorizedResponse
     */
    CompletableFuture<DescribeLiveRealtimeLogAuthorizedResponse> describeLiveRealtimeLogAuthorized(DescribeLiveRealtimeLogAuthorizedRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the recording configurations of all applications under the main streaming domain.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveRecordConfig  DescribeLiveRecordConfigRequest
     * @return DescribeLiveRecordConfigResponse
     */
    CompletableFuture<DescribeLiveRecordConfigResponse> describeLiveRecordConfig(DescribeLiveRecordConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the configuration of callbacks for live stream recording under the domain name.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveRecordNotifyConfig  DescribeLiveRecordNotifyConfigRequest
     * @return DescribeLiveRecordNotifyConfigResponse
     */
    CompletableFuture<DescribeLiveRecordNotifyConfigResponse> describeLiveRecordNotifyConfig(DescribeLiveRecordNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveRecordNotifyRecords  DescribeLiveRecordNotifyRecordsRequest
     * @return DescribeLiveRecordNotifyRecordsResponse
     */
    CompletableFuture<DescribeLiveRecordNotifyRecordsResponse> describeLiveRecordNotifyRecords(DescribeLiveRecordNotifyRecordsRequest request);

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
    CompletableFuture<DescribeLiveRecordVodConfigsResponse> describeLiveRecordVodConfigs(DescribeLiveRecordVodConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable to the streaming domains.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 10 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveShiftConfigs  DescribeLiveShiftConfigsRequest
     * @return DescribeLiveShiftConfigsResponse
     */
    CompletableFuture<DescribeLiveShiftConfigsResponse> describeLiveShiftConfigs(DescribeLiveShiftConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the snapshot configurations.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveSnapshotConfig  DescribeLiveSnapshotConfigRequest
     * @return DescribeLiveSnapshotConfigResponse
     */
    CompletableFuture<DescribeLiveSnapshotConfigResponse> describeLiveSnapshotConfig(DescribeLiveSnapshotConfigRequest request);

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
    CompletableFuture<DescribeLiveSnapshotDetectPornConfigResponse> describeLiveSnapshotDetectPornConfig(DescribeLiveSnapshotDetectPornConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveSnapshotNotifyConfig  DescribeLiveSnapshotNotifyConfigRequest
     * @return DescribeLiveSnapshotNotifyConfigResponse
     */
    CompletableFuture<DescribeLiveSnapshotNotifyConfigResponse> describeLiveSnapshotNotifyConfig(DescribeLiveSnapshotNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamAuthChecking  DescribeLiveStreamAuthCheckingRequest
     * @return DescribeLiveStreamAuthCheckingResponse
     */
    CompletableFuture<DescribeLiveStreamAuthCheckingResponse> describeLiveStreamAuthChecking(DescribeLiveStreamAuthCheckingRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the frame rates and bitrates of an RTMP stream within a specified time period. You can call this operation to query historical data.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamBitRateData  DescribeLiveStreamBitRateDataRequest
     * @return DescribeLiveStreamBitRateDataResponse
     */
    CompletableFuture<DescribeLiveStreamBitRateDataResponse> describeLiveStreamBitRateData(DescribeLiveStreamBitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the numbers of online source streams and transcoded streams. The streams that are returned by calling this operation are encoded in H.264 or H.265.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation once per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamCount  DescribeLiveStreamCountRequest
     * @return DescribeLiveStreamCountResponse
     */
    CompletableFuture<DescribeLiveStreamCountResponse> describeLiveStreamCount(DescribeLiveStreamCountRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the streaming domain, and then call this operation to query the live streaming latency.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamDelayConfig  DescribeLiveStreamDelayConfigRequest
     * @return DescribeLiveStreamDelayConfigResponse
     */
    CompletableFuture<DescribeLiveStreamDelayConfigResponse> describeLiveStreamDelayConfig(DescribeLiveStreamDelayConfigRequest request);

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
    CompletableFuture<DescribeLiveStreamDetailFrameRateAndBitRateDataResponse> describeLiveStreamDetailFrameRateAndBitRateData(DescribeLiveStreamDetailFrameRateAndBitRateDataRequest request);

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
    CompletableFuture<DescribeLiveStreamHistoryUserNumResponse> describeLiveStreamHistoryUserNum(DescribeLiveStreamHistoryUserNumRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamMerge  DescribeLiveStreamMergeRequest
     * @return DescribeLiveStreamMergeResponse
     */
    CompletableFuture<DescribeLiveStreamMergeResponse> describeLiveStreamMerge(DescribeLiveStreamMergeRequest request);

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
    CompletableFuture<DescribeLiveStreamMetricDetailDataResponse> describeLiveStreamMetricDetailData(DescribeLiveStreamMetricDetailDataRequest request);

    /**
     * <b>description</b> :
     * <p><a href="https://help.aliyun.com/document_detail/2848129.html">Create monitoring sessions</a> before you call this operation to query the monitoring session list. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamMonitorList  DescribeLiveStreamMonitorListRequest
     * @return DescribeLiveStreamMonitorListResponse
     */
    CompletableFuture<DescribeLiveStreamMonitorListResponse> describeLiveStreamMonitorList(DescribeLiveStreamMonitorListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query prefetch tasks in the last three days.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamPreloadTasks  DescribeLiveStreamPreloadTasksRequest
     * @return DescribeLiveStreamPreloadTasksResponse
     */
    CompletableFuture<DescribeLiveStreamPreloadTasksResponse> describeLiveStreamPreloadTasks(DescribeLiveStreamPreloadTasksRequest request);

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
    CompletableFuture<DescribeLiveStreamPushMetricDetailDataResponse> describeLiveStreamPushMetricDetailData(DescribeLiveStreamPushMetricDetailDataRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the recordings of the live stream.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamRecordContent  DescribeLiveStreamRecordContentRequest
     * @return DescribeLiveStreamRecordContentResponse
     */
    CompletableFuture<DescribeLiveStreamRecordContentResponse> describeLiveStreamRecordContent(DescribeLiveStreamRecordContentRequest request);

    /**
     * <b>description</b> :
     * <p>ApsaraVideo Live stores the information about M3U8 index files for six months. You can query the information about only the M3U8 index files that were created in the last six months. OSS stores M3U8 index files for a time period that is specified by the storage configuration in OSS.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamRecordIndexFile  DescribeLiveStreamRecordIndexFileRequest
     * @return DescribeLiveStreamRecordIndexFileResponse
     */
    CompletableFuture<DescribeLiveStreamRecordIndexFileResponse> describeLiveStreamRecordIndexFile(DescribeLiveStreamRecordIndexFileRequest request);

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
    CompletableFuture<DescribeLiveStreamRecordIndexFilesResponse> describeLiveStreamRecordIndexFiles(DescribeLiveStreamRecordIndexFilesRequest request);

    /**
     * <b>description</b> :
     * <p>You can query only snapshots that were captured in the last year.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamSnapshotInfo  DescribeLiveStreamSnapshotInfoRequest
     * @return DescribeLiveStreamSnapshotInfoResponse
     */
    CompletableFuture<DescribeLiveStreamSnapshotInfoResponse> describeLiveStreamSnapshotInfo(DescribeLiveStreamSnapshotInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the streaming domain, and then call this operation to query the status of a stream in real time. If the stream is in the offline status, you can check the stream ingest callback to learn about the reason that causes the offline status. This operation does not provide detailed information.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamState  DescribeLiveStreamStateRequest
     * @return DescribeLiveStreamStateResponse
     */
    CompletableFuture<DescribeLiveStreamStateResponse> describeLiveStreamState(DescribeLiveStreamStateRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to query the transcoding configurations.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamTranscodeInfo  DescribeLiveStreamTranscodeInfoRequest
     * @return DescribeLiveStreamTranscodeInfoResponse
     */
    CompletableFuture<DescribeLiveStreamTranscodeInfoResponse> describeLiveStreamTranscodeInfo(DescribeLiveStreamTranscodeInfoRequest request);

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
    CompletableFuture<DescribeLiveStreamTranscodeMetricDataResponse> describeLiveStreamTranscodeMetricData(DescribeLiveStreamTranscodeMetricDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamTranscodeStreamNum  DescribeLiveStreamTranscodeStreamNumRequest
     * @return DescribeLiveStreamTranscodeStreamNumResponse
     */
    CompletableFuture<DescribeLiveStreamTranscodeStreamNumResponse> describeLiveStreamTranscodeStreamNum(DescribeLiveStreamTranscodeStreamNumRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, you can specify the PageNumber and PageSize parameters to view watermark rules on separate pages. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamWatermarkRules  DescribeLiveStreamWatermarkRulesRequest
     * @return DescribeLiveStreamWatermarkRulesResponse
     */
    CompletableFuture<DescribeLiveStreamWatermarkRulesResponse> describeLiveStreamWatermarkRules(DescribeLiveStreamWatermarkRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query watermark templates. You can use the PageNumber parameter to view results on separate pages. Make sure that you configure parameters properly when you call this operation.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamWatermarks  DescribeLiveStreamWatermarksRequest
     * @return DescribeLiveStreamWatermarksResponse
     */
    CompletableFuture<DescribeLiveStreamWatermarksResponse> describeLiveStreamWatermarks(DescribeLiveStreamWatermarksRequest request);

    /**
     * <b>description</b> :
     * <p>The stream URLs refer to the URLs for playing in particular.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 50 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsBlockList  DescribeLiveStreamsBlockListRequest
     * @return DescribeLiveStreamsBlockListResponse
     */
    CompletableFuture<DescribeLiveStreamsBlockListResponse> describeLiveStreamsBlockList(DescribeLiveStreamsBlockListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the operation history of live streams under a domain name or in an application. The operations include all API operations that were called on live streams.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsControlHistory  DescribeLiveStreamsControlHistoryRequest
     * @return DescribeLiveStreamsControlHistoryResponse
     */
    CompletableFuture<DescribeLiveStreamsControlHistoryResponse> describeLiveStreamsControlHistory(DescribeLiveStreamsControlHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeLiveStreamsNotifyRecords  DescribeLiveStreamsNotifyRecordsRequest
     * @return DescribeLiveStreamsNotifyRecordsResponse
     */
    CompletableFuture<DescribeLiveStreamsNotifyRecordsResponse> describeLiveStreamsNotifyRecords(DescribeLiveStreamsNotifyRecordsRequest request);

    /**
     * @param request the request parameters of DescribeLiveStreamsNotifyUrlConfig  DescribeLiveStreamsNotifyUrlConfigRequest
     * @return DescribeLiveStreamsNotifyUrlConfigResponse
     */
    CompletableFuture<DescribeLiveStreamsNotifyUrlConfigResponse> describeLiveStreamsNotifyUrlConfig(DescribeLiveStreamsNotifyUrlConfigRequest request);

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
    CompletableFuture<DescribeLiveStreamsOnlineListResponse> describeLiveStreamsOnlineList(DescribeLiveStreamsOnlineListRequest request);

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
    CompletableFuture<DescribeLiveStreamsPublishListResponse> describeLiveStreamsPublishList(DescribeLiveStreamsPublishListRequest request);

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
    CompletableFuture<DescribeLiveStreamsTotalCountResponse> describeLiveStreamsTotalCount(DescribeLiveStreamsTotalCountRequest request);

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
    CompletableFuture<DescribeLiveTopDomainsByFlowResponse> describeLiveTopDomainsByFlow(DescribeLiveTopDomainsByFlowRequest request);

    /**
     * @param request the request parameters of DescribeLiveTrafficDomainLog  DescribeLiveTrafficDomainLogRequest
     * @return DescribeLiveTrafficDomainLogResponse
     */
    CompletableFuture<DescribeLiveTrafficDomainLogResponse> describeLiveTrafficDomainLog(DescribeLiveTrafficDomainLogRequest request);

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
    CompletableFuture<DescribeLiveUpVideoAudioInfoResponse> describeLiveUpVideoAudioInfo(DescribeLiveUpVideoAudioInfoRequest request);

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
    CompletableFuture<DescribeLiveUserBillPredictionResponse> describeLiveUserBillPrediction(DescribeLiveUserBillPredictionRequest request);

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
    CompletableFuture<DescribeLiveUserDomainsResponse> describeLiveUserDomains(DescribeLiveUserDomainsRequest request);

    /**
     * @param request the request parameters of DescribeLiveUserTags  DescribeLiveUserTagsRequest
     * @return DescribeLiveUserTagsResponse
     */
    CompletableFuture<DescribeLiveUserTagsResponse> describeLiveUserTags(DescribeLiveUserTagsRequest request);

    /**
     * @param request the request parameters of DescribeLiveUserTrafficLog  DescribeLiveUserTrafficLogRequest
     * @return DescribeLiveUserTrafficLogResponse
     */
    CompletableFuture<DescribeLiveUserTrafficLogResponse> describeLiveUserTrafficLog(DescribeLiveUserTrafficLogRequest request);

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
    CompletableFuture<DescribeLiveVerifyContentResponse> describeLiveVerifyContent(DescribeLiveVerifyContentRequest request);

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
    CompletableFuture<DescribeMeterLiveBypassDurationResponse> describeMeterLiveBypassDuration(DescribeMeterLiveBypassDurationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation to create stream mixing tasks and then call this operation to query the list of stream mixing tasks.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeMixStreamList  DescribeMixStreamListRequest
     * @return DescribeMixStreamListResponse
     */
    CompletableFuture<DescribeMixStreamListResponse> describeMixStreamList(DescribeMixStreamListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about the factors that cause latency of first frames within a specified period of time. You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKFirstFrameCost  DescribeRTSNativeSDKFirstFrameCostRequest
     * @return DescribeRTSNativeSDKFirstFrameCostResponse
     */
    CompletableFuture<DescribeRTSNativeSDKFirstFrameCostResponse> describeRTSNativeSDKFirstFrameCost(DescribeRTSNativeSDKFirstFrameCostRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the average latency of first frames within a specified period of time. You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKFirstFrameDelay  DescribeRTSNativeSDKFirstFrameDelayRequest
     * @return DescribeRTSNativeSDKFirstFrameDelayResponse
     */
    CompletableFuture<DescribeRTSNativeSDKFirstFrameDelayResponse> describeRTSNativeSDKFirstFrameDelay(DescribeRTSNativeSDKFirstFrameDelayRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the causes of playback failures that occurred within a specified period of time. The causes are returned in the form of status codes. You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKPlayFailStatus  DescribeRTSNativeSDKPlayFailStatusRequest
     * @return DescribeRTSNativeSDKPlayFailStatusResponse
     */
    CompletableFuture<DescribeRTSNativeSDKPlayFailStatusResponse> describeRTSNativeSDKPlayFailStatus(DescribeRTSNativeSDKPlayFailStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the playback duration within a specified period of time. You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKPlayTime  DescribeRTSNativeSDKPlayTimeRequest
     * @return DescribeRTSNativeSDKPlayTimeResponse
     */
    CompletableFuture<DescribeRTSNativeSDKPlayTimeResponse> describeRTSNativeSDKPlayTime(DescribeRTSNativeSDKPlayTimeRequest request);

    /**
     * <b>description</b> :
     * <p>QPS limit You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see QPS limit.</p>
     * 
     * @param request the request parameters of DescribeRTSNativeSDKVvData  DescribeRTSNativeSDKVvDataRequest
     * @return DescribeRTSNativeSDKVvDataResponse
     */
    CompletableFuture<DescribeRTSNativeSDKVvDataResponse> describeRTSNativeSDKVvData(DescribeRTSNativeSDKVvDataRequest request);

    /**
     * @param request the request parameters of DescribeRtcCloudRecordingFiles  DescribeRtcCloudRecordingFilesRequest
     * @return DescribeRtcCloudRecordingFilesResponse
     */
    CompletableFuture<DescribeRtcCloudRecordingFilesResponse> describeRtcCloudRecordingFiles(DescribeRtcCloudRecordingFilesRequest request);

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
    CompletableFuture<DescribeRtcMPUEventSubResponse> describeRtcMPUEventSub(DescribeRtcMPUEventSubRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot call this operation if the episode list is empty. For information about how to add episodes to the episode list, see <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeShowList  DescribeShowListRequest
     * @return DescribeShowListResponse
     */
    CompletableFuture<DescribeShowListResponse> describeShowList(DescribeShowListRequest request);

    /**
     * <b>description</b> :
     * <p>Queries configurations of stream-level region blocking.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeStreamLocationBlock  DescribeStreamLocationBlockRequest
     * @return DescribeStreamLocationBlockResponse
     */
    CompletableFuture<DescribeStreamLocationBlockResponse> describeStreamLocationBlock(DescribeStreamLocationBlockRequest request);

    /**
     * <b>description</b> :
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/215388.html">AddStudioLayout</a> operation to configure layouts for a virtual studio before you call this operation to query layouts.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of DescribeStudioLayouts  DescribeStudioLayoutsRequest
     * @return DescribeStudioLayoutsResponse
     */
    CompletableFuture<DescribeStudioLayoutsResponse> describeStudioLayouts(DescribeStudioLayoutsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the stream pulling information about a live stream of a headline.</p>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeToutiaoLivePlay  DescribeToutiaoLivePlayRequest
     * @return DescribeToutiaoLivePlayResponse
     */
    CompletableFuture<DescribeToutiaoLivePlayResponse> describeToutiaoLivePlay(DescribeToutiaoLivePlayRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the ingest information of a specified live stream that is ingested to Toutiao.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeToutiaoLivePublish  DescribeToutiaoLivePublishRequest
     * @return DescribeToutiaoLivePublishResponse
     */
    CompletableFuture<DescribeToutiaoLivePublishResponse> describeToutiaoLivePublish(DescribeToutiaoLivePublishRequest request);

    /**
     * @param request the request parameters of DescribeUidOnlineStreams  DescribeUidOnlineStreamsRequest
     * @return DescribeUidOnlineStreamsResponse
     */
    CompletableFuture<DescribeUidOnlineStreamsResponse> describeUidOnlineStreams(DescribeUidOnlineStreamsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the daily peak inbound bandwidth.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeUpBpsPeakData  DescribeUpBpsPeakDataRequest
     * @return DescribeUpBpsPeakDataResponse
     */
    CompletableFuture<DescribeUpBpsPeakDataResponse> describeUpBpsPeakData(DescribeUpBpsPeakDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the daily peak inbound bandwidth of a leased line.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 5 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeUpBpsPeakOfLine  DescribeUpBpsPeakOfLineRequest
     * @return DescribeUpBpsPeakOfLineResponse
     */
    CompletableFuture<DescribeUpBpsPeakOfLineResponse> describeUpBpsPeakOfLine(DescribeUpBpsPeakOfLineRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the daily peak number of concurrently ingested streams.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeUpPeakPublishStreamData  DescribeUpPeakPublishStreamDataRequest
     * @return DescribeUpPeakPublishStreamDataResponse
     */
    CompletableFuture<DescribeUpPeakPublishStreamDataResponse> describeUpPeakPublishStreamData(DescribeUpPeakPublishStreamDataRequest request);

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
    CompletableFuture<DisableLiveRealtimeLogDeliveryResponse> disableLiveRealtimeLogDelivery(DisableLiveRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <p>Dynamically updating a watermark means replacing the watermark template ID during live streaming. Before you call this operation to update a watermark, you must prepare the watermark template ID that is used for replacement. The watermark template ID is specified by the <strong>TemplateId</strong> parameter of this operation. You can call the <a href="https://help.aliyun.com/document_detail/2848102.html">DescribeLiveStreamWatermarks</a> operation to obtain available watermark template IDs.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DynamicUpdateWaterMarkStreamRule  DynamicUpdateWaterMarkStreamRuleRequest
     * @return DynamicUpdateWaterMarkStreamRuleResponse
     */
    CompletableFuture<DynamicUpdateWaterMarkStreamRuleResponse> dynamicUpdateWaterMarkStreamRule(DynamicUpdateWaterMarkStreamRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update all configurations of episodes in an episode list or replace the episodes.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of EditPlaylist  EditPlaylistRequest
     * @return EditPlaylistResponse
     */
    CompletableFuture<EditPlaylistResponse> editPlaylist(EditPlaylistRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create an editing task by specifying the production studio ID and the episode ID. You will not receive a notification after the editing task is created. You can call the <a href="https://help.aliyun.com/document_detail/2848059.html">GetEditingJobInfo</a> operation to query the status of the editing task.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of EditShowAndReplace  EditShowAndReplaceRequest
     * @return EditShowAndReplaceResponse
     */
    CompletableFuture<EditShowAndReplaceResponse> editShowAndReplace(EditShowAndReplaceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to switch a specified scene to the standby resource. Only a PGM scene is supported.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of EffectCasterUrgent  EffectCasterUrgentRequest
     * @return EffectCasterUrgentResponse
     */
    CompletableFuture<EffectCasterUrgentResponse> effectCasterUrgent(EffectCasterUrgentRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that the resource is referenced by the scene.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of EffectCasterVideoResource  EffectCasterVideoResourceRequest
     * @return EffectCasterVideoResourceResponse
     */
    CompletableFuture<EffectCasterVideoResourceResponse> effectCasterVideoResource(EffectCasterVideoResourceRequest request);

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
    CompletableFuture<EnableLiveRealtimeLogDeliveryResponse> enableLiveRealtimeLogDelivery(EnableLiveRealtimeLogDeliveryRequest request);

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
    CompletableFuture<ForbidLiveStreamResponse> forbidLiveStream(ForbidLiveStreamRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all custom stream mixing templates. A list of template names and template configurations is returned.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetAllCustomTemplates  GetAllCustomTemplatesRequest
     * @return GetAllCustomTemplatesResponse
     */
    CompletableFuture<GetAllCustomTemplatesResponse> getAllCustomTemplates(GetAllCustomTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the name of the custom stream mixing template, and then call this operation to query the information about the template.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetCustomTemplate  GetCustomTemplateRequest
     * @return GetCustomTemplateResponse
     */
    CompletableFuture<GetCustomTemplateResponse> getCustomTemplate(GetCustomTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>To call this operation, make sure that you have the permissions to access the edge transcoding feature.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetEdgeTranscodeJob  GetEdgeTranscodeJobRequest
     * @return GetEdgeTranscodeJobResponse
     */
    CompletableFuture<GetEdgeTranscodeJobResponse> getEdgeTranscodeJob(GetEdgeTranscodeJobRequest request);

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
    CompletableFuture<GetEdgeTranscodeTemplateResponse> getEdgeTranscodeTemplate(GetEdgeTranscodeTemplateRequest request);

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
    CompletableFuture<GetEditingJobInfoResponse> getEditingJobInfo(GetEditingJobInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of GetMessageApp  GetMessageAppRequest
     * @return GetMessageAppResponse
     */
    CompletableFuture<GetMessageAppResponse> getMessageApp(GetMessageAppRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of GetMessageGroup  GetMessageGroupRequest
     * @return GetMessageGroupResponse
     */
    CompletableFuture<GetMessageGroupResponse> getMessageGroup(GetMessageGroupRequest request);

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
    CompletableFuture<GetMessageTokenResponse> getMessageToken(GetMessageTokenRequest request);

    /**
     * @param request the request parameters of GetTranscodeTaskStatus  GetTranscodeTaskStatusRequest
     * @return GetTranscodeTaskStatusResponse
     */
    CompletableFuture<GetTranscodeTaskStatusResponse> getTranscodeTaskStatus(GetTranscodeTaskStatusRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of HotLiveRtcStream  HotLiveRtcStreamRequest
     * @return HotLiveRtcStreamResponse
     */
    CompletableFuture<HotLiveRtcStreamResponse> hotLiveRtcStream(HotLiveRtcStreamRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a scheduled task to start and stop the playback of an episode list at specified points in time. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of InitializeAutoShowListTask  InitializeAutoShowListTaskRequest
     * @return InitializeAutoShowListTaskResponse
     */
    CompletableFuture<InitializeAutoShowListTaskResponse> initializeAutoShowListTask(InitializeAutoShowListTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 200 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of JoinMessageGroup  JoinMessageGroupRequest
     * @return JoinMessageGroupResponse
     */
    CompletableFuture<JoinMessageGroupResponse> joinMessageGroup(JoinMessageGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of KickLiveMessageGroupUser  KickLiveMessageGroupUserRequest
     * @return KickLiveMessageGroupUserResponse
     */
    CompletableFuture<KickLiveMessageGroupUserResponse> kickLiveMessageGroupUser(KickLiveMessageGroupUserRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of LeaveMessageGroup  LeaveMessageGroupRequest
     * @return LeaveMessageGroupResponse
     */
    CompletableFuture<LeaveMessageGroupResponse> leaveMessageGroup(LeaveMessageGroupRequest request);

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
    CompletableFuture<ListEdgeTranscodeJobResponse> listEdgeTranscodeJob(ListEdgeTranscodeJobRequest request);

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
    CompletableFuture<ListEdgeTranscodeTemplateResponse> listEdgeTranscodeTemplate(ListEdgeTranscodeTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListEventSub  ListEventSubRequest
     * @return ListEventSubResponse
     */
    CompletableFuture<ListEventSubResponse> listEventSub(ListEventSubRequest request);

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
    CompletableFuture<ListEventSubEventResponse> listEventSubEvent(ListEventSubEventRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveDelayConfig  ListLiveDelayConfigRequest
     * @return ListLiveDelayConfigResponse
     */
    CompletableFuture<ListLiveDelayConfigResponse> listLiveDelayConfig(ListLiveDelayConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageApps  ListLiveMessageAppsRequest
     * @return ListLiveMessageAppsResponse
     */
    CompletableFuture<ListLiveMessageAppsResponse> listLiveMessageApps(ListLiveMessageAppsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageGroupByPage  ListLiveMessageGroupByPageRequest
     * @return ListLiveMessageGroupByPageResponse
     */
    CompletableFuture<ListLiveMessageGroupByPageResponse> listLiveMessageGroupByPage(ListLiveMessageGroupByPageRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageGroupMessages  ListLiveMessageGroupMessagesRequest
     * @return ListLiveMessageGroupMessagesResponse
     */
    CompletableFuture<ListLiveMessageGroupMessagesResponse> listLiveMessageGroupMessages(ListLiveMessageGroupMessagesRequest request);

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
    CompletableFuture<ListLiveMessageGroupUsersResponse> listLiveMessageGroupUsers(ListLiveMessageGroupUsersRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveMessageGroups  ListLiveMessageGroupsRequest
     * @return ListLiveMessageGroupsResponse
     */
    CompletableFuture<ListLiveMessageGroupsResponse> listLiveMessageGroups(ListLiveMessageGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all configurations of real-time log delivery under an account. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveRealtimeLogDelivery  ListLiveRealtimeLogDeliveryRequest
     * @return ListLiveRealtimeLogDeliveryResponse
     */
    CompletableFuture<ListLiveRealtimeLogDeliveryResponse> listLiveRealtimeLogDelivery(ListLiveRealtimeLogDeliveryRequest request);

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
    CompletableFuture<ListLiveRealtimeLogDeliveryDomainsResponse> listLiveRealtimeLogDeliveryDomains(ListLiveRealtimeLogDeliveryDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all configurations of real-time log delivery. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 6,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListLiveRealtimeLogDeliveryInfos  ListLiveRealtimeLogDeliveryInfosRequest
     * @return ListLiveRealtimeLogDeliveryInfosResponse
     */
    CompletableFuture<ListLiveRealtimeLogDeliveryInfosResponse> listLiveRealtimeLogDeliveryInfos(ListLiveRealtimeLogDeliveryInfosRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessage  ListMessageRequest
     * @return ListMessageResponse
     */
    CompletableFuture<ListMessageResponse> listMessage(ListMessageRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessageApp  ListMessageAppRequest
     * @return ListMessageAppResponse
     */
    CompletableFuture<ListMessageAppResponse> listMessageApp(ListMessageAppRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessageGroup  ListMessageGroupRequest
     * @return ListMessageGroupResponse
     */
    CompletableFuture<ListMessageGroupResponse> listMessageGroup(ListMessageGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessageGroupUser  ListMessageGroupUserRequest
     * @return ListMessageGroupUserResponse
     */
    CompletableFuture<ListMessageGroupUserResponse> listMessageGroupUser(ListMessageGroupUserRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of ListMessageGroupUserById  ListMessageGroupUserByIdRequest
     * @return ListMessageGroupUserByIdResponse
     */
    CompletableFuture<ListMessageGroupUserByIdResponse> listMessageGroupUserById(ListMessageGroupUserByIdRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListMuteGroupUser  ListMuteGroupUserRequest
     * @return ListMuteGroupUserResponse
     */
    CompletableFuture<ListMuteGroupUserResponse> listMuteGroupUser(ListMuteGroupUserRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add episode lists and then call this operation to query the episode lists.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListPlaylist  ListPlaylistRequest
     * @return ListPlaylistResponse
     */
    CompletableFuture<ListPlaylistResponse> listPlaylist(ListPlaylistRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add episodes to an episode list and then call this operation to query the episodes in the episode list</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListPlaylistItems  ListPlaylistItemsRequest
     * @return ListPlaylistItemsResponse
     */
    CompletableFuture<ListPlaylistItemsResponse> listPlaylistItems(ListPlaylistItemsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the callback records of a subscription to mixed-stream relay events in the last seven days.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListRtcMPUEventSubRecord  ListRtcMPUEventSubRecordRequest
     * @return ListRtcMPUEventSubRecordResponse
     */
    CompletableFuture<ListRtcMPUEventSubRecordResponse> listRtcMPUEventSubRecord(ListRtcMPUEventSubRecordRequest request);

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
    CompletableFuture<ListRtcMPUTaskDetailResponse> listRtcMPUTaskDetail(ListRtcMPUTaskDetailRequest request);

    /**
     * @param request the request parameters of LiveUpstreamQosData  LiveUpstreamQosDataRequest
     * @return LiveUpstreamQosDataResponse
     */
    CompletableFuture<LiveUpstreamQosDataResponse> liveUpstreamQosData(LiveUpstreamQosDataRequest request);

    /**
     * @param request the request parameters of MiguLivePullToPushStart  MiguLivePullToPushStartRequest
     * @return MiguLivePullToPushStartResponse
     */
    CompletableFuture<MiguLivePullToPushStartResponse> miguLivePullToPushStart(MiguLivePullToPushStartRequest request);

    /**
     * @param request the request parameters of MiguLivePullToPushStatus  MiguLivePullToPushStatusRequest
     * @return MiguLivePullToPushStatusResponse
     */
    CompletableFuture<MiguLivePullToPushStatusResponse> miguLivePullToPushStatus(MiguLivePullToPushStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a text, image, or subtitle component.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyCasterComponent  ModifyCasterComponentRequest
     * @return ModifyCasterComponentResponse
     */
    CompletableFuture<ModifyCasterComponentResponse> modifyCasterComponent(ModifyCasterComponentRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the configurations of an episode in a production studio. You cannot change the episode type.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyCasterEpisode  ModifyCasterEpisodeRequest
     * @return ModifyCasterEpisodeResponse
     */
    CompletableFuture<ModifyCasterEpisodeResponse> modifyCasterEpisode(ModifyCasterEpisodeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to modify a layout of the production studio. This operation supports the default and adaptive scaling modes.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyCasterLayout  ModifyCasterLayoutRequest
     * @return ModifyCasterLayoutResponse
     */
    CompletableFuture<ModifyCasterLayoutResponse> modifyCasterLayout(ModifyCasterLayoutRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848074.html">AddCasterProgram</a> operation to add the episode list for carousel playback in a production studio and then call this operation to modify the episode list. The supported types of episodes include video resource and component.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 4 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyCasterProgram  ModifyCasterProgramRequest
     * @return ModifyCasterProgramResponse
     */
    CompletableFuture<ModifyCasterProgramResponse> modifyCasterProgram(ModifyCasterProgramRequest request);

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
    CompletableFuture<ModifyCasterVideoResourceResponse> modifyCasterVideoResource(ModifyCasterVideoResourceRequest request);

    /**
     * @param request the request parameters of ModifyLiveAIStudio  ModifyLiveAIStudioRequest
     * @return ModifyLiveAIStudioResponse
     */
    CompletableFuture<ModifyLiveAIStudioResponse> modifyLiveAIStudio(ModifyLiveAIStudioRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveDomainSchdmByProperty  ModifyLiveDomainSchdmByPropertyRequest
     * @return ModifyLiveDomainSchdmByPropertyResponse
     */
    CompletableFuture<ModifyLiveDomainSchdmByPropertyResponse> modifyLiveDomainSchdmByProperty(ModifyLiveDomainSchdmByPropertyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageAppAudit  ModifyLiveMessageAppAuditRequest
     * @return ModifyLiveMessageAppAuditResponse
     */
    CompletableFuture<ModifyLiveMessageAppAuditResponse> modifyLiveMessageAppAudit(ModifyLiveMessageAppAuditRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageAppCallback  ModifyLiveMessageAppCallbackRequest
     * @return ModifyLiveMessageAppCallbackResponse
     */
    CompletableFuture<ModifyLiveMessageAppCallbackResponse> modifyLiveMessageAppCallback(ModifyLiveMessageAppCallbackRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageAppDisable  ModifyLiveMessageAppDisableRequest
     * @return ModifyLiveMessageAppDisableResponse
     */
    CompletableFuture<ModifyLiveMessageAppDisableResponse> modifyLiveMessageAppDisable(ModifyLiveMessageAppDisableRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageGroup  ModifyLiveMessageGroupRequest
     * @return ModifyLiveMessageGroupResponse
     */
    CompletableFuture<ModifyLiveMessageGroupResponse> modifyLiveMessageGroup(ModifyLiveMessageGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyLiveMessageGroupBand  ModifyLiveMessageGroupBandRequest
     * @return ModifyLiveMessageGroupBandResponse
     */
    CompletableFuture<ModifyLiveMessageGroupBandResponse> modifyLiveMessageGroupBand(ModifyLiveMessageGroupBandRequest request);

    /**
     * @param request the request parameters of ModifyLiveMessageUserInfo  ModifyLiveMessageUserInfoRequest
     * @return ModifyLiveMessageUserInfoResponse
     */
    CompletableFuture<ModifyLiveMessageUserInfoResponse> modifyLiveMessageUserInfo(ModifyLiveMessageUserInfoRequest request);

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
    CompletableFuture<ModifyLiveRealtimeLogDeliveryResponse> modifyLiveRealtimeLogDelivery(ModifyLiveRealtimeLogDeliveryRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to change the position of an episode in an episode list, how many times an episode list is played, and the specific point in time at which the episode of the highest priority in an episode list is played.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyShowList  ModifyShowListRequest
     * @return ModifyShowListResponse
     */
    CompletableFuture<ModifyShowListResponse> modifyShowList(ModifyShowListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a layout of a virtual studio. When you call this operation, specify only the parameters that you want to modify.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyStudioLayout  ModifyStudioLayoutRequest
     * @return ModifyStudioLayoutResponse
     */
    CompletableFuture<ModifyStudioLayoutResponse> modifyStudioLayout(ModifyStudioLayoutRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of MuteAllGroupUser  MuteAllGroupUserRequest
     * @return MuteAllGroupUserResponse
     */
    CompletableFuture<MuteAllGroupUserResponse> muteAllGroupUser(MuteAllGroupUserRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of MuteGroupUser  MuteGroupUserRequest
     * @return MuteGroupUserResponse
     */
    CompletableFuture<MuteGroupUserResponse> muteGroupUser(MuteGroupUserRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot configure time shifting and delayed transcoding at the same time.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of OpenLiveShift  OpenLiveShiftRequest
     * @return OpenLiveShiftResponse
     */
    CompletableFuture<OpenLiveShiftResponse> openLiveShift(OpenLiveShiftRequest request);

    /**
     * <b>description</b> :
     * <p>After you add episodes to an episode list and start live streaming, you can call this operation to switch among episodes. For information about how to add episodes to an episode list, see <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a>.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of PlayChoosenShow  PlayChoosenShowRequest
     * @return PlayChoosenShowResponse
     */
    CompletableFuture<PlayChoosenShowResponse> playChoosenShow(PlayChoosenShowRequest request);

    /**
     * <b>description</b> :
     * <p>Function name is required for calling this operation. You can get the function name by calling the <a href="~~297374#doc-api-live-DescribeLiveDomainStagingConfig~~" title="Queries the configurations in the canary release environment.">DescribeLiveDomainStagingConfig</a> operation.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 30 queries per minute. Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of PublishLiveStagingConfigToProduction  PublishLiveStagingConfigToProductionRequest
     * @return PublishLiveStagingConfigToProductionResponse
     */
    CompletableFuture<PublishLiveStagingConfigToProductionResponse> publishLiveStagingConfigToProduction(PublishLiveStagingConfigToProductionRequest request);

    /**
     * @param request the request parameters of QueryLiveDomainMultiStreamList  QueryLiveDomainMultiStreamListRequest
     * @return QueryLiveDomainMultiStreamListResponse
     */
    CompletableFuture<QueryLiveDomainMultiStreamListResponse> queryLiveDomainMultiStreamList(QueryLiveDomainMultiStreamListRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of QueryMessageApp  QueryMessageAppRequest
     * @return QueryMessageAppResponse
     */
    CompletableFuture<QueryMessageAppResponse> queryMessageApp(QueryMessageAppRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryRtcAsrTasks  QueryRtcAsrTasksRequest
     * @return QueryRtcAsrTasksResponse
     */
    CompletableFuture<QueryRtcAsrTasksResponse> queryRtcAsrTasks(QueryRtcAsrTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have configured authentication for snapshot callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/2847907.html">SetSnapshotCallbackAuth</a>. You can call this operation to query the configuration of authentication for snapshot callbacks for a main streaming domain. Make sure that the parameter settings meet the requirements.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of QuerySnapshotCallbackAuth  QuerySnapshotCallbackAuthRequest
     * @return QuerySnapshotCallbackAuthResponse
     */
    CompletableFuture<QuerySnapshotCallbackAuthResponse> querySnapshotCallbackAuth(QuerySnapshotCallbackAuthRequest request);

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
    CompletableFuture<RealTimeRecordCommandResponse> realTimeRecordCommand(RealTimeRecordCommandRequest request);

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
    CompletableFuture<RecoverLiveMessageDeletedGroupResponse> recoverLiveMessageDeletedGroup(RecoverLiveMessageDeletedGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RemoveLiveMessageGroupBand  RemoveLiveMessageGroupBandRequest
     * @return RemoveLiveMessageGroupBandResponse
     */
    CompletableFuture<RemoveLiveMessageGroupBandResponse> removeLiveMessageGroupBand(RemoveLiveMessageGroupBandRequest request);

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
    CompletableFuture<RemoveShowFromShowListResponse> removeShowFromShowList(RemoveShowFromShowListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove one or more users from a channel.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RemoveTerminals  RemoveTerminalsRequest
     * @return RemoveTerminalsResponse
     */
    CompletableFuture<RemoveTerminalsResponse> removeTerminals(RemoveTerminalsRequest request);

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
    CompletableFuture<RestartCasterResponse> restartCaster(RestartCasterRequest request);

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
    CompletableFuture<RestartLivePullToPushResponse> restartLivePullToPush(RestartLivePullToPushRequest request);

    /**
     * @param request the request parameters of RestartTranscodeTask  RestartTranscodeTaskRequest
     * @return RestartTranscodeTaskResponse
     */
    CompletableFuture<RestartTranscodeTaskResponse> restartTranscodeTask(RestartTranscodeTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to resume the ingest of a stream. This operation supports only the live streams ingested by streamers.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ResumeLiveStream  ResumeLiveStreamRequest
     * @return ResumeLiveStreamResponse
     */
    CompletableFuture<ResumeLiveStreamResponse> resumeLiveStream(ResumeLiveStreamRequest request);

    /**
     * <b>description</b> :
     * <p>Function name is required for calling this operation. You can get the function name by calling the <a href="~~297374#doc-api-live-DescribeLiveDomainStagingConfig~~" title="Queries the configurations in the canary release environment.">DescribeLiveDomainStagingConfig</a> operation.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 30 queries per minute. Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation. For more information about what a single user means and the QPS details, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live#topic-2136805">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of RollbackLiveStagingConfig  RollbackLiveStagingConfigRequest
     * @return RollbackLiveStagingConfigResponse
     */
    CompletableFuture<RollbackLiveStagingConfigResponse> rollbackLiveStagingConfig(RollbackLiveStagingConfigRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of SendLike  SendLikeRequest
     * @return SendLikeResponse
     */
    CompletableFuture<SendLikeResponse> sendLike(SendLikeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have called the <a href="https://help.aliyun.com/document_detail/2848163.html">CreateLiveMessageGroup</a> operation to create an interactive messaging group. You can send messages to a group only if the group is active, which requires that one or more users have joined the group. Offline messages are not supported. If you fail to send a message, check whether users exist in the group. If you want to send a message when all users are offline, we recommend that you store the message locally and send it after users get online.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendLiveMessageGroup  SendLiveMessageGroupRequest
     * @return SendLiveMessageGroupResponse
     */
    CompletableFuture<SendLiveMessageGroupResponse> sendLiveMessageGroup(SendLiveMessageGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendLiveMessageUser  SendLiveMessageUserRequest
     * @return SendLiveMessageUserResponse
     */
    CompletableFuture<SendLiveMessageUserResponse> sendLiveMessageUser(SendLiveMessageUserRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of SendMessageToGroup  SendMessageToGroupRequest
     * @return SendMessageToGroupResponse
     */
    CompletableFuture<SendMessageToGroupResponse> sendMessageToGroup(SendMessageToGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of SendMessageToGroupUsers  SendMessageToGroupUsersRequest
     * @return SendMessageToGroupUsersResponse
     */
    CompletableFuture<SendMessageToGroupUsersResponse> sendMessageToGroupUsers(SendMessageToGroupUsersRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to configure a channel for the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetCasterChannel  SetCasterChannelRequest
     * @return SetCasterChannelResponse
     */
    CompletableFuture<SetCasterChannelResponse> setCasterChannel(SetCasterChannelRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to configure the production studio. This operation completely replaces existing configurations. If you leave a parameter empty, the corresponding configuration is cleared for the production studio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetCasterConfig  SetCasterConfigRequest
     * @return SetCasterConfigResponse
     */
    CompletableFuture<SetCasterConfigResponse> setCasterConfig(SetCasterConfigRequest request);

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
    CompletableFuture<SetCasterSceneConfigResponse> setCasterSceneConfig(SetCasterSceneConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the domain name, and then call this operation to enable or disable the certificate of a domain name and modify the certificate information.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveDomainCertificate  SetLiveDomainCertificateRequest
     * @return SetLiveDomainCertificateResponse
     */
    CompletableFuture<SetLiveDomainCertificateResponse> setLiveDomainCertificate(SetLiveDomainCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to configure dual-stream disaster recovery for a streaming domain, which allows you to ingest two streams that have the same name.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveDomainMultiStreamConfig  SetLiveDomainMultiStreamConfigRequest
     * @return SetLiveDomainMultiStreamConfigResponse
     */
    CompletableFuture<SetLiveDomainMultiStreamConfigResponse> setLiveDomainMultiStreamConfig(SetLiveDomainMultiStreamConfigRequest request);

    /**
     * @param request the request parameters of SetLiveDomainMultiStreamMaster  SetLiveDomainMultiStreamMasterRequest
     * @return SetLiveDomainMultiStreamMasterResponse
     */
    CompletableFuture<SetLiveDomainMultiStreamMasterResponse> setLiveDomainMultiStreamMaster(SetLiveDomainMultiStreamMasterRequest request);

    /**
     * @param request the request parameters of SetLiveDomainMultiStreamOptimalMode  SetLiveDomainMultiStreamOptimalModeRequest
     * @return SetLiveDomainMultiStreamOptimalModeResponse
     */
    CompletableFuture<SetLiveDomainMultiStreamOptimalModeResponse> setLiveDomainMultiStreamOptimalMode(SetLiveDomainMultiStreamOptimalModeRequest request);

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
    CompletableFuture<SetLiveDomainStagingConfigResponse> setLiveDomainStagingConfig(SetLiveDomainStagingConfigRequest request);

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
    CompletableFuture<SetLiveEdgeTransferResponse> setLiveEdgeTransfer(SetLiveEdgeTransferRequest request);

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
    CompletableFuture<SetLiveLazyPullStreamInfoConfigResponse> setLiveLazyPullStreamInfoConfig(SetLiveLazyPullStreamInfoConfigRequest request);

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
    CompletableFuture<SetLiveMpuTaskSeiResponse> setLiveMpuTaskSei(SetLiveMpuTaskSeiRequest request);

    /**
     * <b>description</b> :
     * <p>You can configure up to 200 stream-level region blocking rules for a domain name. If there are rules in which the same application name and the same stream name are specified, the rule that is updated the most recently takes effect.</p>
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetLiveStreamBlock  SetLiveStreamBlockRequest
     * @return SetLiveStreamBlockResponse
     */
    CompletableFuture<SetLiveStreamBlockResponse> setLiveStreamBlock(SetLiveStreamBlockRequest request);

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
    CompletableFuture<SetLiveStreamDelayConfigResponse> setLiveStreamDelayConfig(SetLiveStreamDelayConfigRequest request);

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
    CompletableFuture<SetLiveStreamPreloadTasksResponse> setLiveStreamPreloadTasks(SetLiveStreamPreloadTasksRequest request);

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
    CompletableFuture<SetLiveStreamsNotifyUrlConfigResponse> setLiveStreamsNotifyUrlConfig(SetLiveStreamsNotifyUrlConfigRequest request);

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
    CompletableFuture<SetShowListBackgroundResponse> setShowListBackground(SetShowListBackgroundRequest request);

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
    CompletableFuture<SetSnapshotCallbackAuthResponse> setSnapshotCallbackAuth(SetSnapshotCallbackAuthRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to start the production studio. If the production studio does not have a PVW scene or a PGM scene, this operation creates and starts such scenes and starts audio and video processing tasks.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartCaster  StartCasterRequest
     * @return StartCasterResponse
     */
    CompletableFuture<StartCasterResponse> startCaster(StartCasterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to start a specified PVW scene.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartCasterScene  StartCasterSceneRequest
     * @return StartCasterSceneResponse
     */
    CompletableFuture<StartCasterSceneResponse> startCasterScene(StartCasterSceneRequest request);

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
    CompletableFuture<StartEdgeTranscodeJobResponse> startEdgeTranscodeJob(StartEdgeTranscodeJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation does not work if the Alibaba Cloud account to which the domain name belongs has overdue payments or the domain name is invalid.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartLiveDomain  StartLiveDomainRequest
     * @return StartLiveDomainResponse
     */
    CompletableFuture<StartLiveDomainResponse> startLiveDomain(StartLiveDomainRequest request);

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
    CompletableFuture<StartLiveMPUTaskResponse> startLiveMPUTask(StartLiveMPUTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation to create a monitoring session, obtain the value of the response parameter <strong>MonitorId</strong>, and then start live monitoring.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartLiveStreamMonitor  StartLiveStreamMonitorRequest
     * @return StartLiveStreamMonitorResponse
     */
    CompletableFuture<StartLiveStreamMonitorResponse> startLiveStreamMonitor(StartLiveStreamMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add episodes to an episode list and then call this operation to start playing the episode list.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartPlaylist  StartPlaylistRequest
     * @return StartPlaylistResponse
     */
    CompletableFuture<StartPlaylistResponse> startPlaylist(StartPlaylistRequest request);

    /**
     * @param request the request parameters of StartRtcCloudRecording  StartRtcCloudRecordingRequest
     * @return StartRtcCloudRecordingResponse
     */
    CompletableFuture<StartRtcCloudRecordingResponse> startRtcCloudRecording(StartRtcCloudRecordingRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and call this operation to stop the production studio. When a production studio is stopped, its PVW and PGM scenes are stopped.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopCaster  StopCasterRequest
     * @return StopCasterResponse
     */
    CompletableFuture<StopCasterResponse> stopCaster(StopCasterRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage note</h2>
     * <p>This operation is only applicable to the PVW scenes.</p>
     * 
     * @param request the request parameters of StopCasterScene  StopCasterSceneRequest
     * @return StopCasterSceneResponse
     */
    CompletableFuture<StopCasterSceneResponse> stopCasterScene(StopCasterSceneRequest request);

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
    CompletableFuture<StopEdgeTranscodeJobResponse> stopEdgeTranscodeJob(StopEdgeTranscodeJobRequest request);

    /**
     * <b>description</b> :
     * <p>After you disable a domain name, the information about the domain name is retained. ApsaraVideo Live automatically reroutes all requests that are destined for the domain name to the origin.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopLiveDomain  StopLiveDomainRequest
     * @return StopLiveDomainResponse
     */
    CompletableFuture<StopLiveDomainResponse> stopLiveDomain(StopLiveDomainRequest request);

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
    CompletableFuture<StopLiveMPUTaskResponse> stopLiveMPUTask(StopLiveMPUTaskRequest request);

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
    CompletableFuture<StopLivePullToPushResponse> stopLivePullToPush(StopLivePullToPushRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to stop live monitoring, make sure that live monitoring is started. You can call the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation to create a monitoring session, obtain the value of the response parameter <strong>MonitorId</strong>, and then start live monitoring.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopLiveStreamMonitor  StopLiveStreamMonitorRequest
     * @return StopLiveStreamMonitorResponse
     */
    CompletableFuture<StopLiveStreamMonitorResponse> stopLiveStreamMonitor(StopLiveStreamMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation to add episodes to an episode list and then call this operation to stop playing the episode list.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopPlaylist  StopPlaylistRequest
     * @return StopPlaylistResponse
     */
    CompletableFuture<StopPlaylistResponse> stopPlaylist(StopPlaylistRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StopRtcAsrTask  StopRtcAsrTaskRequest
     * @return StopRtcAsrTaskResponse
     */
    CompletableFuture<StopRtcAsrTaskResponse> stopRtcAsrTask(StopRtcAsrTaskRequest request);

    /**
     * @param request the request parameters of StopRtcCloudRecording  StopRtcCloudRecordingRequest
     * @return StopRtcCloudRecordingResponse
     */
    CompletableFuture<StopRtcCloudRecordingResponse> stopRtcCloudRecording(StopRtcCloudRecordingRequest request);

    /**
     * <b>description</b> :
     * <p>The key of the tag. Valid values of N: <strong>1 to 20</strong>.</p>
     * 
     * @param request the request parameters of TagLiveResources  TagLiveResourcesRequest
     * @return TagLiveResourcesResponse
     */
    CompletableFuture<TagLiveResourcesResponse> tagLiveResources(TagLiveResourcesRequest request);

    /**
     * @param request the request parameters of UnTagLiveResources  UnTagLiveResourcesRequest
     * @return UnTagLiveResourcesResponse
     */
    CompletableFuture<UnTagLiveResourcesResponse> unTagLiveResources(UnTagLiveResourcesRequest request);

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
    CompletableFuture<UnbanLiveMessageGroupResponse> unbanLiveMessageGroup(UnbanLiveMessageGroupRequest request);

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
    CompletableFuture<UpdateCasterResourceGroupResponse> updateCasterResourceGroup(UpdateCasterResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation to create a production studio and then call this operation to modify the audio configurations of a scene in the production studio. This operation supports the audio mixing mode and the audio follows video (AFV) mode.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateCasterSceneAudio  UpdateCasterSceneAudioRequest
     * @return UpdateCasterSceneAudioResponse
     */
    CompletableFuture<UpdateCasterSceneAudioResponse> updateCasterSceneAudio(UpdateCasterSceneAudioRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a scene, including the layout, without invalidating the previous configurations. This operation is more efficient than the SetCasterSceneConfig operation.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateCasterSceneConfig  UpdateCasterSceneConfigRequest
     * @return UpdateCasterSceneConfigResponse
     */
    CompletableFuture<UpdateCasterSceneConfigResponse> updateCasterSceneConfig(UpdateCasterSceneConfigRequest request);

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
    CompletableFuture<UpdateCustomLiveStreamTranscodeResponse> updateCustomLiveStreamTranscode(UpdateCustomLiveStreamTranscodeRequest request);

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
    CompletableFuture<UpdateEdgeTranscodeJobResponse> updateEdgeTranscodeJob(UpdateEdgeTranscodeJobRequest request);

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
    CompletableFuture<UpdateEventSubResponse> updateEventSub(UpdateEventSubRequest request);

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
    CompletableFuture<UpdateLiveAIProduceRulesResponse> updateLiveAIProduceRules(UpdateLiveAIProduceRulesRequest request);

    /**
     * @param request the request parameters of UpdateLiveAISubtitle  UpdateLiveAISubtitleRequest
     * @return UpdateLiveAISubtitleResponse
     */
    CompletableFuture<UpdateLiveAISubtitleResponse> updateLiveAISubtitle(UpdateLiveAISubtitleRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the main streaming domain, and then call this operation to update a recording configuration.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveAppRecordConfig  UpdateLiveAppRecordConfigRequest
     * @return UpdateLiveAppRecordConfigResponse
     */
    CompletableFuture<UpdateLiveAppRecordConfigResponse> updateLiveAppRecordConfig(UpdateLiveAppRecordConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a snapshot configuration of a streaming domain. The captured snapshots are stored in OSS. The modification takes effect after you restart stream ingest.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveAppSnapshotConfig  UpdateLiveAppSnapshotConfigRequest
     * @return UpdateLiveAppSnapshotConfigResponse
     */
    CompletableFuture<UpdateLiveAppSnapshotConfigResponse> updateLiveAppSnapshotConfig(UpdateLiveAppSnapshotConfigRequest request);

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
    CompletableFuture<UpdateLiveAudioAuditConfigResponse> updateLiveAudioAuditConfig(UpdateLiveAudioAuditConfigRequest request);

    /**
     * @param request the request parameters of UpdateLiveAudioAuditNotifyConfig  UpdateLiveAudioAuditNotifyConfigRequest
     * @return UpdateLiveAudioAuditNotifyConfigResponse
     */
    CompletableFuture<UpdateLiveAudioAuditNotifyConfigResponse> updateLiveAudioAuditNotifyConfig(UpdateLiveAudioAuditNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify only the <strong>time-related</strong> parameters, including TransferArgs, StartTime, and EndTime.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveCenterTransfer  UpdateLiveCenterTransferRequest
     * @return UpdateLiveCenterTransferResponse
     */
    CompletableFuture<UpdateLiveCenterTransferResponse> updateLiveCenterTransfer(UpdateLiveCenterTransferRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateLiveDelayConfig  UpdateLiveDelayConfigRequest
     * @return UpdateLiveDelayConfigResponse
     */
    CompletableFuture<UpdateLiveDelayConfigResponse> updateLiveDelayConfig(UpdateLiveDelayConfigRequest request);

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
    CompletableFuture<UpdateLiveDetectNotifyConfigResponse> updateLiveDetectNotifyConfig(UpdateLiveDetectNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that a mixed-stream relay task is created before you call this operation. You can call the <a href="https://help.aliyun.com/document_detail/2848199.html">StartLiveMPUTask</a> operation to create a mixed-stream relay task.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveMPUTask  UpdateLiveMPUTaskRequest
     * @return UpdateLiveMPUTaskResponse
     */
    CompletableFuture<UpdateLiveMPUTaskResponse> updateLiveMPUTask(UpdateLiveMPUTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update a live stream encapsulation configuration. The update takes effect only after you re-ingest the stream.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 300 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLivePackageConfig  UpdateLivePackageConfigRequest
     * @return UpdateLivePackageConfigResponse
     */
    CompletableFuture<UpdateLivePackageConfigResponse> updateLivePackageConfig(UpdateLivePackageConfigRequest request);

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
    CompletableFuture<UpdateLivePullStreamInfoConfigResponse> updateLivePullStreamInfoConfig(UpdateLivePullStreamInfoConfigRequest request);

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
    CompletableFuture<UpdateLivePullToPushResponse> updateLivePullToPush(UpdateLivePullToPushRequest request);

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
    CompletableFuture<UpdateLiveRecordNotifyConfigResponse> updateLiveRecordNotifyConfig(UpdateLiveRecordNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 1,000 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveRecordVodConfig  UpdateLiveRecordVodConfigRequest
     * @return UpdateLiveRecordVodConfigResponse
     */
    CompletableFuture<UpdateLiveRecordVodConfigResponse> updateLiveRecordVodConfig(UpdateLiveRecordVodConfigRequest request);

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
    CompletableFuture<UpdateLiveSnapshotDetectPornConfigResponse> updateLiveSnapshotDetectPornConfig(UpdateLiveSnapshotDetectPornConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveSnapshotNotifyConfig  UpdateLiveSnapshotNotifyConfigRequest
     * @return UpdateLiveSnapshotNotifyConfigResponse
     */
    CompletableFuture<UpdateLiveSnapshotNotifyConfigResponse> updateLiveSnapshotNotifyConfig(UpdateLiveSnapshotNotifyConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the configurations of a monitoring session. The updates that you make to the input source configurations when the monitoring session is in the Running state immediately take effect.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveStreamMonitor  UpdateLiveStreamMonitorRequest
     * @return UpdateLiveStreamMonitorResponse
     */
    CompletableFuture<UpdateLiveStreamMonitorResponse> updateLiveStreamMonitor(UpdateLiveStreamMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>You must obtain the customer master key (CMK) in Key Management Service (KMS) before you call this operation to update a transcoding configuration. Only standard transcoding templates and Narrowband HD™ transcoding templates are supported for this operation.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 30 times per second per account.</p>
     * 
     * @param request the request parameters of UpdateLiveStreamTranscode  UpdateLiveStreamTranscodeRequest
     * @return UpdateLiveStreamTranscodeResponse
     */
    CompletableFuture<UpdateLiveStreamTranscodeResponse> updateLiveStreamTranscode(UpdateLiveStreamTranscodeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to modify the parameters of a watermark template with a specified ID.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-live/latest/qps-limit-on-an-api-operation-in-apsaravideo-live">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of UpdateLiveStreamWatermark  UpdateLiveStreamWatermarkRequest
     * @return UpdateLiveStreamWatermarkResponse
     */
    CompletableFuture<UpdateLiveStreamWatermarkResponse> updateLiveStreamWatermark(UpdateLiveStreamWatermarkRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to modify the parameters of a watermark rule with a specified ID.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 60 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateLiveStreamWatermarkRule  UpdateLiveStreamWatermarkRuleRequest
     * @return UpdateLiveStreamWatermarkRuleResponse
     */
    CompletableFuture<UpdateLiveStreamWatermarkRuleResponse> updateLiveStreamWatermarkRule(UpdateLiveStreamWatermarkRuleRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of UpdateMessageApp  UpdateMessageAppRequest
     * @return UpdateMessageAppResponse
     */
    CompletableFuture<UpdateMessageAppResponse> updateMessageApp(UpdateMessageAppRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limit on an API operation in ApsaraVideo Live</a>.</p>
     * 
     * @param request the request parameters of UpdateMessageGroup  UpdateMessageGroupRequest
     * @return UpdateMessageGroupResponse
     */
    CompletableFuture<UpdateMessageGroupResponse> updateMessageGroup(UpdateMessageGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update a stream mixing task. This operation allows you to modify the input sources and layout, but not other parameters such as the output resolution.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateMixStream  UpdateMixStreamRequest
     * @return UpdateMixStreamResponse
     */
    CompletableFuture<UpdateMixStreamResponse> updateMixStream(UpdateMixStreamRequest request);

    /**
     * @param request the request parameters of UpdateRtcCloudRecording  UpdateRtcCloudRecordingRequest
     * @return UpdateRtcCloudRecordingResponse
     */
    CompletableFuture<UpdateRtcCloudRecordingResponse> updateRtcCloudRecording(UpdateRtcCloudRecordingRequest request);

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
    CompletableFuture<UpdateRtcMPUEventSubResponse> updateRtcMPUEventSub(UpdateRtcMPUEventSubRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports the following types of custom transcoding templates: h264, h264-nbhd, h264-origin, and audio.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account.</p>
     * 
     * @param request the request parameters of UpdateRtsLiveStreamTranscode  UpdateRtsLiveStreamTranscodeRequest
     * @return UpdateRtsLiveStreamTranscodeResponse
     */
    CompletableFuture<UpdateRtsLiveStreamTranscodeResponse> updateRtsLiveStreamTranscode(UpdateRtsLiveStreamTranscodeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/343507.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of VerifyLiveDomainOwner  VerifyLiveDomainOwnerRequest
     * @return VerifyLiveDomainOwnerResponse
     */
    CompletableFuture<VerifyLiveDomainOwnerResponse> verifyLiveDomainOwner(VerifyLiveDomainOwnerRequest request);

}
