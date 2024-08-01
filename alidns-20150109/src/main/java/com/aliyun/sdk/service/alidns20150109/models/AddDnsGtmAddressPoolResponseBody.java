// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDnsGtmAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>AddDnsGtmAddressPoolResponseBody</p>
 */
public class AddDnsGtmAddressPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddrPoolId")
    private String addrPoolId;

    @com.aliyun.core.annotation.NameInMap("MonitorConfigId")
    private String monitorConfigId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddDnsGtmAddressPoolResponseBody(Builder builder) {
        this.addrPoolId = builder.addrPoolId;
        this.monitorConfigId = builder.monitorConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDnsGtmAddressPoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return addrPoolId
     */
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    /**
     * @return monitorConfigId
     */
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String addrPoolId; 
        private String monitorConfigId; 
        private String requestId; 

        /**
         * The ID of the address pool.
         */
        public Builder addrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * The ID of the health check configuration.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDnsGtmAddressPoolResponseBody build() {
            return new AddDnsGtmAddressPoolResponseBody(this);
        } 

    } 

}
