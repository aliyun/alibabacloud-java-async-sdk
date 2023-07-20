// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceActiveOpsTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceActiveOpsTaskResponseBody</p>
 */
public class CreateInstanceActiveOpsTaskResponseBody extends TeaModel {
    @NameInMap("InstanceActiveOpsTask")
    private InstanceActiveOpsTask instanceActiveOpsTask;

    @NameInMap("RequestId")
    private String requestId;

    private CreateInstanceActiveOpsTaskResponseBody(Builder builder) {
        this.instanceActiveOpsTask = builder.instanceActiveOpsTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceActiveOpsTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceActiveOpsTask
     */
    public InstanceActiveOpsTask getInstanceActiveOpsTask() {
        return this.instanceActiveOpsTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceActiveOpsTask instanceActiveOpsTask; 
        private String requestId; 

        /**
         * InstanceActiveOpsTask.
         */
        public Builder instanceActiveOpsTask(InstanceActiveOpsTask instanceActiveOpsTask) {
            this.instanceActiveOpsTask = instanceActiveOpsTask;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInstanceActiveOpsTaskResponseBody build() {
            return new CreateInstanceActiveOpsTaskResponseBody(this);
        } 

    } 

}
