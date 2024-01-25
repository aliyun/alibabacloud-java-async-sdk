// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWhitelistResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeWhitelistResourcesRequest</p>
 */
public class DescribeWhitelistResourcesRequest extends Request {
    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("ProductCode")
    private String productCode;

    private DescribeWhitelistResourcesRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.operaUid = builder.operaUid;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhitelistResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DescribeWhitelistResourcesRequest, Builder> {
        private String keyword; 
        private String operaUid; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWhitelistResourcesRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.operaUid = request.operaUid;
            this.productCode = request.productCode;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribeWhitelistResourcesRequest build() {
            return new DescribeWhitelistResourcesRequest(this);
        } 

    } 

}
