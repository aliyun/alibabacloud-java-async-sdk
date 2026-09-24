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
 * {@link QueryAuthUserConnectDurationListRequest} extends {@link RequestModel}
 *
 * <p>QueryAuthUserConnectDurationListRequest</p>
 */
public class QueryAuthUserConnectDurationListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDate")
    private String dataDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAdUser")
    private Boolean isAdUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticType")
    private String statisticType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Integer threshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithDetail")
    private Boolean withDetail;

    private QueryAuthUserConnectDurationListRequest(Builder builder) {
        super(builder);
        this.comparisonOperator = builder.comparisonOperator;
        this.dataDate = builder.dataDate;
        this.isAdUser = builder.isAdUser;
        this.nextToken = builder.nextToken;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.statisticType = builder.statisticType;
        this.threshold = builder.threshold;
        this.userName = builder.userName;
        this.withDetail = builder.withDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthUserConnectDurationListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * @return dataDate
     */
    public String getDataDate() {
        return this.dataDate;
    }

    /**
     * @return isAdUser
     */
    public Boolean getIsAdUser() {
        return this.isAdUser;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return statisticType
     */
    public String getStatisticType() {
        return this.statisticType;
    }

    /**
     * @return threshold
     */
    public Integer getThreshold() {
        return this.threshold;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return withDetail
     */
    public Boolean getWithDetail() {
        return this.withDetail;
    }

    public static final class Builder extends Request.Builder<QueryAuthUserConnectDurationListRequest, Builder> {
        private String comparisonOperator; 
        private String dataDate; 
        private Boolean isAdUser; 
        private String nextToken; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String statisticType; 
        private Integer threshold; 
        private String userName; 
        private Boolean withDetail; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuthUserConnectDurationListRequest request) {
            super(request);
            this.comparisonOperator = request.comparisonOperator;
            this.dataDate = request.dataDate;
            this.isAdUser = request.isAdUser;
            this.nextToken = request.nextToken;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.statisticType = request.statisticType;
            this.threshold = request.threshold;
            this.userName = request.userName;
            this.withDetail = request.withDetail;
        } 

        /**
         * <p>The comparison operator for connection duration. This parameter is used together with Threshold to filter users by a threshold. Valid values:</p>
         * <ul>
         * <li>GreaterThanThreshold: greater than the threshold.</li>
         * <li>LessThanThreshold: less than the threshold.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GreaterThanThreshold</p>
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.putQueryParameter("ComparisonOperator", comparisonOperator);
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * <p>The date for the statistics, in the yyyy-MM-dd format. If this parameter is left empty, statistics from the previous day are returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-24</p>
         */
        public Builder dataDate(String dataDate) {
            this.putQueryParameter("DataDate", dataDate);
            this.dataDate = dataDate;
            return this;
        }

        /**
         * <p>Specifies whether to query only Active Directory (AD) users. This parameter is required when UserName or WithDetail is specified.</p>
         */
        public Builder isAdUser(Boolean isAdUser) {
            this.putQueryParameter("IsAdUser", isAdUser);
            this.isAdUser = isAdUser;
            return this;
        }

        /**
         * <p>The paging token. This parameter is used only when statistics are collected by individual session details (StatisticType=SingleSession). You do not need to specify this parameter for the first request. For subsequent requests, set this parameter to the NextToken value returned in the previous response to retrieve the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>d129c6c0e8c04c8a9f0e2b7c1a3f5e6d</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number, starting from 1. Default value: 1. This parameter takes effect only when statistics are collected by daily cumulative duration (StatisticType=Daily).</p>
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
         * <p>The number of entries per page. Default value: 100. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The statistics type. Valid values:</p>
         * <ul>
         * <li>Daily: collects statistics by daily cumulative connection duration. This is the default value.</li>
         * <li>SingleSession: collects statistics by individual session details.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        public Builder statisticType(String statisticType) {
            this.putQueryParameter("StatisticType", statisticType);
            this.statisticType = statisticType;
            return this;
        }

        /**
         * <p>The connection duration threshold, in seconds. This parameter must be used together with ComparisonOperator.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder threshold(Integer threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>The name of the end user. Fuzzy match is supported. When you use this parameter, you must also specify IsAdUser.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>Specifies whether to backfill user details such as display name and nickname. This parameter supports both AD users and convenience users. When you use this parameter, you must also specify IsAdUser.</p>
         */
        public Builder withDetail(Boolean withDetail) {
            this.putQueryParameter("WithDetail", withDetail);
            this.withDetail = withDetail;
            return this;
        }

        @Override
        public QueryAuthUserConnectDurationListRequest build() {
            return new QueryAuthUserConnectDurationListRequest(this);
        } 

    } 

}
