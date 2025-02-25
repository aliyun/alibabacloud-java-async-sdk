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
 * {@link CreateHanaInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateHanaInstanceRequest</p>
 */
public class CreateHanaInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertSetting")
    private String alertSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HanaName")
    private String hanaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNumber")
    private Integer instanceNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sid")
    private String sid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseSsl")
    private Boolean useSsl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidateCertificate")
    private Boolean validateCertificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vaultId;

    private CreateHanaInstanceRequest(Builder builder) {
        super(builder);
        this.alertSetting = builder.alertSetting;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
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
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
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
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
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
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
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
         * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>hbrcrossrole</p>
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>SELF_ACCOUNT</strong>: Data is backed up within the same Alibaba Cloud account.</li>
         * <li><strong>CROSS_ACCOUNT</strong>: Data is backed up across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>158975xxxxx4625</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * <p>The IDs of the ECS instances that host the SAP HANA instance to be registered. Cloud Backup installs backup clients on the specified ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-uf6ir9y******hvisj&quot;]</p>
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * <p>The name of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>HANA-DEV</p>
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
         * <p>rg-acfm4ebtpkzx7zy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The security identifier (SID) of the SAP HANA database. For more information, see <a href="https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?spm=a2c4g.11186623.0.0.55c34b4ftZeXNK">How to find sid user and instance number of HANA db?</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>HXE</p>
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * <p>Specifies whether to connect with the SAP HANA database over Secure Sockets Layer (SSL).</p>
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
         * <p>Specifies whether to verify the SSL certificate of the SAP HANA database.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0003v4a******gfv2</p>
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
