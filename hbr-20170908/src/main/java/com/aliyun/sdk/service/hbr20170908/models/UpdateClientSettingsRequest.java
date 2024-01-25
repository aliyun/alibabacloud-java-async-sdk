// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClientSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateClientSettingsRequest</p>
 */
public class UpdateClientSettingsRequest extends Request {
    @Query
    @NameInMap("AlertOnPartialComplete")
    private Boolean alertOnPartialComplete;

    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("DataNetworkType")
    private String dataNetworkType;

    @Query
    @NameInMap("DataProxySetting")
    private String dataProxySetting;

    @Query
    @NameInMap("MaxCpuCore")
    @Validation(maximum = 999)
    private Integer maxCpuCore;

    @Query
    @NameInMap("MaxMemory")
    @Validation(maximum = 1099511627776D)
    private Long maxMemory;

    @Query
    @NameInMap("MaxWorker")
    @Validation(maximum = 999)
    private Integer maxWorker;

    @Query
    @NameInMap("ProxyHost")
    private String proxyHost;

    @Query
    @NameInMap("ProxyPassword")
    private String proxyPassword;

    @Query
    @NameInMap("ProxyPort")
    @Validation(maximum = 65536, minimum = 1)
    private Integer proxyPort;

    @Query
    @NameInMap("ProxyUser")
    private String proxyUser;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("UseHttps")
    private Boolean useHttps;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private UpdateClientSettingsRequest(Builder builder) {
        super(builder);
        this.alertOnPartialComplete = builder.alertOnPartialComplete;
        this.clientId = builder.clientId;
        this.dataNetworkType = builder.dataNetworkType;
        this.dataProxySetting = builder.dataProxySetting;
        this.maxCpuCore = builder.maxCpuCore;
        this.maxMemory = builder.maxMemory;
        this.maxWorker = builder.maxWorker;
        this.proxyHost = builder.proxyHost;
        this.proxyPassword = builder.proxyPassword;
        this.proxyPort = builder.proxyPort;
        this.proxyUser = builder.proxyUser;
        this.resourceGroupId = builder.resourceGroupId;
        this.useHttps = builder.useHttps;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClientSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertOnPartialComplete
     */
    public Boolean getAlertOnPartialComplete() {
        return this.alertOnPartialComplete;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
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
    public Integer getMaxCpuCore() {
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
    public Integer getMaxWorker() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<UpdateClientSettingsRequest, Builder> {
        private Boolean alertOnPartialComplete; 
        private String clientId; 
        private String dataNetworkType; 
        private String dataProxySetting; 
        private Integer maxCpuCore; 
        private Long maxMemory; 
        private Integer maxWorker; 
        private String proxyHost; 
        private String proxyPassword; 
        private Integer proxyPort; 
        private String proxyUser; 
        private String resourceGroupId; 
        private Boolean useHttps; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClientSettingsRequest request) {
            super(request);
            this.alertOnPartialComplete = request.alertOnPartialComplete;
            this.clientId = request.clientId;
            this.dataNetworkType = request.dataNetworkType;
            this.dataProxySetting = request.dataProxySetting;
            this.maxCpuCore = request.maxCpuCore;
            this.maxMemory = request.maxMemory;
            this.maxWorker = request.maxWorker;
            this.proxyHost = request.proxyHost;
            this.proxyPassword = request.proxyPassword;
            this.proxyPort = request.proxyPort;
            this.proxyUser = request.proxyUser;
            this.resourceGroupId = request.resourceGroupId;
            this.useHttps = request.useHttps;
            this.vaultId = request.vaultId;
        } 

        /**
         * Specifies whether to generate alert for partially completed jobs. This parameter is valid only for on-premises file backup and ECS file backup.
         */
        public Builder alertOnPartialComplete(Boolean alertOnPartialComplete) {
            this.putQueryParameter("AlertOnPartialComplete", alertOnPartialComplete);
            this.alertOnPartialComplete = alertOnPartialComplete;
            return this;
        }

        /**
         * The ID of the HBR client.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
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
            this.putQueryParameter("DataNetworkType", dataNetworkType);
            this.dataNetworkType = dataNetworkType;
            return this;
        }

        /**
         * The proxy configuration on the data plane. Valid values:
         * <p>
         * 
         * *   **DISABLE**: No proxy is used.
         * *   **USE_CONTROL_PROXY** (default): The configuration is the same as that on the control plane.
         * *   **CUSTOM**: The configuration is customized (HTTP).
         */
        public Builder dataProxySetting(String dataProxySetting) {
            this.putQueryParameter("DataProxySetting", dataProxySetting);
            this.dataProxySetting = dataProxySetting;
            return this;
        }

        /**
         * The number of CPU cores used by a single backup job. The value 0 indicates that the number is unlimited.
         */
        public Builder maxCpuCore(Integer maxCpuCore) {
            this.putQueryParameter("MaxCpuCore", maxCpuCore);
            this.maxCpuCore = maxCpuCore;
            return this;
        }

        /**
         * The maximum memory that can be used by the client. Unit: bytes. Only V2.13.0 and later are supported.
         */
        public Builder maxMemory(Long maxMemory) {
            this.putQueryParameter("MaxMemory", maxMemory);
            this.maxMemory = maxMemory;
            return this;
        }

        /**
         * The number of concurrent backup jobs. The value 0 indicates that the number is unlimited.
         */
        public Builder maxWorker(Integer maxWorker) {
            this.putQueryParameter("MaxWorker", maxWorker);
            this.maxWorker = maxWorker;
            return this;
        }

        /**
         * The custom host IP address of the proxy server on the data plane.
         */
        public Builder proxyHost(String proxyHost) {
            this.putQueryParameter("ProxyHost", proxyHost);
            this.proxyHost = proxyHost;
            return this;
        }

        /**
         * The custom password of the proxy server on the data plane.
         */
        public Builder proxyPassword(String proxyPassword) {
            this.putQueryParameter("ProxyPassword", proxyPassword);
            this.proxyPassword = proxyPassword;
            return this;
        }

        /**
         * The custom host port of the proxy server on the data plane.
         */
        public Builder proxyPort(Integer proxyPort) {
            this.putQueryParameter("ProxyPort", proxyPort);
            this.proxyPort = proxyPort;
            return this;
        }

        /**
         * The custom username of the proxy server on the data plane.
         */
        public Builder proxyUser(String proxyUser) {
            this.putQueryParameter("ProxyUser", proxyUser);
            this.proxyUser = proxyUser;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specifies whether to transmit the data on the data plane over HTTPS. Valid values:
         * <p>
         * 
         * *   true: Data is transmitted over HTTPS.
         * *   false: Data is transmitted over HTTP.
         */
        public Builder useHttps(Boolean useHttps) {
            this.putQueryParameter("UseHttps", useHttps);
            this.useHttps = useHttps;
            return this;
        }

        /**
         * The ID of the backup vault. This parameter is required for the old HBR client.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public UpdateClientSettingsRequest build() {
            return new UpdateClientSettingsRequest(this);
        } 

    } 

}
