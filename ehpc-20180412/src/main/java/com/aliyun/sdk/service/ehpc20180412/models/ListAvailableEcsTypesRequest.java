// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableEcsTypesRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableEcsTypesRequest</p>
 */
public class ListAvailableEcsTypesRequest extends Request {
    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("ShowSoldOut")
    private Boolean showSoldOut;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private ListAvailableEcsTypesRequest(Builder builder) {
        super(builder);
        this.instanceChargeType = builder.instanceChargeType;
        this.showSoldOut = builder.showSoldOut;
        this.spotStrategy = builder.spotStrategy;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableEcsTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return showSoldOut
     */
    public Boolean getShowSoldOut() {
        return this.showSoldOut;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListAvailableEcsTypesRequest, Builder> {
        private String instanceChargeType; 
        private Boolean showSoldOut; 
        private String spotStrategy; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableEcsTypesRequest response) {
            super(response);
            this.instanceChargeType = response.instanceChargeType;
            this.showSoldOut = response.showSoldOut;
            this.spotStrategy = response.spotStrategy;
            this.zoneId = response.zoneId;
        } 

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * ShowSoldOut.
         */
        public Builder showSoldOut(Boolean showSoldOut) {
            this.putQueryParameter("ShowSoldOut", showSoldOut);
            this.showSoldOut = showSoldOut;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListAvailableEcsTypesRequest build() {
            return new ListAvailableEcsTypesRequest(this);
        } 

    } 

}
