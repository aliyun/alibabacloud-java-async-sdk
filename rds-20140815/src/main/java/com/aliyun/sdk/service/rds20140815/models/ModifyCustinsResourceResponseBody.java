// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyCustinsResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCustinsResourceResponseBody</p>
 */
public class ModifyCustinsResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private ModifyCustinsResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustinsResourceResponseBody create() {
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
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private Integer taskId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B5A6839-31A7-58D4-9F96-772BFAFD1CB5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>507******</p>
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public ModifyCustinsResourceResponseBody build() {
            return new ModifyCustinsResourceResponseBody(this);
        } 

    } 

}
