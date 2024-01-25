// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientsResponseBody</p>
 */
public class DescribeClientsResponseBody extends TeaModel {
    @NameInMap("Clients")
    private Clients clients;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeClientsResponseBody(Builder builder) {
        this.clients = builder.clients;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clients
     */
    public Clients getClients() {
        return this.clients;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Clients clients; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The backup clients.
         */
        public Builder clients(Clients clients) {
            this.clients = clients;
            return this;
        }

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClientsResponseBody build() {
            return new DescribeClientsResponseBody(this);
        } 

    } 

    public static class Client extends TeaModel {
        @NameInMap("AlertSetting")
        private String alertSetting;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientName")
        private String clientName;

        @NameInMap("ClientType")
        private String clientType;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("MaxVersion")
        private String maxVersion;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("UseHttps")
        private Boolean useHttps;

        @NameInMap("VaultId")
        private String vaultId;

        private Client(Builder builder) {
            this.alertSetting = builder.alertSetting;
            this.clientId = builder.clientId;
            this.clientName = builder.clientName;
            this.clientType = builder.clientType;
            this.clientVersion = builder.clientVersion;
            this.clusterId = builder.clusterId;
            this.createdTime = builder.createdTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.maxVersion = builder.maxVersion;
            this.networkType = builder.networkType;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.updatedTime = builder.updatedTime;
            this.useHttps = builder.useHttps;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Client create() {
            return builder().build();
        }

        /**
         * @return alertSetting
         */
        public String getAlertSetting() {
            return this.alertSetting;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return clientType
         */
        public String getClientType() {
            return this.clientType;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return maxVersion
         */
        public String getMaxVersion() {
            return this.maxVersion;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return useHttps
         */
        public Boolean getUseHttps() {
            return this.useHttps;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private String alertSetting; 
            private String clientId; 
            private String clientName; 
            private String clientType; 
            private String clientVersion; 
            private String clusterId; 
            private Long createdTime; 
            private String instanceId; 
            private String instanceName; 
            private String maxVersion; 
            private String networkType; 
            private String status; 
            private String statusMessage; 
            private Long updatedTime; 
            private Boolean useHttps; 
            private String vaultId; 

            /**
             * The alert settings. Valid value: INHERITED, which indicates that the backup client sends alert notifications in the same way as the backup vault.
             */
            public Builder alertSetting(String alertSetting) {
                this.alertSetting = alertSetting;
                return this;
            }

            /**
             * The ID of the backup client.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The name of the backup client.
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * The type of the backup client. Valid value:**ECS_AGENT**, which indicates an SAP HANA backup client.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * The version number of the backup client.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The ID of the SAP HANA instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The time when the backup client was created.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the ECS instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The maximum version number of the backup client.
             */
            public Builder maxVersion(String maxVersion) {
                this.maxVersion = maxVersion;
                return this;
            }

            /**
             * The network type. Valid values:
             * <p>
             * 
             * *   **CLASSIC**: classic network
             * *   **VPC**: virtual private cloud (VPC)
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The status of the backup client. Valid values:
             * <p>
             * 
             * *   **REGISTERED**: The backup client is registered.
             * *   **ACTIVATED**: The backup client is enabled.
             * *   **DEACTIVATED**: The backup client fails to be enabled.
             * *   **INSTALLING**: The backup client is being installed.
             * *   **INSTALL_FAILED**: The backup client fails to be installed.
             * *   **NOT_INSTALLED**: The backup client is not installed.
             * *   **UPGRADING**: The backup client is being upgraded.
             * *   **UPGRADE_FAILED**: The backup client fails to be upgraded.
             * *   **UNINSTALLING**: The backup client is being uninstalled.
             * *   **UNINSTALL_FAILED**: The backup client fails to be uninstalled.
             * *   **STOPPED**: The backup client is out of service.
             * *   **UNKNOWN**: The backup client is disconnected.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The status information.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The time when the backup client was updated. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * Indicates whether data is transmitted over HTTPS. Valid values:
             * <p>
             * 
             * *   true: Data is transmitted over HTTPS.
             * *   false: Data is transmitted over HTTP.
             */
            public Builder useHttps(Boolean useHttps) {
                this.useHttps = useHttps;
                return this;
            }

            /**
             * The ID of the backup vault.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public Client build() {
                return new Client(this);
            } 

        } 

    }
    public static class Clients extends TeaModel {
        @NameInMap("Client")
        private java.util.List < Client> client;

        private Clients(Builder builder) {
            this.client = builder.client;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return client
         */
        public java.util.List < Client> getClient() {
            return this.client;
        }

        public static final class Builder {
            private java.util.List < Client> client; 

            /**
             * Client.
             */
            public Builder client(java.util.List < Client> client) {
                this.client = client;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
}
