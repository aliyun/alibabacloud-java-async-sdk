// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyDBInstanceTDERequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceTDERequest</p>
 */
public class ModifyDBInstanceTDERequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRotate")
    private Boolean isRotate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PassWord")
    private String passWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TDEStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String TDEStatus;

    private ModifyDBInstanceTDERequest(Builder builder) {
        super(builder);
        this.certificate = builder.certificate;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.encryptionKey = builder.encryptionKey;
        this.isRotate = builder.isRotate;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.passWord = builder.passWord;
        this.privateKey = builder.privateKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleArn = builder.roleArn;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceTDERequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return isRotate
     */
    public Boolean getIsRotate() {
        return this.isRotate;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return passWord
     */
    public String getPassWord() {
        return this.passWord;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceTDERequest, Builder> {
        private String certificate; 
        private String DBInstanceId; 
        private String DBName; 
        private String encryptionKey; 
        private Boolean isRotate; 
        private String ownerAccount; 
        private Long ownerId; 
        private String passWord; 
        private String privateKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleArn; 
        private String TDEStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceTDERequest request) {
            super(request);
            this.certificate = request.certificate;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.encryptionKey = request.encryptionKey;
            this.isRotate = request.isRotate;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.passWord = request.passWord;
            this.privateKey = request.privateKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleArn = request.roleArn;
            this.TDEStatus = request.TDEStatus;
        } 

        /**
         * <p>The file that contains the certificate.<br>Format:</p>
         * <ul>
         * <li>Public endpoint: <code>oss-&lt;The ID of the region&gt;.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the certificate file&gt;</code> (The file name contains the extension.)</li>
         * <li>Internal endpoint: <code>oss-&lt;The ID of the region&gt;-internal.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the certificate file&gt;</code> (The file name contains the extension.)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss-ap-southeast-1.aliyuncs.com:****:key.cer</p>
         */
        public Builder certificate(String certificate) {
            this.putQueryParameter("Certificate", certificate);
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database for which you want to enable TDE. You can specify up to 50 database names in a single request. If you specify multiple database names, separate the database names with commas (,).</p>
         * <blockquote>
         * <p>This parameter is available and must be specified only when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The ID of the custom key.</p>
         * <blockquote>
         * <p>This parameter is available when the instance runs MySQL or PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>Specifies whether to replace the key. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available for only ApsaraDB RDS for PostgreSQL instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isRotate(Boolean isRotate) {
            this.putQueryParameter("IsRotate", isRotate);
            this.isRotate = isRotate;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The password of the certificate.</p>
         * <blockquote>
         * <p>This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1qaz@WSX</p>
         */
        public Builder passWord(String passWord) {
            this.putQueryParameter("PassWord", passWord);
            this.passWord = passWord;
            return this;
        }

        /**
         * <p>The file that contains the private key of the certificate.<br>Format:</p>
         * <ul>
         * <li>Public endpoint: <code>oss-&lt;The ID of the region&gt;.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the file that contains the private key&gt;</code> (The file name contains the extension.)</li>
         * <li>Internal endpoint: <code>oss-&lt;The ID of the region&gt;-internal.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the file that contains the private key&gt;</code> (The file name contains the extension.)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is available when the instance runs SQL Server 2019 SE or an Enterprise Edition of SQL Server.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss-ap-southeast-1.aliyuncs.com:****:key.pvk</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role. A RAM role is a virtual identity that you can create within your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/93689.html">RAM role overview</a>.</p>
         * <blockquote>
         * <p>This parameter is available when the instance runs MySQL or PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1406926****:role/aliyunrdsinstanceencryptiondefaultrole</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The status of TDE. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder TDEStatus(String TDEStatus) {
            this.putQueryParameter("TDEStatus", TDEStatus);
            this.TDEStatus = TDEStatus;
            return this;
        }

        @Override
        public ModifyDBInstanceTDERequest build() {
            return new ModifyDBInstanceTDERequest(this);
        } 

    } 

}
