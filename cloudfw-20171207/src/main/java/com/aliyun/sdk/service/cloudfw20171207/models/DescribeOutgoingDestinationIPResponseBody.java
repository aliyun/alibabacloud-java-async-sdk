// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutgoingDestinationIPResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingDestinationIPResponseBody</p>
 */
public class DescribeOutgoingDestinationIPResponseBody extends TeaModel {
    @NameInMap("DstIPList")
    private java.util.List < DstIPList> dstIPList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOutgoingDestinationIPResponseBody(Builder builder) {
        this.dstIPList = builder.dstIPList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDestinationIPResponseBody create() {
        return builder().build();
    }

    /**
     * @return dstIPList
     */
    public java.util.List < DstIPList> getDstIPList() {
        return this.dstIPList;
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
        private java.util.List < DstIPList> dstIPList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The IP addresses in outbound connections.
         */
        public Builder dstIPList(java.util.List < DstIPList> dstIPList) {
            this.dstIPList = dstIPList;
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
         * The total number of destination IP addresses in outbound connections.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOutgoingDestinationIPResponseBody build() {
            return new DescribeOutgoingDestinationIPResponseBody(this);
        } 

    } 

    public static class AddressGroupList extends TeaModel {
        @NameInMap("AddressGroupName")
        private String addressGroupName;

        @NameInMap("AddressGroupUUID")
        private String addressGroupUUID;

        private AddressGroupList(Builder builder) {
            this.addressGroupName = builder.addressGroupName;
            this.addressGroupUUID = builder.addressGroupUUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressGroupList create() {
            return builder().build();
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

        public static final class Builder {
            private String addressGroupName; 
            private String addressGroupUUID; 

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

            public AddressGroupList build() {
                return new AddressGroupList(this);
            } 

        } 

    }
    public static class ApplicationPortList extends TeaModel {
        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("Port")
        private Integer port;

        private ApplicationPortList(Builder builder) {
            this.applicationName = builder.applicationName;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationPortList create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String applicationName; 
            private Integer port; 

            /**
             * The application type used in the access control policy. Valid values:
             * <p>
             * 
             * *   **FTP**
             * *   **HTTP**
             * *   **HTTPS**
             * *   **Memcache**
             * *   **MongoDB**
             * *   **MQTT**
             * *   **MySQL**
             * *   **RDP**
             * *   **Redis**
             * *   **SMTP**
             * *   **SMTPS**
             * *   **SSH**
             * *   **SSL_No_Cert**
             * *   **SSL**
             * *   **VNC**
             * 
             * >  The value of this parameter depends on the value of the Proto parameter. If you set Proto to TCP, you can set ApplicationNameList to any valid value. If you configure both ApplicationNameList and ApplicationName, only the value of ApplicationNameList is used.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The application port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public ApplicationPortList build() {
                return new ApplicationPortList(this);
            } 

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
    public static class DstIPList extends TeaModel {
        @NameInMap("AclCoverage")
        private String aclCoverage;

        @NameInMap("AclRecommendDetail")
        private String aclRecommendDetail;

        @NameInMap("AclStatus")
        private String aclStatus;

        @NameInMap("AddressGroupList")
        private java.util.List < AddressGroupList> addressGroupList;

        @NameInMap("ApplicationPortList")
        private java.util.List < ApplicationPortList> applicationPortList;

        @NameInMap("CategoryClassId")
        private String categoryClassId;

        @NameInMap("CategoryId")
        private String categoryId;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("DstIP")
        private String dstIP;

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

        private DstIPList(Builder builder) {
            this.aclCoverage = builder.aclCoverage;
            this.aclRecommendDetail = builder.aclRecommendDetail;
            this.aclStatus = builder.aclStatus;
            this.addressGroupList = builder.addressGroupList;
            this.applicationPortList = builder.applicationPortList;
            this.categoryClassId = builder.categoryClassId;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.dstIP = builder.dstIP;
            this.groupName = builder.groupName;
            this.hasAcl = builder.hasAcl;
            this.hasAclRecommend = builder.hasAclRecommend;
            this.inBytes = builder.inBytes;
            this.isMarkNormal = builder.isMarkNormal;
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

        public static DstIPList create() {
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
         * @return addressGroupList
         */
        public java.util.List < AddressGroupList> getAddressGroupList() {
            return this.addressGroupList;
        }

        /**
         * @return applicationPortList
         */
        public java.util.List < ApplicationPortList> getApplicationPortList() {
            return this.applicationPortList;
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
         * @return dstIP
         */
        public String getDstIP() {
            return this.dstIP;
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
            private java.util.List < AddressGroupList> addressGroupList; 
            private java.util.List < ApplicationPortList> applicationPortList; 
            private String categoryClassId; 
            private String categoryId; 
            private String categoryName; 
            private String dstIP; 
            private String groupName; 
            private String hasAcl; 
            private Boolean hasAclRecommend; 
            private Long inBytes; 
            private Boolean isMarkNormal; 
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
             * The suggestion to configure an access control policy.
             */
            public Builder aclRecommendDetail(String aclRecommendDetail) {
                this.aclRecommendDetail = aclRecommendDetail;
                return this;
            }

            /**
             * The status of the access control policy. Valid values:
             * <p>
             * 
             * *   **normal**: healthy
             * *   **Abnormal**: unhealthy
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * The information about the address book.
             */
            public Builder addressGroupList(java.util.List < AddressGroupList> addressGroupList) {
                this.addressGroupList = addressGroupList;
                return this;
            }

            /**
             * The application ports.
             */
            public Builder applicationPortList(java.util.List < ApplicationPortList> applicationPortList) {
                this.applicationPortList = applicationPortList;
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
             * The ID of the service type. Valid values:
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
             * The type of the service to which the destination IP address belongs. Valid values:
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
             * The destination IP addresses in outbound connections.
             */
            public Builder dstIP(String dstIP) {
                this.dstIP = dstIP;
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
             * Indicates whether an access control policy is configured. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasAcl(String hasAcl) {
                this.hasAcl = hasAcl;
                return this;
            }

            /**
             * Indicates whether an access control policy is recommended. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasAclRecommend(Boolean hasAclRecommend) {
                this.hasAclRecommend = hasAclRecommend;
                return this;
            }

            /**
             * The inbound traffic. Unit: bytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * Indicates whether the destination IP address is added to a whitelist. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isMarkNormal(Boolean isMarkNormal) {
                this.isMarkNormal = isMarkNormal;
                return this;
            }

            /**
             * The outbound traffic. Unit: bytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * The UUID of the access control policy.
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
             * *   **alert**: deny
             * *   **drop**: monitor
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
             * The tags.
             */
            public Builder tagList(java.util.List < TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * The total traffic. Unit: bytes
             */
            public Builder totalBytes(String totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            public DstIPList build() {
                return new DstIPList(this);
            } 

        } 

    }
}
