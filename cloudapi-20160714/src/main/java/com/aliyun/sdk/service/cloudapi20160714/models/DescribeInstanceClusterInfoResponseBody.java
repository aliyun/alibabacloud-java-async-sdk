// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * InstanceClusterAttribute.
         */
        public Builder instanceClusterAttribute(InstanceClusterAttribute instanceClusterAttribute) {
            this.instanceClusterAttribute = instanceClusterAttribute;
            return this;
        }

        /**
         * InstanceClusterId.
         */
        public Builder instanceClusterId(String instanceClusterId) {
            this.instanceClusterId = instanceClusterId;
            return this;
        }

        /**
         * InstanceClusterName.
         */
        public Builder instanceClusterName(String instanceClusterName) {
            this.instanceClusterName = instanceClusterName;
            return this;
        }

        /**
         * InstanceClusterStatus.
         */
        public Builder instanceClusterStatus(String instanceClusterStatus) {
            this.instanceClusterStatus = instanceClusterStatus;
            return this;
        }

        /**
         * InstanceClusterType.
         */
        public Builder instanceClusterType(String instanceClusterType) {
            this.instanceClusterType = instanceClusterType;
            return this;
        }

        /**
         * InstanceClusterVersion.
         */
        public Builder instanceClusterVersion(String instanceClusterVersion) {
            this.instanceClusterVersion = instanceClusterVersion;
            return this;
        }

        /**
         * InstanceList.
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceClusterInfoResponseBody build() {
            return new DescribeInstanceClusterInfoResponseBody(this);
        } 

    } 

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

            /**
             * ConnectCidrBlocks.
             */
            public Builder connectCidrBlocks(String connectCidrBlocks) {
                this.connectCidrBlocks = connectCidrBlocks;
                return this;
            }

            /**
             * ConnectVpcId.
             */
            public Builder connectVpcId(String connectVpcId) {
                this.connectVpcId = connectVpcId;
                return this;
            }

            /**
             * EgressIpv6Enable.
             */
            public Builder egressIpv6Enable(Boolean egressIpv6Enable) {
                this.egressIpv6Enable = egressIpv6Enable;
                return this;
            }

            /**
             * HttpsPolicies.
             */
            public Builder httpsPolicies(String httpsPolicies) {
                this.httpsPolicies = httpsPolicies;
                return this;
            }

            /**
             * IPV4AclId.
             */
            public Builder IPV4AclId(String IPV4AclId) {
                this.IPV4AclId = IPV4AclId;
                return this;
            }

            /**
             * IPV4AclName.
             */
            public Builder IPV4AclName(String IPV4AclName) {
                this.IPV4AclName = IPV4AclName;
                return this;
            }

            /**
             * IPV4AclStatus.
             */
            public Builder IPV4AclStatus(String IPV4AclStatus) {
                this.IPV4AclStatus = IPV4AclStatus;
                return this;
            }

            /**
             * IPV4AclType.
             */
            public Builder IPV4AclType(String IPV4AclType) {
                this.IPV4AclType = IPV4AclType;
                return this;
            }

            /**
             * IPV6AclId.
             */
            public Builder IPV6AclId(String IPV6AclId) {
                this.IPV6AclId = IPV6AclId;
                return this;
            }

            /**
             * IPV6AclName.
             */
            public Builder IPV6AclName(String IPV6AclName) {
                this.IPV6AclName = IPV6AclName;
                return this;
            }

            /**
             * IPV6AclStatus.
             */
            public Builder IPV6AclStatus(String IPV6AclStatus) {
                this.IPV6AclStatus = IPV6AclStatus;
                return this;
            }

            /**
             * IPV6AclType.
             */
            public Builder IPV6AclType(String IPV6AclType) {
                this.IPV6AclType = IPV6AclType;
                return this;
            }

            /**
             * InternetEgressAddress.
             */
            public Builder internetEgressAddress(String internetEgressAddress) {
                this.internetEgressAddress = internetEgressAddress;
                return this;
            }

            /**
             * IntranetEgressAddress.
             */
            public Builder intranetEgressAddress(String intranetEgressAddress) {
                this.intranetEgressAddress = intranetEgressAddress;
                return this;
            }

            /**
             * IntranetSegments.
             */
            public Builder intranetSegments(String intranetSegments) {
                this.intranetSegments = intranetSegments;
                return this;
            }

            /**
             * SupportIpv6.
             */
            public Builder supportIpv6(Boolean supportIpv6) {
                this.supportIpv6 = supportIpv6;
                return this;
            }

            /**
             * UserVpcId.
             */
            public Builder userVpcId(String userVpcId) {
                this.userVpcId = userVpcId;
                return this;
            }

            /**
             * UserVswitchId.
             */
            public Builder userVswitchId(String userVswitchId) {
                this.userVswitchId = userVswitchId;
                return this;
            }

            /**
             * VipTypeList.
             */
            public Builder vipTypeList(String vipTypeList) {
                this.vipTypeList = vipTypeList;
                return this;
            }

            /**
             * VpcIntranetEnable.
             */
            public Builder vpcIntranetEnable(Boolean vpcIntranetEnable) {
                this.vpcIntranetEnable = vpcIntranetEnable;
                return this;
            }

            /**
             * VpcOwnerId.
             */
            public Builder vpcOwnerId(Long vpcOwnerId) {
                this.vpcOwnerId = vpcOwnerId;
                return this;
            }

            /**
             * VpcSlbIntranetEnable.
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

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Status.
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
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List < Instance> instance;

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
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
