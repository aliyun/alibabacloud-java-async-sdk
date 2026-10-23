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
 * {@link UpdateClientSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateClientSettingsRequest</p>
 */
public class UpdateClientSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertOnPartialComplete")
    private Boolean alertOnPartialComplete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataNetworkType")
    private String dataNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataProxySetting")
    private String dataProxySetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxCpuCore")
    @com.aliyun.core.annotation.Validation(maximum = 999)
    private Integer maxCpuCore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxMemory")
    @com.aliyun.core.annotation.Validation(maximum = 1099511627776D)
    private Long maxMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxWorker")
    @com.aliyun.core.annotation.Validation(maximum = 999)
    private Integer maxWorker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyHost")
    private String proxyHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyPassword")
    private String proxyPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyPort")
    @com.aliyun.core.annotation.Validation(maximum = 65536, minimum = 1)
    private Integer proxyPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUser")
    private String proxyUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseHttps")
    private Boolean useHttps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
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
         * <p>Specifies whether to trigger an alert for partially completed jobs. This parameter takes effect only for local File Backup and ECS File Backup Essential Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder alertOnPartialComplete(Boolean alertOnPartialComplete) {
            this.putQueryParameter("AlertOnPartialComplete", alertOnPartialComplete);
            this.alertOnPartialComplete = alertOnPartialComplete;
            return this;
        }

        /**
         * <p>The backup client ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-*********************</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The data plane access point type. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong>: public network</li>
         * <li><strong>VPC</strong>: VPC network</li>
         * <li><strong>CLASSIC</strong>: classic network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder dataNetworkType(String dataNetworkType) {
            this.putQueryParameter("DataNetworkType", dataNetworkType);
            this.dataNetworkType = dataNetworkType;
            return this;
        }

        /**
         * <p>The data plane proxy setting. Valid values:</p>
         * <ul>
         * <li><strong>DISABLE</strong>: does not use a proxy.</li>
         * <li><strong>USE_CONTROL_PROXY</strong> (default): uses the same configuration as the control plane.</li>
         * <li><strong>CUSTOM</strong>: uses a custom configuration (HTTP protocol).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USE_CONTROL_PROXY</p>
         */
        public Builder dataProxySetting(String dataProxySetting) {
            this.putQueryParameter("DataProxySetting", dataProxySetting);
            this.dataProxySetting = dataProxySetting;
            return this;
        }

        /**
         * <p>The number of CPU cores used by a single backup job. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxCpuCore(Integer maxCpuCore) {
            this.putQueryParameter("MaxCpuCore", maxCpuCore);
            this.maxCpuCore = maxCpuCore;
            return this;
        }

        /**
         * <p>The maximum memory that the client can use, in bytes. Only version 2.13.0 and later are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder maxMemory(Long maxMemory) {
            this.putQueryParameter("MaxMemory", maxMemory);
            this.maxMemory = maxMemory;
            return this;
        }

        /**
         * <p>The number of concurrent workers for a single backup job. A value of 0 indicates no limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxWorker(Integer maxWorker) {
            this.putQueryParameter("MaxWorker", maxWorker);
            this.maxWorker = maxWorker;
            return this;
        }

        /**
         * <p>The IP address of the custom data plane proxy server host.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.11.100</p>
         */
        public Builder proxyHost(String proxyHost) {
            this.putQueryParameter("ProxyHost", proxyHost);
            this.proxyHost = proxyHost;
            return this;
        }

        /**
         * <p>The password of the custom data plane proxy server.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder proxyPassword(String proxyPassword) {
            this.putQueryParameter("ProxyPassword", proxyPassword);
            this.proxyPassword = proxyPassword;
            return this;
        }

        /**
         * <p>The port of the custom data plane proxy server host.</p>
         * 
         * <strong>example:</strong>
         * <p>3128</p>
         */
        public Builder proxyPort(Integer proxyPort) {
            this.putQueryParameter("ProxyPort", proxyPort);
            this.proxyPort = proxyPort;
            return this;
        }

        /**
         * <p>The username of the custom data plane proxy server.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder proxyUser(String proxyUser) {
            this.putQueryParameter("ProxyUser", proxyUser);
            this.proxyUser = proxyUser;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-*********************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to use HTTPS to transmit data plane data.</p>
         * <ul>
         * <li>true: Uses HTTPS for transmission.</li>
         * <li>false: Uses HTTP for transmission.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useHttps(Boolean useHttps) {
            this.putQueryParameter("UseHttps", useHttps);
            this.useHttps = useHttps;
            return this;
        }

        /**
         * <p>The backup vault ID. This parameter is required for legacy clients.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
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
