// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>StartWorkflowResponseBody</p>
 */
public class StartWorkflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    private StartWorkflowResponseBody(Builder builder) {
        this.jobName = builder.jobName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartWorkflowResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    public static final class Builder {
        private String jobName; 

        /**
         * <p>The name of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>mapping-gpu-66xv7</p>
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        public StartWorkflowResponseBody build() {
            return new StartWorkflowResponseBody(this);
        } 

    } 

}
