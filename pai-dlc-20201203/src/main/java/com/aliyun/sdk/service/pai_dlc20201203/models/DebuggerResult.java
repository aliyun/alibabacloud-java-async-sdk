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
 * {@link DebuggerResult} extends {@link TeaModel}
 *
 * <p>DebuggerResult</p>
 */
public class DebuggerResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DebuggerConfigContent")
    private String debuggerConfigContent;

    @com.aliyun.core.annotation.NameInMap("DebuggerJobIssues")
    private String debuggerJobIssues;

    @com.aliyun.core.annotation.NameInMap("DebuggerJobStatus")
    private String debuggerJobStatus;

    @com.aliyun.core.annotation.NameInMap("DebuggerReportURL")
    private String debuggerReportURL;

    @com.aliyun.core.annotation.NameInMap("JobDisplayName")
    private String jobDisplayName;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobUserId")
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
         * DebuggerConfigContent.
         */
        public Builder debuggerConfigContent(String debuggerConfigContent) {
            this.debuggerConfigContent = debuggerConfigContent;
            return this;
        }

        /**
         * DebuggerJobIssues.
         */
        public Builder debuggerJobIssues(String debuggerJobIssues) {
            this.debuggerJobIssues = debuggerJobIssues;
            return this;
        }

        /**
         * DebuggerJobStatus.
         */
        public Builder debuggerJobStatus(String debuggerJobStatus) {
            this.debuggerJobStatus = debuggerJobStatus;
            return this;
        }

        /**
         * DebuggerReportURL.
         */
        public Builder debuggerReportURL(String debuggerReportURL) {
            this.debuggerReportURL = debuggerReportURL;
            return this;
        }

        /**
         * JobDisplayName.
         */
        public Builder jobDisplayName(String jobDisplayName) {
            this.jobDisplayName = jobDisplayName;
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
         * JobUserId.
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
