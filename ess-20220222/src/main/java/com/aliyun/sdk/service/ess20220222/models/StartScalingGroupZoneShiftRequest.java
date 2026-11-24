// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link StartScalingGroupZoneShiftRequest} extends {@link RequestModel}
 *
 * <p>StartScalingGroupZoneShiftRequest</p>
 */
public class StartScalingGroupZoneShiftRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiryTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expiryTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImpairedZoneIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> impairedZoneIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    private StartScalingGroupZoneShiftRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.expiryTime = builder.expiryTime;
        this.impairedZoneIds = builder.impairedZoneIds;
        this.regionId = builder.regionId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartScalingGroupZoneShiftRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return expiryTime
     */
    public String getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * @return impairedZoneIds
     */
    public java.util.List<String> getImpairedZoneIds() {
        return this.impairedZoneIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<StartScalingGroupZoneShiftRequest, Builder> {
        private String clientToken; 
        private String expiryTime; 
        private java.util.List<String> impairedZoneIds; 
        private String regionId; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(StartScalingGroupZoneShiftRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.expiryTime = request.expiryTime;
            this.impairedZoneIds = request.impairedZoneIds;
            this.regionId = request.regionId;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see Ensure idempotence.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The expiration time of the zone transfer. After the time expires, the system automatically ends the transfer and restores the related zones. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time must be in UTC. The value must be later than the current time and cannot be more than 3 days after the current time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T12:05Z</p>
         */
        public Builder expiryTime(String expiryTime) {
            this.putQueryParameter("ExpiryTime", expiryTime);
            this.expiryTime = expiryTime;
            return this;
        }

        /**
         * <p>The IDs of the impaired zones. Valid values of N: 1 to 5.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder impairedZoneIds(java.util.List<String> impairedZoneIds) {
            this.putQueryParameter("ImpairedZoneIds", impairedZoneIds);
            this.impairedZoneIds = impairedZoneIds;
            return this;
        }

        /**
         * <p>The region ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp14wlu85wrpchm0****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public StartScalingGroupZoneShiftRequest build() {
            return new StartScalingGroupZoneShiftRequest(this);
        } 

    } 

}
