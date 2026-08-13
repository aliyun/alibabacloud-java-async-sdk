// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link RunSkillResponseBody} extends {@link TeaModel}
 *
 * <p>RunSkillResponseBody</p>
 */
public class RunSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("skillCode")
    private String skillCode;

    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private RunSkillResponseBody(Builder builder) {
        this.code = builder.code;
        this.createdAt = builder.createdAt;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.runId = builder.runId;
        this.skillCode = builder.skillCode;
        this.skillName = builder.skillName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return skillCode
     */
    public String getSkillCode() {
        return this.skillCode;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private String createdAt; 
        private String message; 
        private String requestId; 
        private String runId; 
        private String skillCode; 
        private String skillName; 
        private String status; 

        private Builder() {
        } 

        private Builder(RunSkillResponseBody model) {
            this.code = model.code;
            this.createdAt = model.createdAt;
            this.message = model.message;
            this.requestId = model.requestId;
            this.runId = model.runId;
            this.skillCode = model.skillCode;
            this.skillName = model.skillName;
            this.status = model.status;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>任务创建时间，ISO8601 UTC 格式</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>异步任务 ID，用于 getSkillRun 查询</p>
         * 
         * <strong>example:</strong>
         * <p>exampleRunId</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>实际执行的技能编码</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder skillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }

        /**
         * <p>技能名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder skillName(String skillName) {
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>任务状态：提交即返回 Running</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public RunSkillResponseBody build() {
            return new RunSkillResponseBody(this);
        } 

    } 

}
