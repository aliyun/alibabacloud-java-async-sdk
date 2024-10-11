// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRunningQueryRequest} extends {@link RequestModel}
 *
 * <p>DescribeRunningQueryRequest</p>
 */
public class DescribeRunningQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDurationMs")
    private Long queryDurationMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryKeyWord")
    private String queryKeyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryUser")
    private String queryUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualWareHouseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualWareHouseId;

    private DescribeRunningQueryRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryDurationMs = builder.queryDurationMs;
        this.queryId = builder.queryId;
        this.queryKeyWord = builder.queryKeyWord;
        this.queryUser = builder.queryUser;
        this.regionId = builder.regionId;
        this.virtualWareHouseId = builder.virtualWareHouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRunningQueryRequest create() {
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
    public Long getQueryDurationMs() {
        return this.queryDurationMs;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return queryKeyWord
     */
    public String getQueryKeyWord() {
        return this.queryKeyWord;
    }

    /**
     * @return queryUser
     */
    public String getQueryUser() {
        return this.queryUser;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return virtualWareHouseId
     */
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

    public static final class Builder extends Request.Builder<DescribeRunningQueryRequest, Builder> {
        private String DBClusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long queryDurationMs; 
        private String queryId; 
        private String queryKeyWord; 
        private String queryUser; 
        private String regionId; 
        private String virtualWareHouseId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRunningQueryRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryDurationMs = request.queryDurationMs;
            this.queryId = request.queryId;
            this.queryKeyWord = request.queryKeyWord;
            this.queryUser = request.queryUser;
            this.regionId = request.regionId;
            this.virtualWareHouseId = request.virtualWareHouseId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
        public Builder queryDurationMs(Long queryDurationMs) {
            this.putQueryParameter("QueryDurationMs", queryDurationMs);
            this.queryDurationMs = queryDurationMs;
            return this;
        }

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        /**
         * QueryKeyWord.
         */
        public Builder queryKeyWord(String queryKeyWord) {
            this.putQueryParameter("QueryKeyWord", queryKeyWord);
            this.queryKeyWord = queryKeyWord;
            return this;
        }

        /**
         * QueryUser.
         */
        public Builder queryUser(String queryUser) {
            this.putQueryParameter("QueryUser", queryUser);
            this.queryUser = queryUser;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vw-uf62965t8lt50****</p>
         */
        public Builder virtualWareHouseId(String virtualWareHouseId) {
            this.putQueryParameter("VirtualWareHouseId", virtualWareHouseId);
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }

        @Override
        public DescribeRunningQueryRequest build() {
            return new DescribeRunningQueryRequest(this);
        } 

    } 

}
