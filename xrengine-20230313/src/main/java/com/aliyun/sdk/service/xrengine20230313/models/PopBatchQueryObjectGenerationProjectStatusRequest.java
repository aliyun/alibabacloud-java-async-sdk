// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopBatchQueryObjectGenerationProjectStatusRequest} extends {@link RequestModel}
 *
 * <p>PopBatchQueryObjectGenerationProjectStatusRequest</p>
 */
public class PopBatchQueryObjectGenerationProjectStatusRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("ProjectIds")
    @Validation(required = true)
    private String projectIds;

    private PopBatchQueryObjectGenerationProjectStatusRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.projectIds = builder.projectIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopBatchQueryObjectGenerationProjectStatusRequest create() {
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
     * @return projectIds
     */
    public String getProjectIds() {
        return this.projectIds;
    }

    public static final class Builder extends Request.Builder<PopBatchQueryObjectGenerationProjectStatusRequest, Builder> {
        private String jwtToken; 
        private String projectIds; 

        private Builder() {
            super();
        } 

        private Builder(PopBatchQueryObjectGenerationProjectStatusRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.projectIds = request.projectIds;
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
         * ProjectIds.
         */
        public Builder projectIds(String projectIds) {
            this.putBodyParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        @Override
        public PopBatchQueryObjectGenerationProjectStatusRequest build() {
            return new PopBatchQueryObjectGenerationProjectStatusRequest(this);
        } 

    } 

}
