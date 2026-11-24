// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetPlayInfoRequest} extends {@link RequestModel}
 *
 * <p>GetPlayInfoRequest</p>
 */
public class GetPlayInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionType")
    private String additionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private Long authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodecName")
    private String codecName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DigitalWatermarkType")
    private String digitalWatermarkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Formats")
    private String formats;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayConfig")
    private String playConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReAuthInfo")
    private String reAuthInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultType")
    private String resultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamType")
    private String streamType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Trace")
    private String trace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private GetPlayInfoRequest(Builder builder) {
        super(builder);
        this.additionType = builder.additionType;
        this.authTimeout = builder.authTimeout;
        this.codecName = builder.codecName;
        this.definition = builder.definition;
        this.digitalWatermarkType = builder.digitalWatermarkType;
        this.formats = builder.formats;
        this.outputType = builder.outputType;
        this.playConfig = builder.playConfig;
        this.reAuthInfo = builder.reAuthInfo;
        this.referenceId = builder.referenceId;
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
     * @return codecName
     */
    public String getCodecName() {
        return this.codecName;
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
     * @return referenceId
     */
    public String getReferenceId() {
        return this.referenceId;
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
        private String codecName; 
        private String definition; 
        private String digitalWatermarkType; 
        private String formats; 
        private String outputType; 
        private String playConfig; 
        private String reAuthInfo; 
        private String referenceId; 
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
            this.codecName = request.codecName;
            this.definition = request.definition;
            this.digitalWatermarkType = request.digitalWatermarkType;
            this.formats = request.formats;
            this.outputType = request.outputType;
            this.playConfig = request.playConfig;
            this.reAuthInfo = request.reAuthInfo;
            this.referenceId = request.referenceId;
            this.resultType = request.resultType;
            this.streamType = request.streamType;
            this.trace = request.trace;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The URL of the live comment mask data. Valid value: <strong>danmu</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when OutputType is set to cdn.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>danmu</p>
         */
        public Builder additionType(String additionType) {
            this.putQueryParameter("AdditionType", additionType);
            this.additionType = additionType;
            return this;
        }

        /**
         * <p>The validity period of the playback URL. Unit: seconds.</p>
         * <ul>
         * <li><p>When OutputType is set to <strong>cdn</strong>:</p>
         * <ul>
         * <li>The playback URL expires periodically only if URL authentication is enabled. Otherwise, the URL is permanently valid. For more information about how to enable and configure URL authentication, refer to <a href="https://help.aliyun.com/document_detail/86090.html">URL authentication</a>.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: If this parameter is not specified, the default validity period configured for URL authentication is used.</li>
         * </ul>
         * </li>
         * <li><p>When OutputType is set to <strong>oss</strong>:</p>
         * <ul>
         * <li>The playback URL expires periodically only if the storage permission is set to private. Otherwise, the URL is permanently valid.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: To reduce security risks of the origin server, the maximum value is <strong>604800</strong> (7 days) when the audio or video file is stored in an ApsaraVideo VOD bucket, and <strong>129600</strong> (36 hours) when the file is stored in a user-owned OSS bucket. If the maximum value does not meet your requirements, you can set OutputType to <strong>cdn</strong> and configure URL authentication to set a longer validity period.</li>
         * <li>Default value: If this parameter is not specified, the value is <strong>3600</strong>.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * <p>The codec.</p>
         * 
         * <strong>example:</strong>
         * <p>H264</p>
         */
        public Builder codecName(String codecName) {
            this.putQueryParameter("CodecName", codecName);
            this.codecName = codecName;
            return this;
        }

        /**
         * <p>The definition of the video stream. Separate multiple definitions with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>FD</strong>: fluent.</li>
         * <li><strong>LD</strong>: standard definition.</li>
         * <li><strong>SD</strong>: high definition.</li>
         * <li><strong>HD</strong>: ultra-high definition.</li>
         * <li><strong>OD</strong>: original definition.</li>
         * <li><strong>2K</strong>: 2K.</li>
         * <li><strong>4K</strong>: 4K.</li>
         * <li><strong>SQ</strong>: standard sound quality.</li>
         * <li><strong>HQ</strong>: high sound quality.</li>
         * <li><strong>AUTO</strong>: adaptive bitrate.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>By default, streams of all definitions are retrieved.</li>
         * <li>When a tracing watermark is generated, this parameter is required and must be consistent with the definition configured for tracing watermark transcoding.</li>
         * <li>The AUTO format is output only when transcoding packaging is configured in the transcoding template. For more information, refer to <a href="~~52839#title-4fk-cg8-gzx~~">PackageSetting: transcoding packaging settings</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LD</p>
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * <p>The digital watermarking type. Valid values:</p>
         * <ul>
         * <li>TraceMark: tracing watermark.</li>
         * <li>CopyrightMark: copyright watermark.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TraceMark</p>
         */
        public Builder digitalWatermarkType(String digitalWatermarkType) {
            this.putQueryParameter("DigitalWatermarkType", digitalWatermarkType);
            this.digitalWatermarkType = digitalWatermarkType;
            return this;
        }

        /**
         * <p>The format of the media stream. Separate multiple formats with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>mp4</strong></li>
         * <li><strong>m3u8</strong></li>
         * <li><strong>mp3</strong></li>
         * <li><strong>flv</strong></li>
         * <li><strong>mpd</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>By default, streams of all formats are retrieved.</li>
         * <li>The mpd format is output only when the dash container format is configured in the transcoding template. For more information, refer to <a href="~~52839#title-7rr-3hj-gy5~~">Container: container format</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mp4,m3u8</p>
         */
        public Builder formats(String formats) {
            this.putQueryParameter("Formats", formats);
            this.formats = formats;
            return this;
        }

        /**
         * <p>The type of the output URL. Valid values:</p>
         * <ul>
         * <li><strong>oss</strong>: the back-to-origin URL.</li>
         * <li><strong>cdn</strong> (default): the accelerated URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn</p>
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * <p>The custom playback settings. The value is a JSON string. You can specify the domain name for playback. For more information about how to construct the parameter, refer to <a href="~~86952#section-9g7-s9b-v7z~~">PlayConfig</a>.</p>
         * <blockquote>
         * <ul>
         * <li>If PlayConfig is not specified or the PlayDomain field in PlayConfig is not specified, the operation uses the default domain name configured in ApsaraVideo VOD by default. If no default domain name is configured, the operation queries domain names in descending order of modification time and uses the most recently modified domain name as the playback domain name. To prevent an unexpected domain name from being returned, we recommend that you configure a default playback domain name. You can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Storage Management</strong> &gt; <strong>Manage</strong> &gt; <strong>Domain Names that Route Back-to-origin Traffic to This Storage Address</strong> to configure the default playback domain name.</li>
         * <li>When the EncryptType parameter in PlayConfig is set to AliyunVoDEncryption, the playback URL of the private encrypted stream is not returned by default to ensure video security. To return the playback URL of the private encrypted stream, you must also set the ResultType parameter to Multiple.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PlayDomain&quot;:&quot;vod.test_domain&quot;,&quot;XForwardedFor&quot;:&quot;yqCD7Fp1uqChoVj/sl/p5Q==&quot;,&quot;PreviewTime&quot;:&quot;20&quot;,&quot;MtsHlsUriToken&quot;:&quot;yqCD7Fp1uqChoVjslp5Q&quot;}</p>
         */
        public Builder playConfig(String playConfig) {
            this.putQueryParameter("PlayConfig", playConfig);
            this.playConfig = playConfig;
            return this;
        }

        /**
         * <p>The CDN reauthentication parameter, which is a JSON string. When type A signing of URL authentication is enabled, you can use this parameter to set the uid and rand values of the authenticated URL. For more information, refer to <a href="https://help.aliyun.com/document_detail/2249352.html">Type A signing</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;uid&quot;:&quot;12345&quot;,&quot;rand&quot;:&quot;abckljd&quot;}</p>
         */
        public Builder reAuthInfo(String reAuthInfo) {
            this.putQueryParameter("ReAuthInfo", reAuthInfo);
            this.reAuthInfo = reAuthInfo;
            return this;
        }

        /**
         * <p>The custom ID. The ID must be 6 to 64 characters in length and can contain only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_). The ID must be unique per user.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123</p>
         */
        public Builder referenceId(String referenceId) {
            this.putQueryParameter("ReferenceId", referenceId);
            this.referenceId = referenceId;
            return this;
        }

        /**
         * <p>The type of the returned data. Valid values:</p>
         * <ul>
         * <li><strong>Single</strong> (default): returns only the latest transcoded stream for each definition and format.</li>
         * <li><strong>Multiple</strong>: returns all transcoded streams for each definition and format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
         */
        public Builder resultType(String resultType) {
            this.putQueryParameter("ResultType", resultType);
            this.resultType = resultType;
            return this;
        }

        /**
         * <p>The type of the media stream. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>video</strong>: video.</li>
         * <li><strong>audio</strong>: audio.</li>
         * </ul>
         * <p>By default, streams of all types are retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder streamType(String streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * <p>The custom digital watermarking information.</p>
         * <ul>
         * <li>When DigitalWatermarkType is set to TraceMark, you can pass this parameter to set the tracing watermark information for the video and return the video stream that contains the watermark information. Only English letters, digits, and Chinese characters are supported. A maximum of 1,024 characters are supported.</li>
         * <li>When DigitalWatermarkType is set to CopyrightMark, Trace corresponds to the <strong>Watermark Text</strong> set when the watermark template is created. By passing this parameter, you can query and return the video stream with the specified watermark text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test mark</p>
         */
        public Builder trace(String trace) {
            this.putQueryParameter("Trace", trace);
            this.trace = trace;
            return this;
        }

        /**
         * <p>The ID of the audio or video file. You can specify only one ID. You can obtain the ID by using one of the following methods:</p>
         * <ul>
         * <li>For an audio or video file uploaded in the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Library</strong> &gt; <strong>Audio/Video</strong> to view the ID.</li>
         * <li>When you upload an audio or video file by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the ID is the value of the VideoId response parameter.</li>
         * <li>After an audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the ID, which is the value of the VideoId response parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f654b6e91d24d81d44****</p>
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
