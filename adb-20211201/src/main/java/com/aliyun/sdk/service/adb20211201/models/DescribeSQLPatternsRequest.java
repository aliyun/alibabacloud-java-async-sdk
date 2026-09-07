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
 * {@link DescribeSQLPatternsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSQLPatternsRequest</p>
 */
public class DescribeSQLPatternsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlPatternHash")
    private Long sqlPatternHash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

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
        this.sqlPatternHash = builder.sqlPatternHash;
        this.startTime = builder.startTime;
        this.userName = builder.userName;
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
     * @return sqlPatternHash
     */
    public Long getSqlPatternHash() {
        return this.sqlPatternHash;
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

    public static final class Builder extends Request.Builder<DescribeSQLPatternsRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private String keyword; 
        private String lang; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long sqlPatternHash; 
        private String startTime; 
        private String userName; 

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
            this.sqlPatternHash = request.sqlPatternHash;
            this.startTime = request.startTime;
            this.userName = request.userName;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL (Data Lakehouse Edition) cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> API to find the cluster IDs of all AnalyticDB for MySQL (Data Lakehouse Edition) clusters in a specific region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-8vb8de93v9b****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time must be in UTC and formatted as <em>yyyy-MM-ddTHH:mm:ssZ</em>.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-09-07T03:06:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The keyword for filtering the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The response language. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Simplified Chinese (default)</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
         * <li><p><strong>ja</strong>: Japanese</p>
         * </li>
         * <li><p><strong>zh-tw</strong>: Traditional Chinese</p>
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
         * <p>The sort order for the results. Specify this parameter as a JSON string, for example, <code>[{&quot;Field&quot;:&quot;AverageQueryTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. The string consists of the following fields:</p>
         * <ul>
         * <li><p><code>Field</code>: the sort field. Valid values:</p>
         * <ul>
         * <li><p><code>PatternCreationTime</code>: The earliest submission time of the pattern.</p>
         * </li>
         * <li><p><code>AverageQueryTime</code>: The average query time of the pattern.</p>
         * </li>
         * <li><p><code>MaxQueryTime</code>: The maximum query time of the pattern.</p>
         * </li>
         * <li><p><code>AverageExecutionTime</code>: The average execution time of the pattern.</p>
         * </li>
         * <li><p><code>MaxExecutionTime</code>: The maximum execution time of the pattern.</p>
         * </li>
         * <li><p><code>AveragePeakMemory</code>: The average peak memory of the pattern.</p>
         * </li>
         * <li><p><code>MaxPeakMemory</code>: The maximum peak memory of the pattern.</p>
         * </li>
         * <li><p><code>AverageScanSize</code>: The average scanned data size of the pattern.</p>
         * </li>
         * <li><p><code>MaxScanSize</code>: The maximum scanned data size of the pattern.</p>
         * </li>
         * <li><p><code>QueryCount</code>: The query count of the pattern.</p>
         * </li>
         * <li><p><code>FailedCount</code>: The failure count of the pattern.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>Type</code>: the sort order. Valid values (case-insensitive):</p>
         * <ul>
         * <li><p><code>Asc</code>: ascending order.</p>
         * </li>
         * <li><p><code>Desc</code>: descending order.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;AverageQueryTime&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Must be an integer greater than 0. Default: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><p><strong>10</strong> (default)</p>
         * </li>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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
         * SqlPatternHash.
         */
        public Builder sqlPatternHash(Long sqlPatternHash) {
            this.putQueryParameter("SqlPatternHash", sqlPatternHash);
            this.sqlPatternHash = sqlPatternHash;
            return this;
        }

        /**
         * <p>The start of the time range to query. The time must be in UTC and formatted as <em>yyyy-MM-ddTHH:mm:ssZ</em>.</p>
         * <blockquote>
         * <ul>
         * <li>Data is available for the last 14 days only.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The time range cannot exceed 24 hours.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T03:06:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The username of the database account used to execute the SQL statements.</p>
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
        public DescribeSQLPatternsRequest build() {
            return new DescribeSQLPatternsRequest(this);
        } 

    } 

}
