// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ShrinkClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ShrinkClusterResponseBody</p>
 */
public class ShrinkClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ShrinkClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShrinkClusterResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private String taskId; 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>CC9FEF89-9BE5-5E03-845E-238B48D7599B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>task id</p>
         * 
         * <strong>example:</strong>
         * <p>i159136551662516768776</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ShrinkClusterResponseBody build() {
            return new ShrinkClusterResponseBody(this);
        } 

    } 

}
