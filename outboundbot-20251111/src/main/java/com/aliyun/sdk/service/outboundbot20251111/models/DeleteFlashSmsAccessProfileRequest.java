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
 * {@link DeleteFlashSmsAccessProfileRequest} extends {@link RequestModel}
 *
 * <p>DeleteFlashSmsAccessProfileRequest</p>
 */
public class DeleteFlashSmsAccessProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessProfileId")
    private String accessProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DeleteFlashSmsAccessProfileRequest(Builder builder) {
        super(builder);
        this.accessProfileId = builder.accessProfileId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFlashSmsAccessProfileRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFlashSmsAccessProfileRequest, Builder> {
        private String accessProfileId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFlashSmsAccessProfileRequest request) {
            super(request);
            this.accessProfileId = request.accessProfileId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>接入配置ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder accessProfileId(String accessProfileId) {
            this.putBodyParameter("AccessProfileId", accessProfileId);
            this.accessProfileId = accessProfileId;
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
        public DeleteFlashSmsAccessProfileRequest build() {
            return new DeleteFlashSmsAccessProfileRequest(this);
        } 

    } 

}
