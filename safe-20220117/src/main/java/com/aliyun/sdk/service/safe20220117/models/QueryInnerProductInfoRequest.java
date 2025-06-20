// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link QueryInnerProductInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryInnerProductInfoRequest</p>
 */
public class QueryInnerProductInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    private QueryInnerProductInfoRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.limit = builder.limit;
        this.page = builder.page;
        this.productCode = builder.productCode;
        this.reqTimestamp = builder.reqTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInnerProductInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    public static final class Builder extends Request.Builder<QueryInnerProductInfoRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private Integer limit; 
        private Integer page; 
        private String productCode; 
        private Long reqTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(QueryInnerProductInfoRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.limit = request.limit;
            this.page = request.page;
            this.productCode = request.productCode;
            this.reqTimestamp = request.reqTimestamp;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
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

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        @Override
        public QueryInnerProductInfoRequest build() {
            return new QueryInnerProductInfoRequest(this);
        } 

    } 

}
