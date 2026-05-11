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
 * {@link GetArtifactRequest} extends {@link RequestModel}
 *
 * <p>GetArtifactRequest</p>
 */
public class GetArtifactRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("artifactPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactPath;

    private GetArtifactRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.artifactPath = builder.artifactPath;
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

    public static final class Builder extends Request.Builder<GetArtifactRequest, Builder> {
        private String name; 
        private String artifactPath; 

        private Builder() {
            super();
        } 

        private Builder(GetArtifactRequest request) {
            super(request);
            this.name = request.name;
            this.artifactPath = request.artifactPath;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>missions/mission-xxx/artifacts/2026-05/05-01/xxxx.md</p>
         */
        public Builder artifactPath(String artifactPath) {
            this.putQueryParameter("artifactPath", artifactPath);
            this.artifactPath = artifactPath;
            return this;
        }

        @Override
        public GetArtifactRequest build() {
            return new GetArtifactRequest(this);
        } 

    } 

}
