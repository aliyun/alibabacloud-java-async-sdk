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
 * {@link DescribeLiveStreamRecordContentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamRecordContentResponseBody</p>
 */
public class DescribeLiveStreamRecordContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordContentInfoList")
    private RecordContentInfoList recordContentInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamRecordContentResponseBody model) {
            this.recordContentInfoList = model.recordContentInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         */
        public Builder recordContentInfoList(RecordContentInfoList recordContentInfoList) {
            this.recordContentInfoList = recordContentInfoList;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time range that is specified by the StartTime and EndTime parameters cannot exceed 4 days. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>62136AE6-7793-45ED-B14A-60D19A9486D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamRecordContentResponseBody build() {
            return new DescribeLiveStreamRecordContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamRecordContentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamRecordContentResponseBody</p>
     */
    public static class RecordContentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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

            private Builder() {
            } 

            private Builder(RecordContentInfo model) {
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.ossBucket = model.ossBucket;
                this.ossEndpoint = model.ossEndpoint;
                this.ossObjectPrefix = model.ossObjectPrefix;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The beginning of the time range for which the recordings were queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The recordings.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-01T07:46:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The recording length. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>liveBucket****</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The naming rule of recordings in OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-oss-****.aliyuncs.com</p>
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * <p>The name of the Object Storage Service (OSS) bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>record/{Date}/{UnixTimestamp}_{Sequence}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>The end of the time range for which the recordings were queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-01T07:36:00Z</p>
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
    /**
     * 
     * {@link DescribeLiveStreamRecordContentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamRecordContentResponseBody</p>
     */
    public static class RecordContentInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordContentInfo")
        private java.util.List<RecordContentInfo> recordContentInfo;

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
        public java.util.List<RecordContentInfo> getRecordContentInfo() {
            return this.recordContentInfo;
        }

        public static final class Builder {
            private java.util.List<RecordContentInfo> recordContentInfo; 

            private Builder() {
            } 

            private Builder(RecordContentInfoList model) {
                this.recordContentInfo = model.recordContentInfo;
            } 

            /**
             * RecordContentInfo.
             */
            public Builder recordContentInfo(java.util.List<RecordContentInfo> recordContentInfo) {
                this.recordContentInfo = recordContentInfo;
                return this;
            }

            public RecordContentInfoList build() {
                return new RecordContentInfoList(this);
            } 

        } 

    }
}
