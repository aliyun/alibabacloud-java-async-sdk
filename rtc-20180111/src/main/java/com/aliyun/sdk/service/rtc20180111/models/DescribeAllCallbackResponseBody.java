// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAllCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllCallbackResponseBody</p>
 */
public class DescribeAllCallbackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Callbacks")
    private java.util.List < Callbacks> callbacks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAllCallbackResponseBody(Builder builder) {
        this.callbacks = builder.callbacks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllCallbackResponseBody create() {
        return builder().build();
    }

    /**
     * @return callbacks
     */
    public java.util.List < Callbacks> getCallbacks() {
        return this.callbacks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Callbacks> callbacks; 
        private String requestId; 

        /**
         * Callbacks.
         */
        public Builder callbacks(java.util.List < Callbacks> callbacks) {
            this.callbacks = callbacks;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAllCallbackResponseBody build() {
            return new DescribeAllCallbackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAllCallbackResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllCallbackResponseBody</p>
     */
    public static class SubEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private Integer event;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private SubEvent(Builder builder) {
            this.event = builder.event;
            this.eventName = builder.eventName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubEvent create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public Integer getEvent() {
            return this.event;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer event; 
            private String eventName; 
            private Integer type; 

            /**
             * Event.
             */
            public Builder event(Integer event) {
                this.event = event;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public SubEvent build() {
                return new SubEvent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAllCallbackResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllCallbackResponseBody</p>
     */
    public static class Callbacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SubEvent")
        private java.util.List < SubEvent> subEvent;

        private Callbacks(Builder builder) {
            this.category = builder.category;
            this.name = builder.name;
            this.subEvent = builder.subEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Callbacks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subEvent
         */
        public java.util.List < SubEvent> getSubEvent() {
            return this.subEvent;
        }

        public static final class Builder {
            private String category; 
            private String name; 
            private java.util.List < SubEvent> subEvent; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * SubEvent.
             */
            public Builder subEvent(java.util.List < SubEvent> subEvent) {
                this.subEvent = subEvent;
                return this;
            }

            public Callbacks build() {
                return new Callbacks(this);
            } 

        } 

    }
}
