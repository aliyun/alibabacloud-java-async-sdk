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
 * {@link DeleteEnterpriseAcceleratePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnterpriseAcceleratePolicyRequest</p>
 */
public class DeleteEnterpriseAcceleratePolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EapId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eapId;

    private DeleteEnterpriseAcceleratePolicyRequest(Builder builder) {
        super(builder);
        this.eapId = builder.eapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnterpriseAcceleratePolicyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEnterpriseAcceleratePolicyRequest, Builder> {
        private String eapId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnterpriseAcceleratePolicyRequest request) {
            super(request);
            this.eapId = request.eapId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-6edfb9d722ef8429</p>
         */
        public Builder eapId(String eapId) {
            this.putBodyParameter("EapId", eapId);
            this.eapId = eapId;
            return this;
        }

        @Override
        public DeleteEnterpriseAcceleratePolicyRequest build() {
            return new DeleteEnterpriseAcceleratePolicyRequest(this);
        } 

    } 

}
