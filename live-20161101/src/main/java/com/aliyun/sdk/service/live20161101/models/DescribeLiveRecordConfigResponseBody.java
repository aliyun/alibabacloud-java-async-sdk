// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRecordConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRecordConfigResponseBody</p>
 */
public class DescribeLiveRecordConfigResponseBody extends TeaModel {
    @NameInMap("LiveAppRecordList")
    private LiveAppRecordList liveAppRecordList;

    @NameInMap("Order")
    private String order;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
    private Integer totalNum;

    @NameInMap("TotalPage")
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

        /**
         * LiveAppRecordList.
         */
        public Builder liveAppRecordList(LiveAppRecordList liveAppRecordList) {
            this.liveAppRecordList = liveAppRecordList;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveRecordConfigResponseBody build() {
            return new DescribeLiveRecordConfigResponseBody(this);
        } 

    } 

    public static class RecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        private Integer cycleDuration;

        @NameInMap("Format")
        private String format;

        @NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @NameInMap("SliceDuration")
        private Integer sliceDuration;

        @NameInMap("SliceOssObjectPrefix")
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

            /**
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * OssObjectPrefix.
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * SliceDuration.
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * SliceOssObjectPrefix.
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
    public static class RecordFormatList extends TeaModel {
        @NameInMap("RecordFormat")
        private java.util.List < RecordFormat> recordFormat;

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
        public java.util.List < RecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

        public static final class Builder {
            private java.util.List < RecordFormat> recordFormat; 

            /**
             * RecordFormat.
             */
            public Builder recordFormat(java.util.List < RecordFormat> recordFormat) {
                this.recordFormat = recordFormat;
                return this;
            }

            public RecordFormatList build() {
                return new RecordFormatList(this);
            } 

        } 

    }
    public static class TranscodeRecordFormatListRecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        private Integer cycleDuration;

        @NameInMap("Format")
        private String format;

        @NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @NameInMap("SliceDuration")
        private Integer sliceDuration;

        @NameInMap("SliceOssObjectPrefix")
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

            /**
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * OssObjectPrefix.
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * SliceDuration.
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * SliceOssObjectPrefix.
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
    public static class TranscodeRecordFormatList extends TeaModel {
        @NameInMap("RecordFormat")
        private java.util.List < TranscodeRecordFormatListRecordFormat> recordFormat;

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
        public java.util.List < TranscodeRecordFormatListRecordFormat> getRecordFormat() {
            return this.recordFormat;
        }

        public static final class Builder {
            private java.util.List < TranscodeRecordFormatListRecordFormat> recordFormat; 

            /**
             * RecordFormat.
             */
            public Builder recordFormat(java.util.List < TranscodeRecordFormatListRecordFormat> recordFormat) {
                this.recordFormat = recordFormat;
                return this;
            }

            public TranscodeRecordFormatList build() {
                return new TranscodeRecordFormatList(this);
            } 

        } 

    }
    public static class TranscodeTemplates extends TeaModel {
        @NameInMap("Templates")
        private java.util.List < String > templates;

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
        public java.util.List < String > getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private java.util.List < String > templates; 

            /**
             * Templates.
             */
            public Builder templates(java.util.List < String > templates) {
                this.templates = templates;
                return this;
            }

            public TranscodeTemplates build() {
                return new TranscodeTemplates(this);
            } 

        } 

    }
    public static class LiveAppRecord extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("OnDemond")
        private Integer onDemond;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("RecordFormatList")
        private RecordFormatList recordFormatList;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("TranscodeRecordFormatList")
        private TranscodeRecordFormatList transcodeRecordFormatList;

        @NameInMap("TranscodeTemplates")
        private TranscodeTemplates transcodeTemplates;

        private LiveAppRecord(Builder builder) {
            this.appName = builder.appName;
            this.createTime = builder.createTime;
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

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * OnDemond.
             */
            public Builder onDemond(Integer onDemond) {
                this.onDemond = onDemond;
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
             * RecordFormatList.
             */
            public Builder recordFormatList(RecordFormatList recordFormatList) {
                this.recordFormatList = recordFormatList;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * TranscodeRecordFormatList.
             */
            public Builder transcodeRecordFormatList(TranscodeRecordFormatList transcodeRecordFormatList) {
                this.transcodeRecordFormatList = transcodeRecordFormatList;
                return this;
            }

            /**
             * TranscodeTemplates.
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
    public static class LiveAppRecordList extends TeaModel {
        @NameInMap("LiveAppRecord")
        private java.util.List < LiveAppRecord> liveAppRecord;

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
        public java.util.List < LiveAppRecord> getLiveAppRecord() {
            return this.liveAppRecord;
        }

        public static final class Builder {
            private java.util.List < LiveAppRecord> liveAppRecord; 

            /**
             * LiveAppRecord.
             */
            public Builder liveAppRecord(java.util.List < LiveAppRecord> liveAppRecord) {
                this.liveAppRecord = liveAppRecord;
                return this;
            }

            public LiveAppRecordList build() {
                return new LiveAppRecordList(this);
            } 

        } 

    }
}
