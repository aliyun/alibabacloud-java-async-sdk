// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AiStoreReceiveConfig} extends {@link TeaModel}
 *
 * <p>AiStoreReceiveConfig</p>
 */
public class AiStoreReceiveConfig extends TeaModel {
    @NameInMap("Custom")
    private String custom;

    @NameInMap("DingTalk")
    private DingTalk dingTalk;

    @NameInMap("EventBridge")
    private EventBridge eventBridge;

    @NameInMap("Http")
    private Http http;

    @NameInMap("Https")
    private Https https;

    @NameInMap("Mns")
    private Mns mns;

    @NameInMap("RocketMQ")
    private RocketMQ rocketMQ;

    private AiStoreReceiveConfig(Builder builder) {
        this.custom = builder.custom;
        this.dingTalk = builder.dingTalk;
        this.eventBridge = builder.eventBridge;
        this.http = builder.http;
        this.https = builder.https;
        this.mns = builder.mns;
        this.rocketMQ = builder.rocketMQ;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiStoreReceiveConfig create() {
        return builder().build();
    }

    /**
     * @return custom
     */
    public String getCustom() {
        return this.custom;
    }

    /**
     * @return dingTalk
     */
    public DingTalk getDingTalk() {
        return this.dingTalk;
    }

    /**
     * @return eventBridge
     */
    public EventBridge getEventBridge() {
        return this.eventBridge;
    }

    /**
     * @return http
     */
    public Http getHttp() {
        return this.http;
    }

    /**
     * @return https
     */
    public Https getHttps() {
        return this.https;
    }

    /**
     * @return mns
     */
    public Mns getMns() {
        return this.mns;
    }

    /**
     * @return rocketMQ
     */
    public RocketMQ getRocketMQ() {
        return this.rocketMQ;
    }

    public static final class Builder {
        private String custom; 
        private DingTalk dingTalk; 
        private EventBridge eventBridge; 
        private Http http; 
        private Https https; 
        private Mns mns; 
        private RocketMQ rocketMQ; 

        /**
         * Custom.
         */
        public Builder custom(String custom) {
            this.custom = custom;
            return this;
        }

        /**
         * DingTalk.
         */
        public Builder dingTalk(DingTalk dingTalk) {
            this.dingTalk = dingTalk;
            return this;
        }

        /**
         * EventBridge.
         */
        public Builder eventBridge(EventBridge eventBridge) {
            this.eventBridge = eventBridge;
            return this;
        }

        /**
         * Http.
         */
        public Builder http(Http http) {
            this.http = http;
            return this;
        }

        /**
         * Https.
         */
        public Builder https(Https https) {
            this.https = https;
            return this;
        }

        /**
         * Mns.
         */
        public Builder mns(Mns mns) {
            this.mns = mns;
            return this;
        }

        /**
         * RocketMQ.
         */
        public Builder rocketMQ(RocketMQ rocketMQ) {
            this.rocketMQ = rocketMQ;
            return this;
        }

        public AiStoreReceiveConfig build() {
            return new AiStoreReceiveConfig(this);
        } 

    } 

    public static class DingTalk extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Secret")
        private String secret;

        private DingTalk(Builder builder) {
            this.address = builder.address;
            this.secret = builder.secret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingTalk create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        public static final class Builder {
            private String address; 
            private String secret; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Secret.
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            public DingTalk build() {
                return new DingTalk(this);
            } 

        } 

    }
    public static class EventBridge extends TeaModel {
        @NameInMap("EventBus")
        private String eventBus;

        @NameInMap("EventRule")
        private String eventRule;

        private EventBridge(Builder builder) {
            this.eventBus = builder.eventBus;
            this.eventRule = builder.eventRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventBridge create() {
            return builder().build();
        }

        /**
         * @return eventBus
         */
        public String getEventBus() {
            return this.eventBus;
        }

        /**
         * @return eventRule
         */
        public String getEventRule() {
            return this.eventRule;
        }

        public static final class Builder {
            private String eventBus; 
            private String eventRule; 

            /**
             * EventBus.
             */
            public Builder eventBus(String eventBus) {
                this.eventBus = eventBus;
                return this;
            }

            /**
             * EventRule.
             */
            public Builder eventRule(String eventRule) {
                this.eventRule = eventRule;
                return this;
            }

            public EventBridge build() {
                return new EventBridge(this);
            } 

        } 

    }
    public static class Http extends TeaModel {
        @NameInMap("Url")
        private String url;

        private Http(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Http create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Http build() {
                return new Http(this);
            } 

        } 

    }
    public static class Https extends TeaModel {
        @NameInMap("Url")
        private String url;

        private Https(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Https create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Https build() {
                return new Https(this);
            } 

        } 

    }
    public static class Mns extends TeaModel {
        @NameInMap("Queue")
        private String queue;

        private Mns(Builder builder) {
            this.queue = builder.queue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mns create() {
            return builder().build();
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        public static final class Builder {
            private String queue; 

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            public Mns build() {
                return new Mns(this);
            } 

        } 

    }
    public static class RocketMQ extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TopicName")
        private String topicName;

        private RocketMQ(Builder builder) {
            this.instanceId = builder.instanceId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RocketMQ create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String instanceId; 
            private String topicName; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public RocketMQ build() {
                return new RocketMQ(this);
            } 

        } 

    }
}
