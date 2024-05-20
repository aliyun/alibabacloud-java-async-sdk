// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWeChCommentRequest} extends {@link RequestModel}
 *
 * <p>GetWeChCommentRequest</p>
 */
public class GetWeChCommentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TokenizerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tokenizerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetWeChCommentRequest(Builder builder) {
        super(builder);
        this.operation = builder.operation;
        this.serviceCode = builder.serviceCode;
        this.size = builder.size;
        this.text = builder.text;
        this.tokenizerId = builder.tokenizerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWeChCommentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return tokenizerId
     */
    public String getTokenizerId() {
        return this.tokenizerId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetWeChCommentRequest, Builder> {
        private String operation; 
        private String serviceCode; 
        private String size; 
        private String text; 
        private String tokenizerId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetWeChCommentRequest request) {
            super(request);
            this.operation = request.operation;
            this.serviceCode = request.serviceCode;
            this.size = request.size;
            this.text = request.text;
            this.tokenizerId = request.tokenizerId;
            this.type = request.type;
        } 

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putBodyParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(String size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * TokenizerId.
         */
        public Builder tokenizerId(String tokenizerId) {
            this.putBodyParameter("TokenizerId", tokenizerId);
            this.tokenizerId = tokenizerId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetWeChCommentRequest build() {
            return new GetWeChCommentRequest(this);
        } 

    } 

}
