// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineBuildRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineBuildRequest</p>
 */
public class CreateRoutineBuildRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactUrl")
    private String artifactUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Branch")
    private String branch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routineName;

    private CreateRoutineBuildRequest(Builder builder) {
        super(builder);
        this.artifactUrl = builder.artifactUrl;
        this.branch = builder.branch;
        this.routineName = builder.routineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineBuildRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactUrl
     */
    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    /**
     * @return branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @return routineName
     */
    public String getRoutineName() {
        return this.routineName;
    }

    public static final class Builder extends Request.Builder<CreateRoutineBuildRequest, Builder> {
        private String artifactUrl; 
        private String branch; 
        private String routineName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineBuildRequest request) {
            super(request);
            this.artifactUrl = request.artifactUrl;
            this.branch = request.branch;
            this.routineName = request.routineName;
        } 

        /**
         * <p>The OSS object URL. This parameter is required in upload mode but is not required in git mode.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bucket.oss-.aliyuncs.com/key">https://bucket.oss-.aliyuncs.com/key</a></p>
         */
        public Builder artifactUrl(String artifactUrl) {
            this.putQueryParameter("ArtifactUrl", artifactUrl);
            this.artifactUrl = artifactUrl;
            return this;
        }

        /**
         * <p>The name of the branch to build. This parameter is not required in upload mode but is required in git mode.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder branch(String branch) {
            this.putQueryParameter("Branch", branch);
            this.branch = branch;
            return this;
        }

        /**
         * <p>The ER name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rwa-test</p>
         */
        public Builder routineName(String routineName) {
            this.putQueryParameter("RoutineName", routineName);
            this.routineName = routineName;
            return this;
        }

        @Override
        public CreateRoutineBuildRequest build() {
            return new CreateRoutineBuildRequest(this);
        } 

    } 

}
