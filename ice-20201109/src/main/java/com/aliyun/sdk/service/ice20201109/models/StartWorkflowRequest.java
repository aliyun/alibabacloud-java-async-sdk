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
 * {@link StartWorkflowRequest} extends {@link RequestModel}
 *
 * <p>StartWorkflowRequest</p>
 */
public class StartWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskInput")
    private String taskInput;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private StartWorkflowRequest(Builder builder) {
        super(builder);
        this.taskInput = builder.taskInput;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskInput
     */
    public String getTaskInput() {
        return this.taskInput;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<StartWorkflowRequest, Builder> {
        private String taskInput; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(StartWorkflowRequest request) {
            super(request);
            this.taskInput = request.taskInput;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>The workflow input. Only media assets are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Type&quot;: &quot;Media&quot;,
         *       &quot;Media&quot;: &quot;<strong><strong><strong>30706071edbfe290b488</strong></strong></strong>&quot;
         * }</p>
         */
        public Builder taskInput(String taskInput) {
            this.putQueryParameter("TaskInput", taskInput);
            this.taskInput = taskInput;
            return this;
        }

        /**
         * <p>The user-defined data in the JSON format, which cannot be up to 512 bytes in length. You can specify a custom callback URL. For more information, see <a href="https://help.aliyun.com/document_detail/451631.html">Configure a callback upon editing completion</a>.</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The ID of the workflow template. To view the template ID, log on to the <a href="https://ims.console.aliyun.com/settings/workflow/list">IMS console</a> and choose Configurations &gt; Workflow Template.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>f0e54971ecbffd472190</strong></strong></strong></p>
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public StartWorkflowRequest build() {
            return new StartWorkflowRequest(this);
        } 

    } 

}
