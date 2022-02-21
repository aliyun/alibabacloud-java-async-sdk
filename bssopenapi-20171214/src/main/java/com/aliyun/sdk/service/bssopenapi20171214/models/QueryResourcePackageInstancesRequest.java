// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResourcePackageInstancesRequest} extends {@link RequestModel}
 *
 * <p>QueryResourcePackageInstancesRequest</p>
 */
public class QueryResourcePackageInstancesRequest extends Request {
    @Query
    @NameInMap("ExpiryTimeEnd")
    private String expiryTimeEnd;

    @Query
    @NameInMap("ExpiryTimeStart")
    private String expiryTimeStart;

    @Query
    @NameInMap("IncludePartner")
    private Boolean includePartner;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    private QueryResourcePackageInstancesRequest(Builder builder) {
        super(builder);
        this.expiryTimeEnd = builder.expiryTimeEnd;
        this.expiryTimeStart = builder.expiryTimeStart;
        this.includePartner = builder.includePartner;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResourcePackageInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiryTimeEnd
     */
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    /**
     * @return expiryTimeStart
     */
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
    }

    /**
     * @return includePartner
     */
    public Boolean getIncludePartner() {
        return this.includePartner;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<QueryResourcePackageInstancesRequest, Builder> {
        private String expiryTimeEnd; 
        private String expiryTimeStart; 
        private Boolean includePartner; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryResourcePackageInstancesRequest response) {
            super(response);
            this.expiryTimeEnd = response.expiryTimeEnd;
            this.expiryTimeStart = response.expiryTimeStart;
            this.includePartner = response.includePartner;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.productCode = response.productCode;
        } 

        /**
         * ExpiryTimeEnd.
         */
        public Builder expiryTimeEnd(String expiryTimeEnd) {
            this.putQueryParameter("ExpiryTimeEnd", expiryTimeEnd);
            this.expiryTimeEnd = expiryTimeEnd;
            return this;
        }

        /**
         * ExpiryTimeStart.
         */
        public Builder expiryTimeStart(String expiryTimeStart) {
            this.putQueryParameter("ExpiryTimeStart", expiryTimeStart);
            this.expiryTimeStart = expiryTimeStart;
            return this;
        }

        /**
         * IncludePartner.
         */
        public Builder includePartner(Boolean includePartner) {
            this.putQueryParameter("IncludePartner", includePartner);
            this.includePartner = includePartner;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public QueryResourcePackageInstancesRequest build() {
            return new QueryResourcePackageInstancesRequest(this);
        } 

    } 

}
