// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateArtifactBuildRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateArtifactBuildRuleRequest</p>
 */
public class CreateArtifactBuildRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ArtifactType")
    @Validation(required = true)
    private String artifactType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @Query
    @NameInMap("ScopeId")
    @Validation(required = true)
    private String scopeId;

    @Query
    @NameInMap("ScopeType")
    @Validation(required = true)
    private String scopeType;

    private CreateArtifactBuildRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.artifactType = builder.artifactType;
        this.instanceId = builder.instanceId;
        this.parameters = builder.parameters;
        this.scopeId = builder.scopeId;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateArtifactBuildRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return scopeId
     */
    public String getScopeId() {
        return this.scopeId;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    public static final class Builder extends Request.Builder<CreateArtifactBuildRuleRequest, Builder> {
        private String regionId; 
        private String artifactType; 
        private String instanceId; 
        private java.util.Map < String, ? > parameters; 
        private String scopeId; 
        private String scopeType; 

        private Builder() {
            super();
        } 

        private Builder(CreateArtifactBuildRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.artifactType = request.artifactType;
            this.instanceId = request.instanceId;
            this.parameters = request.parameters;
            this.scopeId = request.scopeId;
            this.scopeType = request.scopeType;
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
         * The type of the artifact.
         * <p>
         * 
         * *   `ACCELERATED_IMAGE`: accelerated images.
         */
        public Builder artifactType(String artifactType) {
            this.putQueryParameter("ArtifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Additional parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * The ID of the effective range of the rule.
         * <p>
         * 
         * *   Set the value to the ID of the image repository.
         */
        public Builder scopeId(String scopeId) {
            this.putQueryParameter("ScopeId", scopeId);
            this.scopeId = scopeId;
            return this;
        }

        /**
         * The effective range of the rule. Valid values:
         * <p>
         * 
         * *   `REPOSITORY`
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        @Override
        public CreateArtifactBuildRuleRequest build() {
            return new CreateArtifactBuildRuleRequest(this);
        } 

    } 

}
