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
 * {@link StartAIWorkflowRequest} extends {@link RequestModel}
 *
 * <p>StartAIWorkflowRequest</p>
 */
public class StartAIWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispatchTag")
    private String dispatchTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Inputs")
    private String inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private StartAIWorkflowRequest(Builder builder) {
        super(builder);
        this.dispatchTag = builder.dispatchTag;
        this.inputs = builder.inputs;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAIWorkflowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dispatchTag
     */
    public String getDispatchTag() {
        return this.dispatchTag;
    }

    /**
     * @return inputs
     */
    public String getInputs() {
        return this.inputs;
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

    public static final class Builder extends Request.Builder<StartAIWorkflowRequest, Builder> {
        private String dispatchTag; 
        private String inputs; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(StartAIWorkflowRequest request) {
            super(request);
            this.dispatchTag = request.dispatchTag;
            this.inputs = request.inputs;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>The tag for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder dispatchTag(String dispatchTag) {
            this.putQueryParameter("DispatchTag", dispatchTag);
            this.dispatchTag = dispatchTag;
            return this;
        }

        /**
         * <p>A JSON string containing the specific input parameters, such as information about the media assets, standard live streams, or RTC streams.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;live_url&quot;: {
         *         &quot;Url&quot;: &quot;rtmp://test.com/test_app/test_stream?auth_key=test&quot;,
         *         &quot;MaxIdleTime&quot;: 20
         *     },
         *     &quot;source_language_id&quot;: &quot;es&quot;
         * }</p>
         */
        public Builder inputs(String inputs) {
            this.putQueryParameter("Inputs", inputs);
            this.inputs = inputs;
            return this;
        }

        /**
         * <p>A user-defined parameter for passing custom metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;url&quot;:&quot;<a href="https://test.com">https://test.com</a>&quot;
         * }</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The ID of the workflow template.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>3f44-f1f6-477e-9364-c5e6c49e</strong></strong></p>
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public StartAIWorkflowRequest build() {
            return new StartAIWorkflowRequest(this);
        } 

    } 

}
