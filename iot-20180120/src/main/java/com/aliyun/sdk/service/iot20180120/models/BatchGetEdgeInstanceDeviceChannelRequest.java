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
 * {@link BatchGetEdgeInstanceDeviceChannelRequest} extends {@link RequestModel}
 *
 * <p>BatchGetEdgeInstanceDeviceChannelRequest</p>
 */
public class BatchGetEdgeInstanceDeviceChannelRequest extends Request {
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

    private BatchGetEdgeInstanceDeviceChannelRequest(Builder builder) {
        super(builder);
        this.driverId = builder.driverId;
        this.instanceId = builder.instanceId;
        this.iotIds = builder.iotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeInstanceDeviceChannelRequest create() {
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

    public static final class Builder extends Request.Builder<BatchGetEdgeInstanceDeviceChannelRequest, Builder> {
        private String driverId; 
        private String instanceId; 
        private java.util.List<String> iotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetEdgeInstanceDeviceChannelRequest request) {
            super(request);
            this.driverId = request.driverId;
            this.instanceId = request.instanceId;
            this.iotIds = request.iotIds;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9c1ae7bd59f1469abbdccc9592******</p>
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6GaTtvTj7vJhiS******</p>
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
         * <p>Hathoyxglj9jpYPyw3WN******</p>
         */
        public Builder iotIds(java.util.List<String> iotIds) {
            this.putQueryParameter("IotIds", iotIds);
            this.iotIds = iotIds;
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

        @Override
        public BatchGetEdgeInstanceDeviceChannelRequest build() {
            return new BatchGetEdgeInstanceDeviceChannelRequest(this);
        } 

    } 

}
