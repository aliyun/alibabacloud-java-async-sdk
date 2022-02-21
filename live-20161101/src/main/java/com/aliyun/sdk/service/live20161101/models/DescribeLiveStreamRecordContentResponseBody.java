// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamRecordContentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamRecordContentResponseBody</p>
 */
public class DescribeLiveStreamRecordContentResponseBody extends TeaModel {
    @NameInMap("RecordContentInfoList")
    private RecordContentInfoList recordContentInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamRecordContentResponseBody(Builder builder) {
        this.recordContentInfoList = builder.recordContentInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamRecordContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordContentInfoList
     */
    public RecordContentInfoList getRecordContentInfoList() {
        return this.recordContentInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordContentInfoList recordContentInfoList; 
        private String requestId; 

        /**
         * RecordContentInfoList.
         */
        public Builder recordContentInfoList(RecordContentInfoList recordContentInfoList) {
            this.recordContentInfoList = recordContentInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamRecordContentResponseBody build() {
            return new DescribeLiveStreamRecordContentResponseBody(this);
        } 

    } 

    public static class RecordContentInfo extends TeaModel {
        @NameInMap("Duration")
        private Float duration;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @NameInMap("StartTime")
        private String startTime;

        private RecordContentInfo(Builder builder) {
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordContentInfo create() {
            return builder().build();
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
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Float duration; 
            private String endTime; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObjectPrefix; 
            private String startTime; 

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
             * OssObjectPrefix.
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public RecordContentInfo build() {
                return new RecordContentInfo(this);
            } 

        } 

    }
    public static class RecordContentInfoList extends TeaModel {
        @NameInMap("RecordContentInfo")
        private java.util.List < RecordContentInfo> recordContentInfo;

        private RecordContentInfoList(Builder builder) {
            this.recordContentInfo = builder.recordContentInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordContentInfoList create() {
            return builder().build();
        }

        /**
         * @return recordContentInfo
         */
        public java.util.List < RecordContentInfo> getRecordContentInfo() {
            return this.recordContentInfo;
        }

        public static final class Builder {
            private java.util.List < RecordContentInfo> recordContentInfo; 

            /**
             * RecordContentInfo.
             */
            public Builder recordContentInfo(java.util.List < RecordContentInfo> recordContentInfo) {
                this.recordContentInfo = recordContentInfo;
                return this;
            }

            public RecordContentInfoList build() {
                return new RecordContentInfoList(this);
            } 

        } 

    }
}
