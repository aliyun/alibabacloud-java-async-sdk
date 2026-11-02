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

    @com.aliyun.core.annotation.NameInMap("PartHoldBackMs")
    private Integer partHoldBackMs;

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
        this.partHoldBackMs = builder.partHoldBackMs;
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
     * @return partHoldBackMs
     */
    public Integer getPartHoldBackMs() {
        return this.partHoldBackMs;
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
        private Integer partHoldBackMs; 
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
            this.partHoldBackMs = model.partHoldBackMs;
            this.presentationDelay = model.presentationDelay;
            this.segmentCount = model.segmentCount;
            this.segmentTemplateFormat = model.segmentTemplateFormat;
            this.streamOrder = model.streamOrder;
        } 

        /**
         * <p>The ad markers supported in the playlist. Valid values:</p>
         * <ul>
         * <li>NONE: removes ad markers.</li>
         * <li>DATE_RANGE: uses the EXT-X-DATERANGE marker in the HLS specification. Available when the endpoint protocol is HLS or HLS_CMAF.</li>
         * <li>XML: uses XML ad markers in the DASH specification. Available when the endpoint protocol is DASH.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder adMarkers(String adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        /**
         * <p>The interval at which the EXT-X-PROGRAM-DATE-TIME time tag is inserted, in seconds. By default, no tag is inserted. Valid values: 1 to 3600. Applicable to the HLS and HLS_CMAF protocols.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder dateTimeInterval(Integer dateTimeInterval) {
            this.dateTimeInterval = dateTimeInterval;
            return this;
        }

        /**
         * <p>The maximum time-shift duration during live streaming, in seconds. Valid values: 1 to 3600. Default value: 60. Applicable to DASH.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder manifestDuration(Integer manifestDuration) {
            this.manifestDuration = manifestDuration;
            return this;
        }

        /**
         * <p>The maximum input bitrate threshold, in bit/s. The video track must have a bitrate less than or equal to this threshold to be played from this endpoint. Valid values: integers greater than 0. Default value: empty, which indicates that no maximum bitrate is set.</p>
         * 
         * <strong>example:</strong>
         * <p>8000000</p>
         */
        public Builder maxVideoBitrate(Integer maxVideoBitrate) {
            this.maxVideoBitrate = maxVideoBitrate;
            return this;
        }

        /**
         * <p>The minimum buffer time, in seconds. Valid values: 1 to 30. Default value: the duration of two segments. Applicable only to DASH. Note: A small minimum buffer time may cause stuttering during playback. Set this value to no less than the duration of two segments.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder minBufferTime(Integer minBufferTime) {
            this.minBufferTime = minBufferTime;
            return this;
        }

        /**
         * <p>The minimum update interval, in seconds. Valid values: 1 to 3600. Default value: the duration of two segments. Applicable to DASH. Note: Set this parameter to a value less than the minimum buffer time. A large value may cause stuttering during DASH playback.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder minUpdatePeriod(Integer minUpdatePeriod) {
            this.minUpdatePeriod = minUpdatePeriod;
            return this;
        }

        /**
         * <p>The minimum input bitrate threshold, in bit/s. The video track must have a bitrate greater than or equal to this threshold to be played from this endpoint. Valid values: integers greater than 0. Default value: empty, which indicates that no minimum bitrate is set.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        public Builder minVideoBitrate(Integer minVideoBitrate) {
            this.minVideoBitrate = minVideoBitrate;
            return this;
        }

        /**
         * <p>The part segment cache duration, in milliseconds. The minimum value is twice the PartDurationMs, and the maximum value is three times the SegmentDuration. Applicable only to LL_HLS_CMAF.</p>
         * 
         * <strong>example:</strong>
         * <p>1100</p>
         */
        public Builder partHoldBackMs(Integer partHoldBackMs) {
            this.partHoldBackMs = partHoldBackMs;
            return this;
        }

        /**
         * <p>The recommended playback start delay, in seconds. Valid values: 1 to 60. Default value: the duration of three segments.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder presentationDelay(Integer presentationDelay) {
            this.presentationDelay = presentationDelay;
            return this;
        }

        /**
         * <p>The number of segments. Applicable to the HLS and HLS_CMAF protocols. By default, the configuration of the channel is used. Valid values: 2 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder segmentCount(Integer segmentCount) {
            this.segmentCount = segmentCount;
            return this;
        }

        /**
         * <p>The segment template. Currently, only NUMBER_TIMELINE is supported. Default value: NUMBER_TIMELINE. Applicable to DASH.</p>
         * 
         * <strong>example:</strong>
         * <p>NUMBER_TIMELINE</p>
         */
        public Builder segmentTemplateFormat(String segmentTemplateFormat) {
            this.segmentTemplateFormat = segmentTemplateFormat;
            return this;
        }

        /**
         * <p>The stream sorting rule. Valid values:</p>
         * <ul>
         * <li>ORIGINAL: keeps the sorting of the input sub-playlists.</li>
         * <li>VIDEO_BITRATE_ASCENDING: sorts video streams in ascending order of bitrate.</li>
         * <li>VIDEO_BITRATE_DESCENDING: sorts video streams in descending order of bitrate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
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
