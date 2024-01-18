// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetServiceInstanceRequest</p>
 */
public class GetServiceInstanceRequest extends Request {
    @Query
    @NameInMap("MarketInstanceId")
    private String marketInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    private GetServiceInstanceRequest(Builder builder) {
        super(builder);
        this.marketInstanceId = builder.marketInstanceId;
        this.regionId = builder.regionId;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marketInstanceId
     */
    public String getMarketInstanceId() {
        return this.marketInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<GetServiceInstanceRequest, Builder> {
        private String marketInstanceId; 
        private String regionId; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceInstanceRequest request) {
            super(request);
            this.marketInstanceId = request.marketInstanceId;
            this.regionId = request.regionId;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * MarketInstanceId.
         */
        public Builder marketInstanceId(String marketInstanceId) {
            this.putQueryParameter("MarketInstanceId", marketInstanceId);
            this.marketInstanceId = marketInstanceId;
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
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public GetServiceInstanceRequest build() {
            return new GetServiceInstanceRequest(this);
        } 

    } 

}
