// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeInstanceClusterInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceClusterInfoResponseBody</p>
 */
public class DescribeInstanceClusterInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("InstanceClusterAttribute")
    private InstanceClusterAttribute instanceClusterAttribute;

    @com.aliyun.core.annotation.NameInMap("InstanceClusterId")
    private String instanceClusterId;

    @com.aliyun.core.annotation.NameInMap("InstanceClusterName")
    private String instanceClusterName;

    @com.aliyun.core.annotation.NameInMap("InstanceClusterStatus")
    private String instanceClusterStatus;

    @com.aliyun.core.annotation.NameInMap("InstanceClusterType")
    private String instanceClusterType;

    @com.aliyun.core.annotation.NameInMap("InstanceClusterVersion")
    private String instanceClusterVersion;

    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private InstanceList instanceList;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceClusterInfoResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.instanceClusterAttribute = builder.instanceClusterAttribute;
        this.instanceClusterId = builder.instanceClusterId;
        this.instanceClusterName = builder.instanceClusterName;
        this.instanceClusterStatus = builder.instanceClusterStatus;
        this.instanceClusterType = builder.instanceClusterType;
        this.instanceClusterVersion = builder.instanceClusterVersion;
        this.instanceList = builder.instanceList;
        this.modifiedTime = builder.modifiedTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceClusterInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceClusterAttribute
     */
    public InstanceClusterAttribute getInstanceClusterAttribute() {
        return this.instanceClusterAttribute;
    }

    /**
     * @return instanceClusterId
     */
    public String getInstanceClusterId() {
        return this.instanceClusterId;
    }

    /**
     * @return instanceClusterName
     */
    public String getInstanceClusterName() {
        return this.instanceClusterName;
    }

    /**
     * @return instanceClusterStatus
     */
    public String getInstanceClusterStatus() {
        return this.instanceClusterStatus;
    }

    /**
     * @return instanceClusterType
     */
    public String getInstanceClusterType() {
        return this.instanceClusterType;
    }

    /**
     * @return instanceClusterVersion
     */
    public String getInstanceClusterVersion() {
        return this.instanceClusterVersion;
    }

    /**
     * @return instanceList
     */
    public InstanceList getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private InstanceClusterAttribute instanceClusterAttribute; 
        private String instanceClusterId; 
        private String instanceClusterName; 
        private String instanceClusterStatus; 
        private String instanceClusterType; 
        private String instanceClusterVersion; 
        private InstanceList instanceList; 
        private String modifiedTime; 
        private String regionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceClusterInfoResponseBody model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.instanceClusterAttribute = model.instanceClusterAttribute;
            this.instanceClusterId = model.instanceClusterId;
            this.instanceClusterName = model.instanceClusterName;
            this.instanceClusterStatus = model.instanceClusterStatus;
            this.instanceClusterType = model.instanceClusterType;
            this.instanceClusterVersion = model.instanceClusterVersion;
            this.instanceList = model.instanceList;
            this.modifiedTime = model.modifiedTime;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-10T18:29:27</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The cluster description, which can be up to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.0.4</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The cluster details.</p>
         */
        public Builder instanceClusterAttribute(InstanceClusterAttribute instanceClusterAttribute) {
            this.instanceClusterAttribute = instanceClusterAttribute;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway-ht-04e41d95e9c1</p>
         */
        public Builder instanceClusterId(String instanceClusterId) {
            this.instanceClusterId = instanceClusterId;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceClusterName(String instanceClusterName) {
            this.instanceClusterName = instanceClusterName;
            return this;
        }

        /**
         * <p>The cluster status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder instanceClusterStatus(String instanceClusterStatus) {
            this.instanceClusterStatus = instanceClusterStatus;
            return this;
        }

        /**
         * <p>The cluster type.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder instanceClusterType(String instanceClusterType) {
            this.instanceClusterType = instanceClusterType;
            return this;
        }

        /**
         * <p>The cluster version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3.856</p>
         */
        public Builder instanceClusterVersion(String instanceClusterVersion) {
            this.instanceClusterVersion = instanceClusterVersion;
            return this;
        }

        /**
         * <p>The dedicated instances contained in the cluster.</p>
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The time when the cluster was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-19 10:40:29 +0800</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceClusterInfoResponseBody build() {
            return new DescribeInstanceClusterInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceClusterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceClusterInfoResponseBody</p>
     */
    public static class InstanceClusterAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectCidrBlocks")
        private String connectCidrBlocks;

        @com.aliyun.core.annotation.NameInMap("ConnectVpcId")
        private String connectVpcId;

        @com.aliyun.core.annotation.NameInMap("EgressIpv6Enable")
        private Boolean egressIpv6Enable;

        @com.aliyun.core.annotation.NameInMap("HttpsPolicies")
        private String httpsPolicies;

        @com.aliyun.core.annotation.NameInMap("IPV4AclId")
        private String IPV4AclId;

        @com.aliyun.core.annotation.NameInMap("IPV4AclName")
        private String IPV4AclName;

        @com.aliyun.core.annotation.NameInMap("IPV4AclStatus")
        private String IPV4AclStatus;

        @com.aliyun.core.annotation.NameInMap("IPV4AclType")
        private String IPV4AclType;

        @com.aliyun.core.annotation.NameInMap("IPV6AclId")
        private String IPV6AclId;

        @com.aliyun.core.annotation.NameInMap("IPV6AclName")
        private String IPV6AclName;

        @com.aliyun.core.annotation.NameInMap("IPV6AclStatus")
        private String IPV6AclStatus;

        @com.aliyun.core.annotation.NameInMap("IPV6AclType")
        private String IPV6AclType;

        @com.aliyun.core.annotation.NameInMap("InternetEgressAddress")
        private String internetEgressAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetEgressAddress")
        private String intranetEgressAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetSegments")
        private String intranetSegments;

        @com.aliyun.core.annotation.NameInMap("SupportIpv6")
        private Boolean supportIpv6;

        @com.aliyun.core.annotation.NameInMap("UserVpcId")
        private String userVpcId;

        @com.aliyun.core.annotation.NameInMap("UserVswitchId")
        private String userVswitchId;

        @com.aliyun.core.annotation.NameInMap("VipTypeList")
        private String vipTypeList;

        @com.aliyun.core.annotation.NameInMap("VpcIntranetEnable")
        private Boolean vpcIntranetEnable;

        @com.aliyun.core.annotation.NameInMap("VpcOwnerId")
        private Long vpcOwnerId;

        @com.aliyun.core.annotation.NameInMap("VpcSlbIntranetEnable")
        private Boolean vpcSlbIntranetEnable;

        private InstanceClusterAttribute(Builder builder) {
            this.connectCidrBlocks = builder.connectCidrBlocks;
            this.connectVpcId = builder.connectVpcId;
            this.egressIpv6Enable = builder.egressIpv6Enable;
            this.httpsPolicies = builder.httpsPolicies;
            this.IPV4AclId = builder.IPV4AclId;
            this.IPV4AclName = builder.IPV4AclName;
            this.IPV4AclStatus = builder.IPV4AclStatus;
            this.IPV4AclType = builder.IPV4AclType;
            this.IPV6AclId = builder.IPV6AclId;
            this.IPV6AclName = builder.IPV6AclName;
            this.IPV6AclStatus = builder.IPV6AclStatus;
            this.IPV6AclType = builder.IPV6AclType;
            this.internetEgressAddress = builder.internetEgressAddress;
            this.intranetEgressAddress = builder.intranetEgressAddress;
            this.intranetSegments = builder.intranetSegments;
            this.supportIpv6 = builder.supportIpv6;
            this.userVpcId = builder.userVpcId;
            this.userVswitchId = builder.userVswitchId;
            this.vipTypeList = builder.vipTypeList;
            this.vpcIntranetEnable = builder.vpcIntranetEnable;
            this.vpcOwnerId = builder.vpcOwnerId;
            this.vpcSlbIntranetEnable = builder.vpcSlbIntranetEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceClusterAttribute create() {
            return builder().build();
        }

        /**
         * @return connectCidrBlocks
         */
        public String getConnectCidrBlocks() {
            return this.connectCidrBlocks;
        }

        /**
         * @return connectVpcId
         */
        public String getConnectVpcId() {
            return this.connectVpcId;
        }

        /**
         * @return egressIpv6Enable
         */
        public Boolean getEgressIpv6Enable() {
            return this.egressIpv6Enable;
        }

        /**
         * @return httpsPolicies
         */
        public String getHttpsPolicies() {
            return this.httpsPolicies;
        }

        /**
         * @return IPV4AclId
         */
        public String getIPV4AclId() {
            return this.IPV4AclId;
        }

        /**
         * @return IPV4AclName
         */
        public String getIPV4AclName() {
            return this.IPV4AclName;
        }

        /**
         * @return IPV4AclStatus
         */
        public String getIPV4AclStatus() {
            return this.IPV4AclStatus;
        }

        /**
         * @return IPV4AclType
         */
        public String getIPV4AclType() {
            return this.IPV4AclType;
        }

        /**
         * @return IPV6AclId
         */
        public String getIPV6AclId() {
            return this.IPV6AclId;
        }

        /**
         * @return IPV6AclName
         */
        public String getIPV6AclName() {
            return this.IPV6AclName;
        }

        /**
         * @return IPV6AclStatus
         */
        public String getIPV6AclStatus() {
            return this.IPV6AclStatus;
        }

        /**
         * @return IPV6AclType
         */
        public String getIPV6AclType() {
            return this.IPV6AclType;
        }

        /**
         * @return internetEgressAddress
         */
        public String getInternetEgressAddress() {
            return this.internetEgressAddress;
        }

        /**
         * @return intranetEgressAddress
         */
        public String getIntranetEgressAddress() {
            return this.intranetEgressAddress;
        }

        /**
         * @return intranetSegments
         */
        public String getIntranetSegments() {
            return this.intranetSegments;
        }

        /**
         * @return supportIpv6
         */
        public Boolean getSupportIpv6() {
            return this.supportIpv6;
        }

        /**
         * @return userVpcId
         */
        public String getUserVpcId() {
            return this.userVpcId;
        }

        /**
         * @return userVswitchId
         */
        public String getUserVswitchId() {
            return this.userVswitchId;
        }

        /**
         * @return vipTypeList
         */
        public String getVipTypeList() {
            return this.vipTypeList;
        }

        /**
         * @return vpcIntranetEnable
         */
        public Boolean getVpcIntranetEnable() {
            return this.vpcIntranetEnable;
        }

        /**
         * @return vpcOwnerId
         */
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        /**
         * @return vpcSlbIntranetEnable
         */
        public Boolean getVpcSlbIntranetEnable() {
            return this.vpcSlbIntranetEnable;
        }

        public static final class Builder {
            private String connectCidrBlocks; 
            private String connectVpcId; 
            private Boolean egressIpv6Enable; 
            private String httpsPolicies; 
            private String IPV4AclId; 
            private String IPV4AclName; 
            private String IPV4AclStatus; 
            private String IPV4AclType; 
            private String IPV6AclId; 
            private String IPV6AclName; 
            private String IPV6AclStatus; 
            private String IPV6AclType; 
            private String internetEgressAddress; 
            private String intranetEgressAddress; 
            private String intranetSegments; 
            private Boolean supportIpv6; 
            private String userVpcId; 
            private String userVswitchId; 
            private String vipTypeList; 
            private Boolean vpcIntranetEnable; 
            private Long vpcOwnerId; 
            private Boolean vpcSlbIntranetEnable; 

            private Builder() {
            } 

            private Builder(InstanceClusterAttribute model) {
                this.connectCidrBlocks = model.connectCidrBlocks;
                this.connectVpcId = model.connectVpcId;
                this.egressIpv6Enable = model.egressIpv6Enable;
                this.httpsPolicies = model.httpsPolicies;
                this.IPV4AclId = model.IPV4AclId;
                this.IPV4AclName = model.IPV4AclName;
                this.IPV4AclStatus = model.IPV4AclStatus;
                this.IPV4AclType = model.IPV4AclType;
                this.IPV6AclId = model.IPV6AclId;
                this.IPV6AclName = model.IPV6AclName;
                this.IPV6AclStatus = model.IPV6AclStatus;
                this.IPV6AclType = model.IPV6AclType;
                this.internetEgressAddress = model.internetEgressAddress;
                this.intranetEgressAddress = model.intranetEgressAddress;
                this.intranetSegments = model.intranetSegments;
                this.supportIpv6 = model.supportIpv6;
                this.userVpcId = model.userVpcId;
                this.userVswitchId = model.userVswitchId;
                this.vipTypeList = model.vipTypeList;
                this.vpcIntranetEnable = model.vpcIntranetEnable;
                this.vpcOwnerId = model.vpcOwnerId;
                this.vpcSlbIntranetEnable = model.vpcSlbIntranetEnable;
            } 

            /**
             * <p>The internal CIDR block of the user VPC that can be accessed by the cluster if the cluster consists of VPC integration instances.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;192.168.1.0/24&quot;,&quot;192.168.0.0/24&quot;]</p>
             */
            public Builder connectCidrBlocks(String connectCidrBlocks) {
                this.connectCidrBlocks = connectCidrBlocks;
                return this;
            }

            /**
             * <p>The ID of the user VPC that is connected to the cluster if the cluster consists of VPC integration instances.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-p0w3kxxxxxxxxxxxxxxxx</p>
             */
            public Builder connectVpcId(String connectVpcId) {
                this.connectVpcId = connectVpcId;
                return this;
            }

            /**
             * <p>Indicates whether outbound IPv6 traffic is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder egressIpv6Enable(Boolean egressIpv6Enable) {
                this.egressIpv6Enable = egressIpv6Enable;
                return this;
            }

            /**
             * <p>The HTTPS security policy.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS2_TLS1_0</p>
             */
            public Builder httpsPolicies(String httpsPolicies) {
                this.httpsPolicies = httpsPolicies;
                return this;
            }

            /**
             * <p>The ID of the IPv4 access control list (ACL).</p>
             * 
             * <strong>example:</strong>
             * <p>acl-t4n8i4rvvp70kcyuoXXXX</p>
             */
            public Builder IPV4AclId(String IPV4AclId) {
                this.IPV4AclId = IPV4AclId;
                return this;
            }

            /**
             * <p>The name of the IPv4 ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>test-black</p>
             */
            public Builder IPV4AclName(String IPV4AclName) {
                this.IPV4AclName = IPV4AclName;
                return this;
            }

            /**
             * <p>Indicates whether IPv4 access control is enabled. Valid values:</p>
             * <ul>
             * <li>on</li>
             * <li>off</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder IPV4AclStatus(String IPV4AclStatus) {
                this.IPV4AclStatus = IPV4AclStatus;
                return this;
            }

            /**
             * <p>The type of the IPv4 ACL.</p>
             * <ul>
             * <li>black: blacklist</li>
             * <li>white: whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>black</p>
             */
            public Builder IPV4AclType(String IPV4AclType) {
                this.IPV4AclType = IPV4AclType;
                return this;
            }

            /**
             * <p>The ID of the IPv6 ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-t4nevzhwbpe7cup18XXXX</p>
             */
            public Builder IPV6AclId(String IPV6AclId) {
                this.IPV6AclId = IPV6AclId;
                return this;
            }

            /**
             * <p>The name of the IPv6 ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder IPV6AclName(String IPV6AclName) {
                this.IPV6AclName = IPV6AclName;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 access control is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder IPV6AclStatus(String IPV6AclStatus) {
                this.IPV6AclStatus = IPV6AclStatus;
                return this;
            }

            /**
             * <p>The type of the IPv6 ACL. Valid values:</p>
             * <ul>
             * <li>black: blacklist</li>
             * <li>white: whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>white</p>
             */
            public Builder IPV6AclType(String IPV6AclType) {
                this.IPV6AclType = IPV6AclType;
                return this;
            }

            /**
             * <p>The outbound public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>39.106.XX.XX</p>
             */
            public Builder internetEgressAddress(String internetEgressAddress) {
                this.internetEgressAddress = internetEgressAddress;
                return this;
            }

            /**
             * <p>The outbound private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XX.XX/26</p>
             */
            public Builder intranetEgressAddress(String intranetEgressAddress) {
                this.intranetEgressAddress = intranetEgressAddress;
                return this;
            }

            /**
             * <p>The custom CIDR block. The configured CIDR block is considered as a private block.</p>
             * 
             * <strong>example:</strong>
             * <p>123.0.0.1</p>
             */
            public Builder intranetSegments(String intranetSegments) {
                this.intranetSegments = intranetSegments;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 traffic is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportIpv6(Boolean supportIpv6) {
                this.supportIpv6 = supportIpv6;
                return this;
            }

            /**
             * <p>The ID of the client VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zew2v4vcg78mXXXX</p>
             */
            public Builder userVpcId(String userVpcId) {
                this.userVpcId = userVpcId;
                return this;
            }

            /**
             * <p>The vSwitch of the client VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zecr5r7ao44tslsXXXX</p>
             */
            public Builder userVswitchId(String userVswitchId) {
                this.userVswitchId = userVswitchId;
                return this;
            }

            /**
             * <p>The VIPs of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC_INTERNET_IPV6</p>
             */
            public Builder vipTypeList(String vipTypeList) {
                this.vipTypeList = vipTypeList;
                return this;
            }

            /**
             * <p>Indicates whether a virtual private cloud (VPC) domain name is enabled.</p>
             */
            public Builder vpcIntranetEnable(Boolean vpcIntranetEnable) {
                this.vpcIntranetEnable = vpcIntranetEnable;
                return this;
            }

            /**
             * <p>The ID of the account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>165438596694XXXX</p>
             */
            public Builder vpcOwnerId(Long vpcOwnerId) {
                this.vpcOwnerId = vpcOwnerId;
                return this;
            }

            /**
             * <p>Indicates whether self-calling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder vpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
                this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
                return this;
            }

            public InstanceClusterAttribute build() {
                return new InstanceClusterAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceClusterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceClusterInfoResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Instance(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String instanceId; 
            private String instanceName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.errorMessage = model.errorMessage;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned if the call fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance not found.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>apigateway-ht-04e41d95e9c1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>tf-testacceu-central-1apigatewayinstance8752</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceClusterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceClusterInfoResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

        private InstanceList(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.instance = model.instance;
            } 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
