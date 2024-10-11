// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRDSToClickhouseDbRequest} extends {@link RequestModel}
 *
 * <p>CreateRDSToClickhouseDbRequest</p>
 */
public class CreateRDSToClickhouseDbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CkPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ckPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CkUserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ckUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClickhousePort")
    private Long clickhousePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitUpper")
    private Long limitUpper;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rdsPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsPort")
    private Long rdsPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsUserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rdsUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsVpcId")
    private String rdsVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsVpcUrl")
    private String rdsVpcUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipUnsupported")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean skipUnsupported;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynDbTables")
    @com.aliyun.core.annotation.Validation(required = true)
    private String synDbTables;

    private CreateRDSToClickhouseDbRequest(Builder builder) {
        super(builder);
        this.ckPassword = builder.ckPassword;
        this.ckUserName = builder.ckUserName;
        this.clickhousePort = builder.clickhousePort;
        this.dbClusterId = builder.dbClusterId;
        this.limitUpper = builder.limitUpper;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.rdsId = builder.rdsId;
        this.rdsPassword = builder.rdsPassword;
        this.rdsPort = builder.rdsPort;
        this.rdsUserName = builder.rdsUserName;
        this.rdsVpcId = builder.rdsVpcId;
        this.rdsVpcUrl = builder.rdsVpcUrl;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.skipUnsupported = builder.skipUnsupported;
        this.synDbTables = builder.synDbTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRDSToClickhouseDbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ckPassword
     */
    public String getCkPassword() {
        return this.ckPassword;
    }

    /**
     * @return ckUserName
     */
    public String getCkUserName() {
        return this.ckUserName;
    }

    /**
     * @return clickhousePort
     */
    public Long getClickhousePort() {
        return this.clickhousePort;
    }

    /**
     * @return dbClusterId
     */
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    /**
     * @return limitUpper
     */
    public Long getLimitUpper() {
        return this.limitUpper;
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
     * @return rdsId
     */
    public String getRdsId() {
        return this.rdsId;
    }

    /**
     * @return rdsPassword
     */
    public String getRdsPassword() {
        return this.rdsPassword;
    }

    /**
     * @return rdsPort
     */
    public Long getRdsPort() {
        return this.rdsPort;
    }

    /**
     * @return rdsUserName
     */
    public String getRdsUserName() {
        return this.rdsUserName;
    }

    /**
     * @return rdsVpcId
     */
    public String getRdsVpcId() {
        return this.rdsVpcId;
    }

    /**
     * @return rdsVpcUrl
     */
    public String getRdsVpcUrl() {
        return this.rdsVpcUrl;
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
     * @return skipUnsupported
     */
    public Boolean getSkipUnsupported() {
        return this.skipUnsupported;
    }

    /**
     * @return synDbTables
     */
    public String getSynDbTables() {
        return this.synDbTables;
    }

    public static final class Builder extends Request.Builder<CreateRDSToClickhouseDbRequest, Builder> {
        private String ckPassword; 
        private String ckUserName; 
        private Long clickhousePort; 
        private String dbClusterId; 
        private Long limitUpper; 
        private String ownerAccount; 
        private Long ownerId; 
        private String rdsId; 
        private String rdsPassword; 
        private Long rdsPort; 
        private String rdsUserName; 
        private String rdsVpcId; 
        private String rdsVpcUrl; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean skipUnsupported; 
        private String synDbTables; 

        private Builder() {
            super();
        } 

        private Builder(CreateRDSToClickhouseDbRequest request) {
            super(request);
            this.ckPassword = request.ckPassword;
            this.ckUserName = request.ckUserName;
            this.clickhousePort = request.clickhousePort;
            this.dbClusterId = request.dbClusterId;
            this.limitUpper = request.limitUpper;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.rdsId = request.rdsId;
            this.rdsPassword = request.rdsPassword;
            this.rdsPort = request.rdsPort;
            this.rdsUserName = request.rdsUserName;
            this.rdsVpcId = request.rdsVpcId;
            this.rdsVpcUrl = request.rdsVpcUrl;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.skipUnsupported = request.skipUnsupported;
            this.synDbTables = request.synDbTables;
        } 

        /**
         * <p>The password of the account that is used to log on to the database in the ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456Aa</p>
         */
        public Builder ckPassword(String ckPassword) {
            this.putQueryParameter("CkPassword", ckPassword);
            this.ckPassword = ckPassword;
            return this;
        }

        /**
         * <p>The account that is used to log on to the database in the ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder ckUserName(String ckUserName) {
            this.putQueryParameter("CkUserName", ckUserName);
            this.ckUserName = ckUserName;
            return this;
        }

        /**
         * <p>The port number of the ApsaraDB for ClickHouse cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8123</p>
         */
        public Builder clickhousePort(Long clickhousePort) {
            this.putQueryParameter("ClickhousePort", clickhousePort);
            this.clickhousePort = clickhousePort;
            return this;
        }

        /**
         * <p>The ID of the ApsaraDB for ClickHouse cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-2ze5zeyl72188****</p>
         */
        public Builder dbClusterId(String dbClusterId) {
            this.putQueryParameter("DbClusterId", dbClusterId);
            this.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * <p>The maximum number of rows that can be synchronized per second.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        public Builder limitUpper(Long limitUpper) {
            this.putQueryParameter("LimitUpper", limitUpper);
            this.limitUpper = limitUpper;
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
         * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-8vb989qj9roh0****</p>
         */
        public Builder rdsId(String rdsId) {
            this.putQueryParameter("RdsId", rdsId);
            this.rdsId = rdsId;
            return this;
        }

        /**
         * <p>The password of the account that is used to log on to the ApsaraDB RDS for MySQL instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456Rr</p>
         */
        public Builder rdsPassword(String rdsPassword) {
            this.putQueryParameter("RdsPassword", rdsPassword);
            this.rdsPassword = rdsPassword;
            return this;
        }

        /**
         * <p>The port number of the ApsaraDB RDS for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder rdsPort(Long rdsPort) {
            this.putQueryParameter("RdsPort", rdsPort);
            this.rdsPort = rdsPort;
            return this;
        }

        /**
         * <p>The account that is used to log on to the database in the ApsaraDB RDS for MySQL instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user2</p>
         */
        public Builder rdsUserName(String rdsUserName) {
            this.putQueryParameter("RdsUserName", rdsUserName);
            this.rdsUserName = rdsUserName;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the ApsaraDB RDS for MySQL instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zen93xryil99jsfy****</p>
         */
        public Builder rdsVpcId(String rdsVpcId) {
            this.putQueryParameter("RdsVpcId", rdsVpcId);
            this.rdsVpcId = rdsVpcId;
            return this;
        }

        /**
         * <p>The private endpoint of the ApsaraDB RDS for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp16t9h3999xb0a7****.mysql.rds.aliyuncs.com</p>
         */
        public Builder rdsVpcUrl(String rdsVpcUrl) {
            this.putQueryParameter("RdsVpcUrl", rdsVpcUrl);
            this.rdsVpcUrl = rdsVpcUrl;
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
         * <p>Specifies whether to ignore the table schemas that do not support synchronization. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder skipUnsupported(Boolean skipUnsupported) {
            this.putQueryParameter("SkipUnsupported", skipUnsupported);
            this.skipUnsupported = skipUnsupported;
            return this;
        }

        /**
         * <p>The tables whose data you want to synchronize.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Schema&quot;:&quot;recommend&quot;,&quot;Tables&quot;:[&quot;mr_platform_cpm&quot;,&quot;mr_platform_ecpm&quot;,&quot;p_monitor_record&quot;]}]</p>
         */
        public Builder synDbTables(String synDbTables) {
            this.putQueryParameter("SynDbTables", synDbTables);
            this.synDbTables = synDbTables;
            return this;
        }

        @Override
        public CreateRDSToClickhouseDbRequest build() {
            return new CreateRDSToClickhouseDbRequest(this);
        } 

    } 

}
