// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveRealtimeLogAuthorizedRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveRealtimeLogAuthorizedRequest</p>
 */
public class DescribeLiveRealtimeLogAuthorizedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveOpenapiReserve")
    private String liveOpenapiReserve;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeLiveRealtimeLogAuthorizedRequest(Builder builder) {
        super(builder);
        this.liveOpenapiReserve = builder.liveOpenapiReserve;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRealtimeLogAuthorizedRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveOpenapiReserve
     */
    public String getLiveOpenapiReserve() {
        return this.liveOpenapiReserve;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeLiveRealtimeLogAuthorizedRequest, Builder> {
        private String liveOpenapiReserve; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveRealtimeLogAuthorizedRequest request) {
            super(request);
            this.liveOpenapiReserve = request.liveOpenapiReserve;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter has no practical significance.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder liveOpenapiReserve(String liveOpenapiReserve) {
            this.putQueryParameter("LiveOpenapiReserve", liveOpenapiReserve);
            this.liveOpenapiReserve = liveOpenapiReserve;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeLiveRealtimeLogAuthorizedRequest build() {
            return new DescribeLiveRealtimeLogAuthorizedRequest(this);
        } 

    } 

}
