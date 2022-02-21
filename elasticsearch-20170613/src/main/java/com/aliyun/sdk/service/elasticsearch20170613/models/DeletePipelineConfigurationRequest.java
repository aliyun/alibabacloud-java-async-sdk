// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DeletePipelineConfigurationRequest</p>
 */
public class DeletePipelineConfigurationRequest extends Request {
    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Path
    @NameInMap("PipelineId")
    @Validation(required = true)
    private String pipelineId;

    @Path
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DeletePipelineConfigurationRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.pipelineId = builder.pipelineId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePipelineConfigurationRequest create() {
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

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeletePipelineConfigurationRequest, Builder> {
        private String projectId; 
        private String pipelineId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeletePipelineConfigurationRequest response) {
            super(response);
            this.projectId = response.projectId;
            this.pipelineId = response.pipelineId;
            this.id = response.id;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putPathParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeletePipelineConfigurationRequest build() {
            return new DeletePipelineConfigurationRequest(this);
        } 

    } 

}
