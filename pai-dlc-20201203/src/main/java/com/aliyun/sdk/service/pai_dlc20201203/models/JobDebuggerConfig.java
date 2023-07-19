// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobDebuggerConfig} extends {@link TeaModel}
 *
 * <p>JobDebuggerConfig</p>
 */
public class JobDebuggerConfig extends TeaModel {
    @NameInMap("DebuggerConfigContent")
    private String debuggerConfigContent;

    @NameInMap("DebuggerConfigId")
    private String debuggerConfigId;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("JobId")
    private String jobId;

    private JobDebuggerConfig(Builder builder) {
        this.debuggerConfigContent = builder.debuggerConfigContent;
        this.debuggerConfigId = builder.debuggerConfigId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobDebuggerConfig create() {
        return builder().build();
    }

    /**
     * @return debuggerConfigContent
     */
    public String getDebuggerConfigContent() {
        return this.debuggerConfigContent;
    }

    /**
     * @return debuggerConfigId
     */
    public String getDebuggerConfigId() {
        return this.debuggerConfigId;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder {
        private String debuggerConfigContent; 
        private String debuggerConfigId; 
        private String gmtCreateTime; 
        private String jobId; 

        /**
         * DebuggerConfigContent.
         */
        public Builder debuggerConfigContent(String debuggerConfigContent) {
            this.debuggerConfigContent = debuggerConfigContent;
            return this;
        }

        /**
         * DebuggerConfigId.
         */
        public Builder debuggerConfigId(String debuggerConfigId) {
            this.debuggerConfigId = debuggerConfigId;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        public JobDebuggerConfig build() {
            return new JobDebuggerConfig(this);
        } 

    } 

}
