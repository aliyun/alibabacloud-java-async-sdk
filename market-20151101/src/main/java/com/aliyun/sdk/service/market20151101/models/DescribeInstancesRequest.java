// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancesRequest</p>
 */
public class DescribeInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Codes")
    private String codes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExceptCodes")
    private String exceptCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    private DescribeInstancesRequest(Builder builder) {
        super(builder);
        this.codes = builder.codes;
        this.exceptCodes = builder.exceptCodes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codes
     */
    public String getCodes() {
        return this.codes;
    }

    /**
     * @return exceptCodes
     */
    public String getExceptCodes() {
        return this.exceptCodes;
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesRequest, Builder> {
        private String codes; 
        private String exceptCodes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesRequest request) {
            super(request);
            this.codes = request.codes;
            this.exceptCodes = request.exceptCodes;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
        } 

        /**
         * <p>The commodity codes. Separate multiple codes with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj000112,cmgj000113</p>
         */
        public Builder codes(String codes) {
            this.putQueryParameter("Codes", codes);
            this.codes = codes;
            return this;
        }

        /**
         * <p>The commodity codes to exclude. This parameter cannot be specified together with the Codes parameter. Separate multiple codes with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj000114,cmgj000115</p>
         */
        public Builder exceptCodes(String exceptCodes) {
            this.putQueryParameter("ExceptCodes", exceptCodes);
            this.exceptCodes = exceptCodes;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The commodity type. Valid values:</p>
         * <ul>
         * <li>APP: application</li>
         * <li>SERVICE: service</li>
         * <li>MIRROR: image</li>
         * <li>DOWNLOAD: download</li>
         * <li>API_SERVICE: API</li>
         * <li>ROS: resource orchestration</li>
         * <li>DOCKER: container</li>
         * <li>IOT: IoT.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public DescribeInstancesRequest build() {
            return new DescribeInstancesRequest(this);
        } 

    } 

}
