// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreTaskListRequest</p>
 */
public class DescribeRestoreTaskListRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    private String backupPlanId;

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
    @NameInMap("RestoreTaskId")
    private String restoreTaskId;

    @Query
    @NameInMap("StartTimestamp")
    private Long startTimestamp;

    private DescribeRestoreTaskListRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.endTimestamp = builder.endTimestamp;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.restoreTaskId = builder.restoreTaskId;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreTaskListRequest create() {
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
     * @return restoreTaskId
     */
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<DescribeRestoreTaskListRequest, Builder> {
        private String backupPlanId; 
        private String clientToken; 
        private Long endTimestamp; 
        private String ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String regionId; 
        private String restoreTaskId; 
        private Long startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreTaskListRequest response) {
            super(response);
            this.backupPlanId = response.backupPlanId;
            this.clientToken = response.clientToken;
            this.endTimestamp = response.endTimestamp;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.restoreTaskId = response.restoreTaskId;
            this.startTimestamp = response.startTimestamp;
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
         * RestoreTaskId.
         */
        public Builder restoreTaskId(String restoreTaskId) {
            this.putQueryParameter("RestoreTaskId", restoreTaskId);
            this.restoreTaskId = restoreTaskId;
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
        public DescribeRestoreTaskListRequest build() {
            return new DescribeRestoreTaskListRequest(this);
        } 

    } 

}
