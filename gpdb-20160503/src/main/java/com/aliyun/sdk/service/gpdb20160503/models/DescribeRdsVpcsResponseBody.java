// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsVpcsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsVpcsResponseBody</p>
 */
public class DescribeRdsVpcsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Vpcs")
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

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details of the VPCs.
         */
        public Builder vpcs(Vpcs vpcs) {
            this.vpcs = vpcs;
            return this;
        }

        public DescribeRdsVpcsResponseBody build() {
            return new DescribeRdsVpcsResponseBody(this);
        } 

    } 

    public static class VSwitchs extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("IzNo")
        private String izNo;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VSwitchName")
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

            /**
             * The CIDR block of the vSwitch.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * An invalid parameter. It is no longer returned when you call this operation.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * An invalid parameter. It is no longer returned when you call this operation.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether the vSwitch is the default vSwitch. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The ID of the zone to which the vSwitch belongs.
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * The state of the vSwitch. If **Available** is returned, the vSwitch is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The name of the vSwitch.
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
    public static class Vpc extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("Bid")
        private String bid;

        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchs")
        private java.util.List < VSwitchs> vSwitchs;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
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
        public java.util.List < VSwitchs> getVSwitchs() {
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
            private java.util.List < VSwitchs> vSwitchs; 
            private String vpcId; 
            private String vpcName; 

            /**
             * An invalid parameter. It is no longer returned when you call this operation.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * An invalid parameter. It is no longer returned when you call this operation.
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * The CIDR block of the VPC.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * An invalid parameter. It is no longer returned when you call this operation.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * An invalid parameter. It is no longer returned when you call this operation.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Indicates whether the VPC is the default VPC. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The state of the VPC. If **Available** is returned, the VPC is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Details of the vSwitches.
             */
            public Builder vSwitchs(java.util.List < VSwitchs> vSwitchs) {
                this.vSwitchs = vSwitchs;
                return this;
            }

            /**
             * The ID of VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC.
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
    public static class Vpcs extends TeaModel {
        @NameInMap("Vpc")
        private java.util.List < Vpc> vpc;

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
        public java.util.List < Vpc> getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private java.util.List < Vpc> vpc; 

            /**
             * Details of the VPC.
             */
            public Builder vpc(java.util.List < Vpc> vpc) {
                this.vpc = vpc;
                return this;
            }

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
}
