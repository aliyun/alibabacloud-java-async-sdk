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
 * {@link ModifyVoiceCloneRequest} extends {@link RequestModel}
 *
 * <p>ModifyVoiceCloneRequest</p>
 */
public class ModifyVoiceCloneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceName")
    private String voiceName;

    private ModifyVoiceCloneRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.status = builder.status;
        this.voiceId = builder.voiceId;
        this.voiceName = builder.voiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVoiceCloneRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return voiceId
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * @return voiceName
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    public static final class Builder extends Request.Builder<ModifyVoiceCloneRequest, Builder> {
        private String instanceId; 
        private String status; 
        private String voiceId; 
        private String voiceName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVoiceCloneRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.status = request.status;
            this.voiceId = request.voiceId;
            this.voiceName = request.voiceName;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cosyvoice-v2-067dc4b2e9d34dbeb5de20b5b093d1e3</p>
         */
        public Builder voiceId(String voiceId) {
            this.putQueryParameter("VoiceId", voiceId);
            this.voiceId = voiceId;
            return this;
        }

        /**
         * VoiceName.
         */
        public Builder voiceName(String voiceName) {
            this.putQueryParameter("VoiceName", voiceName);
            this.voiceName = voiceName;
            return this;
        }

        @Override
        public ModifyVoiceCloneRequest build() {
            return new ModifyVoiceCloneRequest(this);
        } 

    } 

}
