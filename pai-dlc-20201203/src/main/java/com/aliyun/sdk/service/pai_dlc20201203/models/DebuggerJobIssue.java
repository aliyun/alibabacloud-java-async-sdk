// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebuggerJobIssue} extends {@link TeaModel}
 *
 * <p>DebuggerJobIssue</p>
 */
public class DebuggerJobIssue extends TeaModel {
    @NameInMap("DebuggerJobIssue")
    private String debuggerJobIssue;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("JobDebuggerIssueId")
    private String jobDebuggerIssueId;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("ReasonCode")
    private String reasonCode;

    @NameInMap("ReasonMessage")
    private String reasonMessage;

    @NameInMap("RuleName")
    private String ruleName;

    private DebuggerJobIssue(Builder builder) {
        this.debuggerJobIssue = builder.debuggerJobIssue;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.jobDebuggerIssueId = builder.jobDebuggerIssueId;
        this.jobId = builder.jobId;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebuggerJobIssue create() {
        return builder().build();
    }

    /**
     * @return debuggerJobIssue
     */
    public String getDebuggerJobIssue() {
        return this.debuggerJobIssue;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return jobDebuggerIssueId
     */
    public String getJobDebuggerIssueId() {
        return this.jobDebuggerIssueId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder {
        private String debuggerJobIssue; 
        private String gmtCreateTime; 
        private String jobDebuggerIssueId; 
        private String jobId; 
        private String reasonCode; 
        private String reasonMessage; 
        private String ruleName; 

        /**
         * 规则报告的具体json描述
         */
        public Builder debuggerJobIssue(String debuggerJobIssue) {
            this.debuggerJobIssue = debuggerJobIssue;
            return this;
        }

        /**
         * 创建时间（UTC）
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * event的全局唯一ID
         */
        public Builder jobDebuggerIssueId(String jobDebuggerIssueId) {
            this.jobDebuggerIssueId = jobDebuggerIssueId;
            return this;
        }

        /**
         * 作业ID
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * 规则触发原因的编码
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * 规则触发的原因
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * 规则名称
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public DebuggerJobIssue build() {
            return new DebuggerJobIssue(this);
        } 

    } 

}
