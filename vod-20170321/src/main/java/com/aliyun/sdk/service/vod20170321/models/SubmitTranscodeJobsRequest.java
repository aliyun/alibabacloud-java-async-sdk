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
 * {@link SubmitTranscodeJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitTranscodeJobsRequest</p>
 */
public class SubmitTranscodeJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptConfig")
    private String encryptConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverrideParams")
    private String overrideParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private SubmitTranscodeJobsRequest(Builder builder) {
        super(builder);
        this.encryptConfig = builder.encryptConfig;
        this.overrideParams = builder.overrideParams;
        this.pipelineId = builder.pipelineId;
        this.priority = builder.priority;
        this.referenceId = builder.referenceId;
        this.sessionId = builder.sessionId;
        this.templateGroupId = builder.templateGroupId;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTranscodeJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptConfig
     */
    public String getEncryptConfig() {
        return this.encryptConfig;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return referenceId
     */
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
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

    public static final class Builder extends Request.Builder<SubmitTranscodeJobsRequest, Builder> {
        private String encryptConfig; 
        private String overrideParams; 
        private String pipelineId; 
        private String priority; 
        private String referenceId; 
        private String sessionId; 
        private String templateGroupId; 
        private String userData; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTranscodeJobsRequest request) {
            super(request);
            this.encryptConfig = request.encryptConfig;
            this.overrideParams = request.overrideParams;
            this.pipelineId = request.pipelineId;
            this.priority = request.priority;
            this.referenceId = request.referenceId;
            this.sessionId = request.sessionId;
            this.templateGroupId = request.templateGroupId;
            this.userData = request.userData;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The encryption configuration. The value is a JSON string. This parameter is required only when HLS encryption is used.</p>
         * <blockquote>
         * <ul>
         * <li>The <strong>CipherText</strong> parameter in the <a href="https://help.aliyun.com/document_detail/86952.html">EncryptConfig</a> struct must be an AES_128 ciphertext key generated by calling the <a href="https://help.aliyun.com/document_detail/455051.html">GenerateKMSDataKey</a> operation. Otherwise, standard encryption transcoding fails. For more information about the standard encryption integration process, see <a href="https://help.aliyun.com/document_detail/68612.html">HLS encryption</a>.</li>
         * <li>For both standard encryption and proprietary encryption, you must select the HLS encryption option in the template data corresponding to <strong>TemplateGroupId</strong>. Otherwise, encryption is not performed.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CipherText&quot;:&quot;ZjJmZGViNzUtZWY1Mi00Y2RlLTk3****&quot;, &quot;DecryptKeyUri&quot;:&quot;<a href="http://demo.aliyundoc.com?CipherText=ZjJmZGViNzUtZWY1Mi00Y2RlLTk3****%22,%22KeyServiceType%22:%22KMS%22%7D">http://demo.aliyundoc.com?CipherText=ZjJmZGViNzUtZWY1Mi00Y2RlLTk3****&quot;,&quot;KeyServiceType&quot;:&quot;KMS&quot;}</a></p>
         */
        public Builder encryptConfig(String encryptConfig) {
            this.putQueryParameter("EncryptConfig", encryptConfig);
            this.encryptConfig = encryptConfig;
            return this;
        }

        /**
         * <p>The override parameters. The value is a JSON string. This parameter allows you to override the specified image watermark file, text watermark content, subtitle file URL, and subtitle file encoding format associated with the transcoding template. For more information about the parameter structure, see <a href="https://help.aliyun.com/document_detail/98618.html">OverrideParams</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Watermarks&quot;:[{&quot;WatermarkId&quot;:&quot;af2afe4761992c47dae973374****&quot;,&quot;FileUrl&quot;:&quot;<a href="http://developer.aliyundoc.com/image/image.png%22%7D,%7B%22WatermarkId%22:%22e8e5b8038d7ada85b376c2707****%22,%22Content%22:%22watermark">http://developer.aliyundoc.com/image/image.png&quot;},{&quot;WatermarkId&quot;:&quot;e8e5b8038d7ada85b376c2707****&quot;,&quot;Content&quot;:&quot;watermark</a> test&quot;}]}</p>
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d3e680e618708erf45fbf2cae7c****</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The priority of the current transcoding job among all queued jobs.</p>
         * <ul>
         * <li>Valid values: <strong>1</strong> to <strong>10</strong>.</li>
         * <li>Highest priority: <strong>10</strong>.</li>
         * <li>Default value: <strong>6</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>The Priority parameter only affects the priority of the current transcoding job among all queued jobs, but does not affect the priority of jobs that are already being processed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The custom ID. The ID can be 6 to 64 characters in length and can contain lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_). The ID must be unique per user.</p>
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
         * <p>The custom deduplication token. If a request with the same token was made within the last 7 days, the current request returns an error.
         * The token can be up to 50 characters in length and can contain letters, digits, hyphens (-), and underscores (_). If you do not specify this parameter or specify an empty string, deduplication is not performed.</p>
         * 
         * <strong>example:</strong>
         * <p>5c62d40299034bbaa4c195da330****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group used for video transcoding. To use a specified template group for transcoding, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Transcoding Template Groups</strong> to view the template group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0e408c803baf658ee637790c5d9f****</p>
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * <p>The custom settings. The value is a JSON string. This parameter supports settings such as message callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * <blockquote>
         * <p>To use message callbacks in this parameter, you must configure an HTTP callback URL and select the corresponding callback event types in the console. Otherwise, the callback settings do not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Extend&quot;:{&quot;localId&quot;:&quot;****&quot;,&quot;test&quot;:&quot;***&quot;}}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
         * <ul>
         * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to upload a video, the video ID is the value of the VideoId response parameter.</li>
         * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID. The video ID is the value of the VideoId response parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>142710f878bd42508932f660d7b1****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitTranscodeJobsRequest build() {
            return new SubmitTranscodeJobsRequest(this);
        } 

    } 

}
