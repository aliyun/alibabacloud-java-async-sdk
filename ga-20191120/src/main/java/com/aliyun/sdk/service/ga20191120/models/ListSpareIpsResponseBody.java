// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpareIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSpareIpsResponseBody</p>
 */
public class ListSpareIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpareIps")
    private java.util.List < SpareIps> spareIps;

    private ListSpareIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spareIps = builder.spareIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSpareIpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spareIps
     */
    public java.util.List < SpareIps> getSpareIps() {
        return this.spareIps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SpareIps> spareIps; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The secondary IP addresses that are associated with the CNAME.
         */
        public Builder spareIps(java.util.List < SpareIps> spareIps) {
            this.spareIps = spareIps;
            return this;
        }

        public ListSpareIpsResponseBody build() {
            return new ListSpareIpsResponseBody(this);
        } 

    } 

    public static class SpareIps extends TeaModel {
        @NameInMap("SpareIp")
        private String spareIp;

        @NameInMap("State")
        private String state;

        private SpareIps(Builder builder) {
            this.spareIp = builder.spareIp;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpareIps create() {
            return builder().build();
        }

        /**
         * @return spareIp
         */
        public String getSpareIp() {
            return this.spareIp;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String spareIp; 
            private String state; 

            /**
             * The secondary IP address that is associated with the CNAME. If the acceleration area becomes unavailable, GA redirects traffic to the secondary IP address.
             */
            public Builder spareIp(String spareIp) {
                this.spareIp = spareIp;
                return this;
            }

            /**
             * The status of the secondary IP address. Valid values:
             * <p>
             * 
             * *   **active:** The secondary IP address is available.
             * *   **inuse:** The secondary IP address is in use.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public SpareIps build() {
                return new SpareIps(this);
            } 

        } 

    }
}
