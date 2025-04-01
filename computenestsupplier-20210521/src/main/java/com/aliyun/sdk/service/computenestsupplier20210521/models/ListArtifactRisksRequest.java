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
 * {@link ListArtifactRisksRequest} extends {@link RequestModel}
 *
 * <p>ListArtifactRisksRequest</p>
 */
public class ListArtifactRisksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactId")
    private String artifactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactVersion")
    private String artifactVersion;

    private ListArtifactRisksRequest(Builder builder) {
        super(builder);
        this.artifactId = builder.artifactId;
        this.artifactVersion = builder.artifactVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactRisksRequest create() {
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

    public static final class Builder extends Request.Builder<ListArtifactRisksRequest, Builder> {
        private String artifactId; 
        private String artifactVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListArtifactRisksRequest request) {
            super(request);
            this.artifactId = request.artifactId;
            this.artifactVersion = request.artifactVersion;
        } 

        /**
         * <p>Artifact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>artifact-3fd95cdfdf0d4b1fa00c</p>
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * <p>Artifact version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder artifactVersion(String artifactVersion) {
            this.putQueryParameter("ArtifactVersion", artifactVersion);
            this.artifactVersion = artifactVersion;
            return this;
        }

        @Override
        public ListArtifactRisksRequest build() {
            return new ListArtifactRisksRequest(this);
        } 

    } 

}
