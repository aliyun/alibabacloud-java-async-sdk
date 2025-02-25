// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPosChGeneralRequest} extends {@link RequestModel}
 *
 * <p>GetPosChGeneralRequest</p>
 */
public class GetPosChGeneralRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutType")
    private String outType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TokenizerId")
    private String tokenizerId;

    private GetPosChGeneralRequest(Builder builder) {
        super(builder);
        this.outType = builder.outType;
        this.serviceCode = builder.serviceCode;
        this.text = builder.text;
        this.tokenizerId = builder.tokenizerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPosChGeneralRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outType
     */
    public String getOutType() {
        return this.outType;
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
     * @return tokenizerId
     */
    public String getTokenizerId() {
        return this.tokenizerId;
    }

    public static final class Builder extends Request.Builder<GetPosChGeneralRequest, Builder> {
        private String outType; 
        private String serviceCode; 
        private String text; 
        private String tokenizerId; 

        private Builder() {
            super();
        } 

        private Builder(GetPosChGeneralRequest request) {
            super(request);
            this.outType = request.outType;
            this.serviceCode = request.serviceCode;
            this.text = request.text;
            this.tokenizerId = request.tokenizerId;
        } 

        /**
         * OutType.
         */
        public Builder outType(String outType) {
            this.putBodyParameter("OutType", outType);
            this.outType = outType;
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

        @Override
        public GetPosChGeneralRequest build() {
            return new GetPosChGeneralRequest(this);
        } 

    } 

}
