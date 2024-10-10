// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOnceTaskResultInfoRequest} extends {@link RequestModel}
 *
 * <p>GetOnceTaskResultInfoRequest</p>
 */
public class GetOnceTaskResultInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GetOnceTaskResultInfoRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOnceTaskResultInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GetOnceTaskResultInfoRequest, Builder> {
        private String taskId; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetOnceTaskResultInfoRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The ID of the scan task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9dfa3a7eb9547781632785b49003****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the task. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a task of the Security Center agent</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: an O&amp;M task of Cloud Assistant</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: a task of asset information collection</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASSETS_COLLECTION</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a task of the Security Center agent</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: an O&amp;M task of Cloud Assistant</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: a task of asset information collection</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ASSETS_COLLECTION</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GetOnceTaskResultInfoRequest build() {
            return new GetOnceTaskResultInfoRequest(this);
        } 

    } 

}
