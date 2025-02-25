// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeNsasSuspEventTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNsasSuspEventTypeResponseBody</p>
 */
public class DescribeNsasSuspEventTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    private java.util.List<EventTypes> eventTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<EventTypes> getEventTypes() {
        return this.eventTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EventTypes> eventTypes; 
        private String requestId; 

        /**
         * <p>An array that consists of the information about the alert type.</p>
         */
        public Builder eventTypes(java.util.List<EventTypes> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9FBC6E47-7508-58C9-9E76-528E118CB1CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNsasSuspEventTypeResponseBody build() {
            return new DescribeNsasSuspEventTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNsasSuspEventTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNsasSuspEventTypeResponseBody</p>
     */
    public static class EventTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SuspEventCount")
        private Integer suspEventCount;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The name of the alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of assets for which an alert of the type is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder suspEventCount(Integer suspEventCount) {
                this.suspEventCount = suspEventCount;
                return this;
            }

            /**
             * <p>The alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon</p>
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
