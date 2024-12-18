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
 * {@link DescribeApiMeteringRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiMeteringRequest</p>
 */
public class DescribeApiMeteringRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    private DescribeApiMeteringRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.productCode = builder.productCode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiMeteringRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeApiMeteringRequest, Builder> {
        private Integer pageNum; 
        private String productCode; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiMeteringRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.productCode = request.productCode;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * productCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeApiMeteringRequest build() {
            return new DescribeApiMeteringRequest(this);
        } 

    } 

}
