// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerStatusResponseBody</p>
 */
public class OnsConsumerStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>10EDC518-10E7-4B34-92FB-171235FA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsConsumerStatusResponseBody build() {
            return new OnsConsumerStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class ConnectionDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientAddr")
        private String clientAddr;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("RemoteIP")
        private String remoteIP;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * <p>The IP address and port number of the consumer instance.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.121.**</p>
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * <p>The ID of the consumer instance.</p>
             * 
             * <strong>example:</strong>
             * <p>30.5.121.**@25560#-1999745829#-1737591554#458773089270275</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The programming language in which the consumer is developed.</p>
             * 
             * <strong>example:</strong>
             * <p>JAVA</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The private or public IP address of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>42.120.74.**</p>
             */
            public Builder remoteIP(String remoteIP) {
                this.remoteIP = remoteIP;
                return this;
            }

            /**
             * <p>The version of the consumer client.</p>
             * 
             * <strong>example:</strong>
             * <p>V4_3_6_SNAPSHOT</p>
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class ConnectionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionDo")
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class TrackList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Track")
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class ThreadTrackDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Thread")
        private String thread;

        @com.aliyun.core.annotation.NameInMap("TrackList")
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
             * <p>The name of the thread.</p>
             * 
             * <strong>example:</strong>
             * <p>ConsumeMessageThread_0</p>
             */
            public Builder thread(String thread) {
                this.thread = thread;
                return this;
            }

            /**
             * <p>The details of thread stack traces.</p>
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class Jstack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ThreadTrackDo")
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class ConsumerRunningDataDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedCountPerHour")
        private Long failedCountPerHour;

        @com.aliyun.core.annotation.NameInMap("FailedTps")
        private Float failedTps;

        @com.aliyun.core.annotation.NameInMap("OkTps")
        private Float okTps;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private Float rt;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private ConsumerRunningDataDo(Builder builder) {
            this.failedCountPerHour = builder.failedCountPerHour;
            this.failedTps = builder.failedTps;
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
            private Float okTps; 
            private Float rt; 
            private String topic; 

            /**
             * <p>The number of messages that failed to be consumed each hour.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCountPerHour(Long failedCountPerHour) {
                this.failedCountPerHour = failedCountPerHour;
                return this;
            }

            /**
             * <p>The TPS for failed message consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedTps(Float failedTps) {
                this.failedTps = failedTps;
                return this;
            }

            /**
             * <p>The TPS for successful message consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder okTps(Float okTps) {
                this.okTps = okTps;
                return this;
            }

            /**
             * <p>The consumption RT. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rt(Float rt) {
                this.rt = rt;
                return this;
            }

            /**
             * <p>The name of the topic to which the consumer subscribes.</p>
             * 
             * <strong>example:</strong>
             * <p>test-mq_topic</p>
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class RunningDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerRunningDataDo")
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class TagsSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class SubscriptionData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubString")
        private String subString;

        @com.aliyun.core.annotation.NameInMap("SubVersion")
        private Long subVersion;

        @com.aliyun.core.annotation.NameInMap("TagsSet")
        private TagsSet tagsSet;

        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * <p>The expression that is used to specify the tags of messages in the subscribed topic.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder subString(String subString) {
                this.subString = subString;
                return this;
            }

            /**
             * <p>The subscription version. The value is of the LONG type and is automatically incremented.</p>
             * 
             * <strong>example:</strong>
             * <p>1570701364301</p>
             */
            public Builder subVersion(Long subVersion) {
                this.subVersion = subVersion;
                return this;
            }

            /**
             * <p>The information about the tags of the topic to which the consumer subscribes.</p>
             */
            public Builder tagsSet(TagsSet tagsSet) {
                this.tagsSet = tagsSet;
                return this;
            }

