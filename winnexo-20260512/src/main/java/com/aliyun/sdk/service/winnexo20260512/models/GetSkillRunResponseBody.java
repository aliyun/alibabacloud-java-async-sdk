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
 * {@link GetSkillRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillRunResponseBody</p>
 */
public class GetSkillRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("finishedAt")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("logs")
    private java.util.List<java.util.Map<String, ?>> logs;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Long progress;

    @com.aliyun.core.annotation.NameInMap("progressMessage")
    private String progressMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.Map<String, ?> result;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("skillCode")
    private String skillCode;

    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("usage")
    private java.util.Map<String, ?> usage;

    private GetSkillRunResponseBody(Builder builder) {
        this.code = builder.code;
        this.createdAt = builder.createdAt;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.finishedAt = builder.finishedAt;
        this.logs = builder.logs;
        this.message = builder.message;
        this.progress = builder.progress;
        this.progressMessage = builder.progressMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.runId = builder.runId;
        this.skillCode = builder.skillCode;
        this.skillName = builder.skillName;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillRunResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return logs
     */
    public java.util.List<java.util.Map<String, ?>> getLogs() {
        return this.logs;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return progress
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * @return progressMessage
     */
    public String getProgressMessage() {
        return this.progressMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.Map<String, ?> getResult() {
        return this.result;
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
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return usage
     */
    public java.util.Map<String, ?> getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private String code; 
        private String createdAt; 
        private String errorCode; 
        private String errorMessage; 
        private String finishedAt; 
        private java.util.List<java.util.Map<String, ?>> logs; 
        private String message; 
        private Long progress; 
        private String progressMessage; 
        private String requestId; 
        private java.util.Map<String, ?> result; 
        private String runId; 
        private String skillCode; 
        private String skillName; 
        private String startedAt; 
        private String status; 
        private java.util.Map<String, ?> usage; 

        private Builder() {
        } 

        private Builder(GetSkillRunResponseBody model) {
            this.code = model.code;
            this.createdAt = model.createdAt;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.finishedAt = model.finishedAt;
            this.logs = model.logs;
            this.message = model.message;
            this.progress = model.progress;
            this.progressMessage = model.progressMessage;
            this.requestId = model.requestId;
            this.result = model.result;
            this.runId = model.runId;
            this.skillCode = model.skillCode;
            this.skillName = model.skillName;
            this.startedAt = model.startedAt;
            this.status = model.status;
            this.usage = model.usage;
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
         * <p>任务创建时间，ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>错误码，仅 Failed 时返回</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>错误描述，仅 Failed 时返回</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>任务结束时间，ISO8601；仅终态（Succeeded/Failed/Cancelled）有值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * logs.
         */
        public Builder logs(java.util.List<java.util.Map<String, ?>> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>进度百分比（仅 Running 时有意义）</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>进度描述</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder progressMessage(String progressMessage) {
            this.progressMessage = progressMessage;
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
         * result.
         */
        public Builder result(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>异步任务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleRunId</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>技能编码</p>
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
         * <p>任务开始执行时间，ISO8601</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>执行状态：Running / Succeeded / Failed / Cancelled</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(java.util.Map<String, ?> usage) {
            this.usage = usage;
            return this;
        }

        public GetSkillRunResponseBody build() {
            return new GetSkillRunResponseBody(this);
        } 

    } 

}
