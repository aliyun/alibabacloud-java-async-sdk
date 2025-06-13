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
 * {@link EnableEnterpriseAcceleratePolicyRequest} extends {@link RequestModel}
 *
 * <p>EnableEnterpriseAcceleratePolicyRequest</p>
 */
public class EnableEnterpriseAcceleratePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EapId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eapId;

    private EnableEnterpriseAcceleratePolicyRequest(Builder builder) {
        super(builder);
        this.eapId = builder.eapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableEnterpriseAcceleratePolicyRequest create() {
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

    public static final class Builder extends Request.Builder<EnableEnterpriseAcceleratePolicyRequest, Builder> {
        private String eapId; 

        private Builder() {
            super();
        } 

        private Builder(EnableEnterpriseAcceleratePolicyRequest request) {
            super(request);
            this.eapId = request.eapId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-530da9f7110441fb</p>
         */
        public Builder eapId(String eapId) {
            this.putBodyParameter("EapId", eapId);
            this.eapId = eapId;
            return this;
        }

        @Override
        public EnableEnterpriseAcceleratePolicyRequest build() {
            return new EnableEnterpriseAcceleratePolicyRequest(this);
        } 

    } 

}
