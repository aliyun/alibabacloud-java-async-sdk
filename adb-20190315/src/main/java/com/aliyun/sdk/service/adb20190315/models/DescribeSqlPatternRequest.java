// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeSqlPatternRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlPatternRequest</p>
 */
public class DescribeSqlPatternRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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
    @com.aliyun.core.annotation.NameInMap("SqlPattern")
    private String sqlPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1r053byu48p****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The order by which to sort query results. Specify the parameter value in the JSON string format. Example: <code>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Parameters:</p>
         * <ul>
         * <li><p><code>Field</code> specifies the field by which to sort the query results. Valid values:</p>
         * <ul>
         * <li><code>Pattern</code>: the SQL pattern.</li>
         * <li><code>AccessIP</code>: the IP address of the client.</li>
         * <li><code>User</code>: the username.</li>
         * <li><code>QueryCount</code>: the number of queries performed in association with the SQL pattern within the time range to query.</li>
         * <li><code>AvgPeakMemory</code>: the average peak memory usage of the SQL pattern within the time range to query. Unit: KB.</li>
         * <li><code>MaxPeakMemory</code>: the maximum peak memory usage of the SQL pattern within the time range to query. Unit: KB.</li>
         * <li><code>AvgCpuTime</code>: the average execution duration of the SQL pattern within the time range to query. Unit: milliseconds.</li>
         * <li><code>MaxCpuTime</code>: the maximum execution duration of the SQL pattern within the time range to query. Unit: milliseconds.</li>
         * <li><code>AvgStageCount</code>: the average number of stages.</li>
         * <li><code>MaxStageCount</code>: the maximum number of stages.</li>
         * <li><code>AvgTaskCount</code>: the average number of tasks.</li>
         * <li><code>MaxTaskCount</code>: the maximum number of tasks.</li>
         * <li><code>AvgScanSize</code>: the average amount of data scanned based on the SQL pattern within the time range to query. Unit: KB.</li>
         * <li><code>MaxScanSize</code>: the maximum amount of data scanned based on the SQL pattern within the time range to query. Unit: KB.</li>
         * </ul>
         * </li>
         * <li><p><code>Type</code> specifies the sorting order. Valid values:</p>
         * <ul>
         * <li><code>Asc</code>: ascending order.</li>
         * <li><code>Desc</code>: descending order.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you do not specify this parameter, query results are sorted in ascending order of <code>Pattern</code>.</p>
         * </li>
         * <li><p>If you want to sort query results by <code>AccessIP</code>, you must set the <code>Type</code> parameter to <code>accessip</code>. If you want to sort query results by <code>User</code>, you must leave the <code>Type</code> parameter empty or set it to <code>user</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. The value must be a positive integer. Default value: <strong>30</strong>.</p>
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
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The keyword that is used for the query.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, all SQL patterns of the AnalyticDB for MySQL cluster within the time period specified by <code>StartTime</code> are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        public Builder sqlPattern(String sqlPattern) {
            this.putQueryParameter("SqlPattern", sqlPattern);
            this.sqlPattern = sqlPattern;
            return this;
        }

        /**
         * <p>The start date to query. Specify the time in the <em>yyyy-MM-dd</em> format. The time must be in UTC.</p>
         * <blockquote>
         * <p>Only data within the last 30 days can be queried.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-30</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The dimension by which to aggregate the SQL patterns. Valid values:</p>
         * <ul>
         * <li><code>user</code>: aggregates the SQL patterns by user.</li>
         * <li><code>accessip</code>: aggregates the SQL patterns by client IP address.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the SQL patterns are aggregated by <code>user</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>user</p>
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
