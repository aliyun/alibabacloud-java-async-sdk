// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamRecordIndexFileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamRecordIndexFileResponseBody</p>
 */
public class DescribeLiveStreamRecordIndexFileResponseBody extends TeaModel {
    @NameInMap("RecordIndexInfo")
    private RecordIndexInfo recordIndexInfo;

    @NameInMap("RequestId")
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

        /**
         * RecordIndexInfo.
         */
        public Builder recordIndexInfo(RecordIndexInfo recordIndexInfo) {
            this.recordIndexInfo = recordIndexInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamRecordIndexFileResponseBody build() {
            return new DescribeLiveStreamRecordIndexFileResponseBody(this);
        } 

    } 

    public static class RecordIndexInfo extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("OssObject")
        private String ossObject;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("RecordUrl")
        private String recordUrl;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("Width")
        private Integer width;

        private RecordIndexInfo(Builder builder) {
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.domainName = builder.domainName;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
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
            private Integer height; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObject; 
            private String recordId; 
            private String recordUrl; 
            private String startTime; 
            private String streamName; 
            private Integer width; 

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
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
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
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
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
             * OssObject.
             */
            public Builder ossObject(String ossObject) {
                this.ossObject = ossObject;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * RecordUrl.
             */
            public Builder recordUrl(String recordUrl) {
                this.recordUrl = recordUrl;
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
             * Width.
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
