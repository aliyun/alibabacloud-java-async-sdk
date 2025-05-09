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
 * {@link JobDebuggerConfig} extends {@link TeaModel}
 *
 * <p>JobDebuggerConfig</p>
 */
public class JobDebuggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DebuggerConfigContent")
    private String debuggerConfigContent;

    @com.aliyun.core.annotation.NameInMap("DebuggerConfigId")
    private String debuggerConfigId;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(JobDebuggerConfig model) {
            this.debuggerConfigContent = model.debuggerConfigContent;
            this.debuggerConfigId = model.debuggerConfigId;
            this.gmtCreateTime = model.gmtCreateTime;
            this.jobId = model.jobId;
        } 

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
