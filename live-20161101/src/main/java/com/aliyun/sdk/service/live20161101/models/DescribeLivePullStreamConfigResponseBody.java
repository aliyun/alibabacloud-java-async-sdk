// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLivePullStreamConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLivePullStreamConfigResponseBody</p>
 */
public class DescribeLivePullStreamConfigResponseBody extends TeaModel {
    @NameInMap("LiveAppRecordList")
    private LiveAppRecordList liveAppRecordList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLivePullStreamConfigResponseBody(Builder builder) {
        this.liveAppRecordList = builder.liveAppRecordList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLivePullStreamConfigResponseBody create() {
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

        public DescribeLivePullStreamConfigResponseBody build() {
            return new DescribeLivePullStreamConfigResponseBody(this);
        } 

    } 

    public static class LiveAppRecord extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("SourceUrl")
        private String sourceUrl;

        @NameInMap("SourceUsing")
        private String sourceUsing;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StreamName")
        private String streamName;

        private LiveAppRecord(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.endTime = builder.endTime;
            this.sourceUrl = builder.sourceUrl;
            this.sourceUsing = builder.sourceUsing;
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
         * @return sourceUsing
         */
        public String getSourceUsing() {
            return this.sourceUsing;
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
            private String sourceUsing; 
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
             * SourceUsing.
             */
            public Builder sourceUsing(String sourceUsing) {
                this.sourceUsing = sourceUsing;
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
