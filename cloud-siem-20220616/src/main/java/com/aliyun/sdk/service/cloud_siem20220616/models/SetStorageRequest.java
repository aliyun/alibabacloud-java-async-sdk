// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetStorageRequest} extends {@link RequestModel}
 *
 * <p>SetStorageRequest</p>
 */
public class SetStorageRequest extends Request {
    @Body
    @NameInMap("Region")
    private String region;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Ttl")
    @Validation(required = true)
    private Integer ttl;

    private SetStorageRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<SetStorageRequest, Builder> {
        private String region; 
        private String regionId; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(SetStorageRequest request) {
            super(request);
            this.region = request.region;
            this.regionId = request.regionId;
            this.ttl = request.ttl;
        } 

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putBodyParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public SetStorageRequest build() {
            return new SetStorageRequest(this);
        } 

    } 

}
