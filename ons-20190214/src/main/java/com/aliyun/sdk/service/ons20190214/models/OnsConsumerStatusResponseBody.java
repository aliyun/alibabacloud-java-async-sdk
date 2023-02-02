// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerStatusResponseBody</p>
 */
public class OnsConsumerStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsConsumerStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The query results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsConsumerStatusResponseBody build() {
            return new OnsConsumerStatusResponseBody(this);
        } 

    } 

    public static class ConnectionDo extends TeaModel {
        @NameInMap("ClientAddr")
        private String clientAddr;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("Language")
        private String language;

        @NameInMap("RemoteIP")
        private String remoteIP;

        @NameInMap("Version")
        private String version;

        private ConnectionDo(Builder builder) {
            this.clientAddr = builder.clientAddr;
            this.clientId = builder.clientId;
            this.language = builder.language;
            this.remoteIP = builder.remoteIP;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionDo create() {
            return builder().build();
        }

        /**
         * @return clientAddr
         */
        public String getClientAddr() {
            return this.clientAddr;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return remoteIP
         */
        public String getRemoteIP() {
            return this.remoteIP;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String clientAddr; 
            private String clientId; 
            private String language; 
            private String remoteIP; 
            private String version; 

            /**
             * The IP address and port number of the consumer instance.
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * The ID of the consumer instance.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The programming language that the consumer client supports.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The private or public IP address of the host.
             */
            public Builder remoteIP(String remoteIP) {
                this.remoteIP = remoteIP;
                return this;
            }

            /**
             * The version of the consumer client.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ConnectionDo build() {
                return new ConnectionDo(this);
            } 

        } 

    }
    public static class ConnectionSet extends TeaModel {
        @NameInMap("ConnectionDo")
        private java.util.List < ConnectionDo> connectionDo;

        private ConnectionSet(Builder builder) {
            this.connectionDo = builder.connectionDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionSet create() {
            return builder().build();
        }

        /**
         * @return connectionDo
         */
        public java.util.List < ConnectionDo> getConnectionDo() {
            return this.connectionDo;
        }

        public static final class Builder {
            private java.util.List < ConnectionDo> connectionDo; 

            /**
             * ConnectionDo.
             */
            public Builder connectionDo(java.util.List < ConnectionDo> connectionDo) {
                this.connectionDo = connectionDo;
                return this;
            }

            public ConnectionSet build() {
                return new ConnectionSet(this);
            } 

        } 

    }
    public static class TrackList extends TeaModel {
        @NameInMap("Track")
        private java.util.List < String > track;

        private TrackList(Builder builder) {
            this.track = builder.track;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrackList create() {
            return builder().build();
        }

        /**
         * @return track
         */
        public java.util.List < String > getTrack() {
            return this.track;
        }

        public static final class Builder {
            private java.util.List < String > track; 

            /**
             * Track.
             */
            public Builder track(java.util.List < String > track) {
                this.track = track;
                return this;
            }

            public TrackList build() {
                return new TrackList(this);
            } 

        } 

    }
    public static class ThreadTrackDo extends TeaModel {
        @NameInMap("Thread")
        private String thread;

        @NameInMap("TrackList")
        private TrackList trackList;

        private ThreadTrackDo(Builder builder) {
            this.thread = builder.thread;
            this.trackList = builder.trackList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreadTrackDo create() {
            return builder().build();
        }

        /**
         * @return thread
         */
        public String getThread() {
            return this.thread;
        }

        /**
         * @return trackList
         */
        public TrackList getTrackList() {
            return this.trackList;
        }

        public static final class Builder {
            private String thread; 
            private TrackList trackList; 

            /**
             * The name of the thread.
             */
            public Builder thread(String thread) {
                this.thread = thread;
                return this;
            }

            /**
             * The details of thread stack traces.
             */
            public Builder trackList(TrackList trackList) {
                this.trackList = trackList;
                return this;
            }

            public ThreadTrackDo build() {
                return new ThreadTrackDo(this);
            } 

        } 

    }
    public static class Jstack extends TeaModel {
        @NameInMap("ThreadTrackDo")
        private java.util.List < ThreadTrackDo> threadTrackDo;

        private Jstack(Builder builder) {
            this.threadTrackDo = builder.threadTrackDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jstack create() {
            return builder().build();
        }

        /**
         * @return threadTrackDo
         */
        public java.util.List < ThreadTrackDo> getThreadTrackDo() {
            return this.threadTrackDo;
        }

        public static final class Builder {
            private java.util.List < ThreadTrackDo> threadTrackDo; 

            /**
             * ThreadTrackDo.
             */
            public Builder threadTrackDo(java.util.List < ThreadTrackDo> threadTrackDo) {
                this.threadTrackDo = threadTrackDo;
                return this;
            }

            public Jstack build() {
                return new Jstack(this);
            } 

        } 

    }
    public static class ConsumerRunningDataDo extends TeaModel {
        @NameInMap("FailedCountPerHour")
        private Long failedCountPerHour;

        @NameInMap("FailedTps")
        private Float failedTps;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("OkTps")
        private Float okTps;

        @NameInMap("Rt")
        private Float rt;

        @NameInMap("Topic")
        private String topic;

        private ConsumerRunningDataDo(Builder builder) {
            this.failedCountPerHour = builder.failedCountPerHour;
            this.failedTps = builder.failedTps;
            this.groupId = builder.groupId;
            this.okTps = builder.okTps;
            this.rt = builder.rt;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRunningDataDo create() {
            return builder().build();
        }

        /**
         * @return failedCountPerHour
         */
        public Long getFailedCountPerHour() {
            return this.failedCountPerHour;
        }

        /**
         * @return failedTps
         */
        public Float getFailedTps() {
            return this.failedTps;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return okTps
         */
        public Float getOkTps() {
            return this.okTps;
        }

        /**
         * @return rt
         */
        public Float getRt() {
            return this.rt;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Long failedCountPerHour; 
            private Float failedTps; 
            private String groupId; 
            private Float okTps; 
            private Float rt; 
            private String topic; 

            /**
             * The number of messages that failed to be consumed each hour.
             */
            public Builder failedCountPerHour(Long failedCountPerHour) {
                this.failedCountPerHour = failedCountPerHour;
                return this;
            }

            /**
             * The TPS for failed message consumption.
             */
            public Builder failedTps(Float failedTps) {
                this.failedTps = failedTps;
                return this;
            }

            /**
             * The ID of the consumer group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The TPS for successful message consumption.
             */
            public Builder okTps(Float okTps) {
                this.okTps = okTps;
                return this;
            }

            /**
             * The consumption RT. Unit: milliseconds.
             */
            public Builder rt(Float rt) {
                this.rt = rt;
                return this;
            }

            /**
             * The name of the topic to which the consumer subscribes.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public ConsumerRunningDataDo build() {
                return new ConsumerRunningDataDo(this);
            } 

        } 

    }
    public static class RunningDataList extends TeaModel {
        @NameInMap("ConsumerRunningDataDo")
        private java.util.List < ConsumerRunningDataDo> consumerRunningDataDo;

        private RunningDataList(Builder builder) {
            this.consumerRunningDataDo = builder.consumerRunningDataDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningDataList create() {
            return builder().build();
        }

        /**
         * @return consumerRunningDataDo
         */
        public java.util.List < ConsumerRunningDataDo> getConsumerRunningDataDo() {
            return this.consumerRunningDataDo;
        }

        public static final class Builder {
            private java.util.List < ConsumerRunningDataDo> consumerRunningDataDo; 

            /**
             * ConsumerRunningDataDo.
             */
            public Builder consumerRunningDataDo(java.util.List < ConsumerRunningDataDo> consumerRunningDataDo) {
                this.consumerRunningDataDo = consumerRunningDataDo;
                return this;
            }

            public RunningDataList build() {
                return new RunningDataList(this);
            } 

        } 

    }
    public static class TagsSet extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < String > tag;

        private TagsSet(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagsSet create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < String > getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < String > tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < String > tag) {
                this.tag = tag;
                return this;
            }

            public TagsSet build() {
                return new TagsSet(this);
            } 

        } 

    }
    public static class SubscriptionData extends TeaModel {
        @NameInMap("SubString")
        private String subString;

        @NameInMap("SubVersion")
        private Long subVersion;

        @NameInMap("TagsSet")
        private TagsSet tagsSet;

        @NameInMap("Topic")
        private String topic;

        private SubscriptionData(Builder builder) {
            this.subString = builder.subString;
            this.subVersion = builder.subVersion;
            this.tagsSet = builder.tagsSet;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionData create() {
            return builder().build();
        }

        /**
         * @return subString
         */
        public String getSubString() {
            return this.subString;
        }

        /**
         * @return subVersion
         */
        public Long getSubVersion() {
            return this.subVersion;
        }

        /**
         * @return tagsSet
         */
        public TagsSet getTagsSet() {
            return this.tagsSet;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String subString; 
            private Long subVersion; 
            private TagsSet tagsSet; 
            private String topic; 

            /**
             * The expression that is used to specify the tags of messages in the subscribed topic.
             */
            public Builder subString(String subString) {
                this.subString = subString;
                return this;
            }

            /**
             * The subscription version. The value is of the LONG type and is automatically incremented.
             */
            public Builder subVersion(Long subVersion) {
                this.subVersion = subVersion;
                return this;
            }

            /**
             * The information about the tags of the topic to which the consumer subscribes.
             */
            public Builder tagsSet(TagsSet tagsSet) {
                this.tagsSet = tagsSet;
                return this;
            }

            /**
             * The name of the topic to which the consumer subscribes.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public SubscriptionData build() {
                return new SubscriptionData(this);
            } 

        } 

    }
    public static class SubscriptionSet extends TeaModel {
        @NameInMap("SubscriptionData")
        private java.util.List < SubscriptionData> subscriptionData;

        private SubscriptionSet(Builder builder) {
            this.subscriptionData = builder.subscriptionData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionSet create() {
            return builder().build();
        }

        /**
         * @return subscriptionData
         */
        public java.util.List < SubscriptionData> getSubscriptionData() {
            return this.subscriptionData;
        }

        public static final class Builder {
            private java.util.List < SubscriptionData> subscriptionData; 

            /**
             * SubscriptionData.
             */
            public Builder subscriptionData(java.util.List < SubscriptionData> subscriptionData) {
                this.subscriptionData = subscriptionData;
                return this;
            }

            public SubscriptionSet build() {
                return new SubscriptionSet(this);
            } 

        } 

    }
    public static class ConsumerConnectionInfoDo extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("Connection")
        private String connection;

        @NameInMap("ConsumeModel")
        private String consumeModel;

        @NameInMap("ConsumeType")
        private String consumeType;

        @NameInMap("Jstack")
        private Jstack jstack;

        @NameInMap("Language")
        private String language;

        @NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @NameInMap("RunningDataList")
        private RunningDataList runningDataList;

        @NameInMap("StartTimeStamp")
        private Long startTimeStamp;

        @NameInMap("SubscriptionSet")
        private SubscriptionSet subscriptionSet;

        @NameInMap("ThreadCount")
        private Integer threadCount;

        @NameInMap("Version")
        private String version;

        private ConsumerConnectionInfoDo(Builder builder) {
            this.clientId = builder.clientId;
            this.connection = builder.connection;
            this.consumeModel = builder.consumeModel;
            this.consumeType = builder.consumeType;
            this.jstack = builder.jstack;
            this.language = builder.language;
            this.lastTimeStamp = builder.lastTimeStamp;
            this.runningDataList = builder.runningDataList;
            this.startTimeStamp = builder.startTimeStamp;
            this.subscriptionSet = builder.subscriptionSet;
            this.threadCount = builder.threadCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerConnectionInfoDo create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return connection
         */
        public String getConnection() {
            return this.connection;
        }

        /**
         * @return consumeModel
         */
        public String getConsumeModel() {
            return this.consumeModel;
        }

        /**
         * @return consumeType
         */
        public String getConsumeType() {
            return this.consumeType;
        }

        /**
         * @return jstack
         */
        public Jstack getJstack() {
            return this.jstack;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return lastTimeStamp
         */
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        /**
         * @return runningDataList
         */
        public RunningDataList getRunningDataList() {
            return this.runningDataList;
        }

        /**
         * @return startTimeStamp
         */
        public Long getStartTimeStamp() {
            return this.startTimeStamp;
        }

        /**
         * @return subscriptionSet
         */
        public SubscriptionSet getSubscriptionSet() {
            return this.subscriptionSet;
        }

        /**
         * @return threadCount
         */
        public Integer getThreadCount() {
            return this.threadCount;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String clientId; 
            private String connection; 
            private String consumeModel; 
            private String consumeType; 
            private Jstack jstack; 
            private String language; 
            private Long lastTimeStamp; 
            private RunningDataList runningDataList; 
            private Long startTimeStamp; 
            private SubscriptionSet subscriptionSet; 
            private Integer threadCount; 
            private String version; 

            /**
             * The ID of the consumer instance.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The connection information.
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * The consumption mode. Valid values:
             * <p>
             * 
             * *   **CLUSTERING:** the clustering consumption mode
             * *   **BROADCASTING:** the broadcasting consumption mode
             * 
             * For more information about consumption modes, see [Clustering consumption and broadcasting consumption](~~43163~~).
             */
            public Builder consumeModel(String consumeModel) {
                this.consumeModel = consumeModel;
                return this;
            }

            /**
             * The mode in which the consumer consumes messages. Valid values:
             * <p>
             * 
             * *   **PUSH:** The Message Queue for Apache RocketMQ broker pushes messages to the consumer.
             * *   **PULL:** The consumer pulls messages from the Message Queue for Apache RocketMQ broker.
             */
            public Builder consumeType(String consumeType) {
                this.consumeType = consumeType;
                return this;
            }

            /**
             * The information about thread stack traces. If you want to obtain the information about thread stack traces, make sure that the **NeedJstack** parameter in the request is set to **true**. If the NeedJstack parameter is not set to true, the value of this parameter is empty.
             */
            public Builder jstack(Jstack jstack) {
                this.jstack = jstack;
                return this;
            }

            /**
             * The programming language that the consumer supports.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The most recent point in time when a message was consumed.
             * <p>
             * 
             * The value of this parameter is a UNIX timestamp in milliseconds.
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * The real-time statistics.
             */
            public Builder runningDataList(RunningDataList runningDataList) {
                this.runningDataList = runningDataList;
                return this;
            }

            /**
             * The earliest point in time when a message was consumed.
             * <p>
             * 
             * The value of this parameter is a UNIX timestamp in milliseconds.
             */
            public Builder startTimeStamp(Long startTimeStamp) {
                this.startTimeStamp = startTimeStamp;
                return this;
            }

            /**
             * The information about subscriptions.
             */
            public Builder subscriptionSet(SubscriptionSet subscriptionSet) {
                this.subscriptionSet = subscriptionSet;
                return this;
            }

            /**
             * The number of consumer threads.
             */
            public Builder threadCount(Integer threadCount) {
                this.threadCount = threadCount;
                return this;
            }

            /**
             * The version of the consumer client.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ConsumerConnectionInfoDo build() {
                return new ConsumerConnectionInfoDo(this);
            } 

        } 

    }
    public static class ConsumerConnectionInfoList extends TeaModel {
        @NameInMap("ConsumerConnectionInfoDo")
        private java.util.List < ConsumerConnectionInfoDo> consumerConnectionInfoDo;

        private ConsumerConnectionInfoList(Builder builder) {
            this.consumerConnectionInfoDo = builder.consumerConnectionInfoDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerConnectionInfoList create() {
            return builder().build();
        }

        /**
         * @return consumerConnectionInfoDo
         */
        public java.util.List < ConsumerConnectionInfoDo> getConsumerConnectionInfoDo() {
            return this.consumerConnectionInfoDo;
        }

        public static final class Builder {
            private java.util.List < ConsumerConnectionInfoDo> consumerConnectionInfoDo; 

            /**
             * ConsumerConnectionInfoDo.
             */
            public Builder consumerConnectionInfoDo(java.util.List < ConsumerConnectionInfoDo> consumerConnectionInfoDo) {
                this.consumerConnectionInfoDo = consumerConnectionInfoDo;
                return this;
            }

            public ConsumerConnectionInfoList build() {
                return new ConsumerConnectionInfoList(this);
            } 

        } 

    }
    public static class DetailInTopicDo extends TeaModel {
        @NameInMap("DelayTime")
        private Long delayTime;

        @NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @NameInMap("Topic")
        private String topic;

        @NameInMap("TotalDiff")
        private Long totalDiff;

        private DetailInTopicDo(Builder builder) {
            this.delayTime = builder.delayTime;
            this.lastTimestamp = builder.lastTimestamp;
            this.topic = builder.topic;
            this.totalDiff = builder.totalDiff;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInTopicDo create() {
            return builder().build();
        }

        /**
         * @return delayTime
         */
        public Long getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return lastTimestamp
         */
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return totalDiff
         */
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public static final class Builder {
            private Long delayTime; 
            private Long lastTimestamp; 
            private String topic; 
            private Long totalDiff; 

            /**
             * The latency of message consumption in the topic. Unit: milliseconds.
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * The most recent point in time when a message was consumed.
             * <p>
             * 
             * The value of this parameter is a UNIX timestamp in milliseconds.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * The name of the topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * The number of accumulated messages in the topic.
             */
            public Builder totalDiff(Long totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            public DetailInTopicDo build() {
                return new DetailInTopicDo(this);
            } 

        } 

    }
    public static class DetailInTopicList extends TeaModel {
        @NameInMap("DetailInTopicDo")
        private java.util.List < DetailInTopicDo> detailInTopicDo;

        private DetailInTopicList(Builder builder) {
            this.detailInTopicDo = builder.detailInTopicDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInTopicList create() {
            return builder().build();
        }

        /**
         * @return detailInTopicDo
         */
        public java.util.List < DetailInTopicDo> getDetailInTopicDo() {
            return this.detailInTopicDo;
        }

        public static final class Builder {
            private java.util.List < DetailInTopicDo> detailInTopicDo; 

            /**
             * DetailInTopicDo.
             */
            public Builder detailInTopicDo(java.util.List < DetailInTopicDo> detailInTopicDo) {
                this.detailInTopicDo = detailInTopicDo;
                return this;
            }

            public DetailInTopicList build() {
                return new DetailInTopicList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ConnectionSet")
        private ConnectionSet connectionSet;

        @NameInMap("ConsumeModel")
        private String consumeModel;

        @NameInMap("ConsumeTps")
        private Float consumeTps;

        @NameInMap("ConsumerConnectionInfoList")
        private ConsumerConnectionInfoList consumerConnectionInfoList;

        @NameInMap("DelayTime")
        private Long delayTime;

        @NameInMap("DetailInTopicList")
        private DetailInTopicList detailInTopicList;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("RebalanceOK")
        private Boolean rebalanceOK;

        @NameInMap("SubscriptionSame")
        private Boolean subscriptionSame;

        @NameInMap("TotalDiff")
        private Long totalDiff;

        private Data(Builder builder) {
            this.connectionSet = builder.connectionSet;
            this.consumeModel = builder.consumeModel;
            this.consumeTps = builder.consumeTps;
            this.consumerConnectionInfoList = builder.consumerConnectionInfoList;
            this.delayTime = builder.delayTime;
            this.detailInTopicList = builder.detailInTopicList;
            this.instanceId = builder.instanceId;
            this.lastTimestamp = builder.lastTimestamp;
            this.online = builder.online;
            this.rebalanceOK = builder.rebalanceOK;
            this.subscriptionSame = builder.subscriptionSame;
            this.totalDiff = builder.totalDiff;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectionSet
         */
        public ConnectionSet getConnectionSet() {
            return this.connectionSet;
        }

        /**
         * @return consumeModel
         */
        public String getConsumeModel() {
            return this.consumeModel;
        }

        /**
         * @return consumeTps
         */
        public Float getConsumeTps() {
            return this.consumeTps;
        }

        /**
         * @return consumerConnectionInfoList
         */
        public ConsumerConnectionInfoList getConsumerConnectionInfoList() {
            return this.consumerConnectionInfoList;
        }

        /**
         * @return delayTime
         */
        public Long getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return detailInTopicList
         */
        public DetailInTopicList getDetailInTopicList() {
            return this.detailInTopicList;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastTimestamp
         */
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return rebalanceOK
         */
        public Boolean getRebalanceOK() {
            return this.rebalanceOK;
        }

        /**
         * @return subscriptionSame
         */
        public Boolean getSubscriptionSame() {
            return this.subscriptionSame;
        }

        /**
         * @return totalDiff
         */
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public static final class Builder {
            private ConnectionSet connectionSet; 
            private String consumeModel; 
            private Float consumeTps; 
            private ConsumerConnectionInfoList consumerConnectionInfoList; 
            private Long delayTime; 
            private DetailInTopicList detailInTopicList; 
            private String instanceId; 
            private Long lastTimestamp; 
            private Boolean online; 
            private Boolean rebalanceOK; 
            private Boolean subscriptionSame; 
            private Long totalDiff; 

            /**
             * The information about online consumers in the consumer group.
             */
            public Builder connectionSet(ConnectionSet connectionSet) {
                this.connectionSet = connectionSet;
                return this;
            }

            /**
             * The consumption mode. Valid values:
             * <p>
             * 
             * *   **CLUSTERING:** the clustering consumption mode
             * *   **BROADCASTING:** the broadcasting consumption mode
             * 
             * For more information about consumption modes, see [Clustering consumption and broadcasting consumption](~~43163~~).
             */
            public Builder consumeModel(String consumeModel) {
                this.consumeModel = consumeModel;
                return this;
            }

            /**
             * The TPS for message consumption.
             */
            public Builder consumeTps(Float consumeTps) {
                this.consumeTps = consumeTps;
                return this;
            }

            /**
             * The details of online consumers in the consumer group, including the information about the thread stack traces and the consumption response time (RT). If you want to obtain the details of online consumers in the consumer group, make sure that the **Detail** parameter in the request is set to **true**. If the Detail parameter is not set to true, the value of this parameter is empty.
             */
            public Builder consumerConnectionInfoList(ConsumerConnectionInfoList consumerConnectionInfoList) {
                this.consumerConnectionInfoList = consumerConnectionInfoList;
                return this;
            }

            /**
             * The maximum latency of message consumption in all topics to which the consumer group subscribe. Unit: milliseconds.
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * The information about message consumption by topic. If you want to obtain the information about the consumption status of each topic, make sure that the **Detail** parameter in the request is set to **true**. If the Detail parameter is not set to true, the value of this parameter is empty.
             */
            public Builder detailInTopicList(DetailInTopicList detailInTopicList) {
                this.detailInTopicList = detailInTopicList;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The most recent point in time when a message was consumed.
             * <p>
             * 
             * The value of this parameter is a UNIX timestamp in milliseconds.
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * Indicates whether the consumer group is online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * Indicates whether load balancing is performed as expected. Valid values:
             * <p>
             * 
             * *   **true:** Load balancing is performed as expected.
             * *   **false:** Load balancing is not performed as expected.
             */
            public Builder rebalanceOK(Boolean rebalanceOK) {
                this.rebalanceOK = rebalanceOK;
                return this;
            }

            /**
             * Indicates whether all consumers in the consumer group subscribe to the same topics and tags.
             */
            public Builder subscriptionSame(Boolean subscriptionSame) {
                this.subscriptionSame = subscriptionSame;
                return this;
            }

            /**
             * The total number of accumulated messages.
             */
            public Builder totalDiff(Long totalDiff) {
                this.totalDiff = totalDiff;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
