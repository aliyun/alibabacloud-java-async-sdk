// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SceneContent} extends {@link TeaModel}
 *
 * <p>SceneContent</p>
 */
public class SceneContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key_frames")
    private java.util.List < FrameContent > keyFrames;

    @com.aliyun.core.annotation.NameInMap("thumbnail_url")
    private String thumbnailUrl;

    @com.aliyun.core.annotation.NameInMap("time_range")
    private java.util.List < Long > timeRange;

    private SceneContent(Builder builder) {
        this.keyFrames = builder.keyFrames;
        this.thumbnailUrl = builder.thumbnailUrl;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SceneContent create() {
        return builder().build();
    }

    /**
     * @return keyFrames
     */
    public java.util.List < FrameContent > getKeyFrames() {
        return this.keyFrames;
    }

    /**
     * @return thumbnailUrl
     */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * @return timeRange
     */
    public java.util.List < Long > getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private java.util.List < FrameContent > keyFrames; 
        private String thumbnailUrl; 
        private java.util.List < Long > timeRange; 

        /**
         * key_frames.
         */
        public Builder keyFrames(java.util.List < FrameContent > keyFrames) {
            this.keyFrames = keyFrames;
            return this;
        }

        /**
         * thumbnail_url.
         */
        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        /**
         * time_range.
         */
        public Builder timeRange(java.util.List < Long > timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public SceneContent build() {
            return new SceneContent(this);
        } 

    } 

}
