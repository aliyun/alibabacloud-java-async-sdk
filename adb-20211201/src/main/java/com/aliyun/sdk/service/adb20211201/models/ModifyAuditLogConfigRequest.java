// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ModifyAuditLogConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAuditLogConfigRequest</p>
 */
public class ModifyAuditLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditLogStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auditLogStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyAuditLogConfigRequest(Builder builder) {
        super(builder);
        this.auditLogStatus = builder.auditLogStatus;
        this.DBClusterId = builder.DBClusterId;
        this.engineType = builder.engineType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAuditLogConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditLogStatus
     */
    public String getAuditLogStatus() {
        return this.auditLogStatus;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ModifyAuditLogConfigRequest, Builder> {
        private String auditLogStatus; 
        private String DBClusterId; 
        private String engineType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAuditLogConfigRequest request) {
            super(request);
            this.auditLogStatus = request.auditLogStatus;
            this.DBClusterId = request.DBClusterId;
            this.engineType = request.engineType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The status of SQL audit logging. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enables SQL audit logging.</li>
         * <li><strong>off</strong>: Disables SQL audit logging.</li>
         * </ul>
         * <blockquote>
         * <p>After SQL audit logging is disabled, all SQL audit logs are deleted. Query and export the SQL audit logs before disabling SQL audit logging. For more information, see <a href="https://help.aliyun.com/document_detail/612426.html">DescribeAuditLogRecords</a>. When SQL audit logging is enabled again, audit logs are displayed starting from the most recent time that audit logging was enabled.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder auditLogStatus(String auditLogStatus) {
            this.putQueryParameter("AuditLogStatus", auditLogStatus);
            this.auditLogStatus = auditLogStatus;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
         * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> to query the IDs of all clusters in a specified region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-t4nj8619bz2w3****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The type of the compute engine. Valid values:</p>
         * <ul>
         * <li>XIHE (<strong>default</strong>): Xihe compute engine.</li>
         * <li>SPARK: Spark compute engine.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XIHE</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
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
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> to query the region ID of a specified cluster.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ModifyAuditLogConfigRequest build() {
            return new ModifyAuditLogConfigRequest(this);
        } 

    } 

}
