// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link DeleteVoiceAccessProfileRequest} extends {@link RequestModel}
 *
 * <p>DeleteVoiceAccessProfileRequest</p>
 */
public class DeleteVoiceAccessProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessProfileId")
    private String accessProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DeleteVoiceAccessProfileRequest(Builder builder) {
        super(builder);
        this.accessProfileId = builder.accessProfileId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVoiceAccessProfileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessProfileId
     */
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteVoiceAccessProfileRequest, Builder> {
        private String accessProfileId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVoiceAccessProfileRequest request) {
            super(request);
            this.accessProfileId = request.accessProfileId;
            this.instanceId = request.instanceId;
        } 

        /**
         * AccessProfileId.
         */
        public Builder accessProfileId(String accessProfileId) {
            this.putBodyParameter("AccessProfileId", accessProfileId);
            this.accessProfileId = accessProfileId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteVoiceAccessProfileRequest build() {
            return new DeleteVoiceAccessProfileRequest(this);
        } 

    } 

}
