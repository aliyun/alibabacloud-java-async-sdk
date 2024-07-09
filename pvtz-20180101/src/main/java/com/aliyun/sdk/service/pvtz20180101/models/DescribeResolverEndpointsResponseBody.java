// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResolverEndpointsResponseBody</p>
 */
public class DescribeResolverEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeResolverEndpointsResponseBody(Builder builder) {
        this.endpoints = builder.endpoints;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
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
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private java.util.List < Endpoints> endpoints; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * The information about endpoints.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeResolverEndpointsResponseBody build() {
            return new DescribeResolverEndpointsResponseBody(this);
        } 

    } 

    public static class IpConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzId")
        private String azId;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private IpConfigs(Builder builder) {
            this.azId = builder.azId;
            this.cidrBlock = builder.cidrBlock;
            this.ip = builder.ip;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpConfigs create() {
            return builder().build();
        }

        /**
         * @return azId
         */
        public String getAzId() {
            return this.azId;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String azId; 
            private String cidrBlock; 
            private String ip; 
            private String vSwitchId; 

            /**
             * The ID of the zone where the vSwitch resides.
             */
            public Builder azId(String azId) {
                this.azId = azId;
                return this;
            }

            /**
             * The IPv4 CIDR block of the vSwitch.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * The IPv4 address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public IpConfigs build() {
                return new IpConfigs(this);
            } 

        } 

    }
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IpConfigs")
        private java.util.List < IpConfigs> ipConfigs;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        @com.aliyun.core.annotation.NameInMap("VpcRegionId")
        private String vpcRegionId;

        @com.aliyun.core.annotation.NameInMap("VpcRegionName")
        private String vpcRegionName;

        private Endpoints(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.id = builder.id;
            this.ipConfigs = builder.ipConfigs;
            this.name = builder.name;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
            this.vpcRegionId = builder.vpcRegionId;
            this.vpcRegionName = builder.vpcRegionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ipConfigs
         */
        public java.util.List < IpConfigs> getIpConfigs() {
            return this.ipConfigs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
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
         * @return vpcRegionName
         */
        public String getVpcRegionName() {
            return this.vpcRegionName;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private String id; 
            private java.util.List < IpConfigs> ipConfigs; 
            private String name; 
            private String securityGroupId; 
            private String status; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String vpcId; 
            private String vpcName; 
            private String vpcRegionId; 
            private String vpcRegionName; 

            /**
             * The time when the endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the endpoint was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The endpoint ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The source IP addresses of outbound traffic.
             */
            public Builder ipConfigs(java.util.List < IpConfigs> ipConfigs) {
                this.ipConfigs = ipConfigs;
                return this;
            }

            /**
             * The endpoint name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The security group ID.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The state of the endpoint. Valid values:
             * <p>
             * 
             * *   SUCCESS: The endpoint works as expected.
             * *   INIT: The endpoint is being created.
             * *   FAILED: The endpoint fails to be created.
             * *   CHANGE_INIT: The endpoint is being modified.
             * *   CHANGE_FAILED: The endpoint fails to be modified.
             * *   EXCEPTION: The endpoint encounters an exception.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the endpoint was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The time when the endpoint was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * The ID of the outbound virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The VPC name.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * The region ID of the outbound VPC.
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            /**
             * The name of the region where the outbound VPC resides.
             */
            public Builder vpcRegionName(String vpcRegionName) {
                this.vpcRegionName = vpcRegionName;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
