// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeRdsVpcsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsVpcsResponseBody</p>
 */
public class DescribeRdsVpcsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Vpcs")
    private Vpcs vpcs;

    private DescribeRdsVpcsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcs = builder.vpcs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsVpcsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcs
     */
    public Vpcs getVpcs() {
        return this.vpcs;
    }

    public static final class Builder {
        private String requestId; 
        private Vpcs vpcs; 

        private Builder() {
        } 

        private Builder(DescribeRdsVpcsResponseBody model) {
            this.requestId = model.requestId;
            this.vpcs = model.vpcs;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C1A7CFB-9F73-5041-8C74-27626E58985A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The VPC information.</p>
         */
        public Builder vpcs(Vpcs vpcs) {
            this.vpcs = vpcs;
            return this;
        }

        public DescribeRdsVpcsResponseBody build() {
            return new DescribeRdsVpcsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRdsVpcsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsVpcsResponseBody</p>
     */
    public static class VSwitchs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("IzNo")
        private String izNo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        private VSwitchs(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isDefault = builder.isDefault;
            this.izNo = builder.izNo;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchs create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return izNo
         */
        public String getIzNo() {
            return this.izNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean isDefault; 
            private String izNo; 
            private String status; 
            private String vSwitchId; 
            private String vSwitchName; 

            private Builder() {
            } 

            private Builder(VSwitchs model) {
                this.cidrBlock = model.cidrBlock;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.isDefault = model.isDefault;
                this.izNo = model.izNo;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchName = model.vSwitchName;
            } 

            /**
             * <p>The vSwitch CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The time when the vSwitch was created. The value is a UNIX timestamp accurate to milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1574156944000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the vSwitch was last modified. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-03T19:19:13+08:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the vSwitch is the default vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-g</p>
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * <p>The vSwitch status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-8vbkwmpn****4nrd639ih</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto_g</p>
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            public VSwitchs build() {
                return new VSwitchs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsVpcsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsVpcsResponseBody</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("Bid")
        private String bid;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchs")
        private java.util.List<VSwitchs> vSwitchs;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private Vpc(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bid = builder.bid;
            this.cidrBlock = builder.cidrBlock;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isDefault = builder.isDefault;
            this.regionNo = builder.regionNo;
            this.status = builder.status;
            this.vSwitchs = builder.vSwitchs;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchs
         */
        public java.util.List<VSwitchs> getVSwitchs() {
            return this.vSwitchs;
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

        public static final class Builder {
            private String aliUid; 
            private String bid; 
            private String cidrBlock; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean isDefault; 
            private String regionNo; 
            private String status; 
            private java.util.List<VSwitchs> vSwitchs; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(Vpc model) {
                this.aliUid = model.aliUid;
                this.bid = model.bid;
                this.cidrBlock = model.cidrBlock;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.isDefault = model.isDefault;
                this.regionNo = model.regionNo;
                this.status = model.status;
                this.vSwitchs = model.vSwitchs;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>314****36</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>47.121.246.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The time when the VPC was created.</p>
             * 
             * <strong>example:</strong>
             * <p>Mon May 12 10:13:14 CST 2025</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the VPC was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-29 17:47:56</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the VPC is the default VPC. Valid values: <strong>true</strong>: The VPC is the default VPC. <strong>false</strong>: The VPC is not the default VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The region in which the VPC resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The VPC status.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch information of the VPC.</p>
             */
            public Builder vSwitchs(java.util.List<VSwitchs> vSwitchs) {
                this.vSwitchs = vSwitchs;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zekldxxy28nobay7o1f3</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto_test</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRdsVpcsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsVpcsResponseBody</p>
     */
    public static class Vpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vpc")
        private java.util.List<Vpc> vpc;

        private Vpcs(Builder builder) {
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpcs create() {
            return builder().build();
        }

        /**
         * @return vpc
         */
        public java.util.List<Vpc> getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private java.util.List<Vpc> vpc; 

            private Builder() {
            } 

            private Builder(Vpcs model) {
                this.vpc = model.vpc;
            } 

            /**
             * <p>The VPC information.</p>
             */
            public Builder vpc(java.util.List<Vpc> vpc) {
                this.vpc = vpc;
                return this;
            }

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
}
