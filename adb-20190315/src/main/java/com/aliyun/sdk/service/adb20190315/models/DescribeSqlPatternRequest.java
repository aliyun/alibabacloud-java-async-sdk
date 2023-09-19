// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSqlPatternRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlPatternRequest</p>
 */
public class DescribeSqlPatternRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SqlPattern")
    private String sqlPattern;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeSqlPatternRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sqlPattern = builder.sqlPattern;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlPatternRequest create() {
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
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sqlPattern
     */
    public String getSqlPattern() {
        return this.sqlPattern;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeSqlPatternRequest, Builder> {
        private String DBClusterId; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String sqlPattern; 
        private String startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlPatternRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sqlPattern = request.sqlPattern;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The order by which to sort query results. Specify the parameter value in the JSON string format. Example: `[{"Field":"Pattern","Type":"Asc"}]`. Parameters:
         * <p>
         * 
         * *   `Field` specifies the field by which to sort the query results. Valid values:
         * 
         *     *   `Pattern`: the SQL pattern.
         *     *   `AccessIP`: the IP address of the client.
         *     *   `User`: the username.
         *     *   `QueryCount`: the number of queries performed in association with the SQL pattern within the time range to query.
         *     *   `AvgPeakMemory`: the average peak memory usage of the SQL pattern within the time range to query. Unit: KB.
         *     *   `MaxPeakMemory`: the maximum peak memory usage of the SQL pattern within the time range to query. Unit: KB.
         *     *   `AvgCpuTime`: the average execution duration of the SQL pattern within the time range to query. Unit: milliseconds.
         *     *   `MaxCpuTime`: the maximum execution duration of the SQL pattern within the time range to query. Unit: milliseconds.
         *     *   `AvgStageCount`: the average number of stages.
         *     *   `MaxStageCount`: the maximum number of stages.
         *     *   `AvgTaskCount`: the average number of tasks.
         *     *   `MaxTaskCount`: the maximum number of tasks.
         *     *   `AvgScanSize`: the average amount of data scanned based on the SQL pattern within the time range to query. Unit: KB.
         *     *   `MaxScanSize`: the maximum amount of data scanned based on the SQL pattern within the time range to query. Unit: KB.
         * 
         * *   `Type` specifies the sorting order. Valid values:
         * 
         *     *   `Asc`: ascending order.
         *     *   `Desc`: descending order.
         * 
         * > 
         * 
         * *   If you do not specify this parameter, query results are sorted in ascending order of `Pattern`.
         * 
         * *   If you want to sort query results by `AccessIP`, you must set the `Type` parameter to `accessip`. If you want to sort query results by `User`, you must leave the `Type` parameter empty or set it to `user`.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. The value must be a positive integer. Default value: **30**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The keyword that is used for the query.
         * <p>
         * 
         * > If you do not specify this parameter, all SQL patterns of the AnalyticDB for MySQL cluster within the time period specified by `StartTime` are returned.
         */
        public Builder sqlPattern(String sqlPattern) {
            this.putQueryParameter("SqlPattern", sqlPattern);
            this.sqlPattern = sqlPattern;
            return this;
        }

        /**
         * The start date to query. Specify the time in the *yyyy-MM-dd* format. The time must be in UTC.
         * <p>
         * 
         * > Only data within the last 30 days can be queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The dimension by which to aggregate the SQL patterns. Valid values:
         * <p>
         * 
         * *   `user`: aggregates the SQL patterns by user.
         * *   `accessip`: aggregates the SQL patterns by client IP address.
         * 
         * > If you do not specify this parameter, the SQL patterns are aggregated by `user`.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeSqlPatternRequest build() {
            return new DescribeSqlPatternRequest(this);
        } 

    } 

}
