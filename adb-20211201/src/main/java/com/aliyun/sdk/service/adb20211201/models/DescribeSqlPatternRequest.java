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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all clusters in a specified region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1ej1nq9n6****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Sorts the query results by a specified field. The format is a JSON character string, such as <code>[{&quot;Field&quot;:&quot;Pattern&quot;,&quot;Type&quot;:&quot;Asc&quot;}]</code>. Parameters:</p>
         * <ul>
         * <li><p><code>Field</code>: the sorting field. Valid values:</p>
         * <ul>
         * <li><code>Pattern</code>: SQL pattern.</li>
         * <li><code>AccessIP</code>: client IP address.</li>
         * <li><code>User</code>: username.</li>
         * <li><code>QueryCount</code>: total number of queries.</li>
         * <li><code>AvgPeakMemory</code>: average peak memory usage. Unit: KB.</li>
         * <li><code>MaxPeakMemory</code>: Peak Volume memory. Unit: KB.</li>
         * <li><code>AvgCpuTime</code>: average computing duration. Unit: milliseconds.</li>
         * <li><code>MaxCpuTime</code>: maximum computing duration. Unit: milliseconds.</li>
         * <li><code>AvgStageCount</code>: average number of stages.</li>
         * <li><code>MaxStageCount</code>: maximum number of stages.</li>
         * <li><code>AvgTaskCount</code>: average number of tasks.</li>
         * <li><code>MaxTaskCount</code>: maximum number of tasks.</li>
         * <li><code>AvgScanSize</code>: average scanned data size. Unit: KB.</li>
         * <li><code>MaxScanSize</code>: maximum scanned data size. Unit: KB.</li>
         * </ul>
         * </li>
         * <li><p><code>Type</code>: the sorting method. Valid values:</p>
         * <ul>
         * <li><code>Asc</code>: ascending sorting.</li>
         * <li><code>Desc</code>: descending sorting.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If the Settings are not specified, the results are sorted in ascending order by the <code>Pattern</code> field by default.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>To sort by the <code>AccessIP</code> field, you must set the <code>Type</code> parameter to <code>accessip</code>. To sort by the <code>User</code> field, you must leave the <code>Type</code> parameter empty or set it to <code>user</code>.</li>
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
         * <p>The page number. Valid values: integers greater than 0 and less than or equal to the maximum value of the Integer type.
         * Default value: 1.</p>
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
         * <li><strong>10</strong> (default)</li>
         * <li><strong>30</strong></li>
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
         * <p>The region ID.</p>
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
         * <p>The keyword that the SQL pattern must contain.</p>
         * <blockquote>
         * <p>If this parameter is not specified, the details of all SQL patterns for the cluster on the date specified by the <code>StartTime</code> parameter are returned by default.</p>
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
         * <p>The start date for the query. The time is in UTC and formatted as yyyy-MM-dd.</p>
         * <blockquote>
         * <p>Only data from the last 30 days can be queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-08-30</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The dimension by which to aggregate SQL patterns. Valid values:</p>
         * <ul>
         * <li><code>user</code>: aggregates by user.</li>
         * <li><code>accessip</code>: aggregates by access IP address.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, SQL patterns are aggregated by the <code>user</code> dimension by default.</p>
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
