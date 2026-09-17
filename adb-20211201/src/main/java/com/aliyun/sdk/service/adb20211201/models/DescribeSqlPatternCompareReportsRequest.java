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
 * {@link DescribeSqlPatternCompareReportsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlPatternCompareReportsRequest</p>
 */
public class DescribeSqlPatternCompareReportsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeSqlPatternCompareReportsRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlPatternCompareReportsRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder extends Request.Builder<DescribeSqlPatternCompareReportsRequest, Builder> {
        private String DBClusterId; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlPatternCompareReportsRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-2ze1234567890****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The number of rows per page for token-based pagination. Valid values: 1 to 100.</p>
         * <p>Default value: 50.</p>
         * <blockquote>
         * <ul>
         * <li>When you use <code>NextToken</code> for pagination, keep this parameter unchanged.</li>
         * <li>This parameter does not take effect when you use <code>PageNumber</code> and <code>PageSize</code> for pagination.</li>
         * <li>We recommend that you use <code>PageNumber</code> and <code>PageSize</code> for pagination.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * <blockquote>
         * <ul>
         * <li>Do not specify this parameter for the first query. For subsequent queries, pass in the <code>NextToken</code> value returned by the previous query.</li>
         * <li>Do not use this parameter together with <code>PageNumber</code> or <code>PageSize</code>.</li>
         * <li>Use <code>PageNumber</code> and <code>PageSize</code> for pagination.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>djE6Mjo1MA</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Sorts the query results by a specified field. The value is a JSON array string, for example, <code>[{&quot;Field&quot;:&quot;CreatedAt&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</code>. The array can contain only one object. Fields:</p>
         * <ul>
         * <li><code>Field</code>: the field by which to sort. Valid values:<ul>
         * <li><code>CreatedAt</code>: the time when the report was created.</li>
         * <li><code>StartTime</code>: the start time of time range 1.</li>
         * <li><code>CompareStartTime</code>: the start time of time range 2.</li>
         * </ul>
         * </li>
         * <li><code>Type</code>: the sort order. This value is case-insensitive. Valid values:<ul>
         * <li><code>Asc</code>: ascending order.</li>
         * <li><code>Desc</code>: descending order.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the results are sorted by <code>CreatedAt</code> in descending order by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;CreatedAt&quot;,&quot;Type&quot;:&quot;Desc&quot;}]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1.</p>
         * <p>Default value: 1.</p>
         * <blockquote>
         * <p>Use this parameter together with <code>PageSize</code>. If you specify this parameter, <code>NextToken</code> must be empty.</p>
         * </blockquote>
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
         * <p>The number of rows per page. Valid values: 1 to 100.</p>
         * <p>Default value: 50.</p>
         * <blockquote>
         * <p>Use this parameter together with <code>PageNumber</code>. If you specify this parameter, <code>NextToken</code> must be empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeSqlPatternCompareReportsRequest build() {
            return new DescribeSqlPatternCompareReportsRequest(this);
        } 

    } 

}
