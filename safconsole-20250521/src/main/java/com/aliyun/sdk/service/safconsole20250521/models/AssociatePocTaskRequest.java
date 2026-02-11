// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link AssociatePocTaskRequest} extends {@link RequestModel}
 *
 * <p>AssociatePocTaskRequest</p>
 */
public class AssociatePocTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private AssociatePocTaskRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociatePocTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<AssociatePocTaskRequest, Builder> {
        private Long projectId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(AssociatePocTaskRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>Project ID</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Retrospective task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public AssociatePocTaskRequest build() {
            return new AssociatePocTaskRequest(this);
        } 

    } 

}
