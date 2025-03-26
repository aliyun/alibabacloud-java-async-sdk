// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeEipGatewayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipGatewayInfoResponseBody</p>
 */
public class DescribeEipGatewayInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EipInfos")
    private EipInfos eipInfos;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEipGatewayInfoResponseBody model) {
            this.code = model.code;
            this.eipInfos = model.eipInfos;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information about the EIP.</p>
         */
        public Builder eipInfos(EipInfos eipInfos) {
            this.eipInfos = eipInfos;
            return this;
        }

        /**
         * <p>The result of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0FD0EED-F90D-4479-803D-DD62335357E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEipGatewayInfoResponseBody build() {
            return new DescribeEipGatewayInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEipGatewayInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipGatewayInfoResponseBody</p>
     */
    public static class EipInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpGw")
        private String ipGw;

        @com.aliyun.core.annotation.NameInMap("IpMask")
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

            private Builder() {
            } 

            private Builder(EipInfo model) {
                this.ip = model.ip;
                this.ipGw = model.ipGw;
                this.ipMask = model.ipMask;
            } 

            /**
             * <p>The IP address of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.236</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The IP address of the gateway that is associated with the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.1</p>
             */
            public Builder ipGw(String ipGw) {
                this.ipGw = ipGw;
                return this;
            }

            /**
             * <p>The subnet mask of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.0</p>
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
    /**
     * 
     * {@link DescribeEipGatewayInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipGatewayInfoResponseBody</p>
     */
    public static class EipInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipInfo")
        private java.util.List<EipInfo> eipInfo;

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
        public java.util.List<EipInfo> getEipInfo() {
            return this.eipInfo;
        }

        public static final class Builder {
            private java.util.List<EipInfo> eipInfo; 

            private Builder() {
            } 

            private Builder(EipInfos model) {
                this.eipInfo = model.eipInfo;
            } 

            /**
             * EipInfo.
             */
            public Builder eipInfo(java.util.List<EipInfo> eipInfo) {
                this.eipInfo = eipInfo;
                return this;
            }

            public EipInfos build() {
                return new EipInfos(this);
            } 

        } 

    }
}
