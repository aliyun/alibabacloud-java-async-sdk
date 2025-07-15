// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRecordConfigResponseBody</p>
 */
public class DescribeLiveRecordConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveAppRecordList")
    private LiveAppRecordList liveAppRecordList;

    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeLiveRecordConfigResponseBody(Builder builder) {
        this.liveAppRecordList = builder.liveAppRecordList;
        this.order = builder.order;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRecordConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveAppRecordList
     */
    public LiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private LiveAppRecordList liveAppRecordList; 
        private String order; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLiveRecordConfigResponseBody model) {
            this.liveAppRecordList = model.liveAppRecordList;
            this.order = model.order;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The list of recording configurations.</p>
         */
        public Builder liveAppRecordList(LiveAppRecordList liveAppRecordList) {
            this.liveAppRecordList = liveAppRecordList;
            return this;
        }

        /**
         * <p>The sorting order of recording configurations by creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5056369B-D337-499E-B8B7-B761BD37B08A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of recording configurations that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveRecordConfigResponseBody build() {
            return new DescribeLiveRecordConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordConfigResponseBody</p>
     */
    public static class RecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        @com.aliyun.core.annotation.NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private RecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            private Builder() {
            } 

            private Builder(RecordFormat model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.ossObjectPrefix = model.ossObjectPrefix;
                this.sliceDuration = model.sliceDuration;
                this.sliceOssObjectPrefix = model.sliceOssObjectPrefix;
            } 

            /**
             * <p>The duration of a recording file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>The format of recording files.</p>
             * 
             * <strong>example:</strong>
             * <p>M3U8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The naming format of a recording file.</p>
             * 
             * <strong>example:</strong>
             * <p>record/{liveApp****}/{liveStream****}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>The duration of a segment file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * <p>The naming format of a segment file.</p>
             * 
             * <strong>example:</strong>
             * <p>record/{liveApp****}/{liveStream****}/{UnixTimestamp}</p>
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public RecordFormat build() {
                return new RecordFormat(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordConfigResponseBody</p>
     */
    public static class RecordFormatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordFormat")
        private java.util.List<RecordFormat> recordFormat;

        private RecordFormatList(Builder builder) {
            this.recordFormat = builder.recordFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormatList create() {
            return builder().build();
        }

        /**
         * @return recordFormat
         */
        public java.util.List<RecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

        public static final class Builder {
            private java.util.List<RecordFormat> recordFormat; 

            private Builder() {
            } 

            private Builder(RecordFormatList model) {
                this.recordFormat = model.recordFormat;
            } 

            /**
             * RecordFormat.
             */
            public Builder recordFormat(java.util.List<RecordFormat> recordFormat) {
                this.recordFormat = recordFormat;
                return this;
            }

            public RecordFormatList build() {
                return new RecordFormatList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordConfigResponseBody</p>
     */
    public static class TranscodeRecordFormatListRecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        @com.aliyun.core.annotation.NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private TranscodeRecordFormatListRecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeRecordFormatListRecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            private Builder() {
            } 

            private Builder(TranscodeRecordFormatListRecordFormat model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.ossObjectPrefix = model.ossObjectPrefix;
                this.sliceDuration = model.sliceDuration;
                this.sliceOssObjectPrefix = model.sliceOssObjectPrefix;
            } 

            /**
             * <p>The duration of a recording file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>The format of recording files.</p>
             * 
             * <strong>example:</strong>
             * <p>M3U8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The naming format of a recording file.</p>
             * 
             * <strong>example:</strong>
             * <p>record/{liveApp****}/{liveStream****}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>The duration of a segment file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * <p>The naming format of a segment file.</p>
             * 
             * <strong>example:</strong>
             * <p>record/{liveApp****}/{liveStream****}/{UnixTimestamp}</p>
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public TranscodeRecordFormatListRecordFormat build() {
                return new TranscodeRecordFormatListRecordFormat(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordConfigResponseBody</p>
     */
    public static class TranscodeRecordFormatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordFormat")
        private java.util.List<TranscodeRecordFormatListRecordFormat> recordFormat;

        private TranscodeRecordFormatList(Builder builder) {
            this.recordFormat = builder.recordFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeRecordFormatList create() {
            return builder().build();
        }

        /**
         * @return recordFormat
         */
        public java.util.List<TranscodeRecordFormatListRecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

        public static final class Builder {
            private java.util.List<TranscodeRecordFormatListRecordFormat> recordFormat; 

            private Builder() {
            } 

            private Builder(TranscodeRecordFormatList model) {
                this.recordFormat = model.recordFormat;
            } 

            /**
             * RecordFormat.
             */
            public Builder recordFormat(java.util.List<TranscodeRecordFormatListRecordFormat> recordFormat) {
                this.recordFormat = recordFormat;
                return this;
            }

            public TranscodeRecordFormatList build() {
                return new TranscodeRecordFormatList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordConfigResponseBody</p>
     */
    public static class TranscodeTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Templates")
        private java.util.List<String> templates;

        private TranscodeTemplates(Builder builder) {
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeTemplates create() {
            return builder().build();
        }

        /**
         * @return templates
         */
        public java.util.List<String> getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private java.util.List<String> templates; 

            private Builder() {
            } 

            private Builder(TranscodeTemplates model) {
                this.templates = model.templates;
            } 

            /**
             * Templates.
             */
            public Builder templates(java.util.List<String> templates) {
                this.templates = templates;
                return this;
            }

            public TranscodeTemplates build() {
                return new TranscodeTemplates(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordConfigResponseBody</p>
     */
    public static class LiveAppRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Integer delayTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("OnDemond")
        private Integer onDemond;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("RecordFormatList")
        private RecordFormatList recordFormatList;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("TranscodeRecordFormatList")
        private TranscodeRecordFormatList transcodeRecordFormatList;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplates")
        private TranscodeTemplates transcodeTemplates;

        private LiveAppRecord(Builder builder) {
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.delayTime = builder.delayTime;
            this.domainName = builder.domainName;
            this.endTime = builder.endTime;
            this.onDemond = builder.onDemond;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.recordFormatList = builder.recordFormatList;
            this.startTime = builder.startTime;
            this.streamName = builder.streamName;
            this.transcodeRecordFormatList = builder.transcodeRecordFormatList;
            this.transcodeTemplates = builder.transcodeTemplates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAppRecord create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delayTime
         */
        public Integer getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return onDemond
         */
        public Integer getOnDemond() {
            return this.onDemond;
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
         * @return recordFormatList
         */
        public RecordFormatList getRecordFormatList() {
            return this.recordFormatList;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return transcodeRecordFormatList
         */
        public TranscodeRecordFormatList getTranscodeRecordFormatList() {
            return this.transcodeRecordFormatList;
        }

        /**
         * @return transcodeTemplates
         */
        public TranscodeTemplates getTranscodeTemplates() {
            return this.transcodeTemplates;
        }

        public static final class Builder {
            private String appName; 
            private String createTime; 
            private Integer delayTime; 
            private String domainName; 
            private String endTime; 
            private Integer onDemond; 
            private String ossBucket; 
            private String ossEndpoint; 
            private RecordFormatList recordFormatList; 
            private String startTime; 
            private String streamName; 
            private TranscodeRecordFormatList transcodeRecordFormatList; 
            private TranscodeTemplates transcodeTemplates; 

            private Builder() {
            } 

            private Builder(LiveAppRecord model) {
                this.appName = model.appName;
                this.createTime = model.createTime;
                this.delayTime = model.delayTime;
                this.domainName = model.domainName;
                this.endTime = model.endTime;
                this.onDemond = model.onDemond;
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.recordFormatList = model.recordFormatList;
                this.startTime = model.startTime;
                this.streamName = model.streamName;
                this.transcodeRecordFormatList = model.transcodeRecordFormatList;
                this.transcodeTemplates = model.transcodeTemplates;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The time when the recording configuration was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-05-20T09:33:38Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The maximum interruption duration of the live stream. If the actual interruption duration exceeds the threshold, a new recording is generated. Valid values: 15 to 21600. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder delayTime(Integer delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * <p>The name of the main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The end time of the recording. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-08T03:49:18Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The configuration of on-demand recording. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disables on-demand recording.</li>
             * <li><strong>1</strong>: enables on-demand recording that is triggered by HTTP callbacks.</li>
             * <li><strong>2</strong>: enables on-demand recording that is triggered by stream ingest parameters.</li>
             * <li><strong>7</strong>: enables on-demand recording by calling the <a href="https://help.aliyun.com/document_detail/85907.html">RealTimeRecordCommand</a> operation to manually start or stop recording.</li>
             * </ul>
             * <blockquote>
             * <p> If you set OnDemand to <strong>1</strong>, you must call the <a href="https://help.aliyun.com/document_detail/51831.html">AddLiveRecordNotifyConfig</a> operation to configure OnDemandUrl. Otherwise, the configuration of on-demand recording is invalid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onDemond(Integer onDemond) {
                this.onDemond = onDemond;
                return this;
            }

            /**
             * <p>The name of the Object Storage Service (OSS) bucket in which the recordings are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>liveBucket****</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The endpoint of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-oss-****.aliyuncs.com</p>
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * <p>The recording formats of original streams.</p>
             */
            public Builder recordFormatList(RecordFormatList recordFormatList) {
                this.recordFormatList = recordFormatList;
                return this;
            }

            /**
             * <p>The start time of the recording. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-08T02:49:18Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The recording formats of transcoded streams.</p>
             */
            public Builder transcodeRecordFormatList(TranscodeRecordFormatList transcodeRecordFormatList) {
                this.transcodeRecordFormatList = transcodeRecordFormatList;
                return this;
            }

            /**
             * <p>The transcoding templates.</p>
             */
            public Builder transcodeTemplates(TranscodeTemplates transcodeTemplates) {
                this.transcodeTemplates = transcodeTemplates;
                return this;
            }

            public LiveAppRecord build() {
                return new LiveAppRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveRecordConfigResponseBody</p>
     */
    public static class LiveAppRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveAppRecord")
        private java.util.List<LiveAppRecord> liveAppRecord;

        private LiveAppRecordList(Builder builder) {
            this.liveAppRecord = builder.liveAppRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAppRecordList create() {
            return builder().build();
        }

        /**
         * @return liveAppRecord
         */
        public java.util.List<LiveAppRecord> getLiveAppRecord() {
            return this.liveAppRecord;
        }

        public static final class Builder {
            private java.util.List<LiveAppRecord> liveAppRecord; 

            private Builder() {
            } 

            private Builder(LiveAppRecordList model) {
                this.liveAppRecord = model.liveAppRecord;
            } 

            /**
             * LiveAppRecord.
             */
            public Builder liveAppRecord(java.util.List<LiveAppRecord> liveAppRecord) {
                this.liveAppRecord = liveAppRecord;
                return this;
            }

            public LiveAppRecordList build() {
                return new LiveAppRecordList(this);
            } 

        } 

    }
}
