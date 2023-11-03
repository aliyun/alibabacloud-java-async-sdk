// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCustinsResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCustinsResourceResponseBody</p>
 */
public class ModifyCustinsResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the task.
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
