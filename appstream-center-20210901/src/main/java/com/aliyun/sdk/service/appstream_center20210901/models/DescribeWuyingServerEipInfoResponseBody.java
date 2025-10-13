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
         * EipInfoModel.
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
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("ServerPortRange")
        private String serverPortRange;

        private EipInfoModel(Builder builder) {
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
            private String ipAddress; 
            private String networkInterfaceId; 
            private String serverPortRange; 

            private Builder() {
            } 

            private Builder(EipInfoModel model) {
                this.ipAddress = model.ipAddress;
                this.networkInterfaceId = model.networkInterfaceId;
                this.serverPortRange = model.serverPortRange;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * ServerPortRange.
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
