// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosisRecordsRequest</p>
 */
public class DescribeDiagnosisRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPeakMemory")
    private Long maxPeakMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxScanSize")
    private Long maxScanSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinPeakMemory")
    private Long minPeakMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinScanSize")
    private Long minScanSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatternId")
    private String patternId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryCondition")
    private String queryCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private DescribeDiagnosisRecordsRequest(Builder builder) {
        super(builder);
        this.clientIp = builder.clientIp;
        this.DBClusterId = builder.DBClusterId;
        this.database = builder.database;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.maxPeakMemory = builder.maxPeakMemory;
        this.maxScanSize = builder.maxScanSize;
        this.minPeakMemory = builder.minPeakMemory;
        this.minScanSize = builder.minScanSize;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.patternId = builder.patternId;
        this.queryCondition = builder.queryCondition;
        this.regionId = builder.regionId;
        this.resourceGroup = builder.resourceGroup;
        this.startTime = builder.startTime;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
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
     * @return maxPeakMemory
     */
    public Long getMaxPeakMemory() {
        return this.maxPeakMemory;
    }

    /**
     * @return maxScanSize
     */
    public Long getMaxScanSize() {
        return this.maxScanSize;
    }

    /**
     * @return minPeakMemory
     */
    public Long getMinPeakMemory() {
        return this.minPeakMemory;
    }

    /**
     * @return minScanSize
     */
    public Long getMinScanSize() {
        return this.minScanSize;
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
     * @return patternId
     */
    public String getPatternId() {
        return this.patternId;
    }

    /**
     * @return queryCondition
     */
    public String getQueryCondition() {
        return this.queryCondition;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosisRecordsRequest, Builder> {
        private String clientIp; 
        private String DBClusterId; 
        private String database; 
        private String endTime; 
        private String keyword; 
        private String lang; 
        private Long maxPeakMemory; 
        private Long maxScanSize; 
        private Long minPeakMemory; 
        private Long minScanSize; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String patternId; 
        private String queryCondition; 
        private String regionId; 
        private String resourceGroup; 
        private String startTime; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosisRecordsRequest request) {
            super(request);
            this.clientIp = request.clientIp;
            this.DBClusterId = request.DBClusterId;
            this.database = request.database;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.maxPeakMemory = request.maxPeakMemory;
            this.maxScanSize = request.maxScanSize;
            this.minPeakMemory = request.minPeakMemory;
            this.minScanSize = request.minScanSize;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.patternId = request.patternId;
            this.queryCondition = request.queryCondition;
            this.regionId = request.regionId;
            this.resourceGroup = request.resourceGroup;
            this.startTime = request.startTime;
            this.userName = request.userName;
        } 

        /**
         * The source IP address.
         * <p>
         * 
         * >  You can call the [DescribeDiagnosisDimensions](~~308210~~) operation to query the resource groups, database names, usernames, and source IP addresses of the SQL statements that meet a query condition.
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~612397~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the database on which the SQL statements are executed.
         * <p>
         * 
         * >  You can call the [DescribeDiagnosisDimensions](~~308210~~) operation to query the resource groups, database names, usernames, and source IP addresses of the SQL statements that meet a query condition.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * The end of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * > 
         * 
         * *   The end time must be later than the start time.
         * 
         * *   The maximum time range that can be specified is 24 hours.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The query keyword of the SQL statements.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language of file titles and error messages. Valid values:
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
         * The maximum peak memory of the SQL statements. Unit: bytes.
         */
        public Builder maxPeakMemory(Long maxPeakMemory) {
            this.putQueryParameter("MaxPeakMemory", maxPeakMemory);
            this.maxPeakMemory = maxPeakMemory;
            return this;
        }

        /**
         * The maximum scan size of the SQL statements. Unit: bytes.
         */
        public Builder maxScanSize(Long maxScanSize) {
            this.putQueryParameter("MaxScanSize", maxScanSize);
            this.maxScanSize = maxScanSize;
            return this;
        }

        /**
         * The minimum peak memory of the SQL statements. Unit: bytes.
         */
        public Builder minPeakMemory(Long minPeakMemory) {
            this.putQueryParameter("MinPeakMemory", minPeakMemory);
            this.minPeakMemory = minPeakMemory;
            return this;
        }

        /**
         * The minimum scan size of the SQL statements. Unit: bytes.
         */
        public Builder minScanSize(Long minScanSize) {
            this.putQueryParameter("MinScanSize", minScanSize);
            this.minScanSize = minScanSize;
            return this;
        }

        /**
         * The order in which to sort the SQL statements by field, which contains the `Field` and `Type` fields. Specify the order in the JSON format. Example: `[{"Field":"StartTime", "Type": "desc"}]`. Fields:
         * <p>
         * 
         * *   `Field` specifies the field that is used to sort the SQL statements. Valid values:
         * 
         *     *   `StartTime`: the execution start time.
         *     *   `Status`: the execution status.
         *     *   `UserName`: the username.
         *     *   `Cost`: the execution duration.
         *     *   `PeakMemory`: the peak memory.
         *     *   `ScanSize`: the amount of data that is scanned.
         *     *   `Database`: the name of the database.
         *     *   `ClientIp`: the source IP address.
         *     *   `ResourceGroup`: the name of the resource group.
         *     *   `QueueTime`: the amount of time that is consumed for queuing.
         *     *   `OutputRows`: the number of output rows.
         *     *   `OutputDataSize`: the amount of output data.
         *     *   `ResourceCostRank`: the execution duration rank of operators that are used in the SQL statements. This value takes effect only when `QueryCondition` is set to `{"Type":"status","Value":"running"}`.
         * 
         * *   `Type` specifies the sorting order. Valid values (case-insensitive):
         * 
         *     *   `Desc`: descending order.
         *     *   `Asc`: ascending order.
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
         * *   **30** (default)
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The SQL pattern ID.
         */
        public Builder patternId(String patternId) {
            this.putQueryParameter("PatternId", patternId);
            this.patternId = patternId;
            return this;
        }

        /**
         * The query condition for SQL statements, which can contain the `Type`, `Value`, `Min`, and `Max` fields. Specify the condition in the JSON format. `Type` specifies the query dimension. Valid values for Type: `maxCost`, `status`, and `cost`. `Value`, `Min`, or `Max` specifies the query range for the dimension. Valid values:
         * <p>
         * 
         * *   `{"Type":"maxCost","Value":"100"}`: queries the top 100 most time-consuming SQL statements. Set `Value` to 100.
         * *   `{"Type":"status","Value":"finished"}`: queries the executed SQL statements. You can set `Value` to `running` to query the SQL statements that are being executed. You can also set Value to `failed` to query the SQL statements that failed to be executed.
         * *   `{"Type":"cost","Min":"10","Max":"200"}`: queries the SQL statements whose execution duration is in the range of 10 to 200 milliseconds. You can also specify custom values for the Min and Max fields.
         */
        public Builder queryCondition(String queryCondition) {
            this.putQueryParameter("QueryCondition", queryCondition);
            this.queryCondition = queryCondition;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~143074~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group to which the SQL statements belong.
         * <p>
         * 
         * >  You can call the [DescribeDiagnosisDimensions](~~308210~~) operation to query the resource groups, database names, usernames, and source IP addresses of the SQL statements that meet a query condition.
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putQueryParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * The beginning of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  You can query data only within the last 14 days.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The username that is used to execute the SQL statements. You can call the [DescribeDiagnosisDimensions](~~308210~~) operation to query the resource groups, database names, usernames, and source IP addresses of the SQL statements that meet a query condition.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DescribeDiagnosisRecordsRequest build() {
            return new DescribeDiagnosisRecordsRequest(this);
        } 

    } 

}
