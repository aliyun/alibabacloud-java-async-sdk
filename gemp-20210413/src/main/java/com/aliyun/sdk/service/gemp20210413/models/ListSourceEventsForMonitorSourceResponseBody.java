// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSourceEventsForMonitorSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListSourceEventsForMonitorSourceResponseBody</p>
 */
public class ListSourceEventsForMonitorSourceResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    private ListSourceEventsForMonitorSourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSourceEventsForMonitorSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSourceEventsForMonitorSourceResponseBody build() {
            return new ListSourceEventsForMonitorSourceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("eventJson")
        private String eventJson;

        @NameInMap("eventTime")
        private String eventTime;

        @NameInMap("monitorSourceId")
        private Boolean monitorSourceId;

        @NameInMap("monitorSourceName")
        private String monitorSourceName;

        private Data(Builder builder) {
            this.eventJson = builder.eventJson;
            this.eventTime = builder.eventTime;
            this.monitorSourceId = builder.monitorSourceId;
            this.monitorSourceName = builder.monitorSourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventJson
         */
        public String getEventJson() {
            return this.eventJson;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return monitorSourceId
         */
        public Boolean getMonitorSourceId() {
            return this.monitorSourceId;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public static final class Builder {
            private String eventJson; 
            private String eventTime; 
            private Boolean monitorSourceId; 
            private String monitorSourceName; 

            /**
             * eventJson.
             */
            public Builder eventJson(String eventJson) {
                this.eventJson = eventJson;
                return this;
            }

            /**
             * eventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * monitorSourceId.
             */
            public Builder monitorSourceId(Boolean monitorSourceId) {
                this.monitorSourceId = monitorSourceId;
                return this;
            }

            /**
             * monitorSourceName.
             */
            public Builder monitorSourceName(String monitorSourceName) {
                this.monitorSourceName = monitorSourceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
