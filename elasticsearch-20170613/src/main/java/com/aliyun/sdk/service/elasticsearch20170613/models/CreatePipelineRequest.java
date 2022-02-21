// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineRequest</p>
 */
public class CreatePipelineRequest extends Request {
    @Path
    @NameInMap("ProjectId")
    private String projectId;

    private CreatePipelineRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePipelineRequest, Builder> {
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineRequest response) {
            super(response);
            this.projectId = response.projectId;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public CreatePipelineRequest build() {
            return new CreatePipelineRequest(this);
        } 

    } 

}
