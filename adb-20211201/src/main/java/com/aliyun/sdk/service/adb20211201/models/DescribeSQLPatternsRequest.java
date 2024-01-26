// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLPatternsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSQLPatternsRequest</p>
 */
public class DescribeSQLPatternsRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Lang")
    private String lang;

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
    @NameInMap("StartTime")
    private String startTime;

    private DescribeSQLPatternsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLPatternsRequest create() {
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
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSQLPatternsRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private String keyword; 
        private String lang; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSQLPatternsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~129857~~) operation to query the information about all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region, including cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time must be in UTC.
         * <p>
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The keyword that is used for the query.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language. Valid values:
         * <p>
         * 
         * *   **zh** (default): simplified Chinese.
         * *   **en**: English.
         * *   **ja**: Japanese.
         * *   **zh-tw**: traditional Chinese.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The order by which to sort query results. Specify the parameter value in the JSON string format. Example: `[{"Field":"AverageQueryTime","Type":"Asc"}]`.
         * <p>
         * 
         * *   `Field` specifies the field by which to sort the query results. Valid values:
         * 
         *     *   `PatternCreationTime`: the earliest commit time of the SQL pattern within the time range to query.
         *     *   `AverageQueryTime`: the average total amount of time consumed by the SQL pattern within the time range to query.
         *     *   `MaxQueryTime`: the maximum total amount of time consumed by the SQL pattern within the time range to query.
         *     *   `AverageExecutionTime`: the average execution duration of the SQL pattern within the time range to query.
         *     *   `MaxExecutionTime`: the maximum execution duration of the SQL pattern within the time range to query.
         *     *   `AveragePeakMemory`: the average peak memory usage of the SQL pattern within the time range to query.
         *     *   `MaxPeakMemory`: the maximum peak memory usage of the SQL pattern within the time range to query.
         *     *   `AverageScanSize`: the average amount of data scanned based on the SQL pattern within the time range to query.
         *     *   `MaxScanSize`: the maximum amount of data scanned based on the SQL pattern within the time range to query.
         *     *   `QueryCount`: the number of queries performed in association with the SQL pattern within the time range to query.
         *     *   `FailedCount`: the number of failed queries performed in association with the SQL pattern within the time range to query.
         * 
         * *   `Type` specifies the sorting order. Valid values (case-insensitive):
         * 
         *     *   `Asc`: ascending order.
         *     *   `Desc`: descending order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   **10** (default)
         * *   **30**
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time must be in UTC.
         * <p>
         * 
         * > *   Only data within the last 14 days can be queried.
         * > * The maximum time range that can be specified is 24 hours.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSQLPatternsRequest build() {
            return new DescribeSQLPatternsRequest(this);
        } 

    } 

}
