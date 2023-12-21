// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopBatchQueryObjectProjectStatusRequest} extends {@link RequestModel}
 *
 * <p>PopBatchQueryObjectProjectStatusRequest</p>
 */
public class PopBatchQueryObjectProjectStatusRequest extends Request {
    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("ProjectIds")
    @Validation(required = true)
    private String projectIds;

    private PopBatchQueryObjectProjectStatusRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.projectIds = builder.projectIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopBatchQueryObjectProjectStatusRequest create() {
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

    public static final class Builder extends Request.Builder<PopBatchQueryObjectProjectStatusRequest, Builder> {
        private String jwtToken; 
        private String projectIds; 

        private Builder() {
            super();
        } 

        private Builder(PopBatchQueryObjectProjectStatusRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.projectIds = request.projectIds;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
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
        public PopBatchQueryObjectProjectStatusRequest build() {
            return new PopBatchQueryObjectProjectStatusRequest(this);
        } 

    } 

}
