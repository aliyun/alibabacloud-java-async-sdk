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
 * {@link BatchSetEdgeInstanceDeviceChannelRequest} extends {@link RequestModel}
 *
 * <p>BatchSetEdgeInstanceDeviceChannelRequest</p>
 */
public class BatchSetEdgeInstanceDeviceChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

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

    private BatchSetEdgeInstanceDeviceChannelRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.driverId = builder.driverId;
        this.instanceId = builder.instanceId;
        this.iotIds = builder.iotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetEdgeInstanceDeviceChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
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

    public static final class Builder extends Request.Builder<BatchSetEdgeInstanceDeviceChannelRequest, Builder> {
        private String channelId; 
        private String driverId; 
        private String instanceId; 
        private java.util.List<String> iotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetEdgeInstanceDeviceChannelRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.driverId = request.driverId;
            this.instanceId = request.instanceId;
            this.iotIds = request.iotIds;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BE0BD49EF5EF4D119D09CC1B25******</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
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
        public BatchSetEdgeInstanceDeviceChannelRequest build() {
            return new BatchSetEdgeInstanceDeviceChannelRequest(this);
        } 

    } 

}
