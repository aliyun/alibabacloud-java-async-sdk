// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskPreparingRequest} extends {@link RequestModel}
 *
 * <p>TaskPreparingRequest</p>
 */
public class TaskPreparingRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private TaskPreparingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceOwnerId = builder.instanceOwnerId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskPreparingRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<TaskPreparingRequest, Builder> {
        private String instanceId; 
        private Long instanceOwnerId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(TaskPreparingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceOwnerId = request.instanceOwnerId;
            this.jobId = request.jobId;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public TaskPreparingRequest build() {
            return new TaskPreparingRequest(this);
        } 

    } 

}
