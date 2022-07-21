// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindDriverToEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>BindDriverToEdgeInstanceRequest</p>
 */
public class BindDriverToEdgeInstanceRequest extends Request {
    @Query
    @NameInMap("DriverId")
    @Validation(required = true)
    private String driverId;

    @Query
    @NameInMap("DriverVersion")
    private String driverVersion;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    private BindDriverToEdgeInstanceRequest(Builder builder) {
        super(builder);
        this.driverId = builder.driverId;
        this.driverVersion = builder.driverVersion;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindDriverToEdgeInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driverId
     */
    public String getDriverId() {
        return this.driverId;
    }

    /**
     * @return driverVersion
     */
    public String getDriverVersion() {
        return this.driverVersion;
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
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<BindDriverToEdgeInstanceRequest, Builder> {
        private String driverId; 
        private String driverVersion; 
        private String instanceId; 
        private String iotInstanceId; 
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(BindDriverToEdgeInstanceRequest request) {
            super(request);
            this.driverId = request.driverId;
            this.driverVersion = request.driverVersion;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.orderId = request.orderId;
        } 

        /**
         * DriverId.
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * DriverVersion.
         */
        public Builder driverVersion(String driverVersion) {
            this.putQueryParameter("DriverVersion", driverVersion);
            this.driverVersion = driverVersion;
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
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public BindDriverToEdgeInstanceRequest build() {
            return new BindDriverToEdgeInstanceRequest(this);
        } 

    } 

}
