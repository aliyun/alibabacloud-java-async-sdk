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
 * {@link DescribeLiveStreamMergeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamMergeResponseBody</p>
 */
public class DescribeLiveStreamMergeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveStreamMergeList")
    private LiveStreamMergeList liveStreamMergeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamMergeResponseBody(Builder builder) {
        this.liveStreamMergeList = builder.liveStreamMergeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamMergeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveStreamMergeList
     */
    public LiveStreamMergeList getLiveStreamMergeList() {
        return this.liveStreamMergeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveStreamMergeList liveStreamMergeList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamMergeResponseBody model) {
            this.liveStreamMergeList = model.liveStreamMergeList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Live stream information list.</p>
         */
        public Builder liveStreamMergeList(LiveStreamMergeList liveStreamMergeList) {
            this.liveStreamMergeList = liveStreamMergeList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamMergeResponseBody build() {
            return new DescribeLiveStreamMergeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamMergeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMergeResponseBody</p>
     */
    public static class LiveStreamMerge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppUsing")
        private String appUsing;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExtraInAppStreams")
        private String extraInAppStreams;

        @com.aliyun.core.annotation.NameInMap("InAppName1")
        private String inAppName1;

        @com.aliyun.core.annotation.NameInMap("InAppName2")
        private String inAppName2;

        @com.aliyun.core.annotation.NameInMap("InStreamName1")
        private String inStreamName1;

        @com.aliyun.core.annotation.NameInMap("InStreamName2")
        private String inStreamName2;

        @com.aliyun.core.annotation.NameInMap("LiveMerger")
        private String liveMerger;

        @com.aliyun.core.annotation.NameInMap("MergeParameters")
        private String mergeParameters;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("StreamUsing")
        private String streamUsing;

        private LiveStreamMerge(Builder builder) {
            this.appName = builder.appName;
            this.appUsing = builder.appUsing;
            this.domainName = builder.domainName;
            this.endTime = builder.endTime;
            this.extraInAppStreams = builder.extraInAppStreams;
            this.inAppName1 = builder.inAppName1;
            this.inAppName2 = builder.inAppName2;
            this.inStreamName1 = builder.inStreamName1;
            this.inStreamName2 = builder.inStreamName2;
            this.liveMerger = builder.liveMerger;
            this.mergeParameters = builder.mergeParameters;
            this.protocol = builder.protocol;
            this.startTime = builder.startTime;
            this.streamName = builder.streamName;
            this.streamUsing = builder.streamUsing;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamMerge create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appUsing
         */
        public String getAppUsing() {
            return this.appUsing;
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
         * @return extraInAppStreams
         */
        public String getExtraInAppStreams() {
            return this.extraInAppStreams;
        }

        /**
         * @return inAppName1
         */
        public String getInAppName1() {
            return this.inAppName1;
        }

        /**
         * @return inAppName2
         */
        public String getInAppName2() {
            return this.inAppName2;
        }

        /**
         * @return inStreamName1
         */
        public String getInStreamName1() {
            return this.inStreamName1;
        }

        /**
         * @return inStreamName2
         */
        public String getInStreamName2() {
            return this.inStreamName2;
        }

        /**
         * @return liveMerger
         */
        public String getLiveMerger() {
            return this.liveMerger;
        }

        /**
         * @return mergeParameters
         */
        public String getMergeParameters() {
            return this.mergeParameters;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
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
         * @return streamUsing
         */
        public String getStreamUsing() {
            return this.streamUsing;
        }

        public static final class Builder {
            private String appName; 
            private String appUsing; 
            private String domainName; 
            private String endTime; 
            private String extraInAppStreams; 
            private String inAppName1; 
            private String inAppName2; 
            private String inStreamName1; 
            private String inStreamName2; 
            private String liveMerger; 
            private String mergeParameters; 
            private String protocol; 
            private String startTime; 
            private String streamName; 
            private String streamUsing; 

            private Builder() {
            } 

            private Builder(LiveStreamMerge model) {
                this.appName = model.appName;
                this.appUsing = model.appUsing;
                this.domainName = model.domainName;
                this.endTime = model.endTime;
                this.extraInAppStreams = model.extraInAppStreams;
                this.inAppName1 = model.inAppName1;
                this.inAppName2 = model.inAppName2;
                this.inStreamName1 = model.inStreamName1;
                this.inStreamName2 = model.inStreamName2;
                this.liveMerger = model.liveMerger;
                this.mergeParameters = model.mergeParameters;
                this.protocol = model.protocol;
                this.startTime = model.startTime;
                this.streamName = model.streamName;
                this.streamUsing = model.streamUsing;
            } 

            /**
             * <p>The name of the application that generates the output stream.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application that is being used.</p>
             * 
             * <strong>example:</strong>
             * <p>app1</p>
             */
            public Builder appUsing(String appUsing) {
                this.appUsing = appUsing;
                return this;
            }

            /**
             * <p>The streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The end time of the stream mixing.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-29T01:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The names of the applications that generate the input additional streams other than the primary stream and secondary stream, and the names of these additional streams.</p>
             * 
             * <strong>example:</strong>
             * <p>app3/stream3,app4/stream4,app5/stream5,…,appN/streamN</p>
             */
            public Builder extraInAppStreams(String extraInAppStreams) {
                this.extraInAppStreams = extraInAppStreams;
                return this;
            }

            /**
             * <p>The name of the application that generates the input primary stream.</p>
             * 
             * <strong>example:</strong>
             * <p>app1</p>
             */
            public Builder inAppName1(String inAppName1) {
                this.inAppName1 = inAppName1;
                return this;
            }

            /**
             * <p>The name of the application that generates the input secondary stream.</p>
             * 
             * <strong>example:</strong>
             * <p>app2</p>
             */
            public Builder inAppName2(String inAppName2) {
                this.inAppName2 = inAppName2;
                return this;
            }

            /**
             * <p>The name of the input primary stream.</p>
             * 
             * <strong>example:</strong>
             * <p>InStream1</p>
             */
            public Builder inStreamName1(String inStreamName1) {
                this.inStreamName1 = inStreamName1;
                return this;
            }

            /**
             * <p>The name of the input secondary stream.</p>
             * 
             * <strong>example:</strong>
             * <p>stream2</p>
             */
            public Builder inStreamName2(String inStreamName2) {
                this.inStreamName2 = inStreamName2;
                return this;
            }

            /**
             * LiveMerger.
             */
            public Builder liveMerger(String liveMerger) {
                this.liveMerger = liveMerger;
                return this;
            }

            /**
             * MergeParameters.
             */
            public Builder mergeParameters(String mergeParameters) {
                this.mergeParameters = mergeParameters;
                return this;
            }

            /**
             * <p>The streaming protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The start time of the stream mixing.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-29T00:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The name of the output stream.</p>
             * 
             * <strong>example:</strong>
             * <p>StreamName</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The stream that is being used.</p>
             * 
             * <strong>example:</strong>
             * <p>InStream1</p>
             */
            public Builder streamUsing(String streamUsing) {
                this.streamUsing = streamUsing;
                return this;
            }

            public LiveStreamMerge build() {
                return new LiveStreamMerge(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamMergeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamMergeResponseBody</p>
     */
    public static class LiveStreamMergeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveStreamMerge")
        private java.util.List<LiveStreamMerge> liveStreamMerge;

        private LiveStreamMergeList(Builder builder) {
            this.liveStreamMerge = builder.liveStreamMerge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveStreamMergeList create() {
            return builder().build();
        }

        /**
         * @return liveStreamMerge
         */
        public java.util.List<LiveStreamMerge> getLiveStreamMerge() {
            return this.liveStreamMerge;
        }

        public static final class Builder {
            private java.util.List<LiveStreamMerge> liveStreamMerge; 

            private Builder() {
            } 

            private Builder(LiveStreamMergeList model) {
                this.liveStreamMerge = model.liveStreamMerge;
            } 

            /**
             * LiveStreamMerge.
             */
            public Builder liveStreamMerge(java.util.List<LiveStreamMerge> liveStreamMerge) {
                this.liveStreamMerge = liveStreamMerge;
                return this;
            }

            public LiveStreamMergeList build() {
                return new LiveStreamMergeList(this);
            } 

        } 

    }
}
