// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWeChGeneralRequest} extends {@link RequestModel}
 *
 * <p>GetWeChGeneralRequest</p>
 */
public class GetWeChGeneralRequest extends Request {
    @Body
    @NameInMap("Operation")
    private String operation;

    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    @Body
    @NameInMap("Size")
    private String size;

    @Body
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    @Body
    @NameInMap("Type")
    private String type;

    private GetWeChGeneralRequest(Builder builder) {
        super(builder);
        this.operation = builder.operation;
        this.serviceCode = builder.serviceCode;
        this.size = builder.size;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWeChGeneralRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetWeChGeneralRequest, Builder> {
        private String operation; 
        private String serviceCode; 
        private String size; 
        private String text; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetWeChGeneralRequest request) {
            super(request);
            this.operation = request.operation;
            this.serviceCode = request.serviceCode;
            this.size = request.size;
            this.text = request.text;
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
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetWeChGeneralRequest build() {
            return new GetWeChGeneralRequest(this);
        } 

    } 

}
