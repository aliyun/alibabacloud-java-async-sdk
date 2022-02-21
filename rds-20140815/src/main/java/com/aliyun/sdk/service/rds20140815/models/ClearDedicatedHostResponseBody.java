// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearDedicatedHostResponseBody} extends {@link TeaModel}
 *
 * <p>ClearDedicatedHostResponseBody</p>
 */
public class ClearDedicatedHostResponseBody extends TeaModel {
    @NameInMap("DedicatedHostId")
    private String dedicatedHostId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    private ClearDedicatedHostResponseBody(Builder builder) {
        this.dedicatedHostId = builder.dedicatedHostId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearDedicatedHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
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
        private String dedicatedHostId; 
        private String requestId; 
        private String taskId; 

        /**
         * DedicatedHostId.
         */
        public Builder dedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ClearDedicatedHostResponseBody build() {
            return new ClearDedicatedHostResponseBody(this);
        } 

    } 

}
