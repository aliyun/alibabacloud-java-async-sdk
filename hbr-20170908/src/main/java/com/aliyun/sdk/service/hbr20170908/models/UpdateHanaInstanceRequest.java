// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateHanaInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateHanaInstanceRequest</p>
 */
public class UpdateHanaInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertSetting")
    private String alertSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HanaName")
    private String hanaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer instanceNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseSsl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean useSsl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidateCertificate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean validateCertificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
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
         * <p>The alert settings. Valid value: INHERITED, which indicates that the Cloud Backup client sends alert notifications by using the same method configured for the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>INHERITED</p>
         */
        public Builder alertSetting(String alertSetting) {
            this.putQueryParameter("AlertSetting", alertSetting);
            this.alertSetting = alertSetting;
            return this;
        }

        /**
         * <p>The ID of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000axjt******c6j8</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>SAP-HANA-DEV</p>
         */
        public Builder hanaName(String hanaName) {
            this.putQueryParameter("HanaName", hanaName);
            this.hanaName = hanaName;
            return this;
        }

        /**
         * <p>The private or internal IP address of the host where the primary node of the SAP HANA instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>The instance number of the SAP HANA system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        public Builder instanceNumber(Integer instanceNumber) {
            this.putQueryParameter("InstanceNumber", instanceNumber);
            this.instanceNumber = instanceNumber;
            return this;
        }

        /**
         * <p>The password that is used to connect with the SAP HANA database.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzvx7d3c4kpny</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL). Valid values:</p>
         * <ul>
         * <li>true: The SAP HANA database is connected over SSL.</li>
         * <li>false: The SAP HANA database is not connected over SSL.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useSsl(Boolean useSsl) {
            this.putQueryParameter("UseSsl", useSsl);
            this.useSsl = useSsl;
            return this;
        }

        /**
         * <p>The username of the SYSTEMDB database.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>Specifies whether to verify the SSL certificate of the SAP HANA database. Valid values:</p>
         * <ul>
         * <li>true: The SSL certificate of the SAP HANA database is verified.</li>
         * <li>false: The SSL certificate of the SAP HANA database is not verified.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder validateCertificate(Boolean validateCertificate) {
            this.putQueryParameter("ValidateCertificate", validateCertificate);
            this.validateCertificate = validateCertificate;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0003v4ah******9xp</p>
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
