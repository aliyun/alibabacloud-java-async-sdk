// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableBillGenerationRequest} extends {@link RequestModel}
 *
 * <p>EnableBillGenerationRequest</p>
 */
public class EnableBillGenerationRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    @Validation(required = true)
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    private EnableBillGenerationRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableBillGenerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<EnableBillGenerationRequest, Builder> {
        private Long ownerId; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(EnableBillGenerationRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.productCode = response.productCode;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public EnableBillGenerationRequest build() {
            return new EnableBillGenerationRequest(this);
        } 

    } 

}
