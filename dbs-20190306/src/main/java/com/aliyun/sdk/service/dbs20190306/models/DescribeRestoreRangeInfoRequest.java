// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreRangeInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreRangeInfoRequest</p>
 */
public class DescribeRestoreRangeInfoRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("BeginTimestampForRestore")
    @Validation(required = true)
    private Long beginTimestampForRestore;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndTimestampForRestore")
    @Validation(required = true)
    private Long endTimestampForRestore;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("RecentlyRestore")
    private Boolean recentlyRestore;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeRestoreRangeInfoRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.beginTimestampForRestore = builder.beginTimestampForRestore;
        this.clientToken = builder.clientToken;
        this.endTimestampForRestore = builder.endTimestampForRestore;
        this.ownerId = builder.ownerId;
        this.recentlyRestore = builder.recentlyRestore;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreRangeInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return beginTimestampForRestore
     */
    public Long getBeginTimestampForRestore() {
        return this.beginTimestampForRestore;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTimestampForRestore
     */
    public Long getEndTimestampForRestore() {
        return this.endTimestampForRestore;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recentlyRestore
     */
    public Boolean getRecentlyRestore() {
        return this.recentlyRestore;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeRestoreRangeInfoRequest, Builder> {
        private String backupPlanId; 
        private Long beginTimestampForRestore; 
        private String clientToken; 
        private Long endTimestampForRestore; 
        private String ownerId; 
        private Boolean recentlyRestore; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreRangeInfoRequest request) {
            super(request);
            this.backupPlanId = request.backupPlanId;
            this.beginTimestampForRestore = request.beginTimestampForRestore;
            this.clientToken = request.clientToken;
            this.endTimestampForRestore = request.endTimestampForRestore;
            this.ownerId = request.ownerId;
            this.recentlyRestore = request.recentlyRestore;
            this.regionId = request.regionId;
        } 

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * BeginTimestampForRestore.
         */
        public Builder beginTimestampForRestore(Long beginTimestampForRestore) {
            this.putQueryParameter("BeginTimestampForRestore", beginTimestampForRestore);
            this.beginTimestampForRestore = beginTimestampForRestore;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EndTimestampForRestore.
         */
        public Builder endTimestampForRestore(Long endTimestampForRestore) {
            this.putQueryParameter("EndTimestampForRestore", endTimestampForRestore);
            this.endTimestampForRestore = endTimestampForRestore;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RecentlyRestore.
         */
        public Builder recentlyRestore(Boolean recentlyRestore) {
            this.putQueryParameter("RecentlyRestore", recentlyRestore);
            this.recentlyRestore = recentlyRestore;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeRestoreRangeInfoRequest build() {
            return new DescribeRestoreRangeInfoRequest(this);
        } 

    } 

}
