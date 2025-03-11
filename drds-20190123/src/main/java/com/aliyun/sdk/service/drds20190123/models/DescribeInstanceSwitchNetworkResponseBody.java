// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeInstanceSwitchNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSwitchNetworkResponseBody</p>
 */
public class DescribeInstanceSwitchNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("VpcInfos")
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
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>03E12FE3-1638-483E-A9B6-1A9120SER56T</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Indicates the information about the virtual private cloud (VPC) in which the instance is deployed.</p>
         */
        public Builder vpcInfos(VpcInfos vpcInfos) {
            this.vpcInfos = vpcInfos;
            return this;
        }

        public DescribeInstanceSwitchNetworkResponseBody build() {
            return new DescribeInstanceSwitchNetworkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSwitchNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSwitchNetworkResponseBody</p>
     */
    public static class VswitchInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzoneId")
        private String azoneId;

        @com.aliyun.core.annotation.NameInMap("DrdsSupported")
        private Boolean drdsSupported;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("VswitchName")
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
             * <p>Indicates the ID of the zone in which the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder azoneId(String azoneId) {
                this.azoneId = azoneId;
                return this;
            }

            /**
             * <p>Indicates whether you can change the network type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder drdsSupported(Boolean drdsSupported) {
                this.drdsSupported = drdsSupported;
                return this;
            }

            /**
             * <p>Indicates the ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_id</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>Indicates the ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vswitch_id</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>Indicates the name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vswitch_name</p>
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
    /**
     * 
     * {@link DescribeInstanceSwitchNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSwitchNetworkResponseBody</p>
     */
    public static class VswitchInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VswitchInfo")
        private java.util.List<VswitchInfo> vswitchInfo;

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
        public java.util.List<VswitchInfo> getVswitchInfo() {
            return this.vswitchInfo;
        }

        public static final class Builder {
            private java.util.List<VswitchInfo> vswitchInfo; 

            /**
             * VswitchInfo.
             */
            public Builder vswitchInfo(java.util.List<VswitchInfo> vswitchInfo) {
                this.vswitchInfo = vswitchInfo;
                return this;
            }

            public VswitchInfos build() {
                return new VswitchInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceSwitchNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSwitchNetworkResponseBody</p>
     */
    public static class VpcInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        @com.aliyun.core.annotation.NameInMap("VswitchInfos")
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
             * <p>Indicates the ID of the region in which the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Indicates the ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_id</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>Indicates the name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_name</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * <p>Indicates information about the vSwitch to which the instance is connected.</p>
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
    /**
     * 
     * {@link DescribeInstanceSwitchNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSwitchNetworkResponseBody</p>
     */
    public static class VpcInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcInfo")
        private java.util.List<VpcInfo> vpcInfo;

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
        public java.util.List<VpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

        public static final class Builder {
            private java.util.List<VpcInfo> vpcInfo; 

            /**
             * VpcInfo.
             */
            public Builder vpcInfo(java.util.List<VpcInfo> vpcInfo) {
                this.vpcInfo = vpcInfo;
                return this;
            }

            public VpcInfos build() {
                return new VpcInfos(this);
            } 

        } 

    }
}
