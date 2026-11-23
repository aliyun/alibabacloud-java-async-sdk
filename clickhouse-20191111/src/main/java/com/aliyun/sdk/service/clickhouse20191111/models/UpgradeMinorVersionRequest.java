// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link UpgradeMinorVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeMinorVersionRequest</p>
 */
public class UpgradeMinorVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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
    @com.aliyun.core.annotation.NameInMap("UpgradeImmediately")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean upgradeImmediately;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeTime")
    private String upgradeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeVersion")
    private String upgradeVersion;

    private UpgradeMinorVersionRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.upgradeImmediately = builder.upgradeImmediately;
        this.upgradeTime = builder.upgradeTime;
        this.upgradeVersion = builder.upgradeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMinorVersionRequest create() {
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
     * @return upgradeImmediately
     */
    public Boolean getUpgradeImmediately() {
        return this.upgradeImmediately;
    }

    /**
     * @return upgradeTime
     */
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

    /**
     * @return upgradeVersion
     */
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeMinorVersionRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean upgradeImmediately; 
        private String upgradeTime; 
        private String upgradeVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeMinorVersionRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.upgradeImmediately = request.upgradeImmediately;
            this.upgradeTime = request.upgradeTime;
            this.upgradeVersion = request.upgradeVersion;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * <p>Specifies whether to upgrade the minor engine version immediately. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Upgrades the minor engine version immediately.</p>
         * </li>
         * <li><p><strong>false</strong>: Upgrades the minor engine version at a specified time or during the maintenance window.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify a time to upgrade the minor engine version, <strong>UpgradeTime</strong> is required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder upgradeImmediately(Boolean upgradeImmediately) {
            this.putQueryParameter("UpgradeImmediately", upgradeImmediately);
            this.upgradeImmediately = upgradeImmediately;
            return this;
        }

        /**
         * <p>The specified upgrade time. Format: yyyy-MM-ddTHH:mmZ (UTC time).</p>
         * <blockquote>
         * <p>If this parameter is left empty, the ApsaraDB for ClickHouse cluster performs a minor kernel version upgrade during the maintenance window.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-08-07T16:38Z</p>
         */
        public Builder upgradeTime(String upgradeTime) {
            this.putQueryParameter("UpgradeTime", upgradeTime);
            this.upgradeTime = upgradeTime;
            return this;
        }

        /**
         * <p>The target minor engine version.</p>
         * <blockquote>
         * <p>By default, this parameter is left empty, and the minor engine version is upgraded to the latest version.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.37.0</p>
         */
        public Builder upgradeVersion(String upgradeVersion) {
            this.putQueryParameter("UpgradeVersion", upgradeVersion);
            this.upgradeVersion = upgradeVersion;
            return this;
        }

        @Override
        public UpgradeMinorVersionRequest build() {
            return new UpgradeMinorVersionRequest(this);
        } 

    } 

}
