// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ReplaceEdgeInstanceGatewayRequest} extends {@link RequestModel}
 *
 * <p>ReplaceEdgeInstanceGatewayRequest</p>
 */
public class ReplaceEdgeInstanceGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newGatewayId;

    private ReplaceEdgeInstanceGatewayRequest(Builder builder) {
        super(builder);
        this.currentGatewayId = builder.currentGatewayId;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.newGatewayId = builder.newGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceEdgeInstanceGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentGatewayId
     */
    public String getCurrentGatewayId() {
        return this.currentGatewayId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return newGatewayId
     */
    public String getNewGatewayId() {
        return this.newGatewayId;
    }

    public static final class Builder extends Request.Builder<ReplaceEdgeInstanceGatewayRequest, Builder> {
        private String currentGatewayId; 
        private String instanceId; 
        private String iotInstanceId; 
        private String newGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceEdgeInstanceGatewayRequest request) {
            super(request);
            this.currentGatewayId = request.currentGatewayId;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.newGatewayId = request.newGatewayId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oTCJomvT95WPyPPQ5sje******</p>
         */
        public Builder currentGatewayId(String currentGatewayId) {
            this.putQueryParameter("CurrentGatewayId", currentGatewayId);
            this.currentGatewayId = currentGatewayId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>G4TGWGYwpo8zwr******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65SkFyhZcU5d3PO2Ri13******</p>
         */
        public Builder newGatewayId(String newGatewayId) {
            this.putQueryParameter("NewGatewayId", newGatewayId);
            this.newGatewayId = newGatewayId;
            return this;
        }

        @Override
        public ReplaceEdgeInstanceGatewayRequest build() {
            return new ReplaceEdgeInstanceGatewayRequest(this);
        } 

    } 

}
