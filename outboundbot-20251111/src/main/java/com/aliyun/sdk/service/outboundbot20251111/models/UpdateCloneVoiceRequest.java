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
 * {@link UpdateCloneVoiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloneVoiceRequest</p>
 */
public class UpdateCloneVoiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloneVoiceId")
    private String cloneVoiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateCloneVoiceRequest(Builder builder) {
        super(builder);
        this.cloneVoiceId = builder.cloneVoiceId;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloneVoiceRequest create() {
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateCloneVoiceRequest, Builder> {
        private String cloneVoiceId; 
        private String instanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloneVoiceRequest request) {
            super(request);
            this.cloneVoiceId = request.cloneVoiceId;
            this.instanceId = request.instanceId;
            this.name = request.name;
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

        /**
         * <p>名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateCloneVoiceRequest build() {
            return new UpdateCloneVoiceRequest(this);
        } 

    } 

}
