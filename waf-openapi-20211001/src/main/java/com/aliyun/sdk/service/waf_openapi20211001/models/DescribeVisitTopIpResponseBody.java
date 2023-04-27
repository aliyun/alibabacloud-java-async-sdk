// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVisitTopIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVisitTopIpResponseBody</p>
 */
public class DescribeVisitTopIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TopIp")
    private java.util.List < TopIp> topIp;

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
    public java.util.List < TopIp> getTopIp() {
        return this.topIp;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TopIp> topIp; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The array of the top 10 IP addresses from which requests are sent.
         */
        public Builder topIp(java.util.List < TopIp> topIp) {
            this.topIp = topIp;
            return this;
        }

        public DescribeVisitTopIpResponseBody build() {
            return new DescribeVisitTopIpResponseBody(this);
        } 

    } 

    public static class TopIp extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("Count")
        private Long count;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Isp")
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
             * The ordinal number of the area to which the IP address belongs.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * The total number of requests that are sent from the IP address.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ISP.
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
