// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link DebuggerJobIssue} extends {@link TeaModel}
 *
 * <p>DebuggerJobIssue</p>
 */
public class DebuggerJobIssue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DebuggerJobIssue")
    private String debuggerJobIssue;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("JobDebuggerIssueId")
    private String jobDebuggerIssueId;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RuleName")
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
         * DebuggerJobIssue.
         */
        public Builder debuggerJobIssue(String debuggerJobIssue) {
            this.debuggerJobIssue = debuggerJobIssue;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * JobDebuggerIssueId.
         */
        public Builder jobDebuggerIssueId(String jobDebuggerIssueId) {
            this.jobDebuggerIssueId = jobDebuggerIssueId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * RuleName.
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
