// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientsRequest} extends {@link RequestModel}
 *
 * <p>CreateClientsRequest</p>
 */
public class CreateClientsRequest extends Request {
    @Query
    @NameInMap("AlertSetting")
    private String alertSetting;

    @Query
    @NameInMap("ClientInfo")
    private String clientInfo;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("UseHttps")
    private Boolean useHttps;

    @Query
    @NameInMap("VaultId")
    @Validation(required = true)
    private String vaultId;

    private CreateClientsRequest(Builder builder) {
        super(builder);
        this.alertSetting = builder.alertSetting;
        this.clientInfo = builder.clientInfo;
        this.resourceGroupId = builder.resourceGroupId;
        this.useHttps = builder.useHttps;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertSetting
     */
    public String getAlertSetting() {
        return this.alertSetting;
    }

    /**
     * @return clientInfo
     */
    public String getClientInfo() {
        return this.clientInfo;
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

    public static final class Builder extends Request.Builder<CreateClientsRequest, Builder> {
        private String alertSetting; 
        private String clientInfo; 
        private String resourceGroupId; 
        private Boolean useHttps; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientsRequest request) {
            super(request);
            this.alertSetting = request.alertSetting;
            this.clientInfo = request.clientInfo;
            this.resourceGroupId = request.resourceGroupId;
            this.useHttps = request.useHttps;
            this.vaultId = request.vaultId;
        } 

        /**
         * The alert settings. Valid value: INHERITED, which indicates that the HBR client sends alert notifications by using the same method configured for the backup vault.
         */
        public Builder alertSetting(String alertSetting) {
            this.putQueryParameter("AlertSetting", alertSetting);
            this.alertSetting = alertSetting;
            return this;
        }

        /**
         * The installation information of the HBR clients.
         */
        public Builder clientInfo(String clientInfo) {
            this.putQueryParameter("ClientInfo", clientInfo);
            this.clientInfo = clientInfo;
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
         * Specifies whether to transmit data over HTTPS. Valid values:
         * <p>
         * 
         * *   true: transmits data over HTTPS.
         * *   false: transmits data over HTTP.
         */
        public Builder useHttps(Boolean useHttps) {
            this.putQueryParameter("UseHttps", useHttps);
            this.useHttps = useHttps;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public CreateClientsRequest build() {
            return new CreateClientsRequest(this);
        } 

    } 

}
