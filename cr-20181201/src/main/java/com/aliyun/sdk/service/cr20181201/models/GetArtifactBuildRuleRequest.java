// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactBuildRuleRequest} extends {@link RequestModel}
 *
 * <p>GetArtifactBuildRuleRequest</p>
 */
public class GetArtifactBuildRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ArtifactType")
    private String artifactType;

    @Query
    @NameInMap("BuildRuleId")
    private String buildRuleId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ScopeId")
    private String scopeId;

    @Query
    @NameInMap("ScopeType")
    private String scopeType;

    private GetArtifactBuildRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.artifactType = builder.artifactType;
        this.buildRuleId = builder.buildRuleId;
        this.instanceId = builder.instanceId;
        this.scopeId = builder.scopeId;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactBuildRuleRequest create() {
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
     * @return buildRuleId
     */
    public String getBuildRuleId() {
        return this.buildRuleId;
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

    public static final class Builder extends Request.Builder<GetArtifactBuildRuleRequest, Builder> {
        private String regionId; 
        private String artifactType; 
        private String buildRuleId; 
        private String instanceId; 
        private String scopeId; 
        private String scopeType; 

        private Builder() {
            super();
        } 

        private Builder(GetArtifactBuildRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.artifactType = request.artifactType;
            this.buildRuleId = request.buildRuleId;
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
         * BuildRuleId.
         */
        public Builder buildRuleId(String buildRuleId) {
            this.putQueryParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
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
        public GetArtifactBuildRuleRequest build() {
            return new GetArtifactBuildRuleRequest(this);
        } 

    } 

}
