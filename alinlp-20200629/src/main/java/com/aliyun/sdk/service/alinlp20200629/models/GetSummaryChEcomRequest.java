// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSummaryChEcomRequest} extends {@link RequestModel}
 *
 * <p>GetSummaryChEcomRequest</p>
 */
public class GetSummaryChEcomRequest extends Request {
    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    @Body
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    private GetSummaryChEcomRequest(Builder builder) {
        super(builder);
        this.serviceCode = builder.serviceCode;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSummaryChEcomRequest create() {
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

    public static final class Builder extends Request.Builder<GetSummaryChEcomRequest, Builder> {
        private String serviceCode; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(GetSummaryChEcomRequest request) {
            super(request);
            this.serviceCode = request.serviceCode;
            this.text = request.text;
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
        public GetSummaryChEcomRequest build() {
            return new GetSummaryChEcomRequest(this);
        } 

    } 

}
