// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeWafSourceIpSegmentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWafSourceIpSegmentResponseBody</p>
 */
public class DescribeWafSourceIpSegmentResponseBody extends TeaModel {
    @NameInMap("IpV6s")
    private String ipV6s;

    @NameInMap("Ips")
    private String ips;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeWafSourceIpSegmentResponseBody(Builder builder) {
        this.ipV6s = builder.ipV6s;
        this.ips = builder.ips;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWafSourceIpSegmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipV6s
     */
    public String getIpV6s() {
        return this.ipV6s;
    }

    /**
     * @return ips
     */
    public String getIps() {
        return this.ips;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipV6s; 
        private String ips; 
        private String requestId; 

        /**
         * <p>IpV6s.</p>
         */
        public Builder ipV6s(String ipV6s) {
            this.ipV6s = ipV6s;
            return this;
        }

        /**
         * <p>Ips.</p>
         */
        public Builder ips(String ips) {
            this.ips = ips;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWafSourceIpSegmentResponseBody build() {
            return new DescribeWafSourceIpSegmentResponseBody(this);
        } 

    } 

}
