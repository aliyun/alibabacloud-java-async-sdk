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
 * {@link DeleteEnterpriseAccelerateTargetRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnterpriseAccelerateTargetRequest</p>
 */
public class DeleteEnterpriseAccelerateTargetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EapId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eapId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> target;

    private DeleteEnterpriseAccelerateTargetRequest(Builder builder) {
        super(builder);
        this.eapId = builder.eapId;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnterpriseAccelerateTargetRequest create() {
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

    /**
     * @return target
     */
    public java.util.List<String> getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<DeleteEnterpriseAccelerateTargetRequest, Builder> {
        private String eapId; 
        private java.util.List<String> target; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnterpriseAccelerateTargetRequest request) {
            super(request);
            this.eapId = request.eapId;
            this.target = request.target;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-ed1f0e392a28a4e6</p>
         */
        public Builder eapId(String eapId) {
            this.putBodyParameter("EapId", eapId);
            this.eapId = eapId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder target(java.util.List<String> target) {
            this.putBodyParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public DeleteEnterpriseAccelerateTargetRequest build() {
            return new DeleteEnterpriseAccelerateTargetRequest(this);
        } 

    } 

}
