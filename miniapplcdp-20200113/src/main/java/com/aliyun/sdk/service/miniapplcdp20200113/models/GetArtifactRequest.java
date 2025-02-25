// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactRequest} extends {@link RequestModel}
 *
 * <p>GetArtifactRequest</p>
 */
public class GetArtifactRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ArtifactId")
    @Validation(required = true)
    private String artifactId;

    @Query
    @NameInMap("Source")
    private String source;

    private GetArtifactRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.artifactId = builder.artifactId;
        this.source = builder.source;
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetArtifactRequest, Builder> {
        private String appId; 
        private String artifactId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetArtifactRequest request) {
            super(request);
            this.appId = request.appId;
            this.artifactId = request.artifactId;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public GetArtifactRequest build() {
            return new GetArtifactRequest(this);
        } 

    } 

}
