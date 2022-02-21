// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipAddressesResponseBody</p>
 */
public class DescribeEipAddressesResponseBody extends TeaModel {
    @NameInMap("EipAddresses")
    private EipAddresses eipAddresses;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEipAddressesResponseBody(Builder builder) {
        this.eipAddresses = builder.eipAddresses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipAddressesResponseBody create() {
        return builder().build();
    }

    /**
     * @return eipAddresses
     */
    public EipAddresses getEipAddresses() {
        return this.eipAddresses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EipAddresses eipAddresses; 
        private String requestId; 

        /**
         * EipAddresses.
         */
        public Builder eipAddresses(EipAddresses eipAddresses) {
            this.eipAddresses = eipAddresses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEipAddressesResponseBody build() {
            return new DescribeEipAddressesResponseBody(this);
        } 

    } 

    public static class EipAddress extends TeaModel {
        @NameInMap("Eip")
        private String eip;

        @NameInMap("InstanceIdInternetIp")
        private String instanceIdInternetIp;

        private EipAddress(Builder builder) {
            this.eip = builder.eip;
            this.instanceIdInternetIp = builder.instanceIdInternetIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return instanceIdInternetIp
         */
        public String getInstanceIdInternetIp() {
            return this.instanceIdInternetIp;
        }

        public static final class Builder {
            private String eip; 
            private String instanceIdInternetIp; 

            /**
             * Eip.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * InstanceIdInternetIp.
             */
            public Builder instanceIdInternetIp(String instanceIdInternetIp) {
                this.instanceIdInternetIp = instanceIdInternetIp;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    public static class EipAddresses extends TeaModel {
        @NameInMap("EipAddress")
        private java.util.List < EipAddress> eipAddress;

        private EipAddresses(Builder builder) {
            this.eipAddress = builder.eipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddresses create() {
            return builder().build();
        }

        /**
         * @return eipAddress
         */
        public java.util.List < EipAddress> getEipAddress() {
            return this.eipAddress;
        }

        public static final class Builder {
            private java.util.List < EipAddress> eipAddress; 

            /**
             * EipAddress.
             */
            public Builder eipAddress(java.util.List < EipAddress> eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            public EipAddresses build() {
                return new EipAddresses(this);
            } 

        } 

    }
}
