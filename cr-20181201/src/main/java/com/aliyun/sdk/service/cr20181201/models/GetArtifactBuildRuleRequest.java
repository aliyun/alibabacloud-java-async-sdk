// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetArtifactBuildRuleRequest} extends {@link RequestModel}
 *
 * <p>GetArtifactBuildRuleRequest</p>
 */
public class GetArtifactBuildRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactType")
    private String artifactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildRuleId")
    private String buildRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeId")
    private String scopeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the artifact.</p>
         * <ul>
         * <li><code>ACCELERATED_IMAGE</code>: accelerated images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCELERATED_IMAGE</p>
         */
        public Builder artifactType(String artifactType) {
            this.putQueryParameter("ArtifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>The ID of the artifact building rule.</p>
         * 
         * <strong>example:</strong>
         * <p>crabr-o2670wqz2n70****</p>
         */
        public Builder buildRuleId(String buildRuleId) {
            this.putQueryParameter("BuildRuleId", buildRuleId);
            this.buildRuleId = buildRuleId;
            return this;
        }

        /**
         * <p>The ID of the Container Registry instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the effective range of the artifact building rule.</p>
         * <ul>
         * <li>Set the value to the ID of the image repository.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>crr-8dz3aedjqlmk****</p>
         */
        public Builder scopeId(String scopeId) {
            this.putQueryParameter("ScopeId", scopeId);
            this.scopeId = scopeId;
            return this;
        }

        /**
         * <p>The effective range of the artifact building rule. Valid values:</p>
         * <ul>
         * <li><code>REPOSITORY</code>: The artifact building rule is effective in the repository level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REPOSITORY</p>
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
