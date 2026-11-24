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
 * {@link SubmitEditMediaManifestJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitEditMediaManifestJobRequest</p>
 */
public class SubmitEditMediaManifestJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioTracks")
    private String audioTracks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStreamJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoStreamJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveTracks")
    private String removeTracks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subtitles")
    private String subtitles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoTracks")
    private String videoTracks;

    private SubmitEditMediaManifestJobRequest(Builder builder) {
        super(builder);
        this.audioTracks = builder.audioTracks;
        this.autoStreamJobId = builder.autoStreamJobId;
        this.outputConfig = builder.outputConfig;
        this.removeTracks = builder.removeTracks;
        this.subtitles = builder.subtitles;
        this.templateId = builder.templateId;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
        this.videoTracks = builder.videoTracks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitEditMediaManifestJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioTracks
     */
    public String getAudioTracks() {
        return this.audioTracks;
    }

    /**
     * @return autoStreamJobId
     */
    public String getAutoStreamJobId() {
        return this.autoStreamJobId;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return removeTracks
     */
    public String getRemoveTracks() {
        return this.removeTracks;
    }

    /**
     * @return subtitles
     */
    public String getSubtitles() {
        return this.subtitles;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    /**
     * @return videoTracks
     */
    public String getVideoTracks() {
        return this.videoTracks;
    }

    public static final class Builder extends Request.Builder<SubmitEditMediaManifestJobRequest, Builder> {
        private String audioTracks; 
        private String autoStreamJobId; 
        private String outputConfig; 
        private String removeTracks; 
        private String subtitles; 
        private String templateId; 
        private String userData; 
        private String videoId; 
        private String videoTracks; 

        private Builder() {
            super();
        } 

        private Builder(SubmitEditMediaManifestJobRequest request) {
            super(request);
            this.audioTracks = request.audioTracks;
            this.autoStreamJobId = request.autoStreamJobId;
            this.outputConfig = request.outputConfig;
            this.removeTracks = request.removeTracks;
            this.subtitles = request.subtitles;
            this.templateId = request.templateId;
            this.userData = request.userData;
            this.videoId = request.videoId;
            this.videoTracks = request.videoTracks;
        } 

        /**
         * <p>The list of audio tracks to be added. The value is a JSON string array. Each element contains the following fields:</p>
         * <ul>
         * <li><strong>Language</strong>: the language identifier of the audio track.</li>
         * <li><strong>Name</strong>: the display name of the track. If this field is not specified, the default value is audio-{Language}.</li>
         * <li><strong>AudioUrl</strong>: the URL of the audio file, which is an OSS object URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Language&quot;:&quot;spa&quot;,&quot;Name&quot;:&quot;audio-spa&quot;,&quot;AudioUrl&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/audio/spa.aac%22%7D%5D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/audio/spa.aac&quot;}]</a></p>
         */
        public Builder audioTracks(String audioTracks) {
            this.putQueryParameter("AudioTracks", audioTracks);
            this.audioTracks = audioTracks;
            return this;
        }

        /**
         * <p>The job ID of the target AUTO stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2c6581d59240de5e258ffa4c71a3****</p>
         */
        public Builder autoStreamJobId(String autoStreamJobId) {
            this.putQueryParameter("AutoStreamJobId", autoStreamJobId);
            this.autoStreamJobId = autoStreamJobId;
            return this;
        }

        /**
         * <p>The output configuration. The value is a JSON string. It contains the following fields:</p>
         * <ul>
         * <li><strong>OutputDir</strong>: the output directory. By default, this field is set to the same directory as the source manifest.</li>
         * <li><strong>ManifestName</strong>: the file name of the output master playlist. Default value: master. The .m3u8 extension is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;OutputDir&quot;:&quot;output/editmanifest/&quot;,&quot;ManifestName&quot;:&quot;master&quot;}</p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>The configuration of tracks to be removed. The value is a JSON string. It contains the following fields:</p>
         * <ul>
         * <li><strong>AudioLanguages</strong>: the list of audio language identifiers for which the entire audio tracks are to be removed.</li>
         * <li><strong>SubtitleLanguages</strong>: the list of subtitle language identifiers for which the entire subtitle tracks are to be removed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AudioLanguages&quot;:[&quot;fra&quot;],&quot;SubtitleLanguages&quot;:[&quot;ger&quot;]}</p>
         */
        public Builder removeTracks(String removeTracks) {
            this.putQueryParameter("RemoveTracks", removeTracks);
            this.removeTracks = removeTracks;
            return this;
        }

        /**
         * <p>The list of subtitle tracks to be added. The value is a JSON string array. Each element contains the following fields:</p>
         * <ul>
         * <li><strong>Language</strong>: the language identifier of the subtitle track. If this field is not specified, the subtitle track is ignored.</li>
         * <li><strong>SubtitleUrl</strong>: the URL of the subtitle file in WebVTT format, which is an OSS object URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Language&quot;:&quot;eng&quot;,&quot;SubtitleUrl&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/sub/eng.vtt%22%7D%5D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/sub/eng.vtt&quot;}]</a></p>
         */
        public Builder subtitles(String subtitles) {
            this.putQueryParameter("Subtitles", subtitles);
            this.subtitles = subtitles;
            return this;
        }

        /**
         * <p>The manifest editing template ID, which is returned after the AddManifestEditTemplate operation is called. If this parameter is specified, the output tracks are orchestrated based on the fixed video, audio, and subtitle item configurations in the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9c6581d59240de5e258ffa4c71a3e01b</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The custom pass-through data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;remark&quot;:&quot;add-french-remove-english&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p><strong>The target video ID</strong>, used for authentication isolation and consistency verification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2cd8a4f4a67cb7fb8e1236f847f4****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        /**
         * <p>The list of video tracks to be added. The value is a JSON string array. Each element contains the following fields:</p>
         * <ul>
         * <li><strong>Name</strong>: the display name of the track. If this field is not specified, the video track is ignored.</li>
         * <li><strong>VideoUrl</strong>: the URL of the video stream manifest file, which is an OSS object URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;uhd&quot;,&quot;VideoUrl&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/video/uhd/uhd.m3u8%22%7D%5D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/video/uhd/uhd.m3u8&quot;}]</a></p>
         */
        public Builder videoTracks(String videoTracks) {
            this.putQueryParameter("VideoTracks", videoTracks);
            this.videoTracks = videoTracks;
            return this;
        }

        @Override
        public SubmitEditMediaManifestJobRequest build() {
            return new SubmitEditMediaManifestJobRequest(this);
        } 

    } 

}
