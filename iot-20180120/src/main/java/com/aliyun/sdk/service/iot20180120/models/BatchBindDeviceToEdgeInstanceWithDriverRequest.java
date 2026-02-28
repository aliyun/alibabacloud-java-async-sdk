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
 * {@link BatchBindDeviceToEdgeInstanceWithDriverRequest} extends {@link RequestModel}
 *
 * <p>BatchBindDeviceToEdgeInstanceWithDriverRequest</p>
 */
public class BatchBindDeviceToEdgeInstanceWithDriverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> iotIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchBindDeviceToEdgeInstanceWithDriverRequest(Builder builder) {
        super(builder);
        this.driverId = builder.driverId;
        this.instanceId = builder.instanceId;
        this.iotIds = builder.iotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindDeviceToEdgeInstanceWithDriverRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotIds
     */
    public java.util.List<String> getIotIds() {
        return this.iotIds;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchBindDeviceToEdgeInstanceWithDriverRequest, Builder> {
        private String driverId; 
        private String instanceId; 
        private java.util.List<String> iotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindDeviceToEdgeInstanceWithDriverRequest request) {
            super(request);
            this.driverId = request.driverId;
            this.instanceId = request.instanceId;
            this.iotIds = request.iotIds;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>The IDs of the devices.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69905.html">QueryDevice</a> operation to query detailed information about all devices that belong to the current Alibaba Cloud account and obtain the required device IDs.</p>
         * <blockquote>
         * <p> You can specify a maximum of 20 device IDs when you call the BatchBindDeviceToEdgeInstanceWithDriver operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>021d154d2a2f4dd7a489773d9e04****</p>
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Drivers</strong> page, move the pointer over the name of the driver that you want to configure and obtain the driver ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/155776.html">QueryEdgeDriver</a> operation to query the driver ID.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BXPV9Ks3bxwM9fD****0000101</p>
         */
        public Builder iotIds(java.util.List<String> iotIds) {
            this.putQueryParameter("IotIds", iotIds);
            this.iotIds = iotIds;
            return this;
        }

        /**
         * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance to which you want to bind multiple devices and obtain the instance ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BatchBindDeviceToEdgeInstanceWithDriverRequest build() {
            return new BatchBindDeviceToEdgeInstanceWithDriverRequest(this);
        } 

    } 

}
