// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopBuildObjectGenerationProjectRequest} extends {@link RequestModel}
 *
 * <p>PopBuildObjectGenerationProjectRequest</p>
 */
public class PopBuildObjectGenerationProjectRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private PopBuildObjectGenerationProjectRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopBuildObjectGenerationProjectRequest create() {
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

    public static final class Builder extends Request.Builder<PopBuildObjectGenerationProjectRequest, Builder> {
        private String jwtToken; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(PopBuildObjectGenerationProjectRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.projectId = request.projectId;
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
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public PopBuildObjectGenerationProjectRequest build() {
            return new PopBuildObjectGenerationProjectRequest(this);
        } 

    } 

}
