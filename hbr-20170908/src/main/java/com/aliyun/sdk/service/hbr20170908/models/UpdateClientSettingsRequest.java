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
        this.clientId = builder.clientId;
        this.dataNetworkType = builder.dataNetworkType;
        this.dataProxySetting = builder.dataProxySetting;
        this.maxCpuCore = builder.maxCpuCore;
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
        private String clientId; 
        private String dataNetworkType; 
        private String dataProxySetting; 
        private Integer maxCpuCore; 
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

        private Builder(UpdateClientSettingsRequest response) {
            super(response);
            this.clientId = response.clientId;
            this.dataNetworkType = response.dataNetworkType;
            this.dataProxySetting = response.dataProxySetting;
            this.maxCpuCore = response.maxCpuCore;
            this.maxWorker = response.maxWorker;
            this.proxyHost = response.proxyHost;
            this.proxyPassword = response.proxyPassword;
            this.proxyPort = response.proxyPort;
            this.proxyUser = response.proxyUser;
            this.resourceGroupId = response.resourceGroupId;
            this.useHttps = response.useHttps;
            this.vaultId = response.vaultId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * DataNetworkType.
         */
        public Builder dataNetworkType(String dataNetworkType) {
            this.putQueryParameter("DataNetworkType", dataNetworkType);
            this.dataNetworkType = dataNetworkType;
            return this;
        }

        /**
         * DataProxySetting.
         */
        public Builder dataProxySetting(String dataProxySetting) {
            this.putQueryParameter("DataProxySetting", dataProxySetting);
            this.dataProxySetting = dataProxySetting;
            return this;
        }

        /**
         * MaxCpuCore.
         */
        public Builder maxCpuCore(Integer maxCpuCore) {
            this.putQueryParameter("MaxCpuCore", maxCpuCore);
            this.maxCpuCore = maxCpuCore;
            return this;
        }

        /**
         * MaxWorker.
         */
        public Builder maxWorker(Integer maxWorker) {
            this.putQueryParameter("MaxWorker", maxWorker);
            this.maxWorker = maxWorker;
            return this;
        }

        /**
         * ProxyHost.
         */
        public Builder proxyHost(String proxyHost) {
            this.putQueryParameter("ProxyHost", proxyHost);
            this.proxyHost = proxyHost;
            return this;
        }

        /**
         * ProxyPassword.
         */
        public Builder proxyPassword(String proxyPassword) {
            this.putQueryParameter("ProxyPassword", proxyPassword);
            this.proxyPassword = proxyPassword;
            return this;
        }

        /**
         * ProxyPort.
         */
        public Builder proxyPort(Integer proxyPort) {
            this.putQueryParameter("ProxyPort", proxyPort);
            this.proxyPort = proxyPort;
            return this;
        }

        /**
         * ProxyUser.
         */
        public Builder proxyUser(String proxyUser) {
            this.putQueryParameter("ProxyUser", proxyUser);
            this.proxyUser = proxyUser;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * UseHttps.
         */
        public Builder useHttps(Boolean useHttps) {
            this.putQueryParameter("UseHttps", useHttps);
            this.useHttps = useHttps;
            return this;
        }

        /**
         * VaultId.
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
