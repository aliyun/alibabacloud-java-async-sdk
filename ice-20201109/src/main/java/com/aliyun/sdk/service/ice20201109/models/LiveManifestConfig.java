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

    @com.aliyun.core.annotation.NameInMap("ManifestName")
    private String manifestName;

    @com.aliyun.core.annotation.NameInMap("MaxVideoBitrate")
    private Integer maxVideoBitrate;

    @com.aliyun.core.annotation.NameInMap("MinBufferTime")
    private Integer minBufferTime;

    @com.aliyun.core.annotation.NameInMap("MinVideoBitrate")
    private Integer minVideoBitrate;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("SegmentNum")
    private Integer segmentNum;

    @com.aliyun.core.annotation.NameInMap("StreamOrder")
    private String streamOrder;

    @com.aliyun.core.annotation.NameInMap("UseAudioRenditionGroups")
    private Boolean useAudioRenditionGroups;

    private LiveManifestConfig(Builder builder) {
        this.adMarkers = builder.adMarkers;
        this.dateTimeInterval = builder.dateTimeInterval;
        this.manifestName = builder.manifestName;
        this.maxVideoBitrate = builder.maxVideoBitrate;
        this.minBufferTime = builder.minBufferTime;
        this.minVideoBitrate = builder.minVideoBitrate;
        this.protocol = builder.protocol;
        this.segmentNum = builder.segmentNum;
        this.streamOrder = builder.streamOrder;
        this.useAudioRenditionGroups = builder.useAudioRenditionGroups;
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
     * @return manifestName
     */
    public String getManifestName() {
        return this.manifestName;
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
     * @return minVideoBitrate
     */
    public Integer getMinVideoBitrate() {
        return this.minVideoBitrate;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return segmentNum
     */
    public Integer getSegmentNum() {
        return this.segmentNum;
    }

    /**
     * @return streamOrder
     */
    public String getStreamOrder() {
        return this.streamOrder;
    }

    /**
     * @return useAudioRenditionGroups
     */
    public Boolean getUseAudioRenditionGroups() {
        return this.useAudioRenditionGroups;
    }

    public static final class Builder {
        private String adMarkers; 
        private Integer dateTimeInterval; 
        private String manifestName; 
        private Integer maxVideoBitrate; 
        private Integer minBufferTime; 
        private Integer minVideoBitrate; 
        private String protocol; 
        private Integer segmentNum; 
        private String streamOrder; 
        private Boolean useAudioRenditionGroups; 

        private Builder() {
        } 

        private Builder(LiveManifestConfig model) {
            this.adMarkers = model.adMarkers;
            this.dateTimeInterval = model.dateTimeInterval;
            this.manifestName = model.manifestName;
            this.maxVideoBitrate = model.maxVideoBitrate;
            this.minBufferTime = model.minBufferTime;
            this.minVideoBitrate = model.minVideoBitrate;
            this.protocol = model.protocol;
            this.segmentNum = model.segmentNum;
            this.streamOrder = model.streamOrder;
            this.useAudioRenditionGroups = model.useAudioRenditionGroups;
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
         * ManifestName.
         */
        public Builder manifestName(String manifestName) {
            this.manifestName = manifestName;
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
         * MinVideoBitrate.
         */
        public Builder minVideoBitrate(Integer minVideoBitrate) {
            this.minVideoBitrate = minVideoBitrate;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * SegmentNum.
         */
        public Builder segmentNum(Integer segmentNum) {
            this.segmentNum = segmentNum;
            return this;
        }

        /**
         * StreamOrder.
         */
        public Builder streamOrder(String streamOrder) {
            this.streamOrder = streamOrder;
            return this;
        }

        /**
         * UseAudioRenditionGroups.
         */
        public Builder useAudioRenditionGroups(Boolean useAudioRenditionGroups) {
            this.useAudioRenditionGroups = useAudioRenditionGroups;
            return this;
        }

        public LiveManifestConfig build() {
            return new LiveManifestConfig(this);
        } 

    } 

}
