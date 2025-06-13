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
 * {@link CreateEnterpriseAccelerateTargetRequest} extends {@link RequestModel}
 *
 * <p>CreateEnterpriseAccelerateTargetRequest</p>
 */
public class CreateEnterpriseAccelerateTargetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EapId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eapId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> target;

    private CreateEnterpriseAccelerateTargetRequest(Builder builder) {
        super(builder);
        this.eapId = builder.eapId;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnterpriseAccelerateTargetRequest create() {
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

    public static final class Builder extends Request.Builder<CreateEnterpriseAccelerateTargetRequest, Builder> {
        private String eapId; 
        private java.util.List<String> target; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnterpriseAccelerateTargetRequest request) {
            super(request);
            this.eapId = request.eapId;
            this.target = request.target;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-eec34d4b12fcca61</p>
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
        public CreateEnterpriseAccelerateTargetRequest build() {
            return new CreateEnterpriseAccelerateTargetRequest(this);
        } 

    } 

}
