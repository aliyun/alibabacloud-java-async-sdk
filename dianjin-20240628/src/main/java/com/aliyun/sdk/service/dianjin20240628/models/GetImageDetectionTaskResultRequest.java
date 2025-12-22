// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetImageDetectionTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetImageDetectionTaskResultRequest</p>
 */
public class GetImageDetectionTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-Load-Test")
    private Boolean xLoadTest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private GetImageDetectionTaskResultRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.xLoadTest = builder.xLoadTest;
        this.taskId = builder.taskId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageDetectionTaskResultRequest create() {
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

    /**
     * @return xLoadTest
     */
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetImageDetectionTaskResultRequest, Builder> {
        private String workspaceId; 
        private Boolean xLoadTest; 
        private String taskId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetImageDetectionTaskResultRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.xLoadTest = request.xLoadTest;
            this.taskId = request.taskId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * X-Load-Test.
         */
        public Builder xLoadTest(Boolean xLoadTest) {
            this.putHeaderParameter("X-Load-Test", xLoadTest);
            this.xLoadTest = xLoadTest;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetImageDetectionTaskResultRequest build() {
            return new GetImageDetectionTaskResultRequest(this);
        } 

    } 

}
