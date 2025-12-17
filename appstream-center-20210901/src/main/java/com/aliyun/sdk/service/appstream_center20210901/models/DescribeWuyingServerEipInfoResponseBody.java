// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeWuyingServerEipInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWuyingServerEipInfoResponseBody</p>
 */
public class DescribeWuyingServerEipInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipInfoModel")
    private EipInfoModel eipInfoModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWuyingServerEipInfoResponseBody(Builder builder) {
        this.eipInfoModel = builder.eipInfoModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWuyingServerEipInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipInfoModel
     */
    public EipInfoModel getEipInfoModel() {
        return this.eipInfoModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EipInfoModel eipInfoModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeWuyingServerEipInfoResponseBody model) {
            this.eipInfoModel = model.eipInfoModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the associated EIP.</p>
         */
        public Builder eipInfoModel(EipInfoModel eipInfoModel) {
            this.eipInfoModel = eipInfoModel;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWuyingServerEipInfoResponseBody build() {
            return new DescribeWuyingServerEipInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWuyingServerEipInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWuyingServerEipInfoResponseBody</p>
     */
    public static class EipInfoModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipId")
        private String eipId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("ServerPortRange")
        private String serverPortRange;

        private EipInfoModel(Builder builder) {
            this.eipId = builder.eipId;
            this.ipAddress = builder.ipAddress;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.serverPortRange = builder.serverPortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInfoModel create() {
            return builder().build();
        }

        /**
         * @return eipId
         */
        public String getEipId() {
            return this.eipId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return serverPortRange
         */
        public String getServerPortRange() {
            return this.serverPortRange;
        }

        public static final class Builder {
            private String eipId; 
            private String ipAddress; 
            private String networkInterfaceId; 
            private String serverPortRange; 

            private Builder() {
            } 

            private Builder(EipInfoModel model) {
                this.eipId = model.eipId;
                this.ipAddress = model.ipAddress;
                this.networkInterfaceId = model.networkInterfaceId;
                this.serverPortRange = model.serverPortRange;
            } 

            /**
             * EipId.
             */
            public Builder eipId(String eipId) {
                this.eipId = eipId;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>171.xxx.xxx.221</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The ID of the elastic network interface (ENI).</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp174p2xxxxxbyh02ix</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The port range.</p>
             * 
             * <strong>example:</strong>
             * <p>6606/6607</p>
             */
            public Builder serverPortRange(String serverPortRange) {
                this.serverPortRange = serverPortRange;
                return this;
            }

            public EipInfoModel build() {
                return new EipInfoModel(this);
            } 

        } 

    }
}
