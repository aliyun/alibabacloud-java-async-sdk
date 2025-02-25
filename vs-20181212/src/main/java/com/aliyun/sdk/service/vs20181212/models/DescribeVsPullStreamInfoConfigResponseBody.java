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
 * {@link DescribeVsPullStreamInfoConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsPullStreamInfoConfigResponseBody</p>
 */
public class DescribeVsPullStreamInfoConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveAppRecordList")
    private LiveAppRecordList liveAppRecordList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVsPullStreamInfoConfigResponseBody(Builder builder) {
        this.liveAppRecordList = builder.liveAppRecordList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsPullStreamInfoConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveAppRecordList
     */
    public LiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveAppRecordList liveAppRecordList; 
        private String requestId; 

        /**
         * LiveAppRecordList.
         */
        public Builder liveAppRecordList(LiveAppRecordList liveAppRecordList) {
            this.liveAppRecordList = liveAppRecordList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVsPullStreamInfoConfigResponseBody build() {
            return new DescribeVsPullStreamInfoConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsPullStreamInfoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsPullStreamInfoConfigResponseBody</p>
     */
    public static class LiveAppRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("SourceUrl")
        private String sourceUrl;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private LiveAppRecord(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.endTime = builder.endTime;
            this.sourceUrl = builder.sourceUrl;
            this.startTime = builder.startTime;
            this.streamName = builder.streamName;
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
         * @return sourceUrl
         */
        public String getSourceUrl() {
            return this.sourceUrl;
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

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String endTime; 
            private String sourceUrl; 
            private String startTime; 
            private String streamName; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * SourceUrl.
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
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

            public LiveAppRecord build() {
                return new LiveAppRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVsPullStreamInfoConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsPullStreamInfoConfigResponseBody</p>
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
