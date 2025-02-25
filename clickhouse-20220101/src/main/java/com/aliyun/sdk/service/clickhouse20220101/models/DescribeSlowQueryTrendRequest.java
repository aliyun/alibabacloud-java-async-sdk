// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSlowQueryTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlowQueryTrendRequest</p>
 */
public class DescribeSlowQueryTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDurationMs")
    private Long queryDurationMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualWareHouseId;

    private DescribeSlowQueryTrendRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.queryDurationMs = builder.queryDurationMs;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.virtualWareHouseId = builder.virtualWareHouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowQueryTrendRequest create() {
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
     * @return queryDurationMs
     */
    public Long getQueryDurationMs() {
        return this.queryDurationMs;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return virtualWareHouseId
     */
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

    public static final class Builder extends Request.Builder<DescribeSlowQueryTrendRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private Long queryDurationMs; 
        private String regionId; 
        private String startTime; 
        private String virtualWareHouseId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlowQueryTrendRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.queryDurationMs = request.queryDurationMs;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.virtualWareHouseId = request.virtualWareHouseId;
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
         * QueryDurationMs.
         */
        public Builder queryDurationMs(Long queryDurationMs) {
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vw-uf62965t8lt50****</p>
         */
        public Builder virtualWareHouseId(String virtualWareHouseId) {
            this.putQueryParameter("VirtualWareHouseId", virtualWareHouseId);
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }

        @Override
        public DescribeSlowQueryTrendRequest build() {
            return new DescribeSlowQueryTrendRequest(this);
        } 

    } 

}
