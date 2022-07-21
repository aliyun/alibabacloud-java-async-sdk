// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebuggerResult} extends {@link TeaModel}
 *
 * <p>DebuggerResult</p>
 */
public class DebuggerResult extends TeaModel {
    @NameInMap("DebuggerConfigContent")
    private String debuggerConfigContent;

    @NameInMap("DebuggerJobIssues")
    private String debuggerJobIssues;

    @NameInMap("DebuggerJobStatus")
    private String debuggerJobStatus;

    @NameInMap("DebuggerReportURL")
    private String debuggerReportURL;

    @NameInMap("JobDisplayName")
    private String jobDisplayName;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobUserId")
    private String jobUserId;

    private DebuggerResult(Builder builder) {
        this.debuggerConfigContent = builder.debuggerConfigContent;
        this.debuggerJobIssues = builder.debuggerJobIssues;
        this.debuggerJobStatus = builder.debuggerJobStatus;
        this.debuggerReportURL = builder.debuggerReportURL;
        this.jobDisplayName = builder.jobDisplayName;
        this.jobId = builder.jobId;
        this.jobUserId = builder.jobUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebuggerResult create() {
        return builder().build();
    }

    /**
     * @return debuggerConfigContent
     */
    public String getDebuggerConfigContent() {
        return this.debuggerConfigContent;
    }

    /**
     * @return debuggerJobIssues
     */
    public String getDebuggerJobIssues() {
        return this.debuggerJobIssues;
    }

    /**
     * @return debuggerJobStatus
     */
    public String getDebuggerJobStatus() {
        return this.debuggerJobStatus;
    }

    /**
     * @return debuggerReportURL
     */
    public String getDebuggerReportURL() {
        return this.debuggerReportURL;
    }

    /**
     * @return jobDisplayName
     */
    public String getJobDisplayName() {
        return this.jobDisplayName;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobUserId
     */
    public String getJobUserId() {
        return this.jobUserId;
    }

    public static final class Builder {
        private String debuggerConfigContent; 
        private String debuggerJobIssues; 
        private String debuggerJobStatus; 
        private String debuggerReportURL; 
        private String jobDisplayName; 
        private String jobId; 
        private String jobUserId; 

        /**
         * 配置项细节，json结构
         */
        public Builder debuggerConfigContent(String debuggerConfigContent) {
            this.debuggerConfigContent = debuggerConfigContent;
            return this;
        }

        /**
         * 规则报告细节信息
         */
        public Builder debuggerJobIssues(String debuggerJobIssues) {
            this.debuggerJobIssues = debuggerJobIssues;
            return this;
        }

        /**
         * debugger job运行状态描述
         */
        public Builder debuggerJobStatus(String debuggerJobStatus) {
            this.debuggerJobStatus = debuggerJobStatus;
            return this;
        }

        /**
         * 报告文件下载地址
         */
        public Builder debuggerReportURL(String debuggerReportURL) {
            this.debuggerReportURL = debuggerReportURL;
            return this;
        }

        /**
         * 作业显示名
         */
        public Builder jobDisplayName(String jobDisplayName) {
            this.jobDisplayName = jobDisplayName;
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
         * 用户ID
         */
        public Builder jobUserId(String jobUserId) {
            this.jobUserId = jobUserId;
            return this;
        }

        public DebuggerResult build() {
            return new DebuggerResult(this);
        } 

    } 

}
