// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePipelineRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineRequest</p>
 */
public class UpdatePipelineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The name of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pipeline</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the MPS queue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The priority of the MPS queue. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The state of the MPS queue.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>Paused</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Paused</p>
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
