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
    @com.aliyun.core.annotation.NameInMap("SkipInputVerification")
    private Boolean skipInputVerification;

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
        this.skipInputVerification = builder.skipInputVerification;
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
     * @return skipInputVerification
     */
    public Boolean getSkipInputVerification() {
        return this.skipInputVerification;
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
        private Boolean skipInputVerification; 
        private String taskInput; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(StartWorkflowRequest request) {
            super(request);
            this.skipInputVerification = request.skipInputVerification;
            this.taskInput = request.taskInput;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>Specifies whether to skip the input path verification for the workflow. This parameter takes effect only when the workflow input is an OSS file. We recommend that you do not skip the verification to avoid errors caused by incorrect paths. If this parameter is not specified, the default value is false. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Skip the verification.</p>
         * </li>
         * <li><p><strong>false</strong>: Do not skip the verification.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipInputVerification(Boolean skipInputVerification) {
            this.putQueryParameter("SkipInputVerification", skipInputVerification);
            this.skipInputVerification = skipInputVerification;
            return this;
        }

        /**
         * <p>The workflow input. Currently, media asset types and OSS files are supported.</p>
         * <p>Type: the supported media object type. Valid values:</p>
         * <ul>
         * <li><p>OSS: an OSS file.</p>
         * </li>
         * <li><p>Media: a media asset ID.</p>
         * </li>
         * </ul>
         * <p>Media: the media value. Valid values:</p>
         * <ul>
         * <li><p>If Type is set to OSS, the value is a URL that supports the OSS protocol and HTTP protocol.</p>
         * </li>
         * <li><p>If Type is set to Media, the value is a media asset ID.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Type&quot;: &quot;Media&quot;,
         *       &quot;Media&quot;: &quot;<strong><strong><strong>30706071edbfe290b488</strong></strong></strong>&quot;
         * } or
         * {
         *       &quot;Type&quot;: &quot;OSS&quot;,
         *       &quot;Media&quot;: &quot;oss://bucket.oss-ap-southeast-1.aliyuncs.com/A/B/C/test1.flv&quot;
         * }</p>
         */
        public Builder taskInput(String taskInput) {
            this.putQueryParameter("TaskInput", taskInput);
            this.taskInput = taskInput;
            return this;
        }

        /**
         * <p>The custom settings in JSON format. The maximum length is 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Custom callback URL configuration</a> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The workflow template ID. You can view the template ID in the <a href="https://ims.console.aliyun.com/settings/workflow/list">Intelligent Media Services console</a> by navigating to Configuration Management &gt; Workflow Template.</p>
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
