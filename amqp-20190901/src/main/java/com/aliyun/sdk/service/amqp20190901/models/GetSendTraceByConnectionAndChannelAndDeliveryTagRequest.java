// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetSendTraceByConnectionAndChannelAndDeliveryTagRequest} extends {@link RequestModel}
 *
 * <p>GetSendTraceByConnectionAndChannelAndDeliveryTagRequest</p>
 */
public class GetSendTraceByConnectionAndChannelAndDeliveryTagRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deliveryTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private GetSendTraceByConnectionAndChannelAndDeliveryTagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelId = builder.channelId;
        this.clientToken = builder.clientToken;
        this.connectionId = builder.connectionId;
        this.consoleSessionId = builder.consoleSessionId;
        this.deliveryTag = builder.deliveryTag;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.startTime = builder.startTime;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSendTraceByConnectionAndChannelAndDeliveryTagRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return deliveryTag
     */
    public Long getDeliveryTag() {
        return this.deliveryTag;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<GetSendTraceByConnectionAndChannelAndDeliveryTagRequest, Builder> {
        private String regionId; 
        private String channelId; 
        private String clientToken; 
        private String connectionId; 
        private String consoleSessionId; 
        private Long deliveryTag; 
        private Integer endTime; 
        private String instanceId; 
        private Integer startTime; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(GetSendTraceByConnectionAndChannelAndDeliveryTagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelId = request.channelId;
            this.clientToken = request.clientToken;
            this.connectionId = request.connectionId;
            this.consoleSessionId = request.consoleSessionId;
            this.deliveryTag = request.deliveryTag;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.startTime = request.startTime;
            this.vhostName = request.vhostName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder connectionId(String connectionId) {
            this.putQueryParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deliveryTag(Long deliveryTag) {
            this.putQueryParameter("DeliveryTag", deliveryTag);
            this.deliveryTag = deliveryTag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vhostName(String vhostName) {
            this.putQueryParameter("VhostName", vhostName);
            this.vhostName = vhostName;
            return this;
        }

        @Override
        public GetSendTraceByConnectionAndChannelAndDeliveryTagRequest build() {
            return new GetSendTraceByConnectionAndChannelAndDeliveryTagRequest(this);
        } 

    } 

}
