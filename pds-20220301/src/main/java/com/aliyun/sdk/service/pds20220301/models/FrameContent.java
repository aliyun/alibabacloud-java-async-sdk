// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FrameContent} extends {@link TeaModel}
 *
 * <p>FrameContent</p>
 */
public class FrameContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("frame_time")
    private Long frameTime;

    @com.aliyun.core.annotation.NameInMap("thumbnail_url")
    private String thumbnailUrl;

    private FrameContent(Builder builder) {
        this.frameTime = builder.frameTime;
        this.thumbnailUrl = builder.thumbnailUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FrameContent create() {
        return builder().build();
    }

    /**
     * @return frameTime
     */
    public Long getFrameTime() {
        return this.frameTime;
    }

    /**
     * @return thumbnailUrl
     */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public static final class Builder {
        private Long frameTime; 
        private String thumbnailUrl; 

        /**
         * frame_time.
         */
        public Builder frameTime(Long frameTime) {
            this.frameTime = frameTime;
            return this;
        }

        /**
         * thumbnail_url.
         */
        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public FrameContent build() {
            return new FrameContent(this);
        } 

    } 

}
