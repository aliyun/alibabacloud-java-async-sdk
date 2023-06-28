// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProductRequest} extends {@link RequestModel}
 *
 * <p>AddProductRequest</p>
 */
public class AddProductRequest extends Request {
    @Query
    @NameInMap("PackId")
    @Validation(required = true)
    private String packId;

    @Query
    @NameInMap("Product")
    @Validation(required = true)
    private String product;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private AddProductRequest(Builder builder) {
        super(builder);
        this.packId = builder.packId;
        this.product = builder.product;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return packId
     */
    public String getPackId() {
        return this.packId;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<AddProductRequest, Builder> {
        private String packId; 
        private String product; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(AddProductRequest request) {
            super(request);
            this.packId = request.packId;
            this.product = request.product;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * PackId.
         */
        public Builder packId(String packId) {
            this.putQueryParameter("PackId", packId);
            this.packId = packId;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public AddProductRequest build() {
            return new AddProductRequest(this);
        } 

    } 

}
