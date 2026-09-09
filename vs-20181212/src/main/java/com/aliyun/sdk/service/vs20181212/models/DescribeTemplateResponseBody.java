// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
    private java.util.List<TransConfigs> transConfigs;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TransConfigs> getTransConfigs() {
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
        private java.util.List<TransConfigs> transConfigs; 
        private String trigger; 
        private String type; 

        private Builder() {
        } 

        private Builder(DescribeTemplateResponseBody model) {
            this.callback = model.callback;
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.fileFormat = model.fileFormat;
            this.flv = model.flv;
            this.hlsM3u8 = model.hlsM3u8;
            this.hlsTs = model.hlsTs;
            this.id = model.id;
            this.interval = model.interval;
            this.jpgOnDemand = model.jpgOnDemand;
            this.jpgOverwrite = model.jpgOverwrite;
            this.jpgSequence = model.jpgSequence;
            this.mp4 = model.mp4;
            this.name = model.name;
            this.ossBucket = model.ossBucket;
            this.ossEndpoint = model.ossEndpoint;
            this.ossFilePrefix = model.ossFilePrefix;
            this.region = model.region;
            this.requestId = model.requestId;
            this.retention = model.retention;
            this.transConfigs = model.transConfigs;
            this.trigger = model.trigger;
            this.type = model.type;
        } 

        /**
         * <p>Callback URL triggered after template execution.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
         */
        public Builder callback(String callback) {
            this.callback = callback;
            return this;
        }

        /**
         * <p>Template creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-10T10:00:00Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>Template description.</p>
         * 
         * <strong>example:</strong>
         * <p>录制模板</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Storage file format. Separate multiple values with commas. Valid values: mp4, flv, hls, jpg</p>
         * 
         * <strong>example:</strong>
         * <p>hls</p>
         */
        public Builder fileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * <p>Storage path for FLV files.</p>
         * <blockquote>
         * <p>Applies only to recording templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        public Builder flv(String flv) {
            this.flv = flv;
            return this;
        }

        /**
         * <p>Storage path for HLS .m3u8 files.</p>
         * <blockquote>
         * <p>Applies only to recording templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        public Builder hlsM3u8(String hlsM3u8) {
            this.hlsM3u8 = hlsM3u8;
            return this;
        }

        /**
         * <p>Storage path for HLS .ts files.</p>
         * <blockquote>
         * <p>Applies only to recording templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{UnixTimestamp}_{Sequence}</p>
         */
        public Builder hlsTs(String hlsTs) {
            this.hlsTs = hlsTs;
            return this;
        }

        /**
         * <p>Template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****998-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Operation interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder interval(Long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>Storage path for JPG files used for on-demand snapshots.</p>
         * <blockquote>
         * <p>Applies only to snapshot templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}/{UnixTimestamp}_ondemand.jpg</p>
         */
        public Builder jpgOnDemand(String jpgOnDemand) {
            this.jpgOnDemand = jpgOnDemand;
            return this;
        }

        /**
         * <p>Storage path for JPG files used to overwrite snapshots.</p>
         * <blockquote>
         * <p>Applies only to snapshot templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}.jpg</p>
         */
        public Builder jpgOverwrite(String jpgOverwrite) {
            this.jpgOverwrite = jpgOverwrite;
            return this;
        }

        /**
         * <p>Storage path for JPG files used for sequential snapshots.</p>
         * <blockquote>
         * <p>Applies only to snapshot templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>osspath/snapshot/{AppName}/{StreamName}/{UnixTimestamp}.jpg</p>
         */
        public Builder jpgSequence(String jpgSequence) {
            this.jpgSequence = jpgSequence;
            return this;
        }

        /**
         * <p>Storage path for MP4 files.</p>
         * <blockquote>
         * <p>Applies only to recording templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>osspath/record/{StreamName}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        public Builder mp4(String mp4) {
            this.mp4 = mp4;
            return this;
        }

        /**
         * <p>Template name.</p>
         * 
         * <strong>example:</strong>
         * <p>录制模板</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>my_oss_bucket</p>
         */
        public Builder ossBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * <p>OSS domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-qingdao.aliyuncs.com</p>
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * <p>OSS file prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-prefix</p>
         */
        public Builder ossFilePrefix(String ossFilePrefix) {
            this.ossFilePrefix = ossFilePrefix;
            return this;
        }

        /**
         * <p>OSS region, which is the service center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Timeshift retention period, in days.</p>
         * <blockquote>
         * <p>Applies only to timeshift templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder retention(Long retention) {
            this.retention = retention;
            return this;
        }

        /**
         * <p>List of transcoding configurations.</p>
         * <blockquote>
         * <p>Applies only to transcoding templates.</p>
         * </blockquote>
         */
        public Builder transConfigs(java.util.List<TransConfigs> transConfigs) {
            this.transConfigs = transConfigs;
            return this;
        }

        /**
         * <p>Template trigger type. Valid values:</p>
         * <ul>
         * <li><p>auto</p>
         * </li>
         * <li><p>ondemand</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Applies only to recording templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder trigger(String trigger) {
            this.trigger = trigger;
            return this;
        }

        /**
         * <p>Template type. Valid values:</p>
         * <ul>
         * <li><p>record</p>
         * </li>
         * <li><p>snapshot</p>
         * </li>
         * <li><p>transcode</p>
         * </li>
         * <li><p>timeshift</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeTemplateResponseBody build() {
            return new DescribeTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplateResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TransConfigs model) {
                this.fps = model.fps;
                this.gop = model.gop;
                this.height = model.height;
                this.id = model.id;
                this.name = model.name;
                this.videoBitrate = model.videoBitrate;
                this.videoCodec = model.videoCodec;
                this.width = model.width;
            } 

            /**
             * <p>Video frame rate, in fps.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder fps(Long fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Video GOP, in frames.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder gop(Long gop) {
                this.gop = gop;
                return this;
            }

            /**
             * <p>Video height.</p>
             * 
             * <strong>example:</strong>
             * <p>720</p>
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * <p>Transcoding configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>399*****430-cn-qingdao</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Transcoding rule name. The name appears as a suffix in the transcoded stream. We recommend using recognizable suffixes such as sd or 200k. Only letters and digits are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>sd</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Video bitrate, in kbps.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder videoBitrate(Long videoBitrate) {
                this.videoBitrate = videoBitrate;
                return this;
            }

            /**
             * <p>Video encoding.</p>
             * 
             * <strong>example:</strong>
             * <p>h264</p>
             */
            public Builder videoCodec(String videoCodec) {
                this.videoCodec = videoCodec;
                return this;
            }

            /**
             * <p>Video width.</p>
             * 
             * <strong>example:</strong>
             * <p>1280</p>
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
