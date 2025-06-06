// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DisableEnterpriseAcceleratePolicyRequest} extends {@link RequestModel}
 *
 * <p>DisableEnterpriseAcceleratePolicyRequest</p>
 */
public class DisableEnterpriseAcceleratePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EapId")
    private String eapId;

    private DisableEnterpriseAcceleratePolicyRequest(Builder builder) {
        super(builder);
        this.eapId = builder.eapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableEnterpriseAcceleratePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eapId
     */
    public String getEapId() {
        return this.eapId;
    }

    public static final class Builder extends Request.Builder<DisableEnterpriseAcceleratePolicyRequest, Builder> {
        private String eapId; 

        private Builder() {
            super();
        } 

        private Builder(DisableEnterpriseAcceleratePolicyRequest request) {
            super(request);
            this.eapId = request.eapId;
        } 

        /**
         * EapId.
         */
        public Builder eapId(String eapId) {
            this.putBodyParameter("EapId", eapId);
            this.eapId = eapId;
            return this;
        }

        @Override
        public DisableEnterpriseAcceleratePolicyRequest build() {
            return new DisableEnterpriseAcceleratePolicyRequest(this);
        } 

    } 

}
