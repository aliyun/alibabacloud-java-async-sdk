// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGtmAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>UpdateGtmAddressPoolRequest</p>
 */
public class UpdateGtmAddressPoolRequest extends Request {
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
    @NameInMap("MinAvailableAddrNum")
    private Integer minAvailableAddrNum;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UpdateGtmAddressPoolRequest(Builder builder) {
        super(builder);
        this.addr = builder.addr;
        this.addrPoolId = builder.addrPoolId;
        this.lang = builder.lang;
        this.minAvailableAddrNum = builder.minAvailableAddrNum;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGtmAddressPoolRequest create() {
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
     * @return minAvailableAddrNum
     */
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateGtmAddressPoolRequest, Builder> {
        private java.util.List < Addr> addr; 
        private String addrPoolId; 
        private String lang; 
        private Integer minAvailableAddrNum; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGtmAddressPoolRequest response) {
            super(response);
            this.addr = response.addr;
            this.addrPoolId = response.addrPoolId;
            this.lang = response.lang;
            this.minAvailableAddrNum = response.minAvailableAddrNum;
            this.name = response.name;
            this.type = response.type;
        } 

        /**
         * Addr.
         */
        public Builder addr(java.util.List < Addr> addr) {
            this.putQueryParameter("Addr", addr);
            this.addr = addr;
            return this;
        }

        /**
         * AddrPoolId.
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MinAvailableAddrNum.
         */
        public Builder minAvailableAddrNum(Integer minAvailableAddrNum) {
            this.putQueryParameter("MinAvailableAddrNum", minAvailableAddrNum);
            this.minAvailableAddrNum = minAvailableAddrNum;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateGtmAddressPoolRequest build() {
            return new UpdateGtmAddressPoolRequest(this);
        } 

    } 

    public static class Addr extends TeaModel {
        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Value")
        private String value;

        private Addr(Builder builder) {
            this.lbaWeight = builder.lbaWeight;
            this.mode = builder.mode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer lbaWeight; 
            private String mode; 
            private String value; 

            /**
             * LbaWeight.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Addr build() {
                return new Addr(this);
            } 

        } 

    }
}
