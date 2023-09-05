// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PckCrlRequest} extends {@link RequestModel}
 *
 * <p>PckCrlRequest</p>
 */
public class PckCrlRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ca")
    @Validation(required = true)
    private String ca;

    private PckCrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ca = builder.ca;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PckCrlRequest create() {
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
     * @return ca
     */
    public String getCa() {
        return this.ca;
    }

    public static final class Builder extends Request.Builder<PckCrlRequest, Builder> {
        private String regionId; 
        private String ca; 

        private Builder() {
            super();
        } 

        private Builder(PckCrlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ca = request.ca;
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
         * ca.
         */
        public Builder ca(String ca) {
            this.putQueryParameter("ca", ca);
            this.ca = ca;
            return this;
        }

        @Override
        public PckCrlRequest build() {
            return new PckCrlRequest(this);
        } 

    } 

}
