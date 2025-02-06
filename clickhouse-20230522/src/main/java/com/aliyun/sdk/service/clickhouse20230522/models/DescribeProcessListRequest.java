// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link DescribeProcessListRequest} extends {@link RequestModel}
 *
 * <p>DescribeProcessListRequest</p>
 */
public class DescribeProcessListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitialQueryId")
    private String initialQueryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitialUser")
    private String initialUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDurationMs")
    private String queryDurationMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryOrder")
    private Long queryOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeProcessListRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.initialQueryId = builder.initialQueryId;
        this.initialUser = builder.initialUser;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryDurationMs = builder.queryDurationMs;
        this.queryOrder = builder.queryOrder;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return initialQueryId
     */
    public String getInitialQueryId() {
        return this.initialQueryId;
    }

    /**
     * @return initialUser
     */
    public String getInitialUser() {
        return this.initialUser;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return queryDurationMs
     */
    public String getQueryDurationMs() {
        return this.queryDurationMs;
    }

    /**
     * @return queryOrder
     */
    public Long getQueryOrder() {
        return this.queryOrder;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeProcessListRequest, Builder> {
        private String DBInstanceId; 
        private String initialQueryId; 
        private String initialUser; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryDurationMs; 
        private Long queryOrder; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProcessListRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.initialQueryId = request.initialQueryId;
            this.initialUser = request.initialUser;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryDurationMs = request.queryDurationMs;
            this.queryOrder = request.queryOrder;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-xxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder initialQueryId(String initialQueryId) {
            this.putQueryParameter("InitialQueryId", initialQueryId);
            this.initialQueryId = initialQueryId;
            return this;
        }

        /**
         * <p>The user who executes the query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        public Builder initialUser(String initialUser) {
            this.putQueryParameter("InitialUser", initialUser);
            this.initialUser = initialUser;
            return this;
        }

        /**
         * <p>The keyword of the query statement.</p>
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
         * <p>The page number.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>The execution duration of slow SQL queries. Minimum value: 1000. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder queryDurationMs(String queryDurationMs) {
            this.putQueryParameter("QueryDurationMs", queryDurationMs);
            this.queryDurationMs = queryDurationMs;
            return this;
        }

        /**
         * <p>Specifies the columns by which the query results are sorted in descending order.</p>
         * <ul>
         * <li>0: The query results are sorted by the query_duration_ms column.</li>
         * <li>1: The query results are sorted by the query_duration_ms and query_start_time columns.</li>
         * <li>2: The query results are sorted by the query_duration_ms, query_start_time, and user columns.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder queryOrder(Long queryOrder) {
            this.putQueryParameter("QueryOrder", queryOrder);
            this.queryOrder = queryOrder;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public DescribeProcessListRequest build() {
            return new DescribeProcessListRequest(this);
        } 

    } 

}
