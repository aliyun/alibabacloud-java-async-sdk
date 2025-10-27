// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreatePrivateDnsEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrivateDnsEndpointResponseBody</p>
 */
public class CreatePrivateDnsEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
    private String accessInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreatePrivateDnsEndpointResponseBody(Builder builder) {
        this.accessInstanceId = builder.accessInstanceId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateDnsEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceId
     */
    public String getAccessInstanceId() {
        return this.accessInstanceId;
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
        private String accessInstanceId; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(CreatePrivateDnsEndpointResponseBody model) {
            this.accessInstanceId = model.accessInstanceId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * AccessInstanceId.
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>850A84D6************00090125EEB1</p>
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

        public CreatePrivateDnsEndpointResponseBody build() {
            return new CreatePrivateDnsEndpointResponseBody(this);
        } 

    } 

}
