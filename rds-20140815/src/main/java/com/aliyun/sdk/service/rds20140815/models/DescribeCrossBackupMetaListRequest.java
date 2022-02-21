// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossBackupMetaListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCrossBackupMetaListRequest</p>
 */
public class DescribeCrossBackupMetaListRequest extends Request {
    @Query
    @NameInMap("BackupSetId")
    @Validation(required = true)
    private String backupSetId;

    @Query
    @NameInMap("GetDbName")
    private String getDbName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageIndex")
    private String pageIndex;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("Pattern")
    private String pattern;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeCrossBackupMetaListRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.getDbName = builder.getDbName;
        this.ownerId = builder.ownerId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.pattern = builder.pattern;
        this.region = builder.region;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossBackupMetaListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return getDbName
     */
    public String getGetDbName() {
        return this.getDbName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageIndex
     */
    public String getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    public static final class Builder extends Request.Builder<DescribeCrossBackupMetaListRequest, Builder> {
        private String backupSetId; 
        private String getDbName; 
        private Long ownerId; 
        private String pageIndex; 
        private String pageSize; 
        private String pattern; 
        private String region; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCrossBackupMetaListRequest response) {
            super(response);
            this.backupSetId = response.backupSetId;
            this.getDbName = response.getDbName;
            this.ownerId = response.ownerId;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.pattern = response.pattern;
            this.region = response.region;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
            return this;
        }

        /**
         * GetDbName.
         */
        public Builder getDbName(String getDbName) {
            this.putQueryParameter("GetDbName", getDbName);
            this.getDbName = getDbName;
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
         * PageIndex.
         */
        public Builder pageIndex(String pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Pattern.
         */
        public Builder pattern(String pattern) {
            this.putQueryParameter("Pattern", pattern);
            this.pattern = pattern;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
        public DescribeCrossBackupMetaListRequest build() {
            return new DescribeCrossBackupMetaListRequest(this);
        } 

    } 

}
