// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link RunClusterInspectResponseBody} extends {@link TeaModel}
 *
 * <p>RunClusterInspectResponseBody</p>
 */
public class RunClusterInspectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("reportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private RunClusterInspectResponseBody(Builder builder) {
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunClusterInspectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String reportId; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(RunClusterInspectResponseBody model) {
            this.reportId = model.reportId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The inspection report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5d6557c983064c45bed62ab2a2119cc7</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AB4D067-4DD7-5471-B90A-FCC564BC3337</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The inspection task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>T-67d7ec016ce37c0106000***</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public RunClusterInspectResponseBody build() {
            return new RunClusterInspectResponseBody(this);
        } 

    } 

}
