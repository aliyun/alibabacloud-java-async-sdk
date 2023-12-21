// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopGetAITryOnJobRequest} extends {@link RequestModel}
 *
 * <p>PopGetAITryOnJobRequest</p>
 */
public class PopGetAITryOnJobRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("WithMaterial")
    private Boolean withMaterial;

    @Query
    @NameInMap("WithResult")
    private Boolean withResult;

    private PopGetAITryOnJobRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.projectId = builder.projectId;
        this.withMaterial = builder.withMaterial;
        this.withResult = builder.withResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopGetAITryOnJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return withMaterial
     */
    public Boolean getWithMaterial() {
        return this.withMaterial;
    }

    /**
     * @return withResult
     */
    public Boolean getWithResult() {
        return this.withResult;
    }

    public static final class Builder extends Request.Builder<PopGetAITryOnJobRequest, Builder> {
        private String jwtToken; 
        private String projectId; 
        private Boolean withMaterial; 
        private Boolean withResult; 

        private Builder() {
            super();
        } 

        private Builder(PopGetAITryOnJobRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.projectId = request.projectId;
            this.withMaterial = request.withMaterial;
            this.withResult = request.withResult;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * WithMaterial.
         */
        public Builder withMaterial(Boolean withMaterial) {
            this.putQueryParameter("WithMaterial", withMaterial);
            this.withMaterial = withMaterial;
            return this;
        }

        /**
         * WithResult.
         */
        public Builder withResult(Boolean withResult) {
            this.putQueryParameter("WithResult", withResult);
            this.withResult = withResult;
            return this;
        }

        @Override
        public PopGetAITryOnJobRequest build() {
            return new PopGetAITryOnJobRequest(this);
        } 

    } 

}
