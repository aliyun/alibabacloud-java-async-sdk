// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCustomIncidentsRequest} extends {@link RequestModel}
 *
 * <p>SendCustomIncidentsRequest</p>
 */
public class SendCustomIncidentsRequest extends Request {
    @Query
    @NameInMap("Incidents")
    @Validation(required = true)
    private String incidents;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SendCustomIncidentsRequest(Builder builder) {
        super(builder);
        this.incidents = builder.incidents;
        this.productType = builder.productType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCustomIncidentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incidents
     */
    public String getIncidents() {
        return this.incidents;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SendCustomIncidentsRequest, Builder> {
        private String incidents; 
        private String productType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SendCustomIncidentsRequest request) {
            super(request);
            this.incidents = request.incidents;
            this.productType = request.productType;
            this.regionId = request.regionId;
        } 

        /**
         * Incidents.
         */
        public Builder incidents(String incidents) {
            this.putQueryParameter("Incidents", incidents);
            this.incidents = incidents;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
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
        public SendCustomIncidentsRequest build() {
            return new SendCustomIncidentsRequest(this);
        } 

    } 

}
