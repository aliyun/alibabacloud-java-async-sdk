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
 * {@link DescribeRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordsResponseBody</p>
 */
public class DescribeRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextStartTime")
    private String nextStartTime;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Long pageCount;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRecordsResponseBody(Builder builder) {
        this.nextStartTime = builder.nextStartTime;
        this.pageCount = builder.pageCount;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextStartTime
     */
    public String getNextStartTime() {
        return this.nextStartTime;
    }

    /**
     * @return pageCount
     */
    public Long getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextStartTime; 
        private Long pageCount; 
        private Long pageNum; 
        private Long pageSize; 
        private java.util.List<Records> records; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRecordsResponseBody model) {
            this.nextStartTime = model.nextStartTime;
            this.pageCount = model.pageCount;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.records = model.records;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The start time to query the next record.</p>
         * <blockquote>
         * <p>Applies only to snapshot queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-12-10T11:00:00Z</p>
         */
        public Builder nextStartTime(String nextStartTime) {
            this.nextStartTime = nextStartTime;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * <blockquote>
         * <p>Applies only to recording queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <blockquote>
         * <p>Applies only to recording queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The page size.</p>
         * <blockquote>
         * <p>Applies only to recording queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of stored records.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of stored records.</p>
         * <blockquote>
         * <p>Applies only to recording queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRecordsResponseBody build() {
            return new DescribeRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FileFormat")
        private String fileFormat;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssObject")
        private String ossObject;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StreamId")
        private String streamId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Long width;

        private Records(Builder builder) {
            this.endTime = builder.endTime;
            this.fileFormat = builder.fileFormat;
            this.height = builder.height;
            this.id = builder.id;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossObject = builder.ossObject;
            this.startTime = builder.startTime;
            this.streamId = builder.streamId;
            this.templateId = builder.templateId;
            this.type = builder.type;
            this.url = builder.url;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileFormat
         */
        public String getFileFormat() {
            return this.fileFormat;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return streamId
         */
        public String getStreamId() {
            return this.streamId;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String endTime; 
            private String fileFormat; 
            private Long height; 
            private String id; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObject; 
            private String startTime; 
            private String streamId; 
            private String templateId; 
            private String type; 
            private String url; 
            private Long width; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.endTime = model.endTime;
                this.fileFormat = model.fileFormat;
                this.height = model.height;
                this.id = model.id;
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.ossObject = model.ossObject;
                this.startTime = model.startTime;
                this.streamId = model.streamId;
                this.templateId = model.templateId;
                this.type = model.type;
                this.url = model.url;
                this.width = model.width;
            } 

            /**
             * <p>The end time of the stored record.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-23T18:33:48</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The format of the stored file. Valid values:</p>
             * <ul>
             * <li><p>mp4</p>
             * </li>
             * <li><p>flv</p>
             * </li>
             * <li><p>hls</p>
             * </li>
             * <li><p>jpg</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hls</p>
             */
            public Builder fileFormat(String fileFormat) {
                this.fileFormat = fileFormat;
                return this;
            }

            /**
             * <p>The height.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The ID of the stored record.</p>
             * <blockquote>
             * <p>Applies only to recording queries.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2be2a673-6033-4874-b6f2-f2bc0a1*****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The bucket where the file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>my_oss_bucket</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The OSS endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-qingdao.aliyuncs.com</p>
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * <p>The object of the stored file.</p>
             * 
             * <strong>example:</strong>
             * <p>record/live/310*****007/2021-11-23-18-19-38_2021-11-23-18-33-48.m3u8</p>
             */
            public Builder ossObject(String ossObject) {
                this.ossObject = ossObject;
                return this;
            }

            /**
             * <p>The start time of the stored record.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-23T18:19:32</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The stream ID.</p>
             * 
             * <strong>example:</strong>
             * <p>323*****997-cn-qingdao</p>
             */
            public Builder streamId(String streamId) {
                this.streamId = streamId;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>388*****204-cn-qingdao</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The type of the stored record. Valid values:</p>
             * <ul>
             * <li><p>record</p>
             * </li>
             * <li><p>snapshot</p>
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

            /**
             * <p>The URL of the stored file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://my_oss_bucket.oss-cn-qingdao.aliyuncs.com/record/live/310*****007/2021-11-23-18-19-38_2021-11-23-18-33-48.m3u8">http://my_oss_bucket.oss-cn-qingdao.aliyuncs.com/record/live/310*****007/2021-11-23-18-19-38_2021-11-23-18-33-48.m3u8</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The width.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
