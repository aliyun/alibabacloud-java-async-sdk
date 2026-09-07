// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
         * <p>Call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to view the resource groups, database names, usernames, and source IP addresses for the SQL statements that meet the specified query conditions.</p>
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
         * <p>The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to view the details of all clusters in your account, including cluster IDs.</p>
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
         * <p>The database where the SQL statement is executed.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to view the resource groups, database names, usernames, and source IP addresses for the SQL statements that meet the specified query conditions.</p>
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
         * <p>The end of the time range to query. Specify the time in the UNIX timestamp format. The time must be in milliseconds.</p>
         * <blockquote>
         * <ul>
         * <li><p>The end time must be later than the start time.</p>
         * </li>
         * <li><p>The interval between the start time and the end time cannot exceed 24 hours.</p>
         * </li>
         * </ul>
         * </blockquote>
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
         * <p>Filters the queries by the keywords contained in the SQL statements.</p>
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
         * <p>The language of the file title and some error messages in the downloaded file. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Simplified Chinese (default).</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * <li><p><strong>ja</strong>: Japanese.</p>
         * </li>
         * <li><p><strong>zh-tw</strong>: Traditional Chinese.</p>
         * </li>
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
         * <p>The maximum peak memory of the SQL statement. Unit: bytes.</p>
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
         * <p>The maximum scan size of the target SQL statement. Unit: bytes.</p>
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
         * <p>The minimum peak memory of the SQL statement. Unit: bytes.</p>
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
         * <p>The minimum scan size of the SQL statement. Unit: bytes.</p>
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
         * <p>The sorting order of the SQL statements. This parameter is a JSON array that is ordered by the sequence of the input array. It contains the <code>Field</code> and <code>Type</code> fields. Example: <code>[{&quot;Field&quot;:&quot;StartTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</code>. The fields are described as follows:</p>
         * <ul>
         * <li><p><code>Field</code> specifies the field by which to sort the SQL statements. Valid values:</p>
         * <ul>
         * <li><p><code>StartTime</code>: the start time of the execution.</p>
         * </li>
         * <li><p><code>Status</code>: the execution state.</p>
         * </li>
         * <li><p><code>UserName</code>: the username.</p>
         * </li>
         * <li><p><code>Cost</code>: the execution duration.</p>
         * </li>
         * <li><p><code>PeakMemory</code>: the peak memory.</p>
         * </li>
         * <li><p><code>ScanSize</code>: the amount of scanned data.</p>
         * </li>
         * <li><p><code>Database</code>: the database name.</p>
         * </li>
         * <li><p><code>ClientIp</code>: the source IP address.</p>
         * </li>
         * <li><p><code>ResourceGroup</code>: the resource group.</p>
         * </li>
         * <li><p><code>QueueTime</code>: the amount of time that the query waited in a queue.</p>
         * </li>
         * <li><p><code>OutputRows</code>: the number of output rows.</p>
         * </li>
         * <li><p><code>OutputDataSize</code>: the amount of output data.</p>
         * </li>
         * <li><p><code>ResourceCostRank</code>: the ranking of the execution duration of an operator in the SQL statement. This field is returned only when <code>QueryCondition</code> is set to <code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>Type</code> specifies the sorting type. Valid values (case-insensitive):</p>
         * <ul>
         * <li><p><code>Desc</code>: descending order.</p>
         * </li>
         * <li><p><code>Asc</code>: ascending order.</p>
         * </li>
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
         * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
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
         * <li><p><strong>30</strong> (default)</p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
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
         * <p>The ID of the SQL pattern.</p>
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
         * <p>The conditions for the SQL query. This parameter is a JSON string that contains fields such as Type, <code>Value</code>, <code>Min</code>, and <code>Max</code>. The <code>Type</code> field indicates the query dimension. Valid values for <code>Type</code>: <code>maxCost</code>, <code>status</code>, and <code>cost</code>. The <code>Value</code>, <code>Min</code>, and <code>Max</code> fields specify the query range for the dimension. Valid values:</p>
         * <ul>
         * <li><p><code>{&quot;Type&quot;:&quot;maxCost&quot;,&quot;Value&quot;:&quot;100&quot;}</code>: queries the details of the top 100 SQL statements that have the longest execution durations. The <code>Value</code> field can only be set to 100.</p>
         * </li>
         * <li><p><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: queries the details of completed SQL statements. You can also set <code>Value</code> to <code>running</code> or <code>failed</code> to query SQL statements that are running or have failed.</p>
         * </li>
         * <li><p><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;10&quot;,&quot;Max&quot;:&quot;200&quot;}</code>: queries the details of SQL statements whose execution durations are between 10 ms and 200 ms. You can customize the minimum and maximum execution durations. Unit: milliseconds.</p>
         * </li>
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
         * <p>The region ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to view the regions and zones supported by AnalyticDB for MySQL, including region IDs.</p>
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
         * <p>The resource group to which the SQL statement belongs.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to view the resource groups, database names, usernames, and source IP addresses for the SQL statements that meet the specified query conditions.</p>
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
         * <p>The start of the time range to query. Specify the time in the UNIX timestamp format. The time must be in milliseconds.</p>
         * <blockquote>
         * <p>Only data from the last 14 days can be queried.</p>
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
         * <p>The username used to execute the SQL statement.
         * Call the <a href="https://help.aliyun.com/document_detail/308210.html">DescribeDiagnosisDimensions</a> operation to view the resource groups, database names, usernames, and source IP addresses for the SQL statements that meet the specified query conditions.</p>
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
