// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListComputeClustersRequest} extends {@link RequestModel}
 *
 * <p>ListComputeClustersRequest</p>
 */
public class ListComputeClustersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListComputeClustersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeClustersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListComputeClustersRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Integer maxResults; 
        private String nextToken; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListComputeClustersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListComputeClustersRequest build() {
            return new ListComputeClustersRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListComputeClustersRequest} extends {@link TeaModel}
     *
     * <p>ListComputeClustersRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TypeVersionList")
        private java.util.List<String> typeVersionList;

        private ListQuery(Builder builder) {
            this.keyword = builder.keyword;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.typeVersionList = builder.typeVersionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return typeVersionList
         */
        public java.util.List<String> getTypeVersionList() {
            return this.typeVersionList;
        }

        public static final class Builder {
            private String keyword; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<String> typeVersionList; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.keyword = model.keyword;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.typeVersionList = model.typeVersionList;
            } 

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TypeVersionList.
             */
            public Builder typeVersionList(java.util.List<String> typeVersionList) {
                this.typeVersionList = typeVersionList;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
