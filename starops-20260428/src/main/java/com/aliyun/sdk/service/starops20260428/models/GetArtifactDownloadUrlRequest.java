// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link GetArtifactDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetArtifactDownloadUrlRequest</p>
 */
public class GetArtifactDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("artifactPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactPath;

    private GetArtifactDownloadUrlRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.artifactPath = builder.artifactPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return artifactPath
     */
    public String getArtifactPath() {
        return this.artifactPath;
    }

    public static final class Builder extends Request.Builder<GetArtifactDownloadUrlRequest, Builder> {
        private String name; 
        private String artifactPath; 

        private Builder() {
            super();
        } 

        private Builder(GetArtifactDownloadUrlRequest request) {
            super(request);
            this.name = request.name;
            this.artifactPath = request.artifactPath;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sample-agent</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reports/summary.pdf</p>
         */
        public Builder artifactPath(String artifactPath) {
            this.putQueryParameter("artifactPath", artifactPath);
            this.artifactPath = artifactPath;
            return this;
        }

        @Override
        public GetArtifactDownloadUrlRequest build() {
            return new GetArtifactDownloadUrlRequest(this);
        } 

    } 

}
