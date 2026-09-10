// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeVpcsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcsResponseBody</p>
 */
public class DescribeVpcsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Vpcs")
    private java.util.List<Vpcs> vpcs;

    private DescribeVpcsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcs = builder.vpcs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpcs
     */
    public java.util.List<Vpcs> getVpcs() {
        return this.vpcs;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Vpcs> vpcs; 

        private Builder() {
        } 

        private Builder(DescribeVpcsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpcs = model.vpcs;
        } 

        /**
         * <p>The page number of the returned page. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * <p><strong>30</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11FDB5A0-84F5-5361-B729-5770B0AEB9D5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>A list of VPCs.</p>
         */
        public Builder vpcs(java.util.List<Vpcs> vpcs) {
            this.vpcs = vpcs;
            return this;
        }

        public DescribeVpcsResponseBody build() {
            return new DescribeVpcsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcsResponseBody</p>
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
             * <p>The IPv4 CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>47.118.126.0/25</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The time when the vSwitch was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-18T15:02:37Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the vSwitch was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-18T15:02:37Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the vSwitch is the default vSwitch. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The vSwitch is the default vSwitch.</p>
             * </li>
             * <li><p><strong>false</strong>: The vSwitch is not the default vSwitch.</p>
             * </li>
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
             * <p>The zone to which the vSwitch belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen-f</p>
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * <p>The status of the vSwitch. Valid values:</p>
             * <ul>
             * <li><p><strong>Pending</strong>: The vSwitch is being configured.</p>
             * </li>
             * <li><p><strong>Available</strong>: The vSwitch is active.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6fus5py6hbvxqwzwnk8</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>default-sw</p>
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
     * {@link DescribeVpcsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcsResponseBody</p>
     */
    public static class Vpcs extends TeaModel {
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

        private Vpcs(Builder builder) {
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

        public static Vpcs create() {
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

            private Builder(Vpcs model) {
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
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1868512340232755</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>Indicates whether the account is an Alibaba Finance Cloud account, an Alibaba Gov Cloud account, or a public cloud account.</p>
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
             * <p>57.100.6.59/32</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The time when the VPC was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-18T15:02:37Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the VPC was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-18T15:02:37Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the VPC is the default VPC. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The VPC is the default VPC.</p>
             * </li>
             * <li><p><strong>false</strong>: The VPC is not the default VPC.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the region to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-wt97-a01</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The status of the VPC. Valid values:</p>
             * <ul>
             * <li><p><code>Pending</code>: The VPC is being configured.</p>
             * </li>
             * <li><p><code>Available</code>: The VPC is active.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>A list of vSwitches.</p>
             */
            public Builder vSwitchs(java.util.List<VSwitchs> vSwitchs) {
                this.vSwitchs = vSwitchs;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query the details of VPCs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16efwqjzyumc23c647v</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-e2e-10341f3</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
}
