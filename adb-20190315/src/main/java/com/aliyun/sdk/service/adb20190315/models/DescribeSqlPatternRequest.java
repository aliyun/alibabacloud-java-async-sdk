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
         * The ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the details of all AnalyticDB for MySQL clusters within a specified region, including cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The order by which to sort query results. Specify the parameter value in the JSON string format. Example: `[{"Field":"Pattern","Type":"Asc"}]`.
         * <p>
         * 
         * *   `Field` indicates the field that is used to sort the retrieved entries. Valid values:
         * 
         *     *   `Pattern` : the SQL pattern.
         *     *   `AccessIP`: the IP address of the client.
         *     *   `User`: the username.
         *     *   `QueryCount`: the total number of queries.
         *     *   `AvgPeakMemory`: the average peak memory. Unit: KB.
         *     *   `MaxPeakMemory`: the maximum peak memory. Unit: KB.
         *     *   `AvgCpuTime`: the average CPU time. Unit: milliseconds.
         *     *   `MaxCpuTime`: the maximum CPU time. Unit: milliseconds.
         *     *   `AvgStageCount`: the average number of stages.
         *     *   `MaxStageCount`: the maximum number of stages.
         *     *   `AvgTaskCount`: the average number of tasks.
         *     *   `MaxTaskCount`: the maximum number of tasks.
         *     *   `AvgScanSize`: the average scan size. Unit: KB.
         *     *   `MaxScanSize`: the maximum scan size. Unit: KB.
         * 
         * *   `Type` indicates the sorting method. Valid values:
         * 
         *     *   `Asc`: ascending order.
         *     *   `Desc`: descending order.
         * 
         * > *   If this parameter is not specified, query results are sorted in ascending order of `Pattern`.
         * > *   If you need to sort query results by `AccessIP`, you must set the `Type` parameter to `accessip`. If you need to sort query results by `User`, you must leave the `Type` parameter empty or set it to `user`.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The number of the page to return. The value must be an integer that is greater than 0. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. The value must be a positive integer. Default value: **30**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~143074~~) operation to query the regions and zones supported by AnalyticDB for MySQL, including region IDs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The keyword contained in the SQL pattern.
         * <p>
         * 
         * >  If this parameter is not specified, all SQL patterns within an AnalyticDB for MySQL cluster for a date specified by `StartTime` are returned.
         */
        public Builder sqlPattern(String sqlPattern) {
            this.putQueryParameter("SqlPattern", sqlPattern);
            this.sqlPattern = sqlPattern;
            return this;
        }

        /**
         * The date to query. Specify the time in the *yyyy-MM-dd* format. The time must be in UTC.
         * <p>
         * 
         * >  Only data for the last 30 days can be queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The dimension by which to aggregate the SQL pattern. Valid values:
         * <p>
         * 
         * *   `user`: the user.
         * *   `accessip`: the IP address of the client.
         * 
         * >  If this parameter is not specified, the SQL pattern is aggregated by `user`.
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
