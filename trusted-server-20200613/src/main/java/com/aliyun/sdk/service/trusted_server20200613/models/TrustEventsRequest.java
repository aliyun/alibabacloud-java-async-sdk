// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrustEventsRequest} extends {@link RequestModel}
 *
 * <p>TrustEventsRequest</p>
 */
public class TrustEventsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("EventUuids")
    @Validation(required = true)
    private String eventUuids;

    @Query
    @NameInMap("HandleStyle")
    private Integer handleStyle;

    private TrustEventsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.eventUuids = builder.eventUuids;
        this.handleStyle = builder.handleStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrustEventsRequest create() {
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
     * @return eventUuids
     */
    public String getEventUuids() {
        return this.eventUuids;
    }

    /**
     * @return handleStyle
     */
    public Integer getHandleStyle() {
        return this.handleStyle;
    }

    public static final class Builder extends Request.Builder<TrustEventsRequest, Builder> {
        private String regionId; 
        private String eventUuids; 
        private Integer handleStyle; 

        private Builder() {
            super();
        } 

        private Builder(TrustEventsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.eventUuids = request.eventUuids;
            this.handleStyle = request.handleStyle;
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
         * EventUuids.
         */
        public Builder eventUuids(String eventUuids) {
            this.putQueryParameter("EventUuids", eventUuids);
            this.eventUuids = eventUuids;
            return this;
        }

        /**
         * HandleStyle.
         */
        public Builder handleStyle(Integer handleStyle) {
            this.putQueryParameter("HandleStyle", handleStyle);
            this.handleStyle = handleStyle;
            return this;
        }

        @Override
        public TrustEventsRequest build() {
            return new TrustEventsRequest(this);
        } 

    } 

}
