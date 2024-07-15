// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactRepositoryCredentialsRequest} extends {@link RequestModel}
 *
 * <p>GetArtifactRepositoryCredentialsRequest</p>
 */
public class GetArtifactRepositoryCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployRegionId")
    private String deployRegionId;

    private GetArtifactRepositoryCredentialsRequest(Builder builder) {
        super(builder);
        this.artifactType = builder.artifactType;
        this.deployRegionId = builder.deployRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactRepositoryCredentialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return deployRegionId
     */
    public String getDeployRegionId() {
        return this.deployRegionId;
    }

    public static final class Builder extends Request.Builder<GetArtifactRepositoryCredentialsRequest, Builder> {
        private String artifactType; 
        private String deployRegionId; 

        private Builder() {
            super();
        } 

        private Builder(GetArtifactRepositoryCredentialsRequest request) {
            super(request);
            this.artifactType = request.artifactType;
            this.deployRegionId = request.deployRegionId;
        } 

        /**
         * The type of the deployment package. Valid values:
         * <p>
         * 
         * *   File: Object Storage Service (OSS) object.
         * *   AcrImage: container image.
         */
        public Builder artifactType(String artifactType) {
            this.putQueryParameter("ArtifactType", artifactType);
            this.artifactType = artifactType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder deployRegionId(String deployRegionId) {
            this.putQueryParameter("DeployRegionId", deployRegionId);
            this.deployRegionId = deployRegionId;
            return this;
        }

        @Override
        public GetArtifactRepositoryCredentialsRequest build() {
            return new GetArtifactRepositoryCredentialsRequest(this);
        } 

    } 

}
