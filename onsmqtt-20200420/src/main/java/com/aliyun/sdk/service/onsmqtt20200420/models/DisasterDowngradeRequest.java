// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link DisasterDowngradeRequest} extends {@link RequestModel}
 *
 * <p>DisasterDowngradeRequest</p>
 */
public class DisasterDowngradeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DowngradeInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String downgradeInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DisasterDowngradeRequest(Builder builder) {
        super(builder);
        this.downgradeInstanceId = builder.downgradeInstanceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisasterDowngradeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downgradeInstanceId
     */
    public String getDowngradeInstanceId() {
        return this.downgradeInstanceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DisasterDowngradeRequest, Builder> {
        private String downgradeInstanceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DisasterDowngradeRequest request) {
            super(request);
            this.downgradeInstanceId = request.downgradeInstanceId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance for which you want to downgrade the VIP access.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-xxxx</p>
         */
        public Builder downgradeInstanceId(String downgradeInstanceId) {
            this.putBodyParameter("DowngradeInstanceId", downgradeInstanceId);
            this.downgradeInstanceId = downgradeInstanceId;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DisasterDowngradeRequest build() {
            return new DisasterDowngradeRequest(this);
        } 

    } 

}
