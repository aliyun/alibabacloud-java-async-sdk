// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectRequest</p>
 */
public class DeleteProjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    private DeleteProjectRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProjectRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProjectRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProjectRequest request) {
            super(request);
            this.projectId = request.projectId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public DeleteProjectRequest build() {
            return new DeleteProjectRequest(this);
        } 

    } 

}
