// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link UsageInfoDTO} extends {@link TeaModel}
 *
 * <p>UsageInfoDTO</p>
 */
public class UsageInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("completionTokens")
    private Integer completionTokens;

    @com.aliyun.core.annotation.NameInMap("imageCount")
    private Integer imageCount;

    @com.aliyun.core.annotation.NameInMap("promptTokens")
    private Integer promptTokens;

    @com.aliyun.core.annotation.NameInMap("totalTokens")
    private Integer totalTokens;

    @com.aliyun.core.annotation.NameInMap("videoCount")
    private Integer videoCount;

    @com.aliyun.core.annotation.NameInMap("videoDuration")
    private Integer videoDuration;

    private UsageInfoDTO(Builder builder) {
        this.completionTokens = builder.completionTokens;
        this.imageCount = builder.imageCount;
        this.promptTokens = builder.promptTokens;
        this.totalTokens = builder.totalTokens;
        this.videoCount = builder.videoCount;
        this.videoDuration = builder.videoDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UsageInfoDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completionTokens
     */
    public Integer getCompletionTokens() {
        return this.completionTokens;
    }

    /**
     * @return imageCount
     */
    public Integer getImageCount() {
        return this.imageCount;
    }

    /**
     * @return promptTokens
     */
    public Integer getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * @return totalTokens
     */
    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    /**
     * @return videoCount
     */
    public Integer getVideoCount() {
        return this.videoCount;
    }

    /**
     * @return videoDuration
     */
    public Integer getVideoDuration() {
        return this.videoDuration;
    }

    public static final class Builder {
        private Integer completionTokens; 
        private Integer imageCount; 
        private Integer promptTokens; 
        private Integer totalTokens; 
        private Integer videoCount; 
        private Integer videoDuration; 

        private Builder() {
        } 

        private Builder(UsageInfoDTO model) {
            this.completionTokens = model.completionTokens;
            this.imageCount = model.imageCount;
            this.promptTokens = model.promptTokens;
            this.totalTokens = model.totalTokens;
            this.videoCount = model.videoCount;
            this.videoDuration = model.videoDuration;
        } 

        /**
         * completionTokens.
         */
        public Builder completionTokens(Integer completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }

        /**
         * imageCount.
         */
        public Builder imageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }

        /**
         * promptTokens.
         */
        public Builder promptTokens(Integer promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }

        /**
         * totalTokens.
         */
        public Builder totalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }

        /**
         * videoCount.
         */
        public Builder videoCount(Integer videoCount) {
            this.videoCount = videoCount;
            return this;
        }

        /**
         * videoDuration.
         */
        public Builder videoDuration(Integer videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }

        public UsageInfoDTO build() {
            return new UsageInfoDTO(this);
        } 

    } 

}
