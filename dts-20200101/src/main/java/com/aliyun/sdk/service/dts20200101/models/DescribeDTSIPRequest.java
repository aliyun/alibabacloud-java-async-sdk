// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDTSIPRequest} extends {@link RequestModel}
 *
 * <p>DescribeDTSIPRequest</p>
 */
public class DescribeDTSIPRequest extends Request {
    @Query
    @NameInMap("DestinationEndpointRegion")
    private String destinationEndpointRegion;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceEndpointRegion")
    @Validation(required = true)
    private String sourceEndpointRegion;

    private DescribeDTSIPRequest(Builder builder) {
        super(builder);
        this.destinationEndpointRegion = builder.destinationEndpointRegion;
        this.regionId = builder.regionId;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDTSIPRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationEndpointRegion
     */
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public static final class Builder extends Request.Builder<DescribeDTSIPRequest, Builder> {
        private String destinationEndpointRegion; 
        private String regionId; 
        private String sourceEndpointRegion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDTSIPRequest response) {
            super(response);
            this.destinationEndpointRegion = response.destinationEndpointRegion;
            this.regionId = response.regionId;
            this.sourceEndpointRegion = response.sourceEndpointRegion;
        } 

        /**
         * DestinationEndpointRegion.
         */
        public Builder destinationEndpointRegion(String destinationEndpointRegion) {
            this.putQueryParameter("DestinationEndpointRegion", destinationEndpointRegion);
            this.destinationEndpointRegion = destinationEndpointRegion;
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
         * SourceEndpointRegion.
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        @Override
        public DescribeDTSIPRequest build() {
            return new DescribeDTSIPRequest(this);
        } 

    } 

}
