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
 * {@link CreateVoiceCloneRequest} extends {@link RequestModel}
 *
 * <p>CreateVoiceCloneRequest</p>
 */
public class CreateVoiceCloneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voiceName;

    private CreateVoiceCloneRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.voiceName = builder.voiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVoiceCloneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return voiceName
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    public static final class Builder extends Request.Builder<CreateVoiceCloneRequest, Builder> {
        private String fileId; 
        private String instanceId; 
        private String model; 
        private String voiceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateVoiceCloneRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.voiceName = request.voiceName;
        } 

        /**
         * <p>The Folder field returned after a file is uploaded by calling the GetJobDataUploadParams operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>voiceclone/recordings/demo.mp3</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The model used for voice cloning.</p>
         * 
         * <strong>example:</strong>
         * <p>cosyvoice-v3.5-flash</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The name of the cloned voice. The names of enabled voices within the same instance must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloned voice 1</p>
         */
        public Builder voiceName(String voiceName) {
            this.putQueryParameter("VoiceName", voiceName);
            this.voiceName = voiceName;
            return this;
        }

        @Override
        public CreateVoiceCloneRequest build() {
            return new CreateVoiceCloneRequest(this);
        } 

    } 

}
