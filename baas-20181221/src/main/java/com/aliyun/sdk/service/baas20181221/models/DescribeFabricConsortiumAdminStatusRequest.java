// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumAdminStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricConsortiumAdminStatusRequest</p>
 */
public class DescribeFabricConsortiumAdminStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    private DescribeFabricConsortiumAdminStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.location = builder.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricConsortiumAdminStatusRequest create() {
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
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    public static final class Builder extends Request.Builder<DescribeFabricConsortiumAdminStatusRequest, Builder> {
        private String regionId; 
        private String location; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricConsortiumAdminStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.location = request.location;
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
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        @Override
        public DescribeFabricConsortiumAdminStatusRequest build() {
            return new DescribeFabricConsortiumAdminStatusRequest(this);
        } 

    } 

}
