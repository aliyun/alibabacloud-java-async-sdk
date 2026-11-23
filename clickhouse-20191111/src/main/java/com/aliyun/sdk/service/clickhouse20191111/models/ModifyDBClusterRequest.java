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
 * {@link ModifyDBClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterRequest</p>
 */
public class ModifyDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeGroupCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNodeGroupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeStorage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNodeStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbNodeStorageType")
    private String dbNodeStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableWriteWindows")
    private String disableWriteWindows;

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

    private ModifyDBClusterRequest(Builder builder) {
        super(builder);
        this.DBClusterClass = builder.DBClusterClass;
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeGroupCount = builder.DBNodeGroupCount;
        this.DBNodeStorage = builder.DBNodeStorage;
        this.dbNodeStorageType = builder.dbNodeStorageType;
        this.disableWriteWindows = builder.disableWriteWindows;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterClass
     */
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeGroupCount
     */
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    /**
     * @return DBNodeStorage
     */
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    /**
     * @return dbNodeStorageType
     */
    public String getDbNodeStorageType() {
        return this.dbNodeStorageType;
    }

    /**
     * @return disableWriteWindows
     */
    public String getDisableWriteWindows() {
        return this.disableWriteWindows;
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

    public static final class Builder extends Request.Builder<ModifyDBClusterRequest, Builder> {
        private String DBClusterClass; 
        private String DBClusterId; 
        private String DBNodeGroupCount; 
        private String DBNodeStorage; 
        private String dbNodeStorageType; 
        private String disableWriteWindows; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterRequest request) {
            super(request);
            this.DBClusterClass = request.DBClusterClass;
            this.DBClusterId = request.DBClusterId;
            this.DBNodeGroupCount = request.DBNodeGroupCount;
            this.DBNodeStorage = request.DBNodeStorage;
            this.dbNodeStorageType = request.dbNodeStorageType;
            this.disableWriteWindows = request.disableWriteWindows;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The cluster specifications.</p>
         * <ul>
         * <li><p>For single-replica editions, valid values are:</p>
         * <ul>
         * <li><p><strong>S8</strong></p>
         * </li>
         * <li><p><strong>S16</strong></p>
         * </li>
         * <li><p><strong>S32</strong></p>
         * </li>
         * <li><p><strong>S64</strong></p>
         * </li>
         * <li><p><strong>S104</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>For dual-replica editions, valid values are:</p>
         * <ul>
         * <li><p><strong>C8</strong></p>
         * </li>
         * <li><p><strong>C16</strong></p>
         * </li>
         * <li><p><strong>C32</strong></p>
         * </li>
         * <li><p><strong>C64</strong></p>
         * </li>
         * <li><p><strong>C104</strong></p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>S8</p>
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.putQueryParameter("DBClusterClass", DBClusterClass);
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp19lo45sy98x****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The number of nodes.</p>
         * <ul>
         * <li><p>For single-replica editions, the valid values are integers from 1 to 48.</p>
         * </li>
         * <li><p>For dual-replica editions, the valid values are integers from 1 to 24.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DBNodeGroupCount(String DBNodeGroupCount) {
            this.putQueryParameter("DBNodeGroupCount", DBNodeGroupCount);
            this.DBNodeGroupCount = DBNodeGroupCount;
            return this;
        }

        /**
         * <p>The storage space of a single node. Unit: GB.</p>
         * <p>Valid values: 100 to 32000.</p>
         * <blockquote>
         * <p>The step size is 100 GB.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder DBNodeStorage(String DBNodeStorage) {
            this.putQueryParameter("DBNodeStorage", DBNodeStorage);
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }

        /**
         * <p>The storage class. Valid values:</p>
         * <ul>
         * <li><p><strong>CloudESSD</strong>: ESSD PL1 disk.</p>
         * </li>
         * <li><p><strong>CloudESSD_PL2</strong>: ESSD PL2 disk.</p>
         * </li>
         * <li><p><strong>CloudESSD_PL3</strong>: ESSD PL3 disk.</p>
         * </li>
         * <li><p><strong>CloudEfficiency</strong>: ultra disk.</p>
         * </li>
         * <li><p><strong>CloudSSD</strong>: standard SSD.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudESSD</p>
         */
        public Builder dbNodeStorageType(String dbNodeStorageType) {
            this.putQueryParameter("DbNodeStorageType", dbNodeStorageType);
            this.dbNodeStorageType = dbNodeStorageType;
            return this;
        }

        /**
         * <p>The write-inaccessible window. Separate the start time and the end time with a comma. Use the ISO 8601 format for the time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-09T20:00:00+08:00,2024-07-09T21:00:00+08:00</p>
         */
        public Builder disableWriteWindows(String disableWriteWindows) {
            this.putQueryParameter("DisableWriteWindows", disableWriteWindows);
            this.disableWriteWindows = disableWriteWindows;
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the region ID.</p>
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
        public ModifyDBClusterRequest build() {
            return new ModifyDBClusterRequest(this);
        } 

    } 

}
