// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopPipelineRequest} extends {@link RequestModel}
 *
 * <p>StopPipelineRequest</p>
 */
public class StopPipelineRequest extends Request {
    @Path
    @NameInMap("ProjectId")
    private String projectId;

    @Path
    @NameInMap("PipelineId")
    private String pipelineId;

    private StopPipelineRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopPipelineRequest create() {
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

    public static final class Builder extends Request.Builder<StopPipelineRequest, Builder> {
        private String projectId; 
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(StopPipelineRequest response) {
            super(response);
            this.projectId = response.projectId;
            this.pipelineId = response.pipelineId;
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

        @Override
        public StopPipelineRequest build() {
            return new StopPipelineRequest(this);
        } 

    } 

}
