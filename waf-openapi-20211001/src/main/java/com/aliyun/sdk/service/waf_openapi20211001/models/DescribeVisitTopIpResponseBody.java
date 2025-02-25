// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeVisitTopIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVisitTopIpResponseBody</p>
 */
public class DescribeVisitTopIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopIp")
    private java.util.List<TopIp> topIp;

    private DescribeVisitTopIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.topIp = builder.topIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVisitTopIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topIp
     */
    public java.util.List<TopIp> getTopIp() {
        return this.topIp;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TopIp> topIp; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5D2B8DAE-A761-58CB-A68D-74989E4831DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the top 10 IP addresses from which requests are sent.</p>
         */
        public Builder topIp(java.util.List<TopIp> topIp) {
            this.topIp = topIp;
            return this;
        }

        public DescribeVisitTopIpResponseBody build() {
            return new DescribeVisitTopIpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVisitTopIpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVisitTopIpResponseBody</p>
     */
    public static class TopIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        private TopIp(Builder builder) {
            this.area = builder.area;
            this.count = builder.count;
            this.ip = builder.ip;
            this.isp = builder.isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopIp create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        public static final class Builder {
            private String area; 
            private Long count; 
            private String ip; 
            private String isp; 

            /**
             * <p>The ordinal number of the area to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>310000</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The total number of requests that are sent from the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>2622</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>AAA</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            public TopIp build() {
                return new TopIp(this);
            } 

        } 

    }
}
