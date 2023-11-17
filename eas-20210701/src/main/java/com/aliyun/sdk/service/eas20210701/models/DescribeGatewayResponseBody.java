// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayResponseBody</p>
 */
public class DescribeGatewayResponseBody extends TeaModel {
    @NameInMap("CallerUid")
    private String callerUid;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("ExternalClusterId")
    private String externalClusterId;

    @NameInMap("GatewayId")
    private String gatewayId;

    @NameInMap("GatewayName")
    private String gatewayName;

    @NameInMap("InstanceType")
    private String instanceType;

    @NameInMap("InternetAclPolicyList")
    private java.util.List < InternetAclPolicyList> internetAclPolicyList;

    @NameInMap("InternetDomain")
    private String internetDomain;

    @NameInMap("InternetEnabled")
    private Boolean internetEnabled;

    @NameInMap("IntranetDomain")
    private String intranetDomain;

    @NameInMap("IntranetEnabled")
    private Boolean intranetEnabled;

    @NameInMap("IntranetLinkedVpcList")
    private java.util.List < IntranetLinkedVpcList> intranetLinkedVpcList;

    @NameInMap("ParentUid")
    private String parentUid;

    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    private DescribeGatewayResponseBody(Builder builder) {
        this.callerUid = builder.callerUid;
        this.createTime = builder.createTime;
        this.externalClusterId = builder.externalClusterId;
        this.gatewayId = builder.gatewayId;
        this.gatewayName = builder.gatewayName;
        this.instanceType = builder.instanceType;
        this.internetAclPolicyList = builder.internetAclPolicyList;
        this.internetDomain = builder.internetDomain;
        this.internetEnabled = builder.internetEnabled;
        this.intranetDomain = builder.intranetDomain;
        this.intranetEnabled = builder.intranetEnabled;
        this.intranetLinkedVpcList = builder.intranetLinkedVpcList;
        this.parentUid = builder.parentUid;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return callerUid
     */
    public String getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return externalClusterId
     */
    public String getExternalClusterId() {
        return this.externalClusterId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayName
     */
    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetAclPolicyList
     */
    public java.util.List < InternetAclPolicyList> getInternetAclPolicyList() {
        return this.internetAclPolicyList;
    }

    /**
     * @return internetDomain
     */
    public String getInternetDomain() {
        return this.internetDomain;
    }

    /**
     * @return internetEnabled
     */
    public Boolean getInternetEnabled() {
        return this.internetEnabled;
    }

    /**
     * @return intranetDomain
     */
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    /**
     * @return intranetEnabled
     */
    public Boolean getIntranetEnabled() {
        return this.intranetEnabled;
    }

    /**
     * @return intranetLinkedVpcList
     */
    public java.util.List < IntranetLinkedVpcList> getIntranetLinkedVpcList() {
        return this.intranetLinkedVpcList;
    }

    /**
     * @return parentUid
     */
    public String getParentUid() {
        return this.parentUid;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String callerUid; 
        private String createTime; 
        private String externalClusterId; 
        private String gatewayId; 
        private String gatewayName; 
        private String instanceType; 
        private java.util.List < InternetAclPolicyList> internetAclPolicyList; 
        private String internetDomain; 
        private Boolean internetEnabled; 
        private String intranetDomain; 
        private Boolean intranetEnabled; 
        private java.util.List < IntranetLinkedVpcList> intranetLinkedVpcList; 
        private String parentUid; 
        private String region; 
        private String requestId; 
        private String status; 
        private String updateTime; 

        /**
         * CallerUid.
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * 网关创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExternalClusterId.
         */
        public Builder externalClusterId(String externalClusterId) {
            this.externalClusterId = externalClusterId;
            return this;
        }

        /**
         * 网关ID
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * GatewayName.
         */
        public Builder gatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        /**
         * 网关创建的实例种类
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * InternetAclPolicyList.
         */
        public Builder internetAclPolicyList(java.util.List < InternetAclPolicyList> internetAclPolicyList) {
            this.internetAclPolicyList = internetAclPolicyList;
            return this;
        }

        /**
         * 网关内部域名
         */
        public Builder internetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }

        /**
         * InternetEnabled.
         */
        public Builder internetEnabled(Boolean internetEnabled) {
            this.internetEnabled = internetEnabled;
            return this;
        }

        /**
         * 网关外部域名
         */
        public Builder intranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }

        /**
         * IntranetEnabled.
         */
        public Builder intranetEnabled(Boolean intranetEnabled) {
            this.intranetEnabled = intranetEnabled;
            return this;
        }

        /**
         * IntranetLinkedVpcList.
         */
        public Builder intranetLinkedVpcList(java.util.List < IntranetLinkedVpcList> intranetLinkedVpcList) {
            this.intranetLinkedVpcList = intranetLinkedVpcList;
            return this;
        }

        /**
         * 创建网关的用户ID
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * 网关所在地域
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 网关现在的状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 网关最后一次的更新时间
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DescribeGatewayResponseBody build() {
            return new DescribeGatewayResponseBody(this);
        } 

    } 

    public static class InternetAclPolicyList extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Entry")
        private String entry;

        @NameInMap("Status")
        private String status;

        private InternetAclPolicyList(Builder builder) {
            this.comment = builder.comment;
            this.entry = builder.entry;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetAclPolicyList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String comment; 
            private String entry; 
            private String status; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Entry.
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            /**
             * 网关现在的状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InternetAclPolicyList build() {
                return new InternetAclPolicyList(this);
            } 

        } 

    }
    public static class IntranetLinkedVpcList extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private IntranetLinkedVpcList(Builder builder) {
            this.ip = builder.ip;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntranetLinkedVpcList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String ip; 
            private String securityGroupId; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * 网关现在的状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public IntranetLinkedVpcList build() {
                return new IntranetLinkedVpcList(this);
            } 

        } 

    }
}
