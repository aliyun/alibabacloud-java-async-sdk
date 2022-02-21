// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanListRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupPlanListRequest</p>
 */
public class DescribeBackupPlanListRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    private String backupPlanId;

    @Query
    @NameInMap("BackupPlanName")
    private String backupPlanName;

    @Query
    @NameInMap("BackupPlanStatus")
    private String backupPlanStatus;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Region")
    private String region;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeBackupPlanListRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.backupPlanName = builder.backupPlanName;
        this.backupPlanStatus = builder.backupPlanStatus;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPlanListRequest create() {
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
     * @return backupPlanName
     */
    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    /**
     * @return backupPlanStatus
     */
    public String getBackupPlanStatus() {
        return this.backupPlanStatus;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeBackupPlanListRequest, Builder> {
        private String backupPlanId; 
        private String backupPlanName; 
        private String backupPlanStatus; 
        private String clientToken; 
        private String ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String region; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupPlanListRequest response) {
            super(response);
            this.backupPlanId = response.backupPlanId;
            this.backupPlanName = response.backupPlanName;
            this.backupPlanStatus = response.backupPlanStatus;
            this.clientToken = response.clientToken;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.region = response.region;
            this.regionId = response.regionId;
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
         * BackupPlanName.
         */
        public Builder backupPlanName(String backupPlanName) {
            this.putQueryParameter("BackupPlanName", backupPlanName);
            this.backupPlanName = backupPlanName;
            return this;
        }

        /**
         * BackupPlanStatus.
         */
        public Builder backupPlanStatus(String backupPlanStatus) {
            this.putQueryParameter("BackupPlanStatus", backupPlanStatus);
            this.backupPlanStatus = backupPlanStatus;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeBackupPlanListRequest build() {
            return new DescribeBackupPlanListRequest(this);
        } 

    } 

}
