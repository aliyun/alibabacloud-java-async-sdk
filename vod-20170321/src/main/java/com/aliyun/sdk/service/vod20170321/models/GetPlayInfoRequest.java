// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPlayInfoRequest} extends {@link RequestModel}
 *
 * <p>GetPlayInfoRequest</p>
 */
public class GetPlayInfoRequest extends Request {
    @Query
    @NameInMap("AdditionType")
    private String additionType;

    @Query
    @NameInMap("AuthTimeout")
    private Long authTimeout;

    @Query
    @NameInMap("Definition")
    private String definition;

    @Query
    @NameInMap("DigitalWatermarkType")
    private String digitalWatermarkType;

    @Query
    @NameInMap("Formats")
    private String formats;

    @Query
    @NameInMap("OutputType")
    private String outputType;

    @Query
    @NameInMap("PlayConfig")
    private String playConfig;

    @Query
    @NameInMap("ReAuthInfo")
    private String reAuthInfo;

    @Query
    @NameInMap("ResultType")
    private String resultType;

    @Query
    @NameInMap("StreamType")
    private String streamType;

    @Query
    @NameInMap("Trace")
    private String trace;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private GetPlayInfoRequest(Builder builder) {
        super(builder);
        this.additionType = builder.additionType;
        this.authTimeout = builder.authTimeout;
        this.definition = builder.definition;
        this.digitalWatermarkType = builder.digitalWatermarkType;
        this.formats = builder.formats;
        this.outputType = builder.outputType;
        this.playConfig = builder.playConfig;
        this.reAuthInfo = builder.reAuthInfo;
        this.resultType = builder.resultType;
        this.streamType = builder.streamType;
        this.trace = builder.trace;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionType
     */
    public String getAdditionType() {
        return this.additionType;
    }

    /**
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return digitalWatermarkType
     */
    public String getDigitalWatermarkType() {
        return this.digitalWatermarkType;
    }

    /**
     * @return formats
     */
    public String getFormats() {
        return this.formats;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    /**
     * @return playConfig
     */
    public String getPlayConfig() {
        return this.playConfig;
    }

    /**
     * @return reAuthInfo
     */
    public String getReAuthInfo() {
        return this.reAuthInfo;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return streamType
     */
    public String getStreamType() {
        return this.streamType;
    }

    /**
     * @return trace
     */
    public String getTrace() {
        return this.trace;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<GetPlayInfoRequest, Builder> {
        private String additionType; 
        private Long authTimeout; 
        private String definition; 
        private String digitalWatermarkType; 
        private String formats; 
        private String outputType; 
        private String playConfig; 
        private String reAuthInfo; 
        private String resultType; 
        private String streamType; 
        private String trace; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(GetPlayInfoRequest request) {
            super(request);
            this.additionType = request.additionType;
            this.authTimeout = request.authTimeout;
            this.definition = request.definition;
            this.digitalWatermarkType = request.digitalWatermarkType;
            this.formats = request.formats;
            this.outputType = request.outputType;
            this.playConfig = request.playConfig;
            this.reAuthInfo = request.reAuthInfo;
            this.resultType = request.resultType;
            this.streamType = request.streamType;
            this.trace = request.trace;
            this.videoId = request.videoId;
        } 

        /**
         * The URL of the masked live comment data. Set the value to **danmu**.
         * <p>
         * 
         * > This parameter takes effect only when the outputType parameter is set to **cdn**.
         */
        public Builder additionType(String additionType) {
            this.putQueryParameter("AdditionType", additionType);
            this.additionType = additionType;
            return this;
        }

        /**
         * The validity period of the playback URL. Unit: seconds.
         * <p>
         * 
         * *   If you set OutputType to **cdn**:
         * 
         *     *   The playback URL has a validity period only if URL signing is enabled. Otherwise, the playback URL is permanently valid. For more information about how to enable and configure URL signing, see [URL signing](~~86090~~).
         *     *   Minimum value: **1**.
         *     *   Maximum value: unlimited.
         *     *   Default value: The default validity period that is specified in URL signing is used.
         * 
         * *   If you set OutputType to **oss**:
         * 
         *     *   This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the playback URL does not expire.
         *     *   Minimum value: **1**.
         *     *   Maximum value: If the media file is stored in the VOD bucket, the maximum validity period is **2592000** (30 days). If the media file is stored in an OSS bucket, the maximum validity period is **129600** (36 hours). This limit is imposed to reduce security risks of the origin server. If you require a longer validity period, set OutputType to **cdn** and configure URL signing to specify a longer validity period.
         *     *   Default value: **3600**.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The quality of the video stream. Separate multiple qualities with commas (,). Valid values:
         * <p>
         * 
         * *   **FD**: low definition
         * *   **LD**: standard definition
         * *   **SD**: high definition
         * *   **HD**: ultra-high definition
         * *   **OD**: original definition
         * *   **2K**: 2K
         * *   **4K**: 4K
         * *   **SQ**: standard sound quality
         * *   **HQ**: high sound quality
         * *   **AUTO**: adaptive bitrate
         * 
         * > By default, ApsaraVideo VOD returns video streams in all preceding qualities. However, video streams for adaptive bitrate streaming are returned only if the PackageSetting parameter is specified in the transcoding template. For more information, see the [PackageSetting parameter in the TranscodeTemplate](~~52839~~) table.
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * The type of the digital watermark. Valid values:
         * <p>
         * 
         * *   TraceMark: tracing watermark
         * *   CopyrightMark: copyright watermark
         */
        public Builder digitalWatermarkType(String digitalWatermarkType) {
            this.putQueryParameter("DigitalWatermarkType", digitalWatermarkType);
            this.digitalWatermarkType = digitalWatermarkType;
            return this;
        }

        /**
         * The format of the media stream. Separate multiple formats with commas (,). Valid values:
         * <p>
         * 
         * *   **mp4**
         * *   **m3u8**
         * *   **mp3**
         * *   **mpd**
         * 
         * > By default, ApsaraVideo VOD returns video streams in all the preceding formats. However, video streams in the MPD format are returned only if the MPD container format is specified in the transcoding template. For more information, see the [Container parameter in the TranscodeTemplate](~~52839~~) table.
         */
        public Builder formats(String formats) {
            this.putQueryParameter("Formats", formats);
            this.formats = formats;
            return this;
        }

        /**
         * The type of the output URL. Default value: oss. Valid values:
         * <p>
         * 
         * *   **oss**
         * *   **cdn**
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * The custom playback configuration. The value is a JSON string. For more information, see [PlayConfig](~~86952~~).
         * <p>
         * 
         * >-   If you do not specify PlayConfig or `PlayDomain` in PlayConfig, the default domain name configured in ApsaraVideo VOD is used in this operation. If no default domain name is configured, the domain names are queried in reverse chronological order based on the time when the domain names were modified. The domain name that was last modified is used as the streaming domain name. To prevent domain name issues, we recommend that you specify the default streaming domain name. You can log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com) and choose **Configuration Management** > **Media Management** > **Storage** > **Manage** > **Origin Domain Name** to set the default streaming domain name.
         * >-   If the `EncryptType` parameter in PlayConfig is set to `AliyunVoDEncryption`, the playback URL of the stream encrypted by using proprietary cryptography is not returned to ensure video security. If you want to return such URL, you must set the `ResultType` parameter to `Multiple`.
         */
        public Builder playConfig(String playConfig) {
            this.putQueryParameter("PlayConfig", playConfig);
            this.playConfig = playConfig;
            return this;
        }

        /**
         * The CDN reauthentication configuration. The value is a JSON string. If CDN reauthentication is enabled, you can use this parameter to specify the UID and rand fields for URL authentication. For more information, see [URL authentication](~~57007~~).
         */
        public Builder reAuthInfo(String reAuthInfo) {
            this.putQueryParameter("ReAuthInfo", reAuthInfo);
            this.reAuthInfo = reAuthInfo;
            return this;
        }

        /**
         * The type of the data to return. Default value: Single. Valid values:
         * <p>
         * 
         * *   **Single**: Only one latest transcoded stream is returned for each quality and format.
         * *   **Multiple**: All transcoded streams are returned for each quality and format.
         */
        public Builder resultType(String resultType) {
            this.putQueryParameter("ResultType", resultType);
            this.resultType = resultType;
            return this;
        }

        /**
         * The type of the media stream. Separate multiple types with commas (,). Valid values:
         * <p>
         * 
         * *   **video**
         * *   **audio**
         * 
         * By default, video and audio streams are returned.
         */
        public Builder streamType(String streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * The custom digital watermark.
         * <p>
         * 
         * *   If you set `DigitalWatermarkType` to `TraceMark`, specify this parameter to configure the video tracing watermark and return the video stream that contains the watermark. The value can be up to 1,024 characters in length and can contain letters and digits.
         * *   If you set `DigitalWatermarkType` to `CopyrightMark`, specify the **watermark text** that you created for the watermark template for this parameter.`` You can specify this parameter to query and return the video stream that contains the specified watermark text.
         */
        public Builder trace(String trace) {
            this.putQueryParameter("Trace", trace);
            this.trace = trace;
            return this;
        }

        /**
         * The ID of the media file. You can specify only one ID. You can use one of the following methods to obtain the media ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of the VideoId parameter from the response to the [CreateUploadVideo](~~55407~~) operation.
         * *   Obtain the value of the VideoId parameter from the response to the [SearchMedia](~~86044~~) operation. This method is applicable to files that have been uploaded.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public GetPlayInfoRequest build() {
            return new GetPlayInfoRequest(this);
        } 

    } 

}
