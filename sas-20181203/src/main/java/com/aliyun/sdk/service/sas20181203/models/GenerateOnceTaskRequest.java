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
         * <p>The additional information.</p>
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
         * <p>The source of the scan task.</p>
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
         * <p>The name of the scan task. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a client diagnosis task</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: an O&amp;M task of Cloud Assistant</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: a task of asset information collection</li>
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
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a client diagnosis task</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: an O&amp;M task of Cloud Assistant</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: a task of asset information collection</li>
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
