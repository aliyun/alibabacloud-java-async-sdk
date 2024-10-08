// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientsResponseBody</p>
 */
public class DescribeClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clients")
    private Clients clients;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The Cloud Backup clients.</p>
         */
        public Builder clients(Clients clients) {
            this.clients = clients;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17189276-465D-5EF3-8FFD-0FF51B5A41A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClientsResponseBody build() {
            return new DescribeClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientsResponseBody</p>
     */
    public static class Client extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertSetting")
        private String alertSetting;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MaxVersion")
        private String maxVersion;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("UseHttps")
        private Boolean useHttps;

        @com.aliyun.core.annotation.NameInMap("VaultId")
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
             * <p>The alert settings. Valid value: INHERITED, which indicates that the Cloud Backup client sends alert notifications by using the same method configured for the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>INHERITED</p>
             */
            public Builder alertSetting(String alertSetting) {
                this.alertSetting = alertSetting;
                return this;
            }

            /**
             * <p>The ID of the Cloud Backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>c-00062uu******2fgj</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client name.</p>
             * 
             * <strong>example:</strong>
             * <p>client-20211224-101226</p>
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * <p>The type of the Cloud Backup client. Valid value: <strong>ECS_AGENT</strong>, which indicates an SAP HANA backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_AGENT</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The version number of the Cloud Backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.11.16</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The ID of the SAP HANA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cl-0008c48frr******ncpk</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the Cloud Backup client was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9b6wya******n8yo</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>swh-hbr</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The maximum version number of the Cloud Backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.11.23</p>
             */
            public Builder maxVersion(String maxVersion) {
                this.maxVersion = maxVersion;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li><strong>CLASSIC</strong>: the classic network</li>
             * <li><strong>VPC</strong>: the virtual private cloud (VPC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The status of the Cloud Backup client. Valid values:</p>
             * <ul>
             * <li><strong>REGISTERED</strong>: The backup client is registered.</li>
             * <li><strong>ACTIVATED</strong>: The backup client is activated.</li>
             * <li><strong>DEACTIVATED</strong>: The backup client fails to be activated.</li>
             * <li><strong>INSTALLING</strong>: The backup client is being installed.</li>
             * <li><strong>INSTALL_FAILED</strong>: The backup client fails to be installed.</li>
             * <li><strong>NOT_INSTALLED</strong>: The backup client is not installed.</li>
             * <li><strong>UPGRADING</strong>: The backup client is being upgraded.</li>
             * <li><strong>UPGRADE_FAILED</strong>: The backup client fails to be upgraded.</li>
             * <li><strong>UNINSTALLING</strong>: The backup client is being uninstalled.</li>
             * <li><strong>UNINSTALL_FAILED</strong>: The backup client fails to be uninstalled.</li>
             * <li><strong>STOPPED</strong>: The backup client is out of service.</li>
             * <li><strong>UNKNOWN</strong>: The backup client is disconnected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status information.</p>
             * 
             * <strong>example:</strong>
             * <p>HANA_NOT_SUPPORT</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>The time when the Cloud Backup client was updated. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>Indicates whether data is transmitted over HTTPS. Valid values:</p>
             * <ul>
             * <li>true: Data is transmitted over HTTPS.</li>
             * <li>false: Data is transmitted over HTTP.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder useHttps(Boolean useHttps) {
                this.useHttps = useHttps;
                return this;
            }

            /**
             * <p>The ID of the backup vault.</p>
             * 
             * <strong>example:</strong>
             * <p>v-00029mx6o******n85lg</p>
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
    /**
     * 
     * {@link DescribeClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientsResponseBody</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Client")
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
