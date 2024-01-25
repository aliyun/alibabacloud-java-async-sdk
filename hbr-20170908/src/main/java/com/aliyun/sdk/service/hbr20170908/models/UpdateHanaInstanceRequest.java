// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHanaInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateHanaInstanceRequest</p>
 */
public class UpdateHanaInstanceRequest extends Request {
    @Query
    @NameInMap("AlertSetting")
    private String alertSetting;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("HanaName")
    private String hanaName;

    @Query
    @NameInMap("Host")
    private String host;

    @Query
    @NameInMap("InstanceNumber")
    @Validation(required = true)
    private Integer instanceNumber;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("UseSsl")
    @Validation(required = true)
    private Boolean useSsl;

    @Query
    @NameInMap("UserName")
    private String userName;

    @Query
    @NameInMap("ValidateCertificate")
    @Validation(required = true)
    private Boolean validateCertificate;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private UpdateHanaInstanceRequest(Builder builder) {
        super(builder);
        this.alertSetting = builder.alertSetting;
        this.clusterId = builder.clusterId;
        this.hanaName = builder.hanaName;
        this.host = builder.host;
        this.instanceNumber = builder.instanceNumber;
        this.password = builder.password;
        this.resourceGroupId = builder.resourceGroupId;
        this.useSsl = builder.useSsl;
        this.userName = builder.userName;
        this.validateCertificate = builder.validateCertificate;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHanaInstanceRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return hanaName
     */
    public String getHanaName() {
        return this.hanaName;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return instanceNumber
     */
    public Integer getInstanceNumber() {
        return this.instanceNumber;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return useSsl
     */
    public Boolean getUseSsl() {
        return this.useSsl;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return validateCertificate
     */
    public Boolean getValidateCertificate() {
        return this.validateCertificate;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<UpdateHanaInstanceRequest, Builder> {
        private String alertSetting; 
        private String clusterId; 
        private String hanaName; 
        private String host; 
        private Integer instanceNumber; 
        private String password; 
        private String resourceGroupId; 
        private Boolean useSsl; 
        private String userName; 
        private Boolean validateCertificate; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHanaInstanceRequest request) {
            super(request);
            this.alertSetting = request.alertSetting;
            this.clusterId = request.clusterId;
            this.hanaName = request.hanaName;
            this.host = request.host;
            this.instanceNumber = request.instanceNumber;
            this.password = request.password;
            this.resourceGroupId = request.resourceGroupId;
            this.useSsl = request.useSsl;
            this.userName = request.userName;
            this.validateCertificate = request.validateCertificate;
            this.vaultId = request.vaultId;
        } 

        /**
         * The alert settings. Valid value: INHERITED, which indicates that the backup client sends alert notifications in the same way as the backup vault.
         */
        public Builder alertSetting(String alertSetting) {
            this.putQueryParameter("AlertSetting", alertSetting);
            this.alertSetting = alertSetting;
            return this;
        }

        /**
         * The ID of the SAP HANA instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the SAP HANA instance.
         */
        public Builder hanaName(String hanaName) {
            this.putQueryParameter("HanaName", hanaName);
            this.hanaName = hanaName;
            return this;
        }

        /**
         * The private or internal IP address of the host where the primary node of the SAP HANA instance resides.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * The instance number of the SAP HANA system.
         */
        public Builder instanceNumber(Integer instanceNumber) {
            this.putQueryParameter("InstanceNumber", instanceNumber);
            this.instanceNumber = instanceNumber;
            return this;
        }

        /**
         * The password that is used to connect with the SAP HANA database.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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
         * Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL). Valid values:
         * <p>
         * 
         * *   true: The SAP HANA database is connected over SSL.
         * *   false: The SAP HANA database is not connected over SSL.
         */
        public Builder useSsl(Boolean useSsl) {
            this.putQueryParameter("UseSsl", useSsl);
            this.useSsl = useSsl;
            return this;
        }

        /**
         * The username of the SYSTEMDB database.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * Specifies whether to verify the SSL certificate of the SAP HANA database. Valid values:
         * <p>
         * 
         * *   true: The SSL certificate of the SAP HANA instance is verified.
         * *   false: The SSL certificate of the SAP HANA instance is not verified.
         */
        public Builder validateCertificate(Boolean validateCertificate) {
            this.putQueryParameter("ValidateCertificate", validateCertificate);
            this.validateCertificate = validateCertificate;
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
        public UpdateHanaInstanceRequest build() {
            return new UpdateHanaInstanceRequest(this);
        } 

    } 

}
