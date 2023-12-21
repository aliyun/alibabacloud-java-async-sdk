// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopQueryLivePortraitModelScopeProjectDetailRequest} extends {@link RequestModel}
 *
 * <p>PopQueryLivePortraitModelScopeProjectDetailRequest</p>
 */
public class PopQueryLivePortraitModelScopeProjectDetailRequest extends Request {
    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private PopQueryLivePortraitModelScopeProjectDetailRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopQueryLivePortraitModelScopeProjectDetailRequest create() {
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

    public static final class Builder extends Request.Builder<PopQueryLivePortraitModelScopeProjectDetailRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(PopQueryLivePortraitModelScopeProjectDetailRequest request) {
            super(request);
            this.projectId = request.projectId;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public PopQueryLivePortraitModelScopeProjectDetailRequest build() {
            return new PopQueryLivePortraitModelScopeProjectDetailRequest(this);
        } 

    } 

}
