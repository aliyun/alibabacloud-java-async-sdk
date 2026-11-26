// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link StartMPUTaskRequest} extends {@link RequestModel}
 *
 * <p>StartMPUTaskRequest</p>
 */
public class StartMPUTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackgroundColor")
    private Integer backgroundColor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Backgrounds")
    private java.util.List<Backgrounds> backgrounds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClockWidgets")
    private java.util.List<ClockWidgets> clockWidgets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CropMode")
    private Integer cropMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnhancedParam")
    private EnhancedParam enhancedParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutIds")
    private java.util.List<Long> layoutIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaEncode")
    private Integer mediaEncode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixMode")
    private Integer mixMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayloadType")
    private Integer payloadType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportVad")
    private Integer reportVad;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RtpExtInfo")
    private Integer rtpExtInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamType")
    private Integer streamType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamURL")
    private String streamURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSpecAudioUsers")
    private java.util.List<String> subSpecAudioUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSpecCameraUsers")
    private java.util.List<String> subSpecCameraUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSpecShareScreenUsers")
    private java.util.List<String> subSpecShareScreenUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSpecUsers")
    private java.util.List<String> subSpecUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStampRef")
    private Long timeStampRef;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnsubSpecAudioUsers")
    private java.util.List<String> unsubSpecAudioUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnsubSpecCameraUsers")
    private java.util.List<String> unsubSpecCameraUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnsubSpecShareScreenUsers")
    private java.util.List<String> unsubSpecShareScreenUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPanes")
    private java.util.List<UserPanes> userPanes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VadInterval")
    private Long vadInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Watermarks")
    private java.util.List<Watermarks> watermarks;

    private StartMPUTaskRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.backgroundColor = builder.backgroundColor;
        this.backgrounds = builder.backgrounds;
        this.channelId = builder.channelId;
        this.clockWidgets = builder.clockWidgets;
        this.cropMode = builder.cropMode;
        this.enhancedParam = builder.enhancedParam;
        this.layoutIds = builder.layoutIds;
        this.mediaEncode = builder.mediaEncode;
        this.mixMode = builder.mixMode;
        this.ownerId = builder.ownerId;
        this.payloadType = builder.payloadType;
        this.reportVad = builder.reportVad;
        this.rtpExtInfo = builder.rtpExtInfo;
        this.sourceType = builder.sourceType;
        this.streamType = builder.streamType;
        this.streamURL = builder.streamURL;
        this.subSpecAudioUsers = builder.subSpecAudioUsers;
        this.subSpecCameraUsers = builder.subSpecCameraUsers;
        this.subSpecShareScreenUsers = builder.subSpecShareScreenUsers;
        this.subSpecUsers = builder.subSpecUsers;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
        this.timeStampRef = builder.timeStampRef;
        this.unsubSpecAudioUsers = builder.unsubSpecAudioUsers;
        this.unsubSpecCameraUsers = builder.unsubSpecCameraUsers;
        this.unsubSpecShareScreenUsers = builder.unsubSpecShareScreenUsers;
        this.userPanes = builder.userPanes;
        this.vadInterval = builder.vadInterval;
        this.watermarks = builder.watermarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartMPUTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return backgroundColor
     */
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * @return backgrounds
     */
    public java.util.List<Backgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return clockWidgets
     */
    public java.util.List<ClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    /**
     * @return cropMode
     */
    public Integer getCropMode() {
        return this.cropMode;
    }

    /**
     * @return enhancedParam
     */
    public EnhancedParam getEnhancedParam() {
        return this.enhancedParam;
    }

    /**
     * @return layoutIds
     */
    public java.util.List<Long> getLayoutIds() {
        return this.layoutIds;
    }

    /**
     * @return mediaEncode
     */
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    /**
     * @return mixMode
     */
    public Integer getMixMode() {
        return this.mixMode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payloadType
     */
    public Integer getPayloadType() {
        return this.payloadType;
    }

    /**
     * @return reportVad
     */
    public Integer getReportVad() {
        return this.reportVad;
    }

    /**
     * @return rtpExtInfo
     */
    public Integer getRtpExtInfo() {
        return this.rtpExtInfo;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    /**
     * @return streamURL
     */
    public String getStreamURL() {
        return this.streamURL;
    }

    /**
     * @return subSpecAudioUsers
     */
    public java.util.List<String> getSubSpecAudioUsers() {
        return this.subSpecAudioUsers;
    }

    /**
     * @return subSpecCameraUsers
     */
    public java.util.List<String> getSubSpecCameraUsers() {
        return this.subSpecCameraUsers;
    }

    /**
     * @return subSpecShareScreenUsers
     */
    public java.util.List<String> getSubSpecShareScreenUsers() {
        return this.subSpecShareScreenUsers;
    }

    /**
     * @return subSpecUsers
     */
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    /**
     * @return timeStampRef
     */
    public Long getTimeStampRef() {
        return this.timeStampRef;
    }

    /**
     * @return unsubSpecAudioUsers
     */
    public java.util.List<String> getUnsubSpecAudioUsers() {
        return this.unsubSpecAudioUsers;
    }

    /**
     * @return unsubSpecCameraUsers
     */
    public java.util.List<String> getUnsubSpecCameraUsers() {
        return this.unsubSpecCameraUsers;
    }

    /**
     * @return unsubSpecShareScreenUsers
     */
    public java.util.List<String> getUnsubSpecShareScreenUsers() {
        return this.unsubSpecShareScreenUsers;
    }

    /**
     * @return userPanes
     */
    public java.util.List<UserPanes> getUserPanes() {
        return this.userPanes;
    }

    /**
     * @return vadInterval
     */
    public Long getVadInterval() {
        return this.vadInterval;
    }

    /**
     * @return watermarks
     */
    public java.util.List<Watermarks> getWatermarks() {
        return this.watermarks;
    }

    public static final class Builder extends Request.Builder<StartMPUTaskRequest, Builder> {
        private String appId; 
        private Integer backgroundColor; 
        private java.util.List<Backgrounds> backgrounds; 
        private String channelId; 
        private java.util.List<ClockWidgets> clockWidgets; 
        private Integer cropMode; 
        private EnhancedParam enhancedParam; 
        private java.util.List<Long> layoutIds; 
        private Integer mediaEncode; 
        private Integer mixMode; 
        private Long ownerId; 
        private Integer payloadType; 
        private Integer reportVad; 
        private Integer rtpExtInfo; 
        private String sourceType; 
        private Integer streamType; 
        private String streamURL; 
        private java.util.List<String> subSpecAudioUsers; 
        private java.util.List<String> subSpecCameraUsers; 
        private java.util.List<String> subSpecShareScreenUsers; 
        private java.util.List<String> subSpecUsers; 
        private String taskId; 
        private Integer taskType; 
        private Long timeStampRef; 
        private java.util.List<String> unsubSpecAudioUsers; 
        private java.util.List<String> unsubSpecCameraUsers; 
        private java.util.List<String> unsubSpecShareScreenUsers; 
        private java.util.List<UserPanes> userPanes; 
        private Long vadInterval; 
        private java.util.List<Watermarks> watermarks; 

        private Builder() {
            super();
        } 

        private Builder(StartMPUTaskRequest request) {
            super(request);
            this.appId = request.appId;
            this.backgroundColor = request.backgroundColor;
            this.backgrounds = request.backgrounds;
            this.channelId = request.channelId;
            this.clockWidgets = request.clockWidgets;
            this.cropMode = request.cropMode;
            this.enhancedParam = request.enhancedParam;
            this.layoutIds = request.layoutIds;
            this.mediaEncode = request.mediaEncode;
            this.mixMode = request.mixMode;
            this.ownerId = request.ownerId;
            this.payloadType = request.payloadType;
            this.reportVad = request.reportVad;
            this.rtpExtInfo = request.rtpExtInfo;
            this.sourceType = request.sourceType;
            this.streamType = request.streamType;
            this.streamURL = request.streamURL;
            this.subSpecAudioUsers = request.subSpecAudioUsers;
            this.subSpecCameraUsers = request.subSpecCameraUsers;
            this.subSpecShareScreenUsers = request.subSpecShareScreenUsers;
            this.subSpecUsers = request.subSpecUsers;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
            this.timeStampRef = request.timeStampRef;
            this.unsubSpecAudioUsers = request.unsubSpecAudioUsers;
            this.unsubSpecCameraUsers = request.unsubSpecCameraUsers;
            this.unsubSpecShareScreenUsers = request.unsubSpecShareScreenUsers;
            this.userPanes = request.userPanes;
            this.vadInterval = request.vadInterval;
            this.watermarks = request.watermarks;
        } 

        /**
         * <p>The application ID. Only a single ID is supported.</p>
         * <p>You can create and query it in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The RGB value of the background color. Default value: <strong>0</strong> (black).</p>
         * <p>The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): 0 to 255.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder backgroundColor(Integer backgroundColor) {
            this.putQueryParameter("BackgroundColor", backgroundColor);
            this.backgroundColor = backgroundColor;
            return this;
        }

        /**
         * <p>The canvas background image panes.</p>
         */
        public Builder backgrounds(java.util.List<Backgrounds> backgrounds) {
            this.putQueryParameter("Backgrounds", backgrounds);
            this.backgrounds = backgrounds;
            return this;
        }

        /**
         * <p>The channel ID. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The clock widgets.</p>
         */
        public Builder clockWidgets(java.util.List<ClockWidgets> clockWidgets) {
            this.putQueryParameter("ClockWidgets", clockWidgets);
            this.clockWidgets = clockWidgets;
            return this;
        }

        /**
         * <p>The video cropping mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: crop while keeping the aspect ratio.</p>
         * </li>
         * <li><p><strong>2</strong>: keep the aspect ratio and add padding (default).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cropMode(Integer cropMode) {
            this.putQueryParameter("CropMode", cropMode);
            this.cropMode = cropMode;
            return this;
        }

        /**
         * <p>The enhanced parameters.</p>
         */
        public Builder enhancedParam(EnhancedParam enhancedParam) {
            this.putBodyParameter("EnhancedParam", enhancedParam);
            this.enhancedParam = enhancedParam;
            return this;
        }

        /**
         * <p>The layout IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder layoutIds(java.util.List<Long> layoutIds) {
            this.putQueryParameter("LayoutIds", layoutIds);
            this.layoutIds = layoutIds;
            return this;
        }

        /**
         * <p>The encoding options. For more information, see the MediaEncode enum values below.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder mediaEncode(Integer mediaEncode) {
            this.putQueryParameter("MediaEncode", mediaEncode);
            this.mediaEncode = mediaEncode;
            return this;
        }

        /**
         * <p>The mixed streaming mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: single-stream relay. The original single stream is relayed without mixed-stream transcoding. You do not need to configure mixed-stream transcoding parameters.</li>
         * <li><strong>1</strong>: mixed-stream transcoding (default). Mixed-stream transcoding output is supported.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Valid parameters in single-stream relay mode: <strong>StreamType</strong>, <strong>SourceType</strong>, and <strong>SubSpecUsers</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Valid parameters in mixed-stream transcoding mode: <strong>MediaEncode</strong>, <strong>LayoutIds</strong>, <strong>BackgroundColor</strong>, <strong>SubSpecUsers</strong>, <strong>CropMode</strong>, <strong>UserPanes</strong>, <strong>Backgrounds</strong>, and <strong>Watermarks</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder mixMode(Integer mixMode) {
            this.putQueryParameter("MixMode", mixMode);
            this.mixMode = mixMode;
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
         * <p>The payload type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: do not use a payload.</li>
         * <li><strong>1</strong>: use VideoSEI.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder payloadType(Integer payloadType) {
            this.putQueryParameter("PayloadType", payloadType);
            this.payloadType = payloadType;
            return this;
        }

        /**
         * <p>The voice activity detection (VAD) flag. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: do not pass VAD information.</li>
         * <li><strong>1</strong>: pass VAD information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder reportVad(Integer reportVad) {
            this.putQueryParameter("ReportVad", reportVad);
            this.reportVad = reportVad;
            return this;
        }

        /**
         * <p>The RTP extension header information. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: do not pass.</li>
         * <li><strong>1</strong>: pass.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder rtpExtInfo(Integer rtpExtInfo) {
            this.putQueryParameter("RtpExtInfo", rtpExtInfo);
            this.rtpExtInfo = rtpExtInfo;
            return this;
        }

        /**
         * <p>The user video input stream in single-stream relay mode. Valid values:</p>
         * <ul>
         * <li><strong>camera</strong>: camera.</li>
         * <li><strong>shareScreen</strong>: screen sharing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The stream type to relay in single-stream relay mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: relay the original stream.</li>
         * <li><strong>1</strong>: relay only the audio stream.</li>
         * <li><strong>2</strong>: relay only the video stream.</li>
         * </ul>
         * <p>By default, the original stream is relayed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * <p>The live streaming ingest URL. Only a single URL is supported. For more information about the generation rules, see <a href="https://help.aliyun.com/document_detail/199339.html">Ingest and streaming URLs</a>.</p>
         * <blockquote>
         * <ul>
         * <li>For domain names with hotlink protection authentication enabled, the ingest URL must include an authentication string.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The same StreamURL cannot be used simultaneously in different tasks.</li>
         * <li>The same StreamURL cannot be used within 10 seconds after a task is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/live/stream</p>
         */
        public Builder streamURL(String streamURL) {
            this.putQueryParameter("StreamURL", streamURL);
            this.streamURL = streamURL;
            return this;
        }

        /**
         * <p>Specifies the users whose audio streams are subscribed to in the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>audioUserID</p>
         */
        public Builder subSpecAudioUsers(java.util.List<String> subSpecAudioUsers) {
            this.putQueryParameter("SubSpecAudioUsers", subSpecAudioUsers);
            this.subSpecAudioUsers = subSpecAudioUsers;
            return this;
        }

        /**
         * <p>Specifies the users whose camera video streams are subscribed to in the channel.</p>
         */
        public Builder subSpecCameraUsers(java.util.List<String> subSpecCameraUsers) {
            this.putQueryParameter("SubSpecCameraUsers", subSpecCameraUsers);
            this.subSpecCameraUsers = subSpecCameraUsers;
            return this;
        }

        /**
         * <p>Specifies the users whose screen sharing video streams are subscribed to in the channel.</p>
         */
        public Builder subSpecShareScreenUsers(java.util.List<String> subSpecShareScreenUsers) {
            this.putQueryParameter("SubSpecShareScreenUsers", subSpecShareScreenUsers);
            this.subSpecShareScreenUsers = subSpecShareScreenUsers;
            return this;
        }

        /**
         * <p>Specifies the list of users to which the task subscribes.</p>
         * 
         * <strong>example:</strong>
         * <p>userID</p>
         */
        public Builder subSpecUsers(java.util.List<String> subSpecUsers) {
            this.putQueryParameter("SubSpecUsers", subSpecUsers);
            this.subSpecUsers = subSpecUsers;
            return this;
        }

        /**
         * <p>The task ID. Only a single ID is supported. The ID can contain letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
         * <blockquote>
         * <p>This ID identifies the bypass live streaming task and must be unique.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The media processing type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: bypass live streaming task.</li>
         * <li><strong>1</strong>: MCU mixed-stream low-latency distribution task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder taskType(Integer taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>15273582735</p>
         */
        public Builder timeStampRef(Long timeStampRef) {
            this.putQueryParameter("TimeStampRef", timeStampRef);
            this.timeStampRef = timeStampRef;
            return this;
        }

        /**
         * <p>Specifies the users whose audio streams are not subscribed to in the channel.</p>
         */
        public Builder unsubSpecAudioUsers(java.util.List<String> unsubSpecAudioUsers) {
            this.putQueryParameter("UnsubSpecAudioUsers", unsubSpecAudioUsers);
            this.unsubSpecAudioUsers = unsubSpecAudioUsers;
            return this;
        }

        /**
         * <p>Specifies the users whose camera video streams are not subscribed to in the channel.</p>
         */
        public Builder unsubSpecCameraUsers(java.util.List<String> unsubSpecCameraUsers) {
            this.putQueryParameter("UnsubSpecCameraUsers", unsubSpecCameraUsers);
            this.unsubSpecCameraUsers = unsubSpecCameraUsers;
            return this;
        }

        /**
         * <p>Specifies the users whose screen sharing video streams are not subscribed to in the channel.</p>
         */
        public Builder unsubSpecShareScreenUsers(java.util.List<String> unsubSpecShareScreenUsers) {
            this.putQueryParameter("UnsubSpecShareScreenUsers", unsubSpecShareScreenUsers);
            this.unsubSpecShareScreenUsers = unsubSpecShareScreenUsers;
            return this;
        }

        /**
         * <p>The layout parameters.</p>
         */
        public Builder userPanes(java.util.List<UserPanes> userPanes) {
            this.putQueryParameter("UserPanes", userPanes);
            this.userPanes = userPanes;
            return this;
        }

        /**
         * <p>The callback interval for voice activity detection.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder vadInterval(Long vadInterval) {
            this.putQueryParameter("VadInterval", vadInterval);
            this.vadInterval = vadInterval;
            return this;
        }

        /**
         * <p>The watermark image panes.</p>
         */
        public Builder watermarks(java.util.List<Watermarks> watermarks) {
            this.putQueryParameter("Watermarks", watermarks);
            this.watermarks = watermarks;
            return this;
        }

        @Override
        public StartMPUTaskRequest build() {
            return new StartMPUTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartMPUTaskRequest} extends {@link TeaModel}
     *
     * <p>StartMPUTaskRequest</p>
     */
    public static class Backgrounds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Integer display;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Backgrounds(Builder builder) {
            this.display = builder.display;
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backgrounds create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Integer getDisplay() {
            return this.display;
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Backgrounds model) {
                this.display = model.display;
                this.height = model.height;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>Specifies whether to display the image. Valid values:</p>
             * <ul>
             * <li><strong>0 (None)</strong>: not displayed.</li>
             * <li><strong>1 (Always)</strong>: always displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The height of the pane, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width of the pane, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The X-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Backgrounds build() {
                return new Backgrounds(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartMPUTaskRequest} extends {@link TeaModel}
     *
     * <p>StartMPUTaskRequest</p>
     */
    public static class ClockWidgets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Float alpha;

        @com.aliyun.core.annotation.NameInMap("BorderColor")
        private Long borderColor;

        @com.aliyun.core.annotation.NameInMap("BorderWidth")
        private Integer borderWidth;

        @com.aliyun.core.annotation.NameInMap("Box")
        private Boolean box;

        @com.aliyun.core.annotation.NameInMap("BoxBorderWidth")
        private Integer boxBorderWidth;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private Long boxColor;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private Integer fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("FontType")
        private Integer fontType;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private ClockWidgets(Builder builder) {
            this.alpha = builder.alpha;
            this.borderColor = builder.borderColor;
            this.borderWidth = builder.borderWidth;
            this.box = builder.box;
            this.boxBorderWidth = builder.boxBorderWidth;
            this.boxColor = builder.boxColor;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.fontType = builder.fontType;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClockWidgets create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Float getAlpha() {
            return this.alpha;
        }

        /**
         * @return borderColor
         */
        public Long getBorderColor() {
            return this.borderColor;
        }

        /**
         * @return borderWidth
         */
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        /**
         * @return box
         */
        public Boolean getBox() {
            return this.box;
        }

        /**
         * @return boxBorderWidth
         */
        public Integer getBoxBorderWidth() {
            return this.boxBorderWidth;
        }

        /**
         * @return boxColor
         */
        public Long getBoxColor() {
            return this.boxColor;
        }

        /**
         * @return fontColor
         */
        public Integer getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return fontType
         */
        public Integer getFontType() {
            return this.fontType;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Float alpha; 
            private Long borderColor; 
            private Integer borderWidth; 
            private Boolean box; 
            private Integer boxBorderWidth; 
            private Long boxColor; 
            private Integer fontColor; 
            private Integer fontSize; 
            private Integer fontType; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(ClockWidgets model) {
                this.alpha = model.alpha;
                this.borderColor = model.borderColor;
                this.borderWidth = model.borderWidth;
                this.box = model.box;
                this.boxBorderWidth = model.boxBorderWidth;
                this.boxColor = model.boxColor;
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.fontType = model.fontType;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The transparency of the text box and text. A value of 0.0 indicates fully transparent, and 1.0 indicates fully opaque.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The text stroke color in RGB format.
             * The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder borderColor(Long borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * <p>The text stroke width, in pixels. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder borderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            /**
             * <p>Specifies whether to display the text box. Valid values:</p>
             * <ul>
             * <li>false (default): not displayed.</li>
             * <li>true: displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder box(Boolean box) {
                this.box = box;
                return this;
            }

            /**
             * <p>The text box border width, in pixels. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder boxBorderWidth(Integer boxBorderWidth) {
                this.boxBorderWidth = boxBorderWidth;
                return this;
            }

            /**
             * <p>The text box color in RGB format.
             * The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder boxColor(Long boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>The text color in RGB format.</p>
             * <p>The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fontColor(Integer fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size. Valid values: <strong>0</strong> to <strong>72</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>The font type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: NOTO_SERIF_CJKSC_REGULAR (default).</li>
             * <li><strong>1</strong>: ALIBABA_PUHUITI_REGULAR.</li>
             * <li><strong>2</strong>: ALIBABA_PUHUITI_BOLD.</li>
             * <li><strong>3</strong>: ALIBABA_PUHUITI_Heavy.</li>
             * <li><strong>4</strong>: ALIBABA_PUHUITI_LIGHT.</li>
             * <li><strong>5</strong>: ALIBABA_PUHUITI_MEDIUM.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fontType(Integer fontType) {
                this.fontType = fontType;
                return this;
            }

            /**
             * <p>The X-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public ClockWidgets build() {
                return new ClockWidgets(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartMPUTaskRequest} extends {@link TeaModel}
     *
     * <p>StartMPUTaskRequest</p>
     */
    public static class EnhancedParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnablePortraitSegmentation")
        private Boolean enablePortraitSegmentation;

        private EnhancedParam(Builder builder) {
            this.enablePortraitSegmentation = builder.enablePortraitSegmentation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnhancedParam create() {
            return builder().build();
        }

        /**
         * @return enablePortraitSegmentation
         */
        public Boolean getEnablePortraitSegmentation() {
            return this.enablePortraitSegmentation;
        }

        public static final class Builder {
            private Boolean enablePortraitSegmentation; 

            private Builder() {
            } 

            private Builder(EnhancedParam model) {
                this.enablePortraitSegmentation = model.enablePortraitSegmentation;
            } 

            /**
             * <p>Specifies whether to enable the portrait segmentation feature (in closed beta). Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled.</li>
             * <li><strong>false</strong> (default): disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enablePortraitSegmentation(Boolean enablePortraitSegmentation) {
                this.enablePortraitSegmentation = enablePortraitSegmentation;
                return this;
            }

            public EnhancedParam build() {
                return new EnhancedParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartMPUTaskRequest} extends {@link TeaModel}
     *
     * <p>StartMPUTaskRequest</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Display")
        private Integer display;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Images(Builder builder) {
            this.display = builder.display;
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Integer getDisplay() {
            return this.display;
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.display = model.display;
                this.height = model.height;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>Specifies whether to display the image. Valid values:</p>
             * <ul>
             * <li><strong>0 (None)</strong>: not displayed.</li>
             * <li><strong>1 (Always)</strong>: always displayed.</li>
             * <li><strong>2 (Backup)</strong>: displayed when the current user has no video stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The height of the pane, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width of the pane, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The X-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartMPUTaskRequest} extends {@link TeaModel}
     *
     * <p>StartMPUTaskRequest</p>
     */
    public static class Texts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Float alpha;

        @com.aliyun.core.annotation.NameInMap("BorderColor")
        private Long borderColor;

        @com.aliyun.core.annotation.NameInMap("BorderWidth")
        private Integer borderWidth;

        @com.aliyun.core.annotation.NameInMap("Box")
        private Boolean box;

        @com.aliyun.core.annotation.NameInMap("BoxBorderWidth")
        private Integer boxBorderWidth;

        @com.aliyun.core.annotation.NameInMap("BoxColor")
        private Long boxColor;

        @com.aliyun.core.annotation.NameInMap("FontColor")
        private Integer fontColor;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("FontType")
        private Integer fontType;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Texts(Builder builder) {
            this.alpha = builder.alpha;
            this.borderColor = builder.borderColor;
            this.borderWidth = builder.borderWidth;
            this.box = builder.box;
            this.boxBorderWidth = builder.boxBorderWidth;
            this.boxColor = builder.boxColor;
            this.fontColor = builder.fontColor;
            this.fontSize = builder.fontSize;
            this.fontType = builder.fontType;
            this.text = builder.text;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Texts create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Float getAlpha() {
            return this.alpha;
        }

        /**
         * @return borderColor
         */
        public Long getBorderColor() {
            return this.borderColor;
        }

        /**
         * @return borderWidth
         */
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        /**
         * @return box
         */
        public Boolean getBox() {
            return this.box;
        }

        /**
         * @return boxBorderWidth
         */
        public Integer getBoxBorderWidth() {
            return this.boxBorderWidth;
        }

        /**
         * @return boxColor
         */
        public Long getBoxColor() {
            return this.boxColor;
        }

        /**
         * @return fontColor
         */
        public Integer getFontColor() {
            return this.fontColor;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return fontType
         */
        public Integer getFontType() {
            return this.fontType;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Float alpha; 
            private Long borderColor; 
            private Integer borderWidth; 
            private Boolean box; 
            private Integer boxBorderWidth; 
            private Long boxColor; 
            private Integer fontColor; 
            private Integer fontSize; 
            private Integer fontType; 
            private String text; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Texts model) {
                this.alpha = model.alpha;
                this.borderColor = model.borderColor;
                this.borderWidth = model.borderWidth;
                this.box = model.box;
                this.boxBorderWidth = model.boxBorderWidth;
                this.boxColor = model.boxColor;
                this.fontColor = model.fontColor;
                this.fontSize = model.fontSize;
                this.fontType = model.fontType;
                this.text = model.text;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The transparency of the text box and text. A value of 0.0 indicates fully transparent, and 1.0 indicates fully opaque.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>The text stroke color in RGB format.
             * The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder borderColor(Long borderColor) {
                this.borderColor = borderColor;
                return this;
            }

            /**
             * <p>The text stroke width, in pixels. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder borderWidth(Integer borderWidth) {
                this.borderWidth = borderWidth;
                return this;
            }

            /**
             * <p>Specifies whether to display the text box. Valid values:</p>
             * <ul>
             * <li>false (default): not displayed.</li>
             * <li>true: displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder box(Boolean box) {
                this.box = box;
                return this;
            }

            /**
             * <p>The text box border width, in pixels. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder boxBorderWidth(Integer boxBorderWidth) {
                this.boxBorderWidth = boxBorderWidth;
                return this;
            }

            /**
             * <p>The text box color in RGB format.
             * The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder boxColor(Long boxColor) {
                this.boxColor = boxColor;
                return this;
            }

            /**
             * <p>The text color in RGB format.</p>
             * <p>The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fontColor(Integer fontColor) {
                this.fontColor = fontColor;
                return this;
            }

            /**
             * <p>The font size. Valid values: <strong>0</strong> to <strong>72</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * <p>The font type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: NOTO_SERIF_CJKSC_REGULAR (default).</li>
             * <li><strong>1</strong>: ALIBABA_PUHUITI_REGULAR.</li>
             * <li><strong>2</strong>: ALIBABA_PUHUITI_BOLD.</li>
             * <li><strong>3</strong>: ALIBABA_PUHUITI_Heavy.</li>
             * <li><strong>4</strong>: ALIBABA_PUHUITI_LIGHT.</li>
             * <li><strong>5</strong>: ALIBABA_PUHUITI_MEDIUM.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fontType(Integer fontType) {
                this.fontType = fontType;
                return this;
            }

            /**
             * <p>The text content.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The X-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Texts build() {
                return new Texts(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartMPUTaskRequest} extends {@link TeaModel}
     *
     * <p>StartMPUTaskRequest</p>
     */
    public static class UserPanes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<Images> images;

        @com.aliyun.core.annotation.NameInMap("PaneId")
        private Integer paneId;

        @com.aliyun.core.annotation.NameInMap("SegmentType")
        private Integer segmentType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Texts")
        private java.util.List<Texts> texts;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserPanes(Builder builder) {
            this.images = builder.images;
            this.paneId = builder.paneId;
            this.segmentType = builder.segmentType;
            this.sourceType = builder.sourceType;
            this.texts = builder.texts;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPanes create() {
            return builder().build();
        }

        /**
         * @return images
         */
        public java.util.List<Images> getImages() {
            return this.images;
        }

        /**
         * @return paneId
         */
        public Integer getPaneId() {
            return this.paneId;
        }

        /**
         * @return segmentType
         */
        public Integer getSegmentType() {
            return this.segmentType;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return texts
         */
        public java.util.List<Texts> getTexts() {
            return this.texts;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<Images> images; 
            private Integer paneId; 
            private Integer segmentType; 
            private String sourceType; 
            private java.util.List<Texts> texts; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserPanes model) {
                this.images = model.images;
                this.paneId = model.paneId;
                this.segmentType = model.segmentType;
                this.sourceType = model.sourceType;
                this.texts = model.texts;
                this.userId = model.userId;
            } 

            /**
             * <p>The image panes in the current layout.</p>
             */
            public Builder images(java.util.List<Images> images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The pane ID. Valid values: <strong>0</strong> to <strong>15</strong>.</p>
             * <blockquote>
             * <p>If the user specified by PaneId is not found, the system displays other streams by default. The streams are determined based on the order in which users join the channel.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder paneId(Integer paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * <p>The portrait segmentation type. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: no portrait segmentation (default).</p>
             * </li>
             * <li><p><strong>1</strong>: portrait segmentation. This value takes effect only after the portrait segmentation feature is enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder segmentType(Integer segmentType) {
                this.segmentType = segmentType;
                return this;
            }

            /**
             * <p>The user video input corresponding to the layout. Valid values:</p>
             * <ul>
             * <li><strong>camera</strong>: video stream (default).</li>
             * <li><strong>shareScreen</strong>: screen sharing stream.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>camera</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The text panes in the current layout.</p>
             */
            public Builder texts(java.util.List<Texts> texts) {
                this.texts = texts;
                return this;
            }

            /**
             * <p>The ID of the user corresponding to the layout pane. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestId</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserPanes build() {
                return new UserPanes(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartMPUTaskRequest} extends {@link TeaModel}
     *
     * <p>StartMPUTaskRequest</p>
     */
    public static class Watermarks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alpha")
        private Float alpha;

        @com.aliyun.core.annotation.NameInMap("Display")
        private Integer display;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Float height;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Float width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        @com.aliyun.core.annotation.NameInMap("ZOrder")
        private Integer zOrder;

        private Watermarks(Builder builder) {
            this.alpha = builder.alpha;
            this.display = builder.display;
            this.height = builder.height;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
            this.zOrder = builder.zOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermarks create() {
            return builder().build();
        }

        /**
         * @return alpha
         */
        public Float getAlpha() {
            return this.alpha;
        }

        /**
         * @return display
         */
        public Integer getDisplay() {
            return this.display;
        }

        /**
         * @return height
         */
        public Float getHeight() {
            return this.height;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Float getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        /**
         * @return zOrder
         */
        public Integer getZOrder() {
            return this.zOrder;
        }

        public static final class Builder {
            private Float alpha; 
            private Integer display; 
            private Float height; 
            private String url; 
            private Float width; 
            private Float x; 
            private Float y; 
            private Integer zOrder; 

            private Builder() {
            } 

            private Builder(Watermarks model) {
                this.alpha = model.alpha;
                this.display = model.display;
                this.height = model.height;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
                this.zOrder = model.zOrder;
            } 

            /**
             * <p>The transparency. A value of 0.0 indicates fully transparent, and 1.0 indicates fully opaque.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alpha(Float alpha) {
                this.alpha = alpha;
                return this;
            }

            /**
             * <p>Specifies whether to display the image. Valid values:</p>
             * <ul>
             * <li><strong>0 (None)</strong>: not displayed.</li>
             * <li><strong>1 (Always)</strong>: always displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder display(Integer display) {
                this.display = display;
                return this;
            }

            /**
             * <p>The height of the pane, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder height(Float height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The HTTP or HTTPS URL of the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width of the pane, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2456</p>
             */
            public Builder width(Float width) {
                this.width = width;
                return this;
            }

            /**
             * <p>The X-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-coordinate, as a normalized percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.7576</p>
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            /**
             * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder zOrder(Integer zOrder) {
                this.zOrder = zOrder;
                return this;
            }

            public Watermarks build() {
                return new Watermarks(this);
            } 

        } 

    }
}
