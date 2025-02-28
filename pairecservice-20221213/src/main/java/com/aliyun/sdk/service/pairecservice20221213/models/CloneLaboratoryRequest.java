// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CloneLaboratoryRequest} extends {@link RequestModel}
 *
 * <p>CloneLaboratoryRequest</p>
 */
public class CloneLaboratoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LaboratoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String laboratoryId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloneExperimentGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean cloneExperimentGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private CloneLaboratoryRequest(Builder builder) {
        super(builder);
        this.laboratoryId = builder.laboratoryId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private Boolean cloneExperimentGroup; 
        private String environment; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CloneLaboratoryRequest request) {
            super(request);
            this.laboratoryId = request.laboratoryId;
            this.regionId = request.regionId;
            this.cloneExperimentGroup = request.cloneExperimentGroup;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder laboratoryId(String laboratoryId) {
            this.putPathParameter("LaboratoryId", laboratoryId);
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder cloneExperimentGroup(Boolean cloneExperimentGroup) {
            this.putBodyParameter("CloneExperimentGroup", cloneExperimentGroup);
            this.cloneExperimentGroup = cloneExperimentGroup;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-abcdefg1234</p>
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
