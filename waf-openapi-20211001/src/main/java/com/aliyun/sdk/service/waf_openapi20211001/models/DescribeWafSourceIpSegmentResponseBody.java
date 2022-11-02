// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWafSourceIpSegmentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWafSourceIpSegmentResponseBody</p>
 */
public class DescribeWafSourceIpSegmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WafSourceIp")
    private WafSourceIp wafSourceIp;

    private DescribeWafSourceIpSegmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.wafSourceIp = builder.wafSourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWafSourceIpSegmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return wafSourceIp
     */
    public WafSourceIp getWafSourceIp() {
        return this.wafSourceIp;
    }

    public static final class Builder {
        private String requestId; 
        private WafSourceIp wafSourceIp; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WafSourceIp.
         */
        public Builder wafSourceIp(WafSourceIp wafSourceIp) {
            this.wafSourceIp = wafSourceIp;
            return this;
        }

        public DescribeWafSourceIpSegmentResponseBody build() {
            return new DescribeWafSourceIpSegmentResponseBody(this);
        } 

    } 

    public static class WafSourceIp extends TeaModel {
        @NameInMap("IPv4")
        private java.util.List < String > iPv4;

        @NameInMap("IPv6")
        private java.util.List < String > iPv6;

        private WafSourceIp(Builder builder) {
            this.iPv4 = builder.iPv4;
            this.iPv6 = builder.iPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WafSourceIp create() {
            return builder().build();
        }

        /**
         * @return iPv4
         */
        public java.util.List < String > getIPv4() {
            return this.iPv4;
        }

        /**
         * @return iPv6
         */
        public java.util.List < String > getIPv6() {
            return this.iPv6;
        }

        public static final class Builder {
            private java.util.List < String > iPv4; 
            private java.util.List < String > iPv6; 

            /**
             * IPv4.
             */
            public Builder iPv4(java.util.List < String > iPv4) {
                this.iPv4 = iPv4;
                return this;
            }

            /**
             * IPv6.
             */
            public Builder iPv6(java.util.List < String > iPv6) {
                this.iPv6 = iPv6;
                return this;
            }

            public WafSourceIp build() {
                return new WafSourceIp(this);
            } 

        } 

    }
}
