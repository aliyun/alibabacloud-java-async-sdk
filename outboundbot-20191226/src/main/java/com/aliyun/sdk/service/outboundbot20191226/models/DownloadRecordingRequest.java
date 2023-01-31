// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadRecordingRequest} extends {@link RequestModel}
 *
 * <p>DownloadRecordingRequest</p>
 */
public class DownloadRecordingRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NeedVoiceSliceRecording")
    private Boolean needVoiceSliceRecording;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DownloadRecordingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.needVoiceSliceRecording = builder.needVoiceSliceRecording;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadRecordingRequest create() {
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
     * @return needVoiceSliceRecording
     */
    public Boolean getNeedVoiceSliceRecording() {
        return this.needVoiceSliceRecording;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DownloadRecordingRequest, Builder> {
        private String instanceId; 
        private Boolean needVoiceSliceRecording; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadRecordingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.needVoiceSliceRecording = request.needVoiceSliceRecording;
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
         * NeedVoiceSliceRecording.
         */
        public Builder needVoiceSliceRecording(Boolean needVoiceSliceRecording) {
            this.putQueryParameter("NeedVoiceSliceRecording", needVoiceSliceRecording);
            this.needVoiceSliceRecording = needVoiceSliceRecording;
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
        public DownloadRecordingRequest build() {
            return new DownloadRecordingRequest(this);
        } 

    } 

}
