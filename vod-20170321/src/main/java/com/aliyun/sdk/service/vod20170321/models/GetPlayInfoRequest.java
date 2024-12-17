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
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The URL of the masked live comment data. Value: <strong>danmu</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <code>outputType</code> parameter is set to <code>cdn</code>.</p>
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
         * <li><p>If you set OutputType to <strong>cdn</strong>:</p>
         * <ul>
         * <li>The playback URL has a validity period only if URL signing is enabled. Otherwise, the playback URL is permanently valid. For more information about how to enable and configure URL signing, see <a href="https://help.aliyun.com/document_detail/86090.html">URL signing</a>.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: unlimited.</li>
         * <li>Default value: The default validity period that is specified in URL signing is used.</li>
         * </ul>
         * </li>
         * <li><p>If you set OutputType to <strong>oss</strong>:</p>
         * <ul>
         * <li>This parameter takes effect only when the ACL of the Object Storage Service (OSS) bucket is private. Otherwise, the playback URL does not expire.</li>
         * <li>Minimum value: <strong>1</strong>.</li>
         * <li>Maximum value: If the media file is stored in the VOD bucket, the maximum validity period is <strong>2592000</strong> (30 days). If the media file is stored in an OSS bucket, the maximum validity period is <strong>129600</strong> (36 hours). This limit is imposed to reduce security risks of the origin server. If you require a longer validity period, set OutputType to <strong>cdn</strong> and configure URL signing to specify a longer validity period.</li>
         * <li>Default value: <strong>3600</strong>.</li>
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
         * <p>The quality of the video stream. Separate multiple qualities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>FD</strong>: low definition</li>
         * <li><strong>LD</strong>: standard definition</li>
         * <li><strong>SD</strong>: high definition</li>
         * <li><strong>HD</strong>: ultra-high definition</li>
         * <li><strong>OD</strong>: original definition</li>
         * <li><strong>2K</strong></li>
         * <li><strong>4K</strong></li>
         * <li><strong>SQ</strong>: standard sound quality</li>
         * <li><strong>HQ</strong>: high sound quality</li>
         * <li><strong>AUTO</strong>: adaptive bitrate</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>By default, ApsaraVideo VOD returns video streams in all the preceding qualities.</li>
         * <li>However, video streams for adaptive bitrate streaming are returned only if the PackageSetting parameter is specified in the transcoding template. For more information, see the <a href="~~52839#title-4fk-cg8-gzx~~">PackageSetting parameter in the TranscodeTemplate table</a>.</li>
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
         * <p>The type of the digital watermark. Valid values:</p>
         * <ul>
         * <li>TraceMark: tracing watermark</li>
         * <li>CopyrightMark: copyright watermark</li>
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
         * <li>By default, ApsaraVideo VOD returns video streams in all the preceding formats.</li>
         * <li>However, video streams in the MPD format are returned only if the <code>dash</code> container format is specified in the transcoding template. For more information, see the <a href="~~52839#title-7rr-3hj-gy5~~">Container parameter in the TranscodeTemplate table</a>.</li>
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
         * <p>The type of the output URL. Default value: oss. Valid values:</p>
         * <ul>
         * <li><strong>oss</strong></li>
         * <li><strong>cdn</strong></li>
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
         * <p>The custom playback configuration. The value must be a JSON string. You can specify a domain name for playback. For more information, see <a href="~~86952#section-9g7-s9b-v7z~~">PlayConfig</a>.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not set the PlayConfig parameter or the <code>PlayDomain</code> parameter that is nested under the PlayConfig parameter, the default domain name specified in ApsaraVideo VOD is used in this operation. If no default domain name is specified, the domain names are queried in reverse chronological order based on the time when the domain names were last modified. To prevent domain name issues, we recommend that you perform the following steps to specify the default playback domain name: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. Find the domain name that you want to configure and click <strong>Manage</strong> in the Actions column. On the page that appears, set the default playback domain name in the <strong>Origin Domain Name</strong> section.</li>
         * <li>If you set the <code>EncryptType</code> parameter nested under the PlayConfig parameter to <code>AliyunVoDEncryption</code>, the playback URLs of videos encrypted by using Alibaba Cloud proprietary cryptography are not automatically returned to ensure video security. To return playback URLs of videos encrypted by using Alibaba Cloud proprietary cryptography, you must set the <code>ResultType</code> parameter to <code>Multiple</code>.</li>
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
         * <p>The CDN reauthentication configuration. The value must be a JSON string. If CDN reauthentication is enabled, you can use this parameter to specify the <code>UID</code> and <code>rand</code> fields for URL authentication. For more information, see <a href="https://help.aliyun.com/document_detail/2249352.html">URL authentication</a>.</p>
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
         * <p>The type of the data to return. Default value: Single. Valid values:</p>
         * <ul>
         * <li><strong>Single</strong>: Only one latest transcoded stream is returned for each quality and format.</li>
         * <li><strong>Multiple</strong>: All transcoded streams are returned for each quality and format.</li>
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
         * <li><strong>video</strong></li>
         * <li><strong>audio</strong></li>
         * </ul>
         * <p>By default, video and audio streams are returned.</p>
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
         * <p>The custom digital watermark.</p>
         * <ul>
         * <li>If you set <code>DigitalWatermarkType</code> to <code>TraceMark</code>, specify this parameter to configure the video tracing watermark and return the video stream that contains the watermark. The value can be up to 1,024 characters in length and can contain letters and digits.</li>
         * <li>If you set <code>DigitalWatermarkType</code> to <code>CopyrightMark</code>, specify the <strong>watermark text</strong> that you created for the watermark template for this parameter.`` You can specify this parameter to query and return the video stream that contains the specified watermark text.</li>
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
         * <p>The ID of the media file. You can specify only one ID. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the page that appears, view the media ID.</li>
         * <li>Obtain the value of the VideoId parameter in the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you called to upload the audio or video file.</li>
         * <li>Obtain the value of VideoId by calling the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation. This method is applicable to files that have been uploaded.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
