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
 * {@link DeleteVoiceCloneRequest} extends {@link RequestModel}
 *
 * <p>DeleteVoiceCloneRequest</p>
 */
public class DeleteVoiceCloneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String voiceId;

    private DeleteVoiceCloneRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.voiceId = builder.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVoiceCloneRequest create() {
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
     * @return voiceId
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    public static final class Builder extends Request.Builder<DeleteVoiceCloneRequest, Builder> {
        private String instanceId; 
        private String voiceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVoiceCloneRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.voiceId = request.voiceId;
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
         * <p>The ID of the cloned voice to delete.</p>
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

        @Override
        public DeleteVoiceCloneRequest build() {
            return new DeleteVoiceCloneRequest(this);
        } 

    } 

}
