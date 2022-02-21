// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMqttClientStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMqttClientStatusResponseBody</p>
 */
public class DescribeMqttClientStatusResponseBody extends TeaModel {
    @NameInMap("ClientStatus")
    private ClientStatus clientStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMqttClientStatusResponseBody(Builder builder) {
        this.clientStatus = builder.clientStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMqttClientStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientStatus
     */
    public ClientStatus getClientStatus() {
        return this.clientStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClientStatus clientStatus; 
        private String requestId; 

        /**
         * ClientStatus.
         */
        public Builder clientStatus(ClientStatus clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMqttClientStatusResponseBody build() {
            return new DescribeMqttClientStatusResponseBody(this);
        } 

    } 

    public static class ClientStatus extends TeaModel {
        @NameInMap("CleanSession")
        private String cleanSession;

        @NameInMap("LastUpdate")
        private Long lastUpdate;

        @NameInMap("Status")
        private Integer status;

        private ClientStatus(Builder builder) {
            this.cleanSession = builder.cleanSession;
            this.lastUpdate = builder.lastUpdate;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientStatus create() {
            return builder().build();
        }

        /**
         * @return cleanSession
         */
        public String getCleanSession() {
            return this.cleanSession;
        }

        /**
         * @return lastUpdate
         */
        public Long getLastUpdate() {
            return this.lastUpdate;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cleanSession; 
            private Long lastUpdate; 
            private Integer status; 

            /**
             * CleanSession.
             */
            public Builder cleanSession(String cleanSession) {
                this.cleanSession = cleanSession;
                return this;
            }

            /**
             * LastUpdate.
             */
            public Builder lastUpdate(Long lastUpdate) {
                this.lastUpdate = lastUpdate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ClientStatus build() {
                return new ClientStatus(this);
            } 

        } 

    }
}
