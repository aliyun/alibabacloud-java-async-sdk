// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineActiveProcessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineActiveProcessResponseBody</p>
 */
public class DescribeEdgeMachineActiveProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logs")
    private String logs;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Long progress;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("step")
    private String step;

    private DescribeEdgeMachineActiveProcessResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.step = builder.step;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachineActiveProcessResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public String getLogs() {
        return this.logs;
    }

    /**
     * @return progress
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return step
     */
    public String getStep() {
        return this.step;
    }

    public static final class Builder {
        private String logs; 
        private Long progress; 
        private String requestId; 
        private String state; 
        private String step; 

        /**
         * The activation progress list.
         */
        public Builder logs(String logs) {
            this.logs = logs;
            return this;
        }

        /**
         * The activation progress.
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The activation status.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The activation step.
         */
        public Builder step(String step) {
            this.step = step;
            return this;
        }

        public DescribeEdgeMachineActiveProcessResponseBody build() {
            return new DescribeEdgeMachineActiveProcessResponseBody(this);
        } 

    } 

}
