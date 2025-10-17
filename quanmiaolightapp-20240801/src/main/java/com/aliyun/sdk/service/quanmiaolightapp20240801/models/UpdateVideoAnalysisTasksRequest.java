// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link UpdateVideoAnalysisTasksRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoAnalysisTasksRequest</p>
 */
public class UpdateVideoAnalysisTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskStatus;

    private UpdateVideoAnalysisTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.taskIds = builder.taskIds;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoAnalysisTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder extends Request.Builder<UpdateVideoAnalysisTasksRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private java.util.List<String> taskIds; 
        private String taskStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVideoAnalysisTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.taskIds = request.taskIds;
            this.taskStatus = request.taskStatus;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
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
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            String taskIdsShrink = shrink(taskIds, "taskIds", "json");
            this.putBodyParameter("taskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CANCELED</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.putBodyParameter("taskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        @Override
        public UpdateVideoAnalysisTasksRequest build() {
            return new UpdateVideoAnalysisTasksRequest(this);
        } 

    } 

}
