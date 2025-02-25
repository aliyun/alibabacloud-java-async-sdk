// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyOfflineStoragesRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfflineStoragesRequest</p>
 */
public class ModifyOfflineStoragesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private byte[] instanceId;

    private ModifyOfflineStoragesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfflineStoragesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public byte[] getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyOfflineStoragesRequest, Builder> {
        private byte[] instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfflineStoragesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test-xxx</p>
         */
        public Builder instanceId(byte[] instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyOfflineStoragesRequest build() {
            return new ModifyOfflineStoragesRequest(this);
        } 

    } 

}
