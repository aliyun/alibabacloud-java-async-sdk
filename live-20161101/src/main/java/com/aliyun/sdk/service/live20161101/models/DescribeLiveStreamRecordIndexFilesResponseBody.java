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
 * {@link DescribeLiveStreamRecordIndexFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamRecordIndexFilesResponseBody</p>
 */
public class DescribeLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RecordIndexInfoList")
    private RecordIndexInfoList recordIndexInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeLiveStreamRecordIndexFilesResponseBody(Builder builder) {
        this.order = builder.order;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.recordIndexInfoList = builder.recordIndexInfoList;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamRecordIndexFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return recordIndexInfoList
     */
    public RecordIndexInfoList getRecordIndexInfoList() {
        return this.recordIndexInfoList;
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
        private String order; 
        private Integer pageNum; 
        private Integer pageSize; 
        private RecordIndexInfoList recordIndexInfoList; 
        private String requestId; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamRecordIndexFilesResponseBody model) {
            this.order = model.order;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.recordIndexInfoList = model.recordIndexInfoList;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The index files.</p>
         */
        public Builder recordIndexInfoList(RecordIndexInfoList recordIndexInfoList) {
            this.recordIndexInfoList = recordIndexInfoList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DE24625C-7C0F-4020-8448-9C31A50C1556</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that meet the specified conditions.</p>
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

        public DescribeLiveStreamRecordIndexFilesResponseBody build() {
            return new DescribeLiveStreamRecordIndexFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamRecordIndexFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamRecordIndexFilesResponseBody</p>
     */
    public static class RecordIndexInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssObject")
        private String ossObject;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("RecordUrl")
        private String recordUrl;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        private RecordIndexInfo(Builder builder) {
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.format = builder.format;
            this.height = builder.height;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossObject = builder.ossObject;
            this.recordId = builder.recordId;
            this.recordUrl = builder.recordUrl;
            this.startTime = builder.startTime;
            this.streamName = builder.streamName;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordIndexInfo create() {
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
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
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
         * @return ossObject
         */
        public String getOssObject() {
            return this.ossObject;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return recordUrl
         */
        public String getRecordUrl() {
            return this.recordUrl;
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
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String appName; 
            private String createTime; 
            private String domainName; 
            private Float duration; 
            private String endTime; 
            private String format; 
            private Integer height; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObject; 
            private String recordId; 
            private String recordUrl; 
            private String startTime; 
            private String streamName; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(RecordIndexInfo model) {
                this.appName = model.appName;
                this.createTime = model.createTime;
                this.domainName = model.domainName;
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.format = model.format;
                this.height = model.height;
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.ossObject = model.ossObject;
                this.recordId = model.recordId;
                this.recordUrl = model.recordUrl;
                this.startTime = model.startTime;
                this.streamName = model.streamName;
                this.width = model.width;
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
             * <p>The time when the index file was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-05-27T09:40:56Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The recording length. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>588.849</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The end time of the index file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-01T07:46:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The video format.</p>
             * 
             * <strong>example:</strong>
             * <p>HLS</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The video height.</p>
             * 
             * <strong>example:</strong>
             * <p>480</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The name of the Object Storage Service (OSS) bucket.</p>
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
             * <p>The name of the storage file in OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>liveObject****</p>
             */
            public Builder ossObject(String ossObject) {
                this.ossObject = ossObject;
                return this;
            }

            /**
             * <p>The ID of the index file.</p>
             * 
             * <strong>example:</strong>
             * <p>c4d7f0a4-b506-43f9-8de3-07732c3f****</p>
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The URL of the index file.</p>
             */
            public Builder recordUrl(String recordUrl) {
                this.recordUrl = recordUrl;
                return this;
            }

            /**
             * <p>The start time of the index file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-01T07:36:00Z</p>
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
             * <p>The video width.</p>
             * 
             * <strong>example:</strong>
             * <p>640</p>
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public RecordIndexInfo build() {
                return new RecordIndexInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamRecordIndexFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamRecordIndexFilesResponseBody</p>
     */
    public static class RecordIndexInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordIndexInfo")
        private java.util.List<RecordIndexInfo> recordIndexInfo;

        private RecordIndexInfoList(Builder builder) {
            this.recordIndexInfo = builder.recordIndexInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordIndexInfoList create() {
            return builder().build();
        }

        /**
         * @return recordIndexInfo
         */
        public java.util.List<RecordIndexInfo> getRecordIndexInfo() {
            return this.recordIndexInfo;
        }

        public static final class Builder {
            private java.util.List<RecordIndexInfo> recordIndexInfo; 

            private Builder() {
            } 

            private Builder(RecordIndexInfoList model) {
                this.recordIndexInfo = model.recordIndexInfo;
            } 

            /**
             * RecordIndexInfo.
             */
            public Builder recordIndexInfo(java.util.List<RecordIndexInfo> recordIndexInfo) {
                this.recordIndexInfo = recordIndexInfo;
                return this;
            }

            public RecordIndexInfoList build() {
                return new RecordIndexInfoList(this);
            } 

        } 

    }
}
