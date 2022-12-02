// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNsasSuspEventTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNsasSuspEventTypeResponseBody</p>
 */
public class DescribeNsasSuspEventTypeResponseBody extends TeaModel {
    @NameInMap("EventTypes")
    private java.util.List < EventTypes> eventTypes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNsasSuspEventTypeResponseBody(Builder builder) {
        this.eventTypes = builder.eventTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNsasSuspEventTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventTypes
     */
    public java.util.List < EventTypes> getEventTypes() {
        return this.eventTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EventTypes> eventTypes; 
        private String requestId; 

        /**
         * EventTypes.
         */
        public Builder eventTypes(java.util.List < EventTypes> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNsasSuspEventTypeResponseBody build() {
            return new DescribeNsasSuspEventTypeResponseBody(this);
        } 

    } 

    public static class EventTypes extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("SuspEventCount")
        private Integer suspEventCount;

        @NameInMap("Type")
        private String type;

        private EventTypes(Builder builder) {
            this.name = builder.name;
            this.suspEventCount = builder.suspEventCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTypes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return suspEventCount
         */
        public Integer getSuspEventCount() {
            return this.suspEventCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private Integer suspEventCount; 
            private String type; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SuspEventCount.
             */
            public Builder suspEventCount(Integer suspEventCount) {
                this.suspEventCount = suspEventCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EventTypes build() {
                return new EventTypes(this);
            } 

        } 

    }
}
