// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The additional information.
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * The source of the scan task.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The name of the scan task. Valid values:
         * <p>
         * 
         * *   **CLIENT\_PROBLEM_CHECK**: a client diagnosis task
         * *   **CLIENT\_DEV_OPS**: an O\&M task of Cloud Assistant
         * *   **ASSET\_SECURITY_CHECK**: a task of asset information collection
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The type of the scan task. Valid values:
         * <p>
         * 
         * *   **CLIENT\_PROBLEM_CHECK**: a client diagnosis task
         * *   **CLIENT\_DEV_OPS**: an O\&M task of Cloud Assistant
         * *   **ASSET\_SECURITY_CHECK**: a task of asset information collection
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
