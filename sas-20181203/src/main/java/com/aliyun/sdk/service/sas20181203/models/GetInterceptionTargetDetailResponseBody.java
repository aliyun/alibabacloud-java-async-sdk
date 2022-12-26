// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionTargetDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetInterceptionTargetDetailResponseBody</p>
 */
public class GetInterceptionTargetDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleTarget")
    private RuleTarget ruleTarget;

    private GetInterceptionTargetDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleTarget = builder.ruleTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterceptionTargetDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleTarget
     */
    public RuleTarget getRuleTarget() {
        return this.ruleTarget;
    }

    public static final class Builder {
        private String requestId; 
        private RuleTarget ruleTarget; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleTarget.
         */
        public Builder ruleTarget(RuleTarget ruleTarget) {
            this.ruleTarget = ruleTarget;
            return this;
        }

        public GetInterceptionTargetDetailResponseBody build() {
            return new GetInterceptionTargetDetailResponseBody(this);
        } 

    } 

    public static class RuleTarget extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ImageList")
        private java.util.List < String > imageList;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("TagList")
        private java.util.List < String > tagList;

        @NameInMap("TargetId")
        private Long targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetType")
        private String targetType;

        private RuleTarget(Builder builder) {
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.imageList = builder.imageList;
            this.namespace = builder.namespace;
            this.tagList = builder.tagList;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleTarget create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
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
         * @return tagList
         */
        public java.util.List < String > getTagList() {
            return this.tagList;
        }

        /**
         * @return targetId
         */
        public Long getTargetId() {
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
            private String clusterId; 
            private String clusterName; 
            private java.util.List < String > imageList; 
            private String namespace; 
            private java.util.List < String > tagList; 
            private Long targetId; 
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
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
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
             * TagList.
             */
            public Builder tagList(java.util.List < String > tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(Long targetId) {
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

            public RuleTarget build() {
                return new RuleTarget(this);
            } 

        } 

    }
}
