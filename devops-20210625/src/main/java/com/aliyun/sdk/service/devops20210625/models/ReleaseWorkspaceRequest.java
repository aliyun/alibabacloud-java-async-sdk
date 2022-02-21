// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseWorkspaceRequest</p>
 */
public class ReleaseWorkspaceRequest extends Request {
    @Path
    @NameInMap("workspaceId")
    @Validation(required = true)
    private String workspaceId;

    private ReleaseWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseWorkspaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ReleaseWorkspaceRequest, Builder> {
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseWorkspaceRequest response) {
            super(response);
            this.workspaceId = response.workspaceId;
        } 

        /**
         * 工作空间唯一标识
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ReleaseWorkspaceRequest build() {
            return new ReleaseWorkspaceRequest(this);
        } 

    } 

}
