// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInterceptionRulePageResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterceptionRulePageResponseBody</p>
 */
public class ListInterceptionRulePageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InterceptionRuleList")
    private java.util.List < InterceptionRuleList> interceptionRuleList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array that consists of information about the defense rules.</p>
         */
        public Builder interceptionRuleList(java.util.List < InterceptionRuleList> interceptionRuleList) {
            this.interceptionRuleList = interceptionRuleList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>ACF97412-FD09-4D1F-994F-34DF12BR****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInterceptionRulePageResponseBody build() {
            return new ListInterceptionRulePageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInterceptionRulePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterceptionRulePageResponseBody</p>
     */
    public static class DstTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private java.util.List < String > imageList;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List < String > ports;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List < String > tagList;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private Integer targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>console</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>An array that consists of the affected images.</p>
             */
            public Builder imageList(java.util.List < String > imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>An array that consists of information about the ports used by the destination server.</p>
             */
            public Builder ports(java.util.List < String > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The type of the defense rule. Valid values:</p>
             * <ul>
             * <li><strong>suggest</strong>: intelligently recommended rule</li>
             * <li><strong>customize</strong>: custom rule</li>
             * <li><strong>system</strong>: system rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>customize</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>An array that consists of tags added to the destination network object.</p>
             */
            public Builder tagList(java.util.List < String > tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The ID of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>302001</p>
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>demo4****</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
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
    /**
     * 
     * {@link ListInterceptionRulePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterceptionRulePageResponseBody</p>
     */
    public static class SrcTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private java.util.List < String > imageList;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List < String > tagList;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private Integer targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-jenkins-lawr****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>An array that consists of the images of the network object.</p>
             */
            public Builder imageList(java.util.List < String > imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>jenkins</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The type of the defense rule. Valid values:</p>
             * <ul>
             * <li><strong>suggest</strong>: intelligently recommended rule</li>
             * <li><strong>customize</strong>: custom rule</li>
             * <li><strong>system</strong>: system rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>customize</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>An array that consists of tags added to the source network object.</p>
             */
            public Builder tagList(java.util.List < String > tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The ID of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>40****</p>
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>mhh-te****</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the affected assets.</p>
             * 
             * <strong>example:</strong>
             * <p>containerId</p>
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
    /**
     * 
     * {@link ListInterceptionRulePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterceptionRulePageResponseBody</p>
     */
    public static class InterceptionRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstTarget")
        private DstTarget dstTarget;

        @com.aliyun.core.annotation.NameInMap("InterceptType")
        private Long interceptType;

        @com.aliyun.core.annotation.NameInMap("OrderIndex")
        private Long orderIndex;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleSwitch")
        private Integer ruleSwitch;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("SrcTarget")
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
             * <p>The destination network object.</p>
             */
            public Builder dstTarget(DstTarget dstTarget) {
                this.dstTarget = dstTarget;
                return this;
            }

            /**
             * <p>The interception mode. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: monitor</li>
             * <li><strong>1</strong>: block</li>
             * <li><strong>2</strong>: alert</li>
             * <li><strong>3</strong>: allow</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interceptType(Long interceptType) {
                this.interceptType = interceptType;
                return this;
            }

            /**
             * <p>The order in which the entries are sorted.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderIndex(Long orderIndex) {
                this.orderIndex = orderIndex;
                return this;
            }

            /**
             * <p>The ID of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>30****</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the defense rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled</li>
             * <li><strong>0</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleSwitch(Integer ruleSwitch) {
                this.ruleSwitch = ruleSwitch;
                return this;
            }

            /**
             * <p>The type of the defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>customize</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The source network object.</p>
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
    /**
     * 
     * {@link ListInterceptionRulePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterceptionRulePageResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
