// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DownloadRecordingRequest} extends {@link RequestModel}
 *
 * <p>DownloadRecordingRequest</p>
 */
public class DownloadRecordingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedVoiceSliceRecording")
    private Boolean needVoiceSliceRecording;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>744b27f3-437f-4a8c-a181-f668e492fd24</p>
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
