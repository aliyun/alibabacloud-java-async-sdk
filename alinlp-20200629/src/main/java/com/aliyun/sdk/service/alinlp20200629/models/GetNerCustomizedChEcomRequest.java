// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNerCustomizedChEcomRequest} extends {@link RequestModel}
 *
 * <p>GetNerCustomizedChEcomRequest</p>
 */
public class GetNerCustomizedChEcomRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LexerId")
    private String lexerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private GetNerCustomizedChEcomRequest(Builder builder) {
        super(builder);
        this.lexerId = builder.lexerId;
        this.serviceCode = builder.serviceCode;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNerCustomizedChEcomRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lexerId
     */
    public String getLexerId() {
        return this.lexerId;
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

    public static final class Builder extends Request.Builder<GetNerCustomizedChEcomRequest, Builder> {
        private String lexerId; 
        private String serviceCode; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(GetNerCustomizedChEcomRequest request) {
            super(request);
            this.lexerId = request.lexerId;
            this.serviceCode = request.serviceCode;
            this.text = request.text;
        } 

        /**
         * LexerId.
         */
        public Builder lexerId(String lexerId) {
            this.putBodyParameter("LexerId", lexerId);
            this.lexerId = lexerId;
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

        @Override
        public GetNerCustomizedChEcomRequest build() {
            return new GetNerCustomizedChEcomRequest(this);
        } 

    } 

}
