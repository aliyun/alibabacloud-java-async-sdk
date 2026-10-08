// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link SceneElement} extends {@link TeaModel}
 *
 * <p>SceneElement</p>
 */
public class SceneElement extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FrameTimes")
    private java.util.List<Long> frameTimes;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.NameInMap("TimeRange")
    private java.util.List<Long> timeRange;

    @com.aliyun.core.annotation.NameInMap("VideoStreamIndex")
    private Long videoStreamIndex;

    private SceneElement(Builder builder) {
        this.frameTimes = builder.frameTimes;
        this.labels = builder.labels;
        this.timeRange = builder.timeRange;
        this.videoStreamIndex = builder.videoStreamIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SceneElement create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return frameTimes
     */
    public java.util.List<Long> getFrameTimes() {
        return this.frameTimes;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return timeRange
     */
    public java.util.List<Long> getTimeRange() {
        return this.timeRange;
    }

    /**
     * @return videoStreamIndex
     */
    public Long getVideoStreamIndex() {
        return this.videoStreamIndex;
    }

    public static final class Builder {
        private java.util.List<Long> frameTimes; 
        private java.util.List<Label> labels; 
        private java.util.List<Long> timeRange; 
        private Long videoStreamIndex; 

        private Builder() {
        } 

        private Builder(SceneElement model) {
            this.frameTimes = model.frameTimes;
            this.labels = model.labels;
            this.timeRange = model.timeRange;
            this.videoStreamIndex = model.videoStreamIndex;
        } 

        /**
         * <p>The timestamps of the frames within the current video element that match the search content. The unit is milliseconds.</p>
         */
        public Builder frameTimes(java.util.List<Long> frameTimes) {
            this.frameTimes = frameTimes;
            return this;
        }

        /**
         * <p>The label information.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The time range of the video element. The array has a fixed length of 2. The two values represent the start time and end time in milliseconds.</p>
         */
        public Builder timeRange(java.util.List<Long> timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * <p>The index of the video stream to which the current video scene element belongs. This corresponds to the index in the <a href="https://help.aliyun.com/zh/imm/developer-reference/api-imm-2020-09-30-detectmediameta?spm=a2c4g.11186623.0.0.463e600fIDdM8r#api-detail-40">VideoStreams</a> array.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder videoStreamIndex(Long videoStreamIndex) {
            this.videoStreamIndex = videoStreamIndex;
            return this;
        }

        public SceneElement build() {
            return new SceneElement(this);
        } 

    } 

}
