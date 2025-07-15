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
 * {@link DescribeLivePullStreamConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLivePullStreamConfigResponseBody</p>
 */
public class DescribeLivePullStreamConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveAppRecordList")
    private LiveAppRecordList liveAppRecordList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveAppRecordList liveAppRecordList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLivePullStreamConfigResponseBody model) {
            this.liveAppRecordList = model.liveAppRecordList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the stream pulling configurations.</p>
         */
        public Builder liveAppRecordList(LiveAppRecordList liveAppRecordList) {
            this.liveAppRecordList = liveAppRecordList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLivePullStreamConfigResponseBody build() {
            return new DescribeLivePullStreamConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLivePullStreamConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePullStreamConfigResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("SourceUsing")
        private String sourceUsing;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
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

            private Builder() {
            } 

            private Builder(LiveAppRecord model) {
                this.appName = model.appName;
                this.domainName = model.domainName;
                this.endTime = model.endTime;
                this.sourceUrl = model.sourceUrl;
                this.sourceUsing = model.sourceUsing;
                this.startTime = model.startTime;
                this.streamName = model.streamName;
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
             * <p>The end of the time range for which the configurations were queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-05-20T01:33:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The origin server of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.aliyundoc.com</p>
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * <p>The live stream origin server that you are using.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.aliyundoc.com</p>
             */
            public Builder sourceUsing(String sourceUsing) {
                this.sourceUsing = sourceUsing;
                return this;
            }

            /**
             * <p>The beginning of the time range for which the configurations were queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-05-15T01:30:00Z</p>
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

            public LiveAppRecord build() {
                return new LiveAppRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLivePullStreamConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLivePullStreamConfigResponseBody</p>
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
