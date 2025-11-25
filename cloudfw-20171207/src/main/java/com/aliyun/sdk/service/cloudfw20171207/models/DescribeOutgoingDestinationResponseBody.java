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
 * {@link DescribeOutgoingDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingDestinationResponseBody</p>
 */
public class DescribeOutgoingDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DstList")
    private java.util.List<DstList> dstList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOutgoingDestinationResponseBody(Builder builder) {
        this.dstList = builder.dstList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingDestinationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dstList
     */
    public java.util.List<DstList> getDstList() {
        return this.dstList;
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
        private java.util.List<DstList> dstList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingDestinationResponseBody model) {
            this.dstList = model.dstList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DstList.
         */
        public Builder dstList(java.util.List<DstList> dstList) {
            this.dstList = dstList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOutgoingDestinationResponseBody build() {
            return new DescribeOutgoingDestinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOutgoingDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDestinationResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private Integer riskLevel;

        @com.aliyun.core.annotation.NameInMap("TagDescribe")
        private String tagDescribe;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagList(Builder builder) {
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
            private Integer riskLevel; 
            private String tagDescribe; 
            private String tagId; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagList model) {
                this.riskLevel = model.riskLevel;
                this.tagDescribe = model.tagDescribe;
                this.tagId = model.tagId;
                this.tagName = model.tagName;
            } 

            /**
             * RiskLevel.
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * TagDescribe.
             */
            public Builder tagDescribe(String tagDescribe) {
                this.tagDescribe = tagDescribe;
                return this;
            }

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagName.
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
     * {@link DescribeOutgoingDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingDestinationResponseBody</p>
     */
    public static class DstList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclRecommendDetail")
        private String aclRecommendDetail;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private String aclStatus;

        @com.aliyun.core.annotation.NameInMap("Business")
        private String business;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("DstDomain")
        private String dstDomain;

        @com.aliyun.core.annotation.NameInMap("DstIP")
        private String dstIP;

        @com.aliyun.core.annotation.NameInMap("DstType")
        private String dstType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HasAclRecommend")
        private Boolean hasAclRecommend;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("IsMarkNormal")
        private Boolean isMarkNormal;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        private DstList(Builder builder) {
            this.aclRecommendDetail = builder.aclRecommendDetail;
            this.aclStatus = builder.aclStatus;
            this.business = builder.business;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.dstDomain = builder.dstDomain;
            this.dstIP = builder.dstIP;
            this.dstType = builder.dstType;
            this.groupName = builder.groupName;
            this.hasAclRecommend = builder.hasAclRecommend;
            this.inBytes = builder.inBytes;
            this.isMarkNormal = builder.isMarkNormal;
            this.outBytes = builder.outBytes;
            this.sessionCount = builder.sessionCount;
            this.tagList = builder.tagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DstList create() {
            return builder().build();
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
         * @return business
         */
        public String getBusiness() {
            return this.business;
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
         * @return dstDomain
         */
        public String getDstDomain() {
            return this.dstDomain;
        }

        /**
         * @return dstIP
         */
        public String getDstIP() {
            return this.dstIP;
        }

        /**
         * @return dstType
         */
        public String getDstType() {
            return this.dstType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
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

        public static final class Builder {
            private String aclRecommendDetail; 
            private String aclStatus; 
            private String business; 
            private String categoryId; 
            private String categoryName; 
            private String dstDomain; 
            private String dstIP; 
            private String dstType; 
            private String groupName; 
            private Boolean hasAclRecommend; 
            private Long inBytes; 
            private Boolean isMarkNormal; 
            private Long outBytes; 
            private Long sessionCount; 
            private java.util.List<TagList> tagList; 

            private Builder() {
            } 

            private Builder(DstList model) {
                this.aclRecommendDetail = model.aclRecommendDetail;
                this.aclStatus = model.aclStatus;
                this.business = model.business;
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.dstDomain = model.dstDomain;
                this.dstIP = model.dstIP;
                this.dstType = model.dstType;
                this.groupName = model.groupName;
                this.hasAclRecommend = model.hasAclRecommend;
                this.inBytes = model.inBytes;
                this.isMarkNormal = model.isMarkNormal;
                this.outBytes = model.outBytes;
                this.sessionCount = model.sessionCount;
                this.tagList = model.tagList;
            } 

            /**
             * AclRecommendDetail.
             */
            public Builder aclRecommendDetail(String aclRecommendDetail) {
                this.aclRecommendDetail = aclRecommendDetail;
                return this;
            }

            /**
             * AclStatus.
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * DstDomain.
             */
            public Builder dstDomain(String dstDomain) {
                this.dstDomain = dstDomain;
                return this;
            }

            /**
             * DstIP.
             */
            public Builder dstIP(String dstIP) {
                this.dstIP = dstIP;
                return this;
            }

            /**
             * DstType.
             */
            public Builder dstType(String dstType) {
                this.dstType = dstType;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * HasAclRecommend.
             */
            public Builder hasAclRecommend(Boolean hasAclRecommend) {
                this.hasAclRecommend = hasAclRecommend;
                return this;
            }

            /**
             * InBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * IsMarkNormal.
             */
            public Builder isMarkNormal(Boolean isMarkNormal) {
                this.isMarkNormal = isMarkNormal;
                return this;
            }

            /**
             * OutBytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            public DstList build() {
                return new DstList(this);
            } 

        } 

    }
}
