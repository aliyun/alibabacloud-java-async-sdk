// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoresRequest} extends {@link RequestModel}
 *
 * <p>DescribeStoresRequest</p>
 */
public class DescribeStoresRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompanyId")
    private String companyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromDate")
    private String fromDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    private String storeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreName")
    private String storeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToDate")
    private String toDate;

    private DescribeStoresRequest(Builder builder) {
        super(builder);
        this.brand = builder.brand;
        this.companyId = builder.companyId;
        this.fromDate = builder.fromDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storeId = builder.storeId;
        this.storeName = builder.storeName;
        this.toDate = builder.toDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoresRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return companyId
     */
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * @return fromDate
     */
    public String getFromDate() {
        return this.fromDate;
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
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return storeName
     */
    public String getStoreName() {
        return this.storeName;
    }

    /**
     * @return toDate
     */
    public String getToDate() {
        return this.toDate;
    }

    public static final class Builder extends Request.Builder<DescribeStoresRequest, Builder> {
        private String brand; 
        private String companyId; 
        private String fromDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String storeId; 
        private String storeName; 
        private String toDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStoresRequest request) {
            super(request);
            this.brand = request.brand;
            this.companyId = request.companyId;
            this.fromDate = request.fromDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.storeId = request.storeId;
            this.storeName = request.storeName;
            this.toDate = request.toDate;
        } 

        /**
         * Brand.
         */
        public Builder brand(String brand) {
            this.putBodyParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * CompanyId.
         */
        public Builder companyId(String companyId) {
            this.putBodyParameter("CompanyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * FromDate.
         */
        public Builder fromDate(String fromDate) {
            this.putBodyParameter("FromDate", fromDate);
            this.fromDate = fromDate;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * StoreName.
         */
        public Builder storeName(String storeName) {
            this.putBodyParameter("StoreName", storeName);
            this.storeName = storeName;
            return this;
        }

        /**
         * ToDate.
         */
        public Builder toDate(String toDate) {
            this.putBodyParameter("ToDate", toDate);
            this.toDate = toDate;
            return this;
        }

        @Override
        public DescribeStoresRequest build() {
            return new DescribeStoresRequest(this);
        } 

    } 

}
