// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceEdgeInstanceGatewayRequest} extends {@link RequestModel}
 *
 * <p>ReplaceEdgeInstanceGatewayRequest</p>
 */
public class ReplaceEdgeInstanceGatewayRequest extends Request {
    @Query
    @NameInMap("CurrentGatewayId")
    @Validation(required = true)
    private String currentGatewayId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("NewGatewayId")
    @Validation(required = true)
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
         * CurrentGatewayId.
         */
        public Builder currentGatewayId(String currentGatewayId) {
            this.putQueryParameter("CurrentGatewayId", currentGatewayId);
            this.currentGatewayId = currentGatewayId;
            return this;
        }

        /**
         * InstanceId.
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
         * NewGatewayId.
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
