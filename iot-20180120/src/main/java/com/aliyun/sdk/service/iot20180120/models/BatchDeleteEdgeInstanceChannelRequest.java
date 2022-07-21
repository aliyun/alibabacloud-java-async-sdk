// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteEdgeInstanceChannelRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteEdgeInstanceChannelRequest</p>
 */
public class BatchDeleteEdgeInstanceChannelRequest extends Request {
    @Query
    @NameInMap("ChannelIds")
    @Validation(required = true)
    private java.util.List < String > channelIds;

    @Query
    @NameInMap("DriverId")
    @Validation(required = true)
    private String driverId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
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
    public java.util.List < String > getChannelIds() {
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
        private java.util.List < String > channelIds; 
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
         * ChannelIds.
         */
        public Builder channelIds(java.util.List < String > channelIds) {
            this.putQueryParameter("ChannelIds", channelIds);
            this.channelIds = channelIds;
            return this;
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

        @Override
        public BatchDeleteEdgeInstanceChannelRequest build() {
            return new BatchDeleteEdgeInstanceChannelRequest(this);
        } 

    } 

}
