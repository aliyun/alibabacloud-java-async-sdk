// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDynamicImageJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitDynamicImageJobRequest</p>
 */
public class SubmitDynamicImageJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicImageTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dynamicImageTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverrideParams")
    private String overrideParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private SubmitDynamicImageJobRequest(Builder builder) {
        super(builder);
        this.dynamicImageTemplateId = builder.dynamicImageTemplateId;
        this.overrideParams = builder.overrideParams;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDynamicImageJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicImageTemplateId
     */
    public String getDynamicImageTemplateId() {
        return this.dynamicImageTemplateId;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitDynamicImageJobRequest, Builder> {
        private String dynamicImageTemplateId; 
        private String overrideParams; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDynamicImageJobRequest request) {
            super(request);
            this.dynamicImageTemplateId = request.dynamicImageTemplateId;
            this.overrideParams = request.overrideParams;
            this.videoId = request.videoId;
        } 

        /**
         * The ID of the frame animation template.
         */
        public Builder dynamicImageTemplateId(String dynamicImageTemplateId) {
            this.putQueryParameter("DynamicImageTemplateId", dynamicImageTemplateId);
            this.dynamicImageTemplateId = dynamicImageTemplateId;
            return this;
        }

        /**
         * The override parameter. Specify the value in the JSON format. For more information, see [Parameters for media processing](~~98618~~). You can use this parameter to override configurations in the animated image template. For more information, see the "DynamicImageTemplateConfig: the configurations of an animated sticker template" section of the [Basic data types](~~52839~~) topic.
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * The ID of the video. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the media file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.
         * *   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload media files.
         * *   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload media files.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitDynamicImageJobRequest build() {
            return new SubmitDynamicImageJobRequest(this);
        } 

    } 

}
