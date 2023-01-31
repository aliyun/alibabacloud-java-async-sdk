// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InflightTaskTimeoutRequest} extends {@link RequestModel}
 *
 * <p>InflightTaskTimeoutRequest</p>
 */
public class InflightTaskTimeoutRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private InflightTaskTimeoutRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceOwnerId = builder.instanceOwnerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InflightTaskTimeoutRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceOwnerId
     */
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<InflightTaskTimeoutRequest, Builder> {
        private String instanceId; 
        private Long instanceOwnerId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(InflightTaskTimeoutRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceOwnerId = request.instanceOwnerId;
            this.taskId = request.taskId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceOwnerId.
         */
        public Builder instanceOwnerId(Long instanceOwnerId) {
            this.putQueryParameter("InstanceOwnerId", instanceOwnerId);
            this.instanceOwnerId = instanceOwnerId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public InflightTaskTimeoutRequest build() {
            return new InflightTaskTimeoutRequest(this);
        } 

    } 

}