            /**
             * <p>The name of the topic to which the consumer subscribes.</p>
             * 
             * <strong>example:</strong>
             * <p>test-mq_topic</p>
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class SubscriptionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubscriptionData")
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class ConsumerConnectionInfoDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("Connection")
        private String connection;

        @com.aliyun.core.annotation.NameInMap("ConsumeModel")
        private String consumeModel;

        @com.aliyun.core.annotation.NameInMap("ConsumeType")
        private String consumeType;

        @com.aliyun.core.annotation.NameInMap("Jstack")
        private Jstack jstack;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @com.aliyun.core.annotation.NameInMap("RunningDataList")
        private RunningDataList runningDataList;

        @com.aliyun.core.annotation.NameInMap("StartTimeStamp")
        private Long startTimeStamp;

        @com.aliyun.core.annotation.NameInMap("SubscriptionSet")
        private SubscriptionSet subscriptionSet;

        @com.aliyun.core.annotation.NameInMap("ThreadCount")
        private Integer threadCount;

        @com.aliyun.core.annotation.NameInMap("Version")
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
             * <p>The ID of the consumer instance.</p>
             * 
             * <strong>example:</strong>
             * <p><code>30.5.**.**</code>@25560#-1999745829#-1737591554#458773089270275</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The connection information.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder connection(String connection) {
                this.connection = connection;
                return this;
            }

            /**
             * <p>The consumption mode. Valid values:</p>
             * <ul>
             * <li><strong>CLUSTERING</strong>: the clustering consumption mode</li>
             * <li><strong>BROADCASTING</strong>: the broadcasting consumption mode</li>
             * </ul>
             * <p>For more information about consumption modes, see <a href="https://help.aliyun.com/document_detail/43163.html">Clustering consumption and broadcasting consumption</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CLUSTERING</p>
             */
            public Builder consumeModel(String consumeModel) {
                this.consumeModel = consumeModel;
                return this;
            }

            /**
             * <p>The mode in which the consumer consumes messages. Valid values:</p>
             * <ul>
             * <li><strong>PUSH</strong>: The ApsaraMQ for RocketMQ broker pushes messages to the consumer.</li>
             * <li><strong>PULL</strong>: The consumer pulls messages from the ApsaraMQ for RocketMQ broker.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUSH</p>
             */
            public Builder consumeType(String consumeType) {
                this.consumeType = consumeType;
                return this;
            }

            /**
             * <p>The information about thread stack traces. If you want to obtain the information about thread stack traces, make sure that the <strong>NeedJstack</strong> parameter in the request is set to <strong>true</strong>. If the NeedJstack parameter is not set to true, the value of this parameter is empty.</p>
             */
            public Builder jstack(Jstack jstack) {
                this.jstack = jstack;
                return this;
            }

            /**
             * <p>The programming language that the consumer supports.</p>
             * 
             * <strong>example:</strong>
             * <p>JAVA</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The most recent point in time when a message was consumed.</p>
             * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1570701368114</p>
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * <p>The real-time statistics.</p>
             */
            public Builder runningDataList(RunningDataList runningDataList) {
                this.runningDataList = runningDataList;
                return this;
            }

            /**
             * <p>The earliest point in time when a message was consumed.</p>
             * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1570701361528</p>
             */
            public Builder startTimeStamp(Long startTimeStamp) {
                this.startTimeStamp = startTimeStamp;
                return this;
            }

            /**
             * <p>The information about subscriptions.</p>
             */
            public Builder subscriptionSet(SubscriptionSet subscriptionSet) {
                this.subscriptionSet = subscriptionSet;
                return this;
            }

