// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLiveStreamMonitorRequest} extends {@link RequestModel}
 *
 * <p>StopLiveStreamMonitorRequest</p>
 */
public class StopLiveStreamMonitorRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("MonitorId")
    @Validation(required = true)
    private String monitorId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private StopLiveStreamMonitorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.monitorId = builder.monitorId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopLiveStreamMonitorRequest create() {
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
     * @return monitorId
     */
    public String getMonitorId() {
        return this.monitorId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<StopLiveStreamMonitorRequest, Builder> {
        private String regionId; 
        private String monitorId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(StopLiveStreamMonitorRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.monitorId = request.monitorId;
            this.ownerId = request.ownerId;
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
         * MonitorId.
         */
        public Builder monitorId(String monitorId) {
            this.putQueryParameter("MonitorId", monitorId);
            this.monitorId = monitorId;
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

        @Override
        public StopLiveStreamMonitorRequest build() {
            return new StopLiveStreamMonitorRequest(this);
        } 

    } 

}
