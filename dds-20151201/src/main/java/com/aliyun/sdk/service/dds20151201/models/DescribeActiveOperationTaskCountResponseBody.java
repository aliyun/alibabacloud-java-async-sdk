// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTaskCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTaskCountResponseBody</p>
 */
public class DescribeActiveOperationTaskCountResponseBody extends TeaModel {
    @NameInMap("NeedPop")
    private Integer needPop;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskCount")
    private Integer taskCount;

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
    public Integer getNeedPop() {
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
    public Integer getTaskCount() {
        return this.taskCount;
    }

    public static final class Builder {
        private Integer needPop; 
        private String requestId; 
        private Integer taskCount; 

        /**
         * Indicates whether any O&M tasks need pop-up windows to notify users actions. Valid values: 
         * <p>
         * 
         * - **0**: No O&M tasks need pop-up windows to notify users actions.
         * - **1**: Some O&M tasks need pop-up windows to notify users actions.
         */
        public Builder needPop(Integer needPop) {
            this.needPop = needPop;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of pending O&M tasks.
         */
        public Builder taskCount(Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }

        public DescribeActiveOperationTaskCountResponseBody build() {
            return new DescribeActiveOperationTaskCountResponseBody(this);
        } 

    } 

}
