// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link CreateCloneVoiceRequest} extends {@link RequestModel}
 *
 * <p>CreateCloneVoiceRequest</p>
 */
public class CreateCloneVoiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    private CreateCloneVoiceRequest(Builder builder) {
        super(builder);
        this.fileKey = builder.fileKey;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloneVoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
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

    public static final class Builder extends Request.Builder<CreateCloneVoiceRequest, Builder> {
        private String fileKey; 
        private String instanceId; 
        private String model; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloneVoiceRequest request) {
            super(request);
            this.fileKey = request.fileKey;
            this.instanceId = request.instanceId;
            this.model = request.model;
        } 

        /**
         * <p>文件Key</p>
         * 
         * <strong>example:</strong>
         * <p>voice_clone/upload/d25ace5f-c8c6-45af-a5b1-8fd6b8595747/019FDB17-4901-17A9-99D6-27B77BC047C0_record.wav</p>
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>模型名称</p>
         * 
         * <strong>example:</strong>
         * <p>CosyVoice</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        @Override
        public CreateCloneVoiceRequest build() {
            return new CreateCloneVoiceRequest(this);
        } 

    } 

}
