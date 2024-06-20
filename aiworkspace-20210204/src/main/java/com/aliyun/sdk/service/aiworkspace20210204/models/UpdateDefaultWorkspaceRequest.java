// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDefaultWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDefaultWorkspaceRequest</p>
 */
public class UpdateDefaultWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateDefaultWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDefaultWorkspaceRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDefaultWorkspaceRequest, Builder> {
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDefaultWorkspaceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateDefaultWorkspaceRequest build() {
            return new UpdateDefaultWorkspaceRequest(this);
        } 

    } 

}
