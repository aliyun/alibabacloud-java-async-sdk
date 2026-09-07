// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryEndUserHistoryUsageRequest} extends {@link RequestModel}
 *
 * <p>QueryEndUserHistoryUsageRequest</p>
 */
public class QueryEndUserHistoryUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAdUser")
    private Boolean isAdUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private QueryEndUserHistoryUsageRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.isAdUser = builder.isAdUser;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEndUserHistoryUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return isAdUser
     */
    public Boolean getIsAdUser() {
        return this.isAdUser;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<QueryEndUserHistoryUsageRequest, Builder> {
        private String endDate; 
        private Boolean isAdUser; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryEndUserHistoryUsageRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.isAdUser = request.isAdUser;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The end date of the query. Format: yyyy-MM-dd. The date cannot be later than yesterday or earlier than StartDate. Default value: yesterday.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-15</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Specifies whether to query Active Directory (AD) domain users. If this parameter is set to true, AD domain users are queried. If this parameter is set to false or not specified, convenience account users are queried.</p>
         */
        public Builder isAdUser(Boolean isAdUser) {
            this.putQueryParameter("IsAdUser", isAdUser);
            this.isAdUser = isAdUser;
            return this;
        }

        /**
         * <p>The page number. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 100.</p>
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
         * <p>The start date of the query. Format: yyyy-MM-dd. The date cannot be earlier than 32 days ago. Default value: yesterday.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryEndUserHistoryUsageRequest build() {
            return new QueryEndUserHistoryUsageRequest(this);
        } 

    } 

}
