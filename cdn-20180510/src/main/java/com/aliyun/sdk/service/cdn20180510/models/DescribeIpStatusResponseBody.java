// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIpStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpStatusResponseBody</p>
 */
public class DescribeIpStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpStatus")
    private java.util.List < IpStatus> ipStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeIpStatusResponseBody(Builder builder) {
        this.ipStatus = builder.ipStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipStatus
     */
    public java.util.List < IpStatus> getIpStatus() {
        return this.ipStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < IpStatus> ipStatus; 
        private String requestId; 

        /**
         * <p>The status of the IP addresses of the POPs.</p>
         */
        public Builder ipStatus(java.util.List < IpStatus> ipStatus) {
            this.ipStatus = ipStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIpStatusResponseBody build() {
            return new DescribeIpStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpStatusResponseBody</p>
     */
    public static class IpStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private IpStatus(Builder builder) {
            this.ip = builder.ip;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpStatus create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ip; 
            private String status; 

            /**
             * <p>The IP address of the POP.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.10</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The status.</p>
             * <ul>
             * <li><strong>nonali</strong>: not an Alibaba Cloud CDN POP</li>
             * <li><strong>normal</strong>: an available Alibaba Cloud CDN POP</li>
             * <li><strong>abnormal</strong>: an unavailable Alibaba Cloud CDN POP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>abnormal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IpStatus build() {
                return new IpStatus(this);
            } 

        } 

    }
}
