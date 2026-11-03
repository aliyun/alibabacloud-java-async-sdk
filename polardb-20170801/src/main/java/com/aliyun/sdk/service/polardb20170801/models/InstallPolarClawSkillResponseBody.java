// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link InstallPolarClawSkillResponseBody} extends {@link TeaModel}
 *
 * <p>InstallPolarClawSkillResponseBody</p>
 */
public class InstallPolarClawSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Slug")
    private String slug;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("TargetDir")
    private String targetDir;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private InstallPolarClawSkillResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.ok = builder.ok;
        this.operation = builder.operation;
        this.requestId = builder.requestId;
        this.slug = builder.slug;
        this.state = builder.state;
        this.targetDir = builder.targetDir;
        this.taskId = builder.taskId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallPolarClawSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ok
     */
    public Boolean getOk() {
        return this.ok;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slug
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return targetDir
     */
    public String getTargetDir() {
        return this.targetDir;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private String message; 
        private Boolean ok; 
        private String operation; 
        private String requestId; 
        private String slug; 
        private String state; 
        private String targetDir; 
        private String taskId; 
        private String version; 

        private Builder() {
        } 

        private Builder(InstallPolarClawSkillResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.ok = model.ok;
            this.operation = model.operation;
            this.requestId = model.requestId;
            this.slug = model.slug;
            this.state = model.state;
            this.targetDir = model.targetDir;
            this.taskId = model.taskId;
            this.version = model.version;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. This parameter is returned when Async is set to false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
            return this;
        }

        /**
         * <p>The operation name. This parameter is returned when Async is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>InstallPolarClawSkill</p>
         */
        public Builder operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The identifier of the installed skill. This parameter is returned during synchronous execution.</p>
         * 
         * <strong>example:</strong>
         * <p>alibacloud-rds-copilot</p>
         */
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * <p>The initial state of the task. This parameter is returned when Async is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The installation directory. This parameter is returned during synchronous execution.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/node/.openclaw/skills/alibacloud-rds-copilot</p>
         */
        public Builder targetDir(String targetDir) {
            this.targetDir = targetDir;
            return this;
        }

        /**
         * <p>The ID of the asynchronous task. This parameter is returned when Async is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>9f1c2e3d-xxxx</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The installed version number. This parameter is returned during synchronous execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public InstallPolarClawSkillResponseBody build() {
            return new InstallPolarClawSkillResponseBody(this);
        } 

    } 

}
