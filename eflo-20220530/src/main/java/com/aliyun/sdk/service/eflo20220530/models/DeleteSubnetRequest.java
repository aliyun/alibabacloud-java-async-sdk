// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubnetRequest} extends {@link RequestModel}
 *
 * <p>DeleteSubnetRequest</p>
 */
public class DeleteSubnetRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SubnetId")
    private String subnetId;

    @Body
    @NameInMap("VpdId")
    private String vpdId;

    @Body
    @NameInMap("ZoneId")
    private String zoneId;

    private DeleteSubnetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.subnetId = builder.subnetId;
        this.vpdId = builder.vpdId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubnetRequest create() {
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
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DeleteSubnetRequest, Builder> {
        private String regionId; 
        private String subnetId; 
        private String vpdId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSubnetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.subnetId = request.subnetId;
            this.vpdId = request.vpdId;
            this.zoneId = request.zoneId;
        } 

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Subnet ID
         */
        public Builder subnetId(String subnetId) {
            this.putBodyParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        /**
         * 所属Vpd ID
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * 可用区
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DeleteSubnetRequest build() {
            return new DeleteSubnetRequest(this);
        } 

    } 

}
