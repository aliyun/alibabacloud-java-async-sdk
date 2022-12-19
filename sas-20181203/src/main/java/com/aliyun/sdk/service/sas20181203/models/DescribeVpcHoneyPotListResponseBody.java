// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcHoneyPotListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcHoneyPotListResponseBody</p>
 */
public class DescribeVpcHoneyPotListResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcHoneyPotDTOList")
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
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the honeypots.
         */
        public Builder vpcHoneyPotDTOList(java.util.List < VpcHoneyPotDTOList> vpcHoneyPotDTOList) {
            this.vpcHoneyPotDTOList = vpcHoneyPotDTOList;
            return this;
        }

        public DescribeVpcHoneyPotListResponseBody build() {
            return new DescribeVpcHoneyPotListResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
    public static class VpcSwitchIdList extends TeaModel {
        @NameInMap("VpcSwitchId")
        private String vpcSwitchId;

        @NameInMap("VpcSwitchName")
        private String vpcSwitchName;

        @NameInMap("ZoneId")
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
             * The ID of the vSwitch.
             */
            public Builder vpcSwitchId(String vpcSwitchId) {
                this.vpcSwitchId = vpcSwitchId;
                return this;
            }

            /**
             * The name of the vSwitch.
             */
            public Builder vpcSwitchName(String vpcSwitchName) {
                this.vpcSwitchName = vpcSwitchName;
                return this;
            }

            /**
             * The zone ID of the vSwitch.
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
    public static class VpcHoneyPotDTOList extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("HoneyPotEcsInstanceStatus")
        private String honeyPotEcsInstanceStatus;

        @NameInMap("HoneyPotEniInstanceId")
        private String honeyPotEniInstanceId;

        @NameInMap("HoneyPotExistence")
        private Boolean honeyPotExistence;

        @NameInMap("HoneyPotInstanceStatus")
        private String honeyPotInstanceStatus;

        @NameInMap("HoneyPotVpcSwitchId")
        private String honeyPotVpcSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        @NameInMap("VpcRegionId")
        private String vpcRegionId;

        @NameInMap("VpcStatus")
        private String vpcStatus;

        @NameInMap("VpcSwitchIdList")
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
             * The CIDR block of the VPC.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * The time when the VPC was created. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The status of the server on which the honeypot is deployed. Valid values:
             * <p>
             * 
             * *   **Pending**: The server is being created.
             * *   **Running**: The server is running.
             * *   **Starting**: The server is being started.
             * *   **Stopping**: The server is being stopped.
             * *   **Stopped**: The server is stopped.
             */
            public Builder honeyPotEcsInstanceStatus(String honeyPotEcsInstanceStatus) {
                this.honeyPotEcsInstanceStatus = honeyPotEcsInstanceStatus;
                return this;
            }

            /**
             * The ID of the elastic network interface (ENI) used by the honeypot in the VPC.
             */
            public Builder honeyPotEniInstanceId(String honeyPotEniInstanceId) {
                this.honeyPotEniInstanceId = honeyPotEniInstanceId;
                return this;
            }

            /**
             * Indicates whether the cloud honeypot feature is enabled for the VPC. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder honeyPotExistence(Boolean honeyPotExistence) {
                this.honeyPotExistence = honeyPotExistence;
                return this;
            }

            /**
             * The status of the honeypot. Valid values:
             * <p>
             * 
             * *   **pending**: The honeypot is being created.
             * *   **deleting**: The honeypot is being deleted.
             * *   **off**: The honeypot is disabled.
             * *   **suspending**: The honeypot is suspended.
             * *   **on**: The honeypot is enabled.
             */
            public Builder honeyPotInstanceStatus(String honeyPotInstanceStatus) {
                this.honeyPotInstanceStatus = honeyPotInstanceStatus;
                return this;
            }

            /**
             * The ID of the vSwitch to which the ENI used by the honeypot is connected.
             */
            public Builder honeyPotVpcSwitchId(String honeyPotVpcSwitchId) {
                this.honeyPotVpcSwitchId = honeyPotVpcSwitchId;
                return this;
            }

            /**
             * The ID of the VPC.
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

            /**
             * The region ID of the VPC.
             * <p>
             * 
             * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            /**
             * The status of the VPC. Valid values:
             * <p>
             * 
             * *   **Available**: The VPC is normal and available.
             * *   **Pending**: The VPC is being configured.
             */
            public Builder vpcStatus(String vpcStatus) {
                this.vpcStatus = vpcStatus;
                return this;
            }

            /**
             * An array that consists of the vSwitches in the VPC.
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
