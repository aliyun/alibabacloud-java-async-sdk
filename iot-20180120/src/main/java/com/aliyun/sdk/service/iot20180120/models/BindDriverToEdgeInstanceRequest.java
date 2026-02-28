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
 * {@link BindDriverToEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>BindDriverToEdgeInstanceRequest</p>
 */
public class BindDriverToEdgeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverVersion")
    private String driverVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
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
         * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Drivers</strong> page, move the pointer over the name of the driver that you want to bind and obtain the driver ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/155776.html">QueryEdgeDriver</a> operation to query the driver ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9c1ae7bd59f1469abbdccc959228****</p>
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * <p>The version number of the driver. By default, if you do not specify this parameter, the latest version of the driver is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder driverVersion(String driverVersion) {
            this.putQueryParameter("DriverVersion", driverVersion);
            this.driverVersion = driverVersion;
            return this;
        }

        /**
         * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance to which you want to bind a driver and obtain the instance ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F3APY0tPLhmgGtx0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * <blockquote>
         * <p> This parameter is required if you use a third-party driver that is purchased from the IoT marketplace. If an official or self-developed driver is used, you do not need to specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11123458765****</p>
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