            /**
             * <p>The number of consumer threads.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder threadCount(Integer threadCount) {
                this.threadCount = threadCount;
                return this;
            }

            /**
             * <p>The version of the consumer client.</p>
             * 
             * <strong>example:</strong>
             * <p>V4_3_6</p>
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class ConsumerConnectionInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsumerConnectionInfoDo")
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class DetailInTopicDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Long delayTime;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("TotalDiff")
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
             * <p>The latency of message consumption in the topic. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * <p>The most recent point in time when a message was consumed.</p>
             * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1570701259403</p>
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-mq_topic</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * <p>The number of accumulated messages in the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class DetailInTopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailInTopicDo")
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
    /**
     * 
     * {@link OnsConsumerStatusResponseBody} extends {@link TeaModel}
     *
     * <p>OnsConsumerStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionSet")
        private ConnectionSet connectionSet;

        @com.aliyun.core.annotation.NameInMap("ConsumeModel")
        private String consumeModel;

        @com.aliyun.core.annotation.NameInMap("ConsumeTps")
        private Float consumeTps;

        @com.aliyun.core.annotation.NameInMap("ConsumerConnectionInfoList")
        private ConsumerConnectionInfoList consumerConnectionInfoList;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Long delayTime;

        @com.aliyun.core.annotation.NameInMap("DetailInTopicList")
        private DetailInTopicList detailInTopicList;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private Long lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("RebalanceOK")
        private Boolean rebalanceOK;

        @com.aliyun.core.annotation.NameInMap("SubscriptionSame")
        private Boolean subscriptionSame;

        @com.aliyun.core.annotation.NameInMap("TotalDiff")
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
             * <p>The information about online consumers in the consumer group.</p>
             */
            public Builder connectionSet(ConnectionSet connectionSet) {
                this.connectionSet = connectionSet;
                return this;
            }

            /**
             * <p>The consumption mode. Valid values:</p>
             * <ul>
             * <li><strong>CLUSTERING</strong>: the clustering consumption mode</li>
             * <li><strong>BROADCASTING</strong>: the broadcasting consumption mode</li>
             * </ul>
             * <p>For more information about consumption modes, see <a href="https://help.aliyun.com/document_detail/43163.html">Clustering consumption and broadcasting consumption</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CLUSTERING</p>
             */
            public Builder consumeModel(String consumeModel) {
                this.consumeModel = consumeModel;
                return this;
            }

            /**
             * <p>The TPS for message consumption.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder consumeTps(Float consumeTps) {
                this.consumeTps = consumeTps;
                return this;
            }

            /**
             * <p>The details of online consumers in the consumer group, including the information about the thread stack traces and the consumption response time (RT). If you want to obtain the details of online consumers in the consumer group, make sure that the <strong>Detail</strong> parameter in the request is set to <strong>true</strong>. If the Detail parameter is not set to true, the value of this parameter is empty.</p>
             */
            public Builder consumerConnectionInfoList(ConsumerConnectionInfoList consumerConnectionInfoList) {
                this.consumerConnectionInfoList = consumerConnectionInfoList;
                return this;
            }

            /**
             * <p>The maximum latency of message consumption in all topics to which the consumer group subscribes. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100857</p>
             */
            public Builder delayTime(Long delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * <p>The information about message consumption by topic. If you want to obtain the information about the consumption status of each topic, make sure that the <strong>Detail</strong> parameter in the request is set to <strong>true</strong>. If the Detail parameter is not set to true, the value of this parameter is empty.</p>
             */
            public Builder detailInTopicList(DetailInTopicList detailInTopicList) {
                this.detailInTopicList = detailInTopicList;
                return this;
            }

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_111111111111_DOxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The most recent point in time when a message was consumed.</p>
             * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1566883844954</p>
             */
            public Builder lastTimestamp(Long lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>Indicates whether the consumer group is online.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>Indicates whether load balancing is performed as expected. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Load balancing is performed as expected.</li>
             * <li><strong>false</strong>: Load balancing is not performed as expected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder rebalanceOK(Boolean rebalanceOK) {
                this.rebalanceOK = rebalanceOK;
                return this;
            }

            /**
             * <p>Indicates whether all consumers in the consumer group subscribe to the same topics and tags.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder subscriptionSame(Boolean subscriptionSame) {
                this.subscriptionSame = subscriptionSame;
                return this;
            }

            /**
             * <p>The total number of accumulated messages.</p>
             * 
             * <strong>example:</strong>
             * <p>197</p>
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
