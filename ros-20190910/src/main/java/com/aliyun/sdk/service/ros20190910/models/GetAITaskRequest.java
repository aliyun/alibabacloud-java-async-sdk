// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetAITaskRequest} extends {@link RequestModel}
 *
 * <p>GetAITaskRequest</p>
 */
public class GetAITaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputOption")
    private String outputOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetAITaskRequest(Builder builder) {
        super(builder);
        this.outputOption = builder.outputOption;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAITaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputOption
     */
    public String getOutputOption() {
        return this.outputOption;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetAITaskRequest, Builder> {
        private String outputOption; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAITaskRequest request) {
            super(request);
            this.outputOption = request.outputOption;
            this.taskId = request.taskId;
        } 

        /**
         * <p>Specifies whether to return the TaskOutput parameter. The TaskOutput parameter specifies the outputs of the AI task. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled (default)</li>
         * </ul>
         * <blockquote>
         * <p> The value of TaskOutput may be excessively long. If you do not require the outputs of the task, we recommend that you set OutputOption to Disabled to improve the response speed of the API operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder outputOption(String outputOption) {
            this.putQueryParameter("OutputOption", outputOption);
            this.outputOption = outputOption;
            return this;
        }

        /**
         * <p>The ID of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-asasas*****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetAITaskRequest build() {
            return new GetAITaskRequest(this);
        } 

    } 

}
