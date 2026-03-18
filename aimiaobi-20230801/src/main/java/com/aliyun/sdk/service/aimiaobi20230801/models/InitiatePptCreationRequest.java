// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link InitiatePptCreationRequest} extends {@link RequestModel}
 *
 * <p>InitiatePptCreationRequest</p>
 */
public class InitiatePptCreationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Outline")
    private String outline;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private InitiatePptCreationRequest(Builder builder) {
        super(builder);
        this.externalUserId = builder.externalUserId;
        this.outline = builder.outline;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiatePptCreationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return outline
     */
    public String getOutline() {
        return this.outline;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<InitiatePptCreationRequest, Builder> {
        private String externalUserId; 
        private String outline; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(InitiatePptCreationRequest request) {
            super(request);
            this.externalUserId = request.externalUserId;
            this.outline = request.outline;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * Outline.
         */
        public Builder outline(String outline) {
            this.putBodyParameter("Outline", outline);
            this.outline = outline;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95c2fbe6-5a20-4fc2-8a93-376ed05fbe13</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
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
        public InitiatePptCreationRequest build() {
            return new InitiatePptCreationRequest(this);
        } 

    } 

}
