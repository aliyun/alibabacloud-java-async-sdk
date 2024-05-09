// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BlockAlarmNotificationRequest} extends {@link RequestModel}
 *
 * <p>BlockAlarmNotificationRequest</p>
 */
public class BlockAlarmNotificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long alarmId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandlerId")
    private Long handlerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeout;

    private BlockAlarmNotificationRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
        this.handlerId = builder.handlerId;
        this.regionId = builder.regionId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BlockAlarmNotificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmId
     */
    public Long getAlarmId() {
        return this.alarmId;
    }

    /**
     * @return handlerId
     */
    public Long getHandlerId() {
        return this.handlerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<BlockAlarmNotificationRequest, Builder> {
        private Long alarmId; 
        private Long handlerId; 
        private String regionId; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(BlockAlarmNotificationRequest request) {
            super(request);
            this.alarmId = request.alarmId;
            this.handlerId = request.handlerId;
            this.regionId = request.regionId;
            this.timeout = request.timeout;
        } 

        /**
         * AlarmId.
         */
        public Builder alarmId(Long alarmId) {
            this.putQueryParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        /**
         * HandlerId.
         */
        public Builder handlerId(Long handlerId) {
            this.putQueryParameter("HandlerId", handlerId);
            this.handlerId = handlerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public BlockAlarmNotificationRequest build() {
            return new BlockAlarmNotificationRequest(this);
        } 

    } 

}
