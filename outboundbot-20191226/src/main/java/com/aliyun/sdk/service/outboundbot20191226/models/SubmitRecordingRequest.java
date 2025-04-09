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
 * {@link SubmitRecordingRequest} extends {@link RequestModel}
 *
 * <p>SubmitRecordingRequest</p>
 */
public class SubmitRecordingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MergedRecording")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mergedRecording;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRecording")
    private String resourceRecording;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;contactId&quot;:&quot;3d35c0487cc041abb7ad0ce61752601f&quot;,&quot;duration&quot;:27,&quot;fileName&quot;:&quot;ce2659e5-a20b-4f8e-91b5-5cd909c6b96e_3d35c0487cc041abb7ad0ce61752601f.wav&quot;,&quot;filePath&quot;:&quot;oss://ForCompatibility/waveforms/&quot;,&quot;startTime&quot;:1579057583670,&quot;type&quot;:&quot;Merged&quot;}</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e4e2a770-b97b-465a-80d8-06dca008c503</p>
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
