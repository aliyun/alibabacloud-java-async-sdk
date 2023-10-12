// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosticRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosticRequest</p>
 */
public class CreateDiagnosticRequest extends Request {
    @Query
    @NameInMap("DiagnosticKey")
    private String diagnosticKey;

    @Query
    @NameInMap("DiagnosticType")
    private String diagnosticType;

    @Query
    @NameInMap("Product")
    private String product;

    private CreateDiagnosticRequest(Builder builder) {
        super(builder);
        this.diagnosticKey = builder.diagnosticKey;
        this.diagnosticType = builder.diagnosticType;
        this.product = builder.product;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosticKey
     */
    public String getDiagnosticKey() {
        return this.diagnosticKey;
    }

    /**
     * @return diagnosticType
     */
    public String getDiagnosticType() {
        return this.diagnosticType;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    public static final class Builder extends Request.Builder<CreateDiagnosticRequest, Builder> {
        private String diagnosticKey; 
        private String diagnosticType; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosticRequest request) {
            super(request);
            this.diagnosticKey = request.diagnosticKey;
            this.diagnosticType = request.diagnosticType;
            this.product = request.product;
        } 

        /**
         * DiagnosticKey.
         */
        public Builder diagnosticKey(String diagnosticKey) {
            this.putQueryParameter("DiagnosticKey", diagnosticKey);
            this.diagnosticKey = diagnosticKey;
            return this;
        }

        /**
         * DiagnosticType.
         */
        public Builder diagnosticType(String diagnosticType) {
            this.putQueryParameter("DiagnosticType", diagnosticType);
            this.diagnosticType = diagnosticType;
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

        @Override
        public CreateDiagnosticRequest build() {
            return new CreateDiagnosticRequest(this);
        } 

    } 

}
