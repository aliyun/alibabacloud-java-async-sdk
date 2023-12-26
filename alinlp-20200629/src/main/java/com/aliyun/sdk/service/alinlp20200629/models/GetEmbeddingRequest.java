// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEmbeddingRequest} extends {@link RequestModel}
 *
 * <p>GetEmbeddingRequest</p>
 */
public class GetEmbeddingRequest extends Request {
    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    @Body
    @NameInMap("Text")
    private String text;

    @Body
    @NameInMap("TextType")
    private String textType;

    private GetEmbeddingRequest(Builder builder) {
        super(builder);
        this.serviceCode = builder.serviceCode;
        this.text = builder.text;
        this.textType = builder.textType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmbeddingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return textType
     */
    public String getTextType() {
        return this.textType;
    }

    public static final class Builder extends Request.Builder<GetEmbeddingRequest, Builder> {
        private String serviceCode; 
        private String text; 
        private String textType; 

        private Builder() {
            super();
        } 

        private Builder(GetEmbeddingRequest request) {
            super(request);
            this.serviceCode = request.serviceCode;
            this.text = request.text;
            this.textType = request.textType;
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
         * Text.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * TextType.
         */
        public Builder textType(String textType) {
            this.putBodyParameter("TextType", textType);
            this.textType = textType;
            return this;
        }

        @Override
        public GetEmbeddingRequest build() {
            return new GetEmbeddingRequest(this);
        } 

    } 

}
