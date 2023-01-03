// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpdRequest} extends {@link RequestModel}
 *
 * <p>CreateVpdRequest</p>
 */
public class CreateVpdRequest extends Request {
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
    @NameInMap("Subnets")
    private java.util.List < Subnets> subnets;

    private CreateVpdRequest(Builder builder) {
        super(builder);
        this.cidr = builder.cidr;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.subnets = builder.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpdRequest create() {
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
     * @return subnets
     */
    public java.util.List < Subnets> getSubnets() {
        return this.subnets;
    }

    public static final class Builder extends Request.Builder<CreateVpdRequest, Builder> {
        private String cidr; 
        private String name; 
        private String regionId; 
        private java.util.List < Subnets> subnets; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpdRequest request) {
            super(request);
            this.cidr = request.cidr;
            this.name = request.name;
            this.regionId = request.regionId;
            this.subnets = request.subnets;
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
         * 灵骏网段名称
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
         * 子网信息
         */
        public Builder subnets(java.util.List < Subnets> subnets) {
            this.putBodyParameter("Subnets", subnets);
            this.subnets = subnets;
            return this;
        }

        @Override
        public CreateVpdRequest build() {
            return new CreateVpdRequest(this);
        } 

    } 

    public static class Subnets extends TeaModel {
        @NameInMap("Cidr")
        private String cidr;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Type")
        private String type;

        @NameInMap("ZoneId")
        private String zoneId;

        private Subnets(Builder builder) {
            this.cidr = builder.cidr;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subnets create() {
            return builder().build();
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cidr; 
            private String name; 
            private String regionId; 
            private String type; 
            private String zoneId; 

            /**
             * 网段
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * 名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 地域
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 类型；非必选；通用类型不填；OOB类型填OOB;LB类型填LB
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 可用区
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Subnets build() {
                return new Subnets(this);
            } 

        } 

    }
}
