// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineActiveProcessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachineActiveProcessResponseBody</p>
 */
public class DescribeEdgeMachineActiveProcessResponseBody extends TeaModel {
    @NameInMap("request_id")
    private String requestId;

    @NameInMap("state")
    private String state;

    @NameInMap("step")
    private String step;

    @NameInMap("progress")
    private Long progress;

    @NameInMap("logs")
    private String logs;

    private DescribeEdgeMachineActiveProcessResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.step = builder.step;
        this.progress = builder.progress;
        this.logs = builder.logs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachineActiveProcessResponseBody create() {
        return builder().build();
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

    /**
     * @return progress
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * @return logs
     */
    public String getLogs() {
        return this.logs;
    }

    public static final class Builder {
        private String requestId; 
        private String state; 
        private String step; 
        private Long progress; 
        private String logs; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Active
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Activation procedure
         */
        public Builder step(String step) {
            this.step = step;
            return this;
        }

        /**
         * Activation Progress
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * Activation Progress list
         */
        public Builder logs(String logs) {
            this.logs = logs;
            return this;
        }

        public DescribeEdgeMachineActiveProcessResponseBody build() {
            return new DescribeEdgeMachineActiveProcessResponseBody(this);
        } 

    } 

}
