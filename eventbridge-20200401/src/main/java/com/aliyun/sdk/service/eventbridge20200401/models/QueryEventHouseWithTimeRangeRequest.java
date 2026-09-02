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
         * <p>查询内部EventHouse数据的开始时间，使用Unix时间戳，单位为秒。时间区间包含该时刻。</p>
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
         * <p>查询内部EventHouse数据的结束时间，使用Unix时间戳，单位为秒。时间区间不包含该时刻，且必须大于BeginTime。</p>
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
         * <p>本次查询允许返回的最大结果行数。</p>
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
         * <p>要执行的单条只读SQL语句。支持查询内部EventHouse，也支持与挂载的外部数据源进行联合查询。</p>
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
