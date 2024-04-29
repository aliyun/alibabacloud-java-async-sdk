// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionRuleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetInterceptionRuleDetailResponseBody</p>
 */
public class GetInterceptionRuleDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InterceptionRuleDetail")
    private InterceptionRuleDetail interceptionRuleDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInterceptionRuleDetailResponseBody(Builder builder) {
        this.interceptionRuleDetail = builder.interceptionRuleDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionRuleDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return interceptionRuleDetail
     */
    public InterceptionRuleDetail getInterceptionRuleDetail() {
        return this.interceptionRuleDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InterceptionRuleDetail interceptionRuleDetail; 
        private String requestId; 

        /**
         * The details of the rule.
         */
        public Builder interceptionRuleDetail(InterceptionRuleDetail interceptionRuleDetail) {
            this.interceptionRuleDetail = interceptionRuleDetail;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInterceptionRuleDetailResponseBody build() {
            return new GetInterceptionRuleDetailResponseBody(this);
        } 

    } 

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
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * An array that consists of the name of the image specified for the network object.
             */
            public Builder imageList(java.util.List < String > imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * The namespace to which the network object belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * An array that consists of the port range of the destination network object.
             */
            public Builder ports(java.util.List < String > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The type of the rule.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * An array that consists of the labels specified for the network object.
             */
            public Builder tagList(java.util.List < String > tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * The ID of the network object.
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the object.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The type of the network object.
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
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The images of the network object.
             */
            public Builder imageList(java.util.List < String > imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * The namespace to which the network object belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The type of the rule.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The labels specified for the network object.
             */
            public Builder tagList(java.util.List < String > tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * The ID of the network object.
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the object.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The type of the network object.
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
    public static class InterceptionRuleDetail extends TeaModel {
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

        private InterceptionRuleDetail(Builder builder) {
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

        public static InterceptionRuleDetail create() {
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
             * The destination network object.
             */
            public Builder dstTarget(DstTarget dstTarget) {
                this.dstTarget = dstTarget;
                return this;
            }

            /**
             * The interception mode. Valid values:
             * <p>
             * 
             * *   **0**: monitor
             * *   **1**: block
             * *   **2**: alert
             * *   **3**: allow
             */
            public Builder interceptType(Long interceptType) {
                this.interceptType = interceptType;
                return this;
            }

            /**
             * The priority of the rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.
             */
            public Builder orderIndex(Long orderIndex) {
                this.orderIndex = orderIndex;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the defense rule. Valid values:
             * <p>
             * 
             * *   **1**: The rule is enabled.
             * *   **0**: The rule is disabled.
             */
            public Builder ruleSwitch(Integer ruleSwitch) {
                this.ruleSwitch = ruleSwitch;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   **suggest**: a suggestion rule
             * *   **customize**: a custom rule
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The source network object.
             */
            public Builder srcTarget(SrcTarget srcTarget) {
                this.srcTarget = srcTarget;
                return this;
            }

            public InterceptionRuleDetail build() {
                return new InterceptionRuleDetail(this);
            } 

        } 

    }
}
