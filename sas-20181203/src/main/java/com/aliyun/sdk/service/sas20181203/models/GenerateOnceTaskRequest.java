// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GenerateOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>GenerateOnceTaskRequest</p>
 */
public class GenerateOnceTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    @com.aliyun.core.annotation.Validation(required = true)
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GenerateOnceTaskRequest(Builder builder) {
        super(builder);
        this.param = builder.param;
        this.source = builder.source;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOnceTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
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

    public static final class Builder extends Request.Builder<GenerateOnceTaskRequest, Builder> {
        private String param; 
        private String source; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOnceTaskRequest request) {
            super(request);
            this.param = request.param;
            this.source = request.source;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>A JSON string that contains additional parameters for the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mode&quot;:1,&quot;problemType&quot;:&quot;offline&quot;,&quot;uuids&quot;:&quot;inet-795dcad1-360f-49d2-b01e-b7da7f1c****&quot;}</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The source that initiated the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The name of the scan task.</p>
         * <ul>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * <li></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_PROBLEM_CHECK</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The type of the scan task. Valid values:</p>
         * <ul>
         * <li><p><strong>CLIENT_PROBLEM_CHECK</strong>: a client troubleshooting task</p>
         * </li>
         * <li><p><strong>CLIENT_DEV_OPS</strong>: a cloud DevOps task</p>
         * </li>
         * <li><p><strong>ASSET_SECURITY_CHECK</strong>: an asset collection task</p>
         * </li>
         * <li><p><strong>ASSETS_COLLECTION</strong>: an asset fingerprinting task</p>
         * </li>
         * <li><p><strong>IMAGE_SCAN</strong>: a container image scan task</p>
         * </li>
         * <li><p><strong>AI_SECURITY_CHECK</strong>: an AI asset synchronization task</p>
         * </li>
         * <li><p><strong>IDC_PROBE_SCAN</strong>: an IDC probe scan task</p>
         * </li>
         * <li><p><strong>ATTACK_SURFACE_SCAN</strong>: an attack surface scan task</p>
         * </li>
         * <li><p><strong>ASSET_EXPOSURE_SCAN</strong>: an asset exposure scan task</p>
         * </li>
         * <li><p><strong>VUL_CHECK_TASK</strong>: a vulnerability scan task</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_PROBLEM_CHECK</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GenerateOnceTaskRequest build() {
            return new GenerateOnceTaskRequest(this);
        } 

    } 

}
