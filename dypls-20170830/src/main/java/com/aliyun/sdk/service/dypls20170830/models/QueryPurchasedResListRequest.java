// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPurchasedResListRequest} extends {@link RequestModel}
 *
 * <p>QueryPurchasedResListRequest</p>
 */
public class QueryPurchasedResListRequest extends Request {
    @Query
    @NameInMap("BillId")
    private String billId;

    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("IsDisplayPool")
    private Boolean isDisplayPool;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResBindStatus")
    private Integer resBindStatus;

    @Query
    @NameInMap("ResType")
    private Integer resType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecretNo")
    private String secretNo;

    private QueryPurchasedResListRequest(Builder builder) {
        super(builder);
        this.billId = builder.billId;
        this.city = builder.city;
        this.isDisplayPool = builder.isDisplayPool;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.prodCode = builder.prodCode;
        this.resBindStatus = builder.resBindStatus;
        this.resType = builder.resType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secretNo = builder.secretNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPurchasedResListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billId
     */
    public String getBillId() {
        return this.billId;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return isDisplayPool
     */
    public Boolean getIsDisplayPool() {
        return this.isDisplayPool;
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
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resBindStatus
     */
    public Integer getResBindStatus() {
        return this.resBindStatus;
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
     * @return secretNo
     */
    public String getSecretNo() {
        return this.secretNo;
    }

    public static final class Builder extends Request.Builder<QueryPurchasedResListRequest, Builder> {
        private String billId; 
        private String city; 
        private Boolean isDisplayPool; 
        private Long ownerId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String prodCode; 
        private Integer resBindStatus; 
        private Integer resType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secretNo; 

        private Builder() {
            super();
        } 

        private Builder(QueryPurchasedResListRequest request) {
            super(request);
            this.billId = request.billId;
            this.city = request.city;
            this.isDisplayPool = request.isDisplayPool;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.prodCode = request.prodCode;
            this.resBindStatus = request.resBindStatus;
            this.resType = request.resType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secretNo = request.secretNo;
        } 

        /**
         * BillId.
         */
        public Builder billId(String billId) {
            this.putQueryParameter("BillId", billId);
            this.billId = billId;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * IsDisplayPool.
         */
        public Builder isDisplayPool(Boolean isDisplayPool) {
            this.putQueryParameter("IsDisplayPool", isDisplayPool);
            this.isDisplayPool = isDisplayPool;
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
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ResBindStatus.
         */
        public Builder resBindStatus(Integer resBindStatus) {
            this.putQueryParameter("ResBindStatus", resBindStatus);
            this.resBindStatus = resBindStatus;
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
         * SecretNo.
         */
        public Builder secretNo(String secretNo) {
            this.putQueryParameter("SecretNo", secretNo);
            this.secretNo = secretNo;
            return this;
        }

        @Override
        public QueryPurchasedResListRequest build() {
            return new QueryPurchasedResListRequest(this);
        } 

    } 

}
