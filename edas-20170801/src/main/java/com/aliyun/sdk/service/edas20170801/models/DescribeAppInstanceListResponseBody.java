// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppInstanceListResponseBody</p>
 */
public class DescribeAppInstanceListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAppInstanceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceList = builder.instanceList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < InstanceList> instanceList; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The application instances.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppInstanceListResponseBody build() {
            return new DescribeAppInstanceListResponseBody(this);
        } 

    } 

    public static class InstanceList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("Canary")
        private Boolean canary;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("NodeLabels")
        private String nodeLabels;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("PodRaw")
        private String podRaw;

        @NameInMap("Version")
        private String version;

        private InstanceList(Builder builder) {
            this.appId = builder.appId;
            this.canary = builder.canary;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.nodeLabels = builder.nodeLabels;
            this.nodeName = builder.nodeName;
            this.podRaw = builder.podRaw;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return canary
         */
        public Boolean getCanary() {
            return this.canary;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return nodeLabels
         */
        public String getNodeLabels() {
            return this.nodeLabels;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return podRaw
         */
        public String getPodRaw() {
            return this.podRaw;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private Boolean canary; 
            private String groupId; 
            private String groupName; 
            private String nodeLabels; 
            private String nodeName; 
            private String podRaw; 
            private String version; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Indicates whether the application was released in canary release mode.
             * <p>
             * 
             * *   `true`: The application was released in canary release mode.
             * *   `false`: The application was not released in canary release mode
             */
            public Builder canary(Boolean canary) {
                this.canary = canary;
                return this;
            }

            /**
             * The ID of the instance group to which the application is deployed.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the instance group to which the application is deployed.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The labels of the node. The value is a JSON string.
             */
            public Builder nodeLabels(String nodeLabels) {
                this.nodeLabels = nodeLabels;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The information about the pod. The value is a JSON string.
             */
            public Builder podRaw(String podRaw) {
                this.podRaw = podRaw;
                return this;
            }

            /**
             * The deployment package version of the node.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
