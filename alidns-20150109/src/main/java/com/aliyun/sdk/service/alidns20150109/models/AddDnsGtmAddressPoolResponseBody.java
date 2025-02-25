// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
         * <p>The ID of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>testpool1</p>
         */
        public Builder addrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * <p>The ID of the health check configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
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
