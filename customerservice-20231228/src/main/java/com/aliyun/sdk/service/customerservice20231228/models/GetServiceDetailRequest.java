// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceDetailRequest} extends {@link RequestModel}
 *
 * <p>GetServiceDetailRequest</p>
 */
public class GetServiceDetailRequest extends Request {
    @Body
    @NameInMap("applyCode")
    private String applyCode;

    private GetServiceDetailRequest(Builder builder) {
        super(builder);
        this.applyCode = builder.applyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyCode
     */
    public String getApplyCode() {
        return this.applyCode;
    }

    public static final class Builder extends Request.Builder<GetServiceDetailRequest, Builder> {
        private String applyCode; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceDetailRequest request) {
            super(request);
            this.applyCode = request.applyCode;
        } 

        /**
         * applyCode.
         */
        public Builder applyCode(String applyCode) {
            this.putBodyParameter("applyCode", applyCode);
            this.applyCode = applyCode;
            return this;
        }

        @Override
        public GetServiceDetailRequest build() {
            return new GetServiceDetailRequest(this);
        } 

    } 

}
