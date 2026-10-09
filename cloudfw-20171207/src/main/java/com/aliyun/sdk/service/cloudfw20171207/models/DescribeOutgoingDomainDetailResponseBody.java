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
 * {@link DescribeOutgoingDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingDomainDetailResponseBody</p>
 */
public class DescribeOutgoingDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
    private java.util.List<String> applicationNameList;

    @com.aliyun.core.annotation.NameInMap("AssetList")
    private java.util.List<AssetList> assetList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOutgoingDomainDetailResponseBody(Builder builder) {
        this.applicationNameList = builder.applicationNameList;
        this.assetList = builder.assetList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDomainDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationNameList
     */
    public java.util.List<String> getApplicationNameList() {
        return this.applicationNameList;
    }

    /**
     * @return assetList
     */
    public java.util.List<AssetList> getAssetList() {
        return this.assetList;
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

    public static final class Builder {
        private java.util.List<String> applicationNameList; 
        private java.util.List<AssetList> assetList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingDomainDetailResponseBody model) {
            this.applicationNameList = model.applicationNameList;
            this.assetList = model.assetList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of application names.</p>
         */
        public Builder applicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }

        /**
         * <p>The list of assets.</p>
         */
        public Builder assetList(java.util.List<AssetList> assetList) {
            this.assetList = assetList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98AF5888-9606-59CF-888F-032A9ED0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOutgoingDomainDetailResponseBody build() {
            return new DescribeOutgoingDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOutgoingDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDomainDetailResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassId")
        private String classId;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("TagDescribe")
        private String tagDescribe;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagList(Builder builder) {
            this.classId = builder.classId;
            this.riskLevel = builder.riskLevel;
            this.tagDescribe = builder.tagDescribe;
            this.tagId = builder.tagId;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return classId
         */
        public String getClassId() {
            return this.classId;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return tagDescribe
         */
        public String getTagDescribe() {
            return this.tagDescribe;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String classId; 
            private Integer riskLevel; 
            private String tagDescribe; 
            private String tagId; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagList model) {
                this.classId = model.classId;
                this.riskLevel = model.riskLevel;
                this.tagDescribe = model.tagDescribe;
                this.tagId = model.tagId;
                this.tagName = model.tagName;
            } 

            /**
             * <p>The risk classification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder classId(String classId) {
                this.classId = classId;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The tag description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagDescribe(String tagDescribe) {
                this.tagDescribe = tagDescribe;
                return this;
            }

            /**
             * <p>The tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>FirstFlow</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOutgoingDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDomainDetailResponseBody</p>
     */
    public static class AssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclCoverage")
        private String aclCoverage;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Integer firstTime;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("IpsHitCnt")
        private Long ipsHitCnt;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Integer lastTime;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("PrivateIP")
        private String privateIP;

        @com.aliyun.core.annotation.NameInMap("PublicIP")
        private String publicIP;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private String totalBytes;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AssetList(Builder builder) {
            this.aclCoverage = builder.aclCoverage;
            this.domain = builder.domain;
            this.firstTime = builder.firstTime;
            this.inBytes = builder.inBytes;
            this.ipsHitCnt = builder.ipsHitCnt;
            this.lastTime = builder.lastTime;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
            this.outBytes = builder.outBytes;
            this.privateIP = builder.privateIP;
            this.publicIP = builder.publicIP;
            this.regionNo = builder.regionNo;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceInstanceName = builder.resourceInstanceName;
            this.resourceType = builder.resourceType;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.sessionCount = builder.sessionCount;
            this.tagList = builder.tagList;
            this.totalBytes = builder.totalBytes;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetList create() {
            return builder().build();
        }

        /**
         * @return aclCoverage
         */
        public String getAclCoverage() {
            return this.aclCoverage;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return firstTime
         */
        public Integer getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return ipsHitCnt
         */
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
        }

        /**
         * @return lastTime
         */
        public Integer getLastTime() {
            return this.lastTime;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natGatewayName
         */
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return privateIP
         */
        public String getPrivateIP() {
            return this.privateIP;
        }

        /**
         * @return publicIP
         */
        public String getPublicIP() {
            return this.publicIP;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceInstanceName
         */
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return tagList
         */
        public java.util.List<TagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return totalBytes
         */
        public String getTotalBytes() {
            return this.totalBytes;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String aclCoverage; 
            private String domain; 
            private Integer firstTime; 
            private Long inBytes; 
            private Long ipsHitCnt; 
            private Integer lastTime; 
            private String natGatewayId; 
            private String natGatewayName; 
            private Long outBytes; 
            private String privateIP; 
            private String publicIP; 
            private String regionNo; 
            private String resourceInstanceId; 
            private String resourceInstanceName; 
            private String resourceType; 
            private String ruleId; 
            private String ruleName; 
            private Long sessionCount; 
            private java.util.List<TagList> tagList; 
            private String totalBytes; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(AssetList model) {
                this.aclCoverage = model.aclCoverage;
                this.domain = model.domain;
                this.firstTime = model.firstTime;
                this.inBytes = model.inBytes;
                this.ipsHitCnt = model.ipsHitCnt;
                this.lastTime = model.lastTime;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayName = model.natGatewayName;
                this.outBytes = model.outBytes;
                this.privateIP = model.privateIP;
                this.publicIP = model.publicIP;
                this.regionNo = model.regionNo;
                this.resourceInstanceId = model.resourceInstanceId;
                this.resourceInstanceName = model.resourceInstanceName;
                this.resourceType = model.resourceType;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.sessionCount = model.sessionCount;
                this.tagList = model.tagList;
                this.totalBytes = model.totalBytes;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The policy coverage status.</p>
             * 
             * <strong>example:</strong>
             * <p>FullCoverage</p>
             */
            public Builder aclCoverage(String aclCoverage) {
                this.aclCoverage = aclCoverage;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The time of the first access. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1738548990</p>
             */
            public Builder firstTime(Integer firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The inbound traffic (response traffic), in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>244438.0</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The number of IPS hits.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder ipsHitCnt(Long ipsHitCnt) {
                this.ipsHitCnt = ipsHitCnt;
                return this;
            }

            /**
             * <p>The time of the most recent access. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1739326614</p>
             */
            public Builder lastTime(Integer lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The NAT gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-bp1utx6wj4x9qu9tl****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The NAT gateway name.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-test</p>
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * <p>The outbound traffic (request traffic), in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.21.242XXX</p>
             */
            public Builder privateIP(String privateIP) {
                this.privateIP = privateIP;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.96.181.XXX</p>
             */
            public Builder publicIP(String publicIP) {
                this.publicIP = publicIP;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The ID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf63wjhyoohc1g4z****</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * <p>The public IP address type of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>NatEIP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ACL rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>08a58465-ff4d-4c47-8782-eb008301****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The number of access sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The list of tag names.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The total traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>321120825843</p>
             */
            public Builder totalBytes(String totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * <p>The VPC instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-9dp16jgwgyvn****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AssetList build() {
                return new AssetList(this);
            } 

        } 

    }
}
