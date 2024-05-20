// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserUploadSignRequest} extends {@link RequestModel}
 *
 * <p>GetUserUploadSignRequest</p>
 */
public class GetUserUploadSignRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    private GetUserUploadSignRequest(Builder builder) {
        super(builder);
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserUploadSignRequest create() {
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

    public static final class Builder extends Request.Builder<GetUserUploadSignRequest, Builder> {
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetUserUploadSignRequest request) {
            super(request);
            this.serviceCode = request.serviceCode;
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
        public GetUserUploadSignRequest build() {
            return new GetUserUploadSignRequest(this);
        } 

    } 

}
