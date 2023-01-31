// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitRecordingRequest} extends {@link RequestModel}
 *
 * <p>SubmitRecordingRequest</p>
 */
public class SubmitRecordingRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MergedRecording")
    @Validation(required = true)
    private String mergedRecording;

    @Query
    @NameInMap("ResourceRecording")
    private String resourceRecording;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private SubmitRecordingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mergedRecording = builder.mergedRecording;
        this.resourceRecording = builder.resourceRecording;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitRecordingRequest create() {
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
     * @return mergedRecording
     */
    public String getMergedRecording() {
        return this.mergedRecording;
    }

    /**
     * @return resourceRecording
     */
    public String getResourceRecording() {
        return this.resourceRecording;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<SubmitRecordingRequest, Builder> {
        private String instanceId; 
        private String mergedRecording; 
        private String resourceRecording; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitRecordingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mergedRecording = request.mergedRecording;
            this.resourceRecording = request.resourceRecording;
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
         * MergedRecording.
         */
        public Builder mergedRecording(String mergedRecording) {
            this.putQueryParameter("MergedRecording", mergedRecording);
            this.mergedRecording = mergedRecording;
            return this;
        }

        /**
         * ResourceRecording.
         */
        public Builder resourceRecording(String resourceRecording) {
            this.putQueryParameter("ResourceRecording", resourceRecording);
            this.resourceRecording = resourceRecording;
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
        public SubmitRecordingRequest build() {
            return new SubmitRecordingRequest(this);
        } 

    } 

}
