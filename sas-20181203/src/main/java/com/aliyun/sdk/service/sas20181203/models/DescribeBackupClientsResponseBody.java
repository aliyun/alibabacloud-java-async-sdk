// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupClientsResponseBody</p>
 */
public class DescribeBackupClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clients")
    private java.util.List < Clients> clients;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * An array that consists of the information about the anti-ransomware agent.
         */
        public Builder clients(java.util.List < Clients> clients) {
            this.clients = clients;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Clients(Builder builder) {
            this.clientId = builder.clientId;
            this.clientStatus = builder.clientStatus;
            this.clientVersion = builder.clientVersion;
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
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
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
            private String clientVersion; 
            private String instanceId; 
            private String uuid; 

            /**
             * The ID of the anti-ransomware agent.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The status of the anti-ransomware agent.
             * <p>
             * 
             * Valid values:
             * 
             * *   **INSTALLING**: The agent is being installed.
             * *   **ONLINE**: The agent is online.
             * *   **UNINSTALLING**: The agent is being uninstalled.
             * *   **NOT_INSTALLED**: The agent is not installed.
             * *   **ACTIVATED**: The agent is enabled.
             * *   **CLIENT\_CONNECTION_ERROR**: A connection error occurs on the agent.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * The version of the anti-ransomware agent.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The ID of the ECS instance on which the anti-ransomware agent is installed.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The UUID of the Elastic Compute Service (ECS) instance on which the anti-ransomware agent is installed.
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
