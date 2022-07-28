// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFullBackupListRequest} extends {@link RequestModel}
 *
 * <p>DescribeFullBackupListRequest</p>
 */
public class DescribeFullBackupListRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    @Validation(required = true)
    private String backupPlanId;

    @Query
    @NameInMap("BackupSetId")
    private String backupSetId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndTimestamp")
    private Long endTimestamp;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShowStorageType")
    private Boolean showStorageType;

    @Query
    @NameInMap("StartTimestamp")
    private Long startTimestamp;

    private DescribeFullBackupListRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.backupSetId = builder.backupSetId;
        this.clientToken = builder.clientToken;
        this.endTimestamp = builder.endTimestamp;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.showStorageType = builder.showStorageType;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFullBackupListRequest create() {
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
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return showStorageType
     */
    public Boolean getShowStorageType() {
        return this.showStorageType;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<DescribeFullBackupListRequest, Builder> {
        private String backupPlanId; 
        private String backupSetId; 
        private String clientToken; 
        private Long endTimestamp; 
        private String ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String regionId; 
        private Boolean showStorageType; 
        private Long startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFullBackupListRequest request) {
            super(request);
            this.backupPlanId = request.backupPlanId;
            this.backupSetId = request.backupSetId;
            this.clientToken = request.clientToken;
            this.endTimestamp = request.endTimestamp;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.showStorageType = request.showStorageType;
            this.startTimestamp = request.startTimestamp;
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
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
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
         * EndTimestamp.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ShowStorageType.
         */
        public Builder showStorageType(Boolean showStorageType) {
            this.putQueryParameter("ShowStorageType", showStorageType);
            this.showStorageType = showStorageType;
            return this;
        }

        /**
         * StartTimestamp.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public DescribeFullBackupListRequest build() {
            return new DescribeFullBackupListRequest(this);
        } 

    } 

}
