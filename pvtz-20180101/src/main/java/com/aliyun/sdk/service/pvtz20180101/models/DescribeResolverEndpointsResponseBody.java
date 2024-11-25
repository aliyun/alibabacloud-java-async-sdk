// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The endpoints.</p>
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>83D1682B-B69A-4060-9FA8-2907C2A35600</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeResolverEndpointsResponseBody build() {
            return new DescribeResolverEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResolverEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResolverEndpointsResponseBody</p>
     */
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
             * <p>The ID of the zone to which the vSwitch belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-a</p>
             */
            public Builder azId(String azId) {
                this.azId = azId;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The source IP address of outbound traffic. The IP address must be within the specified CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-0jlgeyq4oazkh5xue****</p>
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
    /**
     * 
     * {@link DescribeResolverEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResolverEndpointsResponseBody</p>
     */
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
             * <p>The time when the endpoint was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-13 10:36:26</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the endpoint was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1594607786000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hr****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The source IP addresses of outbound traffic.</p>
             */
            public Builder ipConfigs(java.util.List < IpConfigs> ipConfigs) {
                this.ipConfigs = ipConfigs;
                return this;
            }

            /**
             * <p>The name of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>endpoint-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-0jld3m9yq7l2cw12****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The state of the endpoint that you queried. Valid values:</p>
             * <ul>
             * <li>SUCCESS: The endpoint works as expected.</li>
             * <li>INIT: The endpoint is being created.</li>
             * <li>FAILED: The endpoint failed to be created.</li>
             * <li>CHANGE_INIT: The endpoint is being modified.</li>
             * <li>CHANGE_FAILED: The endpoint failed to be modified.</li>
             * <li>EXCEPTION: The endpoint encountered an exception.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the endpoint was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-13 10:38:24</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The time when the endpoint was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1594607904000</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>The ID of the outbound VPC. All outbound Domain Name System (DNS) requests of the resolver are forwarded by this VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-0jlxhpfnj5bfu0bsd****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the outbound VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-test-name</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * <p>The region ID of the outbound VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder vpcRegionId(String vpcRegionId) {
                this.vpcRegionId = vpcRegionId;
                return this;
            }

            /**
             * <p>The name of the region where the VPC resides.</p>
             * 
             * <strong>example:</strong>
             * <p>China East 1 (Hangzhou)</p>
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
