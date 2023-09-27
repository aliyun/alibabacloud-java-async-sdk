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
         * ArtifactType.
         */
        public Builder artifactType(String artifactType) {
            this.putQueryParameter("ArtifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScopeId.
         */
        public Builder scopeId(String scopeId) {
            this.putQueryParameter("ScopeId", scopeId);
            this.scopeId = scopeId;
            return this;
        }

        /**
         * ScopeType.
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
