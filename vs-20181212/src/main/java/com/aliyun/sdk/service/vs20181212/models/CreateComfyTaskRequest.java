// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateComfyTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateComfyTaskRequest</p>
 */
public class CreateComfyTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiveId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hiveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserParameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowId;

    private CreateComfyTaskRequest(Builder builder) {
        super(builder);
        this.hiveId = builder.hiveId;
        this.userParameters = builder.userParameters;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComfyTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hiveId
     */
    public String getHiveId() {
        return this.hiveId;
    }

    /**
     * @return userParameters
     */
    public String getUserParameters() {
        return this.userParameters;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<CreateComfyTaskRequest, Builder> {
        private String hiveId; 
        private String userParameters; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(CreateComfyTaskRequest request) {
            super(request);
            this.hiveId = request.hiveId;
            this.userParameters = request.userParameters;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hive-26cd567b35c04a0a90f017388207b232</p>
         */
        public Builder hiveId(String hiveId) {
            this.putQueryParameter("HiveId", hiveId);
            this.hiveId = hiveId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;2&quot;:{&quot;text&quot;:&quot;masterpiece, best quality, beautiful cat, sunny day&quot;},&quot;3&quot;:{&quot;text&quot;:&quot;low quality, worst quality, blurry, watermark, text, signature&quot;}}</p>
         */
        public Builder userParameters(String userParameters) {
            this.putQueryParameter("UserParameters", userParameters);
            this.userParameters = userParameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5f</p>
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public CreateComfyTaskRequest build() {
            return new CreateComfyTaskRequest(this);
        } 

    } 

}
