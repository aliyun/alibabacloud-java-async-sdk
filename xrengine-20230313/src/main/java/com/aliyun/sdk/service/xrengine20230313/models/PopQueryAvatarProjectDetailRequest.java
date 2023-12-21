// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopQueryAvatarProjectDetailRequest} extends {@link RequestModel}
 *
 * <p>PopQueryAvatarProjectDetailRequest</p>
 */
public class PopQueryAvatarProjectDetailRequest extends Request {
    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private PopQueryAvatarProjectDetailRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopQueryAvatarProjectDetailRequest create() {
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

    public static final class Builder extends Request.Builder<PopQueryAvatarProjectDetailRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(PopQueryAvatarProjectDetailRequest request) {
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
        public PopQueryAvatarProjectDetailRequest build() {
            return new PopQueryAvatarProjectDetailRequest(this);
        } 

    } 

}
