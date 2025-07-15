// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetCasterConfigRequest} extends {@link RequestModel}
 *
 * <p>SetCasterConfigRequest</p>
 */
public class SetCasterConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoSwitchUrgentConfig")
    private String autoSwitchUrgentConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoSwitchUrgentOn")
    private Boolean autoSwitchUrgentOn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterName")
    private String casterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelEnable")
    private Integer channelEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Delay")
    private Float delay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramEffect")
    private Integer programEffect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramName")
    private String programName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordConfig")
    private String recordConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SideOutputUrl")
    private String sideOutputUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SideOutputUrlList")
    private String sideOutputUrlList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncGroupsConfig")
    private String syncGroupsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeConfig")
    private String transcodeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrgentImageId")
    private String urgentImageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrgentImageUrl")
    private String urgentImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrgentLiveStreamUrl")
    private String urgentLiveStreamUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrgentMaterialId")
    private String urgentMaterialId;

    private SetCasterConfigRequest(Builder builder) {
        super(builder);
        this.autoSwitchUrgentConfig = builder.autoSwitchUrgentConfig;
        this.autoSwitchUrgentOn = builder.autoSwitchUrgentOn;
        this.callbackUrl = builder.callbackUrl;
        this.casterId = builder.casterId;
        this.casterName = builder.casterName;
        this.channelEnable = builder.channelEnable;
        this.delay = builder.delay;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.programEffect = builder.programEffect;
        this.programName = builder.programName;
        this.recordConfig = builder.recordConfig;
        this.regionId = builder.regionId;
        this.sideOutputUrl = builder.sideOutputUrl;
        this.sideOutputUrlList = builder.sideOutputUrlList;
        this.syncGroupsConfig = builder.syncGroupsConfig;
        this.transcodeConfig = builder.transcodeConfig;
        this.urgentImageId = builder.urgentImageId;
        this.urgentImageUrl = builder.urgentImageUrl;
        this.urgentLiveStreamUrl = builder.urgentLiveStreamUrl;
        this.urgentMaterialId = builder.urgentMaterialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCasterConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSwitchUrgentConfig
     */
    public String getAutoSwitchUrgentConfig() {
        return this.autoSwitchUrgentConfig;
    }

    /**
     * @return autoSwitchUrgentOn
     */
    public Boolean getAutoSwitchUrgentOn() {
        return this.autoSwitchUrgentOn;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return casterName
     */
    public String getCasterName() {
        return this.casterName;
    }

    /**
     * @return channelEnable
     */
    public Integer getChannelEnable() {
        return this.channelEnable;
    }

    /**
     * @return delay
     */
    public Float getDelay() {
        return this.delay;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return programEffect
     */
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    /**
     * @return programName
     */
    public String getProgramName() {
        return this.programName;
    }

    /**
     * @return recordConfig
     */
    public String getRecordConfig() {
        return this.recordConfig;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sideOutputUrl
     */
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    /**
     * @return sideOutputUrlList
     */
    public String getSideOutputUrlList() {
        return this.sideOutputUrlList;
    }

    /**
     * @return syncGroupsConfig
     */
    public String getSyncGroupsConfig() {
        return this.syncGroupsConfig;
    }

    /**
     * @return transcodeConfig
     */
    public String getTranscodeConfig() {
        return this.transcodeConfig;
    }

    /**
     * @return urgentImageId
     */
    public String getUrgentImageId() {
        return this.urgentImageId;
    }

    /**
     * @return urgentImageUrl
     */
    public String getUrgentImageUrl() {
        return this.urgentImageUrl;
    }

    /**
     * @return urgentLiveStreamUrl
     */
    public String getUrgentLiveStreamUrl() {
        return this.urgentLiveStreamUrl;
    }

    /**
     * @return urgentMaterialId
     */
    public String getUrgentMaterialId() {
        return this.urgentMaterialId;
    }

    public static final class Builder extends Request.Builder<SetCasterConfigRequest, Builder> {
        private String autoSwitchUrgentConfig; 
        private Boolean autoSwitchUrgentOn; 
        private String callbackUrl; 
        private String casterId; 
        private String casterName; 
        private Integer channelEnable; 
        private Float delay; 
        private String domainName; 
        private Long ownerId; 
        private Integer programEffect; 
        private String programName; 
        private String recordConfig; 
        private String regionId; 
        private String sideOutputUrl; 
        private String sideOutputUrlList; 
        private String syncGroupsConfig; 
        private String transcodeConfig; 
        private String urgentImageId; 
        private String urgentImageUrl; 
        private String urgentLiveStreamUrl; 
        private String urgentMaterialId; 

        private Builder() {
            super();
        } 

        private Builder(SetCasterConfigRequest request) {
            super(request);
            this.autoSwitchUrgentConfig = request.autoSwitchUrgentConfig;
            this.autoSwitchUrgentOn = request.autoSwitchUrgentOn;
            this.callbackUrl = request.callbackUrl;
            this.casterId = request.casterId;
            this.casterName = request.casterName;
            this.channelEnable = request.channelEnable;
            this.delay = request.delay;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.programEffect = request.programEffect;
            this.programName = request.programName;
            this.recordConfig = request.recordConfig;
            this.regionId = request.regionId;
            this.sideOutputUrl = request.sideOutputUrl;
            this.sideOutputUrlList = request.sideOutputUrlList;
            this.syncGroupsConfig = request.syncGroupsConfig;
            this.transcodeConfig = request.transcodeConfig;
            this.urgentImageId = request.urgentImageId;
            this.urgentImageUrl = request.urgentImageUrl;
            this.urgentLiveStreamUrl = request.urgentLiveStreamUrl;
            this.urgentMaterialId = request.urgentMaterialId;
        } 

        /**
         * <p>The configuration for automatic switchover to the standby resource.</p>
         * <p>The <code>eofThres</code> field specifies the duration after which the production studio automatically switches to the standby resource if a stream interruption occurs. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;eofThres&quot;:3}</p>
         */
        public Builder autoSwitchUrgentConfig(String autoSwitchUrgentConfig) {
            this.putQueryParameter("AutoSwitchUrgentConfig", autoSwitchUrgentConfig);
            this.autoSwitchUrgentConfig = autoSwitchUrgentConfig;
            return this;
        }

        /**
         * <p>Specifies whether the production studio automatically switches to the standby resource in case of a stream interruption.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoSwitchUrgentOn(Boolean autoSwitchUrgentOn) {
            this.putQueryParameter("AutoSwitchUrgentOn", autoSwitchUrgentOn);
            this.autoSwitchUrgentOn = autoSwitchUrgentOn;
            return this;
        }

        /**
         * <p>The callback URL. Enter a valid HTTP address for receiving callback notifications. If you do not specify this parameter, the production studio does not send callback notifications.</p>
         * <blockquote>
         * <p> For more information about production studio callbacks, see <a href="https://help.aliyun.com/document_detail/213633.html">Production studio callbacks</a>.</p>
         * </blockquote>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The ID of the production studio.</p>
         * <ul>
         * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
         * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
         * </ul>
         * <blockquote>
         * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The name of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>liveCaster****</p>
         */
        public Builder casterName(String casterName) {
            this.putQueryParameter("CasterName", casterName);
            this.casterName = casterName;
            return this;
        }

        /**
         * <p>Specifies whether to enable channels. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): disables channels.</li>
         * <li><strong>1</strong>: enables channels.</li>
         * </ul>
         * <blockquote>
         * <p>You cannot disable channels after you enable them. If you set this parameter to 0, the production studio references video resources in a layout without using channels. If you enable channels for the first time, make sure that the production studio is in the idle state. After you enable channels, a new layout that references video resources by using channels is generated to replace the original one. Therefore, you must specify video resources for channels. You can use the channels to change the playback progress or status. If the video resource, preview, and program modules of the production studio use the same video source, the three modules display the same content.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder channelEnable(Integer channelEnable) {
            this.putQueryParameter("ChannelEnable", channelEnable);
            this.channelEnable = channelEnable;
            return this;
        }

        /**
         * <p>Specifies whether to enable stream delay. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong> (default): disables stream delay.</p>
         * </li>
         * <li><p><strong>A value greater than 0</strong>: enables stream delay.</p>
         * </li>
         * <li><p><strong>Empty</strong>: clears the stream delay configuration.</p>
         * <p>**</p>
         * <p>**Note **The maximum value can be 300 seconds.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delay(Float delay) {
            this.putQueryParameter("Delay", delay);
            this.delay = delay;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>Complete the configuration of the domain name before the production studio is started. If you do not specify this parameter, the domain configuration for the production studio is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the carousel playback feature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disables carousel playback.</li>
         * <li><strong>1</strong>: enables carousel playback.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder programEffect(Integer programEffect) {
            this.putQueryParameter("ProgramEffect", programEffect);
            this.programEffect = programEffect;
            return this;
        }

        /**
         * <p>The name of the playlist for carousel playback. You can specify this parameter if you enable the carousel playback feature.</p>
         * 
         * <strong>example:</strong>
         * <p>program_name</p>
         */
        public Builder programName(String programName) {
            this.putQueryParameter("ProgramName", programName);
            this.programName = programName;
            return this;
        }

        /**
         * <p>The recording configuration. The value is a JSON string. You can configure the following fields:</p>
         * <ul>
         * <li><strong>endpoint</strong>: the API server address of an Alibaba Cloud service.</li>
         * <li><strong>ossBucket</strong>: the name of the Object Storage Service (OSS) bucket.</li>
         * <li><strong>videoFormat</strong>: the format in which the video file can be exported. Example: <code>[{\&quot;OssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{StartTime}_{EndTime}\&quot;,\&quot;Format\&quot;:\&quot;m3u8\&quot;,\&quot;CycleDuration\&quot;:21600,\&quot;SliceOssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{UnixTimestamp}\&quot;},{\&quot;OssObjectPrefix\&quot;:\&quot;record/{AppName}/{StreamName}/{StartTime}_{EndTime}\&quot;,\&quot;Format\&quot;:\&quot;flv\&quot;,\&quot;CycleDuration\&quot;:21600}]</code>.</li>
         * <li><strong>interval</strong>: the interval between recordings. Unit: milliseconds.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the recording feature is disabled and the recording configuration for the production studio is cleared.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;endpoint&quot;: &quot;<a href="http://oss-cn-********.aliyuncs.com/api">http://oss-cn-********.aliyuncs.com/api</a>&quot;,  &quot;ossBucket****&quot;: &quot;liveBucket****&quot;, &quot;VideoFormat&quot;:[{&quot;OssObjectPrefix&quot;:&quot;record/{AppName}/{StreamName}/{StartTime}<em>{EndTime}&quot;,&quot;Format&quot;:&quot;m3u8&quot;,&quot;CycleDuration&quot;:21600,&quot;SliceOssObjectPrefix&quot;:&quot;record/{AppName}/{StreamName}/{UnixTimestamp}&quot;},{&quot;OssObjectPrefix&quot;:&quot;record/{AppName}/{StreamName}/{StartTime}</em>{EndTime}&quot;,&quot;Format&quot;:&quot;flv&quot;,&quot;CycleDuration&quot;:21600}] &quot;interval&quot;: 5 }</p>
         */
        public Builder recordConfig(String recordConfig) {
            this.putQueryParameter("RecordConfig", recordConfig);
            this.recordConfig = recordConfig;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The custom stream redirect URL.</p>
         * <p>If you do not specify this parameter, the production studio uses the redirect URL generated by the system.</p>
         * <blockquote>
         * <p>Redirect URLs support only the Real-Time Messaging Protocol (RTMP) protocol.</p>
         * </blockquote>
         */
        public Builder sideOutputUrl(String sideOutputUrl) {
            this.putQueryParameter("SideOutputUrl", sideOutputUrl);
            this.sideOutputUrl = sideOutputUrl;
            return this;
        }

        /**
         * <p>The stream relay URLs. A relay URL can be an Alibaba Cloud URL or a URL from a third-party CDN provider. You can specify up to 20 relay URLs over the RTMP protocol.</p>
         * <blockquote>
         * <p>Use the following format to specify multiple relay URLs: &quot;rtmp://domain/app1/stream1&quot;,&quot;rtmp://domain/app2/stream2&quot;.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rtmp://domain/app/stream?***</p>
         */
        public Builder sideOutputUrlList(String sideOutputUrlList) {
            this.putQueryParameter("SideOutputUrlList", sideOutputUrlList);
            this.sideOutputUrlList = sideOutputUrlList;
            return this;
        }

        /**
         * <p>The multi-view synchronization configuration. You can specify this parameter to synchronize multiple video sources.</p>
         * <p>There are two modes of multi-view synchronization.</p>
         * <ul>
         * <li>A value of 0 for the mode field specifies the streamer mode. In this mode, multiple video sources are synchronized based on the settings by the streamer.</li>
         * <li>A value of 1 for the mode field specifies the conference mode. In this mode, all video sources are synchronized.</li>
         * </ul>
         * <p>In the streamer mode, the hostResourceId field specifies the video source on the streamer side.</p>
         * <p>In the conference mode, the hostResourceId field is not available. You need to provide only resource IDs that are required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[{&quot;mode&quot;:0,&quot;resourceIds&quot;:[&quot;5a6c1c33-8424-46f6-813c-c152220a****&quot;,&quot;4e6521dc-a40a-4077-b6bf-1fb12a76****&quot;],&quot;hostResourceId&quot;:&quot;3aa2b39a-fd0e-4b8c-be73-b7af31c4****&quot;}]&quot;</p>
         */
        public Builder syncGroupsConfig(String syncGroupsConfig) {
            this.putQueryParameter("SyncGroupsConfig", syncGroupsConfig);
            this.syncGroupsConfig = syncGroupsConfig;
            return this;
        }

        /**
         * <p>The transcoding configuration.</p>
         * <p>The value is a JSON string. Use upper camel case for fields of the string. If you do not specify this parameter, the transcoding configuration is cleared. If no transcoding template is available, an error occurs when the production studio is started.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;casterTemplate&quot;: &quot;lp_ld&quot;}</p>
         */
        public Builder transcodeConfig(String transcodeConfig) {
            this.putQueryParameter("TranscodeConfig", transcodeConfig);
            this.transcodeConfig = transcodeConfig;
            return this;
        }

        /**
         * <p>The ID of the standby image from the media library.</p>
         * 
         * <strong>example:</strong>
         * <p>a089175eb5f4427684fc0715159a****</p>
         */
        public Builder urgentImageId(String urgentImageId) {
            this.putQueryParameter("UrgentImageId", urgentImageId);
            this.urgentImageId = urgentImageId;
            return this;
        }

        /**
         * <p>The URL of the standby image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
         */
        public Builder urgentImageUrl(String urgentImageUrl) {
            this.putQueryParameter("UrgentImageUrl", urgentImageUrl);
            this.urgentImageUrl = urgentImageUrl;
            return this;
        }

        /**
         * <p>The URL of the standby live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://demo.aliyundoc.com</p>
         */
        public Builder urgentLiveStreamUrl(String urgentLiveStreamUrl) {
            this.putQueryParameter("UrgentLiveStreamUrl", urgentLiveStreamUrl);
            this.urgentLiveStreamUrl = urgentLiveStreamUrl;
            return this;
        }

        /**
         * <p>The ID of the standby video from the media library. If you do not specify this parameter, the standby video configuration for the production studio is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671</p>
         */
        public Builder urgentMaterialId(String urgentMaterialId) {
            this.putQueryParameter("UrgentMaterialId", urgentMaterialId);
            this.urgentMaterialId = urgentMaterialId;
            return this;
        }

        @Override
        public SetCasterConfigRequest build() {
            return new SetCasterConfigRequest(this);
        } 

    } 

}
