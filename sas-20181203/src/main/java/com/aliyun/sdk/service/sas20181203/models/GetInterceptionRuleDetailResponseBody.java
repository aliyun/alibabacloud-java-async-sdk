// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInterceptionRuleDetailResponseBody model) {
            this.interceptionRuleDetail = model.interceptionRuleDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the rule.</p>
         */
        public Builder interceptionRuleDetail(InterceptionRuleDetail interceptionRuleDetail) {
            this.interceptionRuleDetail = interceptionRuleDetail;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9FBC6E47-7508-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInterceptionRuleDetailResponseBody build() {
            return new GetInterceptionRuleDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInterceptionRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterceptionRuleDetailResponseBody</p>
     */
    public static class DstTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private java.util.List<String> imageList;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List<String> ports;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<String> tagList;

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
        public java.util.List<String> getImageList() {
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
        public java.util.List<String> getPorts() {
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
        public java.util.List<String> getTagList() {
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
            private java.util.List<String> imageList; 
            private String namespace; 
            private java.util.List<String> ports; 
            private String ruleType; 
            private java.util.List<String> tagList; 
            private Integer targetId; 
            private String targetName; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(DstTarget model) {
                this.appName = model.appName;
                this.imageList = model.imageList;
                this.namespace = model.namespace;
                this.ports = model.ports;
                this.ruleType = model.ruleType;
                this.tagList = model.tagList;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
            } 

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
             * <p>An array that consists of the name of the image specified for the network object.</p>
             */
            public Builder imageList(java.util.List<String> imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * <p>The namespace to which the network object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>An array that consists of the port range of the destination network object.</p>
             */
            public Builder ports(java.util.List<String> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The type of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>customize</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>An array that consists of the labels specified for the network object.</p>
             */
            public Builder tagList(java.util.List<String> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The ID of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>200014</p>
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>demo4-be1</p>
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
     * {@link GetInterceptionRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterceptionRuleDetailResponseBody</p>
     */
    public static class SrcTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private java.util.List<String> imageList;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<String> tagList;

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
        public java.util.List<String> getImageList() {
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
        public java.util.List<String> getTagList() {
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
            private java.util.List<String> imageList; 
            private String namespace; 
            private String ruleType; 
            private java.util.List<String> tagList; 
            private Integer targetId; 
            private String targetName; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(SrcTarget model) {
                this.appName = model.appName;
                this.imageList = model.imageList;
                this.namespace = model.namespace;
                this.ruleType = model.ruleType;
                this.tagList = model.tagList;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
            } 

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
             * <p>The images of the network object.</p>
             */
            public Builder imageList(java.util.List<String> imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * <p>The namespace to which the network object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The type of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>customize</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The labels specified for the network object.</p>
             */
            public Builder tagList(java.util.List<String> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The ID of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>300635</p>
             */
            public Builder targetId(Integer targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>dmz</p>
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

            public SrcTarget build() {
                return new SrcTarget(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInterceptionRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterceptionRuleDetailResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InterceptionRuleDetail model) {
                this.dstTarget = model.dstTarget;
                this.interceptType = model.interceptType;
                this.orderIndex = model.orderIndex;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleSwitch = model.ruleSwitch;
                this.ruleType = model.ruleType;
                this.srcTarget = model.srcTarget;
            } 

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
             * <p>The priority of the rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderIndex(Long orderIndex) {
                this.orderIndex = orderIndex;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>467</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>dmz-frontend-accept</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the defense rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The rule is enabled.</li>
             * <li><strong>0</strong>: The rule is disabled.</li>
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
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>suggest</strong>: a suggestion rule</li>
             * <li><strong>customize</strong>: a custom rule</li>
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
             * <p>The source network object.</p>
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
