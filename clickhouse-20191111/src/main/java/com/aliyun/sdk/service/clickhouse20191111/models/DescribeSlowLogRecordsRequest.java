// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlowLogRecordsRequest</p>
 */
public class DescribeSlowLogRecordsRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 99999999, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 99999999, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("QueryDurationMs")
    @Validation(maximum = 9999999999D)
    private Integer queryDurationMs;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeSlowLogRecordsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryDurationMs = builder.queryDurationMs;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogRecordsRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryDurationMs
     */
    public Integer getQueryDurationMs() {
        return this.queryDurationMs;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSlowLogRecordsRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer queryDurationMs; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlowLogRecordsRequest response) {
            super(response);
            this.DBClusterId = response.DBClusterId;
            this.endTime = response.endTime;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.queryDurationMs = response.queryDurationMs;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.startTime = response.startTime;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * QueryDurationMs.
         */
        public Builder queryDurationMs(Integer queryDurationMs) {
            this.putQueryParameter("QueryDurationMs", queryDurationMs);
            this.queryDurationMs = queryDurationMs;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSlowLogRecordsRequest build() {
            return new DescribeSlowLogRecordsRequest(this);
        } 

    } 

}
