// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddressGroup} extends {@link TeaModel}
 *
 * <p>AddressGroup</p>
 */
public class AddressGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addresses")
    private java.util.List<String> addresses;

    @com.aliyun.core.annotation.NameInMap("Ports")
    private java.util.List<Ports> ports;

    private AddressGroup(Builder builder) {
        this.addresses = builder.addresses;
        this.ports = builder.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addresses
     */
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    /**
     * @return ports
     */
    public java.util.List<Ports> getPorts() {
        return this.ports;
    }

    public static final class Builder {
        private java.util.List<String> addresses; 
        private java.util.List<Ports> ports; 

        private Builder() {
        } 

        private Builder(AddressGroup model) {
            this.addresses = model.addresses;
            this.ports = model.ports;
        } 

        /**
         * Addresses.
         */
        public Builder addresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * Ports.
         */
        public Builder ports(java.util.List<Ports> ports) {
            this.ports = ports;
            return this;
        }

        public AddressGroup build() {
            return new AddressGroup(this);
        } 

    } 

    /**
     * 
     * {@link AddressGroup} extends {@link TeaModel}
     *
     * <p>AddressGroup</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("End")
        private Integer end;

        private Ports(Builder builder) {
            this.begin = builder.begin;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Integer getBegin() {
            return this.begin;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        public static final class Builder {
            private Integer begin; 
            private Integer end; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.begin = model.begin;
                this.end = model.end;
            } 

            /**
             * Begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
}
