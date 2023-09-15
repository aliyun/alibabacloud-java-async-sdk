// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProcessListRequest} extends {@link RequestModel}
 *
 * <p>DescribeProcessListRequest</p>
 */
public class DescribeProcessListRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("InitialQueryId")
    private String initialQueryId;

    @Query
    @NameInMap("InitialUser")
    private String initialUser;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryDurationMs")
    private String queryDurationMs;

    @Query
    @NameInMap("QueryOrder")
    private Long queryOrder;

    @Query
    @NameInMap("RegionId")
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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * InitialQueryId.
         */
        public Builder initialQueryId(String initialQueryId) {
            this.putQueryParameter("InitialQueryId", initialQueryId);
            this.initialQueryId = initialQueryId;
            return this;
        }

        /**
         * InitialUser.
         */
        public Builder initialUser(String initialUser) {
            this.putQueryParameter("InitialUser", initialUser);
            this.initialUser = initialUser;
            return this;
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

        /**
         * QueryDurationMs.
         */
        public Builder queryDurationMs(String queryDurationMs) {
            this.putQueryParameter("QueryDurationMs", queryDurationMs);
            this.queryDurationMs = queryDurationMs;
            return this;
        }

        /**
         * QueryOrder.
         */
        public Builder queryOrder(Long queryOrder) {
            this.putQueryParameter("QueryOrder", queryOrder);
            this.queryOrder = queryOrder;
            return this;
        }

        /**
         * RegionId.
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
