// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
            this.templateGroupId = request.templateGroupId;
            this.userData = request.userData;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The encryption configurations. The value must be a JSON string. This parameter is required only when you use HLS encryption.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You must set <strong>CipherText</strong> in <a href="https://help.aliyun.com/document_detail/86952.html">EncrptConfig</a> to the AES_128 cipher text that is obtained from the response to the <a href="https://help.aliyun.com/document_detail/455051.html">GenerateKMSDataKey</a> operation. Otherwise, the HLS encryption fails. For more information about how to use HLS encryption, see <a href="https://help.aliyun.com/document_detail/68612.html">HLS encryption</a>.</p>
         * </li>
         * <li><p>You must select HLS encryption for the template specified by <strong>TemplateGroupId</strong> no matter you use HLS encryption or Alibaba Cloud proprietary cryptography. Otherwise, the transcoded file is not encrypted.</p>
         * </li>
         * </ul>
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
         * <p>The override parameter. The value must be a JSON string. You can use this parameter to override the image watermark, text watermark, or subtitle file specified in the transcoding template, or override the encoding format of the subtitle file. For more information about the data structure, see <a href="https://help.aliyun.com/document_detail/98618.html">OverrideParams</a>.</p>
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
         * <p>The ID of the queue that you want to use to run the job.</p>
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
         * <p>The priority of the transcoding job in all queued jobs.</p>
         * <ul>
         * <li>Valid values: <strong>1</strong> to <strong>10</strong>.</li>
         * <li>A value of <strong>10</strong> indicates the highest priority.</li>
         * <li>Default value: <strong>6</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only on the queued transcoding jobs. The priorities of the in-progress transcoding jobs are not affected.</p>
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
         * <p>The ID of the transcoding template group that you want to use. To view the template group ID, perform the following operations: Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Transcoding Template Groups</strong>.</p>
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
         * <p>The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * <blockquote>
         * <p> To use the callback configurations specified by this parameter, you must configure an HTTP callback URL and specify the types of the callback events in the ApsaraVideo VOD console. Otherwise, the callback configurations do not take effect.</p>
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
         * <p>The ID of the video file. You can use one of the following methods to obtain the video ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload the video.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation after you upload the video.</li>
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
