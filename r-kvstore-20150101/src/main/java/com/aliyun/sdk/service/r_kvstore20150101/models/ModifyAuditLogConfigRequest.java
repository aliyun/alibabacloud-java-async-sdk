// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbAudit")
    private Boolean dbAudit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retention")
    @com.aliyun.core.annotation.Validation(maximum = 365, minimum = 1)
    private Integer retention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private ModifyAuditLogConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbAudit = builder.dbAudit;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.retention = builder.retention;
        this.securityToken = builder.securityToken;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dbAudit
     */
    public Boolean getDbAudit() {
        return this.dbAudit;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyAuditLogConfigRequest, Builder> {
        private String regionId; 
        private Boolean dbAudit; 
        private String instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer retention; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAuditLogConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbAudit = request.dbAudit;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.retention = request.retention;
            this.securityToken = request.securityToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the audit log feature. Default value: true. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the audit log feature.</li>
         * <li><strong>false</strong>: disables the audit log feature.</li>
         * </ul>
         * <blockquote>
         * <p>If the instance uses the <a href="https://help.aliyun.com/document_detail/52228.html">cluster architecture</a> or <a href="https://help.aliyun.com/document_detail/62870.html">read/write splitting architecture</a>, the audit log feature is enabled or disabled for both the data nodes and proxy nodes. You cannot separately enable the audit log feature for the data nodes or proxy nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dbAudit(Boolean dbAudit) {
            this.putQueryParameter("DbAudit", dbAudit);
            this.dbAudit = dbAudit;
            return this;
        }

        /**
         * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/60933.html">DescribeInstances</a> operation to query the ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * <p>The retention period of audit logs. Valid values: <strong>1</strong> to <strong>365</strong>. Unit: days.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only if the <strong>DbAudit</strong> parameter is set to <strong>true</strong>.</li>
         * <li>The value of this parameter takes effect for all ApsaraDB for Redis instances in the current region.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ModifyAuditLogConfigRequest build() {
            return new ModifyAuditLogConfigRequest(this);
        } 

    } 

}
