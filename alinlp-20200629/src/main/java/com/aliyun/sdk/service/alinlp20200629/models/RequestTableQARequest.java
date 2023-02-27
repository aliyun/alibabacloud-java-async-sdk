// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestTableQARequest} extends {@link RequestModel}
 *
 * <p>RequestTableQARequest</p>
 */
public class RequestTableQARequest extends Request {
    @Body
    @NameInMap("Params")
    @Validation(required = true)
    private String params;

    @Body
    @NameInMap("ServiceCode")
    @Validation(required = true)
    private String serviceCode;

    private RequestTableQARequest(Builder builder) {
        super(builder);
        this.params = builder.params;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestTableQARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<RequestTableQARequest, Builder> {
        private String params; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(RequestTableQARequest request) {
            super(request);
            this.params = request.params;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
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

        @Override
        public RequestTableQARequest build() {
            return new RequestTableQARequest(this);
        } 

    } 

}
