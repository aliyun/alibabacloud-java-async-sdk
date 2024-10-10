// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInterceptionTargetDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetInterceptionTargetDetailResponseBody</p>
 */
public class GetInterceptionTargetDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleTarget")
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D65AADFC-1D20-5A6A-8F6A-9FA53C0DC1F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the network object.</p>
         */
        public Builder ruleTarget(RuleTarget ruleTarget) {
            this.ruleTarget = ruleTarget;
            return this;
        }

        public GetInterceptionTargetDetailResponseBody build() {
            return new GetInterceptionTargetDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInterceptionTargetDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInterceptionTargetDetailResponseBody</p>
     */
    public static class RuleTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private java.util.List < String > imageList;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List < String > tagList;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private Long targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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
             * <p>The name of the application to which the network object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>netperf-client</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ca6e6594def8d4be8b2795fd12c32****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-test-cnnf</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
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
             * <p>secondary</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>An array that consists of the labels specified for the network object.</p>
             */
            public Builder tagList(java.util.List < String > tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The ID of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>400723</p>
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>destination-test-obj-Na3cF</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the network object. Valid values:</p>
             * <ul>
             * <li><strong>IMAGE</strong>: image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
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
