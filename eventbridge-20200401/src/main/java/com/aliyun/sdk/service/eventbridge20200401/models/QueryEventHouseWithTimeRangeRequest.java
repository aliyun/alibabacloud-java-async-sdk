// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link QueryEventHouseWithTimeRangeRequest} extends {@link RequestModel}
 *
 * <p>QueryEventHouseWithTimeRangeRequest</p>
 */
public class QueryEventHouseWithTimeRangeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    private QueryEventHouseWithTimeRangeRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEventHouseWithTimeRangeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<QueryEventHouseWithTimeRangeRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private Integer limit; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(QueryEventHouseWithTimeRangeRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.query = request.query;
        } 

        /**
         * <p>The start time for querying internal EventHouse data. Specify a UNIX timestamp in seconds. The time range includes this point in time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1787587200</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The end time for querying internal EventHouse data. Specify a UNIX timestamp in seconds. The time range excludes this point in time. The value must be greater than BeginTime.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1787590800</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The maximum number of result rows that can be returned for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The single read-only SQL statement to execute. You can query internal EventHouse data or perform federated queries with mounted external data sources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM my_catalog.my_namespace.my_table LIMIT 100</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public QueryEventHouseWithTimeRangeRequest build() {
            return new QueryEventHouseWithTimeRangeRequest(this);
        } 

    } 

}
