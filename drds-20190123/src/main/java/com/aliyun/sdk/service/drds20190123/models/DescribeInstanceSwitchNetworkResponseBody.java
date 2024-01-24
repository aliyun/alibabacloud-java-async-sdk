// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSwitchNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSwitchNetworkResponseBody</p>
 */
public class DescribeInstanceSwitchNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("VpcInfos")
    private VpcInfos vpcInfos;

    private DescribeInstanceSwitchNetworkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vpcInfos = builder.vpcInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSwitchNetworkResponseBody create() {
        return builder().build();
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

    /**
     * @return vpcInfos
     */
    public VpcInfos getVpcInfos() {
        return this.vpcInfos;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private VpcInfos vpcInfos; 

        /**
         * Indicates the ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Indicates the information about the virtual private cloud (VPC) in which the instance is deployed.
         */
        public Builder vpcInfos(VpcInfos vpcInfos) {
            this.vpcInfos = vpcInfos;
            return this;
        }

        public DescribeInstanceSwitchNetworkResponseBody build() {
            return new DescribeInstanceSwitchNetworkResponseBody(this);
        } 

    } 

    public static class VswitchInfo extends TeaModel {
        @NameInMap("AzoneId")
        private String azoneId;

        @NameInMap("DrdsSupported")
        private Boolean drdsSupported;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("VswitchName")
        private String vswitchName;

        private VswitchInfo(Builder builder) {
            this.azoneId = builder.azoneId;
            this.drdsSupported = builder.drdsSupported;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.vswitchName = builder.vswitchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VswitchInfo create() {
            return builder().build();
        }

        /**
         * @return azoneId
         */
        public String getAzoneId() {
            return this.azoneId;
        }

        /**
         * @return drdsSupported
         */
        public Boolean getDrdsSupported() {
            return this.drdsSupported;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return vswitchName
         */
        public String getVswitchName() {
            return this.vswitchName;
        }

        public static final class Builder {
            private String azoneId; 
            private Boolean drdsSupported; 
            private String vpcId; 
            private String vswitchId; 
            private String vswitchName; 

            /**
             * Indicates the ID of the zone in which the instance is deployed.
             */
            public Builder azoneId(String azoneId) {
                this.azoneId = azoneId;
                return this;
            }

            /**
             * Indicates whether you can change the network type of the instance.
             */
            public Builder drdsSupported(Boolean drdsSupported) {
                this.drdsSupported = drdsSupported;
                return this;
            }

            /**
             * Indicates the ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * Indicates the ID of the vSwitch.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * Indicates the name of the vSwitch.
             */
            public Builder vswitchName(String vswitchName) {
                this.vswitchName = vswitchName;
                return this;
            }

            public VswitchInfo build() {
                return new VswitchInfo(this);
            } 

        } 

    }
    public static class VswitchInfos extends TeaModel {
        @NameInMap("VswitchInfo")
        private java.util.List < VswitchInfo> vswitchInfo;

        private VswitchInfos(Builder builder) {
            this.vswitchInfo = builder.vswitchInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VswitchInfos create() {
            return builder().build();
        }

        /**
         * @return vswitchInfo
         */
        public java.util.List < VswitchInfo> getVswitchInfo() {
            return this.vswitchInfo;
        }

        public static final class Builder {
            private java.util.List < VswitchInfo> vswitchInfo; 

            /**
             * VswitchInfo.
             */
            public Builder vswitchInfo(java.util.List < VswitchInfo> vswitchInfo) {
                this.vswitchInfo = vswitchInfo;
                return this;
            }

            public VswitchInfos build() {
                return new VswitchInfos(this);
            } 

        } 

    }
    public static class VpcInfo extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        @NameInMap("VswitchInfos")
        private VswitchInfos vswitchInfos;

        private VpcInfo(Builder builder) {
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
            this.vswitchInfos = builder.vswitchInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfo create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        /**
         * @return vswitchInfos
         */
        public VswitchInfos getVswitchInfos() {
            return this.vswitchInfos;
        }

        public static final class Builder {
            private String regionId; 
            private String vpcId; 
            private String vpcName; 
            private VswitchInfos vswitchInfos; 

            /**
             * Indicates the ID of the region in which the instance is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates the ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * Indicates the name of the VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * Indicates information about the vSwitch to which the instance is connected.
             */
            public Builder vswitchInfos(VswitchInfos vswitchInfos) {
                this.vswitchInfos = vswitchInfos;
                return this;
            }

            public VpcInfo build() {
                return new VpcInfo(this);
            } 

        } 

    }
    public static class VpcInfos extends TeaModel {
        @NameInMap("VpcInfo")
        private java.util.List < VpcInfo> vpcInfo;

        private VpcInfos(Builder builder) {
            this.vpcInfo = builder.vpcInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcInfos create() {
            return builder().build();
        }

        /**
         * @return vpcInfo
         */
        public java.util.List < VpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

        public static final class Builder {
            private java.util.List < VpcInfo> vpcInfo; 

            /**
             * VpcInfo.
             */
            public Builder vpcInfo(java.util.List < VpcInfo> vpcInfo) {
                this.vpcInfo = vpcInfo;
                return this;
            }

            public VpcInfos build() {
                return new VpcInfos(this);
            } 

        } 

    }
}
