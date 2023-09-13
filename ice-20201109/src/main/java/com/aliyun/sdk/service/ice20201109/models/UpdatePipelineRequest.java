// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineRequest</p>
 */
public class UpdatePipelineRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PipelineId")
    @Validation(required = true)
    private String pipelineId;

    @Query
    @NameInMap("Priority")
    private Integer priority;

    @Query
    @NameInMap("Status")
    private String status;

    private UpdatePipelineRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.pipelineId = builder.pipelineId;
        this.priority = builder.priority;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdatePipelineRequest, Builder> {
        private String name; 
        private String pipelineId; 
        private Integer priority; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePipelineRequest request) {
            super(request);
            this.name = request.name;
            this.pipelineId = request.pipelineId;
            this.priority = request.priority;
            this.status = request.status;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdatePipelineRequest build() {
            return new UpdatePipelineRequest(this);
        } 

    } 

}
