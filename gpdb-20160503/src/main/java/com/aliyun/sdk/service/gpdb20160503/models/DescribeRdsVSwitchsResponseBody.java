// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeRdsVSwitchsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsVSwitchsResponseBody</p>
 */
public class DescribeRdsVSwitchsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VSwitches")
    private VSwitches vSwitches;

    private DescribeRdsVSwitchsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vSwitches = builder.vSwitches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsVSwitchsResponseBody create() {
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
     * @return vSwitches
     */
    public VSwitches getVSwitches() {
        return this.vSwitches;
    }

    public static final class Builder {
        private String requestId; 
        private VSwitches vSwitches; 

        private Builder() {
        } 

        private Builder(DescribeRdsVSwitchsResponseBody model) {
            this.requestId = model.requestId;
            this.vSwitches = model.vSwitches;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B0BA251D-6854-5A99-A964-3C**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of the vSwitches.</p>
         */
        public Builder vSwitches(VSwitches vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        public DescribeRdsVSwitchsResponseBody build() {
            return new DescribeRdsVSwitchsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRdsVSwitchsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsVSwitchsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VSwitch model) {
                this.aliUid = model.aliUid;
                this.bid = model.bid;
                this.cidrBlock = model.cidrBlock;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.isDefault = model.isDefault;
                this.izNo = model.izNo;
                this.regionNo = model.regionNo;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchName = model.vSwitchName;
            } 

            /**
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>The CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>192.<strong>.</strong>.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the vSwitch is the default vSwitch. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The state of the vSwitch. If <strong>Available</strong> is returned, the vSwitch is available.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp*******************</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-name</p>
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
     * {@link DescribeRdsVSwitchsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsVSwitchsResponseBody</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitch")
        private java.util.List<VSwitch> vSwitch;

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
        public java.util.List<VSwitch> getVSwitch() {
            return this.vSwitch;
        }

        public static final class Builder {
            private java.util.List<VSwitch> vSwitch; 

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vSwitch = model.vSwitch;
            } 

            /**
             * <p>Details of the vSwitch.</p>
             */
            public Builder vSwitch(java.util.List<VSwitch> vSwitch) {
                this.vSwitch = vSwitch;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
