// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The source IP address.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource groups, database names, usernames, and source IP addresses of the SQL statements that meet a query condition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>59.82.XX.XX</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1scs48yc125****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the database on which the SQL statements are executed.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource groups, database names, usernames, and source IP addresses of the SQL statements that meet a query condition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The end of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The end time must be later than the start time.</p>
         * </li>
         * <li><p>The maximum time range that can be specified is 24 hours.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1633017540000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The query keyword of the SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The language of file titles and error messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): simplified Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * <li><strong>ja</strong>: Japanese.</li>
         * <li><strong>zh-tw</strong>: traditional Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum peak memory of the SQL statements. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>89000000</p>
         */
        public Builder maxPeakMemory(Long maxPeakMemory) {
            this.putQueryParameter("MaxPeakMemory", maxPeakMemory);
            this.maxPeakMemory = maxPeakMemory;
            return this;
        }

        /**
         * <p>The maximum scan size of the SQL statements. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024000000</p>
         */
        public Builder maxScanSize(Long maxScanSize) {
            this.putQueryParameter("MaxScanSize", maxScanSize);
            this.maxScanSize = maxScanSize;
            return this;
        }

        /**
         * <p>The minimum peak memory of the SQL statements. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minPeakMemory(Long minPeakMemory) {
            this.putQueryParameter("MinPeakMemory", minPeakMemory);
            this.minPeakMemory = minPeakMemory;
            return this;
        }

        /**
         * <p>The minimum scan size of the SQL statements. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minScanSize(Long minScanSize) {
            this.putQueryParameter("MinScanSize", minScanSize);
            this.minScanSize = minScanSize;
            return this;
        }

        /**
         * <p>The order in which to sort the SQL statements by field, which contains the <code>Field</code> and <code>Type</code> fields. Specify the order in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;StartTime&quot;, &quot;Type&quot;: &quot;desc&quot;}]</code>. Fields:</p>
         * <ul>
         * <li><p><code>Field</code> specifies the field that is used to sort the SQL statements. Valid values:</p>
         * <ul>
         * <li><code>StartTime</code>: the execution start time.</li>
         * <li><code>Status</code>: the execution status.</li>
         * <li><code>UserName</code>: the username.</li>
         * <li><code>Cost</code>: the execution duration.</li>
         * <li><code>PeakMemory</code>: the peak memory.</li>
         * <li><code>ScanSize</code>: the amount of data that is scanned.</li>
         * <li><code>Database</code>: the name of the database.</li>
         * <li><code>ClientIp</code>: the source IP address.</li>
         * <li><code>ResourceGroup</code>: the name of the resource group.</li>
         * <li><code>QueueTime</code>: the amount of time that is consumed for queuing.</li>
         * <li><code>OutputRows</code>: the number of output rows.</li>
         * <li><code>OutputDataSize</code>: the amount of output data.</li>
         * <li><code>ResourceCostRank</code>: the execution duration rank of operators that are used in the SQL statements. This value takes effect only when <code>QueryCondition</code> is set to <code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>.</li>
         * </ul>
         * </li>
         * <li><p><code>Type</code> specifies the sorting order. Valid values (case-insensitive):</p>
         * <ul>
         * <li><code>Desc</code>: descending order.</li>
         * <li><code>Asc</code>: ascending order.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;StartTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The SQL pattern ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5575924945138******</p>
         */
        public Builder patternId(String patternId) {
            this.putQueryParameter("PatternId", patternId);
            this.patternId = patternId;
            return this;
        }

        /**
         * <p>The query condition for SQL statements, which can contain the <code>Type</code>, <code>Value</code>, <code>Min</code>, and <code>Max</code> fields. Specify the condition in the JSON format. <code>Type</code> specifies the query dimension. Valid values for Type: <code>maxCost</code>, <code>status</code>, and <code>cost</code>. <code>Value</code>, <code>Min</code>, or <code>Max</code> specifies the query range for the dimension. Valid values:</p>
         * <ul>
         * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;,&quot;Value&quot;:&quot;100&quot;}</code>: queries the top 100 most time-consuming SQL statements. Set <code>Value</code> to 100.</li>
         * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: queries the executed SQL statements. You can set <code>Value</code> to <code>running</code> to query the SQL statements that are being executed. You can also set Value to <code>failed</code> to query the SQL statements that failed to be executed.</li>
         * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;10&quot;,&quot;Max&quot;:&quot;200&quot;}</code>: queries the SQL statements whose execution duration is in the range of 10 to 200 milliseconds. You can also specify custom values for the Min and Max fields.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</p>
         */
        public Builder queryCondition(String queryCondition) {
            this.putQueryParameter("QueryCondition", queryCondition);
            this.queryCondition = queryCondition;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group to which the SQL statements belong.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource groups, database names, usernames, and source IP addresses of the SQL statements that meet a query condition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putQueryParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> You can query data only within the last 14 days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1632931200000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The username that is used to execute the SQL statements. You can call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to query the resource groups, database names, usernames, and source IP addresses of the SQL statements that meet a query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
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
