// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDnsGtmAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>UpdateDnsGtmAddressPoolRequest</p>
 */
public class UpdateDnsGtmAddressPoolRequest extends Request {
    @Query
    @NameInMap("Addr")
    @Validation(required = true)
    private java.util.List < Addr> addr;

    @Query
    @NameInMap("AddrPoolId")
    @Validation(required = true)
    private String addrPoolId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LbaStrategy")
    @Validation(required = true)
    private String lbaStrategy;

    @Query
    @NameInMap("Name")
    private String name;

    private UpdateDnsGtmAddressPoolRequest(Builder builder) {
        super(builder);
        this.addr = builder.addr;
        this.addrPoolId = builder.addrPoolId;
        this.lang = builder.lang;
        this.lbaStrategy = builder.lbaStrategy;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDnsGtmAddressPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addr
     */
    public java.util.List < Addr> getAddr() {
        return this.addr;
    }

    /**
     * @return addrPoolId
     */
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lbaStrategy
     */
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateDnsGtmAddressPoolRequest, Builder> {
        private java.util.List < Addr> addr; 
        private String addrPoolId; 
        private String lang; 
        private String lbaStrategy; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDnsGtmAddressPoolRequest request) {
            super(request);
            this.addr = request.addr;
            this.addrPoolId = request.addrPoolId;
            this.lang = request.lang;
            this.lbaStrategy = request.lbaStrategy;
            this.name = request.name;
        } 

        /**
         * The address pools.
         */
        public Builder addr(java.util.List < Addr> addr) {
            this.putQueryParameter("Addr", addr);
            this.addr = addr;
            return this;
        }

        /**
         * The ID of the address pool.
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The load balancing policy of the address pool. Valid values:
         * <p>
         * 
         * *   ALL_RR: returns all addresses.
         * *   RATIO: returns addresses by weight.
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.putQueryParameter("LbaStrategy", lbaStrategy);
            this.lbaStrategy = lbaStrategy;
            return this;
        }

        /**
         * The name of the address pool.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateDnsGtmAddressPoolRequest build() {
            return new UpdateDnsGtmAddressPoolRequest(this);
        } 

    } 

    public static class Addr extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        private String addr;

        @NameInMap("AttributeInfo")
        private String attributeInfo;

        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Mode")
        @Validation(required = true)
        private String mode;

        @NameInMap("Remark")
        private String remark;

        private Addr(Builder builder) {
            this.addr = builder.addr;
            this.attributeInfo = builder.attributeInfo;
            this.lbaWeight = builder.lbaWeight;
            this.mode = builder.mode;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public String getAddr() {
            return this.addr;
        }

        /**
         * @return attributeInfo
         */
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        /**
         * @return lbaWeight
         */
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String addr; 
            private String attributeInfo; 
            private Integer lbaWeight; 
            private String mode; 
            private String remark; 

            /**
             * The address in the address pool.
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * The source region of the address, in JSON-formatted string.
             * <p>
             * 
             * *   LineCode: the line code of the source region of the address. The LineCode field is deprecated, and the lineCodes field is used as a substitute.
             * 
             * *   LineCodes: the line code list of the source regions of addresses.
             * 
             * *   lineCodeRectifyType: the rectification type of the line codes. Default value: AUTO. Valid values:
             * 
             *     *   NO_NEED: no need for rectification.
             *     *   RECTIFIED: rectified.
             *     *   AUTO: automatic rectification.
             */
            public Builder attributeInfo(String attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * The weight of the address.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * The response mode: Valid values:
             * <p>
             * 
             * *   SMART: smart return.
             * *   ONLINE: always online.
             * *   OFFLINE: always offline.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The additional information about the address.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Addr build() {
                return new Addr(this);
            } 

        } 

    }
}
