// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableControlPlaneLogAlertRequest} extends {@link RequestModel}
 *
 * <p>EnableControlPlaneLogAlertRequest</p>
 */
public class EnableControlPlaneLogAlertRequest extends Request {
    @Body
    @NameInMap("ActionPolicyId")
    private String actionPolicyId;

    @Body
    @NameInMap("RuleId")
    private String ruleId;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private EnableControlPlaneLogAlertRequest(Builder builder) {
        super(builder);
        this.actionPolicyId = builder.actionPolicyId;
        this.ruleId = builder.ruleId;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableControlPlaneLogAlertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionPolicyId
     */
    public String getActionPolicyId() {
        return this.actionPolicyId;
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

    public static final class Builder extends Request.Builder<EnableControlPlaneLogAlertRequest, Builder> {
        private String actionPolicyId; 
        private String ruleId; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(EnableControlPlaneLogAlertRequest response) {
            super(response);
            this.actionPolicyId = response.actionPolicyId;
            this.ruleId = response.ruleId;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * ActionPolicyId.
         */
        public Builder actionPolicyId(String actionPolicyId) {
            this.putBodyParameter("ActionPolicyId", actionPolicyId);
            this.actionPolicyId = actionPolicyId;
            return this;
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
        public EnableControlPlaneLogAlertRequest build() {
            return new EnableControlPlaneLogAlertRequest(this);
        } 

    } 

}
