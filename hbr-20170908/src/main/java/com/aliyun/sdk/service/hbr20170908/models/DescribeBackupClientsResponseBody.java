// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
    private Long totalCount;

    private DescribeBackupClientsResponseBody(Builder builder) {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Clients> clients; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The HBR clients.
         */
        public Builder clients(java.util.List < Clients> clients) {
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
         * The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.
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
         * The total number of returned HBR clients that meet the specified conditions.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBackupClientsResponseBody build() {
            return new DescribeBackupClientsResponseBody(this);
        } 

    } 

    public static class Settings extends TeaModel {
        @NameInMap("AlertOnPartialComplete")
        private Boolean alertOnPartialComplete;

        @NameInMap("DataNetworkType")
        private String dataNetworkType;

        @NameInMap("DataProxySetting")
        private String dataProxySetting;

        @NameInMap("MaxCpuCore")
        private String maxCpuCore;

        @NameInMap("MaxMemory")
        private Long maxMemory;

        @NameInMap("MaxWorker")
        private String maxWorker;

        @NameInMap("ProxyHost")
        private String proxyHost;

        @NameInMap("ProxyPassword")
        private String proxyPassword;

        @NameInMap("ProxyPort")
        private Integer proxyPort;

        @NameInMap("ProxyUser")
        private String proxyUser;

        @NameInMap("UseHttps")
        private String useHttps;

        private Settings(Builder builder) {
            this.alertOnPartialComplete = builder.alertOnPartialComplete;
            this.dataNetworkType = builder.dataNetworkType;
            this.dataProxySetting = builder.dataProxySetting;
            this.maxCpuCore = builder.maxCpuCore;
            this.maxMemory = builder.maxMemory;
            this.maxWorker = builder.maxWorker;
            this.proxyHost = builder.proxyHost;
            this.proxyPassword = builder.proxyPassword;
            this.proxyPort = builder.proxyPort;
            this.proxyUser = builder.proxyUser;
            this.useHttps = builder.useHttps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return alertOnPartialComplete
         */
        public Boolean getAlertOnPartialComplete() {
            return this.alertOnPartialComplete;
        }

        /**
         * @return dataNetworkType
         */
        public String getDataNetworkType() {
            return this.dataNetworkType;
        }

        /**
         * @return dataProxySetting
         */
        public String getDataProxySetting() {
            return this.dataProxySetting;
        }

        /**
         * @return maxCpuCore
         */
        public String getMaxCpuCore() {
            return this.maxCpuCore;
        }

        /**
         * @return maxMemory
         */
        public Long getMaxMemory() {
            return this.maxMemory;
        }

        /**
         * @return maxWorker
         */
        public String getMaxWorker() {
            return this.maxWorker;
        }

        /**
         * @return proxyHost
         */
        public String getProxyHost() {
            return this.proxyHost;
        }

        /**
         * @return proxyPassword
         */
        public String getProxyPassword() {
            return this.proxyPassword;
        }

        /**
         * @return proxyPort
         */
        public Integer getProxyPort() {
            return this.proxyPort;
        }

        /**
         * @return proxyUser
         */
        public String getProxyUser() {
            return this.proxyUser;
        }

        /**
         * @return useHttps
         */
        public String getUseHttps() {
            return this.useHttps;
        }

        public static final class Builder {
            private Boolean alertOnPartialComplete; 
            private String dataNetworkType; 
            private String dataProxySetting; 
            private String maxCpuCore; 
            private Long maxMemory; 
            private String maxWorker; 
            private String proxyHost; 
            private String proxyPassword; 
            private Integer proxyPort; 
            private String proxyUser; 
            private String useHttps; 

            /**
             * AlertOnPartialComplete.
             */
            public Builder alertOnPartialComplete(Boolean alertOnPartialComplete) {
                this.alertOnPartialComplete = alertOnPartialComplete;
                return this;
            }

            /**
             * The type of the endpoint on the data plane. Valid values:
             * <p>
             * 
             * *   **PUBLIC**: Internet
             * *   **VPC**: virtual private cloud (VPC)
             * *   **CLASSIC**: classic network
             */
            public Builder dataNetworkType(String dataNetworkType) {
                this.dataNetworkType = dataNetworkType;
                return this;
            }

            /**
             * The proxy configuration on the data plane. Valid values:
             * <p>
             * 
             * *   **DISABLE**: The proxy is not used.
             * *   \*\*USE_CONTROL_PROXY \*\* (default value): The configuration is the same as that on the control plane.
             * *   **CUSTOM**: The configuration is customized (HTTP).
             */
            public Builder dataProxySetting(String dataProxySetting) {
                this.dataProxySetting = dataProxySetting;
                return this;
            }

            /**
             * The number of CPU cores used by a single backup job. The value 0 indicates that the number is unlimited.
             */
            public Builder maxCpuCore(String maxCpuCore) {
                this.maxCpuCore = maxCpuCore;
                return this;
            }

            /**
             * MaxMemory.
             */
            public Builder maxMemory(Long maxMemory) {
                this.maxMemory = maxMemory;
                return this;
            }

            /**
             * The number of concurrent backup jobs. The value 0 indicates that the number is unlimited.
             */
            public Builder maxWorker(String maxWorker) {
                this.maxWorker = maxWorker;
                return this;
            }

            /**
             * The custom host IP address of the proxy server on the data plane.
             */
            public Builder proxyHost(String proxyHost) {
                this.proxyHost = proxyHost;
                return this;
            }

            /**
             * The custom password of the proxy server on the data plane.
             */
            public Builder proxyPassword(String proxyPassword) {
                this.proxyPassword = proxyPassword;
                return this;
            }

            /**
             * The custom host port of the proxy server on the data plane.
             */
            public Builder proxyPort(Integer proxyPort) {
                this.proxyPort = proxyPort;
                return this;
            }

            /**
             * The custom username of the proxy server on the data plane.
             */
            public Builder proxyUser(String proxyUser) {
                this.proxyUser = proxyUser;
                return this;
            }

            /**
             * Indicates whether data on the data plane is transmitted over HTTPS. Valid values:
             * <p>
             * 
             * *   true: Data is transmitted over HTTPS.
             * *   false: Data is transmitted over HTTP.
             */
            public Builder useHttps(String useHttps) {
                this.useHttps = useHttps;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key of the backup vault. Valid values of N: 1 to 20.
             * <p>
             * 
             * *   The tag key cannot start with `aliyun` or `acs:`.
             * *   The tag key cannot contain `http://` or `https://`.
             * *   The tag key cannot be an empty string.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the backup vault. Valid values of N: 1 to 20.
             * <p>
             * 
             * *   The tag value cannot start with `aliyun` or `acs:`.
             * *   The tag value cannot contain `http://` or `https://`.
             * *   The tag value cannot be an empty string.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Clients extends TeaModel {
        @NameInMap("Appliance")
        private Boolean appliance;

        @NameInMap("ArchType")
        private String archType;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientType")
        private String clientType;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("LastHeartBeatTime")
        private Long lastHeartBeatTime;

        @NameInMap("MaxClientVersion")
        private String maxClientVersion;

        @NameInMap("OsType")
        private String osType;

        @NameInMap("PrivateIpV4")
        private String privateIpV4;

        @NameInMap("Settings")
        private Settings settings;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        @NameInMap("ZoneId")
        private String zoneId;

        private Clients(Builder builder) {
            this.appliance = builder.appliance;
            this.archType = builder.archType;
            this.backupStatus = builder.backupStatus;
            this.clientId = builder.clientId;
            this.clientType = builder.clientType;
            this.clientVersion = builder.clientVersion;
            this.createdTime = builder.createdTime;
            this.hostname = builder.hostname;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.lastHeartBeatTime = builder.lastHeartBeatTime;
            this.maxClientVersion = builder.maxClientVersion;
            this.osType = builder.osType;
            this.privateIpV4 = builder.privateIpV4;
            this.settings = builder.settings;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updatedTime = builder.updatedTime;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return appliance
         */
        public Boolean getAppliance() {
            return this.appliance;
        }

        /**
         * @return archType
         */
        public String getArchType() {
            return this.archType;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
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
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
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
         * @return lastHeartBeatTime
         */
        public Long getLastHeartBeatTime() {
            return this.lastHeartBeatTime;
        }

        /**
         * @return maxClientVersion
         */
        public String getMaxClientVersion() {
            return this.maxClientVersion;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return privateIpV4
         */
        public String getPrivateIpV4() {
            return this.privateIpV4;
        }

        /**
         * @return settings
         */
        public Settings getSettings() {
            return this.settings;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean appliance; 
            private String archType; 
            private String backupStatus; 
            private String clientId; 
            private String clientType; 
            private String clientVersion; 
            private Long createdTime; 
            private String hostname; 
            private String instanceId; 
            private String instanceName; 
            private Long lastHeartBeatTime; 
            private String maxClientVersion; 
            private String osType; 
            private String privateIpV4; 
            private Settings settings; 
            private String status; 
            private java.util.List < Tags> tags; 
            private Long updatedTime; 
            private String zoneId; 

            /**
             * Indicates whether the HBR client is installed on an all-in-one PC that integrates hardware and monitoring program. Valid values:
             * <p>
             * 
             * *   true: The HBR client is installed on an all-in-one PC that integrates hardware and monitoring program.
             * *   false: The HBR client is not installed on an all-in-one PC that integrates hardware and monitoring program.
             */
            public Builder appliance(Boolean appliance) {
                this.appliance = appliance;
                return this;
            }

            /**
             * This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the system architecture where the HBR client resides. Valid values:
             * <p>
             * 
             * *   **amd64**
             * *   **386**
             */
            public Builder archType(String archType) {
                this.archType = archType;
                return this;
            }

            /**
             * The protection status of the HBR client. Valid values:
             * <p>
             * 
             * *   **UNPROTECTED**: The HBR client is not protected.
             * *   **PROTECTED**: The HBR client is protected.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * The ID of the HBR client.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The type of the HBR client. Valid value: **ECS_CLIENT**, which indicates an HBR client for ECS file backup.
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * The version number of the HBR client.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * The time when the HBR client was created. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The hostname of the HBR client.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * The ID of the instance.
             * <p>
             * 
             * *   If the HBR client is used to back up ECS files, this parameter indicates the ID of an ECS instance.
             * *   If the HBR client is used to back up on-premises files, this parameter indicates the hardware fingerprint that is generated based on the system information.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the name of the ECS instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The last heartbeat time of the HBR client. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder lastHeartBeatTime(Long lastHeartBeatTime) {
                this.lastHeartBeatTime = lastHeartBeatTime;
                return this;
            }

            /**
             * The latest version number of the HBR client.
             */
            public Builder maxClientVersion(String maxClientVersion) {
                this.maxClientVersion = maxClientVersion;
                return this;
            }

            /**
             * This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the operating system type of the HBR client. Valid values:
             * <p>
             * 
             * *   **windows**
             * *   **linux**
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the internal IP address of the ECS instance.
             */
            public Builder privateIpV4(String privateIpV4) {
                this.privateIpV4 = privateIpV4;
                return this;
            }

            /**
             * The configuration information of the HBR client.
             */
            public Builder settings(Settings settings) {
                this.settings = settings;
                return this;
            }

            /**
             * The status of the HBR client. Valid values:
             * <p>
             * 
             * *   **REGISTERED**: The HBR client is registered.
             * *   **ACTIVATED**: The HBR client is enabled.
             * *   **DEACTIVATED**: The HBR client fails to be enabled.
             * *   **INSTALLING**: The HBR client is being installed.
             * *   **INSTALL_FAILED**: The HBR client fails to be installed.
             * *   **NOT_INSTALLED**: The HBR client is not installed.
             * *   **UPGRADING**: The HBR client is being upgraded.
             * *   **UPGRADE_FAILED**: The HBR client fails to be upgraded.
             * *   **UNINSTALLING**: The HBR client is being uninstalled.
             * *   **UNINSTALL_FAILED**: The HBR client fails to be uninstalled.
             * *   **STOPPED**: The HBR client is out of service.
             * *   **UNKNOWN**: The HBR client is disconnected.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag information.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The time when the HBR client was updated. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * This parameter is valid only if the **ClientType** parameter is set to **ECS_CLIENT**. This parameter indicates the zone of the HBR client.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
}
