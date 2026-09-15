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
 * {@link DescribeBackupClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupClientsResponseBody</p>
 */
public class DescribeBackupClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clients")
    private java.util.List<Clients> clients;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clients
     */
    public java.util.List<Clients> getClients() {
        return this.clients;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Clients> clients; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackupClientsResponseBody model) {
            this.clients = model.clients;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The anti-ransomware client information.</p>
         */
        public Builder clients(java.util.List<Clients> clients) {
            this.clients = clients;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use the request ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E3ED094C-9EB7-4239-962B-D0FB3D5F23C7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupClientsResponseBody build() {
            return new DescribeBackupClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupClientsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Clients model) {
                this.clientId = model.clientId;
                this.clientStatus = model.clientStatus;
                this.clientVersion = model.clientVersion;
                this.instanceId = model.instanceId;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The anti-ransomware client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-000az2f537r73dyh****</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The status of the anti-ransomware client.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><strong>INSTALLING</strong>: The client is being installed.</p>
             * </li>
             * <li><p><strong>ONLINE</strong>: The client is online.</p>
             * </li>
             * <li><p><strong>UNINSTALLING</strong>: The client is being uninstalled.</p>
             * </li>
             * <li><p><strong>NOT_INSTALLED</strong>: The client is not installed.</p>
             * </li>
             * <li><p><strong>ACTIVATED</strong>: The client is activated.</p>
             * </li>
             * <li><p><strong>CLIENT_CONNECTION_ERROR</strong>: A client connection error occurred.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The version number of the anti-ransomware client.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The instance ID of the ECS instance that has the anti-ransomware client installed.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp15hyph4aci99dv****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The UUID of the ECS instance that has the anti-ransomware client installed.</p>
             * 
             * <strong>example:</strong>
             * <p>22f6550d-f294-449b-b6e6-90638fd1****</p>
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
