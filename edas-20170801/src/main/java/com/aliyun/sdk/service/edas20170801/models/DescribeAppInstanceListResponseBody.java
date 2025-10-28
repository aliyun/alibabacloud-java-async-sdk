// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link DescribeAppInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppInstanceListResponseBody</p>
 */
public class DescribeAppInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<InstanceList> getInstanceList() {
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
        private java.util.List<InstanceList> instanceList; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAppInstanceListResponseBody model) {
            this.code = model.code;
            this.instanceList = model.instanceList;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The application instances.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>03FD1520-0FD6-436A-<strong><strong>-265318D7</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppInstanceListResponseBody build() {
            return new DescribeAppInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppInstanceListResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Canary")
        private Boolean canary;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("NodeLabels")
        private String nodeLabels;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("PodRaw")
        private String podRaw;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.appId = model.appId;
                this.canary = model.canary;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.nodeLabels = model.nodeLabels;
                this.nodeName = model.nodeName;
                this.podRaw = model.podRaw;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>93fdd228-*****-ed2ae98de18d</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Indicates whether the application was released in canary release mode.</p>
             * <ul>
             * <li><code>true</code>: The application was released in canary release mode.</li>
             * <li><code>false</code>: The application was not released in canary release mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canary(Boolean canary) {
                this.canary = canary;
                return this;
            }

            /**
             * <p>The ID of the instance group to which the application is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>93fdd228-*****-ed2ae98de18d</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the instance group to which the application is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>_DEFAULT_GROUP</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The labels of the node. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;alibabacloud.com/nodepool-id&quot;:&quot;np0<em>5b9377fa907&quot;,&quot;beta.kubernetes.io/arch&quot;:&quot;amd64&quot;,&quot;beta.kubernetes.io/instance-type&quot;:&quot;ecs.</em>&quot;,&quot;beta.kubernetes.io/os&quot;:&quot;linux&quot;,&quot;failure-domain.beta.kubernetes.io/region&quot;:&quot;cn-hangzhou&quot;,&quot;failure-domain.beta.kubernetes.io/zone&quot;:&quot;cn-hangzhou-b&quot;,&quot;kubernetes.io/arch&quot;:&quot;amd64&quot;,&quot;kubernetes.io/hostname&quot;:&quot;cn-hangzhou*&quot;,&quot;kubernetes.io/os&quot;:&quot;linux&quot;,&quot;node.kubernetes.io/instance-type&quot;:&quot;ecs.*&quot;,&quot;topology.diskplugin.csi.alibabacloud.com/zone&quot;:&quot;cn-hangzhou-b&quot;,&quot;topology.kubernetes.io/region&quot;:&quot;cn-hangzhou&quot;,&quot;topology.kubernetes.io/zone&quot;:&quot;cn-hangzhou-b&quot;}</p>
             */
            public Builder nodeLabels(String nodeLabels) {
                this.nodeLabels = nodeLabels;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou.192.168.0.*</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The information about the pod. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;metadata&quot;:{&quot;name&quot;:&quot;oambuild-group-1-<em>4xthz&quot;,&quot;generateName&quot;:&quot;oambuild-group-<em>96-&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;selfLink&quot;:&quot;/api/v1/namespaces/default/pods/oambuild-grou</em>96-4xthz&quot;,&quot;uid&quot;:&quot;7a23399c-<em>fe7ff4018&quot;,&quot;resourceVersion&quot;:&quot;969614830&quot;,&quot;creationTimestamp&quot;:&quot;2021-04-06T11:38:46Z&quot;,&quot;labels&quot;:{&quot;ARMSApmAppId&quot;:&quot;</em>&quot;,&quot;ARMSApmLicenseKey&quot;:&quot;</em>&quot;...</p>
             */
            public Builder podRaw(String podRaw) {
                this.podRaw = podRaw;
                return this;
            }

            /**
             * <p>The deployment package version of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-06 19:37:42</p>
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
