// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableControlPlaneLogAlertRequest} extends {@link RequestModel}
 *
 * <p>DisableControlPlaneLogAlertRequest</p>
 */
public class DisableControlPlaneLogAlertRequest extends Request {
    @Body
    @NameInMap("RuleId")
    private String ruleId;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DisableControlPlaneLogAlertRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableControlPlaneLogAlertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DisableControlPlaneLogAlertRequest, Builder> {
        private String ruleId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DisableControlPlaneLogAlertRequest response) {
            super(response);
            this.ruleId = response.ruleId;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DisableControlPlaneLogAlertRequest build() {
            return new DisableControlPlaneLogAlertRequest(this);
        } 

    } 

}
