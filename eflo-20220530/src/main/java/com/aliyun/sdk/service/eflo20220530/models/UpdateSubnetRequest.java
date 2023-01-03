// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubnetRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubnetRequest</p>
 */
public class UpdateSubnetRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    private String name;

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

    private UpdateSubnetRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.subnetId = builder.subnetId;
        this.vpdId = builder.vpdId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubnetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<UpdateSubnetRequest, Builder> {
        private String description; 
        private String name; 
        private String regionId; 
        private String subnetId; 
        private String vpdId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubnetRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.subnetId = request.subnetId;
            this.vpdId = request.vpdId;
            this.zoneId = request.zoneId;
        } 

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Subnet名称
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
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
        public UpdateSubnetRequest build() {
            return new UpdateSubnetRequest(this);
        } 

    } 

}
