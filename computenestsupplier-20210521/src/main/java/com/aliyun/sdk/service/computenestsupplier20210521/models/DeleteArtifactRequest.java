// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private DeleteArtifactRequest(Builder builder) {
        super(builder);
        this.artifactId = builder.artifactId;
        this.artifactVersion = builder.artifactVersion;
        this.clientToken = builder.clientToken;
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

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteArtifactRequest, Builder> {
        private String artifactId; 
        private String artifactVersion; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteArtifactRequest request) {
            super(request);
            this.artifactId = request.artifactId;
            this.artifactVersion = request.artifactVersion;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The ID of the artifact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact-eea08d1e2d3a43aexxxx</p>
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * <p>The version of the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder artifactVersion(String artifactVersion) {
            this.putQueryParameter("ArtifactVersion", artifactVersion);
            this.artifactVersion = artifactVersion;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>788E7CP0EN9D51P</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public DeleteArtifactRequest build() {
            return new DeleteArtifactRequest(this);
        } 

    } 

}
