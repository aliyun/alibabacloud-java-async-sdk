// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePrivateDnsEndpointListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrivateDnsEndpointListResponseBody</p>
 */
public class DescribePrivateDnsEndpointListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessInstanceList")
    private java.util.List<AccessInstanceList> accessInstanceList;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePrivateDnsEndpointListResponseBody(Builder builder) {
        this.accessInstanceList = builder.accessInstanceList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrivateDnsEndpointListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceList
     */
    public java.util.List<AccessInstanceList> getAccessInstanceList() {
        return this.accessInstanceList;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AccessInstanceList> accessInstanceList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribePrivateDnsEndpointListResponseBody model) {
            this.accessInstanceList = model.accessInstanceList;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of private instances.</p>
         */
        public Builder accessInstanceList(java.util.List<AccessInstanceList> accessInstanceList) {
            this.accessInstanceList = accessInstanceList;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>850A84D6-0DE4-4797-A1E8-00090****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePrivateDnsEndpointListResponseBody build() {
            return new DescribePrivateDnsEndpointListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePrivateDnsEndpointListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrivateDnsEndpointListResponseBody</p>
     */
    public static class AccessInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
        private String accessInstanceId;

        @com.aliyun.core.annotation.NameInMap("AccessInstanceName")
        private String accessInstanceName;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("DomainNameCount")
        private Long domainNameCount;

        @com.aliyun.core.annotation.NameInMap("FirewallType")
        private java.util.List<String> firewallType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private Integer ipProtocol;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private Long memberUid;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("PrimaryDns")
        private String primaryDns;

        @com.aliyun.core.annotation.NameInMap("PrivateDnsType")
        private String privateDnsType;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("StandbyDns")
        private String standbyDns;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AccessInstanceList(Builder builder) {
            this.accessInstanceId = builder.accessInstanceId;
            this.accessInstanceName = builder.accessInstanceName;
            this.aliUid = builder.aliUid;
            this.domainNameCount = builder.domainNameCount;
            this.firewallType = builder.firewallType;
            this.gmtCreate = builder.gmtCreate;
            this.ipProtocol = builder.ipProtocol;
            this.memberUid = builder.memberUid;
            this.port = builder.port;
            this.primaryDns = builder.primaryDns;
            this.privateDnsType = builder.privateDnsType;
            this.regionNo = builder.regionNo;
            this.standbyDns = builder.standbyDns;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessInstanceList create() {
            return builder().build();
        }

        /**
         * @return accessInstanceId
         */
        public String getAccessInstanceId() {
            return this.accessInstanceId;
        }

        /**
         * @return accessInstanceName
         */
        public String getAccessInstanceName() {
            return this.accessInstanceName;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return domainNameCount
         */
        public Long getDomainNameCount() {
            return this.domainNameCount;
        }

        /**
         * @return firewallType
         */
        public java.util.List<String> getFirewallType() {
            return this.firewallType;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return ipProtocol
         */
        public Integer getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return memberUid
         */
        public Long getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return primaryDns
         */
        public String getPrimaryDns() {
            return this.primaryDns;
        }

        /**
         * @return privateDnsType
         */
        public String getPrivateDnsType() {
            return this.privateDnsType;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return standbyDns
         */
        public String getStandbyDns() {
            return this.standbyDns;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String accessInstanceId; 
            private String accessInstanceName; 
            private Long aliUid; 
            private Long domainNameCount; 
            private java.util.List<String> firewallType; 
            private Long gmtCreate; 
            private Integer ipProtocol; 
            private Long memberUid; 
            private Integer port; 
            private String primaryDns; 
            private String privateDnsType; 
            private String regionNo; 
            private String standbyDns; 
            private Integer status; 
            private String taskId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(AccessInstanceList model) {
                this.accessInstanceId = model.accessInstanceId;
                this.accessInstanceName = model.accessInstanceName;
                this.aliUid = model.aliUid;
                this.domainNameCount = model.domainNameCount;
                this.firewallType = model.firewallType;
                this.gmtCreate = model.gmtCreate;
                this.ipProtocol = model.ipProtocol;
                this.memberUid = model.memberUid;
                this.port = model.port;
                this.primaryDns = model.primaryDns;
                this.privateDnsType = model.privateDnsType;
                this.regionNo = model.regionNo;
                this.standbyDns = model.standbyDns;
                this.status = model.status;
                this.taskId = model.taskId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder accessInstanceId(String accessInstanceId) {
                this.accessInstanceId = accessInstanceId;
                return this;
            }

            /**
             * <p>The name of the private instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accessInstanceName(String accessInstanceName) {
                this.accessInstanceName = accessInstanceName;
                return this;
            }

            /**
             * <p>The UID of the Alibaba Cloud account that owns the Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>1379490574415****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The number of domain names.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder domainNameCount(Long domainNameCount) {
                this.domainNameCount = domainNameCount;
                return this;
            }

            /**
             * <p>The type of Cloud Firewall. Valid values:</p>
             * <ul>
             * <li><p><strong>internet</strong></p>
             * </li>
             * <li><p><strong>vpc</strong></p>
             * </li>
             * <li><p><strong>nat</strong></p>
             * </li>
             * </ul>
             */
            public Builder firewallType(java.util.List<String> firewallType) {
                this.firewallType = firewallType;
                return this;
            }

            /**
             * <p>The time when the instance was created. The value is a UNIX timestamp measured in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1715075765</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The IP protocol. Valid values:</p>
             * <ul>
             * <li><p><strong>TCP</strong></p>
             * </li>
             * <li><p><strong>UDP</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder ipProtocol(Integer ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * <p>The UID of the Cloud Firewall member account.</p>
             * 
             * <strong>example:</strong>
             * <p>1844802493****</p>
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The primary DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder primaryDns(String primaryDns) {
                this.primaryDns = primaryDns;
                return this;
            }

            /**
             * <p>The type of private DNS. Valid values:</p>
             * <ul>
             * <li><p><strong>PrivateZone</strong></p>
             * </li>
             * <li><p><strong>Custom</strong> (default)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder privateDnsType(String privateDnsType) {
                this.privateDnsType = privateDnsType;
                return this;
            }

            /**
             * <p>The ID of the region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The standby DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.2</p>
             */
            public Builder standbyDns(String standbyDns) {
                this.standbyDns = standbyDns;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li><p><strong>creating</strong>: The instance is being created.</p>
             * </li>
             * <li><p><strong>deleting</strong>: The instance is being deleted.</p>
             * </li>
             * <li><p><strong>normal</strong>: The instance is running as expected.</p>
             * </li>
             * <li><p><strong>updating</strong>: The instance is being updated.</p>
             * </li>
             * <li><p><strong>abnormal</strong>: The instance is in an abnormal state.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The unique ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zelphbaourpun****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AccessInstanceList build() {
                return new AccessInstanceList(this);
            } 

        } 

    }
}
