// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneLaboratoryRequest} extends {@link RequestModel}
 *
 * <p>CloneLaboratoryRequest</p>
 */
public class CloneLaboratoryRequest extends Request {
    @Path
    @NameInMap("LaboratoryId")
    @Validation(required = true)
    private String laboratoryId;

    @Body
    @NameInMap("CloneExperimentGroup")
    @Validation(required = true)
    private Boolean cloneExperimentGroup;

    @Body
    @NameInMap("Environment")
    @Validation(required = true)
    private String environment;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private CloneLaboratoryRequest(Builder builder) {
        super(builder);
        this.laboratoryId = builder.laboratoryId;
        this.cloneExperimentGroup = builder.cloneExperimentGroup;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneLaboratoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return laboratoryId
     */
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    /**
     * @return cloneExperimentGroup
     */
    public Boolean getCloneExperimentGroup() {
        return this.cloneExperimentGroup;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CloneLaboratoryRequest, Builder> {
        private String laboratoryId; 
        private Boolean cloneExperimentGroup; 
        private String environment; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CloneLaboratoryRequest request) {
            super(request);
            this.laboratoryId = request.laboratoryId;
            this.cloneExperimentGroup = request.cloneExperimentGroup;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
        } 

        /**
         * LaboratoryId.
         */
        public Builder laboratoryId(String laboratoryId) {
            this.putPathParameter("LaboratoryId", laboratoryId);
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * CloneExperimentGroup.
         */
        public Builder cloneExperimentGroup(Boolean cloneExperimentGroup) {
            this.putBodyParameter("CloneExperimentGroup", cloneExperimentGroup);
            this.cloneExperimentGroup = cloneExperimentGroup;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CloneLaboratoryRequest build() {
            return new CloneLaboratoryRequest(this);
        } 

    } 

}
