// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPoolInfoListRequest} extends {@link RequestModel}
 *
 * <p>QueryPoolInfoListRequest</p>
 */
public class QueryPoolInfoListRequest extends Request {
    @Query
    @NameInMap("IsFuzzyQuery")
    private Boolean isFuzzyQuery;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private String pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("PoolName")
    private String poolName;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResType")
    @Validation(required = true)
    private Integer resType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SearchParam")
    private String searchParam;

    private QueryPoolInfoListRequest(Builder builder) {
        super(builder);
        this.isFuzzyQuery = builder.isFuzzyQuery;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.poolName = builder.poolName;
        this.prodCode = builder.prodCode;
        this.resType = builder.resType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.searchParam = builder.searchParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPoolInfoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isFuzzyQuery
     */
    public Boolean getIsFuzzyQuery() {
        return this.isFuzzyQuery;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return poolName
     */
    public String getPoolName() {
        return this.poolName;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resType
     */
    public Integer getResType() {
        return this.resType;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return searchParam
     */
    public String getSearchParam() {
        return this.searchParam;
    }

    public static final class Builder extends Request.Builder<QueryPoolInfoListRequest, Builder> {
        private Boolean isFuzzyQuery; 
        private Long ownerId; 
        private String pageNo; 
        private String pageSize; 
        private String poolName; 
        private String prodCode; 
        private Integer resType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String searchParam; 

        private Builder() {
            super();
        } 

        private Builder(QueryPoolInfoListRequest request) {
            super(request);
            this.isFuzzyQuery = request.isFuzzyQuery;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.poolName = request.poolName;
            this.prodCode = request.prodCode;
            this.resType = request.resType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.searchParam = request.searchParam;
        } 

        /**
         * IsFuzzyQuery.
         */
        public Builder isFuzzyQuery(Boolean isFuzzyQuery) {
            this.putQueryParameter("IsFuzzyQuery", isFuzzyQuery);
            this.isFuzzyQuery = isFuzzyQuery;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PoolName.
         */
        public Builder poolName(String poolName) {
            this.putQueryParameter("PoolName", poolName);
            this.poolName = poolName;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ResType.
         */
        public Builder resType(Integer resType) {
            this.putQueryParameter("ResType", resType);
            this.resType = resType;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SearchParam.
         */
        public Builder searchParam(String searchParam) {
            this.putQueryParameter("SearchParam", searchParam);
            this.searchParam = searchParam;
            return this;
        }

        @Override
        public QueryPoolInfoListRequest build() {
            return new QueryPoolInfoListRequest(this);
        } 

    } 

}
