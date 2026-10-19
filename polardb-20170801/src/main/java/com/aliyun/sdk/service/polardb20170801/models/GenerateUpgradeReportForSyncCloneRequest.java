// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link GenerateUpgradeReportForSyncCloneRequest} extends {@link RequestModel}
 *
 * <p>GenerateUpgradeReportForSyncCloneRequest</p>
 */
public class GenerateUpgradeReportForSyncCloneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationCategory")
    private String creationCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationOption")
    private String creationOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reserve")
    private String reserve;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBClusterId")
    private String sourceDBClusterId;

    private GenerateUpgradeReportForSyncCloneRequest(Builder builder) {
        super(builder);
        this.creationCategory = builder.creationCategory;
        this.creationOption = builder.creationOption;
        this.DBName = builder.DBName;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.reserve = builder.reserve;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceDBClusterId = builder.sourceDBClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUpgradeReportForSyncCloneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationCategory
     */
    public String getCreationCategory() {
        return this.creationCategory;
    }

    /**
     * @return creationOption
     */
    public String getCreationOption() {
        return this.creationOption;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
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
     * @return reserve
     */
    public String getReserve() {
        return this.reserve;
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
     * @return sourceDBClusterId
     */
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

    public static final class Builder extends Request.Builder<GenerateUpgradeReportForSyncCloneRequest, Builder> {
        private String creationCategory; 
        private String creationOption; 
        private String DBName; 
        private String DBType; 
        private String DBVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String reserve; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceDBClusterId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUpgradeReportForSyncCloneRequest request) {
            super(request);
            this.creationCategory = request.creationCategory;
            this.creationOption = request.creationOption;
            this.DBName = request.DBName;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.reserve = request.reserve;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceDBClusterId = request.sourceDBClusterId;
        } 

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Cluster Edition (default)</li>
         * <li><strong>SENormal</strong>: Standard Edition</li>
         * </ul>
         * <p>For more information about cluster editions, see <a href="https://help.aliyun.com/document_detail/183258.html">Product editions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder creationCategory(String creationCategory) {
            this.putQueryParameter("CreationCategory", creationCategory);
            this.creationCategory = creationCategory;
            return this;
        }

        /**
         * <p>The creation pattern. Valid values: </p>
         * <ul>
         * <li><p><strong>MigrationFromRDS</strong>: migrates data from an existing ApsaraDB RDS instance to a new PolarDB cluster. The created PolarDB cluster is in read-only mode and has binary logging enabled by default. For more information about the console operation, see <a href="https://help.aliyun.com/document_detail/121582.html">Upgrade an ApsaraDB RDS for MySQL instance to a PolarDB for MySQL cluster</a>.</p>
         * </li>
         * <li><p><strong>UpgradeFromPolarDB</strong>: performs instance migration from PolarDB. For more information about the console operation, see <a href="https://help.aliyun.com/document_detail/459712.html">Major engine version upgrade</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MigrationFromRDS</p>
         */
        public Builder creationOption(String creationOption) {
            this.putQueryParameter("CreationOption", creationOption);
            this.creationOption = creationOption;
            return this;
        }

        /**
         * <p>The name of the database. You can specify only one database name.</p>
         * <blockquote>
         * <p>Only PolarDB for PostgreSQL (Compatible with Oracle) clusters support this parameter.</p>
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
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostgreSQL</p>
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The version number of the destination database DPI engine.</p>
         * <ul>
         * <li>Valid values for MySQL: <ul>
         * <li><strong>5.6</strong></li>
         * <li><strong>5.7</strong></li>
         * <li><strong>8.0</strong></li>
         * </ul>
         * </li>
         * <li>Valid value for Oracle: <strong>14</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
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
         * <p>The reserved parameter. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;targetTableMode\&quot;:2}</p>
         */
        public Builder reserve(String reserve) {
            this.putQueryParameter("Reserve", reserve);
            this.reserve = reserve;
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
         * <p>The source instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-k2j96w169uhu868l8</p>
         */
        public Builder sourceDBClusterId(String sourceDBClusterId) {
            this.putQueryParameter("SourceDBClusterId", sourceDBClusterId);
            this.sourceDBClusterId = sourceDBClusterId;
            return this;
        }

        @Override
        public GenerateUpgradeReportForSyncCloneRequest build() {
            return new GenerateUpgradeReportForSyncCloneRequest(this);
        } 

    } 

}
