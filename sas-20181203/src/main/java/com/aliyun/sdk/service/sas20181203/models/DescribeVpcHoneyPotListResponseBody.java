// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVpcHoneyPotListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcHoneyPotListResponseBody</p>
 */
public class DescribeVpcHoneyPotListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcHoneyPotDTOList")
    private java.util.List < VpcHoneyPotDTOList> vpcHoneyPotDTOList;

    private DescribeVpcHoneyPotListResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.vpcHoneyPotDTOList = builder.vpcHoneyPotDTOList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcHoneyPotListResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcHoneyPotDTOList
     */
    public java.util.List < VpcHoneyPotDTOList> getVpcHoneyPotDTOList() {
        return this.vpcHoneyPotDTOList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < VpcHoneyPotDTOList> vpcHoneyPotDTOList; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4FEC7F58-FCDA-415F-AE25-CD8BC0931DF2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the honeypots.</p>
         */
        public Builder vpcHoneyPotDTOList(java.util.List < VpcHoneyPotDTOList> vpcHoneyPotDTOList) {
            this.vpcHoneyPotDTOList = vpcHoneyPotDTOList;
            return this;
        }

        public DescribeVpcHoneyPotListResponseBody build() {
            return new DescribeVpcHoneyPotListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcHoneyPotListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcHoneyPotListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcHoneyPotListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcHoneyPotListResponseBody</p>
     */
    public static class VpcSwitchIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcSwitchId")
        private String vpcSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcSwitchName")
        private String vpcSwitchName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VpcSwitchIdList(Builder builder) {
            this.vpcSwitchId = builder.vpcSwitchId;
            this.vpcSwitchName = builder.vpcSwitchName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcSwitchIdList create() {
            return builder().build();
        }

        /**
         * @return vpcSwitchId
         */
        public String getVpcSwitchId() {
            return this.vpcSwitchId;
        }

        /**
         * @return vpcSwitchName
         */
        public String getVpcSwitchName() {
            return this.vpcSwitchName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vpcSwitchId; 
            private String vpcSwitchName; 
            private String zoneId; 

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-p0wdnyv4wzp6jkuu4****</p>
             */
            public Builder vpcSwitchId(String vpcSwitchId) {
                this.vpcSwitchId = vpcSwitchId;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>abc01</p>
             */
            public Builder vpcSwitchName(String vpcSwitchName) {
                this.vpcSwitchName = vpcSwitchName;
                return this;
            }

            /**
             * <p>The zone ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-2b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VpcSwitchIdList build() {
                return new VpcSwitchIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcHoneyPotListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcHoneyPotListResponseBody</p>
     */
    public static class VpcHoneyPotDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("HoneyPotEcsInstanceStatus")
        private String honeyPotEcsInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("HoneyPotEniInstanceId")
        private String honeyPotEniInstanceId;

        @com.aliyun.core.annotation.NameInMap("HoneyPotExistence")
        private Boolean honeyPotExistence;

        @com.aliyun.core.annotation.NameInMap("HoneyPotInstanceStatus")
        private String honeyPotInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("HoneyPotVpcSwitchId")
        private String honeyPotVpcSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        @com.aliyun.core.annotation.NameInMap("VpcRegionId")
        private String vpcRegionId;

        @com.aliyun.core.annotation.NameInMap("VpcStatus")
        private String vpcStatus;

        @com.aliyun.core.annotation.NameInMap("VpcSwitchIdList")
        private java.util.List < VpcSwitchIdList> vpcSwitchIdList;

        private VpcHoneyPotDTOList(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.createTime = builder.createTime;
            this.honeyPotEcsInstanceStatus = builder.honeyPotEcsInstanceStatus;
            this.honeyPotEniInstanceId = builder.honeyPotEniInstanceId;
            this.honeyPotExistence = builder.honeyPotExistence;
            this.honeyPotInstanceStatus = builder.honeyPotInstanceStatus;
            this.honeyPotVpcSwitchId = builder.honeyPotVpcSwitchId;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
            this.vpcRegionId = builder.vpcRegionId;
            this.vpcStatus = builder.vpcStatus;
            this.vpcSwitchIdList = builder.vpcSwitchIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcHoneyPotDTOList create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return honeyPotEcsInstanceStatus
         */
        public String getHoneyPotEcsInstanceStatus() {
            return this.honeyPotEcsInstanceStatus;
        }

        /**
         * @return honeyPotEniInstanceId
         */
        public String getHoneyPotEniInstanceId() {
            return this.honeyPotEniInstanceId;
        }

        /**
         * @return honeyPotExistence
         */
        public Boolean getHoneyPotExistence() {
            return this.honeyPotExistence;
        }

        /**
         * @return honeyPotInstanceStatus
         */
        public String getHoneyPotInstanceStatus() {
            return this.honeyPotInstanceStatus;
        }

        /**
         * @return honeyPotVpcSwitchId
         */
        public String getHoneyPotVpcSwitchId() {
            return this.honeyPotVpcSwitchId;
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
         * @return vpcRegionId
         */
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

        /**
         * @return vpcStatus
         */
        public String getVpcStatus() {
            return this.vpcStatus;
        }

        /**
         * @return vpcSwitchIdList
         */
        public java.util.List < VpcSwitchIdList> getVpcSwitchIdList() {
            return this.vpcSwitchIdList;
        }

        public static final class Builder {
            private String cidrBlock; 
            private Long createTime; 
            private String honeyPotEcsInstanceStatus; 
            private String honeyPotEniInstanceId; 
            private Boolean honeyPotExistence; 
            private String honeyPotInstanceStatus; 
            private String honeyPotVpcSwitchId; 
            private String vpcId; 
            private String vpcName; 
            private String vpcRegionId; 
            private String vpcStatus; 
            private java.util.List < VpcSwitchIdList> vpcSwitchIdList; 

            /**
             * <p>The CIDR block of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/16</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The time at which the VPC was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1607365213000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The status of the server on which the honeypot is deployed. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: The server is being created.</li>
             * <li><strong>Running</strong>: The server is running.</li>
             * <li><strong>Starting</strong>: The server is being started.</li>
             * <li><strong>Stopping</strong>: The server is being stopped.</li>
             * <li><strong>Stopped</strong>: The server is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder honeyPotEcsInstanceStatus(String honeyPotEcsInstanceStatus) {
                this.honeyPotEcsInstanceStatus = honeyPotEcsInstanceStatus;
                return this;
            }

            /**
             * <p>The ID of the elastic network interface (ENI) used by the honeypot in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-p0whwgg7bing8b80****</p>
             */
            public Builder honeyPotEniInstanceId(String honeyPotEniInstanceId) {
                this.honeyPotEniInstanceId = honeyPotEniInstanceId;
                return this;
            }

            /**
             * <p>Indicates whether the cloud honeypot feature is enabled for the VPC. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder honeyPotExistence(Boolean honeyPotExistence) {
                this.honeyPotExistence = honeyPotExistence;
                return this;
            }

            /**
             * <p>The status of the honeypot. Valid values:</p>
             * <ul>
             * <li><strong>pending</strong>: The honeypot is being created.</li>
             * <li><strong>deleting</strong>: The honeypot is being deleted.</li>
             * <li><strong>off</strong>: The honeypot is disabled.</li>
             * <li><strong>suspending</strong>: The honeypot is suspended.</li>
             * <li><strong>on</strong>: The honeypot is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder honeyPotInstanceStatus(String honeyPotInstanceStatus) {
                this.honeyPotInstanceStatus = honeyPotInstanceStatus;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the ENI used by the honeypot is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-p0w7gdcfvn20tvdul****</p>
             */
            public Builder honeyPotVpcSwitchId(String honeyPotVpcSwitchId) {
                this.honeyPotVpcSwitchId = honeyPotVpcSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-p0w223apdl49sr5zv****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>abc-vpcname</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * <p>The region ID of the VPC.</p>
             * <blockquote>
             * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-2</p>
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            /**
             * <p>The status of the VPC. Valid values:</p>
             * <ul>
             * <li><strong>Available</strong>: The VPC is normal and available.</li>
             * <li><strong>Pending</strong>: The VPC is being configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder vpcStatus(String vpcStatus) {
                this.vpcStatus = vpcStatus;
                return this;
            }

            /**
             * <p>An array that consists of the vSwitches in the VPC.</p>
             */
            public Builder vpcSwitchIdList(java.util.List < VpcSwitchIdList> vpcSwitchIdList) {
                this.vpcSwitchIdList = vpcSwitchIdList;
                return this;
            }

            public VpcHoneyPotDTOList build() {
                return new VpcHoneyPotDTOList(this);
            } 

        } 

    }
}
