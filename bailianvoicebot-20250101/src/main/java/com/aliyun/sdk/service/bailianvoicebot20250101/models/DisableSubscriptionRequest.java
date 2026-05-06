// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>DisableSubscriptionRequest</p>
 */
public class DisableSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    private DisableSubscriptionRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableSubscriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public static final class Builder extends Request.Builder<DisableSubscriptionRequest, Builder> {
        private String businessUnitId; 

        private Builder() {
            super();
        } 

        private Builder(DisableSubscriptionRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        @Override
        public DisableSubscriptionRequest build() {
            return new DisableSubscriptionRequest(this);
        } 

    } 

}
