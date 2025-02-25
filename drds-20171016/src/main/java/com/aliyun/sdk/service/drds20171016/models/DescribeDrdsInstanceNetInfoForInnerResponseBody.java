// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstanceNetInfoForInnerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsInstanceNetInfoForInnerResponseBody</p>
 */
public class DescribeDrdsInstanceNetInfoForInnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    private String drdsInstanceId;

    @com.aliyun.core.annotation.NameInMap("NetInfos")
    private NetInfos netInfos;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDrdsInstanceNetInfoForInnerResponseBody(Builder builder) {
        this.drdsInstanceId = builder.drdsInstanceId;
        this.netInfos = builder.netInfos;
        this.networkType = builder.networkType;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstanceNetInfoForInnerResponseBody create() {
        return builder().build();
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return netInfos
     */
    public NetInfos getNetInfos() {
        return this.netInfos;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String drdsInstanceId; 
        private NetInfos netInfos; 
        private String networkType; 
        private String requestId; 
        private Boolean success; 

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * NetInfos.
         */
        public Builder netInfos(NetInfos netInfos) {
            this.netInfos = netInfos;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsInstanceNetInfoForInnerResponseBody build() {
            return new DescribeDrdsInstanceNetInfoForInnerResponseBody(this);
        } 

    } 

    public static class NetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IsForVpc")
        private Boolean isForVpc;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NetInfo(Builder builder) {
            this.ip = builder.ip;
            this.isForVpc = builder.isForVpc;
            this.port = builder.port;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfo create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isForVpc
         */
        public Boolean getIsForVpc() {
            return this.isForVpc;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ip; 
            private Boolean isForVpc; 
            private String port; 
            private String type; 

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * IsForVpc.
             */
            public Builder isForVpc(Boolean isForVpc) {
                this.isForVpc = isForVpc;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NetInfo build() {
                return new NetInfo(this);
            } 

        } 

    }
    public static class NetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetInfo")
        private java.util.List < NetInfo> netInfo;

        private NetInfos(Builder builder) {
            this.netInfo = builder.netInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfos create() {
            return builder().build();
        }

        /**
         * @return netInfo
         */
        public java.util.List < NetInfo> getNetInfo() {
            return this.netInfo;
        }

        public static final class Builder {
            private java.util.List < NetInfo> netInfo; 

            /**
             * NetInfo.
             */
            public Builder netInfo(java.util.List < NetInfo> netInfo) {
                this.netInfo = netInfo;
                return this;
            }

            public NetInfos build() {
                return new NetInfos(this);
            } 

        } 

    }
}
