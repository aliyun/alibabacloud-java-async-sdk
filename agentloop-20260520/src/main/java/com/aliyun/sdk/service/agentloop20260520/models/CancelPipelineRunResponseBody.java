// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CancelPipelineRunResponseBody} extends {@link TeaModel}
 *
 * <p>CancelPipelineRunResponseBody</p>
 */
public class CancelPipelineRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("finishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private CancelPipelineRunResponseBody(Builder builder) {
        this.finishTime = builder.finishTime;
        this.requestId = builder.requestId;
        this.runId = builder.runId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelPipelineRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String finishTime; 
        private String requestId; 
        private String runId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CancelPipelineRunResponseBody model) {
            this.finishTime = model.finishTime;
            this.requestId = model.requestId;
            this.runId = model.runId;
            this.status = model.status;
        } 

        /**
         * <p>The time when the cancellation was completed, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:05.000Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the canceled run.</p>
         * 
         * <strong>example:</strong>
         * <p>run-20260101-0001</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>The status of the run after cancellation. The value is fixed to Cancelled.</p>
         * 
         * <strong>example:</strong>
         * <p>Cancelled</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CancelPipelineRunResponseBody build() {
            return new CancelPipelineRunResponseBody(this);
        } 

    } 

}
