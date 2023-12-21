// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopBuildLivePortraitModelScopeProjectRequest} extends {@link RequestModel}
 *
 * <p>PopBuildLivePortraitModelScopeProjectRequest</p>
 */
public class PopBuildLivePortraitModelScopeProjectRequest extends Request {
    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private PopBuildLivePortraitModelScopeProjectRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopBuildLivePortraitModelScopeProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<PopBuildLivePortraitModelScopeProjectRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(PopBuildLivePortraitModelScopeProjectRequest request) {
            super(request);
            this.projectId = request.projectId;
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
        public PopBuildLivePortraitModelScopeProjectRequest build() {
            return new PopBuildLivePortraitModelScopeProjectRequest(this);
        } 

    } 

}
