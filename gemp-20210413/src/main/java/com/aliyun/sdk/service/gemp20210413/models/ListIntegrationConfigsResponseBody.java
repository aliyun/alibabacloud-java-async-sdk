// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntegrationConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegrationConfigsResponseBody</p>
 */
public class ListIntegrationConfigsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    private ListIntegrationConfigsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationConfigsResponseBody create() {
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
         * data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIntegrationConfigsResponseBody build() {
            return new ListIntegrationConfigsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("integrationConfigId")
        private Long integrationConfigId;

        @NameInMap("isReceivedEvent")
        private Boolean isReceivedEvent;

        @NameInMap("monitorSourceId")
        private Long monitorSourceId;

        @NameInMap("monitorSourceName")
        private String monitorSourceName;

        @NameInMap("monitorSourceShortName")
        private String monitorSourceShortName;

        @NameInMap("monitorSourceType")
        private Integer monitorSourceType;

        @NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.integrationConfigId = builder.integrationConfigId;
            this.isReceivedEvent = builder.isReceivedEvent;
            this.monitorSourceId = builder.monitorSourceId;
            this.monitorSourceName = builder.monitorSourceName;
            this.monitorSourceShortName = builder.monitorSourceShortName;
            this.monitorSourceType = builder.monitorSourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return integrationConfigId
         */
        public Long getIntegrationConfigId() {
            return this.integrationConfigId;
        }

        /**
         * @return isReceivedEvent
         */
        public Boolean getIsReceivedEvent() {
            return this.isReceivedEvent;
        }

        /**
         * @return monitorSourceId
         */
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        /**
         * @return monitorSourceName
         */
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        /**
         * @return monitorSourceShortName
         */
        public String getMonitorSourceShortName() {
            return this.monitorSourceShortName;
        }

        /**
         * @return monitorSourceType
         */
        public Integer getMonitorSourceType() {
            return this.monitorSourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long integrationConfigId; 
            private Boolean isReceivedEvent; 
            private Long monitorSourceId; 
            private String monitorSourceName; 
            private String monitorSourceShortName; 
            private Integer monitorSourceType; 
            private String status; 

            /**
             * integrationConfigId.
             */
            public Builder integrationConfigId(Long integrationConfigId) {
                this.integrationConfigId = integrationConfigId;
                return this;
            }

            /**
             * isReceivedEvent.
             */
            public Builder isReceivedEvent(Boolean isReceivedEvent) {
                this.isReceivedEvent = isReceivedEvent;
                return this;
            }

            /**
             * monitorSourceId.
             */
            public Builder monitorSourceId(Long monitorSourceId) {
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

            /**
             * monitorSourceShortName.
             */
            public Builder monitorSourceShortName(String monitorSourceShortName) {
                this.monitorSourceShortName = monitorSourceShortName;
                return this;
            }

            /**
             * monitorSourceType.
             */
            public Builder monitorSourceType(Integer monitorSourceType) {
                this.monitorSourceType = monitorSourceType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
