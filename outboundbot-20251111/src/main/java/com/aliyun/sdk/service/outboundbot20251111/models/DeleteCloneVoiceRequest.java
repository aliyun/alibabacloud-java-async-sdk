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
 * {@link DeleteCloneVoiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloneVoiceRequest</p>
 */
public class DeleteCloneVoiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloneVoiceId")
    private String cloneVoiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DeleteCloneVoiceRequest(Builder builder) {
        super(builder);
        this.cloneVoiceId = builder.cloneVoiceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloneVoiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloneVoiceId
     */
    public String getCloneVoiceId() {
        return this.cloneVoiceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteCloneVoiceRequest, Builder> {
        private String cloneVoiceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCloneVoiceRequest request) {
            super(request);
            this.cloneVoiceId = request.cloneVoiceId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>克隆音色ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
         */
        public Builder cloneVoiceId(String cloneVoiceId) {
            this.putBodyParameter("CloneVoiceId", cloneVoiceId);
            this.cloneVoiceId = cloneVoiceId;
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

        @Override
        public DeleteCloneVoiceRequest build() {
            return new DeleteCloneVoiceRequest(this);
        } 

    } 

}
