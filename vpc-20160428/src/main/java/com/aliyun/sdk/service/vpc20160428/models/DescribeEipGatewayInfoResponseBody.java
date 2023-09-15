// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipGatewayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipGatewayInfoResponseBody</p>
 */
public class DescribeEipGatewayInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("EipInfos")
    private EipInfos eipInfos;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEipGatewayInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.eipInfos = builder.eipInfos;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipGatewayInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return eipInfos
     */
    public EipInfos getEipInfos() {
        return this.eipInfos;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private EipInfos eipInfos; 
        private String message; 
        private String requestId; 

        /**
         * The status code of the operation.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information about the EIP.
         */
        public Builder eipInfos(EipInfos eipInfos) {
            this.eipInfos = eipInfos;
            return this;
        }

        /**
         * The result of the operation.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEipGatewayInfoResponseBody build() {
            return new DescribeEipGatewayInfoResponseBody(this);
        } 

    } 

    public static class EipInfo extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("IpGw")
        private String ipGw;

        @NameInMap("IpMask")
        private String ipMask;

        private EipInfo(Builder builder) {
            this.ip = builder.ip;
            this.ipGw = builder.ipGw;
            this.ipMask = builder.ipMask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInfo create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipGw
         */
        public String getIpGw() {
            return this.ipGw;
        }

        /**
         * @return ipMask
         */
        public String getIpMask() {
            return this.ipMask;
        }

        public static final class Builder {
            private String ip; 
            private String ipGw; 
            private String ipMask; 

            /**
             * The IP address of the EIP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The IP address of the gateway that is associated with the EIP.
             */
            public Builder ipGw(String ipGw) {
                this.ipGw = ipGw;
                return this;
            }

            /**
             * The subnet mask of the EIP.
             */
            public Builder ipMask(String ipMask) {
                this.ipMask = ipMask;
                return this;
            }

            public EipInfo build() {
                return new EipInfo(this);
            } 

        } 

    }
    public static class EipInfos extends TeaModel {
        @NameInMap("EipInfo")
        private java.util.List < EipInfo> eipInfo;

        private EipInfos(Builder builder) {
            this.eipInfo = builder.eipInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInfos create() {
            return builder().build();
        }

        /**
         * @return eipInfo
         */
        public java.util.List < EipInfo> getEipInfo() {
            return this.eipInfo;
        }

        public static final class Builder {
            private java.util.List < EipInfo> eipInfo; 

            /**
             * EipInfo.
             */
            public Builder eipInfo(java.util.List < EipInfo> eipInfo) {
                this.eipInfo = eipInfo;
                return this;
            }

            public EipInfos build() {
                return new EipInfos(this);
            } 

        } 

    }
}
