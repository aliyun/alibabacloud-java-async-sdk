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
 * {@link DescribeOutgoingDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingDomainResponseBody</p>
 */
public class DescribeOutgoingDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainList")
    private java.util.List<DomainList> domainList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOutgoingDomainResponseBody(Builder builder) {
        this.domainList = builder.domainList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainList
     */
    public java.util.List<DomainList> getDomainList() {
        return this.domainList;
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
        private java.util.List<DomainList> domainList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingDomainResponseBody model) {
            this.domainList = model.domainList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The domain names in outbound connections.</p>
         */
        public Builder domainList(java.util.List<DomainList> domainList) {
            this.domainList = domainList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the domain names in outbound connections.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOutgoingDomainResponseBody build() {
            return new DescribeOutgoingDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOutgoingDomainResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDomainResponseBody</p>
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
             * <p>The type of the tag. Valid values:</p>
             * <ul>
             * <li><strong>Suspicious</strong></li>
             * <li><strong>Malicious</strong></li>
             * <li><strong>Trusted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Trusted</p>
             */
            public Builder classId(String classId) {
                this.classId = classId;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: low</li>
             * <li><strong>2</strong>: medium</li>
             * <li><strong>3</strong>: high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The description of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Tag indicating that the domain name is added to the whitelist</p>
             */
            public Builder tagDescribe(String tagDescribe) {
                this.tagDescribe = tagDescribe;
                return this;
            }

            /**
             * <p>The ID of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>AliYun</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The name of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Tag indicating that the domain name is added to the whitelist</p>
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
     * {@link DescribeOutgoingDomainResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDomainResponseBody</p>
     */
    public static class DomainList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclCoverage")
        private String aclCoverage;

        @com.aliyun.core.annotation.NameInMap("AclRecommendDetail")
        private String aclRecommendDetail;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private String aclStatus;

        @com.aliyun.core.annotation.NameInMap("AddressGroupName")
        private String addressGroupName;

        @com.aliyun.core.annotation.NameInMap("AddressGroupUUID")
        private String addressGroupUUID;

        @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
        private java.util.List<String> applicationNameList;

        @com.aliyun.core.annotation.NameInMap("AssetCount")
        private Long assetCount;

        @com.aliyun.core.annotation.NameInMap("Business")
        private String business;

        @com.aliyun.core.annotation.NameInMap("CategoryClassId")
        private String categoryClassId;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HasAcl")
        private String hasAcl;

        @com.aliyun.core.annotation.NameInMap("HasAclRecommend")
        private Boolean hasAclRecommend;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("IsMarkNormal")
        private Boolean isMarkNormal;

        @com.aliyun.core.annotation.NameInMap("Organization")
        private String organization;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("PrivateAssetCount")
        private Long privateAssetCount;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SecurityReason")
        private String securityReason;

        @com.aliyun.core.annotation.NameInMap("SecuritySuggest")
        private String securitySuggest;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private String totalBytes;

        private DomainList(Builder builder) {
            this.aclCoverage = builder.aclCoverage;
            this.aclRecommendDetail = builder.aclRecommendDetail;
            this.aclStatus = builder.aclStatus;
            this.addressGroupName = builder.addressGroupName;
            this.addressGroupUUID = builder.addressGroupUUID;
            this.applicationNameList = builder.applicationNameList;
            this.assetCount = builder.assetCount;
            this.business = builder.business;
            this.categoryClassId = builder.categoryClassId;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.domain = builder.domain;
            this.groupName = builder.groupName;
            this.hasAcl = builder.hasAcl;
            this.hasAclRecommend = builder.hasAclRecommend;
            this.inBytes = builder.inBytes;
            this.isMarkNormal = builder.isMarkNormal;
            this.organization = builder.organization;
            this.outBytes = builder.outBytes;
            this.privateAssetCount = builder.privateAssetCount;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.securityReason = builder.securityReason;
            this.securitySuggest = builder.securitySuggest;
            this.sessionCount = builder.sessionCount;
            this.tagList = builder.tagList;
            this.totalBytes = builder.totalBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainList create() {
            return builder().build();
        }

        /**
         * @return aclCoverage
         */
        public String getAclCoverage() {
            return this.aclCoverage;
        }

        /**
         * @return aclRecommendDetail
         */
        public String getAclRecommendDetail() {
            return this.aclRecommendDetail;
        }

        /**
         * @return aclStatus
         */
        public String getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return addressGroupName
         */
        public String getAddressGroupName() {
            return this.addressGroupName;
        }

        /**
         * @return addressGroupUUID
         */
        public String getAddressGroupUUID() {
            return this.addressGroupUUID;
        }

        /**
         * @return applicationNameList
         */
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        /**
         * @return assetCount
         */
        public Long getAssetCount() {
            return this.assetCount;
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return categoryClassId
         */
        public String getCategoryClassId() {
            return this.categoryClassId;
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return hasAcl
         */
        public String getHasAcl() {
            return this.hasAcl;
        }

        /**
         * @return hasAclRecommend
         */
        public Boolean getHasAclRecommend() {
            return this.hasAclRecommend;
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return isMarkNormal
         */
        public Boolean getIsMarkNormal() {
            return this.isMarkNormal;
        }

        /**
         * @return organization
         */
        public String getOrganization() {
            return this.organization;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return privateAssetCount
         */
        public Long getPrivateAssetCount() {
            return this.privateAssetCount;
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
         * @return securityReason
         */
        public String getSecurityReason() {
            return this.securityReason;
        }

        /**
         * @return securitySuggest
         */
        public String getSecuritySuggest() {
            return this.securitySuggest;
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

        public static final class Builder {
            private String aclCoverage; 
            private String aclRecommendDetail; 
            private String aclStatus; 
            private String addressGroupName; 
            private String addressGroupUUID; 
            private java.util.List<String> applicationNameList; 
            private Long assetCount; 
            private String business; 
            private String categoryClassId; 
            private String categoryId; 
            private String categoryName; 
            private String domain; 
            private String groupName; 
            private String hasAcl; 
            private Boolean hasAclRecommend; 
            private Long inBytes; 
            private Boolean isMarkNormal; 
            private String organization; 
            private Long outBytes; 
            private Long privateAssetCount; 
            private String ruleId; 
            private String ruleName; 
            private String securityReason; 
            private String securitySuggest; 
            private Long sessionCount; 
            private java.util.List<TagList> tagList; 
            private String totalBytes; 

            private Builder() {
            } 

            private Builder(DomainList model) {
                this.aclCoverage = model.aclCoverage;
                this.aclRecommendDetail = model.aclRecommendDetail;
                this.aclStatus = model.aclStatus;
                this.addressGroupName = model.addressGroupName;
                this.addressGroupUUID = model.addressGroupUUID;
                this.applicationNameList = model.applicationNameList;
                this.assetCount = model.assetCount;
                this.business = model.business;
                this.categoryClassId = model.categoryClassId;
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.domain = model.domain;
                this.groupName = model.groupName;
                this.hasAcl = model.hasAcl;
                this.hasAclRecommend = model.hasAclRecommend;
                this.inBytes = model.inBytes;
                this.isMarkNormal = model.isMarkNormal;
                this.organization = model.organization;
                this.outBytes = model.outBytes;
                this.privateAssetCount = model.privateAssetCount;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.securityReason = model.securityReason;
                this.securitySuggest = model.securitySuggest;
                this.sessionCount = model.sessionCount;
                this.tagList = model.tagList;
                this.totalBytes = model.totalBytes;
            } 

            /**
             * <p>Indicates whether an access control policy is configured. Valid values:</p>
             * <ul>
             * <li><strong>Uncovered</strong>: no</li>
             * <li><strong>FullCoverage</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Uncovered</p>
             */
            public Builder aclCoverage(String aclCoverage) {
                this.aclCoverage = aclCoverage;
                return this;
            }

            /**
             * <p>The suggestion in an access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Allows the traffic.</p>
             */
            public Builder aclRecommendDetail(String aclRecommendDetail) {
                this.aclRecommendDetail = aclRecommendDetail;
                return this;
            }

            /**
             * <p>The state of the access control policy. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: healthy</li>
             * <li><strong>abnormal</strong>: unhealthy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * <p>The name of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>The address book for outbound connections</p>
             */
            public Builder addressGroupName(String addressGroupName) {
                this.addressGroupName = addressGroupName;
                return this;
            }

            /**
             * <p>The UUID of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>fdad-fdafa-dafa-dfa****</p>
             */
            public Builder addressGroupUUID(String addressGroupUUID) {
                this.addressGroupUUID = addressGroupUUID;
                return this;
            }

            /**
             * <p>The application names.</p>
             */
            public Builder applicationNameList(java.util.List<String> applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * <p>The outbound asset count.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder assetCount(Long assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * <p>The website service.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud</p>
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * <p>The type of the tag. Valid values:</p>
             * <ul>
             * <li><strong>Suspicious</strong></li>
             * <li><strong>Malicious</strong></li>
             * <li><strong>Trusted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Trusted</p>
             */
            public Builder categoryClassId(String categoryClassId) {
                this.categoryClassId = categoryClassId;
                return this;
            }

            /**
             * <p>The type ID of the service to which the domain name belongs. Valid values:</p>
             * <ul>
             * <li><strong>Aliyun</strong>: Alibaba Cloud services</li>
             * <li><strong>NotAliyun</strong>: third-party services</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The type of the service to which the domain name belongs. Valid values:</p>
             * <ul>
             * <li><strong>Alibaba Cloud services</strong></li>
             * <li><strong>Third-party services</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud services</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The domain name in outbound connections.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The name of the group to which the access control policy belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Group of addresses in outbound connections</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Indicates whether an <code>access control policy</code> is configured for the domain name. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasAcl(String hasAcl) {
                this.hasAcl = hasAcl;
                return this;
            }

            /**
             * <p>Indicates whether an access control policy is recommended. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasAclRecommend(Boolean hasAclRecommend) {
                this.hasAclRecommend = hasAclRecommend;
                return this;
            }

            /**
             * <p>The volume of inbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>3214</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is marked as normal. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: normal</li>
             * <li><strong>false</strong>: abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isMarkNormal(Boolean isMarkNormal) {
                this.isMarkNormal = isMarkNormal;
                return this;
            }

            /**
             * <p>The name of the organization.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Computing Co., Ltd.</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * <p>The volume of outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>4582</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The outbound private asset count.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder privateAssetCount(Long privateAssetCount) {
                this.privateAssetCount = privateAssetCount;
                return this;
            }

            /**
             * <p>The ID of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>add-dfadf-f****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Default rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The reason why the domain name is secure.</p>
             * 
             * <strong>example:</strong>
             * <p>Intelligent policy: The destination domain name belongs to Alibaba Cloud Computing Co., Ltd. The domain name mainly provides services for Alibaba Cloud. No security risks are found, and you can add the domain name to the whitelist.</p>
             */
            public Builder securityReason(String securityReason) {
                this.securityReason = securityReason;
                return this;
            }

            /**
             * <p>The suggestion to handle the traffic of the domain name in outbound connections. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: allow</li>
             * <li><strong>alert</strong>: monitor</li>
             * <li><strong>drop</strong>: deny</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder securitySuggest(String securitySuggest) {
                this.securitySuggest = securitySuggest;
                return this;
            }

            /**
             * <p>The number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>An array that consists of tags.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The total volume of traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder totalBytes(String totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            public DomainList build() {
                return new DomainList(this);
            } 

        } 

    }
}
