// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactRequest} extends {@link RequestModel}
 *
 * <p>GetArtifactRequest</p>
 */
public class GetArtifactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactId")
    private String artifactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactName")
    private String artifactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactVersion")
    private String artifactVersion;

    private GetArtifactRequest(Builder builder) {
        super(builder);
        this.artifactId = builder.artifactId;
        this.artifactName = builder.artifactName;
        this.artifactVersion = builder.artifactVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactRequest create() {
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
     * @return artifactName
     */
    public String getArtifactName() {
        return this.artifactName;
    }

    /**
     * @return artifactVersion
     */
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    public static final class Builder extends Request.Builder<GetArtifactRequest, Builder> {
        private String artifactId; 
        private String artifactName; 
        private String artifactVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetArtifactRequest request) {
            super(request);
            this.artifactId = request.artifactId;
            this.artifactName = request.artifactName;
            this.artifactVersion = request.artifactVersion;
        } 

        /**
         * ArtifactId.
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * ArtifactName.
         */
        public Builder artifactName(String artifactName) {
            this.putQueryParameter("ArtifactName", artifactName);
            this.artifactName = artifactName;
            return this;
        }

        /**
         * ArtifactVersion.
         */
        public Builder artifactVersion(String artifactVersion) {
            this.putQueryParameter("ArtifactVersion", artifactVersion);
            this.artifactVersion = artifactVersion;
            return this;
        }

        @Override
        public GetArtifactRequest build() {
            return new GetArtifactRequest(this);
        } 

    } 

}
