// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetDingtalkMeetingMemberEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetDingtalkMeetingMemberEventResponseBody</p>
 */
public class GetDingtalkMeetingMemberEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetDingtalkMeetingMemberEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkMeetingMemberEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetDingtalkMeetingMemberEventResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetDingtalkMeetingMemberEventResponseBody build() {
            return new GetDingtalkMeetingMemberEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDingtalkMeetingMemberEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetDingtalkMeetingMemberEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("confModule")
        private String confModule;

        @com.aliyun.core.annotation.NameInMap("eventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("ts")
        private Long ts;

        private Data(Builder builder) {
            this.confModule = builder.confModule;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.ts = builder.ts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return confModule
         */
        public String getConfModule() {
            return this.confModule;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return ts
         */
        public Long getTs() {
            return this.ts;
        }

        public static final class Builder {
            private String confModule; 
            private String eventId; 
            private String eventName; 
            private String eventType; 
            private Long ts; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.confModule = model.confModule;
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.eventType = model.eventType;
                this.ts = model.ts;
            } 

            /**
             * confModule.
             */
            public Builder confModule(String confModule) {
                this.confModule = confModule;
                return this;
            }

            /**
             * eventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * eventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * ts.
             */
            public Builder ts(Long ts) {
                this.ts = ts;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
