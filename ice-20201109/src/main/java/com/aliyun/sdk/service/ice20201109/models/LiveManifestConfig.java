// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link LiveManifestConfig} extends {@link TeaModel}
 *
 * <p>LiveManifestConfig</p>
 */
public class LiveManifestConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdMarkers")
    private String adMarkers;

    @com.aliyun.core.annotation.NameInMap("DateTimeInterval")
    private Integer dateTimeInterval;

    @com.aliyun.core.annotation.NameInMap("ManifestDuration")
    private Integer manifestDuration;

    @com.aliyun.core.annotation.NameInMap("MaxVideoBitrate")
    private Integer maxVideoBitrate;

    @com.aliyun.core.annotation.NameInMap("MinBufferTime")
    private Integer minBufferTime;

    @com.aliyun.core.annotation.NameInMap("MinUpdatePeriod")
    private Integer minUpdatePeriod;

    @com.aliyun.core.annotation.NameInMap("MinVideoBitrate")
    private Integer minVideoBitrate;

    @com.aliyun.core.annotation.NameInMap("PresentationDelay")
    private Integer presentationDelay;

    @com.aliyun.core.annotation.NameInMap("SegmentCount")
    private Integer segmentCount;

    @com.aliyun.core.annotation.NameInMap("SegmentTemplateFormat")
    private String segmentTemplateFormat;

    @com.aliyun.core.annotation.NameInMap("StreamOrder")
    private String streamOrder;

    private LiveManifestConfig(Builder builder) {
        this.adMarkers = builder.adMarkers;
        this.dateTimeInterval = builder.dateTimeInterval;
        this.manifestDuration = builder.manifestDuration;
        this.maxVideoBitrate = builder.maxVideoBitrate;
        this.minBufferTime = builder.minBufferTime;
        this.minUpdatePeriod = builder.minUpdatePeriod;
        this.minVideoBitrate = builder.minVideoBitrate;
        this.presentationDelay = builder.presentationDelay;
        this.segmentCount = builder.segmentCount;
        this.segmentTemplateFormat = builder.segmentTemplateFormat;
        this.streamOrder = builder.streamOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveManifestConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adMarkers
     */
    public String getAdMarkers() {
        return this.adMarkers;
    }

    /**
     * @return dateTimeInterval
     */
    public Integer getDateTimeInterval() {
        return this.dateTimeInterval;
    }

    /**
     * @return manifestDuration
     */
    public Integer getManifestDuration() {
        return this.manifestDuration;
    }

    /**
     * @return maxVideoBitrate
     */
    public Integer getMaxVideoBitrate() {
        return this.maxVideoBitrate;
    }

    /**
     * @return minBufferTime
     */
    public Integer getMinBufferTime() {
        return this.minBufferTime;
    }

    /**
     * @return minUpdatePeriod
     */
    public Integer getMinUpdatePeriod() {
        return this.minUpdatePeriod;
    }

    /**
     * @return minVideoBitrate
     */
    public Integer getMinVideoBitrate() {
        return this.minVideoBitrate;
    }

    /**
     * @return presentationDelay
     */
    public Integer getPresentationDelay() {
        return this.presentationDelay;
    }

    /**
     * @return segmentCount
     */
    public Integer getSegmentCount() {
        return this.segmentCount;
    }

    /**
     * @return segmentTemplateFormat
     */
    public String getSegmentTemplateFormat() {
        return this.segmentTemplateFormat;
    }

    /**
     * @return streamOrder
     */
    public String getStreamOrder() {
        return this.streamOrder;
    }

    public static final class Builder {
        private String adMarkers; 
        private Integer dateTimeInterval; 
        private Integer manifestDuration; 
        private Integer maxVideoBitrate; 
        private Integer minBufferTime; 
        private Integer minUpdatePeriod; 
        private Integer minVideoBitrate; 
        private Integer presentationDelay; 
        private Integer segmentCount; 
        private String segmentTemplateFormat; 
        private String streamOrder; 

        private Builder() {
        } 

        private Builder(LiveManifestConfig model) {
            this.adMarkers = model.adMarkers;
            this.dateTimeInterval = model.dateTimeInterval;
            this.manifestDuration = model.manifestDuration;
            this.maxVideoBitrate = model.maxVideoBitrate;
            this.minBufferTime = model.minBufferTime;
            this.minUpdatePeriod = model.minUpdatePeriod;
            this.minVideoBitrate = model.minVideoBitrate;
            this.presentationDelay = model.presentationDelay;
            this.segmentCount = model.segmentCount;
            this.segmentTemplateFormat = model.segmentTemplateFormat;
            this.streamOrder = model.streamOrder;
        } 

        /**
         * AdMarkers.
         */
        public Builder adMarkers(String adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        /**
         * DateTimeInterval.
         */
        public Builder dateTimeInterval(Integer dateTimeInterval) {
            this.dateTimeInterval = dateTimeInterval;
            return this;
        }

        /**
         * ManifestDuration.
         */
        public Builder manifestDuration(Integer manifestDuration) {
            this.manifestDuration = manifestDuration;
            return this;
        }

        /**
         * MaxVideoBitrate.
         */
        public Builder maxVideoBitrate(Integer maxVideoBitrate) {
            this.maxVideoBitrate = maxVideoBitrate;
            return this;
        }

        /**
         * MinBufferTime.
         */
        public Builder minBufferTime(Integer minBufferTime) {
            this.minBufferTime = minBufferTime;
            return this;
        }

        /**
         * MinUpdatePeriod.
         */
        public Builder minUpdatePeriod(Integer minUpdatePeriod) {
            this.minUpdatePeriod = minUpdatePeriod;
            return this;
        }

        /**
         * MinVideoBitrate.
         */
        public Builder minVideoBitrate(Integer minVideoBitrate) {
            this.minVideoBitrate = minVideoBitrate;
            return this;
        }

        /**
         * PresentationDelay.
         */
        public Builder presentationDelay(Integer presentationDelay) {
            this.presentationDelay = presentationDelay;
            return this;
        }

        /**
         * SegmentCount.
         */
        public Builder segmentCount(Integer segmentCount) {
            this.segmentCount = segmentCount;
            return this;
        }

        /**
         * SegmentTemplateFormat.
         */
        public Builder segmentTemplateFormat(String segmentTemplateFormat) {
            this.segmentTemplateFormat = segmentTemplateFormat;
            return this;
        }

        /**
         * StreamOrder.
         */
        public Builder streamOrder(String streamOrder) {
            this.streamOrder = streamOrder;
            return this;
        }

        public LiveManifestConfig build() {
            return new LiveManifestConfig(this);
        } 

    } 

}
