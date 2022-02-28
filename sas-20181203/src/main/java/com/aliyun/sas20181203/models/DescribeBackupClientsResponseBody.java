// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupClientsResponseBody</p>
 */
public class DescribeBackupClientsResponseBody extends TeaModel {
    @NameInMap("Clients")
    private java.util.List < Clients> clients;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupClientsResponseBody(Builder builder) {
        this.clients = builder.clients;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupClientsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clients
     */
    public java.util.List < Clients> getClients() {
        return this.clients;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Clients> clients; 
        private String requestId; 

        /**
         * Clients.
         */
        public Builder clients(java.util.List < Clients> clients) {
            this.clients = clients;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupClientsResponseBody build() {
            return new DescribeBackupClientsResponseBody(this);
        } 

    } 

    public static class Clients extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Uuid")
        private String uuid;

        private Clients(Builder builder) {
            this.clientId = builder.clientId;
            this.clientStatus = builder.clientStatus;
            this.instanceId = builder.instanceId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String clientId; 
            private String clientStatus; 
            private String instanceId; 
            private String uuid; 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientStatus.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
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
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
}
