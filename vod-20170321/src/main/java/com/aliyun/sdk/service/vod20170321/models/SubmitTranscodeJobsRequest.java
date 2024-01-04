// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTranscodeJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitTranscodeJobsRequest</p>
 */
public class SubmitTranscodeJobsRequest extends Request {
    @Query
    @NameInMap("EncryptConfig")
    private String encryptConfig;

    @Query
    @NameInMap("OverrideParams")
    private String overrideParams;

    @Query
    @NameInMap("PipelineId")
    private String pipelineId;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("TemplateGroupId")
    @Validation(required = true)
    private String templateGroupId;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VideoId")
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
         * The encryption configurations. The value must be a JSON string. This parameter is required only when you use HLS encryption.
         * <p>
         * 
         * > 
         * 
         * *   You must set **CipherText** in [EncrptConfig](~~86952~~) to the AES\_128 cipher text that is obtained from the response to the [GenerateKMSDataKey](~~455051~~) operation. Otherwise, the HLS encryption fails. For more information about how to use HLS encryption, see [HLS encryption](~~68612~~).
         * 
         * *   You must select HLS encryption for the template specified by **TemplateGroupId** no matter you use HLS encryption or Alibaba Cloud proprietary cryptography. Otherwise, the transcoded file is not encrypted.
         */
        public Builder encryptConfig(String encryptConfig) {
            this.putQueryParameter("EncryptConfig", encryptConfig);
            this.encryptConfig = encryptConfig;
            return this;
        }

        /**
         * The override parameter. The value must be a JSON string. You can use this parameter to override the image watermark, text watermark, or subtitle file specified in the transcoding template, or override the encoding format of the subtitle file. For more information about the data structure, see [OverrideParams](~~98618~~).
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * The ID of the queue that you want to use to run the job.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * The priority of the transcoding job in all queued jobs.
         * <p>
         * 
         * *   Valid values: **1** to **10**.
         * *   A value of **10** indicates the highest priority.
         * *   Default value: **6**.
         * 
         * >  This parameter takes effect only on the queued transcoding jobs. The priorities of the in-progress transcoding jobs are not affected.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The ID of the transcoding template group that you want to use. To view the template group ID, perform the following operations: Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**.
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * The custom settings. The value must be a JSON string. You can configure settings such as message callbacks. For more information, see [UserData](~~86952~~).
         * <p>
         * 
         * >  To use the callback configurations specified by this parameter, you must configure an HTTP callback URL and specify the types of the callback events in the ApsaraVideo VOD console. Otherwise, the callback configurations do not take effect.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the video file. You can use one of the following methods to obtain the video ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload the video.
         * *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload the video.
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
