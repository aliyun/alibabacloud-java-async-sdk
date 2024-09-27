// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateGtmAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>UpdateGtmAddressPoolRequest</p>
 */
public class UpdateGtmAddressPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addr")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Addr> addr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddrPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addrPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinAvailableAddrNum")
    private Integer minAvailableAddrNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(UpdateGtmAddressPoolRequest request) {
            super(request);
            this.addr = request.addr;
            this.addrPoolId = request.addrPoolId;
            this.lang = request.lang;
            this.minAvailableAddrNum = request.minAvailableAddrNum;
            this.name = request.name;
            this.type = request.type;
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
         * <p>The ID of the address pool that you want to modify.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abc</p>
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * <p>The language used by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The minimum number of available addresses in the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minAvailableAddrNum(Integer minAvailableAddrNum) {
            this.putQueryParameter("MinAvailableAddrNum", minAvailableAddrNum);
            this.minAvailableAddrNum = minAvailableAddrNum;
            return this;
        }

        /**
         * <p>The name of the address pool that you want to modify.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the address pool that you want to modify.</p>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
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

    /**
     * 
     * {@link UpdateGtmAddressPoolRequest} extends {@link TeaModel}
     *
     * <p>UpdateGtmAddressPoolRequest</p>
     */
    public static class Addr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The weight of the address pool that you want to modify.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * <p>The mode of the address pool that you want to modify.</p>
             * <ul>
             * <li><strong>SMART</strong>: Intelligent return</li>
             * <li><strong>ONLINE</strong>: Always online</li>
             * <li><strong>OFFLINE</strong>: Always offline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SMART</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The addresses in the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
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
