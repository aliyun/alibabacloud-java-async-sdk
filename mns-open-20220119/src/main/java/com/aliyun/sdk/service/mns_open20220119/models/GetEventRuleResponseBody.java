// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link GetEventRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetEventRuleResponseBody</p>
 */
public class GetEventRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetEventRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetEventRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEventRuleResponseBody build() {
            return new GetEventRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEventRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventRuleResponseBody</p>
     */
    public static class Endpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("EndpointValue")
        private String endpointValue;

        private Endpoint(Builder builder) {
            this.endpointType = builder.endpointType;
            this.endpointValue = builder.endpointValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return endpointValue
         */
        public String getEndpointValue() {
            return this.endpointValue;
        }

        public static final class Builder {
            private String endpointType; 
            private String endpointValue; 

            private Builder() {
            } 

            private Builder(Endpoint model) {
                this.endpointType = model.endpointType;
                this.endpointValue = model.endpointValue;
            } 

            /**
             * EndpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * EndpointValue.
             */
            public Builder endpointValue(String endpointValue) {
                this.endpointValue = endpointValue;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventRuleResponseBody</p>
     */
    public static class Subscriptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("EndpointValue")
        private String endpointValue;

        private Subscriptions(Builder builder) {
            this.endpointType = builder.endpointType;
            this.endpointValue = builder.endpointValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscriptions create() {
            return builder().build();
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return endpointValue
         */
        public String getEndpointValue() {
            return this.endpointValue;
        }

        public static final class Builder {
            private String endpointType; 
            private String endpointValue; 

            private Builder() {
            } 

            private Builder(Subscriptions model) {
                this.endpointType = model.endpointType;
                this.endpointValue = model.endpointValue;
            } 

            /**
             * EndpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * EndpointValue.
             */
            public Builder endpointValue(String endpointValue) {
                this.endpointValue = endpointValue;
                return this;
            }

            public Subscriptions build() {
                return new Subscriptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryMode")
        private String deliveryMode;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private Endpoint endpoint;

        @com.aliyun.core.annotation.NameInMap("EventTypes")
        private java.util.List<String> eventTypes;

        @com.aliyun.core.annotation.NameInMap("MatchRules")
        private java.util.List<java.util.List<EventMatchRule>> matchRules;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Subscriptions")
        private java.util.List<Subscriptions> subscriptions;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private Data(Builder builder) {
            this.deliveryMode = builder.deliveryMode;
            this.endpoint = builder.endpoint;
            this.eventTypes = builder.eventTypes;
            this.matchRules = builder.matchRules;
            this.ruleName = builder.ruleName;
            this.subscriptions = builder.subscriptions;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deliveryMode
         */
        public String getDeliveryMode() {
            return this.deliveryMode;
        }

        /**
         * @return endpoint
         */
        public Endpoint getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return eventTypes
         */
        public java.util.List<String> getEventTypes() {
            return this.eventTypes;
        }

        /**
         * @return matchRules
         */
        public java.util.List<java.util.List<EventMatchRule>> getMatchRules() {
            return this.matchRules;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return subscriptions
         */
        public java.util.List<Subscriptions> getSubscriptions() {
            return this.subscriptions;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String deliveryMode; 
            private Endpoint endpoint; 
            private java.util.List<String> eventTypes; 
            private java.util.List<java.util.List<EventMatchRule>> matchRules; 
            private String ruleName; 
            private java.util.List<Subscriptions> subscriptions; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deliveryMode = model.deliveryMode;
                this.endpoint = model.endpoint;
                this.eventTypes = model.eventTypes;
                this.matchRules = model.matchRules;
                this.ruleName = model.ruleName;
                this.subscriptions = model.subscriptions;
                this.topicName = model.topicName;
            } 

            /**
             * DeliveryMode.
             */
            public Builder deliveryMode(String deliveryMode) {
                this.deliveryMode = deliveryMode;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(Endpoint endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * EventTypes.
             */
            public Builder eventTypes(java.util.List<String> eventTypes) {
                this.eventTypes = eventTypes;
                return this;
            }

            /**
             * MatchRules.
             */
            public Builder matchRules(java.util.List<java.util.List<EventMatchRule>> matchRules) {
                this.matchRules = matchRules;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Subscriptions.
             */
            public Builder subscriptions(java.util.List<Subscriptions> subscriptions) {
                this.subscriptions = subscriptions;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
