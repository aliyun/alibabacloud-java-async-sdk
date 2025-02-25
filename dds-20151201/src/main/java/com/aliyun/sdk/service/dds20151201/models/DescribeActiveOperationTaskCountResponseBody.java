// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
    private Integer needPop;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskCount")
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
         * <p>Indicates whether any O&amp;M tasks need pop-up windows to notify users actions. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No O&amp;M tasks need pop-up windows to notify users actions.</li>
         * <li><strong>1</strong>: Some O&amp;M tasks need pop-up windows to notify users actions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder needPop(Integer needPop) {
            this.needPop = needPop;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>770D7F11-21A2-402B-9DF6-D1A620570EF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of pending O&amp;M tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
