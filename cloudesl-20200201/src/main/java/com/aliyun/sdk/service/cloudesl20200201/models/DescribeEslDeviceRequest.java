// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslDeviceRequest} extends {@link RequestModel}
 *
 * <p>DescribeEslDeviceRequest</p>
 */
public class DescribeEslDeviceRequest extends Request {
    @Body
    @NameInMap("FromDate")
    private String fromDate;

    @Body
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("StoreId")
    private String storeId;

    @Body
    @NameInMap("ToDate")
    private String toDate;

    private DescribeEslDeviceRequest(Builder builder) {
        super(builder);
        this.fromDate = builder.fromDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storeId = builder.storeId;
        this.toDate = builder.toDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEslDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return toDate
     */
    public String getToDate() {
        return this.toDate;
    }

    public static final class Builder extends Request.Builder<DescribeEslDeviceRequest, Builder> {
        private String fromDate; 
        private Long pageNumber; 
        private Long pageSize; 
        private String storeId; 
        private String toDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEslDeviceRequest response) {
            super(response);
            this.fromDate = response.fromDate;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.storeId = response.storeId;
            this.toDate = response.toDate;
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
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * ToDate.
         */
        public Builder toDate(String toDate) {
            this.putBodyParameter("ToDate", toDate);
            this.toDate = toDate;
            return this;
        }

        @Override
        public DescribeEslDeviceRequest build() {
            return new DescribeEslDeviceRequest(this);
        } 

    } 

}
