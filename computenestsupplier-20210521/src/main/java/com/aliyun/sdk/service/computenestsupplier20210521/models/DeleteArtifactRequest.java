// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteArtifactRequest} extends {@link RequestModel}
 *
 * <p>DeleteArtifactRequest</p>
 */
public class DeleteArtifactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactVersion")
    private String artifactVersion;

    private DeleteArtifactRequest(Builder builder) {
        super(builder);
        this.artifactId = builder.artifactId;
        this.artifactVersion = builder.artifactVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteArtifactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return artifactVersion
     */
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    public static final class Builder extends Request.Builder<DeleteArtifactRequest, Builder> {
        private String artifactId; 
        private String artifactVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteArtifactRequest request) {
            super(request);
            this.artifactId = request.artifactId;
            this.artifactVersion = request.artifactVersion;
        } 

        /**
         * The ID of the artifact.
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * The version of the artifact.
         */
        public Builder artifactVersion(String artifactVersion) {
            this.putQueryParameter("ArtifactVersion", artifactVersion);
            this.artifactVersion = artifactVersion;
            return this;
        }

        @Override
        public DeleteArtifactRequest build() {
            return new DeleteArtifactRequest(this);
        } 

    } 

}
