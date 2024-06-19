// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTaskCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTaskCountResponseBody</p>
 */
public class DescribeActiveOperationTaskCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NeedPop")
    private Long needPop;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskCount")
    private Long taskCount;

    private DescribeActiveOperationTaskCountResponseBody(Builder builder) {
        this.needPop = builder.needPop;
        this.requestId = builder.requestId;
        this.taskCount = builder.taskCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationTaskCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return needPop
     */
    public Long getNeedPop() {
        return this.needPop;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskCount
     */
    public Long getTaskCount() {
        return this.taskCount;
    }

    public static final class Builder {
        private Long needPop; 
        private String requestId; 
        private Long taskCount; 

        /**
         * NeedPop.
         */
        public Builder needPop(Long needPop) {
            this.needPop = needPop;
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
         * TaskCount.
         */
        public Builder taskCount(Long taskCount) {
            this.taskCount = taskCount;
            return this;
        }

        public DescribeActiveOperationTaskCountResponseBody build() {
            return new DescribeActiveOperationTaskCountResponseBody(this);
        } 

    } 

}
