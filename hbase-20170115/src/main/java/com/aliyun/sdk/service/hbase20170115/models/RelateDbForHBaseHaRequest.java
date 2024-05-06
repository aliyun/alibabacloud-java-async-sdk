// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RelateDbForHBaseHaRequest} extends {@link RequestModel}
 *
 * <p>RelateDbForHBaseHaRequest</p>
 */
public class RelateDbForHBaseHaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActive")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haActive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveClusterKey")
    private String haActiveClusterKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveDBType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haActiveDBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveHbaseFsDir")
    private String haActiveHbaseFsDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveHdfsUri")
    private String haActiveHdfsUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActivePassword")
    private String haActivePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveUser")
    private String haActiveUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaActiveVersion")
    private String haActiveVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaMigrateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haMigrateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandby")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haStandby;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyClusterKey")
    private String haStandbyClusterKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyDBType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haStandbyDBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyHbaseFsDir")
    private String haStandbyHbaseFsDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyHdfsUri")
    private String haStandbyHdfsUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyPassword")
    private String haStandbyPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyUser")
    private String haStandbyUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaStandbyVersion")
    private String haStandbyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaTables")
    private String haTables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsActiveStandard")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isActiveStandard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsStandbyStandard")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isStandbyStandard;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private RelateDbForHBaseHaRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.haActive = builder.haActive;
        this.haActiveClusterKey = builder.haActiveClusterKey;
        this.haActiveDBType = builder.haActiveDBType;
        this.haActiveHbaseFsDir = builder.haActiveHbaseFsDir;
        this.haActiveHdfsUri = builder.haActiveHdfsUri;
        this.haActivePassword = builder.haActivePassword;
        this.haActiveUser = builder.haActiveUser;
        this.haActiveVersion = builder.haActiveVersion;
        this.haMigrateType = builder.haMigrateType;
        this.haStandby = builder.haStandby;
        this.haStandbyClusterKey = builder.haStandbyClusterKey;
        this.haStandbyDBType = builder.haStandbyDBType;
        this.haStandbyHbaseFsDir = builder.haStandbyHbaseFsDir;
        this.haStandbyHdfsUri = builder.haStandbyHdfsUri;
        this.haStandbyPassword = builder.haStandbyPassword;
        this.haStandbyUser = builder.haStandbyUser;
        this.haStandbyVersion = builder.haStandbyVersion;
        this.haTables = builder.haTables;
        this.isActiveStandard = builder.isActiveStandard;
        this.isStandbyStandard = builder.isStandbyStandard;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RelateDbForHBaseHaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return haActive
     */
    public String getHaActive() {
        return this.haActive;
    }

    /**
     * @return haActiveClusterKey
     */
    public String getHaActiveClusterKey() {
        return this.haActiveClusterKey;
    }

    /**
     * @return haActiveDBType
     */
    public String getHaActiveDBType() {
        return this.haActiveDBType;
    }

    /**
     * @return haActiveHbaseFsDir
     */
    public String getHaActiveHbaseFsDir() {
        return this.haActiveHbaseFsDir;
    }

    /**
     * @return haActiveHdfsUri
     */
    public String getHaActiveHdfsUri() {
        return this.haActiveHdfsUri;
    }

    /**
     * @return haActivePassword
     */
    public String getHaActivePassword() {
        return this.haActivePassword;
    }

    /**
     * @return haActiveUser
     */
    public String getHaActiveUser() {
        return this.haActiveUser;
    }

    /**
     * @return haActiveVersion
     */
    public String getHaActiveVersion() {
        return this.haActiveVersion;
    }

    /**
     * @return haMigrateType
     */
    public String getHaMigrateType() {
        return this.haMigrateType;
    }

    /**
     * @return haStandby
     */
    public String getHaStandby() {
        return this.haStandby;
    }

    /**
     * @return haStandbyClusterKey
     */
    public String getHaStandbyClusterKey() {
        return this.haStandbyClusterKey;
    }

    /**
     * @return haStandbyDBType
     */
    public String getHaStandbyDBType() {
        return this.haStandbyDBType;
    }

    /**
     * @return haStandbyHbaseFsDir
     */
    public String getHaStandbyHbaseFsDir() {
        return this.haStandbyHbaseFsDir;
    }

    /**
     * @return haStandbyHdfsUri
     */
    public String getHaStandbyHdfsUri() {
        return this.haStandbyHdfsUri;
    }

    /**
     * @return haStandbyPassword
     */
    public String getHaStandbyPassword() {
        return this.haStandbyPassword;
    }

    /**
     * @return haStandbyUser
     */
    public String getHaStandbyUser() {
        return this.haStandbyUser;
    }

    /**
     * @return haStandbyVersion
     */
    public String getHaStandbyVersion() {
        return this.haStandbyVersion;
    }

    /**
     * @return haTables
     */
    public String getHaTables() {
        return this.haTables;
    }

    /**
     * @return isActiveStandard
     */
    public Boolean getIsActiveStandard() {
        return this.isActiveStandard;
    }

    /**
     * @return isStandbyStandard
     */
    public Boolean getIsStandbyStandard() {
        return this.isStandbyStandard;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<RelateDbForHBaseHaRequest, Builder> {
        private String clusterId; 
        private String haActive; 
        private String haActiveClusterKey; 
        private String haActiveDBType; 
        private String haActiveHbaseFsDir; 
        private String haActiveHdfsUri; 
        private String haActivePassword; 
        private String haActiveUser; 
        private String haActiveVersion; 
        private String haMigrateType; 
        private String haStandby; 
        private String haStandbyClusterKey; 
        private String haStandbyDBType; 
        private String haStandbyHbaseFsDir; 
        private String haStandbyHdfsUri; 
        private String haStandbyPassword; 
        private String haStandbyUser; 
        private String haStandbyVersion; 
        private String haTables; 
        private Boolean isActiveStandard; 
        private Boolean isStandbyStandard; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(RelateDbForHBaseHaRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.haActive = request.haActive;
            this.haActiveClusterKey = request.haActiveClusterKey;
            this.haActiveDBType = request.haActiveDBType;
            this.haActiveHbaseFsDir = request.haActiveHbaseFsDir;
            this.haActiveHdfsUri = request.haActiveHdfsUri;
            this.haActivePassword = request.haActivePassword;
            this.haActiveUser = request.haActiveUser;
            this.haActiveVersion = request.haActiveVersion;
            this.haMigrateType = request.haMigrateType;
            this.haStandby = request.haStandby;
            this.haStandbyClusterKey = request.haStandbyClusterKey;
            this.haStandbyDBType = request.haStandbyDBType;
            this.haStandbyHbaseFsDir = request.haStandbyHbaseFsDir;
            this.haStandbyHdfsUri = request.haStandbyHdfsUri;
            this.haStandbyPassword = request.haStandbyPassword;
            this.haStandbyUser = request.haStandbyUser;
            this.haStandbyVersion = request.haStandbyVersion;
            this.haTables = request.haTables;
            this.isActiveStandard = request.isActiveStandard;
            this.isStandbyStandard = request.isStandbyStandard;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zoneId = request.zoneId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * HaActive.
         */
        public Builder haActive(String haActive) {
            this.putQueryParameter("HaActive", haActive);
            this.haActive = haActive;
            return this;
        }

        /**
         * HaActiveClusterKey.
         */
        public Builder haActiveClusterKey(String haActiveClusterKey) {
            this.putQueryParameter("HaActiveClusterKey", haActiveClusterKey);
            this.haActiveClusterKey = haActiveClusterKey;
            return this;
        }

        /**
         * HaActiveDBType.
         */
        public Builder haActiveDBType(String haActiveDBType) {
            this.putQueryParameter("HaActiveDBType", haActiveDBType);
            this.haActiveDBType = haActiveDBType;
            return this;
        }

        /**
         * HaActiveHbaseFsDir.
         */
        public Builder haActiveHbaseFsDir(String haActiveHbaseFsDir) {
            this.putQueryParameter("HaActiveHbaseFsDir", haActiveHbaseFsDir);
            this.haActiveHbaseFsDir = haActiveHbaseFsDir;
            return this;
        }

        /**
         * HaActiveHdfsUri.
         */
        public Builder haActiveHdfsUri(String haActiveHdfsUri) {
            this.putQueryParameter("HaActiveHdfsUri", haActiveHdfsUri);
            this.haActiveHdfsUri = haActiveHdfsUri;
            return this;
        }

        /**
         * HaActivePassword.
         */
        public Builder haActivePassword(String haActivePassword) {
            this.putQueryParameter("HaActivePassword", haActivePassword);
            this.haActivePassword = haActivePassword;
            return this;
        }

        /**
         * HaActiveUser.
         */
        public Builder haActiveUser(String haActiveUser) {
            this.putQueryParameter("HaActiveUser", haActiveUser);
            this.haActiveUser = haActiveUser;
            return this;
        }

        /**
         * HaActiveVersion.
         */
        public Builder haActiveVersion(String haActiveVersion) {
            this.putQueryParameter("HaActiveVersion", haActiveVersion);
            this.haActiveVersion = haActiveVersion;
            return this;
        }

        /**
         * HaMigrateType.
         */
        public Builder haMigrateType(String haMigrateType) {
            this.putQueryParameter("HaMigrateType", haMigrateType);
            this.haMigrateType = haMigrateType;
            return this;
        }

        /**
         * HaStandby.
         */
        public Builder haStandby(String haStandby) {
            this.putQueryParameter("HaStandby", haStandby);
            this.haStandby = haStandby;
            return this;
        }

        /**
         * HaStandbyClusterKey.
         */
        public Builder haStandbyClusterKey(String haStandbyClusterKey) {
            this.putQueryParameter("HaStandbyClusterKey", haStandbyClusterKey);
            this.haStandbyClusterKey = haStandbyClusterKey;
            return this;
        }

        /**
         * HaStandbyDBType.
         */
        public Builder haStandbyDBType(String haStandbyDBType) {
            this.putQueryParameter("HaStandbyDBType", haStandbyDBType);
            this.haStandbyDBType = haStandbyDBType;
            return this;
        }

        /**
         * HaStandbyHbaseFsDir.
         */
        public Builder haStandbyHbaseFsDir(String haStandbyHbaseFsDir) {
            this.putQueryParameter("HaStandbyHbaseFsDir", haStandbyHbaseFsDir);
            this.haStandbyHbaseFsDir = haStandbyHbaseFsDir;
            return this;
        }

        /**
         * HaStandbyHdfsUri.
         */
        public Builder haStandbyHdfsUri(String haStandbyHdfsUri) {
            this.putQueryParameter("HaStandbyHdfsUri", haStandbyHdfsUri);
            this.haStandbyHdfsUri = haStandbyHdfsUri;
            return this;
        }

        /**
         * HaStandbyPassword.
         */
        public Builder haStandbyPassword(String haStandbyPassword) {
            this.putQueryParameter("HaStandbyPassword", haStandbyPassword);
            this.haStandbyPassword = haStandbyPassword;
            return this;
        }

        /**
         * HaStandbyUser.
         */
        public Builder haStandbyUser(String haStandbyUser) {
            this.putQueryParameter("HaStandbyUser", haStandbyUser);
            this.haStandbyUser = haStandbyUser;
            return this;
        }

        /**
         * HaStandbyVersion.
         */
        public Builder haStandbyVersion(String haStandbyVersion) {
            this.putQueryParameter("HaStandbyVersion", haStandbyVersion);
            this.haStandbyVersion = haStandbyVersion;
            return this;
        }

        /**
         * HaTables.
         */
        public Builder haTables(String haTables) {
            this.putQueryParameter("HaTables", haTables);
            this.haTables = haTables;
            return this;
        }

        /**
         * IsActiveStandard.
         */
        public Builder isActiveStandard(Boolean isActiveStandard) {
            this.putQueryParameter("IsActiveStandard", isActiveStandard);
            this.isActiveStandard = isActiveStandard;
            return this;
        }

        /**
         * IsStandbyStandard.
         */
        public Builder isStandbyStandard(Boolean isStandbyStandard) {
            this.putQueryParameter("IsStandbyStandard", isStandbyStandard);
            this.isStandbyStandard = isStandbyStandard;
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
         * RegionId.
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

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public RelateDbForHBaseHaRequest build() {
            return new RelateDbForHBaseHaRequest(this);
        } 

    } 

}
