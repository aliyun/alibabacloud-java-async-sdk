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
         * <p>The name of the Alibaba Cloud product interface, supporting fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>AddAssetCleanConfig</p>
         */
        public Builder apiName(String apiName) {
            this.putQueryParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>Keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The current page number for pagination. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of items per page when displaying paginated results. The default is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Vendor&quot;s product identifier:</p>
         * <ul>
         * <li><strong>waf</strong>: Web Application Firewall.</li>
         * <li><strong>cfw</strong>: Cloud Firewall.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>waf</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Vendor code:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent.</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei.</li>
         * <li><strong>Azure</strong>: Microsoft Azure.</li>
         * <li><strong>AWS</strong>: Amazon Web Services.</li>
         * <li><strong>Chaitin</strong>: Chaitin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Azure</p>
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
