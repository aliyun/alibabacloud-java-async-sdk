// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOfflineStoragesRequest} extends {@link RequestModel}
 *
 * <p>ListOfflineStoragesRequest</p>
 */
public class ListOfflineStoragesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private byte[] instanceId;

    private ListOfflineStoragesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOfflineStoragesRequest create() {
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

    public static final class Builder extends Request.Builder<ListOfflineStoragesRequest, Builder> {
        private byte[] instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListOfflineStoragesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>instanceId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-xxx</p>
         */
        public Builder instanceId(byte[] instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListOfflineStoragesRequest build() {
            return new ListOfflineStoragesRequest(this);
        } 

    } 

}
