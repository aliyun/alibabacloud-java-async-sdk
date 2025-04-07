// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
        private java.util.List<Clients> clients; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBackupClientsResponseBody model) {
            this.clients = model.clients;
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried backup clients.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Client&quot;: []}</p>
         */
        public Builder clients(java.util.List<Clients> clients) {
            this.clients = clients;
            return this;
        }

        /**
         * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
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
         * <p>The total number of returned HBR clients that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
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
    public static class Settings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertOnPartialComplete")
        private Boolean alertOnPartialComplete;

        @com.aliyun.core.annotation.NameInMap("DataNetworkType")
        private String dataNetworkType;

        @com.aliyun.core.annotation.NameInMap("DataProxySetting")
        private String dataProxySetting;

        @com.aliyun.core.annotation.NameInMap("MaxCpuCore")
        private String maxCpuCore;

        @com.aliyun.core.annotation.NameInMap("MaxMemory")
        private Long maxMemory;

        @com.aliyun.core.annotation.NameInMap("MaxWorker")
        private String maxWorker;

        @com.aliyun.core.annotation.NameInMap("ProxyHost")
        private String proxyHost;

        @com.aliyun.core.annotation.NameInMap("ProxyPassword")
        private String proxyPassword;

        @com.aliyun.core.annotation.NameInMap("ProxyPort")
        private Integer proxyPort;

        @com.aliyun.core.annotation.NameInMap("ProxyUser")
        private String proxyUser;

        @com.aliyun.core.annotation.NameInMap("UseHttps")
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

            private Builder() {
            } 

            private Builder(Settings model) {
                this.alertOnPartialComplete = model.alertOnPartialComplete;
                this.dataNetworkType = model.dataNetworkType;
                this.dataProxySetting = model.dataProxySetting;
                this.maxCpuCore = model.maxCpuCore;
                this.maxMemory = model.maxMemory;
                this.maxWorker = model.maxWorker;
                this.proxyHost = model.proxyHost;
                this.proxyPassword = model.proxyPassword;
                this.proxyPort = model.proxyPort;
                this.proxyUser = model.proxyUser;
                this.useHttps = model.useHttps;
            } 

            /**
             * <p>Indicates whether alerts are generated for partially completed jobs. This parameter is valid only for on-premises file backup and ECS file backup.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder alertOnPartialComplete(Boolean alertOnPartialComplete) {
                this.alertOnPartialComplete = alertOnPartialComplete;
                return this;
            }

            /**
             * <p>The type of the endpoint on the data plane. Valid values:</p>
             * <ul>
             * <li><strong>PUBLIC</strong>: Internet</li>
             * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
             * <li><strong>CLASSIC</strong>: classic network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder dataNetworkType(String dataNetworkType) {
                this.dataNetworkType = dataNetworkType;
                return this;
            }

            /**
             * <p>The proxy configuration on the data plane. Valid values:</p>
             * <ul>
             * <li><strong>DISABLE</strong>: The proxy is not used.</li>
             * <li><strong>USE_CONTROL_PROXY</strong> (default): The configuration is the same as that on the control plane.</li>
             * <li><strong>CUSTOM</strong>: The configuration is customized (HTTP).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USE_CONTROL_PROXY</p>
             */
            public Builder dataProxySetting(String dataProxySetting) {
                this.dataProxySetting = dataProxySetting;
                return this;
            }

            /**
             * <p>The number of CPU cores used by a single backup job. The value 0 indicates that the number is unlimited.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxCpuCore(String maxCpuCore) {
                this.maxCpuCore = maxCpuCore;
                return this;
            }

            /**
             * <p>The maximum memory that can be used by the client. Unit: bytes. Only V2.13.0 and later are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxMemory(Long maxMemory) {
                this.maxMemory = maxMemory;
                return this;
            }

            /**
             * <p>The number of concurrent backup jobs. The value 0 indicates that the number is unlimited.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxWorker(String maxWorker) {
                this.maxWorker = maxWorker;
                return this;
            }

            /**
             * <p>The custom host IP address of the proxy server on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.11.100</p>
             */
            public Builder proxyHost(String proxyHost) {
                this.proxyHost = proxyHost;
                return this;
            }

            /**
             * <p>The custom password of the proxy server on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder proxyPassword(String proxyPassword) {
                this.proxyPassword = proxyPassword;
                return this;
            }

            /**
             * <p>The custom host port of the proxy server on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <p>3128</p>
             */
            public Builder proxyPort(Integer proxyPort) {
                this.proxyPort = proxyPort;
                return this;
            }

            /**
             * <p>The custom username of the proxy server on the data plane.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder proxyUser(String proxyUser) {
                this.proxyUser = proxyUser;
                return this;
            }

            /**
             * <p>Indicates whether data on the data plane is transmitted over HTTPS. Valid values:</p>
             * <ul>
             * <li>true: Data is transmitted over HTTPS.</li>
             * <li>false: Data is transmitted over HTTP.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeBackupClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupClientsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the backup vault. Valid values of N: 1 to 20</p>
             * <ul>
             * <li>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
             * <li>The tag key cannot contain <code>http://</code> or <code>https://</code>.</li>
             * <li>The tag key cannot be an empty string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the backup vault. Valid values of N: 1 to 20</p>
             * <ul>
             * <li>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
             * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
             * <li>The tag value cannot be an empty string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeBackupClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupClientsResponseBody</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Appliance")
        private Boolean appliance;

        @com.aliyun.core.annotation.NameInMap("ArchType")
        private String archType;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private String clientType;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("LastHeartBeatTime")
        private Long lastHeartBeatTime;

        @com.aliyun.core.annotation.NameInMap("MaxClientVersion")
        private String maxClientVersion;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PrivateIpV4")
        private String privateIpV4;

        @com.aliyun.core.annotation.NameInMap("Settings")
        private Settings settings;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 
            private Long updatedTime; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Clients model) {
                this.appliance = model.appliance;
                this.archType = model.archType;
                this.backupStatus = model.backupStatus;
                this.clientId = model.clientId;
                this.clientType = model.clientType;
                this.clientVersion = model.clientVersion;
                this.createdTime = model.createdTime;
                this.hostname = model.hostname;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.lastHeartBeatTime = model.lastHeartBeatTime;
                this.maxClientVersion = model.maxClientVersion;
                this.osType = model.osType;
                this.privateIpV4 = model.privateIpV4;
                this.settings = model.settings;
                this.status = model.status;
                this.tags = model.tags;
                this.updatedTime = model.updatedTime;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Indicates whether the client is installed on an all-in-one PC that integrates hardware and monitoring program. Valid values:</p>
             * <ul>
             * <li>true: The client is installed on an all-in-one PC that integrates hardware and monitoring program.</li>
             * <li>false: The client is not installed on an all-in-one PC that integrates hardware and monitoring program.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder appliance(Boolean appliance) {
                this.appliance = appliance;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>ClientType</strong> parameter is set to <strong>ECS_CLIENT</strong>. This parameter indicates the system architecture where the backup client resides. Valid values:</p>
             * <ul>
             * <li><strong>amd64</strong></li>
             * <li><strong>386</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>amd64</p>
             */
            public Builder archType(String archType) {
                this.archType = archType;
                return this;
            }

            /**
             * <p>The protection status of the backup client. Valid values:</p>
             * <ul>
             * <li><strong>UNPROTECTED</strong>: The backup client is not protected.</li>
             * <li><strong>PROTECTED</strong>: The backup client is protected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PROTECTED</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The ID of the backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>c-*********************</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The type of the backup client. Valid value: <strong>ECS_CLIENT</strong>, which indicates a client for ECS file backup.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_CLIENT</p>
             */
            public Builder clientType(String clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The version number of the backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>2.4.5</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The time when the backup client was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The hostname of the backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>hostname</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * <ul>
             * <li>If the client is used to back up ECS files, this parameter indicates the ID of an ECS instance.</li>
             * <li>If the client is used to back up on-premises files, this parameter indicates the hardware fingerprint that is generated based on the system information.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>i-*********************</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>ClientType</strong> parameter is set to <strong>ECS_CLIENT</strong>. This parameter indicates the name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instancename</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The last heartbeat time of the backup client. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder lastHeartBeatTime(Long lastHeartBeatTime) {
                this.lastHeartBeatTime = lastHeartBeatTime;
                return this;
            }

            /**
             * <p>The latest version number of the backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>2.4.5</p>
             */
            public Builder maxClientVersion(String maxClientVersion) {
                this.maxClientVersion = maxClientVersion;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>ClientType</strong> parameter is set to <strong>ECS_CLIENT</strong>. This parameter indicates the operating system type of the backup client. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong></li>
             * <li><strong>linux</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>ClientType</strong> parameter is set to <strong>ECS_CLIENT</strong>. This parameter indicates the internal IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder privateIpV4(String privateIpV4) {
                this.privateIpV4 = privateIpV4;
                return this;
            }

            /**
             * <p>The configuration information of the backup client.</p>
             */
            public Builder settings(Settings settings) {
                this.settings = settings;
                return this;
            }

            /**
             * <p>The status of the backup client. Valid values:</p>
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
             * <p>The tag information.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the backup client was updated. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1554347313</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * <p>This parameter is valid only if the <strong>ClientType</strong> parameter is set to <strong>ECS_CLIENT</strong>. This parameter indicates the zone of the backup client.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-f</p>
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
