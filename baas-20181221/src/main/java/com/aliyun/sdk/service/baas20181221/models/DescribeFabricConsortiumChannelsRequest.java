// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumChannelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricConsortiumChannelsRequest</p>
 */
public class DescribeFabricConsortiumChannelsRequest extends Request {
    @Query
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("Location")
    private String location;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricConsortiumChannelsRequest(Builder builder) {
        super(builder);
        this.consortiumId = builder.consortiumId;
        this.location = builder.location;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricConsortiumChannelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricConsortiumChannelsRequest, Builder> {
        private String consortiumId; 
        private String location; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricConsortiumChannelsRequest response) {
            super(response);
            this.consortiumId = response.consortiumId;
            this.location = response.location;
            this.regionId = response.regionId;
        } 

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putQueryParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFabricConsortiumChannelsRequest build() {
            return new DescribeFabricConsortiumChannelsRequest(this);
        } 

    } 

}
