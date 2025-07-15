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
 * {@link DescribeLiveStreamRecordIndexFileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamRecordIndexFileResponseBody</p>
 */
public class DescribeLiveStreamRecordIndexFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordIndexInfo")
    private RecordIndexInfo recordIndexInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamRecordIndexFileResponseBody(Builder builder) {
        this.recordIndexInfo = builder.recordIndexInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamRecordIndexFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordIndexInfo
     */
    public RecordIndexInfo getRecordIndexInfo() {
        return this.recordIndexInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordIndexInfo recordIndexInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamRecordIndexFileResponseBody model) {
            this.recordIndexInfo = model.recordIndexInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the index file.</p>
         */
        public Builder recordIndexInfo(RecordIndexInfo recordIndexInfo) {
            this.recordIndexInfo = recordIndexInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5EBF2AC3-4B73-40A5-8B32-83F49D5F035E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamRecordIndexFileResponseBody build() {
            return new DescribeLiveStreamRecordIndexFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamRecordIndexFileResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamRecordIndexFileResponseBody</p>
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
             * <p>The time when the index file was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
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
             * <p>2016-05-25T05:47:11Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The video format.</p>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
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
             * <p>2015-12-01T05:36:00Z</p>
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
}
