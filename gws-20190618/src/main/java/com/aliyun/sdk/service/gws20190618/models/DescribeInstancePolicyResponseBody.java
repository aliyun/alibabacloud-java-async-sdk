// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancePolicyResponseBody</p>
 */
public class DescribeInstancePolicyResponseBody extends TeaModel {
    @NameInMap("OptimizeFor3d")
    private String optimizeFor3d;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskFinished")
    private Boolean taskFinished;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("VisualLossless")
    private String visualLossless;

    private DescribeInstancePolicyResponseBody(Builder builder) {
        this.optimizeFor3d = builder.optimizeFor3d;
        this.requestId = builder.requestId;
        this.taskFinished = builder.taskFinished;
        this.taskId = builder.taskId;
        this.visualLossless = builder.visualLossless;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return optimizeFor3d
     */
    public String getOptimizeFor3d() {
        return this.optimizeFor3d;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskFinished
     */
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return visualLossless
     */
    public String getVisualLossless() {
        return this.visualLossless;
    }

    public static final class Builder {
        private String optimizeFor3d; 
        private String requestId; 
        private Boolean taskFinished; 
        private String taskId; 
        private String visualLossless; 

        /**
         * OptimizeFor3d.
         */
        public Builder optimizeFor3d(String optimizeFor3d) {
            this.optimizeFor3d = optimizeFor3d;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskFinished.
         */
        public Builder taskFinished(Boolean taskFinished) {
            this.taskFinished = taskFinished;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * VisualLossless.
         */
        public Builder visualLossless(String visualLossless) {
            this.visualLossless = visualLossless;
            return this;
        }

        public DescribeInstancePolicyResponseBody build() {
            return new DescribeInstancePolicyResponseBody(this);
        } 

    } 

}
