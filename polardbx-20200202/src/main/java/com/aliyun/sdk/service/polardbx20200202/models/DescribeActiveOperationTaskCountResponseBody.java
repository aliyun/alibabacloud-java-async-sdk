// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeActiveOperationTaskCountResponseBody model) {
            this.needPop = model.needPop;
            this.requestId = model.requestId;
            this.taskCount = model.taskCount;
        } 

        /**
         * <p>Indicates whether a pop-up window is required. Valid values:</p>
         * <ul>
         * <li>1: Required.</li>
         * <li>0: Not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder needPop(Long needPop) {
            this.needPop = needPop;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC7E27FC-58F8-4722-89BB-D1B6D0971956</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
