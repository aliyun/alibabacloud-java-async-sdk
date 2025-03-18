// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeVendorApiListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVendorApiListRequest</p>
 */
public class DescribeVendorApiListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorCode")
    private String vendorCode;

    private DescribeVendorApiListRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.keyWord = builder.keyWord;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.vendorCode = builder.vendorCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVendorApiListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
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
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return vendorCode
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    public static final class Builder extends Request.Builder<DescribeVendorApiListRequest, Builder> {
        private String apiName; 
        private String keyWord; 
        private Integer pageNumber; 
        private Long pageSize; 
        private String productCode; 
        private String vendorCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVendorApiListRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.keyWord = request.keyWord;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.vendorCode = request.vendorCode;
        } 

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * KeyWord.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
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
        public Builder pageSize(Long pageSize) {
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

        /**
         * VendorCode.
         */
        public Builder vendorCode(String vendorCode) {
            this.putQueryParameter("VendorCode", vendorCode);
            this.vendorCode = vendorCode;
            return this;
        }

        @Override
        public DescribeVendorApiListRequest build() {
            return new DescribeVendorApiListRequest(this);
        } 

    } 

}
