// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVSwitchesResponseBody</p>
 */
public class DescribeVSwitchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VSwitches")
    private VSwitches vSwitches;

    private DescribeVSwitchesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vSwitches = builder.vSwitches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVSwitchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vSwitches
     */
    public VSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static final class Builder {
        private String requestId; 
        private VSwitches vSwitches; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried vSwitches.</p>
         */
        public Builder vSwitches(VSwitches vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        public DescribeVSwitchesResponseBody build() {
            return new DescribeVSwitchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchesResponseBody</p>
     */
    public static class VSwitch extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("IzNo")
        private String izNo;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        private VSwitch(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bid = builder.bid;
            this.cidrBlock = builder.cidrBlock;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isDefault = builder.isDefault;
            this.izNo = builder.izNo;
            this.regionNo = builder.regionNo;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitch create() {
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
         * @return izNo
         */
        public String getIzNo() {
            return this.izNo;
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
            private String aliUid; 
            private String bid; 
            private String cidrBlock; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean isDefault; 
            private String izNo; 
            private String regionNo; 
            private String status; 
            private String vSwitchId; 
            private String vSwitchName; 

            /**
             * <p>The ID of the Resource Access Management (RAM) user.</p>
             * 
             * <strong>example:</strong>
             * <p>195813423043****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the user channel.</p>
             * 
             * <strong>example:</strong>
             * <p>2****</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The time when the vSwitch was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-18T12:43:57Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the vSwitch was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-22T12:43:57Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the vSwitch is the default vSwitch. Valid values: <strong>true</strong>: The vSwitch is the default vSwitch. <strong>false</strong>: The vSwitch is not the default vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The zone ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-k</p>
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * <p>The region ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The state of the vSwitch. Valid values: <strong>Pending</strong>: the vSwitch is being configured. <strong>Available</strong>: the vSwitch is available.</p>
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
             * <p>vsw-25bcdxs7pv1****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vswitch</p>
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            public VSwitch build() {
                return new VSwitch(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchesResponseBody</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitch")
        private java.util.List < VSwitch> vSwitch;

        private VSwitches(Builder builder) {
            this.vSwitch = builder.vSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vSwitch
         */
        public java.util.List < VSwitch> getVSwitch() {
            return this.vSwitch;
        }

        public static final class Builder {
            private java.util.List < VSwitch> vSwitch; 

            /**
             * <p>The queried vSwitch.</p>
             */
            public Builder vSwitch(java.util.List < VSwitch> vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
