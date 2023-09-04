// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntegrationConfigResponseBody</p>
 */
public class GetIntegrationConfigResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetIntegrationConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegrationConfigResponseBody create() {
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
         * data
         */
        public Builder data(Data data) {
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

        public GetIntegrationConfigResponseBody build() {
            return new GetIntegrationConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("accessKey")
        private String accessKey;

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

        @NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.accessKey = builder.accessKey;
            this.integrationConfigId = builder.integrationConfigId;
            this.isReceivedEvent = builder.isReceivedEvent;
            this.monitorSourceId = builder.monitorSourceId;
            this.monitorSourceName = builder.monitorSourceName;
            this.monitorSourceShortName = builder.monitorSourceShortName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accessKey; 
            private Long integrationConfigId; 
            private Boolean isReceivedEvent; 
            private Long monitorSourceId; 
            private String monitorSourceName; 
            private String monitorSourceShortName; 
            private String status; 

            /**
             * accessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

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
