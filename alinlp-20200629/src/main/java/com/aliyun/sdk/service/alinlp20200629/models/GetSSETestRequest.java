// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSSETestRequest} extends {@link RequestModel}
 *
 * <p>GetSSETestRequest</p>
 */
public class GetSSETestRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    private GetSSETestRequest(Builder builder) {
        super(builder);
        this.params = builder.params;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSSETestRequest create() {
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

    public static final class Builder extends Request.Builder<GetSSETestRequest, Builder> {
        private String params; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetSSETestRequest request) {
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
        public GetSSETestRequest build() {
            return new GetSSETestRequest(this);
        } 

    } 

}
