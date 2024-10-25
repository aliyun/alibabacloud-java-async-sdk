// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyLogBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyLogBackupPolicyRequest</p>
 */
public class ModifyLogBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRegion")
    private String logBackupAnotherRegionRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRetentionPeriod")
    private String logBackupAnotherRegionRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private String logBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyLogBackupPolicyRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.logBackupAnotherRegionRegion = builder.logBackupAnotherRegionRegion;
        this.logBackupAnotherRegionRetentionPeriod = builder.logBackupAnotherRegionRetentionPeriod;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLogBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return logBackupAnotherRegionRegion
     */
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    /**
     * @return logBackupAnotherRegionRetentionPeriod
     */
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
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

    public static final class Builder extends Request.Builder<ModifyLogBackupPolicyRequest, Builder> {
        private String DBClusterId; 
        private String logBackupAnotherRegionRegion; 
        private String logBackupAnotherRegionRetentionPeriod; 
        private String logBackupRetentionPeriod; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLogBackupPolicyRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.logBackupAnotherRegionRegion = request.logBackupAnotherRegionRegion;
            this.logBackupAnotherRegionRetentionPeriod = request.logBackupAnotherRegionRetentionPeriod;
            this.logBackupRetentionPeriod = request.logBackupRetentionPeriod;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the information of all clusters that are deployed in a specific region, such as the cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The region in which you want to store cross-region log backups. For information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder logBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
            this.putQueryParameter("LogBackupAnotherRegionRegion", logBackupAnotherRegionRegion);
            this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
            return this;
        }

        /**
         * <p>The retention period of cross-region log backups. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The cross-region backup feature is disabled.</li>
         * <li><strong>30 to 7300</strong>: Cross-region log backups are retained for 30 to 7,300 days.</li>
         * <li><strong>-1</strong>: The log backups are permanently retained.</li>
         * </ul>
         * <blockquote>
         * <p> When you create a cluster, the default value of this parameter is <strong>0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder logBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
            this.putQueryParameter("LogBackupAnotherRegionRetentionPeriod", logBackupAnotherRegionRetentionPeriod);
            this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
            return this;
        }

        /**
         * <p>The retention period of the log backups. Valid values:</p>
         * <ul>
         * <li>3 to 7300: The log backups are retained for 3 to 7,300 days.</li>
         * <li>-1: The log backups are permanently retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder logBackupRetentionPeriod(String logBackupRetentionPeriod) {
            this.putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
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

        @Override
        public ModifyLogBackupPolicyRequest build() {
            return new ModifyLogBackupPolicyRequest(this);
        } 

    } 

}
