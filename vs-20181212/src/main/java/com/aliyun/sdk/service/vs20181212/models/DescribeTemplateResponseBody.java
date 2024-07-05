// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplateResponseBody</p>
 */
public class DescribeTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Callback")
    private String callback;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("FileFormat")
    private String fileFormat;

    @com.aliyun.core.annotation.NameInMap("Flv")
    private String flv;

    @com.aliyun.core.annotation.NameInMap("HlsM3u8")
    private String hlsM3u8;

    @com.aliyun.core.annotation.NameInMap("HlsTs")
    private String hlsTs;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.NameInMap("JpgOnDemand")
    private String jpgOnDemand;

    @com.aliyun.core.annotation.NameInMap("JpgOverwrite")
    private String jpgOverwrite;

    @com.aliyun.core.annotation.NameInMap("JpgSequence")
    private String jpgSequence;

    @com.aliyun.core.annotation.NameInMap("Mp4")
    private String mp4;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OssBucket")
    private String ossBucket;

    @com.aliyun.core.annotation.NameInMap("OssEndpoint")
    private String ossEndpoint;

    @com.aliyun.core.annotation.NameInMap("OssFilePrefix")
    private String ossFilePrefix;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Retention")
    private Long retention;

    @com.aliyun.core.annotation.NameInMap("TransConfigs")
    private java.util.List < TransConfigs> transConfigs;

    @com.aliyun.core.annotation.NameInMap("Trigger")
    private String trigger;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeTemplateResponseBody(Builder builder) {
        this.callback = builder.callback;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.fileFormat = builder.fileFormat;
        this.flv = builder.flv;
        this.hlsM3u8 = builder.hlsM3u8;
        this.hlsTs = builder.hlsTs;
        this.id = builder.id;
        this.interval = builder.interval;
        this.jpgOnDemand = builder.jpgOnDemand;
        this.jpgOverwrite = builder.jpgOverwrite;
        this.jpgSequence = builder.jpgSequence;
        this.mp4 = builder.mp4;
        this.name = builder.name;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ossFilePrefix = builder.ossFilePrefix;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.retention = builder.retention;
        this.transConfigs = builder.transConfigs;
        this.trigger = builder.trigger;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileFormat
     */
    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * @return flv
     */
    public String getFlv() {
        return this.flv;
    }

    /**
     * @return hlsM3u8
     */
    public String getHlsM3u8() {
        return this.hlsM3u8;
    }

    /**
     * @return hlsTs
     */
    public String getHlsTs() {
        return this.hlsTs;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return jpgOnDemand
     */
    public String getJpgOnDemand() {
        return this.jpgOnDemand;
    }

    /**
     * @return jpgOverwrite
     */
    public String getJpgOverwrite() {
        return this.jpgOverwrite;
    }

    /**
     * @return jpgSequence
     */
    public String getJpgSequence() {
        return this.jpgSequence;
    }

    /**
     * @return mp4
     */
    public String getMp4() {
        return this.mp4;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ossFilePrefix
     */
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retention
     */
    public Long getRetention() {
        return this.retention;
    }

    /**
     * @return transConfigs
     */
    public java.util.List < TransConfigs> getTransConfigs() {
        return this.transConfigs;
    }

    /**
     * @return trigger
     */
    public String getTrigger() {
        return this.trigger;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String callback; 
        private String createdTime; 
        private String description; 
        private String fileFormat; 
        private String flv; 
        private String hlsM3u8; 
        private String hlsTs; 
        private String id; 
        private Long interval; 
        private String jpgOnDemand; 
        private String jpgOverwrite; 
        private String jpgSequence; 
        private String mp4; 
        private String name; 
        private String ossBucket; 
        private String ossEndpoint; 
        private String ossFilePrefix; 
        private String region; 
        private String requestId; 
        private Long retention; 
        private java.util.List < TransConfigs> transConfigs; 
        private String trigger; 
        private String type; 

        /**
         * Callback.
         */
        public Builder callback(String callback) {
            this.callback = callback;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * FileFormat.
         */
        public Builder fileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * Flv.
         */
        public Builder flv(String flv) {
            this.flv = flv;
            return this;
        }

        /**
         * HlsM3u8.
         */
        public Builder hlsM3u8(String hlsM3u8) {
            this.hlsM3u8 = hlsM3u8;
            return this;
        }

        /**
         * HlsTs.
         */
        public Builder hlsTs(String hlsTs) {
            this.hlsTs = hlsTs;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * JpgOnDemand.
         */
        public Builder jpgOnDemand(String jpgOnDemand) {
            this.jpgOnDemand = jpgOnDemand;
            return this;
        }

        /**
         * JpgOverwrite.
         */
        public Builder jpgOverwrite(String jpgOverwrite) {
            this.jpgOverwrite = jpgOverwrite;
            return this;
        }

        /**
         * JpgSequence.
         */
        public Builder jpgSequence(String jpgSequence) {
            this.jpgSequence = jpgSequence;
            return this;
        }

        /**
         * Mp4.
         */
        public Builder mp4(String mp4) {
            this.mp4 = mp4;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * OssFilePrefix.
         */
        public Builder ossFilePrefix(String ossFilePrefix) {
            this.ossFilePrefix = ossFilePrefix;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Retention.
         */
        public Builder retention(Long retention) {
            this.retention = retention;
            return this;
        }

        /**
         * TransConfigs.
         */
        public Builder transConfigs(java.util.List < TransConfigs> transConfigs) {
            this.transConfigs = transConfigs;
            return this;
        }

        /**
         * Trigger.
         */
        public Builder trigger(String trigger) {
            this.trigger = trigger;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeTemplateResponseBody build() {
            return new DescribeTemplateResponseBody(this);
        } 

    } 

    public static class TransConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fps")
        private Long fps;

        @com.aliyun.core.annotation.NameInMap("Gop")
        private Long gop;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("VideoBitrate")
        private Long videoBitrate;

        @com.aliyun.core.annotation.NameInMap("VideoCodec")
        private String videoCodec;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Long width;

        private TransConfigs(Builder builder) {
            this.fps = builder.fps;
            this.gop = builder.gop;
            this.height = builder.height;
            this.id = builder.id;
            this.name = builder.name;
            this.videoBitrate = builder.videoBitrate;
            this.videoCodec = builder.videoCodec;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransConfigs create() {
            return builder().build();
        }

        /**
         * @return fps
         */
        public Long getFps() {
            return this.fps;
        }

        /**
         * @return gop
         */
        public Long getGop() {
            return this.gop;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return videoBitrate
         */
        public Long getVideoBitrate() {
            return this.videoBitrate;
        }

        /**
         * @return videoCodec
         */
        public String getVideoCodec() {
            return this.videoCodec;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Long fps; 
            private Long gop; 
            private Long height; 
            private String id; 
            private String name; 
            private Long videoBitrate; 
            private String videoCodec; 
            private Long width; 

            /**
             * Fps.
             */
            public Builder fps(Long fps) {
                this.fps = fps;
                return this;
            }

            /**
             * Gop.
             */
            public Builder gop(Long gop) {
                this.gop = gop;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VideoBitrate.
             */
            public Builder videoBitrate(Long videoBitrate) {
                this.videoBitrate = videoBitrate;
                return this;
            }

            /**
             * VideoCodec.
             */
            public Builder videoCodec(String videoCodec) {
                this.videoCodec = videoCodec;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public TransConfigs build() {
                return new TransConfigs(this);
            } 

        } 

    }
}
