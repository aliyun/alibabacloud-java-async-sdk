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
 * {@link DescribeOutgoingDestinationIPResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingDestinationIPResponseBody</p>
 */
public class DescribeOutgoingDestinationIPResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DstIPList")
    private java.util.List<DstIPList> dstIPList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dstIPList
     */
    public java.util.List<DstIPList> getDstIPList() {
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
        private java.util.List<DstIPList> dstIPList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingDestinationIPResponseBody model) {
            this.dstIPList = model.dstIPList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of destination IP addresses for outgoing connections.</p>
         */
        public Builder dstIPList(java.util.List<DstIPList> dstIPList) {
            this.dstIPList = dstIPList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of outgoing IPs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOutgoingDestinationIPResponseBody build() {
            return new DescribeOutgoingDestinationIPResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOutgoingDestinationIPResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDestinationIPResponseBody</p>
     */
    public static class AddressGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressGroupName")
        private String addressGroupName;

        @com.aliyun.core.annotation.NameInMap("AddressGroupUUID")
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

            private Builder() {
            } 

            private Builder(AddressGroupList model) {
                this.addressGroupName = model.addressGroupName;
                this.addressGroupUUID = model.addressGroupUUID;
            } 

            /**
             * <p>The name of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>IP地址簿</p>
             */
            public Builder addressGroupName(String addressGroupName) {
                this.addressGroupName = addressGroupName;
                return this;
            }

            /**
             * <p>The UUID of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
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
    /**
     * 
     * {@link DescribeOutgoingDestinationIPResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDestinationIPResponseBody</p>
     */
    public static class ApplicationPortList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("UnknownReason")
        private java.util.List<String> unknownReason;

        private ApplicationPortList(Builder builder) {
            this.applicationName = builder.applicationName;
            this.port = builder.port;
            this.unknownReason = builder.unknownReason;
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

        /**
         * @return unknownReason
         */
        public java.util.List<String> getUnknownReason() {
            return this.unknownReason;
        }

        public static final class Builder {
            private String applicationName; 
            private Integer port; 
            private java.util.List<String> unknownReason; 

            private Builder() {
            } 

            private Builder(ApplicationPortList model) {
                this.applicationName = model.applicationName;
                this.port = model.port;
                this.unknownReason = model.unknownReason;
            } 

            /**
             * <p>The application protocol detected for the connection. Valid values:</p>
             * <ul>
             * <li><p><strong>FTP</strong></p>
             * </li>
             * <li><p><strong>HTTP</strong></p>
             * </li>
             * <li><p><strong>HTTPS</strong></p>
             * </li>
             * <li><p><strong>Memcache</strong></p>
             * </li>
             * <li><p><strong>MongoDB</strong></p>
             * </li>
             * <li><p><strong>MQTT</strong></p>
             * </li>
             * <li><p><strong>MySQL</strong></p>
             * </li>
             * <li><p><strong>RDP</strong></p>
             * </li>
             * <li><p><strong>Redis</strong></p>
             * </li>
             * <li><p><strong>SMTP</strong></p>
             * </li>
             * <li><p><strong>SMTPS</strong></p>
             * </li>
             * <li><p><strong>SSH</strong></p>
             * </li>
             * <li><p><strong>SSL_No_Cert</strong></p>
             * </li>
             * <li><p><strong>SSL</strong></p>
             * </li>
             * <li><p><strong>VNC</strong></p>
             * </li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The application port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>A list of reasons why the application protocol was not identified.</p>
             */
            public Builder unknownReason(java.util.List<String> unknownReason) {
                this.unknownReason = unknownReason;
                return this;
            }

            public ApplicationPortList build() {
                return new ApplicationPortList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOutgoingDestinationIPResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDestinationIPResponseBody</p>
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
             * <p>The category of the threat intelligence tag. Valid values:</p>
             * <ul>
             * <li><p><strong>Suspicious</strong></p>
             * </li>
             * <li><p><strong>Malicious</strong></p>
             * </li>
             * <li><p><strong>Trusted</strong></p>
             * </li>
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
             * <li><p><strong>1</strong>: Low</p>
             * </li>
             * <li><p><strong>2</strong>: Medium</p>
             * </li>
             * <li><p><strong>3</strong>: High</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The description of the threat intelligence tag.</p>
             * 
             * <strong>example:</strong>
             * <p>ReleaseLabel</p>
             */
            public Builder tagDescribe(String tagDescribe) {
                this.tagDescribe = tagDescribe;
                return this;
            }

            /**
             * <p>The ID of the threat intelligence tag.</p>
             * 
             * <strong>example:</strong>
             * <p>ReleaseLabel</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The name of the threat intelligence tag.</p>
             * 
             * <strong>example:</strong>
             * <p>ReleaseLabel</p>
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
     * {@link DescribeOutgoingDestinationIPResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDestinationIPResponseBody</p>
     */
    public static class DstIPList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclCoverage")
        private String aclCoverage;

        @com.aliyun.core.annotation.NameInMap("AclRecommendDetail")
        private String aclRecommendDetail;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private String aclStatus;

        @com.aliyun.core.annotation.NameInMap("AddressGroupList")
        private java.util.List<AddressGroupList> addressGroupList;

        @com.aliyun.core.annotation.NameInMap("ApplicationPortList")
        private java.util.List<ApplicationPortList> applicationPortList;

        @com.aliyun.core.annotation.NameInMap("AssetCount")
        private Long assetCount;

        @com.aliyun.core.annotation.NameInMap("CategoryClassId")
        private String categoryClassId;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("DstIP")
        private String dstIP;

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

        @com.aliyun.core.annotation.NameInMap("LocationName")
        private String locationName;

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

        private DstIPList(Builder builder) {
            this.aclCoverage = builder.aclCoverage;
            this.aclRecommendDetail = builder.aclRecommendDetail;
            this.aclStatus = builder.aclStatus;
            this.addressGroupList = builder.addressGroupList;
            this.applicationPortList = builder.applicationPortList;
            this.assetCount = builder.assetCount;
            this.categoryClassId = builder.categoryClassId;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.dstIP = builder.dstIP;
            this.groupName = builder.groupName;
            this.hasAcl = builder.hasAcl;
            this.hasAclRecommend = builder.hasAclRecommend;
            this.inBytes = builder.inBytes;
            this.isMarkNormal = builder.isMarkNormal;
            this.locationName = builder.locationName;
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
        public java.util.List<AddressGroupList> getAddressGroupList() {
            return this.addressGroupList;
        }

        /**
         * @return applicationPortList
         */
        public java.util.List<ApplicationPortList> getApplicationPortList() {
            return this.applicationPortList;
        }

        /**
         * @return assetCount
         */
        public Long getAssetCount() {
            return this.assetCount;
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
         * @return locationName
         */
        public String getLocationName() {
            return this.locationName;
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
            private java.util.List<AddressGroupList> addressGroupList; 
            private java.util.List<ApplicationPortList> applicationPortList; 
            private Long assetCount; 
            private String categoryClassId; 
            private String categoryId; 
            private String categoryName; 
            private String dstIP; 
            private String groupName; 
            private String hasAcl; 
            private Boolean hasAclRecommend; 
            private Long inBytes; 
            private Boolean isMarkNormal; 
            private String locationName; 
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

            private Builder(DstIPList model) {
                this.aclCoverage = model.aclCoverage;
                this.aclRecommendDetail = model.aclRecommendDetail;
                this.aclStatus = model.aclStatus;
                this.addressGroupList = model.addressGroupList;
                this.applicationPortList = model.applicationPortList;
                this.assetCount = model.assetCount;
                this.categoryClassId = model.categoryClassId;
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.dstIP = model.dstIP;
                this.groupName = model.groupName;
                this.hasAcl = model.hasAcl;
                this.hasAclRecommend = model.hasAclRecommend;
                this.inBytes = model.inBytes;
                this.isMarkNormal = model.isMarkNormal;
                this.locationName = model.locationName;
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
             * <p>Indicates whether an access control policy is applied. Valid values:</p>
             * <ul>
             * <li><p><strong>Uncovered</strong>: No policy is applied.</p>
             * </li>
             * <li><p><strong>FullCoverage</strong>: A policy is applied.</p>
             * </li>
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
             * <p>Details of the ACL recommendation.</p>
             * 
             * <strong>example:</strong>
             * <p>建议放行</p>
             */
            public Builder aclRecommendDetail(String aclRecommendDetail) {
                this.aclRecommendDetail = aclRecommendDetail;
                return this;
            }

            /**
             * <p>The health status of the access control policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Normal</strong>: Healthy.</p>
             * </li>
             * <li><p><strong>Abnormal</strong>: Unhealthy.</p>
             * </li>
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
             * <p>A list of address books that contain this destination IP address.</p>
             */
            public Builder addressGroupList(java.util.List<AddressGroupList> addressGroupList) {
                this.addressGroupList = addressGroupList;
                return this;
            }

            /**
             * <p>The list of application ports.</p>
             * <blockquote>
             * <p>This response returns a maximum of 99 application ports. If more than 99 ports exist, only the first 99 are returned.</p>
             * </blockquote>
             */
            public Builder applicationPortList(java.util.List<ApplicationPortList> applicationPortList) {
                this.applicationPortList = applicationPortList;
                return this;
            }

            /**
             * <p>The total number of assets that initiated outgoing connections to this destination IP.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder assetCount(Long assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * <p>The threat intelligence category of the destination IP address. Valid values:</p>
             * <ul>
             * <li><p><strong>Suspicious</strong></p>
             * </li>
             * <li><p><strong>Malicious</strong></p>
             * </li>
             * <li><p><strong>Trusted</strong></p>
             * </li>
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
             * <p>The ID of the service category. Valid values:</p>
             * <ul>
             * <li><p><strong>Aliyun</strong>: The destination is an Alibaba Cloud product.</p>
             * </li>
             * <li><p><strong>NotAliyun</strong>: The destination is a non-Alibaba Cloud product.</p>
             * </li>
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
             * <p>The service category of the destination IP address. Valid values:</p>
             * <ul>
             * <li><p><strong>Alibaba Cloud product</strong></p>
             * </li>
             * <li><p><strong>non-Alibaba Cloud product</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>阿里云产品</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The destination IP address of the outgoing connection.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.XX.XX</p>
             */
            public Builder dstIP(String dstIP) {
                this.dstIP = dstIP;
                return this;
            }

            /**
             * <p>The name of the rule group.</p>
             * 
             * <strong>example:</strong>
             * <p>rules_test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Indicates whether an access control rule exists. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: An access control rule exists.</p>
             * </li>
             * <li><p><strong>false</strong>: No access control rule exists.</p>
             * </li>
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
             * <p>Indicates whether an ACL is recommended. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: An ACL is recommended.</p>
             * </li>
             * <li><p><strong>false</strong>: No ACL is recommended.</p>
             * </li>
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
             * <p>The total inbound traffic in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>472</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>Indicates whether the destination IP address is added to the allowlist. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The destination IP address is on the allowlist.</p>
             * </li>
             * <li><p><strong>false</strong>: The destination IP address is not on the allowlist.</p>
             * </li>
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
             * <p>The geographical location of the destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>山东省青岛市</p>
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * <p>The total outbound traffic in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>965</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The total number of private assets that initiated outgoing connections to this destination IP.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder privateAssetCount(Long privateAssetCount) {
                this.privateAssetCount = privateAssetCount;
                return this;
            }

            /**
             * <p>The UUID of the ACL rule.</p>
             * 
             * <strong>example:</strong>
             * <p>fadsfd-dfadf-df****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the ACL rule.</p>
             * 
             * <strong>example:</strong>
             * <p>默认规则</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The reason for the security recommendation.</p>
             * 
             * <strong>example:</strong>
             * <p>智能策略：该目的域名所属组织为阿里云计算有限公司，主要业务为阿里云，未发现安全风险，可用于配置外联白名单。</p>
             */
            public Builder securityReason(String securityReason) {
                this.securityReason = securityReason;
                return this;
            }

            /**
             * <p>The recommended security action for the outgoing connection. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: Allows the connection.</p>
             * </li>
             * <li><p><strong>alert</strong>: Rejects the connection.</p>
             * </li>
             * <li><p><strong>drop</strong>: Drops the connection.</p>
             * </li>
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
             * <p>4</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>A list of tags associated with the destination IP.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The total traffic volume in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
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
