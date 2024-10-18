// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTaskRequest</p>
 */
public class GetTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestDefinition")
    private Boolean requestDefinition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GetTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectName = builder.projectName;
        this.requestDefinition = builder.requestDefinition;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskRequest create() {
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestDefinition
     */
    public Boolean getRequestDefinition() {
        return this.requestDefinition;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GetTaskRequest, Builder> {
        private String regionId; 
        private String projectName; 
        private Boolean requestDefinition; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectName = request.projectName;
            this.requestDefinition = request.requestDefinition;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Specifies whether to return the initial request parameters that are used to create the task. Default value: False.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder requestDefinition(Boolean requestDefinition) {
            this.putQueryParameter("RequestDefinition", requestDefinition);
            this.requestDefinition = requestDefinition;
            return this;
        }

        /**
         * <p>The ID of the task. You can obtain the ID of a task after you create the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c2b277b9-0d30-4882-ad6d-ad661382****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The type of the task. For information about valid values, see <a href="https://help.aliyun.com/document_detail/475313.html">Task types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VideoLabelClassification</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GetTaskRequest build() {
            return new GetTaskRequest(this);
        } 

    } 

}
