// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNerChEcomRequest} extends {@link RequestModel}
 *
 * <p>GetNerChEcomRequest</p>
 */
public class GetNerChEcomRequest extends Request {
    @Body
    @NameInMap("LexerId")
    private String lexerId;

    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    @Body
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    private GetNerChEcomRequest(Builder builder) {
        super(builder);
        this.lexerId = builder.lexerId;
        this.serviceCode = builder.serviceCode;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNerChEcomRequest create() {
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

    public static final class Builder extends Request.Builder<GetNerChEcomRequest, Builder> {
        private String lexerId; 
        private String serviceCode; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(GetNerChEcomRequest request) {
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
        public GetNerChEcomRequest build() {
            return new GetNerChEcomRequest(this);
        } 

    } 

}
