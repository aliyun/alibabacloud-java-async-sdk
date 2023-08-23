// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutgoingDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingDomainResponseBody</p>
 */
public class DescribeOutgoingDomainResponseBody extends TeaModel {
    @NameInMap("DomainList")
    private java.util.List < DomainList> domainList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return domainList
     */
    public java.util.List < DomainList> getDomainList() {
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
        private java.util.List < DomainList> domainList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * An array that consists of the domain names in outbound connections.
         */
        public Builder domainList(java.util.List < DomainList> domainList) {
            this.domainList = domainList;
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
         * The total number of the domain names in outbound connections.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOutgoingDomainResponseBody build() {
            return new DescribeOutgoingDomainResponseBody(this);
        } 

    } 

    public static class TagList extends TeaModel {
        @NameInMap("ClassId")
        private String classId;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("TagDescribe")
        private String tagDescribe;

        @NameInMap("TagId")
        private String tagId;

        @NameInMap("TagName")
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

            /**
             * The type of the tag. Valid values:
             * <p>
             * 
             * *   **Suspicious**
             * *   **Malicious**
             * *   **Trusted**
             */
            public Builder classId(String classId) {
                this.classId = classId;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **1**: low
             * *   **2**: medium
             * *   **3**: high
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The description of the tag.
             */
            public Builder tagDescribe(String tagDescribe) {
                this.tagDescribe = tagDescribe;
                return this;
            }

            /**
             * The ID of the tag.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * The name of the tag.
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
    public static class DomainList extends TeaModel {
        @NameInMap("AclCoverage")
        private String aclCoverage;

        @NameInMap("AclRecommendDetail")
        private String aclRecommendDetail;

        @NameInMap("AclStatus")
        private String aclStatus;

        @NameInMap("AddressGroupName")
        private String addressGroupName;

        @NameInMap("AddressGroupUUID")
        private String addressGroupUUID;

        @NameInMap("Business")
        private String business;

        @NameInMap("CategoryClassId")
        private String categoryClassId;

        @NameInMap("CategoryId")
        private String categoryId;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HasAcl")
        private String hasAcl;

        @NameInMap("HasAclRecommend")
        private Boolean hasAclRecommend;

        @NameInMap("InBytes")
        private Long inBytes;

        @NameInMap("IsMarkNormal")
        private Boolean isMarkNormal;

        @NameInMap("Organization")
        private String organization;

        @NameInMap("OutBytes")
        private Long outBytes;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SecurityReason")
        private String securityReason;

        @NameInMap("SecuritySuggest")
        private String securitySuggest;

        @NameInMap("SessionCount")
        private Long sessionCount;

        @NameInMap("TagList")
        private java.util.List < TagList> tagList;

        @NameInMap("TotalBytes")
        private String totalBytes;

        private DomainList(Builder builder) {
            this.aclCoverage = builder.aclCoverage;
            this.aclRecommendDetail = builder.aclRecommendDetail;
            this.aclStatus = builder.aclStatus;
            this.addressGroupName = builder.addressGroupName;
            this.addressGroupUUID = builder.addressGroupUUID;
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
        public java.util.List < TagList> getTagList() {
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
            private String ruleId; 
            private String ruleName; 
            private String securityReason; 
            private String securitySuggest; 
            private Long sessionCount; 
            private java.util.List < TagList> tagList; 
            private String totalBytes; 

            /**
             * Indicates whether an access control policy is configured. Valid values:
             * <p>
             * 
             * *   **Uncovered**: no
             * *   **FullCoverage**: yes
             */
            public Builder aclCoverage(String aclCoverage) {
                this.aclCoverage = aclCoverage;
                return this;
            }

            /**
             * The suggestion in an access control policy.
             */
            public Builder aclRecommendDetail(String aclRecommendDetail) {
                this.aclRecommendDetail = aclRecommendDetail;
                return this;
            }

            /**
             * The state of the access control policy. Valid values:
             * <p>
             * 
             * *   **normal**: healthy
             * *   **abnormal**: unhealthy
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * The name of the address book.
             */
            public Builder addressGroupName(String addressGroupName) {
                this.addressGroupName = addressGroupName;
                return this;
            }

            /**
             * The UUID of the address book.
             */
            public Builder addressGroupUUID(String addressGroupUUID) {
                this.addressGroupUUID = addressGroupUUID;
                return this;
            }

            /**
             * The website service.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * The type of the tag. Valid values:
             * <p>
             * 
             * *   **Suspicious**
             * *   **Malicious**
             * *   **Trusted**
             */
            public Builder categoryClassId(String categoryClassId) {
                this.categoryClassId = categoryClassId;
                return this;
            }

            /**
             * The type ID of the service to which the domain name belongs. Valid values:
             * <p>
             * 
             * *   **Aliyun**: Alibaba Cloud services
             * *   **NotAliyun**: third-party services
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * The type of the service to which the domain name belongs. Valid values:
             * <p>
             * 
             * *   **Alibaba Cloud services**
             * *   **Third-party services**
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * The domain name in outbound connections.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The name of the group to which the access control policy belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Indicates whether an `access control policy` is configured for the domain name. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder hasAcl(String hasAcl) {
                this.hasAcl = hasAcl;
                return this;
            }

            /**
             * Indicates whether an access control policy is recommended. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder hasAclRecommend(Boolean hasAclRecommend) {
                this.hasAclRecommend = hasAclRecommend;
                return this;
            }

            /**
             * The volume of inbound traffic.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * Indicates whether the domain name is marked as normal. Valid values:
             * <p>
             * 
             * *   **true**: normal
             * *   **false**: abnormal
             */
            public Builder isMarkNormal(Boolean isMarkNormal) {
                this.isMarkNormal = isMarkNormal;
                return this;
            }

            /**
             * The name of the organization.
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * The volume of outbound traffic.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * The ID of the access control policy.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the access control policy.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The reason why the domain name is secure.
             */
            public Builder securityReason(String securityReason) {
                this.securityReason = securityReason;
                return this;
            }

            /**
             * The suggestion to handle the traffic of the domain name in outbound connections. Valid values:
             * <p>
             * 
             * *   **pass**: allow
             * *   **alert**: monitor
             * *   **drop**: deny
             */
            public Builder securitySuggest(String securitySuggest) {
                this.securitySuggest = securitySuggest;
                return this;
            }

            /**
             * The number of requests.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * An array that consists of tags.
             */
            public Builder tagList(java.util.List < TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * The total volume of traffic. Unit: bytes.
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
