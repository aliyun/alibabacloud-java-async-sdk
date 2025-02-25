// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDiagnosticRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosticRequest</p>
 */
public class CreateDiagnosticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiagnosticKey")
    private String diagnosticKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiagnosticType")
    private String diagnosticType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    private CreateDiagnosticRequest(Builder builder) {
        super(builder);
        this.diagnosticKey = builder.diagnosticKey;
        this.diagnosticType = builder.diagnosticType;
        this.lang = builder.lang;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
        private String lang; 
        private String product; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosticRequest request) {
            super(request);
            this.diagnosticKey = request.diagnosticKey;
            this.diagnosticType = request.diagnosticType;
            this.lang = request.lang;
            this.product = request.product;
        } 

        /**
         * <p>The keyword in the diagnosis.</p>
         * <p>You can specify the ID of the stack that you want to diagnose.</p>
         * 
         * <strong>example:</strong>
         * <p>37A5679B-8488-5A5D-8D5C-90E66A577A5D</p>
         */
        public Builder diagnosticKey(String diagnosticKey) {
            this.putQueryParameter("DiagnosticKey", diagnosticKey);
            this.diagnosticKey = diagnosticKey;
            return this;
        }

        /**
         * <p>The type of the item that is diagnosed. Set the value to Stack, which specifies that the stack is diagnosed.</p>
         * 
         * <strong>example:</strong>
         * <p>Stack</p>
         */
        public Builder diagnosticType(String diagnosticType) {
            this.putQueryParameter("DiagnosticType", diagnosticType);
            this.diagnosticType = diagnosticType;
            return this;
        }

        /**
         * <p>The language of the diagnostic report to be generated. Only Chinese and English are supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>zh-cn</li>
         * <li>en</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the product that is diagonosed.</p>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
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
