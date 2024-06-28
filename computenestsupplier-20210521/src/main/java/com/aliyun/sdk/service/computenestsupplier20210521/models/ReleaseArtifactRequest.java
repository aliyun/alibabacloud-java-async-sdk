// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseArtifactRequest} extends {@link RequestModel}
 *
 * <p>ReleaseArtifactRequest</p>
 */
public class ReleaseArtifactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactId;

    private ReleaseArtifactRequest(Builder builder) {
        super(builder);
        this.artifactId = builder.artifactId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseArtifactRequest create() {
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

    public static final class Builder extends Request.Builder<ReleaseArtifactRequest, Builder> {
        private String artifactId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseArtifactRequest request) {
            super(request);
            this.artifactId = request.artifactId;
        } 

        /**
         * The ID of the artifact.
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        @Override
        public ReleaseArtifactRequest build() {
            return new ReleaseArtifactRequest(this);
        } 

    } 

}
