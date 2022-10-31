// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterTimedEventRequest} extends {@link RequestModel}
 *
 * <p>SetCasterTimedEventRequest</p>
 */
public class SetCasterTimedEventRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("EventName")
    @Validation(required = true)
    private String eventName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTimeUTC")
    @Validation(required = true)
    private String startTimeUTC;

    private SetCasterTimedEventRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.eventName = builder.eventName;
        this.ownerId = builder.ownerId;
        this.startTimeUTC = builder.startTimeUTC;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCasterTimedEventRequest create() {
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
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTimeUTC
     */
    public String getStartTimeUTC() {
        return this.startTimeUTC;
    }

    public static final class Builder extends Request.Builder<SetCasterTimedEventRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private String eventName; 
        private Long ownerId; 
        private String startTimeUTC; 

        private Builder() {
            super();
        } 

        private Builder(SetCasterTimedEventRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.eventName = request.eventName;
            this.ownerId = request.ownerId;
            this.startTimeUTC = request.startTimeUTC;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * EventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StartTimeUTC.
         */
        public Builder startTimeUTC(String startTimeUTC) {
            this.putQueryParameter("StartTimeUTC", startTimeUTC);
            this.startTimeUTC = startTimeUTC;
            return this;
        }

        @Override
        public SetCasterTimedEventRequest build() {
            return new SetCasterTimedEventRequest(this);
        } 

    } 

}
