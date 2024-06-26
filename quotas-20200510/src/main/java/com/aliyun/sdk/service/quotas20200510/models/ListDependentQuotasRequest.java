// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDependentQuotasRequest} extends {@link RequestModel}
 *
 * <p>ListDependentQuotasRequest</p>
 */
public class ListDependentQuotasRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaActionCode;

    private ListDependentQuotasRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDependentQuotasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return quotaActionCode
     */
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public static final class Builder extends Request.Builder<ListDependentQuotasRequest, Builder> {
        private String productCode; 
        private String quotaActionCode; 

        private Builder() {
            super();
        } 

        private Builder(ListDependentQuotasRequest request) {
            super(request);
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
        } 

        /**
         * The abbreviation of the Alibaba Cloud service name.
         * <p>
         * 
         * > For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The quota ID.
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        @Override
        public ListDependentQuotasRequest build() {
            return new ListDependentQuotasRequest(this);
        } 

    } 

}
