// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserLogDeliveryQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetUserLogDeliveryQuotaRequest</p>
 */
public class GetUserLogDeliveryQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    private GetUserLogDeliveryQuotaRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserLogDeliveryQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    public static final class Builder extends Request.Builder<GetUserLogDeliveryQuotaRequest, Builder> {
        private String businessType; 

        private Builder() {
            super();
        } 

        private Builder(GetUserLogDeliveryQuotaRequest request) {
            super(request);
            this.businessType = request.businessType;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        @Override
        public GetUserLogDeliveryQuotaRequest build() {
            return new GetUserLogDeliveryQuotaRequest(this);
        } 

    } 

}
