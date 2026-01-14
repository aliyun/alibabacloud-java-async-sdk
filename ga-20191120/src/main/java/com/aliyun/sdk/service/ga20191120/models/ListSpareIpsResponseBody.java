// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListSpareIpsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSpareIpsResponseBody</p>
 */
public class ListSpareIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpareIps")
    private java.util.List<SpareIps> spareIps;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SpareIps> getSpareIps() {
        return this.spareIps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SpareIps> spareIps; 

        private Builder() {
        } 

        private Builder(ListSpareIpsResponseBody model) {
            this.requestId = model.requestId;
            this.spareIps = model.spareIps;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The secondary IP addresses that are associated with the CNAME.</p>
         */
        public Builder spareIps(java.util.List<SpareIps> spareIps) {
            this.spareIps = spareIps;
            return this;
        }

        public ListSpareIpsResponseBody build() {
            return new ListSpareIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSpareIpsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSpareIpsResponseBody</p>
     */
    public static class SpareIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpareIp")
        private String spareIp;

        @com.aliyun.core.annotation.NameInMap("State")
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

            private Builder() {
            } 

            private Builder(SpareIps model) {
                this.spareIp = model.spareIp;
                this.state = model.state;
            } 

            /**
             * <p>The secondary IP address that is associated with the CNAME. If the acceleration area becomes unavailable, GA redirects traffic to the secondary IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX</p>
             */
            public Builder spareIp(String spareIp) {
                this.spareIp = spareIp;
                return this;
            }

            /**
             * <p>The status of the secondary IP address. Valid values:</p>
             * <ul>
             * <li><strong>active:</strong> The secondary IP address is available.</li>
             * <li><strong>inuse:</strong> The secondary IP address is in use.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
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
