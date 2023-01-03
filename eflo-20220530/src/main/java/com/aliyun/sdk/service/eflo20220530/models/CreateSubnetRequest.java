// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubnetRequest} extends {@link RequestModel}
 *
 * <p>CreateSubnetRequest</p>
 */
public class CreateSubnetRequest extends Request {
    @Body
    @NameInMap("Cidr")
    private String cidr;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("VpdId")
    private String vpdId;

    @Body
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateSubnetRequest(Builder builder) {
        super(builder);
        this.cidr = builder.cidr;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.vpdId = builder.vpdId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubnetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
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
     * @return type
     */
    public String getType() {
        return this.type;
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

    public static final class Builder extends Request.Builder<CreateSubnetRequest, Builder> {
        private String cidr; 
        private String name; 
        private String regionId; 
        private String type; 
        private String vpdId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubnetRequest request) {
            super(request);
            this.cidr = request.cidr;
            this.name = request.name;
            this.regionId = request.regionId;
            this.type = request.type;
            this.vpdId = request.vpdId;
            this.zoneId = request.zoneId;
        } 

        /**
         * 网段
         */
        public Builder cidr(String cidr) {
            this.putBodyParameter("Cidr", cidr);
            this.cidr = cidr;
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
         * Subnet类型，非必选
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * 所属VPD
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
        public CreateSubnetRequest build() {
            return new CreateSubnetRequest(this);
        } 

    } 

}
