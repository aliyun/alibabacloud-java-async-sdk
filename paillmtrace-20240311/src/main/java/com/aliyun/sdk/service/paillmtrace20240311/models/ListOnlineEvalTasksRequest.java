// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link ListOnlineEvalTasksRequest} extends {@link RequestModel}
 *
 * <p>ListOnlineEvalTasksRequest</p>
 */
public class ListOnlineEvalTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxTime")
    private String maxTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinTime")
    private String minTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListOnlineEvalTasksRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxTime = builder.maxTime;
        this.minTime = builder.minTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOnlineEvalTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxTime
     */
    public String getMaxTime() {
        return this.maxTime;
    }

    /**
     * @return minTime
     */
    public String getMinTime() {
        return this.minTime;
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

    public static final class Builder extends Request.Builder<ListOnlineEvalTasksRequest, Builder> {
        private String keyword; 
        private String maxTime; 
        private String minTime; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListOnlineEvalTasksRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxTime = request.maxTime;
            this.minTime = request.minTime;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * MaxTime.
         */
        public Builder maxTime(String maxTime) {
            this.putQueryParameter("MaxTime", maxTime);
            this.maxTime = maxTime;
            return this;
        }

        /**
         * MinTime.
         */
        public Builder minTime(String minTime) {
            this.putQueryParameter("MinTime", minTime);
            this.minTime = minTime;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListOnlineEvalTasksRequest build() {
            return new ListOnlineEvalTasksRequest(this);
        } 

    } 

}
