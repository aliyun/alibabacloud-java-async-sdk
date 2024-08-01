// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSwitchLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceSwitchLogRequest</p>
 */
public class DescribeDBInstanceSwitchLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDBInstanceSwitchLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DBInstanceId = builder.DBInstanceId;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSwitchLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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

    public static final class Builder extends Request.Builder<DescribeDBInstanceSwitchLogRequest, Builder> {
        private String regionId; 
        private String DBInstanceId; 
        private String endTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long resourceOwnerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceSwitchLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DBInstanceId = request.DBInstanceId;
            this.endTime = request.endTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
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
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-mm-dd*T*hh:mm*Z format. The time must be in UTC. The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The number of the page to return. The value must be an integer that is greater than 0 and less than or equal to the maximum value supported by the integer data type. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **30, 50, and 100**. Default value: **30**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-mm-dd*T*hh:mm*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDBInstanceSwitchLogRequest build() {
            return new DescribeDBInstanceSwitchLogRequest(this);
        } 

    } 

}
