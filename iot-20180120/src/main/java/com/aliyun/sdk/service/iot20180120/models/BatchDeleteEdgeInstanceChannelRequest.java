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
 * {@link BatchDeleteEdgeInstanceChannelRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteEdgeInstanceChannelRequest</p>
 */
public class BatchDeleteEdgeInstanceChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> channelIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchDeleteEdgeInstanceChannelRequest(Builder builder) {
        super(builder);
        this.channelIds = builder.channelIds;
        this.driverId = builder.driverId;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteEdgeInstanceChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelIds
     */
    public java.util.List<String> getChannelIds() {
        return this.channelIds;
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchDeleteEdgeInstanceChannelRequest, Builder> {
        private java.util.List<String> channelIds; 
        private String driverId; 
        private String instanceId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteEdgeInstanceChannelRequest request) {
            super(request);
            this.channelIds = request.channelIds;
            this.driverId = request.driverId;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BE0BD49EF5EF4D119D09CC1B25******</p>
         */
        public Builder channelIds(java.util.List<String> channelIds) {
            this.putQueryParameter("ChannelIds", channelIds);
            this.channelIds = channelIds;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BatchDeleteEdgeInstanceChannelRequest build() {
            return new BatchDeleteEdgeInstanceChannelRequest(this);
        } 

    } 

}
