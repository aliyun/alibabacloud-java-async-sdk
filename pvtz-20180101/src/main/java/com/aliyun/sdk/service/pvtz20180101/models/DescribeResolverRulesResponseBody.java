// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResolverRulesResponseBody</p>
 */
public class DescribeResolverRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List < Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeResolverRulesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverRulesResponseBody create() {
        return builder().build();
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
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < Rules> rules; 
        private Integer totalItems; 
        private Integer totalPages; 

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
         * The forwarding rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
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

        public DescribeResolverRulesResponseBody build() {
            return new DescribeResolverRulesResponseBody(this);
        } 

    } 

    public static class BindVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        @com.aliyun.core.annotation.NameInMap("VpcUserId")
        private String vpcUserId;

        private BindVpcs(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
            this.vpcType = builder.vpcType;
            this.vpcUserId = builder.vpcUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindVpcs create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
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
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        /**
         * @return vpcUserId
         */
        public String getVpcUserId() {
            return this.vpcUserId;
        }

        public static final class Builder {
            private String regionId; 
            private String regionName; 
            private String vpcId; 
            private String vpcName; 
            private String vpcType; 
            private String vpcUserId; 

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The region name.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The VPC ID.
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
             * The type of the virtual private cloud (VPC). Valid values:
             * <p>
             * 
             * *   STANDARD: standard VPC
             * *   EDS: Elastic Desktop Service (EDS) workspace VPC
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            /**
             * The Alibaba Cloud account to which the VPC belongs.
             */
            public Builder vpcUserId(String vpcUserId) {
                this.vpcUserId = vpcUserId;
                return this;
            }

            public BindVpcs build() {
                return new BindVpcs(this);
            } 

        } 

    }
    public static class ForwardIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private ForwardIps(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardIps create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String ip; 
            private Integer port; 

            /**
             * The IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The port number.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public ForwardIps build() {
                return new ForwardIps(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindVpcs")
        private java.util.List < BindVpcs> bindVpcs;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("ForwardIps")
        private java.util.List < ForwardIps> forwardIps;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private Rules(Builder builder) {
            this.bindVpcs = builder.bindVpcs;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.forwardIps = builder.forwardIps;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return bindVpcs
         */
        public java.util.List < BindVpcs> getBindVpcs() {
            return this.bindVpcs;
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
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return forwardIps
         */
        public java.util.List < ForwardIps> getForwardIps() {
            return this.forwardIps;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
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
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private java.util.List < BindVpcs> bindVpcs; 
            private String createTime; 
            private Long createTimestamp; 
            private String endpointId; 
            private String endpointName; 
            private java.util.List < ForwardIps> forwardIps; 
            private String id; 
            private String name; 
            private String type; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String zoneName; 

            /**
             * The VPCs associated with the forwarding rule.
             */
            public Builder bindVpcs(java.util.List < BindVpcs> bindVpcs) {
                this.bindVpcs = bindVpcs;
                return this;
            }

            /**
             * The time when the forwarding was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the forwarding rule was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The endpoint ID.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The endpoint name.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * The destination IP addresses.
             */
            public Builder forwardIps(java.util.List < ForwardIps> forwardIps) {
                this.forwardIps = forwardIps;
                return this;
            }

            /**
             * The ID of the forwarding rule.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the forwarding rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the forwarding rule. Valid value:
             * <p>
             * 
             * *   OUTBOUND: Domain Name System (DNS) requests are forwarded to one or more IP addresses.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the forwarding rule was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The timestamp when the forwarding rule was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * The name of the forward zone.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
