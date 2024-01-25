// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHanaInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateHanaInstanceRequest</p>
 */
public class CreateHanaInstanceRequest extends Request {
    @Query
    @NameInMap("AlertSetting")
    private String alertSetting;

    @Query
    @NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    @Query
    @NameInMap("HanaName")
    private String hanaName;

    @Query
    @NameInMap("Host")
    private String host;

    @Query
    @NameInMap("InstanceNumber")
    private Integer instanceNumber;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Sid")
    private String sid;

    @Query
    @NameInMap("UseSsl")
    private Boolean useSsl;

    @Query
    @NameInMap("UserName")
    private String userName;

    @Query
    @NameInMap("ValidateCertificate")
    private Boolean validateCertificate;

    @Query
    @NameInMap("VaultId")
    @Validation(required = true)
    private String vaultId;

    private CreateHanaInstanceRequest(Builder builder) {
        super(builder);
        this.alertSetting = builder.alertSetting;
        this.ecsInstanceId = builder.ecsInstanceId;
        this.hanaName = builder.hanaName;
        this.host = builder.host;
        this.instanceNumber = builder.instanceNumber;
        this.password = builder.password;
        this.resourceGroupId = builder.resourceGroupId;
        this.sid = builder.sid;
        this.useSsl = builder.useSsl;
        this.userName = builder.userName;
        this.validateCertificate = builder.validateCertificate;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHanaInstanceRequest create() {
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
     * @return ecsInstanceId
     */
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
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
     * @return sid
     */
    public String getSid() {
        return this.sid;
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

    public static final class Builder extends Request.Builder<CreateHanaInstanceRequest, Builder> {
        private String alertSetting; 
        private String ecsInstanceId; 
        private String hanaName; 
        private String host; 
        private Integer instanceNumber; 
        private String password; 
        private String resourceGroupId; 
        private String sid; 
        private Boolean useSsl; 
        private String userName; 
        private Boolean validateCertificate; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHanaInstanceRequest request) {
            super(request);
            this.alertSetting = request.alertSetting;
            this.ecsInstanceId = request.ecsInstanceId;
            this.hanaName = request.hanaName;
            this.host = request.host;
            this.instanceNumber = request.instanceNumber;
            this.password = request.password;
            this.resourceGroupId = request.resourceGroupId;
            this.sid = request.sid;
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
         * The IDs of ECS instances that host the SAP HANA instance to be registered. HBR installs backup clients on the specified ECS instances.
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
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
         * The security identifier (SID) of the SAP HANA database.
         * <p>
         * 
         * For more information, see [How to find sid user and instance number of HANA db?](https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?spm=a2c4g.11186623.0.0.55c34b4ftZeXNK)
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL).
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
         * Specifies whether to verify the SSL certificate of the SAP HANA database.
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
        public CreateHanaInstanceRequest build() {
            return new CreateHanaInstanceRequest(this);
        } 

    } 

}
