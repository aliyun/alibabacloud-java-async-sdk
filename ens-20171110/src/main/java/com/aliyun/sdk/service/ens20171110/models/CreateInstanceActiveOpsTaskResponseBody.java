// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateInstanceActiveOpsTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceActiveOpsTaskResponseBody</p>
 */
public class CreateInstanceActiveOpsTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceActiveOpsTask")
    private InstanceActiveOpsTask instanceActiveOpsTask;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateInstanceActiveOpsTaskResponseBody model) {
            this.instanceActiveOpsTask = model.instanceActiveOpsTask;
            this.requestId = model.requestId;
        } 

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
