// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerGroupedFieldDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupedFieldDetailResponseBody</p>
 */
public class DescribeContainerGroupedFieldDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContainerGroupedFieldDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupedFieldDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerGroupedFieldDetailResponseBody build() {
            return new DescribeContainerGroupedFieldDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerGroupedFieldDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupedFieldDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterCurrentVersion")
        private String clusterCurrentVersion;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterState")
        private String clusterState;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("ContainerCount")
        private Integer containerCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("PodCount")
        private Integer podCount;

        @com.aliyun.core.annotation.NameInMap("PodIp")
        private String podIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        private Data(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.appName = builder.appName;
            this.clusterCurrentVersion = builder.clusterCurrentVersion;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterState = builder.clusterState;
            this.clusterType = builder.clusterType;
            this.containerCount = builder.containerCount;
            this.createTime = builder.createTime;
            this.instanceCount = builder.instanceCount;
            this.namespace = builder.namespace;
            this.nodeName = builder.nodeName;
            this.pod = builder.pod;
            this.podCount = builder.podCount;
            this.podIp = builder.podIp;
            this.regionId = builder.regionId;
            this.vulCount = builder.vulCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmCount
         */
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterCurrentVersion
         */
        public String getClusterCurrentVersion() {
            return this.clusterCurrentVersion;
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
         * @return clusterState
         */
        public String getClusterState() {
            return this.clusterState;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return containerCount
         */
        public Integer getContainerCount() {
            return this.containerCount;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        /**
         * @return podCount
         */
        public Integer getPodCount() {
            return this.podCount;
        }

        /**
         * @return podIp
         */
        public String getPodIp() {
            return this.podIp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        public static final class Builder {
            private Integer alarmCount; 
            private String appName; 
            private String clusterCurrentVersion; 
            private String clusterId; 
            private String clusterName; 
            private String clusterState; 
            private String clusterType; 
            private Integer containerCount; 
            private Long createTime; 
            private Integer instanceCount; 
            private String namespace; 
            private String nodeName; 
            private String pod; 
            private Integer podCount; 
            private String podIp; 
            private String regionId; 
            private Integer vulCount; 

            /**
             * <p>The number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>node-local-dns</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The version of the current online server in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1.14.8-aliyun.1</p>
             */
            public Builder clusterCurrentVersion(String clusterCurrentVersion) {
                this.clusterCurrentVersion = clusterCurrentVersion;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>zhhtest</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>STARTING: The cluster is being started.</li>
             * <li>START_FAILED: The cluster fails to be started.</li>
             * <li>BOOTSTRAPPING: The bootstrap action is being performed for the cluster.</li>
             * <li>RUNNING: The cluster is running.</li>
             * <li>TERMINATING: The cluster is being terminated.</li>
             * <li>TERMINATED: The cluster is terminated.</li>
             * <li>TERMINATED_WITH_ERRORS: The cluster is terminated due to an exception.</li>
             * <li>TERMINATE_FAILED: The cluster fails to be terminated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Kubernetes</strong>: dedicated Kubernetes cluster.</li>
             * <li><strong>ManagedKubernetes</strong>: standard managed cluster (edge cluster).</li>
             * <li><strong>Ask</strong>: serverless Kubernetes (ASK) cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManagedKubernetes</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The number of containers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder containerCount(Integer containerCount) {
                this.containerCount = containerCount;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1702433618301</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>shangliang-test</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>node-local-dns-zwsxl</p>
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * <p>The number of pods.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>The IP address of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
