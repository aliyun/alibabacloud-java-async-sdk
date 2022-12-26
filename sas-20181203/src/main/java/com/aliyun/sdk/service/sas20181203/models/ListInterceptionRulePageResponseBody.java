// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionRulePageResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterceptionRulePageResponseBody</p>
 */
public class ListInterceptionRulePageResponseBody extends TeaModel {
    @NameInMap("InterceptionRuleList")
    private java.util.List < InterceptionRuleList> interceptionRuleList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListInterceptionRulePageResponseBody(Builder builder) {
        this.interceptionRuleList = builder.interceptionRuleList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterceptionRulePageResponseBody create() {
        return builder().build();
    }

    /**
     * @return interceptionRuleList
     */
    public java.util.List < InterceptionRuleList> getInterceptionRuleList() {
        return this.interceptionRuleList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InterceptionRuleList> interceptionRuleList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * InterceptionRuleList.
         */
        public Builder interceptionRuleList(java.util.List < InterceptionRuleList> interceptionRuleList) {
            this.interceptionRuleList = interceptionRuleList;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInterceptionRulePageResponseBody build() {
            return new ListInterceptionRulePageResponseBody(this);
        } 

    } 

    public static class DstTarget extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("ImageList")
        private java.util.List < String > imageList;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Ports")
        private java.util.List < String > ports;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("TagList")
        private java.util.List < String > tagList;

        @NameInMap("TargetId")
        private Integer targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetType")
        private String targetType;

        private DstTarget(Builder builder) {
            this.appName = builder.appName;
            this.imageList = builder.imageList;
            this.namespace = builder.namespace;
            this.ports = builder.ports;
            this.ruleType = builder.ruleType;
            this.tagList = builder.tagList;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DstTarget create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return imageList
         */
        public java.util.List < String > getImageList() {
            return this.imageList;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return ports
         */
        public java.util.List < String > getPorts() {
            return this.ports;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return tagList
         */
        public java.util.List < String > getTagList() {
            return this.tagList;
        }

        /**
         * @return targetId
         */
        public Integer getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String appName; 
            private java.util.List < String > imageList; 
            private String namespace; 
            private java.util.List < String > ports; 
            private String ruleType; 
            private java.util.List < String > tagList; 
            private Integer targetId; 
            private String targetName; 
            private String targetType; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * ImageList.
             */
            public Builder imageList(java.util.List < String > imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Ports.
             */
            public Builder ports(java.util.List < String > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List < String > tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * TargetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public DstTarget build() {
                return new DstTarget(this);
            } 

        } 

    }
    public static class SrcTarget extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("ImageList")
        private java.util.List < String > imageList;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("TagList")
        private java.util.List < String > tagList;

        @NameInMap("TargetId")
        private Integer targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetType")
        private String targetType;

        private SrcTarget(Builder builder) {
            this.appName = builder.appName;
            this.imageList = builder.imageList;
            this.namespace = builder.namespace;
            this.ruleType = builder.ruleType;
            this.tagList = builder.tagList;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcTarget create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return imageList
         */
        public java.util.List < String > getImageList() {
            return this.imageList;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return tagList
         */
        public java.util.List < String > getTagList() {
            return this.tagList;
        }

        /**
         * @return targetId
         */
        public Integer getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String appName; 
            private java.util.List < String > imageList; 
            private String namespace; 
            private String ruleType; 
            private java.util.List < String > tagList; 
            private Integer targetId; 
            private String targetName; 
            private String targetType; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * ImageList.
             */
            public Builder imageList(java.util.List < String > imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List < String > tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * TargetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public SrcTarget build() {
                return new SrcTarget(this);
            } 

        } 

    }
    public static class InterceptionRuleList extends TeaModel {
        @NameInMap("DstTarget")
        private DstTarget dstTarget;

        @NameInMap("InterceptType")
        private Long interceptType;

        @NameInMap("OrderIndex")
        private Long orderIndex;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleSwitch")
        private Integer ruleSwitch;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("SrcTarget")
        private SrcTarget srcTarget;

        private InterceptionRuleList(Builder builder) {
            this.dstTarget = builder.dstTarget;
            this.interceptType = builder.interceptType;
            this.orderIndex = builder.orderIndex;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleSwitch = builder.ruleSwitch;
            this.ruleType = builder.ruleType;
            this.srcTarget = builder.srcTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterceptionRuleList create() {
            return builder().build();
        }

        /**
         * @return dstTarget
         */
        public DstTarget getDstTarget() {
            return this.dstTarget;
        }

        /**
         * @return interceptType
         */
        public Long getInterceptType() {
            return this.interceptType;
        }

        /**
         * @return orderIndex
         */
        public Long getOrderIndex() {
            return this.orderIndex;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleSwitch
         */
        public Integer getRuleSwitch() {
            return this.ruleSwitch;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return srcTarget
         */
        public SrcTarget getSrcTarget() {
            return this.srcTarget;
        }

        public static final class Builder {
            private DstTarget dstTarget; 
            private Long interceptType; 
            private Long orderIndex; 
            private Long ruleId; 
            private String ruleName; 
            private Integer ruleSwitch; 
            private String ruleType; 
            private SrcTarget srcTarget; 

            /**
             * DstTarget.
             */
            public Builder dstTarget(DstTarget dstTarget) {
                this.dstTarget = dstTarget;
                return this;
            }

            /**
             * InterceptType.
             */
            public Builder interceptType(Long interceptType) {
                this.interceptType = interceptType;
                return this;
            }

            /**
             * OrderIndex.
             */
            public Builder orderIndex(Long orderIndex) {
                this.orderIndex = orderIndex;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleSwitch.
             */
            public Builder ruleSwitch(Integer ruleSwitch) {
                this.ruleSwitch = ruleSwitch;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * SrcTarget.
             */
            public Builder srcTarget(SrcTarget srcTarget) {
                this.srcTarget = srcTarget;
                return this;
            }

            public InterceptionRuleList build() {
                return new InterceptionRuleList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
