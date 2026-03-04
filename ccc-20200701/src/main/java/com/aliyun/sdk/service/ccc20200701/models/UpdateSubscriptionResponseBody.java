// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link UpdateSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSubscriptionResponseBody</p>
 */
public class UpdateSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateSubscriptionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscriptionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateSubscriptionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateSubscriptionResponseBody build() {
            return new UpdateSubscriptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSubscriptionResponseBody</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private EventList(Builder builder) {
            this.disabled = builder.disabled;
            this.name = builder.name;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Boolean disabled; 
            private String name; 
            private String topic; 

            private Builder() {
            } 

            private Builder(EventList model) {
                this.disabled = model.disabled;
                this.name = model.name;
                this.topic = model.topic;
            } 

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSubscriptionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPoint")
        private String accessPoint;

        @com.aliyun.core.annotation.NameInMap("EventList")
        private java.util.List<EventList> eventList;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MqInstanceId")
        private String mqInstanceId;

        @com.aliyun.core.annotation.NameInMap("MqType")
        private String mqType;

        @com.aliyun.core.annotation.NameInMap("ProducerId")
        private String producerId;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Data(Builder builder) {
            this.accessPoint = builder.accessPoint;
            this.eventList = builder.eventList;
            this.instanceId = builder.instanceId;
            this.mqInstanceId = builder.mqInstanceId;
            this.mqType = builder.mqType;
            this.producerId = builder.producerId;
            this.topic = builder.topic;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessPoint
         */
        public String getAccessPoint() {
            return this.accessPoint;
        }

        /**
         * @return eventList
         */
        public java.util.List<EventList> getEventList() {
            return this.eventList;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mqInstanceId
         */
        public String getMqInstanceId() {
            return this.mqInstanceId;
        }

        /**
         * @return mqType
         */
        public String getMqType() {
            return this.mqType;
        }

        /**
         * @return producerId
         */
        public String getProducerId() {
            return this.producerId;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String accessPoint; 
            private java.util.List<EventList> eventList; 
            private String instanceId; 
            private String mqInstanceId; 
            private String mqType; 
            private String producerId; 
            private String topic; 
            private String username; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessPoint = model.accessPoint;
                this.eventList = model.eventList;
                this.instanceId = model.instanceId;
                this.mqInstanceId = model.mqInstanceId;
                this.mqType = model.mqType;
                this.producerId = model.producerId;
                this.topic = model.topic;
                this.username = model.username;
            } 

            /**
             * AccessPoint.
             */
            public Builder accessPoint(String accessPoint) {
                this.accessPoint = accessPoint;
                return this;
            }

            /**
             * EventList.
             */
            public Builder eventList(java.util.List<EventList> eventList) {
                this.eventList = eventList;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MqInstanceId.
             */
            public Builder mqInstanceId(String mqInstanceId) {
                this.mqInstanceId = mqInstanceId;
                return this;
            }

            /**
             * MqType.
             */
            public Builder mqType(String mqType) {
                this.mqType = mqType;
                return this;
            }

            /**
             * ProducerId.
             */
            public Builder producerId(String producerId) {
                this.producerId = producerId;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
